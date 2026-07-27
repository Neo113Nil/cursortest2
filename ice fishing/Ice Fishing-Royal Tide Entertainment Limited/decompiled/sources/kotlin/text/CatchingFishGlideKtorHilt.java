package kotlin.text;

import android.content.SharedPreferences;

/* loaded from: classes.dex */
public final class CatchingFishGlideKtorHilt extends CatchingFishMVIBundle implements CatchingFishMockkView {
    public final /* synthetic */ String CatchingFishFragmentHandler;
    public final /* synthetic */ CatchingFishLiveDataWidget CatchingFishLayout;
    public int CatchingFishViewModelFAB;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CatchingFishGlideKtorHilt(CatchingFishLiveDataWidget catchingFishLiveDataWidget, String str, CatchingFishWebsocketGradle catchingFishWebsocketGradle) {
        super(2, catchingFishWebsocketGradle);
        this.CatchingFishLayout = catchingFishLiveDataWidget;
        this.CatchingFishFragmentHandler = str;
    }

    @Override // kotlin.text.CatchingFishMoshiCameraX
    public final CatchingFishWebsocketGradle CatchingFishCloudMessaging(Object obj, CatchingFishWebsocketGradle catchingFishWebsocketGradle) {
        return new CatchingFishGlideKtorHilt(this.CatchingFishLayout, this.CatchingFishFragmentHandler, catchingFishWebsocketGradle);
    }

    @Override // kotlin.text.CatchingFishMockkView
    public final Object CatchingFishDaggerWebsocket(Object obj, Object obj2) {
        return ((CatchingFishGlideKtorHilt) CatchingFishCloudMessaging((CatchingFishToastLayout) obj, (CatchingFishWebsocketGradle) obj2)).CatchingFishOkHttp(CatchingFishRealmContext.CatchingFishParcelableFAB);
    }

    @Override // kotlin.text.CatchingFishMoshiCameraX
    public final Object CatchingFishOkHttp(Object obj) {
        CatchingFishCoroutineIntent catchingFishExoPlayerGlide;
        int i = this.CatchingFishViewModelFAB;
        if (i == 0) {
            CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj);
            CatchingFishLiveDataWidget catchingFishLiveDataWidget = this.CatchingFishLayout;
            CatchingFishAsyncTaskDagger catchingFishAsyncTaskDagger = catchingFishLiveDataWidget.CatchingFishWorkManager;
            CatchingFishJUnitAsyncTask catchingFishJUnitAsyncTask = catchingFishLiveDataWidget.CatchingFishReduxKtor;
            String str = this.CatchingFishFragmentHandler;
            CatchingFishFirebaseDagger.CatchingFishNavigation(str, "address");
            if (str.length() == 0) {
                catchingFishExoPlayerGlide = CatchingFishViewModelMVVM.CatchingFishParcelableFAB;
            } else {
                SharedPreferences.Editor edit = catchingFishJUnitAsyncTask.CatchingFishParcelableFAB.CatchingFishParcelableFAB.edit();
                edit.putString("url", str);
                edit.apply();
                catchingFishExoPlayerGlide = new CatchingFishExoPlayerGlide(str);
            }
            this.CatchingFishViewModelFAB = 1;
            Object CatchingFishStateFlow = catchingFishAsyncTaskDagger.CatchingFishStateFlow(catchingFishExoPlayerGlide, this);
            CatchingFishXMLLayoutMockk catchingFishXMLLayoutMockk = CatchingFishXMLLayoutMockk.CatchingFishReduxKtor;
            if (CatchingFishStateFlow == catchingFishXMLLayoutMockk) {
                return catchingFishXMLLayoutMockk;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj);
        }
        return CatchingFishRealmContext.CatchingFishParcelableFAB;
    }
}
