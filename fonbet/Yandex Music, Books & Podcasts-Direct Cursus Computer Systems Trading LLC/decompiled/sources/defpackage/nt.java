package defpackage;

/* loaded from: classes3.dex */
public final class nt {
    public final oq a;
    public final x1g b;

    public nt(oq oqVar, x1g x1gVar) {
        this.a = oqVar;
        this.b = x1gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nt)) {
            return false;
        }
        nt ntVar = (nt) obj;
        return this.a.equals(ntVar.a) && this.b.equals(ntVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.a.hashCode() * 31);
    }

    public final String toString() {
        return "AlbumGridItem(album=" + this.a + ", uiData=" + this.b + ")";
    }
}
