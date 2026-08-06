package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class om0 extends tm0 {
    public static final om0 X1lG3V04pd = new om0(1, 0, 2);

    @Override // defpackage.tm0
    public final void GWasM1elztuh(nb nbVar, m4 m4Var, c31 c31Var, au0 au0Var, um0 um0Var) {
        int Yi7zF1RB1 = nbVar.Yi7zF1RB1(0);
        int i = c31Var.cilMamHF;
        int TpUsjqg3bxO = c31Var.TpUsjqg3bxO(c31Var.Yi7zF1RB1, c31Var.Mjvvu5DE(i));
        int AvO7iQsrTN = c31Var.AvO7iQsrTN(c31Var.Yi7zF1RB1, c31Var.Mjvvu5DE(i + 1));
        for (int max = Math.max(TpUsjqg3bxO, AvO7iQsrTN - Yi7zF1RB1); max < AvO7iQsrTN; max++) {
            Object obj = c31Var.X1lG3V04pd[c31Var.encWxUiV2(max)];
            if (obj instanceof vx) {
                au0Var.OOA6hdeuvCS((vx) obj);
            } else if (obj instanceof at0) {
                ((at0) obj).X1lG3V04pd();
            }
        }
        if (Yi7zF1RB1 <= 0) {
            we.GWasM1elztuh("Check failed");
        }
        int i2 = c31Var.cilMamHF;
        int TpUsjqg3bxO2 = c31Var.TpUsjqg3bxO(c31Var.Yi7zF1RB1, c31Var.Mjvvu5DE(i2));
        int AvO7iQsrTN2 = c31Var.AvO7iQsrTN(c31Var.Yi7zF1RB1, c31Var.Mjvvu5DE(i2 + 1)) - Yi7zF1RB1;
        if (AvO7iQsrTN2 < TpUsjqg3bxO2) {
            we.GWasM1elztuh("Check failed");
        }
        c31Var.MZhzXH72(AvO7iQsrTN2, Yi7zF1RB1, i2);
        int i3 = c31Var.mOu10nynGul;
        if (i3 >= TpUsjqg3bxO2) {
            c31Var.mOu10nynGul = i3 - Yi7zF1RB1;
        }
    }
}
