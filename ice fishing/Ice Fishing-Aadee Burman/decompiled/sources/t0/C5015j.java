package t0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: t0.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5015j extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public boolean f40688a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C5016k f40689b;

    public C5015j(C5016k c5016k) {
        this.f40689b = c5016k;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f40688a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.f40688a) {
            this.f40688a = false;
            return;
        }
        C5016k c5016k = this.f40689b;
        if (((Float) c5016k.f40718z.getAnimatedValue()).floatValue() == 0.0f) {
            c5016k.f40692A = 0;
            c5016k.f(0);
        } else {
            c5016k.f40692A = 2;
            c5016k.f40711s.invalidate();
        }
    }
}
