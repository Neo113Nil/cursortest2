package t0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: t0.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5015j extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public boolean f40691a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C5016k f40692b;

    public C5015j(C5016k c5016k) {
        this.f40692b = c5016k;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f40691a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.f40691a) {
            this.f40691a = false;
            return;
        }
        C5016k c5016k = this.f40692b;
        if (((Float) c5016k.f40721z.getAnimatedValue()).floatValue() == 0.0f) {
            c5016k.f40695A = 0;
            c5016k.f(0);
        } else {
            c5016k.f40695A = 2;
            c5016k.f40714s.invalidate();
        }
    }
}
