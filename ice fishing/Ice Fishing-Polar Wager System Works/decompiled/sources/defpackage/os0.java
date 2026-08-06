package defpackage;

/* loaded from: classes.dex */
public final class os0 extends defpackage.e90 {
    public final defpackage.y2 F7NU4MC0GW;
    public final defpackage.x21 r1MBDhnF;

    public os0(defpackage.x21 x21Var) {
        defpackage.y2 y2Var;
        this.r1MBDhnF = x21Var;
        if (defpackage.c80.PAEGRtP0bX(x21Var)) {
            y2Var = null;
        } else {
            y2Var = defpackage.z2.IHQe1A4L2xu();
            defpackage.y2.IHQe1A4L2xu(y2Var, x21Var);
        }
        this.F7NU4MC0GW = y2Var;
    }

    @Override // defpackage.e90
    public final defpackage.kz0 QoRHpC4k() {
        defpackage.x21 x21Var = this.r1MBDhnF;
        return new defpackage.kz0(x21Var.IHQe1A4L2xu, x21Var.oh6vYeIP, x21Var.r1MBDhnF, x21Var.F7NU4MC0GW);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.os0) {
            return this.r1MBDhnF.equals(((defpackage.os0) obj).r1MBDhnF);
        }
        return false;
    }

    public final int hashCode() {
        return this.r1MBDhnF.hashCode();
    }
}
