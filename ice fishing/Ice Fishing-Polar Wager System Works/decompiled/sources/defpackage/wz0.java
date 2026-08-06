package defpackage;

/* loaded from: classes.dex */
public final class wz0 extends defpackage.e90 {
    public final int F7NU4MC0GW;
    public final defpackage.e90 r1MBDhnF;

    public wz0(defpackage.e90 e90Var, int i) {
        this.r1MBDhnF = e90Var;
        this.F7NU4MC0GW = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.wz0)) {
            return false;
        }
        defpackage.wz0 wz0Var = (defpackage.wz0) obj;
        return wz0Var.r1MBDhnF.equals(this.r1MBDhnF) && wz0Var.F7NU4MC0GW == this.F7NU4MC0GW;
    }

    public final int hashCode() {
        return this.r1MBDhnF.hashCode() + (this.F7NU4MC0GW * 31);
    }
}
