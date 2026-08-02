package U;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public int f3218a;

    /* renamed from: b, reason: collision with root package name */
    public int f3219b;

    /* renamed from: c, reason: collision with root package name */
    public float f3220c;

    /* renamed from: d, reason: collision with root package name */
    public float f3221d;

    /* renamed from: e, reason: collision with root package name */
    public long f3222e;

    /* renamed from: f, reason: collision with root package name */
    public long f3223f;

    /* renamed from: g, reason: collision with root package name */
    public long f3224g;

    /* renamed from: h, reason: collision with root package name */
    public float f3225h;
    public int i;

    public final float a(long j6) {
        if (j6 < this.f3222e) {
            return 0.0f;
        }
        long j9 = this.f3224g;
        if (j9 < 0 || j6 < j9) {
            return g.b((j6 - r0) / this.f3218a, 0.0f, 1.0f) * 0.5f;
        }
        float f2 = this.f3225h;
        return (g.b((j6 - j9) / this.i, 0.0f, 1.0f) * f2) + (1.0f - f2);
    }
}
