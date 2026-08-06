package defpackage;

/* loaded from: classes.dex */
public final class ub1 implements defpackage.tv {
    public final float IHQe1A4L2xu;
    public final float oh6vYeIP;
    public final java.lang.Object r1MBDhnF;

    public ub1(float f, float f2, java.lang.Object obj) {
        this.IHQe1A4L2xu = f;
        this.oh6vYeIP = f2;
        this.r1MBDhnF = obj;
    }

    @Override // defpackage.c5
    public final defpackage.nl1 IHQe1A4L2xu(defpackage.F7NU4MC0GW f7nu4mc0gw) {
        java.lang.Object obj = this.r1MBDhnF;
        return new defpackage.sa1(this.IHQe1A4L2xu, this.oh6vYeIP, obj == null ? null : (defpackage.i5) ((defpackage.g00) f7nu4mc0gw.xiZrDbcSW0).AARZUJiTa(obj));
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.ub1) {
            defpackage.ub1 ub1Var = (defpackage.ub1) obj;
            if (ub1Var.IHQe1A4L2xu == this.IHQe1A4L2xu && ub1Var.oh6vYeIP == this.oh6vYeIP && defpackage.x70.QoRHpC4k(ub1Var.r1MBDhnF, this.r1MBDhnF)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        java.lang.Object obj = this.r1MBDhnF;
        return java.lang.Float.hashCode(this.oh6vYeIP) + defpackage.fx0.IHQe1A4L2xu(this.IHQe1A4L2xu, (obj != null ? obj.hashCode() : 0) * 31, 31);
    }
}
