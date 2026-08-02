package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class vs51 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;

    public vs51(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
        this.g = j7;
        this.h = j8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vs51)) {
            return false;
        }
        vs51 vs51Var = (vs51) obj;
        return ldc.c(this.a, vs51Var.a) && ldc.c(this.b, vs51Var.b) && ldc.c(this.c, vs51Var.c) && ldc.c(this.d, vs51Var.d) && ldc.c(this.e, vs51Var.e) && ldc.c(this.f, vs51Var.f) && ldc.c(this.g, vs51Var.g) && ldc.c(this.h, vs51Var.h);
    }

    public final int hashCode() {
        int i = ldc.n;
        return Long.hashCode(this.h) + qv10.c(qv10.c(qv10.c(qv10.c(qv10.c(qv10.c(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
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
        StringBuilder v = b64.v("YbOtherColors(border=", i, ", overlay=", i2, ", overlayStatic=");
        g8e.D(v, i3, ", productSkeleton=", i4, ", separator=");
        g8e.D(v, i5, ", separatorInverted=", i6, ", shadow=");
        return g8e.r(v, i7, ", skeleton=", i8, Extension.C_BRAKE);
    }
}
