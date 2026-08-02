package com.yandex.plus.home.plaque.animator.internal.animators;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import defpackage.b6e;
import defpackage.yhn;
import kotlin.KotlinVersion;

/* loaded from: classes5.dex */
public final class e implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a = 1;
    public final Drawable b;
    public final Object c;

    public e(Drawable drawable, Drawable drawable2, Rect rect) {
        this.b = drawable;
        this.c = drawable2;
        if (drawable != null) {
            drawable.setBounds(new Rect(rect));
        }
        if (drawable2 != null) {
            drawable2.setBounds(new Rect(rect));
        }
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.a;
        valueAnimator.getClass();
        switch (i) {
            case 0:
                int c = (int) (yhn.c(valueAnimator.getAnimatedFraction(), 0.0f, 1.0f) * KotlinVersion.MAX_COMPONENT_VALUE);
                int ordinal = ((d) this.c).ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        b6e.s();
                        break;
                    } else {
                        c = 255 - c;
                    }
                }
                this.b.setAlpha(c);
                break;
            default:
                int c2 = (int) (yhn.c(valueAnimator.getAnimatedFraction(), 0.0f, 1.0f) * KotlinVersion.MAX_COMPONENT_VALUE);
                Drawable drawable = (Drawable) this.c;
                if (drawable != null) {
                    drawable.setAlpha(c2);
                }
                Drawable drawable2 = this.b;
                if (drawable2 != null) {
                    drawable2.setAlpha(KotlinVersion.MAX_COMPONENT_VALUE - c2);
                    break;
                }
                break;
        }
    }

    public e(d dVar, Drawable drawable) {
        this.c = dVar;
        this.b = drawable;
    }
}
