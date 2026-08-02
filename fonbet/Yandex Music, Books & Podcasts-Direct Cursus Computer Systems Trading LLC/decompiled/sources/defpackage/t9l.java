package defpackage;

/* loaded from: classes4.dex */
public final class t9l {
    public final String a;
    public final String b;
    public final long c;
    public final long d;
    public final long e;

    public t9l(long j, long j2, long j3, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = j2;
        this.e = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t9l)) {
            return false;
        }
        t9l t9lVar = (t9l) obj;
        return this.a.equals(t9lVar.a) && this.b.equals(t9lVar.b) && this.c == t9lVar.c && this.d == t9lVar.d && this.e == t9lVar.e;
    }

    public final int hashCode() {
        return Long.hashCode(this.e) + tlm.c(this.d, tlm.c(this.c, k5r.c(this.a.hashCode() * 31, 31, this.b), 31), 31);
    }

    public final String toString() {
        StringBuilder m = f1d.m("PlayerAnalyticsNetworkTimings(url=", this.a, ", trackedUrlType=", this.b, ", elapsedTime=");
        m.append(this.c);
        ouj.C(m, ", connectingTime=", this.d, ", requestResponseTime=");
        return hrg.m(this.e, ")", m);
    }
}
