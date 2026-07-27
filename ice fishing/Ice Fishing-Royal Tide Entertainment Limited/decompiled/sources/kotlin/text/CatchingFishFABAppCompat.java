package kotlin.text;

import com.android.installreferrer.api.InstallReferrerClient;

/* loaded from: classes.dex */
public final class CatchingFishFABAppCompat extends CatchingFishViewWebsocket implements CatchingFishServiceHandler {
    public final /* synthetic */ int CatchingFishDaggerWebsocket;
    public final /* synthetic */ CatchingFishPicassoMVI CatchingFishWorkManager;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CatchingFishFABAppCompat(CatchingFishPicassoMVI catchingFishPicassoMVI, int i) {
        super(1);
        this.CatchingFishDaggerWebsocket = i;
        this.CatchingFishWorkManager = catchingFishPicassoMVI;
    }

    @Override // kotlin.text.CatchingFishServiceHandler
    public final Object CatchingFishFragmentHandler(Object obj) {
        switch (this.CatchingFishDaggerWebsocket) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                CatchingFishEspressoViewFAB.CatchingFishUnitTesting((CatchingFishEspressoViewFAB) obj, this.CatchingFishWorkManager, 0, 0);
                break;
            case 1:
                CatchingFishEspressoViewFAB.CatchingFishUnitTesting((CatchingFishEspressoViewFAB) obj, this.CatchingFishWorkManager, 0, 0);
                break;
            case 2:
                CatchingFishEspressoViewFAB.CatchingFishAnimationMockk((CatchingFishEspressoViewFAB) obj, this.CatchingFishWorkManager);
                break;
            case 3:
                CatchingFishEspressoViewFAB.CatchingFishCloudMessaging((CatchingFishEspressoViewFAB) obj, this.CatchingFishWorkManager, 0, 0);
                break;
            default:
                CatchingFishEspressoViewFAB.CatchingFishUnitTesting((CatchingFishEspressoViewFAB) obj, this.CatchingFishWorkManager, 0, 0);
                break;
        }
        return CatchingFishRealmContext.CatchingFishParcelableFAB;
    }
}
