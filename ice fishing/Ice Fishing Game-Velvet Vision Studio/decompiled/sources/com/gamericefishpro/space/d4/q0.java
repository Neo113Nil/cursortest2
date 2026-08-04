package com.gamericefishpro.space.d4;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.android.installreferrer.api.InstallReferrerClient;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class q0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public q0(View view, x0 x0Var) {
        this.b = x0Var;
        this.c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                x0 x0Var = (x0) this.b;
                x0Var.a.e(1.0f);
                t0.f((View) this.c, x0Var);
                break;
            default:
                ((com.gamericefishpro.space.t.e) this.b).remove(animator);
                ((com.gamericefishpro.space.i6.o) this.c).G.remove(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 1:
                ((com.gamericefishpro.space.i6.o) this.c).G.add(animator);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public q0(com.gamericefishpro.space.i6.o oVar, com.gamericefishpro.space.t.e eVar) {
        this.c = oVar;
        this.b = eVar;
    }
}
