package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class tl0 extends tm0 {
    public static final tl0 X1lG3V04pd = new tl0(0, 2, 1);

    @Override // defpackage.tm0
    public final void GWasM1elztuh(nb nbVar, m4 m4Var, c31 c31Var, au0 au0Var, um0 um0Var) {
        int i;
        z20 z20Var = (z20) nbVar.X1lG3V04pd(0);
        int X1lG3V04pd2 = c31Var.X1lG3V04pd((lx) nbVar.X1lG3V04pd(1));
        if (c31Var.jivtDDk9H >= X1lG3V04pd2) {
            we.GWasM1elztuh("Check failed");
        }
        d70.ozMwhSAI(c31Var, m4Var, X1lG3V04pd2);
        int i2 = c31Var.jivtDDk9H;
        int i3 = c31Var.cilMamHF;
        while (i3 >= 0 && !c31Var.WRKkgoJXwDn(i3)) {
            i3 = c31Var.ozMwhSAI(c31Var.Yi7zF1RB1, i3);
        }
        int i4 = i3 + 1;
        int i5 = 0;
        while (i4 < i2) {
            if (c31Var.cilMamHF(i2, i4)) {
                if (c31Var.WRKkgoJXwDn(i4)) {
                    i5 = 0;
                }
                i4++;
            } else {
                i5 += c31Var.WRKkgoJXwDn(i4) ? 1 : c31Var.Yi7zF1RB1[(c31Var.Mjvvu5DE(i4) * 5) + 1] & 67108863;
                i4 += c31Var.Y6hRI1cF8(i4);
            }
        }
        while (true) {
            i = c31Var.jivtDDk9H;
            if (i >= X1lG3V04pd2) {
                break;
            }
            if (c31Var.cilMamHF(X1lG3V04pd2, i)) {
                int i6 = c31Var.jivtDDk9H;
                if (i6 < c31Var.Y6hRI1cF8 && (c31Var.Yi7zF1RB1[(c31Var.Mjvvu5DE(i6) * 5) + 1] & 1073741824) != 0) {
                    m4Var.xqGvceK5x(c31Var.EXrPz3p7hFb(c31Var.jivtDDk9H));
                    i5 = 0;
                }
                c31Var.VeqTn1PQw7();
            } else {
                i5 += c31Var.HFYAaqMd6();
            }
        }
        if (i != X1lG3V04pd2) {
            we.GWasM1elztuh("Check failed");
        }
        z20Var.GWasM1elztuh = i5;
    }
}
