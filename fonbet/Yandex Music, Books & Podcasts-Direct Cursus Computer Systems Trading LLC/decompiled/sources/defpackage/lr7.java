package defpackage;

/* loaded from: classes3.dex */
public final class lr7 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final long i;
    public final long j;
    public final long k;
    public final long l;

    public lr7(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
        this.g = j7;
        this.h = j8;
        this.i = j9;
        this.j = j10;
        this.k = j11;
        this.l = j12;
    }

    public final aqi a(boolean z, boolean z2, hq5 hq5Var) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.Z(-202408919);
        aqi o0 = szf.o0(new d85(z ? z2 ? this.i : this.j : z2 ? this.k : this.l), oq5Var);
        oq5Var.p(false);
        return o0;
    }

    public final aqi b(boolean z, boolean z2, hq5 hq5Var) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.Z(494162711);
        aqi o0 = szf.o0(new d85(z ? z2 ? this.e : this.f : z2 ? this.g : this.h), oq5Var);
        oq5Var.p(false);
        return o0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lr7)) {
            return false;
        }
        lr7 lr7Var = (lr7) obj;
        return d85.c(this.a, lr7Var.a) && d85.c(this.b, lr7Var.b) && d85.c(this.c, lr7Var.c) && d85.c(this.d, lr7Var.d) && d85.c(this.e, lr7Var.e) && d85.c(this.f, lr7Var.f) && d85.c(this.g, lr7Var.g) && d85.c(this.h, lr7Var.h) && d85.c(this.i, lr7Var.i) && d85.c(this.j, lr7Var.j) && d85.c(this.k, lr7Var.k) && d85.c(this.l, lr7Var.l);
    }

    public final int hashCode() {
        int i = d85.o;
        met metVar = net.b;
        return Long.hashCode(this.l) + tlm.c(this.k, tlm.c(this.j, tlm.c(this.i, tlm.c(this.h, tlm.c(this.g, tlm.c(this.f, tlm.c(this.e, tlm.c(this.d, tlm.c(this.c, tlm.c(this.b, Long.hashCode(this.a) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        String i = d85.i(this.a);
        String i2 = d85.i(this.b);
        String i3 = d85.i(this.c);
        String i4 = d85.i(this.d);
        String i5 = d85.i(this.e);
        String i6 = d85.i(this.f);
        String i7 = d85.i(this.g);
        String i8 = d85.i(this.h);
        String i9 = d85.i(this.i);
        String i10 = d85.i(this.j);
        String i11 = d85.i(this.k);
        String i12 = d85.i(this.l);
        StringBuilder m = f1d.m("DefaultSliderColors(thumbColor=", i, ", disabledThumbColor=", i2, ", thumbBorderColor=");
        su4.v(m, i3, ", disabledThumbBorderColor=", i4, ", activeTrackColor=");
        su4.v(m, i5, ", inactiveTrackColor=", i6, ", disabledActiveTrackColor=");
        su4.v(m, i7, ", disabledInactiveTrackColor=", i8, ", activeTickColor=");
        su4.v(m, i9, ", inactiveTickColor=", i10, ", disabledActiveTickColor=");
        return ouj.q(m, i11, ", disabledInactiveTickColor=", i12, ")");
    }
}
