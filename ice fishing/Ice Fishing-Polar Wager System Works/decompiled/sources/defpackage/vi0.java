package defpackage;

/* loaded from: classes.dex */
public final class vi0 {
    public final boolean IHQe1A4L2xu;
    public final boolean oh6vYeIP;
    public final boolean r1MBDhnF;

    public vi0(boolean z, boolean z2, boolean z3) {
        this.IHQe1A4L2xu = z;
        this.oh6vYeIP = z2;
        this.r1MBDhnF = z3;
    }

    public static defpackage.vi0 IHQe1A4L2xu(defpackage.vi0 vi0Var, boolean z, boolean z2, boolean z3, int i) {
        if ((i & 1) != 0) {
            z = vi0Var.IHQe1A4L2xu;
        }
        if ((i & 2) != 0) {
            z2 = vi0Var.oh6vYeIP;
        }
        if ((i & 4) != 0) {
            z3 = vi0Var.r1MBDhnF;
        }
        vi0Var.getClass();
        return new defpackage.vi0(z, z2, z3);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.vi0)) {
            return false;
        }
        defpackage.vi0 vi0Var = (defpackage.vi0) obj;
        return this.IHQe1A4L2xu == vi0Var.IHQe1A4L2xu && this.oh6vYeIP == vi0Var.oh6vYeIP && this.r1MBDhnF == vi0Var.r1MBDhnF;
    }

    public final int hashCode() {
        return java.lang.Boolean.hashCode(this.r1MBDhnF) + defpackage.fx0.adDC3e2L(java.lang.Boolean.hashCode(this.IHQe1A4L2xu) * 31, 31, this.oh6vYeIP);
    }

    public final java.lang.String toString() {
        return "MenuUiState(hasProgress=" + this.IHQe1A4L2xu + ", showResetConfirm=" + this.oh6vYeIP + ", isBusy=" + this.r1MBDhnF + ")";
    }
}
