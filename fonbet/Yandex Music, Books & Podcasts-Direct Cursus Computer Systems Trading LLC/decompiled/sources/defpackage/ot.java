package defpackage;

/* loaded from: classes3.dex */
public final class ot {
    public final oq a;
    public final x1g b;

    public ot(oq oqVar, x1g x1gVar) {
        this.a = oqVar;
        this.b = x1gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ot)) {
            return false;
        }
        ot otVar = (ot) obj;
        return this.a.equals(otVar.a) && this.b.equals(otVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.a.hashCode() * 31);
    }

    public final String toString() {
        return "AlbumGridItem(album=" + this.a + ", uiData=" + this.b + ")";
    }
}
