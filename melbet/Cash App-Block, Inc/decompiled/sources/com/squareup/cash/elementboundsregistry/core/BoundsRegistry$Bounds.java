package com.squareup.cash.elementboundsregistry.core;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes6.dex */
public final class BoundsRegistry$Bounds {
    public final float bottom;
    public final float left;
    public final float right;
    public final float top;

    public BoundsRegistry$Bounds(float f, float f2, float f3, float f4) {
        this.left = f;
        this.top = f2;
        this.right = f3;
        this.bottom = f4;
    }

    public final boolean contains(float f, float f2) {
        return this.left <= f && f < this.right && this.top <= f2 && f2 < this.bottom;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BoundsRegistry$Bounds)) {
            return false;
        }
        BoundsRegistry$Bounds boundsRegistry$Bounds = (BoundsRegistry$Bounds) obj;
        return Float.compare(this.left, boundsRegistry$Bounds.left) == 0 && Float.compare(this.top, boundsRegistry$Bounds.top) == 0 && Float.compare(this.right, boundsRegistry$Bounds.right) == 0 && Float.compare(this.bottom, boundsRegistry$Bounds.bottom) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.bottom) + CameraState$Type$EnumUnboxingLocalUtility.m(this.right, CameraState$Type$EnumUnboxingLocalUtility.m(this.top, Float.hashCode(this.left) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Bounds(left=", this.left, ", top=", this.top, ", right=");
        m.append(this.right);
        m.append(", bottom=");
        m.append(this.bottom);
        m.append(")");
        return m.toString();
    }
}
