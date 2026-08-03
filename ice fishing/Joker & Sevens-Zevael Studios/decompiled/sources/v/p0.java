package v;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class p0 implements h {

    /* renamed from: a, reason: collision with root package name */
    public final h f6941a;

    /* renamed from: b, reason: collision with root package name */
    public final long f6942b;

    public p0(x xVar, long j3) {
        this.f6941a = xVar;
        this.f6942b = j3;
    }

    @Override // v.h
    public final j1 a(x4.s sVar) {
        return new q0(this.f6941a.a(sVar), this.f6942b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        return p0Var.f6942b == this.f6942b && pc.j.a(p0Var.f6941a, this.f6941a);
    }

    public final int hashCode() {
        return Long.hashCode(this.f6942b) + (this.f6941a.hashCode() * 31);
    }
}
