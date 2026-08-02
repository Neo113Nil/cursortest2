package defpackage;

/* loaded from: classes5.dex */
public final class ca extends k0 {
    public static final n0 c = new n0("1.3.6.1.5.5.7.48.2");
    public n0 a;
    public y2d b;

    static {
        new n0("1.3.6.1.5.5.7.48.1");
    }

    @Override // defpackage.d0
    public final s0 n() {
        e0 e0Var = new e0(2);
        e0Var.e(this.a);
        e0Var.e(this.b);
        d07 d07Var = new d07(e0Var);
        d07Var.c = -1;
        return d07Var;
    }

    public final String toString() {
        return su4.o(new StringBuilder("AccessDescription: Oid("), this.a.a, ")");
    }
}
