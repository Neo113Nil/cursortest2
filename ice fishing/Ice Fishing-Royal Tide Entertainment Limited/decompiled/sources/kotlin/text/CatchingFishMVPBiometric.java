package kotlin.text;

import android.graphics.Canvas;
import com.android.installreferrer.api.InstallReferrerClient;

/* loaded from: classes.dex */
public final class CatchingFishMVPBiometric extends CatchingFishViewWebsocket implements CatchingFishServiceHandler {
    public final /* synthetic */ int CatchingFishDaggerWebsocket;
    public final /* synthetic */ Object CatchingFishViewModelFAB;
    public final /* synthetic */ Object CatchingFishViewModelScope;
    public final /* synthetic */ Object CatchingFishWorkManager;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CatchingFishMVPBiometric(Object obj, Object obj2, Object obj3, int i) {
        super(1);
        this.CatchingFishDaggerWebsocket = i;
        this.CatchingFishWorkManager = obj;
        this.CatchingFishViewModelScope = obj2;
        this.CatchingFishViewModelFAB = obj3;
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [kotlin.text.CatchingFishServiceHandler, kotlin.text.CatchingFishViewWebsocket] */
    @Override // kotlin.text.CatchingFishServiceHandler
    public final Object CatchingFishFragmentHandler(Object obj) {
        boolean booleanValue;
        switch (this.CatchingFishDaggerWebsocket) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                CatchingFishReduxRetrofit catchingFishReduxRetrofit = (CatchingFishReduxRetrofit) this.CatchingFishWorkManager;
                CatchingFishBiometricRoom catchingFishBiometricRoom = (CatchingFishBiometricRoom) this.CatchingFishViewModelFAB;
                CatchingFishReduxRetrofit catchingFishReduxRetrofit2 = (CatchingFishReduxRetrofit) this.CatchingFishViewModelScope;
                CatchingFishOkHttpHandler CatchingFishCardViewView = ((CatchingFishPicassoManifest) obj).CatchingFishRoomDatabase().CatchingFishCardViewView();
                if (catchingFishReduxRetrofit.getView().getVisibility() != 8) {
                    catchingFishReduxRetrofit.CatchingFishPayPal = true;
                    CatchingFishAdMobJUnit catchingFishAdMobJUnit = catchingFishBiometricRoom.CatchingFishStateLiveData;
                    CatchingFishGradleCameraX catchingFishGradleCameraX = catchingFishAdMobJUnit instanceof CatchingFishGradleCameraX ? (CatchingFishGradleCameraX) catchingFishAdMobJUnit : null;
                    if (catchingFishGradleCameraX != null) {
                        Canvas CatchingFishParcelableFAB = CatchingFishLayout.CatchingFishParcelableFAB(CatchingFishCardViewView);
                        catchingFishGradleCameraX.getAndroidViewsHandler$ui_release().getClass();
                        catchingFishReduxRetrofit2.draw(CatchingFishParcelableFAB);
                    }
                    catchingFishReduxRetrofit.CatchingFishPayPal = false;
                }
                return CatchingFishRealmContext.CatchingFishParcelableFAB;
            case 1:
                CatchingFishIntentSpannable catchingFishIntentSpannable = (CatchingFishIntentSpannable) obj;
                CatchingFishMVPAdMobGraphQL catchingFishMVPAdMobGraphQL = (CatchingFishMVPAdMobGraphQL) catchingFishIntentSpannable;
                if (!((CatchingFishAppCompatMockk) ((CatchingFishGradleCameraX) CatchingFishXMLLayoutGlide.CatchingFishPayPalService((CatchingFishMVPAdMobGraphQL) this.CatchingFishViewModelScope)).m9getDragAndDropManager()).CatchingFishSnackbar.contains(catchingFishMVPAdMobGraphQL) || !CatchingFishXMLLayoutGlide.CatchingFishViewModelFAB(catchingFishMVPAdMobGraphQL, CatchingFishBiometricBundle.CatchingFishCoroutineFlow((CatchingFishViewPagerMockk) this.CatchingFishViewModelFAB))) {
                    return CatchingFishContextFluxGson.CatchingFishReduxKtor;
                }
                ((CatchingFishRoomGoogleMaps) this.CatchingFishWorkManager).CatchingFishReduxKtor = catchingFishIntentSpannable;
                return CatchingFishContextFluxGson.CatchingFishWorkManager;
            case 2:
                CatchingFishAppCompatWidget catchingFishAppCompatWidget = (CatchingFishAppCompatWidget) obj;
                if (CatchingFishFirebaseDagger.CatchingFishOkHttp(catchingFishAppCompatWidget, (CatchingFishAppCompatWidget) this.CatchingFishWorkManager)) {
                    booleanValue = false;
                } else {
                    if (CatchingFishFirebaseDagger.CatchingFishOkHttp(catchingFishAppCompatWidget, ((CatchingFishExoPlayerOkHttp) this.CatchingFishViewModelScope).CatchingFishCoroutine)) {
                        throw new IllegalStateException("Focus search landed at the root.");
                    }
                    booleanValue = ((Boolean) ((CatchingFishViewWebsocket) this.CatchingFishViewModelFAB).CatchingFishFragmentHandler(catchingFishAppCompatWidget)).booleanValue();
                }
                return Boolean.valueOf(booleanValue);
            default:
                CatchingFishPicassoMVI catchingFishPicassoMVI = (CatchingFishPicassoMVI) this.CatchingFishViewModelScope;
                CatchingFishEspressoViewFAB catchingFishEspressoViewFAB = (CatchingFishEspressoViewFAB) obj;
                CatchingFishWidgetXMLLayout catchingFishWidgetXMLLayout = (CatchingFishWidgetXMLLayout) this.CatchingFishViewModelFAB;
                CatchingFishParcelableRedux catchingFishParcelableRedux = (CatchingFishParcelableRedux) this.CatchingFishWorkManager;
                if (catchingFishParcelableRedux.CatchingFishDaggerHiltFAB) {
                    CatchingFishEspressoViewFAB.CatchingFishUnitTesting(catchingFishEspressoViewFAB, catchingFishPicassoMVI, catchingFishWidgetXMLLayout.CatchingFishDaggerHiltFAB(catchingFishParcelableRedux.CatchingFishNavigation), catchingFishWidgetXMLLayout.CatchingFishDaggerHiltFAB(catchingFishParcelableRedux.CatchingFish));
                } else {
                    CatchingFishEspressoViewFAB.CatchingFishCloudMessaging(catchingFishEspressoViewFAB, catchingFishPicassoMVI, catchingFishWidgetXMLLayout.CatchingFishDaggerHiltFAB(catchingFishParcelableRedux.CatchingFishNavigation), catchingFishWidgetXMLLayout.CatchingFishDaggerHiltFAB(catchingFishParcelableRedux.CatchingFish));
                }
                return CatchingFishRealmContext.CatchingFishParcelableFAB;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CatchingFishMVPBiometric(CatchingFishAppCompatWidget catchingFishAppCompatWidget, CatchingFishExoPlayerOkHttp catchingFishExoPlayerOkHttp, CatchingFishServiceHandler catchingFishServiceHandler) {
        super(1);
        this.CatchingFishDaggerWebsocket = 2;
        this.CatchingFishWorkManager = catchingFishAppCompatWidget;
        this.CatchingFishViewModelScope = catchingFishExoPlayerOkHttp;
        this.CatchingFishViewModelFAB = (CatchingFishViewWebsocket) catchingFishServiceHandler;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CatchingFishMVPBiometric(CatchingFishReduxRetrofit catchingFishReduxRetrofit, CatchingFishBiometricRoom catchingFishBiometricRoom, CatchingFishReduxRetrofit catchingFishReduxRetrofit2) {
        super(1);
        this.CatchingFishDaggerWebsocket = 0;
        this.CatchingFishWorkManager = catchingFishReduxRetrofit;
        this.CatchingFishViewModelFAB = catchingFishBiometricRoom;
        this.CatchingFishViewModelScope = catchingFishReduxRetrofit2;
    }
}
