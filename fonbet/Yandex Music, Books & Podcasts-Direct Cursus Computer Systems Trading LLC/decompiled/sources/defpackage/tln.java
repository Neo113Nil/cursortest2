package defpackage;

/* loaded from: classes4.dex */
public final class tln {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;

    public tln(long j, long j2, long j3, long j4, long j5) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tln)) {
            return false;
        }
        tln tlnVar = (tln) obj;
        return d85.c(this.a, tlnVar.a) && d85.c(this.b, tlnVar.b) && d85.c(this.c, tlnVar.c) && d85.c(this.d, tlnVar.d) && d85.c(this.e, tlnVar.e);
    }

    public final int hashCode() {
        int i = d85.o;
        met metVar = net.b;
        return Long.hashCode(this.e) + tlm.c(this.d, tlm.c(this.c, tlm.c(this.b, Long.hashCode(this.a) * 31, 31), 31), 31);
    }

    public final String toString() {
        String i = d85.i(this.a);
        String i2 = d85.i(this.b);
        String i3 = d85.i(this.c);
        String i4 = d85.i(this.d);
        String i5 = d85.i(this.e);
        StringBuilder m = f1d.m("RecognitionColors(primaryText=", i, ", secondaryText=", i2, ", errorText=");
        su4.v(m, i3, ", accentYellow=", i4, ", background=");
        return su4.o(m, i5, ")");
    }
}
