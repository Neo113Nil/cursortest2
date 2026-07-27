package kotlin.text;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Map;

/* loaded from: classes.dex */
public final /* synthetic */ class CatchingFishCoroutineBundle implements CatchingFishMVPStripeAPI {
    public final /* synthetic */ int CatchingFishParcelableFAB;

    @Override // kotlin.text.CatchingFishViewKtor
    public final void CatchingFishParcelableFAB(Object obj, Object obj2) {
        switch (this.CatchingFishParcelableFAB) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                throw new CatchingFishStripeAPIWidget("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                CatchingFishSnackbarWidget catchingFishSnackbarWidget = (CatchingFishSnackbarWidget) obj2;
                catchingFishSnackbarWidget.CatchingFishDaggerWebsocket(CatchingFishAndroidXGson.CatchingFishViewModelScope, entry.getKey());
                catchingFishSnackbarWidget.CatchingFishDaggerWebsocket(CatchingFishAndroidXGson.CatchingFishViewModelFAB, entry.getValue());
                return;
            default:
                throw new CatchingFishStripeAPIWidget("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }
    }
}
