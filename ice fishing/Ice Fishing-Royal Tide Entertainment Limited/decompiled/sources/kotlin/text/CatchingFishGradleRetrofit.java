package kotlin.text;

import com.android.installreferrer.api.InstallReferrerClient;

/* loaded from: classes.dex */
public final class CatchingFishGradleRetrofit extends CatchingFishViewWebsocket implements CatchingFishServiceHandler {
    public static final CatchingFishGradleRetrofit CatchingFishCloudMessaging;
    public static final CatchingFishGradleRetrofit CatchingFishEspressoTesting;
    public static final CatchingFishGradleRetrofit CatchingFishFragmentHandler;
    public static final CatchingFishGradleRetrofit CatchingFishLayout;
    public static final CatchingFishGradleRetrofit CatchingFishViewModelFAB;
    public static final CatchingFishGradleRetrofit CatchingFishViewModelScope;
    public static final CatchingFishGradleRetrofit CatchingFishWorkManager;
    public final /* synthetic */ int CatchingFishDaggerWebsocket;

    static {
        int i = 1;
        CatchingFishWorkManager = new CatchingFishGradleRetrofit(i, 0);
        CatchingFishViewModelScope = new CatchingFishGradleRetrofit(i, 1);
        CatchingFishViewModelFAB = new CatchingFishGradleRetrofit(i, 2);
        CatchingFishLayout = new CatchingFishGradleRetrofit(i, 3);
        CatchingFishFragmentHandler = new CatchingFishGradleRetrofit(i, 4);
        CatchingFishCloudMessaging = new CatchingFishGradleRetrofit(i, 5);
        CatchingFishEspressoTesting = new CatchingFishGradleRetrofit(i, 6);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CatchingFishGradleRetrofit(int i, int i2) {
        super(i);
        this.CatchingFishDaggerWebsocket = i2;
    }

    @Override // kotlin.text.CatchingFishServiceHandler
    public final Object CatchingFishFragmentHandler(Object obj) {
        int i = this.CatchingFishDaggerWebsocket;
        CatchingFishRealmContext catchingFishRealmContext = CatchingFishRealmContext.CatchingFishParcelableFAB;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return catchingFishRealmContext;
            case 1:
                return catchingFishRealmContext;
            case 2:
                throw null;
            case 3:
                CatchingFishMVPLiveData.CatchingFishDaggerHiltFAB(obj);
                throw null;
            case 4:
                return catchingFishRealmContext;
            case CatchingFishMoshiSpannable.STRING_FIELD_NUMBER /* 5 */:
                return catchingFishRealmContext;
            case CatchingFishMoshiSpannable.STRING_SET_FIELD_NUMBER /* 6 */:
                throw null;
            default:
                CatchingFishServiceMoshi[] catchingFishServiceMoshiArr = CatchingFishMVISharedFlow.CatchingFishParcelableFAB;
                CatchingFishGraphQLLayout catchingFishGraphQLLayout = CatchingFishServiceMVI.CatchingFishCoroutineFlow;
                CatchingFishServiceMoshi catchingFishServiceMoshi = CatchingFishMVISharedFlow.CatchingFishParcelableFAB[13];
                ((CatchingFishMVPMotionLayout) obj).CatchingFishDaggerWebsocket(catchingFishGraphQLLayout, new CatchingFishToastToastRoom());
                return catchingFishRealmContext;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CatchingFishGradleRetrofit(CatchingFishToastToastRoom catchingFishToastToastRoom) {
        super(1);
        this.CatchingFishDaggerWebsocket = 7;
    }
}
