package com.gamericefishpro.space.i6;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.gamericefishpro.space.R;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends AnimatorListenerAdapter implements m {
    public final View a;
    public boolean b = false;

    public g(View view) {
        this.a = view;
    }

    @Override // com.gamericefishpro.space.i6.m
    public final void b() {
        View view = this.a;
        view.setTag(R.id.transition_pause_alpha, Float.valueOf(view.getVisibility() == 0 ? x.a.B(view) : 0.0f));
    }

    @Override // com.gamericefishpro.space.i6.m
    public final void c() {
        this.a.setTag(R.id.transition_pause_alpha, null);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        x.a.N(this.a, 1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        onAnimationEnd(animator, false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        View view = this.a;
        if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
            this.b = true;
            view.setLayerType(2, null);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        boolean z2 = this.b;
        View view = this.a;
        if (z2) {
            view.setLayerType(0, null);
        }
        if (z) {
            return;
        }
        y yVar = x.a;
        yVar.N(view, 1.0f);
        yVar.getClass();
    }

    @Override // com.gamericefishpro.space.i6.m
    public final void a(o oVar) {
    }

    @Override // com.gamericefishpro.space.i6.m
    public final void d(o oVar) {
    }

    @Override // com.gamericefishpro.space.i6.m
    public final void e(o oVar) {
    }

    @Override // com.gamericefishpro.space.i6.m
    public final void f(o oVar) {
    }
}
