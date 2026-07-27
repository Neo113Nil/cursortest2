package kotlin.text;

import android.view.WindowInsets;

/* loaded from: classes.dex */
public class CatchingFishMVPMVPHilt extends CatchingFishRealmMoshiFAB {
    public CatchingFishReduxPayPal CatchingFish;

    public CatchingFishMVPMVPHilt(CatchingFishKtorPicassoMVVM catchingFishKtorPicassoMVVM, WindowInsets windowInsets) {
        super(catchingFishKtorPicassoMVVM, windowInsets);
        this.CatchingFish = null;
    }

    @Override // kotlin.text.CatchingFishFragmentHilt
    public boolean CatchingFish() {
        return this.CatchingFishCoroutine.isConsumed();
    }

    @Override // kotlin.text.CatchingFishFragmentHilt
    public void CatchingFishCardViewRealm(CatchingFishReduxPayPal catchingFishReduxPayPal) {
        this.CatchingFish = catchingFishReduxPayPal;
    }

    @Override // kotlin.text.CatchingFishFragmentHilt
    public CatchingFishKtorPicassoMVVM CatchingFishCoroutine() {
        return CatchingFishKtorPicassoMVVM.CatchingFishViewModelScope(null, this.CatchingFishCoroutine.consumeSystemWindowInsets());
    }

    @Override // kotlin.text.CatchingFishFragmentHilt
    public final CatchingFishReduxPayPal CatchingFishEspressoTesting() {
        if (this.CatchingFish == null) {
            WindowInsets windowInsets = this.CatchingFishCoroutine;
            this.CatchingFish = CatchingFishReduxPayPal.CatchingFishSnackbar(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.CatchingFish;
    }

    @Override // kotlin.text.CatchingFishFragmentHilt
    public CatchingFishKtorPicassoMVVM CatchingFishSnackbar() {
        return CatchingFishKtorPicassoMVVM.CatchingFishViewModelScope(null, this.CatchingFishCoroutine.consumeStableInsets());
    }

    public CatchingFishMVPMVPHilt(CatchingFishKtorPicassoMVVM catchingFishKtorPicassoMVVM, CatchingFishMVPMVPHilt catchingFishMVPMVPHilt) {
        super(catchingFishKtorPicassoMVVM, catchingFishMVPMVPHilt);
        this.CatchingFish = null;
        this.CatchingFish = catchingFishMVPMVPHilt.CatchingFish;
    }
}
