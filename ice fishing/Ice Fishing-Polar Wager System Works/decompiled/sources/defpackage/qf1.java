package defpackage;

/* loaded from: classes.dex */
public final class qf1 {
    public final defpackage.qn AARZUJiTa;
    public final defpackage.w90 EXtogiMhuM;
    public final int F7NU4MC0GW;
    public final defpackage.l5 IHQe1A4L2xu;
    public final long SH1y5HwkJhh;
    public final boolean adDC3e2L;
    public final defpackage.dg1 oh6vYeIP;
    public final java.util.List r1MBDhnF;
    public final defpackage.ny riuEU0zW4;
    public final int xiZrDbcSW0;

    public qf1(defpackage.l5 l5Var, defpackage.dg1 dg1Var, java.util.List list, int i, boolean z, int i2, defpackage.qn qnVar, defpackage.w90 w90Var, defpackage.ny nyVar, long j) {
        this.IHQe1A4L2xu = l5Var;
        this.oh6vYeIP = dg1Var;
        this.r1MBDhnF = list;
        this.F7NU4MC0GW = i;
        this.adDC3e2L = z;
        this.xiZrDbcSW0 = i2;
        this.AARZUJiTa = qnVar;
        this.EXtogiMhuM = w90Var;
        this.riuEU0zW4 = nyVar;
        this.SH1y5HwkJhh = j;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.qf1)) {
            return false;
        }
        defpackage.qf1 qf1Var = (defpackage.qf1) obj;
        return defpackage.x70.QoRHpC4k(this.IHQe1A4L2xu, qf1Var.IHQe1A4L2xu) && defpackage.x70.QoRHpC4k(this.oh6vYeIP, qf1Var.oh6vYeIP) && this.r1MBDhnF.equals(qf1Var.r1MBDhnF) && this.F7NU4MC0GW == qf1Var.F7NU4MC0GW && this.adDC3e2L == qf1Var.adDC3e2L && this.xiZrDbcSW0 == qf1Var.xiZrDbcSW0 && defpackage.x70.QoRHpC4k(this.AARZUJiTa, qf1Var.AARZUJiTa) && this.EXtogiMhuM == qf1Var.EXtogiMhuM && defpackage.x70.QoRHpC4k(this.riuEU0zW4, qf1Var.riuEU0zW4) && defpackage.ki.oh6vYeIP(this.SH1y5HwkJhh, qf1Var.SH1y5HwkJhh);
    }

    public final int hashCode() {
        return java.lang.Long.hashCode(this.SH1y5HwkJhh) + ((this.riuEU0zW4.hashCode() + ((this.EXtogiMhuM.hashCode() + ((this.AARZUJiTa.hashCode() + defpackage.fx0.oh6vYeIP(this.xiZrDbcSW0, defpackage.fx0.adDC3e2L((((this.r1MBDhnF.hashCode() + defpackage.fx0.xiZrDbcSW0(this.oh6vYeIP, this.IHQe1A4L2xu.hashCode() * 31, 31)) * 31) + this.F7NU4MC0GW) * 31, 31, this.adDC3e2L), 31)) * 31)) * 31)) * 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TextLayoutInput(text=");
        sb.append((java.lang.Object) this.IHQe1A4L2xu);
        sb.append(", style=");
        sb.append(this.oh6vYeIP);
        sb.append(", placeholders=");
        sb.append(this.r1MBDhnF);
        sb.append(", maxLines=");
        sb.append(this.F7NU4MC0GW);
        sb.append(", softWrap=");
        sb.append(this.adDC3e2L);
        sb.append(", overflow=");
        int i = this.xiZrDbcSW0;
        sb.append((java.lang.Object) (i == 1 ? "Clip" : i == 2 ? "Ellipsis" : i == 5 ? "MiddleEllipsis" : i == 3 ? "Visible" : i == 4 ? "StartEllipsis" : "Invalid"));
        sb.append(", density=");
        sb.append(this.AARZUJiTa);
        sb.append(", layoutDirection=");
        sb.append(this.EXtogiMhuM);
        sb.append(", fontFamilyResolver=");
        sb.append(this.riuEU0zW4);
        sb.append(", constraints=");
        sb.append((java.lang.Object) defpackage.ki.ez2rX8ReCYw(this.SH1y5HwkJhh));
        sb.append(')');
        return sb.toString();
    }
}
