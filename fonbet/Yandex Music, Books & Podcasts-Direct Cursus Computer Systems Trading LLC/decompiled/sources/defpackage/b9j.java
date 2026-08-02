package defpackage;

/* loaded from: classes3.dex */
public final class b9j {
    public final x1g a;
    public final w3g b;
    public final oq c;

    public b9j(x1g x1gVar, w3g w3gVar, oq oqVar) {
        this.a = x1gVar;
        this.b = w3gVar;
        this.c = oqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b9j)) {
            return false;
        }
        b9j b9jVar = (b9j) obj;
        return this.a.equals(b9jVar.a) && this.b.equals(b9jVar.b) && this.c.equals(b9jVar.c);
    }

    public final int hashCode() {
        return this.c.a.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "NonMusicAlbumGridUiListItem(uiData=" + this.a + ", likeUiData=" + this.b + ", album=" + this.c + ")";
    }
}
