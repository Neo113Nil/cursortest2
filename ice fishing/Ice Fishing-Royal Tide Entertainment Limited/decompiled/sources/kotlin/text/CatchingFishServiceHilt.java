package kotlin.text;

import android.content.ClipData;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.view.ContentInfo;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionMenuView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.adjust.sdk.ActivityHandler;
import com.adjust.sdk.GooglePlayInstallReferrerDetails;
import com.adjust.sdk.ILogger;
import com.adjust.sdk.InstallReferrerReadListener;
import com.adjust.sdk.OnGooglePlayInstallReferrerReadListener;
import com.adjust.sdk.ReferrerDetails;
import com.google.android.gms.common.ConnectionResult;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public class CatchingFishServiceHilt implements CatchingFishDaggerAdMob, CatchingFishFABGradleLayout, InstallReferrerReadListener, CatchingFishNavigationGson, CatchingFishLiveDataFlux, CatchingFishStripeAPIToast, CatchingFishGsonBundleMoshi, CatchingFishIntentReduxMVVM, CatchingFishLiveDataDagger, CatchingFishMVIGoogleMaps {
    public static volatile CatchingFishServiceHilt CatchingFishViewModelFAB;
    public static volatile CatchingFishServiceHilt CatchingFishWorkManager;
    public final Object CatchingFishDaggerWebsocket;
    public final /* synthetic */ int CatchingFishReduxKtor;
    public static final Object CatchingFishViewModelScope = new Object();
    public static final CatchingFishMoshiMockk CatchingFishLayout = new CatchingFishMoshiMockk(1);
    public static final CatchingFishExoPlayerMVP CatchingFishFragmentHandler = new CatchingFishExoPlayerMVP();

    public /* synthetic */ CatchingFishServiceHilt(int i, Object obj) {
        this.CatchingFishReduxKtor = i;
        this.CatchingFishDaggerWebsocket = obj;
    }

    public static CatchingFishServiceHilt CatchingFishDaggerHiltFAB() {
        if (CatchingFishViewModelFAB == null) {
            synchronized (CatchingFishViewModelScope) {
                try {
                    if (CatchingFishViewModelFAB == null) {
                        CatchingFishViewModelFAB = new CatchingFishServiceHilt(1);
                    }
                } finally {
                }
            }
        }
        CatchingFishServiceHilt catchingFishServiceHilt = CatchingFishViewModelFAB;
        CatchingFishToastHiltBundle.CatchingFishAnimationMockk(catchingFishServiceHilt);
        return catchingFishServiceHilt;
    }

    public CatchingFishViewJUnitJUnit CatchingFish(int i) {
        return null;
    }

    public void CatchingFishCardViewRealm(Context context, ServiceConnection serviceConnection) {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.CatchingFishDaggerWebsocket;
        if ((serviceConnection instanceof CatchingFishMockkFlux) || !concurrentHashMap.containsKey(serviceConnection)) {
            try {
                context.unbindService(serviceConnection);
            } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
            }
        } else {
            try {
                try {
                    context.unbindService((ServiceConnection) concurrentHashMap.get(serviceConnection));
                } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused2) {
                }
            } finally {
                concurrentHashMap.remove(serviceConnection);
            }
        }
    }

    public boolean CatchingFishCardViewView(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i, Executor executor) {
        boolean bindService;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.CatchingFishDaggerWebsocket;
        ComponentName component = intent.getComponent();
        if (component != null) {
            String packageName = component.getPackageName();
            "com.google.android.gms".equals(packageName);
            try {
                if ((CatchingFishHiltSnackbarMVP.CatchingFishParcelableFAB(context).CatchingFishParcelableFAB.getPackageManager().getApplicationInfo(packageName, 0).flags & 2097152) != 0) {
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (serviceConnection instanceof CatchingFishMockkFlux) {
            if (executor == null) {
                executor = null;
            }
            if (Build.VERSION.SDK_INT < 29 || executor == null) {
                return context.bindService(intent, serviceConnection, i);
            }
            bindService = context.bindService(intent, i, executor, serviceConnection);
            return bindService;
        }
        ServiceConnection serviceConnection2 = (ServiceConnection) concurrentHashMap.putIfAbsent(serviceConnection, serviceConnection);
        if (serviceConnection2 != null && serviceConnection != serviceConnection2) {
            String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", serviceConnection, str, intent.getAction());
        }
        if (executor == null) {
            executor = null;
        }
        try {
            boolean bindService2 = (Build.VERSION.SDK_INT < 29 || executor == null) ? context.bindService(intent, serviceConnection, i) : context.bindService(intent, i, executor, serviceConnection);
            if (bindService2) {
                return bindService2;
            }
            return false;
        } finally {
            concurrentHashMap.remove(serviceConnection, serviceConnection);
        }
    }

    @Override // kotlin.text.CatchingFishIntentReduxMVVM
    public ContentInfo CatchingFishCloudMessaging() {
        return (ContentInfo) this.CatchingFishDaggerWebsocket;
    }

    @Override // kotlin.text.CatchingFishStripeAPIToast
    public void CatchingFishCoroutine(CatchingFishSharedFlowAdMob catchingFishSharedFlowAdMob, CatchingFishKtorAdMob catchingFishKtorAdMob) {
        CatchingFishSpannableMockk catchingFishSpannableMockk = (CatchingFishSpannableMockk) this.CatchingFishDaggerWebsocket;
        Handler handler = catchingFishSpannableMockk.CatchingFishLayout;
        handler.removeCallbacksAndMessages(null);
        ArrayList arrayList = catchingFishSpannableMockk.CatchingFishCloudMessaging;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (catchingFishSharedFlowAdMob == ((CatchingFishMockkRetrofit) arrayList.get(i)).CatchingFishSnackbar) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        int i2 = i + 1;
        handler.postAtTime(new CatchingFishMVPSharedFlow(this, i2 < arrayList.size() ? (CatchingFishMockkRetrofit) arrayList.get(i2) : null, catchingFishKtorAdMob, catchingFishSharedFlowAdMob, 0), catchingFishSharedFlowAdMob, SystemClock.uptimeMillis() + 200);
    }

    public CatchingFishLayoutGlide CatchingFishCoroutineFlow(Class cls) {
        String str;
        CatchingFishAnimationIntent CatchingFishParcelableFAB = CatchingFishContextFlux.CatchingFishParcelableFAB(cls);
        CatchingFishFluxFluxBundle catchingFishFluxFluxBundle = (CatchingFishFluxFluxBundle) this.CatchingFishDaggerWebsocket;
        HashMap hashMap = CatchingFishAnimationIntent.CatchingFishCoroutine;
        Class cls2 = CatchingFishParcelableFAB.CatchingFishParcelableFAB;
        String str2 = null;
        if (!cls2.isAnonymousClass() && !cls2.isLocalClass()) {
            if (cls2.isArray()) {
                Class<?> componentType = cls2.getComponentType();
                if (componentType.isPrimitive() && (str = (String) hashMap.get(componentType.getName())) != null) {
                    str2 = str.concat("Array");
                }
                if (str2 == null) {
                    str2 = "kotlin.Array";
                }
            } else {
                str2 = (String) hashMap.get(cls2.getName());
                if (str2 == null) {
                    str2 = cls2.getCanonicalName();
                }
            }
        }
        if (str2 != null) {
            return catchingFishFluxFluxBundle.CatchingFishNavigation(CatchingFishParcelableFAB, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(str2));
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // kotlin.text.CatchingFishIntentReduxMVVM
    public int CatchingFishFragmentHandler() {
        int flags;
        flags = ((ContentInfo) this.CatchingFishDaggerWebsocket).getFlags();
        return flags;
    }

    public void CatchingFishGsonAppCompat(float f, float f2, long j) {
        CatchingFishOkHttpHandler CatchingFishCardViewView = ((CatchingFishAsyncTaskDagger) this.CatchingFishDaggerWebsocket).CatchingFishCardViewView();
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        CatchingFishCardViewView.CatchingFishViewModelFAB(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
        CatchingFishCardViewView.CatchingFishSnackbar(f, f2);
        CatchingFishCardViewView.CatchingFishViewModelFAB(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
    }

    public CatchingFishViewJUnitJUnit CatchingFishJetpackCompose(int i) {
        return null;
    }

    @Override // kotlin.text.CatchingFishStripeAPIToast
    public void CatchingFishLayout(CatchingFishSharedFlowAdMob catchingFishSharedFlowAdMob, MenuItem menuItem) {
        ((CatchingFishSpannableMockk) this.CatchingFishDaggerWebsocket).CatchingFishLayout.removeCallbacksAndMessages(catchingFishSharedFlowAdMob);
    }

    @Override // kotlin.text.CatchingFishGsonBundleMoshi
    public void CatchingFishOkHttp(Uri uri) {
        ((ContentInfo.Builder) this.CatchingFishDaggerWebsocket).setLinkUri(uri);
    }

    @Override // kotlin.text.CatchingFishLiveDataFlux
    public void CatchingFishParcelableFAB(ConnectionResult connectionResult) {
        com.google.android.gms.common.internal.CatchingFishPagingLibrary catchingFishPagingLibrary = (com.google.android.gms.common.internal.CatchingFishPagingLibrary) this.CatchingFishDaggerWebsocket;
        if (connectionResult.CatchingFishDaggerWebsocket == 0) {
            catchingFishPagingLibrary.CatchingFishViewModelFAB(null, catchingFishPagingLibrary.CatchingFishParcelableFlux);
            return;
        }
        CatchingFishEspressoPayPal catchingFishEspressoPayPal = catchingFishPagingLibrary.CatchingFishAnimationMockk;
        if (catchingFishEspressoPayPal != null) {
            ((CatchingFishHandlerBundle) catchingFishEspressoPayPal.CatchingFishDaggerWebsocket).CatchingFishDaggerWebsocket(connectionResult);
        }
    }

    public boolean CatchingFishParcelableFlux(int i, int i2, Bundle bundle) {
        return false;
    }

    public void CatchingFishPayPal(int i, Object obj, CatchingFishRoomHilt catchingFishRoomHilt) {
        CatchingFishViewSnackbar catchingFishViewSnackbar = (CatchingFishViewSnackbar) this.CatchingFishDaggerWebsocket;
        catchingFishViewSnackbar.CatchingFishSharedFlow(i, 3);
        catchingFishRoomHilt.CatchingFishDaggerWebsocket((CatchingFishGlideWebsocket) obj, catchingFishViewSnackbar.CatchingFishCoroutineFlow);
        catchingFishViewSnackbar.CatchingFishSharedFlow(i, 4);
    }

    @Override // kotlin.text.CatchingFishIntentReduxMVVM
    public ClipData CatchingFishReduxKtor() {
        ClipData clip;
        clip = ((ContentInfo) this.CatchingFishDaggerWebsocket).getClip();
        return clip;
    }

    @Override // kotlin.text.CatchingFishGsonBundleMoshi
    public void CatchingFishRoomDatabase(int i) {
        ((ContentInfo.Builder) this.CatchingFishDaggerWebsocket).setFlags(i);
    }

    @Override // kotlin.text.CatchingFishDaggerAdMob
    public void CatchingFishSnackbar(CatchingFishSharedFlowAdMob catchingFishSharedFlowAdMob, boolean z) {
        if (catchingFishSharedFlowAdMob instanceof CatchingFishGradleLifecycle) {
            ((CatchingFishGradleLifecycle) catchingFishSharedFlowAdMob).CatchingFishCardViewRealm.CatchingFishCloudMessaging().CatchingFishCoroutine(false);
        }
        CatchingFishDaggerAdMob catchingFishDaggerAdMob = ((CatchingFishToast) this.CatchingFishDaggerWebsocket).CatchingFishViewModelFAB;
        if (catchingFishDaggerAdMob != null) {
            catchingFishDaggerAdMob.CatchingFishSnackbar(catchingFishSharedFlowAdMob, z);
        }
    }

    public void CatchingFishSpannableWidget(float f, float f2, float f3, float f4) {
        CatchingFishAsyncTaskDagger catchingFishAsyncTaskDagger = (CatchingFishAsyncTaskDagger) this.CatchingFishDaggerWebsocket;
        CatchingFishOkHttpHandler CatchingFishCardViewView = catchingFishAsyncTaskDagger.CatchingFishCardViewView();
        float intBitsToFloat = Float.intBitsToFloat((int) (catchingFishAsyncTaskDagger.CatchingFishDagger() >> 32)) - (f3 + f);
        long floatToRawIntBits = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (catchingFishAsyncTaskDagger.CatchingFishDagger() & 4294967295L)) - (f4 + f2)) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
        if (!(Float.intBitsToFloat((int) (floatToRawIntBits >> 32)) >= 0.0f && Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L)) >= 0.0f)) {
            CatchingFishHiltFirebase.CatchingFishParcelableFAB("Width and height must be greater than or equal to zero");
        }
        catchingFishAsyncTaskDagger.CatchingFishCustomViewJUnit(floatToRawIntBits);
        CatchingFishCardViewView.CatchingFishViewModelFAB(f, f2);
    }

    @Override // kotlin.text.CatchingFishLiveDataDagger
    public CatchingFishKtorPicassoMVVM CatchingFishStateLiveData(View view, CatchingFishKtorPicassoMVVM catchingFishKtorPicassoMVVM) {
        CatchingFishFragmentHilt catchingFishFragmentHilt = catchingFishKtorPicassoMVVM.CatchingFishParcelableFAB;
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.CatchingFishDaggerWebsocket;
        if (!Objects.equals(coordinatorLayout.CatchingFishRoomDatabase, catchingFishKtorPicassoMVVM)) {
            coordinatorLayout.CatchingFishRoomDatabase = catchingFishKtorPicassoMVVM;
            boolean z = catchingFishKtorPicassoMVVM.CatchingFishReduxKtor() > 0;
            coordinatorLayout.CatchingFishNavigation = z;
            coordinatorLayout.setWillNotDraw(!z && coordinatorLayout.getBackground() == null);
            if (!catchingFishFragmentHilt.CatchingFish()) {
                int childCount = coordinatorLayout.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = coordinatorLayout.getChildAt(i);
                    WeakHashMap weakHashMap = CatchingFishFABCameraX.CatchingFishParcelableFAB;
                    if (childAt.getFitsSystemWindows() && ((CatchingFishMVPView) childAt.getLayoutParams()).CatchingFishParcelableFAB != null && catchingFishFragmentHilt.CatchingFish()) {
                        break;
                    }
                }
            }
            coordinatorLayout.requestLayout();
        }
        return catchingFishKtorPicassoMVVM;
    }

    @Override // kotlin.text.CatchingFishIntentReduxMVVM
    public int CatchingFishUnitTesting() {
        int source;
        source = ((ContentInfo) this.CatchingFishDaggerWebsocket).getSource();
        return source;
    }

    @Override // kotlin.text.CatchingFishFABGradleLayout
    public boolean CatchingFishViewModelFAB(CatchingFishSharedFlowAdMob catchingFishSharedFlowAdMob, MenuItem menuItem) {
        CatchingFishXMLLayoutGradle catchingFishXMLLayoutGradle = ((ActionMenuView) this.CatchingFishDaggerWebsocket).CatchingFishMVPRobolectric;
        if (catchingFishXMLLayoutGradle == null) {
            return false;
        }
        Iterator it = ((CopyOnWriteArrayList) ((CatchingFishFABPicasso) catchingFishXMLLayoutGradle).CatchingFishReduxKtor.CatchingFishEspressoMockk.CatchingFishViewModelScope).iterator();
        while (it.hasNext()) {
            if (((CatchingFishLiveDataToast) it.next()).CatchingFishParcelableFAB.CatchingFishAnimationMockk()) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlin.text.CatchingFishDaggerAdMob
    public boolean CatchingFishViewModelScope(CatchingFishSharedFlowAdMob catchingFishSharedFlowAdMob) {
        CatchingFishToast catchingFishToast = (CatchingFishToast) this.CatchingFishDaggerWebsocket;
        if (catchingFishSharedFlowAdMob == catchingFishToast.CatchingFishWorkManager) {
            return false;
        }
        ((CatchingFishGradleLifecycle) catchingFishSharedFlowAdMob).CatchingFishPayPal.getClass();
        catchingFishToast.getClass();
        CatchingFishDaggerAdMob catchingFishDaggerAdMob = catchingFishToast.CatchingFishViewModelFAB;
        if (catchingFishDaggerAdMob != null) {
            return catchingFishDaggerAdMob.CatchingFishViewModelScope(catchingFishSharedFlowAdMob);
        }
        return false;
    }

    @Override // kotlin.text.CatchingFishFABGradleLayout
    public void CatchingFishWorkManager(CatchingFishSharedFlowAdMob catchingFishSharedFlowAdMob) {
        CatchingFishFABPicasso catchingFishFABPicasso = ((ActionMenuView) this.CatchingFishDaggerWebsocket).CatchingFishParcelableFlux;
        if (catchingFishFABPicasso != null) {
            catchingFishFABPicasso.CatchingFishWorkManager(catchingFishSharedFlowAdMob);
        }
    }

    @Override // kotlin.text.CatchingFishGsonBundleMoshi
    public CatchingFishMVIOkHttp build() {
        ContentInfo build;
        build = ((ContentInfo.Builder) this.CatchingFishDaggerWebsocket).build();
        return new CatchingFishMVIOkHttp(new CatchingFishServiceHilt(build));
    }

    @Override // kotlin.text.CatchingFishHandlerMVP
    public Object get() {
        return new CatchingFishJUnitMVIService((Context) ((CatchingFishFABFlux) this.CatchingFishDaggerWebsocket).CatchingFishReduxKtor, new CatchingFishMoshiGson(), new CatchingFishExoPlayerMVP());
    }

    @Override // com.adjust.sdk.InstallReferrerReadListener
    public void onFail(String str) {
        ILogger iLogger;
        switch (this.CatchingFishReduxKtor) {
            case CatchingFishMoshiSpannable.DOUBLE_FIELD_NUMBER /* 7 */:
                iLogger = ((ActivityHandler) this.CatchingFishDaggerWebsocket).logger;
                iLogger.debug(str, new Object[0]);
                break;
            default:
                ((OnGooglePlayInstallReferrerReadListener) this.CatchingFishDaggerWebsocket).onFail(str);
                break;
        }
    }

    @Override // com.adjust.sdk.InstallReferrerReadListener
    public void onInstallReferrerRead(ReferrerDetails referrerDetails, String str) {
        switch (this.CatchingFishReduxKtor) {
            case CatchingFishMoshiSpannable.DOUBLE_FIELD_NUMBER /* 7 */:
                ((ActivityHandler) this.CatchingFishDaggerWebsocket).sendInstallReferrer(referrerDetails, str);
                break;
            default:
                ((OnGooglePlayInstallReferrerReadListener) this.CatchingFishDaggerWebsocket).onInstallReferrerRead(new GooglePlayInstallReferrerDetails(referrerDetails));
                break;
        }
    }

    @Override // kotlin.text.CatchingFishGsonBundleMoshi
    public void setExtras(Bundle bundle) {
        ((ContentInfo.Builder) this.CatchingFishDaggerWebsocket).setExtras(bundle);
    }

    public String toString() {
        switch (this.CatchingFishReduxKtor) {
            case 26:
                return "ContentInfoCompat{" + ((ContentInfo) this.CatchingFishDaggerWebsocket) + "}";
            default:
                return super.toString();
        }
    }

    public CatchingFishServiceHilt(com.google.android.gms.common.internal.CatchingFishPagingLibrary catchingFishPagingLibrary) {
        this.CatchingFishReduxKtor = 19;
        Objects.requireNonNull(catchingFishPagingLibrary);
        this.CatchingFishDaggerWebsocket = catchingFishPagingLibrary;
    }

    public CatchingFishServiceHilt(CatchingFishEspressoPayPal catchingFishEspressoPayPal, CatchingFishMVPExoPlayer catchingFishMVPExoPlayer) {
        this.CatchingFishReduxKtor = 12;
        this.CatchingFishDaggerWebsocket = catchingFishEspressoPayPal;
    }

    public CatchingFishServiceHilt(CatchingFishViewSnackbar catchingFishViewSnackbar) {
        this.CatchingFishReduxKtor = 22;
        CatchingFishFirebaseBundle.CatchingFishParcelableFAB(catchingFishViewSnackbar, "output");
        this.CatchingFishDaggerWebsocket = catchingFishViewSnackbar;
        catchingFishViewSnackbar.CatchingFishCoroutineFlow = this;
    }

    public CatchingFishServiceHilt(int i) {
        CatchingFishIntentFluxAdMob catchingFishIntentFluxAdMob;
        this.CatchingFishReduxKtor = i;
        switch (i) {
            case 1:
                this.CatchingFishDaggerWebsocket = new ConcurrentHashMap();
                break;
            case 2:
                CatchingFishCoroutineHilt catchingFishCoroutineHilt = CatchingFishCoroutineHilt.CatchingFishCoroutine;
                try {
                    catchingFishIntentFluxAdMob = (CatchingFishIntentFluxAdMob) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
                } catch (Exception unused) {
                    catchingFishIntentFluxAdMob = CatchingFishLayout;
                }
                CatchingFishIntentFluxAdMob[] catchingFishIntentFluxAdMobArr = {CatchingFishMoshiMockk.CatchingFishSnackbar, catchingFishIntentFluxAdMob};
                CatchingFishToastGlide catchingFishToastGlide = new CatchingFishToastGlide();
                catchingFishToastGlide.CatchingFishParcelableFAB = catchingFishIntentFluxAdMobArr;
                Charset charset = CatchingFishFirebaseBundle.CatchingFishParcelableFAB;
                this.CatchingFishDaggerWebsocket = catchingFishToastGlide;
                break;
            case 4:
                if (Build.VERSION.SDK_INT >= 26) {
                    this.CatchingFishDaggerWebsocket = new CatchingFishOkHttpBiometric(this);
                    break;
                } else {
                    this.CatchingFishDaggerWebsocket = new CatchingFishLiveData(this);
                    break;
                }
            case 16:
                this.CatchingFishDaggerWebsocket = new AtomicInteger(0);
                break;
            case 17:
                this.CatchingFishDaggerWebsocket = new AtomicReference(null);
                break;
            case 24:
                TimeUnit timeUnit = TimeUnit.MINUTES;
                this.CatchingFishDaggerWebsocket = new CatchingFishWidgetViewModel();
                break;
            default:
                this.CatchingFishDaggerWebsocket = new HashSet();
                break;
        }
    }

    public CatchingFishServiceHilt(boolean z) {
        this.CatchingFishReduxKtor = 15;
        this.CatchingFishDaggerWebsocket = new AtomicBoolean(z);
    }

    public CatchingFishServiceHilt(CatchingFishManifestService catchingFishManifestService, CatchingFishManifestOkHttp catchingFishManifestOkHttp) {
        this.CatchingFishReduxKtor = 3;
        CatchingFishFirebaseDagger.CatchingFishNavigation(catchingFishManifestService, "store");
        CatchingFishMoshiStateFlow catchingFishMoshiStateFlow = CatchingFishMoshiStateFlow.CatchingFishSnackbar;
        CatchingFishFirebaseDagger.CatchingFishNavigation(catchingFishMoshiStateFlow, "defaultCreationExtras");
        this.CatchingFishDaggerWebsocket = new CatchingFishFluxFluxBundle(catchingFishManifestService, catchingFishManifestOkHttp, catchingFishMoshiStateFlow);
    }

    public CatchingFishServiceHilt(ContentInfo contentInfo) {
        this.CatchingFishReduxKtor = 26;
        contentInfo.getClass();
        this.CatchingFishDaggerWebsocket = CatchingFishHiltMoshi.CatchingFishCloudMessaging(contentInfo);
    }

    public CatchingFishServiceHilt(ClipData clipData, int i) {
        this.CatchingFishReduxKtor = 25;
        this.CatchingFishDaggerWebsocket = CatchingFishHiltMoshi.CatchingFishLayout(clipData, i);
    }

    public void CatchingFishDaggerWebsocket(int i) {
    }

    public void CatchingFishEspressoTesting(int i) {
    }

    public void CatchingFishAnimationMockk(int i, float f) {
    }

    public void CatchingFishNavigation(int i, CatchingFishViewJUnitJUnit catchingFishViewJUnitJUnit, String str, Bundle bundle) {
    }
}
