package defpackage;

/* loaded from: classes9.dex */
public abstract class svf {
    public static final wvf a = new wvf();
    public static final yvf b = new yvf();

    public static wvf a(b2 b2Var) {
        return b2Var.b < 1 ? a : new wvf(b2Var);
    }

    public static yvf b(b2 b2Var) {
        if (b2Var.b < 1) {
            return b;
        }
        yvf yvfVar = new yvf(b2Var);
        yvfVar.c = -1;
        return yvfVar;
    }
}
