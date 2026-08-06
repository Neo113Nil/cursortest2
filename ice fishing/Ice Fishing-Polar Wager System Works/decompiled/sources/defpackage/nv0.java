package defpackage;

/* loaded from: classes.dex */
public final class nv0 {
    public final int AARZUJiTa;
    public final int EXtogiMhuM;
    public final int F7NU4MC0GW;
    public final int IHQe1A4L2xu;
    public final int adDC3e2L;
    public final int oh6vYeIP;
    public final int r1MBDhnF;
    public final int xiZrDbcSW0;

    public nv0(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.IHQe1A4L2xu = i;
        this.oh6vYeIP = i2;
        this.r1MBDhnF = i3;
        this.F7NU4MC0GW = i4;
        this.adDC3e2L = i5;
        this.xiZrDbcSW0 = i6;
        this.AARZUJiTa = i7;
        this.EXtogiMhuM = i8;
    }

    public static defpackage.nv0 IHQe1A4L2xu(defpackage.nv0 nv0Var, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        if ((i9 & 1) != 0) {
            i = nv0Var.IHQe1A4L2xu;
        }
        int i10 = i;
        if ((i9 & 2) != 0) {
            i2 = nv0Var.oh6vYeIP;
        }
        int i11 = i2;
        if ((i9 & 4) != 0) {
            i3 = nv0Var.r1MBDhnF;
        }
        int i12 = i3;
        if ((i9 & 8) != 0) {
            i4 = nv0Var.F7NU4MC0GW;
        }
        int i13 = i4;
        if ((i9 & 16) != 0) {
            i5 = nv0Var.adDC3e2L;
        }
        int i14 = i5;
        if ((i9 & 32) != 0) {
            i6 = nv0Var.xiZrDbcSW0;
        }
        int i15 = i6;
        int i16 = (i9 & 64) != 0 ? nv0Var.AARZUJiTa : i7;
        int i17 = (i9 & 128) != 0 ? nv0Var.EXtogiMhuM : i8;
        nv0Var.getClass();
        return new defpackage.nv0(i10, i11, i12, i13, i14, i15, i16, i17);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.nv0)) {
            return false;
        }
        defpackage.nv0 nv0Var = (defpackage.nv0) obj;
        return this.IHQe1A4L2xu == nv0Var.IHQe1A4L2xu && this.oh6vYeIP == nv0Var.oh6vYeIP && this.r1MBDhnF == nv0Var.r1MBDhnF && this.F7NU4MC0GW == nv0Var.F7NU4MC0GW && this.adDC3e2L == nv0Var.adDC3e2L && this.xiZrDbcSW0 == nv0Var.xiZrDbcSW0 && this.AARZUJiTa == nv0Var.AARZUJiTa && this.EXtogiMhuM == nv0Var.EXtogiMhuM;
    }

    public final int hashCode() {
        return java.lang.Integer.hashCode(this.EXtogiMhuM) + defpackage.fx0.oh6vYeIP(this.AARZUJiTa, defpackage.fx0.oh6vYeIP(this.xiZrDbcSW0, defpackage.fx0.oh6vYeIP(this.adDC3e2L, defpackage.fx0.oh6vYeIP(this.F7NU4MC0GW, defpackage.fx0.oh6vYeIP(this.r1MBDhnF, defpackage.fx0.oh6vYeIP(this.oh6vYeIP, java.lang.Integer.hashCode(this.IHQe1A4L2xu) * 31, 31), 31), 31), 31), 31), 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PlayerStats(cellsDug=");
        sb.append(this.IHQe1A4L2xu);
        sb.append(", relicsFound=");
        sb.append(this.oh6vYeIP);
        sb.append(", legendariesFound=");
        defpackage.fx0.EgCjBq0SZwJ(sb, this.r1MBDhnF, ", craftCount=", this.F7NU4MC0GW, ", cursedHits=");
        defpackage.fx0.EgCjBq0SZwJ(sb, this.adDC3e2L, ", tradeCount=", this.xiZrDbcSW0, ", duplicatesSold=");
        sb.append(this.AARZUJiTa);
        sb.append(", peakDoubloons=");
        sb.append(this.EXtogiMhuM);
        sb.append(")");
        return sb.toString();
    }
}
