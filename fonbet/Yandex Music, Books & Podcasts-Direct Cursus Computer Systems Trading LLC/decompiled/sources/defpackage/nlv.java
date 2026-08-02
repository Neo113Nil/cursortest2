package defpackage;

/* loaded from: classes4.dex */
public final class nlv implements plv {
    public final long b;
    public final long c;
    public final long d;
    public final long e;

    public nlv(long j, long j2, long j3, long j4) {
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nlv)) {
            return false;
        }
        nlv nlvVar = (nlv) obj;
        return d85.c(this.b, nlvVar.b) && d85.c(this.c, nlvVar.c) && d85.c(this.d, nlvVar.d) && d85.c(this.e, nlvVar.e);
    }

    public final int hashCode() {
        int i = d85.o;
        met metVar = net.b;
        return Long.hashCode(this.e) + tlm.c(this.d, tlm.c(this.c, Long.hashCode(this.b) * 31, 31), 31);
    }

    public final String toString() {
        String i = d85.i(this.b);
        String i2 = d85.i(this.c);
        return ouj.q(f1d.m("CoverBased(primaryContainerColor=", i, ", secondaryContainerColor=", i2, ", primaryColor="), d85.i(this.d), ", disabledColor=", d85.i(this.e), ")");
    }
}
