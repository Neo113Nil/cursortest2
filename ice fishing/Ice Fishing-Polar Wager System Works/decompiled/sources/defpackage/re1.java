package defpackage;

/* loaded from: classes.dex */
public final class re1 {
    public final java.util.List F7NU4MC0GW;
    public final java.lang.String IHQe1A4L2xu;
    public final boolean oh6vYeIP;
    public final java.util.List r1MBDhnF;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
    public re1(java.lang.String str, boolean z, java.util.List list, java.util.List list2) {
        str.getClass();
        this.IHQe1A4L2xu = str;
        this.oh6vYeIP = z;
        this.r1MBDhnF = list;
        this.F7NU4MC0GW = list2;
        if (list2.isEmpty()) {
            int size = list.size();
            list2 = new java.util.ArrayList(size);
            for (int i = 0; i < size; i++) {
                list2.add("ASC");
            }
        }
        this.F7NU4MC0GW = list2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.re1)) {
            return false;
        }
        defpackage.re1 re1Var = (defpackage.re1) obj;
        java.lang.String str = re1Var.IHQe1A4L2xu;
        if (this.oh6vYeIP != re1Var.oh6vYeIP || !this.r1MBDhnF.equals(re1Var.r1MBDhnF) || !defpackage.x70.QoRHpC4k(this.F7NU4MC0GW, re1Var.F7NU4MC0GW)) {
            return false;
        }
        java.lang.String str2 = this.IHQe1A4L2xu;
        return defpackage.yc1.wKlPRKlRnfqr(str2, "index_") ? defpackage.yc1.wKlPRKlRnfqr(str, "index_") : str2.equals(str);
    }

    public final int hashCode() {
        java.lang.String str = this.IHQe1A4L2xu;
        return this.F7NU4MC0GW.hashCode() + ((this.r1MBDhnF.hashCode() + ((((defpackage.yc1.wKlPRKlRnfqr(str, "index_") ? -1184239155 : str.hashCode()) * 31) + (this.oh6vYeIP ? 1 : 0)) * 31)) * 31);
    }

    public final java.lang.String toString() {
        return defpackage.sc1.QPwENk36pDC(defpackage.sc1.Ye0N2xE9Hc("\n            |Index {\n            |   name = '" + this.IHQe1A4L2xu + "',\n            |   unique = '" + this.oh6vYeIP + "',\n            |   columns = {" + defpackage.a70.kNAkVymC(this.r1MBDhnF) + "\n            |   orders = {" + defpackage.a70.fnWB2E7cs(this.F7NU4MC0GW) + "\n            |}\n        "));
    }
}
