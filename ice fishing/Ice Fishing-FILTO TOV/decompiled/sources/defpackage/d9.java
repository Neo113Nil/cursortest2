package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class d9 extends he0 implements sk0, s8, go {
    public final E7jCp8Ls Y6hRI1cF8;
    public boolean jivtDDk9H;
    public final e9 mE4lRynR;

    public d9(e9 e9Var, E7jCp8Ls e7jCp8Ls) {
        this.mE4lRynR = e9Var;
        this.Y6hRI1cF8 = e7jCp8Ls;
        e9Var.OOA6hdeuvCS = this;
    }

    @Override // defpackage.go
    public final void DmJncFq5(i60 i60Var) {
        boolean z = this.jivtDDk9H;
        e9 e9Var = this.mE4lRynR;
        if (!z) {
            e9Var.EljAMC1QTz = null;
            w60.cilMamHF(this, new psOJLYhIz(3, this, e9Var));
            if (e9Var.EljAMC1QTz == null) {
                throw mr0.EljAMC1QTz("DrawResult not defined, did you forget to call onDraw?");
            }
            this.jivtDDk9H = true;
        }
        j6IIN2O8eOU j6iin2o8eou = e9Var.EljAMC1QTz;
        j6iin2o8eou.getClass();
        ((hv) j6iin2o8eou.EljAMC1QTz).mOu10nynGul(i60Var);
    }

    @Override // defpackage.xk
    public final void GWasM1elztuh() {
        gqMuANyCes();
    }

    @Override // defpackage.go
    public final void Qd9Q8OZgvOo4() {
        gqMuANyCes();
    }

    @Override // defpackage.sk0
    public final void YZjbz8VdP5() {
        gqMuANyCes();
    }

    @Override // defpackage.s8
    public final el Yi7zF1RB1() {
        return vc0.eUH21U3apd(this).M3K9sHhK;
    }

    @Override // defpackage.he0
    public final void gHe2tSmr6w() {
        gqMuANyCes();
    }

    @Override // defpackage.s8
    public final p50 getLayoutDirection() {
        return vc0.eUH21U3apd(this).k8h8IjolWQ;
    }

    public final void gqMuANyCes() {
        this.jivtDDk9H = false;
        this.mE4lRynR.EljAMC1QTz = null;
        p.uFEq9NpZ(this);
    }

    @Override // defpackage.xk
    public final void iriv6doqetn() {
        gqMuANyCes();
    }

    @Override // defpackage.s8
    public final long xqGvceK5x() {
        return o30.CMh55RymNfS(vc0.AEn1Rrio(this, 4).AvO7iQsrTN);
    }

    @Override // defpackage.he0
    public final void bCsSzSHkbaQ() {
    }
}
