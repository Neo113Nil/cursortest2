package kotlin.text;

import androidx.appcompat.widget.Toolbar;
import com.android.installreferrer.api.InstallReferrerClient;

/* loaded from: classes.dex */
public final /* synthetic */ class CatchingFishKtorAdMobJUnit implements Runnable {
    public final /* synthetic */ Toolbar CatchingFishDaggerWebsocket;
    public final /* synthetic */ int CatchingFishReduxKtor;

    public /* synthetic */ CatchingFishKtorAdMobJUnit(Toolbar toolbar, int i) {
        this.CatchingFishReduxKtor = i;
        this.CatchingFishDaggerWebsocket = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                CatchingFishKtorUnitTesting catchingFishKtorUnitTesting = this.CatchingFishDaggerWebsocket.CatchingFishGradleManifest;
                CatchingFishKtorAdMob catchingFishKtorAdMob = catchingFishKtorUnitTesting == null ? null : catchingFishKtorUnitTesting.CatchingFishDaggerWebsocket;
                if (catchingFishKtorAdMob != null) {
                    catchingFishKtorAdMob.collapseActionView();
                    break;
                }
                break;
            default:
                this.CatchingFishDaggerWebsocket.CatchingFishOkHttp();
                break;
        }
    }
}
