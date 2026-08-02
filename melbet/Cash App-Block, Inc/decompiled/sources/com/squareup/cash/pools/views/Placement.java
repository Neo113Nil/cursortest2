package com.squareup.cash.pools.views;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes6.dex */
public final class Placement {
    public final float angle;
    public final float offset;
    public final float scale;

    public Placement(float f, float f2, float f3) {
        this.angle = f;
        this.offset = f2;
        this.scale = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Placement)) {
            return false;
        }
        Placement placement = (Placement) obj;
        return Float.compare(this.angle, placement.angle) == 0 && Float.compare(this.offset, placement.offset) == 0 && Float.compare(this.scale, placement.scale) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.scale) + CameraState$Type$EnumUnboxingLocalUtility.m(this.offset, Float.hashCode(this.angle) * 31, 31);
    }

    public final String toString() {
        return Recorder$$ExternalSyntheticOutline1.m(this.scale, ")", JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Placement(angle=", this.angle, ", offset=", this.offset, ", scale="));
    }
}
