package t0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: t0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5009e extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40712a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C5010f f40713b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f40714c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ View f40715d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C5012h f40716e;

    public /* synthetic */ C5009e(C5012h c5012h, C5010f c5010f, ViewPropertyAnimator viewPropertyAnimator, View view, int i) {
        this.f40712a = i;
        this.f40716e = c5012h;
        this.f40713b = c5010f;
        this.f40714c = viewPropertyAnimator;
        this.f40715d = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f40712a) {
            case 0:
                this.f40714c.setListener(null);
                View view = this.f40715d;
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                C5010f c5010f = this.f40713b;
                AbstractC5000P abstractC5000P = c5010f.f40717a;
                C5012h c5012h = this.f40716e;
                c5012h.c(abstractC5000P);
                c5012h.f40739r.remove(c5010f.f40717a);
                c5012h.i();
                break;
            default:
                this.f40714c.setListener(null);
                View view2 = this.f40715d;
                view2.setAlpha(1.0f);
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                C5010f c5010f2 = this.f40713b;
                AbstractC5000P abstractC5000P2 = c5010f2.f40718b;
                C5012h c5012h2 = this.f40716e;
                c5012h2.c(abstractC5000P2);
                c5012h2.f40739r.remove(c5010f2.f40718b);
                c5012h2.i();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f40712a) {
            case 0:
                AbstractC5000P abstractC5000P = this.f40713b.f40717a;
                this.f40716e.getClass();
                break;
            default:
                AbstractC5000P abstractC5000P2 = this.f40713b.f40718b;
                this.f40716e.getClass();
                break;
        }
    }
}
