package L;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: L.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0030f extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public boolean f540a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0032h f541b;

    public C0030f(C0032h c0032h) {
        this.f541b = c0032h;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f540a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.f540a) {
            this.f540a = false;
            return;
        }
        C0032h c0032h = this.f541b;
        if (((Float) c0032h.f564u.getAnimatedValue()).floatValue() == 0.0f) {
            c0032h.f565v = 0;
            c0032h.e(0);
        } else {
            c0032h.f565v = 2;
            c0032h.f558n.invalidate();
        }
    }
}
