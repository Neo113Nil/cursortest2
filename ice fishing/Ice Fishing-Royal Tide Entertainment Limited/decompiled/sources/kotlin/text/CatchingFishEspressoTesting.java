package kotlin.text;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class CatchingFishEspressoTesting implements CatchingFishCameraXGradle {
    public final float CatchingFishParcelableFAB;

    public CatchingFishEspressoTesting(float f) {
        this.CatchingFishParcelableFAB = f;
    }

    @Override // kotlin.text.CatchingFishCameraXGradle
    public final float CatchingFishParcelableFAB(RectF rectF) {
        return this.CatchingFishParcelableFAB;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CatchingFishEspressoTesting) && this.CatchingFishParcelableFAB == ((CatchingFishEspressoTesting) obj).CatchingFishParcelableFAB;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.CatchingFishParcelableFAB)});
    }

    public final String toString() {
        return this.CatchingFishParcelableFAB + "px";
    }
}
