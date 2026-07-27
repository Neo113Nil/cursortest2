package U;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public int f3180a;

    /* renamed from: b, reason: collision with root package name */
    public int f3181b;

    /* renamed from: c, reason: collision with root package name */
    public float f3182c;

    /* renamed from: d, reason: collision with root package name */
    public float f3183d;

    /* renamed from: e, reason: collision with root package name */
    public long f3184e;

    /* renamed from: f, reason: collision with root package name */
    public long f3185f;

    /* renamed from: g, reason: collision with root package name */
    public long f3186g;

    /* renamed from: h, reason: collision with root package name */
    public float f3187h;
    public int i;

    public final float a(long j9) {
        if (j9 < this.f3184e) {
            return 0.0f;
        }
        long j10 = this.f3186g;
        if (j10 < 0 || j9 < j10) {
            return g.b((j9 - r0) / this.f3180a, 0.0f, 1.0f) * 0.5f;
        }
        float f6 = this.f3187h;
        return (g.b((j9 - j10) / this.i, 0.0f, 1.0f) * f6) + (1.0f - f6);
    }
}
