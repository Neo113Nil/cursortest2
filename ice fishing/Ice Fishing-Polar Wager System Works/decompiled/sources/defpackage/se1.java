package defpackage;

/* loaded from: classes.dex */
public final class se1 {
    public final java.util.Set F7NU4MC0GW;
    public final java.lang.String IHQe1A4L2xu;
    public final java.util.Map oh6vYeIP;
    public final java.util.Set r1MBDhnF;

    public se1(java.lang.String str, java.util.Map map, java.util.AbstractSet abstractSet, java.util.AbstractSet abstractSet2) {
        abstractSet.getClass();
        this.IHQe1A4L2xu = str;
        this.oh6vYeIP = map;
        this.r1MBDhnF = abstractSet;
        this.F7NU4MC0GW = abstractSet2;
    }

    public final boolean equals(java.lang.Object obj) {
        java.util.Set set;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.se1)) {
            return false;
        }
        defpackage.se1 se1Var = (defpackage.se1) obj;
        if (!this.IHQe1A4L2xu.equals(se1Var.IHQe1A4L2xu) || !this.oh6vYeIP.equals(se1Var.oh6vYeIP) || !defpackage.x70.QoRHpC4k(this.r1MBDhnF, se1Var.r1MBDhnF)) {
            return false;
        }
        java.util.Set set2 = this.F7NU4MC0GW;
        if (set2 == null || (set = se1Var.F7NU4MC0GW) == null) {
            return true;
        }
        return set2.equals(set);
    }

    public final int hashCode() {
        return this.r1MBDhnF.hashCode() + ((this.oh6vYeIP.hashCode() + (this.IHQe1A4L2xu.hashCode() * 31)) * 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("\n            |TableInfo {\n            |    name = '");
        sb.append(this.IHQe1A4L2xu);
        sb.append("',\n            |    columns = {");
        sb.append(defpackage.a70.DFo87pBq1E5(defpackage.td.yUiIS9dG7NYk(this.oh6vYeIP.values(), new defpackage.hy(10))));
        sb.append("\n            |    foreignKeys = {");
        sb.append(defpackage.a70.DFo87pBq1E5(this.r1MBDhnF));
        sb.append("\n            |    indices = {");
        java.util.Set set = this.F7NU4MC0GW;
        sb.append(defpackage.a70.DFo87pBq1E5(set != null ? defpackage.td.yUiIS9dG7NYk(set, new defpackage.hy(11)) : defpackage.nt.adDC3e2L));
        sb.append("\n            |}\n        ");
        return defpackage.sc1.Ye0N2xE9Hc(sb.toString());
    }
}
