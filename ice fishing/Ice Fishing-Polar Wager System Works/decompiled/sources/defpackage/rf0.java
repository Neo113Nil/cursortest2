package defpackage;

/* loaded from: classes.dex */
public final class rf0 {
    public final int F7NU4MC0GW;
    public final boolean IHQe1A4L2xu;
    public final java.util.List oh6vYeIP;
    public final java.util.List r1MBDhnF;

    public rf0(boolean z, java.util.List list, java.util.List list2, int i) {
        list.getClass();
        list2.getClass();
        this.IHQe1A4L2xu = z;
        this.oh6vYeIP = list;
        this.r1MBDhnF = list2;
        this.F7NU4MC0GW = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.rf0)) {
            return false;
        }
        defpackage.rf0 rf0Var = (defpackage.rf0) obj;
        return this.IHQe1A4L2xu == rf0Var.IHQe1A4L2xu && defpackage.x70.QoRHpC4k(this.oh6vYeIP, rf0Var.oh6vYeIP) && defpackage.x70.QoRHpC4k(this.r1MBDhnF, rf0Var.r1MBDhnF) && this.F7NU4MC0GW == rf0Var.F7NU4MC0GW;
    }

    public final int hashCode() {
        return java.lang.Integer.hashCode(this.F7NU4MC0GW) + ((this.r1MBDhnF.hashCode() + ((this.oh6vYeIP.hashCode() + (java.lang.Boolean.hashCode(this.IHQe1A4L2xu) * 31)) * 31)) * 31);
    }

    public final java.lang.String toString() {
        return "LogUiState(loading=" + this.IHQe1A4L2xu + ", achievements=" + this.oh6vYeIP + ", stats=" + this.r1MBDhnF + ", unlockedCount=" + this.F7NU4MC0GW + ")";
    }
}
