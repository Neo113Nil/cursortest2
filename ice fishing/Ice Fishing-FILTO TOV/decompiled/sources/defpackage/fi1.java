package defpackage;

import com.combinations.level.experts.R;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class fi1 implements xe, r90 {
    public boolean AvO7iQsrTN;
    public final df EljAMC1QTz;
    public final c OOA6hdeuvCS;
    public w90 encWxUiV2;
    public lv mOu10nynGul = td.GWasM1elztuh;

    public fi1(c cVar, df dfVar) {
        this.OOA6hdeuvCS = cVar;
        this.EljAMC1QTz = dfVar;
    }

    public final void EljAMC1QTz(lv lvVar) {
        this.OOA6hdeuvCS.setOnReadyForComposition(new w1(5, this, lvVar));
    }

    @Override // defpackage.r90
    public final void OOA6hdeuvCS(t90 t90Var, l90 l90Var) {
        if (l90Var == l90.ON_DESTROY) {
            xqGvceK5x();
        } else {
            if (l90Var != l90.ON_CREATE || this.AvO7iQsrTN) {
                return;
            }
            EljAMC1QTz(this.mOu10nynGul);
        }
    }

    public final void xqGvceK5x() {
        if (!this.AvO7iQsrTN) {
            this.AvO7iQsrTN = true;
            this.OOA6hdeuvCS.getView().setTag(R.id.wrapped_composition_tag, null);
            w90 w90Var = this.encWxUiV2;
            if (w90Var != null) {
                w90Var.EljAMC1QTz(this);
            }
            this.encWxUiV2 = null;
        }
        this.EljAMC1QTz.XnEVoBF0td1l();
    }
}
