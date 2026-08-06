package defpackage;

/* loaded from: classes.dex */
public final class q01 {
    public final int AARZUJiTa;
    public final boolean EXtogiMhuM;
    public final int F7NU4MC0GW;
    public final boolean IHQe1A4L2xu;
    public final boolean SH1y5HwkJhh;
    public final int adDC3e2L;
    public final defpackage.a01 oh6vYeIP;
    public final int r1MBDhnF;
    public final boolean riuEU0zW4;
    public final int xiZrDbcSW0;

    public q01(boolean z, defpackage.a01 a01Var, int i, int i2, int i3, int i4, int i5, boolean z2, boolean z3, boolean z4) {
        this.IHQe1A4L2xu = z;
        this.oh6vYeIP = a01Var;
        this.r1MBDhnF = i;
        this.F7NU4MC0GW = i2;
        this.adDC3e2L = i3;
        this.xiZrDbcSW0 = i4;
        this.AARZUJiTa = i5;
        this.EXtogiMhuM = z2;
        this.riuEU0zW4 = z3;
        this.SH1y5HwkJhh = z4;
    }

    public static defpackage.q01 IHQe1A4L2xu(defpackage.q01 q01Var, boolean z) {
        boolean z2 = q01Var.IHQe1A4L2xu;
        defpackage.a01 a01Var = q01Var.oh6vYeIP;
        int i = q01Var.r1MBDhnF;
        int i2 = q01Var.F7NU4MC0GW;
        int i3 = q01Var.adDC3e2L;
        int i4 = q01Var.xiZrDbcSW0;
        int i5 = q01Var.AARZUJiTa;
        boolean z3 = q01Var.EXtogiMhuM;
        boolean z4 = q01Var.riuEU0zW4;
        q01Var.getClass();
        return new defpackage.q01(z2, a01Var, i, i2, i3, i4, i5, z3, z4, z);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.q01)) {
            return false;
        }
        defpackage.q01 q01Var = (defpackage.q01) obj;
        return this.IHQe1A4L2xu == q01Var.IHQe1A4L2xu && defpackage.x70.QoRHpC4k(this.oh6vYeIP, q01Var.oh6vYeIP) && this.r1MBDhnF == q01Var.r1MBDhnF && this.F7NU4MC0GW == q01Var.F7NU4MC0GW && this.adDC3e2L == q01Var.adDC3e2L && this.xiZrDbcSW0 == q01Var.xiZrDbcSW0 && this.AARZUJiTa == q01Var.AARZUJiTa && this.EXtogiMhuM == q01Var.EXtogiMhuM && this.riuEU0zW4 == q01Var.riuEU0zW4 && this.SH1y5HwkJhh == q01Var.SH1y5HwkJhh;
    }

    public final int hashCode() {
        int hashCode = java.lang.Boolean.hashCode(this.IHQe1A4L2xu) * 31;
        defpackage.a01 a01Var = this.oh6vYeIP;
        return java.lang.Boolean.hashCode(this.SH1y5HwkJhh) + defpackage.fx0.adDC3e2L(defpackage.fx0.adDC3e2L(defpackage.fx0.oh6vYeIP(this.AARZUJiTa, defpackage.fx0.oh6vYeIP(this.xiZrDbcSW0, defpackage.fx0.oh6vYeIP(this.adDC3e2L, defpackage.fx0.oh6vYeIP(this.F7NU4MC0GW, defpackage.fx0.oh6vYeIP(this.r1MBDhnF, (hashCode + (a01Var == null ? 0 : a01Var.hashCode())) * 31, 31), 31), 31), 31), 31), 31, this.EXtogiMhuM), 31, this.riuEU0zW4);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RelicUiState(loading=");
        sb.append(this.IHQe1A4L2xu);
        sb.append(", relic=");
        sb.append(this.oh6vYeIP);
        sb.append(", count=");
        defpackage.fx0.EgCjBq0SZwJ(sb, this.r1MBDhnF, ", shardsHeld=", this.F7NU4MC0GW, ", craftCost=");
        defpackage.fx0.EgCjBq0SZwJ(sb, this.adDC3e2L, ", scrapValue=", this.xiZrDbcSW0, ", sellValue=");
        sb.append(this.AARZUJiTa);
        sb.append(", canCraft=");
        sb.append(this.EXtogiMhuM);
        sb.append(", hasSpare=");
        sb.append(this.riuEU0zW4);
        sb.append(", isBusy=");
        sb.append(this.SH1y5HwkJhh);
        sb.append(")");
        return sb.toString();
    }
}
