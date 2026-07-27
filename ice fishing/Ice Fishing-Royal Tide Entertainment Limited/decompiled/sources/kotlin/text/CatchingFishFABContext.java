package kotlin.text;

import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class CatchingFishFABContext extends CatchingFishWorkManagerMVVM {
    public boolean CatchingFishParcelableFAB = false;
    public final ViewGroup CatchingFishSnackbar;

    public CatchingFishFABContext(ViewGroup viewGroup) {
        this.CatchingFishSnackbar = viewGroup;
    }

    @Override // kotlin.text.CatchingFishRetrofitView
    public final void CatchingFishCoroutine(CatchingFishMockkRedux catchingFishMockkRedux) {
        if (!this.CatchingFishParcelableFAB) {
            CatchingFishKtorViewModel.CatchingFishPayPal(this.CatchingFishSnackbar, false);
        }
        catchingFishMockkRedux.CatchingFishParcelableFlux(this);
    }

    @Override // kotlin.text.CatchingFishWorkManagerMVVM, kotlin.text.CatchingFishRetrofitView
    public final void CatchingFishParcelableFAB(CatchingFishMockkRedux catchingFishMockkRedux) {
        CatchingFishKtorViewModel.CatchingFishPayPal(this.CatchingFishSnackbar, false);
        this.CatchingFishParcelableFAB = true;
    }

    @Override // kotlin.text.CatchingFishWorkManagerMVVM, kotlin.text.CatchingFishRetrofitView
    public final void CatchingFishReduxKtor() {
        CatchingFishKtorViewModel.CatchingFishPayPal(this.CatchingFishSnackbar, true);
    }

    @Override // kotlin.text.CatchingFishWorkManagerMVVM, kotlin.text.CatchingFishRetrofitView
    public final void CatchingFishSnackbar() {
        CatchingFishKtorViewModel.CatchingFishPayPal(this.CatchingFishSnackbar, false);
    }
}
