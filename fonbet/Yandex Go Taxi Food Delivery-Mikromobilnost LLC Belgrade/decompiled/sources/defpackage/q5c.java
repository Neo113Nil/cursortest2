package defpackage;

/* loaded from: classes9.dex */
public final class q5c implements s5c {
    public final double a;
    public final double b;

    public q5c(double d, double d2) {
        this.a = d;
        this.b = d2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.s5c
    public final boolean a(Comparable comparable, Comparable comparable2) {
        return ((Number) comparable).doubleValue() <= ((Number) comparable2).doubleValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.a6c
    public final boolean b(Comparable comparable) {
        double doubleValue = ((Number) comparable).doubleValue();
        return doubleValue >= this.a && doubleValue <= this.b;
    }

    @Override // defpackage.a6c
    public final Comparable d() {
        return Double.valueOf(this.b);
    }

    @Override // defpackage.a6c
    public final Comparable e() {
        return Double.valueOf(this.a);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof q5c)) {
            return false;
        }
        if (isEmpty() && ((q5c) obj).isEmpty()) {
            return true;
        }
        q5c q5cVar = (q5c) obj;
        return this.a == q5cVar.a && this.b == q5cVar.b;
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return Double.hashCode(this.b) + (Double.hashCode(this.a) * 31);
    }

    @Override // defpackage.a6c
    public final boolean isEmpty() {
        return this.a > this.b;
    }

    public final String toString() {
        return this.a + ".." + this.b;
    }
}
