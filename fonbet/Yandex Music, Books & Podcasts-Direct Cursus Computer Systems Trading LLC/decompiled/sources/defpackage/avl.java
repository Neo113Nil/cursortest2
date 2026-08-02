package defpackage;

/* loaded from: classes3.dex */
public final class avl {
    public final rab a;
    public final cvl b;

    public avl(rab rabVar, cvl cvlVar) {
        this.a = rabVar;
        this.b = cvlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof avl)) {
            return false;
        }
        avl avlVar = (avl) obj;
        return this.a.equals(avlVar.a) && this.b.equals(avlVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PlaylistGridItemModel(uiData=" + this.a + ", playlistHeader=" + this.b + ")";
    }
}
