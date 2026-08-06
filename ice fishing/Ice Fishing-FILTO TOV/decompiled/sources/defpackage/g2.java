package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class g2 {
    public final r3 AvO7iQsrTN;
    public final zg0 EljAMC1QTz;
    public final eb1 GWasM1elztuh;
    public final r3 JFJ3QoxA;
    public final fo0 OOA6hdeuvCS;
    public final m3 X1lG3V04pd;
    public final Object Yi7zF1RB1;
    public final r3 encWxUiV2;
    public final r3 mOu10nynGul;
    public final fo0 xqGvceK5x;

    public g2(Object obj, eb1 eb1Var, Object obj2) {
        this.GWasM1elztuh = eb1Var;
        this.Yi7zF1RB1 = obj2;
        m3 m3Var = new m3(eb1Var, obj, null, 60);
        this.X1lG3V04pd = m3Var;
        this.xqGvceK5x = z50.WRKkgoJXwDn(Boolean.FALSE);
        this.OOA6hdeuvCS = z50.WRKkgoJXwDn(obj);
        this.EljAMC1QTz = new zg0();
        new c51(1.0f, 1500.0f, obj2);
        r3 r3Var = m3Var.AvO7iQsrTN;
        boolean z = r3Var instanceof n3;
        r3 r3Var2 = z ? qj.OOA6hdeuvCS : r3Var instanceof o3 ? qj.EljAMC1QTz : r3Var instanceof p3 ? qj.AvO7iQsrTN : qj.encWxUiV2;
        this.AvO7iQsrTN = r3Var2;
        r3 r3Var3 = z ? qj.GWasM1elztuh : r3Var instanceof o3 ? qj.Yi7zF1RB1 : r3Var instanceof p3 ? qj.X1lG3V04pd : qj.xqGvceK5x;
        this.encWxUiV2 = r3Var3;
        this.mOu10nynGul = r3Var2;
        this.JFJ3QoxA = r3Var3;
    }

    public static final Object GWasM1elztuh(g2 g2Var, Object obj) {
        eb1 eb1Var = g2Var.GWasM1elztuh;
        r3 r3Var = g2Var.JFJ3QoxA;
        r3 r3Var2 = g2Var.mOu10nynGul;
        if (!o30.rQPn8YBR(r3Var2, g2Var.AvO7iQsrTN) || !o30.rQPn8YBR(r3Var, g2Var.encWxUiV2)) {
            r3 r3Var3 = (r3) eb1Var.GWasM1elztuh.mOu10nynGul(obj);
            int Yi7zF1RB1 = r3Var3.Yi7zF1RB1();
            boolean z = false;
            for (int i = 0; i < Yi7zF1RB1; i++) {
                if (r3Var3.GWasM1elztuh(i) < r3Var2.GWasM1elztuh(i) || r3Var3.GWasM1elztuh(i) > r3Var.GWasM1elztuh(i)) {
                    r3Var3.OOA6hdeuvCS(o50.AvO7iQsrTN(r3Var3.GWasM1elztuh(i), r3Var2.GWasM1elztuh(i), r3Var.GWasM1elztuh(i)), i);
                    z = true;
                }
            }
            if (z) {
                return eb1Var.Yi7zF1RB1.mOu10nynGul(r3Var3);
            }
        }
        return obj;
    }

    public static Object X1lG3V04pd(g2 g2Var, Object obj, l3 l3Var, d71 d71Var) {
        Object mOu10nynGul = g2Var.GWasM1elztuh.Yi7zF1RB1.mOu10nynGul(g2Var.X1lG3V04pd.AvO7iQsrTN);
        Object xqGvceK5x = g2Var.xqGvceK5x();
        eb1 eb1Var = g2Var.GWasM1elztuh;
        return zg0.GWasM1elztuh(g2Var.EljAMC1QTz, new e2(g2Var, mOu10nynGul, new t71(l3Var, eb1Var, xqGvceK5x, obj, (r3) eb1Var.GWasM1elztuh.mOu10nynGul(mOu10nynGul)), g2Var.X1lG3V04pd.encWxUiV2, null), d71Var);
    }

    public static final void Yi7zF1RB1(g2 g2Var) {
        m3 m3Var = g2Var.X1lG3V04pd;
        m3Var.AvO7iQsrTN.xqGvceK5x();
        m3Var.encWxUiV2 = Long.MIN_VALUE;
        g2Var.xqGvceK5x.setValue(Boolean.FALSE);
    }

    public final Object xqGvceK5x() {
        return this.X1lG3V04pd.EljAMC1QTz.getValue();
    }

    public /* synthetic */ g2(Object obj, eb1 eb1Var, Float f, int i) {
        this(obj, eb1Var, (i & 4) != 0 ? null : f);
    }
}
