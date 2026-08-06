package defpackage;

/* loaded from: classes.dex */
public final class c31 {
    public float IHQe1A4L2xu = 0.0f;
    public boolean oh6vYeIP = true;
    public defpackage.gk r1MBDhnF = null;

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.c31)) {
            return false;
        }
        defpackage.c31 c31Var = (defpackage.c31) obj;
        return java.lang.Float.compare(this.IHQe1A4L2xu, c31Var.IHQe1A4L2xu) == 0 && this.oh6vYeIP == c31Var.oh6vYeIP && defpackage.x70.QoRHpC4k(this.r1MBDhnF, c31Var.r1MBDhnF);
    }

    public final int hashCode() {
        int adDC3e2L = defpackage.fx0.adDC3e2L(java.lang.Float.hashCode(this.IHQe1A4L2xu) * 31, 31, this.oh6vYeIP);
        defpackage.gk gkVar = this.r1MBDhnF;
        return (adDC3e2L + (gkVar == null ? 0 : gkVar.hashCode())) * 31;
    }

    public final java.lang.String toString() {
        return "RowColumnParentData(weight=" + this.IHQe1A4L2xu + ", fill=" + this.oh6vYeIP + ", crossAxisAlignment=" + this.r1MBDhnF + ", flowLayoutData=null)";
    }
}
