package defpackage;

/* loaded from: classes.dex */
public final class aq1 implements defpackage.eh, defpackage.sd0 {
    public boolean AARZUJiTa;
    public defpackage.xd0 EXtogiMhuM;
    public final defpackage.v0 adDC3e2L;
    public defpackage.k00 riuEU0zW4 = defpackage.bg.IHQe1A4L2xu;
    public final defpackage.kh xiZrDbcSW0;

    public aq1(defpackage.v0 v0Var, defpackage.kh khVar) {
        this.adDC3e2L = v0Var;
        this.xiZrDbcSW0 = khVar;
    }

    public final void IHQe1A4L2xu() {
        if (!this.AARZUJiTa) {
            this.AARZUJiTa = true;
            this.adDC3e2L.getView().setTag(com.combinations.spin.balbi.R.id.wrapped_composition_tag, null);
            defpackage.xd0 xd0Var = this.EXtogiMhuM;
            if (xd0Var != null) {
                xd0Var.xiZrDbcSW0(this);
            }
            this.EXtogiMhuM = null;
        }
        this.xiZrDbcSW0.DFo87pBq1E5();
    }

    public final void r1MBDhnF(defpackage.k00 k00Var) {
        this.adDC3e2L.setOnReadyForComposition(new defpackage.m3(6, this, k00Var));
    }

    @Override // defpackage.sd0
    public final void riuEU0zW4(defpackage.ud0 ud0Var, defpackage.md0 md0Var) {
        if (md0Var == defpackage.md0.ON_DESTROY) {
            IHQe1A4L2xu();
        } else {
            if (md0Var != defpackage.md0.ON_CREATE || this.AARZUJiTa) {
                return;
            }
            r1MBDhnF(this.riuEU0zW4);
        }
    }
}
