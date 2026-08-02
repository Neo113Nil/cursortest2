package t0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: t0.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5014j extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public boolean f40741a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C5015k f40742b;

    public C5014j(C5015k c5015k) {
        this.f40742b = c5015k;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f40741a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.f40741a) {
            this.f40741a = false;
            return;
        }
        C5015k c5015k = this.f40742b;
        if (((Float) c5015k.f40771z.getAnimatedValue()).floatValue() == 0.0f) {
            c5015k.f40745A = 0;
            c5015k.f(0);
        } else {
            c5015k.f40745A = 2;
            c5015k.f40764s.invalidate();
        }
    }
}
