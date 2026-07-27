package androidx.compose.ui.input.nestedscroll;

import kotlin.text.CatchingFishBundleAnimation;
import kotlin.text.CatchingFishFABBundleView;

/* loaded from: classes.dex */
public abstract class CatchingFishPagingLibrary {
    public static final CatchingFishBundleAnimation CatchingFishParcelableFAB(CatchingFishFABBundleView catchingFishFABBundleView) {
        return new NestedScrollElement(catchingFishFABBundleView);
    }
}
