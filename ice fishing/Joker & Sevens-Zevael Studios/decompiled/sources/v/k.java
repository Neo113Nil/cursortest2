package v;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class k extends n {

    /* renamed from: a, reason: collision with root package name */
    public float f6874a;

    /* renamed from: b, reason: collision with root package name */
    public float f6875b;

    public k(float f10, float f11) {
        this.f6874a = f10;
        this.f6875b = f11;
    }

    @Override // v.n
    public final float a(int i10) {
        if (i10 == 0) {
            return this.f6874a;
        }
        if (i10 != 1) {
            return 0.0f;
        }
        return this.f6875b;
    }

    @Override // v.n
    public final int b() {
        return 2;
    }

    @Override // v.n
    public final n c() {
        return new k(0.0f, 0.0f);
    }

    @Override // v.n
    public final void d() {
        this.f6874a = 0.0f;
        this.f6875b = 0.0f;
    }

    @Override // v.n
    public final void e(int i10, float f10) {
        if (i10 == 0) {
            this.f6874a = f10;
        } else {
            if (i10 != 1) {
                return;
            }
            this.f6875b = f10;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return kVar.f6874a == this.f6874a && kVar.f6875b == this.f6875b;
    }

    public final int hashCode() {
        return Float.hashCode(this.f6875b) + (Float.hashCode(this.f6874a) * 31);
    }

    public final String toString() {
        return "AnimationVector2D: v1 = " + this.f6874a + ", v2 = " + this.f6875b;
    }
}
