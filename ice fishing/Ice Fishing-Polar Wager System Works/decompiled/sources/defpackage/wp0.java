package defpackage;

/* loaded from: classes.dex */
public final class wp0 {
    public final int IHQe1A4L2xu;
    public final java.lang.Integer oh6vYeIP;

    public wp0(int i, java.lang.Integer num) {
        this.IHQe1A4L2xu = i;
        this.oh6vYeIP = num;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.wp0)) {
            return false;
        }
        defpackage.wp0 wp0Var = (defpackage.wp0) obj;
        return this.IHQe1A4L2xu == wp0Var.IHQe1A4L2xu && defpackage.x70.QoRHpC4k(this.oh6vYeIP, wp0Var.oh6vYeIP);
    }

    public final int hashCode() {
        int hashCode = java.lang.Integer.hashCode(this.IHQe1A4L2xu) * 31;
        java.lang.Integer num = this.oh6vYeIP;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final java.lang.String toString() {
        return "ObjectLocation(group=" + this.IHQe1A4L2xu + ", dataOffset=" + this.oh6vYeIP + ')';
    }
}
