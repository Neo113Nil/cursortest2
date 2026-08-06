package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class si0 {
    public final int AvO7iQsrTN;
    public final int EljAMC1QTz;
    public final boolean GWasM1elztuh;
    public final boolean OOA6hdeuvCS;
    public final int X1lG3V04pd;
    public final boolean Yi7zF1RB1;
    public String encWxUiV2;
    public final boolean xqGvceK5x;

    public si0(boolean z, boolean z2, int i, boolean z3, boolean z4, int i2, int i3) {
        this.GWasM1elztuh = z;
        this.Yi7zF1RB1 = z2;
        this.X1lG3V04pd = i;
        this.xqGvceK5x = z3;
        this.OOA6hdeuvCS = z4;
        this.EljAMC1QTz = i2;
        this.AvO7iQsrTN = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof si0)) {
            return false;
        }
        si0 si0Var = (si0) obj;
        return this.GWasM1elztuh == si0Var.GWasM1elztuh && this.Yi7zF1RB1 == si0Var.Yi7zF1RB1 && this.X1lG3V04pd == si0Var.X1lG3V04pd && o30.rQPn8YBR(this.encWxUiV2, si0Var.encWxUiV2) && this.xqGvceK5x == si0Var.xqGvceK5x && this.OOA6hdeuvCS == si0Var.OOA6hdeuvCS && this.EljAMC1QTz == si0Var.EljAMC1QTz && this.AvO7iQsrTN == si0Var.AvO7iQsrTN;
    }

    public final int hashCode() {
        int i = (((((this.GWasM1elztuh ? 1 : 0) * 31) + (this.Yi7zF1RB1 ? 1 : 0)) * 31) + this.X1lG3V04pd) * 31;
        return ((((((((((((i + (this.encWxUiV2 != null ? r1.hashCode() : 0)) * 29791) + (this.xqGvceK5x ? 1 : 0)) * 31) + (this.OOA6hdeuvCS ? 1 : 0)) * 31) + this.EljAMC1QTz) * 31) + this.AvO7iQsrTN) * 31) - 1) * 31) - 1;
    }

    public final String toString() {
        String str = this.encWxUiV2;
        StringBuilder sb = new StringBuilder();
        sb.append(si0.class.getSimpleName());
        sb.append("(");
        if (this.GWasM1elztuh) {
            sb.append("launchSingleTop ");
        }
        if (this.Yi7zF1RB1) {
            sb.append("restoreState ");
        }
        if ((str != null || this.X1lG3V04pd != -1) && str != null) {
            sb.append("popUpTo(");
            sb.append(str);
            if (this.xqGvceK5x) {
                sb.append(" inclusive");
            }
            if (this.OOA6hdeuvCS) {
                sb.append(" saveState");
            }
            sb.append(")");
        }
        int i = this.AvO7iQsrTN;
        int i2 = this.EljAMC1QTz;
        if (i2 != -1 || i != -1) {
            sb.append("anim(enterAnim=0x");
            sb.append(Integer.toHexString(i2));
            sb.append(" exitAnim=0x");
            sb.append(Integer.toHexString(i));
            sb.append(" popEnterAnim=0x");
            sb.append(Integer.toHexString(-1));
            sb.append(" popExitAnim=0x");
            sb.append(Integer.toHexString(-1));
            sb.append(")");
        }
        return sb.toString();
    }
}
