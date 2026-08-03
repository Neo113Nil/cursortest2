package e1;

import bc.a0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public float f1925a = 0.0f;

    /* renamed from: b, reason: collision with root package name */
    public float f1926b = 0.0f;

    /* renamed from: c, reason: collision with root package name */
    public float f1927c = 0.0f;

    /* renamed from: d, reason: collision with root package name */
    public float f1928d = 0.0f;

    public final void a(float f10, float f11, float f12, float f13) {
        this.f1925a = Math.max(f10, this.f1925a);
        this.f1926b = Math.max(f11, this.f1926b);
        this.f1927c = Math.min(f12, this.f1927c);
        this.f1928d = Math.min(f13, this.f1928d);
    }

    public final boolean b() {
        return (this.f1925a >= this.f1927c) | (this.f1926b >= this.f1928d);
    }

    public final String toString() {
        return "MutableRect(" + a0.L(this.f1925a) + ", " + a0.L(this.f1926b) + ", " + a0.L(this.f1927c) + ", " + a0.L(this.f1928d) + ')';
    }
}
