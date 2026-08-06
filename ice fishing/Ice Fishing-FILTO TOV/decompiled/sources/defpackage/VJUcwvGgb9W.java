package defpackage;

import android.graphics.Rect;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class VJUcwvGgb9W extends o5 implements jt {
    public final c AvO7iQsrTN;
    public boolean E7jCp8Ls;
    public final g01 EljAMC1QTz;
    public final AutofillId JFJ3QoxA;
    public final j6IIN2O8eOU OOA6hdeuvCS;
    public final mt0 encWxUiV2;
    public final String mOu10nynGul;
    public final sf0 rQPn8YBR;

    public VJUcwvGgb9W(j6IIN2O8eOU j6iin2o8eou, g01 g01Var, c cVar, mt0 mt0Var, String str) {
        this.OOA6hdeuvCS = j6iin2o8eou;
        this.EljAMC1QTz = g01Var;
        this.AvO7iQsrTN = cVar;
        this.encWxUiV2 = mt0Var;
        this.mOu10nynGul = str;
        new Rect();
        cVar.setImportantForAutofill(1);
        iriv6doqetn XnEVoBF0td1l = w60.XnEVoBF0td1l(cVar);
        AutofillId GWasM1elztuh = XnEVoBF0td1l != null ? n5.GWasM1elztuh(XnEVoBF0td1l.GWasM1elztuh) : null;
        if (GWasM1elztuh == null) {
            throw mr0.EljAMC1QTz("Required value was null.");
        }
        this.JFJ3QoxA = GWasM1elztuh;
        this.rQPn8YBR = new sf0();
    }

    @Override // defpackage.jt
    public final void xqGvceK5x(rt rtVar, rt rtVar2) {
        g60 eUH21U3apd;
        zz0 WdrkLMV3xh;
        g60 eUH21U3apd2;
        zz0 WdrkLMV3xh2;
        if (rtVar != null && (eUH21U3apd2 = vc0.eUH21U3apd(rtVar)) != null && (WdrkLMV3xh2 = eUH21U3apd2.WdrkLMV3xh()) != null) {
            hg0 hg0Var = WdrkLMV3xh2.OOA6hdeuvCS;
            if (hg0Var.Yi7zF1RB1(yz0.AvO7iQsrTN) || hg0Var.Yi7zF1RB1(yz0.encWxUiV2)) {
                ((AutofillManager) this.OOA6hdeuvCS.EljAMC1QTz).notifyViewExited(this.AvO7iQsrTN, eUH21U3apd2.EljAMC1QTz);
            }
        }
        if (rtVar2 == null || (eUH21U3apd = vc0.eUH21U3apd(rtVar2)) == null || (WdrkLMV3xh = eUH21U3apd.WdrkLMV3xh()) == null) {
            return;
        }
        hg0 hg0Var2 = WdrkLMV3xh.OOA6hdeuvCS;
        if (hg0Var2.Yi7zF1RB1(yz0.AvO7iQsrTN) || hg0Var2.Yi7zF1RB1(yz0.encWxUiV2)) {
            int i = eUH21U3apd.EljAMC1QTz;
            this.encWxUiV2.Yi7zF1RB1.AvO7iQsrTN(i, new wc9Ja9tFnR(this, i));
        }
    }
}
