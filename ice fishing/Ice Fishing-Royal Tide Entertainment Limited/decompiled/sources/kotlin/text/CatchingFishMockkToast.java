package kotlin.text;

import com.adjust.sdk.PurchaseVerificationHandler;
import com.android.installreferrer.api.InstallReferrerClient;

/* loaded from: classes.dex */
public final class CatchingFishMockkToast implements Runnable {
    public final /* synthetic */ PurchaseVerificationHandler CatchingFishDaggerWebsocket;
    public final /* synthetic */ int CatchingFishReduxKtor;

    public /* synthetic */ CatchingFishMockkToast(PurchaseVerificationHandler purchaseVerificationHandler, int i) {
        this.CatchingFishReduxKtor = i;
        this.CatchingFishDaggerWebsocket = purchaseVerificationHandler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                this.CatchingFishDaggerWebsocket.sendNextPurchaseVerificationPackageI();
                break;
            default:
                PurchaseVerificationHandler purchaseVerificationHandler = this.CatchingFishDaggerWebsocket;
                purchaseVerificationHandler.lastPackageRetryInMilli = 0L;
                purchaseVerificationHandler.sendNextPurchaseVerificationPackage();
                break;
        }
    }
}
