package com.gamericefishpro.space.na;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.n.i0;
import com.gamericefishpro.space.r5.m0;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class r extends AnimatorListenerAdapter {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ View d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public r(t tVar, int i, TextView textView, int i2, TextView textView2) {
        this.f = tVar;
        this.b = i;
        this.d = textView;
        this.c = i2;
        this.e = textView2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 1:
                int i = this.b;
                View view = this.d;
                if (i != 0) {
                    view.setTranslationX(0.0f);
                }
                if (this.c != 0) {
                    view.setTranslationY(0.0f);
                }
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        i0 i0Var;
        switch (this.a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                TextView textView = (TextView) this.e;
                t tVar = (t) this.f;
                tVar.n = this.b;
                tVar.l = null;
                TextView textView2 = (TextView) this.d;
                if (textView2 != null) {
                    textView2.setVisibility(4);
                    if (this.c == 1 && (i0Var = tVar.r) != null) {
                        i0Var.setText((CharSequence) null);
                    }
                }
                if (textView != null) {
                    textView.setTranslationY(0.0f);
                    textView.setAlpha(1.0f);
                }
                break;
            default:
                ((ViewPropertyAnimator) this.e).setListener(null);
                com.gamericefishpro.space.r5.g gVar = (com.gamericefishpro.space.r5.g) this.f;
                gVar.a(null);
                gVar.p.remove((Object) null);
                gVar.f();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                TextView textView = (TextView) this.e;
                if (textView != null) {
                    textView.setVisibility(0);
                    textView.setAlpha(0.0f);
                }
                break;
            default:
                ((com.gamericefishpro.space.r5.g) this.f).getClass();
                break;
        }
    }

    public r(com.gamericefishpro.space.r5.g gVar, m0 m0Var, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
        this.f = gVar;
        this.b = i;
        this.d = view;
        this.c = i2;
        this.e = viewPropertyAnimator;
    }
}
