package kotlin.text;

import android.R;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.widget.EditText;
import java.io.Closeable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* loaded from: classes.dex */
public abstract class CatchingFishXMLLayoutGlide {
    public static final CatchingFishFluxWorkManager CatchingFishDaggerWebsocket;
    public static final CatchingFishFluxWorkManager CatchingFishLayout;
    public static final CatchingFishFluxWorkManager CatchingFishSnackbar;
    public static final CatchingFishFluxWorkManager CatchingFishViewModelFAB;
    public static final CatchingFishFluxWorkManager CatchingFishViewModelScope;
    public static final CatchingFishFluxWorkManager CatchingFishWorkManager;
    public static final CatchingFishPicassoToolbar CatchingFishParcelableFAB = new CatchingFishPicassoToolbar();
    public static final CatchingFishMVVMCoroutine CatchingFishCoroutine = new CatchingFishMVVMCoroutine(7);
    public static final CatchingFishFirebaseService CatchingFishReduxKtor = new CatchingFishFirebaseService();
    public static final CatchingFishManifestMVVM CatchingFishFragmentHandler = new CatchingFishManifestMVVM(false);
    public static final CatchingFishManifestMVVM CatchingFishCloudMessaging = new CatchingFishManifestMVVM(true);
    public static final CatchingFishWidgetContext CatchingFishEspressoTesting = new CatchingFishWidgetContext();
    public static final CatchingFishHiltMockkMVI CatchingFishOkHttp = new CatchingFishHiltMockkMVI();
    public static final Object CatchingFishUnitTesting = new Object();
    public static final CatchingFishViewMockkFlux CatchingFishAnimationMockk = new CatchingFishViewMockkFlux();

    static {
        int i = 1;
        CatchingFishSnackbar = new CatchingFishFluxWorkManager("RESUME_TOKEN", i);
        CatchingFishDaggerWebsocket = new CatchingFishFluxWorkManager("COMPLETING_ALREADY", i);
        CatchingFishWorkManager = new CatchingFishFluxWorkManager("COMPLETING_WAITING_CHILDREN", i);
        CatchingFishViewModelScope = new CatchingFishFluxWorkManager("COMPLETING_RETRY", i);
        CatchingFishViewModelFAB = new CatchingFishFluxWorkManager("TOO_LATE_TO_CANCEL", i);
        CatchingFishLayout = new CatchingFishFluxWorkManager("SEALED", i);
    }

    public static final CatchingFishMockkOkHttp CatchingFish(CatchingFishViewPagerIntent catchingFishViewPagerIntent) {
        CatchingFishMockkOkHttp catchingFishMockkOkHttp = catchingFishViewPagerIntent.CatchingFishReduxKtor;
        CatchingFishFirebaseDagger.CatchingFishStateLiveData(catchingFishMockkOkHttp, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.<get-readable>>");
        return (CatchingFishMockkOkHttp) CatchingFishIntentBundle.CatchingFishJetpackCompose(catchingFishMockkOkHttp, catchingFishViewPagerIntent);
    }

    public static final void CatchingFishAnimationMockk(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException("size=" + j + " offset=" + j2 + " byteCount=" + j3);
        }
    }

