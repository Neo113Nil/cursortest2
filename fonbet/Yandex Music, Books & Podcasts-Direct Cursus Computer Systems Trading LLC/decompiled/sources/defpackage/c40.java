package defpackage;

/* loaded from: classes5.dex */
public final class c40 extends k0 {
    public n0 a;
    public d0 b;

    public static c40 t(Object obj) {
        if (obj instanceof c40) {
            return (c40) obj;
        }
        if (obj == null) {
            return null;
        }
        v0 E = v0.E(obj);
        c40 c40Var = new c40();
        if (E.size() < 1 || E.size() > 2) {
            kac.c(E.size(), "Bad sequence size: ");
            return null;
        }
        c40Var.a = n0.F(E.F(0));
        if (E.size() == 2) {
            c40Var.b = E.F(1);
            return c40Var;
        }
        c40Var.b = null;
        return c40Var;
    }

    @Override // defpackage.d0
    public final s0 n() {
        e0 e0Var = new e0(2);
        e0Var.e(this.a);
        d0 d0Var = this.b;
        if (d0Var != null) {
            e0Var.e(d0Var);
        }
        d07 d07Var = new d07(e0Var);
        d07Var.c = -1;
        return d07Var;
    }
}
