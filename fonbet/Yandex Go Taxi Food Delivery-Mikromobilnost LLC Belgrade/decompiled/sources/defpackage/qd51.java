package defpackage;

/* loaded from: classes10.dex */
public final class qd51 implements j7q0 {
    public final long a;
    public final int b;
    public final long c;
    public final int d;
    public final long e;
    public final long f;
    public final long[] g;

    public qd51(long j, int i, long j2, int i2, long j3, long[] jArr) {
        this.a = j;
        this.b = i;
        this.c = j2;
        this.d = i2;
        this.e = j3;
        this.g = jArr;
        this.f = j3 != -1 ? j + j3 : -1L;
    }

    @Override // defpackage.f7q0
    public final e7q0 b(long j) {
        double d;
        double d2;
        boolean c = c();
        int i = this.b;
        long j2 = this.a;
        if (!c) {
            h7q0 h7q0Var = new h7q0(0L, j2 + i);
            return new e7q0(h7q0Var, h7q0Var);
        }
        long j3 = tw21.j(j, 0L, this.c);
        double d3 = (j3 * 100.0d) / this.c;
        double d4 = 0.0d;
        if (d3 <= 0.0d) {
            d = 256.0d;
        } else if (d3 >= 100.0d) {
            d = 256.0d;
            d4 = 256.0d;
        } else {
            int i2 = (int) d3;
            long[] jArr = this.g;
            d6z.z(jArr);
            double d5 = jArr[i2];
            if (i2 == 99) {
                d = 256.0d;
                d2 = 256.0d;
            } else {
                d = 256.0d;
                d2 = jArr[i2 + 1];
            }
            d4 = x4e.a(d2, d5, d3 - i2, d5);
        }
        long j4 = this.e;
        h7q0 h7q0Var2 = new h7q0(j3, j2 + tw21.j(Math.round((d4 / d) * j4), i, j4 - 1));
        return new e7q0(h7q0Var2, h7q0Var2);
    }

    @Override // defpackage.f7q0
    public final boolean c() {
        return this.g != null;
    }

    @Override // defpackage.j7q0
    public final long f(long j) {
        long j2 = j - this.a;
        if (!c() || j2 <= this.b) {
            return 0L;
        }
        long[] jArr = this.g;
        d6z.z(jArr);
        double d = (j2 * 256.0d) / this.e;
        int e = tw21.e(jArr, (long) d, true);
        long j3 = this.c;
        long j4 = (e * j3) / 100;
        long j5 = jArr[e];
        int i = e + 1;
        long j6 = (j3 * i) / 100;
        return Math.round((j5 == (e == 99 ? 256L : jArr[i]) ? 0.0d : (d - j5) / (r0 - j5)) * (j6 - j4)) + j4;
    }

    @Override // defpackage.j7q0
    public final long i() {
        return this.f;
    }

    @Override // defpackage.j7q0
    public final int j() {
        return this.d;
    }

    @Override // defpackage.f7q0
    public final long k() {
        return this.c;
    }
}
