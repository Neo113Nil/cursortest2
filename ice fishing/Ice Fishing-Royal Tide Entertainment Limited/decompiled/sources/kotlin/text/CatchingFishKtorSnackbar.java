package kotlin.text;

import com.android.installreferrer.api.InstallReferrerClient;

/* loaded from: classes.dex */
public final /* synthetic */ class CatchingFishKtorSnackbar implements CatchingFishJobSchedulerMVP {
    public final /* synthetic */ Object CatchingFishDaggerWebsocket;
    public final /* synthetic */ int CatchingFishReduxKtor;

    public /* synthetic */ CatchingFishKtorSnackbar(int i, Object obj) {
        this.CatchingFishReduxKtor = i;
        this.CatchingFishDaggerWebsocket = obj;
    }

    @Override // kotlin.text.CatchingFishJobSchedulerMVP
    public final Object CatchingFishReduxKtor(Object obj, Object obj2, Object obj3) {
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((CatchingFishFragmentFactory) this.CatchingFishDaggerWebsocket).CatchingFishFragmentHandler((Throwable) obj);
                break;
            case 1:
                CatchingFishManifestAdMob catchingFishManifestAdMob = (CatchingFishManifestAdMob) this.CatchingFishDaggerWebsocket;
                CatchingFishManifestAdMob.CatchingFishViewModelScope.set(catchingFishManifestAdMob, null);
                catchingFishManifestAdMob.CatchingFishDaggerWebsocket(null);
                break;
            default:
                ((CatchingFishCameraXManifest) this.CatchingFishDaggerWebsocket).CatchingFishSnackbar();
                break;
        }
        return CatchingFishRealmContext.CatchingFishParcelableFAB;
    }

    public /* synthetic */ CatchingFishKtorSnackbar(CatchingFishManifestAdMob catchingFishManifestAdMob, CatchingFishContextMoshi catchingFishContextMoshi) {
        this.CatchingFishReduxKtor = 1;
        this.CatchingFishDaggerWebsocket = catchingFishManifestAdMob;
    }
}
