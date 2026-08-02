package com.squareup.cash.card.onboarding.graphics;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.recyclerview.widget.RecyclerView;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.graphics.backend.math.Quat;
import com.squareup.cash.graphics.backend.math.Vector3;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt__MathJVMKt;
import kotlin.ranges.RangesKt___RangesKt;

/* loaded from: classes6.dex */
public final class WandPoseController implements TagPoseController {
    public static final float[] LOCAL_Y_AXIS = {RecyclerView.DECELERATION_RATE, 1.0f, RecyclerView.DECELERATION_RATE};
    public float ambientGain;
    public float blendDirection;
    public WandPose blendFrom;
    public float blendProgress;
    public WandPose blendTo;
    public WandPoseConfig config;
    public WandPose currentPose;
    public float dragSpringPitchVel;
    public float dragSpringYawVel;
    public float flickSettleVel;
    public float flickYawVel;
    public WandStatePose frozenFromPose;
    public Float frozenTransitionStartTime;
    public float gesturePitch;
    public float gestureYaw;
    public boolean isDragging;
    public WandStatePose lastAppliedPose;
    public float lastTickTime;
    public float poseEnteredAtTime;
    public WandPose previousPose;
    public Float transitionStartTime;

    public final class Output {
        public final float darkening;
        public final float lightIntensity;
        public final float opacity;
        public final Vector3 positionOffset;
        public final Quat rotation;
        public final float saturation;
        public final float scale;

        public Output(Vector3 vector3, Quat quat, float f, float f2, float f3, float f4, float f5) {
            vector3.getClass();
            this.positionOffset = vector3;
            this.rotation = quat;
            this.scale = f;
            this.opacity = f2;
            this.darkening = f3;
            this.lightIntensity = f4;
            this.saturation = f5;
        }

