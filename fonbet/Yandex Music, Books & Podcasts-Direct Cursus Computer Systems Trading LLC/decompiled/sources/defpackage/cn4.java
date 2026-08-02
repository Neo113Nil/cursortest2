package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* loaded from: classes3.dex */
public final class cn4 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ dn4 b;

    public /* synthetic */ cn4(dn4 dn4Var, int i) {
        this.a = i;
        this.b = dn4Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 1:
                this.b.b.g(false);
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.b.g(true);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
