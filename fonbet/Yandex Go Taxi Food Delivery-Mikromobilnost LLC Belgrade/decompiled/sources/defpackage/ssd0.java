package defpackage;

/* loaded from: classes5.dex */
public final class ssd0 {
    public final double a;
    public final double b;

    public ssd0(double d, double d2) {
        this.a = d;
        this.b = d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!ssd0.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        ssd0 ssd0Var = (ssd0) obj;
        return this.a == ssd0Var.a && this.b == ssd0Var.b;
    }

    public final int hashCode() {
        return Double.hashCode(this.b) + (Double.hashCode(this.a) * 31);
    }
}
