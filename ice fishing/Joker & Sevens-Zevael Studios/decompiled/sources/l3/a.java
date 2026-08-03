package l3;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public int f4122a;

    /* renamed from: b, reason: collision with root package name */
    public int f4123b;

    /* renamed from: c, reason: collision with root package name */
    public float f4124c;

    /* renamed from: d, reason: collision with root package name */
    public float f4125d;

    /* renamed from: e, reason: collision with root package name */
    public long f4126e;

    /* renamed from: f, reason: collision with root package name */
    public long f4127f;

    /* renamed from: g, reason: collision with root package name */
    public long f4128g;

    /* renamed from: h, reason: collision with root package name */
    public float f4129h;

    /* renamed from: i, reason: collision with root package name */
    public int f4130i;

    public final float a(long j3) {
        if (j3 < this.f4126e) {
            return 0.0f;
        }
        long j6 = this.f4128g;
        if (j6 < 0 || j3 < j6) {
            return e.b((j3 - r0) / this.f4122a, 0.0f, 1.0f) * 0.5f;
        }
        float f10 = this.f4129h;
        return (e.b((j3 - j6) / this.f4130i, 0.0f, 1.0f) * f10) + (1.0f - f10);
    }
}
