package com.squareup.cash.card.onboarding;

import android.animation.ValueAnimator;
import androidx.appcompat.widget.AppCompatImageView;
import com.google.android.filament.View;

/* loaded from: classes6.dex */
public final /* synthetic */ class InteractiveCardView$$ExternalSyntheticLambda3 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ InteractiveCardView f$0;
    public final /* synthetic */ ValueAnimator f$1;

    public /* synthetic */ InteractiveCardView$$ExternalSyntheticLambda3(InteractiveCardView interactiveCardView, ValueAnimator valueAnimator, int i) {
        this.$r8$classId = i;
        this.f$0 = interactiveCardView;
        this.f$1 = valueAnimator;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.$r8$classId;
        ValueAnimator valueAnimator2 = this.f$1;
        InteractiveCardView interactiveCardView = this.f$0;
        switch (i) {
            case 0:
                float[] fArr = InteractiveCardView.X_AXIS;
                valueAnimator.getClass();
                View.FogOptions fogOptions = interactiveCardView.fogOptions;
                Object animatedValue = valueAnimator2.getAnimatedValue();
                animatedValue.getClass();
                fogOptions.height = ((Float) animatedValue).floatValue();
                fogOptions.maximumOpacity = 1.0f;
                interactiveCardView.setFogOptions(fogOptions);
                break;
            case 1:
                float[] fArr2 = InteractiveCardView.X_AXIS;
                valueAnimator.getClass();
                View.FogOptions fogOptions2 = interactiveCardView.fogOptions;
                Object animatedValue2 = valueAnimator2.getAnimatedValue();
                animatedValue2.getClass();
                fogOptions2.height = ((Float) animatedValue2).floatValue();
                interactiveCardView.setFogOptions(fogOptions2);
                break;
            case 2:
                float[] fArr3 = InteractiveCardView.X_AXIS;
                valueAnimator.getClass();
                View.FogOptions fogOptions3 = interactiveCardView.fogOptions;
                Object animatedValue3 = valueAnimator2.getAnimatedValue();
                animatedValue3.getClass();
                fogOptions3.height = ((Float) animatedValue3).floatValue() * 1.23f;
                fogOptions3.maximumOpacity = 1.0f;
                interactiveCardView.setFogOptions(fogOptions3);
                AppCompatImageView appCompatImageView = interactiveCardView.nfcView;
                Object animatedValue4 = valueAnimator2.getAnimatedValue();
                animatedValue4.getClass();
                appCompatImageView.setAlpha(((Float) animatedValue4).floatValue());
                break;
            default:
                float[] fArr4 = InteractiveCardView.X_AXIS;
                valueAnimator.getClass();
                Object animatedValue5 = valueAnimator2.getAnimatedValue();
                animatedValue5.getClass();
                interactiveCardView.setEyeIntensity(((Float) animatedValue5).floatValue() * 500000.0f);
                break;
        }
    }
}
