package androidx.compose.ui.layout;

import kotlin.text.CatchingFishAppCompatMVVM;
import kotlin.text.CatchingFishBiometricRoom;
import kotlin.text.CatchingFishFABStripeAPIFAB;
import kotlin.text.CatchingFishViewToast;
import kotlin.text.CatchingFishXMLLayoutGlide;
import kotlin.text.CatchingFishXMLLayoutRoom;

/* loaded from: classes.dex */
final class RulerProviderModifierElement extends CatchingFishAppCompatMVVM {
    public final CatchingFishXMLLayoutRoom CatchingFishParcelableFAB;

    public RulerProviderModifierElement(CatchingFishXMLLayoutRoom catchingFishXMLLayoutRoom) {
        this.CatchingFishParcelableFAB = catchingFishXMLLayoutRoom;
    }

    @Override // kotlin.text.CatchingFishAppCompatMVVM
    public final void CatchingFishDaggerWebsocket(CatchingFishFABStripeAPIFAB catchingFishFABStripeAPIFAB) {
        CatchingFishViewToast catchingFishViewToast = (CatchingFishViewToast) catchingFishFABStripeAPIFAB;
        CatchingFishXMLLayoutRoom catchingFishXMLLayoutRoom = catchingFishViewToast.CatchingFishNavigation;
        CatchingFishXMLLayoutRoom catchingFishXMLLayoutRoom2 = this.CatchingFishParcelableFAB;
        if (catchingFishXMLLayoutRoom != catchingFishXMLLayoutRoom2) {
            catchingFishViewToast.CatchingFishNavigation = catchingFishXMLLayoutRoom2;
            CatchingFishBiometricRoom.CatchingFishPayPalLiveData(CatchingFishXMLLayoutGlide.CatchingFishJobScheduler(catchingFishViewToast), false, 7);
        }
    }

    @Override // kotlin.text.CatchingFishAppCompatMVVM
    public final CatchingFishFABStripeAPIFAB CatchingFishReduxKtor() {
        return new CatchingFishViewToast(this.CatchingFishParcelableFAB);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        RulerProviderModifierElement rulerProviderModifierElement = obj instanceof RulerProviderModifierElement ? (RulerProviderModifierElement) obj : null;
        return (rulerProviderModifierElement != null ? rulerProviderModifierElement.CatchingFishParcelableFAB : null) == this.CatchingFishParcelableFAB;
    }

    public final int hashCode() {
        return this.CatchingFishParcelableFAB.hashCode();
    }
}
