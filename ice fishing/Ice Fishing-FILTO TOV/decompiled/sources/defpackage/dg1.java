package defpackage;

import android.view.WindowInsets;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public class dg1 extends jg1 {
    public final WindowInsets.Builder OOA6hdeuvCS;

    public dg1(wg1 wg1Var) {
        super(wg1Var);
        WindowInsets Yi7zF1RB1 = wg1Var.Yi7zF1RB1();
        this.OOA6hdeuvCS = Yi7zF1RB1 != null ? re0.encWxUiV2(Yi7zF1RB1) : re0.AvO7iQsrTN();
    }

    @Override // defpackage.jg1
    public void AvO7iQsrTN(e20 e20Var) {
        this.OOA6hdeuvCS.setSystemGestureInsets(e20Var.xqGvceK5x());
    }

    @Override // defpackage.jg1
    public void EljAMC1QTz(e20 e20Var) {
        this.OOA6hdeuvCS.setStableInsets(e20Var.xqGvceK5x());
    }

    @Override // defpackage.jg1
    public void OOA6hdeuvCS(e20 e20Var) {
        this.OOA6hdeuvCS.setMandatorySystemGestureInsets(e20Var.xqGvceK5x());
    }

    @Override // defpackage.jg1
    public wg1 Yi7zF1RB1() {
        WindowInsets build;
        GWasM1elztuh();
        build = this.OOA6hdeuvCS.build();
        wg1 X1lG3V04pd = wg1.X1lG3V04pd(build, null);
        e20[] e20VarArr = this.Yi7zF1RB1;
        sg1 sg1Var = X1lG3V04pd.GWasM1elztuh;
        sg1Var.cilMamHF(e20VarArr);
        sg1Var.Y6hRI1cF8(null);
        sg1Var.arNh8D4Z5gB(this.X1lG3V04pd);
        sg1Var.pog2g9KITJA(this.xqGvceK5x);
        return X1lG3V04pd;
    }

    @Override // defpackage.jg1
    public void encWxUiV2(e20 e20Var) {
        this.OOA6hdeuvCS.setSystemWindowInsets(e20Var.xqGvceK5x());
    }

    @Override // defpackage.jg1
    public void mOu10nynGul(e20 e20Var) {
        this.OOA6hdeuvCS.setTappableElementInsets(e20Var.xqGvceK5x());
    }

    public dg1() {
        this.OOA6hdeuvCS = re0.AvO7iQsrTN();
    }
}
