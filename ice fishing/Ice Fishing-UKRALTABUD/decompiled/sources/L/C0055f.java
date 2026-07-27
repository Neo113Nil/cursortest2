package L;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: L.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0055f extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public boolean f618a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0057h f619b;

    public C0055f(C0057h c0057h) {
        this.f619b = c0057h;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f618a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.f618a) {
            this.f618a = false;
            return;
        }
        C0057h c0057h = this.f619b;
        if (((Float) c0057h.f642u.getAnimatedValue()).floatValue() == 0.0f) {
            c0057h.f643v = 0;
            c0057h.e(0);
        } else {
            c0057h.f643v = 2;
            c0057h.f636n.invalidate();
        }
    }
}
