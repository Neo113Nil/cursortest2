package v;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public double f6944a;

    /* renamed from: b, reason: collision with root package name */
    public double f6945b;

    public q(double d10, double d11) {
        this.f6944a = d10;
        this.f6945b = d11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return Double.compare(this.f6944a, qVar.f6944a) == 0 && Double.compare(this.f6945b, qVar.f6945b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f6945b) + (Double.hashCode(this.f6944a) * 31);
    }

    public final String toString() {
        return "ComplexDouble(_real=" + this.f6944a + ", _imaginary=" + this.f6945b + ')';
    }
}
