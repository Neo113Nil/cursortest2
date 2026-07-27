package kotlin.text;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.Display;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class CatchingFishRealmMoshiFAB extends CatchingFishFragmentHilt {
    public static Method CatchingFishAnimationMockk = null;
    public static Field CatchingFishNavigation = null;
    public static Field CatchingFishRoomDatabase = null;
    public static Class CatchingFishStateLiveData = null;
    public static boolean CatchingFishUnitTesting = false;
    public int CatchingFishCloudMessaging;
    public final WindowInsets CatchingFishCoroutine;
    public CatchingFishReduxPayPal CatchingFishDaggerWebsocket;
    public Rect[][] CatchingFishEspressoTesting;
    public int CatchingFishFragmentHandler;
    public CatchingFishOkHttpGraphQL CatchingFishLayout;
    public Rect[][] CatchingFishOkHttp;
    public CatchingFishReduxPayPal[] CatchingFishReduxKtor;
    public int CatchingFishViewModelFAB;
    public CatchingFishReduxPayPal CatchingFishViewModelScope;
    public CatchingFishKtorPicassoMVVM CatchingFishWorkManager;

    public CatchingFishRealmMoshiFAB(CatchingFishKtorPicassoMVVM catchingFishKtorPicassoMVVM, WindowInsets windowInsets) {
        super(catchingFishKtorPicassoMVVM);
        this.CatchingFishDaggerWebsocket = null;
        this.CatchingFishEspressoTesting = new Rect[10][];
        this.CatchingFishOkHttp = new Rect[10][];
        this.CatchingFishCoroutine = windowInsets;
    }

    private static void CatchingFishCameraXIntent() {
        try {
            CatchingFishAnimationMockk = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            CatchingFishStateLiveData = cls;
            CatchingFishRoomDatabase = cls.getDeclaredField("mVisibleInsets");
            CatchingFishNavigation = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            CatchingFishRoomDatabase.setAccessible(true);
            CatchingFishNavigation.setAccessible(true);
        } catch (ReflectiveOperationException e) {
            e.getMessage();
        }
        CatchingFishUnitTesting = true;
    }

    private CatchingFishOkHttpGraphQL CatchingFishCustomView(View view) {
        Display display;
        if (view == null || (display = view.getDisplay()) == null) {
            return null;
        }
        Point point = new Point();
        display.getRealSize(point);
        if (this.CatchingFishParcelableFAB.CatchingFishParcelableFAB.CatchingFishJetpackCompose()) {
            return CatchingFishOkHttpGraphQL.CatchingFishParcelableFAB(point.x, point.y, true, 0, 0, 0, 0);
        }
        CatchingFishFluxDagger CatchingFishCardViewRealm = CatchingFishAdMobFAB.CatchingFishCardViewRealm(display, 0);
        CatchingFishFluxDagger CatchingFishCardViewRealm2 = CatchingFishAdMobFAB.CatchingFishCardViewRealm(display, 1);
        CatchingFishFluxDagger CatchingFishCardViewRealm3 = CatchingFishAdMobFAB.CatchingFishCardViewRealm(display, 2);
        CatchingFishFluxDagger CatchingFishCardViewRealm4 = CatchingFishAdMobFAB.CatchingFishCardViewRealm(display, 3);
        return CatchingFishOkHttpGraphQL.CatchingFishParcelableFAB(point.x, point.y, false, CatchingFishCardViewRealm != null ? CatchingFishCardViewRealm.CatchingFishSnackbar : 0, CatchingFishCardViewRealm2 != null ? CatchingFishCardViewRealm2.CatchingFishSnackbar : 0, CatchingFishCardViewRealm3 != null ? CatchingFishCardViewRealm3.CatchingFishSnackbar : 0, CatchingFishCardViewRealm4 != null ? CatchingFishCardViewRealm4.CatchingFishSnackbar : 0);
    }

    private CatchingFishReduxPayPal CatchingFishEspressoMockk(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }
        if (!CatchingFishUnitTesting) {
            CatchingFishCameraXIntent();
        }
        Method method = CatchingFishAnimationMockk;
        if (method != null && CatchingFishStateLiveData != null && CatchingFishRoomDatabase != null) {
            try {
                Object invoke = method.invoke(view, null);
                if (invoke == null) {
                    return null;
                }
                Rect rect = (Rect) CatchingFishRoomDatabase.get(CatchingFishNavigation.get(invoke));
                if (rect != null) {
                    return CatchingFishReduxPayPal.CatchingFishSnackbar(rect.left, rect.top, rect.right, rect.bottom);
                }
                return null;
            } catch (ReflectiveOperationException e) {
                e.getMessage();
            }
        }
        return null;
    }

    private static List<Rect> CatchingFishFragmentFactory(Rect[][] rectArr, int i) {
        Rect[] rectArr2;
        Rect[] rectArr3 = null;
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0 && (rectArr2 = rectArr[CatchingFishLayoutRoom.CatchingFishCoroutineFlow(i2)]) != null) {
                if (rectArr3 == null) {
                    rectArr3 = rectArr2;
                } else {
                    Rect[] rectArr4 = new Rect[rectArr3.length + rectArr2.length];
                    System.arraycopy(rectArr3, 0, rectArr4, 0, rectArr3.length);
                    System.arraycopy(rectArr2, 0, rectArr4, rectArr3.length, rectArr2.length);
                    rectArr3 = rectArr4;
                }
            }
        }
        return rectArr3 == null ? Collections.EMPTY_LIST : Arrays.asList(rectArr3);
    }

    public static boolean CatchingFishHandler(int i, int i2) {
        return (i & 6) == (i2 & 6);
    }

    private CatchingFishReduxPayPal CatchingFishJobScheduler(int i, boolean z) {
        CatchingFishReduxPayPal catchingFishReduxPayPal = CatchingFishReduxPayPal.CatchingFishDaggerWebsocket;
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0) {
                catchingFishReduxPayPal = CatchingFishReduxPayPal.CatchingFishParcelableFAB(catchingFishReduxPayPal, CatchingFishPayPalService(i2, z));
            }
        }
        return catchingFishReduxPayPal;
    }

    private Rect[] CatchingFishMutableLiveData(CatchingFishReduxPayPal catchingFishReduxPayPal) {
        ArrayList arrayList = new ArrayList();
        int i = catchingFishReduxPayPal.CatchingFishParcelableFAB;
        int i2 = catchingFishReduxPayPal.CatchingFishReduxKtor;
        int i3 = catchingFishReduxPayPal.CatchingFishCoroutine;
        int i4 = catchingFishReduxPayPal.CatchingFishSnackbar;
        if (i != 0) {
            arrayList.add(new Rect(0, 0, catchingFishReduxPayPal.CatchingFishParcelableFAB, this.CatchingFishFragmentHandler));
        }
        if (i4 != 0) {
            arrayList.add(new Rect(0, 0, this.CatchingFishCloudMessaging, i4));
        }
        if (i3 != 0) {
            int i5 = this.CatchingFishCloudMessaging;
            arrayList.add(new Rect(i5 - i3, 0, i5, this.CatchingFishFragmentHandler));
        }
        if (i2 != 0) {
            int i6 = this.CatchingFishFragmentHandler;
            arrayList.add(new Rect(0, i6 - i2, this.CatchingFishCloudMessaging, i6));
        }
        return (Rect[]) arrayList.toArray(new Rect[arrayList.size()]);
    }

    private CatchingFishReduxPayPal CatchingFishSensorManager() {
        CatchingFishKtorPicassoMVVM catchingFishKtorPicassoMVVM = this.CatchingFishWorkManager;
        return catchingFishKtorPicassoMVVM != null ? catchingFishKtorPicassoMVVM.CatchingFishParcelableFAB.CatchingFishEspressoTesting() : CatchingFishReduxPayPal.CatchingFishDaggerWebsocket;
    }

    @Override // kotlin.text.CatchingFishFragmentHilt
    public void CatchingFishCardViewView(Rect[][] rectArr) {
        Objects.requireNonNull(rectArr);
        this.CatchingFishEspressoTesting = (Rect[][]) rectArr.clone();
    }

    @Override // kotlin.text.CatchingFishFragmentHilt
    public boolean CatchingFishCoroutineFlow(int i) {
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0 && !CatchingFishDagger(i2)) {
                return false;
            }
        }
        return true;
    }

    public boolean CatchingFishDagger(int i) {
        if (i != 1 && i != 2) {
            if (i == 4) {
                return false;
            }
            if (i != 8 && i != 128) {
                return true;
            }
        }
        return !CatchingFishPayPalService(i, false).equals(CatchingFishReduxPayPal.CatchingFishDaggerWebsocket);
    }

    @Override // kotlin.text.CatchingFishFragmentHilt
    public void CatchingFishDaggerHiltFAB(CatchingFishOkHttpGraphQL catchingFishOkHttpGraphQL) {
        this.CatchingFishLayout = catchingFishOkHttpGraphQL;
    }

    @Override // kotlin.text.CatchingFishFragmentHilt
    public void CatchingFishDaggerWebsocket(CatchingFishKtorPicassoMVVM catchingFishKtorPicassoMVVM) {
        catchingFishKtorPicassoMVVM.CatchingFishParcelableFAB.CatchingFishGsonAppCompat(this.CatchingFishWorkManager);
        CatchingFishReduxPayPal catchingFishReduxPayPal = this.CatchingFishViewModelScope;
        CatchingFishFragmentHilt catchingFishFragmentHilt = catchingFishKtorPicassoMVVM.CatchingFishParcelableFAB;
        catchingFishFragmentHilt.CatchingFishParcelableFlux(catchingFishReduxPayPal);
        catchingFishFragmentHilt.CatchingFishPayPal(this.CatchingFishViewModelFAB);
        catchingFishFragmentHilt.CatchingFishDaggerHiltFAB(this.CatchingFishLayout);
        catchingFishFragmentHilt.CatchingFishCardViewView(this.CatchingFishEspressoTesting);
        catchingFishFragmentHilt.CatchingFishMVPRobolectric(this.CatchingFishOkHttp);
    }

    @Override // kotlin.text.CatchingFishFragmentHilt
    public CatchingFishReduxPayPal CatchingFishFragmentHandler(int i) {
        return CatchingFishJobScheduler(i, true);
    }

    @Override // kotlin.text.CatchingFishFragmentHilt
    public void CatchingFishGsonAppCompat(CatchingFishKtorPicassoMVVM catchingFishKtorPicassoMVVM) {
        this.CatchingFishWorkManager = catchingFishKtorPicassoMVVM;
    }

    @Override // kotlin.text.CatchingFishFragmentHilt
    public boolean CatchingFishJetpackCompose() {
        return this.CatchingFishCoroutine.isRound();
    }

    @Override // kotlin.text.CatchingFishFragmentHilt
    public CatchingFishReduxPayPal CatchingFishLayout(int i) {
        return CatchingFishJobScheduler(i, false);
    }

    @Override // kotlin.text.CatchingFishFragmentHilt
    public void CatchingFishMVPRobolectric(Rect[][] rectArr) {
        Objects.requireNonNull(rectArr);
        this.CatchingFishOkHttp = (Rect[][]) rectArr.clone();
    }

    @Override // kotlin.text.CatchingFishFragmentHilt
    public CatchingFishKtorPicassoMVVM CatchingFishNavigation(int i, int i2, int i3, int i4) {
        CatchingFishKtorPicassoMVVM CatchingFishViewModelScope = CatchingFishKtorPicassoMVVM.CatchingFishViewModelScope(null, this.CatchingFishCoroutine);
        int i5 = Build.VERSION.SDK_INT;
        CatchingFishManifestFABMVI catchingFishRealmView = i5 >= 36 ? new CatchingFishRealmView(CatchingFishViewModelScope) : i5 >= 35 ? new CatchingFishRealmHiltGradle(CatchingFishViewModelScope) : i5 >= 34 ? new CatchingFishRoomAdMobMVP(CatchingFishViewModelScope) : i5 >= 31 ? new CatchingFishJUnitView(CatchingFishViewModelScope) : i5 >= 30 ? new CatchingFishMVPLayoutRealm(CatchingFishViewModelScope) : i5 >= 29 ? new CatchingFishStateFlowBundle(CatchingFishViewModelScope) : new CatchingFishAdMobMVPGlide(CatchingFishViewModelScope);
        catchingFishRealmView.CatchingFishViewModelFAB(CatchingFishKtorPicassoMVVM.CatchingFishDaggerWebsocket(CatchingFishUnitTesting(), i, i2, i3, i4));
        catchingFishRealmView.CatchingFishWorkManager(CatchingFishKtorPicassoMVVM.CatchingFishDaggerWebsocket(CatchingFishEspressoTesting(), i, i2, i3, i4));
        return catchingFishRealmView.CatchingFishSnackbar();
    }

    @Override // kotlin.text.CatchingFishFragmentHilt
    public void CatchingFishParcelableFlux(CatchingFishReduxPayPal catchingFishReduxPayPal) {
        this.CatchingFishViewModelScope = catchingFishReduxPayPal;
    }

    @Override // kotlin.text.CatchingFishFragmentHilt
    public void CatchingFishPayPal(int i) {
        this.CatchingFishViewModelFAB = i;
    }

    public CatchingFishReduxPayPal CatchingFishPayPalService(int i, boolean z) {
        CatchingFishReduxPayPal CatchingFishEspressoTesting;
        int i2;
        CatchingFishReduxPayPal catchingFishReduxPayPal = CatchingFishReduxPayPal.CatchingFishDaggerWebsocket;
        if (i != 1) {
            if (i != 2) {
                if (i == 8) {
                    CatchingFishReduxPayPal[] catchingFishReduxPayPalArr = this.CatchingFishReduxKtor;
                    CatchingFishEspressoTesting = catchingFishReduxPayPalArr != null ? catchingFishReduxPayPalArr[CatchingFishLayoutRoom.CatchingFishCoroutineFlow(8)] : null;
                    if (CatchingFishEspressoTesting != null) {
                        return CatchingFishEspressoTesting;
                    }
                    CatchingFishReduxPayPal CatchingFishUnitTesting2 = CatchingFishUnitTesting();
                    CatchingFishReduxPayPal CatchingFishSensorManager = CatchingFishSensorManager();
                    int i3 = CatchingFishUnitTesting2.CatchingFishReduxKtor;
                    if (i3 > CatchingFishSensorManager.CatchingFishReduxKtor) {
                        return CatchingFishReduxPayPal.CatchingFishSnackbar(0, 0, 0, i3);
                    }
                    CatchingFishReduxPayPal catchingFishReduxPayPal2 = this.CatchingFishViewModelScope;
                    if (catchingFishReduxPayPal2 != null && !catchingFishReduxPayPal2.equals(catchingFishReduxPayPal) && (i2 = this.CatchingFishViewModelScope.CatchingFishReduxKtor) > CatchingFishSensorManager.CatchingFishReduxKtor) {
                        return CatchingFishReduxPayPal.CatchingFishSnackbar(0, 0, 0, i2);
                    }
                } else {
                    if (i == 16) {
                        return CatchingFishOkHttp();
                    }
                    if (i == 32) {
                        return CatchingFishCloudMessaging();
                    }
                    if (i == 64) {
                        return CatchingFishAnimationMockk();
                    }
                    if (i == 128) {
                        CatchingFishKtorPicassoMVVM catchingFishKtorPicassoMVVM = this.CatchingFishWorkManager;
                        CatchingFishIntentGsonRoom CatchingFishViewModelFAB = catchingFishKtorPicassoMVVM != null ? catchingFishKtorPicassoMVVM.CatchingFishParcelableFAB.CatchingFishViewModelFAB() : CatchingFishViewModelFAB();
                        if (CatchingFishViewModelFAB != null) {
                            int i4 = Build.VERSION.SDK_INT;
                            return CatchingFishReduxPayPal.CatchingFishSnackbar(i4 >= 28 ? CatchingFishRobolectricFlux.CatchingFishViewModelScope(CatchingFishViewModelFAB.CatchingFishParcelableFAB) : 0, i4 >= 28 ? CatchingFishRobolectricFlux.CatchingFishLayout(CatchingFishViewModelFAB.CatchingFishParcelableFAB) : 0, i4 >= 28 ? CatchingFishRobolectricFlux.CatchingFishViewModelFAB(CatchingFishViewModelFAB.CatchingFishParcelableFAB) : 0, i4 >= 28 ? CatchingFishRobolectricFlux.CatchingFishWorkManager(CatchingFishViewModelFAB.CatchingFishParcelableFAB) : 0);
                        }
                    }
                }
            } else {
                if (z) {
                    CatchingFishReduxPayPal CatchingFishSensorManager2 = CatchingFishSensorManager();
                    CatchingFishReduxPayPal CatchingFishEspressoTesting2 = CatchingFishEspressoTesting();
                    return CatchingFishReduxPayPal.CatchingFishSnackbar(Math.max(CatchingFishSensorManager2.CatchingFishParcelableFAB, CatchingFishEspressoTesting2.CatchingFishParcelableFAB), 0, Math.max(CatchingFishSensorManager2.CatchingFishCoroutine, CatchingFishEspressoTesting2.CatchingFishCoroutine), Math.max(CatchingFishSensorManager2.CatchingFishReduxKtor, CatchingFishEspressoTesting2.CatchingFishReduxKtor));
                }
                if ((this.CatchingFishViewModelFAB & 2) == 0) {
                    CatchingFishReduxPayPal CatchingFishUnitTesting3 = CatchingFishUnitTesting();
                    CatchingFishKtorPicassoMVVM catchingFishKtorPicassoMVVM2 = this.CatchingFishWorkManager;
                    CatchingFishEspressoTesting = catchingFishKtorPicassoMVVM2 != null ? catchingFishKtorPicassoMVVM2.CatchingFishParcelableFAB.CatchingFishEspressoTesting() : null;
                    int i5 = CatchingFishUnitTesting3.CatchingFishReduxKtor;
                    if (CatchingFishEspressoTesting != null) {
                        i5 = Math.min(i5, CatchingFishEspressoTesting.CatchingFishReduxKtor);
                    }
                    return CatchingFishReduxPayPal.CatchingFishSnackbar(CatchingFishUnitTesting3.CatchingFishParcelableFAB, 0, CatchingFishUnitTesting3.CatchingFishCoroutine, i5);
                }
            }
        } else {
            if (z) {
                return CatchingFishReduxPayPal.CatchingFishSnackbar(0, Math.max(CatchingFishSensorManager().CatchingFishSnackbar, CatchingFishUnitTesting().CatchingFishSnackbar), 0, 0);
            }
            if ((this.CatchingFishViewModelFAB & 4) == 0) {
                return CatchingFishReduxPayPal.CatchingFishSnackbar(0, CatchingFishUnitTesting().CatchingFishSnackbar, 0, 0);
            }
        }
        return catchingFishReduxPayPal;
    }

    @Override // kotlin.text.CatchingFishFragmentHilt
    public void CatchingFishReduxKtor(View view) {
        this.CatchingFishCloudMessaging = view.getWidth();
        this.CatchingFishFragmentHandler = view.getHeight();
        CatchingFishReduxPayPal CatchingFishEspressoMockk = CatchingFishEspressoMockk(view);
        if (CatchingFishEspressoMockk == null) {
            CatchingFishEspressoMockk = CatchingFishReduxPayPal.CatchingFishDaggerWebsocket;
        }
        CatchingFishParcelableFlux(CatchingFishEspressoMockk);
    }

    @Override // kotlin.text.CatchingFishFragmentHilt
    public void CatchingFishRoomDatabase() {
        for (int i = 1; i <= 512; i <<= 1) {
            int CatchingFishCoroutineFlow = CatchingFishLayoutRoom.CatchingFishCoroutineFlow(i);
            this.CatchingFishEspressoTesting[CatchingFishCoroutineFlow] = CatchingFishMutableLiveData(CatchingFishLayout(i));
            if (i != 8) {
                this.CatchingFishOkHttp[CatchingFishCoroutineFlow] = CatchingFishMutableLiveData(CatchingFishFragmentHandler(i));
            }
        }
    }

    @Override // kotlin.text.CatchingFishFragmentHilt
    public void CatchingFishSpannableWidget(CatchingFishReduxPayPal[] catchingFishReduxPayPalArr) {
        this.CatchingFishReduxKtor = catchingFishReduxPayPalArr;
    }

    @Override // kotlin.text.CatchingFishFragmentHilt
    public void CatchingFishStateLiveData(View view) {
        this.CatchingFishLayout = CatchingFishCustomView(view);
    }

    @Override // kotlin.text.CatchingFishFragmentHilt
    public final CatchingFishReduxPayPal CatchingFishUnitTesting() {
        if (this.CatchingFishDaggerWebsocket == null) {
            WindowInsets windowInsets = this.CatchingFishCoroutine;
            this.CatchingFishDaggerWebsocket = CatchingFishReduxPayPal.CatchingFishSnackbar(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.CatchingFishDaggerWebsocket;
    }

    @Override // kotlin.text.CatchingFishFragmentHilt
    public List<Rect> CatchingFishViewModelScope(int i) {
        return CatchingFishFragmentFactory(this.CatchingFishOkHttp, i);
    }

    @Override // kotlin.text.CatchingFishFragmentHilt
    public List<Rect> CatchingFishWorkManager(int i) {
        return CatchingFishFragmentFactory(this.CatchingFishEspressoTesting, i);
    }

    @Override // kotlin.text.CatchingFishFragmentHilt
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        CatchingFishRealmMoshiFAB catchingFishRealmMoshiFAB = (CatchingFishRealmMoshiFAB) obj;
        return Objects.equals(this.CatchingFishViewModelScope, catchingFishRealmMoshiFAB.CatchingFishViewModelScope) && CatchingFishHandler(this.CatchingFishViewModelFAB, catchingFishRealmMoshiFAB.CatchingFishViewModelFAB);
    }

    public CatchingFishRealmMoshiFAB(CatchingFishKtorPicassoMVVM catchingFishKtorPicassoMVVM, CatchingFishRealmMoshiFAB catchingFishRealmMoshiFAB) {
        this(catchingFishKtorPicassoMVVM, new WindowInsets(catchingFishRealmMoshiFAB.CatchingFishCoroutine));
    }
}
