package com.squareup.cash.mooncake.compose_ui.components;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Dp;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.ULong;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class ShadowConfig {
    public final float alpha;
    public final float blurRadius;
    public final long color;
    public final Shape shape;
    public final float yOffset;

    public ShadowConfig(Shape shape, float f, float f2, float f3) {
        long j = Color.Black;
        shape.getClass();
        this.shape = shape;
        this.yOffset = f;
        this.blurRadius = f2;
        this.alpha = f3;
        this.color = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShadowConfig)) {
            return false;
        }
        ShadowConfig shadowConfig = (ShadowConfig) obj;
        return Intrinsics.areEqual(this.shape, shadowConfig.shape) && Dp.m1037equalsimpl0(this.yOffset, shadowConfig.yOffset) && Dp.m1037equalsimpl0(this.blurRadius, shadowConfig.blurRadius) && Float.compare(this.alpha, shadowConfig.alpha) == 0 && Color.m676equalsimpl0(this.color, shadowConfig.color);
    }

    public final int hashCode() {
        int m = CameraState$Type$EnumUnboxingLocalUtility.m(this.alpha, CameraState$Type$EnumUnboxingLocalUtility.m(this.blurRadius, CameraState$Type$EnumUnboxingLocalUtility.m(this.yOffset, this.shape.hashCode() * 31, 31), 31), 31);
        int i = Color.$r8$clinit;
        ULong.Companion companion = ULong.Companion;
        return Long.hashCode(this.color) + m;
    }

    public final String toString() {
        String m1038toStringimpl = Dp.m1038toStringimpl(this.yOffset);
        String m1038toStringimpl2 = Dp.m1038toStringimpl(this.blurRadius);
        String m682toStringimpl = Color.m682toStringimpl(this.color);
        StringBuilder sb = new StringBuilder("ShadowConfig(shape=");
        sb.append(this.shape);
        sb.append(", yOffset=");
        sb.append(m1038toStringimpl);
        sb.append(", blurRadius=");
        sb.append(m1038toStringimpl2);
        sb.append(", alpha=");
        sb.append(this.alpha);
        sb.append(", color=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, m682toStringimpl, ")");
    }
}
