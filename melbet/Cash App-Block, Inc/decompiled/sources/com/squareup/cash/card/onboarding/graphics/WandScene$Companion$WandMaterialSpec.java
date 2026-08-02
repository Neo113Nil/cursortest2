package com.squareup.cash.card.onboarding.graphics;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;

/* loaded from: classes6.dex */
public final class WandScene$Companion$WandMaterialSpec {
    public final int baseColor;
    public final float metallic;
    public final float roughness;

    public WandScene$Companion$WandMaterialSpec(float f, float f2, int i) {
        this.baseColor = i;
        this.roughness = f;
        this.metallic = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WandScene$Companion$WandMaterialSpec)) {
            return false;
        }
        WandScene$Companion$WandMaterialSpec wandScene$Companion$WandMaterialSpec = (WandScene$Companion$WandMaterialSpec) obj;
        return this.baseColor == wandScene$Companion$WandMaterialSpec.baseColor && Float.compare(this.roughness, wandScene$Companion$WandMaterialSpec.roughness) == 0 && Float.compare(this.metallic, wandScene$Companion$WandMaterialSpec.metallic) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.metallic) + CameraState$Type$EnumUnboxingLocalUtility.m(this.roughness, Integer.hashCode(this.baseColor) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WandMaterialSpec(baseColor=");
        sb.append(this.baseColor);
        sb.append(", roughness=");
        sb.append(this.roughness);
        sb.append(", metallic=");
        return Recorder$$ExternalSyntheticOutline1.m(this.metallic, ")", sb);
    }
}
