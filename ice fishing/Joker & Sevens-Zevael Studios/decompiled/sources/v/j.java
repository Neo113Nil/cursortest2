package v;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class j extends n {

    /* renamed from: a, reason: collision with root package name */
    public float f6872a;

    public j(float f10) {
        this.f6872a = f10;
    }

    @Override // v.n
    public final float a(int i10) {
        if (i10 == 0) {
            return this.f6872a;
        }
        return 0.0f;
    }

    @Override // v.n
    public final int b() {
        return 1;
    }

    @Override // v.n
    public final n c() {
        return new j(0.0f);
    }

    @Override // v.n
    public final void d() {
        this.f6872a = 0.0f;
    }

    @Override // v.n
    public final void e(int i10, float f10) {
        if (i10 == 0) {
            this.f6872a = f10;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof j) && ((j) obj).f6872a == this.f6872a;
    }

    public final int hashCode() {
        return Float.hashCode(this.f6872a);
    }

    public final String toString() {
        return "AnimationVector1D: value = " + this.f6872a;
    }
}
