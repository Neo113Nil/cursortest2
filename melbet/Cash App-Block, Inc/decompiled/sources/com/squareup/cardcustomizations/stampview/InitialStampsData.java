package com.squareup.cardcustomizations.stampview;

import android.graphics.PointF;

/* loaded from: classes6.dex */
public final class InitialStampsData {
    public final float customizationHeight;
    public final float customizationWidth;
    public final Stamp stamp;
    public final PointF stampCenter;
    public final float stampHeight;
    public final float stampMinSize;
    public final float stampRotation;
    public final float stampWidth;

    public InitialStampsData(float f, float f2, Stamp stamp, float f3, float f4, PointF pointF, float f5, float f6) {
        this.customizationWidth = f;
        this.customizationHeight = f2;
        this.stamp = stamp;
        this.stampWidth = f3;
        this.stampHeight = f4;
        this.stampCenter = pointF;
        this.stampRotation = f5;
        this.stampMinSize = f6;
    }
}
