package androidx.compose.animation;

import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.animation.core.TwoWayConverterImpl;
import androidx.compose.animation.core.VisibilityThresholdsKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.CacheDrawScope$onDrawBehind$1;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.ReusableGraphicsLayerScope;
import androidx.compose.ui.graphics.TransformOrigin;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.recyclerview.widget.RecyclerView;
import coil3.svg.SvgDecoder$$ExternalSyntheticLambda0;
import com.plaid.internal.EnumC0170g;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import papa.InteractionResult;

/* loaded from: classes.dex */
public abstract class EnterExitTransitionKt {
    public static final SpringSpec DefaultOffsetAnimationSpec;
    public static final SpringSpec DefaultSizeAnimationSpec;
    public static final TwoWayConverterImpl TransformOriginVectorConverter = new TwoWayConverterImpl(AnimatedContentKt$AnimatedContent$2$1.INSTANCE$1, AnimatedContentKt$AnimatedContent$2$1.INSTANCE$2);
    public static final SpringSpec DefaultAlphaAndScaleSpring = AnimatableKt.spring$default(RecyclerView.DECELERATION_RATE, 400.0f, null, 5);

    static {
        AnimatableKt.spring$default(RecyclerView.DECELERATION_RATE, 400.0f, null, 5);
        Rect rect = VisibilityThresholdsKt.RectVisibilityThreshold;
        DefaultOffsetAnimationSpec = AnimatableKt.spring$default(RecyclerView.DECELERATION_RATE, 400.0f, new IntOffset(4294967297L), 1);
        DefaultSizeAnimationSpec = AnimatableKt.spring$default(RecyclerView.DECELERATION_RATE, 400.0f, new IntSize(4294967297L), 1);
    }

