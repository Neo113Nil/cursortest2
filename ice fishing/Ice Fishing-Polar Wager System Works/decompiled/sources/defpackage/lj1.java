package defpackage;

/* loaded from: classes.dex */
public final class lj1 implements defpackage.tv {
    public final int IHQe1A4L2xu;
    public final int oh6vYeIP;
    public final defpackage.ds r1MBDhnF;

    public lj1(int i, int i2, defpackage.ds dsVar) {
        this.IHQe1A4L2xu = i;
        this.oh6vYeIP = i2;
        this.r1MBDhnF = dsVar;
    }

    @Override // defpackage.c5
    public final defpackage.nl1 IHQe1A4L2xu(defpackage.F7NU4MC0GW f7nu4mc0gw) {
        return new defpackage.hq0(this.IHQe1A4L2xu, this.oh6vYeIP, this.r1MBDhnF);
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.lj1) {
            defpackage.lj1 lj1Var = (defpackage.lj1) obj;
            if (lj1Var.IHQe1A4L2xu == this.IHQe1A4L2xu && lj1Var.oh6vYeIP == this.oh6vYeIP && defpackage.x70.QoRHpC4k(lj1Var.r1MBDhnF, this.r1MBDhnF)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.r1MBDhnF.hashCode() + (this.IHQe1A4L2xu * 31)) * 31) + this.oh6vYeIP;
    }
}
