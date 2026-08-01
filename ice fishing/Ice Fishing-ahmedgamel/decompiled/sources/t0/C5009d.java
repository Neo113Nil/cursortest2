package t0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: t0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5009d extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC5003S f40656a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f40657b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f40658c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f40659d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f40660e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C5013h f40661f;

    public C5009d(C5013h c5013h, AbstractC5003S abstractC5003S, int i, View view, int i6, ViewPropertyAnimator viewPropertyAnimator) {
        this.f40661f = c5013h;
        this.f40656a = abstractC5003S;
        this.f40657b = i;
        this.f40658c = view;
        this.f40659d = i6;
        this.f40660e = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = this.f40657b;
        View view = this.f40658c;
        if (i != 0) {
            view.setTranslationX(0.0f);
        }
        if (this.f40659d != 0) {
            view.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f40660e.setListener(null);
        C5013h c5013h = this.f40661f;
        AbstractC5003S abstractC5003S = this.f40656a;
        c5013h.c(abstractC5003S);
        c5013h.f40687p.remove(abstractC5003S);
        c5013h.i();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f40661f.getClass();
    }
}
