package com.catchingfish.fishcatcherpro.presentation.launch;

import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import androidx.activity.ComponentActivity;
import com.adjust.sdk.Adjust;
import com.adjust.sdk.AdjustConfig;
import com.adjust.sdk.LogLevel;
import com.android.installreferrer.api.InstallReferrerClient;
import com.catchingfish.fishcatcherpro.presentation.launch.MainActivity;
import java.security.SecureRandom;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.text.CatchingFishAdMobAnimation;
import kotlin.text.CatchingFishAdMobFAB;
import kotlin.text.CatchingFishAppCompatDagger;
import kotlin.text.CatchingFishAppCompatMoshi;
import kotlin.text.CatchingFishAsyncTaskDagger;
import kotlin.text.CatchingFishBundleGlide;
import kotlin.text.CatchingFishBundleKtor;
import kotlin.text.CatchingFishBundleMoshiMVVM;
import kotlin.text.CatchingFishContextPayPal;
import kotlin.text.CatchingFishDaggerBiometric;
import kotlin.text.CatchingFishDaggerToast;
import kotlin.text.CatchingFishEspressoDagger;
import kotlin.text.CatchingFishEspressoPayPal;
import kotlin.text.CatchingFishFABCardView;
import kotlin.text.CatchingFishFABLayout;
import kotlin.text.CatchingFishFirebaseDagger;
import kotlin.text.CatchingFishFluxFluxBundle;
import kotlin.text.CatchingFishFluxMVPToast;
import kotlin.text.CatchingFishFluxPicasso;
import kotlin.text.CatchingFishFluxViewModel;
import kotlin.text.CatchingFishGlideGson;
import kotlin.text.CatchingFishGlideLiveData;
import kotlin.text.CatchingFishGoogleMapsHilt;
import kotlin.text.CatchingFishGradleMVVM;
import kotlin.text.CatchingFishGraphQLIntent;
import kotlin.text.CatchingFishHiltManifest;
import kotlin.text.CatchingFishHiltRealm;
import kotlin.text.CatchingFishJUnitAsyncTask;
import kotlin.text.CatchingFishLiveDataWidget;
import kotlin.text.CatchingFishMVIFABLayout;
import kotlin.text.CatchingFishMVPExoPlayer;
import kotlin.text.CatchingFishMVPMVPViewModel;
import kotlin.text.CatchingFishMVVMIntentGson;
import kotlin.text.CatchingFishManifestMVI;
import kotlin.text.CatchingFishMockkCustomView;
import kotlin.text.CatchingFishMoshiAsyncTask;
import kotlin.text.CatchingFishMoshiContext;
import kotlin.text.CatchingFishMoshiFABMVVM;
import kotlin.text.CatchingFishMoshiFluxMoshi;
import kotlin.text.CatchingFishMoshiLiveData;
import kotlin.text.CatchingFishMoshiMVP;
import kotlin.text.CatchingFishPayPalLayout;
import kotlin.text.CatchingFishPayPalOkHttp;
import kotlin.text.CatchingFishPayPalToast;
import kotlin.text.CatchingFishRealmLiveData;
import kotlin.text.CatchingFishSensorManager;
import kotlin.text.CatchingFishServiceHilt;
import kotlin.text.CatchingFishToastGradle;
import kotlin.text.CatchingFishToolbarMVVM;
import kotlin.text.CatchingFishToolbarToast;
import kotlin.text.CatchingFishViewMockkFlux;
import kotlin.text.CatchingFishViewModelIntent;
import kotlin.text.CatchingFishViewPagerMockk;
import kotlin.text.CatchingFishViewRetrofit;
import kotlin.text.CatchingFishWidgetContext;
import kotlin.text.CatchingFishWidgetLayout;
import kotlin.text.CatchingFishWidgetMVVMAdMob;
import kotlin.text.CatchingFishXMLLayoutGlide;
import kotlin.text.CatchingFishXMLLayoutToast;

