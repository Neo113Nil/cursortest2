package z;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final float f8944a;

    /* renamed from: b, reason: collision with root package name */
    public final float f8945b;

    /* renamed from: c, reason: collision with root package name */
    public final float f8946c;

    /* renamed from: d, reason: collision with root package name */
    public final float f8947d;

    public c0(float f10, float f11, float f12, float f13) {
        this.f8944a = f10;
        this.f8945b = f11;
        this.f8946c = f12;
        this.f8947d = f13;
        if (f10 < 0.0f) {
            throw new IllegalArgumentException("Start padding must be non-negative");
        }
        if (f11 < 0.0f) {
            throw new IllegalArgumentException("Top padding must be non-negative");
        }
        if (f12 < 0.0f) {
            throw new IllegalArgumentException("End padding must be non-negative");
        }
        if (f13 < 0.0f) {
            throw new IllegalArgumentException("Bottom padding must be non-negative");
        }
    }

    public final float a(s2.l lVar) {
        return lVar == s2.l.f6396g ? this.f8944a : this.f8946c;
    }

    public final float b(s2.l lVar) {
        return lVar == s2.l.f6396g ? this.f8946c : this.f8944a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return s2.f.a(this.f8944a, c0Var.f8944a) && s2.f.a(this.f8945b, c0Var.f8945b) && s2.f.a(this.f8946c, c0Var.f8946c) && s2.f.a(this.f8947d, c0Var.f8947d);
    }

    public final int hashCode() {
        return Float.hashCode(this.f8947d) + a4.d.b(this.f8946c, a4.d.b(this.f8945b, Float.hashCode(this.f8944a) * 31, 31), 31);
    }

    public final String toString() {
        return "PaddingValues(start=" + ((Object) s2.f.b(this.f8944a)) + ", top=" + ((Object) s2.f.b(this.f8945b)) + ", end=" + ((Object) s2.f.b(this.f8946c)) + ", bottom=" + ((Object) s2.f.b(this.f8947d)) + ')';
    }
}
