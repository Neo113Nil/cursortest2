package L;

import android.animation.ValueAnimator;

/* renamed from: L.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0056g implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0057h f620a;

    public C0056g(C0057h c0057h) {
        this.f620a = c0057h;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
        C0057h c0057h = this.f620a;
        c0057h.f624b.setAlpha(floatValue);
        c0057h.f625c.setAlpha(floatValue);
        c0057h.f636n.invalidate();
    }
}
