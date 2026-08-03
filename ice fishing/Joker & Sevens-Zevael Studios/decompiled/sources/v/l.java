package v;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class l extends n {

    /* renamed from: a, reason: collision with root package name */
    public float f6884a;

    /* renamed from: b, reason: collision with root package name */
    public float f6885b;

    /* renamed from: c, reason: collision with root package name */
    public float f6886c;

    public l(float f10, float f11, float f12) {
        this.f6884a = f10;
        this.f6885b = f11;
        this.f6886c = f12;
    }

    @Override // v.n
    public final float a(int i10) {
        if (i10 == 0) {
            return this.f6884a;
        }
        if (i10 == 1) {
            return this.f6885b;
        }
        if (i10 != 2) {
            return 0.0f;
        }
        return this.f6886c;
    }

    @Override // v.n
    public final int b() {
        return 3;
    }

    @Override // v.n
    public final n c() {
        return new l(0.0f, 0.0f, 0.0f);
    }

    @Override // v.n
    public final void d() {
        this.f6884a = 0.0f;
        this.f6885b = 0.0f;
        this.f6886c = 0.0f;
    }

    @Override // v.n
    public final void e(int i10, float f10) {
        if (i10 == 0) {
            this.f6884a = f10;
        } else if (i10 == 1) {
            this.f6885b = f10;
        } else {
            if (i10 != 2) {
                return;
            }
            this.f6886c = f10;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return lVar.f6884a == this.f6884a && lVar.f6885b == this.f6885b && lVar.f6886c == this.f6886c;
    }

    public final int hashCode() {
        return Float.hashCode(this.f6886c) + a4.d.b(this.f6885b, Float.hashCode(this.f6884a) * 31, 31);
    }

    public final String toString() {
        return "AnimationVector3D: v1 = " + this.f6884a + ", v2 = " + this.f6885b + ", v3 = " + this.f6886c;
    }
}
