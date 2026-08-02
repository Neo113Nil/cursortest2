package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class tx51 {
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
    public final long p;
    public final long q;
    public final long r;
    public final long s;
    public final long t;

    public tx51(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20) {
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
        this.p = j16;
        this.q = j17;
        this.r = j18;
        this.s = j19;
        this.t = j20;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tx51)) {
            return false;
        }
        tx51 tx51Var = (tx51) obj;
        return ldc.c(this.a, tx51Var.a) && ldc.c(this.b, tx51Var.b) && ldc.c(this.c, tx51Var.c) && ldc.c(this.d, tx51Var.d) && ldc.c(this.e, tx51Var.e) && ldc.c(this.f, tx51Var.f) && ldc.c(this.g, tx51Var.g) && ldc.c(this.h, tx51Var.h) && ldc.c(this.i, tx51Var.i) && ldc.c(this.j, tx51Var.j) && ldc.c(this.k, tx51Var.k) && ldc.c(this.l, tx51Var.l) && ldc.c(this.m, tx51Var.m) && ldc.c(this.n, tx51Var.n) && ldc.c(this.o, tx51Var.o) && ldc.c(this.p, tx51Var.p) && ldc.c(this.q, tx51Var.q) && ldc.c(this.r, tx51Var.r) && ldc.c(this.s, tx51Var.s) && ldc.c(this.t, tx51Var.t);
    }

    public final int hashCode() {
        int i = ldc.n;
        return Long.hashCode(this.t) + qv10.c(qv10.c(qv10.c(qv10.c(qv10.c(qv10.c(qv10.c(qv10.c(qv10.c(qv10.c(qv10.c(qv10.c(qv10.c(qv10.c(qv10.c(qv10.c(qv10.c(qv10.c(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n), 31, this.o), 31, this.p), 31, this.q), 31, this.r), 31, this.s);
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
        String i16 = ldc.i(this.p);
        String i17 = ldc.i(this.q);
        String i18 = ldc.i(this.r);
        String i19 = ldc.i(this.s);
        String i20 = ldc.i(this.t);
        StringBuilder v = b64.v("YbTextIconColors(linkNormal=", i, ", linkPressed=", i2, ", negative=");
        g8e.D(v, i3, ", plusSolid=", i4, ", positive=");
        g8e.D(v, i5, ", primary=", i6, ", primaryInverted=");
        g8e.D(v, i7, ", primaryStatic=", i8, ", primaryStaticInverted=");
        g8e.D(v, i9, ", quaternary=", i10, ", quaternaryInverted=");
        g8e.D(v, i11, ", quaternaryStaticInverted=", i12, ", secondary=");
        g8e.D(v, i13, ", secondaryInverted=", i14, ", secondaryStatic=");
        g8e.D(v, i15, ", secondaryStaticInverted=", i16, ", tertiary=");
        g8e.D(v, i17, ", tertiaryInverted=", i18, ", warning=");
        return g8e.r(v, i19, ", warningStatic=", i20, Extension.C_BRAKE);
    }
}
