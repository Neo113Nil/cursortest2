package kotlin.text;

import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public abstract class CatchingFishManifestContext implements Interpolator {
    public final float[] CatchingFishParcelableFAB;
    public final float CatchingFishSnackbar;

    public CatchingFishManifestContext(float[] fArr) {
        this.CatchingFishParcelableFAB = fArr;
        this.CatchingFishSnackbar = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        if (f >= 1.0f) {
            return 1.0f;
        }
        if (f <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.CatchingFishParcelableFAB;
        int min = Math.min((int) ((fArr.length - 1) * f), fArr.length - 2);
        float f2 = this.CatchingFishSnackbar;
        float f3 = (f - (min * f2)) / f2;
        float f4 = fArr[min];
        return ((fArr[min + 1] - f4) * f3) + f4;
    }
}