        public static Output copy$default(Output output, Vector3 vector3) {
            return new Output(vector3, output.rotation, output.scale, output.opacity, output.darkening, output.lightIntensity, output.saturation);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Output)) {
                return false;
            }
            Output output = (Output) obj;
            return Intrinsics.areEqual(this.positionOffset, output.positionOffset) && this.rotation.equals(output.rotation) && Float.compare(this.scale, output.scale) == 0 && Float.compare(this.opacity, output.opacity) == 0 && Float.compare(this.darkening, output.darkening) == 0 && Float.compare(this.lightIntensity, output.lightIntensity) == 0 && Float.compare(this.saturation, output.saturation) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.saturation) + CameraState$Type$EnumUnboxingLocalUtility.m(this.lightIntensity, CameraState$Type$EnumUnboxingLocalUtility.m(this.darkening, CameraState$Type$EnumUnboxingLocalUtility.m(this.opacity, CameraState$Type$EnumUnboxingLocalUtility.m(this.scale, (this.rotation.hashCode() + (this.positionOffset.hashCode() * 31)) * 31, 31), 31), 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Output(positionOffset=");
            sb.append(this.positionOffset);
            sb.append(", rotation=");
            sb.append(this.rotation);
            sb.append(", scale=");
            Request$Priority$EnumUnboxingLocalUtility.m(sb, this.scale, ", opacity=", this.opacity, ", darkening=");
            Request$Priority$EnumUnboxingLocalUtility.m(sb, this.darkening, ", lightIntensity=", this.lightIntensity, ", saturation=");
            return Recorder$$ExternalSyntheticOutline1.m(this.saturation, ")", sb);
        }
    }

    public final class SpringStep {
        public final float position;
        public final float velocity;

        public SpringStep(float f, float f2) {
            this.position = f;
            this.velocity = f2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SpringStep)) {
                return false;
            }
            SpringStep springStep = (SpringStep) obj;
            return Float.compare(this.position, springStep.position) == 0 && Float.compare(this.velocity, springStep.velocity) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.velocity) + (Float.hashCode(this.position) * 31);
        }

        public final String toString() {
            return "SpringStep(position=" + this.position + ", velocity=" + this.velocity + ")";
        }
    }

    public /* synthetic */ WandPoseController(WandPose wandPose) {
        this(wandPose, new WandPoseConfig(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, -1, -1));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002d A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean hasAmbientMotion(WandPose wandPose, WandPoseConfig wandPoseConfig) {
        switch (wandPose.ordinal()) {
            case 0:
                return wandPoseConfig.floatAmplitude != RecyclerView.DECELERATION_RATE;
            case 1:
                wandPoseConfig.getClass();
                return false;
            case 2:
                if (wandPoseConfig.activeAmplitude != RecyclerView.DECELERATION_RATE) {
                    return true;
                }
                break;
            case 3:
                if (wandPoseConfig.twirlRPM != RecyclerView.DECELERATION_RATE) {
                    return true;
                }
                break;
            case 4:
            case 6:
            case 7:
                break;
            case 5:
                if (wandPoseConfig.leanSwayAmpDeg != RecyclerView.DECELERATION_RATE) {
                    return true;
                }
                break;
            default:
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return false;
        }
    }

    public static SpringStep springStep(float f, float f2, float f3, float f4, float f5, float f6) {
        float f7 = ((((f2 - f) * (-f5)) - (f6 * f3)) * f4) + f3;
        float f8 = (f4 * f7) + f2;
        return (Math.abs(f8 - f) >= 5.0E-4f || Math.abs(f7) >= 0.01f) ? new SpringStep(f8, f7) : new SpringStep(f, RecyclerView.DECELERATION_RATE);
    }

    @Override // com.squareup.cash.card.onboarding.graphics.TagPoseController
    public final WandPoseConfig getConfig() {
        return this.config;
    }

    @Override // com.squareup.cash.card.onboarding.graphics.TagPoseController
    public final WandPose getCurrentPose() {
        return this.currentPose;
    }

    @Override // com.squareup.cash.card.onboarding.graphics.TagPoseController
    public final boolean isAnimating() {
        if (this.blendFrom != null || this.transitionStartTime != null || this.isDragging || this.flickYawVel != RecyclerView.DECELERATION_RATE || this.flickSettleVel != RecyclerView.DECELERATION_RATE || this.dragSpringYawVel != RecyclerView.DECELERATION_RATE || this.dragSpringPitchVel != RecyclerView.DECELERATION_RATE || this.gestureYaw != RecyclerView.DECELERATION_RATE || this.gesturePitch != RecyclerView.DECELERATION_RATE || hasAmbientMotion(this.currentPose, this.config)) {
            return true;
        }
        WandPose wandPose = this.blendTo;
        return wandPose != null ? hasAmbientMotion(wandPose, this.config) : false;
    }

    @Override // com.squareup.cash.card.onboarding.graphics.TagPoseController
    public final void onDrag(float f, float f2) {
        int ordinal = this.config.interactionFor(this.currentPose).ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                this.gestureYaw = (f * this.config.dragYawSensitivity) + this.gestureYaw;
            } else {
                if (ordinal != 2) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                float f3 = this.gestureYaw;
                WandPoseConfig wandPoseConfig = this.config;
                this.gestureYaw = (f * wandPoseConfig.dragYawSensitivity) + f3;
                this.gesturePitch = (f2 * wandPoseConfig.dragPitchSensitivity) + this.gesturePitch;
            }
        }
    }

    @Override // com.squareup.cash.card.onboarding.graphics.TagPoseController
    public final void onDragEnd(float f) {
        this.isDragging = false;
        if (this.config.interactionFor(this.currentPose) == WandInteractionMode.YawFlick) {
            this.flickYawVel = f * this.config.dragYawSensitivity;
        }
    }

    @Override // com.squareup.cash.card.onboarding.graphics.TagPoseController
    public final void onDragStart() {
        if (this.config.interactionFor(this.currentPose) == WandInteractionMode.None) {
            return;
        }
        this.isDragging = true;
    }

    @Override // com.squareup.cash.card.onboarding.graphics.TagPoseController
    public final void setBlendedPose(WandPose wandPose, float f, float f2) {
        this.blendFrom = WandPose.Still;
        this.blendTo = wandPose;
        this.blendProgress = RangesKt___RangesKt.coerceIn(f, RecyclerView.DECELERATION_RATE, 1.0f);
        this.blendDirection = RangesKt___RangesKt.coerceIn(f2, -1.0f, 1.0f);
        this.transitionStartTime = null;
        this.frozenFromPose = null;
        this.frozenTransitionStartTime = null;
        this.previousPose = wandPose;
        this.currentPose = wandPose;
    }

    @Override // com.squareup.cash.card.onboarding.graphics.TagPoseController
    public final void setConfig(WandPoseConfig wandPoseConfig) {
        this.config = wandPoseConfig;
    }

    @Override // com.squareup.cash.card.onboarding.graphics.TagPoseController
    public final void setPose(WandPose wandPose) {
        boolean z = this.blendFrom != null;
        this.blendFrom = null;
        this.blendTo = null;
        WandPose wandPose2 = this.currentPose;
        if (wandPose != wandPose2 || z) {
            this.previousPose = wandPose2;
            float f = this.lastTickTime;
            this.poseEnteredAtTime = f;
            this.transitionStartTime = wandPose != wandPose2 ? Float.valueOf(f) : null;
            this.gestureYaw = RecyclerView.DECELERATION_RATE;
            this.gesturePitch = RecyclerView.DECELERATION_RATE;
            this.flickYawVel = RecyclerView.DECELERATION_RATE;
            this.flickSettleVel = RecyclerView.DECELERATION_RATE;
            this.dragSpringYawVel = RecyclerView.DECELERATION_RATE;
            this.dragSpringPitchVel = RecyclerView.DECELERATION_RATE;
            this.isDragging = false;
            this.currentPose = wandPose;
        }
    }

    @Override // com.squareup.cash.card.onboarding.graphics.TagPoseController
    public final void snapToPose(WandPose wandPose) {
        this.blendFrom = null;
        this.blendTo = null;
        this.previousPose = wandPose;
        this.poseEnteredAtTime = this.lastTickTime;
        this.transitionStartTime = null;
        this.frozenFromPose = null;
        this.frozenTransitionStartTime = null;
        this.lastAppliedPose = null;
        this.gestureYaw = RecyclerView.DECELERATION_RATE;
        this.gesturePitch = RecyclerView.DECELERATION_RATE;
        this.flickYawVel = RecyclerView.DECELERATION_RATE;
        this.flickSettleVel = RecyclerView.DECELERATION_RATE;
        this.dragSpringYawVel = RecyclerView.DECELERATION_RATE;
        this.dragSpringPitchVel = RecyclerView.DECELERATION_RATE;
        this.isDragging = false;
        this.currentPose = wandPose;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00f9, code lost:
    
        if ((java.lang.Math.abs(r18.gesturePitch) + java.lang.Math.abs(r18.gestureYaw)) > 0.02f) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:52:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x015b  */
    @Override // com.squareup.cash.card.onboarding.graphics.TagPoseController
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Output tick(float f, float f2) {
        float f3;
        float min;
        WandPose wandPose;
        boolean z;
        float f4;
        char c;
        char c2;
        Pair pair;
        float f5;
        float f6;
        float exp;
        float floatValue;
        this.lastTickTime = f;
        WandPoseConfig wandPoseConfig = this.config;
        float f7 = f - this.poseEnteredAtTime;
        WandPose wandPose2 = this.currentPose;
        WandInteractionMode interactionFor = wandPoseConfig.interactionFor(wandPose2);
        float f8 = wandPoseConfig.transitionSpinTurns;
        WandInteractionMode wandInteractionMode = WandInteractionMode.YawFlick;
        if (interactionFor == wandInteractionMode && !this.isDragging && Math.abs(this.flickYawVel) > 1.0E-4f) {
            float f9 = this.gestureYaw;
            float f10 = this.flickYawVel;
            this.gestureYaw = (f10 * f2) + f9;
            float exp2 = f10 * ((float) Math.exp((-wandPoseConfig.flickFriction) * f2));
            this.flickYawVel = exp2;
            if (Math.abs(exp2) < 5.0E-4f) {
                this.flickYawVel = RecyclerView.DECELERATION_RATE;
            }
        }
        if (interactionFor == wandInteractionMode && !this.isDragging && this.flickYawVel == RecyclerView.DECELERATION_RATE && Math.abs(this.gestureYaw) > 5.0E-4f) {
            float roundToInt = MathKt__MathJVMKt.roundToInt(this.gestureYaw / 6.2831855f) * 6.2831855f;
            SpringStep springStep = springStep(roundToInt, this.gestureYaw, this.flickSettleVel, f2, wandPoseConfig.transitionStiffness, wandPoseConfig.transitionDamping);
            float f11 = springStep.position;
            this.gestureYaw = f11;
            this.flickSettleVel = springStep.velocity;
            if (f11 == roundToInt) {
                this.gestureYaw = RecyclerView.DECELERATION_RATE;
            }
        }
        WandInteractionMode wandInteractionMode2 = WandInteractionMode.DragSpringBack;
        if (interactionFor == wandInteractionMode2 && !this.isDragging) {
            SpringStep springStep2 = springStep(RecyclerView.DECELERATION_RATE, this.gestureYaw, this.dragSpringYawVel, f2, wandPoseConfig.dragSpringStiffness, wandPoseConfig.dragSpringDamping);
            this.gestureYaw = springStep2.position;
            this.dragSpringYawVel = springStep2.velocity;
            SpringStep springStep3 = springStep(RecyclerView.DECELERATION_RATE, this.gesturePitch, this.dragSpringPitchVel, f2, wandPoseConfig.dragSpringStiffness, wandPoseConfig.dragSpringDamping);
            this.gesturePitch = springStep3.position;
            this.dragSpringPitchVel = springStep3.velocity;
        } else if (this.isDragging) {
            this.dragSpringYawVel = RecyclerView.DECELERATION_RATE;
            this.dragSpringPitchVel = RecyclerView.DECELERATION_RATE;
        }
        if (!this.isDragging && (interactionFor != wandInteractionMode || Math.abs(this.flickYawVel) <= 0.02f)) {
            if (interactionFor == wandInteractionMode2) {
            }
            f3 = 1.0f;
            float f12 = this.ambientGain;
            min = (Math.min(1.0f, wandPoseConfig.ambientFadeRate * f2) * (f3 - f12)) + f12;
            this.ambientGain = min;
            wandPose = this.blendFrom;
            WandPose wandPose3 = this.blendTo;
            if (wandPose != null || wandPose3 == null) {
                WandStatePose pose = FlowsKt.pose(wandPose2, f7, wandPoseConfig, min);
                z = this.previousPose == wandPose2;
                Float f13 = this.transitionStartTime;
                if (z || f13 == null) {
                    f4 = 0.0f;
                    c = 0;
                    c2 = 1;
                    this.frozenFromPose = null;
                    this.frozenTransitionStartTime = null;
                } else {
                    if (!Intrinsics.areEqual(this.frozenTransitionStartTime, f13)) {
                        this.frozenTransitionStartTime = f13;
                        WandStatePose wandStatePose = this.lastAppliedPose;
                        if (wandStatePose == null) {
                            wandStatePose = pose;
                        }
                        this.frozenFromPose = wandStatePose;
                    }
                    float floatValue2 = f - f13.floatValue();
                    float f14 = wandPoseConfig.transitionStiffness;
                    float f15 = wandPoseConfig.transitionDamping;
                    float max = Math.max(f14, 0.001f);
                    float max2 = Math.max(f15, 0.001f);
                    f4 = 0.0f;
                    c = 0;
                    float sqrt = (float) Math.sqrt(max);
                    float f16 = max2 / (2.0f * sqrt);
                    if (f16 < 0.9999f) {
                        float sqrt2 = ((float) Math.sqrt(1.0f - (f16 * f16))) * sqrt;
                        c2 = 1;
                        double d = sqrt2 * floatValue2;
                        f5 = 3.1415927f;
                        f6 = 2.0f;
                        exp = 1.0f - (((float) Math.exp(((-f16) * sqrt) * floatValue2)) * ((((f16 * sqrt) / sqrt2) * ((float) Math.sin(d))) + ((float) Math.cos(d))));
                    } else {
                        f5 = 3.1415927f;
                        f6 = 2.0f;
                        c2 = 1;
                        if (f16 > 1.0001f) {
                            float sqrt3 = (float) Math.sqrt((f16 * f16) - 1.0f);
                            float f17 = 2.0f * sqrt3;
                            exp = (((f16 - sqrt3) / f17) * ((float) Math.exp((-(sqrt * r2)) * floatValue2))) + (1.0f - (((f16 + sqrt3) / f17) * ((float) Math.exp((-(sqrt * r11)) * floatValue2))));
                        } else {
                            exp = 1.0f - (((sqrt * floatValue2) + 1.0f) * ((float) Math.exp((-sqrt) * floatValue2)));
                        }
                    }
                    if (exp >= 0.999f) {
                        this.frozenFromPose = null;
                        this.frozenTransitionStartTime = null;
                        this.transitionStartTime = null;
                        this.previousPose = wandPose2;
                    } else {
                        WandStatePose wandStatePose2 = this.frozenFromPose;
                        if (wandStatePose2 != null) {
                            WandStatePose blend = FlowsKt.blend(wandStatePose2, pose, exp);
                            float f18 = wandPose2 == WandPose.Active ? f8 * f6 * f5 * exp : 0.0f;
                            Vector3 vector3 = blend.eulerOffset;
                            pose = WandStatePose.copy$default(blend, new Vector3(vector3.x, vector3.y + f18, vector3.z));
                        }
                    }
                }
                pair = new Pair(pose, Float.valueOf(f4));
            } else {
                pair = new Pair(FlowsKt.blend(FlowsKt.pose(wandPose, f7, wandPoseConfig, min), FlowsKt.pose(wandPose3, f7, wandPoseConfig, this.ambientGain), this.blendProgress), Float.valueOf((wandPose == WandPose.Still && (wandPose3 == WandPose.Lean || wandPose3 == WandPose.Active)) ? (1.0f - this.blendProgress) * f8 * 2.0f * 3.1415927f * this.blendDirection : 0.0f));
                f4 = 0.0f;
                c = 0;
                c2 = 1;
            }
            WandStatePose wandStatePose3 = (WandStatePose) pair.first;
            floatValue = ((Number) pair.second).floatValue();
            Vector3 vector32 = wandStatePose3.eulerOffset;
            WandStatePose copy$default = WandStatePose.copy$default(wandStatePose3, new Vector3(vector32.x + this.gesturePitch, vector32.y + this.gestureYaw, vector32.z));
            this.lastAppliedPose = copy$default;
            Vector3 vector33 = copy$default.eulerOffset;
            float f19 = -vector33.x;
            float f20 = -vector33.y;
            float f21 = -vector33.z;
            float[] fArr = new float[3];
            fArr[c] = f19;
            fArr[c2] = f20;
            fArr[2] = f21;
            Quat quat = new Quat(fArr);
            if (floatValue != f4) {
                quat = quat.times(new Quat(-floatValue, LOCAL_Y_AXIS));
            }
            return new Output(copy$default.positionOffset, quat, copy$default.scale, copy$default.opacity, copy$default.darkening, copy$default.lightIntensity, copy$default.saturation);
        }
        f3 = 0.0f;
        float f122 = this.ambientGain;
        min = (Math.min(1.0f, wandPoseConfig.ambientFadeRate * f2) * (f3 - f122)) + f122;
        this.ambientGain = min;
        wandPose = this.blendFrom;
        WandPose wandPose32 = this.blendTo;
        if (wandPose != null) {
        }
        WandStatePose pose2 = FlowsKt.pose(wandPose2, f7, wandPoseConfig, min);
        if (this.previousPose == wandPose2) {
        }
        Float f132 = this.transitionStartTime;
        if (z) {
        }
        f4 = 0.0f;
        c = 0;
        c2 = 1;
        this.frozenFromPose = null;
        this.frozenTransitionStartTime = null;
        pair = new Pair(pose2, Float.valueOf(f4));
        WandStatePose wandStatePose32 = (WandStatePose) pair.first;
        floatValue = ((Number) pair.second).floatValue();
        Vector3 vector322 = wandStatePose32.eulerOffset;
        WandStatePose copy$default2 = WandStatePose.copy$default(wandStatePose32, new Vector3(vector322.x + this.gesturePitch, vector322.y + this.gestureYaw, vector322.z));
        this.lastAppliedPose = copy$default2;
        Vector3 vector332 = copy$default2.eulerOffset;
        float f192 = -vector332.x;
        float f202 = -vector332.y;
        float f212 = -vector332.z;
        float[] fArr2 = new float[3];
        fArr2[c] = f192;
        fArr2[c2] = f202;
        fArr2[2] = f212;
        Quat quat2 = new Quat(fArr2);
        if (floatValue != f4) {
        }
        return new Output(copy$default2.positionOffset, quat2, copy$default2.scale, copy$default2.opacity, copy$default2.darkening, copy$default2.lightIntensity, copy$default2.saturation);
    }

    public WandPoseController(WandPose wandPose, WandPoseConfig wandPoseConfig) {
        wandPose.getClass();
        wandPoseConfig.getClass();
        this.config = wandPoseConfig;
        this.currentPose = wandPose;
        this.previousPose = wandPose;
        this.ambientGain = 1.0f;
    }
}
