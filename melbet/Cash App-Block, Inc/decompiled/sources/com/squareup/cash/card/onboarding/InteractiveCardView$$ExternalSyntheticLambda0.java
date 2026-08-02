package com.squareup.cash.card.onboarding;

import android.animation.ValueAnimator;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.cash.graphics.backend.math.Quat;

/* loaded from: classes6.dex */
public final /* synthetic */ class InteractiveCardView$$ExternalSyntheticLambda0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ InteractiveCardView f$0;

    public /* synthetic */ InteractiveCardView$$ExternalSyntheticLambda0(InteractiveCardView interactiveCardView, int i) {
        this.$r8$classId = i;
        this.f$0 = interactiveCardView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.$r8$classId;
        InteractiveCardView interactiveCardView = this.f$0;
        switch (i) {
            case 0:
                float[] fArr = InteractiveCardView.X_AXIS;
                interactiveCardView.setCardRotation((Quat) Matcher$$ExternalSyntheticOutline0.m(valueAnimator));
                break;
            case 1:
                float[] fArr2 = InteractiveCardView.X_AXIS;
                interactiveCardView.setCardRotation((Quat) Matcher$$ExternalSyntheticOutline0.m(valueAnimator));
                break;
            case 2:
                float[] fArr3 = InteractiveCardView.X_AXIS;
                interactiveCardView.setEyeIntensity(((Float) Matcher$$ExternalSyntheticOutline0.m(valueAnimator)).floatValue());
                break;
            default:
                float[] fArr4 = InteractiveCardView.X_AXIS;
                interactiveCardView.setEyeIntensity(((Float) Matcher$$ExternalSyntheticOutline0.m(valueAnimator)).floatValue());
                break;
        }
    }
}
