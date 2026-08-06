package defpackage;

/* loaded from: classes.dex */
public final class o80 {
    public final int AARZUJiTa;
    public final int EXtogiMhuM;
    public final defpackage.o01 F7NU4MC0GW;
    public final java.lang.String IHQe1A4L2xu;
    public final int JlrlGoKF;
    public final int SH1y5HwkJhh;
    public final int adDC3e2L;
    public final int ez2rX8ReCYw;
    public final java.lang.String oh6vYeIP;
    public final java.lang.String r1MBDhnF;
    public final int riuEU0zW4;
    public final int xiZrDbcSW0;

    public o80(java.lang.String str, java.lang.String str2, java.lang.String str3, defpackage.o01 o01Var, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.IHQe1A4L2xu = str;
        this.oh6vYeIP = str2;
        this.r1MBDhnF = str3;
        this.F7NU4MC0GW = o01Var;
        this.adDC3e2L = i;
        this.xiZrDbcSW0 = i2;
        this.AARZUJiTa = i3;
        this.EXtogiMhuM = i4;
        this.riuEU0zW4 = i5;
        this.SH1y5HwkJhh = i6;
        this.ez2rX8ReCYw = i7;
        this.JlrlGoKF = i8;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.o80)) {
            return false;
        }
        defpackage.o80 o80Var = (defpackage.o80) obj;
        return this.IHQe1A4L2xu.equals(o80Var.IHQe1A4L2xu) && this.oh6vYeIP.equals(o80Var.oh6vYeIP) && this.r1MBDhnF.equals(o80Var.r1MBDhnF) && this.F7NU4MC0GW == o80Var.F7NU4MC0GW && this.adDC3e2L == o80Var.adDC3e2L && this.xiZrDbcSW0 == o80Var.xiZrDbcSW0 && this.AARZUJiTa == o80Var.AARZUJiTa && this.EXtogiMhuM == o80Var.EXtogiMhuM && this.riuEU0zW4 == o80Var.riuEU0zW4 && this.SH1y5HwkJhh == o80Var.SH1y5HwkJhh && this.ez2rX8ReCYw == o80Var.ez2rX8ReCYw && this.JlrlGoKF == o80Var.JlrlGoKF;
    }

    public final int hashCode() {
        return java.lang.Integer.hashCode(this.JlrlGoKF) + defpackage.fx0.oh6vYeIP(3, defpackage.fx0.oh6vYeIP(this.ez2rX8ReCYw, defpackage.fx0.oh6vYeIP(5, defpackage.fx0.oh6vYeIP(this.SH1y5HwkJhh, defpackage.fx0.oh6vYeIP(this.riuEU0zW4, defpackage.fx0.oh6vYeIP(this.EXtogiMhuM, defpackage.fx0.oh6vYeIP(this.AARZUJiTa, defpackage.fx0.oh6vYeIP(this.xiZrDbcSW0, defpackage.fx0.oh6vYeIP(this.adDC3e2L, (this.F7NU4MC0GW.hashCode() + defpackage.fx0.F7NU4MC0GW(defpackage.fx0.F7NU4MC0GW(this.IHQe1A4L2xu.hashCode() * 31, 31, this.oh6vYeIP), 31, this.r1MBDhnF)) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Island(id=");
        sb.append(this.IHQe1A4L2xu);
        sb.append(", name=");
        sb.append(this.oh6vYeIP);
        sb.append(", subtitle=");
        sb.append(this.r1MBDhnF);
        sb.append(", set=");
        sb.append(this.F7NU4MC0GW);
        sb.append(", order=");
        defpackage.fx0.EgCjBq0SZwJ(sb, this.adDC3e2L, ", energyCost=", this.xiZrDbcSW0, ", digMoves=");
        defpackage.fx0.EgCjBq0SZwJ(sb, this.AARZUJiTa, ", doubloonMin=", this.EXtogiMhuM, ", doubloonMax=");
        defpackage.fx0.EgCjBq0SZwJ(sb, this.riuEU0zW4, ", shardAmount=", this.SH1y5HwkJhh, ", relicCells=5, doubloonCells=");
        sb.append(this.ez2rX8ReCYw);
        sb.append(", shardCells=3, cursedCells=");
        sb.append(this.JlrlGoKF);
        sb.append(")");
        return sb.toString();
    }
}
