package androidx.compose.animation.core;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;

/* loaded from: classes3.dex */
public final class DecayAnimation implements Animation {
    public final VectorizedFloatDecaySpec animationSpec;
    public final long durationNanos;
    public final AnimationVector endVelocity;
    public final Object initialValue;
    public final AnimationVector initialValueVector;
    public final AnimationVector initialVelocityVector;
    public final Object targetValue;
    public final TwoWayConverterImpl typeConverter;

    public DecayAnimation(DecayAnimationSpecImpl decayAnimationSpecImpl, TwoWayConverterImpl twoWayConverterImpl, Object obj, AnimationVector animationVector) {
        VectorizedFloatDecaySpec vectorizedFloatDecaySpec = new VectorizedFloatDecaySpec(decayAnimationSpecImpl.floatDecaySpec);
        this.animationSpec = vectorizedFloatDecaySpec;
        this.typeConverter = twoWayConverterImpl;
        this.initialValue = obj;
        AnimationVector animationVector2 = (AnimationVector) twoWayConverterImpl.convertToVector.invoke(obj);
        this.initialValueVector = animationVector2;
        this.initialVelocityVector = AnimatableKt.copy(animationVector);
        this.targetValue = twoWayConverterImpl.convertFromVector.invoke(vectorizedFloatDecaySpec.getTargetValue(animationVector2, animationVector));
        if (((AnimationVector) vectorizedFloatDecaySpec.velocityVector) == null) {
            vectorizedFloatDecaySpec.velocityVector = animationVector2.newVector$animation_core();
        }
        AnimationVector animationVector3 = (AnimationVector) vectorizedFloatDecaySpec.velocityVector;
        if (animationVector3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("velocityVector");
            throw null;
        }
        int size$animation_core = animationVector3.getSize$animation_core();
        long j = 0;
        for (int i = 0; i < size$animation_core; i++) {
            FloatDecayAnimationSpec floatDecayAnimationSpec = (FloatDecayAnimationSpec) vectorizedFloatDecaySpec.floatDecaySpec;
            animationVector2.getClass();
            j = Math.max(j, floatDecayAnimationSpec.getDurationNanos(animationVector.get$animation_core(i)));
        }
        this.durationNanos = j;
        AnimationVector copy = AnimatableKt.copy(this.animationSpec.getVelocityFromNanos(j, this.initialValueVector, animationVector));
        this.endVelocity = copy;
        int size$animation_core2 = copy.getSize$animation_core();
        for (int i2 = 0; i2 < size$animation_core2; i2++) {
            AnimationVector animationVector4 = this.endVelocity;
            float f = animationVector4.get$animation_core(i2);
            float f2 = this.animationSpec.absVelocityThreshold;
            animationVector4.set$animation_core(RangesKt___RangesKt.coerceIn(f, -f2, f2), i2);
        }
    }

    @Override // androidx.compose.animation.core.Animation
    public final long getDurationNanos() {
        return this.durationNanos;
    }

    @Override // androidx.compose.animation.core.Animation
    public final Object getTargetValue() {
        return this.targetValue;
    }

    @Override // androidx.compose.animation.core.Animation
    public final TwoWayConverterImpl getTypeConverter() {
        return this.typeConverter;
    }

    @Override // androidx.compose.animation.core.Animation
    public final Object getValueFromNanos(long j) {
        if (isFinishedFromNanos(j)) {
            return this.targetValue;
        }
        Function1 function1 = this.typeConverter.convertFromVector;
        VectorizedFloatDecaySpec vectorizedFloatDecaySpec = this.animationSpec;
        AnimationVector animationVector = (AnimationVector) vectorizedFloatDecaySpec.valueVector;
        AnimationVector animationVector2 = this.initialValueVector;
        if (animationVector == null) {
            vectorizedFloatDecaySpec.valueVector = animationVector2.newVector$animation_core();
        }
        AnimationVector animationVector3 = (AnimationVector) vectorizedFloatDecaySpec.valueVector;
        if (animationVector3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("valueVector");
            throw null;
        }
        int size$animation_core = animationVector3.getSize$animation_core();
        int i = 0;
        while (true) {
            AnimationVector animationVector4 = (AnimationVector) vectorizedFloatDecaySpec.valueVector;
            if (i >= size$animation_core) {
                if (animationVector4 != null) {
                    return function1.invoke(animationVector4);
                }
                Intrinsics.throwUninitializedPropertyAccessException("valueVector");
                throw null;
            }
            if (animationVector4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("valueVector");
                throw null;
            }
            animationVector4.set$animation_core(((FloatDecayAnimationSpec) vectorizedFloatDecaySpec.floatDecaySpec).getValueFromNanos(animationVector2.get$animation_core(i), this.initialVelocityVector.get$animation_core(i), j), i);
            i++;
        }
    }

    @Override // androidx.compose.animation.core.Animation
    public final AnimationVector getVelocityVectorFromNanos(long j) {
        if (isFinishedFromNanos(j)) {
            return this.endVelocity;
        }
        return this.animationSpec.getVelocityFromNanos(j, this.initialValueVector, this.initialVelocityVector);
    }

    @Override // androidx.compose.animation.core.Animation
    public final boolean isInfinite() {
        return false;
    }
}
