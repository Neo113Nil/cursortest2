package kotlin.text;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class CatchingFishRoomRealm implements CatchingFishMVPKtorWidget, CatchingFishMoshiJUnitRoom, CatchingFishRoomToolbar, CatchingFishSpannableFAB {
    public final Executor CatchingFishDaggerWebsocket;
    public final /* synthetic */ int CatchingFishReduxKtor;
    public final CatchingFishWorkManagerMVP CatchingFishViewModelScope;
    public final CatchingFishJUnitBiometric CatchingFishWorkManager;

    public /* synthetic */ CatchingFishRoomRealm(Executor executor, CatchingFishJUnitBiometric catchingFishJUnitBiometric, CatchingFishWorkManagerMVP catchingFishWorkManagerMVP, int i) {
        this.CatchingFishReduxKtor = i;
        this.CatchingFishDaggerWebsocket = executor;
        this.CatchingFishWorkManager = catchingFishJUnitBiometric;
        this.CatchingFishViewModelScope = catchingFishWorkManagerMVP;
    }

    @Override // kotlin.text.CatchingFishRoomToolbar
    public void CatchingFishCoroutine(Exception exc) {
        this.CatchingFishViewModelScope.CatchingFishCloudMessaging(exc);
    }

    @Override // kotlin.text.CatchingFishSpannableFAB
    public void CatchingFishParcelableFAB() {
        this.CatchingFishViewModelScope.CatchingFishEspressoTesting();
    }

    @Override // kotlin.text.CatchingFishMVPKtorWidget
    public final void CatchingFishReduxKtor(CatchingFishWorkManagerMVP catchingFishWorkManagerMVP) {
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                this.CatchingFishDaggerWebsocket.execute(new CatchingFishGsonRealmMoshi(4, this, catchingFishWorkManagerMVP));
                break;
            default:
                this.CatchingFishDaggerWebsocket.execute(new CatchingFishGsonRealmMoshi(5, this, catchingFishWorkManagerMVP));
                break;
        }
    }

    @Override // kotlin.text.CatchingFishMoshiJUnitRoom
    public void CatchingFishSnackbar(Object obj) {
        this.CatchingFishViewModelScope.CatchingFishFragmentHandler(obj);
    }
}
