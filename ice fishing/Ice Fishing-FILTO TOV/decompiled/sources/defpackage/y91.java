package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class y91 {
    public xm0 GWasM1elztuh;
    public long Yi7zF1RB1 = 0;

    public y91(xm0 xm0Var, int i) {
        this.GWasM1elztuh = xm0Var;
    }

    public final long GWasM1elztuh(float f, long j, boolean z) {
        long OOA6hdeuvCS;
        long j2 = this.Yi7zF1RB1;
        if (z) {
            OOA6hdeuvCS = uk0.OOA6hdeuvCS(j2, j);
            this.Yi7zF1RB1 = OOA6hdeuvCS;
        } else {
            OOA6hdeuvCS = uk0.OOA6hdeuvCS(j2, j);
        }
        if ((this.GWasM1elztuh == null ? uk0.X1lG3V04pd(OOA6hdeuvCS) : Math.abs(Yi7zF1RB1(OOA6hdeuvCS))) < f) {
            return 9205357640488583168L;
        }
        xm0 xm0Var = this.GWasM1elztuh;
        long j3 = this.Yi7zF1RB1;
        if (xm0Var == null) {
            float intBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32)) / uk0.X1lG3V04pd(j3);
            return uk0.xqGvceK5x(this.Yi7zF1RB1, uk0.EljAMC1QTz(f, (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j3 & 4294967295L)) / r7) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32)));
        }
        float Yi7zF1RB1 = Yi7zF1RB1(j3) - (Math.signum(Yi7zF1RB1(this.Yi7zF1RB1)) * f);
        long j4 = this.Yi7zF1RB1;
        xm0 xm0Var2 = this.GWasM1elztuh;
        xm0 xm0Var3 = xm0.EljAMC1QTz;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (xm0Var2 == xm0Var3 ? j4 & 4294967295L : j4 >> 32));
        if (this.GWasM1elztuh != xm0Var3) {
            return (Float.floatToRawIntBits(intBitsToFloat2) << 32) | (Float.floatToRawIntBits(Yi7zF1RB1) & 4294967295L);
        }
        return (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(Yi7zF1RB1) << 32);
    }

    public final float Yi7zF1RB1(long j) {
        return Float.intBitsToFloat((int) (this.GWasM1elztuh == xm0.EljAMC1QTz ? j >> 32 : j & 4294967295L));
    }
}
