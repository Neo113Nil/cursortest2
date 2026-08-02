package com.squareup.cash.graphics.backend.math;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes6.dex */
public final class Vector3 {
    public final float x;
    public final float y;
    public final float z;
    public static final Vector3 ZERO = new Vector3(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE);
    public static final Vector3 ONE = new Vector3(1.0f, 1.0f, 1.0f);

    public Vector3(float f, float f2, float f3) {
        this.x = f;
        this.y = f2;
        this.z = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Vector3)) {
            return false;
        }
        Vector3 vector3 = (Vector3) obj;
        return Float.compare(this.x, vector3.x) == 0 && Float.compare(this.y, vector3.y) == 0 && Float.compare(this.z, vector3.z) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.z) + CameraState$Type$EnumUnboxingLocalUtility.m(this.y, Float.hashCode(this.x) * 31, 31);
    }

    public final String toString() {
        return Recorder$$ExternalSyntheticOutline1.m(this.z, ")", JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Vector3(x=", this.x, ", y=", this.y, ", z="));
    }
}
