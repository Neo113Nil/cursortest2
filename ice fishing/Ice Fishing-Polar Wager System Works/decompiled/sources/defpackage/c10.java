package defpackage;

/* loaded from: classes.dex */
public final class c10 {
    public final defpackage.n10 IHQe1A4L2xu;
    public final java.lang.Object oh6vYeIP;

    public c10(defpackage.n10 n10Var, java.lang.Object obj) {
        this.IHQe1A4L2xu = n10Var;
        this.oh6vYeIP = obj;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.c10)) {
            return false;
        }
        defpackage.c10 c10Var = (defpackage.c10) obj;
        return defpackage.x70.QoRHpC4k(this.IHQe1A4L2xu, c10Var.IHQe1A4L2xu) && defpackage.x70.QoRHpC4k(this.oh6vYeIP, c10Var.oh6vYeIP);
    }

    public final int hashCode() {
        defpackage.n10 n10Var = this.IHQe1A4L2xu;
        int hashCode = (n10Var == null ? 0 : n10Var.hashCode()) * 31;
        java.lang.Object obj = this.oh6vYeIP;
        return hashCode + (obj != null ? obj.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "Mutation(state=" + this.IHQe1A4L2xu + ", result=" + this.oh6vYeIP + ")";
    }
}
