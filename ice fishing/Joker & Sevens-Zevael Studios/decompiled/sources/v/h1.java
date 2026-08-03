package v;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class h1 implements u {

    /* renamed from: a, reason: collision with root package name */
    public final int f6853a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6854b;

    /* renamed from: c, reason: collision with root package name */
    public final v f6855c;

    public h1(int i10, int i11, v vVar) {
        this.f6853a = i10;
        this.f6854b = i11;
        this.f6855c = vVar;
    }

    @Override // v.h
    public final j1 a(x4.s sVar) {
        return new l6.m(this.f6853a, this.f6854b, this.f6855c);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h1)) {
            return false;
        }
        h1 h1Var = (h1) obj;
        return h1Var.f6853a == this.f6853a && h1Var.f6854b == this.f6854b && pc.j.a(h1Var.f6855c, this.f6855c);
    }

    public final int hashCode() {
        return ((this.f6855c.hashCode() + (this.f6853a * 31)) * 31) + this.f6854b;
    }

    @Override // v.u, v.h
    public final k1 a(x4.s sVar) {
        return new l6.m(this.f6853a, this.f6854b, this.f6855c);
    }
}
