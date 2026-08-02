package androidx.compose.animation.core;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Updater;
import androidx.paging.Pager$pageFetcher$2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;

/* loaded from: classes.dex */
public final class Animatable {
    public final SpringSpec defaultSpringSpec;
    public final AnimationState internalState;
    public final ParcelableSnapshotMutableState isRunning$delegate;
    public final String label;
    public Float lowerBound;
    public AnimationVector lowerBoundVector;
    public final MutatorMutex mutatorMutex;
    public final AnimationVector negativeInfinityBounds;
    public final AnimationVector positiveInfinityBounds;
    public final ParcelableSnapshotMutableState targetValue$delegate;
    public final TwoWayConverterImpl typeConverter;
    public Float upperBound;
    public AnimationVector upperBoundVector;
    public final Object visibilityThreshold;

    public Animatable(Object obj, TwoWayConverterImpl twoWayConverterImpl, Object obj2, String str) {
        this.typeConverter = twoWayConverterImpl;
        this.visibilityThreshold = obj2;
        this.label = str;
        AnimationState animationState = new AnimationState(twoWayConverterImpl, obj, null, 60);
        this.internalState = animationState;
        this.isRunning$delegate = Updater.mutableStateOf$default(Boolean.FALSE);
        this.targetValue$delegate = Updater.mutableStateOf$default(obj);
        this.mutatorMutex = new MutatorMutex();
        this.defaultSpringSpec = new SpringSpec(obj2, 3);
        AnimationVector animationVector = animationState.velocityVector;
        boolean z = animationVector instanceof AnimationVector1D;
        AnimationVector animationVector2 = z ? AnimatableKt.negativeInfinityBounds1D : animationVector instanceof AnimationVector2D ? AnimatableKt.negativeInfinityBounds2D : animationVector instanceof AnimationVector3D ? AnimatableKt.negativeInfinityBounds3D : AnimatableKt.negativeInfinityBounds4D;
        this.negativeInfinityBounds = animationVector2;
        AnimationVector animationVector3 = z ? AnimatableKt.positiveInfinityBounds1D : animationVector instanceof AnimationVector2D ? AnimatableKt.positiveInfinityBounds2D : animationVector instanceof AnimationVector3D ? AnimatableKt.positiveInfinityBounds3D : AnimatableKt.positiveInfinityBounds4D;
        this.positiveInfinityBounds = animationVector3;
        this.lowerBoundVector = animationVector2;
        this.upperBoundVector = animationVector3;
    }

    public static final void access$endAnimation(Animatable animatable) {
        AnimationState animationState = animatable.internalState;
        animationState.velocityVector.reset$animation_core();
        animationState.lastFrameTimeNanos = Long.MIN_VALUE;
        animatable.isRunning$delegate.setValue(Boolean.FALSE);
    }

    public static Object animateTo$default(Animatable animatable, Object obj, AnimationSpec animationSpec, Float f, Function1 function1, Continuation continuation, int i) {
        if ((i & 2) != 0) {
            animationSpec = animatable.defaultSpringSpec;
        }
        AnimationSpec animationSpec2 = animationSpec;
        Object obj2 = f;
        if ((i & 4) != 0) {
            obj2 = animatable.typeConverter.convertFromVector.invoke(animatable.internalState.velocityVector);
        }
        Object obj3 = obj2;
        if ((i & 8) != 0) {
            function1 = null;
        }
        return animatable.animateTo(obj, animationSpec2, obj3, function1, continuation);
    }

    public final Object animateTo(Object obj, AnimationSpec animationSpec, Object obj2, Function1 function1, Continuation continuation) {
        Object value = getValue();
        TwoWayConverterImpl twoWayConverterImpl = this.typeConverter;
        return MutatorMutex.mutate$default(this.mutatorMutex, new Animatable$runAnimation$2(this, obj2, new TargetBasedAnimation(animationSpec, twoWayConverterImpl, value, obj, (AnimationVector) twoWayConverterImpl.convertToVector.invoke(obj2)), this.internalState.lastFrameTimeNanos, function1, null), continuation);
    }

    public final Object clampToBounds(Object obj) {
        if (!Intrinsics.areEqual(this.lowerBoundVector, this.negativeInfinityBounds) || !Intrinsics.areEqual(this.upperBoundVector, this.positiveInfinityBounds)) {
            TwoWayConverterImpl twoWayConverterImpl = this.typeConverter;
            AnimationVector animationVector = (AnimationVector) twoWayConverterImpl.convertToVector.invoke(obj);
            int size$animation_core = animationVector.getSize$animation_core();
            boolean z = false;
            for (int i = 0; i < size$animation_core; i++) {
                if (animationVector.get$animation_core(i) < this.lowerBoundVector.get$animation_core(i) || animationVector.get$animation_core(i) > this.upperBoundVector.get$animation_core(i)) {
                    animationVector.set$animation_core(RangesKt___RangesKt.coerceIn(animationVector.get$animation_core(i), this.lowerBoundVector.get$animation_core(i), this.upperBoundVector.get$animation_core(i)), i);
                    z = true;
                }
            }
            if (z) {
                return twoWayConverterImpl.convertFromVector.invoke(animationVector);
            }
        }
        return obj;
    }

    public final Object getValue() {
        return this.internalState.value$delegate.getValue();
    }

    public final boolean isRunning() {
        return ((Boolean) this.isRunning$delegate.getValue()).booleanValue();
    }

    public final Object snapTo(Object obj, Continuation continuation) {
        Object mutate$default = MutatorMutex.mutate$default(this.mutatorMutex, new Animatable$snapTo$2(this, obj, null), continuation);
        return mutate$default == CoroutineSingletons.COROUTINE_SUSPENDED ? mutate$default : Unit.INSTANCE;
    }

    public final Object stop(SuspendLambda suspendLambda) {
        Object mutate$default = MutatorMutex.mutate$default(this.mutatorMutex, new Pager$pageFetcher$2(this, null, 3), suspendLambda);
        return mutate$default == CoroutineSingletons.COROUTINE_SUSPENDED ? mutate$default : Unit.INSTANCE;
    }

    public /* synthetic */ Animatable(Object obj, TwoWayConverterImpl twoWayConverterImpl, Object obj2, int i) {
        this(obj, twoWayConverterImpl, (i & 4) != 0 ? null : obj2, "Animatable");
    }
}
