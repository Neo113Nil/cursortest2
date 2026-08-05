package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class za extends AnimatorListenerAdapter {
    public final /* synthetic */ View MdtA4re8;
    public final /* synthetic */ g20 NCTxEWno;
    public final /* synthetic */ eb VgvYg0wo;
    public final /* synthetic */ int qoPGr6Ce = 1;
    public final /* synthetic */ ViewPropertyAnimator wxUZMvaN;

    public za(eb ebVar, g20 g20Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.VgvYg0wo = ebVar;
        this.NCTxEWno = g20Var;
        this.wxUZMvaN = viewPropertyAnimator;
        this.MdtA4re8 = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.qoPGr6Ce) {
            case 1:
                this.MdtA4re8.setAlpha(1.0f);
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.qoPGr6Ce;
        g20 g20Var = this.NCTxEWno;
        eb ebVar = this.VgvYg0wo;
        ViewPropertyAnimator viewPropertyAnimator = this.wxUZMvaN;
        switch (i) {
            case 0:
                viewPropertyAnimator.setListener(null);
                this.MdtA4re8.setAlpha(1.0f);
                ebVar.MdtA4re8(g20Var);
                ebVar.OxcuoDLp.remove(g20Var);
                ebVar.jb9XjC4I();
                break;
            default:
                viewPropertyAnimator.setListener(null);
                ebVar.MdtA4re8(g20Var);
                ebVar.lDXGDhIF.remove(g20Var);
                ebVar.jb9XjC4I();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.qoPGr6Ce) {
            case 0:
                this.VgvYg0wo.getClass();
                break;
            default:
                this.VgvYg0wo.getClass();
                break;
        }
    }

    public za(eb ebVar, g20 g20Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.VgvYg0wo = ebVar;
        this.NCTxEWno = g20Var;
        this.MdtA4re8 = view;
        this.wxUZMvaN = viewPropertyAnimator;
    }
}
