package com.gamericefishpro.space.i6;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import com.gamericefishpro.space.R;
import com.gamericefishpro.space.d4.l0;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 extends AnimatorListenerAdapter implements m {
    public final ViewGroup a;
    public final View b;
    public final View c;
    public boolean d = true;
    public final /* synthetic */ h e;

    public b0(h hVar, ViewGroup viewGroup, View view, View view2) {
        this.e = hVar;
        this.a = viewGroup;
        this.b = view;
        this.c = view2;
    }

    @Override // com.gamericefishpro.space.i6.m
    public final void d(o oVar) {
        oVar.z(this);
    }

    @Override // com.gamericefishpro.space.i6.m
    public final void e(o oVar) {
        if (this.d) {
            g();
        }
    }

    public final void g() {
        this.c.setTag(R.id.save_overlay_view, null);
        this.a.getOverlay().remove(this.b);
        this.d = false;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        g();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        this.a.getOverlay().remove(this.b);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        View view = this.b;
        if (view.getParent() == null) {
            l0.a(this.a, view);
        } else {
            this.e.c();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z) {
        if (z) {
            View view = this.c;
            View view2 = this.b;
            view.setTag(R.id.save_overlay_view, view2);
            l0.a(this.a, view2);
            this.d = true;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        if (z) {
            return;
        }
        g();
    }

    @Override // com.gamericefishpro.space.i6.m
    public final void b() {
    }

    @Override // com.gamericefishpro.space.i6.m
    public final void c() {
    }

    @Override // com.gamericefishpro.space.i6.m
    public final void f(o oVar) {
    }
}
