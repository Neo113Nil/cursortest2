package defpackage;

/* loaded from: classes.dex */
public final class yz0 implements xic {
    public float a;
    public float b;

    public yz0(float f, float f2) {
        this.a = Math.max(1.0E-7f, Math.abs(f2));
        this.b = Math.max(1.0E-4f, f) * (-4.2f);
    }

    @Override // defpackage.xic
    public float D() {
        return this.a;
    }

    @Override // defpackage.xic
    public long F(float f) {
        return ((long) ((((float) Math.log(this.a / Math.abs(f))) * 1000.0f) / this.b)) * 1000000;
    }

    @Override // defpackage.xic
    public float I(float f, float f2) {
        if (Math.abs(f2) <= this.a) {
            return f;
        }
        double log = Math.log(Math.abs(r1 / f2));
        float f3 = this.b;
        return ((f2 / f3) * ((float) Math.exp((f3 * ((log / f3) * 1000)) / 1000.0f))) + (f - (f2 / f3));
    }

    public mic a(float f) {
        double b = b(f);
        double d = nic.a;
        double d2 = d - 1.0d;
        return new mic(f, (float) (Math.exp((d / d2) * b) * this.a * this.b), (long) (Math.exp(b / d2) * 1000.0d));
    }

    public double b(float f) {
        float[] fArr = ug0.a;
        return Math.log((Math.abs(f) * 0.35f) / (this.a * this.b));
    }

    @Override // defpackage.xic
    public float l(float f, long j) {
        return f * ((float) Math.exp(((j / 1000000) / 1000.0f) * this.b));
    }

    @Override // defpackage.xic
    public float o(float f, float f2, long j) {
        float f3 = this.b;
        return ((f2 / f3) * ((float) Math.exp((f3 * (j / 1000000)) / 1000.0f))) + (f - (f2 / f3));
    }

    public yz0() {
    }
}
