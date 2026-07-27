package kotlin.text;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class CatchingFishGsonRobolectric implements CatchingFishCameraXGradle {
    public final float CatchingFishParcelableFAB;

    public CatchingFishGsonRobolectric(float f) {
        this.CatchingFishParcelableFAB = f;
    }

    @Override // kotlin.text.CatchingFishCameraXGradle
    public final float CatchingFishParcelableFAB(RectF rectF) {
        return Math.min(rectF.width(), rectF.height()) * this.CatchingFishParcelableFAB;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CatchingFishGsonRobolectric) && this.CatchingFishParcelableFAB == ((CatchingFishGsonRobolectric) obj).CatchingFishParcelableFAB;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.CatchingFishParcelableFAB)});
    }

    public final String toString() {
        return ((int) (this.CatchingFishParcelableFAB * 100.0f)) + "%";
    }
}
