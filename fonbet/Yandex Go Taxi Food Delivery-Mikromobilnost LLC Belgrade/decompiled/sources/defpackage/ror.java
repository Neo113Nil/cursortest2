package defpackage;

/* loaded from: classes.dex */
public final class ror implements ynr {
    public final int a;
    public final rbn b;
    public final long c;
    public final long d;

    public ror(int i, int i2, rbn rbnVar) {
        this.a = i;
        this.b = rbnVar;
        this.c = i * 1000000;
        this.d = i2 * 1000000;
    }

    @Override // defpackage.ynr
    public final float b(long j, float f, float f2, float f3) {
        long j2 = j - this.d;
        if (j2 < 0) {
            j2 = 0;
        }
        long j3 = this.c;
        long j4 = j2 > j3 ? j3 : j2;
        if (j4 == 0) {
            return f3;
        }
        return (e(j4, f, f2, f3) - e(j4 - 1000000, f, f2, f3)) * 1000.0f;
    }

    @Override // defpackage.ynr
    public final long c(float f, float f2, float f3) {
        return this.d + this.c;
    }

    @Override // defpackage.ynr
    public final float e(long j, float f, float f2, float f3) {
        long j2 = j - this.d;
        if (j2 < 0) {
            j2 = 0;
        }
        long j3 = this.c;
        if (j2 > j3) {
            j2 = j3;
        }
        float a = this.b.a(this.a == 0 ? 1.0f : j2 / j3);
        return (f2 * a) + ((1.0f - a) * f);
    }

    public ror() {
        this(300, 0, ubn.a);
    }
}
