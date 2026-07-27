package kotlin.text;

import com.adjust.sdk.ActivityHandler;
import com.adjust.sdk.AdjustPlayStorePurchase;
import com.adjust.sdk.OnPurchaseVerificationFinishedListener;
import com.android.installreferrer.api.InstallReferrerClient;

/* loaded from: classes.dex */
public final /* synthetic */ class CatchingFishXMLLayout implements Runnable {
    public final /* synthetic */ ActivityHandler CatchingFishDaggerWebsocket;
    public final /* synthetic */ int CatchingFishReduxKtor;
    public final /* synthetic */ OnPurchaseVerificationFinishedListener CatchingFishViewModelScope;
    public final /* synthetic */ AdjustPlayStorePurchase CatchingFishWorkManager;

    public /* synthetic */ CatchingFishXMLLayout(ActivityHandler activityHandler, AdjustPlayStorePurchase adjustPlayStorePurchase, OnPurchaseVerificationFinishedListener onPurchaseVerificationFinishedListener, int i) {
        this.CatchingFishReduxKtor = i;
        this.CatchingFishDaggerWebsocket = activityHandler;
        this.CatchingFishWorkManager = adjustPlayStorePurchase;
        this.CatchingFishViewModelScope = onPurchaseVerificationFinishedListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                this.CatchingFishDaggerWebsocket.lambda$verifyPlayStorePurchase$44(this.CatchingFishWorkManager, this.CatchingFishViewModelScope);
                break;
            default:
                this.CatchingFishDaggerWebsocket.lambda$verifyPlayStorePurchase$45(this.CatchingFishWorkManager, this.CatchingFishViewModelScope);
                break;
        }
    }
}
