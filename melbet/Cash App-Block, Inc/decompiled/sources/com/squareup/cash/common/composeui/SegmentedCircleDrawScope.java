package com.squareup.cash.common.composeui;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.AndroidImageBitmap;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.PathEffect;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.cash.common.composeui.SegmentedCircleConfig;
import com.squareup.wire.GrpcMethod;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import kotlin.ULong;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes6.dex */
public final class SegmentedCircleDrawScope implements DrawScope {
    public final /* synthetic */ DrawScope $$delegate_0;
    public final SegmentedCircleConfig config;
    public final long diameter;
    public final SegmentedCircleInteractableState segmentedCircleInteractableState;
    public final float selectionHandleInnerRadius;
    public final float selectionHandleOuterRadius;
    public final long strokeOffset;
    public final float strokeWidth;

    public final class SegmentDrawingSpec {
        public final float angle;
        public final long color;
        public final float startDegrees;

        public SegmentDrawingSpec(float f, float f2, long j) {
            this.startDegrees = f;
            this.angle = f2;
            this.color = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SegmentDrawingSpec)) {
                return false;
            }
            SegmentDrawingSpec segmentDrawingSpec = (SegmentDrawingSpec) obj;
            return Float.compare(this.startDegrees, segmentDrawingSpec.startDegrees) == 0 && Float.compare(this.angle, segmentDrawingSpec.angle) == 0 && Color.m676equalsimpl0(this.color, segmentDrawingSpec.color);
        }

        public final int hashCode() {
            int m = CameraState$Type$EnumUnboxingLocalUtility.m(this.angle, Float.hashCode(this.startDegrees) * 31, 31);
            int i = Color.$r8$clinit;
            ULong.Companion companion = ULong.Companion;
            return Long.hashCode(this.color) + m;
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("SegmentDrawingSpec(startDegrees=", this.startDegrees, ", angle=", this.angle, ", color="), Color.m682toStringimpl(this.color), ")");
        }
    }

    public SegmentedCircleDrawScope(DrawScope drawScope, float f, long j, long j2, SegmentedCircleConfig segmentedCircleConfig, SegmentedCircleInteractableState segmentedCircleInteractableState, float f2, float f3) {
        drawScope.getClass();
        segmentedCircleInteractableState.getClass();
        this.$$delegate_0 = drawScope;
        this.strokeWidth = f;
        this.strokeOffset = j;
        this.diameter = j2;
        this.config = segmentedCircleConfig;
        this.segmentedCircleInteractableState = segmentedCircleInteractableState;
        this.selectionHandleOuterRadius = f2;
        this.selectionHandleInnerRadius = f3;
    }

    /* renamed from: coordinatesForAngle-LJ-T1hE, reason: not valid java name */
    public static long m3478coordinatesForAngleLJT1hE(float f, float f2, long j) {
        double d = f * 0.017453292519943295d;
        double intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) / 2.0f;
        float f3 = f2 / 2.0f;
        float cos = ((float) (Math.cos(d) * intBitsToFloat)) + f3;
        float sin = ((float) (Math.sin(d) * intBitsToFloat)) + f3;
        return (Float.floatToRawIntBits(cos) << 32) | (BodyPartID.bodyIdMax & Float.floatToRawIntBits(sin));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawArc-illE91I */
    public final void mo724drawArcillE91I(Brush brush, long j, long j2, DrawStyle drawStyle) {
        brush.getClass();
        drawStyle.getClass();
        this.$$delegate_0.mo724drawArcillE91I(brush, j, j2, drawStyle);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawArc-yD3GUKo */
    public final void mo725drawArcyD3GUKo(long j, float f, float f2, long j2, long j3, float f3, Stroke stroke) {
        this.$$delegate_0.mo725drawArcyD3GUKo(j, f, f2, j2, j3, f3, stroke);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawCircle-VaOC9Bg */
    public final void mo726drawCircleVaOC9Bg(long j, float f, long j2, DrawStyle drawStyle, int i) {
        drawStyle.getClass();
        this.$$delegate_0.mo726drawCircleVaOC9Bg(j, f, j2, drawStyle, i);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawImage-AZ2fEMs */
    public final void mo727drawImageAZ2fEMs(AndroidImageBitmap androidImageBitmap, long j, long j2, long j3, long j4, float f, ColorFilter colorFilter, int i, int i2) {
        androidImageBitmap.getClass();
        this.$$delegate_0.mo727drawImageAZ2fEMs(androidImageBitmap, j, j2, j3, j4, f, colorFilter, i, i2);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawImage-gbVJVH8 */
    public final void mo728drawImagegbVJVH8(AndroidImageBitmap androidImageBitmap, long j, float f, ColorFilter colorFilter, int i) {
        androidImageBitmap.getClass();
        this.$$delegate_0.mo728drawImagegbVJVH8(androidImageBitmap, j, f, colorFilter, i);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawLine-NGM6Ib0 */
    public final void mo729drawLineNGM6Ib0(long j, long j2, long j3, float f, int i, PathEffect pathEffect, float f2) {
        this.$$delegate_0.mo729drawLineNGM6Ib0(j, j2, j3, f, i, pathEffect, f2);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawOval-n-J9OG0 */
    public final void mo730drawOvalnJ9OG0(long j, long j2, long j3, DrawStyle drawStyle) {
        drawStyle.getClass();
        this.$$delegate_0.mo730drawOvalnJ9OG0(j, j2, j3, drawStyle);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawPath-GBMwjPU */
    public final void mo731drawPathGBMwjPU(AndroidPath androidPath, Brush brush, float f, DrawStyle drawStyle, int i) {
        androidPath.getClass();
        brush.getClass();
        drawStyle.getClass();
        this.$$delegate_0.mo731drawPathGBMwjPU(androidPath, brush, f, drawStyle, i);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawPath-LG529CI */
    public final void mo732drawPathLG529CI(AndroidPath androidPath, long j, float f, DrawStyle drawStyle) {
        androidPath.getClass();
        drawStyle.getClass();
        this.$$delegate_0.mo732drawPathLG529CI(androidPath, j, f, drawStyle);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawPoints-F8ZwMP8 */
    public final void mo733drawPointsF8ZwMP8(ArrayList arrayList, long j, float f) {
        this.$$delegate_0.mo733drawPointsF8ZwMP8(arrayList, j, f);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawRect-AsUm42w */
    public final void mo734drawRectAsUm42w(Brush brush, long j, long j2, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i) {
        brush.getClass();
        drawStyle.getClass();
        this.$$delegate_0.mo734drawRectAsUm42w(brush, j, j2, f, drawStyle, colorFilter, i);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawRect-n-J9OG0 */
    public final void mo735drawRectnJ9OG0(long j, long j2, long j3, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i) {
        drawStyle.getClass();
        this.$$delegate_0.mo735drawRectnJ9OG0(j, j2, j3, f, drawStyle, colorFilter, i);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawRoundRect-u-Aw5IA */
    public final void mo736drawRoundRectuAw5IA(long j, long j2, long j3, long j4, DrawStyle drawStyle) {
        drawStyle.getClass();
        this.$$delegate_0.mo736drawRoundRectuAw5IA(j, j2, j3, j4, drawStyle);
    }

    /* renamed from: drawSegmentArc-AgEwaKs, reason: not valid java name */
    public final void m3479drawSegmentArcAgEwaKs(float f, float f2, int i, long j) {
        if (f2 == RecyclerView.DECELERATION_RATE) {
            DrawScope.m738drawCircleVaOC9Bg$default(this, j, this.strokeWidth / 2.0f, m3478coordinatesForAngleLJT1hE(f, Size.m641getMaxDimensionimpl(this.$$delegate_0.mo753getSizeNHjbRc()), this.diameter), null, 0, 120);
        } else {
            DrawScope.m737drawArcyD3GUKo$default(this, j, f, f2, this.strokeOffset, this.diameter, RecyclerView.DECELERATION_RATE, new Stroke(this.strokeWidth, RecyclerView.DECELERATION_RATE, i, 0, null, 26), 832);
        }
    }

    /* renamed from: drawSelectedSegmentArc-GxzWYVk, reason: not valid java name */
    public final void m3480drawSelectedSegmentArcGxzWYVk(float f, float f2, long j, int i, DrawingCheckpoint drawingCheckpoint) {
        DrawScope drawScope = this.$$delegate_0;
        float max = Math.max(f2 - (((this.selectionHandleOuterRadius / (Size.m641getMaxDimensionimpl(drawScope.mo753getSizeNHjbRc()) / 2.0f)) * 57.29578f) / 2.0f), RecyclerView.DECELERATION_RATE);
        m3479drawSegmentArcAgEwaKs(f, max, i, j);
        long m3478coordinatesForAngleLJT1hE = m3478coordinatesForAngleLJT1hE(f + max, Size.m641getMaxDimensionimpl(drawScope.mo753getSizeNHjbRc()), this.diameter);
        DrawScope.m738drawCircleVaOC9Bg$default(this, j, this.selectionHandleOuterRadius, m3478coordinatesForAngleLJT1hE, null, 0, 120);
        DrawScope.m738drawCircleVaOC9Bg$default(this, Color.White, this.selectionHandleInnerRadius, m3478coordinatesForAngleLJT1hE, null, 0, 56);
        if (drawingCheckpoint != null) {
            AndroidCanvas_androidKt.getNativeCanvas(drawScope.getDrawContext().getCanvas()).restoreToCount(drawingCheckpoint.value);
        }
        this.segmentedCircleInteractableState.center$delegate.setValue(new Offset(m3478coordinatesForAngleLJT1hE));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: getCenter-F1C5BW0 */
    public final long mo752getCenterF1C5BW0() {
        return this.$$delegate_0.mo752getCenterF1C5BW0();
    }

    @Override // androidx.compose.ui.unit.Density
    public final float getDensity() {
        return this.$$delegate_0.getDensity();
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public final GrpcMethod getDrawContext() {
        return this.$$delegate_0.getDrawContext();
    }

    @Override // androidx.compose.ui.unit.Density
    public final float getFontScale() {
        return this.$$delegate_0.getFontScale();
    }

    public final float getGapBetweenSegments() {
        float intBitsToFloat;
        DrawScope drawScope = this.$$delegate_0;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (drawScope.mo753getSizeNHjbRc() >> 32));
        float f = this.strokeWidth;
        float f2 = (float) ((intBitsToFloat2 - f) * 3.141592653589793d);
        SegmentedCircleConfig.SizingConfig sizingConfig = this.config.segmentGapWidth;
        if (sizingConfig instanceof SegmentedCircleConfig.SizingConfig.Fixed) {
            intBitsToFloat = ((SegmentedCircleConfig.SizingConfig.Fixed) sizingConfig).size;
        } else {
            if (!(sizingConfig instanceof SegmentedCircleConfig.SizingConfig.Percentage)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return RecyclerView.DECELERATION_RATE;
            }
            intBitsToFloat = ((SegmentedCircleConfig.SizingConfig.Percentage) sizingConfig).percentage * Float.intBitsToFloat((int) (drawScope.mo753getSizeNHjbRc() >> 32));
        }
        return ((intBitsToFloat + f) / f2) * 360.0f;
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public final LayoutDirection getLayoutDirection() {
        return this.$$delegate_0.getLayoutDirection();
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: getSize-NH-jbRc */
    public final long mo753getSizeNHjbRc() {
        return this.$$delegate_0.mo753getSizeNHjbRc();
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: roundToPx--R2X_6o */
    public final int mo229roundToPxR2X_6o(long j) {
        return this.$$delegate_0.mo229roundToPxR2X_6o(j);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: roundToPx-0680j_4 */
    public final int mo230roundToPx0680j_4(float f) {
        return this.$$delegate_0.mo230roundToPx0680j_4(f);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toDp-GaN1DYA */
    public final float mo231toDpGaN1DYA(long j) {
        return this.$$delegate_0.mo231toDpGaN1DYA(j);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toDp-u2uoSUM */
    public final float mo232toDpu2uoSUM(float f) {
        return this.$$delegate_0.mo232toDpu2uoSUM(f);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toDpSize-k-rfVVM */
    public final long mo234toDpSizekrfVVM(long j) {
        return this.$$delegate_0.mo234toDpSizekrfVVM(j);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toPx--R2X_6o */
    public final float mo235toPxR2X_6o(long j) {
        return this.$$delegate_0.mo235toPxR2X_6o(j);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toPx-0680j_4 */
    public final float mo236toPx0680j_4(float f) {
        return this.$$delegate_0.mo236toPx0680j_4(f);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toSize-XkaWNTQ */
    public final long mo237toSizeXkaWNTQ(long j) {
        return this.$$delegate_0.mo237toSizeXkaWNTQ(j);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toSp-0xMU5do */
    public final long mo238toSp0xMU5do(float f) {
        return this.$$delegate_0.mo238toSp0xMU5do(f);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toSp-kPz2Gy4 */
    public final long mo239toSpkPz2Gy4(float f) {
        return this.$$delegate_0.mo239toSpkPz2Gy4(f);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toDp-u2uoSUM */
    public final float mo233toDpu2uoSUM(int i) {
        return this.$$delegate_0.mo233toDpu2uoSUM(i);
    }
}
