package androidx.compose.ui;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.recyclerview.widget.RecyclerView;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes3.dex */
public final class BiasAbsoluteAlignment implements Alignment {
    public final float horizontalBias;

    public final class Horizontal implements Alignment.Horizontal {
        public final float bias;

        public Horizontal(float f) {
            this.bias = f;
        }

        @Override // androidx.compose.ui.Alignment.Horizontal
        public final int align(int i, int i2, LayoutDirection layoutDirection) {
            return Math.round((1.0f + this.bias) * ((i2 - i) / 2.0f));
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

    public BiasAbsoluteAlignment(float f) {
        this.horizontalBias = f;
    }

    @Override // androidx.compose.ui.Alignment
    /* renamed from: align-KFBX0sM */
    public final long mo584alignKFBX0sM(long j, long j2, LayoutDirection layoutDirection) {
        long j3 = ((((int) (j2 >> 32)) - ((int) (j >> 32))) << 32) | ((((int) (j2 & BodyPartID.bodyIdMax)) - ((int) (j & BodyPartID.bodyIdMax))) & BodyPartID.bodyIdMax);
        float f = ((int) (j3 >> 32)) / 2.0f;
        float f2 = (1.0f + this.horizontalBias) * f;
        float f3 = (((int) (j3 & BodyPartID.bodyIdMax)) / 2.0f) * RecyclerView.DECELERATION_RATE;
        return (Math.round(f3) & BodyPartID.bodyIdMax) | (Math.round(f2) << 32);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BiasAbsoluteAlignment) && Float.compare(this.horizontalBias, ((BiasAbsoluteAlignment) obj).horizontalBias) == 0 && Float.compare(-1.0f, -1.0f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(-1.0f) + (Float.hashCode(this.horizontalBias) * 31);
    }

    public final String toString() {
        return Recorder$$ExternalSyntheticOutline1.m(this.horizontalBias, ", verticalBias=-1.0)", new StringBuilder("BiasAbsoluteAlignment(horizontalBias="));
    }
}
