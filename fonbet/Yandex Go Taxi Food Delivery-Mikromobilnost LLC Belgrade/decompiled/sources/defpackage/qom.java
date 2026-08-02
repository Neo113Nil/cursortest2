package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class qom {
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

    public qom(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15) {
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
        if (!(obj instanceof qom)) {
            return false;
        }
        qom qomVar = (qom) obj;
        return ldc.c(this.a, qomVar.a) && ldc.c(this.b, qomVar.b) && ldc.c(this.c, qomVar.c) && ldc.c(this.d, qomVar.d) && ldc.c(this.e, qomVar.e) && ldc.c(this.f, qomVar.f) && ldc.c(this.g, qomVar.g) && ldc.c(this.h, qomVar.h) && ldc.c(this.i, qomVar.i) && ldc.c(this.j, qomVar.j) && ldc.c(this.k, qomVar.k) && ldc.c(this.l, qomVar.l) && ldc.c(this.m, qomVar.m) && ldc.c(this.n, qomVar.n) && ldc.c(this.o, qomVar.o);
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
        StringBuilder v = b64.v("DsBrandColor(SurfaceBrand=", i, ", SurfaceBrandHovered=", i2, ", SurfaceBrandPressed=");
        g8e.D(v, i3, ", SurfaceBrandLight=", i4, ", SurfaceBrandLightHovered=");
        g8e.D(v, i5, ", SurfaceBrandLightPressed=", i6, ", LineBrand=");
        g8e.D(v, i7, ", MiscLineFocus=", i8, ", TextBrand=");
        g8e.D(v, i9, ", TextBrandStatic=", i10, ", ShadowBrand=");
        g8e.D(v, i11, ", TextLink=", i12, ", TextLinkHovered=");
        g8e.D(v, i13, ", TextLinkPressed=", i14, ", TextLinkVisited=");
        return oyr.t(v, i15, Extension.C_BRAKE);
    }
}
