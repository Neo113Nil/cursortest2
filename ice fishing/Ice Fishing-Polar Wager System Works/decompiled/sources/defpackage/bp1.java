package defpackage;

/* loaded from: classes.dex */
public final class bp1 {
    public final defpackage.t8 IHQe1A4L2xu;
    public final float oh6vYeIP;

    public bp1(android.graphics.Rect rect, float f) {
        this.IHQe1A4L2xu = new defpackage.t8(rect);
        this.oh6vYeIP = f;
    }

    public final android.graphics.Rect IHQe1A4L2xu() {
        defpackage.t8 t8Var = this.IHQe1A4L2xu;
        t8Var.getClass();
        return new android.graphics.Rect(t8Var.IHQe1A4L2xu, t8Var.oh6vYeIP, t8Var.r1MBDhnF, t8Var.F7NU4MC0GW);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!defpackage.bp1.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        defpackage.bp1 bp1Var = (defpackage.bp1) obj;
        return defpackage.x70.QoRHpC4k(this.IHQe1A4L2xu, bp1Var.IHQe1A4L2xu) && this.oh6vYeIP == bp1Var.oh6vYeIP;
    }

    public final int hashCode() {
        return java.lang.Float.hashCode(this.oh6vYeIP) + (this.IHQe1A4L2xu.hashCode() * 31);
    }

    public final java.lang.String toString() {
        return "WindowMetrics(_bounds=" + this.IHQe1A4L2xu + ", density=" + this.oh6vYeIP + ')';
    }

    public bp1(defpackage.t8 t8Var, float f) {
        this.IHQe1A4L2xu = t8Var;
        this.oh6vYeIP = f;
    }
}
