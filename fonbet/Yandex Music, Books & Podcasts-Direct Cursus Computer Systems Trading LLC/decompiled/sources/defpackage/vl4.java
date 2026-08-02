package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* loaded from: classes3.dex */
public final class vl4 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ bm4 b;

    public /* synthetic */ vl4(bm4 bm4Var, int i) {
        this.a = i;
        this.b = bm4Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.b();
                break;
            default:
                bm4 bm4Var = this.b;
                am4 revealInfo = bm4Var.getRevealInfo();
                revealInfo.c = Float.MAX_VALUE;
                bm4Var.setRevealInfo(revealInfo);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.a();
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
