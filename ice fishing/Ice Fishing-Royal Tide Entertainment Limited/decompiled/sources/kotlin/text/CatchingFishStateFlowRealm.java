package kotlin.text;

import android.view.View;
import android.view.ViewTreeObserver;

/* loaded from: classes.dex */
public final class CatchingFishStateFlowRealm extends CatchingFishFABStripeAPIFAB implements CatchingFishToastLayoutMVVM, ViewTreeObserver.OnGlobalFocusChangeListener {
    public ViewTreeObserver CatchingFish;
    public View CatchingFishNavigation;
    public final CatchingFishIntentWidget CatchingFishJetpackCompose = new CatchingFishIntentWidget(this, 0);
    public final CatchingFishIntentWidget CatchingFishCoroutineFlow = new CatchingFishIntentWidget(this, 1);

    @Override // kotlin.text.CatchingFishToastLayoutMVVM
    public final void CatchingFishAnimationMockk(CatchingFishSpannableBundle catchingFishSpannableBundle) {
        catchingFishSpannableBundle.CatchingFishCoroutine(false);
        catchingFishSpannableBundle.CatchingFishReduxKtor(this.CatchingFishJetpackCompose);
        catchingFishSpannableBundle.CatchingFishParcelableFAB(this.CatchingFishCoroutineFlow);
    }

    @Override // kotlin.text.CatchingFishFABStripeAPIFAB
    public final void CatchingFishDaggerHiltFAB() {
        ViewTreeObserver viewTreeObserver = CatchingFishBiometricBundle.CatchingFishPayPalService(this).getViewTreeObserver();
        this.CatchingFish = viewTreeObserver;
        viewTreeObserver.addOnGlobalFocusChangeListener(this);
    }

    public final CatchingFishAppCompatWidget CatchingFishPayPal() {
        CatchingFishFABStripeAPIFAB catchingFishFABStripeAPIFAB = this.CatchingFishReduxKtor;
        if (!catchingFishFABStripeAPIFAB.CatchingFishRoomDatabase) {
            CatchingFishFluxGradle.CatchingFishSnackbar("visitLocalDescendants called on an unattached node");
        }
        if ((catchingFishFABStripeAPIFAB.CatchingFishViewModelScope & 1024) != 0) {
            boolean z = false;
            for (CatchingFishFABStripeAPIFAB catchingFishFABStripeAPIFAB2 = catchingFishFABStripeAPIFAB.CatchingFishLayout; catchingFishFABStripeAPIFAB2 != null; catchingFishFABStripeAPIFAB2 = catchingFishFABStripeAPIFAB2.CatchingFishLayout) {
                if ((catchingFishFABStripeAPIFAB2.CatchingFishWorkManager & 1024) != 0) {
                    for (CatchingFishFABStripeAPIFAB catchingFishFABStripeAPIFAB3 = catchingFishFABStripeAPIFAB2; catchingFishFABStripeAPIFAB3 != null; catchingFishFABStripeAPIFAB3 = null) {
                        if (catchingFishFABStripeAPIFAB3 instanceof CatchingFishAppCompatWidget) {
                            CatchingFishAppCompatWidget catchingFishAppCompatWidget = (CatchingFishAppCompatWidget) catchingFishFABStripeAPIFAB3;
                            if (z) {
                                return catchingFishAppCompatWidget;
                            }
                            z = true;
                        }
                    }
                }
            }
        }
        throw new IllegalStateException("Could not find focus target of embedded view wrapper");
    }

    @Override // kotlin.text.CatchingFishFABStripeAPIFAB
    public final void CatchingFishSpannableWidget() {
        ViewTreeObserver viewTreeObserver = this.CatchingFish;
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnGlobalFocusChangeListener(this);
        }
        this.CatchingFish = null;
        CatchingFishBiometricBundle.CatchingFishPayPalService(this).getViewTreeObserver().removeOnGlobalFocusChangeListener(this);
        this.CatchingFishNavigation = null;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public final void onGlobalFocusChanged(View view, View view2) {
        if (CatchingFishXMLLayoutGlide.CatchingFishJobScheduler(this).CatchingFishStateLiveData == null) {
            return;
        }
        View CatchingFishViewModelScope = CatchingFishAdMobFAB.CatchingFishViewModelScope(this);
        CatchingFishViewManifest focusOwner = ((CatchingFishGradleCameraX) CatchingFishXMLLayoutGlide.CatchingFishPayPalService(this)).getFocusOwner();
        CatchingFishAdMobJUnit CatchingFishPayPalService = CatchingFishXMLLayoutGlide.CatchingFishPayPalService(this);
        boolean z = (view == null || view.equals(CatchingFishPayPalService) || !CatchingFishAdMobFAB.CatchingFishDaggerWebsocket(CatchingFishViewModelScope, view)) ? false : true;
        boolean z2 = (view2 == null || view2.equals(CatchingFishPayPalService) || !CatchingFishAdMobFAB.CatchingFishDaggerWebsocket(CatchingFishViewModelScope, view2)) ? false : true;
        if (z && z2) {
            this.CatchingFishNavigation = view2;
            return;
        }
        if (z2) {
            this.CatchingFishNavigation = view2;
            CatchingFishAppCompatWidget CatchingFishPayPal = CatchingFishPayPal();
            int ordinal = CatchingFishPayPal.CatchingFishMVPRobolectric().ordinal();
            if (ordinal == 0 || ordinal == 1 || ordinal == 2) {
                return;
            }
            if (ordinal != 3) {
                throw new CatchingFishBiometricView();
            }
            CatchingFishBiometricBundle.CatchingFishCustomView(CatchingFishPayPal);
            return;
        }
        if (!z) {
            this.CatchingFishNavigation = null;
            return;
        }
        this.CatchingFishNavigation = null;
        int ordinal2 = CatchingFishPayPal().CatchingFishMVPRobolectric().ordinal();
        if (ordinal2 != 0) {
            if (ordinal2 == 1) {
                return;
            }
            if (ordinal2 != 2) {
                if (ordinal2 != 3) {
                    throw new CatchingFishBiometricView();
                }
                return;
            }
        }
        ((CatchingFishExoPlayerOkHttp) focusOwner).CatchingFishSnackbar(8, false, false);
    }
}
