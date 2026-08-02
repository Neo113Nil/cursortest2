package t0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: t0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5007c extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40701a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC5000P f40702b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f40703c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f40704d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C5012h f40705e;

    public C5007c(C5012h c5012h, AbstractC5000P abstractC5000P, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f40705e = c5012h;
        this.f40702b = abstractC5000P;
        this.f40704d = viewPropertyAnimator;
        this.f40703c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f40701a) {
            case 1:
                this.f40703c.setAlpha(1.0f);
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f40701a) {
            case 0:
                this.f40704d.setListener(null);
                this.f40703c.setAlpha(1.0f);
                C5012h c5012h = this.f40705e;
                AbstractC5000P abstractC5000P = this.f40702b;
                c5012h.c(abstractC5000P);
                c5012h.f40738q.remove(abstractC5000P);
                c5012h.i();
                break;
            default:
                this.f40704d.setListener(null);
                C5012h c5012h2 = this.f40705e;
                AbstractC5000P abstractC5000P2 = this.f40702b;
                c5012h2.c(abstractC5000P2);
                c5012h2.f40736o.remove(abstractC5000P2);
                c5012h2.i();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f40701a) {
            case 0:
                this.f40705e.getClass();
                break;
            default:
                this.f40705e.getClass();
                break;
        }
    }

    public C5007c(C5012h c5012h, AbstractC5000P abstractC5000P, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f40705e = c5012h;
        this.f40702b = abstractC5000P;
        this.f40703c = view;
        this.f40704d = viewPropertyAnimator;
    }
}
