package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class t60 implements m61 {
    public final sf0 GWasM1elztuh;
    public final /* synthetic */ Object X1lG3V04pd;
    public final /* synthetic */ v60 Yi7zF1RB1;

    public t60(v60 v60Var, Object obj) {
        this.Yi7zF1RB1 = v60Var;
        this.X1lG3V04pd = obj;
        int[] iArr = a30.GWasM1elztuh;
        this.GWasM1elztuh = new sf0();
    }

    @Override // defpackage.m61
    public final void GWasM1elztuh() {
        v60.X1lG3V04pd(this.Yi7zF1RB1, this.X1lG3V04pd);
    }

    @Override // defpackage.m61
    public final int X1lG3V04pd() {
        g60 g60Var = (g60) this.Yi7zF1RB1.uFEq9NpZ.AvO7iQsrTN(this.X1lG3V04pd);
        if (g60Var != null) {
            return ((og0) g60Var.uFEq9NpZ()).OOA6hdeuvCS.AvO7iQsrTN;
        }
        return 0;
    }

    @Override // defpackage.m61
    public final void Yi7zF1RB1(fi0 fi0Var) {
        xj0 xj0Var;
        g60 g60Var = (g60) this.Yi7zF1RB1.uFEq9NpZ.AvO7iQsrTN(this.X1lG3V04pd);
        he0 he0Var = (g60Var == null || (xj0Var = g60Var.A1EKNP6CxJ) == null) ? null : xj0Var.EljAMC1QTz;
        if (he0Var == null || !he0Var.Mjvvu5DE) {
            return;
        }
        w60.pog2g9KITJA(he0Var, "androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode", fi0Var);
    }

    @Override // defpackage.m61
    public final void xqGvceK5x(int i, long j) {
        v60 v60Var = this.Yi7zF1RB1;
        g60 g60Var = (g60) v60Var.uFEq9NpZ.AvO7iQsrTN(this.X1lG3V04pd);
        if (g60Var == null || !g60Var.eUH21U3apd()) {
            return;
        }
        int i2 = ((og0) g60Var.uFEq9NpZ()).OOA6hdeuvCS.AvO7iQsrTN;
        if (i < 0 || i >= i2) {
            t10.xqGvceK5x("Index (" + i + ") is out of bound of [0, " + i2 + ')');
        }
        if (g60Var.A1EKNP6CxJ()) {
            t10.GWasM1elztuh("Pre-measure called on node that is not placed");
        }
        g60 g60Var2 = v60Var.OOA6hdeuvCS;
        g60Var2.jivtDDk9H = true;
        ((c) j60.GWasM1elztuh(g60Var)).cilMamHF((g60) ((og0) g60Var.uFEq9NpZ()).get(i), j);
        g60Var2.jivtDDk9H = false;
        this.GWasM1elztuh.GWasM1elztuh(i);
    }
}
