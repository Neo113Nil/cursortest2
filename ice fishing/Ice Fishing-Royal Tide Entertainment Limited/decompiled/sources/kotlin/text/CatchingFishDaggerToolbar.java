package kotlin.text;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.view.ViewParent;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class CatchingFishDaggerToolbar extends CatchingFishWidgetXMLLayout implements CatchingFishWidgetDagger, CatchingFishMockkCoroutine, CatchingFishHiltDatabinding {
    public static final CatchingFishMockkLiveData CatchingFishCameraXIntent;
    public static final CatchingFishMVPExoPlayer CatchingFishGradleManifest;
    public static final CatchingFishWidgetIntent CatchingFishHandler;
    public static final CatchingFishMoshiFluxMoshi CatchingFishPayPalLiveData;
    public CatchingFishDaggerToolbar CatchingFish;
    public CatchingFishSharedFlowMVP CatchingFishCardViewRealm;
    public boolean CatchingFishCoroutineFlow;
    public CatchingFishAdMobKtor CatchingFishCustomView;
    public CatchingFishFABGlide CatchingFishDagger;
    public CatchingFishServiceHandler CatchingFishDaggerHiltFAB;
    public boolean CatchingFishEspressoMockk;
    public CatchingFishWidgetIntent CatchingFishFragmentFactory;
    public boolean CatchingFishJetpackCompose;
    public CatchingFishOkHttpHandler CatchingFishJobScheduler;
    public float CatchingFishMVPRobolectric;
    public CatchingFishHiltMVI CatchingFishMutableLiveData;
    public CatchingFishDaggerToolbar CatchingFishNavigation;
    public CatchingFishGradleMVPKtor CatchingFishParcelableFlux;
    public CatchingFishJUnitService CatchingFishPayPal;
    public CatchingFishWidgetCardView CatchingFishPayPalService;
    public final CatchingFishBiometricRoom CatchingFishRoomDatabase;
    public CatchingFishOkHttpFlux CatchingFishSpannableWidget;
    public float CatchingFishGsonAppCompat = 0.8f;
    public long CatchingFishCardViewView = 0;
    public final CatchingFishStripeAPIAdMob CatchingFishSensorManager = new CatchingFishStripeAPIAdMob(this, 1);

    static {
        CatchingFishMockkLiveData catchingFishMockkLiveData = new CatchingFishMockkLiveData();
        catchingFishMockkLiveData.CatchingFishDaggerWebsocket = 1.0f;
        catchingFishMockkLiveData.CatchingFishWorkManager = 1.0f;
        catchingFishMockkLiveData.CatchingFishViewModelScope = 1.0f;
        long j = CatchingFishMockkKtor.CatchingFishParcelableFAB;
        catchingFishMockkLiveData.CatchingFishViewModelFAB = j;
        catchingFishMockkLiveData.CatchingFishLayout = j;
        catchingFishMockkLiveData.CatchingFishCloudMessaging = 8.0f;
        catchingFishMockkLiveData.CatchingFishEspressoTesting = CatchingFishFABView.CatchingFishParcelableFAB;
        catchingFishMockkLiveData.CatchingFishOkHttp = CatchingFishXMLLayoutGlide.CatchingFishOkHttp;
        catchingFishMockkLiveData.CatchingFishAnimationMockk = 9205357640488583168L;
        catchingFishMockkLiveData.CatchingFishStateLiveData = CatchingFishGsonCardView.CatchingFishSnackbar();
        catchingFishMockkLiveData.CatchingFishRoomDatabase = CatchingFishGradleMVPKtor.CatchingFishReduxKtor;
        catchingFishMockkLiveData.CatchingFishNavigation = 3;
        CatchingFishCameraXIntent = catchingFishMockkLiveData;
        CatchingFishHandler = new CatchingFishWidgetIntent();
        int i = 22;
        CatchingFishPayPalLiveData = new CatchingFishMoshiFluxMoshi(i);
        CatchingFishGradleManifest = new CatchingFishMVPExoPlayer(i);
    }

    public CatchingFishDaggerToolbar(CatchingFishBiometricRoom catchingFishBiometricRoom) {
        this.CatchingFishRoomDatabase = catchingFishBiometricRoom;
        this.CatchingFishSpannableWidget = catchingFishBiometricRoom.CatchingFishCardViewRealm;
        this.CatchingFishParcelableFlux = catchingFishBiometricRoom.CatchingFishPayPal;
    }

    @Override // kotlin.text.CatchingFishWidgetXMLLayout
    public final CatchingFishBiometricRoom CatchingFishAndroidX() {
        return this.CatchingFishRoomDatabase;
    }

    public final void CatchingFishCameraX(CatchingFishFABStripeAPIFAB catchingFishFABStripeAPIFAB, CatchingFishMVVMView catchingFishMVVMView, long j, CatchingFishStripeAPIOkHttp catchingFishStripeAPIOkHttp, int i, boolean z, float f) {
        if (catchingFishFABStripeAPIFAB == null) {
            CatchingFishKtor(catchingFishMVVMView, j, catchingFishStripeAPIOkHttp, i, z);
            return;
        }
        int i2 = catchingFishStripeAPIOkHttp.CatchingFishWorkManager;
        CatchingFishBundleGradle catchingFishBundleGradle = catchingFishStripeAPIOkHttp.CatchingFishReduxKtor;
        catchingFishStripeAPIOkHttp.CatchingFishSnackbar(i2 + 1, catchingFishBundleGradle.CatchingFishSnackbar);
        catchingFishStripeAPIOkHttp.CatchingFishWorkManager++;
        catchingFishBundleGradle.CatchingFishParcelableFAB(catchingFishFABStripeAPIFAB);
        catchingFishStripeAPIOkHttp.CatchingFishDaggerWebsocket.CatchingFishParcelableFAB(CatchingFishLayoutRoomFAB.CatchingFishSnackbar(f, z, false));
        CatchingFishMaterialDesign(CatchingFishToastHiltBundle.CatchingFishViewModelScope(catchingFishFABStripeAPIFAB, catchingFishMVVMView.CatchingFishReduxKtor()), catchingFishMVVMView, j, catchingFishStripeAPIOkHttp, i, z, f, true);
        catchingFishStripeAPIOkHttp.CatchingFishWorkManager = i2;
    }

    public abstract void CatchingFishCardView(CatchingFishOkHttpHandler catchingFishOkHttpHandler, CatchingFishHiltMVI catchingFishHiltMVI);

    @Override // kotlin.text.CatchingFishMockkCoroutine
    public final long CatchingFishCardViewRealm(CatchingFishMockkCoroutine catchingFishMockkCoroutine, long j) {
        return CatchingFishLiveDataRoom(catchingFishMockkCoroutine, j);
    }

    @Override // kotlin.text.CatchingFishWidgetDagger
    public final Object CatchingFishCloudMessaging() {
        CatchingFishBiometricRoom catchingFishBiometricRoom = this.CatchingFishRoomDatabase;
        if (!catchingFishBiometricRoom.CatchingFishJobScheduler.CatchingFishViewModelFAB(64)) {
            return null;
        }
        CatchingFishRealmKtorRealm();
        Object obj = null;
        for (CatchingFishFABStripeAPIFAB catchingFishFABStripeAPIFAB = (CatchingFishNavigationToast) catchingFishBiometricRoom.CatchingFishJobScheduler.CatchingFishLayout; catchingFishFABStripeAPIFAB != null; catchingFishFABStripeAPIFAB = catchingFishFABStripeAPIFAB.CatchingFishViewModelFAB) {
            if ((catchingFishFABStripeAPIFAB.CatchingFishWorkManager & 64) != 0) {
                for (Object obj2 = catchingFishFABStripeAPIFAB; obj2 != null; obj2 = null) {
                    if (obj2 instanceof CatchingFishToolbarCardView) {
                        obj = ((CatchingFishToolbarCardView) obj2).CatchingFishLayout();
                    }
                }
            }
        }
        return obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0057 A[Catch: all -> 0x005c, TRY_ENTER, TryCatch #0 {all -> 0x005c, blocks: (B:16:0x0057, B:17:0x0067, B:19:0x006d, B:21:0x0072, B:25:0x007a, B:27:0x007e, B:33:0x0089, B:41:0x005e), top: B:14:0x0055 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006d A[Catch: all -> 0x005c, TryCatch #0 {all -> 0x005c, blocks: (B:16:0x0057, B:17:0x0067, B:19:0x006d, B:21:0x0072, B:25:0x007a, B:27:0x007e, B:33:0x0089, B:41:0x005e), top: B:14:0x0055 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x005e A[Catch: all -> 0x005c, TryCatch #0 {all -> 0x005c, blocks: (B:16:0x0057, B:17:0x0067, B:19:0x006d, B:21:0x0072, B:25:0x007a, B:27:0x007e, B:33:0x0089, B:41:0x005e), top: B:14:0x0055 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void CatchingFishContextToast() {
        CatchingFishOkHttpStripeAPI CatchingFishViewModelFAB;
        CatchingFishFABStripeAPIFAB catchingFishFABStripeAPIFAB;
        CatchingFishFABStripeAPIFAB CatchingFishPayPalHandler;
        boolean CatchingFishReduxKtor = CatchingFishJUnitJUnit.CatchingFishReduxKtor(128);
        CatchingFishFABStripeAPIFAB CatchingFishPayPalHandler2 = CatchingFishPayPalHandler(CatchingFishReduxKtor);
        if (CatchingFishPayPalHandler2 == null || (CatchingFishPayPalHandler2.CatchingFishReduxKtor.CatchingFishViewModelScope & 128) == 0) {
            return;
        }
        CatchingFishOkHttpStripeAPI catchingFishOkHttpStripeAPI = (CatchingFishOkHttpStripeAPI) CatchingFishIntentBundle.CatchingFishSnackbar.get();
        CatchingFishServiceHandler CatchingFishDaggerWebsocket = catchingFishOkHttpStripeAPI != null ? catchingFishOkHttpStripeAPI.CatchingFishDaggerWebsocket() : null;
        try {
            if (catchingFishOkHttpStripeAPI instanceof CatchingFishDatabindingRoom) {
                CatchingFishDatabindingRoom catchingFishDatabindingRoom = (CatchingFishDatabindingRoom) catchingFishOkHttpStripeAPI;
                if (catchingFishDatabindingRoom.CatchingFishJetpackCompose == CatchingFishOkHttpFAB.CatchingFishRoomDatabase()) {
                    catchingFishDatabindingRoom.CatchingFishNavigation = null;
                    CatchingFishViewModelFAB = catchingFishOkHttpStripeAPI;
                    if (CatchingFishReduxKtor) {
                        catchingFishFABStripeAPIFAB = CatchingFishRealmKtorRealm();
                    } else {
                        catchingFishFABStripeAPIFAB = CatchingFishRealmKtorRealm().CatchingFishViewModelFAB;
                        if (catchingFishFABStripeAPIFAB == null) {
                            return;
                        }
                    }
                    for (CatchingFishPayPalHandler = CatchingFishPayPalHandler(CatchingFishReduxKtor); CatchingFishPayPalHandler != null; CatchingFishPayPalHandler = CatchingFishPayPalHandler.CatchingFishLayout) {
                        if ((CatchingFishPayPalHandler.CatchingFishViewModelScope & 128) == 0) {
                            break;
                        }
                        if ((CatchingFishPayPalHandler.CatchingFishWorkManager & 128) != 0) {
                            for (Object obj = CatchingFishPayPalHandler; obj != null; obj = null) {
                                if (obj instanceof CatchingFishLayoutAsyncTask) {
                                    ((CatchingFishLayoutAsyncTask) obj).CatchingFishViewModelScope(this.CatchingFishWorkManager);
                                }
                            }
                        }
                        if (CatchingFishPayPalHandler == catchingFishFABStripeAPIFAB) {
                            break;
                        }
                    }
                    return;
                }
            }
            if (catchingFishOkHttpStripeAPI instanceof CatchingFishGlideMockk) {
                CatchingFishGlideMockk catchingFishGlideMockk = (CatchingFishGlideMockk) catchingFishOkHttpStripeAPI;
                if (catchingFishGlideMockk.CatchingFishLayout == CatchingFishOkHttpFAB.CatchingFishRoomDatabase()) {
                    catchingFishGlideMockk.CatchingFishViewModelFAB = null;
                    CatchingFishViewModelFAB = catchingFishOkHttpStripeAPI;
                    if (CatchingFishReduxKtor) {
                    }
                    while (CatchingFishPayPalHandler != null) {
                    }
                    return;
                }
            }
            if (CatchingFishReduxKtor) {
            }
            while (CatchingFishPayPalHandler != null) {
            }
            return;
        } finally {
            CatchingFishDaggerBiometric.CatchingFishCameraXIntent(catchingFishOkHttpStripeAPI, CatchingFishViewModelFAB, CatchingFishDaggerWebsocket);
        }
        CatchingFishViewModelFAB = CatchingFishIntentBundle.CatchingFishViewModelFAB(catchingFishOkHttpStripeAPI, null, false);
        CatchingFishViewModelFAB.CatchingFishFragmentHandler();
    }

    @Override // kotlin.text.CatchingFishMockkCoroutine
    public final boolean CatchingFishCustomView() {
        return CatchingFishRealmKtorRealm().CatchingFishRoomDatabase;
    }

    @Override // kotlin.text.CatchingFishWidgetXMLLayout
    public final long CatchingFishCustomViewJUnit() {
        return this.CatchingFishCardViewView;
    }

    public final boolean CatchingFishDaggerAppCompat() {
        if (this.CatchingFishDagger != null && this.CatchingFishGsonAppCompat <= 0.0f) {
            return true;
        }
        CatchingFishDaggerToolbar catchingFishDaggerToolbar = this.CatchingFish;
        if (catchingFishDaggerToolbar != null) {
            return catchingFishDaggerToolbar.CatchingFishDaggerAppCompat();
        }
        return false;
    }

    @Override // kotlin.text.CatchingFishOkHttpFlux
    public final float CatchingFishDaggerWebsocket() {
        return this.CatchingFishRoomDatabase.CatchingFishCardViewRealm.CatchingFishDaggerWebsocket();
    }

    public final CatchingFishFABStripeAPIFAB CatchingFishDynamicFeature(int i) {
        boolean CatchingFishReduxKtor = CatchingFishJUnitJUnit.CatchingFishReduxKtor(i);
        CatchingFishFABStripeAPIFAB CatchingFishRealmKtorRealm = CatchingFishRealmKtorRealm();
        if (!CatchingFishReduxKtor && (CatchingFishRealmKtorRealm = CatchingFishRealmKtorRealm.CatchingFishViewModelFAB) == null) {
            return null;
        }
        for (CatchingFishFABStripeAPIFAB CatchingFishPayPalHandler = CatchingFishPayPalHandler(CatchingFishReduxKtor); CatchingFishPayPalHandler != null && (CatchingFishPayPalHandler.CatchingFishViewModelScope & i) != 0; CatchingFishPayPalHandler = CatchingFishPayPalHandler.CatchingFishLayout) {
            if ((CatchingFishPayPalHandler.CatchingFishWorkManager & i) != 0) {
                return CatchingFishPayPalHandler;
            }
            if (CatchingFishPayPalHandler == CatchingFishRealmKtorRealm) {
                return null;
            }
        }
        return null;
    }

    @Override // kotlin.text.CatchingFishMockkCoroutine
    public final long CatchingFishEspressoMockk(long j) {
        if (!CatchingFishRealmKtorRealm().CatchingFishRoomDatabase) {
            CatchingFishFluxGradle.CatchingFishSnackbar("LayoutCoordinate operations are only valid when isAttached is true");
        }
        CatchingFishGlideMVP();
        for (CatchingFishDaggerToolbar catchingFishDaggerToolbar = this; catchingFishDaggerToolbar != null; catchingFishDaggerToolbar = catchingFishDaggerToolbar.CatchingFish) {
            j = catchingFishDaggerToolbar.CatchingFishJUnitIntent(j);
        }
        return j;
    }

    @Override // kotlin.text.CatchingFishMockkCoroutine
    public final CatchingFishMockkCoroutine CatchingFishEspressoTesting() {
        if (!CatchingFishRealmKtorRealm().CatchingFishRoomDatabase) {
            CatchingFishFluxGradle.CatchingFishSnackbar("LayoutCoordinate operations are only valid when isAttached is true");
        }
        CatchingFishGlideMVP();
        return ((CatchingFishDaggerToolbar) this.CatchingFishRoomDatabase.CatchingFishJobScheduler.CatchingFishViewModelFAB).CatchingFish;
    }

    public final void CatchingFishExoPlayer() {
        this.CatchingFishJetpackCompose = true;
        this.CatchingFishSensorManager.CatchingFishParcelableFAB();
        CatchingFishHiltBundle();
        if (CatchingFishFirebaseDagger.CatchingFishCardViewView(this.CatchingFishCardViewView, 0L)) {
            return;
        }
        this.CatchingFishRoomDatabase.CatchingFishPayPalService();
    }

    public final void CatchingFishFABLayout(CatchingFishOkHttpHandler catchingFishOkHttpHandler, CatchingFishHiltMVI catchingFishHiltMVI) {
        boolean z;
        Canvas canvas;
        boolean z2;
        int i;
        boolean z3;
        float f;
        CatchingFishFABGlide catchingFishFABGlide = this.CatchingFishDagger;
        if (catchingFishFABGlide == null) {
            long j = this.CatchingFishCardViewView;
            float f2 = (int) (j >> 32);
            float f3 = (int) (j & 4294967295L);
            catchingFishOkHttpHandler.CatchingFishViewModelFAB(f2, f3);
            CatchingFishGraphQLGlide(catchingFishOkHttpHandler, catchingFishHiltMVI);
            catchingFishOkHttpHandler.CatchingFishViewModelFAB(-f2, -f3);
            return;
        }
        CatchingFishMVVMFABFAB catchingFishMVVMFABFAB = (CatchingFishMVVMFABFAB) catchingFishFABGlide;
        CatchingFishEspressoMoshi catchingFishEspressoMoshi = catchingFishMVVMFABFAB.CatchingFishStateLiveData;
        catchingFishMVVMFABFAB.CatchingFishWorkManager();
        catchingFishMVVMFABFAB.CatchingFishReduxKtor.CatchingFishParcelableFAB.CatchingFishJobScheduler();
        CatchingFishAsyncTaskDagger catchingFishAsyncTaskDagger = catchingFishEspressoMoshi.CatchingFishDaggerWebsocket;
        CatchingFishAsyncTaskDagger catchingFishAsyncTaskDagger2 = catchingFishEspressoMoshi.CatchingFishDaggerWebsocket;
        catchingFishAsyncTaskDagger.CatchingFishAndroidX(catchingFishOkHttpHandler);
        catchingFishAsyncTaskDagger.CatchingFishWorkManager = catchingFishHiltMVI;
        CatchingFishHiltMVI catchingFishHiltMVI2 = catchingFishMVVMFABFAB.CatchingFishReduxKtor;
        CatchingFishOkHttpHandler CatchingFishCardViewView = catchingFishAsyncTaskDagger2.CatchingFishCardViewView();
        CatchingFishHiltMVI catchingFishHiltMVI3 = (CatchingFishHiltMVI) catchingFishAsyncTaskDagger2.CatchingFishWorkManager;
        CatchingFishFirebaseRealm catchingFishFirebaseRealm = catchingFishHiltMVI2.CatchingFishParcelableFAB;
        if (catchingFishHiltMVI2.CatchingFish) {
            return;
        }
        catchingFishHiltMVI2.CatchingFishParcelableFAB();
        if (!catchingFishFirebaseRealm.CatchingFishPayPalService()) {
            try {
                catchingFishHiltMVI2.CatchingFishParcelableFAB.CatchingFishMVPRobolectric(catchingFishHiltMVI2.CatchingFishSnackbar, catchingFishHiltMVI2.CatchingFishCoroutine, catchingFishHiltMVI2, catchingFishHiltMVI2.CatchingFishDaggerWebsocket);
            } catch (Throwable unused) {
            }
        }
        boolean z4 = catchingFishFirebaseRealm.CatchingFishJobScheduler() > 0.0f;
        if (z4) {
            CatchingFishCardViewView.CatchingFishStateLiveData();
        }
        Canvas CatchingFishParcelableFAB = CatchingFishLayout.CatchingFishParcelableFAB(CatchingFishCardViewView);
        boolean isHardwareAccelerated = CatchingFishParcelableFAB.isHardwareAccelerated();
        if (!isHardwareAccelerated) {
            long j2 = catchingFishHiltMVI2.CatchingFishJetpackCompose;
            float f4 = (int) (j2 >> 32);
            float f5 = (int) (j2 & 4294967295L);
            long j3 = catchingFishHiltMVI2.CatchingFishCoroutineFlow;
            float f6 = ((int) (j3 >> 32)) + f4;
            float f7 = f5 + ((int) (j3 & 4294967295L));
            float CatchingFishParcelableFAB2 = catchingFishFirebaseRealm.CatchingFishParcelableFAB();
            CatchingFishFluxIntent CatchingFishParcelableFlux = catchingFishFirebaseRealm.CatchingFishParcelableFlux();
            int CatchingFishDagger = catchingFishFirebaseRealm.CatchingFishDagger();
            if (CatchingFishParcelableFAB2 < 1.0f || CatchingFishDagger != 3 || CatchingFishParcelableFlux != null || catchingFishFirebaseRealm.CatchingFishDaggerHiltFAB() == 1) {
                CatchingFishFluxFirebase catchingFishFluxFirebase = catchingFishHiltMVI2.CatchingFishStateLiveData;
                if (catchingFishFluxFirebase == null) {
                    catchingFishFluxFirebase = CatchingFishBiometricBundle.CatchingFishSnackbar();
                    catchingFishHiltMVI2.CatchingFishStateLiveData = catchingFishFluxFirebase;
                }
                catchingFishFluxFirebase.CatchingFishCoroutine(CatchingFishParcelableFAB2);
                catchingFishFluxFirebase.CatchingFishReduxKtor(CatchingFishDagger);
                catchingFishFluxFirebase.CatchingFishWorkManager(CatchingFishParcelableFlux);
                f = f4;
                CatchingFishParcelableFAB.saveLayer(f, f5, f6, f7, (Paint) catchingFishFluxFirebase.CatchingFishSnackbar);
            } else {
                CatchingFishParcelableFAB.save();
                f = f4;
            }
            CatchingFishParcelableFAB.translate(f, f5);
            CatchingFishParcelableFAB.concat(catchingFishFirebaseRealm.CatchingFishCardViewView());
        }
        boolean z5 = !isHardwareAccelerated && catchingFishHiltMVI2.CatchingFishSpannableWidget;
        if (z5) {
            CatchingFishCardViewView.CatchingFishCloudMessaging();
            CatchingFishSpannableAdMob CatchingFishReduxKtor = catchingFishHiltMVI2.CatchingFishReduxKtor();
            if (CatchingFishReduxKtor instanceof CatchingFishJUnitToolbar) {
                CatchingFishFluxExoPlayer catchingFishFluxExoPlayer = ((CatchingFishJUnitToolbar) CatchingFishReduxKtor).CatchingFishParcelableFAB;
                CatchingFishCardViewView.CatchingFishUnitTesting(catchingFishFluxExoPlayer.CatchingFishParcelableFAB, catchingFishFluxExoPlayer.CatchingFishSnackbar, catchingFishFluxExoPlayer.CatchingFishCoroutine, catchingFishFluxExoPlayer.CatchingFishReduxKtor);
            } else if (CatchingFishReduxKtor instanceof CatchingFishCoroutineMVI) {
                CatchingFishMoshiRealm catchingFishMoshiRealm = catchingFishHiltMVI2.CatchingFishOkHttp;
                if (catchingFishMoshiRealm != null) {
                    catchingFishMoshiRealm.CatchingFishParcelableFAB.rewind();
                } else {
                    catchingFishMoshiRealm = new CatchingFishMoshiRealm();
                    catchingFishHiltMVI2.CatchingFishOkHttp = catchingFishMoshiRealm;
                }
                CatchingFishMoshiRealm.CatchingFishParcelableFAB(catchingFishMoshiRealm, ((CatchingFishCoroutineMVI) CatchingFishReduxKtor).CatchingFishParcelableFAB);
                CatchingFishCardViewView.CatchingFishWorkManager(catchingFishMoshiRealm);
            } else {
                if (!(CatchingFishReduxKtor instanceof CatchingFishMockkAndroidX)) {
                    throw new CatchingFishBiometricView();
                }
                CatchingFishCardViewView.CatchingFishWorkManager(((CatchingFishMockkAndroidX) CatchingFishReduxKtor).CatchingFishParcelableFAB);
            }
        }
        if (catchingFishHiltMVI3 != null) {
            CatchingFishAsyncTaskRedux catchingFishAsyncTaskRedux = catchingFishHiltMVI3.CatchingFishNavigation;
            if (!catchingFishAsyncTaskRedux.CatchingFishParcelableFAB) {
                CatchingFishHiltFirebase.CatchingFishParcelableFAB("Only add dependencies during a tracking");
            }
            CatchingFishServiceBundle catchingFishServiceBundle = (CatchingFishServiceBundle) catchingFishAsyncTaskRedux.CatchingFishReduxKtor;
            if (catchingFishServiceBundle != null) {
                catchingFishServiceBundle.CatchingFishParcelableFAB(catchingFishHiltMVI2);
            } else if (((CatchingFishHiltMVI) catchingFishAsyncTaskRedux.CatchingFishSnackbar) != null) {
                int i2 = CatchingFishHiltCameraX.CatchingFishParcelableFAB;
                CatchingFishServiceBundle catchingFishServiceBundle2 = new CatchingFishServiceBundle();
                CatchingFishHiltMVI catchingFishHiltMVI4 = (CatchingFishHiltMVI) catchingFishAsyncTaskRedux.CatchingFishSnackbar;
                CatchingFishFirebaseDagger.CatchingFishAnimationMockk(catchingFishHiltMVI4);
                catchingFishServiceBundle2.CatchingFishParcelableFAB(catchingFishHiltMVI4);
                catchingFishServiceBundle2.CatchingFishParcelableFAB(catchingFishHiltMVI2);
                catchingFishAsyncTaskRedux.CatchingFishReduxKtor = catchingFishServiceBundle2;
                catchingFishAsyncTaskRedux.CatchingFishSnackbar = null;
            } else {
                catchingFishAsyncTaskRedux.CatchingFishSnackbar = catchingFishHiltMVI2;
            }
            CatchingFishServiceBundle catchingFishServiceBundle3 = (CatchingFishServiceBundle) catchingFishAsyncTaskRedux.CatchingFishDaggerWebsocket;
            if (catchingFishServiceBundle3 != null) {
                boolean CatchingFishCloudMessaging = catchingFishServiceBundle3.CatchingFishCloudMessaging(catchingFishHiltMVI2);
                i = 1;
                z3 = !CatchingFishCloudMessaging;
            } else {
                i = 1;
                if (((CatchingFishHiltMVI) catchingFishAsyncTaskRedux.CatchingFishCoroutine) != catchingFishHiltMVI2) {
                    z3 = true;
                } else {
                    catchingFishAsyncTaskRedux.CatchingFishCoroutine = null;
                    z3 = false;
                }
            }
            if (z3) {
                catchingFishHiltMVI2.CatchingFishRoomDatabase += i;
            }
        }
        if (CatchingFishLayout.CatchingFishParcelableFAB(CatchingFishCardViewView).isHardwareAccelerated()) {
            z = z4;
            canvas = CatchingFishParcelableFAB;
            z2 = z5;
            catchingFishFirebaseRealm.CatchingFishSnackbar(CatchingFishCardViewView);
        } else {
            CatchingFishEspressoMoshi catchingFishEspressoMoshi2 = catchingFishHiltMVI2.CatchingFishAnimationMockk;
            if (catchingFishEspressoMoshi2 == null) {
                catchingFishEspressoMoshi2 = new CatchingFishEspressoMoshi();
                catchingFishHiltMVI2.CatchingFishAnimationMockk = catchingFishEspressoMoshi2;
            }
            CatchingFishAsyncTaskDagger catchingFishAsyncTaskDagger3 = catchingFishEspressoMoshi2.CatchingFishDaggerWebsocket;
            CatchingFishOkHttpFlux catchingFishOkHttpFlux = catchingFishHiltMVI2.CatchingFishSnackbar;
            CatchingFishGradleMVPKtor catchingFishGradleMVPKtor = catchingFishHiltMVI2.CatchingFishCoroutine;
            long CatchingFishCameraXIntent2 = CatchingFishXMLLayoutGlide.CatchingFishCameraXIntent(catchingFishHiltMVI2.CatchingFishCoroutineFlow);
            CatchingFishJUnitDataStore catchingFishJUnitDataStore = ((CatchingFishEspressoMoshi) catchingFishAsyncTaskDagger3.CatchingFishViewModelScope).CatchingFishReduxKtor;
            CatchingFishOkHttpFlux catchingFishOkHttpFlux2 = catchingFishJUnitDataStore.CatchingFishParcelableFAB;
            CatchingFishGradleMVPKtor catchingFishGradleMVPKtor2 = catchingFishJUnitDataStore.CatchingFishSnackbar;
            CatchingFishOkHttpHandler CatchingFishCardViewView2 = catchingFishAsyncTaskDagger3.CatchingFishCardViewView();
            canvas = CatchingFishParcelableFAB;
            z2 = z5;
            long CatchingFishDagger2 = catchingFishAsyncTaskDagger3.CatchingFishDagger();
            z = z4;
            CatchingFishHiltMVI catchingFishHiltMVI5 = (CatchingFishHiltMVI) catchingFishAsyncTaskDagger3.CatchingFishWorkManager;
            catchingFishAsyncTaskDagger3.CatchingFishNavigationGson(catchingFishOkHttpFlux);
            catchingFishAsyncTaskDagger3.CatchingFishRedux(catchingFishGradleMVPKtor);
            catchingFishAsyncTaskDagger3.CatchingFishAndroidX(CatchingFishCardViewView);
            catchingFishAsyncTaskDagger3.CatchingFishCustomViewJUnit(CatchingFishCameraXIntent2);
            catchingFishAsyncTaskDagger3.CatchingFishWorkManager = catchingFishHiltMVI2;
            CatchingFishCardViewView.CatchingFishCloudMessaging();
            try {
                catchingFishHiltMVI2.CatchingFishCoroutine(catchingFishEspressoMoshi2);
            } finally {
                CatchingFishCardViewView.CatchingFishLayout();
                catchingFishAsyncTaskDagger3.CatchingFishNavigationGson(catchingFishOkHttpFlux2);
                catchingFishAsyncTaskDagger3.CatchingFishRedux(catchingFishGradleMVPKtor2);
                catchingFishAsyncTaskDagger3.CatchingFishAndroidX(CatchingFishCardViewView2);
                catchingFishAsyncTaskDagger3.CatchingFishCustomViewJUnit(CatchingFishDagger2);
                catchingFishAsyncTaskDagger3.CatchingFishWorkManager = catchingFishHiltMVI5;
            }
        }
        if (z2) {
            CatchingFishCardViewView.CatchingFishLayout();
        }
        if (z) {
            CatchingFishCardViewView.CatchingFishEspressoTesting();
        }
        if (isHardwareAccelerated) {
            return;
        }
        canvas.restore();
    }

    @Override // kotlin.text.CatchingFishOkHttpFlux
    public final float CatchingFishFragmentHandler() {
        return this.CatchingFishRoomDatabase.CatchingFishCardViewRealm.CatchingFishFragmentHandler();
    }

    public final void CatchingFishGlideMVP() {
        this.CatchingFishRoomDatabase.CatchingFishPayPalService.CatchingFishSnackbar();
    }

    public final float CatchingFishGlideWidgetKtor(long j, long j2) {
        if (CatchingFishGradleManifest() >= Float.intBitsToFloat((int) (j2 >> 32)) && CatchingFishPayPalLiveData() >= Float.intBitsToFloat((int) (j2 & 4294967295L))) {
            return Float.POSITIVE_INFINITY;
        }
        long CatchingFishServiceMVIJUnit = CatchingFishServiceMVIJUnit(j2);
        float intBitsToFloat = Float.intBitsToFloat((int) (CatchingFishServiceMVIJUnit >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (CatchingFishServiceMVIJUnit & 4294967295L));
        float intBitsToFloat3 = Float.intBitsToFloat((int) (j >> 32));
        float max = Math.max(0.0f, intBitsToFloat3 < 0.0f ? -intBitsToFloat3 : intBitsToFloat3 - CatchingFishGradleManifest());
        long floatToRawIntBits = (Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (j & 4294967295L)) < 0.0f ? -r9 : r9 - CatchingFishPayPalLiveData())) & 4294967295L) | (Float.floatToRawIntBits(max) << 32);
        if (intBitsToFloat > 0.0f || intBitsToFloat2 > 0.0f) {
            int i = (int) (floatToRawIntBits >> 32);
            if (Float.intBitsToFloat(i) <= intBitsToFloat) {
                int i2 = (int) (floatToRawIntBits & 4294967295L);
                if (Float.intBitsToFloat(i2) <= intBitsToFloat2) {
                    float intBitsToFloat4 = Float.intBitsToFloat(i);
                    float intBitsToFloat5 = Float.intBitsToFloat(i2);
                    return (intBitsToFloat5 * intBitsToFloat5) + (intBitsToFloat4 * intBitsToFloat4);
                }
            }
        }
        return Float.POSITIVE_INFINITY;
    }

    public final void CatchingFishGradle(CatchingFishServiceHandler catchingFishServiceHandler, boolean z) {
        CatchingFishAdMobJUnit catchingFishAdMobJUnit;
        CatchingFishFABToast catchingFishFABToast;
        Reference poll;
        CatchingFishWidgetCardView catchingFishWidgetCardView;
        CatchingFishFABToast catchingFishFABToast2;
        Reference poll2;
        Object obj;
        CatchingFishBiometricRoom catchingFishBiometricRoom = this.CatchingFishRoomDatabase;
        boolean z2 = (!z && this.CatchingFishDaggerHiltFAB == catchingFishServiceHandler && CatchingFishFirebaseDagger.CatchingFishOkHttp(this.CatchingFishSpannableWidget, catchingFishBiometricRoom.CatchingFishCardViewRealm) && this.CatchingFishParcelableFlux == catchingFishBiometricRoom.CatchingFishPayPal) ? false : true;
        this.CatchingFishSpannableWidget = catchingFishBiometricRoom.CatchingFishCardViewRealm;
        this.CatchingFishParcelableFlux = catchingFishBiometricRoom.CatchingFishPayPal;
        if (!catchingFishBiometricRoom.CatchingFishCustomView() || catchingFishServiceHandler == null) {
            this.CatchingFishDaggerHiltFAB = null;
            CatchingFishFABGlide catchingFishFABGlide = this.CatchingFishDagger;
            if (catchingFishFABGlide != null) {
                CatchingFishMVVMFABFAB catchingFishMVVMFABFAB = (CatchingFishMVVMFABFAB) catchingFishFABGlide;
                if (!CatchingFishViewMVIMVVM.CatchingFishAnimationMockk(catchingFishMVVMFABFAB.CatchingFishSnackbar())) {
                    catchingFishBiometricRoom.CatchingFishPayPalService();
                }
                catchingFishMVVMFABFAB.CatchingFishViewModelScope = null;
                catchingFishMVVMFABFAB.CatchingFishViewModelFAB = null;
                catchingFishMVVMFABFAB.CatchingFishFragmentHandler = true;
                if (catchingFishMVVMFABFAB.CatchingFishOkHttp) {
                    catchingFishMVVMFABFAB.CatchingFishOkHttp = false;
                    catchingFishMVVMFABFAB.CatchingFishWorkManager.CatchingFishCoroutineFlow(catchingFishMVVMFABFAB, false);
                }
                CatchingFishHandlerSnackbar catchingFishHandlerSnackbar = catchingFishMVVMFABFAB.CatchingFishDaggerWebsocket;
                if (catchingFishHandlerSnackbar != null) {
                    CatchingFishHiltMVI catchingFishHiltMVI = catchingFishMVVMFABFAB.CatchingFishReduxKtor;
                    synchronized (((CatchingFishAsyncTaskRedux) catchingFishHandlerSnackbar).CatchingFishCoroutine) {
                        if (!catchingFishHiltMVI.CatchingFish) {
                            catchingFishHiltMVI.CatchingFish = true;
                            catchingFishHiltMVI.CatchingFishSnackbar();
                        }
                    }
                    CatchingFishGradleCameraX catchingFishGradleCameraX = catchingFishMVVMFABFAB.CatchingFishWorkManager;
                    CatchingFishViewModelIntent catchingFishViewModelIntent = catchingFishGradleCameraX.CatchingFishWidget;
                    do {
                        ReferenceQueue referenceQueue = (ReferenceQueue) catchingFishViewModelIntent.CatchingFishWorkManager;
                        catchingFishFABToast = (CatchingFishFABToast) catchingFishViewModelIntent.CatchingFishDaggerWebsocket;
                        poll = referenceQueue.poll();
                        if (poll != null) {
                            catchingFishFABToast.CatchingFishLayout(poll);
                        }
                    } while (poll != null);
                    catchingFishFABToast.CatchingFishSnackbar(new WeakReference(catchingFishMVVMFABFAB, (ReferenceQueue) catchingFishViewModelIntent.CatchingFishWorkManager));
                    catchingFishGradleCameraX.CatchingFishPayPal.remove(catchingFishMVVMFABFAB);
                }
                catchingFishBiometricRoom.CatchingFishEspressoMockk = true;
                this.CatchingFishSensorManager.CatchingFishParcelableFAB();
                if (CatchingFishRealmKtorRealm().CatchingFishRoomDatabase && catchingFishBiometricRoom.CatchingFishFragmentFactory() && (catchingFishAdMobJUnit = catchingFishBiometricRoom.CatchingFishStateLiveData) != null) {
                    ((CatchingFishGradleCameraX) catchingFishAdMobJUnit).CatchingFishSpannableWidget(catchingFishBiometricRoom);
                }
            }
            this.CatchingFishDagger = null;
            this.CatchingFishEspressoMockk = false;
            return;
        }
        this.CatchingFishDaggerHiltFAB = catchingFishServiceHandler;
        if (this.CatchingFishDagger != null) {
            if (z2 && CatchingFishJUnitViewPager(true)) {
                catchingFishBiometricRoom.CatchingFishPayPalService();
                ((CatchingFishGradleCameraX) CatchingFishMVVMBundleFAB.CatchingFishParcelableFAB(catchingFishBiometricRoom)).getRectManager().CatchingFishWorkManager(catchingFishBiometricRoom);
                return;
            }
            return;
        }
        CatchingFishAdMobJUnit CatchingFishParcelableFAB = CatchingFishMVVMBundleFAB.CatchingFishParcelableFAB(catchingFishBiometricRoom);
        CatchingFishWidgetCardView catchingFishWidgetCardView2 = this.CatchingFishPayPalService;
        if (catchingFishWidgetCardView2 == null) {
            CatchingFishWidgetCardView catchingFishWidgetCardView3 = new CatchingFishWidgetCardView(4, this, new CatchingFishStripeAPIAdMob(this, 0));
            this.CatchingFishPayPalService = catchingFishWidgetCardView3;
            catchingFishWidgetCardView = catchingFishWidgetCardView3;
        } else {
            catchingFishWidgetCardView = catchingFishWidgetCardView2;
        }
        CatchingFishStripeAPIAdMob catchingFishStripeAPIAdMob = this.CatchingFishSensorManager;
        CatchingFishGradleCameraX catchingFishGradleCameraX2 = (CatchingFishGradleCameraX) CatchingFishParcelableFAB;
        CatchingFishViewModelIntent catchingFishViewModelIntent2 = catchingFishGradleCameraX2.CatchingFishWidget;
        do {
            ReferenceQueue referenceQueue2 = (ReferenceQueue) catchingFishViewModelIntent2.CatchingFishWorkManager;
            catchingFishFABToast2 = (CatchingFishFABToast) catchingFishViewModelIntent2.CatchingFishDaggerWebsocket;
            poll2 = referenceQueue2.poll();
            if (poll2 != null) {
                catchingFishFABToast2.CatchingFishLayout(poll2);
            }
        } while (poll2 != null);
        while (true) {
            int i = catchingFishFABToast2.CatchingFishWorkManager;
            if (i == 0) {
                obj = null;
                break;
            } else {
                obj = ((Reference) catchingFishFABToast2.CatchingFishFragmentHandler(i - 1)).get();
                if (obj != null) {
                    break;
                }
            }
        }
        CatchingFishFABGlide catchingFishFABGlide2 = (CatchingFishFABGlide) obj;
        if (catchingFishFABGlide2 != null) {
            CatchingFishMVVMFABFAB catchingFishMVVMFABFAB2 = (CatchingFishMVVMFABFAB) catchingFishFABGlide2;
            CatchingFishHandlerSnackbar catchingFishHandlerSnackbar2 = catchingFishMVVMFABFAB2.CatchingFishDaggerWebsocket;
            if (catchingFishHandlerSnackbar2 == null) {
                throw CatchingFishMVPLiveData.CatchingFish("currently reuse is only supported when we manage the layer lifecycle");
            }
            if (!catchingFishMVVMFABFAB2.CatchingFishReduxKtor.CatchingFish) {
                CatchingFishFluxGradle.CatchingFishParcelableFAB("layer should have been released before reuse");
            }
            catchingFishMVVMFABFAB2.CatchingFishReduxKtor = ((CatchingFishAsyncTaskRedux) catchingFishHandlerSnackbar2).CatchingFishParcelableFAB();
            catchingFishMVVMFABFAB2.CatchingFishFragmentHandler = false;
            catchingFishMVVMFABFAB2.CatchingFishViewModelScope = catchingFishWidgetCardView;
            catchingFishMVVMFABFAB2.CatchingFishViewModelFAB = catchingFishStripeAPIAdMob;
            catchingFishMVVMFABFAB2.CatchingFishJetpackCompose = false;
            catchingFishMVVMFABFAB2.CatchingFishCoroutineFlow = false;
            catchingFishMVVMFABFAB2.CatchingFishDaggerHiltFAB = true;
            CatchingFishOkHttpFAB.CatchingFishPayPalLiveData(catchingFishMVVMFABFAB2.CatchingFishCloudMessaging);
            float[] fArr = catchingFishMVVMFABFAB2.CatchingFishEspressoTesting;
            if (fArr != null) {
                CatchingFishOkHttpFAB.CatchingFishPayPalLiveData(fArr);
            }
            catchingFishMVVMFABFAB2.CatchingFishNavigation = CatchingFishFABView.CatchingFishParcelableFAB;
            long j = Integer.MAX_VALUE;
            catchingFishMVVMFABFAB2.CatchingFishLayout = (j & 4294967295L) | (j << 32);
            catchingFishMVVMFABFAB2.CatchingFish = null;
            catchingFishMVVMFABFAB2.CatchingFishRoomDatabase = 0;
        } else {
            catchingFishFABGlide2 = new CatchingFishMVVMFABFAB(((CatchingFishAsyncTaskRedux) catchingFishGradleCameraX2.getGraphicsContext()).CatchingFishParcelableFAB(), catchingFishGradleCameraX2.getGraphicsContext(), catchingFishGradleCameraX2, catchingFishWidgetCardView, catchingFishStripeAPIAdMob);
        }
        CatchingFishMVVMFABFAB catchingFishMVVMFABFAB3 = (CatchingFishMVVMFABFAB) catchingFishFABGlide2;
        catchingFishMVVMFABFAB3.CatchingFishDaggerWebsocket(this.CatchingFishWorkManager);
        catchingFishMVVMFABFAB3.CatchingFishReduxKtor(this.CatchingFishCardViewView);
        this.CatchingFishDagger = catchingFishFABGlide2;
        CatchingFishJUnitViewPager(true);
        catchingFishBiometricRoom.CatchingFishEspressoMockk = true;
        this.CatchingFishSensorManager.CatchingFishParcelableFAB();
    }

    @Override // kotlin.text.CatchingFishWidgetXMLLayout
    public final void CatchingFishGradleLiveData() {
        CatchingFishLayoutInflater(this.CatchingFishCardViewView, this.CatchingFishMVPRobolectric, this.CatchingFishDaggerHiltFAB);
    }

    public final void CatchingFishGraphQLGlide(CatchingFishOkHttpHandler catchingFishOkHttpHandler, CatchingFishHiltMVI catchingFishHiltMVI) {
        CatchingFishOkHttpHandler catchingFishOkHttpHandler2;
        CatchingFishHiltMVI catchingFishHiltMVI2;
        CatchingFishFABStripeAPIFAB CatchingFishDynamicFeature = CatchingFishDynamicFeature(4);
        if (CatchingFishDynamicFeature == null) {
            CatchingFishCardView(catchingFishOkHttpHandler, catchingFishHiltMVI);
            return;
        }
        CatchingFishBiometricRoom catchingFishBiometricRoom = this.CatchingFishRoomDatabase;
        catchingFishBiometricRoom.getClass();
        CatchingFishDaggerHiltJUnit sharedDrawScope = ((CatchingFishGradleCameraX) CatchingFishMVVMBundleFAB.CatchingFishParcelableFAB(catchingFishBiometricRoom)).getSharedDrawScope();
        long CatchingFishCameraXIntent2 = CatchingFishXMLLayoutGlide.CatchingFishCameraXIntent(this.CatchingFishWorkManager);
        sharedDrawScope.getClass();
        while (CatchingFishDynamicFeature != null) {
            if (CatchingFishDynamicFeature instanceof CatchingFishFABWorkManager) {
                catchingFishOkHttpHandler2 = catchingFishOkHttpHandler;
                catchingFishHiltMVI2 = catchingFishHiltMVI;
                sharedDrawScope.CatchingFishSnackbar(catchingFishOkHttpHandler2, CatchingFishCameraXIntent2, this, (CatchingFishFABWorkManager) CatchingFishDynamicFeature, catchingFishHiltMVI2);
            } else {
                catchingFishOkHttpHandler2 = catchingFishOkHttpHandler;
                catchingFishHiltMVI2 = catchingFishHiltMVI;
            }
            CatchingFishDynamicFeature = null;
            catchingFishOkHttpHandler = catchingFishOkHttpHandler2;
            catchingFishHiltMVI = catchingFishHiltMVI2;
        }
    }

    public final void CatchingFishHiltBundle() {
        if (this.CatchingFishDagger != null) {
            CatchingFishGradle(null, false);
            this.CatchingFishRoomDatabase.CatchingFishHandler(false);
        }
    }

    public final long CatchingFishJUnitIntent(long j) {
        CatchingFishFABGlide catchingFishFABGlide = this.CatchingFishDagger;
        if (catchingFishFABGlide != null) {
            j = ((CatchingFishMVVMFABFAB) catchingFishFABGlide).CatchingFishCoroutine(j, false);
        }
        long j2 = this.CatchingFishCardViewView;
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) + ((int) (j2 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) + ((int) (j2 & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }

    public final boolean CatchingFishJUnitViewPager(boolean z) {
        long j;
        long j2;
        CatchingFishBiometricRoom catchingFishBiometricRoom;
        boolean z2;
        CatchingFishBiometricRoom catchingFishBiometricRoom2;
        CatchingFishAdMobJUnit catchingFishAdMobJUnit;
        CatchingFishJUnitGlide catchingFishJUnitGlide;
        CatchingFishFABGlide catchingFishFABGlide = this.CatchingFishDagger;
        if (catchingFishFABGlide == null) {
            if (this.CatchingFishDaggerHiltFAB == null) {
                return false;
            }
            CatchingFishFluxGradle.CatchingFishSnackbar("null layer with a non-null layerBlock");
            return false;
        }
        CatchingFishServiceHandler catchingFishServiceHandler = this.CatchingFishDaggerHiltFAB;
        if (catchingFishServiceHandler == null) {
            throw CatchingFishMVPLiveData.CatchingFish("updateLayerParameters requires a non-null layerBlock");
        }
        CatchingFishMockkLiveData catchingFishMockkLiveData = CatchingFishCameraXIntent;
        if (catchingFishMockkLiveData.CatchingFishDaggerWebsocket != 1.0f) {
            catchingFishMockkLiveData.CatchingFishReduxKtor |= 1;
            catchingFishMockkLiveData.CatchingFishDaggerWebsocket = 1.0f;
        }
        if (catchingFishMockkLiveData.CatchingFishWorkManager != 1.0f) {
            catchingFishMockkLiveData.CatchingFishReduxKtor |= 2;
            catchingFishMockkLiveData.CatchingFishWorkManager = 1.0f;
        }
        if (catchingFishMockkLiveData.CatchingFishViewModelScope != 1.0f) {
            catchingFishMockkLiveData.CatchingFishReduxKtor |= 4;
            catchingFishMockkLiveData.CatchingFishViewModelScope = 1.0f;
        }
        long j3 = CatchingFishMockkKtor.CatchingFishParcelableFAB;
        if (!CatchingFishToastFragment.CatchingFishCoroutine(catchingFishMockkLiveData.CatchingFishViewModelFAB, j3)) {
            catchingFishMockkLiveData.CatchingFishReduxKtor |= 64;
            catchingFishMockkLiveData.CatchingFishViewModelFAB = j3;
        }
        if (!CatchingFishToastFragment.CatchingFishCoroutine(catchingFishMockkLiveData.CatchingFishLayout, j3)) {
            catchingFishMockkLiveData.CatchingFishReduxKtor |= 128;
            catchingFishMockkLiveData.CatchingFishLayout = j3;
        }
        if (catchingFishMockkLiveData.CatchingFishFragmentHandler != 0.0f) {
            catchingFishMockkLiveData.CatchingFishReduxKtor |= 1024;
            catchingFishMockkLiveData.CatchingFishFragmentHandler = 0.0f;
        }
        if (catchingFishMockkLiveData.CatchingFishCloudMessaging != 8.0f) {
            catchingFishMockkLiveData.CatchingFishReduxKtor |= 2048;
            catchingFishMockkLiveData.CatchingFishCloudMessaging = 8.0f;
        }
        long j4 = CatchingFishFABView.CatchingFishParcelableFAB;
        if (catchingFishMockkLiveData.CatchingFishEspressoTesting != j4) {
            catchingFishMockkLiveData.CatchingFishReduxKtor |= 4096;
            catchingFishMockkLiveData.CatchingFishEspressoTesting = j4;
        }
        CatchingFishHiltMockkMVI catchingFishHiltMockkMVI = CatchingFishXMLLayoutGlide.CatchingFishOkHttp;
        if (!CatchingFishFirebaseDagger.CatchingFishOkHttp(catchingFishMockkLiveData.CatchingFishOkHttp, catchingFishHiltMockkMVI)) {
            catchingFishMockkLiveData.CatchingFishReduxKtor |= 8192;
            catchingFishMockkLiveData.CatchingFishOkHttp = catchingFishHiltMockkMVI;
        }
        if (catchingFishMockkLiveData.CatchingFishUnitTesting) {
            catchingFishMockkLiveData.CatchingFishReduxKtor |= 16384;
            catchingFishMockkLiveData.CatchingFishUnitTesting = false;
        }
        if (catchingFishMockkLiveData.CatchingFishNavigation != 3) {
            catchingFishMockkLiveData.CatchingFishReduxKtor |= 524288;
            catchingFishMockkLiveData.CatchingFishNavigation = 3;
        }
        catchingFishMockkLiveData.CatchingFishAnimationMockk = 9205357640488583168L;
        catchingFishMockkLiveData.CatchingFish = null;
        catchingFishMockkLiveData.CatchingFishReduxKtor = 0;
        CatchingFishBiometricRoom catchingFishBiometricRoom3 = this.CatchingFishRoomDatabase;
        catchingFishMockkLiveData.CatchingFishStateLiveData = catchingFishBiometricRoom3.CatchingFishCardViewRealm;
        catchingFishMockkLiveData.CatchingFishRoomDatabase = catchingFishBiometricRoom3.CatchingFishPayPal;
        catchingFishMockkLiveData.CatchingFishAnimationMockk = CatchingFishXMLLayoutGlide.CatchingFishCameraXIntent(this.CatchingFishWorkManager);
        ((CatchingFishGradleCameraX) CatchingFishMVVMBundleFAB.CatchingFishParcelableFAB(catchingFishBiometricRoom3)).getSnapshotObserver().CatchingFishParcelableFAB(this, CatchingFishMVI.CatchingFishCardViewRealm, new CatchingFishViewPagerRedux(9, catchingFishServiceHandler));
        CatchingFishWidgetIntent catchingFishWidgetIntent = this.CatchingFishFragmentFactory;
        if (catchingFishWidgetIntent == null) {
            catchingFishWidgetIntent = new CatchingFishWidgetIntent();
            this.CatchingFishFragmentFactory = catchingFishWidgetIntent;
        }
        CatchingFishWidgetIntent catchingFishWidgetIntent2 = CatchingFishHandler;
        catchingFishWidgetIntent2.getClass();
        catchingFishWidgetIntent2.CatchingFishParcelableFAB = catchingFishWidgetIntent.CatchingFishParcelableFAB;
        catchingFishWidgetIntent2.CatchingFishSnackbar = catchingFishWidgetIntent.CatchingFishSnackbar;
        catchingFishWidgetIntent2.CatchingFishCoroutine = catchingFishWidgetIntent.CatchingFishCoroutine;
        catchingFishWidgetIntent2.CatchingFishReduxKtor = catchingFishWidgetIntent.CatchingFishReduxKtor;
        catchingFishWidgetIntent2.CatchingFishDaggerWebsocket = catchingFishWidgetIntent.CatchingFishDaggerWebsocket;
        float f = catchingFishMockkLiveData.CatchingFishDaggerWebsocket;
        catchingFishWidgetIntent.CatchingFishParcelableFAB = f;
        catchingFishWidgetIntent.CatchingFishSnackbar = catchingFishMockkLiveData.CatchingFishWorkManager;
        catchingFishWidgetIntent.CatchingFishCoroutine = catchingFishMockkLiveData.CatchingFishFragmentHandler;
        catchingFishWidgetIntent.CatchingFishReduxKtor = catchingFishMockkLiveData.CatchingFishCloudMessaging;
        long j5 = catchingFishMockkLiveData.CatchingFishEspressoTesting;
        catchingFishWidgetIntent.CatchingFishDaggerWebsocket = j5;
        CatchingFishMVVMFABFAB catchingFishMVVMFABFAB = (CatchingFishMVVMFABFAB) catchingFishFABGlide;
        CatchingFishGradleCameraX catchingFishGradleCameraX = catchingFishMVVMFABFAB.CatchingFishWorkManager;
        int i = catchingFishMockkLiveData.CatchingFishReduxKtor | catchingFishMVVMFABFAB.CatchingFishRoomDatabase;
        catchingFishMVVMFABFAB.CatchingFishAnimationMockk = catchingFishMockkLiveData.CatchingFishRoomDatabase;
        catchingFishMVVMFABFAB.CatchingFishUnitTesting = catchingFishMockkLiveData.CatchingFishStateLiveData;
        int i2 = i & 4096;
        if (i2 != 0) {
            catchingFishMVVMFABFAB.CatchingFishNavigation = j5;
        }
        if ((i & 1) != 0) {
            CatchingFishFirebaseRealm catchingFishFirebaseRealm = catchingFishMVVMFABFAB.CatchingFishReduxKtor.CatchingFishParcelableFAB;
            if (catchingFishFirebaseRealm.CatchingFishDaggerWebsocket() != f) {
                catchingFishFirebaseRealm.CatchingFishUnitTesting(f);
            }
        }
        if ((i & 2) != 0) {
            CatchingFishHiltMVI catchingFishHiltMVI = catchingFishMVVMFABFAB.CatchingFishReduxKtor;
            float f2 = catchingFishMockkLiveData.CatchingFishWorkManager;
            CatchingFishFirebaseRealm catchingFishFirebaseRealm2 = catchingFishHiltMVI.CatchingFishParcelableFAB;
            if (catchingFishFirebaseRealm2.CatchingFishSensorManager() != f2) {
                catchingFishFirebaseRealm2.CatchingFishPayPal(f2);
            }
        }
        if ((i & 4) != 0) {
            CatchingFishHiltMVI catchingFishHiltMVI2 = catchingFishMVVMFABFAB.CatchingFishReduxKtor;
            float f3 = catchingFishMockkLiveData.CatchingFishViewModelScope;
            CatchingFishFirebaseRealm catchingFishFirebaseRealm3 = catchingFishHiltMVI2.CatchingFishParcelableFAB;
            if (catchingFishFirebaseRealm3.CatchingFishParcelableFAB() != f3) {
                catchingFishFirebaseRealm3.CatchingFishReduxKtor(f3);
            }
        }
        if ((i & 8) != 0) {
            CatchingFishFirebaseRealm catchingFishFirebaseRealm4 = catchingFishMVVMFABFAB.CatchingFishReduxKtor.CatchingFishParcelableFAB;
            if (catchingFishFirebaseRealm4.CatchingFish() != 0.0f) {
                catchingFishFirebaseRealm4.CatchingFishJetpackCompose();
            }
        }
        if ((i & 16) != 0) {
            CatchingFishFirebaseRealm catchingFishFirebaseRealm5 = catchingFishMVVMFABFAB.CatchingFishReduxKtor.CatchingFishParcelableFAB;
            if (catchingFishFirebaseRealm5.CatchingFishWorkManager() != 0.0f) {
                catchingFishFirebaseRealm5.CatchingFishViewModelScope();
            }
        }
        if ((i & 32) != 0) {
            CatchingFishHiltMVI catchingFishHiltMVI3 = catchingFishMVVMFABFAB.CatchingFishReduxKtor;
            CatchingFishFirebaseRealm catchingFishFirebaseRealm6 = catchingFishHiltMVI3.CatchingFishParcelableFAB;
            if (catchingFishFirebaseRealm6.CatchingFishJobScheduler() != 0.0f) {
                catchingFishFirebaseRealm6.CatchingFishNavigation();
                catchingFishHiltMVI3.CatchingFishViewModelScope = true;
                catchingFishHiltMVI3.CatchingFishParcelableFAB();
            }
        }
        if ((i & 64) != 0) {
            CatchingFishHiltMVI catchingFishHiltMVI4 = catchingFishMVVMFABFAB.CatchingFishReduxKtor;
            long j6 = catchingFishMockkLiveData.CatchingFishViewModelFAB;
            CatchingFishFirebaseRealm catchingFishFirebaseRealm7 = catchingFishHiltMVI4.CatchingFishParcelableFAB;
            j = j4;
            if (!CatchingFishToastFragment.CatchingFishCoroutine(j6, catchingFishFirebaseRealm7.CatchingFishHandler())) {
                catchingFishFirebaseRealm7.CatchingFishCloudMessaging(j6);
            }
        } else {
            j = j4;
        }
        if ((i & 128) != 0) {
            CatchingFishHiltMVI catchingFishHiltMVI5 = catchingFishMVVMFABFAB.CatchingFishReduxKtor;
            long j7 = catchingFishMockkLiveData.CatchingFishLayout;
            CatchingFishFirebaseRealm catchingFishFirebaseRealm8 = catchingFishHiltMVI5.CatchingFishParcelableFAB;
            if (!CatchingFishToastFragment.CatchingFishCoroutine(j7, catchingFishFirebaseRealm8.CatchingFishFragmentHandler())) {
                catchingFishFirebaseRealm8.CatchingFishCardViewRealm(j7);
            }
        }
        if ((i & 1024) != 0) {
            CatchingFishHiltMVI catchingFishHiltMVI6 = catchingFishMVVMFABFAB.CatchingFishReduxKtor;
            float f4 = catchingFishMockkLiveData.CatchingFishFragmentHandler;
            CatchingFishFirebaseRealm catchingFishFirebaseRealm9 = catchingFishHiltMVI6.CatchingFishParcelableFAB;
            if (catchingFishFirebaseRealm9.CatchingFishEspressoMockk() != f4) {
                catchingFishFirebaseRealm9.CatchingFishViewModelFAB(f4);
            }
        }
        if ((i & 256) != 0) {
            CatchingFishFirebaseRealm catchingFishFirebaseRealm10 = catchingFishMVVMFABFAB.CatchingFishReduxKtor.CatchingFishParcelableFAB;
            if (catchingFishFirebaseRealm10.CatchingFishSpannableWidget() != 0.0f) {
                catchingFishFirebaseRealm10.CatchingFishCoroutine();
            }
        }
        if ((i & 512) != 0) {
            CatchingFishFirebaseRealm catchingFishFirebaseRealm11 = catchingFishMVVMFABFAB.CatchingFishReduxKtor.CatchingFishParcelableFAB;
            if (catchingFishFirebaseRealm11.CatchingFishFragmentFactory() != 0.0f) {
                catchingFishFirebaseRealm11.CatchingFishLayout();
            }
        }
        if ((i & 2048) != 0) {
            CatchingFishHiltMVI catchingFishHiltMVI7 = catchingFishMVVMFABFAB.CatchingFishReduxKtor;
            float f5 = catchingFishMockkLiveData.CatchingFishCloudMessaging;
            CatchingFishFirebaseRealm catchingFishFirebaseRealm12 = catchingFishHiltMVI7.CatchingFishParcelableFAB;
            if (catchingFishFirebaseRealm12.CatchingFishStateLiveData() != f5) {
                catchingFishFirebaseRealm12.CatchingFishMutableLiveData(f5);
            }
        }
        if (i2 != 0) {
            if (catchingFishMVVMFABFAB.CatchingFishNavigation == j) {
                CatchingFishHiltMVI catchingFishHiltMVI8 = catchingFishMVVMFABFAB.CatchingFishReduxKtor;
                j2 = 4294967295L;
                if (!CatchingFishToolbarMVIMVVM.CatchingFishParcelableFAB(catchingFishHiltMVI8.CatchingFishDaggerHiltFAB, 9205357640488583168L)) {
                    catchingFishHiltMVI8.CatchingFishDaggerHiltFAB = 9205357640488583168L;
                    catchingFishHiltMVI8.CatchingFishParcelableFAB.CatchingFishCameraXIntent(9205357640488583168L);
                }
            } else {
                j2 = 4294967295L;
                CatchingFishHiltMVI catchingFishHiltMVI9 = catchingFishMVVMFABFAB.CatchingFishReduxKtor;
                long floatToRawIntBits = (Float.floatToRawIntBits(CatchingFishFABView.CatchingFishSnackbar(catchingFishMVVMFABFAB.CatchingFishNavigation) * ((int) (catchingFishMVVMFABFAB.CatchingFishLayout & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits(CatchingFishFABView.CatchingFishParcelableFAB(r10) * ((int) (catchingFishMVVMFABFAB.CatchingFishLayout >> 32))) << 32);
                if (!CatchingFishToolbarMVIMVVM.CatchingFishParcelableFAB(catchingFishHiltMVI9.CatchingFishDaggerHiltFAB, floatToRawIntBits)) {
                    catchingFishHiltMVI9.CatchingFishDaggerHiltFAB = floatToRawIntBits;
                    catchingFishHiltMVI9.CatchingFishParcelableFAB.CatchingFishCameraXIntent(floatToRawIntBits);
                }
            }
        } else {
            j2 = 4294967295L;
        }
        if ((i & 16384) != 0) {
            CatchingFishHiltMVI catchingFishHiltMVI10 = catchingFishMVVMFABFAB.CatchingFishReduxKtor;
            boolean z3 = catchingFishMockkLiveData.CatchingFishUnitTesting;
            if (catchingFishHiltMVI10.CatchingFishSpannableWidget != z3) {
                catchingFishHiltMVI10.CatchingFishSpannableWidget = z3;
                catchingFishHiltMVI10.CatchingFishViewModelScope = true;
                catchingFishHiltMVI10.CatchingFishParcelableFAB();
            }
        }
        if ((131072 & i) != 0) {
            CatchingFishFirebaseRealm catchingFishFirebaseRealm13 = catchingFishMVVMFABFAB.CatchingFishReduxKtor.CatchingFishParcelableFAB;
        }
        if ((262144 & i) != 0) {
            CatchingFishFirebaseRealm catchingFishFirebaseRealm14 = catchingFishMVVMFABFAB.CatchingFishReduxKtor.CatchingFishParcelableFAB;
            if (!CatchingFishFirebaseDagger.CatchingFishOkHttp(catchingFishFirebaseRealm14.CatchingFishParcelableFlux(), null)) {
                catchingFishFirebaseRealm14.CatchingFishOkHttp();
            }
        }
        if ((i & 524288) != 0) {
            CatchingFishHiltMVI catchingFishHiltMVI11 = catchingFishMVVMFABFAB.CatchingFishReduxKtor;
            int i3 = catchingFishMockkLiveData.CatchingFishNavigation;
            CatchingFishFirebaseRealm catchingFishFirebaseRealm15 = catchingFishHiltMVI11.CatchingFishParcelableFAB;
            if (catchingFishFirebaseRealm15.CatchingFishDagger() != i3) {
                catchingFishFirebaseRealm15.CatchingFishAnimationMockk(i3);
            }
        }
        if ((32768 & i) != 0) {
            CatchingFishFirebaseRealm catchingFishFirebaseRealm16 = catchingFishMVVMFABFAB.CatchingFishReduxKtor.CatchingFishParcelableFAB;
            if (catchingFishFirebaseRealm16.CatchingFishDaggerHiltFAB() != 0) {
                catchingFishFirebaseRealm16.CatchingFishGsonAppCompat(0);
            }
        }
        if ((i & 7963) != 0) {
            catchingFishMVVMFABFAB.CatchingFishJetpackCompose = true;
            catchingFishMVVMFABFAB.CatchingFishCoroutineFlow = true;
        }
        if (CatchingFishFirebaseDagger.CatchingFishOkHttp(catchingFishMVVMFABFAB.CatchingFish, catchingFishMockkLiveData.CatchingFish)) {
            catchingFishBiometricRoom = catchingFishBiometricRoom3;
            z2 = false;
        } else {
            CatchingFishSpannableAdMob catchingFishSpannableAdMob = catchingFishMockkLiveData.CatchingFish;
            catchingFishMVVMFABFAB.CatchingFish = catchingFishSpannableAdMob;
            if (catchingFishSpannableAdMob == null) {
                catchingFishBiometricRoom = catchingFishBiometricRoom3;
            } else {
                CatchingFishHiltMVI catchingFishHiltMVI12 = catchingFishMVVMFABFAB.CatchingFishReduxKtor;
                if (catchingFishSpannableAdMob instanceof CatchingFishJUnitToolbar) {
                    CatchingFishFluxExoPlayer catchingFishFluxExoPlayer = ((CatchingFishJUnitToolbar) catchingFishSpannableAdMob).CatchingFishParcelableFAB;
                    float f6 = catchingFishFluxExoPlayer.CatchingFishParcelableFAB;
                    float f7 = catchingFishFluxExoPlayer.CatchingFishSnackbar;
                    catchingFishBiometricRoom = catchingFishBiometricRoom3;
                    catchingFishHiltMVI12.CatchingFishWorkManager((Float.floatToRawIntBits(f6) << 32) | (Float.floatToRawIntBits(f7) & j2), (Float.floatToRawIntBits(catchingFishFluxExoPlayer.CatchingFishCoroutine - f6) << 32) | (Float.floatToRawIntBits(catchingFishFluxExoPlayer.CatchingFishReduxKtor - f7) & j2), 0.0f);
                } else {
                    catchingFishBiometricRoom = catchingFishBiometricRoom3;
                    if (catchingFishSpannableAdMob instanceof CatchingFishMockkAndroidX) {
                        CatchingFishMoshiRealm catchingFishMoshiRealm = ((CatchingFishMockkAndroidX) catchingFishSpannableAdMob).CatchingFishParcelableFAB;
                        catchingFishHiltMVI12.CatchingFishCloudMessaging = null;
                        catchingFishHiltMVI12.CatchingFishLayout = 9205357640488583168L;
                        catchingFishHiltMVI12.CatchingFishViewModelFAB = 0L;
                        catchingFishHiltMVI12.CatchingFishFragmentHandler = 0.0f;
                        catchingFishHiltMVI12.CatchingFishViewModelScope = true;
                        catchingFishHiltMVI12.CatchingFishUnitTesting = false;
                        catchingFishHiltMVI12.CatchingFishEspressoTesting = catchingFishMoshiRealm;
                        catchingFishHiltMVI12.CatchingFishParcelableFAB();
                    } else {
                        if (!(catchingFishSpannableAdMob instanceof CatchingFishCoroutineMVI)) {
                            throw new CatchingFishBiometricView();
                        }
                        CatchingFishCoroutineMVI catchingFishCoroutineMVI = (CatchingFishCoroutineMVI) catchingFishSpannableAdMob;
                        CatchingFishMoshiRealm catchingFishMoshiRealm2 = catchingFishCoroutineMVI.CatchingFishSnackbar;
                        if (catchingFishMoshiRealm2 != null) {
                            catchingFishHiltMVI12.CatchingFishCloudMessaging = null;
                            catchingFishHiltMVI12.CatchingFishLayout = 9205357640488583168L;
                            catchingFishHiltMVI12.CatchingFishViewModelFAB = 0L;
                            catchingFishHiltMVI12.CatchingFishFragmentHandler = 0.0f;
                            catchingFishHiltMVI12.CatchingFishViewModelScope = true;
                            catchingFishHiltMVI12.CatchingFishUnitTesting = false;
                            catchingFishHiltMVI12.CatchingFishEspressoTesting = catchingFishMoshiRealm2;
                            catchingFishHiltMVI12.CatchingFishParcelableFAB();
                        } else {
                            CatchingFishMVIServiceFlux catchingFishMVIServiceFlux = catchingFishCoroutineMVI.CatchingFishParcelableFAB;
                            float f8 = catchingFishMVIServiceFlux.CatchingFishSnackbar;
                            float f9 = catchingFishMVIServiceFlux.CatchingFishParcelableFAB;
                            catchingFishHiltMVI12.CatchingFishWorkManager((Float.floatToRawIntBits(f9) << 32) | (Float.floatToRawIntBits(f8) & j2), (Float.floatToRawIntBits(catchingFishMVIServiceFlux.CatchingFishCoroutine - f9) << 32) | (Float.floatToRawIntBits(catchingFishMVIServiceFlux.CatchingFishReduxKtor - f8) & j2), Float.intBitsToFloat((int) (catchingFishMVIServiceFlux.CatchingFishViewModelFAB >> 32)));
                        }
                    }
                }
                if ((catchingFishSpannableAdMob instanceof CatchingFishMockkAndroidX) && Build.VERSION.SDK_INT < 33 && (catchingFishJUnitGlide = catchingFishMVVMFABFAB.CatchingFishViewModelFAB) != null) {
                    catchingFishJUnitGlide.CatchingFishParcelableFAB();
                }
            }
            z2 = true;
        }
        catchingFishMVVMFABFAB.CatchingFishRoomDatabase = catchingFishMockkLiveData.CatchingFishReduxKtor;
        if (i != 0 || z2) {
            if (Build.VERSION.SDK_INT >= 26) {
                ViewParent parent = catchingFishGradleCameraX.getParent();
                if (parent != null) {
                    parent.onDescendantInvalidated(catchingFishGradleCameraX, catchingFishGradleCameraX);
                }
            } else {
                catchingFishGradleCameraX.invalidate();
            }
            if (catchingFishGradleCameraX.CatchingFishLayout) {
                catchingFishGradleCameraX.CatchingFishSensorManager(0.0f);
            }
        }
        boolean z4 = this.CatchingFishCoroutineFlow;
        boolean z5 = catchingFishMockkLiveData.CatchingFishUnitTesting;
        this.CatchingFishCoroutineFlow = z5;
        this.CatchingFishGsonAppCompat = catchingFishMockkLiveData.CatchingFishViewModelScope;
        boolean z6 = catchingFishWidgetIntent2.CatchingFishParcelableFAB == catchingFishWidgetIntent.CatchingFishParcelableFAB && catchingFishWidgetIntent2.CatchingFishSnackbar == catchingFishWidgetIntent.CatchingFishSnackbar && catchingFishWidgetIntent2.CatchingFishCoroutine == catchingFishWidgetIntent.CatchingFishCoroutine && catchingFishWidgetIntent2.CatchingFishReduxKtor == catchingFishWidgetIntent.CatchingFishReduxKtor && catchingFishWidgetIntent2.CatchingFishDaggerWebsocket == catchingFishWidgetIntent.CatchingFishDaggerWebsocket;
        boolean z7 = !z6;
        if (z && ((!z6 || z4 != z5) && (catchingFishAdMobJUnit = (catchingFishBiometricRoom2 = catchingFishBiometricRoom).CatchingFishStateLiveData) != null)) {
            ((CatchingFishGradleCameraX) catchingFishAdMobJUnit).CatchingFishSpannableWidget(catchingFishBiometricRoom2);
        }
        return z7;
    }

    public void CatchingFishKtor(CatchingFishMVVMView catchingFishMVVMView, long j, CatchingFishStripeAPIOkHttp catchingFishStripeAPIOkHttp, int i, boolean z) {
        CatchingFishDaggerToolbar catchingFishDaggerToolbar = this.CatchingFishNavigation;
        if (catchingFishDaggerToolbar != null) {
            catchingFishDaggerToolbar.CatchingFishLifecycle(catchingFishMVVMView, catchingFishDaggerToolbar.CatchingFishKtorService(j), catchingFishStripeAPIOkHttp, i, z);
        }
    }

    public final long CatchingFishKtorService(long j) {
        long j2 = this.CatchingFishCardViewView;
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - ((int) (j2 >> 32));
        long floatToRawIntBits = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) - ((int) (j2 & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
        CatchingFishFABGlide catchingFishFABGlide = this.CatchingFishDagger;
        return catchingFishFABGlide != null ? ((CatchingFishMVVMFABFAB) catchingFishFABGlide).CatchingFishCoroutine(floatToRawIntBits, true) : floatToRawIntBits;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c2, code lost:
    
        if (kotlin.text.CatchingFishRobolectricHilt.CatchingFishUnitTesting(r18.CatchingFishParcelableFAB(), kotlin.text.CatchingFishLayoutRoomFAB.CatchingFishSnackbar(r2, r7, false)) > 0) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void CatchingFishLifecycle(CatchingFishMVVMView catchingFishMVVMView, long j, CatchingFishStripeAPIOkHttp catchingFishStripeAPIOkHttp, int i, boolean z) {
        boolean z2;
        boolean z3;
        CatchingFishFABStripeAPIFAB CatchingFishDynamicFeature = CatchingFishDynamicFeature(catchingFishMVVMView.CatchingFishReduxKtor());
        if (!CatchingFishToolbarEspresso(j)) {
            if (i == 1) {
                float CatchingFishGlideWidgetKtor = CatchingFishGlideWidgetKtor(j, CatchingFishMVPReduxContext());
                if ((Float.floatToRawIntBits(CatchingFishGlideWidgetKtor) & Integer.MAX_VALUE) < 2139095040) {
                    if (catchingFishStripeAPIOkHttp.CatchingFishWorkManager != CatchingFishToastCustomView.CatchingFishMotionLayout(catchingFishStripeAPIOkHttp)) {
                        if (CatchingFishRobolectricHilt.CatchingFishUnitTesting(catchingFishStripeAPIOkHttp.CatchingFishParcelableFAB(), CatchingFishLayoutRoomFAB.CatchingFishSnackbar(CatchingFishGlideWidgetKtor, false, false)) <= 0) {
                            return;
                        }
                    }
                    CatchingFishCameraX(CatchingFishDynamicFeature, catchingFishMVVMView, j, catchingFishStripeAPIOkHttp, i, false, CatchingFishGlideWidgetKtor);
                    return;
                }
                return;
            }
            return;
        }
        if (CatchingFishDynamicFeature == null) {
            CatchingFishKtor(catchingFishMVVMView, j, catchingFishStripeAPIOkHttp, i, z);
            return;
        }
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        if (intBitsToFloat >= 0.0f && intBitsToFloat2 >= 0.0f && intBitsToFloat < CatchingFishGradleManifest() && intBitsToFloat2 < CatchingFishPayPalLiveData()) {
            CatchingFishSharedFlow(CatchingFishDynamicFeature, catchingFishMVVMView, j, catchingFishStripeAPIOkHttp, i, z);
            return;
        }
        float CatchingFishGlideWidgetKtor2 = i == 1 ? CatchingFishGlideWidgetKtor(j, CatchingFishMVPReduxContext()) : Float.POSITIVE_INFINITY;
        if ((Float.floatToRawIntBits(CatchingFishGlideWidgetKtor2) & Integer.MAX_VALUE) < 2139095040) {
            if (catchingFishStripeAPIOkHttp.CatchingFishWorkManager == CatchingFishToastCustomView.CatchingFishMotionLayout(catchingFishStripeAPIOkHttp)) {
                z2 = z;
            } else {
                z2 = z;
            }
            z3 = true;
            CatchingFishMaterialDesign(CatchingFishDynamicFeature, catchingFishMVVMView, j, catchingFishStripeAPIOkHttp, i, z2, CatchingFishGlideWidgetKtor2, z3);
        }
        z2 = z;
        z3 = false;
        CatchingFishMaterialDesign(CatchingFishDynamicFeature, catchingFishMVVMView, j, catchingFishStripeAPIOkHttp, i, z2, CatchingFishGlideWidgetKtor2, z3);
    }

    public final void CatchingFishLifecycleHilt(long j, float f, CatchingFishServiceHandler catchingFishServiceHandler) {
        CatchingFishGradle(catchingFishServiceHandler, false);
        boolean CatchingFishCardViewView = CatchingFishFirebaseDagger.CatchingFishCardViewView(this.CatchingFishCardViewView, j);
        CatchingFishBiometricRoom catchingFishBiometricRoom = this.CatchingFishRoomDatabase;
        if (!CatchingFishCardViewView) {
            ((CatchingFishGradleCameraX) CatchingFishMVVMBundleFAB.CatchingFishParcelableFAB(catchingFishBiometricRoom)).CatchingFishSensorManager(-4.0f);
            this.CatchingFishCardViewView = j;
            catchingFishBiometricRoom.CatchingFishPayPalService.CatchingFishAnimationMockk.CatchingFishStateFlow();
            CatchingFishFABGlide catchingFishFABGlide = this.CatchingFishDagger;
            if (catchingFishFABGlide != null) {
                ((CatchingFishMVVMFABFAB) catchingFishFABGlide).CatchingFishReduxKtor(j);
            } else {
                CatchingFishDaggerToolbar catchingFishDaggerToolbar = this.CatchingFish;
                if (catchingFishDaggerToolbar != null) {
                    catchingFishDaggerToolbar.CatchingFishMVPHandler();
                }
            }
            catchingFishBiometricRoom.CatchingFishPayPalService();
            CatchingFishWidgetXMLLayout.CatchingFishMockkOkHttp(this);
            CatchingFishAdMobJUnit catchingFishAdMobJUnit = catchingFishBiometricRoom.CatchingFishStateLiveData;
            if (catchingFishAdMobJUnit != null) {
                ((CatchingFishGradleCameraX) catchingFishAdMobJUnit).CatchingFishSpannableWidget(catchingFishBiometricRoom);
            }
        }
        this.CatchingFishMVPRobolectric = f;
        if (!this.CatchingFishOkHttp) {
            CatchingFishJUnitRealm(CatchingFishNavigationGson());
        }
        if (this == ((CatchingFishDaggerToolbar) catchingFishBiometricRoom.CatchingFishJobScheduler.CatchingFishViewModelFAB)) {
            ((CatchingFishGradleCameraX) CatchingFishMVVMBundleFAB.CatchingFishParcelableFAB(catchingFishBiometricRoom)).getRectManager().CatchingFishViewModelScope(catchingFishBiometricRoom, !catchingFishBiometricRoom.CatchingFishPayPalService.CatchingFishAnimationMockk.CatchingFishUnitTesting);
        }
    }

    public final long CatchingFishLiveDataRoom(CatchingFishMockkCoroutine catchingFishMockkCoroutine, long j) {
        CatchingFishDaggerToolbar catchingFishDaggerToolbar;
        boolean z = catchingFishMockkCoroutine instanceof CatchingFishViewAdMob;
        if (z) {
            CatchingFishViewAdMob catchingFishViewAdMob = (CatchingFishViewAdMob) catchingFishMockkCoroutine;
            catchingFishViewAdMob.CatchingFishReduxKtor.CatchingFishRoomDatabase.CatchingFishGlideMVP();
            return catchingFishViewAdMob.CatchingFishCoroutine(this, j ^ (-9223372034707292160L)) ^ (-9223372034707292160L);
        }
        CatchingFishViewAdMob catchingFishViewAdMob2 = z ? (CatchingFishViewAdMob) catchingFishMockkCoroutine : null;
        if (catchingFishViewAdMob2 == null || (catchingFishDaggerToolbar = catchingFishViewAdMob2.CatchingFishReduxKtor.CatchingFishRoomDatabase) == null) {
            CatchingFishFirebaseDagger.CatchingFishStateLiveData(catchingFishMockkCoroutine, "null cannot be cast to non-null type androidx.compose.ui.node.NodeCoordinator");
            catchingFishDaggerToolbar = (CatchingFishDaggerToolbar) catchingFishMockkCoroutine;
        }
        catchingFishDaggerToolbar.CatchingFishGlideMVP();
        CatchingFishDaggerToolbar CatchingFishWidget = CatchingFishWidget(catchingFishDaggerToolbar);
        while (catchingFishDaggerToolbar != CatchingFishWidget) {
            j = catchingFishDaggerToolbar.CatchingFishJUnitIntent(j);
            catchingFishDaggerToolbar = catchingFishDaggerToolbar.CatchingFish;
            CatchingFishFirebaseDagger.CatchingFishAnimationMockk(catchingFishDaggerToolbar);
        }
        return CatchingFishView(CatchingFishWidget, j);
    }

    public final void CatchingFishMVPHandler() {
        CatchingFishFABGlide catchingFishFABGlide = this.CatchingFishDagger;
        if (catchingFishFABGlide != null) {
            catchingFishFABGlide.invalidate();
            return;
        }
        CatchingFishDaggerToolbar catchingFishDaggerToolbar = this.CatchingFish;
        if (catchingFishDaggerToolbar != null) {
            catchingFishDaggerToolbar.CatchingFishMVPHandler();
        }
    }

    public final long CatchingFishMVPReduxContext() {
        return this.CatchingFishSpannableWidget.CatchingFishFragmentFactory(this.CatchingFishRoomDatabase.CatchingFishCardViewView.CatchingFishParcelableFAB());
    }

    @Override // kotlin.text.CatchingFishWidgetXMLLayout
    public final CatchingFishWidgetXMLLayout CatchingFishMVVMAppCompat() {
        return this.CatchingFishNavigation;
    }

    public final void CatchingFishMaterialDesign(CatchingFishFABStripeAPIFAB catchingFishFABStripeAPIFAB, CatchingFishMVVMView catchingFishMVVMView, long j, CatchingFishStripeAPIOkHttp catchingFishStripeAPIOkHttp, int i, boolean z, float f, boolean z2) {
        if (catchingFishFABStripeAPIFAB == null) {
            CatchingFishKtor(catchingFishMVVMView, j, catchingFishStripeAPIOkHttp, i, z);
            return;
        }
        int i2 = i;
        boolean z3 = z;
        if (i2 == 3 || i2 == 4) {
            CatchingFishFABStripeAPIFAB catchingFishFABStripeAPIFAB2 = catchingFishFABStripeAPIFAB;
            while (true) {
                if (catchingFishFABStripeAPIFAB2 == null) {
                    break;
                }
                if (catchingFishFABStripeAPIFAB2 instanceof CatchingFishAdMobPicasso) {
                    long j2 = CatchingFishMVIFABToolbar.CatchingFishParcelableFAB;
                    int i3 = (int) (j >> 32);
                    float intBitsToFloat = Float.intBitsToFloat(i3);
                    CatchingFishBiometricRoom catchingFishBiometricRoom = this.CatchingFishRoomDatabase;
                    CatchingFishGradleMVPKtor catchingFishGradleMVPKtor = catchingFishBiometricRoom.CatchingFishPayPal;
                    long j3 = Long.MIN_VALUE & j2;
                    CatchingFishGradleMVPKtor catchingFishGradleMVPKtor2 = CatchingFishGradleMVPKtor.CatchingFishReduxKtor;
                    if (intBitsToFloat >= (-((j3 == 0 || catchingFishGradleMVPKtor == catchingFishGradleMVPKtor2) ? CatchingFishExoPlayerMVP.CatchingFishCoroutine(0, j2) : CatchingFishExoPlayerMVP.CatchingFishCoroutine(2, j2)))) {
                        if (Float.intBitsToFloat(i3) < CatchingFishGradleManifest() + ((j3 == 0 || catchingFishBiometricRoom.CatchingFishPayPal == catchingFishGradleMVPKtor2) ? CatchingFishExoPlayerMVP.CatchingFishCoroutine(2, j2) : CatchingFishExoPlayerMVP.CatchingFishCoroutine(0, j2))) {
                            int i4 = (int) (j & 4294967295L);
                            if (Float.intBitsToFloat(i4) >= (-CatchingFishExoPlayerMVP.CatchingFishCoroutine(1, j2))) {
                                if (Float.intBitsToFloat(i4) < CatchingFishExoPlayerMVP.CatchingFishCoroutine(3, j2) + CatchingFishPayPalLiveData()) {
                                    CatchingFishViewFAB catchingFishViewFAB = catchingFishStripeAPIOkHttp.CatchingFishDaggerWebsocket;
                                    CatchingFishBundleGradle catchingFishBundleGradle = catchingFishStripeAPIOkHttp.CatchingFishReduxKtor;
                                    if (catchingFishStripeAPIOkHttp.CatchingFishWorkManager == CatchingFishToastCustomView.CatchingFishMotionLayout(catchingFishStripeAPIOkHttp)) {
                                        int i5 = catchingFishStripeAPIOkHttp.CatchingFishWorkManager;
                                        catchingFishStripeAPIOkHttp.CatchingFishSnackbar(i5 + 1, catchingFishBundleGradle.CatchingFishSnackbar);
                                        catchingFishStripeAPIOkHttp.CatchingFishWorkManager++;
                                        catchingFishBundleGradle.CatchingFishParcelableFAB(catchingFishFABStripeAPIFAB);
                                        catchingFishViewFAB.CatchingFishParcelableFAB(CatchingFishLayoutRoomFAB.CatchingFishSnackbar(0.0f, z3, true));
                                        CatchingFishMaterialDesign(CatchingFishToastHiltBundle.CatchingFishViewModelScope(catchingFishFABStripeAPIFAB, catchingFishMVVMView.CatchingFishReduxKtor()), catchingFishMVVMView, j, catchingFishStripeAPIOkHttp, i2, z3, f, z2);
                                        catchingFishStripeAPIOkHttp.CatchingFishWorkManager = i5;
                                        return;
                                    }
                                    long CatchingFishParcelableFAB = catchingFishStripeAPIOkHttp.CatchingFishParcelableFAB();
                                    int i6 = catchingFishStripeAPIOkHttp.CatchingFishWorkManager;
                                    if (!CatchingFishRobolectricHilt.CatchingFishFragmentFactory(CatchingFishParcelableFAB)) {
                                        if (CatchingFishRobolectricHilt.CatchingFishDaggerHiltFAB(CatchingFishParcelableFAB) > 0.0f) {
                                            int i7 = catchingFishStripeAPIOkHttp.CatchingFishWorkManager;
                                            catchingFishStripeAPIOkHttp.CatchingFishSnackbar(i7 + 1, catchingFishBundleGradle.CatchingFishSnackbar);
                                            catchingFishStripeAPIOkHttp.CatchingFishWorkManager++;
                                            catchingFishBundleGradle.CatchingFishParcelableFAB(catchingFishFABStripeAPIFAB);
                                            catchingFishViewFAB.CatchingFishParcelableFAB(CatchingFishLayoutRoomFAB.CatchingFishSnackbar(0.0f, z3, true));
                                            CatchingFishMaterialDesign(CatchingFishToastHiltBundle.CatchingFishViewModelScope(catchingFishFABStripeAPIFAB, catchingFishMVVMView.CatchingFishReduxKtor()), catchingFishMVVMView, j, catchingFishStripeAPIOkHttp, i, z3, f, z2);
                                            catchingFishStripeAPIOkHttp.CatchingFishWorkManager = i7;
                                            return;
                                        }
                                        return;
                                    }
                                    int CatchingFishMotionLayout = CatchingFishToastCustomView.CatchingFishMotionLayout(catchingFishStripeAPIOkHttp);
                                    catchingFishStripeAPIOkHttp.CatchingFishWorkManager = CatchingFishMotionLayout;
                                    catchingFishStripeAPIOkHttp.CatchingFishSnackbar(CatchingFishMotionLayout + 1, catchingFishBundleGradle.CatchingFishSnackbar);
                                    catchingFishStripeAPIOkHttp.CatchingFishWorkManager++;
                                    catchingFishBundleGradle.CatchingFishParcelableFAB(catchingFishFABStripeAPIFAB);
                                    catchingFishViewFAB.CatchingFishParcelableFAB(CatchingFishLayoutRoomFAB.CatchingFishSnackbar(0.0f, z3, true));
                                    CatchingFishMaterialDesign(CatchingFishToastHiltBundle.CatchingFishViewModelScope(catchingFishFABStripeAPIFAB, catchingFishMVVMView.CatchingFishReduxKtor()), catchingFishMVVMView, j, catchingFishStripeAPIOkHttp, i, z3, f, z2);
                                    catchingFishStripeAPIOkHttp.CatchingFishWorkManager = CatchingFishMotionLayout;
                                    if (CatchingFishRobolectricHilt.CatchingFishDaggerHiltFAB(catchingFishStripeAPIOkHttp.CatchingFishParcelableFAB()) < 0.0f) {
                                        catchingFishStripeAPIOkHttp.CatchingFishSnackbar(i6 + 1, catchingFishStripeAPIOkHttp.CatchingFishWorkManager + 1);
                                    }
                                    catchingFishStripeAPIOkHttp.CatchingFishWorkManager = i6;
                                    return;
                                }
                            }
                        }
                    }
                } else {
                    catchingFishFABStripeAPIFAB2 = null;
                    i2 = i;
                    z3 = z;
                }
            }
        }
        if (z2) {
            CatchingFishCameraX(catchingFishFABStripeAPIFAB, catchingFishMVVMView, j, catchingFishStripeAPIOkHttp, i, z, f);
        } else {
            catchingFishMVVMView.CatchingFishCloudMessaging(catchingFishFABStripeAPIFAB);
            CatchingFishMaterialDesign(CatchingFishToastHiltBundle.CatchingFishViewModelScope(catchingFishFABStripeAPIFAB, catchingFishMVVMView.CatchingFishReduxKtor()), catchingFishMVVMView, j, catchingFishStripeAPIOkHttp, i, z, f, false);
        }
    }

    @Override // kotlin.text.CatchingFishWidgetXMLLayout
    public final boolean CatchingFishMoshiDaggerHilt() {
        return this.CatchingFishCardViewRealm != null;
    }

    @Override // kotlin.text.CatchingFishWidgetXMLLayout
    public final CatchingFishSharedFlowMVP CatchingFishNavigationGson() {
        CatchingFishSharedFlowMVP catchingFishSharedFlowMVP = this.CatchingFishCardViewRealm;
        if (catchingFishSharedFlowMVP != null) {
            return catchingFishSharedFlowMVP;
        }
        throw new IllegalStateException("Asking for measurement result of unmeasured layout modifier");
    }

    @Override // kotlin.text.CatchingFishMockkCoroutine
    public final long CatchingFishParcelableFAB(long j) {
        if (!CatchingFishRealmKtorRealm().CatchingFishRoomDatabase) {
            CatchingFishFluxGradle.CatchingFishSnackbar("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return ((CatchingFishGradleCameraX) CatchingFishMVVMBundleFAB.CatchingFishParcelableFAB(this.CatchingFishRoomDatabase)).CatchingFish(CatchingFishEspressoMockk(j));
    }

    public final CatchingFishFABStripeAPIFAB CatchingFishPayPalHandler(boolean z) {
        CatchingFishFABStripeAPIFAB CatchingFishRealmKtorRealm;
        CatchingFishExoPlayerBundle catchingFishExoPlayerBundle = this.CatchingFishRoomDatabase.CatchingFishJobScheduler;
        if (((CatchingFishDaggerToolbar) catchingFishExoPlayerBundle.CatchingFishViewModelFAB) == this) {
            return (CatchingFishFABStripeAPIFAB) catchingFishExoPlayerBundle.CatchingFishFragmentHandler;
        }
        if (!z) {
            CatchingFishDaggerToolbar catchingFishDaggerToolbar = this.CatchingFish;
            if (catchingFishDaggerToolbar != null) {
                return catchingFishDaggerToolbar.CatchingFishRealmKtorRealm();
            }
            return null;
        }
        CatchingFishDaggerToolbar catchingFishDaggerToolbar2 = this.CatchingFish;
        if (catchingFishDaggerToolbar2 == null || (CatchingFishRealmKtorRealm = catchingFishDaggerToolbar2.CatchingFishRealmKtorRealm()) == null) {
            return null;
        }
        return CatchingFishRealmKtorRealm.CatchingFishLayout;
    }

    public abstract CatchingFishFABStripeAPIFAB CatchingFishRealmKtorRealm();

    @Override // kotlin.text.CatchingFishWidgetXMLLayout
    public final CatchingFishWidgetXMLLayout CatchingFishRedux() {
        return this.CatchingFish;
    }

    public final void CatchingFishRetrofit(CatchingFishDaggerToolbar catchingFishDaggerToolbar, CatchingFishAdMobKtor catchingFishAdMobKtor, boolean z) {
        if (catchingFishDaggerToolbar == this) {
            return;
        }
        CatchingFishDaggerToolbar catchingFishDaggerToolbar2 = this.CatchingFish;
        if (catchingFishDaggerToolbar2 != null) {
            catchingFishDaggerToolbar2.CatchingFishRetrofit(catchingFishDaggerToolbar, catchingFishAdMobKtor, z);
        }
        long j = this.CatchingFishCardViewView;
        float f = (int) (j >> 32);
        catchingFishAdMobKtor.CatchingFishParcelableFAB -= f;
        catchingFishAdMobKtor.CatchingFishCoroutine -= f;
        float f2 = (int) (j & 4294967295L);
        catchingFishAdMobKtor.CatchingFishSnackbar -= f2;
        catchingFishAdMobKtor.CatchingFishReduxKtor -= f2;
        CatchingFishFABGlide catchingFishFABGlide = this.CatchingFishDagger;
        if (catchingFishFABGlide != null) {
            CatchingFishMVVMFABFAB catchingFishMVVMFABFAB = (CatchingFishMVVMFABFAB) catchingFishFABGlide;
            float[] CatchingFishParcelableFAB = catchingFishMVVMFABFAB.CatchingFishParcelableFAB();
            if (!catchingFishMVVMFABFAB.CatchingFishDaggerHiltFAB) {
                if (CatchingFishParcelableFAB == null) {
                    catchingFishAdMobKtor.CatchingFishParcelableFAB = 0.0f;
                    catchingFishAdMobKtor.CatchingFishSnackbar = 0.0f;
                    catchingFishAdMobKtor.CatchingFishCoroutine = 0.0f;
                    catchingFishAdMobKtor.CatchingFishReduxKtor = 0.0f;
                } else {
                    CatchingFishOkHttpFAB.CatchingFishPayPalService(CatchingFishParcelableFAB, catchingFishAdMobKtor);
                }
            }
            if (this.CatchingFishCoroutineFlow && z) {
                long j2 = this.CatchingFishWorkManager;
                catchingFishAdMobKtor.CatchingFishParcelableFAB(0.0f, 0.0f, (int) (j2 >> 32), (int) (j2 & 4294967295L));
            }
        }
    }

    public final CatchingFishFluxExoPlayer CatchingFishRetrofitCameraX() {
        if (CatchingFishRealmKtorRealm().CatchingFishRoomDatabase) {
            CatchingFishMockkCoroutine CatchingFishParcelableFlux = CatchingFishLayoutRoomFAB.CatchingFishParcelableFlux(this);
            CatchingFishAdMobKtor catchingFishAdMobKtor = this.CatchingFishCustomView;
            if (catchingFishAdMobKtor == null) {
                catchingFishAdMobKtor = new CatchingFishAdMobKtor();
                this.CatchingFishCustomView = catchingFishAdMobKtor;
            }
            long CatchingFishServiceMVIJUnit = CatchingFishServiceMVIJUnit(CatchingFishMVPReduxContext());
            int i = (int) (CatchingFishServiceMVIJUnit >> 32);
            catchingFishAdMobKtor.CatchingFishParcelableFAB = -Float.intBitsToFloat(i);
            int i2 = (int) (CatchingFishServiceMVIJUnit & 4294967295L);
            catchingFishAdMobKtor.CatchingFishSnackbar = -Float.intBitsToFloat(i2);
            catchingFishAdMobKtor.CatchingFishCoroutine = Float.intBitsToFloat(i) + CatchingFishGradleManifest();
            catchingFishAdMobKtor.CatchingFishReduxKtor = Float.intBitsToFloat(i2) + CatchingFishPayPalLiveData();
            CatchingFishDaggerToolbar catchingFishDaggerToolbar = this;
            while (catchingFishDaggerToolbar != CatchingFishParcelableFlux) {
                catchingFishDaggerToolbar.CatchingFishStripeAPIWidget(catchingFishAdMobKtor, false, true);
                if (!catchingFishAdMobKtor.CatchingFishSnackbar()) {
                    catchingFishDaggerToolbar = catchingFishDaggerToolbar.CatchingFish;
                    CatchingFishFirebaseDagger.CatchingFishAnimationMockk(catchingFishDaggerToolbar);
                }
            }
            return new CatchingFishFluxExoPlayer(catchingFishAdMobKtor.CatchingFishParcelableFAB, catchingFishAdMobKtor.CatchingFishSnackbar, catchingFishAdMobKtor.CatchingFishCoroutine, catchingFishAdMobKtor.CatchingFishReduxKtor);
        }
        return CatchingFishFluxExoPlayer.CatchingFishDaggerWebsocket;
    }

    @Override // kotlin.text.CatchingFishMockkCoroutine
    public final long CatchingFishSensorManager() {
        return this.CatchingFishWorkManager;
    }

    public final long CatchingFishServiceMVIJUnit(long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - CatchingFishGradleManifest();
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - CatchingFishPayPalLiveData();
        float max = Math.max(0.0f, intBitsToFloat / 2.0f);
        float max2 = Math.max(0.0f, intBitsToFloat2 / 2.0f);
        return (Float.floatToRawIntBits(max2) & 4294967295L) | (Float.floatToRawIntBits(max) << 32);
    }

    public final void CatchingFishSharedFlow(CatchingFishFABStripeAPIFAB catchingFishFABStripeAPIFAB, CatchingFishMVVMView catchingFishMVVMView, long j, CatchingFishStripeAPIOkHttp catchingFishStripeAPIOkHttp, int i, boolean z) {
        if (catchingFishFABStripeAPIFAB == null) {
            CatchingFishKtor(catchingFishMVVMView, j, catchingFishStripeAPIOkHttp, i, z);
            return;
        }
        int i2 = catchingFishStripeAPIOkHttp.CatchingFishWorkManager;
        CatchingFishBundleGradle catchingFishBundleGradle = catchingFishStripeAPIOkHttp.CatchingFishReduxKtor;
        catchingFishStripeAPIOkHttp.CatchingFishSnackbar(i2 + 1, catchingFishBundleGradle.CatchingFishSnackbar);
        catchingFishStripeAPIOkHttp.CatchingFishWorkManager++;
        catchingFishBundleGradle.CatchingFishParcelableFAB(catchingFishFABStripeAPIFAB);
        catchingFishStripeAPIOkHttp.CatchingFishDaggerWebsocket.CatchingFishParcelableFAB(CatchingFishLayoutRoomFAB.CatchingFishSnackbar(-1.0f, z, false));
        CatchingFishSharedFlow(CatchingFishToastHiltBundle.CatchingFishViewModelScope(catchingFishFABStripeAPIFAB, catchingFishMVVMView.CatchingFishReduxKtor()), catchingFishMVVMView, j, catchingFishStripeAPIOkHttp, i, z);
        catchingFishStripeAPIOkHttp.CatchingFishWorkManager = i2;
    }

    public abstract void CatchingFishStateFlowIntent();

    @Override // kotlin.text.CatchingFishMockkCoroutine
    public final CatchingFishFluxExoPlayer CatchingFishStateLiveData(CatchingFishMockkCoroutine catchingFishMockkCoroutine, boolean z) {
        CatchingFishDaggerToolbar catchingFishDaggerToolbar;
        if (!CatchingFishRealmKtorRealm().CatchingFishRoomDatabase) {
            CatchingFishFluxGradle.CatchingFishSnackbar("LayoutCoordinate operations are only valid when isAttached is true");
        }
        if (!catchingFishMockkCoroutine.CatchingFishCustomView()) {
            CatchingFishFluxGradle.CatchingFishSnackbar("LayoutCoordinates " + catchingFishMockkCoroutine + " is not attached!");
        }
        CatchingFishViewAdMob catchingFishViewAdMob = catchingFishMockkCoroutine instanceof CatchingFishViewAdMob ? (CatchingFishViewAdMob) catchingFishMockkCoroutine : null;
        if (catchingFishViewAdMob == null || (catchingFishDaggerToolbar = catchingFishViewAdMob.CatchingFishReduxKtor.CatchingFishRoomDatabase) == null) {
            catchingFishDaggerToolbar = (CatchingFishDaggerToolbar) catchingFishMockkCoroutine;
        }
        catchingFishDaggerToolbar.CatchingFishGlideMVP();
        CatchingFishDaggerToolbar CatchingFishWidget = CatchingFishWidget(catchingFishDaggerToolbar);
        CatchingFishAdMobKtor catchingFishAdMobKtor = this.CatchingFishCustomView;
        if (catchingFishAdMobKtor == null) {
            catchingFishAdMobKtor = new CatchingFishAdMobKtor();
            this.CatchingFishCustomView = catchingFishAdMobKtor;
        }
        catchingFishAdMobKtor.CatchingFishParcelableFAB = 0.0f;
        catchingFishAdMobKtor.CatchingFishSnackbar = 0.0f;
        catchingFishAdMobKtor.CatchingFishCoroutine = (int) (catchingFishMockkCoroutine.CatchingFishSensorManager() >> 32);
        catchingFishAdMobKtor.CatchingFishReduxKtor = (int) (catchingFishMockkCoroutine.CatchingFishSensorManager() & 4294967295L);
        while (catchingFishDaggerToolbar != CatchingFishWidget) {
            catchingFishDaggerToolbar.CatchingFishStripeAPIWidget(catchingFishAdMobKtor, z, false);
            if (catchingFishAdMobKtor.CatchingFishSnackbar()) {
                return CatchingFishFluxExoPlayer.CatchingFishDaggerWebsocket;
            }
            catchingFishDaggerToolbar = catchingFishDaggerToolbar.CatchingFish;
            CatchingFishFirebaseDagger.CatchingFishAnimationMockk(catchingFishDaggerToolbar);
        }
        CatchingFishRetrofit(CatchingFishWidget, catchingFishAdMobKtor, z);
        return new CatchingFishFluxExoPlayer(catchingFishAdMobKtor.CatchingFishParcelableFAB, catchingFishAdMobKtor.CatchingFishSnackbar, catchingFishAdMobKtor.CatchingFishCoroutine, catchingFishAdMobKtor.CatchingFishReduxKtor);
    }

    public final void CatchingFishStripeAPIWidget(CatchingFishAdMobKtor catchingFishAdMobKtor, boolean z, boolean z2) {
        CatchingFishFABGlide catchingFishFABGlide = this.CatchingFishDagger;
        if (catchingFishFABGlide != null) {
            if (this.CatchingFishCoroutineFlow) {
                if (z2) {
                    long CatchingFishMVPReduxContext = CatchingFishMVPReduxContext();
                    float intBitsToFloat = Float.intBitsToFloat((int) (CatchingFishMVPReduxContext >> 32)) / 2.0f;
                    float intBitsToFloat2 = Float.intBitsToFloat((int) (CatchingFishMVPReduxContext & 4294967295L)) / 2.0f;
                    long j = this.CatchingFishWorkManager;
                    catchingFishAdMobKtor.CatchingFishParcelableFAB(-intBitsToFloat, -intBitsToFloat2, ((int) (j >> 32)) + intBitsToFloat, ((int) (j & 4294967295L)) + intBitsToFloat2);
                } else if (z) {
                    long j2 = this.CatchingFishWorkManager;
                    catchingFishAdMobKtor.CatchingFishParcelableFAB(0.0f, 0.0f, (int) (j2 >> 32), (int) (j2 & 4294967295L));
                }
                if (catchingFishAdMobKtor.CatchingFishSnackbar()) {
                    return;
                }
            }
            CatchingFishMVVMFABFAB catchingFishMVVMFABFAB = (CatchingFishMVVMFABFAB) catchingFishFABGlide;
            float[] CatchingFishSnackbar = catchingFishMVVMFABFAB.CatchingFishSnackbar();
            if (!catchingFishMVVMFABFAB.CatchingFishDaggerHiltFAB) {
                if (CatchingFishSnackbar == null) {
                    catchingFishAdMobKtor.CatchingFishParcelableFAB = 0.0f;
                    catchingFishAdMobKtor.CatchingFishSnackbar = 0.0f;
                    catchingFishAdMobKtor.CatchingFishCoroutine = 0.0f;
                    catchingFishAdMobKtor.CatchingFishReduxKtor = 0.0f;
                } else {
                    CatchingFishOkHttpFAB.CatchingFishPayPalService(CatchingFishSnackbar, catchingFishAdMobKtor);
                }
            }
        }
        long j3 = this.CatchingFishCardViewView;
        float f = (int) (j3 >> 32);
        catchingFishAdMobKtor.CatchingFishParcelableFAB += f;
        catchingFishAdMobKtor.CatchingFishCoroutine += f;
        float f2 = (int) (j3 & 4294967295L);
        catchingFishAdMobKtor.CatchingFishSnackbar += f2;
        catchingFishAdMobKtor.CatchingFishReduxKtor += f2;
    }

    public final void CatchingFishToolbar() {
        boolean CatchingFishReduxKtor = CatchingFishJUnitJUnit.CatchingFishReduxKtor(128);
        CatchingFishFABStripeAPIFAB CatchingFishRealmKtorRealm = CatchingFishRealmKtorRealm();
        if (!CatchingFishReduxKtor && (CatchingFishRealmKtorRealm = CatchingFishRealmKtorRealm.CatchingFishViewModelFAB) == null) {
            return;
        }
        for (CatchingFishFABStripeAPIFAB CatchingFishPayPalHandler = CatchingFishPayPalHandler(CatchingFishReduxKtor); CatchingFishPayPalHandler != null && (CatchingFishPayPalHandler.CatchingFishViewModelScope & 128) != 0; CatchingFishPayPalHandler = CatchingFishPayPalHandler.CatchingFishLayout) {
            if ((CatchingFishPayPalHandler.CatchingFishWorkManager & 128) != 0) {
                for (Object obj = CatchingFishPayPalHandler; obj != null; obj = null) {
                    if (obj instanceof CatchingFishLayoutAsyncTask) {
                        ((CatchingFishLayoutAsyncTask) obj).CatchingFishEspressoTesting(this);
                    }
                }
            }
            if (CatchingFishPayPalHandler == CatchingFishRealmKtorRealm) {
                return;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean CatchingFishToolbarEspresso(long j) {
        boolean z;
        boolean z2;
        boolean z3;
        if ((((9187343241974906880L ^ (j & 9187343241974906880L)) - 4294967297L) & (-9223372034707292160L)) != 0) {
            return false;
        }
        CatchingFishFABGlide catchingFishFABGlide = this.CatchingFishDagger;
        if (catchingFishFABGlide == null || !this.CatchingFishCoroutineFlow) {
            return true;
        }
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        CatchingFishHiltMVI catchingFishHiltMVI = ((CatchingFishMVVMFABFAB) catchingFishFABGlide).CatchingFishReduxKtor;
        if (catchingFishHiltMVI.CatchingFishSpannableWidget) {
            CatchingFishSpannableAdMob CatchingFishReduxKtor = catchingFishHiltMVI.CatchingFishReduxKtor();
            if (!(CatchingFishReduxKtor instanceof CatchingFishJUnitToolbar)) {
                if (CatchingFishReduxKtor instanceof CatchingFishCoroutineMVI) {
                    CatchingFishMVIServiceFlux catchingFishMVIServiceFlux = ((CatchingFishCoroutineMVI) CatchingFishReduxKtor).CatchingFishParcelableFAB;
                    float f = catchingFishMVIServiceFlux.CatchingFishCoroutine;
                    float f2 = catchingFishMVIServiceFlux.CatchingFishSnackbar;
                    float f3 = catchingFishMVIServiceFlux.CatchingFishReduxKtor;
                    float f4 = catchingFishMVIServiceFlux.CatchingFishParcelableFAB;
                    long j2 = catchingFishMVIServiceFlux.CatchingFishWorkManager;
                    z = false;
                    z2 = true;
                    long j3 = catchingFishMVIServiceFlux.CatchingFishViewModelFAB;
                    long j4 = catchingFishMVIServiceFlux.CatchingFishViewModelScope;
                    long j5 = catchingFishMVIServiceFlux.CatchingFishDaggerWebsocket;
                    if (intBitsToFloat >= f4 && intBitsToFloat < f && intBitsToFloat2 >= f2 && intBitsToFloat2 < f3) {
                        int i = (int) (j5 >> 32);
                        float intBitsToFloat3 = Float.intBitsToFloat(i);
                        int i2 = (int) (j2 >> 32);
                        float f5 = f - f4;
                        if (Float.intBitsToFloat(i2) + intBitsToFloat3 <= f5) {
                            int i3 = (int) (j3 >> 32);
                            float intBitsToFloat4 = Float.intBitsToFloat(i3);
                            int i4 = (int) (j4 >> 32);
                            if (Float.intBitsToFloat(i4) + intBitsToFloat4 <= f5) {
                                int i5 = (int) (j5 & 4294967295L);
                                int i6 = (int) (j3 & 4294967295L);
                                float f6 = f3 - f2;
                                if (Float.intBitsToFloat(i6) + Float.intBitsToFloat(i5) <= f6) {
                                    int i7 = (int) (j2 & 4294967295L);
                                    int i8 = (int) (j4 & 4294967295L);
                                    if (Float.intBitsToFloat(i8) + Float.intBitsToFloat(i7) <= f6) {
                                        float intBitsToFloat5 = Float.intBitsToFloat(i) + f4;
                                        float intBitsToFloat6 = Float.intBitsToFloat(i5) + f2;
                                        float intBitsToFloat7 = f - Float.intBitsToFloat(i2);
                                        float intBitsToFloat8 = Float.intBitsToFloat(i7) + f2;
                                        float intBitsToFloat9 = f - Float.intBitsToFloat(i4);
                                        float intBitsToFloat10 = f3 - Float.intBitsToFloat(i8);
                                        float intBitsToFloat11 = f3 - Float.intBitsToFloat(i6);
                                        float intBitsToFloat12 = Float.intBitsToFloat(i3) + f4;
                                        if (intBitsToFloat < intBitsToFloat5 && intBitsToFloat2 < intBitsToFloat6) {
                                            z3 = CatchingFishLayoutRoom.CatchingFishParcelableFlux(intBitsToFloat, intBitsToFloat2, intBitsToFloat5, intBitsToFloat6, catchingFishMVIServiceFlux.CatchingFishDaggerWebsocket);
                                        } else if (intBitsToFloat < intBitsToFloat12 && intBitsToFloat2 > intBitsToFloat11) {
                                            z3 = CatchingFishLayoutRoom.CatchingFishParcelableFlux(intBitsToFloat, intBitsToFloat2, intBitsToFloat12, intBitsToFloat11, catchingFishMVIServiceFlux.CatchingFishViewModelFAB);
                                        } else if (intBitsToFloat <= intBitsToFloat7 || intBitsToFloat2 >= intBitsToFloat8) {
                                            if (intBitsToFloat > intBitsToFloat9 && intBitsToFloat2 > intBitsToFloat10) {
                                                z3 = CatchingFishLayoutRoom.CatchingFishParcelableFlux(intBitsToFloat, intBitsToFloat2, intBitsToFloat9, intBitsToFloat10, catchingFishMVIServiceFlux.CatchingFishViewModelScope);
                                            }
                                            z3 = z2;
                                        } else {
                                            z3 = CatchingFishLayoutRoom.CatchingFishParcelableFlux(intBitsToFloat, intBitsToFloat2, intBitsToFloat7, intBitsToFloat8, catchingFishMVIServiceFlux.CatchingFishWorkManager);
                                        }
                                    }
                                }
                            }
                        }
                        CatchingFishMoshiRealm catchingFishMoshiRealm = new CatchingFishMoshiRealm();
                        CatchingFishMoshiRealm.CatchingFishParcelableFAB(catchingFishMoshiRealm, catchingFishMVIServiceFlux);
                        z3 = CatchingFishLayoutRoom.CatchingFishSpannableWidget(intBitsToFloat, intBitsToFloat2, catchingFishMoshiRealm);
                    }
                } else {
                    z = false;
                    z2 = true;
                    if (!(CatchingFishReduxKtor instanceof CatchingFishMockkAndroidX)) {
                        throw new CatchingFishBiometricView();
                    }
                    z3 = CatchingFishLayoutRoom.CatchingFishSpannableWidget(intBitsToFloat, intBitsToFloat2, ((CatchingFishMockkAndroidX) CatchingFishReduxKtor).CatchingFishParcelableFAB);
                }
                return z3 ? z2 : z;
            }
            CatchingFishFluxExoPlayer catchingFishFluxExoPlayer = ((CatchingFishJUnitToolbar) CatchingFishReduxKtor).CatchingFishParcelableFAB;
            if (catchingFishFluxExoPlayer.CatchingFishParcelableFAB > intBitsToFloat || intBitsToFloat >= catchingFishFluxExoPlayer.CatchingFishCoroutine || catchingFishFluxExoPlayer.CatchingFishSnackbar > intBitsToFloat2 || intBitsToFloat2 >= catchingFishFluxExoPlayer.CatchingFishReduxKtor) {
                z = false;
                z2 = true;
            }
            z3 = z;
            if (z3) {
            }
        }
        z = false;
        z2 = true;
        z3 = z2;
        if (z3) {
        }
    }

    @Override // kotlin.text.CatchingFishHiltDatabinding
    public final boolean CatchingFishUnitTesting() {
        return (this.CatchingFishDagger == null || this.CatchingFishJetpackCompose || !this.CatchingFishRoomDatabase.CatchingFishCustomView()) ? false : true;
    }

    public final long CatchingFishView(CatchingFishDaggerToolbar catchingFishDaggerToolbar, long j) {
        if (catchingFishDaggerToolbar == this) {
            return j;
        }
        CatchingFishDaggerToolbar catchingFishDaggerToolbar2 = this.CatchingFish;
        return (catchingFishDaggerToolbar2 == null || CatchingFishFirebaseDagger.CatchingFishOkHttp(catchingFishDaggerToolbar, catchingFishDaggerToolbar2)) ? CatchingFishKtorService(j) : CatchingFishKtorService(catchingFishDaggerToolbar2.CatchingFishView(catchingFishDaggerToolbar, j));
    }

    @Override // kotlin.text.CatchingFishMockkCoroutine
    public final long CatchingFishViewModelFAB(long j) {
        long CatchingFishEspressoMockk = CatchingFishEspressoMockk(j);
        CatchingFishGradleCameraX catchingFishGradleCameraX = (CatchingFishGradleCameraX) CatchingFishMVVMBundleFAB.CatchingFishParcelableFAB(this.CatchingFishRoomDatabase);
        catchingFishGradleCameraX.CatchingFishPayPal();
        return CatchingFishOkHttpFAB.CatchingFishJobScheduler(catchingFishGradleCameraX.CatchingFishDataStoreIntent, CatchingFishEspressoMockk);
    }

    public abstract CatchingFishJUnitXMLLayout CatchingFishWebSocketMockk();

    public final void CatchingFishWebsocket(CatchingFishSharedFlowMVP catchingFishSharedFlowMVP) {
        CatchingFishDaggerToolbar catchingFishDaggerToolbar;
        CatchingFishSharedFlowMVP catchingFishSharedFlowMVP2 = this.CatchingFishCardViewRealm;
        if (catchingFishSharedFlowMVP != catchingFishSharedFlowMVP2) {
            this.CatchingFishCardViewRealm = catchingFishSharedFlowMVP;
            CatchingFishBiometricRoom catchingFishBiometricRoom = this.CatchingFishRoomDatabase;
            int i = 0;
            if (catchingFishSharedFlowMVP2 == null || catchingFishSharedFlowMVP.CatchingFishReduxKtor() != catchingFishSharedFlowMVP2.CatchingFishReduxKtor() || catchingFishSharedFlowMVP.CatchingFishSnackbar() != catchingFishSharedFlowMVP2.CatchingFishSnackbar()) {
                int CatchingFishReduxKtor = catchingFishSharedFlowMVP.CatchingFishReduxKtor();
                int CatchingFishSnackbar = catchingFishSharedFlowMVP.CatchingFishSnackbar();
                CatchingFishFABGlide catchingFishFABGlide = this.CatchingFishDagger;
                if (catchingFishFABGlide != null) {
                    ((CatchingFishMVVMFABFAB) catchingFishFABGlide).CatchingFishDaggerWebsocket((CatchingFishReduxKtor << 32) | (CatchingFishSnackbar & 4294967295L));
                } else if (catchingFishBiometricRoom.CatchingFishFragmentFactory() && (catchingFishDaggerToolbar = this.CatchingFish) != null) {
                    catchingFishDaggerToolbar.CatchingFishMVPHandler();
                }
                CatchingFishParcelable((CatchingFishSnackbar & 4294967295L) | (CatchingFishReduxKtor << 32));
                if (this.CatchingFishDaggerHiltFAB != null) {
                    CatchingFishJUnitViewPager(false);
                }
                boolean CatchingFishReduxKtor2 = CatchingFishJUnitJUnit.CatchingFishReduxKtor(4);
                CatchingFishFABStripeAPIFAB CatchingFishRealmKtorRealm = CatchingFishRealmKtorRealm();
                if (CatchingFishReduxKtor2 || (CatchingFishRealmKtorRealm = CatchingFishRealmKtorRealm.CatchingFishViewModelFAB) != null) {
                    for (CatchingFishFABStripeAPIFAB CatchingFishPayPalHandler = CatchingFishPayPalHandler(CatchingFishReduxKtor2); CatchingFishPayPalHandler != null && (CatchingFishPayPalHandler.CatchingFishViewModelScope & 4) != 0; CatchingFishPayPalHandler = CatchingFishPayPalHandler.CatchingFishLayout) {
                        if ((CatchingFishPayPalHandler.CatchingFishWorkManager & 4) != 0) {
                            for (Object obj = CatchingFishPayPalHandler; obj != null; obj = null) {
                                if (obj instanceof CatchingFishFABWorkManager) {
                                    ((CatchingFishFABWorkManager) obj).CatchingFishNavigation();
                                }
                            }
                        }
                        if (CatchingFishPayPalHandler == CatchingFishRealmKtorRealm) {
                            break;
                        }
                    }
                }
                CatchingFishAdMobJUnit catchingFishAdMobJUnit = catchingFishBiometricRoom.CatchingFishStateLiveData;
                if (catchingFishAdMobJUnit != null) {
                    ((CatchingFishGradleCameraX) catchingFishAdMobJUnit).CatchingFishSpannableWidget(catchingFishBiometricRoom);
                }
            }
            CatchingFishJUnitService catchingFishJUnitService = this.CatchingFishPayPal;
            if ((catchingFishJUnitService == null || catchingFishJUnitService.CatchingFishDaggerWebsocket == 0) && catchingFishSharedFlowMVP.CatchingFishParcelableFAB().isEmpty()) {
                return;
            }
            CatchingFishJUnitService catchingFishJUnitService2 = this.CatchingFishPayPal;
            Map CatchingFishParcelableFAB = catchingFishSharedFlowMVP.CatchingFishParcelableFAB();
            if (catchingFishJUnitService2 != null && catchingFishJUnitService2.CatchingFishDaggerWebsocket == CatchingFishParcelableFAB.size()) {
                Object[] objArr = catchingFishJUnitService2.CatchingFishSnackbar;
                int[] iArr = catchingFishJUnitService2.CatchingFishCoroutine;
                long[] jArr = catchingFishJUnitService2.CatchingFishParcelableFAB;
                int length = jArr.length - 2;
                if (length < 0) {
                    return;
                }
                int i2 = 0;
                loop0: while (true) {
                    long j = jArr[i2];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i3 = 8 - ((~(i2 - length)) >>> 31);
                        for (int i4 = i; i4 < i3; i4++) {
                            if ((255 & j) < 128) {
                                int i5 = (i2 << 3) + i4;
                                Object obj2 = objArr[i5];
                                int i6 = iArr[i5];
                                Integer num = (Integer) CatchingFishParcelableFAB.get((CatchingFishMoshiMVVM) obj2);
                                if (num == null || num.intValue() != i6) {
                                    break loop0;
                                }
                            }
                            j >>= 8;
                        }
                        if (i3 != 8) {
                            return;
                        }
                    }
                    if (i2 == length) {
                        return;
                    }
                    i2++;
                    i = 0;
                }
            }
            catchingFishBiometricRoom.CatchingFishPayPalService.CatchingFishAnimationMockk.CatchingFishGsonAppCompat.CatchingFishWorkManager();
            CatchingFishJUnitService catchingFishJUnitService3 = this.CatchingFishPayPal;
            if (catchingFishJUnitService3 == null) {
                CatchingFishJUnitService catchingFishJUnitService4 = CatchingFishGoogleMapsAdMob.CatchingFishParcelableFAB;
                catchingFishJUnitService3 = new CatchingFishJUnitService();
                this.CatchingFishPayPal = catchingFishJUnitService3;
            }
            catchingFishJUnitService3.CatchingFishParcelableFAB();
            for (Map.Entry entry : catchingFishSharedFlowMVP.CatchingFishParcelableFAB().entrySet()) {
                catchingFishJUnitService3.CatchingFishViewModelFAB(((Number) entry.getValue()).intValue(), entry.getKey());
            }
        }
    }

    public final CatchingFishDaggerToolbar CatchingFishWidget(CatchingFishDaggerToolbar catchingFishDaggerToolbar) {
        CatchingFishBiometricRoom catchingFishBiometricRoom = catchingFishDaggerToolbar.CatchingFishRoomDatabase;
        CatchingFishBiometricRoom catchingFishBiometricRoom2 = this.CatchingFishRoomDatabase;
        if (catchingFishBiometricRoom == catchingFishBiometricRoom2) {
            CatchingFishFABStripeAPIFAB CatchingFishRealmKtorRealm = catchingFishDaggerToolbar.CatchingFishRealmKtorRealm();
            CatchingFishFABStripeAPIFAB CatchingFishRealmKtorRealm2 = CatchingFishRealmKtorRealm();
            if (!CatchingFishRealmKtorRealm2.CatchingFishReduxKtor.CatchingFishRoomDatabase) {
                CatchingFishFluxGradle.CatchingFishSnackbar("visitLocalAncestors called on an unattached node");
            }
            for (CatchingFishFABStripeAPIFAB catchingFishFABStripeAPIFAB = CatchingFishRealmKtorRealm2.CatchingFishReduxKtor.CatchingFishViewModelFAB; catchingFishFABStripeAPIFAB != null; catchingFishFABStripeAPIFAB = catchingFishFABStripeAPIFAB.CatchingFishViewModelFAB) {
                if ((catchingFishFABStripeAPIFAB.CatchingFishWorkManager & 2) != 0 && catchingFishFABStripeAPIFAB == CatchingFishRealmKtorRealm) {
                    return catchingFishDaggerToolbar;
                }
            }
            return this;
        }
        while (catchingFishBiometricRoom.CatchingFishNavigation > catchingFishBiometricRoom2.CatchingFishNavigation) {
            catchingFishBiometricRoom = catchingFishBiometricRoom.CatchingFishRoomDatabase();
            CatchingFishFirebaseDagger.CatchingFishAnimationMockk(catchingFishBiometricRoom);
        }
        CatchingFishBiometricRoom catchingFishBiometricRoom3 = catchingFishBiometricRoom2;
        while (catchingFishBiometricRoom3.CatchingFishNavigation > catchingFishBiometricRoom.CatchingFishNavigation) {
            catchingFishBiometricRoom3 = catchingFishBiometricRoom3.CatchingFishRoomDatabase();
            CatchingFishFirebaseDagger.CatchingFishAnimationMockk(catchingFishBiometricRoom3);
        }
        while (catchingFishBiometricRoom != catchingFishBiometricRoom3) {
            catchingFishBiometricRoom = catchingFishBiometricRoom.CatchingFishRoomDatabase();
            catchingFishBiometricRoom3 = catchingFishBiometricRoom3.CatchingFishRoomDatabase();
            if (catchingFishBiometricRoom == null || catchingFishBiometricRoom3 == null) {
                throw new IllegalArgumentException("layouts are not part of the same hierarchy");
            }
        }
        if (catchingFishBiometricRoom3 != catchingFishBiometricRoom2) {
            if (catchingFishBiometricRoom != catchingFishDaggerToolbar.CatchingFishRoomDatabase) {
                return (CatchingFishGlideHandler) catchingFishBiometricRoom.CatchingFishJobScheduler.CatchingFishViewModelScope;
            }
            return catchingFishDaggerToolbar;
        }
        return this;
    }

    @Override // kotlin.text.CatchingFishWidgetXMLLayout
    public final CatchingFishGradleMVPKtor getLayoutDirection() {
        return this.CatchingFishRoomDatabase.CatchingFishPayPal;
    }

    @Override // kotlin.text.CatchingFishWidgetXMLLayout
    public final CatchingFishMockkCoroutine CatchingFishStripeAPI() {
        return this;
    }
}
