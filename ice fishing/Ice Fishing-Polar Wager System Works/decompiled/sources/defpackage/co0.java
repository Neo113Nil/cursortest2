package defpackage;

/* loaded from: classes.dex */
public final class co0 {
    public final int AARZUJiTa;
    public java.lang.String EXtogiMhuM;
    public final boolean F7NU4MC0GW;
    public final boolean IHQe1A4L2xu;
    public final boolean adDC3e2L;
    public final boolean oh6vYeIP;
    public final int r1MBDhnF;
    public final int xiZrDbcSW0;

    public co0(boolean z, boolean z2, int i, boolean z3, boolean z4, int i2, int i3) {
        this.IHQe1A4L2xu = z;
        this.oh6vYeIP = z2;
        this.r1MBDhnF = i;
        this.F7NU4MC0GW = z3;
        this.adDC3e2L = z4;
        this.xiZrDbcSW0 = i2;
        this.AARZUJiTa = i3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof defpackage.co0)) {
            return false;
        }
        defpackage.co0 co0Var = (defpackage.co0) obj;
        return this.IHQe1A4L2xu == co0Var.IHQe1A4L2xu && this.oh6vYeIP == co0Var.oh6vYeIP && this.r1MBDhnF == co0Var.r1MBDhnF && defpackage.x70.QoRHpC4k(this.EXtogiMhuM, co0Var.EXtogiMhuM) && this.F7NU4MC0GW == co0Var.F7NU4MC0GW && this.adDC3e2L == co0Var.adDC3e2L && this.xiZrDbcSW0 == co0Var.xiZrDbcSW0 && this.AARZUJiTa == co0Var.AARZUJiTa;
    }

    public final int hashCode() {
        int i = (((((this.IHQe1A4L2xu ? 1 : 0) * 31) + (this.oh6vYeIP ? 1 : 0)) * 31) + this.r1MBDhnF) * 31;
        return ((((((((((((i + (this.EXtogiMhuM != null ? r1.hashCode() : 0)) * 29791) + (this.F7NU4MC0GW ? 1 : 0)) * 31) + (this.adDC3e2L ? 1 : 0)) * 31) + this.xiZrDbcSW0) * 31) + this.AARZUJiTa) * 31) - 1) * 31) - 1;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.EXtogiMhuM;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(defpackage.co0.class.getSimpleName());
        sb.append("(");
        if (this.IHQe1A4L2xu) {
            sb.append("launchSingleTop ");
        }
        if (this.oh6vYeIP) {
            sb.append("restoreState ");
        }
        if ((str != null || this.r1MBDhnF != -1) && str != null) {
            sb.append("popUpTo(");
            sb.append(str);
            if (this.F7NU4MC0GW) {
                sb.append(" inclusive");
            }
            if (this.adDC3e2L) {
                sb.append(" saveState");
            }
            sb.append(")");
        }
        int i = this.AARZUJiTa;
        int i2 = this.xiZrDbcSW0;
        if (i2 != -1 || i != -1) {
            sb.append("anim(enterAnim=0x");
            sb.append(java.lang.Integer.toHexString(i2));
            sb.append(" exitAnim=0x");
            sb.append(java.lang.Integer.toHexString(i));
            sb.append(" popEnterAnim=0x");
            sb.append(java.lang.Integer.toHexString(-1));
            sb.append(" popExitAnim=0x");
            sb.append(java.lang.Integer.toHexString(-1));
            sb.append(")");
        }
        return sb.toString();
    }
}
