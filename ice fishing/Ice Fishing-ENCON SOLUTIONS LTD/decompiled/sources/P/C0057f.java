package P;

import android.animation.ValueAnimator;

/* renamed from: P.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0057f implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0058g f1315a;

    public C0057f(C0058g c0058g) {
        this.f1315a = c0058g;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
        C0058g c0058g = this.f1315a;
        c0058g.f1319b.setAlpha(floatValue);
        c0058g.f1320c.setAlpha(floatValue);
        c0058g.f1331n.invalidate();
    }
}
