package defpackage;

import android.os.SystemClock;

/* loaded from: classes10.dex */
public final class ydh implements ewy {
    public final long a;
    public final long b;
    public final float c;
    public long d = -9223372036854775807L;
    public long e = -9223372036854775807L;
    public long g = -9223372036854775807L;
    public long h = -9223372036854775807L;
    public float k = 0.97f;
    public float j = 1.03f;
    public float l = 1.0f;
    public long m = -9223372036854775807L;
    public long f = -9223372036854775807L;
    public long i = -9223372036854775807L;
    public long n = -9223372036854775807L;
    public long o = -9223372036854775807L;

    public ydh(long j, long j2, float f) {
        this.a = j;
        this.b = j2;
        this.c = f;
    }

    @Override // defpackage.ewy
    public final float a(long j, long j2) {
        if (this.d == -9223372036854775807L) {
            return 1.0f;
        }
        long j3 = j - j2;
        long j4 = this.n;
        if (j4 == -9223372036854775807L) {
            this.n = j3;
            this.o = 0L;
        } else {
            float f = j4;
            float f2 = this.c;
            float f3 = 1.0f - f2;
            this.n = Math.max(j3, (long) ((j3 * f3) + (f * f2)));
            this.o = (long) ((f3 * Math.abs(j3 - r9)) + (f2 * this.o));
        }
        if (this.m != -9223372036854775807L && SystemClock.elapsedRealtime() - this.m < 1000) {
            return this.l;
        }
        this.m = SystemClock.elapsedRealtime();
        long j5 = (this.o * 3) + this.n;
        if (this.i > j5) {
            float W = tw21.W(1000L);
            this.i = zgb1.d(j5, this.f, this.i - (((long) ((this.l - 1.0f) * W)) + ((long) ((this.j - 1.0f) * W))));
        } else {
            long j6 = tw21.j(j - ((long) (Math.max(0.0f, this.l - 1.0f) / 1.0E-7f)), this.i, j5);
            this.i = j6;
            long j7 = this.h;
            if (j7 != -9223372036854775807L && j6 > j7) {
                this.i = j7;
            }
        }
        long j8 = j - this.i;
        if (Math.abs(j8) < this.a) {
            this.l = 1.0f;
        } else {
            this.l = tw21.h((1.0E-7f * j8) + 1.0f, this.k, this.j);
        }
        return this.l;
    }

    @Override // defpackage.ewy
    public final long b() {
        return this.i;
    }

    @Override // defpackage.ewy
    public final void c(yd10 yd10Var) {
        this.d = tw21.W(yd10Var.a);
        this.g = tw21.W(yd10Var.b);
        this.h = tw21.W(yd10Var.c);
        float f = yd10Var.d;
        if (f == -3.4028235E38f) {
            f = 0.97f;
        }
        this.k = f;
        float f2 = yd10Var.e;
        if (f2 == -3.4028235E38f) {
            f2 = 1.03f;
        }
        this.j = f2;
        if (f == 1.0f && f2 == 1.0f) {
            this.d = -9223372036854775807L;
        }
        f();
    }

    @Override // defpackage.ewy
    public final void d() {
        long j = this.i;
        if (j == -9223372036854775807L) {
            return;
        }
        long j2 = j + this.b;
        this.i = j2;
        long j3 = this.h;
        if (j3 != -9223372036854775807L && j2 > j3) {
            this.i = j3;
        }
        this.m = -9223372036854775807L;
    }

    @Override // defpackage.ewy
    public final void e(long j) {
        this.e = j;
        f();
    }

    public final void f() {
        long j;
        long j2 = this.d;
        if (j2 != -9223372036854775807L) {
            j = this.e;
            if (j == -9223372036854775807L) {
                long j3 = this.g;
                if (j3 != -9223372036854775807L && j2 < j3) {
                    j2 = j3;
                }
                j = this.h;
                if (j == -9223372036854775807L || j2 <= j) {
                    j = j2;
                }
            }
        } else {
            j = -9223372036854775807L;
        }
        if (this.f == j) {
            return;
        }
        this.f = j;
        this.i = j;
        this.n = -9223372036854775807L;
        this.o = -9223372036854775807L;
        this.m = -9223372036854775807L;
    }
}
