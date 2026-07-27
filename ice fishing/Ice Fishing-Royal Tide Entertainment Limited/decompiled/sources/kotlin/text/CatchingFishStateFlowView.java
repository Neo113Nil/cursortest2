package kotlin.text;

import com.android.installreferrer.api.InstallReferrerClient;

/* loaded from: classes.dex */
public final /* synthetic */ class CatchingFishStateFlowView implements CatchingFishServiceHandler {
    public final /* synthetic */ CatchingFishServiceHandler CatchingFishDaggerWebsocket;
    public final /* synthetic */ int CatchingFishReduxKtor;
    public final /* synthetic */ CatchingFishServiceHandler CatchingFishWorkManager;

    public /* synthetic */ CatchingFishStateFlowView(CatchingFishServiceHandler catchingFishServiceHandler, CatchingFishServiceHandler catchingFishServiceHandler2, int i) {
        this.CatchingFishReduxKtor = i;
        this.CatchingFishDaggerWebsocket = catchingFishServiceHandler;
        this.CatchingFishWorkManager = catchingFishServiceHandler2;
    }

    @Override // kotlin.text.CatchingFishServiceHandler
    public final Object CatchingFishFragmentHandler(Object obj) {
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                this.CatchingFishDaggerWebsocket.CatchingFishFragmentHandler(obj);
                this.CatchingFishWorkManager.CatchingFishFragmentHandler(obj);
                break;
            default:
                this.CatchingFishDaggerWebsocket.CatchingFishFragmentHandler(obj);
                this.CatchingFishWorkManager.CatchingFishFragmentHandler(obj);
                break;
        }
        return CatchingFishRealmContext.CatchingFishParcelableFAB;
    }
}
