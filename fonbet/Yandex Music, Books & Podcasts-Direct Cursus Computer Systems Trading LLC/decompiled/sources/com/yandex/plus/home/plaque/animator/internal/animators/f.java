package com.yandex.plus.home.plaque.animator.internal.animators;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import defpackage.b6e;
import defpackage.yhn;
import kotlin.KotlinVersion;

/* loaded from: classes5.dex */
public final class f implements ValueAnimator.AnimatorUpdateListener {
    public final Drawable a;
    public final Drawable b;
    public final com.yandex.plus.home.plaque.animator.internal.model.a c;
    public final Rect d;
    public final int e;
    public final int f;
    public final Rect g;
    public final int h;
    public final int i;

    public f(Drawable drawable, Drawable drawable2, com.yandex.plus.home.plaque.animator.internal.model.a aVar) {
        this.a = drawable;
        this.b = drawable2;
        this.c = aVar;
        Rect copyBounds = drawable.copyBounds();
        copyBounds.getClass();
        this.d = copyBounds;
        this.e = copyBounds.width();
        this.f = copyBounds.height();
        Rect copyBounds2 = drawable2.copyBounds();
        copyBounds2.getClass();
        this.g = copyBounds2;
        this.h = copyBounds2.width();
        this.i = copyBounds2.height();
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        valueAnimator.getClass();
        float animatedFraction = valueAnimator.getAnimatedFraction();
        int i = this.e;
        int i2 = i / 2;
        float f = i;
        float f2 = 2;
        float f3 = (f - (f * 0.75f)) / f2;
        int i3 = (int) ((i2 - f3) * animatedFraction);
        int i4 = (int) (f3 * animatedFraction);
        float f4 = this.f;
        int i5 = (int) (((f4 - (f4 * 0.75f)) / f2) * animatedFraction);
        int i6 = this.h;
        int i7 = i6 / 2;
        float f5 = i6;
        float f6 = (f5 - (f5 * 0.75f)) / f2;
        float f7 = i7 - f6;
        int i8 = (int) (f7 - (f7 * animatedFraction));
        int i9 = (int) (f6 - (f6 * animatedFraction));
        float f8 = this.i;
        float f9 = (f8 - (0.75f * f8)) / f2;
        int i10 = (int) (f9 - (f9 * animatedFraction));
        int ordinal = this.c.ordinal();
        Rect rect = this.g;
        Drawable drawable = this.b;
        Rect rect2 = this.d;
        Drawable drawable2 = this.a;
        if (ordinal == 0) {
            drawable2.setBounds((rect2.left + i4) - i3, rect2.top + i5, (rect2.right - i4) - i3, rect2.bottom - i5);
            drawable.setBounds(rect.left + i9 + i8, rect.top + i10, (rect.right - i9) + i8, rect.bottom - i10);
        } else if (ordinal != 1) {
            b6e.s();
            return;
        } else {
            drawable2.setBounds(rect2.left + i4 + i3, rect2.top + i5, (rect2.right - i4) + i3, rect2.bottom - i5);
            drawable.setBounds((rect.left + i9) - i8, rect.top + i10, (rect.right - i9) - i8, rect.bottom - i10);
        }
        int c = (int) (yhn.c(animatedFraction, 0.0f, 1.0f) * KotlinVersion.MAX_COMPONENT_VALUE);
        drawable.setAlpha(c);
        drawable2.setAlpha(255 - c);
    }
}
