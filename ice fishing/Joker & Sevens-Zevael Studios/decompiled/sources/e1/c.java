package e1;

import bc.a0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: e, reason: collision with root package name */
    public static final c f1930e = new c(0.0f, 0.0f, 0.0f, 0.0f);

    /* renamed from: a, reason: collision with root package name */
    public final float f1931a;

    /* renamed from: b, reason: collision with root package name */
    public final float f1932b;

    /* renamed from: c, reason: collision with root package name */
    public final float f1933c;

    /* renamed from: d, reason: collision with root package name */
    public final float f1934d;

    public c(float f10, float f11, float f12, float f13) {
        this.f1931a = f10;
        this.f1932b = f11;
        this.f1933c = f12;
        this.f1934d = f13;
    }

    public final long a() {
        float f10 = this.f1933c;
        float f11 = this.f1931a;
        float f12 = ((f10 - f11) / 2.0f) + f11;
        float f13 = this.f1934d;
        float f14 = this.f1932b;
        return (Float.floatToRawIntBits(((f13 - f14) / 2.0f) + f14) & 4294967295L) | (Float.floatToRawIntBits(f12) << 32);
    }

    public final long b() {
        float f10 = this.f1933c - this.f1931a;
        float f11 = this.f1934d - this.f1932b;
        return (Float.floatToRawIntBits(f11) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32);
    }

    public final c c(c cVar) {
        return new c(Math.max(this.f1931a, cVar.f1931a), Math.max(this.f1932b, cVar.f1932b), Math.min(this.f1933c, cVar.f1933c), Math.min(this.f1934d, cVar.f1934d));
    }

    public final c d(float f10, float f11) {
        return new c(this.f1931a + f10, this.f1932b + f11, this.f1933c + f10, this.f1934d + f11);
    }

    public final c e(long j3) {
        int i10 = (int) (j3 >> 32);
        int i11 = (int) (j3 & 4294967295L);
        return new c(Float.intBitsToFloat(i10) + this.f1931a, Float.intBitsToFloat(i11) + this.f1932b, Float.intBitsToFloat(i10) + this.f1933c, Float.intBitsToFloat(i11) + this.f1934d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Float.compare(this.f1931a, cVar.f1931a) == 0 && Float.compare(this.f1932b, cVar.f1932b) == 0 && Float.compare(this.f1933c, cVar.f1933c) == 0 && Float.compare(this.f1934d, cVar.f1934d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f1934d) + a4.d.b(this.f1933c, a4.d.b(this.f1932b, Float.hashCode(this.f1931a) * 31, 31), 31);
    }

    public final String toString() {
        return "Rect.fromLTRB(" + a0.L(this.f1931a) + ", " + a0.L(this.f1932b) + ", " + a0.L(this.f1933c) + ", " + a0.L(this.f1934d) + ')';
    }
}
