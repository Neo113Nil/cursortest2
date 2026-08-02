package androidx.compose.ui.unit.fontscaling;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.dynamite.zzf;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class FontScaleConverterTable implements FontScaleConverter {
    public final float[] mFromSpValues;
    public final float[] mToDpValues;

    public FontScaleConverterTable(float[] fArr, float[] fArr2) {
        if (fArr.length != fArr2.length || fArr.length == 0) {
            a$$ExternalSyntheticBUOutline0.m$3("Array lengths must match and be nonzero");
            throw null;
        }
        this.mFromSpValues = fArr;
        this.mToDpValues = fArr2;
    }

    @Override // androidx.compose.ui.unit.fontscaling.FontScaleConverter
    public final float convertDpToSp(float f) {
        return zzf.access$lookupAndInterpolate(f, this.mToDpValues, this.mFromSpValues);
    }

    @Override // androidx.compose.ui.unit.fontscaling.FontScaleConverter
    public final float convertSpToDp(float f) {
        return zzf.access$lookupAndInterpolate(f, this.mFromSpValues, this.mToDpValues);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof FontScaleConverterTable)) {
            return false;
        }
        FontScaleConverterTable fontScaleConverterTable = (FontScaleConverterTable) obj;
        return Arrays.equals(this.mFromSpValues, fontScaleConverterTable.mFromSpValues) && Arrays.equals(this.mToDpValues, fontScaleConverterTable.mToDpValues);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.mToDpValues) + (Arrays.hashCode(this.mFromSpValues) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FontScaleConverter{fromSpValues=");
        String arrays = Arrays.toString(this.mFromSpValues);
        arrays.getClass();
        sb.append(arrays);
        sb.append(", toDpValues=");
        String arrays2 = Arrays.toString(this.mToDpValues);
        arrays2.getClass();
        sb.append(arrays2);
        sb.append('}');
        return sb.toString();
    }
}
