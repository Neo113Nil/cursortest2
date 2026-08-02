package com.airbnb.lottie.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\r\u0010\u0000\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"rememberLottieRetrySignal", "Lcom/airbnb/lottie/compose/LottieRetrySignal;", "(Landroidx/compose/runtime/Composer;I)Lcom/airbnb/lottie/compose/LottieRetrySignal;", "lottie-compose_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LottieRetrySignalKt {
    public static final LottieRetrySignal rememberLottieRetrySignal(Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceableGroup(-1266611990);
        gapComposer.startReplaceableGroup(1025108850);
        Object rememberedValue = gapComposer.rememberedValue();
        if (rememberedValue == Composer.Companion.Empty) {
            rememberedValue = new LottieRetrySignal();
            gapComposer.updateRememberedValue(rememberedValue);
        }
        LottieRetrySignal lottieRetrySignal = (LottieRetrySignal) rememberedValue;
        gapComposer.end(false);
        gapComposer.end(false);
        return lottieRetrySignal;
    }
}
