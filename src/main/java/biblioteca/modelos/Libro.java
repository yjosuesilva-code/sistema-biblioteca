public class Libro {
    private int id;
    private String titulo;
    private String autor;
    private boolean disponible;

    public Libro(int id, String titulo, String autor) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = true; 
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean isDisponible() {
        return this.disponible;
    }

    public boolean getDisponible() {
        return this.disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public String toCsv() {
        return id + "," + titulo + "," + autor + "," + disponible;
    }

    public static Libro fromCsv(String linea) {
        String[] partes = linea.split(",");
        Libro l = new Libro(
            Integer.parseInt(partes[0]),
            partes[1],
            partes[2]
        );
        l.setDisponible(Boolean.parseBoolean(partes[3]));
        return l;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", titulo='" + getTitulo() + "'" +
            ", autor='" + getAutor() + "'" +
            ", disponible='" + isDisponible() + "'" +
            "}";
    }
    

    

}
