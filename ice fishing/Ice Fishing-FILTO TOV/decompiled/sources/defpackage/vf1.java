package defpackage;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class vf1 implements Runnable {
    public final /* synthetic */ d AvO7iQsrTN;
    public final /* synthetic */ bg1 EljAMC1QTz;
    public final /* synthetic */ View OOA6hdeuvCS;
    public final /* synthetic */ ValueAnimator encWxUiV2;

    public vf1(View view, bg1 bg1Var, d dVar, ValueAnimator valueAnimator) {
        this.OOA6hdeuvCS = view;
        this.EljAMC1QTz = bg1Var;
        this.AvO7iQsrTN = dVar;
        this.encWxUiV2 = valueAnimator;
    }

    @Override // java.lang.Runnable
    public final void run() {
        xf1.mOu10nynGul(this.OOA6hdeuvCS, this.EljAMC1QTz, this.AvO7iQsrTN);
        this.encWxUiV2.start();
    }
}
