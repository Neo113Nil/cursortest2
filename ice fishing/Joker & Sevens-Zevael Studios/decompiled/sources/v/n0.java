package v;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class n0 {

    /* renamed from: a, reason: collision with root package name */
    public float f6897a;

    /* renamed from: b, reason: collision with root package name */
    public double f6898b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f6899c;

    /* renamed from: d, reason: collision with root package name */
    public double f6900d;

    /* renamed from: e, reason: collision with root package name */
    public double f6901e;

    /* renamed from: f, reason: collision with root package name */
    public double f6902f;

    /* renamed from: g, reason: collision with root package name */
    public float f6903g;

    public final long a(float f10, float f11, long j3) {
        double cos;
        double d10;
        if (!this.f6899c) {
            if (this.f6897a == Float.MAX_VALUE) {
                throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
            }
            float f12 = this.f6903g;
            double d11 = f12;
            double d12 = d11 * d11;
            if (f12 > 1.0f) {
                double d13 = this.f6898b;
                double d14 = d12 - 1;
                this.f6900d = (Math.sqrt(d14) * d13) + ((-f12) * d13);
                double d15 = -this.f6903g;
                double d16 = this.f6898b;
                this.f6901e = (d15 * d16) - (Math.sqrt(d14) * d16);
            } else if (f12 >= 0.0f && f12 < 1.0f) {
                this.f6902f = Math.sqrt(1 - d12) * this.f6898b;
            }
            this.f6899c = true;
        }
        float f13 = f10 - this.f6897a;
        double d17 = j3 / 1000.0d;
        float f14 = this.f6903g;
        if (f14 > 1.0f) {
            double d18 = f13;
            double d19 = this.f6901e;
            double d20 = ((d19 * d18) - f11) / (d19 - this.f6900d);
            double d21 = d18 - d20;
            d10 = (Math.exp(this.f6900d * d17) * d20) + (Math.exp(d19 * d17) * d21);
            double d22 = this.f6901e;
            double exp = Math.exp(d22 * d17) * d21 * d22;
            double d23 = this.f6900d;
            cos = (Math.exp(d23 * d17) * d20 * d23) + exp;
        } else if (f14 == 1.0f) {
            double d24 = this.f6898b;
            double d25 = f13;
            double d26 = (d24 * d25) + f11;
            double d27 = (d26 * d17) + d25;
            d10 = Math.exp((-d24) * d17) * d27;
            double exp2 = Math.exp((-this.f6898b) * d17) * d27;
            double d28 = -this.f6898b;
            cos = (exp2 * d28) + (Math.exp(d28 * d17) * d26);
        } else {
            double d29 = 1 / this.f6902f;
            double d30 = this.f6898b;
            double d31 = f13;
            double d32 = ((f14 * d30 * d31) + f11) * d29;
            double exp3 = Math.exp((-f14) * d30 * d17) * ((Math.sin(this.f6902f * d17) * d32) + (Math.cos(this.f6902f * d17) * d31));
            double d33 = this.f6898b;
            double d34 = (-d33) * exp3 * this.f6903g;
            double exp4 = Math.exp((-r7) * d33 * d17);
            double d35 = this.f6902f;
            double sin = Math.sin(d35 * d17) * (-d35) * d31;
            double d36 = this.f6902f;
            cos = (((Math.cos(d36 * d17) * d32 * d36) + sin) * exp4) + d34;
            d10 = exp3;
        }
        return (Float.floatToRawIntBits((float) (d10 + this.f6897a)) << 32) | (Float.floatToRawIntBits((float) cos) & 4294967295L);
    }
}
