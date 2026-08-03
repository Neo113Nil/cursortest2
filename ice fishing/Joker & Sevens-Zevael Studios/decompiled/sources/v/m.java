package v;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class m extends n {

    /* renamed from: a, reason: collision with root package name */
    public float f6889a;

    /* renamed from: b, reason: collision with root package name */
    public float f6890b;

    /* renamed from: c, reason: collision with root package name */
    public float f6891c;

    /* renamed from: d, reason: collision with root package name */
    public float f6892d;

    public m(float f10, float f11, float f12, float f13) {
        this.f6889a = f10;
        this.f6890b = f11;
        this.f6891c = f12;
        this.f6892d = f13;
    }

    @Override // v.n
    public final float a(int i10) {
        if (i10 == 0) {
            return this.f6889a;
        }
        if (i10 == 1) {
            return this.f6890b;
        }
        if (i10 == 2) {
            return this.f6891c;
        }
        if (i10 != 3) {
            return 0.0f;
        }
        return this.f6892d;
    }

    @Override // v.n
    public final int b() {
        return 4;
    }

    @Override // v.n
    public final n c() {
        return new m(0.0f, 0.0f, 0.0f, 0.0f);
    }

    @Override // v.n
    public final void d() {
        this.f6889a = 0.0f;
        this.f6890b = 0.0f;
        this.f6891c = 0.0f;
        this.f6892d = 0.0f;
    }

    @Override // v.n
    public final void e(int i10, float f10) {
        if (i10 == 0) {
            this.f6889a = f10;
            return;
        }
        if (i10 == 1) {
            this.f6890b = f10;
        } else if (i10 == 2) {
            this.f6891c = f10;
        } else {
            if (i10 != 3) {
                return;
            }
            this.f6892d = f10;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return mVar.f6889a == this.f6889a && mVar.f6890b == this.f6890b && mVar.f6891c == this.f6891c && mVar.f6892d == this.f6892d;
    }

    public final int hashCode() {
        return Float.hashCode(this.f6892d) + a4.d.b(this.f6891c, a4.d.b(this.f6890b, Float.hashCode(this.f6889a) * 31, 31), 31);
    }

    public final String toString() {
        return "AnimationVector4D: v1 = " + this.f6889a + ", v2 = " + this.f6890b + ", v3 = " + this.f6891c + ", v4 = " + this.f6892d;
    }
}
