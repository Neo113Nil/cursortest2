package defpackage;

/* loaded from: classes.dex */
public final class s8 {
    public final float IHQe1A4L2xu;
    public final defpackage.kb1 oh6vYeIP;

    public s8(float f, defpackage.kb1 kb1Var) {
        this.IHQe1A4L2xu = f;
        this.oh6vYeIP = kb1Var;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.s8)) {
            return false;
        }
        defpackage.s8 s8Var = (defpackage.s8) obj;
        return defpackage.uq.oh6vYeIP(this.IHQe1A4L2xu, s8Var.IHQe1A4L2xu) && this.oh6vYeIP.equals(s8Var.oh6vYeIP);
    }

    public final int hashCode() {
        return this.oh6vYeIP.hashCode() + (java.lang.Float.hashCode(this.IHQe1A4L2xu) * 31);
    }

    public final java.lang.String toString() {
        return "BorderStroke(width=" + ((java.lang.Object) defpackage.uq.r1MBDhnF(this.IHQe1A4L2xu)) + ", brush=" + this.oh6vYeIP + ')';
    }
}
