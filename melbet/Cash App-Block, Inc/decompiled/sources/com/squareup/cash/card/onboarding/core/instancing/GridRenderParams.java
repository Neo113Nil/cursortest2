package com.squareup.cash.card.onboarding.core.instancing;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes6.dex */
public final class GridRenderParams {
    public final float cameraZ;
    public final float miniCardScaleMultiplier;
    public final float nonCanonicalOpacity;
    public final float staggerAmount;
    public final float stepX;
    public final float stepY;

    public GridRenderParams(float f, float f2, float f3, float f4, float f5, float f6) {
        this.stepX = f;
        this.stepY = f2;
        this.staggerAmount = f3;
        this.nonCanonicalOpacity = f4;
        this.cameraZ = f5;
        this.miniCardScaleMultiplier = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GridRenderParams)) {
            return false;
        }
        GridRenderParams gridRenderParams = (GridRenderParams) obj;
        return Float.compare(this.stepX, gridRenderParams.stepX) == 0 && Float.compare(this.stepY, gridRenderParams.stepY) == 0 && Float.compare(this.staggerAmount, gridRenderParams.staggerAmount) == 0 && Float.compare(this.nonCanonicalOpacity, gridRenderParams.nonCanonicalOpacity) == 0 && Float.compare(this.cameraZ, gridRenderParams.cameraZ) == 0 && Float.compare(this.miniCardScaleMultiplier, gridRenderParams.miniCardScaleMultiplier) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.miniCardScaleMultiplier) + CameraState$Type$EnumUnboxingLocalUtility.m(this.cameraZ, CameraState$Type$EnumUnboxingLocalUtility.m(this.nonCanonicalOpacity, CameraState$Type$EnumUnboxingLocalUtility.m(this.staggerAmount, CameraState$Type$EnumUnboxingLocalUtility.m(this.stepY, Float.hashCode(this.stepX) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("GridRenderParams(stepX=", this.stepX, ", stepY=", this.stepY, ", staggerAmount=");
        Request$Priority$EnumUnboxingLocalUtility.m(m, this.staggerAmount, ", nonCanonicalOpacity=", this.nonCanonicalOpacity, ", cameraZ=");
        m.append(this.cameraZ);
        m.append(", miniCardScaleMultiplier=");
        m.append(this.miniCardScaleMultiplier);
        m.append(")");
        return m.toString();
    }
}
