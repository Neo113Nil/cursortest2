package defpackage;

/* loaded from: classes.dex */
public final class b7w implements uap {
    public final long a;
    public final int b;
    public final long c;
    public final int d;
    public final long e;
    public final long f;
    public final long[] g;

    public b7w(long j, int i, long j2, int i2, long j3, long[] jArr) {
        this.a = j;
        this.b = i;
        this.c = j2;
        this.d = i2;
        this.e = j3;
        this.g = jArr;
        this.f = j3 != -1 ? j + j3 : -1L;
    }

    @Override // defpackage.uap
    public final long c(long j) {
        long j2 = j - this.a;
        if (!g() || j2 <= this.b) {
            return 0L;
        }
        long[] jArr = this.g;
        vq1.B(jArr);
        double d = (j2 * 256.0d) / this.e;
        int e = dvt.e(jArr, (long) d, true);
        long j3 = this.c;
        long j4 = (e * j3) / 100;
        long j5 = jArr[e];
        int i = e + 1;
        long j6 = (j3 * i) / 100;
        return Math.round((j5 == (e == 99 ? 256L : jArr[i]) ? 0.0d : (d - j5) / (r0 - j5)) * (j6 - j4)) + j4;
    }

    @Override // defpackage.fap
    public final eap e(long j) {
        double d;
        double d2;
        boolean g = g();
        int i = this.b;
        long j2 = this.a;
        if (!g) {
            iap iapVar = new iap(0L, j2 + i);
            return new eap(iapVar, iapVar);
        }
        long j3 = dvt.j(j, 0L, this.c);
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
            vq1.B(jArr);
            double d5 = jArr[i2];
            if (i2 == 99) {
                d = 256.0d;
                d2 = 256.0d;
            } else {
                d = 256.0d;
                d2 = jArr[i2 + 1];
            }
            d4 = ((d2 - d5) * (d3 - i2)) + d5;
        }
        long j4 = this.e;
        iap iapVar2 = new iap(j3, j2 + dvt.j(Math.round((d4 / d) * j4), i, j4 - 1));
        return new eap(iapVar2, iapVar2);
    }

    @Override // defpackage.uap
    public final long f() {
        return this.f;
    }

    @Override // defpackage.fap
    public final boolean g() {
        return this.g != null;
    }

    @Override // defpackage.uap
    public final int j() {
        return this.d;
    }

    @Override // defpackage.fap
    public final long k() {
        return this.c;
    }
}
