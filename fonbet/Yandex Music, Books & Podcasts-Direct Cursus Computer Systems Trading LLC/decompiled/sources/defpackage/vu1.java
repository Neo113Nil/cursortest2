package defpackage;

/* loaded from: classes5.dex */
public final class vu1 extends k0 {
    public n0 a;
    public d0 b;

    public static vu1 t(d0 d0Var) {
        if (d0Var instanceof vu1) {
            return (vu1) d0Var;
        }
        if (d0Var == null) {
            xq0.x("null value in getInstance()");
            return null;
        }
        v0 E = v0.E(d0Var);
        vu1 vu1Var = new vu1();
        vu1Var.a = (n0) E.F(0);
        vu1Var.b = E.F(1);
        return vu1Var;
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
}
