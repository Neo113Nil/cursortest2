package androidx.compose.ui.graphics;

import android.graphics.ColorMatrix;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class ColorMatrixColorFilter extends ColorFilter {
    public float[] colorMatrix;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ColorMatrixColorFilter) && Arrays.equals(m696obtainColorMatrixp10uLo(), ((ColorMatrixColorFilter) obj).m696obtainColorMatrixp10uLo());
    }

    public final int hashCode() {
        float[] fArr = this.colorMatrix;
        if (fArr != null) {
            return Arrays.hashCode(fArr);
        }
        return 0;
    }

    /* renamed from: obtainColorMatrix-p10-uLo, reason: not valid java name */
    public final float[] m696obtainColorMatrixp10uLo() {
        float[] fArr = this.colorMatrix;
        if (fArr != null) {
            return fArr;
        }
        android.graphics.ColorFilter colorFilter = this.nativeColorFilter;
        if (!(colorFilter instanceof android.graphics.ColorMatrixColorFilter)) {
            a$$ExternalSyntheticBUOutline0.m$3("Unable to obtain ColorMatrix from Android ColorMatrixColorFilter. This method was invoked on an unsupported Android version");
            return null;
        }
        ColorMatrix colorMatrix = new ColorMatrix();
        ((android.graphics.ColorMatrixColorFilter) colorFilter).getColorMatrix(colorMatrix);
        float[] array2 = colorMatrix.getArray();
        this.colorMatrix = array2;
        return array2;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ColorMatrixColorFilter(colorMatrix=");
        float[] fArr = this.colorMatrix;
        if (fArr == null) {
            str = "null";
        } else {
            str = "ColorMatrix(values=" + Arrays.toString(fArr) + ')';
        }
        sb.append((Object) str);
        sb.append(')');
        return sb.toString();
    }
}
