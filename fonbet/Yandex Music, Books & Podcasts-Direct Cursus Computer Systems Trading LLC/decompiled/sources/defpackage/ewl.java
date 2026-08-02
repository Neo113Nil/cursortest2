package defpackage;

/* loaded from: classes3.dex */
public final class ewl {
    public final lwl a;
    public final cvl b;

    public ewl(lwl lwlVar, cvl cvlVar) {
        this.a = lwlVar;
        this.b = cvlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ewl)) {
            return false;
        }
        ewl ewlVar = (ewl) obj;
        return this.a.equals(ewlVar.a) && this.b.equals(ewlVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PlaylistListItem(playlistUiData=" + this.a + ", playlistHeader=" + this.b + ")";
    }
}
