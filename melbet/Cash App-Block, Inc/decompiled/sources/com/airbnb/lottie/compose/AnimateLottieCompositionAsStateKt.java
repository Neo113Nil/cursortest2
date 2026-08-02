package com.airbnb.lottie.compose;

import android.content.Context;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.utils.Utils;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import okio.Path$$ExternalSyntheticBUOutline0;

@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001as\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0012¨\u0006\u0013²\u0006\n\u0010\u0014\u001a\u00020\u0005X\u008a\u008e\u0002"}, d2 = {"animateLottieCompositionAsState", "Lcom/airbnb/lottie/compose/LottieAnimationState;", "composition", "Lcom/airbnb/lottie/LottieComposition;", "isPlaying", "", "restartOnPlay", "reverseOnRepeat", "clipSpec", "Lcom/airbnb/lottie/compose/LottieClipSpec;", "speed", "", "iterations", "", "cancellationBehavior", "Lcom/airbnb/lottie/compose/LottieCancellationBehavior;", "ignoreSystemAnimatorScale", "useCompositionFrameRate", "(Lcom/airbnb/lottie/LottieComposition;ZZZLcom/airbnb/lottie/compose/LottieClipSpec;FILcom/airbnb/lottie/compose/LottieCancellationBehavior;ZZLandroidx/compose/runtime/Composer;II)Lcom/airbnb/lottie/compose/LottieAnimationState;", "lottie-compose_release", "wasPlaying"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AnimateLottieCompositionAsStateKt {
    public static final LottieAnimationState animateLottieCompositionAsState(LottieComposition lottieComposition, boolean z, boolean z2, boolean z3, LottieClipSpec lottieClipSpec, float f, int i, LottieCancellationBehavior lottieCancellationBehavior, boolean z4, boolean z5, Composer composer, int i2, int i3) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceableGroup(683659508);
        boolean z6 = (i3 & 2) != 0 ? true : z;
        boolean z7 = (i3 & 4) != 0 ? true : z2;
        boolean z8 = (i3 & 8) != 0 ? false : z3;
        LottieClipSpec lottieClipSpec2 = (i3 & 16) != 0 ? null : lottieClipSpec;
        float f2 = (i3 & 32) != 0 ? 1.0f : f;
        int i4 = (i3 & 64) != 0 ? 1 : i;
        LottieCancellationBehavior lottieCancellationBehavior2 = (i3 & 128) != 0 ? LottieCancellationBehavior.Immediately : lottieCancellationBehavior;
        boolean z9 = (i3 & 256) != 0 ? false : z4;
        boolean z10 = (i3 & 512) != 0 ? false : z5;
        if (i4 <= 0) {
            Path$$ExternalSyntheticBUOutline0.m$1((Object) JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i4, "Iterations must be a positive number (", ")."));
            return null;
        }
        if (Float.isInfinite(f2) || Float.isNaN(f2)) {
            Path$$ExternalSyntheticBUOutline0.m$1((Object) JsonLogicResult$Success$$ExternalSyntheticOutline0.m(f2, "Speed must be a finite number. It is ", "."));
            return null;
        }
        LottieAnimatable rememberLottieAnimatable = LottieAnimatableKt.rememberLottieAnimatable(gapComposer, 0);
        gapComposer.startReplaceableGroup(-180606964);
        Object rememberedValue = gapComposer.rememberedValue();
        if (rememberedValue == Composer.Companion.Empty) {
            rememberedValue = Recorder$$ExternalSyntheticOutline1.m(z6, gapComposer);
        }
        MutableState mutableState = (MutableState) rememberedValue;
        gapComposer.end(false);
        gapComposer.startReplaceableGroup(-180606834);
        if (!z9) {
            f2 /= Utils.getAnimationScale((Context) gapComposer.consume(AndroidCompositionLocals_androidKt.LocalContext));
        }
        float f3 = f2;
        gapComposer.end(false);
        Updater.LaunchedEffect(new Object[]{lottieComposition, Boolean.valueOf(z6), lottieClipSpec2, Float.valueOf(f3), Integer.valueOf(i4)}, new AnimateLottieCompositionAsStateKt$animateLottieCompositionAsState$3(z6, z7, rememberLottieAnimatable, lottieComposition, i4, z8, f3, lottieClipSpec2, lottieCancellationBehavior2, z10, mutableState, null), gapComposer);
        gapComposer.end(false);
        return rememberLottieAnimatable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean animateLottieCompositionAsState$lambda$3(MutableState mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animateLottieCompositionAsState$lambda$4(MutableState mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }
}
