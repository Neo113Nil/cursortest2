package androidx.compose.animation.core;

import android.content.Context;
import androidx.media3.exoplayer.audio.AudioCapabilities;
import androidx.media3.exoplayer.audio.AudioSink$AudioTrackConfig;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class VectorizedFloatDecaySpec {
    public final float absVelocityThreshold;
    public final Object floatDecaySpec;
    public Object targetVector;
    public Object valueVector;
    public Object velocityVector;

    public VectorizedFloatDecaySpec(Context context) {
        this.floatDecaySpec = context != null ? context.getApplicationContext() : null;
        this.velocityVector = AudioSink$AudioTrackConfig.DEFAULT;
        if (context == null) {
            this.targetVector = AudioCapabilities.DEFAULT_AUDIO_CAPABILITIES;
        }
        this.absVelocityThreshold = 8.0f;
    }

    public AnimationVector getTargetValue(AnimationVector animationVector, AnimationVector animationVector2) {
        if (((AnimationVector) this.targetVector) == null) {
            this.targetVector = animationVector.newVector$animation_core();
        }
        AnimationVector animationVector3 = (AnimationVector) this.targetVector;
        if (animationVector3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("targetVector");
            throw null;
        }
        int size$animation_core = animationVector3.getSize$animation_core();
        int i = 0;
        while (true) {
            AnimationVector animationVector4 = (AnimationVector) this.targetVector;
            if (i >= size$animation_core) {
                if (animationVector4 != null) {
                    return animationVector4;
                }
                Intrinsics.throwUninitializedPropertyAccessException("targetVector");
                throw null;
            }
            if (animationVector4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("targetVector");
                throw null;
            }
            animationVector4.set$animation_core(((FloatDecayAnimationSpec) this.floatDecaySpec).getTargetValue(animationVector.get$animation_core(i), animationVector2.get$animation_core(i)), i);
            i++;
        }
    }

    public AnimationVector getVelocityFromNanos(long j, AnimationVector animationVector, AnimationVector animationVector2) {
        if (((AnimationVector) this.velocityVector) == null) {
            this.velocityVector = animationVector.newVector$animation_core();
        }
        AnimationVector animationVector3 = (AnimationVector) this.velocityVector;
        if (animationVector3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("velocityVector");
            throw null;
        }
        int size$animation_core = animationVector3.getSize$animation_core();
        int i = 0;
        while (true) {
            AnimationVector animationVector4 = (AnimationVector) this.velocityVector;
            if (i >= size$animation_core) {
                if (animationVector4 != null) {
                    return animationVector4;
                }
                Intrinsics.throwUninitializedPropertyAccessException("velocityVector");
                throw null;
            }
            if (animationVector4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("velocityVector");
                throw null;
            }
            FloatDecayAnimationSpec floatDecayAnimationSpec = (FloatDecayAnimationSpec) this.floatDecaySpec;
            animationVector.getClass();
            animationVector4.set$animation_core(floatDecayAnimationSpec.getVelocityFromNanos(j, animationVector2.get$animation_core(i)), i);
            i++;
        }
    }

    public VectorizedFloatDecaySpec(FloatDecayAnimationSpec floatDecayAnimationSpec) {
        this.floatDecaySpec = floatDecayAnimationSpec;
        this.absVelocityThreshold = floatDecayAnimationSpec.getAbsVelocityThreshold();
    }
}
