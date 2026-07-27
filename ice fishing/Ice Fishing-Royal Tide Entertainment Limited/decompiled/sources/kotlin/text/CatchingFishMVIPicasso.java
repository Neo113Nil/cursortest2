package kotlin.text;

import android.os.Handler;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.FragmentActivity;

/* loaded from: classes.dex */
public final class CatchingFishMVIPicasso extends CatchingFishRobolectricHilt implements CatchingFishDataStoreFlux, CatchingFishToastFlux, CatchingFishJUnitLiveData, CatchingFishDataStoreView {
    public final FragmentActivity CatchingFishCoroutineFlow;
    public final Handler CatchingFishDaggerHiltFAB;
    public final FragmentActivity CatchingFishJetpackCompose;
    public final /* synthetic */ FragmentActivity CatchingFishParcelableFlux;
    public final CatchingFishToastSharedFlow CatchingFishSpannableWidget;

    public CatchingFishMVIPicasso(FragmentActivity fragmentActivity) {
        this.CatchingFishParcelableFlux = fragmentActivity;
        Handler handler = new Handler();
        this.CatchingFishSpannableWidget = new CatchingFishToastSharedFlow();
        this.CatchingFishJetpackCompose = fragmentActivity;
        this.CatchingFishCoroutineFlow = fragmentActivity;
        this.CatchingFishDaggerHiltFAB = handler;
    }

    @Override // kotlin.text.CatchingFishRobolectricHilt
    public final boolean CatchingFishDagger() {
        Window window = this.CatchingFishParcelableFlux.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    @Override // kotlin.text.CatchingFishToastFlux
    public final CatchingFishToolbarToast CatchingFishDaggerWebsocket() {
        return this.CatchingFishParcelableFlux.CatchingFishCardViewRealm;
    }

    @Override // kotlin.text.CatchingFishRobolectricHilt
    public final View CatchingFishEspressoMockk(int i) {
        return this.CatchingFishParcelableFlux.findViewById(i);
    }

    @Override // kotlin.text.CatchingFishJUnitLiveData
    public final CatchingFishViewModelIntent CatchingFishParcelableFAB() {
        return (CatchingFishViewModelIntent) this.CatchingFishParcelableFlux.CatchingFishViewModelScope.CatchingFishWorkManager;
    }

    @Override // kotlin.text.CatchingFishDataStoreFlux
    public final CatchingFishManifestService CatchingFishReduxKtor() {
        return this.CatchingFishParcelableFlux.CatchingFishReduxKtor();
    }

    @Override // kotlin.text.CatchingFishDataStoreView
    public final void CatchingFishSnackbar() {
    }
}
