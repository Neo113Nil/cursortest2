package kotlin.text;

import com.android.installreferrer.api.InstallReferrerClient;

/* loaded from: classes.dex */
public final class CatchingFishAdMob implements CatchingFishServiceHandler {
    public Object CatchingFishDaggerWebsocket;
    public final /* synthetic */ int CatchingFishReduxKtor;

    public /* synthetic */ CatchingFishAdMob() {
        this.CatchingFishReduxKtor = 2;
    }

    @Override // kotlin.text.CatchingFishServiceHandler
    public final Object CatchingFishFragmentHandler(Object obj) {
        long j;
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                String str = (String) obj;
                CatchingFishFirebaseDagger.CatchingFishNavigation(str, "value");
                CatchingFishKtorMockk catchingFishKtorMockk = (CatchingFishKtorMockk) this.CatchingFishDaggerWebsocket;
                if (catchingFishKtorMockk.CatchingFishParcelableFlux()) {
                    catchingFishKtorMockk.CatchingFishViewModelFAB(str);
                }
                return CatchingFishRealmContext.CatchingFishParcelableFAB;
            case 1:
                CatchingFishReduxSpannable catchingFishReduxSpannable = (CatchingFishReduxSpannable) obj;
                synchronized (CatchingFishIntentBundle.CatchingFishCoroutine) {
                    j = CatchingFishIntentBundle.CatchingFishDaggerWebsocket;
                    CatchingFishIntentBundle.CatchingFishDaggerWebsocket = 1 + j;
                }
                return new CatchingFishAdMobFABPayPal(j, catchingFishReduxSpannable, (CatchingFishServiceHandler) this.CatchingFishDaggerWebsocket);
            default:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                CatchingFishRealmStateFlow catchingFishRealmStateFlow = (CatchingFishRealmStateFlow) this.CatchingFishDaggerWebsocket;
                if (catchingFishRealmStateFlow != null) {
                    catchingFishRealmStateFlow.CatchingFishCoroutine = booleanValue;
                }
                return CatchingFishRealmContext.CatchingFishParcelableFAB;
        }
    }

    public /* synthetic */ CatchingFishAdMob(int i, Object obj) {
        this.CatchingFishReduxKtor = i;
        this.CatchingFishDaggerWebsocket = obj;
    }
}
