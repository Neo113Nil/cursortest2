package e1;

import bc.a0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final float f1935a;

    /* renamed from: b, reason: collision with root package name */
    public final float f1936b;

    /* renamed from: c, reason: collision with root package name */
    public final float f1937c;

    /* renamed from: d, reason: collision with root package name */
    public final float f1938d;

    /* renamed from: e, reason: collision with root package name */
    public final long f1939e;

    /* renamed from: f, reason: collision with root package name */
    public final long f1940f;

    /* renamed from: g, reason: collision with root package name */
    public final long f1941g;

    /* renamed from: h, reason: collision with root package name */
    public final long f1942h;

    static {
        a.a.d(0.0f, 0.0f, 0.0f, 0.0f, 0L);
    }

    public d(float f10, float f11, float f12, float f13, long j3, long j6, long j10, long j11) {
        this.f1935a = f10;
        this.f1936b = f11;
        this.f1937c = f12;
        this.f1938d = f13;
        this.f1939e = j3;
        this.f1940f = j6;
        this.f1941g = j10;
        this.f1942h = j11;
    }

    public final float a() {
        return this.f1938d - this.f1936b;
    }

    public final float b() {
        return this.f1937c - this.f1935a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Float.compare(this.f1935a, dVar.f1935a) == 0 && Float.compare(this.f1936b, dVar.f1936b) == 0 && Float.compare(this.f1937c, dVar.f1937c) == 0 && Float.compare(this.f1938d, dVar.f1938d) == 0 && a.a.v(this.f1939e, dVar.f1939e) && a.a.v(this.f1940f, dVar.f1940f) && a.a.v(this.f1941g, dVar.f1941g) && a.a.v(this.f1942h, dVar.f1942h);
    }

    public final int hashCode() {
        return Long.hashCode(this.f1942h) + a4.d.c(a4.d.c(a4.d.c(a4.d.b(this.f1938d, a4.d.b(this.f1937c, a4.d.b(this.f1936b, Float.hashCode(this.f1935a) * 31, 31), 31), 31), 31, this.f1939e), 31, this.f1940f), 31, this.f1941g);
    }

    public final String toString() {
        String str = a0.L(this.f1935a) + ", " + a0.L(this.f1936b) + ", " + a0.L(this.f1937c) + ", " + a0.L(this.f1938d);
        long j3 = this.f1939e;
        long j6 = this.f1940f;
        boolean v10 = a.a.v(j3, j6);
        long j10 = this.f1941g;
        long j11 = this.f1942h;
        if (!v10 || !a.a.v(j6, j10) || !a.a.v(j10, j11)) {
            return "RoundRect(rect=" + str + ", topLeft=" + ((Object) a.a.M(j3)) + ", topRight=" + ((Object) a.a.M(j6)) + ", bottomRight=" + ((Object) a.a.M(j10)) + ", bottomLeft=" + ((Object) a.a.M(j11)) + ')';
        }
        int i10 = (int) (j3 >> 32);
        int i11 = (int) (j3 & 4294967295L);
        if (Float.intBitsToFloat(i10) == Float.intBitsToFloat(i11)) {
            return "RoundRect(rect=" + str + ", radius=" + a0.L(Float.intBitsToFloat(i10)) + ')';
        }
        return "RoundRect(rect=" + str + ", x=" + a0.L(Float.intBitsToFloat(i10)) + ", y=" + a0.L(Float.intBitsToFloat(i11)) + ')';
    }
}
