package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class xt0 {
    public final r5 AvO7iQsrTN;
    public final float[] EljAMC1QTz;
    public final long GWasM1elztuh;
    public final long OOA6hdeuvCS;
    public final long X1lG3V04pd;
    public final long Yi7zF1RB1;
    public final long xqGvceK5x;

    public xt0(long j, long j2, long j3, long j4, long j5, float[] fArr, r5 r5Var) {
        this.GWasM1elztuh = j;
        this.Yi7zF1RB1 = j2;
        this.X1lG3V04pd = j3;
        this.xqGvceK5x = j4;
        this.OOA6hdeuvCS = j5;
        this.EljAMC1QTz = fArr;
        this.AvO7iQsrTN = r5Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        boolean equals;
        if (this == obj) {
            return true;
        }
        if (obj != null && xt0.class == obj.getClass()) {
            xt0 xt0Var = (xt0) obj;
            if (this.GWasM1elztuh == xt0Var.GWasM1elztuh && this.Yi7zF1RB1 == xt0Var.Yi7zF1RB1 && this.OOA6hdeuvCS == xt0Var.OOA6hdeuvCS && u20.GWasM1elztuh(this.X1lG3V04pd, xt0Var.X1lG3V04pd) && u20.GWasM1elztuh(this.xqGvceK5x, xt0Var.xqGvceK5x)) {
                float[] fArr = xt0Var.EljAMC1QTz;
                float[] fArr2 = this.EljAMC1QTz;
                if (fArr2 == null) {
                    if (fArr == null) {
                        equals = true;
                        return equals && this.AvO7iQsrTN == xt0Var.AvO7iQsrTN;
                    }
                    equals = false;
                    if (equals) {
                    }
                } else {
                    if (fArr != null) {
                        equals = fArr2.equals(fArr);
                        if (equals) {
                        }
                    }
                    equals = false;
                    if (equals) {
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int X1lG3V04pd = mr0.X1lG3V04pd(mr0.X1lG3V04pd(mr0.X1lG3V04pd(mr0.X1lG3V04pd(Long.hashCode(this.GWasM1elztuh) * 31, 31, this.Yi7zF1RB1), 31, this.OOA6hdeuvCS), 31, this.X1lG3V04pd), 31, this.xqGvceK5x);
        float[] fArr = this.EljAMC1QTz;
        return this.AvO7iQsrTN.hashCode() + ((X1lG3V04pd + (fArr != null ? Arrays.hashCode(fArr) : 0)) * 31);
    }
}
