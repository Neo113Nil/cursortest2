package defpackage;

/* loaded from: classes10.dex */
public final class wa70 extends gc70 {
    public static final wa70 c = new wa70(0, 2, 1);

    @Override // defpackage.gc70
    public final void a(vc70 vc70Var, o13 o13Var, ows0 ows0Var, zti0 zti0Var, jc70 jc70Var) {
        g6w g6wVar = (g6w) vc70Var.b(1);
        int i = g6wVar != null ? g6wVar.a : 0;
        bb9 bb9Var = (bb9) vc70Var.b(0);
        if (i > 0) {
            o13Var = new kn1(o13Var, i);
        }
        bb9Var.b(o13Var, ows0Var, zti0Var, jc70Var != null ? new ht10(jc70Var, ows0Var, false, 21) : null);
    }
}
