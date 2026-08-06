package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class j91 {
    public float[] AvO7iQsrTN;
    public long EljAMC1QTz;
    public final rf0 GWasM1elztuh;
    public long OOA6hdeuvCS;
    public long X1lG3V04pd;
    public i91 Yi7zF1RB1;
    public long xqGvceK5x;

    public j91() {
        rf0 rf0Var = t20.GWasM1elztuh;
        this.GWasM1elztuh = new rf0();
        this.X1lG3V04pd = -1L;
        this.xqGvceK5x = 0L;
        this.OOA6hdeuvCS = 0L;
    }

    public final void GWasM1elztuh(i91 i91Var, long j, long j2, float[] fArr, long j3) {
        long j4 = i91Var.AvO7iQsrTN;
        if (j3 - j4 > 0 || j4 == Long.MIN_VALUE) {
            i91Var.AvO7iQsrTN = j3;
            i91Var.GWasM1elztuh(i91Var.OOA6hdeuvCS, i91Var.EljAMC1QTz, j, j2, fArr);
        }
    }

    public final boolean Yi7zF1RB1(long j, long j2, float[] fArr, int i, int i2) {
        boolean z;
        if (u20.GWasM1elztuh(j2, this.xqGvceK5x)) {
            z = false;
        } else {
            this.xqGvceK5x = j2;
            z = true;
        }
        if (!u20.GWasM1elztuh(j, this.OOA6hdeuvCS)) {
            this.OOA6hdeuvCS = j;
            z = true;
        }
        if (fArr != null) {
            this.AvO7iQsrTN = fArr;
            z = true;
        }
        long j3 = (i << 32) | (i2 & 4294967295L);
        if (j3 == this.EljAMC1QTz) {
            return z;
        }
        this.EljAMC1QTz = j3;
        return true;
    }
}
