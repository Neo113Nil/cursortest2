package kotlin.text;

import com.android.installreferrer.api.InstallReferrerClient;

/* loaded from: classes.dex */
public final /* synthetic */ class CatchingFishMVINavigation implements CatchingFishJUnitGlide {
    public final /* synthetic */ CatchingFishManifestMVI CatchingFishDaggerWebsocket;
    public final /* synthetic */ int CatchingFishReduxKtor;

    public /* synthetic */ CatchingFishMVINavigation(CatchingFishManifestMVI catchingFishManifestMVI, int i) {
        this.CatchingFishReduxKtor = i;
        this.CatchingFishDaggerWebsocket = catchingFishManifestMVI;
    }

    @Override // kotlin.text.CatchingFishJUnitGlide
    public final Object CatchingFishParcelableFAB() {
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                this.CatchingFishDaggerWebsocket.CatchingFishWorkManager = null;
                break;
            case 1:
                this.CatchingFishDaggerWebsocket.CatchingFishDaggerWebsocket = true;
                break;
            default:
                this.CatchingFishDaggerWebsocket.CatchingFishDaggerWebsocket = false;
                break;
        }
        return CatchingFishRealmContext.CatchingFishParcelableFAB;
    }
}
