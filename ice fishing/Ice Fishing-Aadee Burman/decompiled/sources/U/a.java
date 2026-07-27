package U;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public int f3101a;

    /* renamed from: b, reason: collision with root package name */
    public int f3102b;

    /* renamed from: c, reason: collision with root package name */
    public float f3103c;

    /* renamed from: d, reason: collision with root package name */
    public float f3104d;

    /* renamed from: e, reason: collision with root package name */
    public long f3105e;

    /* renamed from: f, reason: collision with root package name */
    public long f3106f;

    /* renamed from: g, reason: collision with root package name */
    public long f3107g;

    /* renamed from: h, reason: collision with root package name */
    public float f3108h;
    public int i;

    public final float a(long j6) {
        if (j6 < this.f3105e) {
            return 0.0f;
        }
        long j9 = this.f3107g;
        if (j9 < 0 || j6 < j9) {
            return g.b((j6 - r0) / this.f3101a, 0.0f, 1.0f) * 0.5f;
        }
        float f3 = this.f3108h;
        return (g.b((j6 - j9) / this.i, 0.0f, 1.0f) * f3) + (1.0f - f3);
    }
}
