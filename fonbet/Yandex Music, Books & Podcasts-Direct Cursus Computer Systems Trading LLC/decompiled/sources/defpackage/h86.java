package defpackage;

/* loaded from: classes.dex */
public final class h86 implements uap, fap {
    public final long a;
    public final long b;
    public final int c;
    public final long d;
    public final int e;
    public final long f;
    public final boolean g;
    public final long h;
    public final int i;
    public final int j;
    public final boolean k;
    public final long l;

    public h86(long j, long j2, int i, int i2, boolean z) {
        this.a = j;
        this.b = j2;
        this.c = i2 == -1 ? 1 : i2;
        this.e = i;
        this.g = z;
        if (j == -1) {
            this.d = -1L;
            this.f = -9223372036854775807L;
        } else {
            long j3 = j - j2;
            this.d = j3;
            this.f = (Math.max(0L, j3) * 8000000) / i;
        }
        this.h = j2;
        this.i = i;
        this.j = i2;
        this.k = z;
        this.l = j == -1 ? -1L : j;
    }

    @Override // defpackage.uap
    public final long c(long j) {
        return (Math.max(0L, j - this.b) * 8000000) / this.e;
    }

    @Override // defpackage.fap
    public final eap e(long j) {
        long j2 = this.d;
        long j3 = this.b;
        if (j2 == -1 && !this.g) {
            iap iapVar = new iap(0L, j3);
            return new eap(iapVar, iapVar);
        }
        int i = this.e;
        long j4 = this.c;
        long j5 = (((i * j) / 8000000) / j4) * j4;
        if (j2 != -1) {
            j5 = Math.min(j5, j2 - j4);
        }
        long max = Math.max(j5, 0L) + j3;
        long max2 = (Math.max(0L, max - j3) * 8000000) / i;
        iap iapVar2 = new iap(max2, max);
        if (j2 != -1 && max2 < j) {
            long j6 = max + j4;
            if (j6 < this.a) {
                return new eap(iapVar2, new iap((Math.max(0L, j6 - j3) * 8000000) / i, j6));
            }
        }
        return new eap(iapVar2, iapVar2);
    }

    @Override // defpackage.uap
    public final long f() {
        return this.l;
    }

    @Override // defpackage.fap
    public final boolean g() {
        return this.d != -1 || this.g;
    }

    @Override // defpackage.uap
    public final int j() {
        return this.i;
    }

    @Override // defpackage.fap
    public final long k() {
        return this.f;
    }
}
