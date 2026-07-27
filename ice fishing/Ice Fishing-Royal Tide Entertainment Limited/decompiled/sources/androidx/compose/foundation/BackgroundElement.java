package androidx.compose.foundation;

import kotlin.text.CatchingFishAppCompatMVVM;
import kotlin.text.CatchingFishFABStripeAPIFAB;
import kotlin.text.CatchingFishFirebaseDagger;
import kotlin.text.CatchingFishHiltMockkMVI;
import kotlin.text.CatchingFishMVPLiveData;
import kotlin.text.CatchingFishToastFragment;
import kotlin.text.CatchingFishViewModelOkHttp;
import kotlin.text.CatchingFishXMLLayoutGlide;

/* loaded from: classes.dex */
final class BackgroundElement extends CatchingFishAppCompatMVVM {
    public final CatchingFishHiltMockkMVI CatchingFishCoroutine;
    public final long CatchingFishParcelableFAB;
    public final float CatchingFishSnackbar;

    public BackgroundElement(long j) {
        CatchingFishHiltMockkMVI catchingFishHiltMockkMVI = CatchingFishXMLLayoutGlide.CatchingFishOkHttp;
        this.CatchingFishParcelableFAB = j;
        this.CatchingFishSnackbar = 1.0f;
        this.CatchingFishCoroutine = catchingFishHiltMockkMVI;
    }

    @Override // kotlin.text.CatchingFishAppCompatMVVM
    public final void CatchingFishDaggerWebsocket(CatchingFishFABStripeAPIFAB catchingFishFABStripeAPIFAB) {
        CatchingFishViewModelOkHttp catchingFishViewModelOkHttp = (CatchingFishViewModelOkHttp) catchingFishFABStripeAPIFAB;
        catchingFishViewModelOkHttp.CatchingFishNavigation = this.CatchingFishParcelableFAB;
        catchingFishViewModelOkHttp.CatchingFish = this.CatchingFishCoroutine;
    }

    @Override // kotlin.text.CatchingFishAppCompatMVVM
    public final CatchingFishFABStripeAPIFAB CatchingFishReduxKtor() {
        CatchingFishViewModelOkHttp catchingFishViewModelOkHttp = new CatchingFishViewModelOkHttp();
        catchingFishViewModelOkHttp.CatchingFishNavigation = this.CatchingFishParcelableFAB;
        catchingFishViewModelOkHttp.CatchingFish = this.CatchingFishCoroutine;
        catchingFishViewModelOkHttp.CatchingFishJetpackCompose = 9205357640488583168L;
        return catchingFishViewModelOkHttp;
    }

    public final boolean equals(Object obj) {
        BackgroundElement backgroundElement = obj instanceof BackgroundElement ? (BackgroundElement) obj : null;
        return backgroundElement != null && CatchingFishToastFragment.CatchingFishCoroutine(this.CatchingFishParcelableFAB, backgroundElement.CatchingFishParcelableFAB) && this.CatchingFishSnackbar == backgroundElement.CatchingFishSnackbar && CatchingFishFirebaseDagger.CatchingFishOkHttp(this.CatchingFishCoroutine, backgroundElement.CatchingFishCoroutine);
    }

    public final int hashCode() {
        int i = CatchingFishToastFragment.CatchingFishViewModelScope;
        return this.CatchingFishCoroutine.hashCode() + CatchingFishMVPLiveData.CatchingFishWorkManager(this.CatchingFishSnackbar, Long.hashCode(this.CatchingFishParcelableFAB) * 961, 31);
    }
}
