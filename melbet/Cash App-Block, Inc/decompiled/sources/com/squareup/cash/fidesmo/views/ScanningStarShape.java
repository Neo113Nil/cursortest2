package com.squareup.cash.fidesmo.views;

import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Outline$Generic;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes6.dex */
public final class ScanningStarShape implements Shape {
    public static final ScanningStarShape INSTANCE = new ScanningStarShape();

    public static final float buildPath$xInner(float f, float f2, float f3) {
        return ((f3 + 0.57f) * f2) + f;
    }

    public static final float buildPath$y(float f, float f2, float f3) {
        return ((f3 + 2.8f) * f2) + f;
    }

    public static final float buildPath$yInner(float f, float f2, float f3) {
        return ((f3 + 4.33f) * f2) + f;
    }

    @Override // androidx.compose.ui.graphics.Shape
    /* renamed from: createOutline-Pq9zytI */
    public final ColorKt mo175createOutlinePq9zytI(long j, LayoutDirection layoutDirection, Density density) {
        layoutDirection.getClass();
        density.getClass();
        int i = (int) (j >> 32);
        float intBitsToFloat = Float.intBitsToFloat(i) / 171.0f;
        int i2 = (int) (j & BodyPartID.bodyIdMax);
        float min = Math.min(intBitsToFloat, Float.intBitsToFloat(i2) / 171.0f);
        float f = 171.0f * min;
        float intBitsToFloat2 = (Float.intBitsToFloat(i) - f) / 2.0f;
        float intBitsToFloat3 = (Float.intBitsToFloat(i2) - f) / 2.0f;
        AndroidPath Path = AndroidPath_androidKt.Path();
        Path.m666setFillTypeoQ8Xj4U(1);
        float f2 = (77.3348f * min) + intBitsToFloat2;
        Path.moveTo(f2, buildPath$y(intBitsToFloat3, min, 5.06934f));
        Path.cubicTo((79.4328f * min) + intBitsToFloat2, buildPath$y(intBitsToFloat3, min, -1.68979f), (88.5669f * min) + intBitsToFloat2, buildPath$y(intBitsToFloat3, min, -1.68977f), (90.6649f * min) + intBitsToFloat2, buildPath$y(intBitsToFloat3, min, 5.06934f));
        Path.lineTo((105.69f * min) + intBitsToFloat2, buildPath$y(intBitsToFloat3, min, 53.4834f));
        Path.cubicTo((106.629f * min) + intBitsToFloat2, buildPath$y(intBitsToFloat3, min, 56.5062f), (109.319f * min) + intBitsToFloat2, buildPath$y(intBitsToFloat3, min, 58.5527f), (112.355f * min) + intBitsToFloat2, buildPath$y(intBitsToFloat3, min, 58.5527f));
        Path.lineTo((160.978f * min) + intBitsToFloat2, buildPath$y(intBitsToFloat3, min, 58.5527f));
        Path.cubicTo((167.767f * min) + intBitsToFloat2, buildPath$y(intBitsToFloat3, min, 58.5528f), (170.59f * min) + intBitsToFloat2, buildPath$y(intBitsToFloat3, min, 67.6476f), (165.098f * min) + intBitsToFloat2, buildPath$y(intBitsToFloat3, min, 71.8252f));
        Path.lineTo((125.761f * min) + intBitsToFloat2, buildPath$y(intBitsToFloat3, min, 101.746f));
        Path.cubicTo((123.304f * min) + intBitsToFloat2, buildPath$y(intBitsToFloat3, min, 103.614f), (122.277f * min) + intBitsToFloat2, buildPath$y(intBitsToFloat3, min, 106.926f), (123.215f * min) + intBitsToFloat2, buildPath$y(intBitsToFloat3, min, 109.949f));
        Path.lineTo((138.24f * min) + intBitsToFloat2, buildPath$y(intBitsToFloat3, min, 158.362f));
        Path.cubicTo((140.338f * min) + intBitsToFloat2, buildPath$y(intBitsToFloat3, min, 165.122f), (132.948f * min) + intBitsToFloat2, buildPath$y(intBitsToFloat3, min, 170.743f), (127.456f * min) + intBitsToFloat2, buildPath$y(intBitsToFloat3, min, 166.565f));
        Path.lineTo((88.119f * min) + intBitsToFloat2, buildPath$y(intBitsToFloat3, min, 136.645f));
        Path.cubicTo((85.6628f * min) + intBitsToFloat2, buildPath$y(intBitsToFloat3, min, 134.776f), (82.337f * min) + intBitsToFloat2, buildPath$y(intBitsToFloat3, min, 134.776f), (79.8807f * min) + intBitsToFloat2, buildPath$y(intBitsToFloat3, min, 136.645f));
        Path.lineTo((40.5438f * min) + intBitsToFloat2, buildPath$y(intBitsToFloat3, min, 166.565f));
        Path.cubicTo((35.0516f * min) + intBitsToFloat2, buildPath$y(intBitsToFloat3, min, 170.743f), (27.6618f * min) + intBitsToFloat2, buildPath$y(intBitsToFloat3, min, 165.122f), (29.7597f * min) + intBitsToFloat2, buildPath$y(intBitsToFloat3, min, 158.362f));
        Path.lineTo((44.785f * min) + intBitsToFloat2, buildPath$y(intBitsToFloat3, min, 109.949f));
        Path.cubicTo((45.7232f * min) + intBitsToFloat2, buildPath$y(intBitsToFloat3, min, 106.926f), (44.6954f * min) + intBitsToFloat2, buildPath$y(intBitsToFloat3, min, 103.614f), (42.2391f * min) + intBitsToFloat2, buildPath$y(intBitsToFloat3, min, 101.746f));
        Path.lineTo((2.90223f * min) + intBitsToFloat2, buildPath$y(intBitsToFloat3, min, 71.8252f));
        Path.cubicTo(((-2.59002f) * min) + intBitsToFloat2, buildPath$y(intBitsToFloat3, min, 67.6476f), (0.23261f * min) + intBitsToFloat2, buildPath$y(intBitsToFloat3, min, 58.5528f), (7.02137f * min) + intBitsToFloat2, buildPath$y(intBitsToFloat3, min, 58.5527f));
        Path.lineTo((55.6444f * min) + intBitsToFloat2, buildPath$y(intBitsToFloat3, min, 58.5527f));
        Path.cubicTo((58.6803f * min) + intBitsToFloat2, buildPath$y(intBitsToFloat3, min, 58.5527f), (61.3712f * min) + intBitsToFloat2, buildPath$y(intBitsToFloat3, min, 56.5062f), (62.3095f * min) + intBitsToFloat2, buildPath$y(intBitsToFloat3, min, 53.4834f));
        Path.lineTo(f2, buildPath$y(intBitsToFloat3, min, 5.06934f));
        Path.close();
        Path.moveTo(buildPath$xInner(intBitsToFloat2, min, 87.4081f), buildPath$yInner(intBitsToFloat3, min, 39.3652f));
        Path.cubicTo(buildPath$xInner(intBitsToFloat2, min, 86.1593f), buildPath$yInner(intBitsToFloat3, min, 35.3418f), buildPath$xInner(intBitsToFloat2, min, 80.7222f), buildPath$yInner(intBitsToFloat3, min, 35.3417f), buildPath$xInner(intBitsToFloat2, min, 79.4735f), buildPath$yInner(intBitsToFloat3, min, 39.3652f));
        Path.lineTo(buildPath$xInner(intBitsToFloat2, min, 70.5302f), buildPath$yInner(intBitsToFloat3, min, 68.1826f));
        Path.cubicTo(buildPath$xInner(intBitsToFloat2, min, 69.9717f), buildPath$yInner(intBitsToFloat3, min, 69.982f), buildPath$xInner(intBitsToFloat2, min, 68.3696f), buildPath$yInner(intBitsToFloat3, min, 71.2002f), buildPath$xInner(intBitsToFloat2, min, 66.5624f), buildPath$yInner(intBitsToFloat3, min, 71.2002f));
        Path.lineTo(buildPath$xInner(intBitsToFloat2, min, 37.62f), buildPath$yInner(intBitsToFloat3, min, 71.2002f));
        Path.cubicTo(buildPath$xInner(intBitsToFloat2, min, 33.5794f), buildPath$yInner(intBitsToFloat3, min, 71.2006f), buildPath$xInner(intBitsToFloat2, min, 31.8998f), buildPath$yInner(intBitsToFloat3, min, 76.614f), buildPath$xInner(intBitsToFloat2, min, 35.1688f), buildPath$yInner(intBitsToFloat3, min, 79.1006f));
        Path.lineTo(buildPath$xInner(intBitsToFloat2, min, 58.5839f), buildPath$yInner(intBitsToFloat3, min, 96.9111f));
        Path.cubicTo(buildPath$xInner(intBitsToFloat2, min, 60.0456f), buildPath$yInner(intBitsToFloat3, min, 98.0233f), buildPath$xInner(intBitsToFloat2, min, 60.6569f), buildPath$yInner(intBitsToFloat3, min, 99.9947f), buildPath$xInner(intBitsToFloat2, min, 60.0985f), buildPath$yInner(intBitsToFloat3, min, 101.794f));
        Path.lineTo(buildPath$xInner(intBitsToFloat2, min, 51.1552f), buildPath$yInner(intBitsToFloat3, min, 130.611f));
        Path.cubicTo(buildPath$xInner(intBitsToFloat2, min, 49.9066f), buildPath$yInner(intBitsToFloat3, min, 134.635f), buildPath$xInner(intBitsToFloat2, min, 54.305f), buildPath$yInner(intBitsToFloat3, min, 137.98f), buildPath$xInner(intBitsToFloat2, min, 57.5741f), buildPath$yInner(intBitsToFloat3, min, 135.494f));
        Path.lineTo(buildPath$xInner(intBitsToFloat2, min, 80.9891f), buildPath$yInner(intBitsToFloat3, min, 117.684f));
        Path.cubicTo(buildPath$xInner(intBitsToFloat2, min, 82.4512f), buildPath$yInner(intBitsToFloat3, min, 116.572f), buildPath$xInner(intBitsToFloat2, min, 84.4314f), buildPath$yInner(intBitsToFloat3, min, 116.572f), buildPath$xInner(intBitsToFloat2, min, 85.8934f), buildPath$yInner(intBitsToFloat3, min, 117.684f));
        Path.lineTo(buildPath$xInner(intBitsToFloat2, min, 109.308f), buildPath$yInner(intBitsToFloat3, min, 135.494f));
        Path.cubicTo(buildPath$xInner(intBitsToFloat2, min, 112.577f), buildPath$yInner(intBitsToFloat3, min, 137.981f), buildPath$xInner(intBitsToFloat2, min, 116.976f), buildPath$yInner(intBitsToFloat3, min, 134.635f), buildPath$xInner(intBitsToFloat2, min, 115.727f), buildPath$yInner(intBitsToFloat3, min, 130.611f));
        Path.lineTo(buildPath$xInner(intBitsToFloat2, min, 106.783f), buildPath$yInner(intBitsToFloat3, min, 101.794f));
        Path.cubicTo(buildPath$xInner(intBitsToFloat2, min, 106.225f), buildPath$yInner(intBitsToFloat3, min, 99.9946f), buildPath$xInner(intBitsToFloat2, min, 106.837f), buildPath$yInner(intBitsToFloat3, min, 98.0232f), buildPath$xInner(intBitsToFloat2, min, 108.299f), buildPath$yInner(intBitsToFloat3, min, 96.9111f));
        Path.lineTo(buildPath$xInner(intBitsToFloat2, min, 131.714f), buildPath$yInner(intBitsToFloat3, min, 79.1006f));
        Path.cubicTo(buildPath$xInner(intBitsToFloat2, min, 134.983f), buildPath$yInner(intBitsToFloat3, min, 76.6138f), buildPath$xInner(intBitsToFloat2, min, 133.302f), buildPath$yInner(intBitsToFloat3, min, 71.2002f), buildPath$xInner(intBitsToFloat2, min, 129.262f), buildPath$yInner(intBitsToFloat3, min, 71.2002f));
        Path.lineTo(buildPath$xInner(intBitsToFloat2, min, 100.319f), buildPath$yInner(intBitsToFloat3, min, 71.2002f));
        Path.cubicTo(buildPath$xInner(intBitsToFloat2, min, 98.5121f), buildPath$yInner(intBitsToFloat3, min, 71.2002f), buildPath$xInner(intBitsToFloat2, min, 96.9109f), buildPath$yInner(intBitsToFloat3, min, 69.982f), buildPath$xInner(intBitsToFloat2, min, 96.3524f), buildPath$yInner(intBitsToFloat3, min, 68.1826f));
        Path.lineTo(buildPath$xInner(intBitsToFloat2, min, 87.4081f), buildPath$yInner(intBitsToFloat3, min, 39.3652f));
        Path.close();
        return new Outline$Generic(Path);
    }
}
