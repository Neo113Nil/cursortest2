package kotlin.text;

import com.adjust.sdk.ActivityHandler;
import com.adjust.sdk.AdjustDeeplink;
import com.android.installreferrer.api.InstallReferrerClient;

/* loaded from: classes.dex */
public final /* synthetic */ class CatchingFishRoomRobolectric implements Runnable {
    public final /* synthetic */ ActivityHandler CatchingFishDaggerWebsocket;
    public final /* synthetic */ int CatchingFishReduxKtor;
    public final /* synthetic */ long CatchingFishViewModelScope;
    public final /* synthetic */ AdjustDeeplink CatchingFishWorkManager;

    public /* synthetic */ CatchingFishRoomRobolectric(ActivityHandler activityHandler, AdjustDeeplink adjustDeeplink, long j, int i) {
        this.CatchingFishReduxKtor = i;
        this.CatchingFishDaggerWebsocket = activityHandler;
        this.CatchingFishWorkManager = adjustDeeplink;
        this.CatchingFishViewModelScope = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                this.CatchingFishDaggerWebsocket.lambda$processDeeplink$13(this.CatchingFishWorkManager, this.CatchingFishViewModelScope);
                break;
            case 1:
                this.CatchingFishDaggerWebsocket.lambda$processDeeplink$12(this.CatchingFishWorkManager, this.CatchingFishViewModelScope);
                break;
            case 2:
                this.CatchingFishDaggerWebsocket.lambda$processAndResolveDeeplink$14(this.CatchingFishWorkManager, this.CatchingFishViewModelScope);
                break;
            default:
                this.CatchingFishDaggerWebsocket.lambda$processAndResolveDeeplink$15(this.CatchingFishWorkManager, this.CatchingFishViewModelScope);
                break;
        }
    }
}
