package kotlin.text;

import android.view.View;

/* loaded from: classes.dex */
public final class CatchingFishRealmMVVM implements CatchingFishLiveDataDagger {
    public final /* synthetic */ View CatchingFishDaggerWebsocket;
    public final /* synthetic */ int CatchingFishReduxKtor;
    public final /* synthetic */ int CatchingFishViewModelFAB;
    public final /* synthetic */ int CatchingFishViewModelScope;
    public final /* synthetic */ int CatchingFishWorkManager;

    public CatchingFishRealmMVVM(View view, int i, int i2, int i3, int i4) {
        this.CatchingFishReduxKtor = i;
        this.CatchingFishDaggerWebsocket = view;
        this.CatchingFishWorkManager = i2;
        this.CatchingFishViewModelScope = i3;
        this.CatchingFishViewModelFAB = i4;
    }

    @Override // kotlin.text.CatchingFishLiveDataDagger
    public final CatchingFishKtorPicassoMVVM CatchingFishStateLiveData(View view, CatchingFishKtorPicassoMVVM catchingFishKtorPicassoMVVM) {
        CatchingFishReduxPayPal CatchingFishLayout = catchingFishKtorPicassoMVVM.CatchingFishParcelableFAB.CatchingFishLayout(519);
        View view2 = this.CatchingFishDaggerWebsocket;
        int i = this.CatchingFishReduxKtor;
        if (i >= 0) {
            view2.getLayoutParams().height = i + CatchingFishLayout.CatchingFishSnackbar;
            view2.setLayoutParams(view2.getLayoutParams());
        }
        view2.setPadding(this.CatchingFishWorkManager + CatchingFishLayout.CatchingFishParcelableFAB, this.CatchingFishViewModelScope + CatchingFishLayout.CatchingFishSnackbar, this.CatchingFishViewModelFAB + CatchingFishLayout.CatchingFishCoroutine, view2.getPaddingBottom());
        return catchingFishKtorPicassoMVVM;
    }
}
