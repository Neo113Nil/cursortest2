package defpackage;

/* loaded from: classes.dex */
public final class ib0 {
    public final int IHQe1A4L2xu;
    public final int oh6vYeIP;

    public ib0(int i, int i2) {
        this.IHQe1A4L2xu = i;
        this.oh6vYeIP = i2;
        if (!(i >= 0)) {
            defpackage.a60.IHQe1A4L2xu("negative start index");
        }
        if (i2 >= i) {
            return;
        }
        defpackage.a60.IHQe1A4L2xu("end index greater than start");
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.ib0)) {
            return false;
        }
        defpackage.ib0 ib0Var = (defpackage.ib0) obj;
        return this.IHQe1A4L2xu == ib0Var.IHQe1A4L2xu && this.oh6vYeIP == ib0Var.oh6vYeIP;
    }

    public final int hashCode() {
        return java.lang.Integer.hashCode(this.oh6vYeIP) + (java.lang.Integer.hashCode(this.IHQe1A4L2xu) * 31);
    }

    public final java.lang.String toString() {
        return "Interval(start=" + this.IHQe1A4L2xu + ", end=" + this.oh6vYeIP + ')';
    }
}
