package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* loaded from: classes.dex */
public final class on7 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ opn b;
    public final /* synthetic */ View c;
    public final /* synthetic */ ViewPropertyAnimator d;
    public final /* synthetic */ tn7 e;

    public on7(tn7 tn7Var, opn opnVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.e = tn7Var;
        this.b = opnVar;
        this.d = viewPropertyAnimator;
        this.c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 1:
                this.c.setAlpha(1.0f);
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.d.setListener(null);
                this.c.setAlpha(1.0f);
                tn7 tn7Var = this.e;
                opn opnVar = this.b;
                tn7Var.c(opnVar);
                tn7Var.q.remove(opnVar);
                tn7Var.i();
                break;
            default:
                this.d.setListener(null);
                tn7 tn7Var2 = this.e;
                opn opnVar2 = this.b;
                tn7Var2.c(opnVar2);
                tn7Var2.o.remove(opnVar2);
                tn7Var2.i();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                this.e.getClass();
                break;
            default:
                this.e.getClass();
                break;
        }
    }

    public on7(tn7 tn7Var, opn opnVar, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.e = tn7Var;
        this.b = opnVar;
        this.c = view;
        this.d = viewPropertyAnimator;
    }
}
