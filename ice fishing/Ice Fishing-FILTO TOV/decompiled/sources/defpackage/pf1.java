package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class pf1 {
    public final boolean AvO7iQsrTN;
    public final boolean EljAMC1QTz;
    public final int GWasM1elztuh;
    public final boolean OOA6hdeuvCS;
    public final int X1lG3V04pd;
    public final int Yi7zF1RB1;
    public final long xqGvceK5x;

    public pf1(int i, int i2, int i3, long j, boolean z, boolean z2, boolean z3) {
        this.GWasM1elztuh = i;
        this.Yi7zF1RB1 = i2;
        this.X1lG3V04pd = i3;
        this.xqGvceK5x = j;
        this.OOA6hdeuvCS = z;
        this.EljAMC1QTz = z2;
        this.AvO7iQsrTN = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pf1)) {
            return false;
        }
        pf1 pf1Var = (pf1) obj;
        return this.GWasM1elztuh == pf1Var.GWasM1elztuh && this.Yi7zF1RB1 == pf1Var.Yi7zF1RB1 && this.X1lG3V04pd == pf1Var.X1lG3V04pd && this.xqGvceK5x == pf1Var.xqGvceK5x && this.OOA6hdeuvCS == pf1Var.OOA6hdeuvCS && this.EljAMC1QTz == pf1Var.EljAMC1QTz && this.AvO7iQsrTN == pf1Var.AvO7iQsrTN;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.AvO7iQsrTN) + mr0.xqGvceK5x(mr0.xqGvceK5x(mr0.X1lG3V04pd(mr0.Yi7zF1RB1(this.X1lG3V04pd, mr0.Yi7zF1RB1(this.Yi7zF1RB1, Integer.hashCode(this.GWasM1elztuh) * 31, 31), 31), 31, this.xqGvceK5x), 31, this.OOA6hdeuvCS), 31, this.EljAMC1QTz);
    }

    public final String toString() {
        return "WinSummary(stars=" + this.GWasM1elztuh + ", moves=" + this.Yi7zF1RB1 + ", par=" + this.X1lG3V04pd + ", timeMs=" + this.xqGvceK5x + ", isNewRecord=" + this.OOA6hdeuvCS + ", isLastLevel=" + this.EljAMC1QTz + ", sectorCleared=" + this.AvO7iQsrTN + ")";
    }
}
