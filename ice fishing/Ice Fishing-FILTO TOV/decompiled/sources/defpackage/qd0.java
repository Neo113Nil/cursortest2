package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class qd0 implements dc1 {
    public final int AvO7iQsrTN;
    public final int EljAMC1QTz;
    public final boolean GWasM1elztuh;
    public final int OOA6hdeuvCS;
    public final int X1lG3V04pd;
    public final int Yi7zF1RB1;
    public final boolean encWxUiV2;
    public final int xqGvceK5x;

    public qd0(boolean z, int i, int i2, int i3, int i4, int i5, int i6, boolean z2) {
        this.GWasM1elztuh = z;
        this.Yi7zF1RB1 = i;
        this.X1lG3V04pd = i2;
        this.xqGvceK5x = i3;
        this.OOA6hdeuvCS = i4;
        this.EljAMC1QTz = i5;
        this.AvO7iQsrTN = i6;
        this.encWxUiV2 = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qd0)) {
            return false;
        }
        qd0 qd0Var = (qd0) obj;
        return this.GWasM1elztuh == qd0Var.GWasM1elztuh && this.Yi7zF1RB1 == qd0Var.Yi7zF1RB1 && this.X1lG3V04pd == qd0Var.X1lG3V04pd && this.xqGvceK5x == qd0Var.xqGvceK5x && this.OOA6hdeuvCS == qd0Var.OOA6hdeuvCS && this.EljAMC1QTz == qd0Var.EljAMC1QTz && this.AvO7iQsrTN == qd0Var.AvO7iQsrTN && this.encWxUiV2 == qd0Var.encWxUiV2;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.encWxUiV2) + mr0.Yi7zF1RB1(this.AvO7iQsrTN, mr0.Yi7zF1RB1(this.EljAMC1QTz, mr0.Yi7zF1RB1(this.OOA6hdeuvCS, mr0.Yi7zF1RB1(this.xqGvceK5x, mr0.Yi7zF1RB1(this.X1lG3V04pd, mr0.Yi7zF1RB1(this.Yi7zF1RB1, Boolean.hashCode(this.GWasM1elztuh) * 31, 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        return "MenuState(loading=" + this.GWasM1elztuh + ", nextLevel=" + this.Yi7zF1RB1 + ", totalStars=" + this.X1lG3V04pd + ", maxStars=" + this.xqGvceK5x + ", completedLevels=" + this.OOA6hdeuvCS + ", totalLevels=" + this.EljAMC1QTz + ", hints=" + this.AvO7iQsrTN + ", campaignComplete=" + this.encWxUiV2 + ")";
    }
}