    public static final Modifier createModifier(Transition transition, EnterTransitionImpl enterTransitionImpl, ExitTransitionImpl exitTransitionImpl, Function0 function0, String str, Composer composer, int i, int i2) {
        final Function0 function02;
        EnterTransitionImpl enterTransitionImpl2;
        GapComposer gapComposer;
        ExitTransitionImpl exitTransitionImpl2;
        GapComposer gapComposer2;
        TwoWayConverterImpl twoWayConverterImpl;
        Transition.DeferredAnimation deferredAnimation;
        Transition.DeferredAnimation deferredAnimation2;
        Transition.DeferredAnimation deferredAnimation3;
        ChangeSize changeSize;
        Transition.DeferredAnimation deferredAnimation4;
        Transition.DeferredAnimation deferredAnimation5;
        Transition transition2;
        EnterTransitionImpl enterTransitionImpl3;
        ExitTransitionImpl exitTransitionImpl3;
        TwoWayConverterImpl twoWayConverterImpl2 = AnimatableKt.IntOffsetToVector;
        boolean z = true;
        boolean z2 = (i2 & 4) != 0;
        int i3 = i2 & 8;
        Object obj = Composer.Companion.Empty;
        if (i3 != 0) {
            GapComposer gapComposer3 = (GapComposer) composer;
            Object rememberedValue = gapComposer3.rememberedValue();
            if (rememberedValue == obj) {
                rememberedValue = EnterExitTransitionKt$createModifier$1$1.INSTANCE;
                gapComposer3.updateRememberedValue(rememberedValue);
            }
            function02 = (Function0) rememberedValue;
        } else {
            function02 = function0;
        }
        if (z2) {
            gapComposer = (GapComposer) composer;
            gapComposer.startReplaceGroup(-167965831);
            enterTransitionImpl2 = trackActiveEnter(transition, enterTransitionImpl, gapComposer, 0);
        } else {
            enterTransitionImpl2 = enterTransitionImpl;
            gapComposer = (GapComposer) composer;
            gapComposer.startReplaceGroup(-167964673);
        }
        gapComposer.end(false);
        EnterTransitionImpl enterTransitionImpl4 = enterTransitionImpl2;
        if (z2) {
            gapComposer2 = (GapComposer) composer;
            gapComposer2.startReplaceGroup(-167962954);
            exitTransitionImpl2 = trackActiveExit(transition, exitTransitionImpl, gapComposer2, 0);
        } else {
            exitTransitionImpl2 = exitTransitionImpl;
            gapComposer2 = (GapComposer) composer;
            gapComposer2.startReplaceGroup(-167961890);
        }
        gapComposer2.end(false);
        ExitTransitionImpl exitTransitionImpl4 = exitTransitionImpl2;
        TransitionData transitionData = enterTransitionImpl4.data;
        TransitionData transitionData2 = exitTransitionImpl4.data;
        TransitionData transitionData3 = enterTransitionImpl4.data;
        ChangeSize changeSize2 = transitionData3.changeSize;
        boolean z3 = (transitionData3.slide == null && transitionData2.slide == null) ? false : true;
        boolean z4 = (changeSize2 == null && transitionData2.changeSize == null) ? false : true;
        Transition.DeferredAnimation deferredAnimation6 = null;
        if (z3) {
            GapComposer gapComposer4 = (GapComposer) composer;
            gapComposer4.startReplaceGroup(-911488127);
            Object rememberedValue2 = gapComposer4.rememberedValue();
            if (rememberedValue2 == obj) {
                rememberedValue2 = str.concat(" slide");
                gapComposer4.updateRememberedValue(rememberedValue2);
            }
            Transition.DeferredAnimation createDeferredAnimation = AnimatableKt.createDeferredAnimation(transition, twoWayConverterImpl2, (String) rememberedValue2, gapComposer4, MLKEMEngine.KyberPolyBytes, 0);
            twoWayConverterImpl = twoWayConverterImpl2;
            gapComposer4.end(false);
            deferredAnimation = createDeferredAnimation;
        } else {
            twoWayConverterImpl = twoWayConverterImpl2;
            GapComposer gapComposer5 = (GapComposer) composer;
            gapComposer5.startReplaceGroup(-911382324);
            gapComposer5.end(false);
            deferredAnimation = null;
        }
        if (z4) {
            GapComposer gapComposer6 = (GapComposer) composer;
            gapComposer6.startReplaceGroup(-911290533);
            TwoWayConverterImpl twoWayConverterImpl3 = AnimatableKt.IntSizeToVector;
            Object rememberedValue3 = gapComposer6.rememberedValue();
            if (rememberedValue3 == obj) {
                rememberedValue3 = str.concat(" shrink/expand");
                gapComposer6.updateRememberedValue(rememberedValue3);
            }
            Transition.DeferredAnimation createDeferredAnimation2 = AnimatableKt.createDeferredAnimation(transition, twoWayConverterImpl3, (String) rememberedValue3, gapComposer6, MLKEMEngine.KyberPolyBytes, 0);
            gapComposer6.end(false);
            deferredAnimation2 = createDeferredAnimation2;
        } else {
            GapComposer gapComposer7 = (GapComposer) composer;
            gapComposer7.startReplaceGroup(-911179709);
            gapComposer7.end(false);
            deferredAnimation2 = null;
        }
        if (z4) {
            GapComposer gapComposer8 = (GapComposer) composer;
            gapComposer8.startReplaceGroup(-911106083);
            Object rememberedValue4 = gapComposer8.rememberedValue();
            if (rememberedValue4 == obj) {
                rememberedValue4 = str.concat(" InterruptionHandlingOffset");
                gapComposer8.updateRememberedValue(rememberedValue4);
            }
            Transition.DeferredAnimation createDeferredAnimation3 = AnimatableKt.createDeferredAnimation(transition, twoWayConverterImpl, (String) rememberedValue4, gapComposer8, MLKEMEngine.KyberPolyBytes, 0);
            gapComposer8.end(false);
            deferredAnimation3 = createDeferredAnimation3;
        } else {
            GapComposer gapComposer9 = (GapComposer) composer;
            gapComposer9.startReplaceGroup(-910935677);
            gapComposer9.end(false);
            deferredAnimation3 = null;
        }
        final boolean z5 = ((changeSize2 == null || changeSize2.clip) && ((changeSize = exitTransitionImpl4.data.changeSize) == null || changeSize.clip) && z4) ? false : true;
        TransitionData transitionData4 = exitTransitionImpl4.data;
        float[] fArr = ColorSpaces.SrgbPrimaries;
        GapComposer gapComposer10 = (GapComposer) composer;
        gapComposer10.startReplaceGroup(-910130296);
        gapComposer10.end(false);
        TransitionData transitionData5 = exitTransitionImpl4.data;
        TwoWayConverterImpl twoWayConverterImpl4 = AnimatableKt.FloatToVector;
        boolean z6 = (transitionData3.fade == null && transitionData5.fade == null) ? false : true;
        if (transitionData3.scale == null && transitionData5.scale == null) {
            z = false;
        }
        if (z6) {
            gapComposer10.startReplaceGroup(-703879421);
            Object rememberedValue5 = gapComposer10.rememberedValue();
            if (rememberedValue5 == obj) {
                rememberedValue5 = str.concat(" alpha");
                gapComposer10.updateRememberedValue(rememberedValue5);
            }
            deferredAnimation4 = AnimatableKt.createDeferredAnimation(transition, twoWayConverterImpl4, (String) rememberedValue5, gapComposer10, MLKEMEngine.KyberPolyBytes, 0);
            gapComposer10.end(false);
        } else {
            gapComposer10.startReplaceGroup(-703709976);
            gapComposer10.end(false);
            deferredAnimation4 = null;
        }
        if (z) {
            gapComposer10.startReplaceGroup(-703642333);
            Object rememberedValue6 = gapComposer10.rememberedValue();
            if (rememberedValue6 == obj) {
                rememberedValue6 = str.concat(" scale");
                gapComposer10.updateRememberedValue(rememberedValue6);
            }
            deferredAnimation5 = AnimatableKt.createDeferredAnimation(transition, twoWayConverterImpl4, (String) rememberedValue6, gapComposer10, MLKEMEngine.KyberPolyBytes, 0);
            gapComposer10.end(false);
        } else {
            gapComposer10.startReplaceGroup(-703472888);
            gapComposer10.end(false);
            deferredAnimation5 = null;
        }
        if (z) {
            gapComposer10.startReplaceGroup(-703395232);
            deferredAnimation6 = AnimatableKt.createDeferredAnimation(transition, TransformOriginVectorConverter, "TransformOriginInterruptionHandling", gapComposer10, MLKEMEngine.KyberPolyBytes, 0);
            transition2 = transition;
            gapComposer10.end(false);
        } else {
            transition2 = transition;
            gapComposer10.startReplaceGroup(-703222904);
            gapComposer10.end(false);
        }
        Transition.DeferredAnimation deferredAnimation7 = deferredAnimation6;
        boolean changedInstance = gapComposer10.changedInstance(deferredAnimation4) | gapComposer10.changed(enterTransitionImpl4) | gapComposer10.changed(exitTransitionImpl4) | gapComposer10.changedInstance(deferredAnimation5) | gapComposer10.changed(transition2) | gapComposer10.changedInstance(deferredAnimation7);
        Object rememberedValue7 = gapComposer10.rememberedValue();
        if (changedInstance || rememberedValue7 == obj) {
            rememberedValue7 = new EnterExitTransitionKt$$ExternalSyntheticLambda0(deferredAnimation4, deferredAnimation5, transition2, enterTransitionImpl4, exitTransitionImpl4, deferredAnimation7);
            enterTransitionImpl3 = enterTransitionImpl4;
            exitTransitionImpl3 = exitTransitionImpl4;
            gapComposer10.updateRememberedValue(rememberedValue7);
        } else {
            enterTransitionImpl3 = enterTransitionImpl4;
            exitTransitionImpl3 = exitTransitionImpl4;
        }
        EnterExitTransitionKt$$ExternalSyntheticLambda0 enterExitTransitionKt$$ExternalSyntheticLambda0 = (EnterExitTransitionKt$$ExternalSyntheticLambda0) rememberedValue7;
        boolean changed = gapComposer10.changed(z5) | gapComposer10.changed(function02);
        Object rememberedValue8 = gapComposer10.rememberedValue();
        if (changed || rememberedValue8 == obj) {
            rememberedValue8 = new Function1() { // from class: androidx.compose.animation.EnterExitTransitionKt$createModifier$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    ((ReusableGraphicsLayerScope) obj2).setClip(!z5 && ((Boolean) function02.invoke()).booleanValue());
                    return Unit.INSTANCE;
                }
            };
            gapComposer10.updateRememberedValue(rememberedValue8);
        }
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        return ColorKt.graphicsLayer(companion, (Function1) rememberedValue8).then(new EnterExitTransitionElement(transition, deferredAnimation2, deferredAnimation3, deferredAnimation, enterTransitionImpl3, exitTransitionImpl3, function02, enterExitTransitionKt$$ExternalSyntheticLambda0)).then(companion);
    }

    public static EnterTransitionImpl expandHorizontally$default(FiniteAnimationSpec finiteAnimationSpec, BiasAlignment.Horizontal horizontal, int i) {
        BiasAlignment.Horizontal horizontal2 = Alignment.Companion.End;
        if ((i & 1) != 0) {
            Rect rect = VisibilityThresholdsKt.RectVisibilityThreshold;
            finiteAnimationSpec = AnimatableKt.spring$default(RecyclerView.DECELERATION_RATE, 400.0f, new IntSize(4294967297L), 1);
        }
        if ((i & 2) != 0) {
            horizontal = horizontal2;
        }
        return expandIn(finiteAnimationSpec, Intrinsics.areEqual(horizontal, Alignment.Companion.Start) ? Alignment.Companion.CenterStart : Intrinsics.areEqual(horizontal, horizontal2) ? Alignment.Companion.CenterEnd : Alignment.Companion.Center, new CrossfadeKt$Crossfade$3$1(19), (i & 4) != 0);
    }

    public static final EnterTransitionImpl expandIn(FiniteAnimationSpec finiteAnimationSpec, BiasAlignment biasAlignment, Function1 function1, boolean z) {
        return new EnterTransitionImpl(new TransitionData((Fade) null, (Slide) null, new ChangeSize(finiteAnimationSpec, biasAlignment, function1, z), (Scale) null, (LinkedHashMap) null, EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE));
    }

    public static EnterTransitionImpl expandVertically$default(FiniteAnimationSpec finiteAnimationSpec, int i) {
        BiasAlignment.Vertical vertical = Alignment.Companion.Bottom;
        BiasAlignment.Vertical vertical2 = Alignment.Companion.Top;
        if ((i & 1) != 0) {
            Rect rect = VisibilityThresholdsKt.RectVisibilityThreshold;
            finiteAnimationSpec = AnimatableKt.spring$default(RecyclerView.DECELERATION_RATE, 400.0f, new IntSize(4294967297L), 1);
        }
        BiasAlignment.Vertical vertical3 = (i & 2) != 0 ? vertical : vertical2;
        return expandIn(finiteAnimationSpec, Intrinsics.areEqual(vertical3, vertical2) ? Alignment.Companion.TopCenter : Intrinsics.areEqual(vertical3, vertical) ? Alignment.Companion.BottomCenter : Alignment.Companion.Center, new CrossfadeKt$Crossfade$3$1(20), true);
    }

    public static final EnterTransitionImpl fadeIn(float f, FiniteAnimationSpec finiteAnimationSpec) {
        return new EnterTransitionImpl(new TransitionData(new Fade(f, finiteAnimationSpec), (Slide) null, (ChangeSize) null, (Scale) null, (LinkedHashMap) null, EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE));
    }

    public static /* synthetic */ EnterTransitionImpl fadeIn$default(FiniteAnimationSpec finiteAnimationSpec, int i) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = AnimatableKt.spring$default(RecyclerView.DECELERATION_RATE, 400.0f, null, 5);
        }
        return fadeIn(RecyclerView.DECELERATION_RATE, finiteAnimationSpec);
    }

    public static ExitTransitionImpl fadeOut$default(FiniteAnimationSpec finiteAnimationSpec, int i) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = AnimatableKt.spring$default(RecyclerView.DECELERATION_RATE, 400.0f, null, 5);
        }
        return new ExitTransitionImpl(new TransitionData(new Fade(RecyclerView.DECELERATION_RATE, finiteAnimationSpec), (Slide) null, (ChangeSize) null, (Scale) null, (LinkedHashMap) null, EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE));
    }

    /* renamed from: scaleIn-L8ZKh-E$default, reason: not valid java name */
    public static EnterTransitionImpl m147scaleInL8ZKhE$default(TweenSpec tweenSpec, float f, int i) {
        FiniteAnimationSpec finiteAnimationSpec = tweenSpec;
        if ((i & 1) != 0) {
            finiteAnimationSpec = AnimatableKt.spring$default(RecyclerView.DECELERATION_RATE, 400.0f, null, 5);
        }
        if ((i & 2) != 0) {
            f = 0.0f;
        }
        return new EnterTransitionImpl(new TransitionData((Fade) null, (Slide) null, (ChangeSize) null, new Scale(f, TransformOrigin.Center, finiteAnimationSpec), (LinkedHashMap) null, 119));
    }

    /* renamed from: scaleOut-L8ZKh-E$default, reason: not valid java name */
    public static ExitTransitionImpl m148scaleOutL8ZKhE$default(TweenSpec tweenSpec, float f, int i) {
        FiniteAnimationSpec finiteAnimationSpec = tweenSpec;
        if ((i & 1) != 0) {
            finiteAnimationSpec = AnimatableKt.spring$default(RecyclerView.DECELERATION_RATE, 400.0f, null, 5);
        }
        if ((i & 2) != 0) {
            f = 0.0f;
        }
        return new ExitTransitionImpl(new TransitionData((Fade) null, (Slide) null, (ChangeSize) null, new Scale(f, TransformOrigin.Center, finiteAnimationSpec), (LinkedHashMap) null, 119));
    }

    public static ExitTransitionImpl shrinkHorizontally$default(FiniteAnimationSpec finiteAnimationSpec, BiasAlignment.Horizontal horizontal, int i) {
        BiasAlignment.Horizontal horizontal2 = Alignment.Companion.End;
        if ((i & 1) != 0) {
            Rect rect = VisibilityThresholdsKt.RectVisibilityThreshold;
            finiteAnimationSpec = AnimatableKt.spring$default(RecyclerView.DECELERATION_RATE, 400.0f, new IntSize(4294967297L), 1);
        }
        if ((i & 2) != 0) {
            horizontal = horizontal2;
        }
        return shrinkOut(finiteAnimationSpec, Intrinsics.areEqual(horizontal, Alignment.Companion.Start) ? Alignment.Companion.CenterStart : Intrinsics.areEqual(horizontal, horizontal2) ? Alignment.Companion.CenterEnd : Alignment.Companion.Center, new CrossfadeKt$Crossfade$3$1(21), (i & 4) != 0);
    }

    public static final ExitTransitionImpl shrinkOut(FiniteAnimationSpec finiteAnimationSpec, BiasAlignment biasAlignment, Function1 function1, boolean z) {
        return new ExitTransitionImpl(new TransitionData((Fade) null, (Slide) null, new ChangeSize(finiteAnimationSpec, biasAlignment, function1, z), (Scale) null, (LinkedHashMap) null, EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE));
    }

    public static /* synthetic */ ExitTransitionImpl shrinkOut$default() {
        Rect rect = VisibilityThresholdsKt.RectVisibilityThreshold;
        return shrinkOut(AnimatableKt.spring$default(RecyclerView.DECELERATION_RATE, 400.0f, new IntSize(4294967297L), 1), Alignment.Companion.BottomEnd, CrossfadeKt$Crossfade$3$1.INSTANCE$12, true);
    }

    public static ExitTransitionImpl shrinkVertically$default(FiniteAnimationSpec finiteAnimationSpec, BiasAlignment.Vertical vertical, int i) {
        BiasAlignment.Vertical vertical2 = Alignment.Companion.Bottom;
        if ((i & 1) != 0) {
            Rect rect = VisibilityThresholdsKt.RectVisibilityThreshold;
            finiteAnimationSpec = AnimatableKt.spring$default(RecyclerView.DECELERATION_RATE, 400.0f, new IntSize(4294967297L), 1);
        }
        if ((i & 2) != 0) {
            vertical = vertical2;
        }
        return shrinkOut(finiteAnimationSpec, Intrinsics.areEqual(vertical, Alignment.Companion.Top) ? Alignment.Companion.TopCenter : Intrinsics.areEqual(vertical, vertical2) ? Alignment.Companion.BottomCenter : Alignment.Companion.Center, new CrossfadeKt$Crossfade$3$1(22), true);
    }

    public static final EnterTransitionImpl slideInHorizontally(FiniteAnimationSpec finiteAnimationSpec, Function1 function1) {
        return new EnterTransitionImpl(new TransitionData((Fade) null, new Slide(finiteAnimationSpec, new EnterExitTransitionKt$slideInVertically$2(1, function1)), (ChangeSize) null, (Scale) null, (LinkedHashMap) null, 125));
    }

    public static /* synthetic */ EnterTransitionImpl slideInHorizontally$default(SvgDecoder$$ExternalSyntheticLambda0 svgDecoder$$ExternalSyntheticLambda0, int i) {
        Rect rect = VisibilityThresholdsKt.RectVisibilityThreshold;
        SpringSpec spring$default = AnimatableKt.spring$default(RecyclerView.DECELERATION_RATE, 400.0f, new IntOffset(4294967297L), 1);
        Function1 function1 = svgDecoder$$ExternalSyntheticLambda0;
        if ((i & 2) != 0) {
            function1 = CrossfadeKt$Crossfade$3$1.INSTANCE$13;
        }
        return slideInHorizontally(spring$default, function1);
    }

    public static final EnterTransitionImpl slideInVertically(FiniteAnimationSpec finiteAnimationSpec, Function1 function1) {
        return new EnterTransitionImpl(new TransitionData((Fade) null, new Slide(finiteAnimationSpec, new EnterExitTransitionKt$slideInVertically$2(0, function1)), (ChangeSize) null, (Scale) null, (LinkedHashMap) null, 125));
    }

    public static /* synthetic */ EnterTransitionImpl slideInVertically$default(int i, Function1 function1) {
        Rect rect = VisibilityThresholdsKt.RectVisibilityThreshold;
        SpringSpec spring$default = AnimatableKt.spring$default(RecyclerView.DECELERATION_RATE, 400.0f, new IntOffset(4294967297L), 1);
        if ((i & 2) != 0) {
            function1 = CrossfadeKt$Crossfade$3$1.INSTANCE$14;
        }
        return slideInVertically(spring$default, function1);
    }

    public static final ExitTransitionImpl slideOutHorizontally(FiniteAnimationSpec finiteAnimationSpec, Function1 function1) {
        return new ExitTransitionImpl(new TransitionData((Fade) null, new Slide(finiteAnimationSpec, new EnterExitTransitionKt$slideInVertically$2(2, function1)), (ChangeSize) null, (Scale) null, (LinkedHashMap) null, 125));
    }

    public static /* synthetic */ ExitTransitionImpl slideOutHorizontally$default(Function1 function1) {
        Rect rect = VisibilityThresholdsKt.RectVisibilityThreshold;
        return slideOutHorizontally(AnimatableKt.spring$default(RecyclerView.DECELERATION_RATE, 400.0f, new IntOffset(4294967297L), 1), function1);
    }

    public static final ExitTransitionImpl slideOutVertically(FiniteAnimationSpec finiteAnimationSpec, Function1 function1) {
        return new ExitTransitionImpl(new TransitionData((Fade) null, new Slide(finiteAnimationSpec, new CacheDrawScope$onDrawBehind$1(1, function1)), (ChangeSize) null, (Scale) null, (LinkedHashMap) null, 125));
    }

    public static /* synthetic */ ExitTransitionImpl slideOutVertically$default(int i, Function1 function1) {
        Rect rect = VisibilityThresholdsKt.RectVisibilityThreshold;
        SpringSpec spring$default = AnimatableKt.spring$default(RecyclerView.DECELERATION_RATE, 400.0f, new IntOffset(4294967297L), 1);
        if ((i & 2) != 0) {
            function1 = CrossfadeKt$Crossfade$3$1.INSTANCE$15;
        }
        return slideOutVertically(spring$default, function1);
    }

    public static final EnterTransitionImpl trackActiveEnter(Transition transition, EnterTransitionImpl enterTransitionImpl, Composer composer, int i) {
        boolean z = (((i & 14) ^ 6) > 4 && ((GapComposer) composer).changed(transition)) || (i & 6) == 4;
        GapComposer gapComposer = (GapComposer) composer;
        Object rememberedValue = gapComposer.rememberedValue();
        if (z || rememberedValue == Composer.Companion.Empty) {
            rememberedValue = Updater.mutableStateOf$default(enterTransitionImpl);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        MutableState mutableState = (MutableState) rememberedValue;
        InteractionResult interactionResult = transition.transitionState;
        ParcelableSnapshotMutableState parcelableSnapshotMutableState = transition.targetState$delegate;
        if (interactionResult.getCurrentState() == parcelableSnapshotMutableState.getValue() && transition.transitionState.getCurrentState() == EnterExitState.Visible) {
            if (transition.isSeeking()) {
                mutableState.setValue(enterTransitionImpl);
            } else {
                mutableState.setValue(EnterTransitionImpl.None);
            }
        } else if (parcelableSnapshotMutableState.getValue() == EnterExitState.Visible) {
            mutableState.setValue(((EnterTransitionImpl) mutableState.getValue()).plus(enterTransitionImpl));
        }
        return (EnterTransitionImpl) mutableState.getValue();
    }

    public static final ExitTransitionImpl trackActiveExit(Transition transition, ExitTransitionImpl exitTransitionImpl, Composer composer, int i) {
        boolean z = (((i & 14) ^ 6) > 4 && ((GapComposer) composer).changed(transition)) || (i & 6) == 4;
        GapComposer gapComposer = (GapComposer) composer;
        Object rememberedValue = gapComposer.rememberedValue();
        if (z || rememberedValue == Composer.Companion.Empty) {
            rememberedValue = Updater.mutableStateOf$default(exitTransitionImpl);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        MutableState mutableState = (MutableState) rememberedValue;
        InteractionResult interactionResult = transition.transitionState;
        ParcelableSnapshotMutableState parcelableSnapshotMutableState = transition.targetState$delegate;
        if (interactionResult.getCurrentState() == parcelableSnapshotMutableState.getValue() && transition.transitionState.getCurrentState() == EnterExitState.Visible) {
            if (transition.isSeeking()) {
                mutableState.setValue(exitTransitionImpl);
            } else {
                mutableState.setValue(ExitTransitionImpl.None);
            }
        } else if (parcelableSnapshotMutableState.getValue() != EnterExitState.Visible) {
            mutableState.setValue(((ExitTransitionImpl) mutableState.getValue()).plus(exitTransitionImpl));
        }
        return (ExitTransitionImpl) mutableState.getValue();
    }
}
