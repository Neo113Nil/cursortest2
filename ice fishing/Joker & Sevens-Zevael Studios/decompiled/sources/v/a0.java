package v;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a0 implements y {

    /* renamed from: a, reason: collision with root package name */
    public final int f6765a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6766b;

    /* renamed from: c, reason: collision with root package name */
    public final v f6767c;

    /* renamed from: d, reason: collision with root package name */
    public final long f6768d;

    /* renamed from: e, reason: collision with root package name */
    public final long f6769e;

    public a0(int i10, int i11, v vVar) {
        this.f6765a = i10;
        this.f6766b = i11;
        this.f6767c = vVar;
        this.f6768d = i10 * 1000000;
        this.f6769e = i11 * 1000000;
    }

    @Override // v.y
    public final float b(long j3, float f10, float f11, float f12) {
        float i10 = this.f6765a == 0 ? 1.0f : uc.e.i(j3 - this.f6769e, 0L, this.f6768d) / this.f6768d;
        if (i10 < 0.0f) {
            i10 = 0.0f;
        }
        float a6 = this.f6767c.a(i10 <= 1.0f ? i10 : 1.0f);
        x4.s sVar = i1.f6863a;
        return (f11 * a6) + ((1 - a6) * f10);
    }

    @Override // v.y
    public final float c(long j3, float f10, float f11, float f12) {
        long i10 = uc.e.i(j3 - this.f6769e, 0L, this.f6768d);
        if (i10 < 0) {
            return 0.0f;
        }
        if (i10 == 0) {
            return f12;
        }
        return (b(i10, f10, f11, f12) - b(i10 - 1000000, f10, f11, f12)) * 1000.0f;
    }

    @Override // v.y
    public final long d(float f10, float f11, float f12) {
        return (this.f6766b + this.f6765a) * 1000000;
    }
}
