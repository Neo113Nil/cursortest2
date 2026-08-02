package com.squareup.cash.card.onboarding.graphics;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.recyclerview.widget.RecyclerView;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class WandPoseConfig {
    public final float activeAmplitude;
    public final WandInteractionMode activeInteraction;
    public final float activePeriod;
    public final float activePitch;
    public final float activeRoll;
    public final float activeScale;
    public final float activeYaw;
    public final float ambientFadeRate;
    public final float dragPitchSensitivity;
    public final float dragSpringDamping;
    public final float dragSpringStiffness;
    public final float dragYawSensitivity;
    public final float flickFriction;
    public final float floatAmplitude;
    public final WandInteractionMode floatInteraction;
    public final float floatPeriod;
    public final float floatPitch;
    public final float floatRoll;
    public final float floatYaw;
    public final float inactiveDarkening;
    public final WandInteractionMode inactiveInteraction;
    public final float inactiveLightIntensity;
    public final float inactiveOpacity;
    public final float inactivePitch;
    public final float inactiveRoll;
    public final float inactiveSaturation;
    public final float inactiveScale;
    public final float inactiveYaw;
    public final WandInteractionMode leanInteraction;
    public final float leanPitch;
    public final float leanRoll;
    public final float leanScale;
    public final float leanSwayAmpDeg;
    public final float leanSwayPeriod;
    public final float leanYaw;
    public final float lockedDarkening;
    public final WandInteractionMode lockedInteraction;
    public final float lockedLightIntensity;
    public final float lockedOpacity;
    public final float lockedPitch;
    public final float lockedRoll;
    public final float lockedSaturation;
    public final float lockedScale;
    public final float lockedYaw;
    public final WandInteractionMode reviewInteraction;
    public final float reviewOpacity;
    public final float reviewPitch;
    public final float reviewRoll;
    public final float reviewScale;
    public final float reviewYaw;
    public final WandInteractionMode stillInteraction;
    public final float stillPitch;
    public final float stillRoll;
    public final float stillSwayPeriod;
    public final float stillYaw;
    public final float transitionDamping;
    public final float transitionSpinTurns;
    public final float transitionStiffness;
    public final WandInteractionMode twirlInteraction;
    public final float twirlPitch;
    public final float twirlRPM;
    public final float twirlRoll;
    public final float twirlYaw;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ WandPoseConfig(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, int i, int i2) {
        this(r6, r7, r8, r9, 1.7f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 15.9f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, r17, r18, 1.0f, 0.05f, 0.925f, 0.875f, r23, r24, r25, 4.0f, r27, 1.0f, r29, r30, r31, r32, r33, 1.0f, r35, r36, r37, 3.0f, r39, r40, r41, 1.1f, 1.0f, r44, r45, r46, 1.0f, 1.0f, 0.225f, 0.775f, 0.7f, 60.0f, 16.0f, 1.0f, 8.0f, 2.0f, 120.0f, 18.0f, 0.012f, 0.012f, r61, r62, r62, r64, r64, r64, r64, r62);
        float f13 = (i & 1) != 0 ? 0.0f : -10.0f;
        float f14 = (i & 2) != 0 ? 0.0f : -10.0f;
        float f15 = (i & 4) != 0 ? 0.0f : -80.0f;
        float f16 = (i & 8) != 0 ? 0.85f : 0.9f;
        float f17 = (i & 2048) != 0 ? 0.23f : -90.0f;
        float f18 = (i & 4096) == 0 ? 1.0f : 0.9f;
        float f19 = (131072 & i) != 0 ? -5.0f : f;
        float f20 = (262144 & i) != 0 ? 9.0f : f2;
        float f21 = (524288 & i) != 0 ? 20.0f : f3;
        float f22 = (2097152 & i) != 0 ? 5.3f : 6.9f;
        float f23 = (8388608 & i) != 0 ? -0.58f : f4;
        float f24 = (16777216 & i) != 0 ? 12.23f : f5;
        float f25 = (33554432 & i) != 0 ? 8.74f : f6;
        float f26 = (67108864 & i) != 0 ? 1.96f : 2.0f;
        float f27 = (134217728 & i) != 0 ? 4.13f : 4.1f;
        float f28 = (536870912 & i) != 0 ? -0.29f : 0.0f;
        float f29 = (1073741824 & i) != 0 ? 0.28f : 0.0f;
        float f30 = (i & PKIFailureInfo.systemUnavail) != 0 ? 0.0f : -90.0f;
        float f31 = (i2 & 4) != 0 ? -10.0f : f7;
        float f32 = (i2 & 8) != 0 ? -20.0f : f8;
        float f33 = (i2 & 16) != 0 ? -40.0f : f9;
        float f34 = (i2 & 128) != 0 ? -26.0f : f10;
        float f35 = (i2 & 256) != 0 ? -25.0f : f11;
        float f36 = (i2 & 512) != 0 ? -44.0f : f12;
        WandInteractionMode wandInteractionMode = WandInteractionMode.YawFlick;
        WandInteractionMode wandInteractionMode2 = WandInteractionMode.None;
        WandInteractionMode wandInteractionMode3 = WandInteractionMode.DragSpringBack;
    }

    public static WandPoseConfig copy$default(WandPoseConfig wandPoseConfig, float f, float f2, int i, int i2) {
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8 = wandPoseConfig.floatPitch;
        float f9 = wandPoseConfig.floatYaw;
        float f10 = wandPoseConfig.floatRoll;
        float f11 = wandPoseConfig.floatAmplitude;
        float f12 = wandPoseConfig.floatPeriod;
        float f13 = wandPoseConfig.twirlPitch;
        float f14 = wandPoseConfig.twirlYaw;
        float f15 = wandPoseConfig.twirlRoll;
        float f16 = wandPoseConfig.twirlRPM;
        float f17 = wandPoseConfig.lockedPitch;
        float f18 = wandPoseConfig.lockedYaw;
        float f19 = wandPoseConfig.lockedRoll;
        float f20 = wandPoseConfig.lockedScale;
        float f21 = wandPoseConfig.lockedOpacity;
        float f22 = wandPoseConfig.lockedDarkening;
        float f23 = wandPoseConfig.lockedLightIntensity;
        float f24 = wandPoseConfig.lockedSaturation;
        float f25 = wandPoseConfig.leanPitch;
        float f26 = wandPoseConfig.leanYaw;
        float f27 = wandPoseConfig.leanRoll;
        float f28 = wandPoseConfig.leanSwayAmpDeg;
        float f29 = wandPoseConfig.leanSwayPeriod;
        float f30 = wandPoseConfig.leanScale;
        float f31 = wandPoseConfig.activePitch;
        float f32 = wandPoseConfig.activeYaw;
        float f33 = wandPoseConfig.activeRoll;
        float f34 = wandPoseConfig.activeAmplitude;
        float f35 = wandPoseConfig.activePeriod;
        float f36 = wandPoseConfig.activeScale;
        float f37 = -10.0f;
        if ((i & PKIFailureInfo.duplicateCertReq) != 0) {
            f3 = f36;
            f4 = wandPoseConfig.stillPitch;
        } else {
            f3 = f36;
            f4 = -10.0f;
        }
        if ((i & 1073741824) != 0) {
            f5 = f4;
            f37 = wandPoseConfig.stillYaw;
        } else {
            f5 = f4;
        }
        float f38 = (i & PKIFailureInfo.systemUnavail) != 0 ? wandPoseConfig.stillRoll : -80.0f;
        wandPoseConfig.getClass();
        float f39 = f38;
        float f40 = wandPoseConfig.stillSwayPeriod;
        float f41 = wandPoseConfig.reviewPitch;
        float f42 = wandPoseConfig.reviewYaw;
        float f43 = wandPoseConfig.reviewRoll;
        float f44 = wandPoseConfig.reviewScale;
        float f45 = wandPoseConfig.reviewOpacity;
        float f46 = wandPoseConfig.inactivePitch;
        float f47 = wandPoseConfig.inactiveYaw;
        float f48 = wandPoseConfig.inactiveRoll;
        float f49 = wandPoseConfig.inactiveScale;
        float f50 = wandPoseConfig.inactiveOpacity;
        float f51 = wandPoseConfig.inactiveDarkening;
        float f52 = wandPoseConfig.inactiveLightIntensity;
        float f53 = wandPoseConfig.inactiveSaturation;
        float f54 = wandPoseConfig.transitionStiffness;
        float f55 = wandPoseConfig.transitionDamping;
        float f56 = wandPoseConfig.transitionSpinTurns;
        float f57 = wandPoseConfig.ambientFadeRate;
        float f58 = wandPoseConfig.flickFriction;
        float f59 = wandPoseConfig.dragSpringStiffness;
        float f60 = wandPoseConfig.dragSpringDamping;
        if ((i2 & 4194304) != 0) {
            f6 = f60;
            f7 = wandPoseConfig.dragYawSensitivity;
        } else {
            f6 = f60;
            f7 = f;
        }
        float f61 = (i2 & 8388608) != 0 ? wandPoseConfig.dragPitchSensitivity : f2;
        WandInteractionMode wandInteractionMode = wandPoseConfig.floatInteraction;
        WandInteractionMode wandInteractionMode2 = wandPoseConfig.twirlInteraction;
        WandInteractionMode wandInteractionMode3 = wandPoseConfig.lockedInteraction;
        WandInteractionMode wandInteractionMode4 = wandPoseConfig.leanInteraction;
        WandInteractionMode wandInteractionMode5 = wandPoseConfig.reviewInteraction;
        WandInteractionMode wandInteractionMode6 = wandPoseConfig.activeInteraction;
        WandInteractionMode wandInteractionMode7 = wandPoseConfig.stillInteraction;
        WandInteractionMode wandInteractionMode8 = wandPoseConfig.inactiveInteraction;
        wandPoseConfig.getClass();
        wandInteractionMode.getClass();
        wandInteractionMode2.getClass();
        wandInteractionMode3.getClass();
        wandInteractionMode4.getClass();
        wandInteractionMode5.getClass();
        wandInteractionMode6.getClass();
        wandInteractionMode7.getClass();
        wandInteractionMode8.getClass();
        return new WandPoseConfig(f8, f9, f10, f11, f12, f13, f14, f15, f16, f17, f18, f19, f20, f21, f22, f23, f24, f25, f26, f27, f28, f29, f30, f31, f32, f33, f34, f35, f3, f5, f37, f39, f40, f41, f42, f43, f44, f45, f46, f47, f48, f49, f50, f51, f52, f53, f54, f55, f56, f57, f58, f59, f6, f7, f61, wandInteractionMode, wandInteractionMode2, wandInteractionMode3, wandInteractionMode4, wandInteractionMode5, wandInteractionMode6, wandInteractionMode7, wandInteractionMode8);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WandPoseConfig)) {
            return false;
        }
        WandPoseConfig wandPoseConfig = (WandPoseConfig) obj;
        return Float.compare(this.floatPitch, wandPoseConfig.floatPitch) == 0 && Float.compare(this.floatYaw, wandPoseConfig.floatYaw) == 0 && Float.compare(this.floatRoll, wandPoseConfig.floatRoll) == 0 && Float.compare(this.floatAmplitude, wandPoseConfig.floatAmplitude) == 0 && Float.compare(this.floatPeriod, wandPoseConfig.floatPeriod) == 0 && Float.compare(this.twirlPitch, wandPoseConfig.twirlPitch) == 0 && Float.compare(this.twirlYaw, wandPoseConfig.twirlYaw) == 0 && Float.compare(this.twirlRoll, wandPoseConfig.twirlRoll) == 0 && Float.compare(this.twirlRPM, wandPoseConfig.twirlRPM) == 0 && Float.compare(this.lockedPitch, wandPoseConfig.lockedPitch) == 0 && Float.compare(this.lockedYaw, wandPoseConfig.lockedYaw) == 0 && Float.compare(this.lockedRoll, wandPoseConfig.lockedRoll) == 0 && Float.compare(this.lockedScale, wandPoseConfig.lockedScale) == 0 && Float.compare(this.lockedOpacity, wandPoseConfig.lockedOpacity) == 0 && Float.compare(this.lockedDarkening, wandPoseConfig.lockedDarkening) == 0 && Float.compare(this.lockedLightIntensity, wandPoseConfig.lockedLightIntensity) == 0 && Float.compare(this.lockedSaturation, wandPoseConfig.lockedSaturation) == 0 && Float.compare(this.leanPitch, wandPoseConfig.leanPitch) == 0 && Float.compare(this.leanYaw, wandPoseConfig.leanYaw) == 0 && Float.compare(this.leanRoll, wandPoseConfig.leanRoll) == 0 && Float.compare(this.leanSwayAmpDeg, wandPoseConfig.leanSwayAmpDeg) == 0 && Float.compare(this.leanSwayPeriod, wandPoseConfig.leanSwayPeriod) == 0 && Float.compare(this.leanScale, wandPoseConfig.leanScale) == 0 && Float.compare(this.activePitch, wandPoseConfig.activePitch) == 0 && Float.compare(this.activeYaw, wandPoseConfig.activeYaw) == 0 && Float.compare(this.activeRoll, wandPoseConfig.activeRoll) == 0 && Float.compare(this.activeAmplitude, wandPoseConfig.activeAmplitude) == 0 && Float.compare(this.activePeriod, wandPoseConfig.activePeriod) == 0 && Float.compare(this.activeScale, wandPoseConfig.activeScale) == 0 && Float.compare(this.stillPitch, wandPoseConfig.stillPitch) == 0 && Float.compare(this.stillYaw, wandPoseConfig.stillYaw) == 0 && Float.compare(this.stillRoll, wandPoseConfig.stillRoll) == 0 && Float.compare(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == 0 && Float.compare(this.stillSwayPeriod, wandPoseConfig.stillSwayPeriod) == 0 && Float.compare(this.reviewPitch, wandPoseConfig.reviewPitch) == 0 && Float.compare(this.reviewYaw, wandPoseConfig.reviewYaw) == 0 && Float.compare(this.reviewRoll, wandPoseConfig.reviewRoll) == 0 && Float.compare(this.reviewScale, wandPoseConfig.reviewScale) == 0 && Float.compare(this.reviewOpacity, wandPoseConfig.reviewOpacity) == 0 && Float.compare(this.inactivePitch, wandPoseConfig.inactivePitch) == 0 && Float.compare(this.inactiveYaw, wandPoseConfig.inactiveYaw) == 0 && Float.compare(this.inactiveRoll, wandPoseConfig.inactiveRoll) == 0 && Float.compare(this.inactiveScale, wandPoseConfig.inactiveScale) == 0 && Float.compare(this.inactiveOpacity, wandPoseConfig.inactiveOpacity) == 0 && Float.compare(this.inactiveDarkening, wandPoseConfig.inactiveDarkening) == 0 && Float.compare(this.inactiveLightIntensity, wandPoseConfig.inactiveLightIntensity) == 0 && Float.compare(this.inactiveSaturation, wandPoseConfig.inactiveSaturation) == 0 && Float.compare(this.transitionStiffness, wandPoseConfig.transitionStiffness) == 0 && Float.compare(this.transitionDamping, wandPoseConfig.transitionDamping) == 0 && Float.compare(this.transitionSpinTurns, wandPoseConfig.transitionSpinTurns) == 0 && Float.compare(this.ambientFadeRate, wandPoseConfig.ambientFadeRate) == 0 && Float.compare(this.flickFriction, wandPoseConfig.flickFriction) == 0 && Float.compare(this.dragSpringStiffness, wandPoseConfig.dragSpringStiffness) == 0 && Float.compare(this.dragSpringDamping, wandPoseConfig.dragSpringDamping) == 0 && Float.compare(this.dragYawSensitivity, wandPoseConfig.dragYawSensitivity) == 0 && Float.compare(this.dragPitchSensitivity, wandPoseConfig.dragPitchSensitivity) == 0 && this.floatInteraction == wandPoseConfig.floatInteraction && this.twirlInteraction == wandPoseConfig.twirlInteraction && this.lockedInteraction == wandPoseConfig.lockedInteraction && this.leanInteraction == wandPoseConfig.leanInteraction && this.reviewInteraction == wandPoseConfig.reviewInteraction && this.activeInteraction == wandPoseConfig.activeInteraction && this.stillInteraction == wandPoseConfig.stillInteraction && this.inactiveInteraction == wandPoseConfig.inactiveInteraction;
    }

    public final int hashCode() {
        return this.inactiveInteraction.hashCode() + ((this.stillInteraction.hashCode() + ((this.activeInteraction.hashCode() + ((this.reviewInteraction.hashCode() + ((this.leanInteraction.hashCode() + ((this.lockedInteraction.hashCode() + ((this.twirlInteraction.hashCode() + ((this.floatInteraction.hashCode() + CameraState$Type$EnumUnboxingLocalUtility.m(this.dragPitchSensitivity, CameraState$Type$EnumUnboxingLocalUtility.m(this.dragYawSensitivity, CameraState$Type$EnumUnboxingLocalUtility.m(this.dragSpringDamping, CameraState$Type$EnumUnboxingLocalUtility.m(this.dragSpringStiffness, CameraState$Type$EnumUnboxingLocalUtility.m(this.flickFriction, CameraState$Type$EnumUnboxingLocalUtility.m(this.ambientFadeRate, CameraState$Type$EnumUnboxingLocalUtility.m(this.transitionSpinTurns, CameraState$Type$EnumUnboxingLocalUtility.m(this.transitionDamping, CameraState$Type$EnumUnboxingLocalUtility.m(this.transitionStiffness, CameraState$Type$EnumUnboxingLocalUtility.m(this.inactiveSaturation, CameraState$Type$EnumUnboxingLocalUtility.m(this.inactiveLightIntensity, CameraState$Type$EnumUnboxingLocalUtility.m(this.inactiveDarkening, CameraState$Type$EnumUnboxingLocalUtility.m(this.inactiveOpacity, CameraState$Type$EnumUnboxingLocalUtility.m(this.inactiveScale, CameraState$Type$EnumUnboxingLocalUtility.m(this.inactiveRoll, CameraState$Type$EnumUnboxingLocalUtility.m(this.inactiveYaw, CameraState$Type$EnumUnboxingLocalUtility.m(this.inactivePitch, CameraState$Type$EnumUnboxingLocalUtility.m(this.reviewOpacity, CameraState$Type$EnumUnboxingLocalUtility.m(this.reviewScale, CameraState$Type$EnumUnboxingLocalUtility.m(this.reviewRoll, CameraState$Type$EnumUnboxingLocalUtility.m(this.reviewYaw, CameraState$Type$EnumUnboxingLocalUtility.m(this.reviewPitch, CameraState$Type$EnumUnboxingLocalUtility.m(this.stillSwayPeriod, CameraState$Type$EnumUnboxingLocalUtility.m(RecyclerView.DECELERATION_RATE, CameraState$Type$EnumUnboxingLocalUtility.m(this.stillRoll, CameraState$Type$EnumUnboxingLocalUtility.m(this.stillYaw, CameraState$Type$EnumUnboxingLocalUtility.m(this.stillPitch, CameraState$Type$EnumUnboxingLocalUtility.m(this.activeScale, CameraState$Type$EnumUnboxingLocalUtility.m(this.activePeriod, CameraState$Type$EnumUnboxingLocalUtility.m(this.activeAmplitude, CameraState$Type$EnumUnboxingLocalUtility.m(this.activeRoll, CameraState$Type$EnumUnboxingLocalUtility.m(this.activeYaw, CameraState$Type$EnumUnboxingLocalUtility.m(this.activePitch, CameraState$Type$EnumUnboxingLocalUtility.m(this.leanScale, CameraState$Type$EnumUnboxingLocalUtility.m(this.leanSwayPeriod, CameraState$Type$EnumUnboxingLocalUtility.m(this.leanSwayAmpDeg, CameraState$Type$EnumUnboxingLocalUtility.m(this.leanRoll, CameraState$Type$EnumUnboxingLocalUtility.m(this.leanYaw, CameraState$Type$EnumUnboxingLocalUtility.m(this.leanPitch, CameraState$Type$EnumUnboxingLocalUtility.m(this.lockedSaturation, CameraState$Type$EnumUnboxingLocalUtility.m(this.lockedLightIntensity, CameraState$Type$EnumUnboxingLocalUtility.m(this.lockedDarkening, CameraState$Type$EnumUnboxingLocalUtility.m(this.lockedOpacity, CameraState$Type$EnumUnboxingLocalUtility.m(this.lockedScale, CameraState$Type$EnumUnboxingLocalUtility.m(this.lockedRoll, CameraState$Type$EnumUnboxingLocalUtility.m(this.lockedYaw, CameraState$Type$EnumUnboxingLocalUtility.m(this.lockedPitch, CameraState$Type$EnumUnboxingLocalUtility.m(this.twirlRPM, CameraState$Type$EnumUnboxingLocalUtility.m(this.twirlRoll, CameraState$Type$EnumUnboxingLocalUtility.m(this.twirlYaw, CameraState$Type$EnumUnboxingLocalUtility.m(this.twirlPitch, CameraState$Type$EnumUnboxingLocalUtility.m(this.floatPeriod, CameraState$Type$EnumUnboxingLocalUtility.m(this.floatAmplitude, CameraState$Type$EnumUnboxingLocalUtility.m(this.floatRoll, CameraState$Type$EnumUnboxingLocalUtility.m(this.floatYaw, Float.hashCode(this.floatPitch) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final WandInteractionMode interactionFor(WandPose wandPose) {
        wandPose.getClass();
        switch (wandPose.ordinal()) {
            case 0:
                return this.floatInteraction;
            case 1:
                return this.stillInteraction;
            case 2:
                return this.activeInteraction;
            case 3:
                return this.twirlInteraction;
            case 4:
                return this.lockedInteraction;
            case 5:
                return this.leanInteraction;
            case 6:
                return this.reviewInteraction;
            case 7:
                return this.inactiveInteraction;
            default:
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
        }
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("WandPoseConfig(floatPitch=", this.floatPitch, ", floatYaw=", this.floatYaw, ", floatRoll=");
        Request$Priority$EnumUnboxingLocalUtility.m(m, this.floatRoll, ", floatAmplitude=", this.floatAmplitude, ", floatPeriod=");
        Request$Priority$EnumUnboxingLocalUtility.m(m, this.floatPeriod, ", twirlPitch=", this.twirlPitch, ", twirlYaw=");
        Request$Priority$EnumUnboxingLocalUtility.m(m, this.twirlYaw, ", twirlRoll=", this.twirlRoll, ", twirlRPM=");
        Request$Priority$EnumUnboxingLocalUtility.m(m, this.twirlRPM, ", lockedPitch=", this.lockedPitch, ", lockedYaw=");
        Request$Priority$EnumUnboxingLocalUtility.m(m, this.lockedYaw, ", lockedRoll=", this.lockedRoll, ", lockedScale=");
        Request$Priority$EnumUnboxingLocalUtility.m(m, this.lockedScale, ", lockedOpacity=", this.lockedOpacity, ", lockedDarkening=");
        Request$Priority$EnumUnboxingLocalUtility.m(m, this.lockedDarkening, ", lockedLightIntensity=", this.lockedLightIntensity, ", lockedSaturation=");
        Request$Priority$EnumUnboxingLocalUtility.m(m, this.lockedSaturation, ", leanPitch=", this.leanPitch, ", leanYaw=");
        Request$Priority$EnumUnboxingLocalUtility.m(m, this.leanYaw, ", leanRoll=", this.leanRoll, ", leanSwayAmpDeg=");
        Request$Priority$EnumUnboxingLocalUtility.m(m, this.leanSwayAmpDeg, ", leanSwayPeriod=", this.leanSwayPeriod, ", leanScale=");
        Request$Priority$EnumUnboxingLocalUtility.m(m, this.leanScale, ", activePitch=", this.activePitch, ", activeYaw=");
        Request$Priority$EnumUnboxingLocalUtility.m(m, this.activeYaw, ", activeRoll=", this.activeRoll, ", activeAmplitude=");
        Request$Priority$EnumUnboxingLocalUtility.m(m, this.activeAmplitude, ", activePeriod=", this.activePeriod, ", activeScale=");
        Request$Priority$EnumUnboxingLocalUtility.m(m, this.activeScale, ", stillPitch=", this.stillPitch, ", stillYaw=");
        Request$Priority$EnumUnboxingLocalUtility.m(m, this.stillYaw, ", stillRoll=", this.stillRoll, ", stillSwayAmpDeg=0.0, stillSwayPeriod=");
        Request$Priority$EnumUnboxingLocalUtility.m(m, this.stillSwayPeriod, ", reviewPitch=", this.reviewPitch, ", reviewYaw=");
        Request$Priority$EnumUnboxingLocalUtility.m(m, this.reviewYaw, ", reviewRoll=", this.reviewRoll, ", reviewScale=");
        Request$Priority$EnumUnboxingLocalUtility.m(m, this.reviewScale, ", reviewOpacity=", this.reviewOpacity, ", inactivePitch=");
        Request$Priority$EnumUnboxingLocalUtility.m(m, this.inactivePitch, ", inactiveYaw=", this.inactiveYaw, ", inactiveRoll=");
        Request$Priority$EnumUnboxingLocalUtility.m(m, this.inactiveRoll, ", inactiveScale=", this.inactiveScale, ", inactiveOpacity=");
        Request$Priority$EnumUnboxingLocalUtility.m(m, this.inactiveOpacity, ", inactiveDarkening=", this.inactiveDarkening, ", inactiveLightIntensity=");
        Request$Priority$EnumUnboxingLocalUtility.m(m, this.inactiveLightIntensity, ", inactiveSaturation=", this.inactiveSaturation, ", transitionStiffness=");
        Request$Priority$EnumUnboxingLocalUtility.m(m, this.transitionStiffness, ", transitionDamping=", this.transitionDamping, ", transitionSpinTurns=");
        Request$Priority$EnumUnboxingLocalUtility.m(m, this.transitionSpinTurns, ", ambientFadeRate=", this.ambientFadeRate, ", flickFriction=");
        Request$Priority$EnumUnboxingLocalUtility.m(m, this.flickFriction, ", dragSpringStiffness=", this.dragSpringStiffness, ", dragSpringDamping=");
        Request$Priority$EnumUnboxingLocalUtility.m(m, this.dragSpringDamping, ", dragYawSensitivity=", this.dragYawSensitivity, ", dragPitchSensitivity=");
        m.append(this.dragPitchSensitivity);
        m.append(", floatInteraction=");
        m.append(this.floatInteraction);
        m.append(", twirlInteraction=");
        m.append(this.twirlInteraction);
        m.append(", lockedInteraction=");
        m.append(this.lockedInteraction);
        m.append(", leanInteraction=");
        m.append(this.leanInteraction);
        m.append(", reviewInteraction=");
        m.append(this.reviewInteraction);
        m.append(", activeInteraction=");
        m.append(this.activeInteraction);
        m.append(", stillInteraction=");
        m.append(this.stillInteraction);
        m.append(", inactiveInteraction=");
        m.append(this.inactiveInteraction);
        m.append(")");
        return m.toString();
    }

    public WandPoseConfig(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f20, float f21, float f22, float f23, float f24, float f25, float f26, float f27, float f28, float f29, float f30, float f31, float f32, float f33, float f34, float f35, float f36, float f37, float f38, float f39, float f40, float f41, float f42, float f43, float f44, float f45, float f46, float f47, float f48, float f49, float f50, float f51, float f52, float f53, float f54, float f55, WandInteractionMode wandInteractionMode, WandInteractionMode wandInteractionMode2, WandInteractionMode wandInteractionMode3, WandInteractionMode wandInteractionMode4, WandInteractionMode wandInteractionMode5, WandInteractionMode wandInteractionMode6, WandInteractionMode wandInteractionMode7, WandInteractionMode wandInteractionMode8) {
        this.floatPitch = f;
        this.floatYaw = f2;
        this.floatRoll = f3;
        this.floatAmplitude = f4;
        this.floatPeriod = f5;
        this.twirlPitch = f6;
        this.twirlYaw = f7;
        this.twirlRoll = f8;
        this.twirlRPM = f9;
        this.lockedPitch = f10;
        this.lockedYaw = f11;
        this.lockedRoll = f12;
        this.lockedScale = f13;
        this.lockedOpacity = f14;
        this.lockedDarkening = f15;
        this.lockedLightIntensity = f16;
        this.lockedSaturation = f17;
        this.leanPitch = f18;
        this.leanYaw = f19;
        this.leanRoll = f20;
        this.leanSwayAmpDeg = f21;
        this.leanSwayPeriod = f22;
        this.leanScale = f23;
        this.activePitch = f24;
        this.activeYaw = f25;
        this.activeRoll = f26;
        this.activeAmplitude = f27;
        this.activePeriod = f28;
        this.activeScale = f29;
        this.stillPitch = f30;
        this.stillYaw = f31;
        this.stillRoll = f32;
        this.stillSwayPeriod = f33;
        this.reviewPitch = f34;
        this.reviewYaw = f35;
        this.reviewRoll = f36;
        this.reviewScale = f37;
        this.reviewOpacity = f38;
        this.inactivePitch = f39;
        this.inactiveYaw = f40;
        this.inactiveRoll = f41;
        this.inactiveScale = f42;
        this.inactiveOpacity = f43;
        this.inactiveDarkening = f44;
        this.inactiveLightIntensity = f45;
        this.inactiveSaturation = f46;
        this.transitionStiffness = f47;
        this.transitionDamping = f48;
        this.transitionSpinTurns = f49;
        this.ambientFadeRate = f50;
        this.flickFriction = f51;
        this.dragSpringStiffness = f52;
        this.dragSpringDamping = f53;
        this.dragYawSensitivity = f54;
        this.dragPitchSensitivity = f55;
        this.floatInteraction = wandInteractionMode;
        this.twirlInteraction = wandInteractionMode2;
        this.lockedInteraction = wandInteractionMode3;
        this.leanInteraction = wandInteractionMode4;
        this.reviewInteraction = wandInteractionMode5;
        this.activeInteraction = wandInteractionMode6;
        this.stillInteraction = wandInteractionMode7;
        this.inactiveInteraction = wandInteractionMode8;
    }
}
