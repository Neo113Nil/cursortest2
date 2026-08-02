package t0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: t0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5008d extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC5000P f40706a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f40707b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f40708c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f40709d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f40710e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C5012h f40711f;

    public C5008d(C5012h c5012h, AbstractC5000P abstractC5000P, int i, View view, int i4, ViewPropertyAnimator viewPropertyAnimator) {
        this.f40711f = c5012h;
        this.f40706a = abstractC5000P;
        this.f40707b = i;
        this.f40708c = view;
        this.f40709d = i4;
        this.f40710e = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = this.f40707b;
        View view = this.f40708c;
        if (i != 0) {
            view.setTranslationX(0.0f);
        }
        if (this.f40709d != 0) {
            view.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f40710e.setListener(null);
        C5012h c5012h = this.f40711f;
        AbstractC5000P abstractC5000P = this.f40706a;
        c5012h.c(abstractC5000P);
        c5012h.f40737p.remove(abstractC5000P);
        c5012h.i();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f40711f.getClass();
    }
}
