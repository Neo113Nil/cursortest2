package androidx.compose.ui.layout;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class FixedScale implements ContentScale {
    public final float value;

    public FixedScale(float f) {
        this.value = f;
    }

    @Override // androidx.compose.ui.layout.ContentScale
    /* renamed from: computeScaleFactor-H7hwNQA */
    public final long mo832computeScaleFactorH7hwNQA(long j, long j2) {
        float f = this.value;
        long floatToRawIntBits = (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f) & BodyPartID.bodyIdMax);
        int i = ScaleFactor.$r8$clinit;
        return floatToRawIntBits;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FixedScale) && Float.compare(this.value, ((FixedScale) obj).value) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.value);
    }

    public final String toString() {
        return CameraState$Type$EnumUnboxingLocalUtility.m(new StringBuilder("FixedScale(value="), this.value, ')');
    }
}
