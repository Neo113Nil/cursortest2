package defpackage;

/* loaded from: classes.dex */
public final class qb {
    public final defpackage.e8 IHQe1A4L2xu;
    public final defpackage.g00 oh6vYeIP;
    public final defpackage.ub1 r1MBDhnF;

    public qb(defpackage.e8 e8Var, defpackage.g00 g00Var, defpackage.ub1 ub1Var) {
        this.IHQe1A4L2xu = e8Var;
        this.oh6vYeIP = g00Var;
        this.r1MBDhnF = ub1Var;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.qb)) {
            return false;
        }
        defpackage.qb qbVar = (defpackage.qb) obj;
        return defpackage.x70.QoRHpC4k(this.IHQe1A4L2xu, qbVar.IHQe1A4L2xu) && defpackage.x70.QoRHpC4k(this.oh6vYeIP, qbVar.oh6vYeIP) && this.r1MBDhnF.equals(qbVar.r1MBDhnF);
    }

    public final int hashCode() {
        return java.lang.Boolean.hashCode(true) + ((this.r1MBDhnF.hashCode() + ((this.oh6vYeIP.hashCode() + (this.IHQe1A4L2xu.hashCode() * 31)) * 31)) * 31);
    }

    public final java.lang.String toString() {
        return "ChangeSize(alignment=" + this.IHQe1A4L2xu + ", size=" + this.oh6vYeIP + ", animationSpec=" + this.r1MBDhnF + ", clip=true)";
    }
}
