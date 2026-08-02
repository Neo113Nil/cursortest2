package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public final class ry2 {
    public final String a;
    public final boolean b;
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

    public ry2(String str, boolean z, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18) {
        this.a = str;
        this.b = z;
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = j4;
        this.g = j5;
        this.h = j6;
        this.i = j7;
        this.j = j8;
        this.k = j9;
        this.l = j10;
        this.m = j11;
        this.n = j12;
        this.o = j13;
        this.p = j14;
        this.q = j15;
        this.r = j16;
        this.s = j17;
        this.t = j18;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ry2)) {
            return false;
        }
        ry2 ry2Var = (ry2) obj;
        return this.a.equals(ry2Var.a) && this.b == ry2Var.b && ldc.c(this.c, ry2Var.c) && ldc.c(this.d, ry2Var.d) && ldc.c(this.e, ry2Var.e) && ldc.c(this.f, ry2Var.f) && ldc.c(this.g, ry2Var.g) && ldc.c(this.h, ry2Var.h) && ldc.c(this.i, ry2Var.i) && ldc.c(this.j, ry2Var.j) && ldc.c(this.k, ry2Var.k) && ldc.c(this.l, ry2Var.l) && ldc.c(this.m, ry2Var.m) && ldc.c(this.n, ry2Var.n) && ldc.c(this.o, ry2Var.o) && ldc.c(this.p, ry2Var.p) && ldc.c(this.q, ry2Var.q) && ldc.c(this.r, ry2Var.r) && ldc.c(this.s, ry2Var.s) && ldc.c(this.t, ry2Var.t);
    }

    public final int hashCode() {
        int e = unr0.e(this.a.hashCode() * 31, 31, this.b);
        int i = ldc.n;
        return Long.hashCode(this.t) + qv10.c(qv10.c(qv10.c(qv10.c(qv10.c(qv10.c(qv10.c(qv10.c(qv10.c(qv10.c(qv10.c(qv10.c(qv10.c(qv10.c(qv10.c(qv10.c(qv10.c(e, 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n), 31, this.o), 31, this.p), 31, this.q), 31, this.r), 31, this.s);
    }

    public final String toString() {
        String i = ldc.i(this.c);
        String i2 = ldc.i(this.d);
        String i3 = ldc.i(this.e);
        String i4 = ldc.i(this.f);
        String i5 = ldc.i(this.g);
        String i6 = ldc.i(this.h);
        String i7 = ldc.i(this.i);
        String i8 = ldc.i(this.j);
        String i9 = ldc.i(this.k);
        String i10 = ldc.i(this.l);
        String i11 = ldc.i(this.m);
        String i12 = ldc.i(this.n);
        String i13 = ldc.i(this.o);
        String i14 = ldc.i(this.p);
        String i15 = ldc.i(this.q);
        String i16 = ldc.i(this.r);
        String i17 = ldc.i(this.s);
        String i18 = ldc.i(this.t);
        StringBuilder l = oo31.l("AppThemeColors(name=", this.a, ", isLight=", ", bg=", this.b);
        g8e.D(l, i, ", bgMinor=", i2, ", bgFloating=");
        g8e.D(l, i3, ", bgInvert=", i4, ", controlMain=");
        g8e.D(l, i5, ", controlMinor=", i6, ", text=");
        g8e.D(l, i7, ", textMinor=", i8, ", textInvert=");
        g8e.D(l, i9, ", textOnError=", i10, ", textOnControl=");
        g8e.D(l, i11, ", textOnControlMinor=", i12, ", error=");
        g8e.D(l, i13, ", line=", i14, ", cardDivider=");
        g8e.D(l, i15, ", fog=", i16, ", everFront=");
        return g8e.r(l, i17, ", everBack=", i18, Extension.C_BRAKE);
    }
}
