package kotlin.text;

import android.graphics.Insets;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public class CatchingFishFABMVVMFAB extends CatchingFishAdMobRetrofit {
    public CatchingFishReduxPayPal CatchingFishCoroutineFlow;
    public CatchingFishReduxPayPal CatchingFishDaggerHiltFAB;
    public CatchingFishReduxPayPal CatchingFishJetpackCompose;

    public CatchingFishFABMVVMFAB(CatchingFishKtorPicassoMVVM catchingFishKtorPicassoMVVM, WindowInsets windowInsets) {
        super(catchingFishKtorPicassoMVVM, windowInsets);
        this.CatchingFishJetpackCompose = null;
        this.CatchingFishCoroutineFlow = null;
        this.CatchingFishDaggerHiltFAB = null;
    }

    @Override // kotlin.text.CatchingFishFragmentHilt
    public CatchingFishReduxPayPal CatchingFishAnimationMockk() {
        Insets tappableElementInsets;
        if (this.CatchingFishDaggerHiltFAB == null) {
            tappableElementInsets = this.CatchingFishCoroutine.getTappableElementInsets();
            this.CatchingFishDaggerHiltFAB = CatchingFishReduxPayPal.CatchingFishCoroutine(tappableElementInsets);
        }
        return this.CatchingFishDaggerHiltFAB;
    }

    @Override // kotlin.text.CatchingFishFragmentHilt
    public CatchingFishReduxPayPal CatchingFishCloudMessaging() {
        Insets mandatorySystemGestureInsets;
        if (this.CatchingFishCoroutineFlow == null) {
            mandatorySystemGestureInsets = this.CatchingFishCoroutine.getMandatorySystemGestureInsets();
            this.CatchingFishCoroutineFlow = CatchingFishReduxPayPal.CatchingFishCoroutine(mandatorySystemGestureInsets);
        }
        return this.CatchingFishCoroutineFlow;
    }

    @Override // kotlin.text.CatchingFishRealmMoshiFAB, kotlin.text.CatchingFishFragmentHilt
    public CatchingFishKtorPicassoMVVM CatchingFishNavigation(int i, int i2, int i3, int i4) {
        WindowInsets inset;
        inset = this.CatchingFishCoroutine.inset(i, i2, i3, i4);
        return CatchingFishKtorPicassoMVVM.CatchingFishViewModelScope(null, inset);
    }

    @Override // kotlin.text.CatchingFishFragmentHilt
    public CatchingFishReduxPayPal CatchingFishOkHttp() {
        Insets systemGestureInsets;
        if (this.CatchingFishJetpackCompose == null) {
            systemGestureInsets = this.CatchingFishCoroutine.getSystemGestureInsets();
            this.CatchingFishJetpackCompose = CatchingFishReduxPayPal.CatchingFishCoroutine(systemGestureInsets);
        }
        return this.CatchingFishJetpackCompose;
    }

    public CatchingFishFABMVVMFAB(CatchingFishKtorPicassoMVVM catchingFishKtorPicassoMVVM, CatchingFishFABMVVMFAB catchingFishFABMVVMFAB) {
        super(catchingFishKtorPicassoMVVM, catchingFishFABMVVMFAB);
        this.CatchingFishJetpackCompose = null;
        this.CatchingFishCoroutineFlow = null;
        this.CatchingFishDaggerHiltFAB = null;
    }

    @Override // kotlin.text.CatchingFishMVPMVPHilt, kotlin.text.CatchingFishFragmentHilt
    public void CatchingFishCardViewRealm(CatchingFishReduxPayPal catchingFishReduxPayPal) {
    }
}
