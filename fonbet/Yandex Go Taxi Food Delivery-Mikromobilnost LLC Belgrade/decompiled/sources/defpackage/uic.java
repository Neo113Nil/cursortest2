package defpackage;

/* loaded from: classes10.dex */
public final class uic implements tic {
    public static final uic a = new uic();

    @Override // defpackage.tic
    public final f530 a(so5 so5Var, f530 f530Var) {
        return vfc.j(so5Var, f530Var);
    }

    public final f530 b(f530 f530Var, float f, boolean z) {
        if (f <= 0.0d) {
            gxv.a("invalid weight; must be greater than zero");
        }
        if (f > Float.MAX_VALUE) {
            f = Float.MAX_VALUE;
        }
        return f530Var.k(new x2y(f, z));
    }
}
