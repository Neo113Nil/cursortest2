package defpackage;

/* loaded from: classes.dex */
public final class tf1 {
    public final defpackage.ob1 F7NU4MC0GW;
    public final defpackage.ob1 IHQe1A4L2xu;
    public final defpackage.ob1 oh6vYeIP;
    public final defpackage.ob1 r1MBDhnF;

    public tf1(defpackage.ob1 ob1Var, defpackage.ob1 ob1Var2, defpackage.ob1 ob1Var3, defpackage.ob1 ob1Var4) {
        this.IHQe1A4L2xu = ob1Var;
        this.oh6vYeIP = ob1Var2;
        this.r1MBDhnF = ob1Var3;
        this.F7NU4MC0GW = ob1Var4;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof defpackage.tf1)) {
            return false;
        }
        defpackage.tf1 tf1Var = (defpackage.tf1) obj;
        return defpackage.x70.QoRHpC4k(this.IHQe1A4L2xu, tf1Var.IHQe1A4L2xu) && defpackage.x70.QoRHpC4k(this.oh6vYeIP, tf1Var.oh6vYeIP) && defpackage.x70.QoRHpC4k(this.r1MBDhnF, tf1Var.r1MBDhnF) && defpackage.x70.QoRHpC4k(this.F7NU4MC0GW, tf1Var.F7NU4MC0GW);
    }

    public final int hashCode() {
        defpackage.ob1 ob1Var = this.IHQe1A4L2xu;
        int hashCode = (ob1Var != null ? ob1Var.hashCode() : 0) * 31;
        defpackage.ob1 ob1Var2 = this.oh6vYeIP;
        int hashCode2 = (hashCode + (ob1Var2 != null ? ob1Var2.hashCode() : 0)) * 31;
        defpackage.ob1 ob1Var3 = this.r1MBDhnF;
        int hashCode3 = (hashCode2 + (ob1Var3 != null ? ob1Var3.hashCode() : 0)) * 31;
        defpackage.ob1 ob1Var4 = this.F7NU4MC0GW;
        return hashCode3 + (ob1Var4 != null ? ob1Var4.hashCode() : 0);
    }
}
