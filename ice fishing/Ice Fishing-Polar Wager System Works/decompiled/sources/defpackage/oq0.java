package defpackage;

/* loaded from: classes.dex */
public final class oq0 extends defpackage.c80 {
    public final defpackage.ud0 F7NU4MC0GW;
    public final defpackage.p7 r1MBDhnF;

    public oq0(defpackage.p7 p7Var, defpackage.ud0 ud0Var) {
        p7Var.getClass();
        this.r1MBDhnF = p7Var;
        this.F7NU4MC0GW = ud0Var;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.oq0)) {
            return false;
        }
        defpackage.oq0 oq0Var = (defpackage.oq0) obj;
        return defpackage.x70.QoRHpC4k(this.r1MBDhnF, oq0Var.r1MBDhnF) && defpackage.x70.QoRHpC4k(this.F7NU4MC0GW, oq0Var.F7NU4MC0GW);
    }

    public final int hashCode() {
        int hashCode = this.r1MBDhnF.hashCode() * 31;
        defpackage.ud0 ud0Var = this.F7NU4MC0GW;
        return hashCode + (ud0Var == null ? 0 : ud0Var.hashCode());
    }

    public final java.lang.String toString() {
        return "OnBackPressedCallbackInfo(callback=" + this.r1MBDhnF + ", owner=" + this.F7NU4MC0GW + ')';
    }
}
