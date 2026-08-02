package com.squareup.cash.card.onboarding.graphics;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;

/* loaded from: classes6.dex */
public final class HeartScene$Companion$HeartMaterialSpec {
    public final int baseColor;
    public final float metallic;
    public final float roughness;

    public HeartScene$Companion$HeartMaterialSpec(float f, float f2, int i) {
        this.baseColor = i;
        this.roughness = f;
        this.metallic = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HeartScene$Companion$HeartMaterialSpec)) {
            return false;
        }
        HeartScene$Companion$HeartMaterialSpec heartScene$Companion$HeartMaterialSpec = (HeartScene$Companion$HeartMaterialSpec) obj;
        return this.baseColor == heartScene$Companion$HeartMaterialSpec.baseColor && Float.compare(this.roughness, heartScene$Companion$HeartMaterialSpec.roughness) == 0 && Float.compare(this.metallic, heartScene$Companion$HeartMaterialSpec.metallic) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.metallic) + CameraState$Type$EnumUnboxingLocalUtility.m(this.roughness, Integer.hashCode(this.baseColor) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HeartMaterialSpec(baseColor=");
        sb.append(this.baseColor);
        sb.append(", roughness=");
        sb.append(this.roughness);
        sb.append(", metallic=");
        return Recorder$$ExternalSyntheticOutline1.m(this.metallic, ")", sb);
    }
}
