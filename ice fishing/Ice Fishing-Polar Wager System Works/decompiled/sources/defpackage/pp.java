package defpackage;

/* loaded from: classes.dex */
public final class pp {
    public final java.util.List AARZUJiTa;
    public final boolean EXtogiMhuM;
    public final java.lang.String F7NU4MC0GW;
    public final boolean IHQe1A4L2xu;
    public final int adDC3e2L;
    public final boolean oh6vYeIP;
    public final java.lang.String r1MBDhnF;
    public final boolean riuEU0zW4;
    public final int xiZrDbcSW0;

    public pp(boolean z, boolean z2, java.lang.String str, java.lang.String str2, int i, int i2, java.util.List list, boolean z3, boolean z4) {
        list.getClass();
        this.IHQe1A4L2xu = z;
        this.oh6vYeIP = z2;
        this.r1MBDhnF = str;
        this.F7NU4MC0GW = str2;
        this.adDC3e2L = i;
        this.xiZrDbcSW0 = i2;
        this.AARZUJiTa = list;
        this.EXtogiMhuM = z3;
        this.riuEU0zW4 = z4;
    }

    public static defpackage.pp IHQe1A4L2xu(defpackage.pp ppVar, boolean z, int i) {
        boolean z2 = (i & 1) != 0 ? ppVar.IHQe1A4L2xu : false;
        boolean z3 = (i & 2) != 0 ? ppVar.oh6vYeIP : false;
        java.lang.String str = ppVar.r1MBDhnF;
        java.lang.String str2 = ppVar.F7NU4MC0GW;
        int i2 = ppVar.adDC3e2L;
        int i3 = ppVar.xiZrDbcSW0;
        java.util.List list = ppVar.AARZUJiTa;
        boolean z4 = ppVar.EXtogiMhuM;
        if ((i & 256) != 0) {
            z = ppVar.riuEU0zW4;
        }
        ppVar.getClass();
        list.getClass();
        return new defpackage.pp(z2, z3, str, str2, i2, i3, list, z4, z);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.pp)) {
            return false;
        }
        defpackage.pp ppVar = (defpackage.pp) obj;
        return this.IHQe1A4L2xu == ppVar.IHQe1A4L2xu && this.oh6vYeIP == ppVar.oh6vYeIP && this.r1MBDhnF.equals(ppVar.r1MBDhnF) && this.F7NU4MC0GW.equals(ppVar.F7NU4MC0GW) && this.adDC3e2L == ppVar.adDC3e2L && this.xiZrDbcSW0 == ppVar.xiZrDbcSW0 && defpackage.x70.QoRHpC4k(this.AARZUJiTa, ppVar.AARZUJiTa) && this.EXtogiMhuM == ppVar.EXtogiMhuM && this.riuEU0zW4 == ppVar.riuEU0zW4;
    }

    public final int hashCode() {
        return java.lang.Boolean.hashCode(this.riuEU0zW4) + defpackage.fx0.adDC3e2L((this.AARZUJiTa.hashCode() + defpackage.fx0.oh6vYeIP(this.xiZrDbcSW0, defpackage.fx0.oh6vYeIP(this.adDC3e2L, defpackage.fx0.F7NU4MC0GW(defpackage.fx0.F7NU4MC0GW(defpackage.fx0.adDC3e2L(java.lang.Boolean.hashCode(this.IHQe1A4L2xu) * 31, 31, this.oh6vYeIP), 31, this.r1MBDhnF), 31, this.F7NU4MC0GW), 31), 31)) * 31, 31, this.EXtogiMhuM);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DigUiState(loading=");
        sb.append(this.IHQe1A4L2xu);
        sb.append(", hasSession=");
        sb.append(this.oh6vYeIP);
        sb.append(", islandName=");
        sb.append(this.r1MBDhnF);
        sb.append(", islandSubtitle=");
        sb.append(this.F7NU4MC0GW);
        sb.append(", movesLeft=");
        defpackage.fx0.EgCjBq0SZwJ(sb, this.adDC3e2L, ", totalMoves=", this.xiZrDbcSW0, ", cells=");
        sb.append(this.AARZUJiTa);
        sb.append(", finished=");
        sb.append(this.EXtogiMhuM);
        sb.append(", isBusy=");
        sb.append(this.riuEU0zW4);
        sb.append(")");
        return sb.toString();
    }
}
