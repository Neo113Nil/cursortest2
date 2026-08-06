package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class uf1 extends AnimatorListenerAdapter {
    public final /* synthetic */ bg1 GWasM1elztuh;
    public final /* synthetic */ View Yi7zF1RB1;

    public uf1(bg1 bg1Var, View view) {
        this.GWasM1elztuh = bg1Var;
        this.Yi7zF1RB1 = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        bg1 bg1Var = this.GWasM1elztuh;
        bg1Var.GWasM1elztuh.OOA6hdeuvCS(1.0f);
        xf1.EljAMC1QTz(bg1Var, this.Yi7zF1RB1);
    }
}
