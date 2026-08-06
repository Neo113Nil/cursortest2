package defpackage;

/* loaded from: classes.dex */
public final class r30 {
    public final int AARZUJiTa;
    public final boolean EXtogiMhuM;
    public final int F7NU4MC0GW;
    public final boolean IHQe1A4L2xu;
    public final int adDC3e2L;
    public final java.lang.String oh6vYeIP;
    public final java.util.List r1MBDhnF;
    public final int xiZrDbcSW0;

    public r30(boolean z, java.lang.String str, java.util.List list, int i, int i2, int i3, int i4, boolean z2) {
        list.getClass();
        this.IHQe1A4L2xu = z;
        this.oh6vYeIP = str;
        this.r1MBDhnF = list;
        this.F7NU4MC0GW = i;
        this.adDC3e2L = i2;
        this.xiZrDbcSW0 = i3;
        this.AARZUJiTa = i4;
        this.EXtogiMhuM = z2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.r30)) {
            return false;
        }
        defpackage.r30 r30Var = (defpackage.r30) obj;
        return this.IHQe1A4L2xu == r30Var.IHQe1A4L2xu && this.oh6vYeIP.equals(r30Var.oh6vYeIP) && defpackage.x70.QoRHpC4k(this.r1MBDhnF, r30Var.r1MBDhnF) && this.F7NU4MC0GW == r30Var.F7NU4MC0GW && this.adDC3e2L == r30Var.adDC3e2L && this.xiZrDbcSW0 == r30Var.xiZrDbcSW0 && this.AARZUJiTa == r30Var.AARZUJiTa && this.EXtogiMhuM == r30Var.EXtogiMhuM;
    }

    public final int hashCode() {
        return java.lang.Boolean.hashCode(this.EXtogiMhuM) + defpackage.fx0.oh6vYeIP(this.AARZUJiTa, defpackage.fx0.oh6vYeIP(this.xiZrDbcSW0, defpackage.fx0.oh6vYeIP(this.adDC3e2L, defpackage.fx0.oh6vYeIP(this.F7NU4MC0GW, (this.r1MBDhnF.hashCode() + defpackage.fx0.F7NU4MC0GW(java.lang.Boolean.hashCode(this.IHQe1A4L2xu) * 31, 31, this.oh6vYeIP)) * 31, 31), 31), 31), 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("HaulUiState(loading=");
        sb.append(this.IHQe1A4L2xu);
        sb.append(", islandName=");
        sb.append(this.oh6vYeIP);
        sb.append(", entries=");
        sb.append(this.r1MBDhnF);
        sb.append(", relicsRecovered=");
        sb.append(this.F7NU4MC0GW);
        sb.append(", doubloonsEarned=");
        defpackage.fx0.EgCjBq0SZwJ(sb, this.adDC3e2L, ", shardsEarned=", this.xiZrDbcSW0, ", cursedHit=");
        sb.append(this.AARZUJiTa);
        sb.append(", isBusy=");
        sb.append(this.EXtogiMhuM);
        sb.append(")");
        return sb.toString();
    }
}
