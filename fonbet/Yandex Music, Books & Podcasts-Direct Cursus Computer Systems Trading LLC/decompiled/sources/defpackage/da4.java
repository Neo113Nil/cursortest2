package defpackage;

/* loaded from: classes5.dex */
public final class da4 extends k0 {
    public v0 a;
    public i0s b;

    public static da4 t(s0 s0Var) {
        if (s0Var == null) {
            return null;
        }
        v0 E = v0.E(s0Var);
        da4 da4Var = new da4();
        da4Var.a = E;
        if (E.size() == 3) {
            da4Var.b = i0s.t(E.F(0));
            return da4Var;
        }
        xq0.x("sequence wrong size for a certificate");
        return null;
    }

    @Override // defpackage.d0
    public final s0 n() {
        return this.a;
    }
}
