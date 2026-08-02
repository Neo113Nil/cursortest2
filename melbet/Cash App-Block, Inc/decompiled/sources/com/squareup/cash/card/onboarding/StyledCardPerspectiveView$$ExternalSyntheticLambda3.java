package com.squareup.cash.card.onboarding;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.squareup.cash.card.onboarding.views.databinding.CardStylePerspectiveViewBinding;
import kotlin.math.MathKt__MathJVMKt;

/* loaded from: classes6.dex */
public final /* synthetic */ class StyledCardPerspectiveView$$ExternalSyntheticLambda3 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ StyledCardPerspectiveView f$0;

    public /* synthetic */ StyledCardPerspectiveView$$ExternalSyntheticLambda3(StyledCardPerspectiveView styledCardPerspectiveView, int i) {
        this.$r8$classId = i;
        this.f$0 = styledCardPerspectiveView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.$r8$classId;
        StyledCardPerspectiveView styledCardPerspectiveView = this.f$0;
        switch (i) {
            case 0:
                int i2 = StyledCardPerspectiveView.$r8$clinit;
                valueAnimator.getClass();
                DreamLightsDrawable dreamLights = styledCardPerspectiveView.getDreamLights();
                Object animatedValue = valueAnimator.getAnimatedValue();
                animatedValue.getClass();
                int intValue = ((Integer) animatedValue).intValue();
                dreamLights.invalidateSelf();
                dreamLights.eyeAlpha = intValue;
                Drawable drawable = (Drawable) styledCardPerspectiveView.bottomDreamLights$delegate.getValue();
                valueAnimator.getAnimatedValue().getClass();
                drawable.setAlpha(MathKt__MathJVMKt.roundToInt(((Integer) r4).intValue() / 2.0f));
                break;
            case 1:
                int i3 = StyledCardPerspectiveView.$r8$clinit;
                valueAnimator.getClass();
                DreamLightsDrawable dreamLights2 = styledCardPerspectiveView.getDreamLights();
                Object animatedValue2 = valueAnimator.getAnimatedValue();
                animatedValue2.getClass();
                int intValue2 = ((Integer) animatedValue2).intValue();
                dreamLights2.invalidateSelf();
                dreamLights2.eyeAlpha = intValue2;
                Drawable drawable2 = (Drawable) styledCardPerspectiveView.bottomDreamLights$delegate.getValue();
                valueAnimator.getAnimatedValue().getClass();
                drawable2.setAlpha(MathKt__MathJVMKt.roundToInt(((Integer) r4).intValue() / 2.0f));
                break;
            case 2:
                int i4 = StyledCardPerspectiveView.$r8$clinit;
                valueAnimator.getClass();
                ImageView imageView = ((CardStylePerspectiveViewBinding) styledCardPerspectiveView.binding$delegate.getValue()).nfcView;
                Object animatedValue3 = valueAnimator.getAnimatedValue();
                animatedValue3.getClass();
                imageView.setAlpha(((Float) animatedValue3).floatValue());
                break;
            case 3:
                int i5 = StyledCardPerspectiveView.$r8$clinit;
                valueAnimator.getClass();
                DreamLightsDrawable dreamLights3 = styledCardPerspectiveView.getDreamLights();
                Object animatedValue4 = valueAnimator.getAnimatedValue();
                animatedValue4.getClass();
                int roundToInt = MathKt__MathJVMKt.roundToInt(((Float) animatedValue4).floatValue() * 255.0f);
                dreamLights3.invalidateSelf();
                dreamLights3.eyeAlpha = roundToInt;
                Drawable drawable3 = (Drawable) styledCardPerspectiveView.bottomDreamLights$delegate.getValue();
                Object animatedValue5 = valueAnimator.getAnimatedValue();
                animatedValue5.getClass();
                drawable3.setAlpha(MathKt__MathJVMKt.roundToInt(((Float) animatedValue5).floatValue() * 128.0f));
                break;
            case 4:
                int i6 = StyledCardPerspectiveView.$r8$clinit;
                valueAnimator.getClass();
                PerspectiveView perspectiveView = styledCardPerspectiveView.getPerspectiveView();
                Object animatedValue6 = valueAnimator.getAnimatedValue();
                animatedValue6.getClass();
                perspectiveView.setChildRotationX(((Float) animatedValue6).floatValue());
                break;
            case 5:
                int i7 = StyledCardPerspectiveView.$r8$clinit;
                valueAnimator.getClass();
                PerspectiveView perspectiveView2 = styledCardPerspectiveView.getPerspectiveView();
                Object animatedValue7 = valueAnimator.getAnimatedValue();
                animatedValue7.getClass();
                perspectiveView2.setChildRotationY(((Float) animatedValue7).floatValue());
                break;
            default:
                int i8 = StyledCardPerspectiveView.$r8$clinit;
                valueAnimator.getClass();
                PerspectiveView perspectiveView3 = styledCardPerspectiveView.getPerspectiveView();
                Object animatedValue8 = valueAnimator.getAnimatedValue();
                animatedValue8.getClass();
                perspectiveView3.setChildRotationZ(((Float) animatedValue8).floatValue());
                break;
        }
    }
}
