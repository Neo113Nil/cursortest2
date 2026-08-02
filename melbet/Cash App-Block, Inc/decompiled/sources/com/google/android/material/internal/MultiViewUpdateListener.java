package com.google.android.material.internal;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.swiperefreshlayout.widget.CircularProgressDrawable;
import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;

/* loaded from: classes4.dex */
public final class MultiViewUpdateListener implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int $r8$classId = 1;
    public final Object listener;
    public final Object views;

    public MultiViewUpdateListener(AesGcmSiv$$ExternalSyntheticLambda0 aesGcmSiv$$ExternalSyntheticLambda0, View[] viewArr) {
        this.listener = aesGcmSiv$$ExternalSyntheticLambda0;
        this.views = viewArr;
    }

    public static MultiViewUpdateListener alphaListener(View... viewArr) {
        return new MultiViewUpdateListener(new AesGcmSiv$$ExternalSyntheticLambda0(5), viewArr);
    }

    public static MultiViewUpdateListener translationYListener(View... viewArr) {
        return new MultiViewUpdateListener(new AesGcmSiv$$ExternalSyntheticLambda0(3), viewArr);
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.$r8$classId;
        Object obj = this.listener;
        Object obj2 = this.views;
        switch (i) {
            case 0:
                for (View view : (View[]) obj2) {
                    switch (((AesGcmSiv$$ExternalSyntheticLambda0) obj).$r8$classId) {
                        case 2:
                            view.setTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
                            break;
                        case 3:
                            view.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                            break;
                        case 4:
                            Float f = (Float) valueAnimator.getAnimatedValue();
                            view.setScaleX(f.floatValue());
                            view.setScaleY(f.floatValue());
                            break;
                        default:
                            view.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                            break;
                    }
                }
                break;
            default:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                CircularProgressDrawable circularProgressDrawable = (CircularProgressDrawable) obj2;
                CircularProgressDrawable.Ring ring = (CircularProgressDrawable.Ring) obj;
                CircularProgressDrawable.updateRingColor(floatValue, ring);
                circularProgressDrawable.applyTransformation(floatValue, ring, false);
                circularProgressDrawable.invalidateSelf();
                break;
        }
    }

    public MultiViewUpdateListener(CircularProgressDrawable circularProgressDrawable, CircularProgressDrawable.Ring ring) {
        this.views = circularProgressDrawable;
        this.listener = ring;
    }
}
