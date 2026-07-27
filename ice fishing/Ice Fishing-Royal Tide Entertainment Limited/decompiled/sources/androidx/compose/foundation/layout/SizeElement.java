package androidx.compose.foundation.layout;

import kotlin.text.CatchingFishAppCompatMVVM;
import kotlin.text.CatchingFishFABStripeAPIFAB;
import kotlin.text.CatchingFishHiltWorkManager;
import kotlin.text.CatchingFishMVPLiveData;
import kotlin.text.CatchingFishRobolectricView;

/* loaded from: classes.dex */
final class SizeElement extends CatchingFishAppCompatMVVM {
    public final float CatchingFishCoroutine;
    public final float CatchingFishParcelableFAB;
    public final float CatchingFishReduxKtor;
    public final float CatchingFishSnackbar;

    public SizeElement(float f, float f2, float f3, float f4) {
        this.CatchingFishParcelableFAB = f;
        this.CatchingFishSnackbar = f2;
        this.CatchingFishCoroutine = f3;
        this.CatchingFishReduxKtor = f4;
    }

    @Override // kotlin.text.CatchingFishAppCompatMVVM
    public final void CatchingFishDaggerWebsocket(CatchingFishFABStripeAPIFAB catchingFishFABStripeAPIFAB) {
        CatchingFishRobolectricView catchingFishRobolectricView = (CatchingFishRobolectricView) catchingFishFABStripeAPIFAB;
        catchingFishRobolectricView.CatchingFishNavigation = this.CatchingFishParcelableFAB;
        catchingFishRobolectricView.CatchingFish = this.CatchingFishSnackbar;
        catchingFishRobolectricView.CatchingFishJetpackCompose = this.CatchingFishCoroutine;
        catchingFishRobolectricView.CatchingFishCoroutineFlow = this.CatchingFishReduxKtor;
        catchingFishRobolectricView.CatchingFishDaggerHiltFAB = true;
    }

    @Override // kotlin.text.CatchingFishAppCompatMVVM
    public final CatchingFishFABStripeAPIFAB CatchingFishReduxKtor() {
        CatchingFishRobolectricView catchingFishRobolectricView = new CatchingFishRobolectricView();
        catchingFishRobolectricView.CatchingFishNavigation = this.CatchingFishParcelableFAB;
        catchingFishRobolectricView.CatchingFish = this.CatchingFishSnackbar;
        catchingFishRobolectricView.CatchingFishJetpackCompose = this.CatchingFishCoroutine;
        catchingFishRobolectricView.CatchingFishCoroutineFlow = this.CatchingFishReduxKtor;
        catchingFishRobolectricView.CatchingFishDaggerHiltFAB = true;
        return catchingFishRobolectricView;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SizeElement)) {
            return false;
        }
        SizeElement sizeElement = (SizeElement) obj;
        return CatchingFishHiltWorkManager.CatchingFishParcelableFAB(this.CatchingFishParcelableFAB, sizeElement.CatchingFishParcelableFAB) && CatchingFishHiltWorkManager.CatchingFishParcelableFAB(this.CatchingFishSnackbar, sizeElement.CatchingFishSnackbar) && CatchingFishHiltWorkManager.CatchingFishParcelableFAB(this.CatchingFishCoroutine, sizeElement.CatchingFishCoroutine) && CatchingFishHiltWorkManager.CatchingFishParcelableFAB(this.CatchingFishReduxKtor, sizeElement.CatchingFishReduxKtor);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + CatchingFishMVPLiveData.CatchingFishWorkManager(this.CatchingFishReduxKtor, CatchingFishMVPLiveData.CatchingFishWorkManager(this.CatchingFishCoroutine, CatchingFishMVPLiveData.CatchingFishWorkManager(this.CatchingFishSnackbar, Float.hashCode(this.CatchingFishParcelableFAB) * 31, 31), 31), 31);
    }
}
