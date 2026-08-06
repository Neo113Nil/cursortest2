package defpackage;

/* loaded from: classes.dex */
public final class k21 implements defpackage.f50 {
    public final boolean IHQe1A4L2xu;
    public final float oh6vYeIP;
    public final long r1MBDhnF;

    public k21(boolean z, float f, long j) {
        this.IHQe1A4L2xu = z;
        this.oh6vYeIP = f;
        this.r1MBDhnF = j;
    }

    @Override // defpackage.f50
    public final defpackage.kn IHQe1A4L2xu(defpackage.zk0 zk0Var) {
        return new defpackage.on(zk0Var, this.IHQe1A4L2xu, this.oh6vYeIP, new defpackage.c1NqjJifC7(26, this));
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.k21)) {
            return false;
        }
        defpackage.k21 k21Var = (defpackage.k21) obj;
        if (this.IHQe1A4L2xu == k21Var.IHQe1A4L2xu && defpackage.uq.oh6vYeIP(this.oh6vYeIP, k21Var.oh6vYeIP)) {
            return defpackage.ae.r1MBDhnF(this.r1MBDhnF, k21Var.r1MBDhnF);
        }
        return false;
    }

    @Override // defpackage.f50
    public final int hashCode() {
        int IHQe1A4L2xu = defpackage.fx0.IHQe1A4L2xu(this.oh6vYeIP, java.lang.Boolean.hashCode(this.IHQe1A4L2xu) * 31, 961);
        int i = defpackage.ae.AARZUJiTa;
        return java.lang.Long.hashCode(this.r1MBDhnF) + IHQe1A4L2xu;
    }
}
