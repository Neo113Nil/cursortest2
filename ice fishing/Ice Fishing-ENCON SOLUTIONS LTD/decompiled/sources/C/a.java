package C;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public int f93a;

    /* renamed from: b, reason: collision with root package name */
    public int f94b;

    /* renamed from: c, reason: collision with root package name */
    public float f95c;

    /* renamed from: d, reason: collision with root package name */
    public float f96d;

    /* renamed from: e, reason: collision with root package name */
    public long f97e;

    /* renamed from: f, reason: collision with root package name */
    public long f98f;

    /* renamed from: g, reason: collision with root package name */
    public long f99g;

    /* renamed from: h, reason: collision with root package name */
    public float f100h;

    /* renamed from: i, reason: collision with root package name */
    public int f101i;

    public final float a(long j2) {
        if (j2 < this.f97e) {
            return 0.0f;
        }
        long j3 = this.f99g;
        if (j3 < 0 || j2 < j3) {
            return g.b((j2 - r0) / this.f93a, 0.0f, 1.0f) * 0.5f;
        }
        float f2 = this.f100h;
        return (g.b((j2 - j3) / this.f101i, 0.0f, 1.0f) * f2) + (1.0f - f2);
    }
}
