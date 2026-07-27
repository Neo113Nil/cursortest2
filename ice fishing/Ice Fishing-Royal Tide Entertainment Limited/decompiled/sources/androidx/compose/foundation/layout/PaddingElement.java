package androidx.compose.foundation.layout;

import kotlin.text.CatchingFishAppCompatMVVM;
import kotlin.text.CatchingFishFABStripeAPIFAB;
import kotlin.text.CatchingFishHiltWorkManager;
import kotlin.text.CatchingFishMVPLiveData;
import kotlin.text.CatchingFishParcelableRedux;

/* loaded from: classes.dex */
final class PaddingElement extends CatchingFishAppCompatMVVM {
    public float CatchingFishCoroutine;
    public boolean CatchingFishDaggerWebsocket;
    public float CatchingFishParcelableFAB;
    public float CatchingFishReduxKtor;
    public float CatchingFishSnackbar;

    @Override // kotlin.text.CatchingFishAppCompatMVVM
    public final void CatchingFishDaggerWebsocket(CatchingFishFABStripeAPIFAB catchingFishFABStripeAPIFAB) {
        CatchingFishParcelableRedux catchingFishParcelableRedux = (CatchingFishParcelableRedux) catchingFishFABStripeAPIFAB;
        catchingFishParcelableRedux.CatchingFishNavigation = this.CatchingFishParcelableFAB;
        catchingFishParcelableRedux.CatchingFish = this.CatchingFishSnackbar;
        catchingFishParcelableRedux.CatchingFishJetpackCompose = this.CatchingFishCoroutine;
        catchingFishParcelableRedux.CatchingFishCoroutineFlow = this.CatchingFishReduxKtor;
        catchingFishParcelableRedux.CatchingFishDaggerHiltFAB = this.CatchingFishDaggerWebsocket;
    }

    @Override // kotlin.text.CatchingFishAppCompatMVVM
    public final CatchingFishFABStripeAPIFAB CatchingFishReduxKtor() {
        float f = this.CatchingFishParcelableFAB;
        float f2 = this.CatchingFishSnackbar;
        float f3 = this.CatchingFishCoroutine;
        float f4 = this.CatchingFishReduxKtor;
        boolean z = this.CatchingFishDaggerWebsocket;
        CatchingFishParcelableRedux catchingFishParcelableRedux = new CatchingFishParcelableRedux();
        catchingFishParcelableRedux.CatchingFishNavigation = f;
        catchingFishParcelableRedux.CatchingFish = f2;
        catchingFishParcelableRedux.CatchingFishJetpackCompose = f3;
        catchingFishParcelableRedux.CatchingFishCoroutineFlow = f4;
        catchingFishParcelableRedux.CatchingFishDaggerHiltFAB = z;
        return catchingFishParcelableRedux;
    }

    public final boolean equals(Object obj) {
        PaddingElement paddingElement = obj instanceof PaddingElement ? (PaddingElement) obj : null;
        return paddingElement != null && CatchingFishHiltWorkManager.CatchingFishParcelableFAB(this.CatchingFishParcelableFAB, paddingElement.CatchingFishParcelableFAB) && CatchingFishHiltWorkManager.CatchingFishParcelableFAB(this.CatchingFishSnackbar, paddingElement.CatchingFishSnackbar) && CatchingFishHiltWorkManager.CatchingFishParcelableFAB(this.CatchingFishCoroutine, paddingElement.CatchingFishCoroutine) && CatchingFishHiltWorkManager.CatchingFishParcelableFAB(this.CatchingFishReduxKtor, paddingElement.CatchingFishReduxKtor) && this.CatchingFishDaggerWebsocket == paddingElement.CatchingFishDaggerWebsocket;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.CatchingFishDaggerWebsocket) + CatchingFishMVPLiveData.CatchingFishWorkManager(this.CatchingFishReduxKtor, CatchingFishMVPLiveData.CatchingFishWorkManager(this.CatchingFishCoroutine, CatchingFishMVPLiveData.CatchingFishWorkManager(this.CatchingFishSnackbar, Float.hashCode(this.CatchingFishParcelableFAB) * 31, 31), 31), 31);
    }
}
