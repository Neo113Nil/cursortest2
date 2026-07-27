package androidx.compose.ui.draw;

import kotlin.text.CatchingFishAdMobLayout;
import kotlin.text.CatchingFishBundleAnimation;
import kotlin.text.CatchingFishCameraXContext;
import kotlin.text.CatchingFishServiceHandler;

/* loaded from: classes.dex */
public abstract class CatchingFishPagingLibrary {
    public static final CatchingFishBundleAnimation CatchingFishParcelableFAB(CatchingFishBundleAnimation catchingFishBundleAnimation, CatchingFishServiceHandler catchingFishServiceHandler) {
        return catchingFishBundleAnimation.CatchingFishCoroutine(new DrawBehindElement(catchingFishServiceHandler));
    }

    public static CatchingFishBundleAnimation CatchingFishSnackbar(CatchingFishBundleAnimation catchingFishBundleAnimation, CatchingFishCameraXContext catchingFishCameraXContext, CatchingFishAdMobLayout catchingFishAdMobLayout, float f) {
        return catchingFishBundleAnimation.CatchingFishCoroutine(new PainterElement(catchingFishCameraXContext, catchingFishAdMobLayout, f));
    }
}
