package defpackage;

import android.animation.Animator;

/* loaded from: classes3.dex */
public final class ahg implements Animator.AnimatorListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ mmo b;

    public /* synthetic */ ahg(mmo mmoVar, int i) {
        this.a = i;
        this.b = mmoVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        animator.getClass();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.a;
        animator.getClass();
        switch (i) {
            case 0:
                this.b.d = null;
                break;
            default:
                this.b.c = null;
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        animator.getClass();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        animator.getClass();
    }
}
