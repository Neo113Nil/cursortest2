package kotlin.text;

import android.window.OnBackInvokedCallback;
import com.android.installreferrer.api.InstallReferrerClient;

/* loaded from: classes.dex */
public final /* synthetic */ class CatchingFishKtorParcelable implements OnBackInvokedCallback {
    public final /* synthetic */ int CatchingFishParcelableFAB;
    public final /* synthetic */ Object CatchingFishSnackbar;

    public /* synthetic */ CatchingFishKtorParcelable(int i, Object obj) {
        this.CatchingFishParcelableFAB = i;
        this.CatchingFishSnackbar = obj;
    }

    public final void onBackInvoked() {
        switch (this.CatchingFishParcelableFAB) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((CatchingFishMockkWidgetKtor) this.CatchingFishSnackbar).CatchingFishCardViewView();
                break;
            case 1:
                ((CatchingFishWidgetFirebase) this.CatchingFishSnackbar).CatchingFishParcelableFAB();
                break;
            default:
                ((Runnable) this.CatchingFishSnackbar).run();
                break;
        }
    }
}
