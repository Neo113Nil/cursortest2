package defpackage;

import android.view.View;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final /* synthetic */ class zc1 implements hv {
    public final /* synthetic */ Object AvO7iQsrTN;
    public final /* synthetic */ Object EljAMC1QTz;
    public final /* synthetic */ int OOA6hdeuvCS;

    public /* synthetic */ zc1(int i, Object obj, Object obj2) {
        this.OOA6hdeuvCS = i;
        this.EljAMC1QTz = obj;
        this.AvO7iQsrTN = obj2;
    }

    @Override // defpackage.hv
    public final Object mOu10nynGul(Object obj) {
        int i = this.OOA6hdeuvCS;
        Object obj2 = this.AvO7iQsrTN;
        Object obj3 = this.EljAMC1QTz;
        switch (i) {
            case 0:
                bd1 bd1Var = (bd1) obj3;
                ((Long) obj).getClass();
                float f = bd1Var.OOA6hdeuvCS;
                bd1Var.OOA6hdeuvCS = 0.0f;
                ((hv) obj2).mOu10nynGul(Float.valueOf(f));
                return kc1.GWasM1elztuh;
            default:
                bh1 bh1Var = (bh1) obj3;
                View view = (View) obj2;
                h20 h20Var = bh1Var.cilMamHF;
                if (bh1Var.Y6hRI1cF8 == 0) {
                    int i2 = ne1.GWasM1elztuh;
                    ie1.Yi7zF1RB1(view, h20Var);
                    if (view.isAttachedToWindow()) {
                        view.requestApplyInsets();
                    }
                    view.addOnAttachStateChangeListener(h20Var);
                    ne1.GWasM1elztuh(view, h20Var);
                }
                bh1Var.Y6hRI1cF8++;
                return new wl(7, bh1Var, view);
        }
    }
}
