package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class ab extends AnimatorListenerAdapter {
    public final /* synthetic */ View MdtA4re8;
    public final /* synthetic */ int NCTxEWno;
    public final /* synthetic */ eb P7K7Inc8;
    public final /* synthetic */ ViewPropertyAnimator VgvYg0wo;
    public final /* synthetic */ g20 qoPGr6Ce;
    public final /* synthetic */ int wxUZMvaN;

    public ab(eb ebVar, g20 g20Var, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
        this.P7K7Inc8 = ebVar;
        this.qoPGr6Ce = g20Var;
        this.NCTxEWno = i;
        this.MdtA4re8 = view;
        this.wxUZMvaN = i2;
        this.VgvYg0wo = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = this.NCTxEWno;
        View view = this.MdtA4re8;
        if (i != 0) {
            view.setTranslationX(0.0f);
        }
        if (this.wxUZMvaN != 0) {
            view.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.VgvYg0wo.setListener(null);
        eb ebVar = this.P7K7Inc8;
        g20 g20Var = this.qoPGr6Ce;
        ebVar.MdtA4re8(g20Var);
        ebVar.sjUBp5pO.remove(g20Var);
        ebVar.jb9XjC4I();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.P7K7Inc8.getClass();
    }
}
