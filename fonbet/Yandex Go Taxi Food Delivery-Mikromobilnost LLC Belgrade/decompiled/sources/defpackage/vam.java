package defpackage;

/* loaded from: classes11.dex */
public final class vam {
    public final tev a;

    public vam(tev tevVar) {
        this.a = tevVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vam) && this.a.equals(((vam) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() * 961;
    }

    public final String toString() {
        return "DrawableDownloadParams(size=" + this.a + ", errorDrawable=null, cornerRadius=null)";
    }
}
