package x;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class f implements d {

    /* renamed from: b, reason: collision with root package name */
    public final v.h1 f7778b = v.d.j(125, 2, new v.r(0.25f, 0.1f, 0.25f));

    @Override // x.d
    public final float a(float f10, float f11, float f12) {
        float abs = Math.abs((f11 + f10) - f10);
        float f13 = (0.3f * f12) - (0.0f * abs);
        float f14 = f12 - f13;
        if ((abs <= f12) && f14 < abs) {
            f13 = f12 - abs;
        }
        return f10 - f13;
    }

    @Override // x.d
    public final v.h b() {
        return this.f7778b;
    }
}
