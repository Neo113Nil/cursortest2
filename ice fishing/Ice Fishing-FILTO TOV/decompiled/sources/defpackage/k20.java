package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class k20 extends he0 implements w50, va1 {
    public sf1 Y6hRI1cF8;
    public sf1 jivtDDk9H;
    public sf1 mE4lRynR;

    @Override // defpackage.va1
    public final Object E7jCp8Ls() {
        return "androidx.compose.foundation.layout.ConsumedInsetsProvider";
    }

    @Override // defpackage.w50
    public final cd0 ES6ysExf(dd0 dd0Var, wc0 wc0Var, long j) {
        int GWasM1elztuh = this.jivtDDk9H.GWasM1elztuh(dd0Var, dd0Var.getLayoutDirection()) - this.mE4lRynR.GWasM1elztuh(dd0Var, dd0Var.getLayoutDirection());
        int Yi7zF1RB1 = this.jivtDDk9H.Yi7zF1RB1(dd0Var) - this.mE4lRynR.Yi7zF1RB1(dd0Var);
        int X1lG3V04pd = (this.jivtDDk9H.X1lG3V04pd(dd0Var, dd0Var.getLayoutDirection()) - this.mE4lRynR.X1lG3V04pd(dd0Var, dd0Var.getLayoutDirection())) + GWasM1elztuh;
        int xqGvceK5x = (this.jivtDDk9H.xqGvceK5x(dd0Var) - this.mE4lRynR.xqGvceK5x(dd0Var)) + Yi7zF1RB1;
        up0 OOA6hdeuvCS = wc0Var.OOA6hdeuvCS(fg.encWxUiV2(-X1lG3V04pd, -xqGvceK5x, j));
        return dd0Var.MjxSquD6Av(fg.EljAMC1QTz(OOA6hdeuvCS.OOA6hdeuvCS + X1lG3V04pd, j), fg.OOA6hdeuvCS(OOA6hdeuvCS.EljAMC1QTz + xqGvceK5x, j), yp.OOA6hdeuvCS, new j20(OOA6hdeuvCS, GWasM1elztuh, Yi7zF1RB1, 0));
    }

    @Override // defpackage.he0
    public final void bCsSzSHkbaQ() {
        this.jivtDDk9H = this.mE4lRynR;
        w60.pog2g9KITJA(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", new f20(this, 0));
    }

    @Override // defpackage.he0
    public final void cTIXpaxc() {
        w60.arNh8D4Z5gB(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", new f20(this, 1));
        gqMuANyCes();
    }

    @Override // defpackage.he0
    public final void gHe2tSmr6w() {
        this.mE4lRynR = ki1.YmKjaVtbfp5Z;
    }

    public final void gqMuANyCes() {
        this.jivtDDk9H = new jc1(this.mE4lRynR, this.Y6hRI1cF8);
        w60.pog2g9KITJA(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", new f20(this, 0));
        n4.XnEVoBF0td1l(this);
    }
}
