package defpackage;

/* loaded from: classes3.dex */
public final class xdm extends zdm {
    public final x1g a;
    public final w3g b;
    public final oq c;

    public xdm(x1g x1gVar, w3g w3gVar, oq oqVar) {
        this.a = x1gVar;
        this.b = w3gVar;
        this.c = oqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xdm)) {
            return false;
        }
        xdm xdmVar = (xdm) obj;
        return this.a.equals(xdmVar.a) && this.b.equals(xdmVar.b) && this.c.equals(xdmVar.c);
    }

    public final int hashCode() {
        return this.c.a.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "PodcastAlbumListItem(uiData=" + this.a + ", likesUiData=" + this.b + ", album=" + this.c + ")";
    }
}
