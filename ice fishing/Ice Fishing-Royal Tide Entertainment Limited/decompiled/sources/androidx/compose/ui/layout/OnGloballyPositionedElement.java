package androidx.compose.ui.layout;

import kotlin.text.CatchingFishAppCompatMVVM;
import kotlin.text.CatchingFishCustomViewRealm;
import kotlin.text.CatchingFishDaggerCameraX;
import kotlin.text.CatchingFishFABStripeAPIFAB;

/* loaded from: classes.dex */
final class OnGloballyPositionedElement extends CatchingFishAppCompatMVVM {
    public final CatchingFishDaggerCameraX CatchingFishParcelableFAB;

    public OnGloballyPositionedElement(CatchingFishDaggerCameraX catchingFishDaggerCameraX) {
        this.CatchingFishParcelableFAB = catchingFishDaggerCameraX;
    }

    @Override // kotlin.text.CatchingFishAppCompatMVVM
    public final void CatchingFishDaggerWebsocket(CatchingFishFABStripeAPIFAB catchingFishFABStripeAPIFAB) {
        ((CatchingFishCustomViewRealm) catchingFishFABStripeAPIFAB).CatchingFishNavigation = this.CatchingFishParcelableFAB;
    }

    @Override // kotlin.text.CatchingFishAppCompatMVVM
    public final CatchingFishFABStripeAPIFAB CatchingFishReduxKtor() {
        CatchingFishCustomViewRealm catchingFishCustomViewRealm = new CatchingFishCustomViewRealm();
        catchingFishCustomViewRealm.CatchingFishNavigation = this.CatchingFishParcelableFAB;
        return catchingFishCustomViewRealm;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnGloballyPositionedElement) {
            return this.CatchingFishParcelableFAB == ((OnGloballyPositionedElement) obj).CatchingFishParcelableFAB;
        }
        return false;
    }

    public final int hashCode() {
        return this.CatchingFishParcelableFAB.hashCode();
    }
}
