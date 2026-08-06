package defpackage;

/* loaded from: classes.dex */
public final class yb1 implements defpackage.c5 {
    public final defpackage.c5 IHQe1A4L2xu;
    public final long oh6vYeIP;

    public yb1(defpackage.tv tvVar, long j) {
        this.IHQe1A4L2xu = tvVar;
        this.oh6vYeIP = j;
    }

    @Override // defpackage.c5
    public final defpackage.nl1 IHQe1A4L2xu(defpackage.F7NU4MC0GW f7nu4mc0gw) {
        return new defpackage.zb1(this.IHQe1A4L2xu.IHQe1A4L2xu(f7nu4mc0gw), this.oh6vYeIP);
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.yb1)) {
            return false;
        }
        defpackage.yb1 yb1Var = (defpackage.yb1) obj;
        return yb1Var.oh6vYeIP == this.oh6vYeIP && defpackage.x70.QoRHpC4k(yb1Var.IHQe1A4L2xu, this.IHQe1A4L2xu);
    }

    public final int hashCode() {
        return java.lang.Long.hashCode(this.oh6vYeIP) + (this.IHQe1A4L2xu.hashCode() * 31);
    }
}
