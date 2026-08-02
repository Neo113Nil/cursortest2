package defpackage;

/* loaded from: classes5.dex */
public final class gga {
    public final cvl a;
    public final long b;

    public gga(cvl cvlVar, long j) {
        this.a = cvlVar;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gga)) {
            return false;
        }
        gga ggaVar = (gga) obj;
        return this.a.equals(ggaVar.a) && this.b == ggaVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DownloadedPlaylistItem(playlist=" + this.a + ", timestampMs=" + this.b + ")";
    }
}
