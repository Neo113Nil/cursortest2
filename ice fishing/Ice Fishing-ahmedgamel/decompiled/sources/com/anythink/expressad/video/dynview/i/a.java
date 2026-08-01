package com.anythink.expressad.video.dynview.i;

import android.graphics.PointF;

/* loaded from: classes.dex */
public final class a {
    private static PointF a(float f3, PointF pointF, PointF pointF2, PointF pointF3) {
        PointF pointF4 = new PointF();
        float f9 = 1.0f - f3;
        float f10 = f9 * f9;
        float f11 = 2.0f * f3 * f9;
        float f12 = f3 * f3;
        pointF4.x = (pointF3.x * f12) + (pointF2.x * f11) + (pointF.x * f10);
        pointF4.y = (f12 * pointF3.y) + (f11 * pointF2.y) + (f10 * pointF.y);
        return pointF4;
    }

    private static PointF a(float f3, PointF pointF, PointF pointF2, PointF pointF3, PointF pointF4) {
        PointF pointF5 = new PointF();
        float f9 = 1.0f - f3;
        pointF5.x = (pointF4.x * f3 * f3 * f3) + (pointF3.x * 3.0f * f3 * f3 * f9) + (pointF2.x * 3.0f * f3 * f9 * f9) + (pointF.x * f9 * f9 * f9);
        pointF5.y = (pointF4.y * f3 * f3 * f3) + (pointF3.y * 3.0f * f3 * f3 * f9) + (pointF2.y * 3.0f * f3 * f9 * f9) + (pointF.y * f9 * f9 * f9);
        return pointF5;
    }
}
