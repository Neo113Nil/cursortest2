package kotlin.text;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.MotionEvent;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes.dex */
public final class CatchingFishMVVM extends CatchingFishViewWebsocket implements CatchingFishServiceHandler {
    public final /* synthetic */ int CatchingFishDaggerWebsocket;
    public final /* synthetic */ Object CatchingFishWorkManager;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CatchingFishMVVM(int i, Object obj) {
        super(1);
        this.CatchingFishDaggerWebsocket = i;
        this.CatchingFishWorkManager = obj;
    }

    /* JADX WARN: Type inference failed for: r1v8, types: [kotlin.text.CatchingFishIntentAdMob, kotlin.text.CatchingFishPicassoMVI] */
    @Override // kotlin.text.CatchingFishServiceHandler
    public final Object CatchingFishFragmentHandler(Object obj) {
        switch (this.CatchingFishDaggerWebsocket) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                CatchingFishIntentAdMob catchingFishIntentAdMob = (CatchingFishIntentAdMob) obj;
                CatchingFishPayPalPayPal catchingFishPayPalPayPal = (CatchingFishPayPalPayPal) this.CatchingFishWorkManager;
                if (catchingFishIntentAdMob.CatchingFishPayPal()) {
                    if (catchingFishIntentAdMob.CatchingFishDagger().CatchingFishSnackbar) {
                        catchingFishIntentAdMob.CatchingFishParcelableFlux();
                    }
                    for (Map.Entry entry : catchingFishIntentAdMob.CatchingFishDagger().CatchingFishViewModelScope.entrySet()) {
                        CatchingFishPayPalPayPal.CatchingFishParcelableFAB(catchingFishPayPalPayPal, (CatchingFishMoshiMVVM) entry.getKey(), ((Number) entry.getValue()).intValue(), catchingFishIntentAdMob.CatchingFishJetpackCompose());
                    }
                    CatchingFishDaggerToolbar catchingFishDaggerToolbar = catchingFishIntentAdMob.CatchingFishJetpackCompose().CatchingFish;
                    CatchingFishFirebaseDagger.CatchingFishAnimationMockk(catchingFishDaggerToolbar);
                    while (!catchingFishDaggerToolbar.equals(catchingFishPayPalPayPal.CatchingFishParcelableFAB.CatchingFishJetpackCompose())) {
                        for (CatchingFishMoshiMVVM catchingFishMoshiMVVM : catchingFishPayPalPayPal.CatchingFishSnackbar(catchingFishDaggerToolbar).keySet()) {
                            CatchingFishPayPalPayPal.CatchingFishParcelableFAB(catchingFishPayPalPayPal, catchingFishMoshiMVVM, catchingFishPayPalPayPal.CatchingFishCoroutine(catchingFishDaggerToolbar, catchingFishMoshiMVVM), catchingFishDaggerToolbar);
                        }
                        catchingFishDaggerToolbar = catchingFishDaggerToolbar.CatchingFish;
                        CatchingFishFirebaseDagger.CatchingFishAnimationMockk(catchingFishDaggerToolbar);
                    }
                }
                return CatchingFishRealmContext.CatchingFishParcelableFAB;
            case 1:
                ((CatchingFishRoomGoogleMaps) this.CatchingFishWorkManager).CatchingFishReduxKtor = (CatchingFishAppCompatWidget) obj;
                return Boolean.TRUE;
            case 2:
                return Boolean.valueOf(((CatchingFishReduxLifecycle) this.CatchingFishWorkManager).CatchingFishParcelableFAB(((CatchingFishMVIGraphQLHilt) obj).CatchingFishViewModelScope));
            case 3:
                return Boolean.valueOf(CatchingFishGsonCardView.CatchingFishDaggerWebsocket((CatchingFishMVIGraphQLHilt) obj, (Resources) this.CatchingFishWorkManager));
            case 4:
                ((CatchingFishMockkManifest) this.CatchingFishWorkManager).setValue(new Configuration((Configuration) obj));
                return CatchingFishRealmContext.CatchingFishParcelableFAB;
            case CatchingFishMoshiSpannable.STRING_FIELD_NUMBER /* 5 */:
                return new CatchingFishIntentGradle((CatchingFishMVPFragment) this.CatchingFishWorkManager);
            case CatchingFishMoshiSpannable.STRING_SET_FIELD_NUMBER /* 6 */:
                ((CatchingFishBiometricRoom) this.CatchingFishWorkManager).CatchingFishRecyclerView((CatchingFishOkHttpFlux) obj);
                return CatchingFishRealmContext.CatchingFishParcelableFAB;
            case CatchingFishMoshiSpannable.DOUBLE_FIELD_NUMBER /* 7 */:
                Throwable th = (Throwable) obj;
                CatchingFishKtorView catchingFishKtorView = (CatchingFishKtorView) this.CatchingFishWorkManager;
                if (th != null) {
                    catchingFishKtorView.CatchingFishCloudMessaging.CatchingFishParcelableFlux(new CatchingFishCardViewMockk(th));
                }
                if (catchingFishKtorView.CatchingFishOkHttp.CatchingFishDaggerWebsocket != CatchingFishWidgetContext.CatchingFishEspressoTesting) {
                    ((CatchingFishAnimationAdMob) catchingFishKtorView.CatchingFishOkHttp.getValue()).close();
                }
                return CatchingFishRealmContext.CatchingFishParcelableFAB;
            case CatchingFishMoshiSpannable.BYTES_FIELD_NUMBER /* 8 */:
                CatchingFishMVPAdMobGraphQL catchingFishMVPAdMobGraphQL = (CatchingFishMVPAdMobGraphQL) obj;
                if (!catchingFishMVPAdMobGraphQL.CatchingFishRoomDatabase) {
                    return CatchingFishContextFluxGson.CatchingFishDaggerWebsocket;
                }
                if (catchingFishMVPAdMobGraphQL.CatchingFish != null) {
                    CatchingFishFluxGradle.CatchingFishSnackbar("DragAndDropTarget self reference must be null at the start of a drag and drop session");
                }
                catchingFishMVPAdMobGraphQL.CatchingFish = null;
                CatchingFishFragmentWidget catchingFishFragmentWidget = (CatchingFishFragmentWidget) this.CatchingFishWorkManager;
                catchingFishFragmentWidget.CatchingFishReduxKtor = catchingFishFragmentWidget.CatchingFishReduxKtor;
                return CatchingFishContextFluxGson.CatchingFishReduxKtor;
            case 9:
                CatchingFishContextFluxGson catchingFishContextFluxGson = CatchingFishContextFluxGson.CatchingFishReduxKtor;
                CatchingFishMVPAdMobGraphQL catchingFishMVPAdMobGraphQL2 = (CatchingFishMVPAdMobGraphQL) obj;
                if (!catchingFishMVPAdMobGraphQL2.CatchingFishReduxKtor.CatchingFishRoomDatabase) {
                    return CatchingFishContextFluxGson.CatchingFishDaggerWebsocket;
                }
                CatchingFishMVPAdMobGraphQL catchingFishMVPAdMobGraphQL3 = catchingFishMVPAdMobGraphQL2.CatchingFish;
                if (catchingFishMVPAdMobGraphQL3 != null) {
                    CatchingFishMVVM catchingFishMVVM = new CatchingFishMVVM(9, (CatchingFishViewPagerMockk) this.CatchingFishWorkManager);
                    if (catchingFishMVVM.CatchingFishFragmentHandler(catchingFishMVPAdMobGraphQL3) == catchingFishContextFluxGson) {
                        CatchingFishToastHiltBundle.CatchingFishFragmentFactory(catchingFishMVPAdMobGraphQL3, catchingFishMVVM);
                    }
                }
                catchingFishMVPAdMobGraphQL2.CatchingFish = null;
                catchingFishMVPAdMobGraphQL2.CatchingFishNavigation = null;
                return catchingFishContextFluxGson;
            case 10:
                CatchingFishRealmContext catchingFishRealmContext = CatchingFishRealmContext.CatchingFishParcelableFAB;
                if (CatchingFishHandlerFirebase.CatchingFishSnackbar.compareAndSet(false, true)) {
                    ((CatchingFishPicassoCameraX) this.CatchingFishWorkManager).CatchingFish(catchingFishRealmContext);
                }
                return catchingFishRealmContext;
            case 11:
                CatchingFishPicassoManifest catchingFishPicassoManifest = (CatchingFishPicassoManifest) obj;
                CatchingFishHiltMVI catchingFishHiltMVI = (CatchingFishHiltMVI) this.CatchingFishWorkManager;
                CatchingFishMoshiRealm catchingFishMoshiRealm = catchingFishHiltMVI.CatchingFishEspressoTesting;
                if (catchingFishHiltMVI.CatchingFishUnitTesting && catchingFishHiltMVI.CatchingFishSpannableWidget && catchingFishMoshiRealm != null) {
                    CatchingFishAsyncTaskDagger CatchingFishRoomDatabase = catchingFishPicassoManifest.CatchingFishRoomDatabase();
                    long CatchingFishDagger = CatchingFishRoomDatabase.CatchingFishDagger();
                    CatchingFishRoomDatabase.CatchingFishCardViewView().CatchingFishCloudMessaging();
                    try {
                        ((CatchingFishAsyncTaskDagger) ((CatchingFishServiceHilt) CatchingFishRoomDatabase.CatchingFishDaggerWebsocket).CatchingFishDaggerWebsocket).CatchingFishCardViewView().CatchingFishWorkManager(catchingFishMoshiRealm);
                        catchingFishHiltMVI.CatchingFishCoroutine(catchingFishPicassoManifest);
                    } finally {
                        CatchingFishRoomDatabase.CatchingFishCardViewView().CatchingFishLayout();
                        CatchingFishRoomDatabase.CatchingFishCustomViewJUnit(CatchingFishDagger);
                    }
                } else {
                    catchingFishHiltMVI.CatchingFishCoroutine(catchingFishPicassoManifest);
                }
                return CatchingFishRealmContext.CatchingFishParcelableFAB;
            case 12:
                CatchingFishPicassoManifest catchingFishPicassoManifest2 = (CatchingFishPicassoManifest) obj;
                CatchingFishMVVMFABFAB catchingFishMVVMFABFAB = (CatchingFishMVVMFABFAB) this.CatchingFishWorkManager;
                CatchingFishOkHttpHandler CatchingFishCardViewView = catchingFishPicassoManifest2.CatchingFishRoomDatabase().CatchingFishCardViewView();
                CatchingFishMockkView catchingFishMockkView = catchingFishMVVMFABFAB.CatchingFishViewModelScope;
                if (catchingFishMockkView != null) {
                    catchingFishMockkView.CatchingFishDaggerWebsocket(CatchingFishCardViewView, (CatchingFishHiltMVI) catchingFishPicassoManifest2.CatchingFishRoomDatabase().CatchingFishWorkManager);
                }
                return CatchingFishRealmContext.CatchingFishParcelableFAB;
            case 13:
                CatchingFishAdMobLiveData catchingFishAdMobLiveData = (CatchingFishAdMobLiveData) obj;
                CatchingFishGlideRoom catchingFishGlideRoom = (CatchingFishGlideRoom) this.CatchingFishWorkManager;
                catchingFishGlideRoom.CatchingFishViewModelScope(catchingFishAdMobLiveData);
                CatchingFishServiceHandler catchingFishServiceHandler = catchingFishGlideRoom.CatchingFishLayout;
                if (catchingFishServiceHandler != null) {
                    catchingFishServiceHandler.CatchingFishFragmentHandler(catchingFishAdMobLiveData);
                }
                return CatchingFishRealmContext.CatchingFishParcelableFAB;
            case 14:
                ((CatchingFishFABToast) this.CatchingFishWorkManager).CatchingFishSnackbar((CatchingFishJUnitLayout) obj);
                return Boolean.TRUE;
            case 15:
                ((CatchingFishOkHttpExoPlayer) ((CatchingFishRealmStateFlow) this.CatchingFishWorkManager).CatchingFishReduxKtor()).CatchingFishFragmentHandler((MotionEvent) obj);
                return CatchingFishRealmContext.CatchingFishParcelableFAB;
            case 16:
                CatchingFishMVVMCustomView catchingFishMVVMCustomView = new CatchingFishMVVMCustomView(((Number) ((CatchingFishJUnitGlide) this.CatchingFishWorkManager).CatchingFishParcelableFAB()).floatValue(), new CatchingFishManifestIntent(0.0f, 1.0f));
                CatchingFishServiceMoshi[] catchingFishServiceMoshiArr = CatchingFishMVISharedFlow.CatchingFishParcelableFAB;
                CatchingFishGraphQLLayout catchingFishGraphQLLayout = CatchingFishServiceMVI.CatchingFishCoroutine;
                CatchingFishServiceMoshi catchingFishServiceMoshi = CatchingFishMVISharedFlow.CatchingFishParcelableFAB[1];
                ((CatchingFishMVPMotionLayout) obj).CatchingFishDaggerWebsocket(catchingFishGraphQLLayout, catchingFishMVVMCustomView);
                return CatchingFishRealmContext.CatchingFishParcelableFAB;
            case 17:
                CatchingFishEspressoViewFAB catchingFishEspressoViewFAB = (CatchingFishEspressoViewFAB) obj;
                ArrayList arrayList = (ArrayList) this.CatchingFishWorkManager;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    CatchingFishEspressoViewFAB.CatchingFishAnimationMockk(catchingFishEspressoViewFAB, (CatchingFishPicassoMVI) arrayList.get(i));
                }
                return CatchingFishRealmContext.CatchingFishParcelableFAB;
            case 18:
                String str = (String) this.CatchingFishWorkManager;
                CatchingFishServiceMoshi[] catchingFishServiceMoshiArr2 = CatchingFishMVISharedFlow.CatchingFishParcelableFAB;
                ((CatchingFishMVPMotionLayout) obj).CatchingFishDaggerWebsocket(CatchingFishServiceMVI.CatchingFishParcelableFAB, CatchingFishGsonCardView.CatchingFishFragmentFactory(str));
                return CatchingFishRealmContext.CatchingFishParcelableFAB;
            default:
                CatchingFishMockkLiveData catchingFishMockkLiveData = (CatchingFishMockkLiveData) obj;
                CatchingFishViewPagerRoom catchingFishViewPagerRoom = (CatchingFishViewPagerRoom) this.CatchingFishWorkManager;
                float f = catchingFishViewPagerRoom.CatchingFishNavigation;
                if (catchingFishMockkLiveData.CatchingFishDaggerWebsocket != f) {
                    catchingFishMockkLiveData.CatchingFishReduxKtor |= 1;
                    catchingFishMockkLiveData.CatchingFishDaggerWebsocket = f;
                }
                float f2 = catchingFishViewPagerRoom.CatchingFish;
                if (catchingFishMockkLiveData.CatchingFishWorkManager != f2) {
                    catchingFishMockkLiveData.CatchingFishReduxKtor |= 2;
                    catchingFishMockkLiveData.CatchingFishWorkManager = f2;
                }
                float f3 = catchingFishViewPagerRoom.CatchingFishJetpackCompose;
                if (catchingFishMockkLiveData.CatchingFishViewModelScope != f3) {
                    catchingFishMockkLiveData.CatchingFishReduxKtor |= 4;
                    catchingFishMockkLiveData.CatchingFishViewModelScope = f3;
                }
                float f4 = catchingFishViewPagerRoom.CatchingFishCoroutineFlow;
                if (catchingFishMockkLiveData.CatchingFishFragmentHandler != f4) {
                    catchingFishMockkLiveData.CatchingFishReduxKtor |= 1024;
                    catchingFishMockkLiveData.CatchingFishFragmentHandler = f4;
                }
                float f5 = catchingFishViewPagerRoom.CatchingFishDaggerHiltFAB;
                if (catchingFishMockkLiveData.CatchingFishCloudMessaging != f5) {
                    catchingFishMockkLiveData.CatchingFishReduxKtor |= 2048;
                    catchingFishMockkLiveData.CatchingFishCloudMessaging = f5;
                }
                long j = catchingFishViewPagerRoom.CatchingFishSpannableWidget;
                long j2 = catchingFishMockkLiveData.CatchingFishEspressoTesting;
                int i2 = CatchingFishFABView.CatchingFishSnackbar;
                if (j2 != j) {
                    catchingFishMockkLiveData.CatchingFishReduxKtor |= 4096;
                    catchingFishMockkLiveData.CatchingFishEspressoTesting = j;
                }
                CatchingFishHiltMockkMVI catchingFishHiltMockkMVI = catchingFishViewPagerRoom.CatchingFishParcelableFlux;
                if (!CatchingFishFirebaseDagger.CatchingFishOkHttp(catchingFishMockkLiveData.CatchingFishOkHttp, catchingFishHiltMockkMVI)) {
                    catchingFishMockkLiveData.CatchingFishReduxKtor |= 8192;
                    catchingFishMockkLiveData.CatchingFishOkHttp = catchingFishHiltMockkMVI;
                }
                boolean z = catchingFishViewPagerRoom.CatchingFishGsonAppCompat;
                if (catchingFishMockkLiveData.CatchingFishUnitTesting != z) {
                    catchingFishMockkLiveData.CatchingFishReduxKtor |= 16384;
                    catchingFishMockkLiveData.CatchingFishUnitTesting = z;
                }
                long j3 = catchingFishViewPagerRoom.CatchingFishCardViewRealm;
                if (!CatchingFishToastFragment.CatchingFishCoroutine(catchingFishMockkLiveData.CatchingFishViewModelFAB, j3)) {
                    catchingFishMockkLiveData.CatchingFishReduxKtor |= 64;
                    catchingFishMockkLiveData.CatchingFishViewModelFAB = j3;
                }
                long j4 = catchingFishViewPagerRoom.CatchingFishPayPal;
                if (!CatchingFishToastFragment.CatchingFishCoroutine(catchingFishMockkLiveData.CatchingFishLayout, j4)) {
                    catchingFishMockkLiveData.CatchingFishReduxKtor |= 128;
                    catchingFishMockkLiveData.CatchingFishLayout = j4;
                }
                int i3 = catchingFishViewPagerRoom.CatchingFishCardViewView;
                if (catchingFishMockkLiveData.CatchingFishNavigation != i3) {
                    catchingFishMockkLiveData.CatchingFishReduxKtor |= 524288;
                    catchingFishMockkLiveData.CatchingFishNavigation = i3;
                }
                return CatchingFishRealmContext.CatchingFishParcelableFAB;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CatchingFishMVVM(CatchingFishViewPagerMockk catchingFishViewPagerMockk, CatchingFishMVPAdMobGraphQL catchingFishMVPAdMobGraphQL, CatchingFishFragmentWidget catchingFishFragmentWidget) {
        super(1);
        this.CatchingFishDaggerWebsocket = 8;
        this.CatchingFishWorkManager = catchingFishFragmentWidget;
    }
}
