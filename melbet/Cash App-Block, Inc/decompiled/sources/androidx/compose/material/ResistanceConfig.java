package androidx.compose.material;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;

/* loaded from: classes3.dex */
public final class ResistanceConfig {
    public final float basis;
    public final float factorAtMax;
    public final float factorAtMin;

    public ResistanceConfig(float f, float f2, float f3) {
        this.basis = f;
        this.factorAtMin = f2;
        this.factorAtMax = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResistanceConfig)) {
            return false;
        }
        ResistanceConfig resistanceConfig = (ResistanceConfig) obj;
        return this.basis == resistanceConfig.basis && this.factorAtMin == resistanceConfig.factorAtMin && this.factorAtMax == resistanceConfig.factorAtMax;
    }

    public final int hashCode() {
        return Float.hashCode(this.factorAtMax) + CameraState$Type$EnumUnboxingLocalUtility.m(this.factorAtMin, Float.hashCode(this.basis) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ResistanceConfig(basis=");
        sb.append(this.basis);
        sb.append(", factorAtMin=");
        sb.append(this.factorAtMin);
        sb.append(", factorAtMax=");
        return CameraState$Type$EnumUnboxingLocalUtility.m(sb, this.factorAtMax, ')');
    }
}
