package kotlin.text;

import android.os.Handler;

/* loaded from: classes.dex */
public final class CatchingFishReduxCardView implements CatchingFishToastFlux {
    public static final CatchingFishReduxCardView CatchingFishEspressoTesting = new CatchingFishReduxCardView();
    public int CatchingFishDaggerWebsocket;
    public int CatchingFishReduxKtor;
    public Handler CatchingFishViewModelFAB;
    public boolean CatchingFishWorkManager = true;
    public boolean CatchingFishViewModelScope = true;
    public final CatchingFishToolbarToast CatchingFishLayout = new CatchingFishToolbarToast(this);
    public final CatchingFishMVPLayout CatchingFishFragmentHandler = new CatchingFishMVPLayout(14, this);
    public final CatchingFishViewPagerMockk CatchingFishCloudMessaging = new CatchingFishViewPagerMockk(27, this);

    @Override // kotlin.text.CatchingFishToastFlux
    public final CatchingFishToolbarToast CatchingFishDaggerWebsocket() {
        return this.CatchingFishLayout;
    }

    public final void CatchingFishSnackbar() {
        int i = this.CatchingFishDaggerWebsocket + 1;
        this.CatchingFishDaggerWebsocket = i;
        if (i == 1) {
            if (this.CatchingFishWorkManager) {
                this.CatchingFishLayout.CatchingFishReduxKtor(CatchingFishToolbarLiveData.ON_RESUME);
                this.CatchingFishWorkManager = false;
            } else {
                Handler handler = this.CatchingFishViewModelFAB;
                CatchingFishFirebaseDagger.CatchingFishAnimationMockk(handler);
                handler.removeCallbacks(this.CatchingFishFragmentHandler);
            }
        }
    }
}
