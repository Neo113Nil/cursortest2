package defpackage;

/* loaded from: classes3.dex */
public final class vyj {
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public vyj(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vyj)) {
            return false;
        }
        vyj vyjVar = (vyj) obj;
        return d85.c(this.a, vyjVar.a) && d85.c(this.b, vyjVar.b) && d85.c(this.c, vyjVar.c) && d85.c(this.d, vyjVar.d);
    }

    public final int hashCode() {
        int i = d85.o;
        met metVar = net.b;
        return Long.hashCode(this.d) + tlm.c(this.c, tlm.c(this.b, Long.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        String i = d85.i(this.a);
        String i2 = d85.i(this.b);
        return ouj.q(f1d.m("OvalProgressIndicatorColors(activeTrackColor=", i, ", inactiveTrackColor=", i2, ", disabledActiveTrackColor="), d85.i(this.c), ", disabledInactiveTrackColor=", d85.i(this.d), ")");
    }
}
