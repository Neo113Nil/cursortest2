package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.DecelerateInterpolator;
import androidx.recyclerview.widget.h;
import androidx.recyclerview.widget.x0;
import defpackage.y8b0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.b;

/* loaded from: classes3.dex */
public final class y8b0 extends h {
    public static final DecelerateInterpolator u = new DecelerateInterpolator();
    public final LinkedHashMap t;

    public y8b0() {
        this.f = 250L;
        this.e = 250L;
        this.t = new LinkedHashMap();
    }

    public static float A(View view) {
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        return (viewGroup != null ? viewGroup.getWidth() : view.getWidth()) + (viewGroup != null ? viewGroup.getPaddingEnd() : view.getPaddingEnd());
    }

    public static final void z(y8b0 y8b0Var, View view) {
        y8b0Var.getClass();
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        view.setScaleX(1.0f);
        view.setAlpha(1.0f);
    }

    @Override // androidx.recyclerview.widget.b1, androidx.recyclerview.widget.RecyclerView.c
    public final boolean f(x0 x0Var) {
        return true;
    }

    @Override // androidx.recyclerview.widget.h, androidx.recyclerview.widget.RecyclerView.c
    public final void j(x0 x0Var) {
        Animator animator = (Animator) this.t.remove(x0Var);
        if (animator != null) {
            animator.end();
        }
        super.j(x0Var);
    }

    @Override // androidx.recyclerview.widget.h, androidx.recyclerview.widget.RecyclerView.c
    public final void k() {
        LinkedHashMap linkedHashMap = this.t;
        Map t = b.t(linkedHashMap);
        linkedHashMap.clear();
        Iterator it = t.values().iterator();
        while (it.hasNext()) {
            ((Animator) it.next()).end();
        }
        super.k();
    }

    @Override // androidx.recyclerview.widget.h, androidx.recyclerview.widget.RecyclerView.c
    public final boolean m() {
        return super.m() || !this.t.isEmpty();
    }

    @Override // androidx.recyclerview.widget.h, androidx.recyclerview.widget.b1
    public final boolean o(final x0 x0Var) {
        j(x0Var);
        final View view = x0Var.a;
        float A = A(view);
        view.setTranslationX(A);
        view.setAlpha(0.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_X, A, 0.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f));
        animatorSet.setDuration(this.c);
        animatorSet.setInterpolator(u);
        animatorSet.setStartDelay(this.d);
        animatorSet.addListener(new AnimatorListenerAdapter() { // from class: com.ybsdk.feature.pfm.internal.ui.animators.PfmCategoriesItemAnimator$animateAdd$animatorSet$1$1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animation) {
                y8b0.this.t.remove(x0Var);
                View view2 = view;
                y8b0 y8b0Var = y8b0.this;
                x0 x0Var2 = x0Var;
                if (view2.isAttachedToWindow()) {
                    y8b0.z(y8b0Var, view2);
                    y8b0Var.s(x0Var2);
                    if (y8b0Var.m()) {
                        return;
                    }
                    y8b0Var.i();
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                y8b0.this.t.remove(x0Var);
                View view2 = view;
                y8b0 y8b0Var = y8b0.this;
                x0 x0Var2 = x0Var;
                if (view2.isAttachedToWindow()) {
                    y8b0.z(y8b0Var, view2);
                    y8b0Var.s(x0Var2);
                    if (y8b0Var.m()) {
                        return;
                    }
                    y8b0Var.i();
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animation) {
                y8b0.this.getClass();
            }
        });
        this.t.put(x0Var, animatorSet);
        animatorSet.start();
        return false;
    }

    @Override // androidx.recyclerview.widget.h, androidx.recyclerview.widget.b1
    public final boolean r(final x0 x0Var) {
        j(x0Var);
        final View view = x0Var.a;
        float A = A(view);
        view.setTranslationX(0.0f);
        view.setAlpha(1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_X, 0.0f, A), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 1.0f, 0.0f));
        animatorSet.setDuration(this.d);
        animatorSet.setInterpolator(u);
        animatorSet.addListener(new AnimatorListenerAdapter() { // from class: com.ybsdk.feature.pfm.internal.ui.animators.PfmCategoriesItemAnimator$animateRemove$animatorSet$1$1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animation) {
                y8b0.this.t.remove(x0Var);
                View view2 = view;
                y8b0 y8b0Var = y8b0.this;
                x0 x0Var2 = x0Var;
                if (view2.isAttachedToWindow()) {
                    y8b0.z(y8b0Var, view2);
                    y8b0Var.h(x0Var2);
                    if (y8b0Var.m()) {
                        return;
                    }
                    y8b0Var.i();
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                y8b0.this.t.remove(x0Var);
                View view2 = view;
                y8b0 y8b0Var = y8b0.this;
                x0 x0Var2 = x0Var;
                if (view2.isAttachedToWindow()) {
                    y8b0.z(y8b0Var, view2);
                    y8b0Var.h(x0Var2);
                    if (y8b0Var.m()) {
                        return;
                    }
                    y8b0Var.i();
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animation) {
                y8b0.this.getClass();
            }
        });
        this.t.put(x0Var, animatorSet);
        animatorSet.start();
        return false;
    }
}
