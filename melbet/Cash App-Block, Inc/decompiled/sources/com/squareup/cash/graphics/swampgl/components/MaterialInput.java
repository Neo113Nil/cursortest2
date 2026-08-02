package com.squareup.cash.graphics.swampgl.components;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.recyclerview.widget.RecyclerView;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes6.dex */
public final class MaterialInput {
    public int baseColor;
    public float clearCoat;
    public float clearCoatRoughness;
    public float crossfadeMultiplier;
    public float dimmer;
    public float metallic;
    public float opacity;
    public float roughness;
    public float saturation;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MaterialInput)) {
            return false;
        }
        MaterialInput materialInput = (MaterialInput) obj;
        return this.baseColor == materialInput.baseColor && Float.compare(this.opacity, materialInput.opacity) == 0 && Float.compare(this.roughness, materialInput.roughness) == 0 && Float.compare(this.metallic, materialInput.metallic) == 0 && Float.compare(this.clearCoat, materialInput.clearCoat) == 0 && Float.compare(this.clearCoatRoughness, materialInput.clearCoatRoughness) == 0 && Float.compare(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == 0 && Float.compare(this.dimmer, materialInput.dimmer) == 0 && Float.compare(this.saturation, materialInput.saturation) == 0 && Float.compare(this.crossfadeMultiplier, materialInput.crossfadeMultiplier) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.crossfadeMultiplier) + CameraState$Type$EnumUnboxingLocalUtility.m(this.saturation, CameraState$Type$EnumUnboxingLocalUtility.m(this.dimmer, CameraState$Type$EnumUnboxingLocalUtility.m(RecyclerView.DECELERATION_RATE, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(-16777216, CameraState$Type$EnumUnboxingLocalUtility.m(this.clearCoatRoughness, CameraState$Type$EnumUnboxingLocalUtility.m(this.clearCoat, CameraState$Type$EnumUnboxingLocalUtility.m(this.metallic, CameraState$Type$EnumUnboxingLocalUtility.m(this.roughness, CameraState$Type$EnumUnboxingLocalUtility.m(this.opacity, Integer.hashCode(this.baseColor) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        int i = this.baseColor;
        float f = this.opacity;
        float f2 = this.roughness;
        float f3 = this.metallic;
        float f4 = this.clearCoat;
        float f5 = this.clearCoatRoughness;
        float f6 = this.dimmer;
        float f7 = this.saturation;
        float f8 = this.crossfadeMultiplier;
        StringBuilder sb = new StringBuilder("MaterialInput(baseColor=");
        sb.append(i);
        sb.append(", opacity=");
        sb.append(f);
        sb.append(", roughness=");
        Request$Priority$EnumUnboxingLocalUtility.m(sb, f2, ", metallic=", f3, ", clearCoat=");
        Request$Priority$EnumUnboxingLocalUtility.m(sb, f4, ", clearCoatRoughness=", f5, ", emissive=-16777216, diffuseIBL=0.0, dimmer=");
        Request$Priority$EnumUnboxingLocalUtility.m(sb, f6, ", saturation=", f7, ", crossfadeMultiplier=");
        return Recorder$$ExternalSyntheticOutline1.m(f8, ")", sb);
    }
}
