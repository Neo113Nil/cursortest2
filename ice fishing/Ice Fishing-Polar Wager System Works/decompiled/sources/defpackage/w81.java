package defpackage;

/* loaded from: classes.dex */
public final class w81 {
    public final boolean F7NU4MC0GW;
    public final boolean IHQe1A4L2xu;
    public final boolean adDC3e2L;
    public final boolean oh6vYeIP;
    public final defpackage.jg1 r1MBDhnF;

    public w81(boolean z, boolean z2, defpackage.jg1 jg1Var, boolean z3, boolean z4) {
        this.IHQe1A4L2xu = z;
        this.oh6vYeIP = z2;
        this.r1MBDhnF = jg1Var;
        this.F7NU4MC0GW = z3;
        this.adDC3e2L = z4;
    }

    public static defpackage.w81 IHQe1A4L2xu(defpackage.w81 w81Var, boolean z, boolean z2, defpackage.jg1 jg1Var, boolean z3, boolean z4, int i) {
        if ((i & 1) != 0) {
            z = w81Var.IHQe1A4L2xu;
        }
        boolean z5 = z;
        if ((i & 2) != 0) {
            z2 = w81Var.oh6vYeIP;
        }
        boolean z6 = z2;
        if ((i & 4) != 0) {
            jg1Var = w81Var.r1MBDhnF;
        }
        defpackage.jg1 jg1Var2 = jg1Var;
        if ((i & 8) != 0) {
            z3 = w81Var.F7NU4MC0GW;
        }
        boolean z7 = z3;
        if ((i & 16) != 0) {
            z4 = w81Var.adDC3e2L;
        }
        w81Var.getClass();
        jg1Var2.getClass();
        return new defpackage.w81(z5, z6, jg1Var2, z7, z4);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.w81)) {
            return false;
        }
        defpackage.w81 w81Var = (defpackage.w81) obj;
        return this.IHQe1A4L2xu == w81Var.IHQe1A4L2xu && this.oh6vYeIP == w81Var.oh6vYeIP && this.r1MBDhnF == w81Var.r1MBDhnF && this.F7NU4MC0GW == w81Var.F7NU4MC0GW && this.adDC3e2L == w81Var.adDC3e2L;
    }

    public final int hashCode() {
        return java.lang.Boolean.hashCode(this.adDC3e2L) + defpackage.fx0.adDC3e2L((this.r1MBDhnF.hashCode() + defpackage.fx0.adDC3e2L(java.lang.Boolean.hashCode(this.IHQe1A4L2xu) * 31, 31, this.oh6vYeIP)) * 31, 31, this.F7NU4MC0GW);
    }

    public final java.lang.String toString() {
        return "SettingsUiState(soundEnabled=" + this.IHQe1A4L2xu + ", vibrationEnabled=" + this.oh6vYeIP + ", themeMode=" + this.r1MBDhnF + ", showResetConfirm=" + this.F7NU4MC0GW + ", isBusy=" + this.adDC3e2L + ")";
    }
}
