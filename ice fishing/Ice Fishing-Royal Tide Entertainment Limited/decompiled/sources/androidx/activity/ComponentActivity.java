package androidx.activity;

import android.app.Application;
import android.app.PictureInPictureUiState;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.catchingfish.fishcatcherpro.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.text.CatchingFishAdMobHandler;
import kotlin.text.CatchingFishAndroidXRoom;
import kotlin.text.CatchingFishAnimationPayPal;
import kotlin.text.CatchingFishAsyncTaskDagger;
import kotlin.text.CatchingFishBundleKtor;
import kotlin.text.CatchingFishCameraXLiveData;
import kotlin.text.CatchingFishDaggerBiometric;
import kotlin.text.CatchingFishDataStoreFlux;
import kotlin.text.CatchingFishFABLifecycle;
import kotlin.text.CatchingFishFirebaseDagger;
import kotlin.text.CatchingFishFluxCameraX;
import kotlin.text.CatchingFishFluxPicasso;
import kotlin.text.CatchingFishGoogleMapsGson;
import kotlin.text.CatchingFishGoogleMapsRoom;
import kotlin.text.CatchingFishHandlerMVPRealm;
import kotlin.text.CatchingFishHiltContext;
import kotlin.text.CatchingFishHiltMVPToast;
import kotlin.text.CatchingFishJUnitGlide;
import kotlin.text.CatchingFishJUnitLiveData;
import kotlin.text.CatchingFishKtorHiltIntent;
import kotlin.text.CatchingFishKtorKtorPayPal;
import kotlin.text.CatchingFishKtorMoshiGson;
import kotlin.text.CatchingFishLiveDataToast;
import kotlin.text.CatchingFishMVPGraphQL;
import kotlin.text.CatchingFishMVPViewService;
import kotlin.text.CatchingFishMVVMWebSocket;
import kotlin.text.CatchingFishManifestService;
import kotlin.text.CatchingFishMockkFirebase;
import kotlin.text.CatchingFishMoshiBundle;
import kotlin.text.CatchingFishMoshiFABMVVM;
import kotlin.text.CatchingFishMoshiMVI;
import kotlin.text.CatchingFishOkHttpFAB;
import kotlin.text.CatchingFishPayPalMVPMVP;
import kotlin.text.CatchingFishRealmViewPager;
import kotlin.text.CatchingFishRoomRetrofit;
import kotlin.text.CatchingFishStripeAPIRedux;
import kotlin.text.CatchingFishToolbarToast;
import kotlin.text.CatchingFishViewCardView;
import kotlin.text.CatchingFishViewHiltContext;
import kotlin.text.CatchingFishViewModelIntent;
import kotlin.text.CatchingFishViewPagerMVI;
import kotlin.text.CatchingFishViewParcelable;
import kotlin.text.CatchingFishWidgetContext;
import kotlin.text.CatchingFishXMLLayoutGlide;

/* loaded from: classes.dex */
public class ComponentActivity extends androidx.core.app.ComponentActivity implements CatchingFishDataStoreFlux, CatchingFishHandlerMVPRealm, CatchingFishJUnitLiveData {
    public static final /* synthetic */ int CatchingFishParcelableFlux = 0;
    public final CopyOnWriteArrayList CatchingFish;
    public final CopyOnWriteArrayList CatchingFishAnimationMockk;
    public final AtomicInteger CatchingFishCloudMessaging;
    public boolean CatchingFishCoroutineFlow;
    public final CatchingFishKtorHiltIntent CatchingFishDaggerHiltFAB;
    public final CatchingFishGoogleMapsGson CatchingFishEspressoTesting;
    public final CatchingFishKtorHiltIntent CatchingFishFragmentHandler;
    public boolean CatchingFishJetpackCompose;
    public final CatchingFishAndroidXRoom CatchingFishLayout;
    public final CopyOnWriteArrayList CatchingFishNavigation;
    public final CopyOnWriteArrayList CatchingFishOkHttp;
    public final CopyOnWriteArrayList CatchingFishRoomDatabase;
    public final CatchingFishKtorHiltIntent CatchingFishSpannableWidget;
    public final CopyOnWriteArrayList CatchingFishStateLiveData;
    public final CopyOnWriteArrayList CatchingFishUnitTesting;
    public CatchingFishManifestService CatchingFishViewModelFAB;
    public final CatchingFishViewModelIntent CatchingFishViewModelScope;
    public final CatchingFishAnimationPayPal CatchingFishDaggerWebsocket = new CatchingFishAnimationPayPal();
    public final CatchingFishAsyncTaskDagger CatchingFishWorkManager = new CatchingFishAsyncTaskDagger(new CatchingFishGoogleMapsRoom(this, 1));

