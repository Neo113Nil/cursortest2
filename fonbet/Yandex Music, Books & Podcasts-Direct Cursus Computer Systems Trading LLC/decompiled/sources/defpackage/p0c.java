package defpackage;

/* loaded from: classes5.dex */
public final class p0c extends k0 {
    public static final n0 d = vz1.d("2.5.29.17");
    public n0 a;
    public boolean b;
    public o0 c;

    @Override // defpackage.k0
    public final boolean equals(Object obj) {
        if (!(obj instanceof p0c)) {
            return false;
        }
        p0c p0cVar = (p0c) obj;
        return p0cVar.a.x(this.a) && p0cVar.c.x(this.c) && p0cVar.b == this.b;
    }

    @Override // defpackage.k0
    public final int hashCode() {
        n0 n0Var = this.a;
        boolean z = this.b;
        o0 o0Var = this.c;
        if (z) {
            return n0Var.a.hashCode() ^ j66.e0(o0Var.a);
        }
        return ~(n0Var.a.hashCode() ^ j66.e0(o0Var.a));
    }

    @Override // defpackage.d0
    public final s0 n() {
        e0 e0Var = new e0(3);
        e0Var.e(this.a);
        if (this.b) {
            e0Var.e(b0.c);
        }
        e0Var.e(this.c);
        d07 d07Var = new d07(e0Var);
        d07Var.c = -1;
        return d07Var;
    }
}
