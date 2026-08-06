package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class r5 extends he0 {
    public final /* synthetic */ s5 jivtDDk9H;
    public i91 mE4lRynR;

    public r5(s5 s5Var) {
        this.jivtDDk9H = s5Var;
    }

    @Override // defpackage.he0
    public final void bCsSzSHkbaQ() {
        s5 s5Var = this.jivtDDk9H;
        if (s5Var.GWasM1elztuh == this) {
            s5Var.GWasM1elztuh = null;
        }
        i91 i91Var = this.mE4lRynR;
        if (i91Var != null) {
            i91Var.Yi7zF1RB1();
        }
        this.mE4lRynR = null;
    }

    @Override // defpackage.he0
    public final void cTIXpaxc() {
        s5 s5Var = this.jivtDDk9H;
        s5Var.GWasM1elztuh = this;
        if (s5Var.Yi7zF1RB1 != null) {
            gqMuANyCes();
        }
    }

    public final void gqMuANyCes() {
        X1lG3V04pd x1lG3V04pd = new X1lG3V04pd(1, this, this.jivtDDk9H);
        g60 eUH21U3apd = vc0.eUH21U3apd(this);
        int i = eUH21U3apd.EljAMC1QTz;
        mt0 rectManager = ((c) j60.GWasM1elztuh(eUH21U3apd)).getRectManager();
        j91 j91Var = rectManager.X1lG3V04pd;
        j91Var.getClass();
        rf0 rf0Var = j91Var.GWasM1elztuh;
        i91 i91Var = new i91(j91Var, i, this, x1lG3V04pd);
        Object Yi7zF1RB1 = rf0Var.Yi7zF1RB1(i);
        if (Yi7zF1RB1 == null) {
            rf0Var.encWxUiV2(i, i91Var);
            Yi7zF1RB1 = i91Var;
        }
        i91 i91Var2 = (i91) Yi7zF1RB1;
        if (i91Var2 != i91Var) {
            while (true) {
                i91 i91Var3 = i91Var2.xqGvceK5x;
                if (i91Var3 == null) {
                    break;
                } else {
                    i91Var2 = i91Var3;
                }
            }
            i91Var2.xqGvceK5x = i91Var;
        }
        if (vc0.eUH21U3apd(this.OOA6hdeuvCS).rQPn8YBR) {
            rectManager.Yi7zF1RB1.OOA6hdeuvCS(i, true);
        }
        rectManager.OOA6hdeuvCS = true;
        rectManager.mOu10nynGul();
        this.mE4lRynR = i91Var;
    }
}
