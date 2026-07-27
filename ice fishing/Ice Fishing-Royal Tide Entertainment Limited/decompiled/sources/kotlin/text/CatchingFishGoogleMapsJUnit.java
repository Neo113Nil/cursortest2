package kotlin.text;

import android.os.Build;
import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public final class CatchingFishGoogleMapsJUnit {
    public CatchingFishGlideFABHilt CatchingFishParcelableFAB;

    public CatchingFishGoogleMapsJUnit(int i, Interpolator interpolator, long j) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.CatchingFishParcelableFAB = new CatchingFishServiceService(CatchingFishCameraX.CatchingFishFragmentHandler(i, interpolator, j));
        } else {
            this.CatchingFishParcelableFAB = new CatchingFishAdMobCameraXFAB(i, interpolator, j);
        }
    }
}
