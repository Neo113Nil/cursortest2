package t0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: t0.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5047j extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public boolean f40713a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C5048k f40714b;

    public C5047j(C5048k c5048k) {
        this.f40714b = c5048k;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f40713a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.f40713a) {
            this.f40713a = false;
            return;
        }
        C5048k c5048k = this.f40714b;
        if (((Float) c5048k.f40743z.getAnimatedValue()).floatValue() == 0.0f) {
            c5048k.f40717A = 0;
            c5048k.f(0);
        } else {
            c5048k.f40717A = 2;
            c5048k.f40736s.invalidate();
        }
    }
}
