package z;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class l0 implements o0 {

    /* renamed from: a, reason: collision with root package name */
    public final o0 f8980a;

    /* renamed from: b, reason: collision with root package name */
    public final o0 f8981b;

    public l0(o0 o0Var, o0 o0Var2) {
        this.f8980a = o0Var;
        this.f8981b = o0Var2;
    }

    @Override // z.o0
    public final int a(x1.o0 o0Var, s2.l lVar) {
        return Math.max(this.f8980a.a(o0Var, lVar), this.f8981b.a(o0Var, lVar));
    }

    @Override // z.o0
    public final int b(x1.o0 o0Var) {
        return Math.max(this.f8980a.b(o0Var), this.f8981b.b(o0Var));
    }

    @Override // z.o0
    public final int c(x1.o0 o0Var) {
        return Math.max(this.f8980a.c(o0Var), this.f8981b.c(o0Var));
    }

    @Override // z.o0
    public final int d(x1.o0 o0Var, s2.l lVar) {
        return Math.max(this.f8980a.d(o0Var, lVar), this.f8981b.d(o0Var, lVar));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        return pc.j.a(l0Var.f8980a, this.f8980a) && pc.j.a(l0Var.f8981b, this.f8981b);
    }

    public final int hashCode() {
        return (this.f8981b.hashCode() * 31) + this.f8980a.hashCode();
    }

    public final String toString() {
        return "(" + this.f8980a + " ∪ " + this.f8981b + ')';
    }
}
