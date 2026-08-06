package defpackage;

/* loaded from: classes.dex */
public final class ii1 implements defpackage.hi1 {
    public final java.lang.Object IHQe1A4L2xu;
    public final java.lang.Object oh6vYeIP;

    public ii1(java.lang.Object obj, java.lang.Object obj2) {
        this.IHQe1A4L2xu = obj;
        this.oh6vYeIP = obj2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.hi1)) {
            return false;
        }
        defpackage.hi1 hi1Var = (defpackage.hi1) obj;
        return defpackage.x70.QoRHpC4k(this.IHQe1A4L2xu, hi1Var.oh6vYeIP()) && defpackage.x70.QoRHpC4k(this.oh6vYeIP, hi1Var.r1MBDhnF());
    }

    public final int hashCode() {
        java.lang.Object obj = this.IHQe1A4L2xu;
        int hashCode = (obj != null ? obj.hashCode() : 0) * 31;
        java.lang.Object obj2 = this.oh6vYeIP;
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    @Override // defpackage.hi1
    public final java.lang.Object oh6vYeIP() {
        return this.IHQe1A4L2xu;
    }

    @Override // defpackage.hi1
    public final java.lang.Object r1MBDhnF() {
        return this.oh6vYeIP;
    }
}
