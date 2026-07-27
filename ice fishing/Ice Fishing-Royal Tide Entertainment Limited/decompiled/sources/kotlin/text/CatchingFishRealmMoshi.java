package kotlin.text;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class CatchingFishRealmMoshi implements Runnable {
    public final /* synthetic */ CatchingFishMVPDatabinding CatchingFishDaggerWebsocket;
    public final /* synthetic */ int CatchingFishReduxKtor;
    public final /* synthetic */ CatchingFishMoshiGraphQL CatchingFishWorkManager;

    public /* synthetic */ CatchingFishRealmMoshi(CatchingFishMoshiGraphQL catchingFishMoshiGraphQL, CatchingFishMVPDatabinding catchingFishMVPDatabinding, int i) {
        this.CatchingFishReduxKtor = i;
        this.CatchingFishWorkManager = catchingFishMoshiGraphQL;
        this.CatchingFishDaggerWebsocket = catchingFishMVPDatabinding;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ArrayList arrayList = this.CatchingFishWorkManager.CatchingFishSnackbar;
                CatchingFishMVPDatabinding catchingFishMVPDatabinding = this.CatchingFishDaggerWebsocket;
                if (arrayList.contains(catchingFishMVPDatabinding)) {
                    CatchingFishMVPLiveData.CatchingFishParcelableFAB(catchingFishMVPDatabinding.CatchingFishCoroutine.CatchingFishPayPalService, catchingFishMVPDatabinding.CatchingFishParcelableFAB);
                    break;
                }
                break;
            default:
                CatchingFishMoshiGraphQL catchingFishMoshiGraphQL = this.CatchingFishWorkManager;
                ArrayList arrayList2 = catchingFishMoshiGraphQL.CatchingFishSnackbar;
                CatchingFishMVPDatabinding catchingFishMVPDatabinding2 = this.CatchingFishDaggerWebsocket;
                arrayList2.remove(catchingFishMVPDatabinding2);
                catchingFishMoshiGraphQL.CatchingFishCoroutine.remove(catchingFishMVPDatabinding2);
                break;
        }
    }
}
