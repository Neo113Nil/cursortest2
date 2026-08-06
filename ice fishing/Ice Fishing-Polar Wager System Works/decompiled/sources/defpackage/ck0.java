package defpackage;

/* loaded from: classes.dex */
public final class ck0 {
    public final long IHQe1A4L2xu;
    public final long oh6vYeIP;
    public final boolean r1MBDhnF;

    public ck0(long j, long j2, boolean z) {
        this.IHQe1A4L2xu = j;
        this.oh6vYeIP = j2;
        this.r1MBDhnF = z;
    }

    public final defpackage.ck0 IHQe1A4L2xu(defpackage.ck0 ck0Var) {
        return new defpackage.ck0(defpackage.gq0.adDC3e2L(this.IHQe1A4L2xu, ck0Var.IHQe1A4L2xu), java.lang.Math.max(this.oh6vYeIP, ck0Var.oh6vYeIP), this.r1MBDhnF);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.ck0)) {
            return false;
        }
        defpackage.ck0 ck0Var = (defpackage.ck0) obj;
        return defpackage.gq0.oh6vYeIP(this.IHQe1A4L2xu, ck0Var.IHQe1A4L2xu) && this.oh6vYeIP == ck0Var.oh6vYeIP && this.r1MBDhnF == ck0Var.r1MBDhnF;
    }

    public final int hashCode() {
        return java.lang.Boolean.hashCode(this.r1MBDhnF) + defpackage.fx0.r1MBDhnF(java.lang.Long.hashCode(this.IHQe1A4L2xu) * 31, 31, this.oh6vYeIP);
    }

    public final java.lang.String toString() {
        return "MouseWheelScrollDelta(value=" + ((java.lang.Object) defpackage.gq0.AARZUJiTa(this.IHQe1A4L2xu)) + ", timeMillis=" + this.oh6vYeIP + ", shouldApplyImmediately=" + this.r1MBDhnF + ')';
    }
}
