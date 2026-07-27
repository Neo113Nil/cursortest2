package androidx.compose.ui.draw;

import kotlin.text.CatchingFishAppCompatMVVM;
import kotlin.text.CatchingFishBundleWebSocket;
import kotlin.text.CatchingFishFABStripeAPIFAB;
import kotlin.text.CatchingFishServiceHandler;

/* loaded from: classes.dex */
final class DrawBehindElement extends CatchingFishAppCompatMVVM {
    public final CatchingFishServiceHandler CatchingFishParcelableFAB;

    public DrawBehindElement(CatchingFishServiceHandler catchingFishServiceHandler) {
        this.CatchingFishParcelableFAB = catchingFishServiceHandler;
    }

    @Override // kotlin.text.CatchingFishAppCompatMVVM
    public final void CatchingFishDaggerWebsocket(CatchingFishFABStripeAPIFAB catchingFishFABStripeAPIFAB) {
        ((CatchingFishBundleWebSocket) catchingFishFABStripeAPIFAB).CatchingFishNavigation = this.CatchingFishParcelableFAB;
    }

    @Override // kotlin.text.CatchingFishAppCompatMVVM
    public final CatchingFishFABStripeAPIFAB CatchingFishReduxKtor() {
        CatchingFishBundleWebSocket catchingFishBundleWebSocket = new CatchingFishBundleWebSocket();
        catchingFishBundleWebSocket.CatchingFishNavigation = this.CatchingFishParcelableFAB;
        return catchingFishBundleWebSocket;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DrawBehindElement) {
            return this.CatchingFishParcelableFAB == ((DrawBehindElement) obj).CatchingFishParcelableFAB;
        }
        return false;
    }

    public final int hashCode() {
        return this.CatchingFishParcelableFAB.hashCode();
    }
}
