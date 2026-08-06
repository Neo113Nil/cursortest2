package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public abstract class tp0 implements el {
    public boolean OOA6hdeuvCS;

    public static void AvO7iQsrTN(tp0 tp0Var, up0 up0Var, int i, int i2) {
        tp0Var.getClass();
        GWasM1elztuh(tp0Var, up0Var);
        up0Var.EDwNPVYuViP0(u20.X1lG3V04pd((i2 & 4294967295L) | (i << 32), up0Var.mOu10nynGul), 0.0f, null);
    }

    public static void E7jCp8Ls(tp0 tp0Var, up0 up0Var, hv hvVar) {
        tp0Var.getClass();
        GWasM1elztuh(tp0Var, up0Var);
        up0Var.EDwNPVYuViP0(u20.X1lG3V04pd(0L, up0Var.mOu10nynGul), 0.0f, hvVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void GWasM1elztuh(tp0 tp0Var, up0 up0Var) {
        tp0Var.getClass();
        if (up0Var instanceof ve0) {
            ((ve0) up0Var).E7jCp8Ls(tp0Var.OOA6hdeuvCS);
        }
    }

    public static void JFJ3QoxA(tp0 tp0Var, up0 up0Var, int i, int i2) {
        long j = (i << 32) | (i2 & 4294967295L);
        if (tp0Var.OOA6hdeuvCS() == p50.OOA6hdeuvCS || tp0Var.EljAMC1QTz() == 0) {
            GWasM1elztuh(tp0Var, up0Var);
            up0Var.EDwNPVYuViP0(u20.X1lG3V04pd(j, up0Var.mOu10nynGul), 0.0f, null);
        } else {
            int EljAMC1QTz = (tp0Var.EljAMC1QTz() - up0Var.OOA6hdeuvCS) - ((int) (j >> 32));
            GWasM1elztuh(tp0Var, up0Var);
            up0Var.EDwNPVYuViP0(u20.X1lG3V04pd((EljAMC1QTz << 32) | (((int) (j & 4294967295L)) & 4294967295L), up0Var.mOu10nynGul), 0.0f, null);
        }
    }

    public static void encWxUiV2(tp0 tp0Var, up0 up0Var, long j) {
        tp0Var.getClass();
        GWasM1elztuh(tp0Var, up0Var);
        up0Var.EDwNPVYuViP0(u20.X1lG3V04pd(j, up0Var.mOu10nynGul), 0.0f, null);
    }

    public static void rQPn8YBR(tp0 tp0Var, up0 up0Var, int i, int i2) {
        int i3 = vp0.Yi7zF1RB1;
        XdwzlWIkSDqF xdwzlWIkSDqF = XdwzlWIkSDqF.A1EKNP6CxJ;
        long j = (i << 32) | (i2 & 4294967295L);
        if (tp0Var.OOA6hdeuvCS() == p50.OOA6hdeuvCS || tp0Var.EljAMC1QTz() == 0) {
            GWasM1elztuh(tp0Var, up0Var);
            up0Var.EDwNPVYuViP0(u20.X1lG3V04pd(j, up0Var.mOu10nynGul), 0.0f, xdwzlWIkSDqF);
        } else {
            int EljAMC1QTz = (tp0Var.EljAMC1QTz() - up0Var.OOA6hdeuvCS) - ((int) (j >> 32));
            GWasM1elztuh(tp0Var, up0Var);
            up0Var.EDwNPVYuViP0(u20.X1lG3V04pd((EljAMC1QTz << 32) | (((int) (j & 4294967295L)) & 4294967295L), up0Var.mOu10nynGul), 0.0f, xdwzlWIkSDqF);
        }
    }

    public abstract int EljAMC1QTz();

    public abstract p50 OOA6hdeuvCS();

    public float X1lG3V04pd(sz szVar) {
        return Float.NaN;
    }
}
