package com.squareup.cash.common.composeui;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Outline$Generic;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.util.DBUtil;
import com.squareup.util.Strings;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes6.dex */
public final class TooltipShape implements Shape {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ TooltipShape(int i) {
        this.$r8$classId = i;
    }

    @Override // androidx.compose.ui.graphics.Shape
    /* renamed from: createOutline-Pq9zytI */
    public final ColorKt mo175createOutlinePq9zytI(long j, LayoutDirection layoutDirection, Density density) {
        int i = this.$r8$classId;
        layoutDirection.getClass();
        density.getClass();
        switch (i) {
            case 0:
                float mo236toPx0680j_4 = density.mo236toPx0680j_4(12.0f);
                float mo236toPx0680j_42 = density.mo236toPx0680j_4(16.0f);
                AndroidPath Path = AndroidPath_androidKt.Path();
                long floatToRawIntBits = (Float.floatToRawIntBits(RecyclerView.DECELERATION_RATE) << 32) | (Float.floatToRawIntBits(RecyclerView.DECELERATION_RATE) & BodyPartID.bodyIdMax);
                int i2 = (int) (j >> 32);
                float intBitsToFloat = Float.intBitsToFloat(i2);
                int i3 = (int) (j & BodyPartID.bodyIdMax);
                float intBitsToFloat2 = Float.intBitsToFloat(i3) - mo236toPx0680j_4;
                Rect m1180Recttz77jQw = DBUtil.m1180Recttz77jQw(floatToRawIntBits, (Float.floatToRawIntBits(intBitsToFloat2) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(intBitsToFloat) << 32));
                long floatToRawIntBits2 = (Float.floatToRawIntBits(mo236toPx0680j_42) << 32) | (Float.floatToRawIntBits(mo236toPx0680j_42) & BodyPartID.bodyIdMax);
                AndroidPath.addRoundRect$default(Path, Strings.RoundRect(m1180Recttz77jQw.left, m1180Recttz77jQw.top, m1180Recttz77jQw.right, m1180Recttz77jQw.bottom, Float.intBitsToFloat((int) (floatToRawIntBits2 >> 32)), Float.intBitsToFloat((int) (floatToRawIntBits2 & BodyPartID.bodyIdMax))));
                Path.moveTo((Float.intBitsToFloat(i2) / 2.0f) - mo236toPx0680j_4, Float.intBitsToFloat(i3) - mo236toPx0680j_4);
                Path.lineTo(Float.intBitsToFloat(i2) / 2.0f, Float.intBitsToFloat(i3));
                Path.lineTo((Float.intBitsToFloat(i2) / 2.0f) + mo236toPx0680j_4, Float.intBitsToFloat(i3) - mo236toPx0680j_4);
                Path.close();
                return new Outline$Generic(Path);
            default:
                AndroidPath Path2 = AndroidPath_androidKt.Path();
                Path2.moveTo(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE);
                float intBitsToFloat3 = Float.intBitsToFloat((int) (j >> 32));
                int i4 = (int) (j & BodyPartID.bodyIdMax);
                Path2.lineTo(intBitsToFloat3, Float.intBitsToFloat(i4) / 2.0f);
                Path2.lineTo(RecyclerView.DECELERATION_RATE, Float.intBitsToFloat(i4));
                Path2.close();
                return new Outline$Generic(Path2);
        }
    }
}
