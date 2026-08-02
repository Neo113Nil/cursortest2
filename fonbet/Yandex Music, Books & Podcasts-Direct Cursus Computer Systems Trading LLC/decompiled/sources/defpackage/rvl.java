package defpackage;

/* loaded from: classes3.dex */
public final class rvl {
    public final lwl a;
    public final cvl b;

    public rvl(lwl lwlVar, cvl cvlVar) {
        this.a = lwlVar;
        this.b = cvlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rvl)) {
            return false;
        }
        rvl rvlVar = (rvl) obj;
        return this.a.equals(rvlVar.a) && this.b.equals(rvlVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PlaylistItem(playlistUiData=" + this.a + ", playlistHeader=" + this.b + ")";
    }
}
