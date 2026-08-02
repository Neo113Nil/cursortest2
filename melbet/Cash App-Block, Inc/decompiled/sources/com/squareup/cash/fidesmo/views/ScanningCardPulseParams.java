package com.squareup.cash.fidesmo.views;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.Dp;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.recyclerview.widget.RecyclerView;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class ScanningCardPulseParams {
    public final Alignment alignment;
    public final float beatDurationSeconds;
    public final float cardScale;
    public final float cardSize;
    public final float cardTurnDamping;
    public final float cardTurnStiffness;
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

    public ScanningCardPulseParams(Alignment alignment, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, long j, float f20, float f21, float f22, int i, float f23, long j2, float f24, float f25, float f26, float f27, float f28, float f29, ShapeStabilityAnimationParams shapeStabilityAnimationParams) {
        shapeStabilityAnimationParams.getClass();
        this.alignment = alignment;
        this.offsetX = f;
        this.offsetY = f2;
        this.cardSize = f3;
        this.cardScale = f4;
        this.fillDurationSeconds = f5;
        this.beatDurationSeconds = f6;
        this.cellSize = f7;
        this.gap = f8;
        this.cornerRadius = f9;
        this.spread = f10;
        this.twinkleSpeed = f11;
        this.primaryOpacity = f12;
        this.glowScale = f13;
        this.glowAlpha = f14;
        this.glowBlur = f15;
        this.glowPulseAmount = f16;
        this.glowPulseDurationSeconds = f17;
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
        this.cardTurnDamping = f26;
        this.cardTurnStiffness = f27;
        this.orbReturnDamping = f28;
        this.orbReturnStiffness = f29;
        this.stabilityAnimationParams = shapeStabilityAnimationParams;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScanningCardPulseParams)) {
            return false;
        }
        ScanningCardPulseParams scanningCardPulseParams = (ScanningCardPulseParams) obj;
        return Intrinsics.areEqual(this.alignment, scanningCardPulseParams.alignment) && Dp.m1037equalsimpl0(this.offsetX, scanningCardPulseParams.offsetX) && Dp.m1037equalsimpl0(this.offsetY, scanningCardPulseParams.offsetY) && Dp.m1037equalsimpl0(this.cardSize, scanningCardPulseParams.cardSize) && Float.compare(this.cardScale, scanningCardPulseParams.cardScale) == 0 && Float.compare(this.fillDurationSeconds, scanningCardPulseParams.fillDurationSeconds) == 0 && Float.compare(this.beatDurationSeconds, scanningCardPulseParams.beatDurationSeconds) == 0 && Dp.m1037equalsimpl0(this.cellSize, scanningCardPulseParams.cellSize) && Float.compare(this.gap, scanningCardPulseParams.gap) == 0 && Float.compare(this.cornerRadius, scanningCardPulseParams.cornerRadius) == 0 && Float.compare(this.spread, scanningCardPulseParams.spread) == 0 && Float.compare(this.twinkleSpeed, scanningCardPulseParams.twinkleSpeed) == 0 && Float.compare(this.primaryOpacity, scanningCardPulseParams.primaryOpacity) == 0 && Float.compare(this.glowScale, scanningCardPulseParams.glowScale) == 0 && Float.compare(this.glowAlpha, scanningCardPulseParams.glowAlpha) == 0 && Dp.m1037equalsimpl0(this.glowBlur, scanningCardPulseParams.glowBlur) && Float.compare(this.glowPulseAmount, scanningCardPulseParams.glowPulseAmount) == 0 && Float.compare(this.glowPulseDurationSeconds, scanningCardPulseParams.glowPulseDurationSeconds) == 0 && Float.compare(this.targetFillDurationSeconds, scanningCardPulseParams.targetFillDurationSeconds) == 0 && Float.compare(this.targetShapeScaleBoost, scanningCardPulseParams.targetShapeScaleBoost) == 0 && this.targetHoldMillis == scanningCardPulseParams.targetHoldMillis && Float.compare(this.targetSpringDamping, scanningCardPulseParams.targetSpringDamping) == 0 && Float.compare(this.targetSpringStiffness, scanningCardPulseParams.targetSpringStiffness) == 0 && Float.compare(this.stepTurnRotationDegrees, scanningCardPulseParams.stepTurnRotationDegrees) == 0 && this.stepTurnMaxTurnsPerSpring == scanningCardPulseParams.stepTurnMaxTurnsPerSpring && Float.compare(this.stepTurnOrbPeakScale, scanningCardPulseParams.stepTurnOrbPeakScale) == 0 && this.stepTurnHoldMillis == scanningCardPulseParams.stepTurnHoldMillis && Float.compare(this.orbTurnDamping, scanningCardPulseParams.orbTurnDamping) == 0 && Float.compare(this.orbTurnStiffness, scanningCardPulseParams.orbTurnStiffness) == 0 && Float.compare(this.cardTurnDamping, scanningCardPulseParams.cardTurnDamping) == 0 && Float.compare(this.cardTurnStiffness, scanningCardPulseParams.cardTurnStiffness) == 0 && Float.compare(this.orbReturnDamping, scanningCardPulseParams.orbReturnDamping) == 0 && Float.compare(this.orbReturnStiffness, scanningCardPulseParams.orbReturnStiffness) == 0 && Intrinsics.areEqual(this.stabilityAnimationParams, scanningCardPulseParams.stabilityAnimationParams);
    }

    public final int hashCode() {
        return this.stabilityAnimationParams.hashCode() + CameraState$Type$EnumUnboxingLocalUtility.m(this.orbReturnStiffness, CameraState$Type$EnumUnboxingLocalUtility.m(this.orbReturnDamping, CameraState$Type$EnumUnboxingLocalUtility.m(this.cardTurnStiffness, CameraState$Type$EnumUnboxingLocalUtility.m(this.cardTurnDamping, CameraState$Type$EnumUnboxingLocalUtility.m(this.orbTurnStiffness, CameraState$Type$EnumUnboxingLocalUtility.m(this.orbTurnDamping, Recorder$$ExternalSyntheticOutline2.m(CameraState$Type$EnumUnboxingLocalUtility.m(this.stepTurnOrbPeakScale, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.stepTurnMaxTurnsPerSpring, CameraState$Type$EnumUnboxingLocalUtility.m(this.stepTurnRotationDegrees, CameraState$Type$EnumUnboxingLocalUtility.m(this.targetSpringStiffness, CameraState$Type$EnumUnboxingLocalUtility.m(this.targetSpringDamping, Recorder$$ExternalSyntheticOutline2.m(CameraState$Type$EnumUnboxingLocalUtility.m(this.targetShapeScaleBoost, CameraState$Type$EnumUnboxingLocalUtility.m(this.targetFillDurationSeconds, CameraState$Type$EnumUnboxingLocalUtility.m(this.glowPulseDurationSeconds, CameraState$Type$EnumUnboxingLocalUtility.m(this.glowPulseAmount, CameraState$Type$EnumUnboxingLocalUtility.m(this.glowBlur, CameraState$Type$EnumUnboxingLocalUtility.m(this.glowAlpha, CameraState$Type$EnumUnboxingLocalUtility.m(this.glowScale, CameraState$Type$EnumUnboxingLocalUtility.m(this.primaryOpacity, CameraState$Type$EnumUnboxingLocalUtility.m(this.twinkleSpeed, CameraState$Type$EnumUnboxingLocalUtility.m(this.spread, CameraState$Type$EnumUnboxingLocalUtility.m(this.cornerRadius, CameraState$Type$EnumUnboxingLocalUtility.m(this.gap, CameraState$Type$EnumUnboxingLocalUtility.m(this.cellSize, CameraState$Type$EnumUnboxingLocalUtility.m(this.beatDurationSeconds, CameraState$Type$EnumUnboxingLocalUtility.m(this.fillDurationSeconds, CameraState$Type$EnumUnboxingLocalUtility.m(this.cardScale, CameraState$Type$EnumUnboxingLocalUtility.m(this.cardSize, CameraState$Type$EnumUnboxingLocalUtility.m(this.offsetY, CameraState$Type$EnumUnboxingLocalUtility.m(this.offsetX, this.alignment.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31, this.targetHoldMillis), 31), 31), 31), 31), 31), 31, this.stepTurnHoldMillis), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        String m1038toStringimpl = Dp.m1038toStringimpl(this.offsetX);
        String m1038toStringimpl2 = Dp.m1038toStringimpl(this.offsetY);
        String m1038toStringimpl3 = Dp.m1038toStringimpl(this.cardSize);
        String m1038toStringimpl4 = Dp.m1038toStringimpl(this.cellSize);
        String m1038toStringimpl5 = Dp.m1038toStringimpl(this.glowBlur);
        StringBuilder sb = new StringBuilder("ScanningCardPulseParams(alignment=");
        sb.append(this.alignment);
        sb.append(", offsetX=");
        sb.append(m1038toStringimpl);
        sb.append(", offsetY=");
        Boxes$$ExternalSyntheticOutline1.m(sb, m1038toStringimpl2, ", cardSize=", m1038toStringimpl3, ", cardScale=");
        Request$Priority$EnumUnboxingLocalUtility.m(sb, this.cardScale, ", fillDurationSeconds=", this.fillDurationSeconds, ", beatDurationSeconds=");
        sb.append(this.beatDurationSeconds);
        sb.append(", cellSize=");
        sb.append(m1038toStringimpl4);
        sb.append(", gap=");
        Request$Priority$EnumUnboxingLocalUtility.m(sb, this.gap, ", cornerRadius=", this.cornerRadius, ", spread=");
        Request$Priority$EnumUnboxingLocalUtility.m(sb, this.spread, ", twinkleSpeed=", this.twinkleSpeed, ", primaryOpacity=");
        Request$Priority$EnumUnboxingLocalUtility.m(sb, this.primaryOpacity, ", glowScale=", this.glowScale, ", glowAlpha=");
        sb.append(this.glowAlpha);
        sb.append(", glowBlur=");
        sb.append(m1038toStringimpl5);
        sb.append(", glowPulseAmount=");
        Request$Priority$EnumUnboxingLocalUtility.m(sb, this.glowPulseAmount, ", glowPulseDurationSeconds=", this.glowPulseDurationSeconds, ", targetFillDurationSeconds=");
        Request$Priority$EnumUnboxingLocalUtility.m(sb, this.targetFillDurationSeconds, ", targetShapeScaleBoost=", this.targetShapeScaleBoost, ", targetHoldMillis=");
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
        Boxes$$ExternalSyntheticOutline1.m1151m(this.stepTurnHoldMillis, ", stepTurnHoldMillis=", ", orbTurnDamping=", sb);
        Request$Priority$EnumUnboxingLocalUtility.m(sb, this.orbTurnDamping, ", orbTurnStiffness=", this.orbTurnStiffness, ", cardTurnDamping=");
        Request$Priority$EnumUnboxingLocalUtility.m(sb, this.cardTurnDamping, ", cardTurnStiffness=", this.cardTurnStiffness, ", orbReturnDamping=");
        Request$Priority$EnumUnboxingLocalUtility.m(sb, this.orbReturnDamping, ", orbReturnStiffness=", this.orbReturnStiffness, ", stabilityAnimationParams=");
        sb.append(this.stabilityAnimationParams);
        sb.append(")");
        return sb.toString();
    }

    public ScanningCardPulseParams(ShapeStabilityAnimationParams shapeStabilityAnimationParams, int i) {
        this(Alignment.Companion.TopCenter, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 240.0f, 0.65f, 1.8f, -0.75f, 3.12f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 0.52f, 0.58f, 1.27f, 0.53f, 33.4f, 0.05f, 1.7f, 1.2f, 0.05f, 981L, 1.58f, 400.0f, RecyclerView.DECELERATION_RATE, 3, 1.15f, 981L, 0.42f, 157.9f, 0.58f, 207.96f, 1.58f, 400.0f, (i & 2) != 0 ? ShapeStabilityAnimationParams.Disabled : shapeStabilityAnimationParams);
    }
}
