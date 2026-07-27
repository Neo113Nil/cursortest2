package kotlin.text;

import com.adjust.sdk.ActivityHandler;
import com.android.installreferrer.api.InstallReferrerClient;

/* loaded from: classes.dex */
public final /* synthetic */ class CatchingFishIntentSnackbar implements Runnable {
    public final /* synthetic */ ActivityHandler CatchingFishDaggerWebsocket;
    public final /* synthetic */ int CatchingFishReduxKtor;
    public final /* synthetic */ String CatchingFishViewModelScope;
    public final /* synthetic */ String CatchingFishWorkManager;

    public /* synthetic */ CatchingFishIntentSnackbar(ActivityHandler activityHandler, String str, String str2, int i) {
        this.CatchingFishReduxKtor = i;
        this.CatchingFishDaggerWebsocket = activityHandler;
        this.CatchingFishWorkManager = str;
        this.CatchingFishViewModelScope = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                this.CatchingFishDaggerWebsocket.lambda$addGlobalPartnerParameter$23(this.CatchingFishWorkManager, this.CatchingFishViewModelScope);
                break;
            default:
                this.CatchingFishDaggerWebsocket.lambda$addGlobalCallbackParameter$21(this.CatchingFishWorkManager, this.CatchingFishViewModelScope);
                break;
        }
    }
}
