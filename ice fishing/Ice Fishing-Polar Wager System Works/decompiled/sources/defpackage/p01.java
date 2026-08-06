package defpackage;

/* loaded from: classes.dex */
public final class p01 {
    public final int F7NU4MC0GW;
    public final defpackage.a01 IHQe1A4L2xu;
    public final boolean adDC3e2L;
    public final boolean oh6vYeIP;
    public final int r1MBDhnF;

    public p01(defpackage.a01 a01Var, boolean z, int i, int i2, boolean z2) {
        this.IHQe1A4L2xu = a01Var;
        this.oh6vYeIP = z;
        this.r1MBDhnF = i;
        this.F7NU4MC0GW = i2;
        this.adDC3e2L = z2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.p01)) {
            return false;
        }
        defpackage.p01 p01Var = (defpackage.p01) obj;
        return this.IHQe1A4L2xu.equals(p01Var.IHQe1A4L2xu) && this.oh6vYeIP == p01Var.oh6vYeIP && this.r1MBDhnF == p01Var.r1MBDhnF && this.F7NU4MC0GW == p01Var.F7NU4MC0GW && this.adDC3e2L == p01Var.adDC3e2L;
    }

    public final int hashCode() {
        return java.lang.Boolean.hashCode(this.adDC3e2L) + defpackage.fx0.oh6vYeIP(this.F7NU4MC0GW, defpackage.fx0.oh6vYeIP(this.r1MBDhnF, defpackage.fx0.adDC3e2L(this.IHQe1A4L2xu.hashCode() * 31, 31, this.oh6vYeIP), 31), 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RelicSlotUi(relic=");
        sb.append(this.IHQe1A4L2xu);
        sb.append(", owned=");
        sb.append(this.oh6vYeIP);
        sb.append(", count=");
        defpackage.fx0.EgCjBq0SZwJ(sb, this.r1MBDhnF, ", craftCost=", this.F7NU4MC0GW, ", canCraft=");
        sb.append(this.adDC3e2L);
        sb.append(")");
        return sb.toString();
    }
}
