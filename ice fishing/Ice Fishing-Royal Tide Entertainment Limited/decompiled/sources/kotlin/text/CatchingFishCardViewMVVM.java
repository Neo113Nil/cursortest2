package kotlin.text;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final /* synthetic */ class CatchingFishCardViewMVVM implements CatchingFishGsonToast {
    public final /* synthetic */ CatchingFishBundleStateFlow CatchingFishDaggerWebsocket;
    public final /* synthetic */ TimeUnit CatchingFishLayout;
    public final /* synthetic */ int CatchingFishReduxKtor;
    public final /* synthetic */ long CatchingFishViewModelFAB;
    public final /* synthetic */ long CatchingFishViewModelScope;
    public final /* synthetic */ Runnable CatchingFishWorkManager;

    public /* synthetic */ CatchingFishCardViewMVVM(CatchingFishBundleStateFlow catchingFishBundleStateFlow, Runnable runnable, long j, long j2, TimeUnit timeUnit, int i) {
        this.CatchingFishReduxKtor = i;
        this.CatchingFishDaggerWebsocket = catchingFishBundleStateFlow;
        this.CatchingFishWorkManager = runnable;
        this.CatchingFishViewModelScope = j;
        this.CatchingFishViewModelFAB = j2;
        this.CatchingFishLayout = timeUnit;
    }

    @Override // kotlin.text.CatchingFishGsonToast
    public final ScheduledFuture CatchingFishSnackbar(CatchingFishViewPagerMockk catchingFishViewPagerMockk) {
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                CatchingFishBundleStateFlow catchingFishBundleStateFlow = this.CatchingFishDaggerWebsocket;
                return catchingFishBundleStateFlow.CatchingFishDaggerWebsocket.scheduleAtFixedRate(new CatchingFishDaggerXMLLayout(catchingFishBundleStateFlow, this.CatchingFishWorkManager, catchingFishViewPagerMockk, 0), this.CatchingFishViewModelScope, this.CatchingFishViewModelFAB, this.CatchingFishLayout);
            default:
                CatchingFishBundleStateFlow catchingFishBundleStateFlow2 = this.CatchingFishDaggerWebsocket;
                return catchingFishBundleStateFlow2.CatchingFishDaggerWebsocket.scheduleWithFixedDelay(new CatchingFishDaggerXMLLayout(catchingFishBundleStateFlow2, this.CatchingFishWorkManager, catchingFishViewPagerMockk, 2), this.CatchingFishViewModelScope, this.CatchingFishViewModelFAB, this.CatchingFishLayout);
        }
    }
}
