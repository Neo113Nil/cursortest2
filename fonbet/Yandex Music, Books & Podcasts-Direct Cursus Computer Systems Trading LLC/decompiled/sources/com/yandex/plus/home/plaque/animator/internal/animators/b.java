package com.yandex.plus.home.plaque.animator.internal.animators;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.animation.OvershootInterpolator;
import defpackage.yhn;
import kotlin.KotlinVersion;

/* loaded from: classes5.dex */
public final class b implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a = 1;
    public final Drawable b;
    public final Rect c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final Object h;

    public b(Drawable drawable, Drawable drawable2) {
        this.b = drawable;
        this.h = drawable2;
        Rect copyBounds = drawable.copyBounds();
        copyBounds.getClass();
        this.c = copyBounds;
        Rect copyBounds2 = drawable2.copyBounds();
        copyBounds2.getClass();
        this.d = copyBounds2.left - copyBounds.left;
        this.e = copyBounds2.top - copyBounds.top;
        this.f = copyBounds2.right - copyBounds.right;
        this.g = copyBounds2.bottom - copyBounds.bottom;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.a;
        valueAnimator.getClass();
        switch (i) {
            case 0:
                float animatedFraction = valueAnimator.getAnimatedFraction();
                Rect rect = this.c;
                Drawable drawable = this.b;
                drawable.setBounds((int) ((this.d * animatedFraction) + rect.left), (int) ((this.e * animatedFraction) + rect.top), (int) ((this.f * animatedFraction) + rect.right), (int) ((this.g * animatedFraction) + rect.bottom));
                int c = (int) (yhn.c(animatedFraction, 0.0f, 1.0f) * KotlinVersion.MAX_COMPONENT_VALUE);
                ((Drawable) this.h).setAlpha(c);
                drawable.setAlpha(255 - c);
                break;
            default:
                TimeInterpolator timeInterpolator = (OvershootInterpolator) this.h;
                if (timeInterpolator == null) {
                    timeInterpolator = valueAnimator.getInterpolator();
                }
                Object animatedValue = valueAnimator.getAnimatedValue();
                animatedValue.getClass();
                float interpolation = timeInterpolator.getInterpolation(((Float) animatedValue).floatValue());
                Rect rect2 = this.c;
                this.b.setBounds((int) ((this.d * interpolation) + rect2.left), (int) ((this.e * interpolation) + rect2.top), (int) ((this.f * interpolation) + rect2.right), (int) ((this.g * interpolation) + rect2.bottom));
                break;
        }
    }

    public b(Drawable drawable, Rect rect, Rect rect2, boolean z) {
        this.b = drawable;
        this.c = rect;
        this.h = z ? new OvershootInterpolator() : null;
        this.d = rect2.left - rect.left;
        this.e = rect2.top - rect.top;
        this.f = rect2.right - rect.right;
        this.g = rect2.bottom - rect.bottom;
    }
}
