package com.squareup.cash.fidesmo.views;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.Dp;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.recyclerview.widget.RecyclerView;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.fidesmo.viewmodels.FidesmoScanningPulseShape;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class ScanningShapePulseParams {
    public final Alignment alignment;
    public final float beatDurationSeconds;
    public final float cellSize;
    public final float cornerRadius;
    public final float fillDurationSeconds;
    public final float gap;
    public final float glowAlpha;
    public final float glowBlur;
    public final float glowPulseAmount;
    public final float glowPulseDurationSeconds;
    public final float glowScale;
    public final float offsetX;
    public final float offsetY;
    public final float orbReturnDamping;
    public final float orbReturnStiffness;
    public final float orbTurnDamping;
    public final float orbTurnStiffness;
    public final float primaryOpacity;
    public final FidesmoScanningPulseShape shape;
    public final float shapeScale;
    public final float shapeSize;
    public final float shapeTurnDamping;
    public final float shapeTurnStiffness;
    public final float spread;
    public final ShapeStabilityAnimationParams stabilityAnimationParams;
    public final long stepTurnHoldMillis;
    public final int stepTurnMaxTurnsPerSpring;
    public final float stepTurnOrbPeakScale;
    public final float stepTurnRotationDegrees;
    public final float targetFillDurationSeconds;
    public final long targetHoldMillis;
    public final float targetShapeScaleBoost;
    public final float targetSpringDamping;
    public final float targetSpringStiffness;
    public final float twinkleSpeed;

    public ScanningShapePulseParams(FidesmoScanningPulseShape fidesmoScanningPulseShape, float f, float f2) {
        this(fidesmoScanningPulseShape, Alignment.Companion.TopCenter, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 240.0f, f, 0.58f, 1.8f, -0.75f, 1.27f, 0.53f, 33.4f, 0.05f, 1.7f, 3.12f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 0.52f, 1.2f, 0.05f, 981L, 1.58f, 400.0f, f2, 3, 1.15f, 981L, 0.42f, 157.9f, 0.58f, 207.96f, 1.58f, 400.0f, fidesmoScanningPulseShape == FidesmoScanningPulseShape.STAR ? new ShapeStabilityAnimationParams(1.4f, 4.8f, 2.1f, 8.5f, 96) : ShapeStabilityAnimationParams.Disabled);
    }

    /* renamed from: copy-Xu8qxI8$default, reason: not valid java name */
    public static ScanningShapePulseParams m3551copyXu8qxI8$default(ScanningShapePulseParams scanningShapePulseParams, Alignment alignment, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, long j, float f20, float f21, float f22, int i, float f23, long j2, float f24, float f25, float f26, float f27, float f28, float f29, ShapeStabilityAnimationParams shapeStabilityAnimationParams, int i2, int i3) {
        FidesmoScanningPulseShape fidesmoScanningPulseShape = scanningShapePulseParams.shape;
        Alignment alignment2 = (i2 & 2) != 0 ? scanningShapePulseParams.alignment : alignment;
        float f30 = (i2 & 4) != 0 ? scanningShapePulseParams.offsetX : f;
        float f31 = (i2 & 8) != 0 ? scanningShapePulseParams.offsetY : f2;
        float f32 = (i2 & 16) != 0 ? scanningShapePulseParams.shapeSize : f3;
        float f33 = (i2 & 256) != 0 ? scanningShapePulseParams.beatDurationSeconds : f7;
        float f34 = (i2 & 512) != 0 ? scanningShapePulseParams.glowScale : f8;
        float f35 = (i2 & 1024) != 0 ? scanningShapePulseParams.glowAlpha : f9;
        float f36 = (i2 & 2048) != 0 ? scanningShapePulseParams.glowBlur : f10;
        float f37 = (i2 & 4096) != 0 ? scanningShapePulseParams.glowPulseAmount : f11;
        float f38 = (i2 & PKIFailureInfo.certRevoked) != 0 ? scanningShapePulseParams.glowPulseDurationSeconds : f12;
        float f39 = (i2 & 16384) != 0 ? scanningShapePulseParams.cellSize : f13;
        float f40 = (32768 & i2) != 0 ? scanningShapePulseParams.gap : f14;
        float f41 = (65536 & i2) != 0 ? scanningShapePulseParams.cornerRadius : f15;
        float f42 = (131072 & i2) != 0 ? scanningShapePulseParams.spread : f16;
        float f43 = (262144 & i2) != 0 ? scanningShapePulseParams.twinkleSpeed : f17;
        float f44 = (524288 & i2) != 0 ? scanningShapePulseParams.targetFillDurationSeconds : f18;
        float f45 = (1048576 & i2) != 0 ? scanningShapePulseParams.targetShapeScaleBoost : f19;
        long j3 = (2097152 & i2) != 0 ? scanningShapePulseParams.targetHoldMillis : j;
        float f46 = (4194304 & i2) != 0 ? scanningShapePulseParams.targetSpringDamping : f20;
        float f47 = (8388608 & i2) != 0 ? scanningShapePulseParams.targetSpringStiffness : f21;
        float f48 = (16777216 & i2) != 0 ? scanningShapePulseParams.stepTurnRotationDegrees : f22;
        int i4 = (33554432 & i2) != 0 ? scanningShapePulseParams.stepTurnMaxTurnsPerSpring : i;
        float f49 = (67108864 & i2) != 0 ? scanningShapePulseParams.stepTurnOrbPeakScale : f23;
        long j4 = (134217728 & i2) != 0 ? scanningShapePulseParams.stepTurnHoldMillis : j2;
        float f50 = (268435456 & i2) != 0 ? scanningShapePulseParams.orbTurnDamping : f24;
        float f51 = (536870912 & i2) != 0 ? scanningShapePulseParams.orbTurnStiffness : f25;
        float f52 = (1073741824 & i2) != 0 ? scanningShapePulseParams.shapeTurnDamping : f26;
        float f53 = (i2 & PKIFailureInfo.systemUnavail) != 0 ? scanningShapePulseParams.shapeTurnStiffness : f27;
        float f54 = (i3 & 1) != 0 ? scanningShapePulseParams.orbReturnDamping : f28;
        float f55 = (i3 & 2) != 0 ? scanningShapePulseParams.orbReturnStiffness : f29;
        ShapeStabilityAnimationParams shapeStabilityAnimationParams2 = (i3 & 4) != 0 ? scanningShapePulseParams.stabilityAnimationParams : shapeStabilityAnimationParams;
        fidesmoScanningPulseShape.getClass();
        alignment2.getClass();
        shapeStabilityAnimationParams2.getClass();
        return new ScanningShapePulseParams(fidesmoScanningPulseShape, alignment2, f30, f31, f32, f4, f5, f6, f33, f34, f35, f36, f37, f38, f39, f40, f41, f42, f43, f44, f45, j3, f46, f47, f48, i4, f49, j4, f50, f51, f52, f53, f54, f55, shapeStabilityAnimationParams2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScanningShapePulseParams)) {
            return false;
        }
        ScanningShapePulseParams scanningShapePulseParams = (ScanningShapePulseParams) obj;
        return this.shape == scanningShapePulseParams.shape && Intrinsics.areEqual(this.alignment, scanningShapePulseParams.alignment) && Dp.m1037equalsimpl0(this.offsetX, scanningShapePulseParams.offsetX) && Dp.m1037equalsimpl0(this.offsetY, scanningShapePulseParams.offsetY) && Dp.m1037equalsimpl0(this.shapeSize, scanningShapePulseParams.shapeSize) && Float.compare(this.shapeScale, scanningShapePulseParams.shapeScale) == 0 && Float.compare(this.primaryOpacity, scanningShapePulseParams.primaryOpacity) == 0 && Float.compare(this.fillDurationSeconds, scanningShapePulseParams.fillDurationSeconds) == 0 && Float.compare(this.beatDurationSeconds, scanningShapePulseParams.beatDurationSeconds) == 0 && Float.compare(this.glowScale, scanningShapePulseParams.glowScale) == 0 && Float.compare(this.glowAlpha, scanningShapePulseParams.glowAlpha) == 0 && Dp.m1037equalsimpl0(this.glowBlur, scanningShapePulseParams.glowBlur) && Float.compare(this.glowPulseAmount, scanningShapePulseParams.glowPulseAmount) == 0 && Float.compare(this.glowPulseDurationSeconds, scanningShapePulseParams.glowPulseDurationSeconds) == 0 && Dp.m1037equalsimpl0(this.cellSize, scanningShapePulseParams.cellSize) && Float.compare(this.gap, scanningShapePulseParams.gap) == 0 && Float.compare(this.cornerRadius, scanningShapePulseParams.cornerRadius) == 0 && Float.compare(this.spread, scanningShapePulseParams.spread) == 0 && Float.compare(this.twinkleSpeed, scanningShapePulseParams.twinkleSpeed) == 0 && Float.compare(this.targetFillDurationSeconds, scanningShapePulseParams.targetFillDurationSeconds) == 0 && Float.compare(this.targetShapeScaleBoost, scanningShapePulseParams.targetShapeScaleBoost) == 0 && this.targetHoldMillis == scanningShapePulseParams.targetHoldMillis && Float.compare(this.targetSpringDamping, scanningShapePulseParams.targetSpringDamping) == 0 && Float.compare(this.targetSpringStiffness, scanningShapePulseParams.targetSpringStiffness) == 0 && Float.compare(this.stepTurnRotationDegrees, scanningShapePulseParams.stepTurnRotationDegrees) == 0 && this.stepTurnMaxTurnsPerSpring == scanningShapePulseParams.stepTurnMaxTurnsPerSpring && Float.compare(this.stepTurnOrbPeakScale, scanningShapePulseParams.stepTurnOrbPeakScale) == 0 && this.stepTurnHoldMillis == scanningShapePulseParams.stepTurnHoldMillis && Float.compare(this.orbTurnDamping, scanningShapePulseParams.orbTurnDamping) == 0 && Float.compare(this.orbTurnStiffness, scanningShapePulseParams.orbTurnStiffness) == 0 && Float.compare(this.shapeTurnDamping, scanningShapePulseParams.shapeTurnDamping) == 0 && Float.compare(this.shapeTurnStiffness, scanningShapePulseParams.shapeTurnStiffness) == 0 && Float.compare(this.orbReturnDamping, scanningShapePulseParams.orbReturnDamping) == 0 && Float.compare(this.orbReturnStiffness, scanningShapePulseParams.orbReturnStiffness) == 0 && Intrinsics.areEqual(this.stabilityAnimationParams, scanningShapePulseParams.stabilityAnimationParams);
    }

    public final int hashCode() {
        return this.stabilityAnimationParams.hashCode() + CameraState$Type$EnumUnboxingLocalUtility.m(this.orbReturnStiffness, CameraState$Type$EnumUnboxingLocalUtility.m(this.orbReturnDamping, CameraState$Type$EnumUnboxingLocalUtility.m(this.shapeTurnStiffness, CameraState$Type$EnumUnboxingLocalUtility.m(this.shapeTurnDamping, CameraState$Type$EnumUnboxingLocalUtility.m(this.orbTurnStiffness, CameraState$Type$EnumUnboxingLocalUtility.m(this.orbTurnDamping, Recorder$$ExternalSyntheticOutline2.m(CameraState$Type$EnumUnboxingLocalUtility.m(this.stepTurnOrbPeakScale, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.stepTurnMaxTurnsPerSpring, CameraState$Type$EnumUnboxingLocalUtility.m(this.stepTurnRotationDegrees, CameraState$Type$EnumUnboxingLocalUtility.m(this.targetSpringStiffness, CameraState$Type$EnumUnboxingLocalUtility.m(this.targetSpringDamping, Recorder$$ExternalSyntheticOutline2.m(CameraState$Type$EnumUnboxingLocalUtility.m(this.targetShapeScaleBoost, CameraState$Type$EnumUnboxingLocalUtility.m(this.targetFillDurationSeconds, CameraState$Type$EnumUnboxingLocalUtility.m(this.twinkleSpeed, CameraState$Type$EnumUnboxingLocalUtility.m(this.spread, CameraState$Type$EnumUnboxingLocalUtility.m(this.cornerRadius, CameraState$Type$EnumUnboxingLocalUtility.m(this.gap, CameraState$Type$EnumUnboxingLocalUtility.m(this.cellSize, CameraState$Type$EnumUnboxingLocalUtility.m(this.glowPulseDurationSeconds, CameraState$Type$EnumUnboxingLocalUtility.m(this.glowPulseAmount, CameraState$Type$EnumUnboxingLocalUtility.m(this.glowBlur, CameraState$Type$EnumUnboxingLocalUtility.m(this.glowAlpha, CameraState$Type$EnumUnboxingLocalUtility.m(this.glowScale, CameraState$Type$EnumUnboxingLocalUtility.m(this.beatDurationSeconds, CameraState$Type$EnumUnboxingLocalUtility.m(this.fillDurationSeconds, CameraState$Type$EnumUnboxingLocalUtility.m(this.primaryOpacity, CameraState$Type$EnumUnboxingLocalUtility.m(this.shapeScale, CameraState$Type$EnumUnboxingLocalUtility.m(this.shapeSize, CameraState$Type$EnumUnboxingLocalUtility.m(this.offsetY, CameraState$Type$EnumUnboxingLocalUtility.m(this.offsetX, (this.alignment.hashCode() + (this.shape.hashCode() * 31)) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31, this.targetHoldMillis), 31), 31), 31), 31), 31), 31, this.stepTurnHoldMillis), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        String m1038toStringimpl = Dp.m1038toStringimpl(this.offsetX);
        String m1038toStringimpl2 = Dp.m1038toStringimpl(this.offsetY);
        String m1038toStringimpl3 = Dp.m1038toStringimpl(this.shapeSize);
        String m1038toStringimpl4 = Dp.m1038toStringimpl(this.glowBlur);
        String m1038toStringimpl5 = Dp.m1038toStringimpl(this.cellSize);
        StringBuilder sb = new StringBuilder("ScanningShapePulseParams(shape=");
        sb.append(this.shape);
        sb.append(", alignment=");
        sb.append(this.alignment);
        sb.append(", offsetX=");
        Boxes$$ExternalSyntheticOutline1.m(sb, m1038toStringimpl, ", offsetY=", m1038toStringimpl2, ", shapeSize=");
        sb.append(m1038toStringimpl3);
        sb.append(", shapeScale=");
        sb.append(this.shapeScale);
        sb.append(", primaryOpacity=");
        Request$Priority$EnumUnboxingLocalUtility.m(sb, this.primaryOpacity, ", fillDurationSeconds=", this.fillDurationSeconds, ", beatDurationSeconds=");
        Request$Priority$EnumUnboxingLocalUtility.m(sb, this.beatDurationSeconds, ", glowScale=", this.glowScale, ", glowAlpha=");
        sb.append(this.glowAlpha);
        sb.append(", glowBlur=");
        sb.append(m1038toStringimpl4);
        sb.append(", glowPulseAmount=");
        Request$Priority$EnumUnboxingLocalUtility.m(sb, this.glowPulseAmount, ", glowPulseDurationSeconds=", this.glowPulseDurationSeconds, ", cellSize=");
        sb.append(m1038toStringimpl5);
        sb.append(", gap=");
        sb.append(this.gap);
        sb.append(", cornerRadius=");
        Request$Priority$EnumUnboxingLocalUtility.m(sb, this.cornerRadius, ", spread=", this.spread, ", twinkleSpeed=");
        Request$Priority$EnumUnboxingLocalUtility.m(sb, this.twinkleSpeed, ", targetFillDurationSeconds=", this.targetFillDurationSeconds, ", targetShapeScaleBoost=");
        sb.append(this.targetShapeScaleBoost);
        sb.append(", targetHoldMillis=");
        sb.append(this.targetHoldMillis);
        sb.append(", targetSpringDamping=");
        sb.append(this.targetSpringDamping);
        sb.append(", targetSpringStiffness=");
        sb.append(this.targetSpringStiffness);
        sb.append(", stepTurnRotationDegrees=");
        sb.append(this.stepTurnRotationDegrees);
        sb.append(", stepTurnMaxTurnsPerSpring=");
        sb.append(this.stepTurnMaxTurnsPerSpring);
        sb.append(", stepTurnOrbPeakScale=");
        sb.append(this.stepTurnOrbPeakScale);
        sb.append(", stepTurnHoldMillis=");
        sb.append(this.stepTurnHoldMillis);
        sb.append(", orbTurnDamping=");
        sb.append(this.orbTurnDamping);
        sb.append(", orbTurnStiffness=");
        sb.append(this.orbTurnStiffness);
        sb.append(", shapeTurnDamping=");
        sb.append(this.shapeTurnDamping);
        sb.append(", shapeTurnStiffness=");
        sb.append(this.shapeTurnStiffness);
        sb.append(", orbReturnDamping=");
        sb.append(this.orbReturnDamping);
        sb.append(", orbReturnStiffness=");
        sb.append(this.orbReturnStiffness);
        sb.append(", stabilityAnimationParams=");
        sb.append(this.stabilityAnimationParams);
        sb.append(")");
        return sb.toString();
    }

    public ScanningShapePulseParams(FidesmoScanningPulseShape fidesmoScanningPulseShape, Alignment alignment, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, long j, float f20, float f21, float f22, int i, float f23, long j2, float f24, float f25, float f26, float f27, float f28, float f29, ShapeStabilityAnimationParams shapeStabilityAnimationParams) {
        this.shape = fidesmoScanningPulseShape;
        this.alignment = alignment;
        this.offsetX = f;
        this.offsetY = f2;
        this.shapeSize = f3;
        this.shapeScale = f4;
        this.primaryOpacity = f5;
        this.fillDurationSeconds = f6;
        this.beatDurationSeconds = f7;
        this.glowScale = f8;
        this.glowAlpha = f9;
        this.glowBlur = f10;
        this.glowPulseAmount = f11;
        this.glowPulseDurationSeconds = f12;
        this.cellSize = f13;
        this.gap = f14;
        this.cornerRadius = f15;
        this.spread = f16;
        this.twinkleSpeed = f17;
        this.targetFillDurationSeconds = f18;
        this.targetShapeScaleBoost = f19;
        this.targetHoldMillis = j;
        this.targetSpringDamping = f20;
        this.targetSpringStiffness = f21;
        this.stepTurnRotationDegrees = f22;
        this.stepTurnMaxTurnsPerSpring = i;
        this.stepTurnOrbPeakScale = f23;
        this.stepTurnHoldMillis = j2;
        this.orbTurnDamping = f24;
        this.orbTurnStiffness = f25;
        this.shapeTurnDamping = f26;
        this.shapeTurnStiffness = f27;
        this.orbReturnDamping = f28;
        this.orbReturnStiffness = f29;
        this.stabilityAnimationParams = shapeStabilityAnimationParams;
    }
}
