package com.gamericefishpro.space.w;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class x implements v {
    public final int a;
    public final s b;
    public final long c;
    public final long d;

    public x(int i, int i2, s sVar) {
        this.a = i;
        this.b = sVar;
        this.c = ((long) i) * 1000000;
        this.d = ((long) i2) * 1000000;
    }

    @Override // com.gamericefishpro.space.w.v
    public final float b(long j, float f, float f2, float f3) {
        long j2 = j - this.d;
        if (j2 < 0) {
            j2 = 0;
        }
        long j3 = this.c;
        if (j2 > j3) {
            j2 = j3;
        }
        float fB = this.b.b(this.a == 0 ? 1.0f : j2 / j3);
        return (f2 * fB) + ((1 - fB) * f);
    }

    @Override // com.gamericefishpro.space.w.v
    public final float c(long j, float f, float f2, float f3) {
        long j2 = j - this.d;
        if (j2 < 0) {
            j2 = 0;
        }
        long j3 = this.c;
        long j4 = j2 > j3 ? j3 : j2;
        if (j4 == 0) {
            return f3;
        }
        return (b(j4, f, f2, f3) - b(j4 - 1000000, f, f2, f3)) * 1000.0f;
    }

    @Override // com.gamericefishpro.space.w.v
    public final long d(float f, float f2, float f3) {
        return this.d + this.c;
    }
}
