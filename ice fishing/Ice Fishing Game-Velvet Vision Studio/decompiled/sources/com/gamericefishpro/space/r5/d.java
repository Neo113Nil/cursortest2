package com.gamericefishpro.space.r5;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import com.android.installreferrer.api.InstallReferrerClient;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;
    public final /* synthetic */ ViewPropertyAnimator c;
    public final /* synthetic */ g d;

    public /* synthetic */ d(g gVar, Object obj, ViewPropertyAnimator viewPropertyAnimator, View view, int i) {
        this.a = i;
        this.d = gVar;
        this.c = viewPropertyAnimator;
        this.b = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 1:
                this.b.setAlpha(1.0f);
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                this.c.setListener(null);
                this.b.setAlpha(1.0f);
                g gVar = this.d;
                gVar.a(null);
                gVar.q.remove((Object) null);
                gVar.f();
                break;
            case 1:
                this.c.setListener(null);
                g gVar2 = this.d;
                gVar2.a(null);
                gVar2.o.remove((Object) null);
                gVar2.f();
                break;
            case 2:
                this.c.setListener(null);
                View view = this.b;
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                g gVar3 = this.d;
                gVar3.a(null);
                gVar3.r.remove((Object) null);
                gVar3.f();
                break;
            default:
                this.c.setListener(null);
                View view2 = this.b;
                view2.setAlpha(1.0f);
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                g gVar4 = this.d;
                gVar4.a(null);
                gVar4.r.remove((Object) null);
                gVar4.f();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                this.d.getClass();
                break;
            case 1:
                this.d.getClass();
                break;
            case 2:
                this.d.getClass();
                break;
            default:
                this.d.getClass();
                break;
        }
    }

    public d(g gVar, m0 m0Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.a = 1;
        this.d = gVar;
        this.b = view;
        this.c = viewPropertyAnimator;
    }
}
