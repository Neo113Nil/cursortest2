package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class rp51 {
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
    public final long m;
    public final long n;
    public final long o;

    public rp51(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15) {
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
        this.m = j13;
        this.n = j14;
        this.o = j15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rp51)) {
            return false;
        }
        rp51 rp51Var = (rp51) obj;
        return ldc.c(this.a, rp51Var.a) && ldc.c(this.b, rp51Var.b) && ldc.c(this.c, rp51Var.c) && ldc.c(this.d, rp51Var.d) && ldc.c(this.e, rp51Var.e) && ldc.c(this.f, rp51Var.f) && ldc.c(this.g, rp51Var.g) && ldc.c(this.h, rp51Var.h) && ldc.c(this.i, rp51Var.i) && ldc.c(this.j, rp51Var.j) && ldc.c(this.k, rp51Var.k) && ldc.c(this.l, rp51Var.l) && ldc.c(this.m, rp51Var.m) && ldc.c(this.n, rp51Var.n) && ldc.c(this.o, rp51Var.o);
    }

    public final int hashCode() {
        int i = ldc.n;
        return Long.hashCode(this.o) + qv10.c(qv10.c(qv10.c(qv10.c(qv10.c(qv10.c(qv10.c(qv10.c(qv10.c(qv10.c(qv10.c(qv10.c(qv10.c(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n);
    }

    public final String toString() {
        String i = ldc.i(this.a);
        String i2 = ldc.i(this.b);
        String i3 = ldc.i(this.c);
        String i4 = ldc.i(this.d);
        String i5 = ldc.i(this.e);
        String i6 = ldc.i(this.f);
        String i7 = ldc.i(this.g);
        String i8 = ldc.i(this.h);
        String i9 = ldc.i(this.i);
        String i10 = ldc.i(this.j);
        String i11 = ldc.i(this.k);
        String i12 = ldc.i(this.l);
        String i13 = ldc.i(this.m);
        String i14 = ldc.i(this.n);
        String i15 = ldc.i(this.o);
        StringBuilder v = b64.v("YbButtonColors(disabled=", i, ", invertedNormal=", i2, ", invertedPressed=");
        g8e.D(v, i3, ", invertedStaticNormal=", i4, ", invertedStaticPressed=");
        g8e.D(v, i5, ", opacityStaticNormal=", i6, ", opacityStaticPressed=");
        g8e.D(v, i7, ", primaryNormal=", i8, ", primaryPressed=");
        g8e.D(v, i9, ", primaryStaticNormal=", i10, ", primaryStaticPressed=");
        g8e.D(v, i11, ", secondaryNormal=", i12, ", secondaryPressed=");
        g8e.D(v, i13, ", secondaryStaticNormal=", i14, ", secondaryStaticPressed=");
        return oyr.t(v, i15, Extension.C_BRAKE);
    }
}
