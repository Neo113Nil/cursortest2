package androidx.compose.ui.graphics;

import kotlin.text.CatchingFishBundleAnimation;
import kotlin.text.CatchingFishFABView;
import kotlin.text.CatchingFishMockkKtor;

/* loaded from: classes.dex */
public abstract class CatchingFishPagingLibrary {
    public static CatchingFishBundleAnimation CatchingFishParcelableFAB(CatchingFishBundleAnimation catchingFishBundleAnimation, float f, int i) {
        if ((i & 256) != 0) {
            f = 0.0f;
        }
        float f2 = f;
        long j = CatchingFishFABView.CatchingFishParcelableFAB;
        boolean z = (i & 4096) == 0;
        long j2 = CatchingFishMockkKtor.CatchingFishParcelableFAB;
        return catchingFishBundleAnimation.CatchingFishCoroutine(new GraphicsLayerElement(f2, j, z, j2, j2));
    }
}
