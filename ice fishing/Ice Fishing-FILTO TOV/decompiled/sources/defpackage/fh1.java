package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public abstract class fh1 {
    public static final rf0 GWasM1elztuh;
    public static final dh1[] Yi7zF1RB1;

    static {
        rf0 rf0Var = new rf0(8);
        dh1.GWasM1elztuh.getClass();
        eh1 eh1Var = ch1.AvO7iQsrTN;
        rf0Var.encWxUiV2(1, eh1Var);
        eh1 eh1Var2 = ch1.EljAMC1QTz;
        rf0Var.encWxUiV2(2, eh1Var2);
        eh1 eh1Var3 = ch1.Yi7zF1RB1;
        rf0Var.encWxUiV2(4, eh1Var3);
        eh1 eh1Var4 = ch1.xqGvceK5x;
        rf0Var.encWxUiV2(8, eh1Var4);
        eh1 eh1Var5 = ch1.encWxUiV2;
        rf0Var.encWxUiV2(16, eh1Var5);
        eh1 eh1Var6 = ch1.OOA6hdeuvCS;
        rf0Var.encWxUiV2(32, eh1Var6);
        eh1 eh1Var7 = ch1.mOu10nynGul;
        rf0Var.encWxUiV2(64, eh1Var7);
        eh1 eh1Var8 = ch1.X1lG3V04pd;
        rf0Var.encWxUiV2(128, eh1Var8);
        GWasM1elztuh = rf0Var;
        Yi7zF1RB1 = new dh1[]{eh1Var, eh1Var2, eh1Var3, eh1Var7, eh1Var5, eh1Var6, eh1Var4, ch1.JFJ3QoxA, eh1Var8};
    }

    public static final void GWasM1elztuh(rb0 rb0Var, a20 a20Var, long j, int i, int i2) {
        if (o50.E7jCp8Ls(j, -1L)) {
            return;
        }
        rb0Var.GWasM1elztuh(a20Var.Yi7zF1RB1(), (int) ((j >>> 48) & 65535));
        rb0Var.GWasM1elztuh(a20Var.xqGvceK5x(), (int) ((j >>> 32) & 65535));
        rb0Var.GWasM1elztuh(a20Var.X1lG3V04pd(), i - ((int) ((j >>> 16) & 65535)));
        rb0Var.GWasM1elztuh(a20Var.GWasM1elztuh(), i2 - ((int) (j & 65535)));
    }
}
