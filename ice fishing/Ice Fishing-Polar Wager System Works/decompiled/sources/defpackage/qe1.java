package defpackage;

/* loaded from: classes.dex */
public final class qe1 {
    public final java.util.ArrayList F7NU4MC0GW;
    public final java.lang.String IHQe1A4L2xu;
    public final java.util.ArrayList adDC3e2L;
    public final java.lang.String oh6vYeIP;
    public final java.lang.String r1MBDhnF;

    public qe1(java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.ArrayList arrayList, java.util.ArrayList arrayList2) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.IHQe1A4L2xu = str;
        this.oh6vYeIP = str2;
        this.r1MBDhnF = str3;
        this.F7NU4MC0GW = arrayList;
        this.adDC3e2L = arrayList2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.qe1)) {
            return false;
        }
        defpackage.qe1 qe1Var = (defpackage.qe1) obj;
        if (defpackage.x70.QoRHpC4k(this.IHQe1A4L2xu, qe1Var.IHQe1A4L2xu) && defpackage.x70.QoRHpC4k(this.oh6vYeIP, qe1Var.oh6vYeIP) && defpackage.x70.QoRHpC4k(this.r1MBDhnF, qe1Var.r1MBDhnF) && this.F7NU4MC0GW.equals(qe1Var.F7NU4MC0GW)) {
            return this.adDC3e2L.equals(qe1Var.adDC3e2L);
        }
        return false;
    }

    public final int hashCode() {
        return this.adDC3e2L.hashCode() + ((this.F7NU4MC0GW.hashCode() + defpackage.fx0.F7NU4MC0GW(defpackage.fx0.F7NU4MC0GW(this.IHQe1A4L2xu.hashCode() * 31, 31, this.oh6vYeIP), 31, this.r1MBDhnF)) * 31);
    }

    public final java.lang.String toString() {
        return defpackage.sc1.QPwENk36pDC(defpackage.sc1.Ye0N2xE9Hc("\n            |ForeignKey {\n            |   referenceTable = '" + this.IHQe1A4L2xu + "',\n            |   onDelete = '" + this.oh6vYeIP + "',\n            |   onUpdate = '" + this.r1MBDhnF + "',\n            |   columnNames = {" + defpackage.a70.kNAkVymC(defpackage.td.JX5fKip1C6(this.F7NU4MC0GW)) + "\n            |   referenceColumnNames = {" + defpackage.a70.fnWB2E7cs(defpackage.td.JX5fKip1C6(this.adDC3e2L)) + "\n            |}\n        "));
    }
}
