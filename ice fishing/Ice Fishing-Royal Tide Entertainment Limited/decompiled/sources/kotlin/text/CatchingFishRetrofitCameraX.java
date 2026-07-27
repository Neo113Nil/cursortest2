package kotlin.text;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class CatchingFishRetrofitCameraX implements CatchingFishCameraXGradle {
    public final CatchingFishCameraXGradle CatchingFishParcelableFAB;
    public final float CatchingFishSnackbar;

    public CatchingFishRetrofitCameraX(float f, CatchingFishCameraXGradle catchingFishCameraXGradle) {
        while (catchingFishCameraXGradle instanceof CatchingFishRetrofitCameraX) {
            catchingFishCameraXGradle = ((CatchingFishRetrofitCameraX) catchingFishCameraXGradle).CatchingFishParcelableFAB;
            f += ((CatchingFishRetrofitCameraX) catchingFishCameraXGradle).CatchingFishSnackbar;
        }
        this.CatchingFishParcelableFAB = catchingFishCameraXGradle;
        this.CatchingFishSnackbar = f;
    }

    @Override // kotlin.text.CatchingFishCameraXGradle
    public final float CatchingFishParcelableFAB(RectF rectF) {
        return Math.max(0.0f, this.CatchingFishParcelableFAB.CatchingFishParcelableFAB(rectF) + this.CatchingFishSnackbar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatchingFishRetrofitCameraX)) {
            return false;
        }
        CatchingFishRetrofitCameraX catchingFishRetrofitCameraX = (CatchingFishRetrofitCameraX) obj;
        return this.CatchingFishParcelableFAB.equals(catchingFishRetrofitCameraX.CatchingFishParcelableFAB) && this.CatchingFishSnackbar == catchingFishRetrofitCameraX.CatchingFishSnackbar;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.CatchingFishParcelableFAB, Float.valueOf(this.CatchingFishSnackbar)});
    }
}
