package defpackage;

/* loaded from: classes4.dex */
public final class fvl {
    public final cvl a;
    public final boolean b;

    public fvl(cvl cvlVar, boolean z) {
        this.a = cvlVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fvl)) {
            return false;
        }
        fvl fvlVar = (fvl) obj;
        return this.a.equals(fvlVar.a) && this.b == fvlVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PlaylistHeaderContainsTrackItem(playlistHeader=" + this.a + ", containsTrack=" + this.b + ")";
    }
}
