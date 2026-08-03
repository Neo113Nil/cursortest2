package j0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final float f3336a;

    /* renamed from: b, reason: collision with root package name */
    public final float f3337b;

    /* renamed from: c, reason: collision with root package name */
    public final float f3338c;

    /* renamed from: d, reason: collision with root package name */
    public final float f3339d;

    /* renamed from: e, reason: collision with root package name */
    public final float f3340e;

    public h(float f10, float f11, float f12, float f13, float f14, float f15) {
        this.f3336a = f10;
        this.f3337b = f11;
        this.f3338c = f12;
        this.f3339d = f13;
        this.f3340e = f15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return s2.f.a(this.f3336a, hVar.f3336a) && s2.f.a(this.f3337b, hVar.f3337b) && s2.f.a(this.f3338c, hVar.f3338c) && s2.f.a(this.f3339d, hVar.f3339d) && s2.f.a(this.f3340e, hVar.f3340e);
    }

    public final int hashCode() {
        return Float.hashCode(this.f3340e) + a4.d.b(this.f3339d, a4.d.b(this.f3338c, a4.d.b(this.f3337b, Float.hashCode(this.f3336a) * 31, 31), 31), 31);
    }
}
