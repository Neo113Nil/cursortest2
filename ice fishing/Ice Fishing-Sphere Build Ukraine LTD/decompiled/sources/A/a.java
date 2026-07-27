package A;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public int f0a;

    /* renamed from: b, reason: collision with root package name */
    public int f1b;

    /* renamed from: c, reason: collision with root package name */
    public float f2c;

    /* renamed from: d, reason: collision with root package name */
    public float f3d;

    /* renamed from: e, reason: collision with root package name */
    public long f4e;

    /* renamed from: f, reason: collision with root package name */
    public long f5f;

    /* renamed from: g, reason: collision with root package name */
    public long f6g;

    /* renamed from: h, reason: collision with root package name */
    public float f7h;

    /* renamed from: i, reason: collision with root package name */
    public int f8i;

    public final float a(long j2) {
        if (j2 < this.f4e) {
            return 0.0f;
        }
        long j3 = this.f6g;
        if (j3 < 0 || j2 < j3) {
            return g.b((j2 - r0) / this.f0a, 0.0f, 1.0f) * 0.5f;
        }
        float f2 = this.f7h;
        return (g.b((j2 - j3) / this.f8i, 0.0f, 1.0f) * f2) + (1.0f - f2);
    }
}
