package defpackage;

/* loaded from: classes.dex */
public final class djc implements qic {
    public final int a;
    public final kya b;
    public final long c;
    public final long d;

    public djc(int i, int i2, kya kyaVar) {
        this.a = i;
        this.b = kyaVar;
        this.c = i * 1000000;
        this.d = i2 * 1000000;
    }

    @Override // defpackage.qic
    public final float c(long j, float f, float f2, float f3) {
        long j2 = j - this.d;
        if (j2 < 0) {
            j2 = 0;
        }
        long j3 = this.c;
        if (j2 > j3) {
            j2 = j3;
        }
        float b = this.b.b(this.a == 0 ? 1.0f : j2 / j3);
        return (f2 * b) + ((1 - b) * f);
    }

    @Override // defpackage.qic
    public final float d(long j, float f, float f2, float f3) {
        long j2 = j - this.d;
        if (j2 < 0) {
            j2 = 0;
        }
        long j3 = this.c;
        long j4 = j2 > j3 ? j3 : j2;
        if (j4 == 0) {
            return f3;
        }
        return (c(j4, f, f2, f3) - c(j4 - 1000000, f, f2, f3)) * 1000.0f;
    }

    @Override // defpackage.qic
    public final long e(float f, float f2, float f3) {
        return this.d + this.c;
    }
}
