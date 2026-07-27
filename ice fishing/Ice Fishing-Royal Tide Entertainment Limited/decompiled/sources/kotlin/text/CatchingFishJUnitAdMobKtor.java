package kotlin.text;

import android.view.ActionProvider;

/* loaded from: classes.dex */
public final class CatchingFishJUnitAdMobKtor implements ActionProvider.VisibilityListener {
    public CatchingFishViewPagerMockk CatchingFishParcelableFAB;
    public final ActionProvider CatchingFishSnackbar;

    public CatchingFishJUnitAdMobKtor(CatchingFishFABHilt catchingFishFABHilt, ActionProvider actionProvider) {
        this.CatchingFishSnackbar = actionProvider;
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z) {
        CatchingFishViewPagerMockk catchingFishViewPagerMockk = this.CatchingFishParcelableFAB;
        if (catchingFishViewPagerMockk != null) {
            CatchingFishSharedFlowAdMob catchingFishSharedFlowAdMob = ((CatchingFishKtorAdMob) catchingFishViewPagerMockk.CatchingFishDaggerWebsocket).CatchingFishUnitTesting;
            catchingFishSharedFlowAdMob.CatchingFishViewModelFAB = true;
            catchingFishSharedFlowAdMob.CatchingFishStateLiveData(true);
        }
    }
}