    public ComponentActivity() {
        CatchingFishMoshiBundle catchingFishMoshiBundle = new CatchingFishMoshiBundle(this, new CatchingFishFluxPicasso(6, this));
        CatchingFishViewModelIntent catchingFishViewModelIntent = new CatchingFishViewModelIntent(catchingFishMoshiBundle, 14);
        this.CatchingFishViewModelScope = catchingFishViewModelIntent;
        this.CatchingFishLayout = new CatchingFishAndroidXRoom(this);
        this.CatchingFishFragmentHandler = CatchingFishXMLLayoutGlide.CatchingFishPayPal(new CatchingFishStripeAPIRedux(this, 1));
        this.CatchingFishCloudMessaging = new AtomicInteger();
        this.CatchingFishEspressoTesting = new CatchingFishGoogleMapsGson(this);
        this.CatchingFishOkHttp = new CopyOnWriteArrayList();
        this.CatchingFishUnitTesting = new CopyOnWriteArrayList();
        this.CatchingFishAnimationMockk = new CopyOnWriteArrayList();
        this.CatchingFishStateLiveData = new CopyOnWriteArrayList();
        this.CatchingFishRoomDatabase = new CopyOnWriteArrayList();
        this.CatchingFishNavigation = new CopyOnWriteArrayList();
        this.CatchingFish = new CopyOnWriteArrayList();
        this.CatchingFishDaggerHiltFAB = CatchingFishXMLLayoutGlide.CatchingFishPayPal(new CatchingFishStripeAPIRedux(this, 2));
        CatchingFishToolbarToast catchingFishToolbarToast = this.CatchingFishReduxKtor;
        if (catchingFishToolbarToast == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        catchingFishToolbarToast.CatchingFishParcelableFAB(new CatchingFishRoomRetrofit(0, this));
        int i = 1;
        this.CatchingFishReduxKtor.CatchingFishParcelableFAB(new CatchingFishRoomRetrofit(i, this));
        this.CatchingFishReduxKtor.CatchingFishParcelableFAB(new CatchingFishMoshiMVI(i, this));
        catchingFishMoshiBundle.CatchingFishParcelableFAB();
        CatchingFishFirebaseDagger.CatchingFishPayPal(this);
        ((CatchingFishViewModelIntent) catchingFishViewModelIntent.CatchingFishWorkManager).CatchingFishCardViewRealm("android:support:activity-result", new CatchingFishViewCardView(0, this));
        CatchingFishViewModelFAB(new CatchingFishFABLifecycle(this, 0));
        CatchingFishXMLLayoutGlide.CatchingFishPayPal(new CatchingFishStripeAPIRedux(this, 3));
        this.CatchingFishSpannableWidget = CatchingFishXMLLayoutGlide.CatchingFishPayPal(new CatchingFishStripeAPIRedux(this, 4));
    }

    public static void CatchingFishWorkManager(ComponentActivity componentActivity) {
        try {
            super.onBackPressed();
        } catch (IllegalStateException e) {
            if (!CatchingFishFirebaseDagger.CatchingFishOkHttp(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                throw e;
            }
        } catch (NullPointerException e2) {
            if (!CatchingFishFirebaseDagger.CatchingFishOkHttp(e2.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                throw e2;
            }
        }
    }

    public final CatchingFishMoshiFABMVVM CatchingFishCloudMessaging(final CatchingFishBundleKtor catchingFishBundleKtor, final CatchingFishFirebaseDagger catchingFishFirebaseDagger) {
        final CatchingFishGoogleMapsGson catchingFishGoogleMapsGson = this.CatchingFishEspressoTesting;
        CatchingFishFirebaseDagger.CatchingFishNavigation(catchingFishGoogleMapsGson, "registry");
        final String str = "activity_rq#" + this.CatchingFishCloudMessaging.getAndIncrement();
        LinkedHashMap linkedHashMap = catchingFishGoogleMapsGson.CatchingFishCoroutine;
        CatchingFishFirebaseDagger.CatchingFishNavigation(str, "key");
        CatchingFishToolbarToast catchingFishToolbarToast = this.CatchingFishReduxKtor;
        if (catchingFishToolbarToast.CatchingFishReduxKtor.compareTo(CatchingFishMockkFirebase.CatchingFishViewModelScope) >= 0) {
            throw new IllegalStateException(("LifecycleOwner " + this + " is attempting to register while current state is " + catchingFishToolbarToast.CatchingFishReduxKtor + ". LifecycleOwners must call register before they are STARTED.").toString());
        }
        catchingFishGoogleMapsGson.CatchingFishReduxKtor(str);
        CatchingFishCameraXLiveData catchingFishCameraXLiveData = (CatchingFishCameraXLiveData) linkedHashMap.get(str);
        if (catchingFishCameraXLiveData == null) {
            catchingFishCameraXLiveData = new CatchingFishCameraXLiveData(catchingFishToolbarToast);
        }
        CatchingFishMVPViewService catchingFishMVPViewService = new CatchingFishMVPViewService() { // from class: kotlin.text.CatchingFishGraphQLRetrofit
            @Override // kotlin.text.CatchingFishMVPViewService
            public final void CatchingFishSnackbar(CatchingFishToastFlux catchingFishToastFlux, CatchingFishToolbarLiveData catchingFishToolbarLiveData) {
                CatchingFishToolbarLiveData catchingFishToolbarLiveData2 = CatchingFishToolbarLiveData.ON_START;
                CatchingFishGoogleMapsGson catchingFishGoogleMapsGson2 = CatchingFishGoogleMapsGson.this;
                String str2 = str;
                if (catchingFishToolbarLiveData2 != catchingFishToolbarLiveData) {
                    if (CatchingFishToolbarLiveData.ON_STOP == catchingFishToolbarLiveData) {
                        catchingFishGoogleMapsGson2.CatchingFishDaggerWebsocket.remove(str2);
                        return;
                    } else {
                        if (CatchingFishToolbarLiveData.ON_DESTROY == catchingFishToolbarLiveData) {
                            catchingFishGoogleMapsGson2.CatchingFishDaggerWebsocket(str2);
                            return;
                        }
                        return;
                    }
                }
                LinkedHashMap linkedHashMap2 = catchingFishGoogleMapsGson2.CatchingFishDaggerWebsocket;
                Bundle bundle = catchingFishGoogleMapsGson2.CatchingFishViewModelScope;
                LinkedHashMap linkedHashMap3 = catchingFishGoogleMapsGson2.CatchingFishWorkManager;
                CatchingFishBundleKtor catchingFishBundleKtor2 = catchingFishBundleKtor;
                CatchingFishFirebaseDagger catchingFishFirebaseDagger2 = catchingFishFirebaseDagger;
                linkedHashMap2.put(str2, new CatchingFishGlide(catchingFishBundleKtor2, catchingFishFirebaseDagger2));
                if (linkedHashMap3.containsKey(str2)) {
                    Object obj = linkedHashMap3.get(str2);
                    linkedHashMap3.remove(str2);
                    catchingFishBundleKtor2.CatchingFishParcelableFAB(obj);
                }
                CatchingFishToolbar catchingFishToolbar = (CatchingFishToolbar) CatchingFishBiometricBundle.CatchingFishJetpackCompose(str2, bundle);
                if (catchingFishToolbar != null) {
                    bundle.remove(str2);
                    catchingFishBundleKtor2.CatchingFishParcelableFAB(catchingFishFirebaseDagger2.CatchingFishPayPalLiveData(catchingFishToolbar.CatchingFishDaggerWebsocket, catchingFishToolbar.CatchingFishReduxKtor));
                }
            }
        };
        catchingFishCameraXLiveData.CatchingFishParcelableFAB.CatchingFishParcelableFAB(catchingFishMVPViewService);
        catchingFishCameraXLiveData.CatchingFishSnackbar.add(catchingFishMVPViewService);
        linkedHashMap.put(str, catchingFishCameraXLiveData);
        return new CatchingFishMoshiFABMVVM(catchingFishGoogleMapsGson, str, catchingFishFirebaseDagger, 0);
    }

    @Override // kotlin.text.CatchingFishHandlerMVPRealm
    public final CatchingFishViewParcelable CatchingFishCoroutine() {
        CatchingFishViewParcelable catchingFishViewParcelable = new CatchingFishViewParcelable(0);
        Application application = getApplication();
        LinkedHashMap linkedHashMap = catchingFishViewParcelable.CatchingFishParcelableFAB;
        if (application != null) {
            linkedHashMap.put(CatchingFishMVPGraphQL.CatchingFishReduxKtor, getApplication());
        }
        linkedHashMap.put(CatchingFishFirebaseDagger.CatchingFishEspressoTesting, this);
        linkedHashMap.put(CatchingFishFirebaseDagger.CatchingFishOkHttp, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            linkedHashMap.put(CatchingFishFirebaseDagger.CatchingFishUnitTesting, extras);
        }
        return catchingFishViewParcelable;
    }

    @Override // androidx.core.app.ComponentActivity, kotlin.text.CatchingFishToastFlux
    public final CatchingFishToolbarToast CatchingFishDaggerWebsocket() {
        return this.CatchingFishReduxKtor;
    }

    public final void CatchingFishFragmentHandler() {
        View decorView = getWindow().getDecorView();
        CatchingFishFirebaseDagger.CatchingFishRoomDatabase(decorView, "getDecorView(...)");
        CatchingFishHiltMVPToast.CatchingFishFragmentFactory(decorView, this);
        View decorView2 = getWindow().getDecorView();
        CatchingFishFirebaseDagger.CatchingFishRoomDatabase(decorView2, "getDecorView(...)");
        decorView2.setTag(R.id.view_tree_view_model_store_owner, this);
        View decorView3 = getWindow().getDecorView();
        CatchingFishFirebaseDagger.CatchingFishRoomDatabase(decorView3, "getDecorView(...)");
        CatchingFishOkHttpFAB.CatchingFishRecyclerView(decorView3, this);
        View decorView4 = getWindow().getDecorView();
        CatchingFishFirebaseDagger.CatchingFishRoomDatabase(decorView4, "getDecorView(...)");
        decorView4.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        View decorView5 = getWindow().getDecorView();
        CatchingFishFirebaseDagger.CatchingFishRoomDatabase(decorView5, "getDecorView(...)");
        decorView5.setTag(R.id.report_drawn, this);
        View decorView6 = getWindow().getDecorView();
        CatchingFishFirebaseDagger.CatchingFishRoomDatabase(decorView6, "getDecorView(...)");
        decorView6.setTag(R.id.view_tree_navigation_event_dispatcher_owner, this);
    }

    public final CatchingFishFluxCameraX CatchingFishLayout() {
        return (CatchingFishFluxCameraX) this.CatchingFishSpannableWidget.getValue();
    }

    @Override // kotlin.text.CatchingFishJUnitLiveData
    public final CatchingFishViewModelIntent CatchingFishParcelableFAB() {
        return (CatchingFishViewModelIntent) this.CatchingFishViewModelScope.CatchingFishWorkManager;
    }

    @Override // kotlin.text.CatchingFishDataStoreFlux
    public final CatchingFishManifestService CatchingFishReduxKtor() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        if (this.CatchingFishViewModelFAB == null) {
            CatchingFishKtorMoshiGson catchingFishKtorMoshiGson = (CatchingFishKtorMoshiGson) getLastNonConfigurationInstance();
            if (catchingFishKtorMoshiGson != null) {
                this.CatchingFishViewModelFAB = catchingFishKtorMoshiGson.CatchingFishParcelableFAB;
            }
            if (this.CatchingFishViewModelFAB == null) {
                this.CatchingFishViewModelFAB = new CatchingFishManifestService();
            }
        }
        CatchingFishManifestService catchingFishManifestService = this.CatchingFishViewModelFAB;
        CatchingFishFirebaseDagger.CatchingFishAnimationMockk(catchingFishManifestService);
        return catchingFishManifestService;
    }

    public final void CatchingFishViewModelFAB(CatchingFishViewPagerMVI catchingFishViewPagerMVI) {
        CatchingFishAnimationPayPal catchingFishAnimationPayPal = this.CatchingFishDaggerWebsocket;
        catchingFishAnimationPayPal.getClass();
        ComponentActivity componentActivity = catchingFishAnimationPayPal.CatchingFishSnackbar;
        if (componentActivity != null) {
            catchingFishViewPagerMVI.CatchingFishParcelableFAB(componentActivity);
        }
        catchingFishAnimationPayPal.CatchingFishParcelableFAB.add(catchingFishViewPagerMVI);
    }

    public final void CatchingFishViewModelScope(CatchingFishKtorKtorPayPal catchingFishKtorKtorPayPal) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(catchingFishKtorKtorPayPal, "listener");
        this.CatchingFishOkHttp.add(catchingFishKtorKtorPayPal);
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        CatchingFishFragmentHandler();
        View decorView = getWindow().getDecorView();
        CatchingFishFirebaseDagger.CatchingFishRoomDatabase(decorView, "getDecorView(...)");
        this.CatchingFishLayout.CatchingFishParcelableFAB(decorView);
        super.addContentView(view, layoutParams);
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (this.CatchingFishEspressoTesting.CatchingFishParcelableFAB(i, i2, intent)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        ((CatchingFishRealmViewPager) this.CatchingFishDaggerHiltFAB.getValue()).CatchingFishParcelableFAB();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        Iterator it = this.CatchingFishOkHttp.iterator();
        CatchingFishFirebaseDagger.CatchingFishRoomDatabase(it, "iterator(...)");
        while (it.hasNext()) {
            ((CatchingFishKtorKtorPayPal) it.next()).accept(configuration);
        }
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.CatchingFishViewModelScope.CatchingFishDaggerHiltFAB(bundle);
        CatchingFishAnimationPayPal catchingFishAnimationPayPal = this.CatchingFishDaggerWebsocket;
        catchingFishAnimationPayPal.getClass();
        catchingFishAnimationPayPal.CatchingFishSnackbar = this;
        Iterator it = catchingFishAnimationPayPal.CatchingFishParcelableFAB.iterator();
        while (it.hasNext()) {
            ((CatchingFishViewPagerMVI) it.next()).CatchingFishParcelableFAB(this);
        }
        super.onCreate(bundle);
        int i = CatchingFishAdMobHandler.CatchingFishDaggerWebsocket;
        CatchingFishHiltContext.CatchingFishSnackbar(this);
        getPackageManager().hasSystemFeature("android.software.picture_in_picture");
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(menu, "menu");
        if (i != 0) {
            return true;
        }
        super.onCreatePanelMenu(i, menu);
        getMenuInflater();
        Iterator it = ((CopyOnWriteArrayList) this.CatchingFishWorkManager.CatchingFishViewModelScope).iterator();
        while (it.hasNext()) {
            ((CatchingFishLiveDataToast) it.next()).CatchingFishParcelableFAB.CatchingFishFragmentHandler();
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(menuItem, "item");
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            Iterator it = ((CopyOnWriteArrayList) this.CatchingFishWorkManager.CatchingFishViewModelScope).iterator();
            while (it.hasNext()) {
                if (((CatchingFishLiveDataToast) it.next()).CatchingFishParcelableFAB.CatchingFishAnimationMockk()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z) {
        if (this.CatchingFishJetpackCompose) {
            return;
        }
        Iterator it = this.CatchingFishStateLiveData.iterator();
        CatchingFishFirebaseDagger.CatchingFishRoomDatabase(it, "iterator(...)");
        while (it.hasNext()) {
            ((CatchingFishKtorKtorPayPal) it.next()).accept(new CatchingFishViewHiltContext(z));
        }
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(intent, "intent");
        super.onNewIntent(intent);
        Iterator it = this.CatchingFishAnimationMockk.iterator();
        CatchingFishFirebaseDagger.CatchingFishRoomDatabase(it, "iterator(...)");
        while (it.hasNext()) {
            ((CatchingFishKtorKtorPayPal) it.next()).accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(menu, "menu");
        Iterator it = ((CopyOnWriteArrayList) this.CatchingFishWorkManager.CatchingFishViewModelScope).iterator();
        while (it.hasNext()) {
            ((CatchingFishLiveDataToast) it.next()).CatchingFishParcelableFAB.CatchingFishStateLiveData();
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z) {
        if (this.CatchingFishCoroutineFlow) {
            return;
        }
        Iterator it = this.CatchingFishRoomDatabase.iterator();
        CatchingFishFirebaseDagger.CatchingFishRoomDatabase(it, "iterator(...)");
        while (it.hasNext()) {
            ((CatchingFishKtorKtorPayPal) it.next()).accept(new CatchingFishPayPalMVPMVP(z));
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureUiStateChanged(PictureInPictureUiState pictureInPictureUiState) {
        CatchingFishWidgetContext catchingFishWidgetContext;
        CatchingFishFirebaseDagger.CatchingFishNavigation(pictureInPictureUiState, "pipState");
        super.onPictureInPictureUiStateChanged(pictureInPictureUiState);
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            pictureInPictureUiState.isStashed();
            pictureInPictureUiState.isTransitioningToPip();
            catchingFishWidgetContext = new CatchingFishWidgetContext();
        } else if (i >= 31) {
            pictureInPictureUiState.isStashed();
            catchingFishWidgetContext = new CatchingFishWidgetContext();
        } else {
            catchingFishWidgetContext = new CatchingFishWidgetContext();
        }
        Iterator it = this.CatchingFishNavigation.iterator();
        CatchingFishFirebaseDagger.CatchingFishRoomDatabase(it, "iterator(...)");
        while (it.hasNext()) {
            ((CatchingFishKtorKtorPayPal) it.next()).accept(catchingFishWidgetContext);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(menu, "menu");
        if (i != 0) {
            return true;
        }
        super.onPreparePanel(i, view, menu);
        Iterator it = ((CopyOnWriteArrayList) this.CatchingFishWorkManager.CatchingFishViewModelScope).iterator();
        while (it.hasNext()) {
            ((CatchingFishLiveDataToast) it.next()).CatchingFishParcelableFAB.CatchingFish();
        }
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(strArr, "permissions");
        CatchingFishFirebaseDagger.CatchingFishNavigation(iArr, "grantResults");
        if (this.CatchingFishEspressoTesting.CatchingFishParcelableFAB(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        CatchingFishKtorMoshiGson catchingFishKtorMoshiGson;
        CatchingFishManifestService catchingFishManifestService = this.CatchingFishViewModelFAB;
        if (catchingFishManifestService == null && (catchingFishKtorMoshiGson = (CatchingFishKtorMoshiGson) getLastNonConfigurationInstance()) != null) {
            catchingFishManifestService = catchingFishKtorMoshiGson.CatchingFishParcelableFAB;
        }
        if (catchingFishManifestService == null) {
            return null;
        }
        CatchingFishKtorMoshiGson catchingFishKtorMoshiGson2 = new CatchingFishKtorMoshiGson();
        catchingFishKtorMoshiGson2.CatchingFishParcelableFAB = catchingFishManifestService;
        return catchingFishKtorMoshiGson2;
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(bundle, "outState");
        CatchingFishToolbarToast catchingFishToolbarToast = this.CatchingFishReduxKtor;
        if (catchingFishToolbarToast != null) {
            catchingFishToolbarToast.CatchingFishViewModelScope();
        }
        super.onSaveInstanceState(bundle);
        this.CatchingFishViewModelScope.CatchingFishSpannableWidget(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator it = this.CatchingFishUnitTesting.iterator();
        CatchingFishFirebaseDagger.CatchingFishRoomDatabase(it, "iterator(...)");
        while (it.hasNext()) {
            ((CatchingFishKtorKtorPayPal) it.next()).accept(Integer.valueOf(i));
        }
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator it = this.CatchingFish.iterator();
        CatchingFishFirebaseDagger.CatchingFishRoomDatabase(it, "iterator(...)");
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    @Override // android.app.Activity
    public final void reportFullyDrawn() {
        try {
            if (CatchingFishDaggerBiometric.CatchingFishGsonAppCompat()) {
                CatchingFishDaggerBiometric.CatchingFishDaggerWebsocket("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            CatchingFishMVVMWebSocket catchingFishMVVMWebSocket = (CatchingFishMVVMWebSocket) this.CatchingFishFragmentHandler.getValue();
            synchronized (catchingFishMVVMWebSocket.CatchingFishParcelableFAB) {
                try {
                    catchingFishMVVMWebSocket.CatchingFishSnackbar = true;
                    ArrayList arrayList = catchingFishMVVMWebSocket.CatchingFishCoroutine;
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        ((CatchingFishJUnitGlide) obj).CatchingFishParcelableFAB();
                    }
                    catchingFishMVVMWebSocket.CatchingFishCoroutine.clear();
                } finally {
                }
            }
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i) {
        CatchingFishFragmentHandler();
        View decorView = getWindow().getDecorView();
        CatchingFishFirebaseDagger.CatchingFishRoomDatabase(decorView, "getDecorView(...)");
        this.CatchingFishLayout.CatchingFishParcelableFAB(decorView);
        super.setContentView(i);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(intent, "intent");
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(intentSender, "intent");
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i, Bundle bundle) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(intent, "intent");
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(intentSender, "intent");
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z, Configuration configuration) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(configuration, "newConfig");
        this.CatchingFishJetpackCompose = true;
        try {
            super.onMultiWindowModeChanged(z, configuration);
            this.CatchingFishJetpackCompose = false;
            Iterator it = this.CatchingFishStateLiveData.iterator();
            CatchingFishFirebaseDagger.CatchingFishRoomDatabase(it, "iterator(...)");
            while (it.hasNext()) {
                ((CatchingFishKtorKtorPayPal) it.next()).accept(new CatchingFishViewHiltContext(z));
            }
        } catch (Throwable th) {
            this.CatchingFishJetpackCompose = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(configuration, "newConfig");
        this.CatchingFishCoroutineFlow = true;
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            this.CatchingFishCoroutineFlow = false;
            Iterator it = this.CatchingFishRoomDatabase.iterator();
            CatchingFishFirebaseDagger.CatchingFishRoomDatabase(it, "iterator(...)");
            while (it.hasNext()) {
                ((CatchingFishKtorKtorPayPal) it.next()).accept(new CatchingFishPayPalMVPMVP(z));
            }
        } catch (Throwable th) {
            this.CatchingFishCoroutineFlow = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        CatchingFishFragmentHandler();
        View decorView = getWindow().getDecorView();
        CatchingFishFirebaseDagger.CatchingFishRoomDatabase(decorView, "getDecorView(...)");
        this.CatchingFishLayout.CatchingFishParcelableFAB(decorView);
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        CatchingFishFragmentHandler();
        View decorView = getWindow().getDecorView();
        CatchingFishFirebaseDagger.CatchingFishRoomDatabase(decorView, "getDecorView(...)");
        this.CatchingFishLayout.CatchingFishParcelableFAB(decorView);
        super.setContentView(view, layoutParams);
    }
}
