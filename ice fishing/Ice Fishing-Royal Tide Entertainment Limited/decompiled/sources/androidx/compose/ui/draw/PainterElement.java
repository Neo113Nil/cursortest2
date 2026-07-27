package androidx.compose.ui.draw;

import kotlin.text.CatchingFishAdMobLayout;
import kotlin.text.CatchingFishAppCompatMVVM;
import kotlin.text.CatchingFishBundlePayPal;
import kotlin.text.CatchingFishCameraXContext;
import kotlin.text.CatchingFishFABStripeAPIFAB;
import kotlin.text.CatchingFishFirebaseDagger;
import kotlin.text.CatchingFishGradleMVVM;
import kotlin.text.CatchingFishGsonCardView;
import kotlin.text.CatchingFishMVPCameraX;
import kotlin.text.CatchingFishMVPLiveData;
import kotlin.text.CatchingFishReduxAndroidX;
import kotlin.text.CatchingFishXMLLayoutGlide;

/* loaded from: classes.dex */
final class PainterElement extends CatchingFishAppCompatMVVM {
    public final float CatchingFishCoroutine;
    public final CatchingFishCameraXContext CatchingFishParcelableFAB;
    public final CatchingFishAdMobLayout CatchingFishSnackbar;

    public PainterElement(CatchingFishCameraXContext catchingFishCameraXContext, CatchingFishAdMobLayout catchingFishAdMobLayout, float f) {
        this.CatchingFishParcelableFAB = catchingFishCameraXContext;
        this.CatchingFishSnackbar = catchingFishAdMobLayout;
        this.CatchingFishCoroutine = f;
    }

    @Override // kotlin.text.CatchingFishAppCompatMVVM
    public final void CatchingFishDaggerWebsocket(CatchingFishFABStripeAPIFAB catchingFishFABStripeAPIFAB) {
        CatchingFishBundlePayPal catchingFishBundlePayPal = (CatchingFishBundlePayPal) catchingFishFABStripeAPIFAB;
        boolean z = catchingFishBundlePayPal.CatchingFish;
        CatchingFishCameraXContext catchingFishCameraXContext = this.CatchingFishParcelableFAB;
        boolean z2 = (z && CatchingFishMVPCameraX.CatchingFishParcelableFAB(catchingFishBundlePayPal.CatchingFishNavigation.CatchingFishCoroutine(), catchingFishCameraXContext.CatchingFishCoroutine())) ? false : true;
        catchingFishBundlePayPal.CatchingFishNavigation = catchingFishCameraXContext;
        catchingFishBundlePayPal.CatchingFish = true;
        catchingFishBundlePayPal.CatchingFishJetpackCompose = CatchingFishGradleMVVM.CatchingFishLayout;
        catchingFishBundlePayPal.CatchingFishCoroutineFlow = this.CatchingFishSnackbar;
        catchingFishBundlePayPal.CatchingFishDaggerHiltFAB = this.CatchingFishCoroutine;
        if (z2) {
            CatchingFishXMLLayoutGlide.CatchingFishJobScheduler(catchingFishBundlePayPal).CatchingFishCardViewRealm();
        }
        CatchingFishGsonCardView.CatchingFishCardViewView(catchingFishBundlePayPal);
    }

    @Override // kotlin.text.CatchingFishAppCompatMVVM
    public final CatchingFishFABStripeAPIFAB CatchingFishReduxKtor() {
        CatchingFishReduxAndroidX catchingFishReduxAndroidX = CatchingFishGradleMVVM.CatchingFishLayout;
        CatchingFishBundlePayPal catchingFishBundlePayPal = new CatchingFishBundlePayPal();
        catchingFishBundlePayPal.CatchingFishNavigation = this.CatchingFishParcelableFAB;
        catchingFishBundlePayPal.CatchingFish = true;
        catchingFishBundlePayPal.CatchingFishJetpackCompose = catchingFishReduxAndroidX;
        catchingFishBundlePayPal.CatchingFishCoroutineFlow = this.CatchingFishSnackbar;
        catchingFishBundlePayPal.CatchingFishDaggerHiltFAB = this.CatchingFishCoroutine;
        return catchingFishBundlePayPal;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PainterElement)) {
            return false;
        }
        PainterElement painterElement = (PainterElement) obj;
        if (!CatchingFishFirebaseDagger.CatchingFishOkHttp(this.CatchingFishParcelableFAB, painterElement.CatchingFishParcelableFAB)) {
            return false;
        }
        CatchingFishReduxAndroidX catchingFishReduxAndroidX = CatchingFishGradleMVVM.CatchingFishLayout;
        return catchingFishReduxAndroidX.equals(catchingFishReduxAndroidX) && CatchingFishFirebaseDagger.CatchingFishOkHttp(this.CatchingFishSnackbar, painterElement.CatchingFishSnackbar) && Float.compare(this.CatchingFishCoroutine, painterElement.CatchingFishCoroutine) == 0;
    }

    public final int hashCode() {
        return CatchingFishMVPLiveData.CatchingFishWorkManager(this.CatchingFishCoroutine, (this.CatchingFishSnackbar.hashCode() + ((Float.hashCode(0.0f) + (Float.hashCode(0.0f) * 31) + ((Boolean.hashCode(true) + (this.CatchingFishParcelableFAB.hashCode() * 31)) * 31)) * 31)) * 31, 31);
    }

    public final String toString() {
        return "PainterElement(painter=" + this.CatchingFishParcelableFAB + ", sizeToIntrinsics=true, alignment=" + CatchingFishGradleMVVM.CatchingFishLayout + ", contentScale=" + this.CatchingFishSnackbar + ", alpha=" + this.CatchingFishCoroutine + ", colorFilter=null)";
    }
}
