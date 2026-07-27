package t0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: t0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5008c extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40648a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC5003S f40649b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f40650c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f40651d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C5013h f40652e;

    public C5008c(C5013h c5013h, AbstractC5003S abstractC5003S, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f40652e = c5013h;
        this.f40649b = abstractC5003S;
        this.f40651d = viewPropertyAnimator;
        this.f40650c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f40648a) {
            case 1:
                this.f40650c.setAlpha(1.0f);
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f40648a) {
            case 0:
                this.f40651d.setListener(null);
                this.f40650c.setAlpha(1.0f);
                C5013h c5013h = this.f40652e;
                AbstractC5003S abstractC5003S = this.f40649b;
                c5013h.c(abstractC5003S);
                c5013h.f40685q.remove(abstractC5003S);
                c5013h.i();
                break;
            default:
                this.f40651d.setListener(null);
                C5013h c5013h2 = this.f40652e;
                AbstractC5003S abstractC5003S2 = this.f40649b;
                c5013h2.c(abstractC5003S2);
                c5013h2.f40683o.remove(abstractC5003S2);
                c5013h2.i();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f40648a) {
            case 0:
                this.f40652e.getClass();
                break;
            default:
                this.f40652e.getClass();
                break;
        }
    }

    public C5008c(C5013h c5013h, AbstractC5003S abstractC5003S, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f40652e = c5013h;
        this.f40649b = abstractC5003S;
        this.f40650c = view;
        this.f40651d = viewPropertyAnimator;
    }
}
