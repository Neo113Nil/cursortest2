package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class qbl extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ sbl b;

    public /* synthetic */ qbl(sbl sblVar, int i) {
        this.a = i;
        this.b = sblVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                sbl sblVar = this.b;
                View view = sblVar.b;
                if (view != null) {
                    view.setVisibility(4);
                }
                ViewGroup viewGroup = sblVar.c;
                if (viewGroup != null) {
                    viewGroup.setVisibility(4);
                }
                ViewGroup viewGroup2 = sblVar.e;
                if (viewGroup2 != null) {
                    viewGroup2.setVisibility(4);
                    break;
                }
                break;
            case 1:
            default:
                super.onAnimationEnd(animator);
                break;
            case 2:
                this.b.i(0);
                break;
            case 3:
                this.b.i(0);
                break;
            case 4:
                ViewGroup viewGroup3 = this.b.f;
                if (viewGroup3 != null) {
                    viewGroup3.setVisibility(4);
                    break;
                }
                break;
            case 5:
                ViewGroup viewGroup4 = this.b.h;
                if (viewGroup4 != null) {
                    viewGroup4.setVisibility(4);
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        int i = this.a;
        sbl sblVar = this.b;
        switch (i) {
            case 0:
                View view = sblVar.j;
                if ((view instanceof ns7) && !sblVar.A) {
                    ns7 ns7Var = (ns7) view;
                    ValueAnimator valueAnimator = ns7Var.E;
                    if (valueAnimator.isStarted()) {
                        valueAnimator.cancel();
                    }
                    valueAnimator.setFloatValues(ns7Var.F, 0.0f);
                    valueAnimator.setDuration(250L);
                    valueAnimator.start();
                    break;
                }
                break;
            case 1:
                View view2 = sblVar.b;
                if (view2 != null) {
                    view2.setVisibility(0);
                }
                ViewGroup viewGroup = sblVar.c;
                if (viewGroup != null) {
                    viewGroup.setVisibility(0);
                }
                ViewGroup viewGroup2 = sblVar.e;
                if (viewGroup2 != null) {
                    viewGroup2.setVisibility(sblVar.A ? 0 : 4);
                }
                View view3 = sblVar.j;
                if ((view3 instanceof ns7) && !sblVar.A) {
                    ns7 ns7Var2 = (ns7) view3;
                    ValueAnimator valueAnimator2 = ns7Var2.E;
                    if (valueAnimator2.isStarted()) {
                        valueAnimator2.cancel();
                    }
                    ns7Var2.G = false;
                    valueAnimator2.setFloatValues(ns7Var2.F, 1.0f);
                    valueAnimator2.setDuration(250L);
                    valueAnimator2.start();
                    break;
                }
                break;
            case 2:
                sblVar.i(4);
                break;
            case 3:
                sblVar.i(4);
                break;
            case 4:
                ViewGroup viewGroup3 = sblVar.h;
                if (viewGroup3 != null) {
                    viewGroup3.setVisibility(0);
                    viewGroup3.setTranslationX(viewGroup3.getWidth());
                    viewGroup3.scrollTo(viewGroup3.getWidth(), 0);
                    break;
                }
                break;
            default:
                ViewGroup viewGroup4 = sblVar.f;
                if (viewGroup4 != null) {
                    viewGroup4.setVisibility(0);
                    break;
                }
                break;
        }
    }
}