/* loaded from: classes.dex */
public final class MainActivity extends ComponentActivity {
    public static final /* synthetic */ int CatchingFishHandler = 0;
    public final CatchingFishMoshiFABMVVM CatchingFishCameraXIntent;
    public CatchingFishLiveDataWidget CatchingFishCustomView;
    public final CatchingFishMoshiFABMVVM CatchingFishDagger;
    public final CatchingFishMoshiFABMVVM CatchingFishEspressoMockk;
    public CatchingFishMVPExoPlayer CatchingFishFragmentFactory;
    public CatchingFishViewMockkFlux CatchingFishJobScheduler;
    public final CatchingFishFluxFluxBundle CatchingFishMVPRobolectric;
    public CatchingFishManifestMVI CatchingFishMutableLiveData;
    public CatchingFishHiltRealm CatchingFishPayPalService;
    public CatchingFishToolbarMVVM CatchingFishSensorManager;
    public final CatchingFishBundleGlide CatchingFishGsonAppCompat = new CatchingFishBundleGlide(28);
    public final CatchingFishEspressoPayPal CatchingFishCardViewRealm = new CatchingFishEspressoPayPal(15, false);
    public final CatchingFishEspressoPayPal CatchingFishPayPal = new CatchingFishEspressoPayPal(1);
    public final CatchingFishBundleGlide CatchingFishCardViewView = new CatchingFishBundleGlide(20, false);

