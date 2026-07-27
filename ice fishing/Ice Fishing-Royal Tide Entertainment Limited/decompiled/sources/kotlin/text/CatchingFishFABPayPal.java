package kotlin.text;

import com.android.installreferrer.api.InstallReferrerClient;

/* loaded from: classes.dex */
public final class CatchingFishFABPayPal extends CatchingFishViewWebsocket implements CatchingFishServiceHandler {
    public final /* synthetic */ int CatchingFishDaggerWebsocket;
    public final /* synthetic */ CatchingFishMVIFragment CatchingFishWorkManager;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CatchingFishFABPayPal(CatchingFishMVIFragment catchingFishMVIFragment, int i) {
        super(1);
        this.CatchingFishDaggerWebsocket = i;
        this.CatchingFishWorkManager = catchingFishMVIFragment;
    }

    @Override // kotlin.text.CatchingFishServiceHandler
    public final Object CatchingFishFragmentHandler(Object obj) {
        switch (this.CatchingFishDaggerWebsocket) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                double doubleValue = ((Number) obj).doubleValue();
                return Double.valueOf(this.CatchingFishWorkManager.CatchingFishUnitTesting.CatchingFishCoroutine(CatchingFishOkHttpFAB.CatchingFishViewModelFAB(doubleValue, r10.CatchingFishDaggerWebsocket, r10.CatchingFishWorkManager)));
            default:
                return Double.valueOf(CatchingFishOkHttpFAB.CatchingFishViewModelFAB(this.CatchingFishWorkManager.CatchingFishCloudMessaging.CatchingFishCoroutine(((Number) obj).doubleValue()), r10.CatchingFishDaggerWebsocket, r10.CatchingFishWorkManager));
        }
    }
}
