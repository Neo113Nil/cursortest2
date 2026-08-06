package defpackage;

/* loaded from: classes.dex */
public final class q80 {
    public final boolean AARZUJiTa;
    public final boolean EXtogiMhuM;
    public final java.lang.String F7NU4MC0GW;
    public final java.lang.String IHQe1A4L2xu;
    public final java.lang.String JlrlGoKF;
    public final boolean SH1y5HwkJhh;
    public final int adDC3e2L;
    public final boolean ez2rX8ReCYw;
    public final java.lang.String oh6vYeIP;
    public final java.lang.String r1MBDhnF;
    public final boolean riuEU0zW4;
    public final int xiZrDbcSW0;

    public q80(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, java.lang.String str5) {
        this.IHQe1A4L2xu = str;
        this.oh6vYeIP = str2;
        this.r1MBDhnF = str3;
        this.F7NU4MC0GW = str4;
        this.adDC3e2L = i;
        this.xiZrDbcSW0 = i2;
        this.AARZUJiTa = z;
        this.EXtogiMhuM = z2;
        this.riuEU0zW4 = z3;
        this.SH1y5HwkJhh = z4;
        this.ez2rX8ReCYw = z5;
        this.JlrlGoKF = str5;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.q80)) {
            return false;
        }
        defpackage.q80 q80Var = (defpackage.q80) obj;
        return this.IHQe1A4L2xu.equals(q80Var.IHQe1A4L2xu) && this.oh6vYeIP.equals(q80Var.oh6vYeIP) && this.r1MBDhnF.equals(q80Var.r1MBDhnF) && this.F7NU4MC0GW.equals(q80Var.F7NU4MC0GW) && this.adDC3e2L == q80Var.adDC3e2L && this.xiZrDbcSW0 == q80Var.xiZrDbcSW0 && this.AARZUJiTa == q80Var.AARZUJiTa && this.EXtogiMhuM == q80Var.EXtogiMhuM && this.riuEU0zW4 == q80Var.riuEU0zW4 && this.SH1y5HwkJhh == q80Var.SH1y5HwkJhh && this.ez2rX8ReCYw == q80Var.ez2rX8ReCYw && defpackage.x70.QoRHpC4k(this.JlrlGoKF, q80Var.JlrlGoKF);
    }

    public final int hashCode() {
        int adDC3e2L = defpackage.fx0.adDC3e2L(defpackage.fx0.adDC3e2L(defpackage.fx0.adDC3e2L(defpackage.fx0.adDC3e2L(defpackage.fx0.adDC3e2L(defpackage.fx0.oh6vYeIP(8, defpackage.fx0.oh6vYeIP(this.xiZrDbcSW0, defpackage.fx0.oh6vYeIP(this.adDC3e2L, defpackage.fx0.F7NU4MC0GW(defpackage.fx0.F7NU4MC0GW(defpackage.fx0.F7NU4MC0GW(this.IHQe1A4L2xu.hashCode() * 31, 31, this.oh6vYeIP), 31, this.r1MBDhnF), 31, this.F7NU4MC0GW), 31), 31), 31), 31, this.AARZUJiTa), 31, this.EXtogiMhuM), 31, this.riuEU0zW4), 31, this.SH1y5HwkJhh), 31, this.ez2rX8ReCYw);
        java.lang.String str = this.JlrlGoKF;
        return adDC3e2L + (str == null ? 0 : str.hashCode());
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("IslandUi(id=");
        sb.append(this.IHQe1A4L2xu);
        sb.append(", name=");
        sb.append(this.oh6vYeIP);
        sb.append(", subtitle=");
        sb.append(this.r1MBDhnF);
        sb.append(", setTitle=");
        sb.append(this.F7NU4MC0GW);
        sb.append(", energyCost=");
        defpackage.fx0.EgCjBq0SZwJ(sb, this.adDC3e2L, ", progress=", this.xiZrDbcSW0, ", target=8, unlocked=");
        sb.append(this.AARZUJiTa);
        sb.append(", affordable=");
        sb.append(this.EXtogiMhuM);
        sb.append(", isActiveDig=");
        sb.append(this.riuEU0zW4);
        sb.append(", digFinished=");
        sb.append(this.SH1y5HwkJhh);
        sb.append(", blockedByOtherDig=");
        sb.append(this.ez2rX8ReCYw);
        sb.append(", lockReason=");
        sb.append(this.JlrlGoKF);
        sb.append(")");
        return sb.toString();
    }
}
