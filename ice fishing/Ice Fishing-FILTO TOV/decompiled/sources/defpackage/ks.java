package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class ks implements gs {
    public final int GWasM1elztuh;
    public final long X1lG3V04pd;
    public final oo Yi7zF1RB1;
    public final long xqGvceK5x;

    public ks(int i, int i2, oo ooVar) {
        this.GWasM1elztuh = i;
        this.Yi7zF1RB1 = ooVar;
        this.X1lG3V04pd = i * 1000000;
        this.xqGvceK5x = i2 * 1000000;
    }

    @Override // defpackage.gs
    public final float X1lG3V04pd(long j, float f, float f2, float f3) {
        long j2 = j - this.xqGvceK5x;
        if (j2 < 0) {
            j2 = 0;
        }
        long j3 = this.X1lG3V04pd;
        long j4 = j2 > j3 ? j3 : j2;
        if (j4 == 0) {
            return f3;
        }
        return (Yi7zF1RB1(j4, f, f2, f3) - Yi7zF1RB1(j4 - 1000000, f, f2, f3)) * 1000.0f;
    }

    @Override // defpackage.gs
    public final float Yi7zF1RB1(long j, float f, float f2, float f3) {
        long j2 = j - this.xqGvceK5x;
        if (j2 < 0) {
            j2 = 0;
        }
        long j3 = this.X1lG3V04pd;
        if (j2 > j3) {
            j2 = j3;
        }
        float Yi7zF1RB1 = this.Yi7zF1RB1.Yi7zF1RB1(this.GWasM1elztuh == 0 ? 1.0f : j2 / j3);
        return (f2 * Yi7zF1RB1) + ((1.0f - Yi7zF1RB1) * f);
    }

    @Override // defpackage.gs
    public final long xqGvceK5x(float f, float f2, float f3) {
        return this.xqGvceK5x + this.X1lG3V04pd;
    }
}
