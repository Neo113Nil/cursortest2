package defpackage;

/* loaded from: classes3.dex */
public final class evl {
    public final cvl a;
    public final boolean b;

    public evl(cvl cvlVar, boolean z) {
        this.a = cvlVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof evl)) {
            return false;
        }
        evl evlVar = (evl) obj;
        return this.a.equals(evlVar.a) && this.b == evlVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PlaylistHeaderContainsTrack(playlistHeader=" + this.a + ", containsTrack=" + this.b + ")";
    }
}