    public static final long CatchingFishCameraXIntent(long j) {
        return (Float.floatToRawIntBits((int) (j & 4294967295L)) & 4294967295L) | (Float.floatToRawIntBits((int) (j >> 32)) << 32);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static CatchingFishMoshiGoogleMaps CatchingFishCardViewRealm(CatchingFishJUnitGlide catchingFishJUnitGlide) {
        CatchingFishWidgetContext catchingFishWidgetContext = CatchingFishWidgetContext.CatchingFishEspressoTesting;
        CatchingFishPayPalViewRealm catchingFishPayPalViewRealm = new CatchingFishPayPalViewRealm();
        catchingFishPayPalViewRealm.CatchingFishReduxKtor = (CatchingFishViewWebsocket) catchingFishJUnitGlide;
        catchingFishPayPalViewRealm.CatchingFishDaggerWebsocket = catchingFishWidgetContext;
        return catchingFishPayPalViewRealm;
    }

    public static int CatchingFishCardViewView(int i, Rect rect, Rect rect2) {
        int i2;
        int i3;
        if (i == 17) {
            i2 = rect.left;
            i3 = rect2.right;
        } else if (i == 33) {
            i2 = rect.top;
            i3 = rect2.bottom;
        } else if (i == 66) {
            i2 = rect2.left;
            i3 = rect.right;
        } else {
            if (i != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            i2 = rect2.top;
            i3 = rect.bottom;
        }
        return Math.max(0, i2 - i3);
    }

    public static final boolean CatchingFishCloudMessaging(int i, int i2, int i3, byte[] bArr, byte[] bArr2) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(bArr, "a");
        CatchingFishFirebaseDagger.CatchingFishNavigation(bArr2, "b");
        for (int i4 = 0; i4 < i3; i4++) {
            if (bArr[i4 + i] != bArr2[i4 + i2]) {
                return false;
            }
        }
        return true;
    }

    public static final void CatchingFishCoroutine(CatchingFishCameraXContext catchingFishCameraXContext, CatchingFishBundleAnimation catchingFishBundleAnimation, CatchingFishReduxAndroidX catchingFishReduxAndroidX, CatchingFishAdMobLayout catchingFishAdMobLayout, float f, CatchingFishSharedFlowMVI catchingFishSharedFlowMVI, int i, int i2) {
        CatchingFishAdMobLayout catchingFishAdMobLayout2;
        float f2;
        catchingFishSharedFlowMVI.CatchingFishRecyclerView(1142754848);
        int i3 = (catchingFishSharedFlowMVI.CatchingFishViewModelScope(catchingFishCameraXContext) ? 4 : 2) | i | (catchingFishSharedFlowMVI.CatchingFishDaggerWebsocket(catchingFishBundleAnimation) ? 256 : 128);
        int i4 = i3 | 3072;
        int i5 = i2 & 16;
        if (i5 != 0) {
            i4 = i3 | 27648;
        } else if ((i & 24576) == 0) {
            i4 |= catchingFishSharedFlowMVI.CatchingFishDaggerWebsocket(catchingFishAdMobLayout) ? 16384 : 8192;
        }
        if (((i4 | 1769472) & 599187) == 599186 && catchingFishSharedFlowMVI.CatchingFishSpannableWidget()) {
            catchingFishSharedFlowMVI.CatchingFishPayPalLiveData();
            catchingFishAdMobLayout2 = catchingFishAdMobLayout;
            f2 = f;
        } else {
            catchingFishReduxAndroidX = CatchingFishGradleMVVM.CatchingFishLayout;
            CatchingFishAdMobLayout catchingFishAdMobLayout3 = i5 != 0 ? CatchingFishWebsocketJUnit.CatchingFishParcelableFAB : catchingFishAdMobLayout;
            catchingFishSharedFlowMVI.CatchingFishParcelable(1040398089);
            catchingFishSharedFlowMVI.CatchingFishStateLiveData(false);
            CatchingFishBundleAnimation CatchingFishSnackbar2 = androidx.compose.ui.draw.CatchingFishPagingLibrary.CatchingFishSnackbar(androidx.compose.ui.graphics.CatchingFishPagingLibrary.CatchingFishParcelableFAB(catchingFishBundleAnimation.CatchingFishCoroutine(CatchingFishMoshiDagger.CatchingFishParcelableFAB), 0.0f, 520191), catchingFishCameraXContext, catchingFishAdMobLayout3, 1.0f);
            CatchingFishViewExoPlayer catchingFishViewExoPlayer = CatchingFishViewExoPlayer.CatchingFishSnackbar;
            int hashCode = Long.hashCode(catchingFishSharedFlowMVI.CatchingFishParcelable);
            CatchingFishBundleAnimation CatchingFishSensorManager = CatchingFishLayoutRoomFAB.CatchingFishSensorManager(catchingFishSharedFlowMVI, CatchingFishSnackbar2);
            CatchingFishKtorNavigation CatchingFishCloudMessaging2 = catchingFishSharedFlowMVI.CatchingFishCloudMessaging();
            CatchingFishFABMVP.CatchingFishSnackbar.getClass();
            CatchingFishLayoutAnimation catchingFishLayoutAnimation = CatchingFishWidgetSnackbar.CatchingFishSnackbar;
            catchingFishSharedFlowMVI.CatchingFishAppCompat();
            if (catchingFishSharedFlowMVI.CatchingFishLayoutInflater) {
                catchingFishSharedFlowMVI.CatchingFishFragmentHandler(catchingFishLayoutAnimation);
            } else {
                catchingFishSharedFlowMVI.CatchingFishRedux();
            }
            CatchingFishOkHttpFAB.CatchingFishAppCompat(catchingFishViewExoPlayer, catchingFishSharedFlowMVI, CatchingFishWidgetSnackbar.CatchingFishDaggerWebsocket);
            CatchingFishOkHttpFAB.CatchingFishAppCompat(CatchingFishCloudMessaging2, catchingFishSharedFlowMVI, CatchingFishWidgetSnackbar.CatchingFishReduxKtor);
            CatchingFishOkHttpFAB.CatchingFishAppCompat(CatchingFishSensorManager, catchingFishSharedFlowMVI, CatchingFishWidgetSnackbar.CatchingFishCoroutine);
            CatchingFishLiveDataRoom catchingFishLiveDataRoom = CatchingFishWidgetSnackbar.CatchingFishWorkManager;
            if (catchingFishSharedFlowMVI.CatchingFishLayoutInflater || !CatchingFishFirebaseDagger.CatchingFishOkHttp(catchingFishSharedFlowMVI.CatchingFishPayPalService(), Integer.valueOf(hashCode))) {
                catchingFishSharedFlowMVI.CatchingFishMoshiDaggerHilt(Integer.valueOf(hashCode));
                catchingFishSharedFlowMVI.CatchingFishSnackbar(Integer.valueOf(hashCode), catchingFishLiveDataRoom);
            }
            catchingFishSharedFlowMVI.CatchingFishStateLiveData(true);
            catchingFishAdMobLayout2 = catchingFishAdMobLayout3;
            f2 = 1.0f;
        }
        CatchingFishReduxAndroidX catchingFishReduxAndroidX2 = catchingFishReduxAndroidX;
        CatchingFishHiltFAB CatchingFishRoomDatabase = catchingFishSharedFlowMVI.CatchingFishRoomDatabase();
        if (CatchingFishRoomDatabase != null) {
            CatchingFishRoomDatabase.CatchingFishReduxKtor = new CatchingFishHiltCardView(catchingFishCameraXContext, catchingFishBundleAnimation, catchingFishReduxAndroidX2, catchingFishAdMobLayout2, f2, i, i2);
        }
    }

    public static final boolean CatchingFishCustomView(CatchingFishViewPagerIntent catchingFishViewPagerIntent, CatchingFishServiceHandler catchingFishServiceHandler) {
        int i;
        CatchingFishParcelable catchingFishParcelable;
        Object CatchingFishFragmentHandler2;
        CatchingFishOkHttpStripeAPI CatchingFishCloudMessaging2;
        boolean CatchingFishEspressoTesting2;
        do {
            synchronized (CatchingFishUnitTesting) {
                CatchingFishMockkOkHttp catchingFishMockkOkHttp = catchingFishViewPagerIntent.CatchingFishReduxKtor;
                CatchingFishFirebaseDagger.CatchingFishStateLiveData(catchingFishMockkOkHttp, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                CatchingFishMockkOkHttp catchingFishMockkOkHttp2 = (CatchingFishMockkOkHttp) CatchingFishIntentBundle.CatchingFishLayout(catchingFishMockkOkHttp);
                i = catchingFishMockkOkHttp2.CatchingFishReduxKtor;
                catchingFishParcelable = catchingFishMockkOkHttp2.CatchingFishCoroutine;
            }
            CatchingFishFirebaseDagger.CatchingFishAnimationMockk(catchingFishParcelable);
            CatchingFishMVPMoshi CatchingFishWorkManager2 = catchingFishParcelable.CatchingFishWorkManager();
            CatchingFishFragmentHandler2 = catchingFishServiceHandler.CatchingFishFragmentHandler(CatchingFishWorkManager2);
            CatchingFishParcelable CatchingFishCoroutine2 = CatchingFishWorkManager2.CatchingFishCoroutine();
            if (CatchingFishFirebaseDagger.CatchingFishOkHttp(CatchingFishCoroutine2, catchingFishParcelable)) {
                break;
            }
            CatchingFishMockkOkHttp catchingFishMockkOkHttp3 = catchingFishViewPagerIntent.CatchingFishReduxKtor;
            CatchingFishFirebaseDagger.CatchingFishStateLiveData(catchingFishMockkOkHttp3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (CatchingFishIntentBundle.CatchingFishCoroutine) {
                CatchingFishCloudMessaging2 = CatchingFishIntentBundle.CatchingFishCloudMessaging();
                CatchingFishEspressoTesting2 = CatchingFishEspressoTesting((CatchingFishMockkOkHttp) CatchingFishIntentBundle.CatchingFishSpannableWidget(catchingFishMockkOkHttp3, catchingFishViewPagerIntent, CatchingFishCloudMessaging2), i, CatchingFishCoroutine2, true);
            }
            CatchingFishIntentBundle.CatchingFishUnitTesting(CatchingFishCloudMessaging2, catchingFishViewPagerIntent);
        } while (!CatchingFishEspressoTesting2);
        return ((Boolean) CatchingFishFragmentHandler2).booleanValue();
    }

    public static final void CatchingFishDaggerHiltFAB(Throwable th, CatchingFishManifestMockk catchingFishManifestMockk) {
        Throwable runtimeException;
        Iterator it = CatchingFishAppCompatMVP.CatchingFishParcelableFAB.iterator();
        while (it.hasNext()) {
            try {
                ((CatchingFishDaggerMVI) it.next()).CatchingFishLayout(th, catchingFishManifestMockk);
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    CatchingFishAdMobFAB.CatchingFishViewModelFAB(runtimeException, th);
                }
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, runtimeException);
            }
        }
        try {
            CatchingFishAdMobFAB.CatchingFishViewModelFAB(th, new CatchingFishAdMobMoshi(catchingFishManifestMockk));
        } catch (Throwable unused) {
        }
        Thread currentThread2 = Thread.currentThread();
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }

    public static final void CatchingFishDaggerWebsocket(Object obj, CatchingFishSharedFlowMVI catchingFishSharedFlowMVI, CatchingFishMockkView catchingFishMockkView) {
        CatchingFishManifestMockk catchingFishManifestMockk = catchingFishSharedFlowMVI.CatchingFishMotionLayout;
        boolean CatchingFishDaggerWebsocket2 = catchingFishSharedFlowMVI.CatchingFishDaggerWebsocket(obj);
        Object CatchingFishPayPalService = catchingFishSharedFlowMVI.CatchingFishPayPalService();
        if (CatchingFishDaggerWebsocket2 || CatchingFishPayPalService == CatchingFishGsonOkHttp.CatchingFishParcelableFAB) {
            CatchingFishPayPalService = new CatchingFishToastWebSocket(catchingFishManifestMockk, catchingFishMockkView);
            catchingFishSharedFlowMVI.CatchingFishMoshiDaggerHilt(CatchingFishPayPalService);
        }
    }

    public static final void CatchingFishEspressoMockk(float[] fArr, Matrix matrix) {
        matrix.getValues(fArr);
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = fArr[6];
        float f8 = fArr[7];
        float f9 = fArr[8];
        fArr[0] = f;
        fArr[1] = f4;
        fArr[2] = 0.0f;
        fArr[3] = f7;
        fArr[4] = f2;
        fArr[5] = f5;
        fArr[6] = 0.0f;
        fArr[7] = f8;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 1.0f;
        fArr[11] = 0.0f;
        fArr[12] = f3;
        fArr[13] = f6;
        fArr[14] = 0.0f;
        fArr[15] = f9;
    }

    public static final boolean CatchingFishEspressoTesting(CatchingFishMockkOkHttp catchingFishMockkOkHttp, int i, CatchingFishParcelable catchingFishParcelable, boolean z) {
        boolean z2;
        synchronized (CatchingFishUnitTesting) {
            try {
                int i2 = catchingFishMockkOkHttp.CatchingFishReduxKtor;
                if (i2 == i) {
                    catchingFishMockkOkHttp.CatchingFishCoroutine = catchingFishParcelable;
                    z2 = true;
                    if (z) {
                        catchingFishMockkOkHttp.CatchingFishDaggerWebsocket++;
                    }
                    catchingFishMockkOkHttp.CatchingFishReduxKtor = i2 + 1;
                } else {
                    z2 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z2;
    }

    public static final Object CatchingFishFragmentFactory(Object obj) {
        return obj instanceof CatchingFishStripeAPIMVI ? CatchingFishDaggerBiometric.CatchingFishViewModelFAB(((CatchingFishStripeAPIMVI) obj).CatchingFishParcelableFAB) : obj;
    }

    public static final void CatchingFishFragmentHandler(CatchingFishViewJUnitJUnit catchingFishViewJUnitJUnit, CatchingFishMVIGraphQLHilt catchingFishMVIGraphQLHilt) {
        if (CatchingFishGsonCardView.CatchingFishReduxKtor(catchingFishMVIGraphQLHilt)) {
            CatchingFishMVPMotionLayout catchingFishMVPMotionLayout = catchingFishMVIGraphQLHilt.CatchingFishReduxKtor;
            Object CatchingFishViewModelScope2 = catchingFishMVPMotionLayout.CatchingFishReduxKtor.CatchingFishViewModelScope(CatchingFishViewStripeAPI.CatchingFishViewModelScope);
            if (CatchingFishViewModelScope2 == null) {
                CatchingFishViewModelScope2 = null;
            }
            CatchingFishSnackbarToast catchingFishSnackbarToast = (CatchingFishSnackbarToast) CatchingFishViewModelScope2;
            if (catchingFishSnackbarToast != null) {
                catchingFishViewJUnitJUnit.CatchingFishSnackbar(new CatchingFishBundleContext(catchingFishSnackbarToast.CatchingFishParcelableFAB, R.id.accessibilityActionSetProgress));
            }
        }
    }

    public static final Object CatchingFishGradleManifest(CatchingFishManifestMockk catchingFishManifestMockk, CatchingFishMockkView catchingFishMockkView, CatchingFishStateFlowGson catchingFishStateFlowGson) {
        CatchingFishManifestMockk context = catchingFishStateFlowGson.getContext();
        CatchingFishManifestMockk CatchingFishAnimationMockk2 = !((Boolean) catchingFishManifestMockk.CatchingFishEspressoTesting(Boolean.FALSE, new CatchingFishRealmCustomView(4, (byte) 0))).booleanValue() ? context.CatchingFishAnimationMockk(catchingFishManifestMockk) : CatchingFishRobolectricHilt.CatchingFishJetpackCompose(context, catchingFishManifestMockk, false);
        CatchingFishLayoutRoomFAB.CatchingFishSpannableWidget(CatchingFishAnimationMockk2);
        if (CatchingFishAnimationMockk2 == context) {
            CatchingFishLifecycleGlide catchingFishLifecycleGlide = new CatchingFishLifecycleGlide(catchingFishStateFlowGson, CatchingFishAnimationMockk2);
            return CatchingFishLayoutRoom.CatchingFishMutableLiveData(catchingFishLifecycleGlide, catchingFishLifecycleGlide, catchingFishMockkView);
        }
        CatchingFishWidgetContext catchingFishWidgetContext = CatchingFishWidgetContext.CatchingFishDaggerWebsocket;
        if (CatchingFishFirebaseDagger.CatchingFishOkHttp(CatchingFishAnimationMockk2.CatchingFishCoroutineFlow(catchingFishWidgetContext), context.CatchingFishCoroutineFlow(catchingFishWidgetContext))) {
            CatchingFishToastIntent catchingFishToastIntent = new CatchingFishToastIntent(CatchingFishAnimationMockk2, catchingFishStateFlowGson);
            CatchingFishManifestMockk catchingFishManifestMockk2 = catchingFishToastIntent.CatchingFishWorkManager;
            Object CatchingFishRecyclerView = CatchingFishAdMobFAB.CatchingFishRecyclerView(catchingFishManifestMockk2, null);
            try {
                return CatchingFishLayoutRoom.CatchingFishMutableLiveData(catchingFishToastIntent, catchingFishToastIntent, catchingFishMockkView);
            } finally {
                CatchingFishAdMobFAB.CatchingFishEspressoMockk(catchingFishManifestMockk2, CatchingFishRecyclerView);
            }
        }
        CatchingFishLiveDataMoshi catchingFishLiveDataMoshi = new CatchingFishLiveDataMoshi(catchingFishStateFlowGson, CatchingFishAnimationMockk2);
        try {
            CatchingFishGsonCardView.CatchingFishJobScheduler(CatchingFishRealmContext.CatchingFishParcelableFAB, CatchingFishBiometricBundle.CatchingFishParcelableFlux(CatchingFishBiometricBundle.CatchingFishFragmentHandler(catchingFishLiveDataMoshi, catchingFishLiveDataMoshi, catchingFishMockkView)));
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = CatchingFishLiveDataMoshi.CatchingFishViewModelFAB;
            do {
                int i = atomicIntegerFieldUpdater.get(catchingFishLiveDataMoshi);
                if (i != 0) {
                    if (i != 2) {
                        throw new IllegalStateException("Already suspended");
                    }
                    Object CatchingFishPayPalLiveData = CatchingFishPayPalLiveData(CatchingFishPicassoView.CatchingFishReduxKtor.get(catchingFishLiveDataMoshi));
                    if (CatchingFishPayPalLiveData instanceof CatchingFishStripeAPIMVI) {
                        throw ((CatchingFishStripeAPIMVI) CatchingFishPayPalLiveData).CatchingFishParcelableFAB;
                    }
                    return CatchingFishPayPalLiveData;
                }
            } while (!atomicIntegerFieldUpdater.compareAndSet(catchingFishLiveDataMoshi, 0, 1));
            return CatchingFishXMLLayoutMockk.CatchingFishReduxKtor;
        } catch (Throwable th) {
            catchingFishLiveDataMoshi.CatchingFishViewModelFAB(CatchingFishDaggerBiometric.CatchingFishViewModelFAB(th));
            throw th;
        }
    }

    public static CatchingFishFragmentRealm CatchingFishGsonAppCompat(CatchingFishToastLayout catchingFishToastLayout, CatchingFishManifestMockk catchingFishManifestMockk, CatchingFishMockkView catchingFishMockkView, int i) {
        if ((i & 1) != 0) {
            catchingFishManifestMockk = CatchingFishPayPalDataStore.CatchingFishReduxKtor;
        }
        CatchingFishFABManifest catchingFishFABManifest = (i & 2) != 0 ? CatchingFishFABManifest.CatchingFishReduxKtor : CatchingFishFABManifest.CatchingFishViewModelScope;
        CatchingFishManifestMockk CatchingFishJetpackCompose = CatchingFishRobolectricHilt.CatchingFishJetpackCompose(catchingFishToastLayout.CatchingFishParcelableFAB(), catchingFishManifestMockk, true);
        CatchingFishGlideGson catchingFishGlideGson = CatchingFishGoogleMapsHilt.CatchingFishParcelableFAB;
        if (CatchingFishJetpackCompose != catchingFishGlideGson && CatchingFishJetpackCompose.CatchingFishCoroutineFlow(CatchingFishWidgetContext.CatchingFishDaggerWebsocket) == null) {
            CatchingFishJetpackCompose = CatchingFishJetpackCompose.CatchingFishAnimationMockk(catchingFishGlideGson);
        }
        CatchingFishFragmentRealm catchingFishFluxHilt = catchingFishFABManifest == CatchingFishFABManifest.CatchingFishDaggerWebsocket ? new CatchingFishFluxHilt(CatchingFishJetpackCompose, catchingFishMockkView) : new CatchingFishFragmentRealm(CatchingFishJetpackCompose, true);
        catchingFishFluxHilt.CatchingFishCustomViewJUnit(catchingFishFABManifest, catchingFishFluxHilt, catchingFishMockkView);
        return catchingFishFluxHilt;
    }

    public static final String CatchingFishHandler(float f) {
        if (Float.isNaN(f)) {
            return "NaN";
        }
        if (Float.isInfinite(f)) {
            return f < 0.0f ? "-Infinity" : "Infinity";
        }
        int max = Math.max(1, 0);
        float pow = (float) Math.pow(10.0f, max);
        float f2 = f * pow;
        int i = (int) f2;
        if (f2 - i >= 0.5f) {
            i++;
        }
        float f3 = i / pow;
        return max > 0 ? String.valueOf(f3) : String.valueOf((int) f3);
    }

    public static final int CatchingFishJetpackCompose(CatchingFishViewPagerIntent catchingFishViewPagerIntent) {
        CatchingFishMockkOkHttp catchingFishMockkOkHttp = catchingFishViewPagerIntent.CatchingFishReduxKtor;
        CatchingFishFirebaseDagger.CatchingFishStateLiveData(catchingFishMockkOkHttp, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
        return ((CatchingFishMockkOkHttp) CatchingFishIntentBundle.CatchingFishLayout(catchingFishMockkOkHttp)).CatchingFishDaggerWebsocket;
    }

    public static final CatchingFishBiometricRoom CatchingFishJobScheduler(CatchingFishLayoutContext catchingFishLayoutContext) {
        CatchingFishDaggerToolbar catchingFishDaggerToolbar = ((CatchingFishFABStripeAPIFAB) catchingFishLayoutContext).CatchingFishReduxKtor.CatchingFishCloudMessaging;
        if (catchingFishDaggerToolbar != null) {
            return catchingFishDaggerToolbar.CatchingFishRoomDatabase;
        }
        throw CatchingFishMVPLiveData.CatchingFish("Cannot obtain node coordinator. Is the Modifier.Node attached?");
    }

    public static final void CatchingFishLayout(int i, int i2) {
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException("index (" + i + ") is out of bound of [0, " + i2 + ')');
        }
    }

    public static int CatchingFishMVPRobolectric(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return Math.abs(((rect.width() / 2) + rect.left) - ((rect2.width() / 2) + rect2.left));
        }
        return Math.abs(((rect.height() / 2) + rect.top) - ((rect2.height() / 2) + rect2.top));
    }

    public static final CatchingFishDaggerToolbar CatchingFishMutableLiveData(CatchingFishLayoutContext catchingFishLayoutContext, int i) {
        CatchingFishDaggerToolbar catchingFishDaggerToolbar = ((CatchingFishFABStripeAPIFAB) catchingFishLayoutContext).CatchingFishReduxKtor.CatchingFishCloudMessaging;
        CatchingFishFirebaseDagger.CatchingFishAnimationMockk(catchingFishDaggerToolbar);
        if (catchingFishDaggerToolbar.CatchingFishRealmKtorRealm() != catchingFishLayoutContext || !CatchingFishJUnitJUnit.CatchingFishReduxKtor(i)) {
            return catchingFishDaggerToolbar;
        }
        CatchingFishDaggerToolbar catchingFishDaggerToolbar2 = catchingFishDaggerToolbar.CatchingFishNavigation;
        CatchingFishFirebaseDagger.CatchingFishAnimationMockk(catchingFishDaggerToolbar2);
        return catchingFishDaggerToolbar2;
    }

    public static CatchingFishLayoutGlide CatchingFishNavigation(Class cls) {
        try {
            Constructor declaredConstructor = cls.getDeclaredConstructor(null);
            if (!Modifier.isPublic(declaredConstructor.getModifiers())) {
                throw new RuntimeException("Cannot create an instance of " + cls);
            }
            try {
                Object newInstance = declaredConstructor.newInstance(null);
                CatchingFishFirebaseDagger.CatchingFishAnimationMockk(newInstance);
                return (CatchingFishLayoutGlide) newInstance;
            } catch (IllegalAccessException e) {
                throw new RuntimeException("Cannot create an instance of " + cls, e);
            } catch (InstantiationException e2) {
                throw new RuntimeException("Cannot create an instance of " + cls, e2);
            }
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("Cannot create an instance of " + cls, e3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
    
        if (r9.bottom <= r11.top) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0042, code lost:
    
        if (r8 == 17) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
    
        if (r8 != 66) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0047, code lost:
    
        r10 = CatchingFishCardViewView(r8, r9, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004b, code lost:
    
        if (r8 == 17) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004d, code lost:
    
        if (r8 == 33) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004f, code lost:
    
        if (r8 == 66) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0051, code lost:
    
        if (r8 != 130) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
    
        r8 = r11.bottom;
        r9 = r9.bottom;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0072, code lost:
    
        if (r10 >= java.lang.Math.max(1, r8 - r9)) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:?, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
    
        throw new java.lang.IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005f, code lost:
    
        r8 = r11.right;
        r9 = r9.right;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0064, code lost:
    
        r8 = r9.top;
        r9 = r11.top;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0069, code lost:
    
        r8 = r9.left;
        r9 = r11.left;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0032, code lost:
    
        if (r9.right <= r11.left) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0039, code lost:
    
        if (r9.top >= r11.bottom) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0040, code lost:
    
        if (r9.left >= r11.right) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean CatchingFishOkHttp(int i, Rect rect, Rect rect2, Rect rect3) {
        boolean CatchingFishUnitTesting2 = CatchingFishUnitTesting(i, rect, rect2);
        if (CatchingFishUnitTesting(i, rect, rect3) || !CatchingFishUnitTesting2) {
            return false;
        }
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
        }
        return true;
    }

    public static final void CatchingFishParcelableFAB(CatchingFishBundleAnimation catchingFishBundleAnimation, CatchingFishServiceHandler catchingFishServiceHandler, CatchingFishSharedFlowMVI catchingFishSharedFlowMVI, int i) {
        catchingFishSharedFlowMVI.CatchingFishRecyclerView(-932836462);
        if ((((catchingFishSharedFlowMVI.CatchingFishDaggerWebsocket(catchingFishBundleAnimation) ? 4 : 2) | i | (catchingFishSharedFlowMVI.CatchingFishViewModelScope(catchingFishServiceHandler) ? 32 : 16)) & 19) == 18 && catchingFishSharedFlowMVI.CatchingFishSpannableWidget()) {
            catchingFishSharedFlowMVI.CatchingFishPayPalLiveData();
        } else {
            CatchingFishBundleAnimation CatchingFishParcelableFAB2 = androidx.compose.ui.draw.CatchingFishPagingLibrary.CatchingFishParcelableFAB(catchingFishBundleAnimation, catchingFishServiceHandler);
            CatchingFishViewExoPlayer catchingFishViewExoPlayer = CatchingFishViewExoPlayer.CatchingFishCoroutine;
            int hashCode = Long.hashCode(catchingFishSharedFlowMVI.CatchingFishParcelable);
            CatchingFishBundleAnimation CatchingFishSensorManager = CatchingFishLayoutRoomFAB.CatchingFishSensorManager(catchingFishSharedFlowMVI, CatchingFishParcelableFAB2);
            CatchingFishKtorNavigation CatchingFishCloudMessaging2 = catchingFishSharedFlowMVI.CatchingFishCloudMessaging();
            CatchingFishFABMVP.CatchingFishSnackbar.getClass();
            CatchingFishLayoutAnimation catchingFishLayoutAnimation = CatchingFishWidgetSnackbar.CatchingFishSnackbar;
            catchingFishSharedFlowMVI.CatchingFishAppCompat();
            if (catchingFishSharedFlowMVI.CatchingFishLayoutInflater) {
                catchingFishSharedFlowMVI.CatchingFishFragmentHandler(catchingFishLayoutAnimation);
            } else {
                catchingFishSharedFlowMVI.CatchingFishRedux();
            }
            CatchingFishOkHttpFAB.CatchingFishAppCompat(catchingFishViewExoPlayer, catchingFishSharedFlowMVI, CatchingFishWidgetSnackbar.CatchingFishDaggerWebsocket);
            CatchingFishOkHttpFAB.CatchingFishAppCompat(CatchingFishCloudMessaging2, catchingFishSharedFlowMVI, CatchingFishWidgetSnackbar.CatchingFishReduxKtor);
            CatchingFishOkHttpFAB.CatchingFishAppCompat(CatchingFishSensorManager, catchingFishSharedFlowMVI, CatchingFishWidgetSnackbar.CatchingFishCoroutine);
            CatchingFishLiveDataRoom catchingFishLiveDataRoom = CatchingFishWidgetSnackbar.CatchingFishWorkManager;
            if (catchingFishSharedFlowMVI.CatchingFishLayoutInflater || !CatchingFishFirebaseDagger.CatchingFishOkHttp(catchingFishSharedFlowMVI.CatchingFishPayPalService(), Integer.valueOf(hashCode))) {
                catchingFishSharedFlowMVI.CatchingFishMoshiDaggerHilt(Integer.valueOf(hashCode));
                catchingFishSharedFlowMVI.CatchingFishSnackbar(Integer.valueOf(hashCode), catchingFishLiveDataRoom);
            }
            catchingFishSharedFlowMVI.CatchingFishStateLiveData(true);
        }
        CatchingFishHiltFAB CatchingFishRoomDatabase = catchingFishSharedFlowMVI.CatchingFishRoomDatabase();
        if (CatchingFishRoomDatabase != null) {
            CatchingFishRoomDatabase.CatchingFishReduxKtor = new CatchingFishWidgetCardView(catchingFishBundleAnimation, catchingFishServiceHandler, i, 2);
        }
    }

    public static boolean CatchingFishParcelableFlux(EditText editText) {
        return editText.getInputType() != 0;
    }

    public static CatchingFishKtorHiltIntent CatchingFishPayPal(CatchingFishJUnitGlide catchingFishJUnitGlide) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(catchingFishJUnitGlide, "initializer");
        return new CatchingFishKtorHiltIntent(catchingFishJUnitGlide);
    }

    public static final Object CatchingFishPayPalLiveData(Object obj) {
        CatchingFishHiltAsyncTask catchingFishHiltAsyncTask;
        CatchingFishToastJUnitFlux catchingFishToastJUnitFlux = obj instanceof CatchingFishToastJUnitFlux ? (CatchingFishToastJUnitFlux) obj : null;
        return (catchingFishToastJUnitFlux == null || (catchingFishHiltAsyncTask = catchingFishToastJUnitFlux.CatchingFishParcelableFAB) == null) ? obj : catchingFishHiltAsyncTask;
    }

    public static final CatchingFishAdMobJUnit CatchingFishPayPalService(CatchingFishLayoutContext catchingFishLayoutContext) {
        CatchingFishAdMobJUnit catchingFishAdMobJUnit = CatchingFishJobScheduler(catchingFishLayoutContext).CatchingFishStateLiveData;
        if (catchingFishAdMobJUnit != null) {
            return catchingFishAdMobJUnit;
        }
        throw CatchingFishMVPLiveData.CatchingFish("This node does not have an owner.");
    }

    public static final long CatchingFishReduxKtor(int i, int i2) {
        return (i2 & 4294967295L) | (i << 32);
    }

    public static final void CatchingFishRoomDatabase(int i, int i2) {
        if (i <= i2) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i + ") is greater than size (" + i2 + ").");
    }

    public static final Object CatchingFishSensorManager(CatchingFishManifestMockk catchingFishManifestMockk, CatchingFishMockkView catchingFishMockkView) {
        CatchingFishReduxMockkView catchingFishReduxMockkView;
        CatchingFishManifestMockk CatchingFishJetpackCompose;
        Thread currentThread = Thread.currentThread();
        CatchingFishGlidePayPal catchingFishGlidePayPal = CatchingFishWidgetContext.CatchingFishDaggerWebsocket;
        CatchingFishAndroidXJUnit catchingFishAndroidXJUnit = (CatchingFishAndroidXJUnit) catchingFishManifestMockk.CatchingFishCoroutineFlow(catchingFishGlidePayPal);
        CatchingFishPayPalDataStore catchingFishPayPalDataStore = CatchingFishPayPalDataStore.CatchingFishReduxKtor;
        if (catchingFishAndroidXJUnit == null) {
            catchingFishReduxMockkView = CatchingFishMVVMOkHttp.CatchingFishParcelableFAB();
            CatchingFishJetpackCompose = CatchingFishRobolectricHilt.CatchingFishJetpackCompose(catchingFishPayPalDataStore, catchingFishManifestMockk.CatchingFishAnimationMockk(catchingFishReduxMockkView), true);
            CatchingFishGlideGson catchingFishGlideGson = CatchingFishGoogleMapsHilt.CatchingFishParcelableFAB;
            if (CatchingFishJetpackCompose != catchingFishGlideGson && CatchingFishJetpackCompose.CatchingFishCoroutineFlow(catchingFishGlidePayPal) == null) {
                CatchingFishJetpackCompose = CatchingFishJetpackCompose.CatchingFishAnimationMockk(catchingFishGlideGson);
            }
        } else {
            if (catchingFishAndroidXJUnit instanceof CatchingFishReduxMockkView) {
            }
            catchingFishReduxMockkView = (CatchingFishReduxMockkView) CatchingFishMVVMOkHttp.CatchingFishParcelableFAB.get();
            CatchingFishJetpackCompose = CatchingFishRobolectricHilt.CatchingFishJetpackCompose(catchingFishPayPalDataStore, catchingFishManifestMockk, true);
            CatchingFishGlideGson catchingFishGlideGson2 = CatchingFishGoogleMapsHilt.CatchingFishParcelableFAB;
            if (CatchingFishJetpackCompose != catchingFishGlideGson2 && CatchingFishJetpackCompose.CatchingFishCoroutineFlow(catchingFishGlidePayPal) == null) {
                CatchingFishJetpackCompose = CatchingFishJetpackCompose.CatchingFishAnimationMockk(catchingFishGlideGson2);
            }
        }
        CatchingFishDataStoreIntent catchingFishDataStoreIntent = new CatchingFishDataStoreIntent(CatchingFishJetpackCompose, currentThread, catchingFishReduxMockkView);
        catchingFishDataStoreIntent.CatchingFishCustomViewJUnit(CatchingFishFABManifest.CatchingFishReduxKtor, catchingFishDataStoreIntent, catchingFishMockkView);
        CatchingFishReduxMockkView catchingFishReduxMockkView2 = catchingFishDataStoreIntent.CatchingFishViewModelFAB;
        if (catchingFishReduxMockkView2 != null) {
            int i = CatchingFishReduxMockkView.CatchingFishLayout;
            catchingFishReduxMockkView2.CatchingFishPayPalService(false);
        }
        while (!Thread.interrupted()) {
            try {
                long CatchingFishSensorManager = catchingFishReduxMockkView2 != null ? catchingFishReduxMockkView2.CatchingFishSensorManager() : Long.MAX_VALUE;
                if (catchingFishDataStoreIntent.CatchingFishGradleManifest()) {
                    if (catchingFishReduxMockkView2 != null) {
                        int i2 = CatchingFishReduxMockkView.CatchingFishLayout;
                        catchingFishReduxMockkView2.CatchingFishFragmentFactory(false);
                    }
                    Object CatchingFishPayPalLiveData = CatchingFishPayPalLiveData(CatchingFishPicassoView.CatchingFishReduxKtor.get(catchingFishDataStoreIntent));
                    CatchingFishStripeAPIMVI catchingFishStripeAPIMVI = CatchingFishPayPalLiveData instanceof CatchingFishStripeAPIMVI ? (CatchingFishStripeAPIMVI) CatchingFishPayPalLiveData : null;
                    if (catchingFishStripeAPIMVI == null) {
                        return CatchingFishPayPalLiveData;
                    }
                    throw catchingFishStripeAPIMVI.CatchingFishParcelableFAB;
                }
                LockSupport.parkNanos(catchingFishDataStoreIntent, CatchingFishSensorManager);
            } catch (Throwable th) {
                if (catchingFishReduxMockkView2 != null) {
                    int i3 = CatchingFishReduxMockkView.CatchingFishLayout;
                    catchingFishReduxMockkView2.CatchingFishFragmentFactory(false);
                }
                throw th;
            }
        }
        InterruptedException interruptedException = new InterruptedException();
        catchingFishDataStoreIntent.CatchingFishParcelableFlux(interruptedException);
        throw interruptedException;
    }

    public static final void CatchingFishSnackbar(Object obj, CatchingFishServiceHandler catchingFishServiceHandler, CatchingFishSharedFlowMVI catchingFishSharedFlowMVI) {
        boolean CatchingFishDaggerWebsocket2 = catchingFishSharedFlowMVI.CatchingFishDaggerWebsocket(obj);
        Object CatchingFishPayPalService = catchingFishSharedFlowMVI.CatchingFishPayPalService();
        if (CatchingFishDaggerWebsocket2 || CatchingFishPayPalService == CatchingFishGsonOkHttp.CatchingFishParcelableFAB) {
            CatchingFishPayPalService = new CatchingFishLifecycleAdMob(catchingFishServiceHandler);
            catchingFishSharedFlowMVI.CatchingFishMoshiDaggerHilt(CatchingFishPayPalService);
        }
    }

    public static boolean CatchingFishSpannableWidget(int i, Rect rect, Rect rect2) {
        if (i == 17) {
            int i2 = rect.right;
            int i3 = rect2.right;
            return (i2 > i3 || rect.left >= i3) && rect.left > rect2.left;
        }
        if (i == 33) {
            int i4 = rect.bottom;
            int i5 = rect2.bottom;
            return (i4 > i5 || rect.top >= i5) && rect.top > rect2.top;
        }
        if (i == 66) {
            int i6 = rect.left;
            int i7 = rect2.left;
            return (i6 < i7 || rect.right <= i7) && rect.right < rect2.right;
        }
        if (i != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        int i8 = rect.top;
        int i9 = rect2.top;
        return (i8 < i9 || rect.bottom <= i9) && rect.bottom < rect2.bottom;
    }

    public static final void CatchingFishStateLiveData(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                CatchingFishAdMobFAB.CatchingFishViewModelFAB(th, th2);
            }
        }
    }

    public static boolean CatchingFishUnitTesting(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return rect2.right >= rect.left && rect2.left <= rect.right;
        }
        return rect2.bottom >= rect.top && rect2.top <= rect.bottom;
    }

    public static final boolean CatchingFishViewModelFAB(CatchingFishMVPAdMobGraphQL catchingFishMVPAdMobGraphQL, long j) {
        if (!catchingFishMVPAdMobGraphQL.CatchingFishReduxKtor.CatchingFishRoomDatabase) {
            return false;
        }
        CatchingFishGlideHandler catchingFishGlideHandler = (CatchingFishGlideHandler) CatchingFishJobScheduler(catchingFishMVPAdMobGraphQL).CatchingFishJobScheduler.CatchingFishViewModelScope;
        if (!catchingFishGlideHandler.CatchingFishMotionLayout.CatchingFishRoomDatabase) {
            return false;
        }
        long CatchingFishEspressoMockk = catchingFishGlideHandler.CatchingFishEspressoMockk(0L);
        float intBitsToFloat = Float.intBitsToFloat((int) (CatchingFishEspressoMockk >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (CatchingFishEspressoMockk & 4294967295L));
        long j2 = catchingFishMVPAdMobGraphQL.CatchingFishJetpackCompose;
        float f = ((int) (j2 >> 32)) + intBitsToFloat;
        float f2 = ((int) (j2 & 4294967295L)) + intBitsToFloat2;
        float intBitsToFloat3 = Float.intBitsToFloat((int) (j >> 32));
        if (intBitsToFloat > intBitsToFloat3 || intBitsToFloat3 > f) {
            return false;
        }
        float intBitsToFloat4 = Float.intBitsToFloat((int) (j & 4294967295L));
        return intBitsToFloat2 <= intBitsToFloat4 && intBitsToFloat4 <= f2;
    }

    public static final float CatchingFishViewModelScope(long j, long j2) {
        return Math.min(Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)) / Float.intBitsToFloat((int) (j & 4294967295L)));
    }

    public static final void CatchingFishWorkManager(CatchingFishFABToast catchingFishFABToast, CatchingFishFABStripeAPIFAB catchingFishFABStripeAPIFAB) {
        CatchingFishFABToast CatchingFishCoroutineFlow = CatchingFishJobScheduler(catchingFishFABStripeAPIFAB).CatchingFishCoroutineFlow();
        int i = CatchingFishCoroutineFlow.CatchingFishWorkManager - 1;
        Object[] objArr = CatchingFishCoroutineFlow.CatchingFishReduxKtor;
        if (i < objArr.length) {
            while (i >= 0) {
                catchingFishFABToast.CatchingFishSnackbar((CatchingFishFABStripeAPIFAB) ((CatchingFishBiometricRoom) objArr[i]).CatchingFishJobScheduler.CatchingFishFragmentHandler);
                i--;
            }
        }
    }

    public abstract float CatchingFishCoroutineFlow(CatchingFishOkHttpDagger catchingFishOkHttpDagger);

    public abstract void CatchingFishDagger(CatchingFishOkHttpDagger catchingFishOkHttpDagger, float f);
}
