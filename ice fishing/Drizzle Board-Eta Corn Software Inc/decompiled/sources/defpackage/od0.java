package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class od0 extends AnimatorListenerAdapter {
    public final /* synthetic */ rd0 NCTxEWno;
    public final /* synthetic */ x0 qoPGr6Ce;

    public od0(rd0 rd0Var, x0 x0Var) {
        this.NCTxEWno = rd0Var;
        this.qoPGr6Ce = x0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.qoPGr6Ce.remove(animator);
        this.NCTxEWno.sjUBp5pO.remove(animator);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.NCTxEWno.sjUBp5pO.add(animator);
    }
}
