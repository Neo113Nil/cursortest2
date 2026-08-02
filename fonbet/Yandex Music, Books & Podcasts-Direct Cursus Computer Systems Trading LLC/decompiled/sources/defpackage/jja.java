package defpackage;

/* loaded from: classes5.dex */
public final class jja {
    public final mqs a;
    public final long b;
    public final hja c;

    public jja(mqs mqsVar, long j, hja hjaVar) {
        this.a = mqsVar;
        this.b = j;
        this.c = hjaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jja)) {
            return false;
        }
        jja jjaVar = (jja) obj;
        return this.a.equals(jjaVar.a) && this.b == jjaVar.b && this.c == jjaVar.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + tlm.c(this.b, this.a.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "DownloadedTrackItem(track=" + this.a + ", timestampMs=" + this.b + ", cacheType=" + this.c + ")";
    }
}
