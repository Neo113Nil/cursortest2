package u;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    public final float f6609a;

    /* renamed from: b, reason: collision with root package name */
    public final float f6610b;

    public j0(float f10, s2.c cVar) {
        this.f6609a = f10;
        float c3 = cVar.c();
        float f11 = k0.f6613a;
        this.f6610b = c3 * 386.0878f * 160.0f * 0.84f;
    }

    public final i0 a(float f10) {
        double b2 = b(f10);
        double d10 = k0.f6613a;
        double d11 = d10 - 1.0d;
        return new i0(f10, (float) (Math.exp((d10 / d11) * b2) * this.f6609a * this.f6610b), (long) (Math.exp(b2 / d11) * 1000.0d));
    }

    public final double b(float f10) {
        float[] fArr = b.f6565a;
        return Math.log((Math.abs(f10) * 0.35f) / (this.f6609a * this.f6610b));
    }
}
