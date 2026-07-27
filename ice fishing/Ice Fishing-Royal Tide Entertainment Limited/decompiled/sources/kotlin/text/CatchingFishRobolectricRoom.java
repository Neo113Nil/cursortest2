package kotlin.text;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* loaded from: classes.dex */
public abstract class CatchingFishRobolectricRoom {
    public static final LinearInterpolator CatchingFishParcelableFAB = new LinearInterpolator();
    public static final CatchingFishLayoutRetrofit CatchingFishSnackbar = new CatchingFishLayoutRetrofit(CatchingFishLayoutRetrofit.CatchingFishReduxKtor);
    public static final CatchingFishLayoutRetrofit CatchingFishCoroutine = new CatchingFishLayoutRetrofit();
    public static final CatchingFishLayoutRetrofit CatchingFishReduxKtor = new CatchingFishLayoutRetrofit(CatchingFishLayoutRetrofit.CatchingFishDaggerWebsocket);

    static {
        new DecelerateInterpolator();
    }

    public static int CatchingFishCoroutine(float f, int i, int i2) {
        return Math.round(f * (i2 - i)) + i;
    }

    public static float CatchingFishParcelableFAB(float f, float f2, float f3) {
        return ((f2 - f) * f3) + f;
    }

    public static float CatchingFishSnackbar(float f, float f2, float f3, float f4, float f5) {
        return f5 <= f3 ? f : f5 >= f4 ? f2 : CatchingFishParcelableFAB(f, f2, (f5 - f3) / (f4 - f3));
    }
}
