package kotlin.text;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.Looper;
import android.os.StrictMode;
import android.os.Trace;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AnimationUtils;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.translation.TranslationRequestValue;
import android.view.translation.ViewTranslationRequest;
import androidx.compose.ui.semantics.EmptySemanticsElement;
import com.catchingfish.fishcatcherpro.R;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import kotlin.text.CatchingFishFABStripeAPIFAB;
import kotlin.text.CatchingFishGradleCameraX;
import kotlin.text.CatchingFishRoomAnimation;

/* loaded from: classes.dex */
public final class CatchingFishGradleCameraX extends ViewGroup implements CatchingFishAdMobJUnit, CatchingFishRoomDagger, CatchingFishCoroutineWidget, CatchingFishSharedFlowJUnit {
    public static Method CatchingFishContextToast;
    public static CatchingFishKtorLifecycle CatchingFishExoPlayer;
    public static Method CatchingFishGlideMVP;
    public static Class CatchingFishLiveDataRoom;
    public static final CatchingFishBundleGradle CatchingFishToolbar = new CatchingFishBundleGradle();
    public final CatchingFishPayPalGradle CatchingFish;
    public CatchingFishServiceHandler CatchingFishAndroidX;
    public boolean CatchingFishAnimation;
    public final CatchingFishMoshiWebsocket CatchingFishAnimationMockk;
    public final int[] CatchingFishAppCompat;
    public final CatchingFishKtorWidget CatchingFishCameraX;
    public final CatchingFishMVP CatchingFishCameraXIntent;
    public final CatchingFishRoomLayout CatchingFishCardViewRealm;
    public ArrayList CatchingFishCardViewView;
    public CatchingFishManifestMockk CatchingFishCloudMessaging;
    public final CatchingFishMVPManifest CatchingFishCoroutineFlow;
    public boolean CatchingFishCustomView;
    public final CatchingFishCoroutineGson CatchingFishCustomViewJUnit;
    public final CatchingFishFABMVVM CatchingFishDagger;
    public final CatchingFishGradleMVVM CatchingFishDaggerAppCompat;
    public final CatchingFishFABViewModel CatchingFishDaggerHiltFAB;
    public final CatchingFishLifecycleMVI CatchingFishDaggerMVVM;
    public final boolean CatchingFishDaggerWebsocket;
    public final float[] CatchingFishDataStoreIntent;
    public final CatchingFishMVPLayout CatchingFishDynamicFeature;
    public boolean CatchingFishEspressoMockk;
    public final CatchingFishAppCompatMockk CatchingFishEspressoTesting;
    public final CatchingFishGradleMVVM CatchingFishFABLayout;
    public final CatchingFishMVPExoPlayer CatchingFishFirebase;
    public final CatchingFishDatabindingFAB CatchingFishFragmentFactory;
    public final CatchingFishExoPlayerOkHttp CatchingFishFragmentHandler;
    public final CatchingFishToolbarPicasso CatchingFishGlideWidgetKtor;
    public int CatchingFishGradleLiveData;
    public CatchingFishGlideService CatchingFishGradleManifest;
    public MotionEvent CatchingFishGraphQLGlide;
    public final CatchingFishAsyncTaskRedux CatchingFishGsonAppCompat;
    public final CatchingFishGlideBiometric CatchingFishHandler;
    public long CatchingFishJUnitRealm;
    public final CatchingFishGradleCameraX CatchingFishJetpackCompose;
    public CatchingFishServiceHandler CatchingFishJobScheduler;
    public final CatchingFishEspressoLayout CatchingFishKtor;
    public final CatchingFishBundleGradle CatchingFishKtorService;
    public final boolean CatchingFishLayout;
    public boolean CatchingFishLayoutInflater;
    public boolean CatchingFishLifecycle;
    public View CatchingFishMVPHandler;
    public float CatchingFishMVPReduxContext;
    public boolean CatchingFishMVPRobolectric;
    public long CatchingFishMVVMAppCompat;
    public final CatchingFishWidgetCameraX CatchingFishMockkOkHttp;
    public final CatchingFishGsonReduxPayPal CatchingFishMoshiDaggerHilt;
    public CatchingFishGradleGraphQL CatchingFishMotionLayout;
    public final CatchingFishAsyncTaskRedux CatchingFishMutableLiveData;
    public final CatchingFishLayoutGsonRoom CatchingFishNavigation;
    public final CatchingFishManifest CatchingFishNavigationGson;
    public final CatchingFishEspressoLayout CatchingFishOkHttp;
    public final CatchingFishFragmentDagger CatchingFishParcelable;
    public final CatchingFishLifecycleLayout CatchingFishParcelableFlux;
    public final ArrayList CatchingFishPayPal;
    public boolean CatchingFishPayPalHandler;
    public boolean CatchingFishPayPalLiveData;
    public final CatchingFishFluxFluxBundle CatchingFishPayPalService;
    public final CatchingFishWidgetContext CatchingFishPicasso;
    public final CatchingFishGsonRealm CatchingFishRealmKtorRealm;
    public long CatchingFishRecyclerView;
    public final CatchingFishSnackbarJUnit CatchingFishRedux;
    public long CatchingFishReduxKtor;
    public final AtomicReference CatchingFishReduxMoshi;
    public final CatchingFishAsyncTaskIntent CatchingFishRetrofit;
    public final CatchingFishAsyncTaskIntent CatchingFishRetrofitMVI;
    public final CatchingFishBiometricRoom CatchingFishRoomDatabase;
    public final CatchingFishDataStoreMVVM CatchingFishSensorManager;
    public final CatchingFishOkHttpLiveData CatchingFishServiceMVIJUnit;
    public final CatchingFishFragmentPayPal CatchingFishSharedFlow;
    public CatchingFishFAB CatchingFishSpannableWidget;
    public final float[] CatchingFishStateFlow;
    public long CatchingFishStateFlowIntent;
    public final CatchingFishXMLLayoutRoom CatchingFishStateLiveData;
    public final CatchingFishAsyncTaskIntent CatchingFishStripeAPI;
    public final CatchingFishManifestPayPal CatchingFishUnitTesting;
    public final CatchingFishFluxWebSocket CatchingFishView;
    public final View CatchingFishViewModelFAB;
    public final CatchingFishAsyncTaskIntent CatchingFishViewModelScope;
    public float CatchingFishWebSocketMockk;
    public final CatchingFishViewModelIntent CatchingFishWidget;
    public final CatchingFishDaggerHiltJUnit CatchingFishWorkManager;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r1v36, types: [kotlin.text.CatchingFishManifest] */
    /* JADX WARN: Type inference failed for: r1v37, types: [kotlin.text.CatchingFishSnackbarJUnit] */
    /* JADX WARN: Type inference failed for: r1v38, types: [kotlin.text.CatchingFishCoroutineGson] */
    public CatchingFishGradleCameraX(Context context, CatchingFishManifestMockk catchingFishManifestMockk) {
        super(context);
        CatchingFishFluxFluxBundle catchingFishFluxFluxBundle;
        CatchingFishDataStoreMVVM catchingFishDataStoreMVVM;
        final CatchingFishGradleCameraX catchingFishGradleCameraX = this;
        catchingFishGradleCameraX.CatchingFishReduxKtor = 9205357640488583168L;
        int i = 1;
        catchingFishGradleCameraX.CatchingFishDaggerWebsocket = true;
        catchingFishGradleCameraX.CatchingFishWorkManager = new CatchingFishDaggerHiltJUnit();
        CatchingFishLayoutSnackbar CatchingFishParcelableFAB = CatchingFishLayoutRoomFAB.CatchingFishParcelableFAB(context);
        CatchingFishMVPExoPlayer catchingFishMVPExoPlayer = CatchingFishMVPExoPlayer.CatchingFishCloudMessaging;
        catchingFishGradleCameraX.CatchingFishViewModelScope = new CatchingFishAsyncTaskIntent(CatchingFishParcelableFAB, catchingFishMVPExoPlayer);
        int i2 = Build.VERSION.SDK_INT;
        int i3 = 0;
        boolean z = i2 >= 35;
        catchingFishGradleCameraX.CatchingFishLayout = z;
        CatchingFishViewMockk catchingFishViewMockk = new CatchingFishViewMockk();
        EmptySemanticsElement emptySemanticsElement = new EmptySemanticsElement(catchingFishViewMockk);
        CatchingFishAppCompatMVVM catchingFishAppCompatMVVM = new CatchingFishAppCompatMVVM() { // from class: androidx.compose.ui.platform.AndroidComposeView$bringIntoViewNode$1
            @Override // kotlin.text.CatchingFishAppCompatMVVM
            public final void CatchingFishDaggerWebsocket(CatchingFishFABStripeAPIFAB catchingFishFABStripeAPIFAB) {
                ((CatchingFishRoomAnimation) catchingFishFABStripeAPIFAB).getClass();
            }

            @Override // kotlin.text.CatchingFishAppCompatMVVM
            public final CatchingFishFABStripeAPIFAB CatchingFishReduxKtor() {
                return new CatchingFishRoomAnimation();
            }

            public final boolean equals(Object obj) {
                return obj == this;
            }

            public final int hashCode() {
                return CatchingFishGradleCameraX.this.hashCode();
            }
        };
        catchingFishGradleCameraX.CatchingFishFragmentHandler = new CatchingFishExoPlayerOkHttp(catchingFishGradleCameraX, catchingFishGradleCameraX);
        catchingFishGradleCameraX.CatchingFishCloudMessaging = catchingFishManifestMockk;
        catchingFishGradleCameraX.CatchingFishEspressoTesting = new CatchingFishAppCompatMockk();
        catchingFishGradleCameraX.CatchingFishOkHttp = new CatchingFishEspressoLayout(0);
        CatchingFishBundleAnimation CatchingFishParcelableFAB2 = androidx.compose.ui.input.key.CatchingFishPagingLibrary.CatchingFishParcelableFAB(new CatchingFishRoomDaggerHilt(catchingFishGradleCameraX, i3));
        CatchingFishBundleAnimation CatchingFishParcelableFAB3 = androidx.compose.ui.input.rotary.CatchingFishPagingLibrary.CatchingFishParcelableFAB();
        catchingFishGradleCameraX.CatchingFishUnitTesting = new CatchingFishManifestPayPal();
        ViewConfiguration.get(context);
        catchingFishGradleCameraX.CatchingFishAnimationMockk = new CatchingFishMoshiWebsocket();
        CatchingFishXMLLayoutRoom catchingFishXMLLayoutRoom = new CatchingFishXMLLayoutRoom();
        catchingFishGradleCameraX.CatchingFishStateLiveData = catchingFishXMLLayoutRoom;
        CatchingFishBiometricRoom catchingFishBiometricRoom = new CatchingFishBiometricRoom(3);
        CatchingFishManifestJUnit catchingFishManifestJUnit = catchingFishBiometricRoom.CatchingFishGsonAppCompat;
        CatchingFishHiltWidget catchingFishHiltWidget = CatchingFishHiltWidget.CatchingFishSnackbar;
        if (!CatchingFishFirebaseDagger.CatchingFishOkHttp(catchingFishManifestJUnit, catchingFishHiltWidget)) {
            catchingFishBiometricRoom.CatchingFishGsonAppCompat = catchingFishHiltWidget;
            catchingFishBiometricRoom.CatchingFishCardViewRealm();
        }
        catchingFishBiometricRoom.CatchingFishRecyclerView(catchingFishGradleCameraX.getDensity());
        catchingFishBiometricRoom.CatchingFishJUnitRealm(catchingFishGradleCameraX.getViewConfiguration());
        catchingFishBiometricRoom.CatchingFishStateFlow(androidx.compose.ui.layout.CatchingFishViewPagerToast.CatchingFishSnackbar(catchingFishXMLLayoutRoom).CatchingFishCoroutine(emptySemanticsElement).CatchingFishCoroutine(CatchingFishParcelableFAB3).CatchingFishCoroutine(CatchingFishParcelableFAB2).CatchingFishCoroutine(((CatchingFishExoPlayerOkHttp) catchingFishGradleCameraX.getFocusOwner()).CatchingFishDaggerWebsocket).CatchingFishCoroutine(catchingFishGradleCameraX.m9getDragAndDropManager().CatchingFishCoroutine).CatchingFishCoroutine(catchingFishAppCompatMVVM));
        catchingFishGradleCameraX.CatchingFishRoomDatabase = catchingFishBiometricRoom;
        CatchingFishLayoutGsonRoom catchingFishLayoutGsonRoom = CatchingFishFluxCardView.CatchingFishParcelableFAB;
        catchingFishGradleCameraX.CatchingFishNavigation = new CatchingFishLayoutGsonRoom();
        catchingFishGradleCameraX.m10getLayoutNodes();
        catchingFishGradleCameraX.CatchingFish = new CatchingFishPayPalGradle();
        catchingFishGradleCameraX.CatchingFishJetpackCompose = catchingFishGradleCameraX;
        catchingFishGradleCameraX.CatchingFishCoroutineFlow = new CatchingFishMVPManifest(catchingFishGradleCameraX.getRoot(), catchingFishViewMockk, catchingFishGradleCameraX.m10getLayoutNodes());
        CatchingFishFABViewModel catchingFishFABViewModel = new CatchingFishFABViewModel(catchingFishGradleCameraX);
        catchingFishGradleCameraX.CatchingFishDaggerHiltFAB = catchingFishFABViewModel;
        catchingFishGradleCameraX.CatchingFishSpannableWidget = new CatchingFishFAB(catchingFishGradleCameraX, new CatchingFishCustomViewKtor(0, catchingFishGradleCameraX, CatchingFishRobolectricHilt.class, "getContentCaptureSessionCompat", "getContentCaptureSessionCompat(Landroid/view/View;)Landroidx/compose/ui/platform/coreshims/ContentCaptureSessionCompat;", 1, 0, 0));
        CatchingFishLifecycleLayout catchingFishLifecycleLayout = new CatchingFishLifecycleLayout();
        Object systemService = context.getSystemService("accessibility");
        CatchingFishFirebaseDagger.CatchingFishStateLiveData(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        catchingFishGradleCameraX.CatchingFishParcelableFlux = catchingFishLifecycleLayout;
        CatchingFishAsyncTaskRedux catchingFishAsyncTaskRedux = new CatchingFishAsyncTaskRedux();
        catchingFishAsyncTaskRedux.CatchingFishSnackbar = catchingFishGradleCameraX;
        catchingFishAsyncTaskRedux.CatchingFishCoroutine = new Object();
        CatchingFishHiltIntentMVVM catchingFishHiltIntentMVVM = new CatchingFishHiltIntentMVVM(catchingFishAsyncTaskRedux);
        catchingFishAsyncTaskRedux.CatchingFishDaggerWebsocket = catchingFishHiltIntentMVVM;
        if (catchingFishGradleCameraX.isAttachedToWindow()) {
            Context context2 = catchingFishGradleCameraX.getContext();
            if (!catchingFishAsyncTaskRedux.CatchingFishParcelableFAB) {
                context2.getApplicationContext().registerComponentCallbacks(catchingFishHiltIntentMVVM);
                catchingFishAsyncTaskRedux.CatchingFishParcelableFAB = true;
            }
        }
        catchingFishGradleCameraX.addOnAttachStateChangeListener(new CatchingFishToastWidget(i, catchingFishAsyncTaskRedux));
        catchingFishGradleCameraX.CatchingFishGsonAppCompat = catchingFishAsyncTaskRedux;
        catchingFishGradleCameraX.CatchingFishCardViewRealm = new CatchingFishRoomLayout();
        catchingFishGradleCameraX.CatchingFishPayPal = new ArrayList();
        catchingFishGradleCameraX.CatchingFishFragmentFactory = new CatchingFishDatabindingFAB();
        CatchingFishBiometricRoom root = catchingFishGradleCameraX.getRoot();
        CatchingFishAsyncTaskRedux catchingFishAsyncTaskRedux2 = new CatchingFishAsyncTaskRedux();
        catchingFishAsyncTaskRedux2.CatchingFishSnackbar = root;
        catchingFishAsyncTaskRedux2.CatchingFishCoroutine = new CatchingFishDaggerViewModel((CatchingFishGlideHandler) root.CatchingFishJobScheduler.CatchingFishViewModelScope);
        catchingFishAsyncTaskRedux2.CatchingFishReduxKtor = new CatchingFishViewPagerMockk(25);
        catchingFishAsyncTaskRedux2.CatchingFishDaggerWebsocket = new CatchingFishStripeAPIOkHttp();
        catchingFishGradleCameraX.CatchingFishMutableLiveData = catchingFishAsyncTaskRedux2;
        catchingFishGradleCameraX.CatchingFishJobScheduler = CatchingFishMVI.CatchingFishWorkManager;
        if (CatchingFishViewModelFAB()) {
            CatchingFishRoomLayout autofillTree = catchingFishGradleCameraX.getAutofillTree();
            catchingFishFluxFluxBundle = new CatchingFishFluxFluxBundle();
            catchingFishFluxFluxBundle.CatchingFishReduxKtor = catchingFishGradleCameraX;
            catchingFishFluxFluxBundle.CatchingFishDaggerWebsocket = autofillTree;
            AutofillManager CatchingFishViewModelScope = CatchingFishAnimation.CatchingFishViewModelScope(catchingFishGradleCameraX.getContext().getSystemService(CatchingFishAnimation.CatchingFishCloudMessaging()));
            if (CatchingFishViewModelScope == null) {
                throw new IllegalStateException("Autofill service could not be located.");
            }
            catchingFishFluxFluxBundle.CatchingFishWorkManager = CatchingFishViewModelScope;
            catchingFishGradleCameraX.setImportantForAutofill(1);
            CatchingFishFABFlux CatchingFishSpannableWidget = CatchingFishOkHttpFAB.CatchingFishSpannableWidget(catchingFishGradleCameraX);
            AutofillId CatchingFishLayout = CatchingFishSpannableWidget != null ? CatchingFishLifecycleJUnit.CatchingFishLayout(CatchingFishSpannableWidget.CatchingFishReduxKtor) : null;
            if (CatchingFishLayout == null) {
                throw CatchingFishMVPLiveData.CatchingFish("Required value was null.");
            }
            catchingFishFluxFluxBundle.CatchingFishViewModelScope = CatchingFishLayout;
        } else {
            catchingFishFluxFluxBundle = null;
        }
        catchingFishGradleCameraX.CatchingFishPayPalService = catchingFishFluxFluxBundle;
        int i4 = 23;
        if (CatchingFishViewModelFAB()) {
            AutofillManager CatchingFishViewModelScope2 = CatchingFishAnimation.CatchingFishViewModelScope(context.getSystemService(CatchingFishAnimation.CatchingFishCloudMessaging()));
            if (CatchingFishViewModelScope2 == null) {
                throw CatchingFishMVPLiveData.CatchingFish("Autofill service could not be located.");
            }
            catchingFishGradleCameraX = this;
            catchingFishDataStoreMVVM = new CatchingFishDataStoreMVVM(new CatchingFishViewPagerMockk(i4, CatchingFishViewModelScope2), getSemanticsOwner(), this, getRectManager(), context.getPackageName());
        } else {
            catchingFishDataStoreMVVM = null;
        }
        catchingFishGradleCameraX.CatchingFishSensorManager = catchingFishDataStoreMVVM;
        catchingFishGradleCameraX.CatchingFishDagger = new CatchingFishFABMVVM(context);
        catchingFishGradleCameraX.m8getClipboardManager();
        catchingFishGradleCameraX.CatchingFishCameraXIntent = new CatchingFishMVP();
        catchingFishGradleCameraX.CatchingFishHandler = new CatchingFishGlideBiometric(new CatchingFishRoomDaggerHilt(catchingFishGradleCameraX, i));
        catchingFishGradleCameraX.CatchingFishParcelable = new CatchingFishFragmentDagger(catchingFishGradleCameraX.getRoot());
        long j = Integer.MAX_VALUE;
        catchingFishGradleCameraX.CatchingFishRecyclerView = (j & 4294967295L) | (j << 32);
        catchingFishGradleCameraX.CatchingFishAppCompat = new int[]{0, 0};
        float[] CatchingFishEspressoTesting = CatchingFishOkHttpFAB.CatchingFishEspressoTesting();
        catchingFishGradleCameraX.CatchingFishDataStoreIntent = CatchingFishOkHttpFAB.CatchingFishEspressoTesting();
        catchingFishGradleCameraX.CatchingFishStateFlow = CatchingFishOkHttpFAB.CatchingFishEspressoTesting();
        catchingFishGradleCameraX.CatchingFishJUnitRealm = -1L;
        catchingFishGradleCameraX.CatchingFishMVVMAppCompat = 9187343241974906880L;
        catchingFishGradleCameraX.CatchingFishStripeAPI = CatchingFishLayoutRoom.CatchingFishGsonAppCompat(null);
        CatchingFishFragmentPayPal catchingFishFragmentPayPal = new CatchingFishFragmentPayPal(catchingFishGradleCameraX, i);
        CatchingFishAsyncTaskDagger catchingFishAsyncTaskDagger = CatchingFishGlideJUnit.CatchingFishParcelableFAB;
        catchingFishGradleCameraX.CatchingFishMoshiDaggerHilt = new CatchingFishGsonReduxPayPal(catchingFishFragmentPayPal);
        catchingFishGradleCameraX.CatchingFishNavigationGson = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: kotlin.text.CatchingFishManifest
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                CatchingFishGradleCameraX.this.CatchingFishPayPalService();
            }
        };
        catchingFishGradleCameraX.CatchingFishRedux = new ViewTreeObserver.OnScrollChangedListener() { // from class: kotlin.text.CatchingFishSnackbarJUnit
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                CatchingFishGradleCameraX.this.CatchingFishPayPalService();
            }
        };
        catchingFishGradleCameraX.CatchingFishCustomViewJUnit = new ViewTreeObserver.OnTouchModeChangeListener() { // from class: kotlin.text.CatchingFishCoroutineGson
            @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
            public final void onTouchModeChanged(boolean z2) {
                CatchingFishGradleCameraX.this.CatchingFishServiceMVIJUnit.CatchingFishParcelableFAB.setValue(new CatchingFishMVVMViewPager(z2 ? 1 : 2));
            }
        };
        catchingFishGradleCameraX.CatchingFishDaggerMVVM = new CatchingFishLifecycleMVI(catchingFishGradleCameraX.getView(), catchingFishGradleCameraX);
        CatchingFishWidgetCameraX catchingFishWidgetCameraX = new CatchingFishWidgetCameraX();
        new AtomicReference(null);
        catchingFishGradleCameraX.CatchingFishMockkOkHttp = catchingFishWidgetCameraX;
        catchingFishGradleCameraX.CatchingFishReduxMoshi = new AtomicReference(null);
        catchingFishGradleCameraX.getTextInputService();
        catchingFishGradleCameraX.CatchingFishPicasso = new CatchingFishWidgetContext();
        int i5 = 12;
        catchingFishGradleCameraX.CatchingFishFirebase = new CatchingFishMVPExoPlayer(i5);
        catchingFishGradleCameraX.CatchingFishRetrofitMVI = new CatchingFishAsyncTaskIntent(CatchingFishFirebaseDagger.CatchingFishDaggerHiltFAB(context), catchingFishMVPExoPlayer);
        catchingFishGradleCameraX.CatchingFishGradleLiveData = i2 >= 31 ? context.getResources().getConfiguration().fontWeightAdjustment : 0;
        int layoutDirection = context.getResources().getConfiguration().getLayoutDirection();
        CatchingFishGradleMVPKtor catchingFishGradleMVPKtor = CatchingFishGradleMVPKtor.CatchingFishReduxKtor;
        CatchingFishGradleMVPKtor catchingFishGradleMVPKtor2 = layoutDirection != 0 ? layoutDirection != 1 ? null : CatchingFishGradleMVPKtor.CatchingFishDaggerWebsocket : catchingFishGradleMVPKtor;
        catchingFishGradleCameraX.CatchingFishRetrofit = CatchingFishLayoutRoom.CatchingFishGsonAppCompat(catchingFishGradleMVPKtor2 != null ? catchingFishGradleMVPKtor2 : catchingFishGradleMVPKtor);
        catchingFishGradleCameraX.CatchingFishView = new CatchingFishFluxWebSocket();
        int i6 = 2;
        catchingFishGradleCameraX.CatchingFishServiceMVIJUnit = new CatchingFishOkHttpLiveData(catchingFishGradleCameraX.isInTouchMode() ? 1 : 2);
        catchingFishGradleCameraX.CatchingFishGlideWidgetKtor = new CatchingFishToolbarPicasso(catchingFishGradleCameraX);
        catchingFishGradleCameraX.CatchingFishFABLayout = new CatchingFishGradleMVVM(13);
        catchingFishGradleCameraX.CatchingFishWidget = new CatchingFishViewModelIntent(23);
        catchingFishGradleCameraX.CatchingFishKtorService = new CatchingFishBundleGradle();
        catchingFishGradleCameraX.CatchingFishRealmKtorRealm = new CatchingFishGsonRealm(i6, catchingFishGradleCameraX);
        catchingFishGradleCameraX.CatchingFishDynamicFeature = new CatchingFishMVPLayout(i, catchingFishGradleCameraX);
        catchingFishGradleCameraX.CatchingFishSharedFlow = new CatchingFishFragmentPayPal(catchingFishGradleCameraX, 0);
        catchingFishGradleCameraX.CatchingFishCameraX = i2 < 29 ? new CatchingFishKtor(CatchingFishEspressoTesting) : new CatchingFishMVVMMVVMIntent();
        catchingFishGradleCameraX.addOnAttachStateChangeListener(catchingFishGradleCameraX.CatchingFishSpannableWidget);
        catchingFishGradleCameraX.setWillNotDraw(false);
        catchingFishGradleCameraX.setFocusable(true);
        if (i2 >= 26) {
            CatchingFishRetrofitMockk.CatchingFishParcelableFAB.CatchingFishParcelableFAB(catchingFishGradleCameraX, 1, false);
        }
        catchingFishGradleCameraX.setFocusableInTouchMode(true);
        catchingFishGradleCameraX.setClipChildren(false);
        CatchingFishFABCameraX.CatchingFishOkHttp(catchingFishGradleCameraX, catchingFishFABViewModel);
        catchingFishGradleCameraX.setOnDragListener(catchingFishGradleCameraX.m9getDragAndDropManager());
        catchingFishGradleCameraX.getRoot().CatchingFishSnackbar(catchingFishGradleCameraX);
        if (i2 >= 29) {
            CatchingFishViewFragment.CatchingFishParcelableFAB.CatchingFishParcelableFAB(catchingFishGradleCameraX);
        }
        if (z) {
            View view = new View(context);
            view.setLayoutParams(new ViewGroup.LayoutParams(1, 1));
            view.setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
            catchingFishGradleCameraX.CatchingFishViewModelFAB = view;
            catchingFishGradleCameraX.addView(view, -1);
        }
        catchingFishGradleCameraX.CatchingFishKtor = i2 >= 31 ? new CatchingFishEspressoLayout(1) : null;
        CatchingFishGradleMVVM catchingFishGradleMVVM = new CatchingFishGradleMVVM(i5);
        CatchingFishUnitTestingMVVM.CatchingFishParcelableFAB.getClass();
        catchingFishGradleCameraX.CatchingFishDaggerAppCompat = catchingFishGradleMVVM;
    }

    public static View CatchingFishCloudMessaging(View view, int i) {
        if (Build.VERSION.SDK_INT < 29) {
            Method declaredMethod = View.class.getDeclaredMethod("getAccessibilityViewId", null);
            declaredMethod.setAccessible(true);
            if (CatchingFishFirebaseDagger.CatchingFishOkHttp(declaredMethod.invoke(view, null), Integer.valueOf(i))) {
                return view;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View CatchingFishCloudMessaging = CatchingFishCloudMessaging(viewGroup.getChildAt(i2), i);
                    if (CatchingFishCloudMessaging != null) {
                        return CatchingFishCloudMessaging;
                    }
                }
            }
        }
        return null;
    }

    public static long CatchingFishFragmentHandler(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            return (0 << 32) | size;
        }
        if (mode == 0) {
            return (0 << 32) | Integer.MAX_VALUE;
        }
        if (mode != 1073741824) {
            throw new IllegalStateException();
        }
        long j = size;
        return j | (j << 32);
    }

    public static void CatchingFishLayout(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof CatchingFishGradleCameraX) {
                ((CatchingFishGradleCameraX) childAt).CatchingFishDaggerHiltFAB();
            } else if (childAt instanceof ViewGroup) {
                CatchingFishLayout((ViewGroup) childAt);
            }
        }
    }

    public static final void CatchingFishParcelableFAB(CatchingFishGradleCameraX catchingFishGradleCameraX, int i, AccessibilityNodeInfo accessibilityNodeInfo, String str) {
        int CatchingFishReduxKtor;
        CatchingFishFABViewModel catchingFishFABViewModel = catchingFishGradleCameraX.CatchingFishDaggerHiltFAB;
        if (CatchingFishFirebaseDagger.CatchingFishOkHttp(str, catchingFishFABViewModel.CatchingFishCustomView)) {
            int CatchingFishReduxKtor2 = catchingFishFABViewModel.CatchingFishCardViewView.CatchingFishReduxKtor(i);
            if (CatchingFishReduxKtor2 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, CatchingFishReduxKtor2);
                return;
            }
            return;
        }
        if (!CatchingFishFirebaseDagger.CatchingFishOkHttp(str, catchingFishFABViewModel.CatchingFishFragmentFactory) || (CatchingFishReduxKtor = catchingFishFABViewModel.CatchingFishMVPRobolectric.CatchingFishReduxKtor(i)) == -1) {
            return;
        }
        accessibilityNodeInfo.getExtras().putInt(str, CatchingFishReduxKtor);
    }

    public static boolean CatchingFishStateLiveData(MotionEvent motionEvent) {
        boolean z = (Float.floatToRawIntBits(motionEvent.getX()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawX()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawY()) & Integer.MAX_VALUE) >= 2139095040;
        if (!z) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i = 1; i < pointerCount; i++) {
                z = (Float.floatToRawIntBits(motionEvent.getX(i)) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY(i)) & Integer.MAX_VALUE) >= 2139095040 || (Build.VERSION.SDK_INT >= 29 && !CatchingFishGlideAnimation.CatchingFishParcelableFAB.CatchingFishParcelableFAB(motionEvent, i));
                if (z) {
                    break;
                }
            }
        }
        return z;
    }

    public static void CatchingFishUnitTesting(CatchingFishBiometricRoom catchingFishBiometricRoom) {
        catchingFishBiometricRoom.CatchingFishGsonAppCompat();
        CatchingFishFABToast CatchingFishCoroutineFlow = catchingFishBiometricRoom.CatchingFishCoroutineFlow();
        Object[] objArr = CatchingFishCoroutineFlow.CatchingFishReduxKtor;
        int i = CatchingFishCoroutineFlow.CatchingFishWorkManager;
        for (int i2 = 0; i2 < i; i2++) {
            CatchingFishUnitTesting((CatchingFishBiometricRoom) objArr[i2]);
        }
    }

    public static boolean CatchingFishViewModelFAB() {
        return Build.VERSION.SDK_INT >= 26;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CatchingFishWidgetAdMob get_viewTreeOwners() {
        return (CatchingFishWidgetAdMob) this.CatchingFishStripeAPI.getValue();
    }

    private void setDensity(CatchingFishOkHttpFlux catchingFishOkHttpFlux) {
        this.CatchingFishViewModelScope.setValue(catchingFishOkHttpFlux);
    }

    private void setFontFamilyResolver(CatchingFishFragmentView catchingFishFragmentView) {
        this.CatchingFishRetrofitMVI.setValue(catchingFishFragmentView);
    }

    private void setLayoutDirection(CatchingFishGradleMVPKtor catchingFishGradleMVPKtor) {
        this.CatchingFishRetrofit.setValue(catchingFishGradleMVPKtor);
    }

    private final void set_viewTreeOwners(CatchingFishWidgetAdMob catchingFishWidgetAdMob) {
        this.CatchingFishStripeAPI.setValue(catchingFishWidgetAdMob);
    }

    public final long CatchingFish(long j) {
        CatchingFishPayPal();
        long CatchingFishJobScheduler = CatchingFishOkHttpFAB.CatchingFishJobScheduler(this.CatchingFishDataStoreIntent, j);
        float intBitsToFloat = Float.intBitsToFloat((int) (this.CatchingFishMVVMAppCompat >> 32)) + Float.intBitsToFloat((int) (CatchingFishJobScheduler >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (this.CatchingFishMVVMAppCompat & 4294967295L)) + Float.intBitsToFloat((int) (CatchingFishJobScheduler & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }

    public final void CatchingFishAnimationMockk(CatchingFishBiometricRoom catchingFishBiometricRoom) {
        this.CatchingFishParcelable.CatchingFishOkHttp(catchingFishBiometricRoom, false);
        CatchingFishFABToast CatchingFishCoroutineFlow = catchingFishBiometricRoom.CatchingFishCoroutineFlow();
        Object[] objArr = CatchingFishCoroutineFlow.CatchingFishReduxKtor;
        int i = CatchingFishCoroutineFlow.CatchingFishWorkManager;
        for (int i2 = 0; i2 < i; i2++) {
            CatchingFishAnimationMockk((CatchingFishBiometricRoom) objArr[i2]);
        }
    }

    public final void CatchingFishCardViewRealm() {
        CatchingFishFABViewModel catchingFishFABViewModel = this.CatchingFishDaggerHiltFAB;
        catchingFishFABViewModel.CatchingFishParcelableFlux = true;
        if (catchingFishFABViewModel.CatchingFishCoroutineFlow() && !catchingFishFABViewModel.CatchingFishSensorManager) {
            catchingFishFABViewModel.CatchingFishSensorManager = true;
            catchingFishFABViewModel.CatchingFishEspressoTesting.post(catchingFishFABViewModel.CatchingFishDagger);
        }
        CatchingFishFAB catchingFishFAB = this.CatchingFishSpannableWidget;
        catchingFishFAB.CatchingFishFragmentHandler = true;
        if (!catchingFishFAB.CatchingFishViewModelFAB() || catchingFishFAB.CatchingFishRoomDatabase) {
            return;
        }
        catchingFishFAB.CatchingFishRoomDatabase = true;
        catchingFishFAB.CatchingFishEspressoTesting.post(catchingFishFAB.CatchingFishNavigation);
    }

    public final void CatchingFishCardViewView(MotionEvent motionEvent) {
        this.CatchingFishJUnitRealm = AnimationUtils.currentAnimationTimeMillis();
        CatchingFishKtorWidget catchingFishKtorWidget = this.CatchingFishCameraX;
        float[] fArr = this.CatchingFishDataStoreIntent;
        catchingFishKtorWidget.CatchingFishParcelableFAB(this, fArr);
        CatchingFishGsonCardView.CatchingFishMVPRobolectric(fArr, this.CatchingFishStateFlow);
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        long CatchingFishJobScheduler = CatchingFishOkHttpFAB.CatchingFishJobScheduler(fArr, (Float.floatToRawIntBits(x) << 32) | (Float.floatToRawIntBits(y) & 4294967295L));
        float rawX = motionEvent.getRawX() - Float.intBitsToFloat((int) (CatchingFishJobScheduler >> 32));
        float rawY = motionEvent.getRawY() - Float.intBitsToFloat((int) (CatchingFishJobScheduler & 4294967295L));
        this.CatchingFishMVVMAppCompat = (Float.floatToRawIntBits(rawX) << 32) | (Float.floatToRawIntBits(rawY) & 4294967295L);
    }

    @Override // kotlin.text.CatchingFishCoroutineWidget
    public final void CatchingFishCoroutine(CatchingFishToastFlux catchingFishToastFlux) {
        if (Build.VERSION.SDK_INT < 30) {
            setShowLayoutBounds(CatchingFishRobolectricHilt.CatchingFishSpannableWidget());
        }
    }

    public final void CatchingFishCoroutineFlow(CatchingFishFABGlide catchingFishFABGlide, boolean z) {
        ArrayList arrayList = this.CatchingFishPayPal;
        if (!z) {
            if (this.CatchingFishMVPRobolectric) {
                return;
            }
            arrayList.remove(catchingFishFABGlide);
            ArrayList arrayList2 = this.CatchingFishCardViewView;
            if (arrayList2 != null) {
                arrayList2.remove(catchingFishFABGlide);
                return;
            }
            return;
        }
        if (!this.CatchingFishMVPRobolectric) {
            arrayList.add(catchingFishFABGlide);
            return;
        }
        ArrayList arrayList3 = this.CatchingFishCardViewView;
        if (arrayList3 == null) {
            arrayList3 = new ArrayList();
            this.CatchingFishCardViewView = arrayList3;
        }
        arrayList3.add(catchingFishFABGlide);
    }

    public final void CatchingFishCustomView(CatchingFishBiometricRoom catchingFishBiometricRoom) {
        if (isLayoutRequested() || !isAttachedToWindow()) {
            return;
        }
        if (catchingFishBiometricRoom != null) {
            while (catchingFishBiometricRoom != null && catchingFishBiometricRoom.CatchingFishAnimationMockk() == CatchingFishAdMobAndroidX.CatchingFishReduxKtor) {
                if (!this.CatchingFishLayoutInflater) {
                    CatchingFishBiometricRoom CatchingFishRoomDatabase = catchingFishBiometricRoom.CatchingFishRoomDatabase();
                    if (CatchingFishRoomDatabase == null) {
                        break;
                    }
                    long j = ((CatchingFishGlideHandler) CatchingFishRoomDatabase.CatchingFishJobScheduler.CatchingFishViewModelScope).CatchingFishViewModelScope;
                    if (CatchingFishGradleGraphQL.CatchingFishDaggerWebsocket(j) && CatchingFishGradleGraphQL.CatchingFishReduxKtor(j)) {
                        break;
                    }
                }
                catchingFishBiometricRoom = catchingFishBiometricRoom.CatchingFishRoomDatabase();
            }
            if (catchingFishBiometricRoom == getRoot()) {
                requestLayout();
                return;
            }
        }
        if (getWidth() == 0 || getHeight() == 0) {
            requestLayout();
        } else {
            invalidate();
        }
    }

    public final void CatchingFishDaggerHiltFAB() {
        CatchingFishDataStoreMVVM catchingFishDataStoreMVVM;
        if (this.CatchingFishEspressoMockk) {
            CatchingFishViewMVPAndroidX catchingFishViewMVPAndroidX = getSnapshotObserver().CatchingFishParcelableFAB;
            synchronized (catchingFishViewMVPAndroidX.CatchingFishViewModelScope) {
                try {
                    CatchingFishFABToast catchingFishFABToast = catchingFishViewMVPAndroidX.CatchingFishWorkManager;
                    int i = catchingFishFABToast.CatchingFishWorkManager;
                    int i2 = 0;
                    for (int i3 = 0; i3 < i; i3++) {
                        CatchingFishHandlerRedux catchingFishHandlerRedux = (CatchingFishHandlerRedux) catchingFishFABToast.CatchingFishReduxKtor[i3];
                        catchingFishHandlerRedux.CatchingFishDaggerWebsocket();
                        if (!catchingFishHandlerRedux.CatchingFishWorkManager.CatchingFishFragmentHandler()) {
                            i2++;
                        } else if (i2 > 0) {
                            Object[] objArr = catchingFishFABToast.CatchingFishReduxKtor;
                            objArr[i3 - i2] = objArr[i3];
                        }
                    }
                    int i4 = i - i2;
                    CatchingFishMVVMHilt.CatchingFishAnimation(catchingFishFABToast.CatchingFishReduxKtor, i4, i);
                    catchingFishFABToast.CatchingFishWorkManager = i4;
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.CatchingFishEspressoMockk = false;
        }
        CatchingFishGlideService catchingFishGlideService = this.CatchingFishGradleManifest;
        if (catchingFishGlideService != null) {
            CatchingFishLayout(catchingFishGlideService);
        }
        if (CatchingFishViewModelFAB() && (catchingFishDataStoreMVVM = this.CatchingFishSensorManager) != null) {
            CatchingFishMVIWidget catchingFishMVIWidget = catchingFishDataStoreMVVM.CatchingFishViewModelScope;
            if (catchingFishMVIWidget.CatchingFishReduxKtor == 0 && catchingFishDataStoreMVVM.CatchingFishViewModelFAB) {
                ((AutofillManager) catchingFishDataStoreMVVM.CatchingFishParcelableFAB.CatchingFishDaggerWebsocket).commit();
                catchingFishDataStoreMVVM.CatchingFishViewModelFAB = false;
            }
            if (catchingFishMVIWidget.CatchingFishReduxKtor != 0) {
                catchingFishDataStoreMVVM.CatchingFishViewModelFAB = true;
            }
        }
        while (this.CatchingFishKtorService.CatchingFishViewModelFAB() && this.CatchingFishKtorService.CatchingFishDaggerWebsocket(0) != null) {
            int i5 = this.CatchingFishKtorService.CatchingFishSnackbar;
            for (int i6 = 0; i6 < i5; i6++) {
                CatchingFishJUnitGlide catchingFishJUnitGlide = (CatchingFishJUnitGlide) this.CatchingFishKtorService.CatchingFishDaggerWebsocket(i6);
                CatchingFishBundleGradle catchingFishBundleGradle = this.CatchingFishKtorService;
                if (i6 < 0 || i6 >= catchingFishBundleGradle.CatchingFishSnackbar) {
                    catchingFishBundleGradle.CatchingFishOkHttp(i6);
                    throw null;
                }
                Object[] objArr2 = catchingFishBundleGradle.CatchingFishParcelableFAB;
                Object obj = objArr2[i6];
                objArr2[i6] = null;
                if (catchingFishJUnitGlide != null) {
                    catchingFishJUnitGlide.CatchingFishParcelableFAB();
                }
            }
            this.CatchingFishKtorService.CatchingFishCloudMessaging(0, i5);
        }
    }

    public final void CatchingFishEspressoTesting(CatchingFishBiometricRoom catchingFishBiometricRoom, boolean z) {
        this.CatchingFishParcelable.CatchingFishReduxKtor(catchingFishBiometricRoom, z);
    }

    public final long CatchingFishFragmentFactory(long j) {
        CatchingFishPayPal();
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (this.CatchingFishMVVMAppCompat >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (this.CatchingFishMVVMAppCompat & 4294967295L));
        return CatchingFishOkHttpFAB.CatchingFishJobScheduler(this.CatchingFishStateFlow, (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32));
    }

    public final void CatchingFishGsonAppCompat(CatchingFishBiometricRoom catchingFishBiometricRoom, boolean z, boolean z2) {
        CatchingFishIntentPicasso catchingFishIntentPicasso = catchingFishBiometricRoom.CatchingFishPayPalService;
        CatchingFishMVVMRoom catchingFishMVVMRoom = CatchingFishMVVMRoom.CatchingFishViewModelScope;
        CatchingFishFragmentDagger catchingFishFragmentDagger = this.CatchingFishParcelable;
        if (!z) {
            catchingFishFragmentDagger.getClass();
            int ordinal = catchingFishIntentPicasso.CatchingFishCoroutine.ordinal();
            if (ordinal == 0 || ordinal == 1 || ordinal == 2 || ordinal == 3) {
                return;
            }
            if (ordinal != 4) {
                throw new CatchingFishBiometricView();
            }
            CatchingFishBiometricRoom CatchingFishRoomDatabase = catchingFishBiometricRoom.CatchingFishRoomDatabase();
            boolean z3 = CatchingFishRoomDatabase == null || CatchingFishRoomDatabase.CatchingFishFragmentFactory();
            if (!z2) {
                if (catchingFishBiometricRoom.CatchingFishOkHttp()) {
                    return;
                }
                if (catchingFishBiometricRoom.CatchingFishEspressoTesting() && catchingFishBiometricRoom.CatchingFishFragmentFactory() == z3 && catchingFishBiometricRoom.CatchingFishFragmentFactory() == catchingFishIntentPicasso.CatchingFishAnimationMockk.CatchingFishCoroutineFlow) {
                    return;
                }
            }
            CatchingFishToolbarMVIToast catchingFishToolbarMVIToast = catchingFishIntentPicasso.CatchingFishAnimationMockk;
            catchingFishToolbarMVIToast.CatchingFishSpannableWidget = true;
            catchingFishToolbarMVIToast.CatchingFishParcelableFlux = true;
            if (!catchingFishBiometricRoom.CatchingFishLayoutInflater && catchingFishToolbarMVIToast.CatchingFishCoroutineFlow && z3) {
                if ((CatchingFishRoomDatabase == null || !CatchingFishRoomDatabase.CatchingFishEspressoTesting()) && (CatchingFishRoomDatabase == null || !CatchingFishRoomDatabase.CatchingFishOkHttp())) {
                    catchingFishFragmentDagger.CatchingFishSnackbar.CatchingFishNavigation(catchingFishBiometricRoom, catchingFishMVVMRoom);
                }
                if (catchingFishFragmentDagger.CatchingFishReduxKtor) {
                    return;
                }
                CatchingFishCustomView(null);
                return;
            }
            return;
        }
        CatchingFishAsyncTaskDagger catchingFishAsyncTaskDagger = catchingFishFragmentDagger.CatchingFishSnackbar;
        int ordinal2 = catchingFishIntentPicasso.CatchingFishCoroutine.ordinal();
        if (ordinal2 != 0) {
            if (ordinal2 == 1) {
                return;
            }
            if (ordinal2 != 2) {
                if (ordinal2 == 3) {
                    return;
                }
                if (ordinal2 != 4) {
                    throw new CatchingFishBiometricView();
                }
            }
        }
        if ((catchingFishIntentPicasso.CatchingFishReduxKtor || catchingFishIntentPicasso.CatchingFishDaggerWebsocket) && !z2) {
            return;
        }
        catchingFishIntentPicasso.CatchingFishDaggerWebsocket = true;
        catchingFishIntentPicasso.CatchingFishWorkManager = true;
        CatchingFishToolbarMVIToast catchingFishToolbarMVIToast2 = catchingFishIntentPicasso.CatchingFishAnimationMockk;
        catchingFishToolbarMVIToast2.CatchingFishSpannableWidget = true;
        catchingFishToolbarMVIToast2.CatchingFishParcelableFlux = true;
        if (catchingFishBiometricRoom.CatchingFishLayoutInflater) {
            return;
        }
        CatchingFishBiometricRoom CatchingFishRoomDatabase2 = catchingFishBiometricRoom.CatchingFishRoomDatabase();
        if (CatchingFishFirebaseDagger.CatchingFishOkHttp(catchingFishBiometricRoom.CatchingFishMutableLiveData(), Boolean.TRUE) && ((CatchingFishRoomDatabase2 == null || !CatchingFishRoomDatabase2.CatchingFishPayPalService.CatchingFishReduxKtor) && (CatchingFishRoomDatabase2 == null || !CatchingFishRoomDatabase2.CatchingFishPayPalService.CatchingFishDaggerWebsocket))) {
            catchingFishAsyncTaskDagger.CatchingFishNavigation(catchingFishBiometricRoom, CatchingFishMVVMRoom.CatchingFishDaggerWebsocket);
        } else if (catchingFishBiometricRoom.CatchingFishFragmentFactory() && ((CatchingFishRoomDatabase2 == null || !CatchingFishRoomDatabase2.CatchingFishEspressoTesting()) && (CatchingFishRoomDatabase2 == null || !CatchingFishRoomDatabase2.CatchingFishOkHttp()))) {
            catchingFishAsyncTaskDagger.CatchingFishNavigation(catchingFishBiometricRoom, catchingFishMVVMRoom);
        }
        if (catchingFishFragmentDagger.CatchingFishReduxKtor) {
            return;
        }
        CatchingFishCustomView(null);
    }

    public final void CatchingFishJetpackCompose(boolean z) {
        CatchingFishFragmentPayPal catchingFishFragmentPayPal;
        CatchingFishFragmentDagger catchingFishFragmentDagger = this.CatchingFishParcelable;
        if (catchingFishFragmentDagger.CatchingFishSnackbar.CatchingFishLayoutInflater() || ((CatchingFishFABToast) catchingFishFragmentDagger.CatchingFishDaggerWebsocket.CatchingFishDaggerWebsocket).CatchingFishWorkManager != 0) {
            Trace.beginSection("AndroidOwner:measureAndLayout");
            if (z) {
                try {
                    catchingFishFragmentPayPal = this.CatchingFishSharedFlow;
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            } else {
                catchingFishFragmentPayPal = null;
            }
            if (catchingFishFragmentDagger.CatchingFishViewModelFAB(catchingFishFragmentPayPal)) {
                requestLayout();
            }
            catchingFishFragmentDagger.CatchingFishParcelableFAB(false);
            if (this.CatchingFishCustomView) {
                getViewTreeObserver().dispatchOnGlobalLayout();
                this.CatchingFishCustomView = false;
            }
            Trace.endSection();
        }
    }

    public final void CatchingFishJobScheduler(MotionEvent motionEvent, int i, long j, boolean z) {
        int actionMasked = motionEvent.getActionMasked();
        int i2 = -1;
        if (actionMasked != 1) {
            if (actionMasked == 6) {
                i2 = motionEvent.getActionIndex();
            }
        } else if (i != 9 && i != 10) {
            i2 = 0;
        }
        int pointerCount = motionEvent.getPointerCount() - (i2 >= 0 ? 1 : 0);
        if (pointerCount == 0) {
            return;
        }
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
        for (int i3 = 0; i3 < pointerCount; i3++) {
            pointerPropertiesArr[i3] = new MotionEvent.PointerProperties();
        }
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
        for (int i4 = 0; i4 < pointerCount; i4++) {
            pointerCoordsArr[i4] = new MotionEvent.PointerCoords();
        }
        int i5 = 0;
        while (i5 < pointerCount) {
            int i6 = ((i2 < 0 || i5 < i2) ? 0 : 1) + i5;
            motionEvent.getPointerProperties(i6, pointerPropertiesArr[i5]);
            MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i5];
            motionEvent.getPointerCoords(i6, pointerCoords);
            float f = pointerCoords.x;
            long CatchingFish = CatchingFish((Float.floatToRawIntBits(pointerCoords.y) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
            pointerCoords.x = Float.intBitsToFloat((int) (CatchingFish >> 32));
            pointerCoords.y = Float.intBitsToFloat((int) (CatchingFish & 4294967295L));
            i5++;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent.getDownTime() == motionEvent.getEventTime() ? j : motionEvent.getDownTime(), j, i, pointerCount, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), z ? 0 : motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        CatchingFishViewModelIntent CatchingFishParcelableFAB = this.CatchingFishFragmentFactory.CatchingFishParcelableFAB(obtain, this);
        CatchingFishFirebaseDagger.CatchingFishAnimationMockk(CatchingFishParcelableFAB);
        this.CatchingFishMutableLiveData.CatchingFishCoroutine(CatchingFishParcelableFAB, this, true);
        obtain.recycle();
    }

    public final boolean CatchingFishMVPRobolectric() {
        if (isFocused() || hasFocus()) {
            return true;
        }
        return super.requestFocus(130, null);
    }

    public final int CatchingFishMutableLiveData(MotionEvent motionEvent) {
        Object obj;
        if (this.CatchingFishLifecycle) {
            this.CatchingFishLifecycle = false;
            int metaState = motionEvent.getMetaState();
            this.CatchingFishOkHttp.getClass();
            CatchingFishToastRetrofit.CatchingFishParcelableFAB.setValue(new CatchingFishGlideGlide(metaState));
        }
        CatchingFishDatabindingFAB catchingFishDatabindingFAB = this.CatchingFishFragmentFactory;
        CatchingFishViewModelIntent CatchingFishParcelableFAB = catchingFishDatabindingFAB.CatchingFishParcelableFAB(motionEvent, this);
        CatchingFishAsyncTaskRedux catchingFishAsyncTaskRedux = this.CatchingFishMutableLiveData;
        if (CatchingFishParcelableFAB == null) {
            if (!catchingFishAsyncTaskRedux.CatchingFishParcelableFAB) {
                ((CatchingFishLayoutMVVMFlux) ((CatchingFishViewPagerMockk) catchingFishAsyncTaskRedux.CatchingFishReduxKtor).CatchingFishDaggerWebsocket).CatchingFishParcelableFAB();
                ((CatchingFishDaggerViewModel) catchingFishAsyncTaskRedux.CatchingFishCoroutine).CatchingFishCoroutine();
            }
            return 0;
        }
        List list = (List) CatchingFishParcelableFAB.CatchingFishDaggerWebsocket;
        int size = list.size() - 1;
        if (size >= 0) {
            while (true) {
                int i = size - 1;
                obj = list.get(size);
                if (((CatchingFishDaggerSnackbar) obj).CatchingFishDaggerWebsocket) {
                    break;
                }
                if (i < 0) {
                    break;
                }
                size = i;
            }
        }
        obj = null;
        CatchingFishDaggerSnackbar catchingFishDaggerSnackbar = (CatchingFishDaggerSnackbar) obj;
        if (catchingFishDaggerSnackbar != null) {
            this.CatchingFishReduxKtor = catchingFishDaggerSnackbar.CatchingFishReduxKtor;
        }
        int CatchingFishCoroutine = catchingFishAsyncTaskRedux.CatchingFishCoroutine(CatchingFishParcelableFAB, this, CatchingFishRoomDatabase(motionEvent));
        CatchingFishParcelableFAB.CatchingFishWorkManager = null;
        int actionMasked = motionEvent.getActionMasked();
        if ((actionMasked != 0 && actionMasked != 5) || (CatchingFishCoroutine & 1) != 0) {
            return CatchingFishCoroutine;
        }
        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
        catchingFishDatabindingFAB.CatchingFishCoroutine.delete(pointerId);
        catchingFishDatabindingFAB.CatchingFishSnackbar.delete(pointerId);
        return CatchingFishCoroutine;
    }

    public final boolean CatchingFishNavigation(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        return (motionEvent.getPointerCount() == 1 && (motionEvent2 = this.CatchingFishGraphQLGlide) != null && motionEvent2.getPointerCount() == motionEvent.getPointerCount() && motionEvent.getRawX() == motionEvent2.getRawX() && motionEvent.getRawY() == motionEvent2.getRawY()) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00be A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:25:0x00b6, B:27:0x00be, B:28:0x00c1, B:30:0x00c5, B:32:0x00cb, B:34:0x00cf, B:35:0x00d5, B:38:0x00dd, B:41:0x00e5, B:42:0x00f1, B:44:0x00f7, B:46:0x00fd, B:48:0x0103, B:49:0x0109, B:51:0x010d, B:52:0x0111, B:57:0x0124, B:59:0x0128, B:60:0x012f, B:66:0x0140, B:67:0x014a, B:69:0x0152, B:70:0x0155, B:76:0x015c), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cf A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:25:0x00b6, B:27:0x00be, B:28:0x00c1, B:30:0x00c5, B:32:0x00cb, B:34:0x00cf, B:35:0x00d5, B:38:0x00dd, B:41:0x00e5, B:42:0x00f1, B:44:0x00f7, B:46:0x00fd, B:48:0x0103, B:49:0x0109, B:51:0x010d, B:52:0x0111, B:57:0x0124, B:59:0x0128, B:60:0x012f, B:66:0x0140, B:67:0x014a, B:69:0x0152, B:70:0x0155, B:76:0x015c), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0103 A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:25:0x00b6, B:27:0x00be, B:28:0x00c1, B:30:0x00c5, B:32:0x00cb, B:34:0x00cf, B:35:0x00d5, B:38:0x00dd, B:41:0x00e5, B:42:0x00f1, B:44:0x00f7, B:46:0x00fd, B:48:0x0103, B:49:0x0109, B:51:0x010d, B:52:0x0111, B:57:0x0124, B:59:0x0128, B:60:0x012f, B:66:0x0140, B:67:0x014a, B:69:0x0152, B:70:0x0155, B:76:0x015c), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x010d A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:25:0x00b6, B:27:0x00be, B:28:0x00c1, B:30:0x00c5, B:32:0x00cb, B:34:0x00cf, B:35:0x00d5, B:38:0x00dd, B:41:0x00e5, B:42:0x00f1, B:44:0x00f7, B:46:0x00fd, B:48:0x0103, B:49:0x0109, B:51:0x010d, B:52:0x0111, B:57:0x0124, B:59:0x0128, B:60:0x012f, B:66:0x0140, B:67:0x014a, B:69:0x0152, B:70:0x0155, B:76:0x015c), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0128 A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:25:0x00b6, B:27:0x00be, B:28:0x00c1, B:30:0x00c5, B:32:0x00cb, B:34:0x00cf, B:35:0x00d5, B:38:0x00dd, B:41:0x00e5, B:42:0x00f1, B:44:0x00f7, B:46:0x00fd, B:48:0x0103, B:49:0x0109, B:51:0x010d, B:52:0x0111, B:57:0x0124, B:59:0x0128, B:60:0x012f, B:66:0x0140, B:67:0x014a, B:69:0x0152, B:70:0x0155, B:76:0x015c), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0140 A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:25:0x00b6, B:27:0x00be, B:28:0x00c1, B:30:0x00c5, B:32:0x00cb, B:34:0x00cf, B:35:0x00d5, B:38:0x00dd, B:41:0x00e5, B:42:0x00f1, B:44:0x00f7, B:46:0x00fd, B:48:0x0103, B:49:0x0109, B:51:0x010d, B:52:0x0111, B:57:0x0124, B:59:0x0128, B:60:0x012f, B:66:0x0140, B:67:0x014a, B:69:0x0152, B:70:0x0155, B:76:0x015c), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0152 A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:25:0x00b6, B:27:0x00be, B:28:0x00c1, B:30:0x00c5, B:32:0x00cb, B:34:0x00cf, B:35:0x00d5, B:38:0x00dd, B:41:0x00e5, B:42:0x00f1, B:44:0x00f7, B:46:0x00fd, B:48:0x0103, B:49:0x0109, B:51:0x010d, B:52:0x0111, B:57:0x0124, B:59:0x0128, B:60:0x012f, B:66:0x0140, B:67:0x014a, B:69:0x0152, B:70:0x0155, B:76:0x015c), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0155 A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:25:0x00b6, B:27:0x00be, B:28:0x00c1, B:30:0x00c5, B:32:0x00cb, B:34:0x00cf, B:35:0x00d5, B:38:0x00dd, B:41:0x00e5, B:42:0x00f1, B:44:0x00f7, B:46:0x00fd, B:48:0x0103, B:49:0x0109, B:51:0x010d, B:52:0x0111, B:57:0x0124, B:59:0x0128, B:60:0x012f, B:66:0x0140, B:67:0x014a, B:69:0x0152, B:70:0x0155, B:76:0x015c), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x004e A[Catch: all -> 0x0076, TryCatch #0 {all -> 0x0076, blocks: (B:90:0x0034, B:92:0x003e, B:97:0x004e, B:100:0x007d, B:102:0x0081, B:13:0x0093, B:21:0x00a6, B:23:0x00ac, B:103:0x0056, B:109:0x0062, B:112:0x006a), top: B:89:0x0034 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int CatchingFishOkHttp(MotionEvent motionEvent) {
        boolean z;
        int actionMasked;
        MotionEvent motionEvent2;
        CatchingFishGradleCameraX catchingFishGradleCameraX;
        MotionEvent motionEvent3;
        int pointerId;
        int action;
        boolean z2;
        CatchingFishDaggerViewModel catchingFishDaggerViewModel;
        removeCallbacks(this.CatchingFishRealmKtorRealm);
        try {
            CatchingFishCardViewView(motionEvent);
            this.CatchingFishAnimation = true;
            CatchingFishJetpackCompose(false);
            Trace.beginSection("AndroidOwner:onTouch");
            try {
                int actionMasked2 = motionEvent.getActionMasked();
                MotionEvent motionEvent4 = this.CatchingFishGraphQLGlide;
                boolean z3 = motionEvent4 != null && motionEvent4.getToolType(0) == 3;
                CatchingFishAsyncTaskRedux catchingFishAsyncTaskRedux = this.CatchingFishMutableLiveData;
                if (motionEvent4 != null) {
                    try {
                        if (motionEvent4.getSource() == motionEvent.getSource() && motionEvent4.getToolType(0) == motionEvent.getToolType(0)) {
                            z = false;
                            if (z) {
                                if (motionEvent4.getButtonState() != 0 || (actionMasked = motionEvent4.getActionMasked()) == 0 || actionMasked == 2 || actionMasked == 6) {
                                    motionEvent2 = motionEvent4;
                                    if (!catchingFishAsyncTaskRedux.CatchingFishParcelableFAB) {
                                        ((CatchingFishLayoutMVVMFlux) ((CatchingFishViewPagerMockk) catchingFishAsyncTaskRedux.CatchingFishReduxKtor).CatchingFishDaggerWebsocket).CatchingFishParcelableFAB();
                                        ((CatchingFishDaggerViewModel) catchingFishAsyncTaskRedux.CatchingFishCoroutine).CatchingFishCoroutine();
                                    }
                                } else if (motionEvent4.getActionMasked() != 10 && z3) {
                                    CatchingFishJobScheduler(motionEvent4, 10, motionEvent4.getEventTime(), true);
                                    motionEvent2 = motionEvent4;
                                }
                                boolean z4 = motionEvent.getToolType(0) != 3;
                                if (z3 && z4 && actionMasked2 != 3 && actionMasked2 != 9 && CatchingFishRoomDatabase(motionEvent)) {
                                    catchingFishGradleCameraX = this;
                                    catchingFishGradleCameraX.CatchingFishJobScheduler(motionEvent, 9, motionEvent.getEventTime(), true);
                                } else {
                                    catchingFishGradleCameraX = this;
                                }
                                if (motionEvent2 != null) {
                                    motionEvent2.recycle();
                                }
                                motionEvent3 = catchingFishGradleCameraX.CatchingFishGraphQLGlide;
                                if (motionEvent3 != null && motionEvent3.getAction() == 10) {
                                    MotionEvent motionEvent5 = catchingFishGradleCameraX.CatchingFishGraphQLGlide;
                                    pointerId = motionEvent5 == null ? motionEvent5.getPointerId(0) : -1;
                                    action = motionEvent.getAction();
                                    CatchingFishDatabindingFAB catchingFishDatabindingFAB = catchingFishGradleCameraX.CatchingFishFragmentFactory;
                                    if (action == 9 || motionEvent.getHistorySize() != 0) {
                                        if (motionEvent.getAction() == 0 && motionEvent.getHistorySize() == 0) {
                                            MotionEvent motionEvent6 = catchingFishGradleCameraX.CatchingFishGraphQLGlide;
                                            float x = motionEvent6 == null ? motionEvent6.getX() : Float.NaN;
                                            MotionEvent motionEvent7 = catchingFishGradleCameraX.CatchingFishGraphQLGlide;
                                            z2 = x == motionEvent.getX() || (motionEvent7 != null ? motionEvent7.getY() : Float.NaN) != motionEvent.getY();
                                            MotionEvent motionEvent8 = catchingFishGradleCameraX.CatchingFishGraphQLGlide;
                                            boolean z5 = (motionEvent8 == null ? motionEvent8.getEventTime() : -1L) == motionEvent.getEventTime();
                                            if (!z2 || z5) {
                                                if (pointerId >= 0) {
                                                    catchingFishDatabindingFAB.CatchingFishCoroutine.delete(pointerId);
                                                    catchingFishDatabindingFAB.CatchingFishSnackbar.delete(pointerId);
                                                }
                                                catchingFishDaggerViewModel = (CatchingFishDaggerViewModel) catchingFishAsyncTaskRedux.CatchingFishCoroutine;
                                                if (catchingFishDaggerViewModel.CatchingFishReduxKtor) {
                                                    catchingFishDaggerViewModel.CatchingFishViewModelScope.CatchingFishParcelableFAB.CatchingFishViewModelScope();
                                                } else {
                                                    catchingFishDaggerViewModel.CatchingFishReduxKtor = true;
                                                }
                                            }
                                        }
                                    } else if (pointerId >= 0) {
                                        catchingFishDatabindingFAB.CatchingFishCoroutine.delete(pointerId);
                                        catchingFishDatabindingFAB.CatchingFishSnackbar.delete(pointerId);
                                    }
                                }
                                catchingFishGradleCameraX.CatchingFishGraphQLGlide = MotionEvent.obtainNoHistory(motionEvent);
                                int CatchingFishMutableLiveData = CatchingFishMutableLiveData(motionEvent);
                                Trace.endSection();
                                catchingFishGradleCameraX.CatchingFishAnimation = false;
                                return CatchingFishMutableLiveData;
                            }
                        }
                        z = true;
                        if (z) {
                        }
                    } catch (Throwable th) {
                        th = th;
                        Trace.endSection();
                        throw th;
                    }
                }
                motionEvent2 = motionEvent4;
                if (motionEvent.getToolType(0) != 3) {
                }
                if (z3) {
                }
                catchingFishGradleCameraX = this;
                if (motionEvent2 != null) {
                }
                motionEvent3 = catchingFishGradleCameraX.CatchingFishGraphQLGlide;
                if (motionEvent3 != null) {
                    MotionEvent motionEvent52 = catchingFishGradleCameraX.CatchingFishGraphQLGlide;
                    if (motionEvent52 == null) {
                    }
                    action = motionEvent.getAction();
                    CatchingFishDatabindingFAB catchingFishDatabindingFAB2 = catchingFishGradleCameraX.CatchingFishFragmentFactory;
                    if (action == 9) {
                    }
                    if (motionEvent.getAction() == 0) {
                        MotionEvent motionEvent62 = catchingFishGradleCameraX.CatchingFishGraphQLGlide;
                        if (motionEvent62 == null) {
                        }
                        MotionEvent motionEvent72 = catchingFishGradleCameraX.CatchingFishGraphQLGlide;
                        if (motionEvent72 != null) {
                        }
                        if (x == motionEvent.getX()) {
                        }
                        MotionEvent motionEvent82 = catchingFishGradleCameraX.CatchingFishGraphQLGlide;
                        if ((motionEvent82 == null ? motionEvent82.getEventTime() : -1L) == motionEvent.getEventTime()) {
                        }
                        if (!z2) {
                        }
                        if (pointerId >= 0) {
                        }
                        catchingFishDaggerViewModel = (CatchingFishDaggerViewModel) catchingFishAsyncTaskRedux.CatchingFishCoroutine;
                        if (catchingFishDaggerViewModel.CatchingFishReduxKtor) {
                        }
                    }
                }
                catchingFishGradleCameraX.CatchingFishGraphQLGlide = MotionEvent.obtainNoHistory(motionEvent);
                int CatchingFishMutableLiveData2 = CatchingFishMutableLiveData(motionEvent);
                Trace.endSection();
                catchingFishGradleCameraX.CatchingFishAnimation = false;
                return CatchingFishMutableLiveData2;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            this.CatchingFishAnimation = false;
            throw th3;
        }
    }

    public final void CatchingFishParcelableFlux(CatchingFishBiometricRoom catchingFishBiometricRoom, boolean z, boolean z2) {
        CatchingFishBiometricRoom CatchingFishRoomDatabase;
        CatchingFishBiometricRoom CatchingFishRoomDatabase2;
        CatchingFishFragmentDagger catchingFishFragmentDagger = this.CatchingFishParcelable;
        if (!z) {
            if (catchingFishFragmentDagger.CatchingFishOkHttp(catchingFishBiometricRoom, z2)) {
                CatchingFishCustomView(catchingFishBiometricRoom);
                return;
            }
            return;
        }
        CatchingFishAsyncTaskDagger catchingFishAsyncTaskDagger = catchingFishFragmentDagger.CatchingFishSnackbar;
        CatchingFishBiometricRoom catchingFishBiometricRoom2 = catchingFishBiometricRoom.CatchingFishFragmentHandler;
        CatchingFishIntentPicasso catchingFishIntentPicasso = catchingFishBiometricRoom.CatchingFishPayPalService;
        if (catchingFishBiometricRoom2 == null) {
            CatchingFishFluxGradle.CatchingFishSnackbar("Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadScope");
        }
        int ordinal = catchingFishIntentPicasso.CatchingFishCoroutine.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return;
            }
            if (ordinal != 2 && ordinal != 3) {
                if (ordinal != 4) {
                    throw new CatchingFishBiometricView();
                }
                if (!catchingFishIntentPicasso.CatchingFishReduxKtor || z2) {
                    catchingFishIntentPicasso.CatchingFishReduxKtor = true;
                    catchingFishIntentPicasso.CatchingFishAnimationMockk.CatchingFishDaggerHiltFAB = true;
                    if (catchingFishBiometricRoom.CatchingFishLayoutInflater) {
                        return;
                    }
                    if ((CatchingFishFirebaseDagger.CatchingFishOkHttp(catchingFishBiometricRoom.CatchingFishMutableLiveData(), Boolean.TRUE) || CatchingFishFragmentDagger.CatchingFishWorkManager(catchingFishBiometricRoom)) && ((CatchingFishRoomDatabase = catchingFishBiometricRoom.CatchingFishRoomDatabase()) == null || !CatchingFishRoomDatabase.CatchingFishPayPalService.CatchingFishReduxKtor)) {
                        catchingFishAsyncTaskDagger.CatchingFishNavigation(catchingFishBiometricRoom, CatchingFishMVVMRoom.CatchingFishReduxKtor);
                    } else if ((catchingFishBiometricRoom.CatchingFishFragmentFactory() || CatchingFishFragmentDagger.CatchingFishViewModelScope(catchingFishBiometricRoom)) && ((CatchingFishRoomDatabase2 = catchingFishBiometricRoom.CatchingFishRoomDatabase()) == null || !CatchingFishRoomDatabase2.CatchingFishOkHttp())) {
                        catchingFishAsyncTaskDagger.CatchingFishNavigation(catchingFishBiometricRoom, CatchingFishMVVMRoom.CatchingFishWorkManager);
                    }
                    if (catchingFishFragmentDagger.CatchingFishReduxKtor) {
                        return;
                    }
                    CatchingFishCustomView(catchingFishBiometricRoom);
                    return;
                }
                return;
            }
        }
        catchingFishFragmentDagger.CatchingFishViewModelFAB.CatchingFishSnackbar(new CatchingFishWidgetBundle(catchingFishBiometricRoom, true, z2));
    }

    public final void CatchingFishPayPal() {
        if (this.CatchingFishAnimation) {
            return;
        }
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (currentAnimationTimeMillis != this.CatchingFishJUnitRealm) {
            this.CatchingFishJUnitRealm = currentAnimationTimeMillis;
            CatchingFishKtorWidget catchingFishKtorWidget = this.CatchingFishCameraX;
            float[] fArr = this.CatchingFishDataStoreIntent;
            catchingFishKtorWidget.CatchingFishParcelableFAB(this, fArr);
            CatchingFishGsonCardView.CatchingFishMVPRobolectric(fArr, this.CatchingFishStateFlow);
            ViewParent parent = getParent();
            View view = this;
            while (parent instanceof ViewGroup) {
                view = (View) parent;
                parent = ((ViewGroup) view).getParent();
            }
            int[] iArr = this.CatchingFishAppCompat;
            view.getLocationOnScreen(iArr);
            float f = iArr[0];
            float f2 = iArr[1];
            view.getLocationInWindow(iArr);
            float f3 = iArr[0];
            float f4 = f2 - iArr[1];
            this.CatchingFishMVVMAppCompat = (Float.floatToRawIntBits(f - f3) << 32) | (Float.floatToRawIntBits(f4) & 4294967295L);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void CatchingFishPayPalService() {
        boolean z;
        View view;
        long j;
        long CatchingFishStripeAPI;
        float[] fArr;
        int CatchingFishParcelableFAB;
        CatchingFishEspressoService catchingFishEspressoService;
        boolean z2;
        long j2;
        int[] iArr = this.CatchingFishAppCompat;
        getLocationOnScreen(iArr);
        long j3 = this.CatchingFishRecyclerView;
        int i = (int) (j3 >> 32);
        int i2 = (int) (j3 & 4294967295L);
        int i3 = iArr[0];
        if (i != i3 || i2 != iArr[1] || this.CatchingFishJUnitRealm < 0) {
            this.CatchingFishRecyclerView = (i3 << 32) | (iArr[1] & 4294967295L);
            if (i != Integer.MAX_VALUE && i2 != Integer.MAX_VALUE) {
                getRoot().CatchingFishPayPalService.CatchingFishAnimationMockk.CatchingFishStateFlow();
                z = true;
                CatchingFishPayPal();
                view = this.CatchingFishMVPHandler;
                if (view == null) {
                    view = getRootView();
                    this.CatchingFishMVPHandler = view;
                }
                CatchingFishPayPalGradle rectManager = getRectManager();
                j = this.CatchingFishRecyclerView;
                CatchingFishStripeAPI = CatchingFishLayoutRoomFAB.CatchingFishStripeAPI(this.CatchingFishMVVMAppCompat);
                int width = view.getWidth();
                int height = view.getHeight();
                rectManager.getClass();
                fArr = this.CatchingFishDataStoreIntent;
                CatchingFishParcelableFAB = CatchingFishLayoutRoom.CatchingFishParcelableFAB(fArr);
                catchingFishEspressoService = rectManager.CatchingFishSnackbar;
                if ((CatchingFishParcelableFAB & 2) != 0) {
                    fArr = null;
                }
                if (CatchingFishFirebaseDagger.CatchingFishCardViewView(CatchingFishStripeAPI, catchingFishEspressoService.CatchingFishCoroutine)) {
                    catchingFishEspressoService.CatchingFishCoroutine = CatchingFishStripeAPI;
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!CatchingFishFirebaseDagger.CatchingFishCardViewView(j, catchingFishEspressoService.CatchingFishReduxKtor)) {
                    catchingFishEspressoService.CatchingFishReduxKtor = j;
                    z2 = true;
                }
                if (fArr != null) {
                    z2 = true;
                }
                j2 = (width << 32) | (height & 4294967295L);
                if (j2 != catchingFishEspressoService.CatchingFishDaggerWebsocket) {
                    catchingFishEspressoService.CatchingFishDaggerWebsocket = j2;
                    z2 = true;
                }
                rectManager.CatchingFishDaggerWebsocket = !z2 || rectManager.CatchingFishDaggerWebsocket;
                this.CatchingFishParcelable.CatchingFishParcelableFAB(z);
                getRectManager().CatchingFishSnackbar();
            }
        }
        z = false;
        CatchingFishPayPal();
        view = this.CatchingFishMVPHandler;
        if (view == null) {
        }
        CatchingFishPayPalGradle rectManager2 = getRectManager();
        j = this.CatchingFishRecyclerView;
        CatchingFishStripeAPI = CatchingFishLayoutRoomFAB.CatchingFishStripeAPI(this.CatchingFishMVVMAppCompat);
        int width2 = view.getWidth();
        int height2 = view.getHeight();
        rectManager2.getClass();
        fArr = this.CatchingFishDataStoreIntent;
        CatchingFishParcelableFAB = CatchingFishLayoutRoom.CatchingFishParcelableFAB(fArr);
        catchingFishEspressoService = rectManager2.CatchingFishSnackbar;
        if ((CatchingFishParcelableFAB & 2) != 0) {
        }
        if (CatchingFishFirebaseDagger.CatchingFishCardViewView(CatchingFishStripeAPI, catchingFishEspressoService.CatchingFishCoroutine)) {
        }
        if (!CatchingFishFirebaseDagger.CatchingFishCardViewView(j, catchingFishEspressoService.CatchingFishReduxKtor)) {
        }
        if (fArr != null) {
        }
        j2 = (width2 << 32) | (height2 & 4294967295L);
        if (j2 != catchingFishEspressoService.CatchingFishDaggerWebsocket) {
        }
        rectManager2.CatchingFishDaggerWebsocket = !z2 || rectManager2.CatchingFishDaggerWebsocket;
        this.CatchingFishParcelable.CatchingFishParcelableFAB(z);
        getRectManager().CatchingFishSnackbar();
    }

    public final boolean CatchingFishRoomDatabase(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        return 0.0f <= x && x <= ((float) getWidth()) && 0.0f <= y && y <= ((float) getHeight());
    }

    public final void CatchingFishSensorManager(float f) {
        if (this.CatchingFishLayout) {
            if (f > 0.0f) {
                if (Float.isNaN(this.CatchingFishWebSocketMockk) || f > this.CatchingFishWebSocketMockk) {
                    this.CatchingFishWebSocketMockk = f;
                    return;
                }
                return;
            }
            if (f < 0.0f) {
                if (Float.isNaN(this.CatchingFishMVPReduxContext) || f < this.CatchingFishMVPReduxContext) {
                    this.CatchingFishMVPReduxContext = f;
                }
            }
        }
    }

    public final void CatchingFishSpannableWidget(CatchingFishBiometricRoom catchingFishBiometricRoom) {
        CatchingFishFABViewModel catchingFishFABViewModel = this.CatchingFishDaggerHiltFAB;
        catchingFishFABViewModel.CatchingFishParcelableFlux = true;
        if (catchingFishFABViewModel.CatchingFishCoroutineFlow()) {
            catchingFishFABViewModel.CatchingFishDaggerHiltFAB(catchingFishBiometricRoom);
        }
        CatchingFishFAB catchingFishFAB = this.CatchingFishSpannableWidget;
        catchingFishFAB.CatchingFishFragmentHandler = true;
        if (catchingFishFAB.CatchingFishViewModelFAB()) {
            catchingFishFAB.CatchingFishCloudMessaging.CatchingFish(CatchingFishRealmContext.CatchingFishParcelableFAB);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        addView(view, -1);
    }

    @Override // android.view.View
    public final void autofill(SparseArray sparseArray) {
        boolean isText;
        boolean isDate;
        boolean isList;
        boolean isToggle;
        CharSequence textValue;
        boolean isText2;
        boolean isDate2;
        boolean isList2;
        CatchingFishMVPMotionLayout CatchingFish;
        CatchingFishServiceHandler catchingFishServiceHandler;
        CharSequence textValue2;
        if (CatchingFishViewModelFAB()) {
            CatchingFishDataStoreMVVM catchingFishDataStoreMVVM = this.CatchingFishSensorManager;
            if (catchingFishDataStoreMVVM != null) {
                int size = sparseArray.size();
                for (int i = 0; i < size; i++) {
                    int keyAt = sparseArray.keyAt(i);
                    AutofillValue CatchingFishViewModelFAB = CatchingFishAnimation.CatchingFishViewModelFAB(sparseArray.get(keyAt));
                    isText2 = CatchingFishViewModelFAB.isText();
                    if (isText2) {
                        CatchingFishBiometricRoom catchingFishBiometricRoom = (CatchingFishBiometricRoom) catchingFishDataStoreMVVM.CatchingFishSnackbar.CatchingFishCoroutine.CatchingFishSnackbar(keyAt);
                        if (catchingFishBiometricRoom != null && (CatchingFish = catchingFishBiometricRoom.CatchingFish()) != null) {
                            Object CatchingFishViewModelScope = CatchingFish.CatchingFishReduxKtor.CatchingFishViewModelScope(CatchingFishViewStripeAPI.CatchingFishWorkManager);
                            if (CatchingFishViewModelScope == null) {
                                CatchingFishViewModelScope = null;
                            }
                            CatchingFishSnackbarToast catchingFishSnackbarToast = (CatchingFishSnackbarToast) CatchingFishViewModelScope;
                            if (catchingFishSnackbarToast != null && (catchingFishServiceHandler = (CatchingFishServiceHandler) catchingFishSnackbarToast.CatchingFishSnackbar) != null) {
                                textValue2 = CatchingFishViewModelFAB.getTextValue();
                            }
                        }
                    } else {
                        isDate2 = CatchingFishViewModelFAB.isDate();
                        if (!isDate2) {
                            isList2 = CatchingFishViewModelFAB.isList();
                            if (!isList2) {
                                CatchingFishViewModelFAB.isToggle();
                            }
                        }
                    }
                }
            }
            CatchingFishFluxFluxBundle catchingFishFluxFluxBundle = this.CatchingFishPayPalService;
            if (catchingFishFluxFluxBundle != null) {
                CatchingFishRoomLayout catchingFishRoomLayout = (CatchingFishRoomLayout) catchingFishFluxFluxBundle.CatchingFishDaggerWebsocket;
                if (catchingFishRoomLayout.CatchingFishParcelableFAB.isEmpty()) {
                    return;
                }
                int size2 = sparseArray.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    int keyAt2 = sparseArray.keyAt(i2);
                    AutofillValue CatchingFishViewModelFAB2 = CatchingFishAnimation.CatchingFishViewModelFAB(sparseArray.get(keyAt2));
                    isText = CatchingFishViewModelFAB2.isText();
                    if (isText) {
                        textValue = CatchingFishViewModelFAB2.getTextValue();
                        textValue.toString();
                        if (catchingFishRoomLayout.CatchingFishParcelableFAB.get(Integer.valueOf(keyAt2)) != null) {
                            throw new ClassCastException();
                        }
                    } else {
                        isDate = CatchingFishViewModelFAB2.isDate();
                        if (isDate) {
                            throw new CatchingFishManifestHilt("An operation is not implemented: b/138604541: Add onFill() callback for date");
                        }
                        isList = CatchingFishViewModelFAB2.isList();
                        if (isList) {
                            throw new CatchingFishManifestHilt("An operation is not implemented: b/138604541: Add onFill() callback for list");
                        }
                        isToggle = CatchingFishViewModelFAB2.isToggle();
                        if (isToggle) {
                            throw new CatchingFishManifestHilt("An operation is not implemented: b/138604541:  Add onFill() callback for toggle");
                        }
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        this.CatchingFishDaggerHiltFAB.CatchingFishEspressoTesting(this.CatchingFishReduxKtor, false);
        return false;
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        this.CatchingFishDaggerHiltFAB.CatchingFishEspressoTesting(this.CatchingFishReduxKtor, true);
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (!isAttachedToWindow()) {
            CatchingFishUnitTesting(getRoot());
        }
        CatchingFishJetpackCompose(true);
        CatchingFishIntentBundle.CatchingFishCloudMessaging().CatchingFishOkHttp();
        this.CatchingFishMVPRobolectric = true;
        CatchingFishManifestPayPal catchingFishManifestPayPal = this.CatchingFishUnitTesting;
        CatchingFishRoom catchingFishRoom = catchingFishManifestPayPal.CatchingFishParcelableFAB;
        Canvas canvas2 = catchingFishRoom.CatchingFishParcelableFAB;
        catchingFishRoom.CatchingFishParcelableFAB = canvas;
        getRoot().CatchingFishLayout(catchingFishRoom, null);
        catchingFishManifestPayPal.CatchingFishParcelableFAB.CatchingFishParcelableFAB = canvas2;
        ArrayList arrayList = this.CatchingFishPayPal;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((CatchingFishMVVMFABFAB) ((CatchingFishFABGlide) arrayList.get(i))).CatchingFishWorkManager();
            }
        }
        int i2 = CatchingFishGradleHiltMVVM.CatchingFishReduxKtor;
        arrayList.clear();
        this.CatchingFishMVPRobolectric = false;
        ArrayList arrayList2 = this.CatchingFishCardViewView;
        if (arrayList2 != null) {
            arrayList.addAll(arrayList2);
            arrayList2.clear();
        }
        if (this.CatchingFishLayout) {
            CatchingFishServiceFlux.CatchingFishParcelableFAB(this, this.CatchingFishWebSocketMockk);
            View view = this.CatchingFishViewModelFAB;
            if (view == null) {
                CatchingFishFirebaseDagger.CatchingFishDataStoreIntent("frameRateCategoryView");
                throw null;
            }
            CatchingFishServiceFlux.CatchingFishParcelableFAB(view, this.CatchingFishMVPReduxContext);
            if (!Float.isNaN(this.CatchingFishMVPReduxContext)) {
                view.invalidate();
                drawChild(canvas, view, getDrawingTime());
            }
            this.CatchingFishWebSocketMockk = Float.NaN;
            this.CatchingFishMVPReduxContext = Float.NaN;
        }
        getRectManager().CatchingFishSnackbar();
    }

    @Override // android.view.View
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        CatchingFishExoPlayerBundle catchingFishExoPlayerBundle;
        CatchingFishGlideContext catchingFishGlideContext;
        int size;
        CatchingFishExoPlayerBundle catchingFishExoPlayerBundle2;
        CatchingFishFABStripeAPIFAB catchingFishFABStripeAPIFAB;
        CatchingFishExoPlayerBundle catchingFishExoPlayerBundle3;
        if (this.CatchingFishPayPalHandler) {
            CatchingFishMVPLayout catchingFishMVPLayout = this.CatchingFishDynamicFeature;
            removeCallbacks(catchingFishMVPLayout);
            if (motionEvent.getActionMasked() == 8) {
                this.CatchingFishPayPalHandler = false;
            } else {
                catchingFishMVPLayout.run();
            }
        }
        if (CatchingFishStateLiveData(motionEvent) || !isAttachedToWindow()) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        if (motionEvent.getActionMasked() != 8) {
            if (!motionEvent.isFromSource(2)) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                Float.floatToRawIntBits(x);
                Float.floatToRawIntBits(y);
                motionEvent.getEventTime();
                motionEvent.getActionMasked();
                CatchingFishExoPlayerOkHttp catchingFishExoPlayerOkHttp = (CatchingFishExoPlayerOkHttp) getFocusOwner();
                if (catchingFishExoPlayerOkHttp.CatchingFishReduxKtor.CatchingFishDaggerWebsocket) {
                    System.out.println((Object) "FocusRelatedWarning: Dispatching indirect touch event while the focus system is invalidated.");
                } else {
                    CatchingFishAppCompatWidget CatchingFishNavigation = CatchingFishGsonCardView.CatchingFishNavigation(catchingFishExoPlayerOkHttp.CatchingFishCoroutine);
                    if (CatchingFishNavigation != null) {
                        CatchingFishFABStripeAPIFAB catchingFishFABStripeAPIFAB2 = CatchingFishNavigation.CatchingFishReduxKtor;
                        if (!catchingFishFABStripeAPIFAB2.CatchingFishRoomDatabase) {
                            CatchingFishFluxGradle.CatchingFishSnackbar("visitAncestors called on an unattached node");
                        }
                        CatchingFishBiometricRoom CatchingFishJobScheduler = CatchingFishXMLLayoutGlide.CatchingFishJobScheduler(CatchingFishNavigation);
                        while (CatchingFishJobScheduler != null) {
                            if ((((CatchingFishFABStripeAPIFAB) CatchingFishJobScheduler.CatchingFishJobScheduler.CatchingFishFragmentHandler).CatchingFishViewModelScope & 2097152) != 0) {
                                while (catchingFishFABStripeAPIFAB2 != null) {
                                    if ((catchingFishFABStripeAPIFAB2.CatchingFishWorkManager & 2097152) != 0) {
                                        for (CatchingFishFABStripeAPIFAB catchingFishFABStripeAPIFAB3 = catchingFishFABStripeAPIFAB2; catchingFishFABStripeAPIFAB3 != null; catchingFishFABStripeAPIFAB3 = null) {
                                        }
                                    }
                                    catchingFishFABStripeAPIFAB2 = catchingFishFABStripeAPIFAB2.CatchingFishViewModelFAB;
                                }
                            }
                            CatchingFishJobScheduler = CatchingFishJobScheduler.CatchingFishRoomDatabase();
                            catchingFishFABStripeAPIFAB2 = (CatchingFishJobScheduler == null || (catchingFishExoPlayerBundle = CatchingFishJobScheduler.CatchingFishJobScheduler) == null) ? null : (CatchingFishNavigationToast) catchingFishExoPlayerBundle.CatchingFishLayout;
                        }
                    }
                }
            }
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        if (!motionEvent.isFromSource(4194304)) {
            return (CatchingFishOkHttp(motionEvent) & 1) != 0;
        }
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        motionEvent.getAxisValue(26);
        Context context = getContext();
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            Method method = CatchingFishAdMobRoomRoom.CatchingFishParcelableFAB;
            CatchingFishJUnitMVVM.CatchingFishWorkManager(viewConfiguration);
        } else {
            CatchingFishAdMobRoomRoom.CatchingFishParcelableFAB(viewConfiguration, context);
        }
        Context context2 = getContext();
        if (i >= 26) {
            CatchingFishJUnitMVVM.CatchingFishDaggerWebsocket(viewConfiguration);
        } else {
            CatchingFishAdMobRoomRoom.CatchingFishParcelableFAB(viewConfiguration, context2);
        }
        motionEvent.getEventTime();
        motionEvent.getDeviceId();
        CatchingFishExoPlayerOkHttp catchingFishExoPlayerOkHttp2 = (CatchingFishExoPlayerOkHttp) getFocusOwner();
        if (catchingFishExoPlayerOkHttp2.CatchingFishReduxKtor.CatchingFishDaggerWebsocket) {
            System.out.println((Object) "FocusRelatedWarning: Dispatching rotary event while the focus system is invalidated.");
            return false;
        }
        CatchingFishAppCompatWidget CatchingFishNavigation2 = CatchingFishGsonCardView.CatchingFishNavigation(catchingFishExoPlayerOkHttp2.CatchingFishCoroutine);
        if (CatchingFishNavigation2 != null) {
            CatchingFishFABStripeAPIFAB catchingFishFABStripeAPIFAB4 = CatchingFishNavigation2.CatchingFishReduxKtor;
            if (!catchingFishFABStripeAPIFAB4.CatchingFishRoomDatabase) {
                CatchingFishFluxGradle.CatchingFishSnackbar("visitAncestors called on an unattached node");
            }
            CatchingFishBiometricRoom CatchingFishJobScheduler2 = CatchingFishXMLLayoutGlide.CatchingFishJobScheduler(CatchingFishNavigation2);
            loop0: while (true) {
                if (CatchingFishJobScheduler2 == null) {
                    catchingFishFABStripeAPIFAB = null;
                    break;
                }
                if ((((CatchingFishFABStripeAPIFAB) CatchingFishJobScheduler2.CatchingFishJobScheduler.CatchingFishFragmentHandler).CatchingFishViewModelScope & 16384) != 0) {
                    while (catchingFishFABStripeAPIFAB4 != null) {
                        if ((catchingFishFABStripeAPIFAB4.CatchingFishWorkManager & 16384) != 0) {
                            catchingFishFABStripeAPIFAB = catchingFishFABStripeAPIFAB4;
                            while (catchingFishFABStripeAPIFAB != null) {
                                if (catchingFishFABStripeAPIFAB instanceof CatchingFishGlideContext) {
                                    break loop0;
                                }
                                catchingFishFABStripeAPIFAB = null;
                            }
                        }
                        catchingFishFABStripeAPIFAB4 = catchingFishFABStripeAPIFAB4.CatchingFishViewModelFAB;
                    }
                }
                CatchingFishJobScheduler2 = CatchingFishJobScheduler2.CatchingFishRoomDatabase();
                catchingFishFABStripeAPIFAB4 = (CatchingFishJobScheduler2 == null || (catchingFishExoPlayerBundle3 = CatchingFishJobScheduler2.CatchingFishJobScheduler) == null) ? null : (CatchingFishNavigationToast) catchingFishExoPlayerBundle3.CatchingFishLayout;
            }
            catchingFishGlideContext = (CatchingFishGlideContext) catchingFishFABStripeAPIFAB;
        } else {
            catchingFishGlideContext = null;
        }
        if (catchingFishGlideContext != null) {
            CatchingFishFABStripeAPIFAB catchingFishFABStripeAPIFAB5 = catchingFishGlideContext.CatchingFishReduxKtor;
            if (!catchingFishFABStripeAPIFAB5.CatchingFishRoomDatabase) {
                CatchingFishFluxGradle.CatchingFishSnackbar("visitAncestors called on an unattached node");
            }
            CatchingFishFABStripeAPIFAB catchingFishFABStripeAPIFAB6 = catchingFishFABStripeAPIFAB5.CatchingFishViewModelFAB;
            CatchingFishBiometricRoom CatchingFishJobScheduler3 = CatchingFishXMLLayoutGlide.CatchingFishJobScheduler(catchingFishGlideContext);
            ArrayList arrayList = null;
            while (CatchingFishJobScheduler3 != null) {
                if ((((CatchingFishFABStripeAPIFAB) CatchingFishJobScheduler3.CatchingFishJobScheduler.CatchingFishFragmentHandler).CatchingFishViewModelScope & 16384) != 0) {
                    while (catchingFishFABStripeAPIFAB6 != null) {
                        if ((catchingFishFABStripeAPIFAB6.CatchingFishWorkManager & 16384) != 0) {
                            for (CatchingFishFABStripeAPIFAB catchingFishFABStripeAPIFAB7 = catchingFishFABStripeAPIFAB6; catchingFishFABStripeAPIFAB7 != null; catchingFishFABStripeAPIFAB7 = null) {
                                if (catchingFishFABStripeAPIFAB7 instanceof CatchingFishGlideContext) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(catchingFishFABStripeAPIFAB7);
                                }
                            }
                        }
                        catchingFishFABStripeAPIFAB6 = catchingFishFABStripeAPIFAB6.CatchingFishViewModelFAB;
                    }
                }
                CatchingFishJobScheduler3 = CatchingFishJobScheduler3.CatchingFishRoomDatabase();
                catchingFishFABStripeAPIFAB6 = (CatchingFishJobScheduler3 == null || (catchingFishExoPlayerBundle2 = CatchingFishJobScheduler3.CatchingFishJobScheduler) == null) ? null : (CatchingFishNavigationToast) catchingFishExoPlayerBundle2.CatchingFishLayout;
            }
            if (arrayList != null && arrayList.size() - 1 >= 0) {
                while (true) {
                    int i2 = size - 1;
                    ((CatchingFishGlideContext) arrayList.get(size)).getClass();
                    if (i2 < 0) {
                        break;
                    }
                    size = i2;
                }
            }
            for (CatchingFishFABStripeAPIFAB catchingFishFABStripeAPIFAB8 = catchingFishFABStripeAPIFAB5; catchingFishFABStripeAPIFAB8 != null; catchingFishFABStripeAPIFAB8 = null) {
                if (catchingFishFABStripeAPIFAB8 instanceof CatchingFishGlideContext) {
                }
            }
            if (!super.dispatchGenericMotionEvent(motionEvent)) {
                while (catchingFishFABStripeAPIFAB5 != null) {
                    if (catchingFishFABStripeAPIFAB5 instanceof CatchingFishGlideContext) {
                    }
                    catchingFishFABStripeAPIFAB5 = null;
                }
                if (arrayList != null) {
                    int size2 = arrayList.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        CatchingFishMVI catchingFishMVI = ((CatchingFishGlideContext) arrayList.get(i3)).CatchingFishNavigation;
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x0159, code lost:
    
        if (CatchingFishNavigation(r24) == false) goto L69;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        int i;
        boolean z = this.CatchingFishPayPalHandler;
        CatchingFishMVPLayout catchingFishMVPLayout = this.CatchingFishDynamicFeature;
        if (z) {
            removeCallbacks(catchingFishMVPLayout);
            catchingFishMVPLayout.run();
        }
        if (!CatchingFishStateLiveData(motionEvent) && isAttachedToWindow()) {
            CatchingFishFABViewModel catchingFishFABViewModel = this.CatchingFishDaggerHiltFAB;
            CatchingFishGradleCameraX catchingFishGradleCameraX = catchingFishFABViewModel.CatchingFishReduxKtor;
            AccessibilityManager accessibilityManager = catchingFishFABViewModel.CatchingFishViewModelScope;
            if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
                int action = motionEvent.getAction();
                if (action == 7 || action == 9) {
                    float x = motionEvent.getX();
                    float y = motionEvent.getY();
                    catchingFishGradleCameraX.CatchingFishJetpackCompose(true);
                    CatchingFishStripeAPIOkHttp catchingFishStripeAPIOkHttp = new CatchingFishStripeAPIOkHttp();
                    CatchingFishExoPlayerBundle catchingFishExoPlayerBundle = catchingFishGradleCameraX.getRoot().CatchingFishJobScheduler;
                    CatchingFishDaggerToolbar catchingFishDaggerToolbar = (CatchingFishDaggerToolbar) catchingFishExoPlayerBundle.CatchingFishViewModelFAB;
                    CatchingFishMockkLiveData catchingFishMockkLiveData = CatchingFishDaggerToolbar.CatchingFishCameraXIntent;
                    ((CatchingFishDaggerToolbar) catchingFishExoPlayerBundle.CatchingFishViewModelFAB).CatchingFishLifecycle(CatchingFishDaggerToolbar.CatchingFishGradleManifest, catchingFishDaggerToolbar.CatchingFishKtorService((Float.floatToRawIntBits(x) << 32) | (Float.floatToRawIntBits(y) & 4294967295L)), catchingFishStripeAPIOkHttp, 1, true);
                    for (int CatchingFishMotionLayout = CatchingFishToastCustomView.CatchingFishMotionLayout(catchingFishStripeAPIOkHttp); -1 < CatchingFishMotionLayout; CatchingFishMotionLayout--) {
                        Object CatchingFishDaggerWebsocket = catchingFishStripeAPIOkHttp.CatchingFishReduxKtor.CatchingFishDaggerWebsocket(CatchingFishMotionLayout);
                        CatchingFishFirebaseDagger.CatchingFishStateLiveData(CatchingFishDaggerWebsocket, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
                        CatchingFishBiometricRoom CatchingFishJobScheduler = CatchingFishXMLLayoutGlide.CatchingFishJobScheduler((CatchingFishFABStripeAPIFAB) CatchingFishDaggerWebsocket);
                        if (catchingFishGradleCameraX.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().get(CatchingFishJobScheduler) != null) {
                            break;
                        }
                        if (CatchingFishJobScheduler.CatchingFishJobScheduler.CatchingFishViewModelFAB(8)) {
                            int CatchingFishSpannableWidget = catchingFishFABViewModel.CatchingFishSpannableWidget(CatchingFishJobScheduler.CatchingFishDaggerWebsocket);
                            CatchingFishMVIGraphQLHilt CatchingFishSnackbar = CatchingFishDaggerBiometric.CatchingFishSnackbar(CatchingFishJobScheduler, false);
                            if (CatchingFishAdMobFAB.CatchingFishCardViewView(CatchingFishSnackbar)) {
                                if (!CatchingFishSnackbar.CatchingFishCloudMessaging().CatchingFishReduxKtor.CatchingFishCoroutine(CatchingFishServiceMVI.CatchingFishSpannableWidget)) {
                                    i = CatchingFishSpannableWidget;
                                    break;
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                    i = Integer.MIN_VALUE;
                    catchingFishGradleCameraX.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(motionEvent);
                    int i2 = catchingFishFABViewModel.CatchingFishDaggerWebsocket;
                    if (i2 != i) {
                        catchingFishFABViewModel.CatchingFishDaggerWebsocket = i;
                        CatchingFishFABViewModel.CatchingFishPayPal(catchingFishFABViewModel, i, 128, null, 12);
                        CatchingFishFABViewModel.CatchingFishPayPal(catchingFishFABViewModel, i2, 256, null, 12);
                    }
                } else if (action == 10) {
                    int i3 = catchingFishFABViewModel.CatchingFishDaggerWebsocket;
                    if (i3 == Integer.MIN_VALUE) {
                        catchingFishGradleCameraX.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(motionEvent);
                    } else if (i3 != Integer.MIN_VALUE) {
                        catchingFishFABViewModel.CatchingFishDaggerWebsocket = Integer.MIN_VALUE;
                        CatchingFishFABViewModel.CatchingFishPayPal(catchingFishFABViewModel, Integer.MIN_VALUE, 128, null, 12);
                        CatchingFishFABViewModel.CatchingFishPayPal(catchingFishFABViewModel, i3, 256, null, 12);
                    }
                }
            }
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 7) {
                if (actionMasked == 10 && CatchingFishRoomDatabase(motionEvent)) {
                    if (motionEvent.getToolType(0) != 3 || motionEvent.getButtonState() == 0) {
                        MotionEvent motionEvent2 = this.CatchingFishGraphQLGlide;
                        if (motionEvent2 != null) {
                            motionEvent2.recycle();
                        }
                        this.CatchingFishGraphQLGlide = MotionEvent.obtainNoHistory(motionEvent);
                        this.CatchingFishPayPalHandler = true;
                        postDelayed(catchingFishMVPLayout, 8L);
                        return false;
                    }
                }
                if ((CatchingFishOkHttp(motionEvent) & 1) != 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!isFocused()) {
            return ((CatchingFishExoPlayerOkHttp) getFocusOwner()).CatchingFishReduxKtor(keyEvent, new CatchingFishAppCompatJUnit(0, this, keyEvent));
        }
        int metaState = keyEvent.getMetaState();
        this.CatchingFishOkHttp.getClass();
        CatchingFishToastRetrofit.CatchingFishParcelableFAB.setValue(new CatchingFishGlideGlide(metaState));
        return ((CatchingFishExoPlayerOkHttp) getFocusOwner()).CatchingFishReduxKtor(keyEvent, CatchingFishLayoutAnimation.CatchingFishCloudMessaging) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        CatchingFishExoPlayerBundle catchingFishExoPlayerBundle;
        if (isFocused()) {
            CatchingFishExoPlayerOkHttp catchingFishExoPlayerOkHttp = (CatchingFishExoPlayerOkHttp) getFocusOwner();
            if (catchingFishExoPlayerOkHttp.CatchingFishReduxKtor.CatchingFishDaggerWebsocket) {
                System.out.println((Object) "FocusRelatedWarning: Dispatching intercepted soft keyboard event while the focus system is invalidated.");
            } else {
                CatchingFishAppCompatWidget CatchingFishNavigation = CatchingFishGsonCardView.CatchingFishNavigation(catchingFishExoPlayerOkHttp.CatchingFishCoroutine);
                if (CatchingFishNavigation != null) {
                    CatchingFishFABStripeAPIFAB catchingFishFABStripeAPIFAB = CatchingFishNavigation.CatchingFishReduxKtor;
                    if (!catchingFishFABStripeAPIFAB.CatchingFishRoomDatabase) {
                        CatchingFishFluxGradle.CatchingFishSnackbar("visitAncestors called on an unattached node");
                    }
                    CatchingFishBiometricRoom CatchingFishJobScheduler = CatchingFishXMLLayoutGlide.CatchingFishJobScheduler(CatchingFishNavigation);
                    while (CatchingFishJobScheduler != null) {
                        if ((((CatchingFishFABStripeAPIFAB) CatchingFishJobScheduler.CatchingFishJobScheduler.CatchingFishFragmentHandler).CatchingFishViewModelScope & 131072) != 0) {
                            while (catchingFishFABStripeAPIFAB != null) {
                                if ((catchingFishFABStripeAPIFAB.CatchingFishWorkManager & 131072) != 0) {
                                    for (CatchingFishFABStripeAPIFAB catchingFishFABStripeAPIFAB2 = catchingFishFABStripeAPIFAB; catchingFishFABStripeAPIFAB2 != null; catchingFishFABStripeAPIFAB2 = null) {
                                    }
                                }
                                catchingFishFABStripeAPIFAB = catchingFishFABStripeAPIFAB.CatchingFishViewModelFAB;
                            }
                        }
                        CatchingFishJobScheduler = CatchingFishJobScheduler.CatchingFishRoomDatabase();
                        catchingFishFABStripeAPIFAB = (CatchingFishJobScheduler == null || (catchingFishExoPlayerBundle = CatchingFishJobScheduler.CatchingFishJobScheduler) == null) ? null : (CatchingFishNavigationToast) catchingFishExoPlayerBundle.CatchingFishLayout;
                    }
                }
            }
        }
        return super.dispatchKeyEventPreIme(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideStructure(ViewStructure viewStructure) {
        if (Build.VERSION.SDK_INT < 28) {
            CatchingFishAdMobCustomView.CatchingFishParcelableFAB.CatchingFishParcelableFAB(viewStructure, getView());
        } else {
            super.dispatchProvideStructure(viewStructure);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.CatchingFishPayPalHandler) {
            CatchingFishMVPLayout catchingFishMVPLayout = this.CatchingFishDynamicFeature;
            removeCallbacks(catchingFishMVPLayout);
            MotionEvent motionEvent2 = this.CatchingFishGraphQLGlide;
            CatchingFishFirebaseDagger.CatchingFishAnimationMockk(motionEvent2);
            if (motionEvent.getActionMasked() == 0 && motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) {
                this.CatchingFishPayPalHandler = false;
            } else {
                catchingFishMVPLayout.run();
            }
        }
        if (!CatchingFishStateLiveData(motionEvent) && isAttachedToWindow() && (motionEvent.getActionMasked() != 2 || CatchingFishNavigation(motionEvent))) {
            int CatchingFishOkHttp = CatchingFishOkHttp(motionEvent);
            if ((CatchingFishOkHttp & 2) != 0) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            if ((CatchingFishOkHttp & 1) != 0) {
                return true;
            }
        }
        return false;
    }

    public final View findViewByAccessibilityIdTraversal(int i) {
        try {
            if (Build.VERSION.SDK_INT < 29) {
                return CatchingFishCloudMessaging(this, i);
            }
            Method declaredMethod = View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", Integer.TYPE);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(this, Integer.valueOf(i));
            if (invoke instanceof View) {
                return (View) invoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final View focusSearch(View view, int i) {
        CatchingFishFluxExoPlayer CatchingFishCloudMessaging;
        if (view == null || this.CatchingFishParcelable.CatchingFishCoroutine) {
            return super.focusSearch(view, i);
        }
        Object obj = CatchingFishServiceMVPFlux.CatchingFishWorkManager.get();
        CatchingFishFirebaseDagger.CatchingFishAnimationMockk(obj);
        View CatchingFishSnackbar = ((CatchingFishServiceMVPFlux) obj).CatchingFishSnackbar(i, view, this);
        if (view == this) {
            CatchingFishAppCompatWidget CatchingFishNavigation = CatchingFishGsonCardView.CatchingFishNavigation(((CatchingFishExoPlayerOkHttp) getFocusOwner()).CatchingFishCoroutine);
            CatchingFishCloudMessaging = CatchingFishNavigation != null ? CatchingFishGsonCardView.CatchingFishJetpackCompose(CatchingFishNavigation) : null;
            if (CatchingFishCloudMessaging == null) {
                CatchingFishCloudMessaging = CatchingFishRobolectricHilt.CatchingFishCloudMessaging(view, this);
            }
        } else {
            CatchingFishCloudMessaging = CatchingFishRobolectricHilt.CatchingFishCloudMessaging(view, this);
        }
        CatchingFishViewPagerFAB CatchingFishDataStoreIntent = CatchingFishRobolectricHilt.CatchingFishDataStoreIntent(i);
        int i2 = CatchingFishDataStoreIntent != null ? CatchingFishDataStoreIntent.CatchingFishParcelableFAB : 6;
        CatchingFishRoomGoogleMaps catchingFishRoomGoogleMaps = new CatchingFishRoomGoogleMaps();
        if (((CatchingFishExoPlayerOkHttp) getFocusOwner()).CatchingFishDaggerWebsocket(i2, CatchingFishCloudMessaging, new CatchingFishMVVM(1, catchingFishRoomGoogleMaps)) != null) {
            Object obj2 = catchingFishRoomGoogleMaps.CatchingFishReduxKtor;
            if (obj2 != null) {
                if (CatchingFishSnackbar != null) {
                    if (i2 == 1 || i2 == 2) {
                        return super.focusSearch(view, i);
                    }
                    if (CatchingFishOkHttpFAB.CatchingFishMVPRobolectric(CatchingFishGsonCardView.CatchingFishJetpackCompose((CatchingFishAppCompatWidget) obj2), CatchingFishRobolectricHilt.CatchingFishCloudMessaging(CatchingFishSnackbar, this), CatchingFishCloudMessaging, i2)) {
                    }
                }
                return this;
            }
            if (CatchingFishSnackbar == null) {
            }
            return CatchingFishSnackbar;
        }
        return view;
    }

    public final CatchingFishGlideService getAndroidViewsHandler$ui_release() {
        if (this.CatchingFishGradleManifest == null) {
            CatchingFishGlideService catchingFishGlideService = new CatchingFishGlideService(getContext());
            this.CatchingFishGradleManifest = catchingFishGlideService;
            addView(catchingFishGlideService, -1);
            requestLayout();
        }
        CatchingFishGlideService catchingFishGlideService2 = this.CatchingFishGradleManifest;
        CatchingFishFirebaseDagger.CatchingFishAnimationMockk(catchingFishGlideService2);
        return catchingFishGlideService2;
    }

    public CatchingFishAndroidXMoshi getAutofill() {
        return this.CatchingFishPayPalService;
    }

    public CatchingFishUnitTestingRoom getAutofillManager() {
        return this.CatchingFishSensorManager;
    }

    public CatchingFishRoomLayout getAutofillTree() {
        return this.CatchingFishCardViewRealm;
    }

    public final CatchingFishServiceHandler getConfigurationChangeObserver() {
        return this.CatchingFishJobScheduler;
    }

    public final CatchingFishFAB getContentCaptureManager$ui_release() {
        return this.CatchingFishSpannableWidget;
    }

    public CatchingFishManifestMockk getCoroutineContext() {
        return this.CatchingFishCloudMessaging;
    }

    public CatchingFishOkHttpFlux getDensity() {
        return (CatchingFishOkHttpFlux) this.CatchingFishViewModelScope.getValue();
    }

    public CatchingFishFluxExoPlayer getEmbeddedViewFocusRect() {
        if (isFocused()) {
            CatchingFishAppCompatWidget CatchingFishNavigation = CatchingFishGsonCardView.CatchingFishNavigation(((CatchingFishExoPlayerOkHttp) getFocusOwner()).CatchingFishCoroutine);
            if (CatchingFishNavigation != null) {
                return CatchingFishGsonCardView.CatchingFishJetpackCompose(CatchingFishNavigation);
            }
            return null;
        }
        View findFocus = findFocus();
        if (findFocus != null) {
            return CatchingFishRobolectricHilt.CatchingFishCloudMessaging(findFocus, this);
        }
        return null;
    }

    public CatchingFishViewManifest getFocusOwner() {
        return this.CatchingFishFragmentHandler;
    }

    @Override // android.view.View
    public final void getFocusedRect(Rect rect) {
        CatchingFishFluxExoPlayer embeddedViewFocusRect = getEmbeddedViewFocusRect();
        if (embeddedViewFocusRect != null) {
            rect.left = Math.round(embeddedViewFocusRect.CatchingFishParcelableFAB);
            rect.top = Math.round(embeddedViewFocusRect.CatchingFishSnackbar);
            rect.right = Math.round(embeddedViewFocusRect.CatchingFishCoroutine);
            rect.bottom = Math.round(embeddedViewFocusRect.CatchingFishReduxKtor);
            return;
        }
        if (CatchingFishFirebaseDagger.CatchingFishOkHttp(((CatchingFishExoPlayerOkHttp) getFocusOwner()).CatchingFishDaggerWebsocket(6, null, CatchingFishMVI.CatchingFishViewModelScope), Boolean.TRUE)) {
            super.getFocusedRect(rect);
        } else {
            rect.set(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        }
    }

    public CatchingFishFragmentView getFontFamilyResolver() {
        return (CatchingFishFragmentView) this.CatchingFishRetrofitMVI.getValue();
    }

    public CatchingFishViewXMLLayout getFontLoader() {
        return this.CatchingFishFirebase;
    }

    public CatchingFishHandlerSnackbar getGraphicsContext() {
        return this.CatchingFishGsonAppCompat;
    }

    public CatchingFishMockkGson getHapticFeedBack() {
        return this.CatchingFishView;
    }

    public boolean getHasPendingMeasureOrLayout() {
        return this.CatchingFishParcelable.CatchingFishSnackbar.CatchingFishLayoutInflater();
    }

    @Override // android.view.View
    public int getImportantForAutofill() {
        return 1;
    }

    public CatchingFishWidgetMockk getInputModeManager() {
        return this.CatchingFishServiceMVIJUnit;
    }

    public final CatchingFishXMLLayoutRoom getInsetsListener() {
        return this.CatchingFishStateLiveData;
    }

    public final long getLastMatrixRecalculationAnimationTime$ui_release() {
        return this.CatchingFishJUnitRealm;
    }

    @Override // android.view.View, android.view.ViewParent
    public CatchingFishGradleMVPKtor getLayoutDirection() {
        return (CatchingFishGradleMVPKtor) this.CatchingFishRetrofit.getValue();
    }

    public long getMeasureIteration() {
        CatchingFishFragmentDagger catchingFishFragmentDagger = this.CatchingFishParcelable;
        if (!catchingFishFragmentDagger.CatchingFishCoroutine) {
            CatchingFishFluxGradle.CatchingFishParcelableFAB("measureIteration should be only used during the measure/layout pass");
        }
        return catchingFishFragmentDagger.CatchingFishViewModelScope;
    }

    public CatchingFishToolbarPicasso getModifierLocalManager() {
        return this.CatchingFishGlideWidgetKtor;
    }

    public CatchingFishEspressoViewFAB getPlacementScope() {
        int i = CatchingFishGoogleMapsGlide.CatchingFishSnackbar;
        return new CatchingFishJUnitGraphQLMVI(1, this);
    }

    public CatchingFishHiltCustomView getPointerIconService() {
        return this.CatchingFishDaggerAppCompat;
    }

    public CatchingFishPayPalGradle getRectManager() {
        return this.CatchingFish;
    }

    public CatchingFishBiometricRoom getRoot() {
        return this.CatchingFishRoomDatabase;
    }

    public CatchingFishRoomDagger getRootForTest() {
        return this.CatchingFishJetpackCompose;
    }

    public final boolean getScrollCaptureInProgress$ui_release() {
        CatchingFishEspressoLayout catchingFishEspressoLayout;
        if (Build.VERSION.SDK_INT < 31 || (catchingFishEspressoLayout = this.CatchingFishKtor) == null) {
            return false;
        }
        return ((Boolean) catchingFishEspressoLayout.CatchingFishParcelableFAB.getValue()).booleanValue();
    }

    public CatchingFishMVPManifest getSemanticsOwner() {
        return this.CatchingFishCoroutineFlow;
    }

    public CatchingFishDaggerHiltJUnit getSharedDrawScope() {
        return this.CatchingFishWorkManager;
    }

    public boolean getShowLayoutBounds() {
        return Build.VERSION.SDK_INT >= 30 ? CatchingFishNavigationJUnit.CatchingFishParcelableFAB.CatchingFishParcelableFAB(this) : this.CatchingFishPayPalLiveData;
    }

    public CatchingFishGlideBiometric getSnapshotObserver() {
        return this.CatchingFishHandler;
    }

    public CatchingFishPicassoKtor getSoftwareKeyboardController() {
        return this.CatchingFishPicasso;
    }

    public CatchingFishWidgetCameraX getTextInputService() {
        return this.CatchingFishMockkOkHttp;
    }

    public CatchingFishPicassoFirebase getTextToolbar() {
        return this.CatchingFishFABLayout;
    }

    public final CatchingFishAdMobExoPlayer getUncaughtExceptionHandler$ui_release() {
        return null;
    }

    public CatchingFishAdMobReduxFlux getViewConfiguration() {
        return this.CatchingFishAnimationMockk;
    }

    public final CatchingFishWidgetAdMob getViewTreeOwners() {
        return (CatchingFishWidgetAdMob) this.CatchingFishMoshiDaggerHilt.getValue();
    }

    public CatchingFishCardViewFABGson getWindowInfo() {
        return this.CatchingFishOkHttp;
    }

    public final CatchingFishDataStoreMVVM get_autofillManager$ui_release() {
        return this.CatchingFishSensorManager;
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.util.Collection] */
    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        CatchingFishToolbarToast CatchingFishDaggerWebsocket;
        CatchingFishToastFlux catchingFishToastFlux;
        CatchingFishFluxFluxBundle catchingFishFluxFluxBundle;
        super.onAttachedToWindow();
        int i = Build.VERSION.SDK_INT;
        if (i < 30) {
            setShowLayoutBounds(CatchingFishRobolectricHilt.CatchingFishSpannableWidget());
        }
        this.CatchingFishStateLiveData.onViewAttachedToWindow(this);
        if (i > 28) {
            if (CatchingFishExoPlayer == null) {
                CatchingFishKtorLifecycle catchingFishKtorLifecycle = new CatchingFishKtorLifecycle(r2);
                CatchingFishExoPlayer = catchingFishKtorLifecycle;
                StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
                try {
                    if (CatchingFishLiveDataRoom == null) {
                        CatchingFishLiveDataRoom = Class.forName("android.os.SystemProperties");
                    }
                    if (CatchingFishContextToast == null) {
                        StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
                        Class cls = CatchingFishLiveDataRoom;
                        CatchingFishContextToast = cls != null ? cls.getDeclaredMethod("addChangeCallback", Runnable.class) : null;
                    }
                    Method method = CatchingFishContextToast;
                    if (method != null) {
                        method.invoke(null, catchingFishKtorLifecycle);
                    }
                } catch (Throwable unused) {
                }
                StrictMode.setVmPolicy(vmPolicy);
            }
            CatchingFishBundleGradle catchingFishBundleGradle = CatchingFishToolbar;
            synchronized (catchingFishBundleGradle) {
                catchingFishBundleGradle.CatchingFishParcelableFAB(this);
            }
        }
        this.CatchingFishOkHttp.CatchingFishParcelableFAB.setValue(Boolean.valueOf(hasWindowFocus()));
        this.CatchingFishOkHttp.getClass();
        this.CatchingFishOkHttp.getClass();
        CatchingFishAnimationMockk(getRoot());
        CatchingFishUnitTesting(getRoot());
        CatchingFishViewMVPAndroidX catchingFishViewMVPAndroidX = getSnapshotObserver().CatchingFishParcelableFAB;
        CatchingFishCoroutineLayout catchingFishCoroutineLayout = catchingFishViewMVPAndroidX.CatchingFishReduxKtor;
        CatchingFishIntentBundle.CatchingFishWorkManager(CatchingFishIntentBundle.CatchingFishParcelableFAB);
        synchronized (CatchingFishIntentBundle.CatchingFishCoroutine) {
            CatchingFishIntentBundle.CatchingFishViewModelFAB = CatchingFishCameraXCameraX.CatchingFishStripeAPI(CatchingFishIntentBundle.CatchingFishViewModelFAB, catchingFishCoroutineLayout);
        }
        catchingFishViewMVPAndroidX.CatchingFishViewModelFAB = new CatchingFishLayoutCoroutine(5, catchingFishCoroutineLayout);
        if (CatchingFishViewModelFAB() && (catchingFishFluxFluxBundle = this.CatchingFishPayPalService) != null) {
            CatchingFishHandlerFragment catchingFishHandlerFragment = CatchingFishHandlerFragment.CatchingFishParcelableFAB;
            catchingFishHandlerFragment.getClass();
            ((AutofillManager) catchingFishFluxFluxBundle.CatchingFishWorkManager).registerCallback(CatchingFishAnimation.CatchingFishWorkManager(catchingFishHandlerFragment));
        }
        CatchingFishToastFlux CatchingFishOkHttp = CatchingFishHiltMVPToast.CatchingFishOkHttp(this);
        CatchingFishJUnitLiveData CatchingFishDaggerHiltFAB = CatchingFishOkHttpFAB.CatchingFishDaggerHiltFAB(this);
        CatchingFishWidgetAdMob viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners == null || (CatchingFishOkHttp != null && CatchingFishDaggerHiltFAB != null && (CatchingFishOkHttp != (catchingFishToastFlux = viewTreeOwners.CatchingFishParcelableFAB) || CatchingFishDaggerHiltFAB != catchingFishToastFlux))) {
            if (CatchingFishOkHttp == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
            }
            if (CatchingFishDaggerHiltFAB == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagateViewTreeSavedStateRegistryOwner!");
            }
            if (viewTreeOwners != null && (CatchingFishDaggerWebsocket = viewTreeOwners.CatchingFishParcelableFAB.CatchingFishDaggerWebsocket()) != null) {
                CatchingFishDaggerWebsocket.CatchingFishWorkManager(this);
            }
            CatchingFishOkHttp.CatchingFishDaggerWebsocket().CatchingFishParcelableFAB(this);
            CatchingFishWidgetAdMob catchingFishWidgetAdMob = new CatchingFishWidgetAdMob(CatchingFishOkHttp, CatchingFishDaggerHiltFAB);
            set_viewTreeOwners(catchingFishWidgetAdMob);
            CatchingFishServiceHandler catchingFishServiceHandler = this.CatchingFishAndroidX;
            if (catchingFishServiceHandler != null) {
                catchingFishServiceHandler.CatchingFishFragmentHandler(catchingFishWidgetAdMob);
            }
            this.CatchingFishAndroidX = null;
        }
        this.CatchingFishServiceMVIJUnit.CatchingFishParcelableFAB.setValue(new CatchingFishMVVMViewPager(isInTouchMode() ? 1 : 2));
        CatchingFishWidgetAdMob viewTreeOwners2 = getViewTreeOwners();
        CatchingFishToolbarToast CatchingFishDaggerWebsocket2 = viewTreeOwners2 != null ? viewTreeOwners2.CatchingFishParcelableFAB.CatchingFishDaggerWebsocket() : null;
        if (CatchingFishDaggerWebsocket2 == null) {
            throw CatchingFishMVPLiveData.CatchingFish("No lifecycle owner exists");
        }
        CatchingFishDaggerWebsocket2.CatchingFishParcelableFAB(this);
        CatchingFishDaggerWebsocket2.CatchingFishParcelableFAB(this.CatchingFishSpannableWidget);
        getViewTreeObserver().addOnGlobalLayoutListener(this.CatchingFishNavigationGson);
        getViewTreeObserver().addOnScrollChangedListener(this.CatchingFishRedux);
        getViewTreeObserver().addOnTouchModeChangeListener(this.CatchingFishCustomViewJUnit);
        if (Build.VERSION.SDK_INT >= 31) {
            CatchingFishGsonRealmGson.CatchingFishParcelableFAB.CatchingFishSnackbar(this);
        }
        CatchingFishDataStoreMVVM catchingFishDataStoreMVVM = this.CatchingFishSensorManager;
        if (catchingFishDataStoreMVVM != null) {
            ((CatchingFishExoPlayerOkHttp) getFocusOwner()).CatchingFishViewModelScope.CatchingFishParcelableFAB(catchingFishDataStoreMVVM);
            getSemanticsOwner().CatchingFishReduxKtor.CatchingFishParcelableFAB(catchingFishDataStoreMVVM);
        }
    }

    @Override // android.view.View
    public final boolean onCheckIsTextEditor() {
        if (this.CatchingFishReduxMoshi.get() != null) {
            throw new ClassCastException();
        }
        this.CatchingFishDaggerMVVM.getClass();
        return false;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        setDensity(CatchingFishLayoutRoomFAB.CatchingFishParcelableFAB(getContext()));
        this.CatchingFishOkHttp.getClass();
        int i = Build.VERSION.SDK_INT;
        if ((i >= 31 ? configuration.fontWeightAdjustment : 0) != this.CatchingFishGradleLiveData) {
            this.CatchingFishGradleLiveData = i >= 31 ? configuration.fontWeightAdjustment : 0;
            setFontFamilyResolver(CatchingFishFirebaseDagger.CatchingFishDaggerHiltFAB(getContext()));
        }
        this.CatchingFishJobScheduler.CatchingFishFragmentHandler(configuration);
    }

    @Override // android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        if (this.CatchingFishReduxMoshi.get() != null) {
            throw new ClassCastException();
        }
        this.CatchingFishDaggerMVVM.getClass();
        return null;
    }

    @Override // android.view.View
    public final void onCreateVirtualViewTranslationRequests(long[] jArr, int[] iArr, Consumer consumer) {
        CatchingFishMVIGraphQLHilt catchingFishMVIGraphQLHilt;
        AutofillId autofillId;
        String CatchingFishParcelableFAB;
        TranslationRequestValue forText;
        ViewTranslationRequest build;
        CatchingFishFAB catchingFishFAB = this.CatchingFishSpannableWidget;
        catchingFishFAB.getClass();
        for (long j : jArr) {
            CatchingFishMoshiKtor catchingFishMoshiKtor = (CatchingFishMoshiKtor) catchingFishFAB.CatchingFishViewModelScope().CatchingFishSnackbar((int) j);
            if (catchingFishMoshiKtor != null && (catchingFishMVIGraphQLHilt = catchingFishMoshiKtor.CatchingFishParcelableFAB) != null) {
                CatchingFishHiltMoshi.CatchingFishCoroutineFlow();
                autofillId = catchingFishFAB.CatchingFishReduxKtor.getAutofillId();
                ViewTranslationRequest.Builder CatchingFishStateLiveData = CatchingFishHiltMoshi.CatchingFishStateLiveData(autofillId, catchingFishMVIGraphQLHilt.CatchingFishViewModelScope);
                Object CatchingFishViewModelScope = catchingFishMVIGraphQLHilt.CatchingFishReduxKtor.CatchingFishReduxKtor.CatchingFishViewModelScope(CatchingFishServiceMVI.CatchingFishParcelableFlux);
                if (CatchingFishViewModelScope == null) {
                    CatchingFishViewModelScope = null;
                }
                List list = (List) CatchingFishViewModelScope;
                if (list != null && (CatchingFishParcelableFAB = CatchingFishReduxFirebase.CatchingFishParcelableFAB("\n", list)) != null) {
                    forText = TranslationRequestValue.forText(new CatchingFishWebsocketDagger(CatchingFishParcelableFAB, null));
                    CatchingFishStateLiveData.setValue("android:text", forText);
                    build = CatchingFishStateLiveData.build();
                    consumer.accept(build);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        CatchingFishFluxFluxBundle catchingFishFluxFluxBundle;
        super.onDetachedFromWindow();
        this.CatchingFishStateLiveData.onViewDetachedFromWindow(this);
        if (this.CatchingFishLayout) {
            View view = this.CatchingFishViewModelFAB;
            if (view == null) {
                CatchingFishFirebaseDagger.CatchingFishDataStoreIntent("frameRateCategoryView");
                throw null;
            }
            removeView(view);
        }
        if (Build.VERSION.SDK_INT > 28) {
            CatchingFishBundleGradle catchingFishBundleGradle = CatchingFishToolbar;
            synchronized (catchingFishBundleGradle) {
                catchingFishBundleGradle.CatchingFishLayout(this);
            }
        }
        CatchingFishGlideBiometric snapshotObserver = getSnapshotObserver();
        CatchingFishLayoutCoroutine catchingFishLayoutCoroutine = snapshotObserver.CatchingFishParcelableFAB.CatchingFishViewModelFAB;
        if (catchingFishLayoutCoroutine != null) {
            catchingFishLayoutCoroutine.CatchingFishCoroutine();
        }
        CatchingFishViewMVPAndroidX catchingFishViewMVPAndroidX = snapshotObserver.CatchingFishParcelableFAB;
        synchronized (catchingFishViewMVPAndroidX.CatchingFishViewModelScope) {
            CatchingFishFABToast catchingFishFABToast = catchingFishViewMVPAndroidX.CatchingFishWorkManager;
            Object[] objArr = catchingFishFABToast.CatchingFishReduxKtor;
            int i = catchingFishFABToast.CatchingFishWorkManager;
            for (int i2 = 0; i2 < i; i2++) {
                CatchingFishHandlerRedux catchingFishHandlerRedux = (CatchingFishHandlerRedux) objArr[i2];
                catchingFishHandlerRedux.CatchingFishDaggerWebsocket.CatchingFishParcelableFAB();
                catchingFishHandlerRedux.CatchingFishWorkManager.CatchingFishParcelableFAB();
                catchingFishHandlerRedux.CatchingFishCloudMessaging.CatchingFishParcelableFAB();
                catchingFishHandlerRedux.CatchingFishEspressoTesting.clear();
            }
        }
        this.CatchingFishOkHttp.getClass();
        CatchingFishWidgetAdMob viewTreeOwners = getViewTreeOwners();
        CatchingFishToolbarToast CatchingFishDaggerWebsocket = viewTreeOwners != null ? viewTreeOwners.CatchingFishParcelableFAB.CatchingFishDaggerWebsocket() : null;
        if (CatchingFishDaggerWebsocket == null) {
            throw CatchingFishMVPLiveData.CatchingFish("No lifecycle owner exists");
        }
        CatchingFishDaggerWebsocket.CatchingFishWorkManager(this.CatchingFishSpannableWidget);
        CatchingFishDaggerWebsocket.CatchingFishWorkManager(this);
        if (CatchingFishViewModelFAB() && (catchingFishFluxFluxBundle = this.CatchingFishPayPalService) != null) {
            CatchingFishHandlerFragment catchingFishHandlerFragment = CatchingFishHandlerFragment.CatchingFishParcelableFAB;
            catchingFishHandlerFragment.getClass();
            ((AutofillManager) catchingFishFluxFluxBundle.CatchingFishWorkManager).unregisterCallback(CatchingFishAnimation.CatchingFishWorkManager(catchingFishHandlerFragment));
        }
        getViewTreeObserver().removeOnGlobalLayoutListener(this.CatchingFishNavigationGson);
        getViewTreeObserver().removeOnScrollChangedListener(this.CatchingFishRedux);
        getViewTreeObserver().removeOnTouchModeChangeListener(this.CatchingFishCustomViewJUnit);
        if (Build.VERSION.SDK_INT >= 31) {
            CatchingFishGsonRealmGson.CatchingFishParcelableFAB.CatchingFishParcelableFAB(this);
        }
        CatchingFishDataStoreMVVM catchingFishDataStoreMVVM = this.CatchingFishSensorManager;
        if (catchingFishDataStoreMVVM != null) {
            getSemanticsOwner().CatchingFishReduxKtor.CatchingFishLayout(catchingFishDataStoreMVVM);
            ((CatchingFishExoPlayerOkHttp) getFocusOwner()).CatchingFishViewModelScope.CatchingFishLayout(catchingFishDataStoreMVVM);
        }
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (z || hasFocus()) {
            return;
        }
        CatchingFishBiometricBundle.CatchingFishLayout(((CatchingFishExoPlayerOkHttp) getFocusOwner()).CatchingFishCoroutine, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.CatchingFishJUnitRealm = 0L;
        this.CatchingFishParcelable.CatchingFishViewModelFAB(this.CatchingFishSharedFlow);
        this.CatchingFishMotionLayout = null;
        CatchingFishPayPalService();
        if (this.CatchingFishGradleManifest != null) {
            getAndroidViewsHandler$ui_release().layout(0, 0, i3 - i, i4 - i2);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        CatchingFishFragmentDagger catchingFishFragmentDagger = this.CatchingFishParcelable;
        Trace.beginSection("AndroidOwner:onMeasure");
        try {
            if (!isAttachedToWindow()) {
                CatchingFishAnimationMockk(getRoot());
            }
            long CatchingFishFragmentHandler = CatchingFishFragmentHandler(i);
            int i3 = (int) (CatchingFishFragmentHandler >>> 32);
            int i4 = (int) (CatchingFishFragmentHandler & 4294967295L);
            long CatchingFishFragmentHandler2 = CatchingFishFragmentHandler(i2);
            int i5 = (int) (4294967295L & CatchingFishFragmentHandler2);
            int i6 = 262142;
            int min = Math.min((int) (CatchingFishFragmentHandler2 >>> 32), 262142);
            int i7 = Integer.MAX_VALUE;
            int min2 = i5 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i5, 262142);
            int i8 = min2 == Integer.MAX_VALUE ? min : min2;
            if (i8 >= 8191) {
                if (i8 < 32767) {
                    i6 = 65534;
                } else if (i8 < 65535) {
                    i6 = 32766;
                } else {
                    if (i8 >= 262143) {
                        CatchingFishAsyncTaskGradle.CatchingFishLayout(i8);
                        throw new CatchingFishBiometricView();
                    }
                    i6 = 8190;
                }
            }
            if (i4 != Integer.MAX_VALUE) {
                i7 = Math.min(i6, i4);
            }
            long CatchingFishParcelableFAB = CatchingFishAsyncTaskGradle.CatchingFishParcelableFAB(Math.min(i6, i3), i7, min, min2);
            CatchingFishGradleGraphQL catchingFishGradleGraphQL = this.CatchingFishMotionLayout;
            if (catchingFishGradleGraphQL == null) {
                this.CatchingFishMotionLayout = new CatchingFishGradleGraphQL(CatchingFishParcelableFAB);
                this.CatchingFishLayoutInflater = false;
            } else {
                if (!(catchingFishGradleGraphQL.CatchingFishParcelableFAB == CatchingFishParcelableFAB)) {
                    this.CatchingFishLayoutInflater = true;
                }
            }
            catchingFishFragmentDagger.CatchingFishUnitTesting(CatchingFishParcelableFAB);
            catchingFishFragmentDagger.CatchingFishLayout();
            setMeasuredDimension(getRoot().CatchingFishPayPalService.CatchingFishAnimationMockk.CatchingFishReduxKtor, getRoot().CatchingFishPayPalService.CatchingFishAnimationMockk.CatchingFishDaggerWebsocket);
            if (this.CatchingFishGradleManifest != null) {
                getAndroidViewsHandler$ui_release().measure(View.MeasureSpec.makeMeasureSpec(getRoot().CatchingFishPayPalService.CatchingFishAnimationMockk.CatchingFishReduxKtor, 1073741824), View.MeasureSpec.makeMeasureSpec(getRoot().CatchingFishPayPalService.CatchingFishAnimationMockk.CatchingFishDaggerWebsocket, 1073741824));
            }
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // android.view.View
    public final void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i) {
        if (!CatchingFishViewModelFAB() || viewStructure == null) {
            return;
        }
        CatchingFishDataStoreMVVM catchingFishDataStoreMVVM = this.CatchingFishSensorManager;
        if (catchingFishDataStoreMVVM != null) {
            CatchingFishBiometricRoom catchingFishBiometricRoom = catchingFishDataStoreMVVM.CatchingFishSnackbar.CatchingFishParcelableFAB;
            AutofillId autofillId = catchingFishDataStoreMVVM.CatchingFishWorkManager;
            String str = catchingFishDataStoreMVVM.CatchingFishDaggerWebsocket;
            CatchingFishPayPalGradle catchingFishPayPalGradle = catchingFishDataStoreMVVM.CatchingFishReduxKtor;
            CatchingFishKtorViewModel.CatchingFishSpannableWidget(viewStructure, catchingFishBiometricRoom, autofillId, str, catchingFishPayPalGradle);
            Object[] objArr = CatchingFishHandlerLayout.CatchingFishParcelableFAB;
            CatchingFishBundleGradle catchingFishBundleGradle = new CatchingFishBundleGradle(2);
            catchingFishBundleGradle.CatchingFishParcelableFAB(catchingFishBiometricRoom);
            catchingFishBundleGradle.CatchingFishParcelableFAB(viewStructure);
            while (catchingFishBundleGradle.CatchingFishViewModelFAB()) {
                Object CatchingFishFragmentHandler = catchingFishBundleGradle.CatchingFishFragmentHandler(catchingFishBundleGradle.CatchingFishSnackbar - 1);
                CatchingFishFirebaseDagger.CatchingFishStateLiveData(CatchingFishFragmentHandler, "null cannot be cast to non-null type android.view.ViewStructure");
                ViewStructure viewStructure2 = (ViewStructure) CatchingFishFragmentHandler;
                Object CatchingFishFragmentHandler2 = catchingFishBundleGradle.CatchingFishFragmentHandler(catchingFishBundleGradle.CatchingFishSnackbar - 1);
                CatchingFishFirebaseDagger.CatchingFishStateLiveData(CatchingFishFragmentHandler2, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsInfo");
                CatchingFishFABFirebase catchingFishFABFirebase = (CatchingFishFABFirebase) ((CatchingFishBiometricRoom) CatchingFishFragmentHandler2).CatchingFishCloudMessaging();
                int i2 = catchingFishFABFirebase.CatchingFishReduxKtor.CatchingFishWorkManager;
                for (int i3 = 0; i3 < i2; i3++) {
                    CatchingFishBiometricRoom catchingFishBiometricRoom2 = (CatchingFishBiometricRoom) catchingFishFABFirebase.get(i3);
                    if (!catchingFishBiometricRoom2.CatchingFishLayoutInflater && catchingFishBiometricRoom2.CatchingFishCustomView() && catchingFishBiometricRoom2.CatchingFishFragmentFactory()) {
                        CatchingFishMVPMotionLayout CatchingFish = catchingFishBiometricRoom2.CatchingFish();
                        if (CatchingFish != null) {
                            CatchingFishPayPalService catchingFishPayPalService = CatchingFish.CatchingFishReduxKtor;
                            if (catchingFishPayPalService.CatchingFishSnackbar(CatchingFishViewStripeAPI.CatchingFishWorkManager) || catchingFishPayPalService.CatchingFishSnackbar(CatchingFishServiceMVI.CatchingFishStateLiveData) || catchingFishPayPalService.CatchingFishSnackbar(CatchingFishServiceMVI.CatchingFishRoomDatabase)) {
                                ViewStructure newChild = viewStructure2.newChild(viewStructure2.addChildCount(1));
                                CatchingFishKtorViewModel.CatchingFishSpannableWidget(newChild, catchingFishBiometricRoom2, catchingFishDataStoreMVVM.CatchingFishWorkManager, str, catchingFishPayPalGradle);
                                catchingFishBundleGradle.CatchingFishParcelableFAB(catchingFishBiometricRoom2);
                                catchingFishBundleGradle.CatchingFishParcelableFAB(newChild);
                            }
                        }
                        catchingFishBundleGradle.CatchingFishParcelableFAB(catchingFishBiometricRoom2);
                        catchingFishBundleGradle.CatchingFishParcelableFAB(viewStructure2);
                    }
                }
            }
        }
        CatchingFishFluxFluxBundle catchingFishFluxFluxBundle = this.CatchingFishPayPalService;
        if (catchingFishFluxFluxBundle != null) {
            CatchingFishRoomLayout catchingFishRoomLayout = (CatchingFishRoomLayout) catchingFishFluxFluxBundle.CatchingFishDaggerWebsocket;
            LinkedHashMap linkedHashMap = catchingFishRoomLayout.CatchingFishParcelableFAB;
            LinkedHashMap linkedHashMap2 = catchingFishRoomLayout.CatchingFishParcelableFAB;
            if (linkedHashMap.isEmpty()) {
                return;
            }
            int addChildCount = viewStructure.addChildCount(linkedHashMap2.size());
            Iterator it = linkedHashMap2.entrySet().iterator();
            if (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                int intValue = ((Number) entry.getKey()).intValue();
                if (entry.getValue() != null) {
                    throw new ClassCastException();
                }
                ViewStructure newChild2 = viewStructure.newChild(addChildCount);
                newChild2.setAutofillId((AutofillId) catchingFishFluxFluxBundle.CatchingFishViewModelScope, intValue);
                newChild2.setId(intValue, ((CatchingFishGradleCameraX) catchingFishFluxFluxBundle.CatchingFishReduxKtor).getContext().getPackageName(), null, null);
                newChild2.setAutofillType(1);
                throw null;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        int toolType = motionEvent.getToolType(i);
        if (!motionEvent.isFromSource(8194) && motionEvent.isFromSource(16386) && (toolType == 2 || toolType == 4)) {
            getPointerIconService().getClass();
        }
        return super.onResolvePointerIcon(motionEvent, i);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        if (this.CatchingFishDaggerWebsocket) {
            CatchingFishGradleMVPKtor catchingFishGradleMVPKtor = CatchingFishGradleMVPKtor.CatchingFishReduxKtor;
            CatchingFishGradleMVPKtor catchingFishGradleMVPKtor2 = i != 0 ? i != 1 ? null : CatchingFishGradleMVPKtor.CatchingFishDaggerWebsocket : catchingFishGradleMVPKtor;
            if (catchingFishGradleMVPKtor2 != null) {
                catchingFishGradleMVPKtor = catchingFishGradleMVPKtor2;
            }
            setLayoutDirection(catchingFishGradleMVPKtor);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0064, code lost:
    
        r1 = r2.CatchingFishViewModelScope(kotlin.text.CatchingFishViewStripeAPI.CatchingFishDaggerWebsocket);
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006b, code lost:
    
        if (r1 != null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006d, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006e, code lost:
    
        r1 = (kotlin.text.CatchingFishMockkView) r1;
        r1 = r2.CatchingFishViewModelScope(kotlin.text.CatchingFishServiceMVI.CatchingFishJetpackCompose);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0076, code lost:
    
        if (r1 != null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0079, code lost:
    
        r3 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007a, code lost:
    
        if (r3 != null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0086, code lost:
    
        throw new java.lang.ClassCastException();
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onScrollCaptureSearch(Rect rect, Point point, Consumer consumer) {
        CatchingFishMVIGraphQLHilt catchingFishMVIGraphQLHilt;
        if (Build.VERSION.SDK_INT < 31 || this.CatchingFishKtor == null) {
            return;
        }
        CatchingFishMVPManifest semanticsOwner = getSemanticsOwner();
        getCoroutineContext();
        CatchingFishToastMoshiToast[] catchingFishToastMoshiToastArr = new CatchingFishToastMoshiToast[16];
        CatchingFishMVIGraphQLHilt CatchingFishParcelableFAB = semanticsOwner.CatchingFishParcelableFAB();
        CatchingFishFABToast catchingFishFABToast = new CatchingFishFABToast(new CatchingFishMVIGraphQLHilt[16]);
        int i = 0;
        List CatchingFishLayout = CatchingFishParcelableFAB.CatchingFishLayout(false, false);
        while (true) {
            catchingFishFABToast.CatchingFishCoroutine(catchingFishFABToast.CatchingFishWorkManager, CatchingFishLayout);
            while (true) {
                int i2 = catchingFishFABToast.CatchingFishWorkManager;
                if (i2 == 0) {
                    CatchingFishMVVMHilt.CatchingFishAndroidX(catchingFishToastMoshiToastArr, new CatchingFishGradleExoPlayer(i, new CatchingFishServiceHandler[]{CatchingFishGradleRetrofit.CatchingFishViewModelFAB, CatchingFishGradleRetrofit.CatchingFishLayout}), 0, 0);
                    return;
                }
                catchingFishMVIGraphQLHilt = (CatchingFishMVIGraphQLHilt) catchingFishFABToast.CatchingFishFragmentHandler(i2 - 1);
                boolean CatchingFishPayPal = CatchingFishAdMobFAB.CatchingFishPayPal(catchingFishMVIGraphQLHilt);
                CatchingFishPayPalService catchingFishPayPalService = catchingFishMVIGraphQLHilt.CatchingFishReduxKtor.CatchingFishReduxKtor;
                if (!CatchingFishPayPal && !catchingFishPayPalService.CatchingFishCoroutine(CatchingFishServiceMVI.CatchingFishLayout)) {
                    CatchingFishDaggerToolbar CatchingFishReduxKtor = catchingFishMVIGraphQLHilt.CatchingFishReduxKtor();
                    if (CatchingFishReduxKtor == null) {
                        throw CatchingFishMVPLiveData.CatchingFish("Expected semantics node to have a coordinator.");
                    }
                    CatchingFishSnackbarLayout CatchingFishDagger = CatchingFishAdMobFAB.CatchingFishDagger(CatchingFishLayoutRoomFAB.CatchingFishEspressoTesting(CatchingFishReduxKtor));
                    if (CatchingFishDagger.CatchingFishParcelableFAB < CatchingFishDagger.CatchingFishCoroutine && CatchingFishDagger.CatchingFishSnackbar < CatchingFishDagger.CatchingFishReduxKtor) {
                        break;
                    }
                }
            }
            CatchingFishLayout = catchingFishMVIGraphQLHilt.CatchingFishLayout(false, false);
        }
    }

    @Override // android.view.View
    public final void onVirtualViewTranslationResponses(LongSparseArray longSparseArray) {
        CatchingFishFAB catchingFishFAB = this.CatchingFishSpannableWidget;
        catchingFishFAB.getClass();
        if (Build.VERSION.SDK_INT < 31) {
            return;
        }
        if (CatchingFishFirebaseDagger.CatchingFishOkHttp(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            CatchingFishFirebaseDagger.CatchingFishCardViewRealm(catchingFishFAB, longSparseArray);
        } else {
            catchingFishFAB.CatchingFishReduxKtor.post(new CatchingFishEspressoFlux(2, catchingFishFAB, longSparseArray));
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        boolean CatchingFishSpannableWidget;
        this.CatchingFishOkHttp.CatchingFishParcelableFAB.setValue(Boolean.valueOf(z));
        this.CatchingFishLifecycle = true;
        super.onWindowFocusChanged(z);
        if (!z || Build.VERSION.SDK_INT >= 30 || getShowLayoutBounds() == (CatchingFishSpannableWidget = CatchingFishRobolectricHilt.CatchingFishSpannableWidget())) {
            return;
        }
        setShowLayoutBounds(CatchingFishSpannableWidget);
        CatchingFishUnitTesting(getRoot());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i, Rect rect) {
        if (isFocused()) {
            return true;
        }
        int ordinal = ((CatchingFishExoPlayerOkHttp) getFocusOwner()).CatchingFishCoroutine.CatchingFishMVPRobolectric().ordinal();
        if (ordinal == 0 || ordinal == 1 || ordinal == 2) {
            return super.requestFocus(i, rect);
        }
        if (ordinal != 3) {
            throw new CatchingFishBiometricView();
        }
        CatchingFishViewPagerFAB CatchingFishDataStoreIntent = CatchingFishRobolectricHilt.CatchingFishDataStoreIntent(i);
        int i2 = CatchingFishDataStoreIntent != null ? CatchingFishDataStoreIntent.CatchingFishParcelableFAB : 7;
        return CatchingFishFirebaseDagger.CatchingFishOkHttp(((CatchingFishExoPlayerOkHttp) getFocusOwner()).CatchingFishDaggerWebsocket(i2, rect != null ? CatchingFishKtorViewModel.CatchingFishCardViewView(rect) : null, new CatchingFishExoPlayerKtor(i2, 0)), Boolean.TRUE);
    }

    public void setAccessibilityEventBatchIntervalMillis(long j) {
        this.CatchingFishDaggerHiltFAB.CatchingFishViewModelFAB = j;
    }

    public final void setConfigurationChangeObserver(CatchingFishServiceHandler catchingFishServiceHandler) {
        this.CatchingFishJobScheduler = catchingFishServiceHandler;
    }

    public final void setContentCaptureManager$ui_release(CatchingFishFAB catchingFishFAB) {
        this.CatchingFishSpannableWidget = catchingFishFAB;
    }

    public void setCoroutineContext(CatchingFishManifestMockk catchingFishManifestMockk) {
        this.CatchingFishCloudMessaging = catchingFishManifestMockk;
        CatchingFishFABStripeAPIFAB catchingFishFABStripeAPIFAB = (CatchingFishFABStripeAPIFAB) getRoot().CatchingFishJobScheduler.CatchingFishFragmentHandler;
        if (!catchingFishFABStripeAPIFAB.CatchingFishReduxKtor.CatchingFishRoomDatabase) {
            CatchingFishFluxGradle.CatchingFishSnackbar("visitSubtreeIf called on an unattached node");
        }
        CatchingFishFABToast catchingFishFABToast = new CatchingFishFABToast(new CatchingFishFABStripeAPIFAB[16]);
        CatchingFishFABStripeAPIFAB catchingFishFABStripeAPIFAB2 = catchingFishFABStripeAPIFAB.CatchingFishReduxKtor;
        CatchingFishFABStripeAPIFAB catchingFishFABStripeAPIFAB3 = catchingFishFABStripeAPIFAB2.CatchingFishLayout;
        if (catchingFishFABStripeAPIFAB3 == null) {
            CatchingFishXMLLayoutGlide.CatchingFishWorkManager(catchingFishFABToast, catchingFishFABStripeAPIFAB2);
        } else {
            catchingFishFABToast.CatchingFishSnackbar(catchingFishFABStripeAPIFAB3);
        }
        while (true) {
            int i = catchingFishFABToast.CatchingFishWorkManager;
            if (i == 0) {
                return;
            }
            CatchingFishFABStripeAPIFAB catchingFishFABStripeAPIFAB4 = (CatchingFishFABStripeAPIFAB) catchingFishFABToast.CatchingFishFragmentHandler(i - 1);
            if ((catchingFishFABStripeAPIFAB4.CatchingFishViewModelScope & 16) != 0) {
                for (CatchingFishFABStripeAPIFAB catchingFishFABStripeAPIFAB5 = catchingFishFABStripeAPIFAB4; catchingFishFABStripeAPIFAB5 != null; catchingFishFABStripeAPIFAB5 = catchingFishFABStripeAPIFAB5.CatchingFishLayout) {
                    if ((catchingFishFABStripeAPIFAB5.CatchingFishWorkManager & 16) != 0) {
                        for (CatchingFishFABStripeAPIFAB catchingFishFABStripeAPIFAB6 = catchingFishFABStripeAPIFAB5; catchingFishFABStripeAPIFAB6 != null; catchingFishFABStripeAPIFAB6 = null) {
                            if (catchingFishFABStripeAPIFAB6 instanceof CatchingFishAdMobPicasso) {
                            }
                        }
                    }
                }
            }
            CatchingFishXMLLayoutGlide.CatchingFishWorkManager(catchingFishFABToast, catchingFishFABStripeAPIFAB4);
        }
    }

    public final void setLastMatrixRecalculationAnimationTime$ui_release(long j) {
        this.CatchingFishJUnitRealm = j;
    }

    public final void setOnViewTreeOwnersAvailable(CatchingFishServiceHandler catchingFishServiceHandler) {
        CatchingFishWidgetAdMob viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null) {
            catchingFishServiceHandler.CatchingFishFragmentHandler(viewTreeOwners);
        }
        if (isAttachedToWindow()) {
            return;
        }
        this.CatchingFishAndroidX = catchingFishServiceHandler;
    }

    public void setShowLayoutBounds(boolean z) {
        this.CatchingFishPayPalLiveData = z;
    }

    public void setUncaughtExceptionHandler(CatchingFishAdMobExoPlayer catchingFishAdMobExoPlayer) {
        this.CatchingFishParcelable.getClass();
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        CatchingFishFirebaseDagger.CatchingFishAnimationMockk(view);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = generateDefaultLayoutParams();
        }
        addViewInLayout(view, i, layoutParams, true);
    }

    public CatchingFishLifecycleLayout getAccessibilityManager() {
        return this.CatchingFishParcelableFlux;
    }

    /* renamed from: getClipboard, reason: merged with bridge method [inline-methods] */
    public CatchingFishMVP m7getClipboard() {
        return this.CatchingFishCameraXIntent;
    }

    /* renamed from: getClipboardManager, reason: merged with bridge method [inline-methods] */
    public CatchingFishFABMVVM m8getClipboardManager() {
        return this.CatchingFishDagger;
    }

    /* renamed from: getDragAndDropManager, reason: merged with bridge method [inline-methods] */
    public CatchingFishAppCompatMockk m9getDragAndDropManager() {
        return this.CatchingFishEspressoTesting;
    }

    /* renamed from: getLayoutNodes, reason: merged with bridge method [inline-methods] */
    public CatchingFishLayoutGsonRoom m10getLayoutNodes() {
        return this.CatchingFishNavigation;
    }

    /* renamed from: getOutOfFrameExecutor, reason: merged with bridge method [inline-methods] */
    public CatchingFishGradleCameraX m11getOutOfFrameExecutor() {
        if (isAttachedToWindow()) {
            return this;
        }
        return null;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, int i2) {
        ViewGroup.LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
        generateDefaultLayoutParams.width = i;
        generateDefaultLayoutParams.height = i2;
        addViewInLayout(view, -1, generateDefaultLayoutParams, true);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, i, layoutParams, true);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, -1, layoutParams, true);
    }

    @CatchingFishRetrofitKtor
    public static /* synthetic */ void getFontLoader$annotations() {
    }

    public static /* synthetic */ void getLastMatrixRecalculationAnimationTime$ui_release$annotations() {
    }

    public static /* synthetic */ void getRoot$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    @CatchingFishRetrofitKtor
    public static /* synthetic */ void getTextInputService$annotations() {
    }

    public View getView() {
        return this;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    public final void setUncaughtExceptionHandler$ui_release(CatchingFishAdMobExoPlayer catchingFishAdMobExoPlayer) {
    }
}
