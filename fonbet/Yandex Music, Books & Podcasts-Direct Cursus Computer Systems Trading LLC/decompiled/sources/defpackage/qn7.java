package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* loaded from: classes.dex */
public final class qn7 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ rn7 b;
    public final /* synthetic */ ViewPropertyAnimator c;
    public final /* synthetic */ View d;
    public final /* synthetic */ tn7 e;

    public /* synthetic */ qn7(tn7 tn7Var, rn7 rn7Var, ViewPropertyAnimator viewPropertyAnimator, View view, int i) {
        this.a = i;
        this.e = tn7Var;
        this.b = rn7Var;
        this.c = viewPropertyAnimator;
        this.d = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.c.setListener(null);
                View view = this.d;
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                rn7 rn7Var = this.b;
                opn opnVar = rn7Var.a;
                tn7 tn7Var = this.e;
                tn7Var.c(opnVar);
                tn7Var.r.remove(rn7Var.a);
                tn7Var.i();
                break;
            default:
                this.c.setListener(null);
                View view2 = this.d;
                view2.setAlpha(1.0f);
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                rn7 rn7Var2 = this.b;
                opn opnVar2 = rn7Var2.b;
                tn7 tn7Var2 = this.e;
                tn7Var2.c(opnVar2);
                tn7Var2.r.remove(rn7Var2.b);
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
}
