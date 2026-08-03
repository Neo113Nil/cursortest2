package v;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class o0 implements x {

    /* renamed from: a, reason: collision with root package name */
    public final float f6906a;

    /* renamed from: b, reason: collision with root package name */
    public final float f6907b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f6908c;

    public o0(float f10, float f11, Object obj) {
        this.f6906a = f10;
        this.f6907b = f11;
        this.f6908c = obj;
    }

    @Override // v.h
    public final j1 a(x4.s sVar) {
        Object obj = this.f6908c;
        return new m7.g(this.f6906a, this.f6907b, obj == null ? null : (n) ((oc.c) sVar.f8356h).invoke(obj));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o0) {
            o0 o0Var = (o0) obj;
            if (o0Var.f6906a == this.f6906a && o0Var.f6907b == this.f6907b && pc.j.a(o0Var.f6908c, this.f6908c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f6908c;
        return Float.hashCode(this.f6907b) + a4.d.b(this.f6906a, (obj != null ? obj.hashCode() : 0) * 31, 31);
    }
}
