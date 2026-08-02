package defpackage;

/* loaded from: classes5.dex */
public final class eq4 implements gq4 {
    public final double a;
    public final double b;

    public eq4(double d, double d2) {
        this.a = d;
        this.b = d2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.gq4
    public final boolean a(Comparable comparable, Comparable comparable2) {
        return ((Number) comparable).doubleValue() <= ((Number) comparable2).doubleValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean b(Comparable comparable) {
        double doubleValue = ((Number) comparable).doubleValue();
        return doubleValue >= this.a && doubleValue <= this.b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof eq4)) {
            return false;
        }
        if (isEmpty() && ((eq4) obj).isEmpty()) {
            return true;
        }
        eq4 eq4Var = (eq4) obj;
        return this.a == eq4Var.a && this.b == eq4Var.b;
    }

    @Override // defpackage.hq4
    public final Comparable g() {
        return Double.valueOf(this.a);
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return Double.hashCode(this.b) + (Double.hashCode(this.a) * 31);
    }

    @Override // defpackage.hq4
    public final boolean isEmpty() {
        return this.a > this.b;
    }

    @Override // defpackage.hq4
    public final Comparable m() {
        return Double.valueOf(this.b);
    }

    public final String toString() {
        return this.a + ".." + this.b;
    }
}
