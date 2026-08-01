package t0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: t0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5010e extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40662a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C5011f f40663b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f40664c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ View f40665d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C5013h f40666e;

    public /* synthetic */ C5010e(C5013h c5013h, C5011f c5011f, ViewPropertyAnimator viewPropertyAnimator, View view, int i) {
        this.f40662a = i;
        this.f40666e = c5013h;
        this.f40663b = c5011f;
        this.f40664c = viewPropertyAnimator;
        this.f40665d = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f40662a) {
            case 0:
                this.f40664c.setListener(null);
                View view = this.f40665d;
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                C5011f c5011f = this.f40663b;
                AbstractC5003S abstractC5003S = c5011f.f40667a;
                C5013h c5013h = this.f40666e;
                c5013h.c(abstractC5003S);
                c5013h.f40689r.remove(c5011f.f40667a);
                c5013h.i();
                break;
            default:
                this.f40664c.setListener(null);
                View view2 = this.f40665d;
                view2.setAlpha(1.0f);
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                C5011f c5011f2 = this.f40663b;
                AbstractC5003S abstractC5003S2 = c5011f2.f40668b;
                C5013h c5013h2 = this.f40666e;
                c5013h2.c(abstractC5003S2);
                c5013h2.f40689r.remove(c5011f2.f40668b);
                c5013h2.i();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f40662a) {
            case 0:
                AbstractC5003S abstractC5003S = this.f40663b.f40667a;
                this.f40666e.getClass();
                break;
            default:
                AbstractC5003S abstractC5003S2 = this.f40663b.f40668b;
                this.f40666e.getClass();
                break;
        }
    }
}
