package androidx.compose.animation.core;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.navigation.compose.DialogHostKt$$ExternalSyntheticLambda0;
import androidx.recyclerview.widget.RecyclerView;
import coil3.network.NetworkFetcher$doFetch$fetchResult$1;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.Channel;
import papa.PapaEvent;

/* loaded from: classes3.dex */
public abstract class AnimateAsStateKt {
    public static final SpringSpec defaultAnimation = AnimatableKt.spring$default(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, null, 7);
    public static final SpringSpec dpDefaultSpring;
    public static final SpringSpec intOffsetDefaultSpring;

    static {
        Rect rect = VisibilityThresholdsKt.RectVisibilityThreshold;
        dpDefaultSpring = AnimatableKt.spring$default(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, new Dp(0.4f), 3);
        Float.floatToRawIntBits(1.0f);
        Float.floatToRawIntBits(1.0f);
        Float.floatToRawIntBits(1.0f);
        Float.floatToRawIntBits(1.0f);
        intOffsetDefaultSpring = AnimatableKt.spring$default(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, new IntOffset(4294967297L), 3);
    }

    /* renamed from: animateDpAsState-AjpBEmI, reason: not valid java name */
    public static final State m155animateDpAsStateAjpBEmI(float f, FiniteAnimationSpec finiteAnimationSpec, String str, Function1 function1, Composer composer, int i, int i2) {
        if ((i2 & 2) != 0) {
            finiteAnimationSpec = dpDefaultSpring;
        }
        FiniteAnimationSpec finiteAnimationSpec2 = finiteAnimationSpec;
        if ((i2 & 4) != 0) {
            str = "DpAnimation";
        }
        String str2 = str;
        if ((i2 & 8) != 0) {
            function1 = null;
        }
        return animateValueAsState(new Dp(f), AnimatableKt.DpToVector, finiteAnimationSpec2, null, str2, function1, composer, ((i << 3) & 896) | ((i << 6) & 57344), 8);
    }

    public static final State animateFloatAsState(float f, AnimationSpec animationSpec, String str, Function1 function1, Composer composer, int i, int i2) {
        AnimationSpec animationSpec2;
        int i3 = i2 & 2;
        SpringSpec springSpec = defaultAnimation;
        if (i3 != 0) {
            animationSpec = springSpec;
        }
        if ((i2 & 8) != 0) {
            str = "FloatAnimation";
        }
        String str2 = str;
        Function1 function12 = (i2 & 16) != 0 ? null : function1;
        if (animationSpec == springSpec) {
            GapComposer gapComposer = (GapComposer) composer;
            gapComposer.startReplaceGroup(1144115775);
            boolean changed = gapComposer.changed(0.01f);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = AnimatableKt.spring$default(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, Float.valueOf(0.01f), 3);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            gapComposer.end(false);
            animationSpec2 = (SpringSpec) rememberedValue;
        } else {
            GapComposer gapComposer2 = (GapComposer) composer;
            gapComposer2.startReplaceGroup(1144225701);
            gapComposer2.end(false);
            animationSpec2 = animationSpec;
        }
        return animateValueAsState(Float.valueOf(f), AnimatableKt.FloatToVector, animationSpec2, null, str2, function12, composer, (i & 14) | (57344 & (i << 3)), 0);
    }

    public static final State animateValueAsState(Object obj, TwoWayConverterImpl twoWayConverterImpl, AnimationSpec animationSpec, Float f, String str, Function1 function1, Composer composer, int i, int i2) {
        if ((i2 & 8) != 0) {
            f = null;
        }
        GapComposer gapComposer = (GapComposer) composer;
        Object rememberedValue = gapComposer.rememberedValue();
        Object obj2 = Composer.Companion.Empty;
        if (rememberedValue == obj2) {
            rememberedValue = Updater.mutableStateOf$default(null);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        MutableState mutableState = (MutableState) rememberedValue;
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (rememberedValue2 == obj2) {
            rememberedValue2 = new Animatable(obj, twoWayConverterImpl, f, str);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        Animatable animatable = (Animatable) rememberedValue2;
        MutableState rememberUpdatedState = Updater.rememberUpdatedState(function1, gapComposer);
        if (f != null && (animationSpec instanceof SpringSpec)) {
            SpringSpec springSpec = (SpringSpec) animationSpec;
            if (!Intrinsics.areEqual(springSpec.visibilityThreshold, f)) {
                animationSpec = new SpringSpec(springSpec.dampingRatio, springSpec.stiffness, f);
            }
        }
        MutableState rememberUpdatedState2 = Updater.rememberUpdatedState(animationSpec, gapComposer);
        Object rememberedValue3 = gapComposer.rememberedValue();
        if (rememberedValue3 == obj2) {
            rememberedValue3 = PapaEvent.Channel$default(-1, null, null, 6);
            gapComposer.updateRememberedValue(rememberedValue3);
        }
        Channel channel = (Channel) rememberedValue3;
        boolean changedInstance = gapComposer.changedInstance(channel) | ((((i & 14) ^ 6) > 4 && gapComposer.changedInstance(obj)) || (i & 6) == 4);
        Object rememberedValue4 = gapComposer.rememberedValue();
        if (changedInstance || rememberedValue4 == obj2) {
            rememberedValue4 = new DialogHostKt$$ExternalSyntheticLambda0(9, channel, obj);
            gapComposer.updateRememberedValue(rememberedValue4);
        }
        Updater.SideEffect((Function0) rememberedValue4, gapComposer);
        boolean changedInstance2 = gapComposer.changedInstance(channel) | gapComposer.changedInstance(animatable) | gapComposer.changed(rememberUpdatedState2) | gapComposer.changed(rememberUpdatedState);
        Object rememberedValue5 = gapComposer.rememberedValue();
        if (changedInstance2 || rememberedValue5 == obj2) {
            Object networkFetcher$doFetch$fetchResult$1 = new NetworkFetcher$doFetch$fetchResult$1(channel, animatable, rememberUpdatedState2, rememberUpdatedState, (Continuation) null);
            gapComposer.updateRememberedValue(networkFetcher$doFetch$fetchResult$1);
            rememberedValue5 = networkFetcher$doFetch$fetchResult$1;
        }
        Updater.LaunchedEffect(gapComposer, channel, (Function2) rememberedValue5);
        State state = (State) mutableState.getValue();
        return state == null ? animatable.internalState : state;
    }
}
