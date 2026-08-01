package k0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: k0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0192f extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3479a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b0 f3480b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f3481c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f3482d;
    public final /* synthetic */ C0197k e;

    public C0192f(C0197k c0197k, b0 b0Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.e = c0197k;
        this.f3480b = b0Var;
        this.f3482d = viewPropertyAnimator;
        this.f3481c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f3479a) {
            case 1:
                this.f3481c.setAlpha(1.0f);
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f3479a) {
            case 0:
                this.f3482d.setListener(null);
                this.f3481c.setAlpha(1.0f);
                C0197k c0197k = this.e;
                b0 b0Var = this.f3480b;
                c0197k.c(b0Var);
                c0197k.f3533q.remove(b0Var);
                c0197k.i();
                break;
            default:
                this.f3482d.setListener(null);
                C0197k c0197k2 = this.e;
                b0 b0Var2 = this.f3480b;
                c0197k2.c(b0Var2);
                c0197k2.f3531o.remove(b0Var2);
                c0197k2.i();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f3479a) {
            case 0:
                this.e.getClass();
                break;
            default:
                this.e.getClass();
                break;
        }
    }

    public C0192f(C0197k c0197k, b0 b0Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.e = c0197k;
        this.f3480b = b0Var;
        this.f3481c = view;
        this.f3482d = viewPropertyAnimator;
    }
}
