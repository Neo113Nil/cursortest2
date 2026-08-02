package defpackage;

/* loaded from: classes3.dex */
public final class qvl {
    public final lwl a;
    public final cvl b;

    public qvl(lwl lwlVar, cvl cvlVar) {
        this.a = lwlVar;
        this.b = cvlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qvl)) {
            return false;
        }
        qvl qvlVar = (qvl) obj;
        return this.a.equals(qvlVar.a) && this.b.equals(qvlVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PlaylistItem(playlistUiData=" + this.a + ", playlistHeader=" + this.b + ")";
    }
}
