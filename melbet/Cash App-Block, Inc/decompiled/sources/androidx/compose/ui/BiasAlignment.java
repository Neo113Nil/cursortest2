package androidx.compose.ui;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.LayoutDirection;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class BiasAlignment implements Alignment {
    public final float horizontalBias;
    public final float verticalBias;

    public final class Horizontal implements Alignment.Horizontal {
        public final float bias;

        public Horizontal(float f) {
            this.bias = f;
        }

        @Override // androidx.compose.ui.Alignment.Horizontal
        public final int align(int i, int i2, LayoutDirection layoutDirection) {
            float f = (i2 - i) / 2.0f;
            LayoutDirection layoutDirection2 = LayoutDirection.Ltr;
            float f2 = this.bias;
            if (layoutDirection != layoutDirection2) {
                f2 *= -1.0f;
            }
            return Math.round((1.0f + f2) * f);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Horizontal) && Float.compare(this.bias, ((Horizontal) obj).bias) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.bias);
        }

        public final String toString() {
            return CameraState$Type$EnumUnboxingLocalUtility.m(new StringBuilder("Horizontal(bias="), this.bias, ')');
        }
    }

    public final class Vertical {
        public final float bias;

        public Vertical(float f) {
            this.bias = f;
        }

        public final int align(int i, int i2) {
            return Math.round((1.0f + this.bias) * ((i2 - i) / 2.0f));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Vertical) && Float.compare(this.bias, ((Vertical) obj).bias) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.bias);
        }

        public final String toString() {
            return CameraState$Type$EnumUnboxingLocalUtility.m(new StringBuilder("Vertical(bias="), this.bias, ')');
        }
    }

    public BiasAlignment(float f, float f2) {
        this.horizontalBias = f;
        this.verticalBias = f2;
    }

    @Override // androidx.compose.ui.Alignment
    /* renamed from: align-KFBX0sM */
    public final long mo584alignKFBX0sM(long j, long j2, LayoutDirection layoutDirection) {
        float f = (((int) (j2 >> 32)) - ((int) (j >> 32))) / 2.0f;
        float f2 = (((int) (j2 & BodyPartID.bodyIdMax)) - ((int) (j & BodyPartID.bodyIdMax))) / 2.0f;
        LayoutDirection layoutDirection2 = LayoutDirection.Ltr;
        float f3 = this.horizontalBias;
        if (layoutDirection != layoutDirection2) {
            f3 *= -1.0f;
        }
        float f4 = (1.0f + this.verticalBias) * f2;
        int round = Math.round((f3 + 1.0f) * f);
        return (Math.round(f4) & BodyPartID.bodyIdMax) | (round << 32);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BiasAlignment)) {
            return false;
        }
        BiasAlignment biasAlignment = (BiasAlignment) obj;
        return Float.compare(this.horizontalBias, biasAlignment.horizontalBias) == 0 && Float.compare(this.verticalBias, biasAlignment.verticalBias) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.verticalBias) + (Float.hashCode(this.horizontalBias) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BiasAlignment(horizontalBias=");
        sb.append(this.horizontalBias);
        sb.append(", verticalBias=");
        return CameraState$Type$EnumUnboxingLocalUtility.m(sb, this.verticalBias, ')');
    }
}
