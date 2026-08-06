package defpackage;

/* loaded from: classes.dex */
public final class em1 {
    public final java.util.List F7NU4MC0GW;
    public final boolean IHQe1A4L2xu;
    public final boolean adDC3e2L;
    public final int oh6vYeIP;
    public final int r1MBDhnF;

    public em1(boolean z, int i, int i2, java.util.List list, boolean z2) {
        list.getClass();
        this.IHQe1A4L2xu = z;
        this.oh6vYeIP = i;
        this.r1MBDhnF = i2;
        this.F7NU4MC0GW = list;
        this.adDC3e2L = z2;
    }

    public static defpackage.em1 IHQe1A4L2xu(defpackage.em1 em1Var, boolean z) {
        boolean z2 = em1Var.IHQe1A4L2xu;
        int i = em1Var.oh6vYeIP;
        int i2 = em1Var.r1MBDhnF;
        java.util.List list = em1Var.F7NU4MC0GW;
        em1Var.getClass();
        list.getClass();
        return new defpackage.em1(z2, i, i2, list, z);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.em1)) {
            return false;
        }
        defpackage.em1 em1Var = (defpackage.em1) obj;
        return this.IHQe1A4L2xu == em1Var.IHQe1A4L2xu && this.oh6vYeIP == em1Var.oh6vYeIP && this.r1MBDhnF == em1Var.r1MBDhnF && defpackage.x70.QoRHpC4k(this.F7NU4MC0GW, em1Var.F7NU4MC0GW) && this.adDC3e2L == em1Var.adDC3e2L;
    }

    public final int hashCode() {
        return java.lang.Boolean.hashCode(this.adDC3e2L) + ((this.F7NU4MC0GW.hashCode() + defpackage.fx0.oh6vYeIP(this.r1MBDhnF, defpackage.fx0.oh6vYeIP(this.oh6vYeIP, java.lang.Boolean.hashCode(this.IHQe1A4L2xu) * 31, 31), 31)) * 31);
    }

    public final java.lang.String toString() {
        return "VictoryUiState(loading=" + this.IHQe1A4L2xu + ", relicsOwned=" + this.oh6vYeIP + ", relicsTotal=" + this.r1MBDhnF + ", stats=" + this.F7NU4MC0GW + ", isBusy=" + this.adDC3e2L + ")";
    }
}
