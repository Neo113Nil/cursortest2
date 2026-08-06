package defpackage;

/* loaded from: classes.dex */
public final class rh0 {
    public final boolean AARZUJiTa;
    public final java.lang.String EXtogiMhuM;
    public final int F7NU4MC0GW;
    public final boolean IHQe1A4L2xu;
    public final int SH1y5HwkJhh;
    public final java.lang.String adDC3e2L;
    public final boolean ez2rX8ReCYw;
    public final int oh6vYeIP;
    public final int r1MBDhnF;
    public final int riuEU0zW4;
    public final java.util.List xiZrDbcSW0;

    public rh0(boolean z, int i, int i2, int i3, java.lang.String str, java.util.List list, boolean z2, java.lang.String str2, int i4, int i5, boolean z3) {
        list.getClass();
        this.IHQe1A4L2xu = z;
        this.oh6vYeIP = i;
        this.r1MBDhnF = i2;
        this.F7NU4MC0GW = i3;
        this.adDC3e2L = str;
        this.xiZrDbcSW0 = list;
        this.AARZUJiTa = z2;
        this.EXtogiMhuM = str2;
        this.riuEU0zW4 = i4;
        this.SH1y5HwkJhh = i5;
        this.ez2rX8ReCYw = z3;
    }

    public static defpackage.rh0 IHQe1A4L2xu(defpackage.rh0 rh0Var, boolean z) {
        boolean z2 = rh0Var.IHQe1A4L2xu;
        int i = rh0Var.oh6vYeIP;
        int i2 = rh0Var.r1MBDhnF;
        int i3 = rh0Var.F7NU4MC0GW;
        java.lang.String str = rh0Var.adDC3e2L;
        java.util.List list = rh0Var.xiZrDbcSW0;
        boolean z3 = rh0Var.AARZUJiTa;
        java.lang.String str2 = rh0Var.EXtogiMhuM;
        int i4 = rh0Var.riuEU0zW4;
        int i5 = rh0Var.SH1y5HwkJhh;
        rh0Var.getClass();
        list.getClass();
        return new defpackage.rh0(z2, i, i2, i3, str, list, z3, str2, i4, i5, z);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.rh0)) {
            return false;
        }
        defpackage.rh0 rh0Var = (defpackage.rh0) obj;
        return this.IHQe1A4L2xu == rh0Var.IHQe1A4L2xu && this.oh6vYeIP == rh0Var.oh6vYeIP && this.r1MBDhnF == rh0Var.r1MBDhnF && this.F7NU4MC0GW == rh0Var.F7NU4MC0GW && defpackage.x70.QoRHpC4k(this.adDC3e2L, rh0Var.adDC3e2L) && defpackage.x70.QoRHpC4k(this.xiZrDbcSW0, rh0Var.xiZrDbcSW0) && this.AARZUJiTa == rh0Var.AARZUJiTa && this.EXtogiMhuM.equals(rh0Var.EXtogiMhuM) && this.riuEU0zW4 == rh0Var.riuEU0zW4 && this.SH1y5HwkJhh == rh0Var.SH1y5HwkJhh && this.ez2rX8ReCYw == rh0Var.ez2rX8ReCYw;
    }

    public final int hashCode() {
        int oh6vYeIP = defpackage.fx0.oh6vYeIP(this.F7NU4MC0GW, defpackage.fx0.oh6vYeIP(this.r1MBDhnF, defpackage.fx0.oh6vYeIP(this.oh6vYeIP, java.lang.Boolean.hashCode(this.IHQe1A4L2xu) * 31, 31), 31), 31);
        java.lang.String str = this.adDC3e2L;
        return java.lang.Boolean.hashCode(this.ez2rX8ReCYw) + defpackage.fx0.oh6vYeIP(this.SH1y5HwkJhh, defpackage.fx0.oh6vYeIP(this.riuEU0zW4, defpackage.fx0.F7NU4MC0GW(defpackage.fx0.adDC3e2L((this.xiZrDbcSW0.hashCode() + ((oh6vYeIP + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, this.AARZUJiTa), 31, this.EXtogiMhuM), 31), 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("MapUiState(loading=");
        sb.append(this.IHQe1A4L2xu);
        sb.append(", doubloons=");
        sb.append(this.oh6vYeIP);
        sb.append(", energy=");
        defpackage.fx0.EgCjBq0SZwJ(sb, this.r1MBDhnF, ", energyCap=", this.F7NU4MC0GW, ", energyTimer=");
        sb.append(this.adDC3e2L);
        sb.append(", islands=");
        sb.append(this.xiZrDbcSW0);
        sb.append(", chestReady=");
        sb.append(this.AARZUJiTa);
        sb.append(", chestTimer=");
        sb.append(this.EXtogiMhuM);
        sb.append(", relicsOwned=");
        defpackage.fx0.EgCjBq0SZwJ(sb, this.riuEU0zW4, ", relicsTotal=", this.SH1y5HwkJhh, ", isBusy=");
        sb.append(this.ez2rX8ReCYw);
        sb.append(")");
        return sb.toString();
    }
}