    public MainActivity() {
        CatchingFishFluxPicasso catchingFishFluxPicasso = new CatchingFishFluxPicasso(1, this);
        CatchingFishFluxFluxBundle catchingFishFluxFluxBundle = new CatchingFishFluxFluxBundle();
        catchingFishFluxFluxBundle.CatchingFishReduxKtor = this;
        catchingFishFluxFluxBundle.CatchingFishDaggerWebsocket = catchingFishFluxPicasso;
        this.CatchingFishMVPRobolectric = catchingFishFluxFluxBundle;
        final int i = 0;
        this.CatchingFishEspressoMockk = CatchingFishCloudMessaging(new CatchingFishBundleKtor(this) { // from class: kotlin.text.CatchingFishMockkGoogleMaps
            public final /* synthetic */ MainActivity CatchingFishSnackbar;

            {
                this.CatchingFishSnackbar = this;
            }

            @Override // kotlin.text.CatchingFishBundleKtor
            public final void CatchingFishParcelableFAB(Object obj) {
                int i2 = i;
                MainActivity mainActivity = this.CatchingFishSnackbar;
                switch (i2) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        ((Boolean) obj).getClass();
                        CatchingFishLiveDataWidget catchingFishLiveDataWidget = mainActivity.CatchingFishCustomView;
                        if (catchingFishLiveDataWidget != null) {
                            CatchingFishXMLLayoutGlide.CatchingFishGsonAppCompat(catchingFishLiveDataWidget.CatchingFishParcelableFAB, null, new CatchingFishMVVMReduxMVI(catchingFishLiveDataWidget, null), 3);
                            return;
                        } else {
                            CatchingFishFirebaseDagger.CatchingFishDataStoreIntent("launchFlowCoordinator");
                            throw null;
                        }
                    case 1:
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        CatchingFishFluxFluxBundle catchingFishFluxFluxBundle2 = mainActivity.CatchingFishMVPRobolectric;
                        PermissionRequest permissionRequest = (PermissionRequest) catchingFishFluxFluxBundle2.CatchingFishWorkManager;
                        if (booleanValue && permissionRequest != null) {
                            permissionRequest.grant(permissionRequest.getResources());
                        }
                        catchingFishFluxFluxBundle2.CatchingFishWorkManager = null;
                        return;
                    default:
                        CatchingFishToolbar catchingFishToolbar = (CatchingFishToolbar) obj;
                        int i3 = MainActivity.CatchingFishHandler;
                        CatchingFishFirebaseDagger.CatchingFishNavigation(catchingFishToolbar, "result");
                        CatchingFishBundleGlide catchingFishBundleGlide = mainActivity.CatchingFishCardViewView;
                        int i4 = catchingFishToolbar.CatchingFishReduxKtor;
                        Intent intent = catchingFishToolbar.CatchingFishDaggerWebsocket;
                        catchingFishBundleGlide.getClass();
                        Uri[] parseResult = WebChromeClient.FileChooserParams.parseResult(i4, intent);
                        ValueCallback valueCallback = (ValueCallback) catchingFishBundleGlide.CatchingFishDaggerWebsocket;
                        if (valueCallback != null) {
                            valueCallback.onReceiveValue(parseResult);
                        }
                        catchingFishBundleGlide.CatchingFishDaggerWebsocket = null;
                        return;
                }
            }
        }, new CatchingFishMVIFABLayout(1));
        final int i2 = 1;
        this.CatchingFishDagger = CatchingFishCloudMessaging(new CatchingFishBundleKtor(this) { // from class: kotlin.text.CatchingFishMockkGoogleMaps
            public final /* synthetic */ MainActivity CatchingFishSnackbar;

            {
                this.CatchingFishSnackbar = this;
            }

            @Override // kotlin.text.CatchingFishBundleKtor
            public final void CatchingFishParcelableFAB(Object obj) {
                int i22 = i2;
                MainActivity mainActivity = this.CatchingFishSnackbar;
                switch (i22) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        ((Boolean) obj).getClass();
                        CatchingFishLiveDataWidget catchingFishLiveDataWidget = mainActivity.CatchingFishCustomView;
                        if (catchingFishLiveDataWidget != null) {
                            CatchingFishXMLLayoutGlide.CatchingFishGsonAppCompat(catchingFishLiveDataWidget.CatchingFishParcelableFAB, null, new CatchingFishMVVMReduxMVI(catchingFishLiveDataWidget, null), 3);
                            return;
                        } else {
                            CatchingFishFirebaseDagger.CatchingFishDataStoreIntent("launchFlowCoordinator");
                            throw null;
                        }
                    case 1:
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        CatchingFishFluxFluxBundle catchingFishFluxFluxBundle2 = mainActivity.CatchingFishMVPRobolectric;
                        PermissionRequest permissionRequest = (PermissionRequest) catchingFishFluxFluxBundle2.CatchingFishWorkManager;
                        if (booleanValue && permissionRequest != null) {
                            permissionRequest.grant(permissionRequest.getResources());
                        }
                        catchingFishFluxFluxBundle2.CatchingFishWorkManager = null;
                        return;
                    default:
                        CatchingFishToolbar catchingFishToolbar = (CatchingFishToolbar) obj;
                        int i3 = MainActivity.CatchingFishHandler;
                        CatchingFishFirebaseDagger.CatchingFishNavigation(catchingFishToolbar, "result");
                        CatchingFishBundleGlide catchingFishBundleGlide = mainActivity.CatchingFishCardViewView;
                        int i4 = catchingFishToolbar.CatchingFishReduxKtor;
                        Intent intent = catchingFishToolbar.CatchingFishDaggerWebsocket;
                        catchingFishBundleGlide.getClass();
                        Uri[] parseResult = WebChromeClient.FileChooserParams.parseResult(i4, intent);
                        ValueCallback valueCallback = (ValueCallback) catchingFishBundleGlide.CatchingFishDaggerWebsocket;
                        if (valueCallback != null) {
                            valueCallback.onReceiveValue(parseResult);
                        }
                        catchingFishBundleGlide.CatchingFishDaggerWebsocket = null;
                        return;
                }
            }
        }, new CatchingFishMVIFABLayout(1));
        final int i3 = 2;
        this.CatchingFishCameraXIntent = CatchingFishCloudMessaging(new CatchingFishBundleKtor(this) { // from class: kotlin.text.CatchingFishMockkGoogleMaps
            public final /* synthetic */ MainActivity CatchingFishSnackbar;

            {
                this.CatchingFishSnackbar = this;
            }

            @Override // kotlin.text.CatchingFishBundleKtor
            public final void CatchingFishParcelableFAB(Object obj) {
                int i22 = i3;
                MainActivity mainActivity = this.CatchingFishSnackbar;
                switch (i22) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        ((Boolean) obj).getClass();
                        CatchingFishLiveDataWidget catchingFishLiveDataWidget = mainActivity.CatchingFishCustomView;
                        if (catchingFishLiveDataWidget != null) {
                            CatchingFishXMLLayoutGlide.CatchingFishGsonAppCompat(catchingFishLiveDataWidget.CatchingFishParcelableFAB, null, new CatchingFishMVVMReduxMVI(catchingFishLiveDataWidget, null), 3);
                            return;
                        } else {
                            CatchingFishFirebaseDagger.CatchingFishDataStoreIntent("launchFlowCoordinator");
                            throw null;
                        }
                    case 1:
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        CatchingFishFluxFluxBundle catchingFishFluxFluxBundle2 = mainActivity.CatchingFishMVPRobolectric;
                        PermissionRequest permissionRequest = (PermissionRequest) catchingFishFluxFluxBundle2.CatchingFishWorkManager;
                        if (booleanValue && permissionRequest != null) {
                            permissionRequest.grant(permissionRequest.getResources());
                        }
                        catchingFishFluxFluxBundle2.CatchingFishWorkManager = null;
                        return;
                    default:
                        CatchingFishToolbar catchingFishToolbar = (CatchingFishToolbar) obj;
                        int i32 = MainActivity.CatchingFishHandler;
                        CatchingFishFirebaseDagger.CatchingFishNavigation(catchingFishToolbar, "result");
                        CatchingFishBundleGlide catchingFishBundleGlide = mainActivity.CatchingFishCardViewView;
                        int i4 = catchingFishToolbar.CatchingFishReduxKtor;
                        Intent intent = catchingFishToolbar.CatchingFishDaggerWebsocket;
                        catchingFishBundleGlide.getClass();
                        Uri[] parseResult = WebChromeClient.FileChooserParams.parseResult(i4, intent);
                        ValueCallback valueCallback = (ValueCallback) catchingFishBundleGlide.CatchingFishDaggerWebsocket;
                        if (valueCallback != null) {
                            valueCallback.onReceiveValue(parseResult);
                        }
                        catchingFishBundleGlide.CatchingFishDaggerWebsocket = null;
                        return;
                }
            }
        }, new CatchingFishMVIFABLayout(2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0252, code lost:
    
        r2.run();
        r2 = getWindow();
        kotlin.text.CatchingFishFirebaseDagger.CatchingFishRoomDatabase(r2, "getWindow(...)");
        r1.CatchingFishParcelableFAB(r2);
        r2 = new kotlin.text.CatchingFishLifecycleRedux(-1488468870, new kotlin.text.CatchingFishFABParcelable(r6, r25), true);
        r0 = kotlin.text.CatchingFishNavigationMVI.CatchingFishParcelableFAB;
        r0 = ((android.view.ViewGroup) getWindow().getDecorView().findViewById(android.R.id.content)).getChildAt(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0287, code lost:
    
        if ((r0 instanceof kotlin.text.CatchingFishDaggerCoroutine) == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0289, code lost:
    
        r0 = (kotlin.text.CatchingFishDaggerCoroutine) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x028d, code lost:
    
        if (r0 == null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x028f, code lost:
    
        r0.setParentCompositionContext(null);
        r0.setContent(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x02e8, code lost:
    
        kotlin.text.CatchingFishDaggerBiometric.CatchingFishReduxKtor(CatchingFishLayout(), r25, new kotlin.text.CatchingFishFragmentFactory(7, r25));
        r14 = r25.CatchingFishMutableLiveData;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x02f7, code lost:
    
        if (r14 == null) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x02f9, code lost:
    
        r0 = new kotlin.text.CatchingFishFABCardView(new kotlin.text.CatchingFishPayPalToast(1, r14, kotlin.text.CatchingFishManifestMVI.class, "prepareSession", "prepareSession(Landroidx/browser/customtabs/CustomTabsClient;)V", 0, 0, 0), new kotlin.text.CatchingFishMVINavigation(r14, r9));
        r2 = r14.CatchingFishParcelableFAB;
        r0.CatchingFishParcelableFAB = r2.getApplicationContext();
        r3 = new android.content.Intent("android.support.customtabs.action.CustomTabsService");
        r3.setPackage("com.android.chrome");
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x032f, code lost:
    
        if (r2.bindService(r3, r0, 33) == false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0331, code lost:
    
        r14.CatchingFishViewModelScope = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0333, code lost:
    
        getWindow().getDecorView().post(new kotlin.text.CatchingFishMVPLayout(12, r25));
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0345, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0346, code lost:
    
        kotlin.text.CatchingFishFirebaseDagger.CatchingFishDataStoreIntent("customTabsCoordinator");
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0349, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0296, code lost:
    
        r0 = new kotlin.text.CatchingFishDaggerCoroutine(r25);
        r0.setParentCompositionContext(null);
        r0.setContent(r2);
        r2 = getWindow().getDecorView();
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x02ad, code lost:
    
        if (kotlin.text.CatchingFishHiltMVPToast.CatchingFishOkHttp(r2) != null) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x02af, code lost:
    
        kotlin.text.CatchingFishHiltMVPToast.CatchingFishFragmentFactory(r2, r25);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x02b2, code lost:
    
        r3 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x02b6, code lost:
    
        if (r3 == null) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x02b8, code lost:
    
        r5 = r3.getTag(com.catchingfish.fishcatcherpro.R.id.view_tree_view_model_store_owner);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x02be, code lost:
    
        if ((r5 instanceof kotlin.text.CatchingFishDataStoreFlux) == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x02c0, code lost:
    
        r5 = (kotlin.text.CatchingFishDataStoreFlux) r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x02c4, code lost:
    
        if (r5 == null) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x02c7, code lost:
    
        r3 = kotlin.text.CatchingFishLayoutRoom.CatchingFishStateLiveData(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x02cd, code lost:
    
        if ((r3 instanceof android.view.View) == false) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x02d2, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x02cf, code lost:
    
        r3 = (android.view.View) r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x02d5, code lost:
    
        if (r5 != null) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x02d7, code lost:
    
        r2.setTag(com.catchingfish.fishcatcherpro.R.id.view_tree_view_model_store_owner, r25);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x02de, code lost:
    
        if (kotlin.text.CatchingFishOkHttpFAB.CatchingFishDaggerHiltFAB(r2) != null) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x02e0, code lost:
    
        kotlin.text.CatchingFishOkHttpFAB.CatchingFishRecyclerView(r2, r25);
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x02e3, code lost:
    
        setContentView(r0, kotlin.text.CatchingFishNavigationMVI.CatchingFishParcelableFAB);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x02c3, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x02d4, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x028c, code lost:
    
        r0 = null;
     */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCreate(Bundle bundle) {
        CatchingFishGlideLiveData catchingFishGlideLiveData;
        CatchingFishAsyncTaskDagger catchingFishAsyncTaskDagger;
        super.onCreate(bundle);
        CatchingFishViewPagerMockk catchingFishViewPagerMockk = CatchingFishAdMobFAB.CatchingFishGsonAppCompat(this).CatchingFishSnackbar;
        catchingFishViewPagerMockk.getClass();
        CatchingFishFluxFluxBundle catchingFishFluxFluxBundle = (CatchingFishFluxFluxBundle) catchingFishViewPagerMockk.CatchingFishDaggerWebsocket;
        CatchingFishMVVMIntentGson CatchingFishCardViewView = catchingFishFluxFluxBundle.CatchingFishCardViewView();
        int i = 0;
        SharedPreferences sharedPreferences = getSharedPreferences(getPackageName(), 0);
        CatchingFishFirebaseDagger.CatchingFishAnimationMockk(sharedPreferences);
        CatchingFishMVPMVPViewModel catchingFishMVPMVPViewModel = new CatchingFishMVPMVPViewModel(sharedPreferences);
        CatchingFishFABLayout catchingFishFABLayout = new CatchingFishFABLayout(new CatchingFishBundleGlide(this, CatchingFishCardViewView.CatchingFishParcelableFAB, new CatchingFishWidgetContext()), new CatchingFishMVPExoPlayer(19), new CatchingFishServiceHilt(10, this), new CatchingFishMoshiFluxMoshi(11));
        CatchingFishWidgetContext catchingFishWidgetContext = new CatchingFishWidgetContext(new CatchingFishMVPExoPlayer(20));
        CatchingFishServiceHilt catchingFishServiceHilt = new CatchingFishServiceHilt(new CatchingFishEspressoPayPal(4, new SecureRandom()), new CatchingFishMVPExoPlayer(23));
        CatchingFishAppCompatMoshi catchingFishAppCompatMoshi = new CatchingFishAppCompatMoshi();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        byte[] bArr = CatchingFishEspressoDagger.CatchingFishParcelableFAB;
        if (timeUnit == null) {
            throw new NullPointerException("unit == null");
        }
        long millis = timeUnit.toMillis(5L);
        if (millis > 2147483647L) {
            throw new IllegalArgumentException("timeout too large.");
        }
        if (millis == 0) {
            throw new IllegalArgumentException("timeout too small.");
        }
        catchingFishAppCompatMoshi.CatchingFishCoroutineFlow = (int) millis;
        CatchingFishHiltManifest catchingFishHiltManifest = new CatchingFishHiltManifest(new CatchingFishMoshiMVP(catchingFishAppCompatMoshi), CatchingFishCardViewView.CatchingFishSnackbar);
        CatchingFishJUnitAsyncTask catchingFishJUnitAsyncTask = new CatchingFishJUnitAsyncTask(catchingFishMVPMVPViewModel);
        CatchingFishGlideGson catchingFishGlideGson = CatchingFishGoogleMapsHilt.CatchingFishParcelableFAB;
        CatchingFishSensorManager catchingFishSensorManager = new CatchingFishSensorManager(catchingFishFABLayout, catchingFishFluxFluxBundle, catchingFishWidgetContext, catchingFishServiceHilt, (CatchingFishToastGradle) CatchingFishViewRetrofit.CatchingFishWorkManager);
        CatchingFishJUnitAsyncTask catchingFishJUnitAsyncTask2 = new CatchingFishJUnitAsyncTask(catchingFishMVPMVPViewModel);
        CatchingFishPayPalToast catchingFishPayPalToast = new CatchingFishPayPalToast(1, this.CatchingFishDagger, CatchingFishMoshiFABMVVM.class, "launch", "launch(Ljava/lang/Object;)V", 0, 0, 3);
        CatchingFishFluxFluxBundle catchingFishFluxFluxBundle2 = this.CatchingFishMVPRobolectric;
        catchingFishFluxFluxBundle2.getClass();
        catchingFishFluxFluxBundle2.CatchingFishViewModelScope = catchingFishPayPalToast;
        CatchingFishPayPalToast catchingFishPayPalToast2 = new CatchingFishPayPalToast(1, this.CatchingFishCameraXIntent, CatchingFishMoshiFABMVVM.class, "launch", "launch(Ljava/lang/Object;)V", 0, 0, 4);
        CatchingFishBundleGlide catchingFishBundleGlide = this.CatchingFishCardViewView;
        catchingFishBundleGlide.getClass();
        catchingFishBundleGlide.CatchingFishWorkManager = catchingFishPayPalToast2;
        CatchingFishBundleMoshiMVVM catchingFishBundleMoshiMVVM = new CatchingFishBundleMoshiMVVM(this);
        this.CatchingFishMutableLiveData = new CatchingFishManifestMVI(this, catchingFishBundleMoshiMVVM);
        new CatchingFishGradleMVVM(23);
        new CatchingFishMoshiFluxMoshi(23);
        CatchingFishMoshiAsyncTask catchingFishMoshiAsyncTask = new CatchingFishMoshiAsyncTask();
        CatchingFishManifestMVI catchingFishManifestMVI = this.CatchingFishMutableLiveData;
        if (catchingFishManifestMVI == null) {
            CatchingFishFirebaseDagger.CatchingFishDataStoreIntent("customTabsCoordinator");
            throw null;
        }
        CatchingFishViewModelIntent catchingFishViewModelIntent = new CatchingFishViewModelIntent(catchingFishMoshiAsyncTask, catchingFishManifestMVI, catchingFishBundleMoshiMVVM);
        this.CatchingFishJobScheduler = new CatchingFishViewMockkFlux();
        this.CatchingFishPayPalService = new CatchingFishHiltRealm(catchingFishViewModelIntent);
        CatchingFishViewMockkFlux catchingFishViewMockkFlux = this.CatchingFishJobScheduler;
        if (catchingFishViewMockkFlux == null) {
            CatchingFishFirebaseDagger.CatchingFishDataStoreIntent("webViewConfigurator");
            throw null;
        }
        this.CatchingFishSensorManager = new CatchingFishToolbarMVVM(this, this.CatchingFishGsonAppCompat, this.CatchingFishCardViewRealm, catchingFishViewMockkFlux, catchingFishViewModelIntent, this.CatchingFishMVPRobolectric, this.CatchingFishCardViewView);
        CatchingFishAsyncTaskDagger catchingFishAsyncTaskDagger2 = new CatchingFishAsyncTaskDagger(this, this.CatchingFishGsonAppCompat, this.CatchingFishPayPal);
        CatchingFishToolbarToast catchingFishToolbarToast = this.CatchingFishReduxKtor;
        CatchingFishFirebaseDagger.CatchingFishNavigation(catchingFishToolbarToast, "<this>");
        CatchingFishServiceHilt catchingFishServiceHilt2 = catchingFishToolbarToast.CatchingFishParcelableFAB;
        loop0: while (true) {
            catchingFishGlideLiveData = (CatchingFishGlideLiveData) ((AtomicReference) catchingFishServiceHilt2.CatchingFishDaggerWebsocket).get();
            if (catchingFishGlideLiveData == null) {
                CatchingFishDaggerToast catchingFishDaggerToast = new CatchingFishDaggerToast(null);
                CatchingFishGlideGson catchingFishGlideGson2 = CatchingFishGoogleMapsHilt.CatchingFishParcelableFAB;
                catchingFishGlideLiveData = new CatchingFishGlideLiveData(catchingFishToolbarToast, CatchingFishAdMobFAB.CatchingFishMutableLiveData(catchingFishDaggerToast, CatchingFishPayPalLayout.CatchingFishParcelableFAB.CatchingFishLayout));
                AtomicReference atomicReference = (AtomicReference) catchingFishServiceHilt2.CatchingFishDaggerWebsocket;
                while (!atomicReference.compareAndSet(null, catchingFishGlideLiveData)) {
                    catchingFishAsyncTaskDagger = catchingFishAsyncTaskDagger2;
                    if (atomicReference.get() != null) {
                        break;
                    } else {
                        catchingFishAsyncTaskDagger2 = catchingFishAsyncTaskDagger;
                    }
                }
                CatchingFishGlideGson catchingFishGlideGson3 = CatchingFishGoogleMapsHilt.CatchingFishParcelableFAB;
                CatchingFishXMLLayoutGlide.CatchingFishGsonAppCompat(catchingFishGlideLiveData, CatchingFishPayPalLayout.CatchingFishParcelableFAB.CatchingFishLayout, new CatchingFishXMLLayoutToast(catchingFishGlideLiveData, null), 2);
                break loop0;
            }
            break;
            catchingFishAsyncTaskDagger2 = catchingFishAsyncTaskDagger;
        }
        this.CatchingFishCustomView = new CatchingFishLiveDataWidget(catchingFishGlideLiveData, catchingFishJUnitAsyncTask, catchingFishSensorManager, catchingFishJUnitAsyncTask2, catchingFishHiltManifest, catchingFishAsyncTaskDagger2);
        String str = CatchingFishCardViewView.CatchingFishReduxKtor;
        this.CatchingFishFragmentFactory = new CatchingFishMVPExoPlayer(this, str);
        AdjustConfig adjustConfig = new AdjustConfig(this, str, AdjustConfig.ENVIRONMENT_PRODUCTION);
        adjustConfig.setLogLevel(LogLevel.VERBOSE);
        Adjust.initSdk(adjustConfig);
        int i2 = 29;
        CatchingFishGraphQLIntent catchingFishGraphQLIntent = new CatchingFishGraphQLIntent(0, 0, new CatchingFishPayPalOkHttp(i2));
        CatchingFishGraphQLIntent catchingFishGraphQLIntent2 = new CatchingFishGraphQLIntent(CatchingFishRealmLiveData.CatchingFishParcelableFAB, CatchingFishRealmLiveData.CatchingFishSnackbar, new CatchingFishPayPalOkHttp(i2));
        View decorView = getWindow().getDecorView();
        CatchingFishFirebaseDagger.CatchingFishRoomDatabase(decorView, "getDecorView(...)");
        CatchingFishAppCompatDagger catchingFishAppCompatDagger = CatchingFishRealmLiveData.CatchingFishCoroutine;
        if (catchingFishAppCompatDagger == null) {
            int i3 = Build.VERSION.SDK_INT;
            catchingFishAppCompatDagger = i3 >= 35 ? new CatchingFishContextPayPal() : i3 >= 30 ? new CatchingFishAdMobAnimation() : i3 >= 29 ? new CatchingFishFluxViewModel() : i3 >= 28 ? new CatchingFishWidgetLayout() : i3 >= 26 ? new CatchingFishMockkCustomView() : new CatchingFishMoshiLiveData();
            CatchingFishRealmLiveData.CatchingFishCoroutine = catchingFishAppCompatDagger;
        }
        CatchingFishAppCompatDagger catchingFishAppCompatDagger2 = catchingFishAppCompatDagger;
        CatchingFishFluxMVPToast catchingFishFluxMVPToast = new CatchingFishFluxMVPToast(catchingFishAppCompatDagger2, catchingFishGraphQLIntent, catchingFishGraphQLIntent2, this, decorView);
        ViewGroup viewGroup = (ViewGroup) decorView;
        int i4 = 0;
        while (true) {
            int i5 = 1;
            if (i4 >= viewGroup.getChildCount()) {
                CatchingFishMoshiContext catchingFishMoshiContext = new CatchingFishMoshiContext(catchingFishFluxMVPToast, viewGroup.getContext());
                catchingFishMoshiContext.setTag(catchingFishAppCompatDagger2);
                catchingFishMoshiContext.setVisibility(8);
                catchingFishMoshiContext.setWillNotDraw(true);
                viewGroup.addView(catchingFishMoshiContext);
                break;
            }
            int i6 = i4 + 1;
            View childAt = viewGroup.getChildAt(i4);
            if (childAt == null) {
                throw new IndexOutOfBoundsException();
            }
            if (childAt.getTag() instanceof CatchingFishAppCompatDagger) {
                break;
            } else {
                i4 = i6;
            }
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        CatchingFishManifestMVI catchingFishManifestMVI = this.CatchingFishMutableLiveData;
        if (catchingFishManifestMVI == null) {
            CatchingFishFirebaseDagger.CatchingFishDataStoreIntent("customTabsCoordinator");
            throw null;
        }
        CatchingFishFABCardView catchingFishFABCardView = catchingFishManifestMVI.CatchingFishViewModelScope;
        if (catchingFishFABCardView != null) {
            try {
                catchingFishManifestMVI.CatchingFishParcelableFAB.unbindService(catchingFishFABCardView);
            } catch (Throwable th) {
                CatchingFishDaggerBiometric.CatchingFishViewModelFAB(th);
            }
        }
        catchingFishManifestMVI.CatchingFishViewModelScope = null;
        catchingFishManifestMVI.CatchingFishWorkManager = null;
        CatchingFishLiveDataWidget catchingFishLiveDataWidget = this.CatchingFishCustomView;
        if (catchingFishLiveDataWidget == null) {
            CatchingFishFirebaseDagger.CatchingFishDataStoreIntent("launchFlowCoordinator");
            throw null;
        }
        CatchingFishHiltManifest catchingFishHiltManifest = catchingFishLiveDataWidget.CatchingFishDaggerWebsocket;
        CatchingFishWidgetMVVMAdMob catchingFishWidgetMVVMAdMob = (CatchingFishWidgetMVVMAdMob) catchingFishHiltManifest.CatchingFishCoroutine;
        if (catchingFishWidgetMVVMAdMob != null) {
            catchingFishWidgetMVVMAdMob.CatchingFishSnackbar(1000);
        }
        catchingFishHiltManifest.CatchingFishCoroutine = null;
    }

    @Override // android.app.Activity
    public final void onPause() {
        super.onPause();
        CookieManager.getInstance().flush();
        WebView CatchingFishLayout = this.CatchingFishCardViewRealm.CatchingFishLayout();
        if (CatchingFishLayout != null) {
            CatchingFishLayout.onPause();
        }
        if (this.CatchingFishFragmentFactory != null) {
            Adjust.onPause();
        } else {
            CatchingFishFirebaseDagger.CatchingFishDataStoreIntent("adjustLifecycleCoordinator");
            throw null;
        }
    }

    @Override // android.app.Activity
    public final void onRestoreInstanceState(Bundle bundle) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(bundle, "savedInstanceState");
        super.onRestoreInstanceState(bundle);
        WebView CatchingFishLayout = this.CatchingFishCardViewRealm.CatchingFishLayout();
        if (CatchingFishLayout != null) {
            CatchingFishLayout.restoreState(bundle);
        }
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        CookieManager.getInstance().flush();
        WebView CatchingFishLayout = this.CatchingFishCardViewRealm.CatchingFishLayout();
        if (CatchingFishLayout != null) {
            CatchingFishLayout.onResume();
        }
        if (this.CatchingFishFragmentFactory == null) {
            CatchingFishFirebaseDagger.CatchingFishDataStoreIntent("adjustLifecycleCoordinator");
            throw null;
        }
        Adjust.onResume();
        CatchingFishManifestMVI catchingFishManifestMVI = this.CatchingFishMutableLiveData;
        if (catchingFishManifestMVI == null) {
            CatchingFishFirebaseDagger.CatchingFishDataStoreIntent("customTabsCoordinator");
            throw null;
        }
        if (catchingFishManifestMVI.CatchingFishCoroutine) {
            if (!catchingFishManifestMVI.CatchingFishDaggerWebsocket) {
                catchingFishManifestMVI.CatchingFishCoroutine = false;
                catchingFishManifestMVI.CatchingFishReduxKtor = null;
                catchingFishManifestMVI.CatchingFishDaggerWebsocket = false;
                return;
            }
            catchingFishManifestMVI.CatchingFishDaggerWebsocket = false;
            String str = catchingFishManifestMVI.CatchingFishReduxKtor;
            if (str != null) {
                catchingFishManifestMVI.CatchingFishCoroutine = false;
                catchingFishManifestMVI.CatchingFishSnackbar(str);
            } else {
                catchingFishManifestMVI.CatchingFishCoroutine = false;
                catchingFishManifestMVI.CatchingFishReduxKtor = null;
                catchingFishManifestMVI.CatchingFishDaggerWebsocket = false;
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(bundle, "outState");
        super.onSaveInstanceState(bundle);
        WebView CatchingFishLayout = this.CatchingFishCardViewRealm.CatchingFishLayout();
        if (CatchingFishLayout != null) {
            CatchingFishLayout.saveState(bundle);
        }
    }
}
