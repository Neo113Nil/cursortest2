package defpackage;

import android.animation.Animator;

/* loaded from: classes3.dex */
public final class kls implements Animator.AnimatorListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ tqn b;
    public final /* synthetic */ lls c;

    public /* synthetic */ kls(tqn tqnVar, lls llsVar, int i) {
        this.a = i;
        this.b = tqnVar;
        this.c = llsVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = this.a;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                if (!this.b.a) {
                    this.c.dismissAllowingStateLoss();
                    break;
                }
                break;
            default:
                if (!this.b.a) {
                    this.c.dismissAllowingStateLoss();
                    break;
                }
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        int i = this.a;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        int i = this.a;
    }

    private final void a(Animator animator) {
    }

    private final void b(Animator animator) {
    }

    private final void c(Animator animator) {
    }

    private final void d(Animator animator) {
    }

    private final void e(Animator animator) {
    }

    private final void f(Animator animator) {
    }
}
