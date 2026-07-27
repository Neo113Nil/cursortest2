package kotlin.text;

import android.os.Build;
import android.os.StrictMode;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.messaging.FirebaseMessaging;

/* loaded from: classes.dex */
public final /* synthetic */ class CatchingFishCardViewPicasso implements CatchingFishLiveDataHandler {
    public final /* synthetic */ int CatchingFishParcelableFAB;

    public /* synthetic */ CatchingFishCardViewPicasso(int i) {
        this.CatchingFishParcelableFAB = i;
    }

    @Override // kotlin.text.CatchingFishLiveDataHandler
    public final Object get() {
        switch (this.CatchingFishParcelableFAB) {
            case 1:
                CatchingFishWebsocketOkHttp catchingFishWebsocketOkHttp = ExecutorsRegistrar.CatchingFishParcelableFAB;
                StrictMode.ThreadPolicy.Builder detectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
                int i = Build.VERSION.SDK_INT;
                detectNetwork.detectResourceMismatches();
                if (i >= 26) {
                    detectNetwork.detectUnbufferedIo();
                }
                break;
            case 2:
                CatchingFishWebsocketOkHttp catchingFishWebsocketOkHttp2 = ExecutorsRegistrar.CatchingFishParcelableFAB;
                break;
            case 3:
                CatchingFishWebsocketOkHttp catchingFishWebsocketOkHttp3 = ExecutorsRegistrar.CatchingFishParcelableFAB;
                break;
            case 4:
                CatchingFishWebsocketOkHttp catchingFishWebsocketOkHttp4 = ExecutorsRegistrar.CatchingFishParcelableFAB;
                break;
            case CatchingFishMoshiSpannable.STRING_FIELD_NUMBER /* 5 */:
                CatchingFishMVPMVPViewModel catchingFishMVPMVPViewModel = FirebaseMessaging.CatchingFishCloudMessaging;
                break;
        }
        return null;
    }
}
