package androidx.compose.foundation.layout;

import kotlin.text.CatchingFishAppCompatMVVM;
import kotlin.text.CatchingFishFABStripeAPIFAB;
import kotlin.text.CatchingFishGradleMVVM;
import kotlin.text.CatchingFishMVPLiveData;
import kotlin.text.CatchingFishMockkContext;
import kotlin.text.CatchingFishReduxAndroidX;

/* loaded from: classes.dex */
final class BoxChildDataElement extends CatchingFishAppCompatMVVM {
    public final boolean CatchingFishParcelableFAB;

    public BoxChildDataElement(boolean z) {
        this.CatchingFishParcelableFAB = z;
    }

    @Override // kotlin.text.CatchingFishAppCompatMVVM
    public final void CatchingFishDaggerWebsocket(CatchingFishFABStripeAPIFAB catchingFishFABStripeAPIFAB) {
        CatchingFishMockkContext catchingFishMockkContext = (CatchingFishMockkContext) catchingFishFABStripeAPIFAB;
        catchingFishMockkContext.CatchingFishNavigation = CatchingFishGradleMVVM.CatchingFishLayout;
        catchingFishMockkContext.CatchingFish = this.CatchingFishParcelableFAB;
    }

    @Override // kotlin.text.CatchingFishAppCompatMVVM
    public final CatchingFishFABStripeAPIFAB CatchingFishReduxKtor() {
        CatchingFishReduxAndroidX catchingFishReduxAndroidX = CatchingFishGradleMVVM.CatchingFishLayout;
        CatchingFishMockkContext catchingFishMockkContext = new CatchingFishMockkContext();
        catchingFishMockkContext.CatchingFishNavigation = catchingFishReduxAndroidX;
        catchingFishMockkContext.CatchingFish = this.CatchingFishParcelableFAB;
        return catchingFishMockkContext;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        BoxChildDataElement boxChildDataElement = obj instanceof BoxChildDataElement ? (BoxChildDataElement) obj : null;
        if (boxChildDataElement == null) {
            return false;
        }
        CatchingFishReduxAndroidX catchingFishReduxAndroidX = CatchingFishGradleMVVM.CatchingFishLayout;
        return catchingFishReduxAndroidX.equals(catchingFishReduxAndroidX) && this.CatchingFishParcelableFAB == boxChildDataElement.CatchingFishParcelableFAB;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.CatchingFishParcelableFAB) + CatchingFishMVPLiveData.CatchingFishWorkManager(0.0f, Float.hashCode(0.0f) * 31, 31);
    }
}
