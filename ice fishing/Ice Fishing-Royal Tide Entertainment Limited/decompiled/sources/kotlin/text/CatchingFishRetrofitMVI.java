package kotlin.text;

import com.android.installreferrer.api.InstallReferrerClient;

/* loaded from: classes.dex */
public final class CatchingFishRetrofitMVI extends CatchingFishViewWebsocket implements CatchingFishJUnitGlide {
    public final /* synthetic */ int CatchingFishDaggerWebsocket;
    public final /* synthetic */ Object CatchingFishViewModelFAB;
    public final /* synthetic */ Object CatchingFishViewModelScope;
    public final /* synthetic */ Object CatchingFishWorkManager;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CatchingFishRetrofitMVI(Object obj, Object obj2, Object obj3, int i) {
        super(0);
        this.CatchingFishDaggerWebsocket = i;
        this.CatchingFishWorkManager = obj;
        this.CatchingFishViewModelScope = obj2;
        this.CatchingFishViewModelFAB = obj3;
    }

    @Override // kotlin.text.CatchingFishJUnitGlide
    public final Object CatchingFishParcelableFAB() {
        switch (this.CatchingFishDaggerWebsocket) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                CatchingFishRoomGoogleMaps catchingFishRoomGoogleMaps = (CatchingFishRoomGoogleMaps) this.CatchingFishWorkManager;
                CatchingFishHiltMockkMVI catchingFishHiltMockkMVI = ((CatchingFishViewModelOkHttp) this.CatchingFishViewModelScope).CatchingFish;
                CatchingFishDaggerHiltJUnit catchingFishDaggerHiltJUnit = (CatchingFishDaggerHiltJUnit) this.CatchingFishViewModelFAB;
                catchingFishRoomGoogleMaps.CatchingFishReduxKtor = catchingFishHiltMockkMVI.CatchingFishParcelableFAB(catchingFishDaggerHiltJUnit.CatchingFishReduxKtor.CatchingFishNavigation(), catchingFishDaggerHiltJUnit.getLayoutDirection(), catchingFishDaggerHiltJUnit);
                break;
            default:
                CatchingFishSnackbar catchingFishSnackbar = (CatchingFishSnackbar) this.CatchingFishWorkManager;
                catchingFishSnackbar.removeOnAttachStateChangeListener((CatchingFishToastWidget) this.CatchingFishViewModelScope);
                CatchingFishAsyncTaskWidget catchingFishAsyncTaskWidget = (CatchingFishAsyncTaskWidget) this.CatchingFishViewModelFAB;
                CatchingFishFirebaseDagger.CatchingFishNavigation(catchingFishAsyncTaskWidget, "listener");
                CatchingFishDaggerBiometric.CatchingFishCoroutineFlow(catchingFishSnackbar).CatchingFishParcelableFAB.remove(catchingFishAsyncTaskWidget);
                break;
        }
        return CatchingFishRealmContext.CatchingFishParcelableFAB;
    }
}
