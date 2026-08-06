package defpackage;

/* loaded from: classes.dex */
public final class zb1 implements defpackage.nl1 {
    public final defpackage.nl1 adDC3e2L;
    public final long xiZrDbcSW0;

    public zb1(defpackage.nl1 nl1Var, long j) {
        this.adDC3e2L = nl1Var;
        this.xiZrDbcSW0 = j;
    }

    @Override // defpackage.nl1
    public final boolean IHQe1A4L2xu() {
        return this.adDC3e2L.IHQe1A4L2xu();
    }

    @Override // defpackage.nl1
    public final defpackage.i5 JlrlGoKF(long j, defpackage.i5 i5Var, defpackage.i5 i5Var2, defpackage.i5 i5Var3) {
        long j2 = this.xiZrDbcSW0;
        return j < j2 ? i5Var3 : this.adDC3e2L.JlrlGoKF(j - j2, i5Var, i5Var2, i5Var3);
    }

    @Override // defpackage.nl1
    public final defpackage.i5 cnag84Bm(long j, defpackage.i5 i5Var, defpackage.i5 i5Var2, defpackage.i5 i5Var3) {
        long j2 = this.xiZrDbcSW0;
        return j < j2 ? i5Var : this.adDC3e2L.cnag84Bm(j - j2, i5Var, i5Var2, i5Var3);
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.zb1)) {
            return false;
        }
        defpackage.zb1 zb1Var = (defpackage.zb1) obj;
        return zb1Var.xiZrDbcSW0 == this.xiZrDbcSW0 && defpackage.x70.QoRHpC4k(zb1Var.adDC3e2L, this.adDC3e2L);
    }

    public final int hashCode() {
        return java.lang.Long.hashCode(this.xiZrDbcSW0) + (this.adDC3e2L.hashCode() * 31);
    }

    @Override // defpackage.nl1
    public final long oh6vYeIP(defpackage.i5 i5Var, defpackage.i5 i5Var2, defpackage.i5 i5Var3) {
        return this.adDC3e2L.oh6vYeIP(i5Var, i5Var2, i5Var3) + this.xiZrDbcSW0;
    }
}
