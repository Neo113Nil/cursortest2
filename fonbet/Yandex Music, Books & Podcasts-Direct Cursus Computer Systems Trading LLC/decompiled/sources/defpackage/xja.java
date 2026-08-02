package defpackage;

/* loaded from: classes3.dex */
public final class xja {
    public final long a;
    public final int b;

    public xja(long j, int i) {
        this.a = j;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xja)) {
            return false;
        }
        xja xjaVar = (xja) obj;
        return this.a == xjaVar.a && this.b == xjaVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "DownloadedTracksBlockTotalMetrics(durationMs=" + this.a + ", count=" + this.b + ")";
    }
}
