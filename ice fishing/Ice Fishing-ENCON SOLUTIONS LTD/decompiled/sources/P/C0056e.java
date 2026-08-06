package P;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: P.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0056e extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public boolean f1313a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0058g f1314b;

    public C0056e(C0058g c0058g) {
        this.f1314b = c0058g;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f1313a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.f1313a) {
            this.f1313a = false;
            return;
        }
        C0058g c0058g = this.f1314b;
        if (((Float) c0058g.f1337u.getAnimatedValue()).floatValue() == 0.0f) {
            c0058g.f1338v = 0;
            c0058g.e(0);
        } else {
            c0058g.f1338v = 2;
            c0058g.f1331n.invalidate();
        }
    }
}
