package androidx.compose.animation.core;

import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.InfiniteTransition.TransitionAnimationState;
import androidx.compose.foundation.ClickableKt$$ExternalSyntheticLambda0;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.platform.InfiniteAnimationPolicy$Key;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.l2$$ExternalSyntheticLambda7;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes3.dex */
public abstract class ArcSplineKt {
    public static final float[] OurPercentCache = new float[91];

    public static final InfiniteTransition.TransitionAnimationState animateFloat(InfiniteTransition infiniteTransition, float f, float f2, InfiniteRepeatableSpec infiniteRepeatableSpec, String str, Composer composer, int i, int i2) {
        if ((i2 & 8) != 0) {
            str = "FloatAnimation";
        }
        return animateValue(infiniteTransition, Float.valueOf(f), Float.valueOf(f2), AnimatableKt.FloatToVector, infiniteRepeatableSpec, str, composer, (i & IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO) | 32768 | ((i << 3) & 458752), 0);
    }

    public static final InfiniteTransition.TransitionAnimationState animateValue(InfiniteTransition infiniteTransition, Number number, Number number2, TwoWayConverterImpl twoWayConverterImpl, InfiniteRepeatableSpec infiniteRepeatableSpec, String str, Composer composer, int i, int i2) {
        InfiniteTransition infiniteTransition2;
        Number number3;
        GapComposer gapComposer = (GapComposer) composer;
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy) {
            infiniteTransition2 = infiniteTransition;
            InfiniteTransition.TransitionAnimationState transitionAnimationState = infiniteTransition2.new TransitionAnimationState(number, number2, twoWayConverterImpl, infiniteRepeatableSpec);
            number3 = number2;
            gapComposer.updateRememberedValue(transitionAnimationState);
            rememberedValue = transitionAnimationState;
        } else {
            infiniteTransition2 = infiniteTransition;
            number3 = number2;
        }
        InfiniteTransition.TransitionAnimationState transitionAnimationState2 = (InfiniteTransition.TransitionAnimationState) rememberedValue;
        boolean z = true;
        boolean z2 = ((((i & 112) ^ 48) > 32 && gapComposer.changedInstance(number)) || (i & 48) == 32) | ((((i & 896) ^ MLKEMEngine.KyberPolyBytes) > 256 && gapComposer.changedInstance(number3)) || (i & MLKEMEngine.KyberPolyBytes) == 256);
        if ((((57344 & i) ^ 24576) <= 16384 || !gapComposer.changedInstance(infiniteRepeatableSpec)) && (i & 24576) != 16384) {
            z = false;
        }
        boolean z3 = z2 | z;
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (z3 || rememberedValue2 == neverEqualPolicy) {
            l2$$ExternalSyntheticLambda7 l2__externalsyntheticlambda7 = new l2$$ExternalSyntheticLambda7(number, transitionAnimationState2, number3, infiniteRepeatableSpec, 3);
            gapComposer.updateRememberedValue(l2__externalsyntheticlambda7);
            rememberedValue2 = l2__externalsyntheticlambda7;
        }
        Updater.SideEffect((Function0) rememberedValue2, gapComposer);
        boolean changedInstance = gapComposer.changedInstance(infiniteTransition2);
        Object rememberedValue3 = gapComposer.rememberedValue();
        if (changedInstance || rememberedValue3 == neverEqualPolicy) {
            rememberedValue3 = new ClickableKt$$ExternalSyntheticLambda0(8, infiniteTransition2, transitionAnimationState2);
            gapComposer.updateRememberedValue(rememberedValue3);
        }
        Updater.DisposableEffect(transitionAnimationState2, (Function1) rememberedValue3, gapComposer);
        return transitionAnimationState2;
    }

    public static final InfiniteTransition rememberInfiniteTransition(String str, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        Object rememberedValue = gapComposer.rememberedValue();
        if (rememberedValue == Composer.Companion.Empty) {
            rememberedValue = new InfiniteTransition();
            gapComposer.updateRememberedValue(rememberedValue);
        }
        InfiniteTransition infiniteTransition = (InfiniteTransition) rememberedValue;
        infiniteTransition.run$animation_core(gapComposer, 0);
        return infiniteTransition;
    }

    public static final Object withInfiniteAnimationFrameNanos(Continuation continuation, Function1 function1) {
        if (continuation.getContext().get(InfiniteAnimationPolicy$Key.$$INSTANCE) == null) {
            return Updater.getMonotonicFrameClock(continuation.getContext()).withFrameNanos(continuation, function1);
        }
        a$$ExternalSyntheticBUOutline0.m$1();
        return null;
    }
}
