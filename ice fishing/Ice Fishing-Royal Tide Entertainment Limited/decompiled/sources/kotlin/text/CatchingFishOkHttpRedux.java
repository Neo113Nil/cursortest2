package kotlin.text;

import android.content.Context;
import android.graphics.Rect;
import android.view.Choreographer;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class CatchingFishOkHttpRedux extends CatchingFishViewWebsocket implements CatchingFishServiceHandler {
    public final /* synthetic */ int CatchingFishDaggerWebsocket;
    public final /* synthetic */ Object CatchingFishViewModelScope;
    public final /* synthetic */ Object CatchingFishWorkManager;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CatchingFishOkHttpRedux(int i, Object obj, Object obj2) {
        super(1);
        this.CatchingFishDaggerWebsocket = i;
        this.CatchingFishWorkManager = obj;
        this.CatchingFishViewModelScope = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.text.CatchingFishServiceHandler
    public final Object CatchingFishFragmentHandler(Object obj) {
        View CatchingFishCardViewRealm;
        CatchingFishRealmContext catchingFishRealmContext;
        Object[] objArr;
        View view = null;
        int i = 3;
        int i2 = 2;
        int i3 = 1;
        switch (this.CatchingFishDaggerWebsocket) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                Context context = (Context) this.CatchingFishWorkManager;
                Context applicationContext = context.getApplicationContext();
                CatchingFishGlideGoogleMaps catchingFishGlideGoogleMaps = (CatchingFishGlideGoogleMaps) this.CatchingFishViewModelScope;
                applicationContext.registerComponentCallbacks(catchingFishGlideGoogleMaps);
                return new CatchingFishMockkViewPager(r8 ? 1 : 0, context, catchingFishGlideGoogleMaps);
            case 1:
                Context context2 = (Context) this.CatchingFishWorkManager;
                Context applicationContext2 = context2.getApplicationContext();
                CatchingFishGraphQL catchingFishGraphQL = (CatchingFishGraphQL) this.CatchingFishViewModelScope;
                applicationContext2.registerComponentCallbacks(catchingFishGraphQL);
                return new CatchingFishMockkViewPager(i3, context2, catchingFishGraphQL);
            case 2:
                CatchingFishContextFragment catchingFishContextFragment = (CatchingFishContextFragment) this.CatchingFishWorkManager;
                CatchingFishJUnit catchingFishJUnit = (CatchingFishJUnit) this.CatchingFishViewModelScope;
                synchronized (catchingFishContextFragment.CatchingFishViewModelFAB) {
                    catchingFishContextFragment.CatchingFishFragmentHandler.remove(catchingFishJUnit);
                }
                return CatchingFishRealmContext.CatchingFishParcelableFAB;
            case 3:
                ((Choreographer) ((CatchingFishWebsocketWidget) this.CatchingFishWorkManager).CatchingFishDaggerWebsocket).removeFrameCallback((CatchingFishJUnit) this.CatchingFishViewModelScope);
                return CatchingFishRealmContext.CatchingFishParcelableFAB;
            case 4:
                ((CatchingFishBiometricRoom) this.CatchingFishWorkManager).CatchingFishStateFlow(((CatchingFishBundleAnimation) obj).CatchingFishCoroutine((CatchingFishBundleAnimation) this.CatchingFishViewModelScope));
                return CatchingFishRealmContext.CatchingFishParcelableFAB;
            case CatchingFishMoshiSpannable.STRING_FIELD_NUMBER /* 5 */:
                View view2 = (View) obj;
                View view3 = (View) this.CatchingFishWorkManager;
                CatchingFishExoPlayerKtor catchingFishExoPlayerKtor = new CatchingFishExoPlayerKtor(view2.getNextFocusForwardId(), i3);
                View view4 = null;
                while (true) {
                    CatchingFishCardViewRealm = CatchingFishLayoutRoomFAB.CatchingFishCardViewRealm(view2, catchingFishExoPlayerKtor, view4);
                    if (CatchingFishCardViewRealm == null && view2 != view3) {
                        ViewParent parent = view2.getParent();
                        if (parent != null && (parent instanceof View)) {
                            View view5 = (View) parent;
                            view4 = view2;
                            view2 = view5;
                        }
                    }
                }
                view = CatchingFishCardViewRealm;
                return Boolean.valueOf(view == ((View) this.CatchingFishViewModelScope));
            case CatchingFishMoshiSpannable.STRING_SET_FIELD_NUMBER /* 6 */:
                CatchingFishMVPWidget catchingFishMVPWidget = (CatchingFishMVPWidget) this.CatchingFishWorkManager;
                CatchingFishHiltFlux catchingFishHiltFlux = (CatchingFishHiltFlux) this.CatchingFishViewModelScope;
                catchingFishMVPWidget.CatchingFishParcelableFAB.CatchingFishSnackbar(catchingFishHiltFlux);
                catchingFishMVPWidget.CatchingFishSnackbar.setValue(Boolean.TRUE);
                return new CatchingFishMockkViewPager(i2, catchingFishMVPWidget, catchingFishHiltFlux);
            case CatchingFishMoshiSpannable.DOUBLE_FIELD_NUMBER /* 7 */:
                MotionEvent motionEvent = (MotionEvent) obj;
                CatchingFishRealmStateFlow catchingFishRealmStateFlow = (CatchingFishRealmStateFlow) this.CatchingFishViewModelScope;
                if (motionEvent.getActionMasked() == 0) {
                    ((CatchingFishFluxFluxBundle) this.CatchingFishWorkManager).CatchingFishDaggerWebsocket = ((Boolean) ((CatchingFishOkHttpExoPlayer) catchingFishRealmStateFlow.CatchingFishReduxKtor()).CatchingFishFragmentHandler(motionEvent)).booleanValue() ? CatchingFishLayoutWebSocket.CatchingFishDaggerWebsocket : CatchingFishLayoutWebSocket.CatchingFishWorkManager;
                } else {
                    ((CatchingFishOkHttpExoPlayer) catchingFishRealmStateFlow.CatchingFishReduxKtor()).CatchingFishFragmentHandler(motionEvent);
                }
                return CatchingFishRealmContext.CatchingFishParcelableFAB;
            case CatchingFishMoshiSpannable.BYTES_FIELD_NUMBER /* 8 */:
                CatchingFishFABDataStore catchingFishFABDataStore = (CatchingFishFABDataStore) obj;
                CatchingFishViewToast catchingFishViewToast = (CatchingFishViewToast) this.CatchingFishWorkManager;
                if (catchingFishViewToast.CatchingFishNavigation.CatchingFishFragmentHandler.CatchingFishViewModelScope() > 0) {
                    catchingFishFABDataStore.CatchingFishReduxKtor = true;
                    CatchingFishWidgetXMLLayout catchingFishWidgetXMLLayout = catchingFishFABDataStore.CatchingFishViewModelScope;
                    CatchingFishMockkCoroutine CatchingFishStripeAPI = catchingFishWidgetXMLLayout.CatchingFishStripeAPI();
                    if (CatchingFishFirebaseDagger.CatchingFishCardViewView(catchingFishFABDataStore.CatchingFishDaggerWebsocket, 9223372034707292159L)) {
                        catchingFishFABDataStore.CatchingFishDaggerWebsocket = CatchingFishLayoutRoomFAB.CatchingFishStripeAPI(CatchingFishStripeAPI.CatchingFishParcelableFAB(0L));
                        catchingFishFABDataStore.CatchingFishWorkManager = CatchingFishStripeAPI.CatchingFishSensorManager();
                    }
                    catchingFishWidgetXMLLayout.CatchingFishAndroidX().CatchingFishPayPalService.CatchingFishSnackbar();
                    long CatchingFishSensorManager = CatchingFishStripeAPI.CatchingFishSensorManager();
                    CatchingFishPayPalService catchingFishPayPalService = ((CatchingFishXMLLayoutRoom) this.CatchingFishViewModelScope).CatchingFishLayout;
                    int i4 = (int) (CatchingFishSensorManager >> 32);
                    int i5 = (int) (4294967295L & CatchingFishSensorManager);
                    CatchingFishRealmMVP[] catchingFishRealmMVPArr = androidx.compose.ui.layout.CatchingFishViewPagerToast.CatchingFishSnackbar;
                    int length = catchingFishRealmMVPArr.length;
                    int i6 = 0;
                    while (i6 < length) {
                        CatchingFishRealmMVP catchingFishRealmMVP = catchingFishRealmMVPArr[i6];
                        Object CatchingFishViewModelScope = catchingFishPayPalService.CatchingFishViewModelScope(catchingFishRealmMVP);
                        CatchingFishFirebaseDagger.CatchingFishAnimationMockk(CatchingFishViewModelScope);
                        CatchingFishMVVMPayPalHilt catchingFishMVVMPayPalHilt = (CatchingFishMVVMPayPalHilt) CatchingFishViewModelScope;
                        CatchingFishViewReduxIntent catchingFishViewReduxIntent = (CatchingFishViewReduxIntent) catchingFishRealmMVP;
                        CatchingFishFABDataStore catchingFishFABDataStore2 = catchingFishFABDataStore;
                        androidx.compose.ui.layout.CatchingFishViewPagerToast.CatchingFishParcelableFAB(catchingFishFABDataStore2, catchingFishViewReduxIntent.CatchingFishCoroutine, catchingFishMVVMPayPalHilt.CatchingFishViewModelFAB, i4, i5);
                        if (((Boolean) catchingFishMVVMPayPalHilt.CatchingFishSnackbar.getValue()).booleanValue()) {
                            androidx.compose.ui.layout.CatchingFishViewPagerToast.CatchingFishParcelableFAB(catchingFishFABDataStore2, catchingFishMVVMPayPalHilt.CatchingFishWorkManager, catchingFishMVVMPayPalHilt.CatchingFishFragmentHandler, i4, i5);
                            androidx.compose.ui.layout.CatchingFishViewPagerToast.CatchingFishParcelableFAB(catchingFishFABDataStore2, catchingFishMVVMPayPalHilt.CatchingFishViewModelScope, catchingFishMVVMPayPalHilt.CatchingFishCloudMessaging, i4, i5);
                        }
                        androidx.compose.ui.layout.CatchingFishViewPagerToast.CatchingFishParcelableFAB(catchingFishFABDataStore2, catchingFishViewReduxIntent.CatchingFishReduxKtor, catchingFishMVVMPayPalHilt.CatchingFishLayout, i4, i5);
                        i6++;
                        catchingFishFABDataStore = catchingFishFABDataStore2;
                    }
                    CatchingFishFABDataStore catchingFishFABDataStore3 = catchingFishFABDataStore;
                    if (catchingFishViewToast.CatchingFishNavigation.CatchingFishCloudMessaging.CatchingFishViewModelFAB()) {
                        CatchingFishBundleGradle catchingFishBundleGradle = catchingFishViewToast.CatchingFishNavigation.CatchingFishCloudMessaging;
                        Object[] objArr2 = catchingFishBundleGradle.CatchingFishParcelableFAB;
                        int i7 = catchingFishBundleGradle.CatchingFishSnackbar;
                        for (int i8 = 0; i8 < i7; i8++) {
                            CatchingFishMockkManifest catchingFishMockkManifest = (CatchingFishMockkManifest) objArr2[i8];
                            CatchingFishJUnitCustomView catchingFishJUnitCustomView = (CatchingFishJUnitCustomView) catchingFishViewToast.CatchingFishNavigation.CatchingFishEspressoTesting.get(i8);
                            Rect rect = (Rect) catchingFishMockkManifest.getValue();
                            catchingFishFABDataStore3.CatchingFishParcelableFAB(catchingFishJUnitCustomView.CatchingFishSnackbar(), rect.left);
                            catchingFishFABDataStore3.CatchingFishParcelableFAB(catchingFishJUnitCustomView.CatchingFishReduxKtor(), rect.top);
                            catchingFishFABDataStore3.CatchingFishParcelableFAB(catchingFishJUnitCustomView.CatchingFishCoroutine(), rect.right);
                            catchingFishFABDataStore3.CatchingFishParcelableFAB(catchingFishJUnitCustomView.CatchingFishParcelableFAB(), rect.bottom);
                        }
                    }
                }
                return CatchingFishRealmContext.CatchingFishParcelableFAB;
            case 9:
                CatchingFishRealmContext catchingFishRealmContext2 = CatchingFishRealmContext.CatchingFishParcelableFAB;
                Throwable th = (Throwable) obj;
                ((CatchingFishMVVM) this.CatchingFishWorkManager).CatchingFishFragmentHandler(th);
                CatchingFishPicassoCameraX catchingFishPicassoCameraX = (CatchingFishPicassoCameraX) ((CatchingFishFluxFluxBundle) this.CatchingFishViewModelScope).CatchingFishWorkManager;
                catchingFishPicassoCameraX.CatchingFishWorkManager(th, false);
                do {
                    Object CatchingFishUnitTesting = catchingFishPicassoCameraX.CatchingFishUnitTesting();
                    if (CatchingFishUnitTesting instanceof CatchingFishLiveDataGson) {
                        CatchingFishUnitTesting = null;
                    }
                    if (CatchingFishUnitTesting != null) {
                        CatchingFishCustomViewAdMob catchingFishCustomViewAdMob = ((CatchingFishOkHttpDataStore) CatchingFishUnitTesting).CatchingFishSnackbar;
                        Throwable cancellationException = th == null ? new CancellationException("DataStore scope was cancelled before updateData could complete") : th;
                        catchingFishCustomViewAdMob.getClass();
                        catchingFishCustomViewAdMob.CatchingFishLayoutInflater(new CatchingFishStripeAPIMVI(cancellationException, false));
                        catchingFishRealmContext = catchingFishRealmContext2;
                    } else {
                        catchingFishRealmContext = null;
                    }
                } while (catchingFishRealmContext != null);
                return catchingFishRealmContext2;
            case 10:
                CatchingFishEspressoViewFAB catchingFishEspressoViewFAB = (CatchingFishEspressoViewFAB) obj;
                CatchingFishPicassoMVI catchingFishPicassoMVI = (CatchingFishPicassoMVI) this.CatchingFishWorkManager;
                CatchingFishMVVM catchingFishMVVM = ((CatchingFishViewPagerRoom) this.CatchingFishViewModelScope).CatchingFishMVPRobolectric;
                catchingFishEspressoViewFAB.getClass();
                long j = 0;
                CatchingFishEspressoViewFAB.CatchingFishParcelableFAB(catchingFishEspressoViewFAB, catchingFishPicassoMVI);
                catchingFishPicassoMVI.CatchingFishLayoutInflater(CatchingFishFirebaseDagger.CatchingFishGradleManifest((4294967295L & j) | (j << 32), catchingFishPicassoMVI.CatchingFishViewModelFAB), 0.0f, catchingFishMVVM);
                return CatchingFishRealmContext.CatchingFishParcelableFAB;
            case 11:
                CatchingFishServiceMockk catchingFishServiceMockk = (CatchingFishServiceMockk) this.CatchingFishWorkManager;
                View view6 = (View) this.CatchingFishViewModelScope;
                CatchingFishHiltStripeAPI catchingFishHiltStripeAPI = catchingFishServiceMockk.CatchingFishCoroutineFlow;
                if (catchingFishServiceMockk.CatchingFishJetpackCompose == 0) {
                    WeakHashMap weakHashMap = CatchingFishFABCameraX.CatchingFishParcelableFAB;
                    CatchingFishGlideFlux.CatchingFishCoroutine(view6, catchingFishHiltStripeAPI);
                    if (view6.isAttachedToWindow()) {
                        view6.requestApplyInsets();
                    }
                    view6.addOnAttachStateChangeListener(catchingFishHiltStripeAPI);
                    CatchingFishFABCameraX.CatchingFishAnimationMockk(view6, catchingFishHiltStripeAPI);
                }
                catchingFishServiceMockk.CatchingFishJetpackCompose++;
                return new CatchingFishMockkViewPager(i, catchingFishServiceMockk, view6);
            default:
                CatchingFishWidgetAdMob catchingFishWidgetAdMob = (CatchingFishWidgetAdMob) obj;
                CatchingFishMockkView catchingFishMockkView = (CatchingFishMockkView) this.CatchingFishViewModelScope;
                CatchingFishRetrofitRoom catchingFishRetrofitRoom = (CatchingFishRetrofitRoom) this.CatchingFishWorkManager;
                if (!catchingFishRetrofitRoom.CatchingFishWorkManager) {
                    CatchingFishToolbarToast CatchingFishDaggerWebsocket = catchingFishWidgetAdMob.CatchingFishParcelableFAB.CatchingFishDaggerWebsocket();
                    catchingFishRetrofitRoom.CatchingFishViewModelFAB = catchingFishMockkView;
                    if (catchingFishRetrofitRoom.CatchingFishViewModelScope == null) {
                        catchingFishRetrofitRoom.CatchingFishViewModelScope = CatchingFishDaggerWebsocket;
                        CatchingFishDaggerWebsocket.CatchingFishParcelableFAB(catchingFishRetrofitRoom);
                    } else if (CatchingFishDaggerWebsocket.CatchingFishReduxKtor.compareTo(CatchingFishMockkFirebase.CatchingFishWorkManager) >= 0) {
                        CatchingFishLayoutStripeAPI catchingFishLayoutStripeAPI = catchingFishRetrofitRoom.CatchingFishDaggerWebsocket;
                        CatchingFishLifecycleRedux catchingFishLifecycleRedux = new CatchingFishLifecycleRedux(1330788943, new CatchingFishMVIMVI(catchingFishRetrofitRoom, catchingFishMockkView, i3), true);
                        synchronized (catchingFishLayoutStripeAPI.CatchingFishViewModelScope) {
                            objArr = catchingFishLayoutStripeAPI.CatchingFishParcelableFlux == 1;
                            if (objArr != false) {
                                catchingFishLayoutStripeAPI.CatchingFishParcelableFlux = 0;
                            }
                        }
                        int i9 = catchingFishLayoutStripeAPI.CatchingFishParcelableFlux;
                        if (i9 != 0) {
                            CatchingFishMVPAndroidXKtor.CatchingFishSnackbar(i9 != 1 ? i9 != 2 ? i9 != 3 ? "" : "The composition is disposed" : "A previous pausable composition for this composition was cancelled. This composition must be disposed." : "The composition should be activated before setting content.");
                        }
                        if (objArr == true) {
                            CatchingFishSharedFlowMVI catchingFishSharedFlowMVI = catchingFishLayoutStripeAPI.CatchingFishSpannableWidget;
                            catchingFishSharedFlowMVI.CatchingFishGsonAppCompat = 100;
                            catchingFishSharedFlowMVI.CatchingFishParcelableFlux = true;
                            catchingFishLayoutStripeAPI.CatchingFishReduxKtor.CatchingFishParcelableFAB(catchingFishLayoutStripeAPI, catchingFishLifecycleRedux);
                            if (catchingFishSharedFlowMVI.CatchingFishFragmentFactory || catchingFishSharedFlowMVI.CatchingFishGsonAppCompat != 100) {
                                CatchingFishMVPAndroidXKtor.CatchingFishParcelableFAB("Cannot disable reuse from root if it was caused by other groups");
                            }
                            catchingFishSharedFlowMVI.CatchingFishGsonAppCompat = -1;
                            catchingFishSharedFlowMVI.CatchingFishParcelableFlux = false;
                        } else {
                            catchingFishLayoutStripeAPI.CatchingFishReduxKtor.CatchingFishParcelableFAB(catchingFishLayoutStripeAPI, catchingFishLifecycleRedux);
                        }
                    }
                }
                return CatchingFishRealmContext.CatchingFishParcelableFAB;
        }
    }
}
