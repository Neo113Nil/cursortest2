package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishContextMoshi implements CatchingFishGsonLiveData, CatchingFishMVPJUnitMockk {
    public final /* synthetic */ CatchingFishManifestAdMob CatchingFishDaggerWebsocket;
    public final CatchingFishKtorMockk CatchingFishReduxKtor;

    public CatchingFishContextMoshi(CatchingFishManifestAdMob catchingFishManifestAdMob, CatchingFishKtorMockk catchingFishKtorMockk) {
        this.CatchingFishDaggerWebsocket = catchingFishManifestAdMob;
        this.CatchingFishReduxKtor = catchingFishKtorMockk;
    }

    @Override // kotlin.text.CatchingFishGsonLiveData
    public final void CatchingFishJetpackCompose(Object obj) {
        this.CatchingFishReduxKtor.CatchingFishJetpackCompose(obj);
    }

    @Override // kotlin.text.CatchingFishMVPJUnitMockk
    public final void CatchingFishParcelableFAB(CatchingFishFluxSnackbar catchingFishFluxSnackbar, int i) {
        this.CatchingFishReduxKtor.CatchingFishParcelableFAB(catchingFishFluxSnackbar, i);
    }

    @Override // kotlin.text.CatchingFishWebsocketGradle
    public final void CatchingFishViewModelFAB(Object obj) {
        this.CatchingFishReduxKtor.CatchingFishViewModelFAB(obj);
    }

    @Override // kotlin.text.CatchingFishGsonLiveData
    public final CatchingFishFluxWorkManager CatchingFishWorkManager(Object obj, CatchingFishJobSchedulerMVP catchingFishJobSchedulerMVP) {
        CatchingFishManifestAdMob catchingFishManifestAdMob = this.CatchingFishDaggerWebsocket;
        CatchingFishKtorSnackbar catchingFishKtorSnackbar = new CatchingFishKtorSnackbar(catchingFishManifestAdMob, this);
        CatchingFishFluxWorkManager CatchingFishWorkManager = this.CatchingFishReduxKtor.CatchingFishWorkManager((CatchingFishRealmContext) obj, catchingFishKtorSnackbar);
        if (CatchingFishWorkManager != null) {
            CatchingFishManifestAdMob.CatchingFishViewModelScope.set(catchingFishManifestAdMob, null);
        }
        return CatchingFishWorkManager;
    }

    @Override // kotlin.text.CatchingFishWebsocketGradle
    public final CatchingFishManifestMockk getContext() {
        return this.CatchingFishReduxKtor.CatchingFishViewModelFAB;
    }
}
