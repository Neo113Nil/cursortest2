package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class sv0 {
    public final long AvO7iQsrTN;
    public final long EljAMC1QTz;
    public final float GWasM1elztuh;
    public final long OOA6hdeuvCS;
    public final float X1lG3V04pd;
    public final float Yi7zF1RB1;
    public final long encWxUiV2;
    public final float xqGvceK5x;

    static {
        n4.Yi7zF1RB1(0.0f, 0.0f, 0.0f, 0.0f, 0L);
    }

    public sv0(float f, float f2, float f3, float f4, long j, long j2, long j3, long j4) {
        this.GWasM1elztuh = f;
        this.Yi7zF1RB1 = f2;
        this.X1lG3V04pd = f3;
        this.xqGvceK5x = f4;
        this.OOA6hdeuvCS = j;
        this.EljAMC1QTz = j2;
        this.AvO7iQsrTN = j3;
        this.encWxUiV2 = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sv0)) {
            return false;
        }
        sv0 sv0Var = (sv0) obj;
        return Float.compare(this.GWasM1elztuh, sv0Var.GWasM1elztuh) == 0 && Float.compare(this.Yi7zF1RB1, sv0Var.Yi7zF1RB1) == 0 && Float.compare(this.X1lG3V04pd, sv0Var.X1lG3V04pd) == 0 && Float.compare(this.xqGvceK5x, sv0Var.xqGvceK5x) == 0 && qj.YmKjaVtbfp5Z(this.OOA6hdeuvCS, sv0Var.OOA6hdeuvCS) && qj.YmKjaVtbfp5Z(this.EljAMC1QTz, sv0Var.EljAMC1QTz) && qj.YmKjaVtbfp5Z(this.AvO7iQsrTN, sv0Var.AvO7iQsrTN) && qj.YmKjaVtbfp5Z(this.encWxUiV2, sv0Var.encWxUiV2);
    }

    public final int hashCode() {
        return Long.hashCode(this.encWxUiV2) + mr0.X1lG3V04pd(mr0.X1lG3V04pd(mr0.X1lG3V04pd(mr0.GWasM1elztuh(this.xqGvceK5x, mr0.GWasM1elztuh(this.X1lG3V04pd, mr0.GWasM1elztuh(this.Yi7zF1RB1, Float.hashCode(this.GWasM1elztuh) * 31, 31), 31), 31), 31, this.OOA6hdeuvCS), 31, this.EljAMC1QTz), 31, this.AvO7iQsrTN);
    }

    public final String toString() {
        String str = fb1.ZCWXqiC0(this.GWasM1elztuh) + ", " + fb1.ZCWXqiC0(this.Yi7zF1RB1) + ", " + fb1.ZCWXqiC0(this.X1lG3V04pd) + ", " + fb1.ZCWXqiC0(this.xqGvceK5x);
        long j = this.OOA6hdeuvCS;
        long j2 = this.EljAMC1QTz;
        boolean YmKjaVtbfp5Z = qj.YmKjaVtbfp5Z(j, j2);
        long j3 = this.AvO7iQsrTN;
        long j4 = this.encWxUiV2;
        if (!YmKjaVtbfp5Z || !qj.YmKjaVtbfp5Z(j2, j3) || !qj.YmKjaVtbfp5Z(j3, j4)) {
            return "RoundRect(rect=" + str + ", topLeft=" + ((Object) qj.YXi2hvwn7WL(j)) + ", topRight=" + ((Object) qj.YXi2hvwn7WL(j2)) + ", bottomRight=" + ((Object) qj.YXi2hvwn7WL(j3)) + ", bottomLeft=" + ((Object) qj.YXi2hvwn7WL(j4)) + ')';
        }
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        if (Float.intBitsToFloat(i) == Float.intBitsToFloat(i2)) {
            return "RoundRect(rect=" + str + ", radius=" + fb1.ZCWXqiC0(Float.intBitsToFloat(i)) + ')';
        }
        return "RoundRect(rect=" + str + ", x=" + fb1.ZCWXqiC0(Float.intBitsToFloat(i)) + ", y=" + fb1.ZCWXqiC0(Float.intBitsToFloat(i2)) + ')';
    }
}
