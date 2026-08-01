package k0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: k0.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0199m extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public boolean f3544a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0200n f3545b;

    public C0199m(C0200n c0200n) {
        this.f3545b = c0200n;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f3544a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.f3544a) {
            this.f3544a = false;
            return;
        }
        C0200n c0200n = this.f3545b;
        if (((Float) c0200n.f3572z.getAnimatedValue()).floatValue() == RecyclerView.f2111C0) {
            c0200n.f3548A = 0;
            c0200n.f(0);
        } else {
            c0200n.f3548A = 2;
            c0200n.f3565s.invalidate();
        }
    }
}
