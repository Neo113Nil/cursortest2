package kotlin.text;

import com.adjust.sdk.ActivityHandler;
import com.adjust.sdk.AdjustEvent;
import com.adjust.sdk.OnPurchaseVerificationFinishedListener;
import com.android.installreferrer.api.InstallReferrerClient;

/* loaded from: classes.dex */
public final /* synthetic */ class CatchingFishRoomFragment implements Runnable {
    public final /* synthetic */ ActivityHandler CatchingFishDaggerWebsocket;
    public final /* synthetic */ int CatchingFishReduxKtor;
    public final /* synthetic */ OnPurchaseVerificationFinishedListener CatchingFishViewModelScope;
    public final /* synthetic */ AdjustEvent CatchingFishWorkManager;

    public /* synthetic */ CatchingFishRoomFragment(ActivityHandler activityHandler, AdjustEvent adjustEvent, OnPurchaseVerificationFinishedListener onPurchaseVerificationFinishedListener, int i) {
        this.CatchingFishReduxKtor = i;
        this.CatchingFishDaggerWebsocket = activityHandler;
        this.CatchingFishWorkManager = adjustEvent;
        this.CatchingFishViewModelScope = onPurchaseVerificationFinishedListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                this.CatchingFishDaggerWebsocket.lambda$verifyAndTrackPlayStorePurchase$46(this.CatchingFishWorkManager, this.CatchingFishViewModelScope);
                break;
            default:
                this.CatchingFishDaggerWebsocket.lambda$verifyAndTrackPlayStorePurchase$47(this.CatchingFishWorkManager, this.CatchingFishViewModelScope);
                break;
        }
    }
}
