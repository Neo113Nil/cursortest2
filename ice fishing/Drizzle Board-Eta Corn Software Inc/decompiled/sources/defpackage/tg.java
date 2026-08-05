package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class tg extends AnimatorListenerAdapter {
    public final /* synthetic */ ug NCTxEWno;
    public boolean qoPGr6Ce = false;

    public tg(ug ugVar) {
        this.NCTxEWno = ugVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.qoPGr6Ce = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.qoPGr6Ce) {
            this.qoPGr6Ce = false;
            return;
        }
        ug ugVar = this.NCTxEWno;
        if (((Float) ugVar.DK9slbsy.getAnimatedValue()).floatValue() == 0.0f) {
            ugVar.lwWCatUu = 0;
            ugVar.wxUZMvaN(0);
        } else {
            ugVar.lwWCatUu = 2;
            ugVar.KlHjfFWx.invalidate();
        }
    }
}
