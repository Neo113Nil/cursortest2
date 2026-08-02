package com.squareup.cash.graphics.swampgl.components;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes6.dex */
public final class AABB {
    public final float maxX;
    public final float maxY;
    public final float maxZ;
    public final float minX;
    public final float minY;
    public final float minZ;

    public AABB(float f, float f2, float f3, float f4, float f5, float f6) {
        this.minX = f;
        this.minY = f2;
        this.minZ = f3;
        this.maxX = f4;
        this.maxY = f5;
        this.maxZ = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AABB)) {
            return false;
        }
        AABB aabb = (AABB) obj;
        return Float.compare(this.minX, aabb.minX) == 0 && Float.compare(this.minY, aabb.minY) == 0 && Float.compare(this.minZ, aabb.minZ) == 0 && Float.compare(this.maxX, aabb.maxX) == 0 && Float.compare(this.maxY, aabb.maxY) == 0 && Float.compare(this.maxZ, aabb.maxZ) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.maxZ) + CameraState$Type$EnumUnboxingLocalUtility.m(this.maxY, CameraState$Type$EnumUnboxingLocalUtility.m(this.maxX, CameraState$Type$EnumUnboxingLocalUtility.m(this.minZ, CameraState$Type$EnumUnboxingLocalUtility.m(this.minY, Float.hashCode(this.minX) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("AABB(minX=", this.minX, ", minY=", this.minY, ", minZ=");
        Request$Priority$EnumUnboxingLocalUtility.m(m, this.minZ, ", maxX=", this.maxX, ", maxY=");
        m.append(this.maxY);
        m.append(", maxZ=");
        m.append(this.maxZ);
        m.append(")");
        return m.toString();
    }
}
