package com.squareup.cash.securitysignals.models;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes6.dex */
public final class Pointer {
    public final float orientation;
    public final float pressure;
    public final float size;
    public final float toolMajor;
    public final float toolMinor;
    public final int toolType;
    public final float touchMajor;
    public final float touchMinor;
    public final float x;
    public final float y;

    public Pointer(float f, float f2, float f3, float f4, int i, float f5, float f6, float f7, float f8, float f9) {
        this.x = f;
        this.y = f2;
        this.pressure = f3;
        this.size = f4;
        this.toolType = i;
        this.touchMajor = f5;
        this.touchMinor = f6;
        this.toolMajor = f7;
        this.toolMinor = f8;
        this.orientation = f9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Pointer)) {
            return false;
        }
        Pointer pointer = (Pointer) obj;
        return Float.compare(this.x, pointer.x) == 0 && Float.compare(this.y, pointer.y) == 0 && Float.compare(this.pressure, pointer.pressure) == 0 && Float.compare(this.size, pointer.size) == 0 && this.toolType == pointer.toolType && Float.compare(this.touchMajor, pointer.touchMajor) == 0 && Float.compare(this.touchMinor, pointer.touchMinor) == 0 && Float.compare(this.toolMajor, pointer.toolMajor) == 0 && Float.compare(this.toolMinor, pointer.toolMinor) == 0 && Float.compare(this.orientation, pointer.orientation) == 0;
    }

    public final float getOrientation() {
        return this.orientation;
    }

    public final float getPressure() {
        return this.pressure;
    }

    public final float getSize() {
        return this.size;
    }

    public final float getToolMajor() {
        return this.toolMajor;
    }

    public final float getToolMinor() {
        return this.toolMinor;
    }

    public final int getToolType() {
        return this.toolType;
    }

    public final float getTouchMajor() {
        return this.touchMajor;
    }

    public final float getTouchMinor() {
        return this.touchMinor;
    }

    public final float getX() {
        return this.x;
    }

    public final float getY() {
        return this.y;
    }

    public final int hashCode() {
        return Float.hashCode(this.orientation) + CameraState$Type$EnumUnboxingLocalUtility.m(this.toolMinor, CameraState$Type$EnumUnboxingLocalUtility.m(this.toolMajor, CameraState$Type$EnumUnboxingLocalUtility.m(this.touchMinor, CameraState$Type$EnumUnboxingLocalUtility.m(this.touchMajor, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.toolType, CameraState$Type$EnumUnboxingLocalUtility.m(this.size, CameraState$Type$EnumUnboxingLocalUtility.m(this.pressure, CameraState$Type$EnumUnboxingLocalUtility.m(this.y, Float.hashCode(this.x) * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Pointer(x=", this.x, ", y=", this.y, ", pressure=");
        Request$Priority$EnumUnboxingLocalUtility.m(m, this.pressure, ", size=", this.size, ", toolType=");
        m.append(this.toolType);
        m.append(", touchMajor=");
        m.append(this.touchMajor);
        m.append(", touchMinor=");
        Request$Priority$EnumUnboxingLocalUtility.m(m, this.touchMinor, ", toolMajor=", this.toolMajor, ", toolMinor=");
        m.append(this.toolMinor);
        m.append(", orientation=");
        m.append(this.orientation);
        m.append(")");
        return m.toString();
    }
}
