package androidx.compose.foundation.layout;

import kotlin.text.CatchingFishBundleAnimation;
import kotlin.text.CatchingFishHiltWorkManager;

/* loaded from: classes.dex */
public abstract class CatchingFishViewPagerToast {
    public static final FillElement CatchingFishParcelableFAB = new FillElement(2);
    public static final FillElement CatchingFishSnackbar = new FillElement(3);

    public static final CatchingFishBundleAnimation CatchingFishCoroutine(CatchingFishBundleAnimation catchingFishBundleAnimation, float f, float f2) {
        return catchingFishBundleAnimation.CatchingFishCoroutine(new SizeElement(f, f2, f, f2));
    }

    public static CatchingFishBundleAnimation CatchingFishParcelableFAB(CatchingFishBundleAnimation catchingFishBundleAnimation, float f) {
        float f2 = 0;
        PaddingElement paddingElement = new PaddingElement();
        paddingElement.CatchingFishParcelableFAB = f2;
        paddingElement.CatchingFishSnackbar = f;
        paddingElement.CatchingFishCoroutine = f2;
        paddingElement.CatchingFishReduxKtor = f;
        paddingElement.CatchingFishDaggerWebsocket = true;
        if ((f2 >= 0.0f || CatchingFishHiltWorkManager.CatchingFishParcelableFAB(f2, Float.NaN)) && ((f >= 0.0f || CatchingFishHiltWorkManager.CatchingFishParcelableFAB(f, Float.NaN)) && ((f2 >= 0.0f || CatchingFishHiltWorkManager.CatchingFishParcelableFAB(f2, Float.NaN)) && (f >= 0.0f || CatchingFishHiltWorkManager.CatchingFishParcelableFAB(f, Float.NaN))))) {
            return catchingFishBundleAnimation.CatchingFishCoroutine(paddingElement);
        }
        throw new IllegalArgumentException("Padding must be non-negative");
    }

    public static final CatchingFishBundleAnimation CatchingFishSnackbar(float f) {
        return new SizeElement(f, f, f, f);
    }
}
