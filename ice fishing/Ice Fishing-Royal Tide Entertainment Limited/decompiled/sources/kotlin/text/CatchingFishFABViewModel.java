package kotlin.text;

import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.Region;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.os.Trace;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.catchingfish.fishcatcherpro.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class CatchingFishFABViewModel extends CatchingFishAndroidX {
    public static final CatchingFishGsonLayout CatchingFishPayPalLiveData;
    public final CatchingFishGsonAsyncTask CatchingFish;
    public int CatchingFishAnimationMockk;
    public final ArrayList CatchingFishCameraXIntent;
    public CatchingFishLayoutGsonRoom CatchingFishCardViewRealm;
    public final CatchingFishViewAdMobMoshi CatchingFishCardViewView;
    public List CatchingFishCloudMessaging;
    public Integer CatchingFishCoroutineFlow;
    public final String CatchingFishCustomView;
    public final CatchingFishMVPLayout CatchingFishDagger;
    public final CatchingFishRoomStateFlow CatchingFishDaggerHiltFAB;
    public int CatchingFishDaggerWebsocket = Integer.MIN_VALUE;
    public final CatchingFishViewAdMobMoshi CatchingFishEspressoMockk;
    public final Handler CatchingFishEspressoTesting;
    public final String CatchingFishFragmentFactory;
    public final CatchingFishPayPal CatchingFishFragmentHandler;
    public CatchingFishToastMVI CatchingFishGsonAppCompat;
    public final CatchingFishFluxJUnit CatchingFishHandler;
    public int CatchingFishJetpackCompose;
    public final CatchingFishLayoutGsonRoom CatchingFishJobScheduler;
    public final CatchingFishUnitTestingHilt CatchingFishLayout;
    public final CatchingFishViewAdMobMoshi CatchingFishMVPRobolectric;
    public final CatchingFishAsyncTaskDagger CatchingFishMutableLiveData;
    public final CatchingFishGsonAsyncTask CatchingFishNavigation;
    public final CatchingFishWidgetFragment CatchingFishOkHttp;
    public boolean CatchingFishParcelableFlux;
    public final CatchingFishMVIWidget CatchingFishPayPal;
    public CatchingFishHiltGlideRoom CatchingFishPayPalService;
    public final CatchingFishGradleCameraX CatchingFishReduxKtor;
    public final CatchingFishLayoutGsonRoom CatchingFishRoomDatabase;
    public boolean CatchingFishSensorManager;
    public final CatchingFishPicassoCameraX CatchingFishSpannableWidget;
    public final CatchingFishLayoutGsonRoom CatchingFishStateLiveData;
    public int CatchingFishUnitTesting;
    public long CatchingFishViewModelFAB;
    public final AccessibilityManager CatchingFishViewModelScope;
    public final CatchingFishFluxJUnit CatchingFishWorkManager;

    static {
        int[] iArr = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
        int i = CatchingFishRealmCameraX.CatchingFishParcelableFAB;
        CatchingFishGsonLayout catchingFishGsonLayout = new CatchingFishGsonLayout(32);
        int i2 = catchingFishGsonLayout.CatchingFishSnackbar;
        if (i2 < 0) {
            CatchingFishHiltMVPToast.CatchingFishGradleManifest("");
            throw null;
        }
        int i3 = i2 + 32;
        int[] iArr2 = catchingFishGsonLayout.CatchingFishParcelableFAB;
        if (iArr2.length < i3) {
            int[] copyOf = Arrays.copyOf(iArr2, Math.max(i3, (iArr2.length * 3) / 2));
            CatchingFishFirebaseDagger.CatchingFishRoomDatabase(copyOf, "copyOf(...)");
            catchingFishGsonLayout.CatchingFishParcelableFAB = copyOf;
        }
        int[] iArr3 = catchingFishGsonLayout.CatchingFishParcelableFAB;
        int i4 = catchingFishGsonLayout.CatchingFishSnackbar;
        if (i2 != i4) {
            CatchingFishMVVMHilt.CatchingFishParcelable(i3, i2, i4, iArr3, iArr3);
        }
        CatchingFishMVVMHilt.CatchingFishDataStoreIntent(i2, 0, 12, iArr, iArr3);
        catchingFishGsonLayout.CatchingFishSnackbar += 32;
        CatchingFishPayPalLiveData = catchingFishGsonLayout;
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [kotlin.text.CatchingFishUnitTestingHilt] */
    public CatchingFishFABViewModel(CatchingFishGradleCameraX catchingFishGradleCameraX) {
        this.CatchingFishReduxKtor = catchingFishGradleCameraX;
        int i = 0;
        this.CatchingFishWorkManager = new CatchingFishFluxJUnit(this, i);
        Object systemService = catchingFishGradleCameraX.getContext().getSystemService("accessibility");
        CatchingFishFirebaseDagger.CatchingFishStateLiveData(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        AccessibilityManager accessibilityManager = (AccessibilityManager) systemService;
        this.CatchingFishViewModelScope = accessibilityManager;
        this.CatchingFishViewModelFAB = 100L;
        this.CatchingFishLayout = new AccessibilityManager.AccessibilityStateChangeListener() { // from class: kotlin.text.CatchingFishUnitTestingHilt
            @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
            public final void onAccessibilityStateChanged(boolean z) {
                CatchingFishFABViewModel catchingFishFABViewModel = CatchingFishFABViewModel.this;
                catchingFishFABViewModel.CatchingFishCloudMessaging = z ? catchingFishFABViewModel.CatchingFishViewModelScope.getEnabledAccessibilityServiceList(-1) : CatchingFishViewPagerDagger.CatchingFishReduxKtor;
            }
        };
        this.CatchingFishFragmentHandler = new CatchingFishPayPal(i, this);
        this.CatchingFishCloudMessaging = accessibilityManager.getEnabledAccessibilityServiceList(-1);
        this.CatchingFishEspressoTesting = new Handler(Looper.getMainLooper());
        this.CatchingFishOkHttp = new CatchingFishWidgetFragment(this, i);
        this.CatchingFishUnitTesting = Integer.MIN_VALUE;
        this.CatchingFishAnimationMockk = Integer.MIN_VALUE;
        this.CatchingFishStateLiveData = new CatchingFishLayoutGsonRoom();
        this.CatchingFishRoomDatabase = new CatchingFishLayoutGsonRoom();
        this.CatchingFishNavigation = new CatchingFishGsonAsyncTask(0);
        this.CatchingFish = new CatchingFishGsonAsyncTask(0);
        this.CatchingFishJetpackCompose = -1;
        this.CatchingFishDaggerHiltFAB = new CatchingFishRoomStateFlow(0);
        this.CatchingFishSpannableWidget = CatchingFishAdMobFAB.CatchingFishParcelableFAB(1, null, 6);
        this.CatchingFishParcelableFlux = true;
        CatchingFishLayoutGsonRoom catchingFishLayoutGsonRoom = CatchingFishFluxCardView.CatchingFishParcelableFAB;
        CatchingFishFirebaseDagger.CatchingFishStateLiveData(catchingFishLayoutGsonRoom, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        this.CatchingFishCardViewRealm = catchingFishLayoutGsonRoom;
        this.CatchingFishPayPal = new CatchingFishMVIWidget();
        this.CatchingFishCardViewView = new CatchingFishViewAdMobMoshi();
        this.CatchingFishMVPRobolectric = new CatchingFishViewAdMobMoshi();
        this.CatchingFishCustomView = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.CatchingFishFragmentFactory = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.CatchingFishMutableLiveData = new CatchingFishAsyncTaskDagger(25);
        this.CatchingFishJobScheduler = new CatchingFishLayoutGsonRoom();
        CatchingFishMVIGraphQLHilt CatchingFishParcelableFAB = catchingFishGradleCameraX.getSemanticsOwner().CatchingFishParcelableFAB();
        CatchingFishFirebaseDagger.CatchingFishStateLiveData(catchingFishLayoutGsonRoom, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        this.CatchingFishPayPalService = new CatchingFishHiltGlideRoom(CatchingFishParcelableFAB, catchingFishLayoutGsonRoom);
        int i2 = CatchingFishGraphQLSnackbar.CatchingFishParcelableFAB;
        this.CatchingFishEspressoMockk = new CatchingFishViewAdMobMoshi();
        catchingFishGradleCameraX.addOnAttachStateChangeListener(new CatchingFishToastWidget(i, this));
        this.CatchingFishDagger = new CatchingFishMVPLayout(2, this);
        this.CatchingFishCameraXIntent = new ArrayList();
        this.CatchingFishHandler = new CatchingFishFluxJUnit(this, 1);
    }

    public static CharSequence CatchingFishEspressoMockk(CharSequence charSequence) {
        if (charSequence.length() != 0) {
            int i = 100000;
            if (charSequence.length() > 100000) {
                if (Character.isHighSurrogate(charSequence.charAt(99999)) && Character.isLowSurrogate(charSequence.charAt(100000))) {
                    i = 99999;
                }
                CharSequence subSequence = charSequence.subSequence(0, i);
                CatchingFishFirebaseDagger.CatchingFishStateLiveData(subSequence, "null cannot be cast to non-null type T of androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.trimToSize");
                return subSequence;
            }
        }
        return charSequence;
    }

    public static String CatchingFishJetpackCompose(CatchingFishMVIGraphQLHilt catchingFishMVIGraphQLHilt) {
        CatchingFishWebsocketDagger catchingFishWebsocketDagger;
        if (catchingFishMVIGraphQLHilt != null) {
            CatchingFishMVPMotionLayout catchingFishMVPMotionLayout = catchingFishMVIGraphQLHilt.CatchingFishReduxKtor;
            CatchingFishPayPalService catchingFishPayPalService = catchingFishMVPMotionLayout.CatchingFishReduxKtor;
            CatchingFishGraphQLLayout catchingFishGraphQLLayout = CatchingFishServiceMVI.CatchingFishParcelableFAB;
            if (catchingFishPayPalService.CatchingFishCoroutine(catchingFishGraphQLLayout)) {
                return CatchingFishReduxFirebase.CatchingFishParcelableFAB(",", (List) catchingFishMVPMotionLayout.CatchingFishSnackbar(catchingFishGraphQLLayout));
            }
            CatchingFishGraphQLLayout catchingFishGraphQLLayout2 = CatchingFishServiceMVI.CatchingFishPayPal;
            if (catchingFishPayPalService.CatchingFishCoroutine(catchingFishGraphQLLayout2)) {
                Object CatchingFishViewModelScope = catchingFishPayPalService.CatchingFishViewModelScope(catchingFishGraphQLLayout2);
                if (CatchingFishViewModelScope == null) {
                    CatchingFishViewModelScope = null;
                }
                CatchingFishWebsocketDagger catchingFishWebsocketDagger2 = (CatchingFishWebsocketDagger) CatchingFishViewModelScope;
                if (catchingFishWebsocketDagger2 != null) {
                    return catchingFishWebsocketDagger2.CatchingFishDaggerWebsocket;
                }
            } else {
                Object CatchingFishViewModelScope2 = catchingFishPayPalService.CatchingFishViewModelScope(CatchingFishServiceMVI.CatchingFishParcelableFlux);
                if (CatchingFishViewModelScope2 == null) {
                    CatchingFishViewModelScope2 = null;
                }
                List list = (List) CatchingFishViewModelScope2;
                if (list != null && (catchingFishWebsocketDagger = (CatchingFishWebsocketDagger) CatchingFishCameraXCameraX.CatchingFishJUnitRealm(list)) != null) {
                    return catchingFishWebsocketDagger.CatchingFishDaggerWebsocket;
                }
            }
        }
        return null;
    }

    public static Rect CatchingFishJobScheduler(CatchingFishSpannableAdMob catchingFishSpannableAdMob) {
        if (!(catchingFishSpannableAdMob instanceof CatchingFishJUnitToolbar) && !(catchingFishSpannableAdMob instanceof CatchingFishCoroutineMVI)) {
            return null;
        }
        CatchingFishFluxExoPlayer CatchingFishParcelableFAB = catchingFishSpannableAdMob.CatchingFishParcelableFAB();
        return new Rect((int) CatchingFishParcelableFAB.CatchingFishParcelableFAB, (int) CatchingFishParcelableFAB.CatchingFishSnackbar, (int) CatchingFishParcelableFAB.CatchingFishCoroutine, (int) CatchingFishParcelableFAB.CatchingFishReduxKtor);
    }

    public static /* synthetic */ void CatchingFishPayPal(CatchingFishFABViewModel catchingFishFABViewModel, int i, int i2, Integer num, int i3) {
        if ((i3 & 4) != 0) {
            num = null;
        }
        catchingFishFABViewModel.CatchingFishCardViewRealm(i, i2, num, null);
    }

    public static float[] CatchingFishPayPalService(CatchingFishSpannableAdMob catchingFishSpannableAdMob) {
        if (!(catchingFishSpannableAdMob instanceof CatchingFishCoroutineMVI)) {
            return null;
        }
        CatchingFishCoroutineMVI catchingFishCoroutineMVI = (CatchingFishCoroutineMVI) catchingFishSpannableAdMob;
        CatchingFishMVIServiceFlux catchingFishMVIServiceFlux = catchingFishCoroutineMVI.CatchingFishParcelableFAB;
        CatchingFishMVIServiceFlux catchingFishMVIServiceFlux2 = catchingFishCoroutineMVI.CatchingFishParcelableFAB;
        return new float[]{Float.intBitsToFloat((int) (catchingFishMVIServiceFlux.CatchingFishDaggerWebsocket >> 32)), Float.intBitsToFloat((int) (catchingFishMVIServiceFlux2.CatchingFishDaggerWebsocket & 4294967295L)), Float.intBitsToFloat((int) (catchingFishMVIServiceFlux2.CatchingFishWorkManager >> 32)), Float.intBitsToFloat((int) (catchingFishMVIServiceFlux2.CatchingFishWorkManager & 4294967295L)), Float.intBitsToFloat((int) (catchingFishMVIServiceFlux2.CatchingFishViewModelScope >> 32)), Float.intBitsToFloat((int) (catchingFishMVIServiceFlux2.CatchingFishViewModelScope & 4294967295L)), Float.intBitsToFloat((int) (catchingFishMVIServiceFlux2.CatchingFishViewModelFAB >> 32)), Float.intBitsToFloat((int) (4294967295L & catchingFishMVIServiceFlux2.CatchingFishViewModelFAB))};
    }

    public static Region CatchingFishSensorManager(CatchingFishSpannableAdMob catchingFishSpannableAdMob) {
        if (!(catchingFishSpannableAdMob instanceof CatchingFishMockkAndroidX)) {
            return null;
        }
        CatchingFishMockkAndroidX catchingFishMockkAndroidX = (CatchingFishMockkAndroidX) catchingFishSpannableAdMob;
        CatchingFishFluxExoPlayer CatchingFishParcelableFAB = catchingFishMockkAndroidX.CatchingFishParcelableFAB();
        Region region = new Region(new Rect((int) CatchingFishParcelableFAB.CatchingFishParcelableFAB, (int) CatchingFishParcelableFAB.CatchingFishSnackbar, (int) CatchingFishParcelableFAB.CatchingFishCoroutine, (int) CatchingFishParcelableFAB.CatchingFishReduxKtor));
        Region region2 = new Region();
        CatchingFishMoshiRealm catchingFishMoshiRealm = catchingFishMockkAndroidX.CatchingFishParcelableFAB;
        if (!(catchingFishMoshiRealm instanceof CatchingFishMoshiRealm)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        region2.setPath(catchingFishMoshiRealm.CatchingFishParcelableFAB, region);
        return region2;
    }

    public final CatchingFishReduxLifecycle CatchingFish() {
        if (this.CatchingFishParcelableFlux) {
            this.CatchingFishParcelableFlux = false;
            CatchingFishGradleCameraX catchingFishGradleCameraX = this.CatchingFishReduxKtor;
            this.CatchingFishCardViewRealm = CatchingFishAdMobFAB.CatchingFishDaggerHiltFAB(catchingFishGradleCameraX.getSemanticsOwner());
            if (CatchingFishCoroutineFlow()) {
                CatchingFishLayoutGsonRoom catchingFishLayoutGsonRoom = this.CatchingFishCardViewRealm;
                Resources resources = catchingFishGradleCameraX.getContext().getResources();
                CatchingFishViewAdMobMoshi catchingFishViewAdMobMoshi = this.CatchingFishCardViewView;
                catchingFishViewAdMobMoshi.CatchingFishParcelableFAB();
                CatchingFishViewAdMobMoshi catchingFishViewAdMobMoshi2 = this.CatchingFishMVPRobolectric;
                catchingFishViewAdMobMoshi2.CatchingFishParcelableFAB();
                CatchingFishMoshiKtor catchingFishMoshiKtor = (CatchingFishMoshiKtor) catchingFishLayoutGsonRoom.CatchingFishSnackbar(-1);
                CatchingFishMVIGraphQLHilt catchingFishMVIGraphQLHilt = catchingFishMoshiKtor != null ? catchingFishMoshiKtor.CatchingFishParcelableFAB : null;
                CatchingFishFirebaseDagger.CatchingFishAnimationMockk(catchingFishMVIGraphQLHilt);
                ArrayList CatchingFishSnackbar = CatchingFishCardViewFABKtor.CatchingFishSnackbar(catchingFishMVIGraphQLHilt, new CatchingFishMVVM(2, catchingFishLayoutGsonRoom), new CatchingFishMVVM(3, resources), CatchingFishGsonCardView.CatchingFishFragmentFactory(catchingFishMVIGraphQLHilt));
                int CatchingFishMotionLayout = CatchingFishToastCustomView.CatchingFishMotionLayout(CatchingFishSnackbar);
                int i = 1;
                if (1 <= CatchingFishMotionLayout) {
                    while (true) {
                        int i2 = ((CatchingFishMVIGraphQLHilt) CatchingFishSnackbar.get(i - 1)).CatchingFishViewModelScope;
                        int i3 = ((CatchingFishMVIGraphQLHilt) CatchingFishSnackbar.get(i)).CatchingFishViewModelScope;
                        catchingFishViewAdMobMoshi.CatchingFishWorkManager(i2, i3);
                        catchingFishViewAdMobMoshi2.CatchingFishWorkManager(i3, i2);
                        if (i == CatchingFishMotionLayout) {
                            break;
                        }
                        i++;
                    }
                }
            }
        }
        return this.CatchingFishCardViewRealm;
    }

    public final CatchingFishSpannableAdMob CatchingFishAnimationMockk(CatchingFishKtorGraphQL catchingFishKtorGraphQL, CatchingFishMVIGraphQLHilt catchingFishMVIGraphQLHilt) {
        CatchingFishDaggerToolbar CatchingFishReduxKtor = catchingFishMVIGraphQLHilt.CatchingFishReduxKtor();
        return catchingFishKtorGraphQL.CatchingFishParcelableFAB(CatchingFishXMLLayoutGlide.CatchingFishCameraXIntent(CatchingFishReduxKtor != null ? CatchingFishReduxKtor.CatchingFishWorkManager : 0L), catchingFishMVIGraphQLHilt.CatchingFishCoroutine.CatchingFishPayPal, this.CatchingFishReduxKtor.getDensity());
    }

    public final boolean CatchingFishCardViewRealm(int i, int i2, Integer num, List list) {
        if (i == Integer.MIN_VALUE || !CatchingFishCoroutineFlow()) {
            return false;
        }
        AccessibilityEvent CatchingFishUnitTesting = CatchingFishUnitTesting(i, i2);
        if (num != null) {
            CatchingFishUnitTesting.setContentChangeTypes(num.intValue());
        }
        if (list != null) {
            CatchingFishUnitTesting.setContentDescription(CatchingFishReduxFirebase.CatchingFishParcelableFAB(",", list));
        }
        return CatchingFishGsonAppCompat(CatchingFishUnitTesting);
    }

    public final void CatchingFishCardViewView(String str, int i, int i2) {
        AccessibilityEvent CatchingFishUnitTesting = CatchingFishUnitTesting(CatchingFishSpannableWidget(i), 32);
        CatchingFishUnitTesting.setContentChangeTypes(i2);
        if (str != null) {
            CatchingFishUnitTesting.getText().add(str);
        }
        CatchingFishGsonAppCompat(CatchingFishUnitTesting);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007e A[Catch: all -> 0x003a, TRY_LEAVE, TryCatch #1 {all -> 0x003a, blocks: (B:12:0x0030, B:15:0x0061, B:21:0x0076, B:23:0x007e, B:26:0x008b, B:28:0x0091, B:32:0x00c0, B:33:0x00a1, B:37:0x00b2, B:39:0x00ba, B:42:0x00c3, B:43:0x00c8, B:46:0x00c9, B:47:0x00ce, B:49:0x00cf, B:51:0x00d7, B:74:0x004b, B:76:0x0052), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x012e -> B:14:0x0131). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object CatchingFishCloudMessaging(CatchingFishStateFlowGson catchingFishStateFlowGson) {
        CatchingFishKtorMoshi catchingFishKtorMoshi;
        int i;
        CatchingFishRoomStateFlow catchingFishRoomStateFlow;
        CatchingFishRoomStateFlow catchingFishRoomStateFlow2;
        CatchingFishMVIWidget catchingFishMVIWidget;
        CatchingFishMVVMCardView catchingFishMVVMCardView;
        CatchingFishMVIWidget catchingFishMVIWidget2;
        CatchingFishMVVMCardView catchingFishMVVMCardView2;
        int i2;
        long j;
        Object CatchingFishSnackbar;
        try {
            if (catchingFishStateFlowGson instanceof CatchingFishKtorMoshi) {
                catchingFishKtorMoshi = (CatchingFishKtorMoshi) catchingFishStateFlowGson;
                int i3 = catchingFishKtorMoshi.CatchingFishCloudMessaging;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    catchingFishKtorMoshi.CatchingFishCloudMessaging = i3 - Integer.MIN_VALUE;
                    Object obj = catchingFishKtorMoshi.CatchingFishLayout;
                    i = catchingFishKtorMoshi.CatchingFishCloudMessaging;
                    catchingFishRoomStateFlow = this.CatchingFishDaggerHiltFAB;
                    int i4 = 1;
                    CatchingFishXMLLayoutMockk catchingFishXMLLayoutMockk = CatchingFishXMLLayoutMockk.CatchingFishReduxKtor;
                    if (i != 0) {
                        CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj);
                        catchingFishMVIWidget = new CatchingFishMVIWidget();
                        CatchingFishPicassoCameraX catchingFishPicassoCameraX = this.CatchingFishSpannableWidget;
                        catchingFishPicassoCameraX.getClass();
                        catchingFishMVVMCardView = new CatchingFishMVVMCardView(catchingFishPicassoCameraX);
                        catchingFishKtorMoshi.CatchingFishViewModelScope = catchingFishMVIWidget;
                        catchingFishKtorMoshi.CatchingFishViewModelFAB = catchingFishMVVMCardView;
                        catchingFishKtorMoshi.CatchingFishCloudMessaging = i4;
                        CatchingFishSnackbar = catchingFishMVVMCardView.CatchingFishSnackbar(catchingFishKtorMoshi);
                        if (CatchingFishSnackbar == catchingFishXMLLayoutMockk) {
                        }
                    } else if (i == 1) {
                        catchingFishMVVMCardView2 = catchingFishKtorMoshi.CatchingFishViewModelFAB;
                        catchingFishMVIWidget2 = catchingFishKtorMoshi.CatchingFishViewModelScope;
                        CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj);
                        if (((Boolean) obj).booleanValue()) {
                        }
                    } else {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        catchingFishMVVMCardView2 = catchingFishKtorMoshi.CatchingFishViewModelFAB;
                        catchingFishMVIWidget2 = catchingFishKtorMoshi.CatchingFishViewModelScope;
                        CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj);
                        char c = 2;
                        catchingFishRoomStateFlow2 = catchingFishRoomStateFlow;
                        int i5 = 1;
                        CatchingFishXMLLayoutMockk catchingFishXMLLayoutMockk2 = catchingFishXMLLayoutMockk;
                        catchingFishRoomStateFlow = catchingFishRoomStateFlow2;
                        catchingFishMVIWidget = catchingFishMVIWidget2;
                        i4 = i5;
                        catchingFishXMLLayoutMockk = catchingFishXMLLayoutMockk2;
                        catchingFishMVVMCardView = catchingFishMVVMCardView2;
                        catchingFishKtorMoshi.CatchingFishViewModelScope = catchingFishMVIWidget;
                        catchingFishKtorMoshi.CatchingFishViewModelFAB = catchingFishMVVMCardView;
                        catchingFishKtorMoshi.CatchingFishCloudMessaging = i4;
                        CatchingFishSnackbar = catchingFishMVVMCardView.CatchingFishSnackbar(catchingFishKtorMoshi);
                        if (CatchingFishSnackbar == catchingFishXMLLayoutMockk) {
                            return catchingFishXMLLayoutMockk;
                        }
                        CatchingFishMVVMCardView catchingFishMVVMCardView3 = catchingFishMVVMCardView;
                        catchingFishMVIWidget2 = catchingFishMVIWidget;
                        obj = CatchingFishSnackbar;
                        catchingFishMVVMCardView2 = catchingFishMVVMCardView3;
                        if (((Boolean) obj).booleanValue()) {
                            catchingFishRoomStateFlow.clear();
                            return CatchingFishRealmContext.CatchingFishParcelableFAB;
                        }
                        catchingFishMVVMCardView2.CatchingFishCoroutine();
                        boolean CatchingFishCoroutineFlow = CatchingFishCoroutineFlow();
                        CatchingFishLayoutGsonRoom catchingFishLayoutGsonRoom = this.CatchingFishRoomDatabase;
                        CatchingFishLayoutGsonRoom catchingFishLayoutGsonRoom2 = this.CatchingFishStateLiveData;
                        if (CatchingFishCoroutineFlow) {
                            int i6 = catchingFishRoomStateFlow.CatchingFishWorkManager;
                            for (int i7 = 0; i7 < i6; i7++) {
                                CatchingFishBiometricRoom catchingFishBiometricRoom = (CatchingFishBiometricRoom) catchingFishRoomStateFlow.CatchingFishDaggerWebsocket[i7];
                                CatchingFishFragmentFactory(catchingFishBiometricRoom, catchingFishMVIWidget2);
                                if (catchingFishBiometricRoom.CatchingFishCustomView() && !this.CatchingFishReduxKtor.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(catchingFishBiometricRoom)) {
                                    int i8 = catchingFishBiometricRoom.CatchingFishDaggerWebsocket;
                                    if (catchingFishLayoutGsonRoom2.CatchingFishSnackbar(i8) != null) {
                                        throw new ClassCastException();
                                    }
                                    if (catchingFishLayoutGsonRoom.CatchingFishSnackbar(i8) != null) {
                                        throw new ClassCastException();
                                    }
                                }
                            }
                            catchingFishMVIWidget2.CatchingFishReduxKtor = 0;
                            long[] jArr = catchingFishMVIWidget2.CatchingFishParcelableFAB;
                            if (jArr != CatchingFishViewPayPal.CatchingFishParcelableFAB) {
                                try {
                                    CatchingFishMVVMHilt.CatchingFishMVVMAppCompat(jArr);
                                    long[] jArr2 = catchingFishMVIWidget2.CatchingFishParcelableFAB;
                                    i2 = catchingFishMVIWidget2.CatchingFishCoroutine;
                                    int i9 = i2 >> 3;
                                    jArr2[i9] = j | ((~j) & jArr2[i9]);
                                } catch (Throwable th) {
                                    th = th;
                                    catchingFishRoomStateFlow2.clear();
                                    throw th;
                                }
                                catchingFishRoomStateFlow2 = catchingFishRoomStateFlow;
                                j = 255 << ((i2 & 7) << 3);
                                catchingFishXMLLayoutMockk2 = catchingFishXMLLayoutMockk;
                            } else {
                                catchingFishRoomStateFlow2 = catchingFishRoomStateFlow;
                                catchingFishXMLLayoutMockk2 = catchingFishXMLLayoutMockk;
                            }
                            catchingFishMVIWidget2.CatchingFishDaggerWebsocket = CatchingFishViewPayPal.CatchingFishParcelableFAB(catchingFishMVIWidget2.CatchingFishCoroutine) - catchingFishMVIWidget2.CatchingFishReduxKtor;
                            if (this.CatchingFishSensorManager) {
                                i5 = 1;
                            } else {
                                i5 = 1;
                                this.CatchingFishSensorManager = true;
                                this.CatchingFishEspressoTesting.post(this.CatchingFishDagger);
                            }
                        } else {
                            catchingFishRoomStateFlow2 = catchingFishRoomStateFlow;
                            i5 = i4;
                            catchingFishXMLLayoutMockk2 = catchingFishXMLLayoutMockk;
                        }
                        catchingFishRoomStateFlow2.clear();
                        catchingFishLayoutGsonRoom2.CatchingFishCoroutine();
                        catchingFishLayoutGsonRoom.CatchingFishCoroutine();
                        long j2 = this.CatchingFishViewModelFAB;
                        catchingFishKtorMoshi.CatchingFishViewModelScope = catchingFishMVIWidget2;
                        catchingFishKtorMoshi.CatchingFishViewModelFAB = catchingFishMVVMCardView2;
                        c = 2;
                        catchingFishKtorMoshi.CatchingFishCloudMessaging = 2;
                        if (CatchingFishRobolectricHilt.CatchingFishStateLiveData(j2, catchingFishKtorMoshi) == catchingFishXMLLayoutMockk2) {
                            return catchingFishXMLLayoutMockk2;
                        }
                        catchingFishRoomStateFlow = catchingFishRoomStateFlow2;
                        catchingFishMVIWidget = catchingFishMVIWidget2;
                        i4 = i5;
                        catchingFishXMLLayoutMockk = catchingFishXMLLayoutMockk2;
                        catchingFishMVVMCardView = catchingFishMVVMCardView2;
                        catchingFishKtorMoshi.CatchingFishViewModelScope = catchingFishMVIWidget;
                        catchingFishKtorMoshi.CatchingFishViewModelFAB = catchingFishMVVMCardView;
                        catchingFishKtorMoshi.CatchingFishCloudMessaging = i4;
                        CatchingFishSnackbar = catchingFishMVVMCardView.CatchingFishSnackbar(catchingFishKtorMoshi);
                        if (CatchingFishSnackbar == catchingFishXMLLayoutMockk) {
                        }
                    }
                }
            }
            if (i != 0) {
            }
        } catch (Throwable th2) {
            th = th2;
            catchingFishRoomStateFlow2 = catchingFishRoomStateFlow;
        }
        catchingFishKtorMoshi = new CatchingFishKtorMoshi(this, catchingFishStateFlowGson);
        Object obj2 = catchingFishKtorMoshi.CatchingFishLayout;
        i = catchingFishKtorMoshi.CatchingFishCloudMessaging;
        catchingFishRoomStateFlow = this.CatchingFishDaggerHiltFAB;
        int i42 = 1;
        CatchingFishXMLLayoutMockk catchingFishXMLLayoutMockk3 = CatchingFishXMLLayoutMockk.CatchingFishReduxKtor;
    }

    public final boolean CatchingFishCoroutineFlow() {
        return this.CatchingFishViewModelScope.isEnabled() && !this.CatchingFishCloudMessaging.isEmpty();
    }

    /* JADX WARN: Code restructure failed: missing block: B:177:0x0435, code lost:
    
        if (r1.isEmpty() == false) goto L191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x0467, code lost:
    
        if (r4 != null) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x046c, code lost:
    
        if (r4 == null) goto L212;
     */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0475  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x015e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void CatchingFishCustomView(CatchingFishReduxLifecycle catchingFishReduxLifecycle) {
        Integer num;
        ArrayList arrayList;
        int[] iArr;
        long[] jArr;
        int i;
        ArrayList arrayList2;
        int[] iArr2;
        long[] jArr2;
        int i2;
        int i3;
        Integer num2;
        CatchingFishMVPMotionLayout catchingFishMVPMotionLayout;
        CatchingFishMVIGraphQLHilt catchingFishMVIGraphQLHilt;
        int i4;
        boolean z;
        CatchingFishPayPalService catchingFishPayPalService;
        int i5;
        int i6;
        CatchingFishMVPMotionLayout catchingFishMVPMotionLayout2;
        ArrayList arrayList3;
        int i7;
        long j;
        int i8;
        Integer num3;
        int i9;
        CatchingFishPayPalService catchingFishPayPalService2;
        int i10;
        int i11;
        CatchingFishMVIGraphQLHilt catchingFishMVIGraphQLHilt2;
        CatchingFishManifestHiltFAB catchingFishManifestHiltFAB;
        boolean z2;
        CatchingFishGraphQLLayout catchingFishGraphQLLayout;
        CatchingFishManifestHiltFAB catchingFishManifestHiltFAB2;
        boolean z3;
        int i12;
        String str;
        int i13;
        int i14;
        int i15;
        Integer num4;
        AccessibilityEvent CatchingFishStateLiveData;
        Integer num5;
        CatchingFishReduxLifecycle catchingFishReduxLifecycle2 = catchingFishReduxLifecycle;
        ArrayList arrayList4 = this.CatchingFishCameraXIntent;
        ArrayList arrayList5 = new ArrayList(arrayList4);
        arrayList4.clear();
        int[] iArr3 = catchingFishReduxLifecycle2.CatchingFishSnackbar;
        long[] jArr3 = catchingFishReduxLifecycle2.CatchingFishParcelableFAB;
        int i16 = 2;
        int length = jArr3.length - 2;
        int i17 = 0;
        Integer num6 = 0;
        if (length < 0) {
            return;
        }
        int i18 = 0;
        while (true) {
            long j2 = jArr3[i18];
            int i19 = i16;
            int i20 = length;
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i21 = 8;
                int i22 = 8 - ((~(i18 - i20)) >>> 31);
                long j3 = j2;
                int i23 = i17;
                while (i23 < i22) {
                    if ((j3 & 255) < 128) {
                        int i24 = iArr3[(i18 << 3) + i23];
                        CatchingFishHiltGlideRoom catchingFishHiltGlideRoom = (CatchingFishHiltGlideRoom) this.CatchingFishJobScheduler.CatchingFishSnackbar(i24);
                        if (catchingFishHiltGlideRoom != null) {
                            CatchingFishMVPMotionLayout catchingFishMVPMotionLayout3 = catchingFishHiltGlideRoom.CatchingFishParcelableFAB;
                            CatchingFishPayPalService catchingFishPayPalService3 = catchingFishMVPMotionLayout3.CatchingFishReduxKtor;
                            CatchingFishMoshiKtor catchingFishMoshiKtor = (CatchingFishMoshiKtor) catchingFishReduxLifecycle2.CatchingFishSnackbar(i24);
                            CatchingFishMVIGraphQLHilt catchingFishMVIGraphQLHilt3 = catchingFishMoshiKtor != null ? catchingFishMoshiKtor.CatchingFishParcelableFAB : null;
                            if (catchingFishMVIGraphQLHilt3 == null) {
                                throw CatchingFishMVPLiveData.CatchingFish("no value for specified key");
                            }
                            int i25 = i21;
                            int i26 = catchingFishMVIGraphQLHilt3.CatchingFishViewModelScope;
                            CatchingFishMVPMotionLayout catchingFishMVPMotionLayout4 = catchingFishMVIGraphQLHilt3.CatchingFishReduxKtor;
                            iArr2 = iArr3;
                            CatchingFishPayPalService catchingFishPayPalService4 = catchingFishMVPMotionLayout4.CatchingFishReduxKtor;
                            jArr2 = jArr3;
                            Object[] objArr = catchingFishPayPalService4.CatchingFishSnackbar;
                            Object[] objArr2 = catchingFishPayPalService4.CatchingFishCoroutine;
                            long[] jArr4 = catchingFishPayPalService4.CatchingFishParcelableFAB;
                            i = i23;
                            int length2 = jArr4.length - 2;
                            boolean z4 = true;
                            if (length2 >= 0) {
                                i3 = i22;
                                CatchingFishMVIGraphQLHilt catchingFishMVIGraphQLHilt4 = catchingFishMVIGraphQLHilt3;
                                int i27 = 0;
                                z = false;
                                while (true) {
                                    long j4 = jArr4[i27];
                                    int i28 = i27;
                                    int i29 = i26;
                                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i30 = 8 - ((~(i28 - length2)) >>> 31);
                                        int i31 = 0;
                                        while (i31 < i30) {
                                            if ((j4 & 255) < 128) {
                                                int i32 = (i28 << 3) + i31;
                                                Object obj = objArr[i32];
                                                int i33 = length2;
                                                Object obj2 = objArr2[i32];
                                                catchingFishMVPMotionLayout2 = catchingFishMVPMotionLayout3;
                                                CatchingFishGraphQLLayout catchingFishGraphQLLayout2 = (CatchingFishGraphQLLayout) obj;
                                                i7 = i31;
                                                CatchingFishGraphQLLayout catchingFishGraphQLLayout3 = CatchingFishServiceMVI.CatchingFish;
                                                if (CatchingFishFirebaseDagger.CatchingFishOkHttp(catchingFishGraphQLLayout2, catchingFishGraphQLLayout3)) {
                                                    j = j4;
                                                } else {
                                                    j = j4;
                                                    if (!CatchingFishFirebaseDagger.CatchingFishOkHttp(catchingFishGraphQLLayout2, CatchingFishServiceMVI.CatchingFishJetpackCompose)) {
                                                        z2 = false;
                                                        if (!z2) {
                                                            Object CatchingFishViewModelScope = catchingFishPayPalService3.CatchingFishViewModelScope(catchingFishGraphQLLayout2);
                                                            if (CatchingFishViewModelScope == null) {
                                                                CatchingFishViewModelScope = null;
                                                            }
                                                            if (CatchingFishFirebaseDagger.CatchingFishOkHttp(obj2, CatchingFishViewModelScope)) {
                                                                num3 = num6;
                                                                catchingFishPayPalService2 = catchingFishPayPalService3;
                                                                arrayList3 = arrayList5;
                                                                i8 = i25;
                                                                i10 = i29;
                                                                i9 = i24;
                                                                catchingFishMVIGraphQLHilt2 = catchingFishMVIGraphQLHilt4;
                                                                i11 = i33;
                                                                long j5 = j >> i8;
                                                                i25 = i8;
                                                                catchingFishMVIGraphQLHilt4 = catchingFishMVIGraphQLHilt2;
                                                                i31 = i7 + 1;
                                                                i29 = i10;
                                                                length2 = i11;
                                                                i24 = i9;
                                                                num6 = num3;
                                                                arrayList5 = arrayList3;
                                                                catchingFishPayPalService3 = catchingFishPayPalService2;
                                                                j4 = j5;
                                                                catchingFishMVPMotionLayout3 = catchingFishMVPMotionLayout2;
                                                            }
                                                        }
                                                        catchingFishGraphQLLayout = CatchingFishServiceMVI.CatchingFishReduxKtor;
                                                        if (CatchingFishFirebaseDagger.CatchingFishOkHttp(catchingFishGraphQLLayout2, catchingFishGraphQLLayout)) {
                                                            if (CatchingFishFirebaseDagger.CatchingFishOkHttp(catchingFishGraphQLLayout2, CatchingFishServiceMVI.CatchingFishSnackbar) || CatchingFishFirebaseDagger.CatchingFishOkHttp(catchingFishGraphQLLayout2, CatchingFishServiceMVI.CatchingFishCustomView)) {
                                                                num3 = num6;
                                                                catchingFishPayPalService2 = catchingFishPayPalService3;
                                                                arrayList3 = arrayList5;
                                                                i10 = i29;
                                                                i9 = i24;
                                                                catchingFishMVIGraphQLHilt2 = catchingFishMVIGraphQLHilt4;
                                                                i11 = i33;
                                                                i8 = 8;
                                                                CatchingFishPayPal(this, CatchingFishSpannableWidget(i9), 2048, 64, 8);
                                                                CatchingFishPayPal(this, CatchingFishSpannableWidget(i9), 2048, num3, 8);
                                                            } else {
                                                                if (CatchingFishFirebaseDagger.CatchingFishOkHttp(catchingFishGraphQLLayout2, CatchingFishServiceMVI.CatchingFishCoroutine)) {
                                                                    i8 = 8;
                                                                    CatchingFishPayPal(this, CatchingFishSpannableWidget(i24), 2048, 64, 8);
                                                                    CatchingFishPayPal(this, CatchingFishSpannableWidget(i24), 2048, num6, 8);
                                                                    num3 = num6;
                                                                } else if (CatchingFishFirebaseDagger.CatchingFishOkHttp(catchingFishGraphQLLayout2, CatchingFishServiceMVI.CatchingFishMVPRobolectric)) {
                                                                    Object CatchingFishViewModelScope2 = catchingFishPayPalService4.CatchingFishViewModelScope(CatchingFishServiceMVI.CatchingFishCoroutineFlow);
                                                                    if (CatchingFishViewModelScope2 == null) {
                                                                        CatchingFishViewModelScope2 = null;
                                                                    }
                                                                    CatchingFishPayPal(this, CatchingFishSpannableWidget(i24), 2048, 64, 8);
                                                                    CatchingFishPayPal(this, CatchingFishSpannableWidget(i24), 2048, num6, 8);
                                                                    num3 = num6;
                                                                    i8 = 8;
                                                                } else if (CatchingFishFirebaseDagger.CatchingFishOkHttp(catchingFishGraphQLLayout2, CatchingFishServiceMVI.CatchingFishParcelableFAB)) {
                                                                    int CatchingFishSpannableWidget = CatchingFishSpannableWidget(i24);
                                                                    CatchingFishFirebaseDagger.CatchingFishStateLiveData(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                                                                    CatchingFishCardViewRealm(CatchingFishSpannableWidget, 2048, 4, (List) obj2);
                                                                } else {
                                                                    CatchingFishGraphQLLayout catchingFishGraphQLLayout4 = CatchingFishServiceMVI.CatchingFishPayPal;
                                                                    String str2 = "";
                                                                    if (!CatchingFishFirebaseDagger.CatchingFishOkHttp(catchingFishGraphQLLayout2, catchingFishGraphQLLayout4)) {
                                                                        Integer num7 = num6;
                                                                        catchingFishPayPalService2 = catchingFishPayPalService3;
                                                                        arrayList3 = arrayList5;
                                                                        i9 = i24;
                                                                        CatchingFishGraphQLLayout catchingFishGraphQLLayout5 = CatchingFishServiceMVI.CatchingFishCardViewView;
                                                                        if (CatchingFishFirebaseDagger.CatchingFishOkHttp(catchingFishGraphQLLayout2, catchingFishGraphQLLayout5)) {
                                                                            Object CatchingFishViewModelScope3 = catchingFishPayPalService4.CatchingFishViewModelScope(catchingFishGraphQLLayout4);
                                                                            if (CatchingFishViewModelScope3 == null) {
                                                                                CatchingFishViewModelScope3 = null;
                                                                            }
                                                                            CatchingFishWebsocketDagger catchingFishWebsocketDagger = (CatchingFishWebsocketDagger) CatchingFishViewModelScope3;
                                                                            if (catchingFishWebsocketDagger != null && (str = catchingFishWebsocketDagger.CatchingFishDaggerWebsocket) != null) {
                                                                                str2 = str;
                                                                            }
                                                                            long j6 = ((CatchingFishToastViewModel) catchingFishMVPMotionLayout4.CatchingFishSnackbar(catchingFishGraphQLLayout5)).CatchingFishParcelableFAB;
                                                                            num3 = num7;
                                                                            CatchingFishGsonAppCompat(CatchingFishStateLiveData(CatchingFishSpannableWidget(i9), Integer.valueOf((int) (j6 >> 32)), Integer.valueOf((int) (j6 & 4294967295L)), Integer.valueOf(str2.length()), CatchingFishEspressoMockk(str2)));
                                                                            i10 = i29;
                                                                            CatchingFishMVPRobolectric(i10);
                                                                            catchingFishMVIGraphQLHilt2 = catchingFishMVIGraphQLHilt4;
                                                                            i11 = i33;
                                                                        } else {
                                                                            i10 = i29;
                                                                            i11 = i33;
                                                                            num3 = num7;
                                                                            if (CatchingFishFirebaseDagger.CatchingFishOkHttp(catchingFishGraphQLLayout2, catchingFishGraphQLLayout3) || CatchingFishFirebaseDagger.CatchingFishOkHttp(catchingFishGraphQLLayout2, CatchingFishServiceMVI.CatchingFishJetpackCompose)) {
                                                                                CatchingFishMVIGraphQLHilt catchingFishMVIGraphQLHilt5 = catchingFishMVIGraphQLHilt4;
                                                                                CatchingFishDaggerHiltFAB(catchingFishMVIGraphQLHilt5.CatchingFishCoroutine);
                                                                                int size = arrayList4.size();
                                                                                int i34 = 0;
                                                                                while (true) {
                                                                                    if (i34 >= size) {
                                                                                        catchingFishMVIGraphQLHilt2 = catchingFishMVIGraphQLHilt5;
                                                                                        catchingFishManifestHiltFAB2 = null;
                                                                                        break;
                                                                                    }
                                                                                    catchingFishMVIGraphQLHilt2 = catchingFishMVIGraphQLHilt5;
                                                                                    if (((CatchingFishManifestHiltFAB) arrayList4.get(i34)).CatchingFishReduxKtor == i9) {
                                                                                        catchingFishManifestHiltFAB2 = (CatchingFishManifestHiltFAB) arrayList4.get(i34);
                                                                                        break;
                                                                                    } else {
                                                                                        i34++;
                                                                                        catchingFishMVIGraphQLHilt5 = catchingFishMVIGraphQLHilt2;
                                                                                    }
                                                                                }
                                                                                CatchingFishFirebaseDagger.CatchingFishAnimationMockk(catchingFishManifestHiltFAB2);
                                                                                Object CatchingFishViewModelScope4 = catchingFishPayPalService4.CatchingFishViewModelScope(catchingFishGraphQLLayout3);
                                                                                if (CatchingFishViewModelScope4 == null) {
                                                                                    CatchingFishViewModelScope4 = null;
                                                                                }
                                                                                if (CatchingFishViewModelScope4 != null) {
                                                                                    throw new ClassCastException();
                                                                                }
                                                                                Object CatchingFishViewModelScope5 = catchingFishPayPalService4.CatchingFishViewModelScope(CatchingFishServiceMVI.CatchingFishJetpackCompose);
                                                                                if (CatchingFishViewModelScope5 == null) {
                                                                                    CatchingFishViewModelScope5 = null;
                                                                                }
                                                                                if (CatchingFishViewModelScope5 != null) {
                                                                                    throw new ClassCastException();
                                                                                }
                                                                                if (catchingFishManifestHiltFAB2.CatchingFishDaggerWebsocket.contains(catchingFishManifestHiltFAB2)) {
                                                                                    this.CatchingFishReduxKtor.getSnapshotObserver().CatchingFishParcelableFAB(catchingFishManifestHiltFAB2, this.CatchingFishHandler, new CatchingFishViewPagerRedux(catchingFishManifestHiltFAB2, this));
                                                                                }
                                                                            } else if (CatchingFishFirebaseDagger.CatchingFishOkHttp(catchingFishGraphQLLayout2, CatchingFishServiceMVI.CatchingFishCloudMessaging)) {
                                                                                CatchingFishFirebaseDagger.CatchingFishStateLiveData(obj2, "null cannot be cast to non-null type kotlin.Boolean");
                                                                                if (((Boolean) obj2).booleanValue()) {
                                                                                    i12 = 8;
                                                                                    CatchingFishGsonAppCompat(CatchingFishUnitTesting(CatchingFishSpannableWidget(i10), 8));
                                                                                } else {
                                                                                    i12 = 8;
                                                                                }
                                                                                CatchingFishPayPal(this, CatchingFishSpannableWidget(i10), 2048, num3, i12);
                                                                                i8 = i12;
                                                                            } else {
                                                                                CatchingFishGraphQLLayout catchingFishGraphQLLayout6 = CatchingFishViewStripeAPI.CatchingFishCoroutineFlow;
                                                                                if (CatchingFishFirebaseDagger.CatchingFishOkHttp(catchingFishGraphQLLayout2, catchingFishGraphQLLayout6)) {
                                                                                    List list = (List) catchingFishMVPMotionLayout4.CatchingFishSnackbar(catchingFishGraphQLLayout6);
                                                                                    Object CatchingFishViewModelScope6 = catchingFishPayPalService2.CatchingFishViewModelScope(catchingFishGraphQLLayout6);
                                                                                    if (CatchingFishViewModelScope6 == null) {
                                                                                        CatchingFishViewModelScope6 = null;
                                                                                    }
                                                                                    List list2 = (List) CatchingFishViewModelScope6;
                                                                                    if (list2 != null) {
                                                                                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                                                                                        if (list.size() > 0) {
                                                                                            list.get(0).getClass();
                                                                                            throw new ClassCastException();
                                                                                        }
                                                                                        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                                                                                        if (list2.size() > 0) {
                                                                                            list2.get(0).getClass();
                                                                                            throw new ClassCastException();
                                                                                        }
                                                                                        z = (linkedHashSet.containsAll(linkedHashSet2) && linkedHashSet2.containsAll(linkedHashSet)) ? false : true;
                                                                                    }
                                                                                    catchingFishMVIGraphQLHilt2 = catchingFishMVIGraphQLHilt4;
                                                                                } else {
                                                                                    if (obj2 instanceof CatchingFishSnackbarToast) {
                                                                                        CatchingFishSnackbarToast catchingFishSnackbarToast = (CatchingFishSnackbarToast) obj2;
                                                                                        Object CatchingFishViewModelScope7 = catchingFishPayPalService2.CatchingFishViewModelScope(catchingFishGraphQLLayout2);
                                                                                        if (CatchingFishViewModelScope7 == null) {
                                                                                            CatchingFishViewModelScope7 = null;
                                                                                        }
                                                                                        if (catchingFishSnackbarToast != CatchingFishViewModelScope7) {
                                                                                            if (CatchingFishViewModelScope7 instanceof CatchingFishSnackbarToast) {
                                                                                                String str3 = catchingFishSnackbarToast.CatchingFishParcelableFAB;
                                                                                                CatchingFishSnackbarToast catchingFishSnackbarToast2 = (CatchingFishSnackbarToast) CatchingFishViewModelScope7;
                                                                                                String str4 = catchingFishSnackbarToast2.CatchingFishParcelableFAB;
                                                                                                CatchingFishIntentAnimation catchingFishIntentAnimation = catchingFishSnackbarToast2.CatchingFishSnackbar;
                                                                                                if (CatchingFishFirebaseDagger.CatchingFishOkHttp(str3, str4)) {
                                                                                                    CatchingFishIntentAnimation catchingFishIntentAnimation2 = catchingFishSnackbarToast.CatchingFishSnackbar;
                                                                                                    if (catchingFishIntentAnimation2 == null) {
                                                                                                    }
                                                                                                    if (catchingFishIntentAnimation2 != null) {
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            z3 = false;
                                                                                            if (z3) {
                                                                                                z = false;
                                                                                                catchingFishMVIGraphQLHilt2 = catchingFishMVIGraphQLHilt4;
                                                                                            }
                                                                                        }
                                                                                        z3 = true;
                                                                                        if (z3) {
                                                                                        }
                                                                                    }
                                                                                    z = true;
                                                                                    catchingFishMVIGraphQLHilt2 = catchingFishMVIGraphQLHilt4;
                                                                                }
                                                                            }
                                                                        }
                                                                        i8 = 8;
                                                                    } else if (catchingFishPayPalService4.CatchingFishCoroutine(CatchingFishViewStripeAPI.CatchingFishLayout)) {
                                                                        Object CatchingFishViewModelScope8 = catchingFishPayPalService3.CatchingFishViewModelScope(catchingFishGraphQLLayout4);
                                                                        if (CatchingFishViewModelScope8 == null) {
                                                                            CatchingFishViewModelScope8 = null;
                                                                        }
                                                                        CatchingFishWebsocketDagger catchingFishWebsocketDagger2 = (CatchingFishWebsocketDagger) CatchingFishViewModelScope8;
                                                                        if (catchingFishWebsocketDagger2 == null) {
                                                                            catchingFishWebsocketDagger2 = "";
                                                                        }
                                                                        Object CatchingFishViewModelScope9 = catchingFishPayPalService4.CatchingFishViewModelScope(catchingFishGraphQLLayout4);
                                                                        if (CatchingFishViewModelScope9 == null) {
                                                                            CatchingFishViewModelScope9 = null;
                                                                        }
                                                                        CharSequence charSequence = (CatchingFishWebsocketDagger) CatchingFishViewModelScope9;
                                                                        if (charSequence == null) {
                                                                            charSequence = "";
                                                                        }
                                                                        CharSequence CatchingFishEspressoMockk = CatchingFishEspressoMockk(charSequence);
                                                                        int length3 = catchingFishWebsocketDagger2.length();
                                                                        int length4 = charSequence.length();
                                                                        Integer num8 = num6;
                                                                        int i35 = length3 > length4 ? length4 : length3;
                                                                        arrayList3 = arrayList5;
                                                                        int i36 = 0;
                                                                        while (true) {
                                                                            i13 = i35;
                                                                            if (i36 >= i35) {
                                                                                i14 = length3;
                                                                                break;
                                                                            }
                                                                            i14 = length3;
                                                                            if (catchingFishWebsocketDagger2.charAt(i36) != charSequence.charAt(i36)) {
                                                                                break;
                                                                            }
                                                                            i36++;
                                                                            i35 = i13;
                                                                            length3 = i14;
                                                                        }
                                                                        int i37 = 0;
                                                                        while (true) {
                                                                            if (i37 >= i13 - i36) {
                                                                                i15 = i37;
                                                                                break;
                                                                            }
                                                                            i15 = i37;
                                                                            if (catchingFishWebsocketDagger2.charAt((i14 - 1) - i37) != charSequence.charAt((length4 - 1) - i15)) {
                                                                                break;
                                                                            } else {
                                                                                i37 = i15 + 1;
                                                                            }
                                                                        }
                                                                        int i38 = (i14 - i15) - i36;
                                                                        int i39 = (length4 - i15) - i36;
                                                                        CatchingFishGraphQLLayout catchingFishGraphQLLayout7 = CatchingFishServiceMVI.CatchingFishFragmentFactory;
                                                                        boolean CatchingFishCoroutine = catchingFishPayPalService3.CatchingFishCoroutine(catchingFishGraphQLLayout7);
                                                                        boolean CatchingFishCoroutine2 = catchingFishPayPalService4.CatchingFishCoroutine(catchingFishGraphQLLayout7);
                                                                        boolean CatchingFishCoroutine3 = catchingFishPayPalService3.CatchingFishCoroutine(CatchingFishServiceMVI.CatchingFishPayPal);
                                                                        boolean z5 = CatchingFishCoroutine3 && !CatchingFishCoroutine && CatchingFishCoroutine2;
                                                                        boolean z6 = CatchingFishCoroutine3 && CatchingFishCoroutine && !CatchingFishCoroutine2;
                                                                        if (z5 || z6) {
                                                                            int CatchingFishSpannableWidget2 = CatchingFishSpannableWidget(i24);
                                                                            Integer valueOf = Integer.valueOf(length4);
                                                                            i9 = i24;
                                                                            catchingFishPayPalService2 = catchingFishPayPalService3;
                                                                            num4 = num8;
                                                                            CatchingFishStateLiveData = CatchingFishStateLiveData(CatchingFishSpannableWidget2, num4, num8, valueOf, CatchingFishEspressoMockk);
                                                                        } else {
                                                                            CatchingFishStateLiveData = CatchingFishUnitTesting(CatchingFishSpannableWidget(i24), 16);
                                                                            CatchingFishStateLiveData.setFromIndex(i36);
                                                                            CatchingFishStateLiveData.setRemovedCount(i38);
                                                                            CatchingFishStateLiveData.setAddedCount(i39);
                                                                            CatchingFishStateLiveData.setBeforeText(catchingFishWebsocketDagger2);
                                                                            CatchingFishStateLiveData.getText().add(CatchingFishEspressoMockk);
                                                                            i9 = i24;
                                                                            catchingFishPayPalService2 = catchingFishPayPalService3;
                                                                            num4 = num8;
                                                                        }
                                                                        CatchingFishStateLiveData.setClassName("android.widget.EditText");
                                                                        CatchingFishGsonAppCompat(CatchingFishStateLiveData);
                                                                        if (z5 || z6) {
                                                                            num5 = num4;
                                                                            long j7 = ((CatchingFishToastViewModel) catchingFishMVPMotionLayout4.CatchingFishSnackbar(CatchingFishServiceMVI.CatchingFishCardViewView)).CatchingFishParcelableFAB;
                                                                            CatchingFishStateLiveData.setFromIndex((int) (j7 >> 32));
                                                                            CatchingFishStateLiveData.setToIndex((int) (j7 & 4294967295L));
                                                                            CatchingFishGsonAppCompat(CatchingFishStateLiveData);
                                                                        } else {
                                                                            num5 = num4;
                                                                        }
                                                                        i10 = i29;
                                                                        i11 = i33;
                                                                        num3 = num5;
                                                                        i8 = 8;
                                                                    } else {
                                                                        Integer num9 = num6;
                                                                        catchingFishPayPalService2 = catchingFishPayPalService3;
                                                                        arrayList3 = arrayList5;
                                                                        i9 = i24;
                                                                        i8 = 8;
                                                                        CatchingFishPayPal(this, CatchingFishSpannableWidget(i9), 2048, Integer.valueOf(i19), 8);
                                                                        i10 = i29;
                                                                        i11 = i33;
                                                                        num3 = num9;
                                                                    }
                                                                }
                                                                catchingFishPayPalService2 = catchingFishPayPalService3;
                                                                arrayList3 = arrayList5;
                                                                i10 = i29;
                                                                i9 = i24;
                                                                catchingFishMVIGraphQLHilt2 = catchingFishMVIGraphQLHilt4;
                                                                i11 = i33;
                                                            }
                                                            long j52 = j >> i8;
                                                            i25 = i8;
                                                            catchingFishMVIGraphQLHilt4 = catchingFishMVIGraphQLHilt2;
                                                            i31 = i7 + 1;
                                                            i29 = i10;
                                                            length2 = i11;
                                                            i24 = i9;
                                                            num6 = num3;
                                                            arrayList5 = arrayList3;
                                                            catchingFishPayPalService3 = catchingFishPayPalService2;
                                                            j4 = j52;
                                                            catchingFishMVPMotionLayout3 = catchingFishMVPMotionLayout2;
                                                        } else {
                                                            CatchingFishFirebaseDagger.CatchingFishStateLiveData(obj2, "null cannot be cast to non-null type kotlin.String");
                                                            String str5 = (String) obj2;
                                                            if (catchingFishPayPalService3.CatchingFishCoroutine(catchingFishGraphQLLayout)) {
                                                                CatchingFishCardViewView(str5, i24, i25);
                                                            }
                                                        }
                                                        num3 = num6;
                                                        catchingFishPayPalService2 = catchingFishPayPalService3;
                                                        arrayList3 = arrayList5;
                                                        i10 = i29;
                                                        i8 = 8;
                                                        i9 = i24;
                                                        catchingFishMVIGraphQLHilt2 = catchingFishMVIGraphQLHilt4;
                                                        i11 = i33;
                                                        long j522 = j >> i8;
                                                        i25 = i8;
                                                        catchingFishMVIGraphQLHilt4 = catchingFishMVIGraphQLHilt2;
                                                        i31 = i7 + 1;
                                                        i29 = i10;
                                                        length2 = i11;
                                                        i24 = i9;
                                                        num6 = num3;
                                                        arrayList5 = arrayList3;
                                                        catchingFishPayPalService3 = catchingFishPayPalService2;
                                                        j4 = j522;
                                                        catchingFishMVPMotionLayout3 = catchingFishMVPMotionLayout2;
                                                    }
                                                }
                                                int size2 = arrayList5.size();
                                                int i40 = 0;
                                                while (true) {
                                                    if (i40 >= size2) {
                                                        catchingFishManifestHiltFAB = null;
                                                        break;
                                                    }
                                                    int i41 = size2;
                                                    if (((CatchingFishManifestHiltFAB) arrayList5.get(i40)).CatchingFishReduxKtor == i24) {
                                                        catchingFishManifestHiltFAB = (CatchingFishManifestHiltFAB) arrayList5.get(i40);
                                                        break;
                                                    } else {
                                                        i40++;
                                                        size2 = i41;
                                                    }
                                                }
                                                if (catchingFishManifestHiltFAB != null) {
                                                    z2 = false;
                                                } else {
                                                    catchingFishManifestHiltFAB = new CatchingFishManifestHiltFAB(i24, arrayList4);
                                                    z2 = true;
                                                }
                                                arrayList4.add(catchingFishManifestHiltFAB);
                                                if (!z2) {
                                                }
                                                catchingFishGraphQLLayout = CatchingFishServiceMVI.CatchingFishReduxKtor;
                                                if (CatchingFishFirebaseDagger.CatchingFishOkHttp(catchingFishGraphQLLayout2, catchingFishGraphQLLayout)) {
                                                }
                                                num3 = num6;
                                                catchingFishPayPalService2 = catchingFishPayPalService3;
                                                arrayList3 = arrayList5;
                                                i10 = i29;
                                                i8 = 8;
                                                i9 = i24;
                                                catchingFishMVIGraphQLHilt2 = catchingFishMVIGraphQLHilt4;
                                                i11 = i33;
                                                long j5222 = j >> i8;
                                                i25 = i8;
                                                catchingFishMVIGraphQLHilt4 = catchingFishMVIGraphQLHilt2;
                                                i31 = i7 + 1;
                                                i29 = i10;
                                                length2 = i11;
                                                i24 = i9;
                                                num6 = num3;
                                                arrayList5 = arrayList3;
                                                catchingFishPayPalService3 = catchingFishPayPalService2;
                                                j4 = j5222;
                                                catchingFishMVPMotionLayout3 = catchingFishMVPMotionLayout2;
                                            } else {
                                                catchingFishMVPMotionLayout2 = catchingFishMVPMotionLayout3;
                                                arrayList3 = arrayList5;
                                                i7 = i31;
                                                j = j4;
                                                i8 = i25;
                                                num3 = num6;
                                                i9 = i24;
                                                catchingFishPayPalService2 = catchingFishPayPalService3;
                                                i10 = i29;
                                                i11 = length2;
                                            }
                                            catchingFishMVIGraphQLHilt2 = catchingFishMVIGraphQLHilt4;
                                            long j52222 = j >> i8;
                                            i25 = i8;
                                            catchingFishMVIGraphQLHilt4 = catchingFishMVIGraphQLHilt2;
                                            i31 = i7 + 1;
                                            i29 = i10;
                                            length2 = i11;
                                            i24 = i9;
                                            num6 = num3;
                                            arrayList5 = arrayList3;
                                            catchingFishPayPalService3 = catchingFishPayPalService2;
                                            j4 = j52222;
                                            catchingFishMVPMotionLayout3 = catchingFishMVPMotionLayout2;
                                        }
                                        num2 = num6;
                                        catchingFishMVPMotionLayout = catchingFishMVPMotionLayout3;
                                        catchingFishPayPalService = catchingFishPayPalService3;
                                        arrayList2 = arrayList5;
                                        i5 = i29;
                                        i4 = i24;
                                        catchingFishMVIGraphQLHilt = catchingFishMVIGraphQLHilt4;
                                        i6 = length2;
                                        if (i30 != i25) {
                                            break;
                                        }
                                    } else {
                                        num2 = num6;
                                        catchingFishMVPMotionLayout = catchingFishMVPMotionLayout3;
                                        catchingFishPayPalService = catchingFishPayPalService3;
                                        arrayList2 = arrayList5;
                                        i5 = i29;
                                        i4 = i24;
                                        catchingFishMVIGraphQLHilt = catchingFishMVIGraphQLHilt4;
                                        i6 = length2;
                                    }
                                    if (i28 == i6) {
                                        break;
                                    }
                                    i27 = i28 + 1;
                                    i26 = i5;
                                    length2 = i6;
                                    i24 = i4;
                                    num6 = num2;
                                    catchingFishPayPalService3 = catchingFishPayPalService;
                                    catchingFishMVIGraphQLHilt4 = catchingFishMVIGraphQLHilt;
                                    catchingFishMVPMotionLayout3 = catchingFishMVPMotionLayout;
                                    arrayList5 = arrayList2;
                                    i25 = 8;
                                }
                            } else {
                                catchingFishMVPMotionLayout = catchingFishMVPMotionLayout3;
                                arrayList2 = arrayList5;
                                i3 = i22;
                                catchingFishMVIGraphQLHilt = catchingFishMVIGraphQLHilt3;
                                num2 = num6;
                                i4 = i24;
                                z = false;
                            }
                            if (!z) {
                                Iterator it = catchingFishMVPMotionLayout.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        z4 = false;
                                        break;
                                    } else {
                                        if (!catchingFishMVIGraphQLHilt.CatchingFishCloudMessaging().CatchingFishReduxKtor.CatchingFishCoroutine((CatchingFishGraphQLLayout) ((Map.Entry) it.next()).getKey())) {
                                            break;
                                        }
                                    }
                                }
                                z = z4;
                            }
                            if (z) {
                                i2 = 8;
                                CatchingFishPayPal(this, CatchingFishSpannableWidget(i4), 2048, num2, 8);
                            } else {
                                i2 = 8;
                            }
                            j3 >>= i2;
                            i23 = i + 1;
                            catchingFishReduxLifecycle2 = catchingFishReduxLifecycle;
                            i21 = i2;
                            num6 = num2;
                            iArr3 = iArr2;
                            jArr3 = jArr2;
                            i22 = i3;
                            arrayList5 = arrayList2;
                        }
                    }
                    i = i23;
                    arrayList2 = arrayList5;
                    iArr2 = iArr3;
                    jArr2 = jArr3;
                    i2 = i21;
                    i3 = i22;
                    num2 = num6;
                    j3 >>= i2;
                    i23 = i + 1;
                    catchingFishReduxLifecycle2 = catchingFishReduxLifecycle;
                    i21 = i2;
                    num6 = num2;
                    iArr3 = iArr2;
                    jArr3 = jArr2;
                    i22 = i3;
                    arrayList5 = arrayList2;
                }
                arrayList = arrayList5;
                iArr = iArr3;
                jArr = jArr3;
                int i42 = i21;
                int i43 = i22;
                num = num6;
                if (i43 != i42) {
                    return;
                }
            } else {
                num = num6;
                arrayList = arrayList5;
                iArr = iArr3;
                jArr = jArr3;
            }
            if (i18 == i20) {
                return;
            }
            i18++;
            catchingFishReduxLifecycle2 = catchingFishReduxLifecycle;
            num6 = num;
            i16 = i19;
            iArr3 = iArr;
            jArr3 = jArr;
            arrayList5 = arrayList;
            i17 = 0;
            length = i20;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x013f, code lost:
    
        r28 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0149, code lost:
    
        if (((r7 & ((~r7) << 6)) & r20) == 0) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x014b, code lost:
    
        r25 = -1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void CatchingFishDagger() {
        long j;
        long j2;
        long j3;
        char c;
        long[] jArr;
        long[] jArr2;
        long j4;
        int i;
        int i2;
        int i3;
        char c2;
        CatchingFishMVIWidget catchingFishMVIWidget = new CatchingFishMVIWidget();
        CatchingFishMVIWidget catchingFishMVIWidget2 = this.CatchingFishPayPal;
        int[] iArr = catchingFishMVIWidget2.CatchingFishSnackbar;
        long[] jArr3 = catchingFishMVIWidget2.CatchingFishParcelableFAB;
        int length = jArr3.length - 2;
        CatchingFishLayoutGsonRoom catchingFishLayoutGsonRoom = this.CatchingFishJobScheduler;
        int i4 = 8;
        if (length >= 0) {
            int i5 = 0;
            j = 128;
            j2 = 255;
            while (true) {
                long j5 = jArr3[i5];
                char c3 = 7;
                j3 = -9187201950435737472L;
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i6 = 8 - ((~(i5 - length)) >>> 31);
                    int i7 = 0;
                    while (i7 < i6) {
                        if ((j5 & 255) < 128) {
                            int i8 = iArr[(i5 << 3) + i7];
                            c2 = c3;
                            CatchingFishMoshiKtor catchingFishMoshiKtor = (CatchingFishMoshiKtor) CatchingFish().CatchingFishSnackbar(i8);
                            CatchingFishMVIGraphQLHilt catchingFishMVIGraphQLHilt = catchingFishMoshiKtor != null ? catchingFishMoshiKtor.CatchingFishParcelableFAB : null;
                            if (catchingFishMVIGraphQLHilt != null) {
                                if (catchingFishMVIGraphQLHilt.CatchingFishReduxKtor.CatchingFishReduxKtor.CatchingFishCoroutine(CatchingFishServiceMVI.CatchingFishReduxKtor)) {
                                }
                            }
                            catchingFishMVIWidget.CatchingFishParcelableFAB(i8);
                            CatchingFishHiltGlideRoom catchingFishHiltGlideRoom = (CatchingFishHiltGlideRoom) catchingFishLayoutGsonRoom.CatchingFishSnackbar(i8);
                            if (catchingFishHiltGlideRoom != null) {
                                Object CatchingFishViewModelScope = catchingFishHiltGlideRoom.CatchingFishParcelableFAB.CatchingFishReduxKtor.CatchingFishViewModelScope(CatchingFishServiceMVI.CatchingFishReduxKtor);
                                r23 = CatchingFishViewModelScope != 0 ? CatchingFishViewModelScope : null;
                            }
                            CatchingFishCardViewView(r23, i8, 32);
                        } else {
                            c2 = c3;
                        }
                        j5 >>= 8;
                        i7++;
                        c3 = c2;
                    }
                    c = c3;
                    if (i6 != 8) {
                        break;
                    }
                } else {
                    c = 7;
                }
                if (i5 == length) {
                    break;
                } else {
                    i5++;
                }
            }
        } else {
            j = 128;
            j2 = 255;
            j3 = -9187201950435737472L;
            c = 7;
        }
        int[] iArr2 = catchingFishMVIWidget.CatchingFishSnackbar;
        long[] jArr4 = catchingFishMVIWidget.CatchingFishParcelableFAB;
        int length2 = jArr4.length - 2;
        if (length2 >= 0) {
            int i9 = 0;
            while (true) {
                long j6 = jArr4[i9];
                if ((((~j6) << c) & j6 & j3) != j3) {
                    int i10 = 8 - ((~(i9 - length2)) >>> 31);
                    int i11 = 0;
                    while (i11 < i10) {
                        if ((j6 & j2) < j) {
                            int i12 = iArr2[(i9 << 3) + i11];
                            int hashCode = Integer.hashCode(i12) * (-862048943);
                            int i13 = hashCode ^ (hashCode << 16);
                            int i14 = i13 & 127;
                            int i15 = catchingFishMVIWidget2.CatchingFishCoroutine;
                            int i16 = (i13 >>> 7) & i15;
                            i = i4;
                            int i17 = 0;
                            while (true) {
                                long[] jArr5 = catchingFishMVIWidget2.CatchingFishParcelableFAB;
                                int i18 = i16 >> 3;
                                jArr2 = jArr4;
                                int i19 = (i16 & 7) << 3;
                                j4 = j6;
                                long j7 = (jArr5[i18] >>> i19) | ((jArr5[i18 + 1] << (64 - i19)) & ((-i19) >> 63));
                                int i20 = i15;
                                long j8 = (i14 * 72340172838076673L) ^ j7;
                                long j9 = (j8 - 72340172838076673L) & (~j8) & j3;
                                while (true) {
                                    if (j9 == 0) {
                                        break;
                                    }
                                    i3 = (i16 + (Long.numberOfTrailingZeros(j9) >> 3)) & i20;
                                    int i21 = i20;
                                    if (catchingFishMVIWidget2.CatchingFishSnackbar[i3] == i12) {
                                        break;
                                    }
                                    j9 &= j9 - 1;
                                    i20 = i21;
                                }
                                i17 += 8;
                                i16 = (i16 + i17) & i2;
                                jArr4 = jArr2;
                                i15 = i2;
                                j6 = j4;
                            }
                            int i22 = i3;
                            if (i22 >= 0) {
                                catchingFishMVIWidget2.CatchingFishWorkManager(i22);
                            }
                        } else {
                            jArr2 = jArr4;
                            j4 = j6;
                            i = i4;
                        }
                        j6 = j4 >> i;
                        i11++;
                        i4 = i;
                        jArr4 = jArr2;
                    }
                    jArr = jArr4;
                    if (i10 != i4) {
                        break;
                    }
                } else {
                    jArr = jArr4;
                }
                if (i9 == length2) {
                    break;
                }
                i9++;
                jArr4 = jArr;
                i4 = 8;
            }
        }
        catchingFishLayoutGsonRoom.CatchingFishCoroutine();
        CatchingFishReduxLifecycle CatchingFish = CatchingFish();
        int[] iArr3 = CatchingFish.CatchingFishSnackbar;
        Object[] objArr = CatchingFish.CatchingFishCoroutine;
        long[] jArr6 = CatchingFish.CatchingFishParcelableFAB;
        int length3 = jArr6.length - 2;
        if (length3 >= 0) {
            int i23 = 0;
            while (true) {
                long j10 = jArr6[i23];
                if ((((~j10) << c) & j10 & j3) != j3) {
                    int i24 = 8 - ((~(i23 - length3)) >>> 31);
                    for (int i25 = 0; i25 < i24; i25++) {
                        if ((j10 & j2) < j) {
                            int i26 = (i23 << 3) + i25;
                            int i27 = iArr3[i26];
                            CatchingFishMVIGraphQLHilt catchingFishMVIGraphQLHilt2 = ((CatchingFishMoshiKtor) objArr[i26]).CatchingFishParcelableFAB;
                            CatchingFishMVPMotionLayout catchingFishMVPMotionLayout = catchingFishMVIGraphQLHilt2.CatchingFishReduxKtor;
                            CatchingFishGraphQLLayout catchingFishGraphQLLayout = CatchingFishServiceMVI.CatchingFishReduxKtor;
                            if (catchingFishMVPMotionLayout.CatchingFishReduxKtor.CatchingFishCoroutine(catchingFishGraphQLLayout) && catchingFishMVIWidget2.CatchingFishParcelableFAB(i27)) {
                                CatchingFishCardViewView((String) catchingFishMVIGraphQLHilt2.CatchingFishReduxKtor.CatchingFishSnackbar(catchingFishGraphQLLayout), i27, 16);
                            }
                            catchingFishLayoutGsonRoom.CatchingFishViewModelFAB(i27, new CatchingFishHiltGlideRoom(catchingFishMVIGraphQLHilt2, CatchingFish()));
                        }
                        j10 >>= 8;
                    }
                    if (i24 != 8) {
                        break;
                    }
                }
                if (i23 == length3) {
                    break;
                } else {
                    i23++;
                }
            }
        }
        this.CatchingFishPayPalService = new CatchingFishHiltGlideRoom(this.CatchingFishReduxKtor.getSemanticsOwner().CatchingFishParcelableFAB(), CatchingFish());
    }

    public final void CatchingFishDaggerHiltFAB(CatchingFishBiometricRoom catchingFishBiometricRoom) {
        if (this.CatchingFishDaggerHiltFAB.add(catchingFishBiometricRoom)) {
            this.CatchingFishSpannableWidget.CatchingFish(CatchingFishRealmContext.CatchingFishParcelableFAB);
        }
    }

    public final void CatchingFishEspressoTesting(long j, boolean z) {
        CatchingFishGraphQLLayout catchingFishGraphQLLayout;
        int i;
        if (!CatchingFishFirebaseDagger.CatchingFishOkHttp(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            return;
        }
        CatchingFishReduxLifecycle CatchingFish = CatchingFish();
        if (CatchingFishToolbarMVIMVVM.CatchingFishParcelableFAB(j, 9205357640488583168L) || (((9223372034707292159L & j) + 36028792732385279L) & (-9223372034707292160L)) != 0) {
            return;
        }
        if (z) {
            catchingFishGraphQLLayout = CatchingFishServiceMVI.CatchingFishJetpackCompose;
        } else {
            if (z) {
                throw new CatchingFishBiometricView();
            }
            catchingFishGraphQLLayout = CatchingFishServiceMVI.CatchingFish;
        }
        Object[] objArr = CatchingFish.CatchingFishCoroutine;
        long[] jArr = CatchingFish.CatchingFishParcelableFAB;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            long j2 = jArr[i2];
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8;
                int i4 = 8 - ((~(i2 - length)) >>> 31);
                int i5 = 0;
                while (i5 < i4) {
                    if ((255 & j2) < 128) {
                        CatchingFishMoshiKtor catchingFishMoshiKtor = (CatchingFishMoshiKtor) objArr[(i2 << 3) + i5];
                        CatchingFishSnackbarLayout catchingFishSnackbarLayout = catchingFishMoshiKtor.CatchingFishSnackbar;
                        float f = catchingFishSnackbarLayout.CatchingFishParcelableFAB;
                        float f2 = catchingFishSnackbarLayout.CatchingFishSnackbar;
                        i = i3;
                        float f3 = catchingFishSnackbarLayout.CatchingFishCoroutine;
                        float f4 = catchingFishSnackbarLayout.CatchingFishReduxKtor;
                        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
                        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
                        if ((intBitsToFloat2 < f4) && ((((intBitsToFloat > f ? 1 : (intBitsToFloat == f ? 0 : -1)) >= 0) & ((intBitsToFloat > f3 ? 1 : (intBitsToFloat == f3 ? 0 : -1)) < 0)) & ((intBitsToFloat2 > f2 ? 1 : (intBitsToFloat2 == f2 ? 0 : -1)) >= 0))) {
                            Object CatchingFishViewModelScope = catchingFishMoshiKtor.CatchingFishParcelableFAB.CatchingFishReduxKtor.CatchingFishReduxKtor.CatchingFishViewModelScope(catchingFishGraphQLLayout);
                            if (CatchingFishViewModelScope == null) {
                                CatchingFishViewModelScope = null;
                            }
                            if (CatchingFishViewModelScope != null) {
                                throw new ClassCastException();
                            }
                        } else {
                            continue;
                        }
                    } else {
                        i = i3;
                    }
                    j2 >>= i;
                    i5++;
                    i3 = i;
                }
                if (i4 != i3) {
                    return;
                }
            }
            if (i2 == length) {
                return;
            } else {
                i2++;
            }
        }
    }

    public final void CatchingFishFragmentFactory(CatchingFishBiometricRoom catchingFishBiometricRoom, CatchingFishMVIWidget catchingFishMVIWidget) {
        CatchingFishMVPMotionLayout CatchingFish;
        if (catchingFishBiometricRoom.CatchingFishCustomView() && !this.CatchingFishReduxKtor.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(catchingFishBiometricRoom)) {
            CatchingFishBiometricRoom catchingFishBiometricRoom2 = null;
            if (!catchingFishBiometricRoom.CatchingFishJobScheduler.CatchingFishViewModelFAB(8)) {
                catchingFishBiometricRoom = catchingFishBiometricRoom.CatchingFishRoomDatabase();
                while (true) {
                    if (catchingFishBiometricRoom == null) {
                        catchingFishBiometricRoom = null;
                        break;
                    } else if (catchingFishBiometricRoom.CatchingFishJobScheduler.CatchingFishViewModelFAB(8)) {
                        break;
                    } else {
                        catchingFishBiometricRoom = catchingFishBiometricRoom.CatchingFishRoomDatabase();
                    }
                }
            }
            if (catchingFishBiometricRoom == null || (CatchingFish = catchingFishBiometricRoom.CatchingFish()) == null) {
                return;
            }
            if (!CatchingFish.CatchingFishWorkManager) {
                CatchingFishBiometricRoom CatchingFishRoomDatabase = catchingFishBiometricRoom.CatchingFishRoomDatabase();
                while (true) {
                    if (CatchingFishRoomDatabase != null) {
                        CatchingFishMVPMotionLayout CatchingFish2 = CatchingFishRoomDatabase.CatchingFish();
                        if (CatchingFish2 != null && CatchingFish2.CatchingFishWorkManager) {
                            catchingFishBiometricRoom2 = CatchingFishRoomDatabase;
                            break;
                        }
                        CatchingFishRoomDatabase = CatchingFishRoomDatabase.CatchingFishRoomDatabase();
                    } else {
                        break;
                    }
                }
                if (catchingFishBiometricRoom2 != null) {
                    catchingFishBiometricRoom = catchingFishBiometricRoom2;
                }
            }
            int i = catchingFishBiometricRoom.CatchingFishDaggerWebsocket;
            if (catchingFishMVIWidget.CatchingFishParcelableFAB(i)) {
                CatchingFishPayPal(this, CatchingFishSpannableWidget(i), 2048, 1, 8);
            }
        }
    }

    public final void CatchingFishFragmentHandler(int i, CatchingFishViewJUnitJUnit catchingFishViewJUnitJUnit, String str, Bundle bundle) {
        CatchingFishMVIGraphQLHilt catchingFishMVIGraphQLHilt;
        Region CatchingFishSensorManager;
        float[] CatchingFishPayPalService;
        Rect CatchingFishJobScheduler;
        AccessibilityNodeInfo accessibilityNodeInfo = catchingFishViewJUnitJUnit.CatchingFishParcelableFAB;
        CatchingFishMoshiKtor catchingFishMoshiKtor = (CatchingFishMoshiKtor) CatchingFish().CatchingFishSnackbar(i);
        if (catchingFishMoshiKtor == null || (catchingFishMVIGraphQLHilt = catchingFishMoshiKtor.CatchingFishParcelableFAB) == null) {
            return;
        }
        CatchingFishMVPMotionLayout catchingFishMVPMotionLayout = catchingFishMVIGraphQLHilt.CatchingFishReduxKtor;
        CatchingFishPayPalService catchingFishPayPalService = catchingFishMVPMotionLayout.CatchingFishReduxKtor;
        String CatchingFishJetpackCompose = CatchingFishJetpackCompose(catchingFishMVIGraphQLHilt);
        if (CatchingFishFirebaseDagger.CatchingFishOkHttp(str, this.CatchingFishCustomView)) {
            int CatchingFishReduxKtor = this.CatchingFishCardViewView.CatchingFishReduxKtor(i);
            if (CatchingFishReduxKtor != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, CatchingFishReduxKtor);
                return;
            }
            return;
        }
        if (CatchingFishFirebaseDagger.CatchingFishOkHttp(str, this.CatchingFishFragmentFactory)) {
            int CatchingFishReduxKtor2 = this.CatchingFishMVPRobolectric.CatchingFishReduxKtor(i);
            if (CatchingFishReduxKtor2 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, CatchingFishReduxKtor2);
                return;
            }
            return;
        }
        if (catchingFishPayPalService.CatchingFishCoroutine(CatchingFishViewStripeAPI.CatchingFishParcelableFAB) && bundle != null && CatchingFishFirebaseDagger.CatchingFishOkHttp(str, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
            int i2 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
            if (bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1) <= 0 || i2 < 0) {
                return;
            }
            if (i2 >= (CatchingFishJetpackCompose != null ? CatchingFishJetpackCompose.length() : Integer.MAX_VALUE)) {
                return;
            }
            CatchingFishKtorViewModel.CatchingFishRoomDatabase(catchingFishMVPMotionLayout);
            return;
        }
        CatchingFishGraphQLLayout catchingFishGraphQLLayout = CatchingFishServiceMVI.CatchingFishDaggerHiltFAB;
        if (catchingFishPayPalService.CatchingFishCoroutine(catchingFishGraphQLLayout) && bundle != null && CatchingFishFirebaseDagger.CatchingFishOkHttp(str, "androidx.compose.ui.semantics.testTag")) {
            Object CatchingFishViewModelScope = catchingFishPayPalService.CatchingFishViewModelScope(catchingFishGraphQLLayout);
            String str2 = (String) (CatchingFishViewModelScope != null ? CatchingFishViewModelScope : null);
            if (str2 != null) {
                accessibilityNodeInfo.getExtras().putCharSequence(str, str2);
                return;
            }
            return;
        }
        if (CatchingFishFirebaseDagger.CatchingFishOkHttp(str, "androidx.compose.ui.semantics.id")) {
            accessibilityNodeInfo.getExtras().putInt(str, catchingFishMVIGraphQLHilt.CatchingFishViewModelScope);
            return;
        }
        if (CatchingFishFirebaseDagger.CatchingFishOkHttp(str, "androidx.compose.ui.semantics.shapeType")) {
            Object CatchingFishViewModelScope2 = catchingFishPayPalService.CatchingFishViewModelScope(CatchingFishServiceMVI.CatchingFishSensorManager);
            CatchingFishKtorGraphQL catchingFishKtorGraphQL = (CatchingFishKtorGraphQL) (CatchingFishViewModelScope2 != null ? CatchingFishViewModelScope2 : null);
            if (catchingFishKtorGraphQL != null) {
                CatchingFishSpannableAdMob CatchingFishAnimationMockk = CatchingFishAnimationMockk(catchingFishKtorGraphQL, catchingFishMVIGraphQLHilt);
                if (CatchingFishAnimationMockk instanceof CatchingFishJUnitToolbar) {
                    accessibilityNodeInfo.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 0);
                    accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", CatchingFishJobScheduler(CatchingFishAnimationMockk));
                    return;
                } else if (CatchingFishAnimationMockk instanceof CatchingFishCoroutineMVI) {
                    accessibilityNodeInfo.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 1);
                    accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", CatchingFishJobScheduler(CatchingFishAnimationMockk));
                    accessibilityNodeInfo.getExtras().putFloatArray("androidx.compose.ui.semantics.shapeCorners", CatchingFishPayPalService(CatchingFishAnimationMockk));
                    return;
                } else {
                    if (!(CatchingFishAnimationMockk instanceof CatchingFishMockkAndroidX)) {
                        throw new CatchingFishBiometricView();
                    }
                    accessibilityNodeInfo.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 2);
                    accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRegion", CatchingFishSensorManager(CatchingFishAnimationMockk));
                    return;
                }
            }
            return;
        }
        if (CatchingFishFirebaseDagger.CatchingFishOkHttp(str, "androidx.compose.ui.semantics.shapeRect")) {
            Object CatchingFishViewModelScope3 = catchingFishPayPalService.CatchingFishViewModelScope(CatchingFishServiceMVI.CatchingFishSensorManager);
            CatchingFishKtorGraphQL catchingFishKtorGraphQL2 = (CatchingFishKtorGraphQL) (CatchingFishViewModelScope3 != null ? CatchingFishViewModelScope3 : null);
            if (catchingFishKtorGraphQL2 == null || (CatchingFishJobScheduler = CatchingFishJobScheduler(CatchingFishAnimationMockk(catchingFishKtorGraphQL2, catchingFishMVIGraphQLHilt))) == null) {
                return;
            }
            accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", CatchingFishJobScheduler);
            return;
        }
        if (CatchingFishFirebaseDagger.CatchingFishOkHttp(str, "androidx.compose.ui.semantics.shapeCorners")) {
            Object CatchingFishViewModelScope4 = catchingFishPayPalService.CatchingFishViewModelScope(CatchingFishServiceMVI.CatchingFishSensorManager);
            CatchingFishKtorGraphQL catchingFishKtorGraphQL3 = (CatchingFishKtorGraphQL) (CatchingFishViewModelScope4 != null ? CatchingFishViewModelScope4 : null);
            if (catchingFishKtorGraphQL3 == null || (CatchingFishPayPalService = CatchingFishPayPalService(CatchingFishAnimationMockk(catchingFishKtorGraphQL3, catchingFishMVIGraphQLHilt))) == null) {
                return;
            }
            accessibilityNodeInfo.getExtras().putFloatArray("androidx.compose.ui.semantics.shapeCorners", CatchingFishPayPalService);
            return;
        }
        if (CatchingFishFirebaseDagger.CatchingFishOkHttp(str, "androidx.compose.ui.semantics.shapeRegion")) {
            Object CatchingFishViewModelScope5 = catchingFishPayPalService.CatchingFishViewModelScope(CatchingFishServiceMVI.CatchingFishSensorManager);
            CatchingFishKtorGraphQL catchingFishKtorGraphQL4 = (CatchingFishKtorGraphQL) (CatchingFishViewModelScope5 != null ? CatchingFishViewModelScope5 : null);
            if (catchingFishKtorGraphQL4 == null || (CatchingFishSensorManager = CatchingFishSensorManager(CatchingFishAnimationMockk(catchingFishKtorGraphQL4, catchingFishMVIGraphQLHilt))) == null) {
                return;
            }
            accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRegion", CatchingFishSensorManager);
        }
    }

    public final boolean CatchingFishGsonAppCompat(AccessibilityEvent accessibilityEvent) {
        if (!CatchingFishCoroutineFlow()) {
            return false;
        }
        if (accessibilityEvent.getEventType() != 2048) {
            accessibilityEvent.getEventType();
        }
        return ((Boolean) this.CatchingFishWorkManager.CatchingFishFragmentHandler(accessibilityEvent)).booleanValue();
    }

    public final void CatchingFishMVPRobolectric(int i) {
        CatchingFishToastMVI catchingFishToastMVI = this.CatchingFishGsonAppCompat;
        if (catchingFishToastMVI != null) {
            CatchingFishMVIGraphQLHilt catchingFishMVIGraphQLHilt = catchingFishToastMVI.CatchingFishParcelableFAB;
            if (i != catchingFishMVIGraphQLHilt.CatchingFishViewModelScope) {
                return;
            }
            if (SystemClock.uptimeMillis() - catchingFishToastMVI.CatchingFishWorkManager <= 1000) {
                AccessibilityEvent CatchingFishUnitTesting = CatchingFishUnitTesting(CatchingFishSpannableWidget(catchingFishMVIGraphQLHilt.CatchingFishViewModelScope), 131072);
                CatchingFishUnitTesting.setFromIndex(catchingFishToastMVI.CatchingFishReduxKtor);
                CatchingFishUnitTesting.setToIndex(catchingFishToastMVI.CatchingFishDaggerWebsocket);
                CatchingFishUnitTesting.setAction(catchingFishToastMVI.CatchingFishSnackbar);
                CatchingFishUnitTesting.setMovementGranularity(catchingFishToastMVI.CatchingFishCoroutine);
                CatchingFishUnitTesting.getText().add(CatchingFishJetpackCompose(catchingFishMVIGraphQLHilt));
                CatchingFishGsonAppCompat(CatchingFishUnitTesting);
            }
        }
        this.CatchingFishGsonAppCompat = null;
    }

    public final boolean CatchingFishMutableLiveData(CatchingFishMVIGraphQLHilt catchingFishMVIGraphQLHilt, int i, int i2, boolean z) {
        String CatchingFishJetpackCompose;
        CatchingFishMVPMotionLayout catchingFishMVPMotionLayout = catchingFishMVIGraphQLHilt.CatchingFishReduxKtor;
        int i3 = catchingFishMVIGraphQLHilt.CatchingFishViewModelScope;
        CatchingFishGraphQLLayout catchingFishGraphQLLayout = CatchingFishViewStripeAPI.CatchingFishViewModelFAB;
        if (catchingFishMVPMotionLayout.CatchingFishReduxKtor.CatchingFishCoroutine(catchingFishGraphQLLayout) && CatchingFishGsonCardView.CatchingFishReduxKtor(catchingFishMVIGraphQLHilt)) {
            CatchingFishJobSchedulerMVP catchingFishJobSchedulerMVP = (CatchingFishJobSchedulerMVP) ((CatchingFishSnackbarToast) catchingFishMVIGraphQLHilt.CatchingFishReduxKtor.CatchingFishSnackbar(catchingFishGraphQLLayout)).CatchingFishSnackbar;
            if (catchingFishJobSchedulerMVP != null) {
                return ((Boolean) catchingFishJobSchedulerMVP.CatchingFishReduxKtor(Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
            }
        } else if ((i != i2 || i2 != this.CatchingFishJetpackCompose) && (CatchingFishJetpackCompose = CatchingFishJetpackCompose(catchingFishMVIGraphQLHilt)) != null) {
            if (i < 0 || i != i2 || i2 > CatchingFishJetpackCompose.length()) {
                i = -1;
            }
            this.CatchingFishJetpackCompose = i;
            boolean z2 = CatchingFishJetpackCompose.length() > 0;
            CatchingFishGsonAppCompat(CatchingFishStateLiveData(CatchingFishSpannableWidget(i3), z2 ? Integer.valueOf(this.CatchingFishJetpackCompose) : null, z2 ? Integer.valueOf(this.CatchingFishJetpackCompose) : null, z2 ? Integer.valueOf(CatchingFishJetpackCompose.length()) : null, CatchingFishJetpackCompose));
            CatchingFishMVPRobolectric(i3);
            return true;
        }
        return false;
    }

    public final int CatchingFishNavigation(CatchingFishMVIGraphQLHilt catchingFishMVIGraphQLHilt) {
        CatchingFishMVPMotionLayout catchingFishMVPMotionLayout = catchingFishMVIGraphQLHilt.CatchingFishReduxKtor;
        CatchingFishMVPMotionLayout catchingFishMVPMotionLayout2 = catchingFishMVIGraphQLHilt.CatchingFishReduxKtor;
        CatchingFishGraphQLLayout catchingFishGraphQLLayout = CatchingFishServiceMVI.CatchingFishParcelableFAB;
        if (!catchingFishMVPMotionLayout.CatchingFishReduxKtor.CatchingFishCoroutine(CatchingFishServiceMVI.CatchingFishParcelableFAB)) {
            CatchingFishGraphQLLayout catchingFishGraphQLLayout2 = CatchingFishServiceMVI.CatchingFishCardViewView;
            if (catchingFishMVPMotionLayout2.CatchingFishReduxKtor.CatchingFishCoroutine(catchingFishGraphQLLayout2)) {
                return (int) (((CatchingFishToastViewModel) catchingFishMVPMotionLayout2.CatchingFishSnackbar(catchingFishGraphQLLayout2)).CatchingFishParcelableFAB >> 32);
            }
        }
        return this.CatchingFishJetpackCompose;
    }

    public final void CatchingFishOkHttp() {
        Trace.beginSection("sendAccessibilitySemanticsStructureChangeEvents");
        try {
            if (CatchingFishCoroutineFlow()) {
                CatchingFishParcelableFlux(this.CatchingFishReduxKtor.getSemanticsOwner().CatchingFishParcelableFAB(), this.CatchingFishPayPalService);
            }
            Trace.endSection();
            Trace.beginSection("sendSemanticsPropertyChangeEvents");
            try {
                CatchingFishCustomView(CatchingFish());
                Trace.endSection();
                Trace.beginSection("updateSemanticsNodesCopyAndPanes");
                try {
                    CatchingFishDagger();
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }

    public final void CatchingFishParcelableFlux(CatchingFishMVIGraphQLHilt catchingFishMVIGraphQLHilt, CatchingFishHiltGlideRoom catchingFishHiltGlideRoom) {
        int[] iArr = CatchingFishJUnitEspresso.CatchingFishParcelableFAB;
        CatchingFishMVIWidget catchingFishMVIWidget = new CatchingFishMVIWidget();
        List CatchingFishFragmentHandler = CatchingFishMVIGraphQLHilt.CatchingFishFragmentHandler(4, catchingFishMVIGraphQLHilt);
        CatchingFishBiometricRoom catchingFishBiometricRoom = catchingFishMVIGraphQLHilt.CatchingFishCoroutine;
        int size = CatchingFishFragmentHandler.size();
        for (int i = 0; i < size; i++) {
            CatchingFishMVIGraphQLHilt catchingFishMVIGraphQLHilt2 = (CatchingFishMVIGraphQLHilt) CatchingFishFragmentHandler.get(i);
            CatchingFishReduxLifecycle CatchingFish = CatchingFish();
            int i2 = catchingFishMVIGraphQLHilt2.CatchingFishViewModelScope;
            if (CatchingFish.CatchingFishParcelableFAB(i2)) {
                if (!catchingFishHiltGlideRoom.CatchingFishSnackbar.CatchingFishSnackbar(i2)) {
                    CatchingFishDaggerHiltFAB(catchingFishBiometricRoom);
                    return;
                }
                catchingFishMVIWidget.CatchingFishParcelableFAB(i2);
            }
        }
        CatchingFishMVIWidget catchingFishMVIWidget2 = catchingFishHiltGlideRoom.CatchingFishSnackbar;
        int[] iArr2 = catchingFishMVIWidget2.CatchingFishSnackbar;
        long[] jArr = catchingFishMVIWidget2.CatchingFishParcelableFAB;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j) < 128 && !catchingFishMVIWidget.CatchingFishSnackbar(iArr2[(i3 << 3) + i5])) {
                            CatchingFishDaggerHiltFAB(catchingFishBiometricRoom);
                            return;
                        }
                        j >>= 8;
                    }
                    if (i4 != 8) {
                        break;
                    }
                }
                if (i3 == length) {
                    break;
                } else {
                    i3++;
                }
            }
        }
        List CatchingFishFragmentHandler2 = CatchingFishMVIGraphQLHilt.CatchingFishFragmentHandler(4, catchingFishMVIGraphQLHilt);
        int size2 = CatchingFishFragmentHandler2.size();
        for (int i6 = 0; i6 < size2; i6++) {
            CatchingFishMVIGraphQLHilt catchingFishMVIGraphQLHilt3 = (CatchingFishMVIGraphQLHilt) CatchingFishFragmentHandler2.get(i6);
            CatchingFishHiltGlideRoom catchingFishHiltGlideRoom2 = (CatchingFishHiltGlideRoom) this.CatchingFishJobScheduler.CatchingFishSnackbar(catchingFishMVIGraphQLHilt3.CatchingFishViewModelScope);
            if (catchingFishHiltGlideRoom2 != null && CatchingFish().CatchingFishParcelableFAB(catchingFishMVIGraphQLHilt3.CatchingFishViewModelScope)) {
                CatchingFishParcelableFlux(catchingFishMVIGraphQLHilt3, catchingFishHiltGlideRoom2);
            }
        }
    }

    public final int CatchingFishRoomDatabase(CatchingFishMVIGraphQLHilt catchingFishMVIGraphQLHilt) {
        CatchingFishMVPMotionLayout catchingFishMVPMotionLayout = catchingFishMVIGraphQLHilt.CatchingFishReduxKtor;
        CatchingFishMVPMotionLayout catchingFishMVPMotionLayout2 = catchingFishMVIGraphQLHilt.CatchingFishReduxKtor;
        CatchingFishGraphQLLayout catchingFishGraphQLLayout = CatchingFishServiceMVI.CatchingFishParcelableFAB;
        if (!catchingFishMVPMotionLayout.CatchingFishReduxKtor.CatchingFishCoroutine(CatchingFishServiceMVI.CatchingFishParcelableFAB)) {
            CatchingFishGraphQLLayout catchingFishGraphQLLayout2 = CatchingFishServiceMVI.CatchingFishCardViewView;
            if (catchingFishMVPMotionLayout2.CatchingFishReduxKtor.CatchingFishCoroutine(catchingFishGraphQLLayout2)) {
                return (int) (((CatchingFishToastViewModel) catchingFishMVPMotionLayout2.CatchingFishSnackbar(catchingFishGraphQLLayout2)).CatchingFishParcelableFAB & 4294967295L);
            }
        }
        return this.CatchingFishJetpackCompose;
    }

    @Override // kotlin.text.CatchingFishAndroidX
    public final CatchingFishServiceHilt CatchingFishSnackbar(View view) {
        return this.CatchingFishOkHttp;
    }

    public final int CatchingFishSpannableWidget(int i) {
        if (i == this.CatchingFishReduxKtor.getSemanticsOwner().CatchingFishParcelableFAB().CatchingFishViewModelScope) {
            return -1;
        }
        return i;
    }

    public final AccessibilityEvent CatchingFishStateLiveData(int i, Integer num, Integer num2, Integer num3, CharSequence charSequence) {
        AccessibilityEvent CatchingFishUnitTesting = CatchingFishUnitTesting(i, 8192);
        if (num != null) {
            CatchingFishUnitTesting.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            CatchingFishUnitTesting.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            CatchingFishUnitTesting.setItemCount(num3.intValue());
        }
        if (charSequence != null) {
            CatchingFishUnitTesting.getText().add(charSequence);
        }
        return CatchingFishUnitTesting;
    }

    public final AccessibilityEvent CatchingFishUnitTesting(int i, int i2) {
        CatchingFishMoshiKtor catchingFishMoshiKtor;
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i2);
        obtain.setEnabled(true);
        obtain.setClassName("android.view.View");
        CatchingFishGradleCameraX catchingFishGradleCameraX = this.CatchingFishReduxKtor;
        obtain.setPackageName(catchingFishGradleCameraX.getContext().getPackageName());
        obtain.setSource(catchingFishGradleCameraX, i);
        if (CatchingFishCoroutineFlow() && (catchingFishMoshiKtor = (CatchingFishMoshiKtor) CatchingFish().CatchingFishSnackbar(i)) != null) {
            CatchingFishMVIGraphQLHilt catchingFishMVIGraphQLHilt = catchingFishMoshiKtor.CatchingFishParcelableFAB;
            obtain.setPassword(catchingFishMVIGraphQLHilt.CatchingFishReduxKtor.CatchingFishReduxKtor.CatchingFishCoroutine(CatchingFishServiceMVI.CatchingFishFragmentFactory));
            Object CatchingFishViewModelScope = catchingFishMVIGraphQLHilt.CatchingFishReduxKtor.CatchingFishReduxKtor.CatchingFishViewModelScope(CatchingFishServiceMVI.CatchingFishOkHttp);
            if (CatchingFishViewModelScope == null) {
                CatchingFishViewModelScope = null;
            }
            boolean CatchingFishOkHttp = CatchingFishFirebaseDagger.CatchingFishOkHttp(CatchingFishViewModelScope, Boolean.TRUE);
            if (Build.VERSION.SDK_INT >= 34) {
                CatchingFishDataStore.CatchingFishLayout(obtain, CatchingFishOkHttp);
            }
        }
        return obtain;
    }
}
