package z;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class t implements o0 {

    /* renamed from: a, reason: collision with root package name */
    public final o0 f9031a;

    /* renamed from: b, reason: collision with root package name */
    public final o0 f9032b;

    public t(o0 o0Var, o0 o0Var2) {
        this.f9031a = o0Var;
        this.f9032b = o0Var2;
    }

    @Override // z.o0
    public final int a(x1.o0 o0Var, s2.l lVar) {
        int a6 = this.f9031a.a(o0Var, lVar) - this.f9032b.a(o0Var, lVar);
        if (a6 < 0) {
            return 0;
        }
        return a6;
    }

    @Override // z.o0
    public final int b(x1.o0 o0Var) {
        int b2 = this.f9031a.b(o0Var) - this.f9032b.b(o0Var);
        if (b2 < 0) {
            return 0;
        }
        return b2;
    }

    @Override // z.o0
    public final int c(x1.o0 o0Var) {
        int c3 = this.f9031a.c(o0Var) - this.f9032b.c(o0Var);
        if (c3 < 0) {
            return 0;
        }
        return c3;
    }

    @Override // z.o0
    public final int d(x1.o0 o0Var, s2.l lVar) {
        int d10 = this.f9031a.d(o0Var, lVar) - this.f9032b.d(o0Var, lVar);
        if (d10 < 0) {
            return 0;
        }
        return d10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return pc.j.a(tVar.f9031a, this.f9031a) && pc.j.a(tVar.f9032b, this.f9032b);
    }

    public final int hashCode() {
        return this.f9032b.hashCode() + (this.f9031a.hashCode() * 31);
    }

    public final String toString() {
        return "(" + this.f9031a + " - " + this.f9032b + ')';
    }
}
