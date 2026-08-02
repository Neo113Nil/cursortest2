package com.google.zxing;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;

/* loaded from: classes4.dex */
public abstract class ResultPoint {
    public final float x;
    public final float y;

    public ResultPoint(float f, float f2) {
        this.x = f;
        this.y = f2;
    }

    public static float distance(ResultPoint resultPoint, ResultPoint resultPoint2) {
        float f = resultPoint.x;
        float f2 = resultPoint.y;
        double d = f - resultPoint2.x;
        double d2 = f2 - resultPoint2.y;
        return (float) Math.sqrt((d2 * d2) + (d * d));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ResultPoint) {
            ResultPoint resultPoint = (ResultPoint) obj;
            if (this.x == resultPoint.x && this.y == resultPoint.y) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.y) + (Float.floatToIntBits(this.x) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(this.x);
        sb.append(',');
        return CameraState$Type$EnumUnboxingLocalUtility.m(sb, this.y, ')');
    }
}
