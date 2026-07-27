package t0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: t0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5040c extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40673a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC5032P f40674b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f40675c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f40676d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C5045h f40677e;

    public C5040c(C5045h c5045h, AbstractC5032P abstractC5032P, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f40677e = c5045h;
        this.f40674b = abstractC5032P;
        this.f40676d = viewPropertyAnimator;
        this.f40675c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f40673a) {
            case 1:
                this.f40675c.setAlpha(1.0f);
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f40673a) {
            case 0:
                this.f40676d.setListener(null);
                this.f40675c.setAlpha(1.0f);
                C5045h c5045h = this.f40677e;
                AbstractC5032P abstractC5032P = this.f40674b;
                c5045h.c(abstractC5032P);
                c5045h.f40710q.remove(abstractC5032P);
                c5045h.i();
                break;
            default:
                this.f40676d.setListener(null);
                C5045h c5045h2 = this.f40677e;
                AbstractC5032P abstractC5032P2 = this.f40674b;
                c5045h2.c(abstractC5032P2);
                c5045h2.f40708o.remove(abstractC5032P2);
                c5045h2.i();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f40673a) {
            case 0:
                this.f40677e.getClass();
                break;
            default:
                this.f40677e.getClass();
                break;
        }
    }

    public C5040c(C5045h c5045h, AbstractC5032P abstractC5032P, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f40677e = c5045h;
        this.f40674b = abstractC5032P;
        this.f40675c = view;
        this.f40676d = viewPropertyAnimator;
    }
}
