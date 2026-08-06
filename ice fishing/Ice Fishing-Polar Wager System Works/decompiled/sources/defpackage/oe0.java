package defpackage;

/* loaded from: classes.dex */
public final class oe0 extends defpackage.qe0 {
    public final java.lang.String IHQe1A4L2xu;
    public final defpackage.tf1 oh6vYeIP;

    public oe0(java.lang.String str, defpackage.tf1 tf1Var) {
        this.IHQe1A4L2xu = str;
        this.oh6vYeIP = tf1Var;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.oe0)) {
            return false;
        }
        defpackage.oe0 oe0Var = (defpackage.oe0) obj;
        return this.IHQe1A4L2xu.equals(oe0Var.IHQe1A4L2xu) && defpackage.x70.QoRHpC4k(this.oh6vYeIP, oe0Var.oh6vYeIP);
    }

    public final int hashCode() {
        int hashCode = this.IHQe1A4L2xu.hashCode() * 31;
        defpackage.tf1 tf1Var = this.oh6vYeIP;
        return (hashCode + (tf1Var != null ? tf1Var.hashCode() : 0)) * 31;
    }

    public final java.lang.String toString() {
        return "LinkAnnotation.Clickable(tag=" + this.IHQe1A4L2xu + ')';
    }
}
