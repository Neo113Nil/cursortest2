package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class rd1 {
    public final fo0 AvO7iQsrTN;
    public final md1 EljAMC1QTz;
    public s6 GWasM1elztuh;
    public float encWxUiV2;
    public s6 mOu10nynGul;
    public float Yi7zF1RB1 = 1.0f;
    public p50 X1lG3V04pd = p50.OOA6hdeuvCS;
    public final fo0 xqGvceK5x = z50.WRKkgoJXwDn(new t21(0));
    public final fo0 OOA6hdeuvCS = z50.WRKkgoJXwDn(Boolean.FALSE);

    public rd1(yy yyVar) {
        md1 md1Var = new md1(yyVar);
        md1Var.EljAMC1QTz = new d3(12, this);
        this.EljAMC1QTz = md1Var;
        this.AvO7iQsrTN = new fo0(kc1.GWasM1elztuh, b9xEq24R1.qugwajBSa59j);
        this.encWxUiV2 = 1.0f;
    }

    public final void GWasM1elztuh(i60 i60Var, long j, float f, s6 s6Var) {
        u9 u9Var = i60Var.OOA6hdeuvCS;
        if (this.Yi7zF1RB1 != f) {
            this.encWxUiV2 = f;
            this.Yi7zF1RB1 = f;
        }
        if (!o30.rQPn8YBR(this.GWasM1elztuh, s6Var)) {
            this.mOu10nynGul = s6Var;
            this.GWasM1elztuh = s6Var;
        }
        p50 layoutDirection = i60Var.getLayoutDirection();
        if (this.X1lG3V04pd != layoutDirection) {
            this.X1lG3V04pd = layoutDirection;
        }
        int i = (int) (j >> 32);
        float intBitsToFloat = Float.intBitsToFloat((int) (u9Var.xqGvceK5x() >> 32)) - Float.intBitsToFloat(i);
        int i2 = (int) (j & 4294967295L);
        float intBitsToFloat2 = Float.intBitsToFloat((int) (u9Var.xqGvceK5x() & 4294967295L)) - Float.intBitsToFloat(i2);
        ((j6IIN2O8eOU) u9Var.EljAMC1QTz.Yi7zF1RB1).mOu10nynGul(0.0f, 0.0f, intBitsToFloat, intBitsToFloat2);
        if (f > 0.0f) {
            try {
                if (Float.intBitsToFloat(i) > 0.0f && Float.intBitsToFloat(i2) > 0.0f) {
                    X1lG3V04pd(i60Var);
                }
            } finally {
                ((j6IIN2O8eOU) u9Var.EljAMC1QTz.Yi7zF1RB1).mOu10nynGul(-0.0f, -0.0f, -intBitsToFloat, -intBitsToFloat2);
            }
        }
    }

    public final void X1lG3V04pd(i60 i60Var) {
        u9 u9Var = i60Var.OOA6hdeuvCS;
        s6 s6Var = this.mOu10nynGul;
        md1 md1Var = this.EljAMC1QTz;
        if (s6Var == null) {
            s6Var = (s6) md1Var.AvO7iQsrTN.getValue();
        }
        if (((Boolean) this.OOA6hdeuvCS.getValue()).booleanValue() && i60Var.getLayoutDirection() == p50.EljAMC1QTz) {
            long z19UFEN2I = u9Var.z19UFEN2I();
            f4 f4Var = u9Var.EljAMC1QTz;
            long mOu10nynGul = f4Var.mOu10nynGul();
            f4Var.EljAMC1QTz().E7jCp8Ls();
            try {
                ((j6IIN2O8eOU) f4Var.Yi7zF1RB1).jivtDDk9H(-1.0f, 1.0f, z19UFEN2I);
                md1Var.OOA6hdeuvCS(i60Var, this.encWxUiV2, s6Var);
            } finally {
                f4Var.EljAMC1QTz().JFJ3QoxA();
                f4Var.jivtDDk9H(mOu10nynGul);
            }
        } else {
            md1Var.OOA6hdeuvCS(i60Var, this.encWxUiV2, s6Var);
        }
        this.AvO7iQsrTN.getValue();
    }

    public final long Yi7zF1RB1() {
        return ((t21) this.xqGvceK5x.getValue()).GWasM1elztuh;
    }
}
