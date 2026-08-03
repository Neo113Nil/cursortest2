package g1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final double f2495a;

    /* renamed from: b, reason: collision with root package name */
    public final double f2496b;

    /* renamed from: c, reason: collision with root package name */
    public final double f2497c;

    /* renamed from: d, reason: collision with root package name */
    public final double f2498d;

    /* renamed from: e, reason: collision with root package name */
    public final double f2499e;

    /* renamed from: f, reason: collision with root package name */
    public final double f2500f;

    /* renamed from: g, reason: collision with root package name */
    public final double f2501g;

    public /* synthetic */ r(double d10, double d11, double d12, double d13, double d14) {
        this(d10, d11, d12, d13, d14, 0.0d, 0.0d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return Double.compare(this.f2495a, rVar.f2495a) == 0 && Double.compare(this.f2496b, rVar.f2496b) == 0 && Double.compare(this.f2497c, rVar.f2497c) == 0 && Double.compare(this.f2498d, rVar.f2498d) == 0 && Double.compare(this.f2499e, rVar.f2499e) == 0 && Double.compare(this.f2500f, rVar.f2500f) == 0 && Double.compare(this.f2501g, rVar.f2501g) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f2501g) + ((Double.hashCode(this.f2500f) + ((Double.hashCode(this.f2499e) + ((Double.hashCode(this.f2498d) + ((Double.hashCode(this.f2497c) + ((Double.hashCode(this.f2496b) + (Double.hashCode(this.f2495a) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "TransferParameters(gamma=" + this.f2495a + ", a=" + this.f2496b + ", b=" + this.f2497c + ", c=" + this.f2498d + ", d=" + this.f2499e + ", e=" + this.f2500f + ", f=" + this.f2501g + ')';
    }

    public r(double d10, double d11, double d12, double d13, double d14, double d15, double d16) {
        this.f2495a = d10;
        this.f2496b = d11;
        this.f2497c = d12;
        this.f2498d = d13;
        this.f2499e = d14;
        this.f2500f = d15;
        this.f2501g = d16;
        if (Double.isNaN(d11) || Double.isNaN(d12) || Double.isNaN(d13) || Double.isNaN(d14) || Double.isNaN(d15) || Double.isNaN(d16) || Double.isNaN(d10)) {
            throw new IllegalArgumentException("Parameters cannot be NaN");
        }
        if (d10 == -2.0d || d10 == -3.0d) {
            return;
        }
        if (d14 < 0.0d || d14 > 1.0d) {
            throw new IllegalArgumentException("Parameter d must be in the range [0..1], was " + d14);
        }
        if (d14 == 0.0d && (d11 == 0.0d || d10 == 0.0d)) {
            throw new IllegalArgumentException("Parameter a or g is zero, the transfer function is constant");
        }
        if (d14 >= 1.0d && d13 == 0.0d) {
            throw new IllegalArgumentException("Parameter c is zero, the transfer function is constant");
        }
        if ((d11 == 0.0d || d10 == 0.0d) && d13 == 0.0d) {
            throw new IllegalArgumentException("Parameter a or g is zero, and c is zero, the transfer function is constant");
        }
        if (d13 < 0.0d) {
            throw new IllegalArgumentException("The transfer function must be increasing");
        }
        if (d11 < 0.0d || d10 < 0.0d) {
            throw new IllegalArgumentException("The transfer function must be positive or increasing");
        }
    }
}
