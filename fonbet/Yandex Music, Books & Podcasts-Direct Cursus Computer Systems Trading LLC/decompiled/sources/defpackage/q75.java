package defpackage;

/* loaded from: classes3.dex */
public final class q75 extends s75 {
    public final oq a;

    public q75(oq oqVar) {
        this.a = oqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q75) && this.a.equals(((q75) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    public final String toString() {
        return "AlbumEntity(album=" + this.a + ")";
    }
}
