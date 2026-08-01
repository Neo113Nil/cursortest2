package N0;

import android.animation.ValueAnimator;

/* loaded from: classes.dex */
public final class b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f634a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f635b;

    public b(d dVar, float f2) {
        this.f635b = dVar;
        this.f634a = f2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f635b.e(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f634a);
    }
}
