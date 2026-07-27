package kotlin.text;

import android.content.Context;
import android.graphics.Typeface;
import android.util.SparseArray;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.adjust.sdk.network.ErrorCodes;
import com.catchingfish.fishcatcherpro.data.nativeconfig.bridge.NativeAdjustBridge;
import com.catchingfish.fishcatcherpro.data.nativeconfig.bridge.NativeAdvertisingBridge;
import com.catchingfish.fishcatcherpro.data.nativeconfig.bridge.NativePayloadFieldsBridge;
import com.catchingfish.fishcatcherpro.data.nativeconfig.bridge.NativeTransportBridge;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class CatchingFishFluxFluxBundle implements CatchingFishAndroidXMoshi, CatchingFishMockkDaggerHilt, CatchingFishMVIGoogleMaps {
    public static CatchingFishFluxFluxBundle CatchingFishViewModelFAB;
    public Object CatchingFishDaggerWebsocket;
    public Object CatchingFishReduxKtor;
    public Object CatchingFishViewModelScope;
    public Object CatchingFishWorkManager;

    public /* synthetic */ CatchingFishFluxFluxBundle(Object obj, Object obj2, Object obj3, Object obj4) {
        this.CatchingFishReduxKtor = obj;
        this.CatchingFishDaggerWebsocket = obj2;
        this.CatchingFishWorkManager = obj3;
        this.CatchingFishViewModelScope = obj4;
    }

    public static synchronized CatchingFishFluxFluxBundle CatchingFishRoomDatabase() {
        CatchingFishFluxFluxBundle catchingFishFluxFluxBundle;
        synchronized (CatchingFishFluxFluxBundle.class) {
            try {
                if (CatchingFishViewModelFAB == null) {
                    CatchingFishViewModelFAB = new CatchingFishFluxFluxBundle(0);
                }
                catchingFishFluxFluxBundle = CatchingFishViewModelFAB;
            } catch (Throwable th) {
                throw th;
            }
        }
        return catchingFishFluxFluxBundle;
    }

    public boolean CatchingFish(Context context) {
        if (((Boolean) this.CatchingFishWorkManager) == null) {
            this.CatchingFishWorkManager = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        ((Boolean) this.CatchingFishDaggerWebsocket).booleanValue();
        return ((Boolean) this.CatchingFishWorkManager).booleanValue();
    }

    public ArrayList CatchingFishAnimationMockk() {
        ArrayList arrayList = new ArrayList();
        for (CatchingFishStateFlowMockk catchingFishStateFlowMockk : ((HashMap) this.CatchingFishDaggerWebsocket).values()) {
            if (catchingFishStateFlowMockk != null) {
                arrayList.add(catchingFishStateFlowMockk.CatchingFishCoroutine);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public void CatchingFishCardViewRealm(CatchingFishMVVMKtor catchingFishMVVMKtor, CatchingFishLayoutRedux catchingFishLayoutRedux) {
        String str = (String) this.CatchingFishReduxKtor;
        CatchingFishWidgetMVVMAdMob catchingFishWidgetMVVMAdMob = (CatchingFishWidgetMVVMAdMob) catchingFishMVVMKtor;
        if (str == null) {
            throw new NullPointerException("text == null");
        }
        CatchingFishWebSocketMockk catchingFishWebSocketMockk = CatchingFishWebSocketMockk.CatchingFishViewModelScope;
        CatchingFishWebSocketMockk CatchingFishJetpackCompose = CatchingFishAdMobFAB.CatchingFishJetpackCompose(str);
        synchronized (catchingFishWidgetMVVMAdMob) {
            if (!catchingFishWidgetMVVMAdMob.CatchingFish && !catchingFishWidgetMVVMAdMob.CatchingFishAnimationMockk) {
                long j = catchingFishWidgetMVVMAdMob.CatchingFishUnitTesting;
                byte[] bArr = CatchingFishJetpackCompose.CatchingFishReduxKtor;
                if (bArr.length + j > 16777216) {
                    catchingFishWidgetMVVMAdMob.CatchingFishSnackbar(ErrorCodes.SERVER_RETRY_IN);
                    return;
                }
                catchingFishWidgetMVVMAdMob.CatchingFishUnitTesting = j + bArr.length;
                catchingFishWidgetMVVMAdMob.CatchingFishOkHttp.add(new CatchingFishGradleViewPager(CatchingFishJetpackCompose));
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = catchingFishWidgetMVVMAdMob.CatchingFishFragmentHandler;
                if (scheduledThreadPoolExecutor != null) {
                    scheduledThreadPoolExecutor.execute(catchingFishWidgetMVVMAdMob.CatchingFishViewModelScope);
                }
            }
        }
    }

    public CatchingFishMVVMIntentGson CatchingFishCardViewView() {
        NativePayloadFieldsBridge nativePayloadFieldsBridge = (NativePayloadFieldsBridge) this.CatchingFishViewModelScope;
        CatchingFishDataStoreToast catchingFishDataStoreToast = new CatchingFishDataStoreToast(nativePayloadFieldsBridge.readAdvertisingIdField(), nativePayloadFieldsBridge.readInstallReferrerField(), nativePayloadFieldsBridge.readMessagingTokenField(), nativePayloadFieldsBridge.readAdjustIdField());
        String readZeroAdvertisingId = ((NativeAdvertisingBridge) this.CatchingFishReduxKtor).readZeroAdvertisingId();
        NativeTransportBridge nativeTransportBridge = (NativeTransportBridge) this.CatchingFishDaggerWebsocket;
        return new CatchingFishMVVMIntentGson(readZeroAdvertisingId, nativeTransportBridge.readPostbackAddress(), nativeTransportBridge.readEncryptionPassword(), ((NativeAdjustBridge) this.CatchingFishWorkManager).readApplicationToken(), catchingFishDataStoreToast);
    }

    public CatchingFishGoogleMapsMoshi CatchingFishCloudMessaging(String str) {
        for (CatchingFishStateFlowMockk catchingFishStateFlowMockk : ((HashMap) this.CatchingFishDaggerWebsocket).values()) {
            if (catchingFishStateFlowMockk != null) {
                CatchingFishGoogleMapsMoshi catchingFishGoogleMapsMoshi = catchingFishStateFlowMockk.CatchingFishCoroutine;
                if (!str.equals(catchingFishGoogleMapsMoshi.CatchingFishViewModelFAB)) {
                    catchingFishGoogleMapsMoshi = catchingFishGoogleMapsMoshi.CatchingFishSpannableWidget.CatchingFishCoroutine.CatchingFishCloudMessaging(str);
                }
                if (catchingFishGoogleMapsMoshi != null) {
                    return catchingFishGoogleMapsMoshi;
                }
            }
        }
        return null;
    }

    public void CatchingFishCoroutine(CatchingFishWidgetFirebase catchingFishWidgetFirebase, int i) {
        if (i != 1 && i != 0) {
            throw new IllegalArgumentException(CatchingFishMVPLiveData.CatchingFishCloudMessaging("Unsupported priority value: ", i).toString());
        }
        if (((LinkedHashSet) this.CatchingFishViewModelScope).add(catchingFishWidgetFirebase)) {
            ((CatchingFishReduxSharedFlow) this.CatchingFishDaggerWebsocket).CatchingFishParcelableFAB(this, catchingFishWidgetFirebase, i);
        }
    }

    public void CatchingFishCoroutineFlow(CatchingFishStateFlowMockk catchingFishStateFlowMockk) {
        CatchingFishGoogleMapsMoshi catchingFishGoogleMapsMoshi = catchingFishStateFlowMockk.CatchingFishCoroutine;
        String str = catchingFishGoogleMapsMoshi.CatchingFishViewModelFAB;
        HashMap hashMap = (HashMap) this.CatchingFishDaggerWebsocket;
        if (hashMap.get(str) != null) {
            return;
        }
        hashMap.put(catchingFishGoogleMapsMoshi.CatchingFishViewModelFAB, catchingFishStateFlowMockk);
        if (CatchingFishToastSharedFlow.CatchingFishFragmentFactory(2)) {
            catchingFishGoogleMapsMoshi.toString();
        }
    }

    public void CatchingFishCustomView(String str) {
        ((CatchingFishViewPagerMockk) this.CatchingFishWorkManager).CatchingFishCoroutineFlow(str);
    }

    public void CatchingFishDaggerHiltFAB(CatchingFishStateFlowMockk catchingFishStateFlowMockk) {
        CatchingFishGoogleMapsMoshi catchingFishGoogleMapsMoshi = catchingFishStateFlowMockk.CatchingFishCoroutine;
        if (catchingFishGoogleMapsMoshi.CatchingFishCustomView) {
            ((CatchingFishRetrofitFAB) this.CatchingFishViewModelScope).CatchingFishReduxKtor(catchingFishGoogleMapsMoshi);
        }
        if (((CatchingFishStateFlowMockk) ((HashMap) this.CatchingFishDaggerWebsocket).put(catchingFishGoogleMapsMoshi.CatchingFishViewModelFAB, null)) != null && CatchingFishToastSharedFlow.CatchingFishFragmentFactory(2)) {
            catchingFishGoogleMapsMoshi.toString();
        }
    }

    public CatchingFishReduxBundleMVP CatchingFishDaggerWebsocket() {
        if (((CatchingFishBundleView) this.CatchingFishDaggerWebsocket) != null) {
            return new CatchingFishReduxBundleMVP(this);
        }
        throw new IllegalStateException("url == null");
    }

    public void CatchingFishEspressoTesting(CatchingFishRealmAsyncTask catchingFishRealmAsyncTask) {
        catchingFishRealmAsyncTask.CatchingFishWorkManager.decrementAndGet();
        ArrayDeque arrayDeque = (ArrayDeque) this.CatchingFishDaggerWebsocket;
        synchronized (this) {
            if (!arrayDeque.remove(catchingFishRealmAsyncTask)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        CatchingFishPayPal();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0074 A[Catch: all -> 0x0031, TRY_ENTER, TryCatch #0 {all -> 0x0031, blocks: (B:12:0x002d, B:13:0x0082, B:21:0x0064, B:23:0x0074), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9, types: [kotlin.text.CatchingFishRealmGoogleMaps] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object CatchingFishFragmentFactory(CatchingFishStateFlowGson catchingFishStateFlowGson) {
        CatchingFishSharedFlowMockk catchingFishSharedFlowMockk;
        ?? r1;
        CatchingFishFluxFluxBundle catchingFishFluxFluxBundle;
        CatchingFishManifestAdMob catchingFishManifestAdMob;
        CatchingFishFluxFluxBundle catchingFishFluxFluxBundle2;
        CatchingFishManifestAdMob catchingFishManifestAdMob2;
        try {
            if (catchingFishStateFlowGson instanceof CatchingFishSharedFlowMockk) {
                catchingFishSharedFlowMockk = (CatchingFishSharedFlowMockk) catchingFishStateFlowGson;
                int i = catchingFishSharedFlowMockk.CatchingFishCloudMessaging;
                if ((i & Integer.MIN_VALUE) != 0) {
                    catchingFishSharedFlowMockk.CatchingFishCloudMessaging = i - Integer.MIN_VALUE;
                    Object obj = catchingFishSharedFlowMockk.CatchingFishLayout;
                    r1 = catchingFishSharedFlowMockk.CatchingFishCloudMessaging;
                    CatchingFishRealmContext catchingFishRealmContext = CatchingFishRealmContext.CatchingFishParcelableFAB;
                    CatchingFishXMLLayoutMockk catchingFishXMLLayoutMockk = CatchingFishXMLLayoutMockk.CatchingFishReduxKtor;
                    if (r1 != 0) {
                        CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj);
                        if (((CatchingFishCustomViewAdMob) this.CatchingFishDaggerWebsocket).CatchingFishGradleManifest()) {
                            return catchingFishRealmContext;
                        }
                        CatchingFishManifestAdMob catchingFishManifestAdMob3 = (CatchingFishManifestAdMob) this.CatchingFishReduxKtor;
                        catchingFishSharedFlowMockk.CatchingFishViewModelScope = this;
                        catchingFishSharedFlowMockk.CatchingFishViewModelFAB = catchingFishManifestAdMob3;
                        catchingFishSharedFlowMockk.CatchingFishCloudMessaging = 1;
                        if (catchingFishManifestAdMob3.CatchingFishCoroutine(catchingFishSharedFlowMockk) != catchingFishXMLLayoutMockk) {
                            catchingFishFluxFluxBundle = this;
                            catchingFishManifestAdMob = catchingFishManifestAdMob3;
                        }
                        return catchingFishXMLLayoutMockk;
                    }
                    if (r1 != 1) {
                        if (r1 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        CatchingFishRealmGoogleMaps catchingFishRealmGoogleMaps = catchingFishSharedFlowMockk.CatchingFishViewModelFAB;
                        catchingFishFluxFluxBundle2 = catchingFishSharedFlowMockk.CatchingFishViewModelScope;
                        CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj);
                        r1 = catchingFishRealmGoogleMaps;
                        ((CatchingFishCustomViewAdMob) catchingFishFluxFluxBundle2.CatchingFishDaggerWebsocket).CatchingFishLayoutInflater(catchingFishRealmContext);
                        catchingFishManifestAdMob2 = r1;
                        return catchingFishRealmContext;
                    }
                    ?? r12 = catchingFishSharedFlowMockk.CatchingFishViewModelFAB;
                    catchingFishFluxFluxBundle = catchingFishSharedFlowMockk.CatchingFishViewModelScope;
                    CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj);
                    catchingFishManifestAdMob = r12;
                    catchingFishManifestAdMob2 = catchingFishManifestAdMob;
                    if (!((CatchingFishCustomViewAdMob) catchingFishFluxFluxBundle.CatchingFishDaggerWebsocket).CatchingFishGradleManifest()) {
                        catchingFishSharedFlowMockk.CatchingFishViewModelScope = catchingFishFluxFluxBundle;
                        catchingFishSharedFlowMockk.CatchingFishViewModelFAB = catchingFishManifestAdMob;
                        catchingFishSharedFlowMockk.CatchingFishCloudMessaging = 2;
                        if (catchingFishFluxFluxBundle.CatchingFishLayout(catchingFishSharedFlowMockk) != catchingFishXMLLayoutMockk) {
                            catchingFishFluxFluxBundle2 = catchingFishFluxFluxBundle;
                            r1 = catchingFishManifestAdMob;
                            ((CatchingFishCustomViewAdMob) catchingFishFluxFluxBundle2.CatchingFishDaggerWebsocket).CatchingFishLayoutInflater(catchingFishRealmContext);
                            catchingFishManifestAdMob2 = r1;
                        }
                        return catchingFishXMLLayoutMockk;
                    }
                    return catchingFishRealmContext;
                }
            }
            if (r1 != 0) {
            }
            catchingFishManifestAdMob2 = catchingFishManifestAdMob;
            if (!((CatchingFishCustomViewAdMob) catchingFishFluxFluxBundle.CatchingFishDaggerWebsocket).CatchingFishGradleManifest()) {
            }
            return catchingFishRealmContext;
        } finally {
            ((CatchingFishManifestAdMob) r1).CatchingFishDaggerWebsocket(null);
        }
        catchingFishSharedFlowMockk = new CatchingFishSharedFlowMockk(this, catchingFishStateFlowGson);
        Object obj2 = catchingFishSharedFlowMockk.CatchingFishLayout;
        r1 = catchingFishSharedFlowMockk.CatchingFishCloudMessaging;
        CatchingFishRealmContext catchingFishRealmContext2 = CatchingFishRealmContext.CatchingFishParcelableFAB;
        CatchingFishXMLLayoutMockk catchingFishXMLLayoutMockk2 = CatchingFishXMLLayoutMockk.CatchingFishReduxKtor;
    }

    public CatchingFishGoogleMapsMoshi CatchingFishFragmentHandler(String str) {
        CatchingFishStateFlowMockk catchingFishStateFlowMockk = (CatchingFishStateFlowMockk) ((HashMap) this.CatchingFishDaggerWebsocket).get(str);
        if (catchingFishStateFlowMockk != null) {
            return catchingFishStateFlowMockk.CatchingFishCoroutine;
        }
        return null;
    }

    public boolean CatchingFishGsonAppCompat(CatchingFishGradleSpannable catchingFishGradleSpannable, Menu menu) {
        ActionMode.Callback callback = (ActionMode.Callback) this.CatchingFishReduxKtor;
        CatchingFishKtorMVIMoshi CatchingFishOkHttp = CatchingFishOkHttp(catchingFishGradleSpannable);
        CatchingFishGraphQLRealmFAB catchingFishGraphQLRealmFAB = (CatchingFishGraphQLRealmFAB) this.CatchingFishViewModelScope;
        Menu menu2 = (Menu) catchingFishGraphQLRealmFAB.get(menu);
        if (menu2 == null) {
            menu2 = new CatchingFishOkHttpHiltFAB((Context) this.CatchingFishDaggerWebsocket, (CatchingFishSharedFlowAdMob) menu);
            catchingFishGraphQLRealmFAB.put(menu, menu2);
        }
        return callback.onCreateActionMode(CatchingFishOkHttp, menu2);
    }

    public boolean CatchingFishJetpackCompose(Context context) {
        if (((Boolean) this.CatchingFishDaggerWebsocket) == null) {
            this.CatchingFishDaggerWebsocket = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        ((Boolean) this.CatchingFishDaggerWebsocket).booleanValue();
        return ((Boolean) this.CatchingFishDaggerWebsocket).booleanValue();
    }

    public void CatchingFishJobScheduler(IOException iOException) {
        CatchingFishDatabindingMVP catchingFishDatabindingMVP = (CatchingFishDatabindingMVP) this.CatchingFishWorkManager;
        synchronized (catchingFishDatabindingMVP.CatchingFishCoroutine) {
            catchingFishDatabindingMVP.CatchingFishViewModelFAB = true;
        }
        CatchingFishAdMobGson CatchingFishViewModelFAB2 = ((CatchingFishFragmentFlux) this.CatchingFishViewModelScope).CatchingFishViewModelFAB();
        synchronized (CatchingFishViewModelFAB2.CatchingFishSnackbar) {
            try {
                if (iOException instanceof CatchingFishDaggerContext) {
                    int i = ((CatchingFishDaggerContext) iOException).CatchingFishReduxKtor;
                    if (i == 5) {
                        int i2 = CatchingFishViewModelFAB2.CatchingFishUnitTesting + 1;
                        CatchingFishViewModelFAB2.CatchingFishUnitTesting = i2;
                        if (i2 > 1) {
                            CatchingFishViewModelFAB2.CatchingFishCloudMessaging = true;
                            CatchingFishViewModelFAB2.CatchingFishEspressoTesting++;
                        }
                    } else if (i != 6) {
                        CatchingFishViewModelFAB2.CatchingFishCloudMessaging = true;
                        CatchingFishViewModelFAB2.CatchingFishEspressoTesting++;
                    }
                } else {
                    if (!(CatchingFishViewModelFAB2.CatchingFishViewModelFAB != null) || (iOException instanceof CatchingFishRoomWebsocket)) {
                        CatchingFishViewModelFAB2.CatchingFishCloudMessaging = true;
                        if (CatchingFishViewModelFAB2.CatchingFishOkHttp == 0) {
                            if (iOException != null) {
                                CatchingFishViewModelFAB2.CatchingFishSnackbar.CatchingFishParcelableFAB(CatchingFishViewModelFAB2.CatchingFishCoroutine, iOException);
                            }
                            CatchingFishViewModelFAB2.CatchingFishEspressoTesting++;
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object CatchingFishLayout(CatchingFishStateFlowGson catchingFishStateFlowGson) {
        CatchingFishUnitTestingView catchingFishUnitTestingView;
        int i;
        CatchingFishFluxFluxBundle catchingFishFluxFluxBundle;
        CatchingFishMockkStripeAPI catchingFishMockkStripeAPI;
        CatchingFishKtorView catchingFishKtorView = (CatchingFishKtorView) this.CatchingFishViewModelScope;
        if (catchingFishStateFlowGson instanceof CatchingFishUnitTestingView) {
            catchingFishUnitTestingView = (CatchingFishUnitTestingView) catchingFishStateFlowGson;
            int i2 = catchingFishUnitTestingView.CatchingFishFragmentHandler;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                catchingFishUnitTestingView.CatchingFishFragmentHandler = i2 - Integer.MIN_VALUE;
                Object obj = catchingFishUnitTestingView.CatchingFishViewModelFAB;
                i = catchingFishUnitTestingView.CatchingFishFragmentHandler;
                if (i != 0) {
                    CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj);
                    List list = (List) this.CatchingFishWorkManager;
                    CatchingFishXMLLayoutMockk catchingFishXMLLayoutMockk = CatchingFishXMLLayoutMockk.CatchingFishReduxKtor;
                    if (list == null || list.isEmpty()) {
                        catchingFishUnitTestingView.CatchingFishViewModelScope = this;
                        catchingFishUnitTestingView.CatchingFishFragmentHandler = 1;
                        obj = CatchingFishKtorView.CatchingFishViewModelScope(catchingFishKtorView, false, catchingFishUnitTestingView);
                        if (obj != catchingFishXMLLayoutMockk) {
                            catchingFishFluxFluxBundle = this;
                            catchingFishMockkStripeAPI = (CatchingFishMockkStripeAPI) obj;
                        }
                    } else {
                        CatchingFishServiceJUnit CatchingFishViewModelFAB2 = catchingFishKtorView.CatchingFishViewModelFAB();
                        CatchingFishGradleCardView catchingFishGradleCardView = new CatchingFishGradleCardView(catchingFishKtorView, this, null);
                        catchingFishUnitTestingView.CatchingFishViewModelScope = this;
                        catchingFishUnitTestingView.CatchingFishFragmentHandler = 2;
                        obj = CatchingFishViewModelFAB2.CatchingFishSnackbar(catchingFishGradleCardView, catchingFishUnitTestingView);
                        if (obj != catchingFishXMLLayoutMockk) {
                            catchingFishFluxFluxBundle = this;
                            catchingFishMockkStripeAPI = (CatchingFishMockkStripeAPI) obj;
                        }
                    }
                    return catchingFishXMLLayoutMockk;
                }
                if (i == 1) {
                    catchingFishFluxFluxBundle = catchingFishUnitTestingView.CatchingFishViewModelScope;
                    CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj);
                    catchingFishMockkStripeAPI = (CatchingFishMockkStripeAPI) obj;
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    catchingFishFluxFluxBundle = catchingFishUnitTestingView.CatchingFishViewModelScope;
                    CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj);
                    catchingFishMockkStripeAPI = (CatchingFishMockkStripeAPI) obj;
                }
                ((CatchingFishKtorView) catchingFishFluxFluxBundle.CatchingFishViewModelScope).CatchingFishCloudMessaging.CatchingFishParcelableFlux(catchingFishMockkStripeAPI);
                return CatchingFishRealmContext.CatchingFishParcelableFAB;
            }
        }
        catchingFishUnitTestingView = new CatchingFishUnitTestingView(this, catchingFishStateFlowGson);
        Object obj2 = catchingFishUnitTestingView.CatchingFishViewModelFAB;
        i = catchingFishUnitTestingView.CatchingFishFragmentHandler;
        if (i != 0) {
        }
        ((CatchingFishKtorView) catchingFishFluxFluxBundle.CatchingFishViewModelScope).CatchingFishCloudMessaging.CatchingFishParcelableFlux(catchingFishMockkStripeAPI);
        return CatchingFishRealmContext.CatchingFishParcelableFAB;
    }

    public CatchingFishGsonReduxWidget CatchingFishMVPRobolectric(boolean z) {
        try {
            CatchingFishGsonReduxWidget CatchingFishViewModelScope = ((CatchingFishFragmentFlux) this.CatchingFishViewModelScope).CatchingFishViewModelScope(z);
            if (CatchingFishViewModelScope == null) {
                return CatchingFishViewModelScope;
            }
            CatchingFishWidgetContext.CatchingFishUnitTesting.getClass();
            CatchingFishViewModelScope.CatchingFishOkHttp = this;
            return CatchingFishViewModelScope;
        } catch (IOException e) {
            ((CatchingFishWidgetContext) this.CatchingFishDaggerWebsocket).getClass();
            CatchingFishJobScheduler(e);
            throw e;
        }
    }

    public void CatchingFishMutableLiveData(CatchingFishGsonWebSocket catchingFishGsonWebSocket) {
        if (((CatchingFishLayoutWebSocket) this.CatchingFishDaggerWebsocket) == CatchingFishLayoutWebSocket.CatchingFishDaggerWebsocket) {
            CatchingFishMockkCoroutine catchingFishMockkCoroutine = (CatchingFishMockkCoroutine) this.CatchingFishReduxKtor;
            if (catchingFishMockkCoroutine == null) {
                throw new IllegalStateException("layoutCoordinates not set");
            }
            CatchingFishViewMVIMVVM.CatchingFishParcelableFlux(catchingFishGsonWebSocket, catchingFishMockkCoroutine.CatchingFishEspressoMockk(0L), new CatchingFishMVVM(15, (CatchingFishRealmStateFlow) this.CatchingFishViewModelScope), true);
        }
        this.CatchingFishDaggerWebsocket = CatchingFishLayoutWebSocket.CatchingFishWorkManager;
    }

    public CatchingFishLayoutGlide CatchingFishNavigation(CatchingFishAnimationIntent catchingFishAnimationIntent, String str) {
        CatchingFishLayoutGlide catchingFishLayoutGlide;
        boolean isInstance;
        CatchingFishLayoutGlide CatchingFishSnackbar;
        CatchingFishFirebaseDagger.CatchingFishNavigation(str, "key");
        synchronized (((CatchingFishGradleMVVM) this.CatchingFishViewModelScope)) {
            try {
                CatchingFishManifestService catchingFishManifestService = (CatchingFishManifestService) this.CatchingFishReduxKtor;
                catchingFishManifestService.getClass();
                catchingFishLayoutGlide = (CatchingFishLayoutGlide) catchingFishManifestService.CatchingFishParcelableFAB.get(str);
                Class cls = catchingFishAnimationIntent.CatchingFishParcelableFAB;
                Map map = CatchingFishAnimationIntent.CatchingFishSnackbar;
                CatchingFishFirebaseDagger.CatchingFishStateLiveData(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
                Integer num = (Integer) map.get(cls);
                if (num != null) {
                    isInstance = CatchingFishLayoutRoomFAB.CatchingFishJobScheduler(num.intValue(), catchingFishLayoutGlide);
                } else {
                    if (cls.isPrimitive()) {
                        cls = CatchingFishRobolectricHilt.CatchingFishGsonAppCompat(CatchingFishContextFlux.CatchingFishParcelableFAB(cls));
                    }
                    isInstance = cls.isInstance(catchingFishLayoutGlide);
                }
                if (isInstance) {
                    CatchingFishManifestOkHttp catchingFishManifestOkHttp = (CatchingFishManifestOkHttp) this.CatchingFishDaggerWebsocket;
                    if (catchingFishManifestOkHttp instanceof CatchingFishKtorLiveData) {
                        CatchingFishKtorLiveData catchingFishKtorLiveData = (CatchingFishKtorLiveData) catchingFishManifestOkHttp;
                        CatchingFishFirebaseDagger.CatchingFishAnimationMockk(catchingFishLayoutGlide);
                        CatchingFishToolbarToast catchingFishToolbarToast = catchingFishKtorLiveData.CatchingFishReduxKtor;
                        if (catchingFishToolbarToast != null) {
                            CatchingFishViewModelIntent catchingFishViewModelIntent = catchingFishKtorLiveData.CatchingFishDaggerWebsocket;
                            CatchingFishFirebaseDagger.CatchingFishAnimationMockk(catchingFishViewModelIntent);
                            CatchingFishBiometricBundle.CatchingFishCoroutine(catchingFishLayoutGlide, catchingFishViewModelIntent, catchingFishToolbarToast);
                        }
                    }
                    CatchingFishFirebaseDagger.CatchingFishStateLiveData(catchingFishLayoutGlide, "null cannot be cast to non-null type T of androidx.lifecycle.viewmodel.internal.ViewModelProviderImpl.getViewModel");
                } else {
                    CatchingFishViewParcelable catchingFishViewParcelable = new CatchingFishViewParcelable((CatchingFishMVVMCameraX) this.CatchingFishWorkManager);
                    catchingFishViewParcelable.CatchingFishParcelableFAB.put(CatchingFishServiceHilt.CatchingFishFragmentHandler, str);
                    CatchingFishManifestOkHttp catchingFishManifestOkHttp2 = (CatchingFishManifestOkHttp) this.CatchingFishDaggerWebsocket;
                    try {
                        try {
                            CatchingFishSnackbar = catchingFishManifestOkHttp2.CatchingFishCoroutine(catchingFishAnimationIntent, catchingFishViewParcelable);
                        } catch (AbstractMethodError unused) {
                            CatchingFishSnackbar = catchingFishManifestOkHttp2.CatchingFishSnackbar(CatchingFishRobolectricHilt.CatchingFishParcelableFlux(catchingFishAnimationIntent));
                        }
                    } catch (AbstractMethodError unused2) {
                        CatchingFishSnackbar = catchingFishManifestOkHttp2.CatchingFishParcelableFAB(CatchingFishRobolectricHilt.CatchingFishParcelableFlux(catchingFishAnimationIntent), catchingFishViewParcelable);
                    }
                    catchingFishLayoutGlide = CatchingFishSnackbar;
                    CatchingFishManifestService catchingFishManifestService2 = (CatchingFishManifestService) this.CatchingFishReduxKtor;
                    catchingFishManifestService2.getClass();
                    CatchingFishFirebaseDagger.CatchingFishNavigation(catchingFishLayoutGlide, "viewModel");
                    CatchingFishLayoutGlide catchingFishLayoutGlide2 = (CatchingFishLayoutGlide) catchingFishManifestService2.CatchingFishParcelableFAB.put(str, catchingFishLayoutGlide);
                    if (catchingFishLayoutGlide2 != null) {
                        catchingFishLayoutGlide2.CatchingFishParcelableFAB();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return catchingFishLayoutGlide;
    }

    public CatchingFishKtorMVIMoshi CatchingFishOkHttp(CatchingFishGradleSpannable catchingFishGradleSpannable) {
        ArrayList arrayList = (ArrayList) this.CatchingFishWorkManager;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            CatchingFishKtorMVIMoshi catchingFishKtorMVIMoshi = (CatchingFishKtorMVIMoshi) arrayList.get(i);
            if (catchingFishKtorMVIMoshi != null && catchingFishKtorMVIMoshi.CatchingFishSnackbar == catchingFishGradleSpannable) {
                return catchingFishKtorMVIMoshi;
            }
        }
        CatchingFishKtorMVIMoshi catchingFishKtorMVIMoshi2 = new CatchingFishKtorMVIMoshi((Context) this.CatchingFishDaggerWebsocket, catchingFishGradleSpannable);
        arrayList.add(catchingFishKtorMVIMoshi2);
        return catchingFishKtorMVIMoshi2;
    }

    public void CatchingFishParcelableFAB(CatchingFishGoogleMapsMoshi catchingFishGoogleMapsMoshi) {
        if (((ArrayList) this.CatchingFishReduxKtor).contains(catchingFishGoogleMapsMoshi)) {
            throw new IllegalStateException("Fragment already added: " + catchingFishGoogleMapsMoshi);
        }
        synchronized (((ArrayList) this.CatchingFishReduxKtor)) {
            ((ArrayList) this.CatchingFishReduxKtor).add(catchingFishGoogleMapsMoshi);
        }
        catchingFishGoogleMapsMoshi.CatchingFishUnitTesting = true;
    }

    public boolean CatchingFishParcelableFlux(CatchingFishGradleSpannable catchingFishGradleSpannable, MenuItem menuItem) {
        return ((ActionMode.Callback) this.CatchingFishReduxKtor).onActionItemClicked(CatchingFishOkHttp(catchingFishGradleSpannable), new CatchingFishFABHilt((Context) this.CatchingFishDaggerWebsocket, (CatchingFishGlideSpannable) menuItem));
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void CatchingFishPayPal() {
        int size;
        int i;
        ThreadPoolExecutor threadPoolExecutor;
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            try {
                Iterator it = ((ArrayDeque) this.CatchingFishViewModelScope).iterator();
                while (it.hasNext()) {
                    CatchingFishRealmAsyncTask catchingFishRealmAsyncTask = (CatchingFishRealmAsyncTask) it.next();
                    if (((ArrayDeque) this.CatchingFishDaggerWebsocket).size() < 64) {
                        if (catchingFishRealmAsyncTask.CatchingFishWorkManager.get() < 5) {
                            it.remove();
                            catchingFishRealmAsyncTask.CatchingFishWorkManager.incrementAndGet();
                            arrayList.add(catchingFishRealmAsyncTask);
                            ((ArrayDeque) this.CatchingFishDaggerWebsocket).add(catchingFishRealmAsyncTask);
                        }
                    }
                }
                synchronized (this) {
                    ((ArrayDeque) this.CatchingFishDaggerWebsocket).size();
                    ((ArrayDeque) this.CatchingFishWorkManager).size();
                }
                size = arrayList.size();
                for (i = 0; i < size; i++) {
                    CatchingFishRealmAsyncTask catchingFishRealmAsyncTask2 = (CatchingFishRealmAsyncTask) arrayList.get(i);
                    synchronized (this) {
                        try {
                            if (((ThreadPoolExecutor) this.CatchingFishReduxKtor) == null) {
                                TimeUnit timeUnit = TimeUnit.SECONDS;
                                SynchronousQueue synchronousQueue = new SynchronousQueue();
                                byte[] bArr = CatchingFishEspressoDagger.CatchingFishParcelableFAB;
                                this.CatchingFishReduxKtor = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, timeUnit, synchronousQueue, new CatchingFishAdMobAsyncTask("OkHttp Dispatcher", false));
                            }
                            threadPoolExecutor = (ThreadPoolExecutor) this.CatchingFishReduxKtor;
                        } finally {
                        }
                    }
                    CatchingFishDaggerWebSocket catchingFishDaggerWebSocket = catchingFishRealmAsyncTask2.CatchingFishViewModelScope;
                    try {
                        try {
                            threadPoolExecutor.execute(catchingFishRealmAsyncTask2);
                        } catch (RejectedExecutionException e) {
                            InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                            interruptedIOException.initCause(e);
                            catchingFishDaggerWebSocket.CatchingFishDaggerWebsocket.CatchingFishWorkManager(interruptedIOException);
                            ((CatchingFishWidgetMVVMAdMob) catchingFishRealmAsyncTask2.CatchingFishDaggerWebsocket.CatchingFishWorkManager).CatchingFishCoroutine(interruptedIOException);
                            catchingFishDaggerWebSocket.CatchingFishReduxKtor.CatchingFishReduxKtor.CatchingFishEspressoTesting(catchingFishRealmAsyncTask2);
                        }
                    } catch (Throwable th) {
                        catchingFishDaggerWebSocket.CatchingFishReduxKtor.CatchingFishReduxKtor.CatchingFishEspressoTesting(catchingFishRealmAsyncTask2);
                        throw th;
                    }
                }
            } finally {
            }
        }
        size = arrayList.size();
        while (i < size) {
        }
    }

    public void CatchingFishPayPalService(String str) {
        String str2;
        if (str == null) {
            throw new NullPointerException("url == null");
        }
        if (str.regionMatches(true, 0, "ws:", 0, 3)) {
            str2 = "http:" + str.substring(3);
        } else if (str.regionMatches(true, 0, "wss:", 0, 4)) {
            str2 = "https:" + str.substring(4);
        } else {
            str2 = str;
        }
        CatchingFishViewHilt catchingFishViewHilt = new CatchingFishViewHilt(0);
        catchingFishViewHilt.CatchingFishReduxKtor(null, str2);
        this.CatchingFishDaggerWebsocket = catchingFishViewHilt.CatchingFishSnackbar();
    }

    public IOException CatchingFishReduxKtor(boolean z, boolean z2, IOException iOException) {
        CatchingFishWidgetContext catchingFishWidgetContext = (CatchingFishWidgetContext) this.CatchingFishDaggerWebsocket;
        if (iOException != null) {
            CatchingFishJobScheduler(iOException);
        }
        if (z2) {
            if (iOException != null) {
                catchingFishWidgetContext.getClass();
            } else {
                catchingFishWidgetContext.getClass();
            }
        }
        if (z) {
            if (iOException != null) {
                catchingFishWidgetContext.getClass();
            } else {
                catchingFishWidgetContext.getClass();
            }
        }
        return ((CatchingFishDaggerHiltRedux) this.CatchingFishReduxKtor).CatchingFishCoroutine(this, z2, z, iOException);
    }

    public void CatchingFishSnackbar(CatchingFishWidgetLiveData catchingFishWidgetLiveData) {
        if (((LinkedHashSet) this.CatchingFishViewModelScope).add(catchingFishWidgetLiveData)) {
            ((CatchingFishReduxSharedFlow) this.CatchingFishDaggerWebsocket).CatchingFishParcelableFAB(this, catchingFishWidgetLiveData, -1);
        }
    }

    public void CatchingFishSpannableWidget(String str, CatchingFishHiltMVPToast catchingFishHiltMVPToast) {
        if (str == null) {
            throw new NullPointerException("method == null");
        }
        if (str.length() == 0) {
            throw new IllegalArgumentException("method.length() == 0");
        }
        if (catchingFishHiltMVPToast != null && !CatchingFishAdMobFAB.CatchingFishCustomView(str)) {
            throw new IllegalArgumentException(CatchingFishMVPLiveData.CatchingFishOkHttp("method ", str, " must not have a request body."));
        }
        if (catchingFishHiltMVPToast == null && (str.equals("POST") || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("REPORT"))) {
            throw new IllegalArgumentException(CatchingFishMVPLiveData.CatchingFishOkHttp("method ", str, " must have a request body."));
        }
        this.CatchingFishReduxKtor = str;
    }

    public List CatchingFishStateLiveData() {
        ArrayList arrayList;
        if (((ArrayList) this.CatchingFishReduxKtor).isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (((ArrayList) this.CatchingFishReduxKtor)) {
            arrayList = new ArrayList((ArrayList) this.CatchingFishReduxKtor);
        }
        return arrayList;
    }

    public ArrayList CatchingFishUnitTesting() {
        ArrayList arrayList = new ArrayList();
        for (CatchingFishStateFlowMockk catchingFishStateFlowMockk : ((HashMap) this.CatchingFishDaggerWebsocket).values()) {
            if (catchingFishStateFlowMockk != null) {
                arrayList.add(catchingFishStateFlowMockk);
            }
        }
        return arrayList;
    }

    public void CatchingFishViewModelFAB(CatchingFishGsonWebSocket catchingFishGsonWebSocket, boolean z) {
        CatchingFishRealmStateFlow catchingFishRealmStateFlow = (CatchingFishRealmStateFlow) this.CatchingFishViewModelScope;
        ArrayList arrayList = (ArrayList) catchingFishGsonWebSocket.CatchingFishCoroutine;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((CatchingFishFABAdMob) arrayList.get(i)).CatchingFishSnackbar()) {
                CatchingFishMutableLiveData(catchingFishGsonWebSocket);
                return;
            }
        }
        CatchingFishMockkCoroutine catchingFishMockkCoroutine = (CatchingFishMockkCoroutine) this.CatchingFishReduxKtor;
        if (catchingFishMockkCoroutine == null) {
            throw new IllegalStateException("layoutCoordinates not set");
        }
        CatchingFishViewMVIMVVM.CatchingFishParcelableFlux(catchingFishGsonWebSocket, catchingFishMockkCoroutine.CatchingFishEspressoMockk(0L), new CatchingFishOkHttpRedux(7, this, catchingFishRealmStateFlow), false);
        if (((CatchingFishLayoutWebSocket) this.CatchingFishDaggerWebsocket) == CatchingFishLayoutWebSocket.CatchingFishDaggerWebsocket) {
            if (z) {
                int size2 = arrayList.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    ((CatchingFishFABAdMob) arrayList.get(i2)).CatchingFishParcelableFAB();
                }
            }
            ((CatchingFishGlideFAB) catchingFishGsonWebSocket.CatchingFishReduxKtor).CatchingFishParcelableFAB = !catchingFishRealmStateFlow.CatchingFishCoroutine;
        }
    }

    public void CatchingFishViewModelScope(CatchingFishWidgetLiveData catchingFishWidgetLiveData, CatchingFishHiltBiometric catchingFishHiltBiometric) {
        CatchingFishReduxSharedFlow catchingFishReduxSharedFlow = (CatchingFishReduxSharedFlow) this.CatchingFishDaggerWebsocket;
        catchingFishReduxSharedFlow.getClass();
        if (catchingFishReduxSharedFlow.CatchingFishViewModelScope != 0) {
            return;
        }
        catchingFishReduxSharedFlow.CatchingFishWorkManager = catchingFishReduxSharedFlow.CatchingFishCoroutine(-1);
        catchingFishReduxSharedFlow.CatchingFishViewModelScope = -1;
        catchingFishReduxSharedFlow.CatchingFishViewModelFAB = catchingFishWidgetLiveData;
        if (catchingFishHiltBiometric != null) {
            CatchingFishHandlerAndroidX catchingFishHandlerAndroidX = catchingFishReduxSharedFlow.CatchingFishParcelableFAB;
            CatchingFishGradleRoom catchingFishGradleRoom = new CatchingFishGradleRoom(catchingFishHiltBiometric);
            catchingFishHandlerAndroidX.getClass();
            catchingFishHandlerAndroidX.CatchingFishFragmentHandler(null, catchingFishGradleRoom);
        }
    }

    public void CatchingFishWorkManager(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) ((CatchingFishGraphQLRealmFAB) this.CatchingFishDaggerWebsocket).get(obj);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                CatchingFishWorkManager(arrayList2.get(i), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }

    @Override // kotlin.text.CatchingFishHandlerMVP
    public Object get() {
        return new CatchingFishMVIAppCompat((Executor) ((CatchingFishHandlerMVP) this.CatchingFishReduxKtor).get(), (CatchingFishOkHttpFirebase) ((CatchingFishHandlerMVP) this.CatchingFishDaggerWebsocket).get(), (CatchingFishAppCompatLayout) ((CatchingFishAsyncTaskDagger) this.CatchingFishWorkManager).get(), (CatchingFishGsonCameraX) ((CatchingFishHandlerMVP) this.CatchingFishViewModelScope).get());
    }

    @Override // kotlin.text.CatchingFishMockkDaggerHilt
    public void onCancel() {
        View view = (View) this.CatchingFishReduxKtor;
        view.clearAnimation();
        ((ViewGroup) this.CatchingFishDaggerWebsocket).endViewTransition(view);
        ((CatchingFishOkHttpPayPal) this.CatchingFishWorkManager).CatchingFishCoroutine();
        if (CatchingFishToastSharedFlow.CatchingFishFragmentFactory(2)) {
            Objects.toString((CatchingFishMVPDatabinding) this.CatchingFishViewModelScope);
        }
    }

    public CatchingFishFluxFluxBundle(CatchingFishManifestService catchingFishManifestService, CatchingFishManifestOkHttp catchingFishManifestOkHttp, CatchingFishMVVMCameraX catchingFishMVVMCameraX) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(catchingFishManifestService, "store");
        CatchingFishFirebaseDagger.CatchingFishNavigation(catchingFishMVVMCameraX, "defaultExtras");
        this.CatchingFishReduxKtor = catchingFishManifestService;
        this.CatchingFishDaggerWebsocket = catchingFishManifestOkHttp;
        this.CatchingFishWorkManager = catchingFishMVVMCameraX;
        this.CatchingFishViewModelScope = new CatchingFishGradleMVVM(29);
    }

    public CatchingFishFluxFluxBundle(Typeface typeface, CatchingFishBundleRoom catchingFishBundleRoom) {
        int i;
        int i2;
        int i3;
        int i4;
        this.CatchingFishViewModelScope = typeface;
        this.CatchingFishReduxKtor = catchingFishBundleRoom;
        this.CatchingFishWorkManager = new CatchingFishOkHttpXMLLayout(1024);
        int CatchingFishParcelableFAB = catchingFishBundleRoom.CatchingFishParcelableFAB(6);
        if (CatchingFishParcelableFAB != 0) {
            int i5 = CatchingFishParcelableFAB + catchingFishBundleRoom.CatchingFishReduxKtor;
            i = ((ByteBuffer) catchingFishBundleRoom.CatchingFishViewModelScope).getInt(((ByteBuffer) catchingFishBundleRoom.CatchingFishViewModelScope).getInt(i5) + i5);
        } else {
            i = 0;
        }
        this.CatchingFishDaggerWebsocket = new char[i * 2];
        int CatchingFishParcelableFAB2 = catchingFishBundleRoom.CatchingFishParcelableFAB(6);
        if (CatchingFishParcelableFAB2 != 0) {
            int i6 = CatchingFishParcelableFAB2 + catchingFishBundleRoom.CatchingFishReduxKtor;
            i2 = ((ByteBuffer) catchingFishBundleRoom.CatchingFishViewModelScope).getInt(((ByteBuffer) catchingFishBundleRoom.CatchingFishViewModelScope).getInt(i6) + i6);
        } else {
            i2 = 0;
        }
        for (int i7 = 0; i7 < i2; i7++) {
            CatchingFishFirebaseFABGson catchingFishFirebaseFABGson = new CatchingFishFirebaseFABGson(this, i7);
            CatchingFishManifestGson CatchingFishSnackbar = catchingFishFirebaseFABGson.CatchingFishSnackbar();
            int CatchingFishParcelableFAB3 = CatchingFishSnackbar.CatchingFishParcelableFAB(4);
            Character.toChars(CatchingFishParcelableFAB3 != 0 ? ((ByteBuffer) CatchingFishSnackbar.CatchingFishViewModelScope).getInt(CatchingFishParcelableFAB3 + CatchingFishSnackbar.CatchingFishReduxKtor) : 0, (char[]) this.CatchingFishDaggerWebsocket, i7 * 2);
            CatchingFishManifestGson CatchingFishSnackbar2 = catchingFishFirebaseFABGson.CatchingFishSnackbar();
            int CatchingFishParcelableFAB4 = CatchingFishSnackbar2.CatchingFishParcelableFAB(16);
            if (CatchingFishParcelableFAB4 != 0) {
                int i8 = CatchingFishParcelableFAB4 + CatchingFishSnackbar2.CatchingFishReduxKtor;
                i3 = ((ByteBuffer) CatchingFishSnackbar2.CatchingFishViewModelScope).getInt(((ByteBuffer) CatchingFishSnackbar2.CatchingFishViewModelScope).getInt(i8) + i8);
            } else {
                i3 = 0;
            }
            CatchingFishHiltMVPToast.CatchingFishReduxKtor("invalid metadata codepoint length", i3 > 0);
            CatchingFishOkHttpXMLLayout catchingFishOkHttpXMLLayout = (CatchingFishOkHttpXMLLayout) this.CatchingFishWorkManager;
            CatchingFishManifestGson CatchingFishSnackbar3 = catchingFishFirebaseFABGson.CatchingFishSnackbar();
            int CatchingFishParcelableFAB5 = CatchingFishSnackbar3.CatchingFishParcelableFAB(16);
            if (CatchingFishParcelableFAB5 != 0) {
                int i9 = CatchingFishParcelableFAB5 + CatchingFishSnackbar3.CatchingFishReduxKtor;
                i4 = ((ByteBuffer) CatchingFishSnackbar3.CatchingFishViewModelScope).getInt(((ByteBuffer) CatchingFishSnackbar3.CatchingFishViewModelScope).getInt(i9) + i9);
            } else {
                i4 = 0;
            }
            catchingFishOkHttpXMLLayout.CatchingFishParcelableFAB(catchingFishFirebaseFABGson, 0, i4 - 1);
        }
    }

    public CatchingFishFluxFluxBundle(int i) {
        switch (i) {
            case CatchingFishMoshiSpannable.STRING_SET_FIELD_NUMBER /* 6 */:
                this.CatchingFishReduxKtor = new CatchingFishBundleAsyncTask(10);
                this.CatchingFishDaggerWebsocket = new CatchingFishGraphQLRealmFAB(0);
                this.CatchingFishWorkManager = new ArrayList();
                this.CatchingFishViewModelScope = new HashSet();
                break;
            case CatchingFishMoshiSpannable.DOUBLE_FIELD_NUMBER /* 7 */:
                this.CatchingFishViewModelScope = new ArrayDeque();
                this.CatchingFishDaggerWebsocket = new ArrayDeque();
                this.CatchingFishWorkManager = new ArrayDeque();
                break;
            case 9:
                this.CatchingFishReduxKtor = new ArrayList();
                this.CatchingFishDaggerWebsocket = new HashMap();
                this.CatchingFishWorkManager = new HashMap();
                break;
            case 16:
                this.CatchingFishViewModelScope = Collections.EMPTY_MAP;
                this.CatchingFishReduxKtor = "GET";
                this.CatchingFishWorkManager = new CatchingFishViewPagerMockk(12);
                break;
            case 19:
                this.CatchingFishReduxKtor = new CatchingFishCameraXRetrofit(0);
                this.CatchingFishDaggerWebsocket = new SparseArray();
                this.CatchingFishWorkManager = new CatchingFishLayoutMVVMFlux((Object) null);
                this.CatchingFishViewModelScope = new CatchingFishCameraXRetrofit(0);
                break;
            default:
                this.CatchingFishReduxKtor = null;
                this.CatchingFishDaggerWebsocket = null;
                this.CatchingFishWorkManager = null;
                this.CatchingFishViewModelScope = new ArrayDeque();
                break;
        }
    }
}
