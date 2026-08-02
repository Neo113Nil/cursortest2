package defpackage;

/* loaded from: classes3.dex */
public final class dwl {
    public final lwl a;
    public final cvl b;

    public dwl(lwl lwlVar, cvl cvlVar) {
        this.a = lwlVar;
        this.b = cvlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dwl)) {
            return false;
        }
        dwl dwlVar = (dwl) obj;
        return this.a.equals(dwlVar.a) && this.b.equals(dwlVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PlaylistListItem(playlistUiData=" + this.a + ", playlistHeader=" + this.b + ")";
    }
}
