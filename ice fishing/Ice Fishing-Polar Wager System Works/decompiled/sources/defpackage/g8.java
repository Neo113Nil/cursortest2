package defpackage;

/* loaded from: classes.dex */
final class g8 extends defpackage.qj0 {
    public final defpackage.g00 IHQe1A4L2xu;

    public g8(defpackage.g00 g00Var) {
        this.IHQe1A4L2xu = g00Var;
    }

    @Override // defpackage.qj0
    public final defpackage.lj0 F7NU4MC0GW() {
        defpackage.h8 h8Var = new defpackage.h8();
        h8Var.EgCjBq0SZwJ = this.IHQe1A4L2xu;
        return h8Var;
    }

    @Override // defpackage.qj0
    public final void adDC3e2L(defpackage.lj0 lj0Var) {
        defpackage.ip0 ip0Var;
        defpackage.h8 h8Var = (defpackage.h8) lj0Var;
        defpackage.g00 g00Var = this.IHQe1A4L2xu;
        h8Var.EgCjBq0SZwJ = g00Var;
        if (h8Var.adDC3e2L.kd6TUFXn && (ip0Var = defpackage.w70.nBH8hAHy(h8Var, 2).fnWB2E7cs) != null) {
            ip0Var.bDeDBuv6ooq(g00Var, true);
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.g8) {
            return this.IHQe1A4L2xu == ((defpackage.g8) obj).IHQe1A4L2xu;
        }
        return false;
    }

    public final int hashCode() {
        return this.IHQe1A4L2xu.hashCode();
    }
}
