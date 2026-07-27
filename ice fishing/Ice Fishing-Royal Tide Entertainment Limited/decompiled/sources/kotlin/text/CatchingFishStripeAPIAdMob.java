package kotlin.text;

import com.android.installreferrer.api.InstallReferrerClient;

/* loaded from: classes.dex */
public final class CatchingFishStripeAPIAdMob extends CatchingFishViewWebsocket implements CatchingFishJUnitGlide {
    public final /* synthetic */ int CatchingFishDaggerWebsocket;
    public final /* synthetic */ CatchingFishDaggerToolbar CatchingFishWorkManager;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CatchingFishStripeAPIAdMob(CatchingFishDaggerToolbar catchingFishDaggerToolbar, int i) {
        super(0);
        this.CatchingFishDaggerWebsocket = i;
        this.CatchingFishWorkManager = catchingFishDaggerToolbar;
    }

    @Override // kotlin.text.CatchingFishJUnitGlide
    public final Object CatchingFishParcelableFAB() {
        switch (this.CatchingFishDaggerWebsocket) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                CatchingFishDaggerToolbar catchingFishDaggerToolbar = this.CatchingFishWorkManager;
                CatchingFishOkHttpHandler catchingFishOkHttpHandler = catchingFishDaggerToolbar.CatchingFishJobScheduler;
                CatchingFishFirebaseDagger.CatchingFishAnimationMockk(catchingFishOkHttpHandler);
                catchingFishDaggerToolbar.CatchingFishGraphQLGlide(catchingFishOkHttpHandler, catchingFishDaggerToolbar.CatchingFishMutableLiveData);
                break;
            default:
                CatchingFishDaggerToolbar catchingFishDaggerToolbar2 = this.CatchingFishWorkManager.CatchingFish;
                if (catchingFishDaggerToolbar2 != null) {
                    catchingFishDaggerToolbar2.CatchingFishMVPHandler();
                }
                break;
        }
        return CatchingFishRealmContext.CatchingFishParcelableFAB;
    }
}
