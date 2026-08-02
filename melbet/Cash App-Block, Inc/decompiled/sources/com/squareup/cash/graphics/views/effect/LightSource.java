package com.squareup.cash.graphics.views.effect;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes6.dex */
public final class LightSource {
    public static final LightSource Default = new LightSource(1.5707964f, 1.5707964f, 0);
    public final long timestamp;
    public final float x;
    public final float xAngle;
    public final float y;
    public final float yAngle;

    public LightSource(float f, float f2, long j) {
        this.xAngle = f;
        this.yAngle = f2;
        this.timestamp = j;
        double d = f2;
        double d2 = f;
        float sqrt = (float) Math.sqrt((((float) Math.pow((float) Math.cos(d), 2.0d)) * ((float) Math.pow((float) Math.sin(d2), 2.0d))) + ((float) Math.pow((float) Math.sin(d), 2.0d)));
        this.x = (((float) Math.cos(d2)) * ((float) Math.sin(d))) / sqrt;
        this.y = (((float) Math.sin(d2)) * ((float) Math.cos(d))) / sqrt;
        Math.sin(d2);
        Math.sin(d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LightSource)) {
            return false;
        }
        LightSource lightSource = (LightSource) obj;
        return Float.compare(this.xAngle, lightSource.xAngle) == 0 && Float.compare(this.yAngle, lightSource.yAngle) == 0 && this.timestamp == lightSource.timestamp;
    }

    public final int hashCode() {
        return Long.hashCode(this.timestamp) + CameraState$Type$EnumUnboxingLocalUtility.m(this.yAngle, Float.hashCode(this.xAngle) * 31, 31);
    }

    public final String toString() {
        return CameraState$Type$EnumUnboxingLocalUtility.m(this.timestamp, ")", JsonLogicResult$Success$$ExternalSyntheticOutline0.m("LightSource(xAngle=", this.xAngle, ", yAngle=", this.yAngle, ", timestamp="));
    }
}
