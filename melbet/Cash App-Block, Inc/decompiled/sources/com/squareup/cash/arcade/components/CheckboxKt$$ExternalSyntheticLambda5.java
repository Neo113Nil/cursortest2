package com.squareup.cash.arcade.components;

import com.airbnb.lottie.compose.LottieAnimatable;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final /* synthetic */ class CheckboxKt$$ExternalSyntheticLambda5 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ LottieAnimatable f$0;

    public /* synthetic */ CheckboxKt$$ExternalSyntheticLambda5(LottieAnimatable lottieAnimatable, int i) {
        this.$r8$classId = i;
        this.f$0 = lottieAnimatable;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        float progress;
        int i = this.$r8$classId;
        LottieAnimatable lottieAnimatable = this.f$0;
        switch (i) {
            case 0:
                progress = lottieAnimatable.getProgress();
                break;
            case 1:
                progress = lottieAnimatable.getProgress();
                break;
            case 2:
                progress = lottieAnimatable.getProgress();
                break;
            default:
                progress = lottieAnimatable.getProgress();
                break;
        }
        return Float.valueOf(progress);
    }
}
