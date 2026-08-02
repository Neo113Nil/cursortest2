package androidx.compose.animation.core;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.collection.ObjectList$$ExternalSyntheticLambda0;
import androidx.compose.animation.core.KeyframesSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.Transition.DeferredAnimation;
import androidx.compose.animation.core.Transition.TransitionAnimationState;
import androidx.compose.foundation.BorderKt$$ExternalSyntheticLambda1;
import androidx.compose.foundation.ClickableKt$$ExternalSyntheticLambda0;
import androidx.compose.foundation.ScrollState$$ExternalSyntheticLambda4;
import androidx.compose.material.SliderDraggableState$drag$2;
import androidx.compose.material.pullrefresh.ArrowValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Recomposer$$ExternalSyntheticLambda4;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotKt$$ExternalSyntheticLambda3;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.MotionDurationScale;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.dynamite.zzg;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.CashApp$$ExternalSyntheticLambda2;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import papa.InteractionResult;
import papa.SafeTrace;

/* loaded from: classes.dex */
public abstract class AnimatableKt {
    public static final AnimationVector1D positiveInfinityBounds1D = new AnimationVector1D(Float.POSITIVE_INFINITY);
    public static final AnimationVector2D positiveInfinityBounds2D = new AnimationVector2D(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    public static final AnimationVector3D positiveInfinityBounds3D = new AnimationVector3D(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    public static final AnimationVector4D positiveInfinityBounds4D = new AnimationVector4D(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    public static final AnimationVector1D negativeInfinityBounds1D = new AnimationVector1D(Float.NEGATIVE_INFINITY);
    public static final AnimationVector2D negativeInfinityBounds2D = new AnimationVector2D(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    public static final AnimationVector3D negativeInfinityBounds3D = new AnimationVector3D(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    public static final AnimationVector4D negativeInfinityBounds4D = new AnimationVector4D(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    public static final ScrollState$$ExternalSyntheticLambda4 SeekableTransitionStateTotalDurationChanged = new ScrollState$$ExternalSyntheticLambda4(2);
    public static final TwoWayConverterImpl FloatToVector = new TwoWayConverterImpl(new ScrollState$$ExternalSyntheticLambda4(3), new ScrollState$$ExternalSyntheticLambda4(20));
    public static final TwoWayConverterImpl IntToVector = new TwoWayConverterImpl(new ScrollState$$ExternalSyntheticLambda4(4), new ScrollState$$ExternalSyntheticLambda4(5));
    public static final TwoWayConverterImpl DpToVector = new TwoWayConverterImpl(new ScrollState$$ExternalSyntheticLambda4(6), new ScrollState$$ExternalSyntheticLambda4(7));
    public static final TwoWayConverterImpl DpOffsetToVector = new TwoWayConverterImpl(new ScrollState$$ExternalSyntheticLambda4(8), new ScrollState$$ExternalSyntheticLambda4(9));
    public static final TwoWayConverterImpl SizeToVector = new TwoWayConverterImpl(new ScrollState$$ExternalSyntheticLambda4(10), new ScrollState$$ExternalSyntheticLambda4(11));
    public static final TwoWayConverterImpl OffsetToVector = new TwoWayConverterImpl(new ScrollState$$ExternalSyntheticLambda4(12), new ScrollState$$ExternalSyntheticLambda4(13));
    public static final TwoWayConverterImpl IntOffsetToVector = new TwoWayConverterImpl(new ScrollState$$ExternalSyntheticLambda4(14), new ScrollState$$ExternalSyntheticLambda4(15));
    public static final TwoWayConverterImpl IntSizeToVector = new TwoWayConverterImpl(new ScrollState$$ExternalSyntheticLambda4(16), new ScrollState$$ExternalSyntheticLambda4(17));
    public static final TwoWayConverterImpl RectToVector = new TwoWayConverterImpl(new ScrollState$$ExternalSyntheticLambda4(18), new ScrollState$$ExternalSyntheticLambda4(19));

    public static final Animatable Animatable(float f, float f2) {
        return new Animatable(Float.valueOf(f), FloatToVector, Float.valueOf(f2), 8);
    }

    public static AnimationState AnimationState$default(float f, float f2, int i) {
        if ((i & 2) != 0) {
            f2 = RecyclerView.DECELERATION_RATE;
        }
        return new AnimationState(FloatToVector, Float.valueOf(f), new AnimationVector1D(f2), Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    public static final void UpdateInitialAndTargetValues(Transition transition, Transition.TransitionAnimationState transitionAnimationState, Object obj, Object obj2, FiniteAnimationSpec finiteAnimationSpec, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(867041821);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(transition) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(transitionAnimationState) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= (i & 512) == 0 ? gapComposer.changed(obj) : gapComposer.changedInstance(obj) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? gapComposer.changed(obj2) : gapComposer.changedInstance(obj2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= (32768 & i) == 0 ? gapComposer.changed(finiteAnimationSpec) : gapComposer.changedInstance(finiteAnimationSpec) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 9363) != 9362)) {
            gapComposer.skipToGroupEnd();
        } else if (transition.isSeeking()) {
            transitionAnimationState.updateInitialAndTargetValue$animation_core(obj, obj2, finiteAnimationSpec);
        } else {
            transitionAnimationState.updateTargetValue$animation_core(obj2, finiteAnimationSpec);
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TransitionKt$$ExternalSyntheticLambda9(transition, transitionAnimationState, obj, obj2, finiteAnimationSpec, i, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00fb A[Catch: CancellationException -> 0x003a, TRY_LEAVE, TryCatch #3 {CancellationException -> 0x003a, blocks: (B:16:0x0035, B:18:0x00e6, B:20:0x00fb, B:25:0x011e, B:27:0x012e, B:33:0x0133), top: B:15:0x0035 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x014d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object animate(AnimationState animationState, Animation animation, long j, final Function1 function1, Continuation continuation) {
        SuspendAnimationKt$animate$4 suspendAnimationKt$animate$4;
        CoroutineSingletons coroutineSingletons;
        int i;
        final Ref$ObjectRef ref$ObjectRef;
        final AnimationState animationState2;
        AnimationState animationState3;
        final float durationScale;
        Ref$ObjectRef ref$ObjectRef2;
        Object withFrameNanos;
        Function1 function12;
        AnimationScope animationScope;
        AnimationScope animationScope2;
        Object obj;
        Object withFrameNanos2;
        final Animation animation2 = animation;
        if (continuation instanceof SuspendAnimationKt$animate$4) {
            suspendAnimationKt$animate$4 = (SuspendAnimationKt$animate$4) continuation;
            int i2 = suspendAnimationKt$animate$4.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                suspendAnimationKt$animate$4.label = i2 - PKIFailureInfo.systemUnavail;
                SuspendAnimationKt$animate$4 suspendAnimationKt$animate$42 = suspendAnimationKt$animate$4;
                Object obj2 = suspendAnimationKt$animate$42.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = suspendAnimationKt$animate$42.label;
                int i3 = 0;
                int i4 = 1;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj2);
                    final Object valueFromNanos = animation2.getValueFromNanos(0L);
                    final AnimationVector velocityVectorFromNanos = animation2.getVelocityVectorFromNanos(0L);
                    ref$ObjectRef = new Ref$ObjectRef();
                    if (j == Long.MIN_VALUE) {
                        try {
                            durationScale = getDurationScale(suspendAnimationKt$animate$42.getContext());
                            animationState2 = animationState;
                        } catch (CancellationException e) {
                            e = e;
                            animationState2 = animationState;
                        }
                        try {
                            Function1 function13 = new Function1() { // from class: androidx.compose.animation.core.SuspendAnimationKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj3) {
                                    long longValue = ((Long) obj3).longValue();
                                    Animation animation3 = animation2;
                                    TwoWayConverterImpl typeConverter = animation3.getTypeConverter();
                                    Object targetValue = animation3.getTargetValue();
                                    AnimationState animationState4 = animationState2;
                                    AnimationScope animationScope3 = new AnimationScope(valueFromNanos, typeConverter, velocityVectorFromNanos, longValue, targetValue, longValue, new SuspendAnimationKt$$ExternalSyntheticLambda2(1, animationState4));
                                    AnimatableKt.doAnimationFrameWithScale(animationScope3, longValue, durationScale, animation3, animationState4, function1);
                                    Ref$ObjectRef.this.element = animationScope3;
                                    return Unit.INSTANCE;
                                }
                            };
                            ref$ObjectRef2 = ref$ObjectRef;
                            try {
                                suspendAnimationKt$animate$42.L$0 = animationState2;
                                suspendAnimationKt$animate$42.L$1 = animation2;
                                suspendAnimationKt$animate$42.L$2 = function1;
                                suspendAnimationKt$animate$42.L$3 = ref$ObjectRef2;
                                suspendAnimationKt$animate$42.label = 1;
                                if (animation2.isInfinite()) {
                                    withFrameNanos = ArcSplineKt.withInfiniteAnimationFrameNanos(suspendAnimationKt$animate$42, function13);
                                } else {
                                    withFrameNanos = Updater.getMonotonicFrameClock(suspendAnimationKt$animate$42.getContext()).withFrameNanos(suspendAnimationKt$animate$42, new SnapshotKt$$ExternalSyntheticLambda3(i4, function13));
                                }
                                if (withFrameNanos != coroutineSingletons) {
                                    animationState3 = animationState2;
                                    function12 = function1;
                                }
                                return coroutineSingletons;
                            } catch (CancellationException e2) {
                                e = e2;
                                animationState3 = animationState2;
                                ref$ObjectRef = ref$ObjectRef2;
                                animationScope = (AnimationScope) ref$ObjectRef.element;
                                if (animationScope != null) {
                                }
                                animationScope2 = (AnimationScope) ref$ObjectRef.element;
                                if (animationScope2 != null) {
                                }
                                throw e;
                            }
                        } catch (CancellationException e3) {
                            e = e3;
                            animationState3 = animationState2;
                            animationScope = (AnimationScope) ref$ObjectRef.element;
                            if (animationScope != null) {
                            }
                            animationScope2 = (AnimationScope) ref$ObjectRef.element;
                            if (animationScope2 != null) {
                            }
                            throw e;
                        }
                    }
                    ref$ObjectRef2 = ref$ObjectRef;
                    try {
                        AnimationScope animationScope3 = new AnimationScope(valueFromNanos, animation2.getTypeConverter(), velocityVectorFromNanos, j, animation2.getTargetValue(), j, new SuspendAnimationKt$$ExternalSyntheticLambda2(i3, animationState));
                        doAnimationFrameWithScale(animationScope3, j, getDurationScale(suspendAnimationKt$animate$42.getContext()), animation2, animationState, function1);
                        ref$ObjectRef2.element = animationScope3;
                        animationState3 = animationState;
                        animation2 = animation;
                        function12 = function1;
                    } catch (CancellationException e4) {
                        e = e4;
                        animationState3 = animationState;
                        ref$ObjectRef = ref$ObjectRef2;
                        animationScope = (AnimationScope) ref$ObjectRef.element;
                        if (animationScope != null) {
                            animationScope.isRunning$delegate.setValue(Boolean.FALSE);
                        }
                        animationScope2 = (AnimationScope) ref$ObjectRef.element;
                        if (animationScope2 != null && animationScope2.lastFrameTimeNanos == animationState3.lastFrameTimeNanos) {
                            animationState3.isRunning = false;
                        }
                        throw e;
                    }
                    ref$ObjectRef = ref$ObjectRef2;
                } else {
                    if (i != 1 && i != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ref$ObjectRef = suspendAnimationKt$animate$42.L$3;
                    function12 = suspendAnimationKt$animate$42.L$2;
                    animation2 = suspendAnimationKt$animate$42.L$1;
                    animationState3 = suspendAnimationKt$animate$42.L$0;
                    try {
                        SafeTrace.throwOnFailure(obj2);
                    } catch (CancellationException e5) {
                        e = e5;
                        animationScope = (AnimationScope) ref$ObjectRef.element;
                        if (animationScope != null) {
                        }
                        animationScope2 = (AnimationScope) ref$ObjectRef.element;
                        if (animationScope2 != null) {
                        }
                        throw e;
                    }
                }
                do {
                    obj = ref$ObjectRef.element;
                    obj.getClass();
                    if (((Boolean) ((AnimationScope) obj).isRunning$delegate.getValue()).booleanValue()) {
                        return Unit.INSTANCE;
                    }
                    final float durationScale2 = getDurationScale(suspendAnimationKt$animate$42.getContext());
                    final Ref$ObjectRef ref$ObjectRef3 = ref$ObjectRef;
                    final Function1 function14 = function12;
                    final Animation animation3 = animation2;
                    final AnimationState animationState4 = animationState3;
                    try {
                        Function1 function15 = new Function1() { // from class: androidx.compose.animation.core.SuspendAnimationKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj3) {
                                long longValue = ((Long) obj3).longValue();
                                Object obj4 = Ref$ObjectRef.this.element;
                                obj4.getClass();
                                AnimatableKt.doAnimationFrameWithScale((AnimationScope) obj4, longValue, durationScale2, animation3, animationState4, function14);
                                return Unit.INSTANCE;
                            }
                        };
                        ref$ObjectRef = ref$ObjectRef3;
                        animation2 = animation3;
                        animationState3 = animationState4;
                        function12 = function14;
                        suspendAnimationKt$animate$42.L$0 = animationState3;
                        suspendAnimationKt$animate$42.L$1 = animation2;
                        suspendAnimationKt$animate$42.L$2 = function12;
                        suspendAnimationKt$animate$42.L$3 = ref$ObjectRef;
                        suspendAnimationKt$animate$42.label = 2;
                        if (animation2.isInfinite()) {
                            withFrameNanos2 = ArcSplineKt.withInfiniteAnimationFrameNanos(suspendAnimationKt$animate$42, function15);
                        } else {
                            withFrameNanos2 = Updater.getMonotonicFrameClock(suspendAnimationKt$animate$42.getContext()).withFrameNanos(suspendAnimationKt$animate$42, new SnapshotKt$$ExternalSyntheticLambda3(i4, function15));
                        }
                    } catch (CancellationException e6) {
                        e = e6;
                        ref$ObjectRef = ref$ObjectRef3;
                        animationState3 = animationState4;
                        animationScope = (AnimationScope) ref$ObjectRef.element;
                        if (animationScope != null) {
                        }
                        animationScope2 = (AnimationScope) ref$ObjectRef.element;
                        if (animationScope2 != null) {
                            animationState3.isRunning = false;
                        }
                        throw e;
                    }
                } while (withFrameNanos2 != coroutineSingletons);
                return coroutineSingletons;
            }
        }
        suspendAnimationKt$animate$4 = new SuspendAnimationKt$animate$4(continuation);
        SuspendAnimationKt$animate$4 suspendAnimationKt$animate$422 = suspendAnimationKt$animate$4;
        Object obj22 = suspendAnimationKt$animate$422.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = suspendAnimationKt$animate$422.label;
        int i32 = 0;
        int i42 = 1;
        if (i != 0) {
        }
        do {
            obj = ref$ObjectRef.element;
            obj.getClass();
            if (((Boolean) ((AnimationScope) obj).isRunning$delegate.getValue()).booleanValue()) {
            }
        } while (withFrameNanos2 != coroutineSingletons);
        return coroutineSingletons;
    }

    public static /* synthetic */ Object animate$default(float f, float f2, AnimationSpec animationSpec, Function2 function2, Continuation continuation, int i) {
        if ((i & 8) != 0) {
            animationSpec = spring$default(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, null, 7);
        }
        return animate(f, f2, RecyclerView.DECELERATION_RATE, animationSpec, function2, continuation);
    }

    public static final Object animateDecay(AnimationState animationState, DecayAnimationSpecImpl decayAnimationSpecImpl, boolean z, Function1 function1, ContinuationImpl continuationImpl) {
        Object animate = animate(animationState, new DecayAnimation(decayAnimationSpecImpl, animationState.typeConverter, animationState.value$delegate.getValue(), animationState.velocityVector), z ? animationState.lastFrameTimeNanos : Long.MIN_VALUE, function1, continuationImpl);
        return animate == CoroutineSingletons.COROUTINE_SUSPENDED ? animate : Unit.INSTANCE;
    }

    public static final Object animateTo(AnimationState animationState, Float f, AnimationSpec animationSpec, boolean z, Function1 function1, ContinuationImpl continuationImpl) {
        Object animate = animate(animationState, new TargetBasedAnimation(animationSpec, animationState.typeConverter, animationState.value$delegate.getValue(), f, animationState.velocityVector), z ? animationState.lastFrameTimeNanos : Long.MIN_VALUE, function1, continuationImpl);
        return animate == CoroutineSingletons.COROUTINE_SUSPENDED ? animate : Unit.INSTANCE;
    }

    public static /* synthetic */ Object animateTo$default(AnimationState animationState, Float f, FiniteAnimationSpec finiteAnimationSpec, boolean z, Function1 function1, ContinuationImpl continuationImpl, int i) {
        if ((i & 2) != 0) {
            finiteAnimationSpec = spring$default(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, null, 7);
        }
        FiniteAnimationSpec finiteAnimationSpec2 = finiteAnimationSpec;
        if ((i & 4) != 0) {
            z = false;
        }
        boolean z2 = z;
        if ((i & 8) != 0) {
            function1 = new BorderKt$$ExternalSyntheticLambda1(15);
        }
        return animateTo(animationState, f, finiteAnimationSpec2, z2, function1, continuationImpl);
    }

    public static final float calculateTargetValue(DecayAnimationSpecImpl decayAnimationSpecImpl, float f, float f2) {
        return ((AnimationVector1D) new VectorizedFloatDecaySpec(decayAnimationSpecImpl.floatDecaySpec).getTargetValue(new AnimationVector1D(f), new AnimationVector1D(f2))).value;
    }

    public static final AnimationVector copy(AnimationVector animationVector) {
        AnimationVector newVector$animation_core = animationVector.newVector$animation_core();
        int size$animation_core = newVector$animation_core.getSize$animation_core();
        for (int i = 0; i < size$animation_core; i++) {
            newVector$animation_core.set$animation_core(animationVector.get$animation_core(i), i);
        }
        return newVector$animation_core;
    }

    public static AnimationState copy$default(AnimationState animationState, float f, float f2, int i) {
        if ((i & 1) != 0) {
            f = ((Number) animationState.value$delegate.getValue()).floatValue();
        }
        if ((i & 2) != 0) {
            f2 = ((AnimationVector1D) animationState.velocityVector).value;
        }
        return new AnimationState(animationState.typeConverter, Float.valueOf(f), new AnimationVector1D(f2), animationState.lastFrameTimeNanos, animationState.finishedTimeNanos, animationState.isRunning);
    }

    public static final Transition createChildTransitionInternal(Transition transition, Object obj, Object obj2, String str, Composer composer, int i) {
        int i2 = (i & 14) ^ 6;
        boolean z = true;
        int i3 = 4;
        boolean z2 = (i2 > 4 && ((GapComposer) composer).changed(transition)) || (i & 6) == 4;
        GapComposer gapComposer = (GapComposer) composer;
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (z2 || rememberedValue == neverEqualPolicy) {
            rememberedValue = new Transition(new MutableTransitionState(obj), transition, Recorder$$ExternalSyntheticOutline2.m(new StringBuilder(), transition.label, " > ", str));
            gapComposer.updateRememberedValue(rememberedValue);
        }
        Transition transition2 = (Transition) rememberedValue;
        if ((i2 <= 4 || !gapComposer.changed(transition)) && (i & 6) != 4) {
            z = false;
        }
        boolean changed = gapComposer.changed(transition2) | z;
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (changed || rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = new Recomposer$$ExternalSyntheticLambda4(i3, transition, transition2);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        Updater.DisposableEffect(transition2, (Function1) rememberedValue2, gapComposer);
        if (transition.isSeeking()) {
            transition2.seek(obj, obj2);
            return transition2;
        }
        transition2.updateTarget$animation_core(obj2);
        transition2.isSeeking$delegate.setValue(Boolean.FALSE);
        return transition2;
    }

    public static final Transition.DeferredAnimation createDeferredAnimation(Transition transition, TwoWayConverterImpl twoWayConverterImpl, String str, Composer composer, int i, int i2) {
        Transition.DeferredAnimation.DeferredAnimationData deferredAnimationData;
        if ((i2 & 2) != 0) {
            str = "DeferredAnimation";
        }
        boolean changed = ((GapComposer) composer).changed(transition);
        GapComposer gapComposer = (GapComposer) composer;
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (changed || rememberedValue == neverEqualPolicy) {
            rememberedValue = transition.new DeferredAnimation(twoWayConverterImpl, str);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        Transition.DeferredAnimation deferredAnimation = (Transition.DeferredAnimation) rememberedValue;
        boolean changed2 = gapComposer.changed(transition) | gapComposer.changedInstance(deferredAnimation);
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (changed2 || rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = new Recomposer$$ExternalSyntheticLambda4(5, transition, deferredAnimation);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        Updater.DisposableEffect(deferredAnimation, (Function1) rememberedValue2, gapComposer);
        if (transition.isSeeking() && (deferredAnimationData = (Transition.DeferredAnimation.DeferredAnimationData) deferredAnimation.data$delegate.getValue()) != null) {
            Transition transition2 = Transition.this;
            deferredAnimationData.animation.updateInitialAndTargetValue$animation_core(deferredAnimationData.targetValueByState.invoke(transition2.getSegment().getInitialState()), deferredAnimationData.targetValueByState.invoke(transition2.getSegment().getTargetState()), (FiniteAnimationSpec) deferredAnimationData.transitionSpec.invoke(transition2.getSegment()));
        }
        return deferredAnimation;
    }

    public static final Transition.TransitionAnimationState createTransitionAnimation(Transition transition, Object obj, Object obj2, FiniteAnimationSpec finiteAnimationSpec, TwoWayConverterImpl twoWayConverterImpl, Composer composer, int i) {
        boolean changed = ((GapComposer) composer).changed(transition);
        GapComposer gapComposer = (GapComposer) composer;
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (changed || rememberedValue == neverEqualPolicy) {
            Snapshot currentThreadSnapshot = zzg.getCurrentThreadSnapshot();
            Function1 readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
            Snapshot makeCurrentNonObservable = zzg.makeCurrentNonObservable(currentThreadSnapshot);
            try {
                AnimationVector animationVector = (AnimationVector) twoWayConverterImpl.convertToVector.invoke(obj2);
                animationVector.reset$animation_core();
                Transition.TransitionAnimationState transitionAnimationState = transition.new TransitionAnimationState(obj, animationVector, twoWayConverterImpl);
                zzg.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                gapComposer.updateRememberedValue(transitionAnimationState);
                rememberedValue = transitionAnimationState;
            } catch (Throwable th) {
                zzg.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                throw th;
            }
        }
        Transition.TransitionAnimationState transitionAnimationState2 = (Transition.TransitionAnimationState) rememberedValue;
        UpdateInitialAndTargetValues(transition, transitionAnimationState2, obj, obj2, finiteAnimationSpec, gapComposer, 0);
        boolean changed2 = gapComposer.changed(transition) | gapComposer.changed(transitionAnimationState2);
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (changed2 || rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = new ClickableKt$$ExternalSyntheticLambda0(10, transition, transitionAnimationState2);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        Updater.DisposableEffect(transitionAnimationState2, (Function1) rememberedValue2, gapComposer);
        return transitionAnimationState2;
    }

    public static final void doAnimationFrameWithScale(AnimationScope animationScope, long j, float f, Animation animation, AnimationState animationState, Function1 function1) {
        long durationNanos = f == RecyclerView.DECELERATION_RATE ? animation.getDurationNanos() : (long) ((j - animationScope.startTimeNanos) / f);
        animationScope.lastFrameTimeNanos = j;
        animationScope.value$delegate.setValue(animation.getValueFromNanos(durationNanos));
        animationScope.velocityVector = animation.getVelocityVectorFromNanos(durationNanos);
        if (animation.isFinishedFromNanos(durationNanos)) {
            animationScope.finishedTimeNanos = animationScope.lastFrameTimeNanos;
            animationScope.isRunning$delegate.setValue(Boolean.FALSE);
        }
        updateState(animationScope, animationState);
        function1.invoke(animationScope);
    }

    public static DecayAnimationSpecImpl exponentialDecay$default() {
        return new DecayAnimationSpecImpl(new ArrowValues());
    }

    public static final float getDurationScale(CoroutineContext coroutineContext) {
        MotionDurationScale motionDurationScale = (MotionDurationScale) coroutineContext.get(Alignment.Companion.$$INSTANCE);
        float scaleFactor = motionDurationScale != null ? motionDurationScale.getScaleFactor() : 1.0f;
        if (scaleFactor >= RecyclerView.DECELERATION_RATE) {
            return scaleFactor;
        }
        PreconditionsKt.throwIllegalStateException("negative scale factor");
        return scaleFactor;
    }

    /* renamed from: infiniteRepeatable-9IiC70o$default, reason: not valid java name */
    public static InfiniteRepeatableSpec m154infiniteRepeatable9IiC70o$default(DurationBasedAnimationSpec durationBasedAnimationSpec, RepeatMode repeatMode, int i) {
        if ((i & 2) != 0) {
            repeatMode = RepeatMode.Restart;
        }
        return new InfiniteRepeatableSpec(durationBasedAnimationSpec, repeatMode, 0L);
    }

    public static final KeyframesSpec keyframes(Function1 function1) {
        KeyframesSpec.KeyframesSpecConfig keyframesSpecConfig = new KeyframesSpec.KeyframesSpecConfig();
        function1.invoke(keyframesSpecConfig);
        return new KeyframesSpec(keyframesSpecConfig);
    }

    public static final Transition rememberTransition(InteractionResult interactionResult, String str, Composer composer, int i, int i2) {
        Continuation continuation = null;
        if ((i2 & 2) != 0) {
            str = null;
        }
        int i3 = (i & 14) ^ 6;
        boolean z = true;
        boolean z2 = (i3 > 4 && ((GapComposer) composer).changed(interactionResult)) || (i & 6) == 4;
        GapComposer gapComposer = (GapComposer) composer;
        Object rememberedValue = gapComposer.rememberedValue();
        Object obj = Composer.Companion.Empty;
        if (z2 || rememberedValue == obj) {
            Snapshot currentThreadSnapshot = zzg.getCurrentThreadSnapshot();
            Function1 readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
            Snapshot makeCurrentNonObservable = zzg.makeCurrentNonObservable(currentThreadSnapshot);
            try {
                Object transition = new Transition(interactionResult, null, str);
                zzg.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                gapComposer.updateRememberedValue(transition);
                rememberedValue = transition;
            } catch (Throwable th) {
                zzg.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                throw th;
            }
        }
        Transition transition2 = (Transition) rememberedValue;
        if (interactionResult instanceof SeekableTransitionState) {
            gapComposer.startReplaceGroup(-1357590553);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (rememberedValue2 == obj) {
                rememberedValue2 = Updater.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, gapComposer);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            Object obj2 = (CoroutineScope) rememberedValue2;
            boolean changedInstance = gapComposer.changedInstance(obj2) | ((i3 > 4 && gapComposer.changed(interactionResult)) || (i & 6) == 4);
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue3 == obj) {
                rememberedValue3 = new ClickableKt$$ExternalSyntheticLambda0(11, interactionResult, obj2);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            Updater.DisposableEffect(obj2, (Function1) rememberedValue3, gapComposer);
            SeekableTransitionState seekableTransitionState = (SeekableTransitionState) interactionResult;
            Object currentState = seekableTransitionState.getCurrentState();
            Object targetState = seekableTransitionState.getTargetState();
            if ((i3 <= 4 || !gapComposer.changed(interactionResult)) && (i & 6) != 4) {
                z = false;
            }
            Object rememberedValue4 = gapComposer.rememberedValue();
            if (z || rememberedValue4 == obj) {
                rememberedValue4 = new SliderDraggableState$drag$2(interactionResult, continuation, 12);
                gapComposer.updateRememberedValue(rememberedValue4);
            }
            Updater.LaunchedEffect(currentState, targetState, (Function2) rememberedValue4, gapComposer);
            gapComposer.end(false);
        } else {
            gapComposer.startReplaceGroup(-1356604288);
            transition2.animateTo$animation_core(interactionResult.getTargetState(), gapComposer, 0);
            gapComposer.end(false);
        }
        boolean changed = gapComposer.changed(transition2);
        Object rememberedValue5 = gapComposer.rememberedValue();
        if (changed || rememberedValue5 == obj) {
            rememberedValue5 = new ObjectList$$ExternalSyntheticLambda0(transition2, 14);
            gapComposer.updateRememberedValue(rememberedValue5);
        }
        Updater.DisposableEffect(transition2, (Function1) rememberedValue5, gapComposer);
        return transition2;
    }

    public static SnapSpec snap$default() {
        return new SnapSpec(0);
    }

    public static SpringSpec spring$default(float f, float f2, Object obj, int i) {
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        if ((i & 2) != 0) {
            f2 = 1500.0f;
        }
        if ((i & 4) != 0) {
            obj = null;
        }
        return new SpringSpec(f, f2, obj);
    }

    public static TweenSpec tween$default(int i, int i2, Easing easing, int i3) {
        if ((i3 & 1) != 0) {
            i = EnumC0170g.SDK_ASSET_TRANSFER_ICON_CIRCLE_VALUE;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            easing = EasingKt.FastOutSlowInEasing;
        }
        return new TweenSpec(i, i2, easing);
    }

    public static final void updateState(AnimationScope animationScope, AnimationState animationState) {
        animationState.value$delegate.setValue(animationScope.value$delegate.getValue());
        AnimationVector animationVector = animationState.velocityVector;
        AnimationVector animationVector2 = animationScope.velocityVector;
        int size$animation_core = animationVector.getSize$animation_core();
        for (int i = 0; i < size$animation_core; i++) {
            animationVector.set$animation_core(animationVector2.get$animation_core(i), i);
        }
        animationState.finishedTimeNanos = animationScope.finishedTimeNanos;
        animationState.lastFrameTimeNanos = animationScope.lastFrameTimeNanos;
        animationState.isRunning = ((Boolean) animationScope.isRunning$delegate.getValue()).booleanValue();
    }

    public static final Transition updateTransition(Object obj, String str, Composer composer, int i, int i2) {
        if ((i2 & 2) != 0) {
            str = null;
        }
        GapComposer gapComposer = (GapComposer) composer;
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy) {
            rememberedValue = new Transition(new MutableTransitionState(obj), null, str);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        Transition transition = (Transition) rememberedValue;
        transition.animateTo$animation_core(obj, gapComposer, (i & 8) | 48 | (i & 14));
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = new CashApp$$ExternalSyntheticLambda2(transition, 1);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        Updater.DisposableEffect(transition, (Function1) rememberedValue2, gapComposer);
        return transition;
    }

    public static final Transition updateTransition(MutableTransitionState mutableTransitionState, String str, Composer composer, int i) {
        return rememberTransition(mutableTransitionState, str, composer, i & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, 0);
    }

    public static final Object animate(float f, float f2, float f3, AnimationSpec animationSpec, Function2 function2, Continuation continuation) {
        Float f4 = new Float(f);
        Float f5 = new Float(f2);
        Float f6 = new Float(f3);
        TwoWayConverterImpl twoWayConverterImpl = FloatToVector;
        Function1 function1 = twoWayConverterImpl.convertToVector;
        AnimationVector animationVector = (AnimationVector) function1.invoke(f6);
        if (animationVector == null) {
            animationVector = ((AnimationVector) function1.invoke(f4)).newVector$animation_core();
        }
        AnimationVector animationVector2 = animationVector;
        Object animate = animate(new AnimationState(twoWayConverterImpl, f4, animationVector2, 56), new TargetBasedAnimation(animationSpec, twoWayConverterImpl, f4, f5, animationVector2), Long.MIN_VALUE, new SuspendAnimationKt$$ExternalSyntheticLambda0(0, function2), continuation);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (animate != coroutineSingletons) {
            animate = Unit.INSTANCE;
        }
        return animate == coroutineSingletons ? animate : Unit.INSTANCE;
    }
}
