package kotlin.text;

import com.android.installreferrer.api.InstallReferrerClient;

/* loaded from: classes.dex */
public final class CatchingFishPayPalManifest implements CatchingFishWebsocketGradle {
    public static final CatchingFishPayPalManifest CatchingFishDaggerWebsocket = new CatchingFishPayPalManifest(0);
    public static final CatchingFishPayPalManifest CatchingFishWorkManager = new CatchingFishPayPalManifest(1);
    public final /* synthetic */ int CatchingFishReduxKtor;

    public /* synthetic */ CatchingFishPayPalManifest(int i) {
        this.CatchingFishReduxKtor = i;
    }

    @Override // kotlin.text.CatchingFishWebsocketGradle
    public final void CatchingFishViewModelFAB(Object obj) {
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                throw new IllegalStateException("This continuation is already complete");
            default:
                return;
        }
    }

    @Override // kotlin.text.CatchingFishWebsocketGradle
    public final CatchingFishManifestMockk getContext() {
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                throw new IllegalStateException("This continuation is already complete");
            default:
                return CatchingFishPayPalDataStore.CatchingFishReduxKtor;
        }
    }

    public String toString() {
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return "This continuation is already complete";
            default:
                return super.toString();
        }
    }

    private final void CatchingFishParcelableFAB(Object obj) {
    }
}
