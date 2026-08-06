package defpackage;

import android.os.Build;
import android.view.View;
import java.util.List;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class h20 extends mb implements Runnable, xk0, View.OnAttachStateChangeListener {
    public final bh1 AvO7iQsrTN;
    public wg1 JFJ3QoxA;
    public boolean encWxUiV2;
    public boolean mOu10nynGul;

    public h20(bh1 bh1Var) {
        super(!bh1Var.jivtDDk9H ? 1 : 0);
        this.AvO7iQsrTN = bh1Var;
    }

    @Override // defpackage.mb
    public final wg1 AvO7iQsrTN(wg1 wg1Var, List list) {
        bh1 bh1Var = this.AvO7iQsrTN;
        bh1.GWasM1elztuh(bh1Var, wg1Var);
        return bh1Var.jivtDDk9H ? wg1.Yi7zF1RB1 : wg1Var;
    }

    @Override // defpackage.mb
    public final void EljAMC1QTz(bg1 bg1Var) {
        this.encWxUiV2 = true;
        this.mOu10nynGul = true;
    }

    @Override // defpackage.xk0
    public final wg1 GWasM1elztuh(View view, wg1 wg1Var) {
        this.JFJ3QoxA = wg1Var;
        bh1 bh1Var = this.AvO7iQsrTN;
        kd1 kd1Var = bh1Var.Mjvvu5DE;
        sg1 sg1Var = wg1Var.GWasM1elztuh;
        kd1Var.EljAMC1QTz(d70.TpUsjqg3bxO(sg1Var.encWxUiV2(8)));
        if (this.encWxUiV2) {
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
            }
        } else if (!this.mOu10nynGul) {
            bh1Var.mE4lRynR.EljAMC1QTz(d70.TpUsjqg3bxO(sg1Var.encWxUiV2(8)));
            bh1.GWasM1elztuh(bh1Var, wg1Var);
        }
        return bh1Var.jivtDDk9H ? wg1.Yi7zF1RB1 : wg1Var;
    }

    @Override // defpackage.mb
    public final void OOA6hdeuvCS(bg1 bg1Var) {
        this.encWxUiV2 = false;
        this.mOu10nynGul = false;
        wg1 wg1Var = this.JFJ3QoxA;
        if (bg1Var.GWasM1elztuh.Yi7zF1RB1() > 0 && wg1Var != null) {
            sg1 sg1Var = wg1Var.GWasM1elztuh;
            bh1 bh1Var = this.AvO7iQsrTN;
            bh1Var.mE4lRynR.EljAMC1QTz(d70.TpUsjqg3bxO(sg1Var.encWxUiV2(8)));
            bh1Var.Mjvvu5DE.EljAMC1QTz(d70.TpUsjqg3bxO(sg1Var.encWxUiV2(8)));
            bh1.GWasM1elztuh(bh1Var, wg1Var);
        }
        this.JFJ3QoxA = null;
    }

    @Override // defpackage.mb
    public final d encWxUiV2(bg1 bg1Var, d dVar) {
        this.encWxUiV2 = false;
        return dVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.requestApplyInsets();
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.encWxUiV2) {
            this.encWxUiV2 = false;
            this.mOu10nynGul = false;
            wg1 wg1Var = this.JFJ3QoxA;
            if (wg1Var != null) {
                bh1 bh1Var = this.AvO7iQsrTN;
                bh1Var.mE4lRynR.EljAMC1QTz(d70.TpUsjqg3bxO(wg1Var.GWasM1elztuh.encWxUiV2(8)));
                bh1.GWasM1elztuh(bh1Var, wg1Var);
                this.JFJ3QoxA = null;
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
