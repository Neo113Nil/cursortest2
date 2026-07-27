package androidx.recyclerview.widget;

import android.R;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Objects;
import java.util.WeakHashMap;
import kotlin.text.CatchingFishAdMobGraphQL;
import kotlin.text.CatchingFishAdMobRoomRoom;
import kotlin.text.CatchingFishAsyncTaskDagger;
import kotlin.text.CatchingFishBundleAsyncTask;
import kotlin.text.CatchingFishCardViewGraphQL;
import kotlin.text.CatchingFishContextHandler;
import kotlin.text.CatchingFishCoroutineMVP;
import kotlin.text.CatchingFishDaggerGlide;
import kotlin.text.CatchingFishDaggerHiltFAB;
import kotlin.text.CatchingFishDaggerLiveData;
import kotlin.text.CatchingFishDataStoreGradle;
import kotlin.text.CatchingFishFABCameraX;
import kotlin.text.CatchingFishFABGoogleMaps;
import kotlin.text.CatchingFishFABRobolectric;
import kotlin.text.CatchingFishFluxAppCompat;
import kotlin.text.CatchingFishFluxEspresso;
import kotlin.text.CatchingFishGradleDagger;
import kotlin.text.CatchingFishGradleMockk;
import kotlin.text.CatchingFishGraphQLRealmFAB;
import kotlin.text.CatchingFishGsonNavigation;
import kotlin.text.CatchingFishGsonRealm;
import kotlin.text.CatchingFishGsonUnitTesting;
import kotlin.text.CatchingFishIntentJUnit;
import kotlin.text.CatchingFishJUnitMVVM;
import kotlin.text.CatchingFishJUnitRoomRoom;
import kotlin.text.CatchingFishKtorAndroidX;
import kotlin.text.CatchingFishKtorDataStore;
import kotlin.text.CatchingFishKtorPayPal;
import kotlin.text.CatchingFishLayoutMVVMFlux;
import kotlin.text.CatchingFishMVIEspresso;
import kotlin.text.CatchingFishMVIReduxAdMob;
import kotlin.text.CatchingFishMVPLiveData;
import kotlin.text.CatchingFishMockkWidget;
import kotlin.text.CatchingFishMoshiAndroidX;
import kotlin.text.CatchingFishMoshiFluxMoshi;
import kotlin.text.CatchingFishPayPalCardView;
import kotlin.text.CatchingFishPayPalToolbar;
import kotlin.text.CatchingFishReduxGlide;
import kotlin.text.CatchingFishRoomDataStore;
import kotlin.text.CatchingFishSensorManager;
import kotlin.text.CatchingFishSnackbarCameraX;
import kotlin.text.CatchingFishSpannableMVP;
import kotlin.text.CatchingFishStripeAPIMoshi;
import kotlin.text.CatchingFishToastCoroutine;
import kotlin.text.CatchingFishToolbarBundle;
import kotlin.text.CatchingFishViewCustomView;
import kotlin.text.CatchingFishViewHiltWidget;
import kotlin.text.CatchingFishViewModelIntent;
import kotlin.text.CatchingFishViewPagerMockk;
import kotlin.text.CatchingFishWidgetFAB;
import kotlin.text.CatchingFishWidgetMVIGradle;

/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup {
    public static final CatchingFishMVIEspresso CatchingFishDynamicFeature;
    public static final int[] CatchingFishMVPReduxContext = {R.attr.nestedScrollingEnabled};
    public static final Class[] CatchingFishRealmKtorRealm;
    public CatchingFishGsonNavigation CatchingFish;
    public CatchingFishJUnitRoomRoom CatchingFishAndroidX;
    public final float CatchingFishAnimation;
    public CatchingFishKtorDataStore CatchingFishAnimationMockk;
    public int CatchingFishAppCompat;
    public CatchingFishFluxAppCompat CatchingFishCameraXIntent;
    public boolean CatchingFishCardViewRealm;
    public final AccessibilityManager CatchingFishCardViewView;
    public final Rect CatchingFishCloudMessaging;
    public boolean CatchingFishCoroutineFlow;
    public boolean CatchingFishCustomView;
    public CatchingFishFABGoogleMaps CatchingFishCustomViewJUnit;
    public EdgeEffect CatchingFishDagger;
    public boolean CatchingFishDaggerHiltFAB;
    public ArrayList CatchingFishDaggerMVVM;
    public final CatchingFishSnackbarCameraX CatchingFishDaggerWebsocket;
    public CatchingFishDaggerLiveData CatchingFishDataStoreIntent;
    public EdgeEffect CatchingFishEspressoMockk;
    public final Rect CatchingFishEspressoTesting;
    public final ArrayList CatchingFishFABLayout;
    public boolean CatchingFishFirebase;
    public int CatchingFishFragmentFactory;
    public boolean CatchingFishFragmentHandler;
    public final int[] CatchingFishGlideWidgetKtor;
    public final int[] CatchingFishGradleLiveData;
    public VelocityTracker CatchingFishGradleManifest;
    public final CatchingFishGsonRealm CatchingFishGraphQLGlide;
    public boolean CatchingFishGsonAppCompat;
    public int CatchingFishHandler;
    public final int CatchingFishJUnitRealm;
    public boolean CatchingFishJetpackCompose;
    public CatchingFishKtorAndroidX CatchingFishJobScheduler;
    public int CatchingFishKtorService;
    public final CatchingFishViewModelIntent CatchingFishLayout;
    public int CatchingFishLayoutInflater;
    public boolean CatchingFishMVPRobolectric;
    public final float CatchingFishMVVMAppCompat;
    public boolean CatchingFishMockkOkHttp;
    public final CatchingFishDataStoreGradle CatchingFishMoshiDaggerHilt;
    public int CatchingFishMotionLayout;
    public int CatchingFishMutableLiveData;
    public final ArrayList CatchingFishNavigation;
    public final CatchingFishWidgetFAB CatchingFishNavigationGson;
    public final RectF CatchingFishOkHttp;
    public int CatchingFishParcelable;
    public boolean CatchingFishParcelableFlux;
    public int CatchingFishPayPal;
    public int CatchingFishPayPalLiveData;
    public EdgeEffect CatchingFishPayPalService;
    public final CatchingFishKtorPayPal CatchingFishPicasso;
    public int CatchingFishRecyclerView;
    public final CatchingFishReduxGlide CatchingFishRedux;
    public final CatchingFishMoshiFluxMoshi CatchingFishReduxKtor;
    public boolean CatchingFishReduxMoshi;
    public CatchingFishMockkWidget CatchingFishRetrofit;
    public CatchingFishFluxEspresso CatchingFishRetrofitMVI;
    public final ArrayList CatchingFishRoomDatabase;
    public EdgeEffect CatchingFishSensorManager;
    public final int[] CatchingFishServiceMVIJUnit;
    public int CatchingFishSpannableWidget;
    public final int CatchingFishStateFlow;
    public boolean CatchingFishStateFlowIntent;
    public final ArrayList CatchingFishStateLiveData;
    public boolean CatchingFishStripeAPI;
    public CatchingFishToolbarBundle CatchingFishUnitTesting;
    public final int[] CatchingFishView;
    public final CatchingFishAsyncTaskDagger CatchingFishViewModelFAB;
    public final CatchingFishSensorManager CatchingFishViewModelScope;
    public final CatchingFishKtorPayPal CatchingFishWebSocketMockk;
    public int CatchingFishWidget;
    public CatchingFishRoomDataStore CatchingFishWorkManager;

    static {
        Class cls = Integer.TYPE;
        CatchingFishRealmKtorRealm = new Class[]{Context.class, AttributeSet.class, cls, cls};
        CatchingFishDynamicFeature = new CatchingFishMVIEspresso(0);
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.catchingfish.fishcatcherpro.R.attr.recyclerViewStyle);
    }

    public static RecyclerView CatchingFishCustomView(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView CatchingFishCustomView = CatchingFishCustomView(viewGroup.getChildAt(i));
            if (CatchingFishCustomView != null) {
                return CatchingFishCustomView;
            }
        }
        return null;
    }

    public static void CatchingFishFragmentHandler(CatchingFishPayPalCardView catchingFishPayPalCardView) {
        WeakReference weakReference = catchingFishPayPalCardView.CatchingFishSnackbar;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view == catchingFishPayPalCardView.CatchingFishParcelableFAB) {
                    return;
                }
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            catchingFishPayPalCardView.CatchingFishSnackbar = null;
        }
    }

    public static CatchingFishPayPalCardView CatchingFishSensorManager(View view) {
        if (view == null) {
            return null;
        }
        return ((CatchingFishGradleDagger) view.getLayoutParams()).CatchingFishParcelableFAB;
    }

    private CatchingFishMockkWidget getScrollingChildHelper() {
        if (this.CatchingFishRetrofit == null) {
            this.CatchingFishRetrofit = new CatchingFishMockkWidget(this);
        }
        return this.CatchingFishRetrofit;
    }

    public final void CatchingFish(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        getScrollingChildHelper().CatchingFishCoroutine(i, i2, i3, i4, iArr, i5, iArr2);
    }

    public final void CatchingFishAndroidX(boolean z) {
        if (this.CatchingFishSpannableWidget < 1) {
            this.CatchingFishSpannableWidget = 1;
        }
        if (!z && !this.CatchingFishGsonAppCompat) {
            this.CatchingFishParcelableFlux = false;
        }
        if (this.CatchingFishSpannableWidget == 1) {
            if (z && this.CatchingFishParcelableFlux && !this.CatchingFishGsonAppCompat && this.CatchingFishAnimationMockk != null && this.CatchingFishUnitTesting != null) {
                CatchingFishAnimationMockk();
            }
            if (!this.CatchingFishGsonAppCompat) {
                this.CatchingFishParcelableFlux = false;
            }
        }
        this.CatchingFishSpannableWidget--;
    }

    public final void CatchingFishAnimation(int i, int i2, int[] iArr) {
        CatchingFishPayPalCardView catchingFishPayPalCardView;
        CatchingFishMoshiDaggerHilt();
        CatchingFishMotionLayout();
        int i3 = CatchingFishCoroutineMVP.CatchingFishParcelableFAB;
        Trace.beginSection("RV Scroll");
        CatchingFishReduxGlide catchingFishReduxGlide = this.CatchingFishRedux;
        CatchingFishCardViewRealm(catchingFishReduxGlide);
        CatchingFishSnackbarCameraX catchingFishSnackbarCameraX = this.CatchingFishDaggerWebsocket;
        int CatchingFishView = i != 0 ? this.CatchingFishAnimationMockk.CatchingFishView(i, catchingFishSnackbarCameraX, catchingFishReduxGlide) : 0;
        int CatchingFishGlideWidgetKtor = i2 != 0 ? this.CatchingFishAnimationMockk.CatchingFishGlideWidgetKtor(i2, catchingFishSnackbarCameraX, catchingFishReduxGlide) : 0;
        Trace.endSection();
        CatchingFishAsyncTaskDagger catchingFishAsyncTaskDagger = this.CatchingFishViewModelFAB;
        int CatchingFishCustomView = catchingFishAsyncTaskDagger.CatchingFishCustomView();
        for (int i4 = 0; i4 < CatchingFishCustomView; i4++) {
            View CatchingFishMVPRobolectric = catchingFishAsyncTaskDagger.CatchingFishMVPRobolectric(i4);
            CatchingFishPayPalCardView CatchingFishPayPalService = CatchingFishPayPalService(CatchingFishMVPRobolectric);
            if (CatchingFishPayPalService != null && (catchingFishPayPalCardView = CatchingFishPayPalService.CatchingFishLayout) != null) {
                View view = catchingFishPayPalCardView.CatchingFishParcelableFAB;
                int left = CatchingFishMVPRobolectric.getLeft();
                int top = CatchingFishMVPRobolectric.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        CatchingFishLayoutInflater(true);
        CatchingFishAndroidX(false);
        if (iArr != null) {
            iArr[0] = CatchingFishView;
            iArr[1] = CatchingFishGlideWidgetKtor;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:154:0x0327, code lost:
    
        if (((java.util.ArrayList) r19.CatchingFishViewModelFAB.CatchingFishViewModelScope).contains(getFocusedChild()) == false) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x0386, code lost:
    
        if (r3.hasFocusable() != false) goto L190;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24, types: [int] */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v36 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void CatchingFishAnimationMockk() {
        ?? r16;
        CatchingFishPayPalCardView catchingFishPayPalCardView;
        View view;
        View findViewById;
        boolean z;
        CatchingFishToastCoroutine catchingFishToastCoroutine;
        ?? r2;
        boolean CatchingFishViewModelScope;
        int i;
        if (this.CatchingFishUnitTesting == null || this.CatchingFishAnimationMockk == null) {
            return;
        }
        CatchingFishReduxGlide catchingFishReduxGlide = this.CatchingFishRedux;
        boolean z2 = false;
        catchingFishReduxGlide.CatchingFishLayout = false;
        int i2 = 1;
        boolean z3 = this.CatchingFishStateFlowIntent && !(this.CatchingFishWidget == getWidth() && this.CatchingFishKtorService == getHeight());
        this.CatchingFishWidget = 0;
        this.CatchingFishKtorService = 0;
        this.CatchingFishStateFlowIntent = false;
        if (catchingFishReduxGlide.CatchingFishReduxKtor == 1) {
            CatchingFishStateLiveData();
            this.CatchingFishAnimationMockk.CatchingFishFABLayout(this);
            CatchingFishRoomDatabase();
        } else {
            CatchingFishSensorManager catchingFishSensorManager = this.CatchingFishViewModelScope;
            if ((((ArrayList) catchingFishSensorManager.CatchingFishWorkManager).isEmpty() || ((ArrayList) catchingFishSensorManager.CatchingFishDaggerWebsocket).isEmpty()) && !z3 && this.CatchingFishAnimationMockk.CatchingFishUnitTesting == getWidth() && this.CatchingFishAnimationMockk.CatchingFishAnimationMockk == getHeight()) {
                this.CatchingFishAnimationMockk.CatchingFishFABLayout(this);
            } else {
                this.CatchingFishAnimationMockk.CatchingFishFABLayout(this);
                CatchingFishRoomDatabase();
            }
        }
        catchingFishReduxGlide.CatchingFishParcelableFAB(4);
        CatchingFishMoshiDaggerHilt();
        CatchingFishMotionLayout();
        catchingFishReduxGlide.CatchingFishReduxKtor = 1;
        boolean z4 = catchingFishReduxGlide.CatchingFishFragmentHandler;
        CatchingFishSnackbarCameraX catchingFishSnackbarCameraX = this.CatchingFishDaggerWebsocket;
        CatchingFishViewModelIntent catchingFishViewModelIntent = this.CatchingFishLayout;
        if (z4) {
            int CatchingFishCustomView = this.CatchingFishViewModelFAB.CatchingFishCustomView() - 1;
            while (CatchingFishCustomView >= 0) {
                CatchingFishPayPalCardView CatchingFishSensorManager = CatchingFishSensorManager(this.CatchingFishViewModelFAB.CatchingFishMVPRobolectric(CatchingFishCustomView));
                if (!CatchingFishSensorManager.CatchingFishAnimationMockk()) {
                    long CatchingFishJobScheduler = CatchingFishJobScheduler(CatchingFishSensorManager);
                    this.CatchingFishCameraXIntent.getClass();
                    CatchingFishToastCoroutine catchingFishToastCoroutine2 = new CatchingFishToastCoroutine();
                    catchingFishToastCoroutine2.CatchingFishParcelableFAB(CatchingFishSensorManager);
                    CatchingFishLayoutMVVMFlux catchingFishLayoutMVVMFlux = (CatchingFishLayoutMVVMFlux) catchingFishViewModelIntent.CatchingFishWorkManager;
                    CatchingFishGraphQLRealmFAB catchingFishGraphQLRealmFAB = (CatchingFishGraphQLRealmFAB) catchingFishViewModelIntent.CatchingFishDaggerWebsocket;
                    CatchingFishPayPalCardView catchingFishPayPalCardView2 = (CatchingFishPayPalCardView) catchingFishLayoutMVVMFlux.CatchingFishSnackbar(CatchingFishJobScheduler);
                    if (catchingFishPayPalCardView2 == null || catchingFishPayPalCardView2.CatchingFishAnimationMockk()) {
                        i = i2;
                        catchingFishViewModelIntent.CatchingFishCoroutine(CatchingFishSensorManager, catchingFishToastCoroutine2);
                    } else {
                        CatchingFishMoshiAndroidX catchingFishMoshiAndroidX = (CatchingFishMoshiAndroidX) catchingFishGraphQLRealmFAB.get(catchingFishPayPalCardView2);
                        int i3 = (catchingFishMoshiAndroidX == null || (catchingFishMoshiAndroidX.CatchingFishParcelableFAB & i2) == 0) ? 0 : i2;
                        CatchingFishMoshiAndroidX catchingFishMoshiAndroidX2 = (CatchingFishMoshiAndroidX) catchingFishGraphQLRealmFAB.get(CatchingFishSensorManager);
                        int i4 = (catchingFishMoshiAndroidX2 == null || (catchingFishMoshiAndroidX2.CatchingFishParcelableFAB & i2) == 0) ? 0 : i2;
                        if (i3 == 0 || catchingFishPayPalCardView2 != CatchingFishSensorManager) {
                            i = i2;
                            CatchingFishToastCoroutine CatchingFishParcelableFlux = catchingFishViewModelIntent.CatchingFishParcelableFlux(catchingFishPayPalCardView2, 4);
                            catchingFishViewModelIntent.CatchingFishCoroutine(CatchingFishSensorManager, catchingFishToastCoroutine2);
                            CatchingFishToastCoroutine CatchingFishParcelableFlux2 = catchingFishViewModelIntent.CatchingFishParcelableFlux(CatchingFishSensorManager, 8);
                            if (CatchingFishParcelableFlux == null) {
                                int CatchingFishCustomView2 = this.CatchingFishViewModelFAB.CatchingFishCustomView();
                                for (int i5 = 0; i5 < CatchingFishCustomView2; i5++) {
                                    CatchingFishPayPalCardView CatchingFishSensorManager2 = CatchingFishSensorManager(this.CatchingFishViewModelFAB.CatchingFishMVPRobolectric(i5));
                                    if (CatchingFishSensorManager2 != CatchingFishSensorManager && CatchingFishJobScheduler(CatchingFishSensorManager2) == CatchingFishJobScheduler) {
                                        CatchingFishToolbarBundle catchingFishToolbarBundle = this.CatchingFishUnitTesting;
                                        if (catchingFishToolbarBundle == null || !catchingFishToolbarBundle.CatchingFishSnackbar) {
                                            throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + CatchingFishSensorManager2 + " \n View Holder 2:" + CatchingFishSensorManager + CatchingFishGsonAppCompat());
                                        }
                                        throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + CatchingFishSensorManager2 + " \n View Holder 2:" + CatchingFishSensorManager + CatchingFishGsonAppCompat());
                                    }
                                }
                                Objects.toString(catchingFishPayPalCardView2);
                                Objects.toString(CatchingFishSensorManager);
                                CatchingFishGsonAppCompat();
                            } else {
                                catchingFishPayPalCardView2.CatchingFishUnitTesting(false);
                                if (i3 != 0) {
                                    CatchingFishWorkManager(catchingFishPayPalCardView2);
                                }
                                if (catchingFishPayPalCardView2 != CatchingFishSensorManager) {
                                    if (i4 != 0) {
                                        CatchingFishWorkManager(CatchingFishSensorManager);
                                    }
                                    catchingFishPayPalCardView2.CatchingFishViewModelFAB = CatchingFishSensorManager;
                                    CatchingFishWorkManager(catchingFishPayPalCardView2);
                                    catchingFishSnackbarCameraX.CatchingFishCloudMessaging(catchingFishPayPalCardView2);
                                    CatchingFishSensorManager.CatchingFishUnitTesting(false);
                                    CatchingFishSensorManager.CatchingFishLayout = catchingFishPayPalCardView2;
                                }
                                if (this.CatchingFishCameraXIntent.CatchingFishParcelableFAB(catchingFishPayPalCardView2, CatchingFishSensorManager, CatchingFishParcelableFlux, CatchingFishParcelableFlux2)) {
                                    CatchingFishRecyclerView();
                                }
                            }
                        } else {
                            catchingFishViewModelIntent.CatchingFishCoroutine(CatchingFishSensorManager, catchingFishToastCoroutine2);
                        }
                    }
                    CatchingFishCustomView--;
                    i2 = i;
                }
                i = i2;
                CatchingFishCustomView--;
                i2 = i;
            }
            r16 = i2;
            CatchingFishGraphQLRealmFAB catchingFishGraphQLRealmFAB2 = (CatchingFishGraphQLRealmFAB) catchingFishViewModelIntent.CatchingFishDaggerWebsocket;
            int i6 = catchingFishGraphQLRealmFAB2.CatchingFishWorkManager - 1;
            while (i6 >= 0) {
                CatchingFishPayPalCardView catchingFishPayPalCardView3 = (CatchingFishPayPalCardView) catchingFishGraphQLRealmFAB2.CatchingFishWorkManager(i6);
                CatchingFishMoshiAndroidX catchingFishMoshiAndroidX3 = (CatchingFishMoshiAndroidX) catchingFishGraphQLRealmFAB2.CatchingFishViewModelScope(i6);
                int i7 = catchingFishMoshiAndroidX3.CatchingFishParcelableFAB;
                int i8 = i7 & 3;
                CatchingFishKtorPayPal catchingFishKtorPayPal = this.CatchingFishWebSocketMockk;
                if (i8 == 3) {
                    RecyclerView recyclerView = catchingFishKtorPayPal.CatchingFishParcelableFAB;
                    recyclerView.CatchingFishAnimationMockk.CatchingFishFirebase(catchingFishPayPalCardView3.CatchingFishParcelableFAB, recyclerView.CatchingFishDaggerWebsocket);
                    r2 = z2;
                } else if ((i7 & 1) != 0) {
                    CatchingFishToastCoroutine catchingFishToastCoroutine3 = catchingFishMoshiAndroidX3.CatchingFishSnackbar;
                    if (catchingFishToastCoroutine3 == null) {
                        RecyclerView recyclerView2 = catchingFishKtorPayPal.CatchingFishParcelableFAB;
                        recyclerView2.CatchingFishAnimationMockk.CatchingFishFirebase(catchingFishPayPalCardView3.CatchingFishParcelableFAB, recyclerView2.CatchingFishDaggerWebsocket);
                        r2 = z2;
                    } else {
                        catchingFishKtorPayPal.CatchingFishViewModelScope(catchingFishPayPalCardView3, catchingFishToastCoroutine3, catchingFishMoshiAndroidX3.CatchingFishCoroutine);
                        r2 = z2;
                    }
                } else if ((i7 & 14) == 14) {
                    catchingFishKtorPayPal.CatchingFishWorkManager(catchingFishPayPalCardView3, catchingFishMoshiAndroidX3.CatchingFishSnackbar, catchingFishMoshiAndroidX3.CatchingFishCoroutine);
                    r2 = z2;
                } else if ((i7 & 12) == 12) {
                    CatchingFishToastCoroutine catchingFishToastCoroutine4 = catchingFishMoshiAndroidX3.CatchingFishSnackbar;
                    CatchingFishToastCoroutine catchingFishToastCoroutine5 = catchingFishMoshiAndroidX3.CatchingFishCoroutine;
                    catchingFishKtorPayPal.getClass();
                    catchingFishPayPalCardView3.CatchingFishUnitTesting(z2);
                    RecyclerView recyclerView3 = catchingFishKtorPayPal.CatchingFishParcelableFAB;
                    if (!recyclerView3.CatchingFishMVPRobolectric) {
                        CatchingFishGsonUnitTesting catchingFishGsonUnitTesting = (CatchingFishGsonUnitTesting) recyclerView3.CatchingFishCameraXIntent;
                        catchingFishGsonUnitTesting.getClass();
                        int i9 = catchingFishToastCoroutine4.CatchingFishParcelableFAB;
                        int i10 = catchingFishToastCoroutine5.CatchingFishParcelableFAB;
                        if (i9 == i10 && catchingFishToastCoroutine4.CatchingFishSnackbar == catchingFishToastCoroutine5.CatchingFishSnackbar) {
                            catchingFishGsonUnitTesting.CatchingFishCoroutine(catchingFishPayPalCardView3);
                            CatchingFishViewModelScope = false;
                        } else {
                            CatchingFishViewModelScope = catchingFishGsonUnitTesting.CatchingFishViewModelScope(catchingFishPayPalCardView3, i9, catchingFishToastCoroutine4.CatchingFishSnackbar, i10, catchingFishToastCoroutine5.CatchingFishSnackbar);
                        }
                        if (CatchingFishViewModelScope) {
                            recyclerView3.CatchingFishRecyclerView();
                        }
                    } else if (recyclerView3.CatchingFishCameraXIntent.CatchingFishParcelableFAB(catchingFishPayPalCardView3, catchingFishPayPalCardView3, catchingFishToastCoroutine4, catchingFishToastCoroutine5)) {
                        recyclerView3.CatchingFishRecyclerView();
                    }
                    r2 = 0;
                } else {
                    if ((i7 & 4) != 0) {
                        catchingFishToastCoroutine = null;
                        catchingFishKtorPayPal.CatchingFishViewModelScope(catchingFishPayPalCardView3, catchingFishMoshiAndroidX3.CatchingFishSnackbar, null);
                    } else {
                        catchingFishToastCoroutine = null;
                        if ((i7 & 8) != 0) {
                            catchingFishKtorPayPal.CatchingFishWorkManager(catchingFishPayPalCardView3, catchingFishMoshiAndroidX3.CatchingFishSnackbar, catchingFishMoshiAndroidX3.CatchingFishCoroutine);
                        }
                    }
                    r2 = 0;
                    catchingFishMoshiAndroidX3.CatchingFishParcelableFAB = r2;
                    catchingFishMoshiAndroidX3.CatchingFishSnackbar = catchingFishToastCoroutine;
                    catchingFishMoshiAndroidX3.CatchingFishCoroutine = catchingFishToastCoroutine;
                    CatchingFishMoshiAndroidX.CatchingFishReduxKtor.CatchingFishCoroutine(catchingFishMoshiAndroidX3);
                    i6--;
                    z2 = false;
                }
                catchingFishToastCoroutine = null;
                catchingFishMoshiAndroidX3.CatchingFishParcelableFAB = r2;
                catchingFishMoshiAndroidX3.CatchingFishSnackbar = catchingFishToastCoroutine;
                catchingFishMoshiAndroidX3.CatchingFishCoroutine = catchingFishToastCoroutine;
                CatchingFishMoshiAndroidX.CatchingFishReduxKtor.CatchingFishCoroutine(catchingFishMoshiAndroidX3);
                i6--;
                z2 = false;
            }
        } else {
            r16 = 1;
        }
        View view2 = null;
        this.CatchingFishAnimationMockk.CatchingFishPicasso(catchingFishSnackbarCameraX);
        catchingFishReduxGlide.CatchingFishSnackbar = catchingFishReduxGlide.CatchingFishDaggerWebsocket;
        this.CatchingFishMVPRobolectric = false;
        this.CatchingFishCustomView = false;
        catchingFishReduxGlide.CatchingFishFragmentHandler = false;
        catchingFishReduxGlide.CatchingFishCloudMessaging = false;
        this.CatchingFishAnimationMockk.CatchingFishWorkManager = false;
        ArrayList arrayList = catchingFishSnackbarCameraX.CatchingFishSnackbar;
        if (arrayList != null) {
            arrayList.clear();
        }
        CatchingFishKtorDataStore catchingFishKtorDataStore = this.CatchingFishAnimationMockk;
        if (catchingFishKtorDataStore.CatchingFishCloudMessaging) {
            catchingFishKtorDataStore.CatchingFishFragmentHandler = 0;
            catchingFishKtorDataStore.CatchingFishCloudMessaging = false;
            catchingFishSnackbarCameraX.CatchingFishEspressoTesting();
        }
        this.CatchingFishAnimationMockk.CatchingFishRedux(catchingFishReduxGlide);
        boolean z5 = r16;
        CatchingFishLayoutInflater(z5);
        CatchingFishAndroidX(false);
        ((CatchingFishGraphQLRealmFAB) catchingFishViewModelIntent.CatchingFishDaggerWebsocket).clear();
        ((CatchingFishLayoutMVVMFlux) catchingFishViewModelIntent.CatchingFishWorkManager).CatchingFishParcelableFAB();
        int[] iArr = this.CatchingFishGradleLiveData;
        int i11 = iArr[0];
        int i12 = iArr[z5 ? 1 : 0];
        CatchingFishMVPRobolectric(iArr);
        if ((iArr[0] == i11 && iArr[z5 ? 1 : 0] == i12) ? false : true) {
            CatchingFishJetpackCompose(0, 0);
        }
        if (this.CatchingFishStripeAPI && this.CatchingFishUnitTesting != null && hasFocus() && getDescendantFocusability() != 393216 && (getDescendantFocusability() != 131072 || !isFocused())) {
            if (!isFocused()) {
            }
            long j = catchingFishReduxGlide.CatchingFishOkHttp;
            if (j != -1 && (z = this.CatchingFishUnitTesting.CatchingFishSnackbar) && z) {
                int CatchingFishHandler = this.CatchingFishViewModelFAB.CatchingFishHandler();
                int i13 = 0;
                catchingFishPayPalCardView = null;
                while (true) {
                    if (i13 >= CatchingFishHandler) {
                        break;
                    }
                    CatchingFishPayPalCardView CatchingFishSensorManager3 = CatchingFishSensorManager(this.CatchingFishViewModelFAB.CatchingFishCameraXIntent(i13));
                    if (CatchingFishSensorManager3 != null && !CatchingFishSensorManager3.CatchingFishViewModelFAB() && CatchingFishSensorManager3.CatchingFishDaggerWebsocket == j) {
                        if (!((ArrayList) this.CatchingFishViewModelFAB.CatchingFishViewModelScope).contains(CatchingFishSensorManager3.CatchingFishParcelableFAB)) {
                            catchingFishPayPalCardView = CatchingFishSensorManager3;
                            break;
                        }
                        catchingFishPayPalCardView = CatchingFishSensorManager3;
                    }
                    i13++;
                }
            } else {
                catchingFishPayPalCardView = null;
            }
            if (catchingFishPayPalCardView != null) {
                view = catchingFishPayPalCardView.CatchingFishParcelableFAB;
                if (!((ArrayList) this.CatchingFishViewModelFAB.CatchingFishViewModelScope).contains(view)) {
                }
            }
            if (this.CatchingFishViewModelFAB.CatchingFishCustomView() > 0) {
                int i14 = catchingFishReduxGlide.CatchingFishEspressoTesting;
                int i15 = i14 != -1 ? i14 : 0;
                int CatchingFishSnackbar = catchingFishReduxGlide.CatchingFishSnackbar();
                for (int i16 = i15; i16 < CatchingFishSnackbar; i16++) {
                    CatchingFishPayPalCardView CatchingFishFragmentFactory = CatchingFishFragmentFactory(i16);
                    if (CatchingFishFragmentFactory == null) {
                        break;
                    }
                    View view3 = CatchingFishFragmentFactory.CatchingFishParcelableFAB;
                    if (view3.hasFocusable()) {
                        view2 = view3;
                        break;
                    }
                }
                for (int min = Math.min(CatchingFishSnackbar, i15) - 1; min >= 0; min--) {
                    CatchingFishPayPalCardView CatchingFishFragmentFactory2 = CatchingFishFragmentFactory(min);
                    if (CatchingFishFragmentFactory2 == null) {
                        break;
                    }
                    view = CatchingFishFragmentFactory2.CatchingFishParcelableFAB;
                    if (view.hasFocusable()) {
                        view2 = view;
                        break;
                    }
                }
            }
            if (view2 != null) {
                int i17 = catchingFishReduxGlide.CatchingFishUnitTesting;
                if (i17 != -1 && (findViewById = view2.findViewById(i17)) != null && findViewById.isFocusable()) {
                    view2 = findViewById;
                }
                view2.requestFocus();
            }
        }
        catchingFishReduxGlide.CatchingFishOkHttp = -1L;
        catchingFishReduxGlide.CatchingFishEspressoTesting = -1;
        catchingFishReduxGlide.CatchingFishUnitTesting = -1;
    }

    public final void CatchingFishAppCompat(CatchingFishPayPalCardView catchingFishPayPalCardView, CatchingFishToastCoroutine catchingFishToastCoroutine) {
        catchingFishPayPalCardView.CatchingFishFragmentHandler &= -8193;
        boolean z = this.CatchingFishRedux.CatchingFishViewModelFAB;
        CatchingFishViewModelIntent catchingFishViewModelIntent = this.CatchingFishLayout;
        if (z && catchingFishPayPalCardView.CatchingFishCloudMessaging() && !catchingFishPayPalCardView.CatchingFishViewModelFAB() && !catchingFishPayPalCardView.CatchingFishAnimationMockk()) {
            ((CatchingFishLayoutMVVMFlux) catchingFishViewModelIntent.CatchingFishWorkManager).CatchingFishDaggerWebsocket(CatchingFishJobScheduler(catchingFishPayPalCardView), catchingFishPayPalCardView);
        }
        CatchingFishGraphQLRealmFAB catchingFishGraphQLRealmFAB = (CatchingFishGraphQLRealmFAB) catchingFishViewModelIntent.CatchingFishDaggerWebsocket;
        CatchingFishMoshiAndroidX catchingFishMoshiAndroidX = (CatchingFishMoshiAndroidX) catchingFishGraphQLRealmFAB.get(catchingFishPayPalCardView);
        if (catchingFishMoshiAndroidX == null) {
            catchingFishMoshiAndroidX = CatchingFishMoshiAndroidX.CatchingFishParcelableFAB();
            catchingFishGraphQLRealmFAB.put(catchingFishPayPalCardView, catchingFishMoshiAndroidX);
        }
        catchingFishMoshiAndroidX.CatchingFishSnackbar = catchingFishToastCoroutine;
        catchingFishMoshiAndroidX.CatchingFishParcelableFAB |= 4;
    }

    public final boolean CatchingFishCameraXIntent() {
        return this.CatchingFishFragmentFactory > 0;
    }

    public final void CatchingFishCardViewRealm(CatchingFishReduxGlide catchingFishReduxGlide) {
        if (getScrollState() != 2) {
            catchingFishReduxGlide.getClass();
            return;
        }
        OverScroller overScroller = this.CatchingFishMoshiDaggerHilt.CatchingFishWorkManager;
        overScroller.getFinalX();
        overScroller.getCurrX();
        catchingFishReduxGlide.getClass();
        overScroller.getFinalY();
        overScroller.getCurrY();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0061 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean CatchingFishCardViewView(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        ArrayList arrayList = this.CatchingFishNavigation;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            CatchingFishGsonNavigation catchingFishGsonNavigation = (CatchingFishGsonNavigation) arrayList.get(i);
            int i2 = catchingFishGsonNavigation.CatchingFishDaggerHiltFAB;
            if (i2 == 1) {
                boolean CatchingFishReduxKtor = catchingFishGsonNavigation.CatchingFishReduxKtor(motionEvent.getX(), motionEvent.getY());
                boolean CatchingFishCoroutine = catchingFishGsonNavigation.CatchingFishCoroutine(motionEvent.getX(), motionEvent.getY());
                if (motionEvent.getAction() == 0 && (CatchingFishReduxKtor || CatchingFishCoroutine)) {
                    if (CatchingFishCoroutine) {
                        catchingFishGsonNavigation.CatchingFishSpannableWidget = 1;
                        catchingFishGsonNavigation.CatchingFishStateLiveData = (int) motionEvent.getX();
                    } else if (CatchingFishReduxKtor) {
                        catchingFishGsonNavigation.CatchingFishSpannableWidget = 2;
                        catchingFishGsonNavigation.CatchingFishOkHttp = (int) motionEvent.getY();
                    }
                    catchingFishGsonNavigation.CatchingFishWorkManager(2);
                    if (action == 3) {
                        this.CatchingFish = catchingFishGsonNavigation;
                        return true;
                    }
                }
            } else {
                if (i2 != 2) {
                    continue;
                }
                if (action == 3) {
                }
            }
        }
        return false;
    }

    public final void CatchingFishCloudMessaging() {
        int CatchingFishHandler = this.CatchingFishViewModelFAB.CatchingFishHandler();
        for (int i = 0; i < CatchingFishHandler; i++) {
            CatchingFishPayPalCardView CatchingFishSensorManager = CatchingFishSensorManager(this.CatchingFishViewModelFAB.CatchingFishCameraXIntent(i));
            if (!CatchingFishSensorManager.CatchingFishAnimationMockk()) {
                CatchingFishSensorManager.CatchingFishReduxKtor = -1;
                CatchingFishSensorManager.CatchingFishViewModelScope = -1;
            }
        }
        CatchingFishSnackbarCameraX catchingFishSnackbarCameraX = this.CatchingFishDaggerWebsocket;
        ArrayList arrayList = catchingFishSnackbarCameraX.CatchingFishParcelableFAB;
        ArrayList arrayList2 = catchingFishSnackbarCameraX.CatchingFishCoroutine;
        int size = arrayList2.size();
        for (int i2 = 0; i2 < size; i2++) {
            CatchingFishPayPalCardView catchingFishPayPalCardView = (CatchingFishPayPalCardView) arrayList2.get(i2);
            catchingFishPayPalCardView.CatchingFishReduxKtor = -1;
            catchingFishPayPalCardView.CatchingFishViewModelScope = -1;
        }
        int size2 = arrayList.size();
        for (int i3 = 0; i3 < size2; i3++) {
            CatchingFishPayPalCardView catchingFishPayPalCardView2 = (CatchingFishPayPalCardView) arrayList.get(i3);
            catchingFishPayPalCardView2.CatchingFishReduxKtor = -1;
            catchingFishPayPalCardView2.CatchingFishViewModelScope = -1;
        }
        ArrayList arrayList3 = catchingFishSnackbarCameraX.CatchingFishSnackbar;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i4 = 0; i4 < size3; i4++) {
                CatchingFishPayPalCardView catchingFishPayPalCardView3 = (CatchingFishPayPalCardView) catchingFishSnackbarCameraX.CatchingFishSnackbar.get(i4);
                catchingFishPayPalCardView3.CatchingFishReduxKtor = -1;
                catchingFishPayPalCardView3.CatchingFishViewModelScope = -1;
            }
        }
    }

    public final void CatchingFishCoroutineFlow() {
        if (this.CatchingFishDagger != null) {
            return;
        }
        this.CatchingFishJobScheduler.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.CatchingFishDagger = edgeEffect;
        if (this.CatchingFishFragmentHandler) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final boolean CatchingFishDagger() {
        return !this.CatchingFishDaggerHiltFAB || this.CatchingFishMVPRobolectric || this.CatchingFishViewModelScope.CatchingFishViewModelScope();
    }

    public final void CatchingFishDaggerHiltFAB() {
        if (this.CatchingFishPayPalService != null) {
            return;
        }
        this.CatchingFishJobScheduler.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.CatchingFishPayPalService = edgeEffect;
        if (this.CatchingFishFragmentHandler) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void CatchingFishDataStoreIntent(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.CatchingFishCloudMessaging;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof CatchingFishGradleDagger) {
            CatchingFishGradleDagger catchingFishGradleDagger = (CatchingFishGradleDagger) layoutParams;
            if (!catchingFishGradleDagger.CatchingFishCoroutine) {
                Rect rect2 = catchingFishGradleDagger.CatchingFishSnackbar;
                rect.left -= rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, rect);
            offsetRectIntoDescendantCoords(view, rect);
        }
        this.CatchingFishAnimationMockk.CatchingFishGradleLiveData(this, view, this.CatchingFishCloudMessaging, !this.CatchingFishDaggerHiltFAB, view2 == null);
    }

    public final Rect CatchingFishEspressoMockk(View view) {
        CatchingFishGradleDagger catchingFishGradleDagger = (CatchingFishGradleDagger) view.getLayoutParams();
        boolean z = catchingFishGradleDagger.CatchingFishCoroutine;
        Rect rect = catchingFishGradleDagger.CatchingFishSnackbar;
        if (!z || (this.CatchingFishRedux.CatchingFishViewModelScope && (catchingFishGradleDagger.CatchingFishParcelableFAB.CatchingFishCloudMessaging() || catchingFishGradleDagger.CatchingFishParcelableFAB.CatchingFishWorkManager()))) {
            return rect;
        }
        rect.set(0, 0, 0, 0);
        ArrayList arrayList = this.CatchingFishRoomDatabase;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Rect rect2 = this.CatchingFishCloudMessaging;
            rect2.set(0, 0, 0, 0);
            ((CatchingFishViewHiltWidget) arrayList.get(i)).getClass();
            ((CatchingFishGradleDagger) view.getLayoutParams()).CatchingFishParcelableFAB.getClass();
            rect2.set(0, 0, 0, 0);
            rect.left += rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        catchingFishGradleDagger.CatchingFishCoroutine = false;
        return rect;
    }

    public final void CatchingFishEspressoTesting(int i, int i2) {
        boolean z;
        EdgeEffect edgeEffect = this.CatchingFishPayPalService;
        if (edgeEffect == null || edgeEffect.isFinished() || i <= 0) {
            z = false;
        } else {
            this.CatchingFishPayPalService.onRelease();
            z = this.CatchingFishPayPalService.isFinished();
        }
        EdgeEffect edgeEffect2 = this.CatchingFishEspressoMockk;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.CatchingFishEspressoMockk.onRelease();
            z |= this.CatchingFishEspressoMockk.isFinished();
        }
        EdgeEffect edgeEffect3 = this.CatchingFishSensorManager;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.CatchingFishSensorManager.onRelease();
            z |= this.CatchingFishSensorManager.isFinished();
        }
        EdgeEffect edgeEffect4 = this.CatchingFishDagger;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.CatchingFishDagger.onRelease();
            z |= this.CatchingFishDagger.isFinished();
        }
        if (z) {
            WeakHashMap weakHashMap = CatchingFishFABCameraX.CatchingFishParcelableFAB;
            postInvalidateOnAnimation();
        }
    }

    public final CatchingFishPayPalCardView CatchingFishFragmentFactory(int i) {
        CatchingFishPayPalCardView catchingFishPayPalCardView = null;
        if (this.CatchingFishMVPRobolectric) {
            return null;
        }
        int CatchingFishHandler = this.CatchingFishViewModelFAB.CatchingFishHandler();
        for (int i2 = 0; i2 < CatchingFishHandler; i2++) {
            CatchingFishPayPalCardView CatchingFishSensorManager = CatchingFishSensorManager(this.CatchingFishViewModelFAB.CatchingFishCameraXIntent(i2));
            if (CatchingFishSensorManager != null && !CatchingFishSensorManager.CatchingFishViewModelFAB() && CatchingFishMutableLiveData(CatchingFishSensorManager) == i) {
                if (!((ArrayList) this.CatchingFishViewModelFAB.CatchingFishViewModelScope).contains(CatchingFishSensorManager.CatchingFishParcelableFAB)) {
                    return CatchingFishSensorManager;
                }
                catchingFishPayPalCardView = CatchingFishSensorManager;
            }
        }
        return catchingFishPayPalCardView;
    }

    public final void CatchingFishGradleManifest(int i, int i2, boolean z) {
        int i3 = i + i2;
        int CatchingFishHandler = this.CatchingFishViewModelFAB.CatchingFishHandler();
        for (int i4 = 0; i4 < CatchingFishHandler; i4++) {
            CatchingFishPayPalCardView CatchingFishSensorManager = CatchingFishSensorManager(this.CatchingFishViewModelFAB.CatchingFishCameraXIntent(i4));
            if (CatchingFishSensorManager != null && !CatchingFishSensorManager.CatchingFishAnimationMockk()) {
                int i5 = CatchingFishSensorManager.CatchingFishCoroutine;
                CatchingFishReduxGlide catchingFishReduxGlide = this.CatchingFishRedux;
                if (i5 >= i3) {
                    CatchingFishSensorManager.CatchingFishEspressoTesting(-i2, z);
                    catchingFishReduxGlide.CatchingFishWorkManager = true;
                } else if (i5 >= i) {
                    CatchingFishSensorManager.CatchingFishParcelableFAB(8);
                    CatchingFishSensorManager.CatchingFishEspressoTesting(-i2, z);
                    CatchingFishSensorManager.CatchingFishCoroutine = i - 1;
                    catchingFishReduxGlide.CatchingFishWorkManager = true;
                }
            }
        }
        CatchingFishSnackbarCameraX catchingFishSnackbarCameraX = this.CatchingFishDaggerWebsocket;
        ArrayList arrayList = catchingFishSnackbarCameraX.CatchingFishCoroutine;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            CatchingFishPayPalCardView catchingFishPayPalCardView = (CatchingFishPayPalCardView) arrayList.get(size);
            if (catchingFishPayPalCardView != null) {
                int i6 = catchingFishPayPalCardView.CatchingFishCoroutine;
                if (i6 >= i3) {
                    catchingFishPayPalCardView.CatchingFishEspressoTesting(-i2, z);
                } else if (i6 >= i) {
                    catchingFishPayPalCardView.CatchingFishParcelableFAB(8);
                    catchingFishSnackbarCameraX.CatchingFishWorkManager(size);
                }
            }
        }
        requestLayout();
    }

    public final String CatchingFishGsonAppCompat() {
        return " " + super.toString() + ", adapter:" + this.CatchingFishUnitTesting + ", layout:" + this.CatchingFishAnimationMockk + ", context:" + getContext();
    }

    public final void CatchingFishHandler(int i) {
        if (this.CatchingFishAnimationMockk == null) {
            return;
        }
        setScrollState(2);
        this.CatchingFishAnimationMockk.CatchingFishServiceMVIJUnit(i);
        awakenScrollBars();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean CatchingFishJUnitRealm(int i, int i2, MotionEvent motionEvent, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z;
        boolean z2;
        CatchingFishOkHttp();
        CatchingFishToolbarBundle catchingFishToolbarBundle = this.CatchingFishUnitTesting;
        int[] iArr = this.CatchingFishGlideWidgetKtor;
        if (catchingFishToolbarBundle != null) {
            iArr[0] = 0;
            iArr[1] = 0;
            CatchingFishAnimation(i, i2, iArr);
            i4 = iArr[0];
            i5 = iArr[1];
            i6 = i - i4;
            i7 = i2 - i5;
        } else {
            i4 = 0;
            i5 = 0;
            i6 = 0;
            i7 = 0;
        }
        if (!this.CatchingFishRoomDatabase.isEmpty()) {
            invalidate();
        }
        iArr[0] = 0;
        iArr[1] = 0;
        CatchingFish(i4, i5, i6, i7, this.CatchingFishView, i3, iArr);
        int i8 = iArr[0];
        int i9 = i6 - i8;
        int i10 = iArr[1];
        int i11 = i7 - i10;
        boolean z3 = (i8 == 0 && i10 == 0) ? false : true;
        int i12 = this.CatchingFishParcelable;
        int[] iArr2 = this.CatchingFishView;
        int i13 = iArr2[0];
        this.CatchingFishParcelable = i12 - i13;
        int i14 = this.CatchingFishRecyclerView;
        int i15 = iArr2[1];
        this.CatchingFishRecyclerView = i14 - i15;
        int[] iArr3 = this.CatchingFishServiceMVIJUnit;
        iArr3[0] = iArr3[0] + i13;
        iArr3[1] = iArr3[1] + i15;
        if (getOverScrollMode() != 2) {
            if (motionEvent == null || (motionEvent.getSource() & 8194) == 8194) {
                z = true;
            } else {
                float x = motionEvent.getX();
                float f = i9;
                float y = motionEvent.getY();
                float f2 = i11;
                if (f < 0.0f) {
                    CatchingFishDaggerHiltFAB();
                    z = true;
                    this.CatchingFishPayPalService.onPull((-f) / getWidth(), 1.0f - (y / getHeight()));
                } else {
                    z = true;
                    if (f > 0.0f) {
                        CatchingFishSpannableWidget();
                        this.CatchingFishEspressoMockk.onPull(f / getWidth(), y / getHeight());
                    } else {
                        z2 = false;
                        if (f2 >= 0.0f) {
                            CatchingFishParcelableFlux();
                            this.CatchingFishSensorManager.onPull((-f2) / getHeight(), x / getWidth());
                        } else {
                            if (f2 > 0.0f) {
                                CatchingFishCoroutineFlow();
                                this.CatchingFishDagger.onPull(f2 / getHeight(), 1.0f - (x / getWidth()));
                            }
                            if (!z2 || f != 0.0f || f2 != 0.0f) {
                                WeakHashMap weakHashMap = CatchingFishFABCameraX.CatchingFishParcelableFAB;
                                postInvalidateOnAnimation();
                            }
                        }
                        z2 = z;
                        if (!z2) {
                        }
                        WeakHashMap weakHashMap2 = CatchingFishFABCameraX.CatchingFishParcelableFAB;
                        postInvalidateOnAnimation();
                    }
                }
                z2 = z;
                if (f2 >= 0.0f) {
                }
                z2 = z;
                if (!z2) {
                }
                WeakHashMap weakHashMap22 = CatchingFishFABCameraX.CatchingFishParcelableFAB;
                postInvalidateOnAnimation();
            }
            CatchingFishEspressoTesting(i, i2);
        } else {
            z = true;
        }
        if (i4 != 0 || i5 != 0) {
            CatchingFishJetpackCompose(i4, i5);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        if (!z3 && i4 == 0 && i5 == 0) {
            return false;
        }
        return z;
    }

    public final void CatchingFishJetpackCompose(int i, int i2) {
        this.CatchingFishMutableLiveData++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);
        CatchingFishFABGoogleMaps catchingFishFABGoogleMaps = this.CatchingFishCustomViewJUnit;
        if (catchingFishFABGoogleMaps != null) {
            catchingFishFABGoogleMaps.CatchingFishSnackbar(this, i, i2);
        }
        ArrayList arrayList = this.CatchingFishDaggerMVVM;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((CatchingFishFABGoogleMaps) this.CatchingFishDaggerMVVM.get(size)).CatchingFishSnackbar(this, i, i2);
            }
        }
        this.CatchingFishMutableLiveData--;
    }

    public final long CatchingFishJobScheduler(CatchingFishPayPalCardView catchingFishPayPalCardView) {
        return this.CatchingFishUnitTesting.CatchingFishSnackbar ? catchingFishPayPalCardView.CatchingFishDaggerWebsocket : catchingFishPayPalCardView.CatchingFishCoroutine;
    }

    public final void CatchingFishLayout(String str) {
        if (CatchingFishCameraXIntent()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + CatchingFishGsonAppCompat());
        }
        if (this.CatchingFishMutableLiveData > 0) {
            new IllegalStateException("" + CatchingFishGsonAppCompat());
        }
    }

    public final void CatchingFishLayoutInflater(boolean z) {
        int i;
        AccessibilityManager accessibilityManager;
        int i2 = this.CatchingFishFragmentFactory - 1;
        this.CatchingFishFragmentFactory = i2;
        if (i2 < 1) {
            this.CatchingFishFragmentFactory = 0;
            if (z) {
                int i3 = this.CatchingFishPayPal;
                this.CatchingFishPayPal = 0;
                if (i3 != 0 && (accessibilityManager = this.CatchingFishCardViewView) != null && accessibilityManager.isEnabled()) {
                    AccessibilityEvent obtain = AccessibilityEvent.obtain();
                    obtain.setEventType(2048);
                    obtain.setContentChangeTypes(i3);
                    sendAccessibilityEventUnchecked(obtain);
                }
                ArrayList arrayList = this.CatchingFishFABLayout;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    CatchingFishPayPalCardView catchingFishPayPalCardView = (CatchingFishPayPalCardView) arrayList.get(size);
                    if (catchingFishPayPalCardView.CatchingFishParcelableFAB.getParent() == this && !catchingFishPayPalCardView.CatchingFishAnimationMockk() && (i = catchingFishPayPalCardView.CatchingFishRoomDatabase) != -1) {
                        View view = catchingFishPayPalCardView.CatchingFishParcelableFAB;
                        WeakHashMap weakHashMap = CatchingFishFABCameraX.CatchingFishParcelableFAB;
                        view.setImportantForAccessibility(i);
                        catchingFishPayPalCardView.CatchingFishRoomDatabase = -1;
                    }
                }
                arrayList.clear();
            }
        }
    }

    public final void CatchingFishMVPRobolectric(int[] iArr) {
        int CatchingFishCustomView = this.CatchingFishViewModelFAB.CatchingFishCustomView();
        if (CatchingFishCustomView == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < CatchingFishCustomView; i3++) {
            CatchingFishPayPalCardView CatchingFishSensorManager = CatchingFishSensorManager(this.CatchingFishViewModelFAB.CatchingFishMVPRobolectric(i3));
            if (!CatchingFishSensorManager.CatchingFishAnimationMockk()) {
                int CatchingFishSnackbar = CatchingFishSensorManager.CatchingFishSnackbar();
                if (CatchingFishSnackbar < i) {
                    i = CatchingFishSnackbar;
                }
                if (CatchingFishSnackbar > i2) {
                    i2 = CatchingFishSnackbar;
                }
            }
        }
        iArr[0] = i;
        iArr[1] = i2;
    }

    public final void CatchingFishMVVMAppCompat(int i) {
        CatchingFishFABRobolectric catchingFishFABRobolectric;
        if (this.CatchingFishGsonAppCompat) {
            return;
        }
        setScrollState(0);
        CatchingFishDataStoreGradle catchingFishDataStoreGradle = this.CatchingFishMoshiDaggerHilt;
        catchingFishDataStoreGradle.CatchingFishFragmentHandler.removeCallbacks(catchingFishDataStoreGradle);
        catchingFishDataStoreGradle.CatchingFishWorkManager.abortAnimation();
        CatchingFishKtorDataStore catchingFishKtorDataStore = this.CatchingFishAnimationMockk;
        if (catchingFishKtorDataStore != null && (catchingFishFABRobolectric = catchingFishKtorDataStore.CatchingFishDaggerWebsocket) != null) {
            catchingFishFABRobolectric.CatchingFishLayout();
        }
        CatchingFishKtorDataStore catchingFishKtorDataStore2 = this.CatchingFishAnimationMockk;
        if (catchingFishKtorDataStore2 == null) {
            return;
        }
        catchingFishKtorDataStore2.CatchingFishServiceMVIJUnit(i);
        awakenScrollBars();
    }

    public final void CatchingFishMoshiDaggerHilt() {
        int i = this.CatchingFishSpannableWidget + 1;
        this.CatchingFishSpannableWidget = i;
        if (i != 1 || this.CatchingFishGsonAppCompat) {
            return;
        }
        this.CatchingFishParcelableFlux = false;
    }

    public final void CatchingFishMotionLayout() {
        this.CatchingFishFragmentFactory++;
    }

    public final int CatchingFishMutableLiveData(CatchingFishPayPalCardView catchingFishPayPalCardView) {
        if ((catchingFishPayPalCardView.CatchingFishFragmentHandler & 524) == 0 && catchingFishPayPalCardView.CatchingFishDaggerWebsocket()) {
            int i = catchingFishPayPalCardView.CatchingFishCoroutine;
            ArrayList arrayList = (ArrayList) this.CatchingFishViewModelScope.CatchingFishDaggerWebsocket;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                CatchingFishViewCustomView catchingFishViewCustomView = (CatchingFishViewCustomView) arrayList.get(i2);
                int i3 = catchingFishViewCustomView.CatchingFishParcelableFAB;
                if (i3 != 1) {
                    if (i3 == 2) {
                        int i4 = catchingFishViewCustomView.CatchingFishSnackbar;
                        if (i4 <= i) {
                            int i5 = catchingFishViewCustomView.CatchingFishCoroutine;
                            if (i4 + i5 <= i) {
                                i -= i5;
                            }
                        } else {
                            continue;
                        }
                    } else if (i3 == 8) {
                        int i6 = catchingFishViewCustomView.CatchingFishSnackbar;
                        if (i6 == i) {
                            i = catchingFishViewCustomView.CatchingFishCoroutine;
                        } else {
                            if (i6 < i) {
                                i--;
                            }
                            if (catchingFishViewCustomView.CatchingFishCoroutine <= i) {
                                i++;
                            }
                        }
                    }
                } else if (catchingFishViewCustomView.CatchingFishSnackbar <= i) {
                    i += catchingFishViewCustomView.CatchingFishCoroutine;
                }
            }
            return i;
        }
        return -1;
    }

    public final boolean CatchingFishNavigation(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().CatchingFishSnackbar(i, i2, i3, iArr, iArr2);
    }

    public final void CatchingFishNavigationGson(int i) {
        getScrollingChildHelper().CatchingFishViewModelScope(i);
    }

    public final void CatchingFishOkHttp() {
        if (!this.CatchingFishDaggerHiltFAB || this.CatchingFishMVPRobolectric) {
            int i = CatchingFishCoroutineMVP.CatchingFishParcelableFAB;
            Trace.beginSection("RV FullInvalidate");
            CatchingFishAnimationMockk();
            Trace.endSection();
            return;
        }
        CatchingFishSensorManager catchingFishSensorManager = this.CatchingFishViewModelScope;
        if (catchingFishSensorManager.CatchingFishViewModelScope()) {
            catchingFishSensorManager.getClass();
            if (catchingFishSensorManager.CatchingFishViewModelScope()) {
                int i2 = CatchingFishCoroutineMVP.CatchingFishParcelableFAB;
                Trace.beginSection("RV FullInvalidate");
                CatchingFishAnimationMockk();
                Trace.endSection();
            }
        }
    }

    public final void CatchingFishParcelable(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.CatchingFishPayPalLiveData) {
            int i = actionIndex == 0 ? 1 : 0;
            this.CatchingFishPayPalLiveData = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.CatchingFishParcelable = x;
            this.CatchingFishMotionLayout = x;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.CatchingFishRecyclerView = y;
            this.CatchingFishLayoutInflater = y;
        }
    }

    public final void CatchingFishParcelableFlux() {
        if (this.CatchingFishSensorManager != null) {
            return;
        }
        this.CatchingFishJobScheduler.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.CatchingFishSensorManager = edgeEffect;
        if (this.CatchingFishFragmentHandler) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0016, code lost:
    
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View CatchingFishPayPal(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = parent;
            parent = view.getParent();
        }
        return null;
    }

    public final void CatchingFishPayPalLiveData() {
        int CatchingFishHandler = this.CatchingFishViewModelFAB.CatchingFishHandler();
        for (int i = 0; i < CatchingFishHandler; i++) {
            ((CatchingFishGradleDagger) this.CatchingFishViewModelFAB.CatchingFishCameraXIntent(i).getLayoutParams()).CatchingFishCoroutine = true;
        }
        ArrayList arrayList = this.CatchingFishDaggerWebsocket.CatchingFishCoroutine;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            CatchingFishGradleDagger catchingFishGradleDagger = (CatchingFishGradleDagger) ((CatchingFishPayPalCardView) arrayList.get(i2)).CatchingFishParcelableFAB.getLayoutParams();
            if (catchingFishGradleDagger != null) {
                catchingFishGradleDagger.CatchingFishCoroutine = true;
            }
        }
    }

    public final CatchingFishPayPalCardView CatchingFishPayPalService(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return CatchingFishSensorManager(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    public final void CatchingFishRecyclerView() {
        if (this.CatchingFishFirebase || !this.CatchingFishJetpackCompose) {
            return;
        }
        WeakHashMap weakHashMap = CatchingFishFABCameraX.CatchingFishParcelableFAB;
        postOnAnimation(this.CatchingFishGraphQLGlide);
        this.CatchingFishFirebase = true;
    }

    public final void CatchingFishRoomDatabase() {
        CatchingFishMoshiDaggerHilt();
        CatchingFishMotionLayout();
        CatchingFishReduxGlide catchingFishReduxGlide = this.CatchingFishRedux;
        catchingFishReduxGlide.CatchingFishParcelableFAB(6);
        this.CatchingFishViewModelScope.CatchingFishSnackbar();
        catchingFishReduxGlide.CatchingFishDaggerWebsocket = this.CatchingFishUnitTesting.CatchingFishParcelableFAB();
        catchingFishReduxGlide.CatchingFishCoroutine = 0;
        if (this.CatchingFishWorkManager != null) {
            CatchingFishToolbarBundle catchingFishToolbarBundle = this.CatchingFishUnitTesting;
            int CatchingFishParcelableFlux = CatchingFishMVPLiveData.CatchingFishParcelableFlux(catchingFishToolbarBundle.CatchingFishCoroutine);
            if (CatchingFishParcelableFlux == 1 ? catchingFishToolbarBundle.CatchingFishParcelableFAB() > 0 : CatchingFishParcelableFlux != 2) {
                Parcelable parcelable = this.CatchingFishWorkManager.CatchingFishWorkManager;
                if (parcelable != null) {
                    this.CatchingFishAnimationMockk.CatchingFishCustomViewJUnit(parcelable);
                }
                this.CatchingFishWorkManager = null;
            }
        }
        catchingFishReduxGlide.CatchingFishViewModelScope = false;
        this.CatchingFishAnimationMockk.CatchingFishNavigationGson(this.CatchingFishDaggerWebsocket, catchingFishReduxGlide);
        catchingFishReduxGlide.CatchingFishWorkManager = false;
        catchingFishReduxGlide.CatchingFishFragmentHandler = catchingFishReduxGlide.CatchingFishFragmentHandler && this.CatchingFishCameraXIntent != null;
        catchingFishReduxGlide.CatchingFishReduxKtor = 4;
        CatchingFishLayoutInflater(true);
        CatchingFishAndroidX(false);
    }

    public final void CatchingFishSpannableWidget() {
        if (this.CatchingFishEspressoMockk != null) {
            return;
        }
        this.CatchingFishJobScheduler.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.CatchingFishEspressoMockk = edgeEffect;
        if (this.CatchingFishFragmentHandler) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void CatchingFishStateFlow() {
        VelocityTracker velocityTracker = this.CatchingFishGradleManifest;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean z = false;
        CatchingFishNavigationGson(0);
        EdgeEffect edgeEffect = this.CatchingFishPayPalService;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = this.CatchingFishPayPalService.isFinished();
        }
        EdgeEffect edgeEffect2 = this.CatchingFishSensorManager;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z |= this.CatchingFishSensorManager.isFinished();
        }
        EdgeEffect edgeEffect3 = this.CatchingFishEspressoMockk;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z |= this.CatchingFishEspressoMockk.isFinished();
        }
        EdgeEffect edgeEffect4 = this.CatchingFishDagger;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z |= this.CatchingFishDagger.isFinished();
        }
        if (z) {
            WeakHashMap weakHashMap = CatchingFishFABCameraX.CatchingFishParcelableFAB;
            postInvalidateOnAnimation();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:348:0x03fb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x03df A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0241 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void CatchingFishStateLiveData() {
        CatchingFishLayoutMVVMFlux catchingFishLayoutMVVMFlux;
        int CatchingFishMutableLiveData;
        View view;
        CatchingFishMoshiAndroidX catchingFishMoshiAndroidX;
        CatchingFishLayoutMVVMFlux catchingFishLayoutMVVMFlux2;
        View CatchingFishPayPal;
        boolean z;
        int i;
        boolean z2;
        char c;
        CatchingFishLayoutMVVMFlux catchingFishLayoutMVVMFlux3;
        CatchingFishViewPagerMockk catchingFishViewPagerMockk;
        boolean z3;
        boolean z4;
        CatchingFishViewCustomView CatchingFishLayout;
        int i2;
        int i3;
        CatchingFishViewCustomView catchingFishViewCustomView;
        CatchingFishReduxGlide catchingFishReduxGlide = this.CatchingFishRedux;
        catchingFishReduxGlide.CatchingFishParcelableFAB(1);
        CatchingFishCardViewRealm(catchingFishReduxGlide);
        catchingFishReduxGlide.CatchingFishLayout = false;
        CatchingFishMoshiDaggerHilt();
        CatchingFishViewModelIntent catchingFishViewModelIntent = this.CatchingFishLayout;
        CatchingFishGraphQLRealmFAB catchingFishGraphQLRealmFAB = (CatchingFishGraphQLRealmFAB) catchingFishViewModelIntent.CatchingFishDaggerWebsocket;
        CatchingFishGraphQLRealmFAB catchingFishGraphQLRealmFAB2 = (CatchingFishGraphQLRealmFAB) catchingFishViewModelIntent.CatchingFishDaggerWebsocket;
        catchingFishGraphQLRealmFAB.clear();
        CatchingFishLayoutMVVMFlux catchingFishLayoutMVVMFlux4 = (CatchingFishLayoutMVVMFlux) catchingFishViewModelIntent.CatchingFishWorkManager;
        catchingFishLayoutMVVMFlux4.CatchingFishParcelableFAB();
        CatchingFishMotionLayout();
        if (this.CatchingFishMVPRobolectric) {
            CatchingFishSensorManager catchingFishSensorManager = this.CatchingFishViewModelScope;
            catchingFishSensorManager.CatchingFishCloudMessaging((ArrayList) catchingFishSensorManager.CatchingFishDaggerWebsocket);
            catchingFishSensorManager.CatchingFishCloudMessaging((ArrayList) catchingFishSensorManager.CatchingFishWorkManager);
            if (this.CatchingFishCustomView) {
                this.CatchingFishAnimationMockk.CatchingFishMVVMAppCompat();
            }
        }
        if (this.CatchingFishCameraXIntent == null || !this.CatchingFishAnimationMockk.CatchingFishSharedFlow()) {
            catchingFishLayoutMVVMFlux = catchingFishLayoutMVVMFlux4;
            this.CatchingFishViewModelScope.CatchingFishSnackbar();
        } else {
            CatchingFishSensorManager catchingFishSensorManager2 = this.CatchingFishViewModelScope;
            CatchingFishBundleAsyncTask catchingFishBundleAsyncTask = (CatchingFishBundleAsyncTask) catchingFishSensorManager2.CatchingFishReduxKtor;
            CatchingFishKtorPayPal catchingFishKtorPayPal = (CatchingFishKtorPayPal) catchingFishSensorManager2.CatchingFishViewModelScope;
            CatchingFishViewPagerMockk catchingFishViewPagerMockk2 = (CatchingFishViewPagerMockk) catchingFishSensorManager2.CatchingFishViewModelFAB;
            ArrayList arrayList = (ArrayList) catchingFishSensorManager2.CatchingFishDaggerWebsocket;
            catchingFishViewPagerMockk2.getClass();
            while (true) {
                int size = arrayList.size() - 1;
                boolean z5 = false;
                while (true) {
                    i = 8;
                    if (size < 0) {
                        size = -1;
                        break;
                    }
                    if (((CatchingFishViewCustomView) arrayList.get(size)).CatchingFishParcelableFAB == 8) {
                        if (z5) {
                            break;
                        }
                    } else {
                        z5 = true;
                    }
                    size--;
                }
                if (size == -1) {
                    break;
                }
                int i4 = size + 1;
                CatchingFishSensorManager catchingFishSensorManager3 = (CatchingFishSensorManager) catchingFishViewPagerMockk2.CatchingFishDaggerWebsocket;
                CatchingFishViewCustomView catchingFishViewCustomView2 = (CatchingFishViewCustomView) arrayList.get(size);
                CatchingFishViewCustomView catchingFishViewCustomView3 = (CatchingFishViewCustomView) arrayList.get(i4);
                int i5 = catchingFishViewCustomView3.CatchingFishParcelableFAB;
                if (i5 != 1) {
                    CatchingFishViewCustomView catchingFishViewCustomView4 = null;
                    if (i5 == 2) {
                        catchingFishLayoutMVVMFlux3 = catchingFishLayoutMVVMFlux4;
                        catchingFishViewPagerMockk = catchingFishViewPagerMockk2;
                        int i6 = catchingFishViewCustomView2.CatchingFishSnackbar;
                        int i7 = catchingFishViewCustomView2.CatchingFishCoroutine;
                        if (i6 < i7) {
                            if (catchingFishViewCustomView3.CatchingFishSnackbar == i6 && catchingFishViewCustomView3.CatchingFishCoroutine == i7 - i6) {
                                z3 = false;
                                z4 = true;
                            } else {
                                z3 = false;
                                z4 = false;
                            }
                        } else if (catchingFishViewCustomView3.CatchingFishSnackbar == i7 + 1 && catchingFishViewCustomView3.CatchingFishCoroutine == i6 - i7) {
                            z3 = true;
                            z4 = true;
                        } else {
                            z3 = true;
                            z4 = false;
                        }
                        int i8 = catchingFishViewCustomView3.CatchingFishSnackbar;
                        if (i7 < i8) {
                            catchingFishViewCustomView3.CatchingFishSnackbar = i8 - 1;
                        } else {
                            int i9 = catchingFishViewCustomView3.CatchingFishCoroutine;
                            if (i7 < i8 + i9) {
                                catchingFishViewCustomView3.CatchingFishCoroutine = i9 - 1;
                                catchingFishViewCustomView2.CatchingFishParcelableFAB = 2;
                                catchingFishViewCustomView2.CatchingFishCoroutine = 1;
                                if (catchingFishViewCustomView3.CatchingFishCoroutine == 0) {
                                    arrayList.remove(i4);
                                    ((CatchingFishBundleAsyncTask) catchingFishSensorManager3.CatchingFishReduxKtor).CatchingFishCoroutine(catchingFishViewCustomView3);
                                }
                            }
                        }
                        int i10 = catchingFishViewCustomView2.CatchingFishSnackbar;
                        int i11 = catchingFishViewCustomView3.CatchingFishSnackbar;
                        if (i10 <= i11) {
                            catchingFishViewCustomView3.CatchingFishSnackbar = i11 + 1;
                        } else {
                            int i12 = i11 + catchingFishViewCustomView3.CatchingFishCoroutine;
                            if (i10 < i12) {
                                catchingFishViewCustomView4 = catchingFishSensorManager3.CatchingFishLayout(2, i10 + 1, i12 - i10);
                                catchingFishViewCustomView3.CatchingFishCoroutine = catchingFishViewCustomView2.CatchingFishSnackbar - catchingFishViewCustomView3.CatchingFishSnackbar;
                            }
                        }
                        CatchingFishViewCustomView catchingFishViewCustomView5 = catchingFishViewCustomView4;
                        if (z4) {
                            arrayList.set(size, catchingFishViewCustomView3);
                            arrayList.remove(i4);
                            ((CatchingFishBundleAsyncTask) catchingFishSensorManager3.CatchingFishReduxKtor).CatchingFishCoroutine(catchingFishViewCustomView2);
                        } else {
                            if (z3) {
                                if (catchingFishViewCustomView5 != null) {
                                    int i13 = catchingFishViewCustomView2.CatchingFishSnackbar;
                                    if (i13 > catchingFishViewCustomView5.CatchingFishSnackbar) {
                                        catchingFishViewCustomView2.CatchingFishSnackbar = i13 - catchingFishViewCustomView5.CatchingFishCoroutine;
                                    }
                                    int i14 = catchingFishViewCustomView2.CatchingFishCoroutine;
                                    if (i14 > catchingFishViewCustomView5.CatchingFishSnackbar) {
                                        catchingFishViewCustomView2.CatchingFishCoroutine = i14 - catchingFishViewCustomView5.CatchingFishCoroutine;
                                    }
                                }
                                int i15 = catchingFishViewCustomView2.CatchingFishSnackbar;
                                if (i15 > catchingFishViewCustomView3.CatchingFishSnackbar) {
                                    catchingFishViewCustomView2.CatchingFishSnackbar = i15 - catchingFishViewCustomView3.CatchingFishCoroutine;
                                }
                                int i16 = catchingFishViewCustomView2.CatchingFishCoroutine;
                                if (i16 > catchingFishViewCustomView3.CatchingFishSnackbar) {
                                    catchingFishViewCustomView2.CatchingFishCoroutine = i16 - catchingFishViewCustomView3.CatchingFishCoroutine;
                                }
                            } else {
                                if (catchingFishViewCustomView5 != null) {
                                    int i17 = catchingFishViewCustomView2.CatchingFishSnackbar;
                                    if (i17 >= catchingFishViewCustomView5.CatchingFishSnackbar) {
                                        catchingFishViewCustomView2.CatchingFishSnackbar = i17 - catchingFishViewCustomView5.CatchingFishCoroutine;
                                    }
                                    int i18 = catchingFishViewCustomView2.CatchingFishCoroutine;
                                    if (i18 >= catchingFishViewCustomView5.CatchingFishSnackbar) {
                                        catchingFishViewCustomView2.CatchingFishCoroutine = i18 - catchingFishViewCustomView5.CatchingFishCoroutine;
                                    }
                                }
                                int i19 = catchingFishViewCustomView2.CatchingFishSnackbar;
                                if (i19 >= catchingFishViewCustomView3.CatchingFishSnackbar) {
                                    catchingFishViewCustomView2.CatchingFishSnackbar = i19 - catchingFishViewCustomView3.CatchingFishCoroutine;
                                }
                                int i20 = catchingFishViewCustomView2.CatchingFishCoroutine;
                                if (i20 >= catchingFishViewCustomView3.CatchingFishSnackbar) {
                                    catchingFishViewCustomView2.CatchingFishCoroutine = i20 - catchingFishViewCustomView3.CatchingFishCoroutine;
                                }
                            }
                            arrayList.set(size, catchingFishViewCustomView3);
                            if (catchingFishViewCustomView2.CatchingFishSnackbar != catchingFishViewCustomView2.CatchingFishCoroutine) {
                                arrayList.set(i4, catchingFishViewCustomView2);
                            } else {
                                arrayList.remove(i4);
                            }
                            if (catchingFishViewCustomView5 != null) {
                                arrayList.add(size, catchingFishViewCustomView5);
                            }
                        }
                    } else if (i5 != 4) {
                        catchingFishLayoutMVVMFlux3 = catchingFishLayoutMVVMFlux4;
                        catchingFishViewPagerMockk = catchingFishViewPagerMockk2;
                    } else {
                        int i21 = catchingFishViewCustomView2.CatchingFishCoroutine;
                        int i22 = catchingFishViewCustomView3.CatchingFishSnackbar;
                        if (i21 < i22) {
                            catchingFishViewCustomView3.CatchingFishSnackbar = i22 - 1;
                            catchingFishViewPagerMockk = catchingFishViewPagerMockk2;
                        } else {
                            catchingFishViewPagerMockk = catchingFishViewPagerMockk2;
                            int i23 = catchingFishViewCustomView3.CatchingFishCoroutine;
                            if (i21 < i22 + i23) {
                                catchingFishViewCustomView3.CatchingFishCoroutine = i23 - 1;
                                CatchingFishLayout = catchingFishSensorManager3.CatchingFishLayout(4, catchingFishViewCustomView2.CatchingFishSnackbar, 1);
                                i2 = catchingFishViewCustomView2.CatchingFishSnackbar;
                                i3 = catchingFishViewCustomView3.CatchingFishSnackbar;
                                if (i2 > i3) {
                                    catchingFishViewCustomView3.CatchingFishSnackbar = i3 + 1;
                                } else {
                                    int i24 = i3 + catchingFishViewCustomView3.CatchingFishCoroutine;
                                    if (i2 < i24) {
                                        int i25 = i24 - i2;
                                        catchingFishLayoutMVVMFlux3 = catchingFishLayoutMVVMFlux4;
                                        catchingFishViewCustomView4 = catchingFishSensorManager3.CatchingFishLayout(4, i2 + 1, i25);
                                        catchingFishViewCustomView3.CatchingFishCoroutine -= i25;
                                        catchingFishViewCustomView = catchingFishViewCustomView4;
                                        arrayList.set(i4, catchingFishViewCustomView2);
                                        if (catchingFishViewCustomView3.CatchingFishCoroutine > 0) {
                                            arrayList.set(size, catchingFishViewCustomView3);
                                        } else {
                                            arrayList.remove(size);
                                            ((CatchingFishBundleAsyncTask) catchingFishSensorManager3.CatchingFishReduxKtor).CatchingFishCoroutine(catchingFishViewCustomView3);
                                        }
                                        if (CatchingFishLayout != null) {
                                            arrayList.add(size, CatchingFishLayout);
                                        }
                                        if (catchingFishViewCustomView != null) {
                                            arrayList.add(size, catchingFishViewCustomView);
                                        }
                                    }
                                }
                                catchingFishLayoutMVVMFlux3 = catchingFishLayoutMVVMFlux4;
                                catchingFishViewCustomView = catchingFishViewCustomView4;
                                arrayList.set(i4, catchingFishViewCustomView2);
                                if (catchingFishViewCustomView3.CatchingFishCoroutine > 0) {
                                }
                                if (CatchingFishLayout != null) {
                                }
                                if (catchingFishViewCustomView != null) {
                                }
                            }
                        }
                        CatchingFishLayout = null;
                        i2 = catchingFishViewCustomView2.CatchingFishSnackbar;
                        i3 = catchingFishViewCustomView3.CatchingFishSnackbar;
                        if (i2 > i3) {
                        }
                        catchingFishLayoutMVVMFlux3 = catchingFishLayoutMVVMFlux4;
                        catchingFishViewCustomView = catchingFishViewCustomView4;
                        arrayList.set(i4, catchingFishViewCustomView2);
                        if (catchingFishViewCustomView3.CatchingFishCoroutine > 0) {
                        }
                        if (CatchingFishLayout != null) {
                        }
                        if (catchingFishViewCustomView != null) {
                        }
                    }
                } else {
                    catchingFishLayoutMVVMFlux3 = catchingFishLayoutMVVMFlux4;
                    catchingFishViewPagerMockk = catchingFishViewPagerMockk2;
                    int i26 = catchingFishViewCustomView2.CatchingFishCoroutine;
                    int i27 = catchingFishViewCustomView3.CatchingFishSnackbar;
                    int i28 = i26 < i27 ? -1 : 0;
                    int i29 = catchingFishViewCustomView2.CatchingFishSnackbar;
                    if (i29 < i27) {
                        i28++;
                    }
                    if (i27 <= i29) {
                        catchingFishViewCustomView2.CatchingFishSnackbar = i29 + catchingFishViewCustomView3.CatchingFishCoroutine;
                    }
                    int i30 = catchingFishViewCustomView3.CatchingFishSnackbar;
                    if (i30 <= i26) {
                        catchingFishViewCustomView2.CatchingFishCoroutine = i26 + catchingFishViewCustomView3.CatchingFishCoroutine;
                    }
                    catchingFishViewCustomView3.CatchingFishSnackbar = i30 + i28;
                    arrayList.set(size, catchingFishViewCustomView3);
                    arrayList.set(i4, catchingFishViewCustomView2);
                }
                catchingFishViewPagerMockk2 = catchingFishViewPagerMockk;
                catchingFishLayoutMVVMFlux4 = catchingFishLayoutMVVMFlux3;
            }
            catchingFishLayoutMVVMFlux = catchingFishLayoutMVVMFlux4;
            int size2 = arrayList.size();
            int i31 = 0;
            while (i31 < size2) {
                CatchingFishViewCustomView catchingFishViewCustomView6 = (CatchingFishViewCustomView) arrayList.get(i31);
                int i32 = catchingFishViewCustomView6.CatchingFishParcelableFAB;
                if (i32 == 1) {
                    catchingFishSensorManager2.CatchingFishFragmentHandler(catchingFishViewCustomView6);
                } else if (i32 == 2) {
                    int i33 = catchingFishViewCustomView6.CatchingFishSnackbar;
                    int i34 = catchingFishViewCustomView6.CatchingFishCoroutine + i33;
                    int i35 = i33;
                    int i36 = 0;
                    char c2 = 65535;
                    while (i35 < i34) {
                        if (catchingFishKtorPayPal.CatchingFishSnackbar(i35) != null || catchingFishSensorManager2.CatchingFishParcelableFAB(i35)) {
                            if (c2 == 0) {
                                catchingFishSensorManager2.CatchingFishReduxKtor(catchingFishSensorManager2.CatchingFishLayout(2, i33, i36));
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            c = 1;
                        } else {
                            if (c2 == 1) {
                                catchingFishSensorManager2.CatchingFishFragmentHandler(catchingFishSensorManager2.CatchingFishLayout(2, i33, i36));
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            c = 0;
                        }
                        if (z2) {
                            i35 -= i36;
                            i34 -= i36;
                            i36 = 1;
                        } else {
                            i36++;
                        }
                        i35++;
                        c2 = c;
                    }
                    if (i36 != catchingFishViewCustomView6.CatchingFishCoroutine) {
                        catchingFishBundleAsyncTask.CatchingFishCoroutine(catchingFishViewCustomView6);
                        catchingFishViewCustomView6 = catchingFishSensorManager2.CatchingFishLayout(2, i33, i36);
                    }
                    if (c2 == 0) {
                        catchingFishSensorManager2.CatchingFishReduxKtor(catchingFishViewCustomView6);
                    } else {
                        catchingFishSensorManager2.CatchingFishFragmentHandler(catchingFishViewCustomView6);
                    }
                } else if (i32 == 4) {
                    int i37 = catchingFishViewCustomView6.CatchingFishSnackbar;
                    int i38 = catchingFishViewCustomView6.CatchingFishCoroutine + i37;
                    int i39 = i37;
                    int i40 = 0;
                    char c3 = 65535;
                    while (i37 < i38) {
                        if (catchingFishKtorPayPal.CatchingFishSnackbar(i37) != null || catchingFishSensorManager2.CatchingFishParcelableFAB(i37)) {
                            if (c3 == 0) {
                                catchingFishSensorManager2.CatchingFishReduxKtor(catchingFishSensorManager2.CatchingFishLayout(4, i39, i40));
                                i39 = i37;
                                i40 = 0;
                            }
                            c3 = 1;
                        } else {
                            if (c3 == 1) {
                                catchingFishSensorManager2.CatchingFishFragmentHandler(catchingFishSensorManager2.CatchingFishLayout(4, i39, i40));
                                i39 = i37;
                                i40 = 0;
                            }
                            c3 = 0;
                        }
                        i40++;
                        i37++;
                    }
                    if (i40 != catchingFishViewCustomView6.CatchingFishCoroutine) {
                        catchingFishBundleAsyncTask.CatchingFishCoroutine(catchingFishViewCustomView6);
                        catchingFishViewCustomView6 = catchingFishSensorManager2.CatchingFishLayout(4, i39, i40);
                    }
                    if (c3 == 0) {
                        catchingFishSensorManager2.CatchingFishReduxKtor(catchingFishViewCustomView6);
                    } else {
                        catchingFishSensorManager2.CatchingFishFragmentHandler(catchingFishViewCustomView6);
                    }
                } else if (i32 == i) {
                    catchingFishSensorManager2.CatchingFishFragmentHandler(catchingFishViewCustomView6);
                }
                i31++;
                i = 8;
            }
            arrayList.clear();
        }
        boolean z6 = this.CatchingFishMockkOkHttp || this.CatchingFishReduxMoshi;
        boolean z7 = this.CatchingFishDaggerHiltFAB && this.CatchingFishCameraXIntent != null && ((z = this.CatchingFishMVPRobolectric) || z6 || this.CatchingFishAnimationMockk.CatchingFishWorkManager) && (!z || this.CatchingFishUnitTesting.CatchingFishSnackbar);
        CatchingFishReduxGlide catchingFishReduxGlide2 = this.CatchingFishRedux;
        catchingFishReduxGlide2.CatchingFishFragmentHandler = z7;
        catchingFishReduxGlide2.CatchingFishCloudMessaging = z7 && z6 && !this.CatchingFishMVPRobolectric && this.CatchingFishCameraXIntent != null && this.CatchingFishAnimationMockk.CatchingFishSharedFlow();
        CatchingFishPayPalCardView catchingFishPayPalCardView = null;
        View focusedChild = (this.CatchingFishStripeAPI && hasFocus() && this.CatchingFishUnitTesting != null) ? getFocusedChild() : null;
        if (focusedChild != null && (CatchingFishPayPal = CatchingFishPayPal(focusedChild)) != null) {
            catchingFishPayPalCardView = CatchingFishPayPalService(CatchingFishPayPal);
        }
        if (catchingFishPayPalCardView == null) {
            catchingFishReduxGlide.CatchingFishOkHttp = -1L;
            catchingFishReduxGlide.CatchingFishEspressoTesting = -1;
            catchingFishReduxGlide.CatchingFishUnitTesting = -1;
        } else {
            catchingFishReduxGlide.CatchingFishOkHttp = this.CatchingFishUnitTesting.CatchingFishSnackbar ? catchingFishPayPalCardView.CatchingFishDaggerWebsocket : -1L;
            if (!this.CatchingFishMVPRobolectric) {
                if (catchingFishPayPalCardView.CatchingFishViewModelFAB()) {
                    CatchingFishMutableLiveData = catchingFishPayPalCardView.CatchingFishReduxKtor;
                } else {
                    RecyclerView recyclerView = catchingFishPayPalCardView.CatchingFishNavigation;
                    if (recyclerView != null) {
                        CatchingFishMutableLiveData = recyclerView.CatchingFishMutableLiveData(catchingFishPayPalCardView);
                    }
                }
                catchingFishReduxGlide.CatchingFishEspressoTesting = CatchingFishMutableLiveData;
                view = catchingFishPayPalCardView.CatchingFishParcelableFAB;
                int id = view.getId();
                while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
                    view = ((ViewGroup) view).getFocusedChild();
                    if (view.getId() == -1) {
                        id = view.getId();
                    }
                }
                catchingFishReduxGlide.CatchingFishUnitTesting = id;
            }
            CatchingFishMutableLiveData = -1;
            catchingFishReduxGlide.CatchingFishEspressoTesting = CatchingFishMutableLiveData;
            view = catchingFishPayPalCardView.CatchingFishParcelableFAB;
            int id2 = view.getId();
            while (!view.isFocused()) {
                view = ((ViewGroup) view).getFocusedChild();
                if (view.getId() == -1) {
                }
            }
            catchingFishReduxGlide.CatchingFishUnitTesting = id2;
        }
        catchingFishReduxGlide.CatchingFishViewModelFAB = catchingFishReduxGlide.CatchingFishFragmentHandler && this.CatchingFishReduxMoshi;
        this.CatchingFishReduxMoshi = false;
        this.CatchingFishMockkOkHttp = false;
        catchingFishReduxGlide.CatchingFishViewModelScope = catchingFishReduxGlide.CatchingFishCloudMessaging;
        catchingFishReduxGlide.CatchingFishDaggerWebsocket = this.CatchingFishUnitTesting.CatchingFishParcelableFAB();
        CatchingFishMVPRobolectric(this.CatchingFishGradleLiveData);
        if (catchingFishReduxGlide.CatchingFishFragmentHandler) {
            int CatchingFishCustomView = this.CatchingFishViewModelFAB.CatchingFishCustomView();
            int i41 = 0;
            while (i41 < CatchingFishCustomView) {
                CatchingFishPayPalCardView CatchingFishSensorManager = CatchingFishSensorManager(this.CatchingFishViewModelFAB.CatchingFishMVPRobolectric(i41));
                if (!CatchingFishSensorManager.CatchingFishAnimationMockk() && (!CatchingFishSensorManager.CatchingFishWorkManager() || this.CatchingFishUnitTesting.CatchingFishSnackbar)) {
                    CatchingFishFluxAppCompat catchingFishFluxAppCompat = this.CatchingFishCameraXIntent;
                    CatchingFishFluxAppCompat.CatchingFishSnackbar(CatchingFishSensorManager);
                    CatchingFishSensorManager.CatchingFishCoroutine();
                    catchingFishFluxAppCompat.getClass();
                    CatchingFishToastCoroutine catchingFishToastCoroutine = new CatchingFishToastCoroutine();
                    catchingFishToastCoroutine.CatchingFishParcelableFAB(CatchingFishSensorManager);
                    CatchingFishMoshiAndroidX catchingFishMoshiAndroidX2 = (CatchingFishMoshiAndroidX) catchingFishGraphQLRealmFAB2.get(CatchingFishSensorManager);
                    if (catchingFishMoshiAndroidX2 == null) {
                        catchingFishMoshiAndroidX2 = CatchingFishMoshiAndroidX.CatchingFishParcelableFAB();
                        catchingFishGraphQLRealmFAB2.put(CatchingFishSensorManager, catchingFishMoshiAndroidX2);
                    }
                    catchingFishMoshiAndroidX2.CatchingFishSnackbar = catchingFishToastCoroutine;
                    catchingFishMoshiAndroidX2.CatchingFishParcelableFAB |= 4;
                    if (catchingFishReduxGlide.CatchingFishViewModelFAB && CatchingFishSensorManager.CatchingFishCloudMessaging() && !CatchingFishSensorManager.CatchingFishViewModelFAB() && !CatchingFishSensorManager.CatchingFishAnimationMockk() && !CatchingFishSensorManager.CatchingFishWorkManager()) {
                        catchingFishLayoutMVVMFlux2 = catchingFishLayoutMVVMFlux;
                        catchingFishLayoutMVVMFlux2.CatchingFishDaggerWebsocket(CatchingFishJobScheduler(CatchingFishSensorManager), CatchingFishSensorManager);
                        i41++;
                        catchingFishLayoutMVVMFlux = catchingFishLayoutMVVMFlux2;
                    }
                }
                catchingFishLayoutMVVMFlux2 = catchingFishLayoutMVVMFlux;
                i41++;
                catchingFishLayoutMVVMFlux = catchingFishLayoutMVVMFlux2;
            }
        }
        if (catchingFishReduxGlide.CatchingFishCloudMessaging) {
            int CatchingFishHandler = this.CatchingFishViewModelFAB.CatchingFishHandler();
            for (int i42 = 0; i42 < CatchingFishHandler; i42++) {
                CatchingFishPayPalCardView CatchingFishSensorManager2 = CatchingFishSensorManager(this.CatchingFishViewModelFAB.CatchingFishCameraXIntent(i42));
                if (!CatchingFishSensorManager2.CatchingFishAnimationMockk() && CatchingFishSensorManager2.CatchingFishReduxKtor == -1) {
                    CatchingFishSensorManager2.CatchingFishReduxKtor = CatchingFishSensorManager2.CatchingFishCoroutine;
                }
            }
            boolean z8 = catchingFishReduxGlide.CatchingFishWorkManager;
            catchingFishReduxGlide.CatchingFishWorkManager = false;
            this.CatchingFishAnimationMockk.CatchingFishNavigationGson(this.CatchingFishDaggerWebsocket, catchingFishReduxGlide);
            catchingFishReduxGlide.CatchingFishWorkManager = z8;
            for (int i43 = 0; i43 < this.CatchingFishViewModelFAB.CatchingFishCustomView(); i43++) {
                CatchingFishPayPalCardView CatchingFishSensorManager3 = CatchingFishSensorManager(this.CatchingFishViewModelFAB.CatchingFishMVPRobolectric(i43));
                if (!CatchingFishSensorManager3.CatchingFishAnimationMockk() && ((catchingFishMoshiAndroidX = (CatchingFishMoshiAndroidX) catchingFishGraphQLRealmFAB2.get(CatchingFishSensorManager3)) == null || (catchingFishMoshiAndroidX.CatchingFishParcelableFAB & 4) == 0)) {
                    CatchingFishFluxAppCompat.CatchingFishSnackbar(CatchingFishSensorManager3);
                    boolean z9 = (CatchingFishSensorManager3.CatchingFishFragmentHandler & 8192) != 0;
                    CatchingFishFluxAppCompat catchingFishFluxAppCompat2 = this.CatchingFishCameraXIntent;
                    CatchingFishSensorManager3.CatchingFishCoroutine();
                    catchingFishFluxAppCompat2.getClass();
                    CatchingFishToastCoroutine catchingFishToastCoroutine2 = new CatchingFishToastCoroutine();
                    catchingFishToastCoroutine2.CatchingFishParcelableFAB(CatchingFishSensorManager3);
                    if (z9) {
                        CatchingFishAppCompat(CatchingFishSensorManager3, catchingFishToastCoroutine2);
                    } else {
                        CatchingFishMoshiAndroidX catchingFishMoshiAndroidX3 = (CatchingFishMoshiAndroidX) catchingFishGraphQLRealmFAB2.get(CatchingFishSensorManager3);
                        if (catchingFishMoshiAndroidX3 == null) {
                            catchingFishMoshiAndroidX3 = CatchingFishMoshiAndroidX.CatchingFishParcelableFAB();
                            catchingFishGraphQLRealmFAB2.put(CatchingFishSensorManager3, catchingFishMoshiAndroidX3);
                        }
                        catchingFishMoshiAndroidX3.CatchingFishParcelableFAB |= 2;
                        catchingFishMoshiAndroidX3.CatchingFishSnackbar = catchingFishToastCoroutine2;
                    }
                }
            }
            CatchingFishCloudMessaging();
        } else {
            CatchingFishCloudMessaging();
        }
        CatchingFishLayoutInflater(true);
        CatchingFishAndroidX(false);
        catchingFishReduxGlide.CatchingFishReduxKtor = 2;
    }

    public final void CatchingFishStripeAPI(int i, int i2, boolean z) {
        CatchingFishKtorDataStore catchingFishKtorDataStore = this.CatchingFishAnimationMockk;
        if (catchingFishKtorDataStore == null || this.CatchingFishGsonAppCompat) {
            return;
        }
        if (!catchingFishKtorDataStore.CatchingFishReduxKtor()) {
            i = 0;
        }
        if (!this.CatchingFishAnimationMockk.CatchingFishDaggerWebsocket()) {
            i2 = 0;
        }
        if (i == 0 && i2 == 0) {
            return;
        }
        if (z) {
            int i3 = i != 0 ? 1 : 0;
            if (i2 != 0) {
                i3 |= 2;
            }
            getScrollingChildHelper().CatchingFishWorkManager(i3, 1);
        }
        this.CatchingFishMoshiDaggerHilt.CatchingFishSnackbar(i, i2, Integer.MIN_VALUE, null);
    }

    public final void CatchingFishUnitTesting(int i, int i2) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap weakHashMap = CatchingFishFABCameraX.CatchingFishParcelableFAB;
        setMeasuredDimension(CatchingFishKtorDataStore.CatchingFishViewModelScope(i, paddingRight, getMinimumWidth()), CatchingFishKtorDataStore.CatchingFishViewModelScope(i2, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    public final void CatchingFishViewModelFAB(CatchingFishFABGoogleMaps catchingFishFABGoogleMaps) {
        if (this.CatchingFishDaggerMVVM == null) {
            this.CatchingFishDaggerMVVM = new ArrayList();
        }
        this.CatchingFishDaggerMVVM.add(catchingFishFABGoogleMaps);
    }

    public final void CatchingFishViewModelScope(CatchingFishViewHiltWidget catchingFishViewHiltWidget) {
        CatchingFishKtorDataStore catchingFishKtorDataStore = this.CatchingFishAnimationMockk;
        if (catchingFishKtorDataStore != null) {
            catchingFishKtorDataStore.CatchingFishCoroutine("Cannot add item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.CatchingFishRoomDatabase;
        if (arrayList.isEmpty()) {
            setWillNotDraw(false);
        }
        arrayList.add(catchingFishViewHiltWidget);
        CatchingFishPayPalLiveData();
        requestLayout();
    }

    public final void CatchingFishWorkManager(CatchingFishPayPalCardView catchingFishPayPalCardView) {
        View view = catchingFishPayPalCardView.CatchingFishParcelableFAB;
        boolean z = view.getParent() == this;
        this.CatchingFishDaggerWebsocket.CatchingFishCloudMessaging(CatchingFishPayPalService(view));
        if (catchingFishPayPalCardView.CatchingFishFragmentHandler()) {
            this.CatchingFishViewModelFAB.CatchingFishJetpackCompose(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!z) {
            this.CatchingFishViewModelFAB.CatchingFish(view, -1, true);
            return;
        }
        CatchingFishAsyncTaskDagger catchingFishAsyncTaskDagger = this.CatchingFishViewModelFAB;
        int indexOfChild = ((CatchingFishKtorPayPal) catchingFishAsyncTaskDagger.CatchingFishDaggerWebsocket).CatchingFishParcelableFAB.indexOfChild(view);
        if (indexOfChild >= 0) {
            ((CatchingFishGradleMockk) catchingFishAsyncTaskDagger.CatchingFishWorkManager).CatchingFishViewModelFAB(indexOfChild);
            catchingFishAsyncTaskDagger.CatchingFishMotionLayout(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        CatchingFishKtorDataStore catchingFishKtorDataStore = this.CatchingFishAnimationMockk;
        if (catchingFishKtorDataStore != null) {
            catchingFishKtorDataStore.getClass();
        }
        super.addFocusables(arrayList, i, i2);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof CatchingFishGradleDagger) && this.CatchingFishAnimationMockk.CatchingFishWorkManager((CatchingFishGradleDagger) layoutParams);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        CatchingFishKtorDataStore catchingFishKtorDataStore = this.CatchingFishAnimationMockk;
        if (catchingFishKtorDataStore != null && catchingFishKtorDataStore.CatchingFishReduxKtor()) {
            return this.CatchingFishAnimationMockk.CatchingFishFragmentHandler(this.CatchingFishRedux);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        CatchingFishKtorDataStore catchingFishKtorDataStore = this.CatchingFishAnimationMockk;
        if (catchingFishKtorDataStore != null && catchingFishKtorDataStore.CatchingFishReduxKtor()) {
            return this.CatchingFishAnimationMockk.CatchingFishCloudMessaging(this.CatchingFishRedux);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        CatchingFishKtorDataStore catchingFishKtorDataStore = this.CatchingFishAnimationMockk;
        if (catchingFishKtorDataStore != null && catchingFishKtorDataStore.CatchingFishReduxKtor()) {
            return this.CatchingFishAnimationMockk.CatchingFishEspressoTesting(this.CatchingFishRedux);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        CatchingFishKtorDataStore catchingFishKtorDataStore = this.CatchingFishAnimationMockk;
        if (catchingFishKtorDataStore != null && catchingFishKtorDataStore.CatchingFishDaggerWebsocket()) {
            return this.CatchingFishAnimationMockk.CatchingFishOkHttp(this.CatchingFishRedux);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        CatchingFishKtorDataStore catchingFishKtorDataStore = this.CatchingFishAnimationMockk;
        if (catchingFishKtorDataStore != null && catchingFishKtorDataStore.CatchingFishDaggerWebsocket()) {
            return this.CatchingFishAnimationMockk.CatchingFishUnitTesting(this.CatchingFishRedux);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        CatchingFishKtorDataStore catchingFishKtorDataStore = this.CatchingFishAnimationMockk;
        if (catchingFishKtorDataStore != null && catchingFishKtorDataStore.CatchingFishDaggerWebsocket()) {
            return this.CatchingFishAnimationMockk.CatchingFishAnimationMockk(this.CatchingFishRedux);
        }
        return 0;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        ViewParent CatchingFishReduxKtor;
        CatchingFishMockkWidget scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.CatchingFishReduxKtor && (CatchingFishReduxKtor = scrollingChildHelper.CatchingFishReduxKtor(0)) != null) {
            try {
                return CatchingFishReduxKtor.onNestedFling(scrollingChildHelper.CatchingFishCoroutine, f, f2, z);
            } catch (AbstractMethodError unused) {
                Objects.toString(CatchingFishReduxKtor);
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return getScrollingChildHelper().CatchingFishParcelableFAB(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().CatchingFishSnackbar(i, i2, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return getScrollingChildHelper().CatchingFishCoroutine(i, i2, i3, i4, iArr, 0, null);
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        boolean z;
        super.draw(canvas);
        ArrayList arrayList = this.CatchingFishRoomDatabase;
        int size = arrayList.size();
        boolean z2 = false;
        for (int i = 0; i < size; i++) {
            ((CatchingFishViewHiltWidget) arrayList.get(i)).CatchingFishSnackbar(canvas, this);
        }
        EdgeEffect edgeEffect = this.CatchingFishPayPalService;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.CatchingFishFragmentHandler ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.CatchingFishPayPalService;
            z = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.CatchingFishSensorManager;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.CatchingFishFragmentHandler) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.CatchingFishSensorManager;
            z |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.CatchingFishEspressoMockk;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.CatchingFishFragmentHandler ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.CatchingFishEspressoMockk;
            z |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.CatchingFishDagger;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.CatchingFishFragmentHandler) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.CatchingFishDagger;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z2 = true;
            }
            z |= z2;
            canvas.restoreToCount(save4);
        }
        if ((z || this.CatchingFishCameraXIntent == null || arrayList.size() <= 0 || !this.CatchingFishCameraXIntent.CatchingFishWorkManager()) ? z : true) {
            WeakHashMap weakHashMap = CatchingFishFABCameraX.CatchingFishParcelableFAB;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0186, code lost:
    
        if (r5 < 0) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x018e, code lost:
    
        if ((r5 * r6) <= 0) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0196, code lost:
    
        if ((r5 * r6) >= 0) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0160, code lost:
    
        if (r7 > 0) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0180, code lost:
    
        if (r5 > 0) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0183, code lost:
    
        if (r7 < 0) goto L136;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00cc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x019a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00db  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View focusSearch(View view, int i) {
        View view2;
        int i2;
        char c;
        boolean z;
        this.CatchingFishAnimationMockk.getClass();
        boolean z2 = true;
        boolean z3 = (this.CatchingFishUnitTesting == null || this.CatchingFishAnimationMockk == null || CatchingFishCameraXIntent() || this.CatchingFishGsonAppCompat) ? false : true;
        FocusFinder focusFinder = FocusFinder.getInstance();
        CatchingFishReduxGlide catchingFishReduxGlide = this.CatchingFishRedux;
        CatchingFishSnackbarCameraX catchingFishSnackbarCameraX = this.CatchingFishDaggerWebsocket;
        if (z3 && (i == 2 || i == 1)) {
            if (this.CatchingFishAnimationMockk.CatchingFishDaggerWebsocket()) {
                if (focusFinder.findNextFocus(this, view, i == 2 ? 130 : 33) == null) {
                    z = true;
                    if (!z && this.CatchingFishAnimationMockk.CatchingFishReduxKtor()) {
                        z = focusFinder.findNextFocus(this, view, !((this.CatchingFishAnimationMockk.CatchingFishMVPRobolectric() != 1) ^ (i != 2)) ? 66 : 17) != null;
                    }
                    if (z) {
                        CatchingFishOkHttp();
                        if (CatchingFishPayPal(view) != null) {
                            CatchingFishMoshiDaggerHilt();
                            this.CatchingFishAnimationMockk.CatchingFishAppCompat(view, i, catchingFishSnackbarCameraX, catchingFishReduxGlide);
                            CatchingFishAndroidX(false);
                        }
                        return null;
                    }
                    view2 = focusFinder.findNextFocus(this, view, i);
                    if (view2 == null) {
                    }
                    if (view2 != null) {
                        if (CatchingFishPayPal(view2) != null) {
                        }
                        if (z2) {
                        }
                    }
                    z2 = false;
                    if (z2) {
                    }
                }
            }
            z = false;
            if (!z) {
                if (focusFinder.findNextFocus(this, view, !((this.CatchingFishAnimationMockk.CatchingFishMVPRobolectric() != 1) ^ (i != 2)) ? 66 : 17) != null) {
                }
            }
            if (z) {
            }
            view2 = focusFinder.findNextFocus(this, view, i);
            if (view2 == null) {
            }
            if (view2 != null) {
            }
            z2 = false;
            if (z2) {
            }
        } else {
            View findNextFocus = focusFinder.findNextFocus(this, view, i);
            if (findNextFocus == null && z3) {
                CatchingFishOkHttp();
                if (CatchingFishPayPal(view) != null) {
                    CatchingFishMoshiDaggerHilt();
                    view2 = this.CatchingFishAnimationMockk.CatchingFishAppCompat(view, i, catchingFishSnackbarCameraX, catchingFishReduxGlide);
                    CatchingFishAndroidX(false);
                }
                return null;
            }
            view2 = findNextFocus;
            if (view2 == null && !view2.hasFocusable()) {
                if (getFocusedChild() == null) {
                    return super.focusSearch(view, i);
                }
                CatchingFishDataStoreIntent(view2, null);
                return view;
            }
            if (view2 != null && view2 != this && view2 != view) {
                if (CatchingFishPayPal(view2) != null) {
                    z2 = false;
                } else if (view != null && CatchingFishPayPal(view) != null) {
                    int width = view.getWidth();
                    int height = view.getHeight();
                    Rect rect = this.CatchingFishCloudMessaging;
                    rect.set(0, 0, width, height);
                    int width2 = view2.getWidth();
                    int height2 = view2.getHeight();
                    Rect rect2 = this.CatchingFishEspressoTesting;
                    rect2.set(0, 0, width2, height2);
                    offsetDescendantRectToMyCoords(view, rect);
                    offsetDescendantRectToMyCoords(view2, rect2);
                    int i3 = this.CatchingFishAnimationMockk.CatchingFishMVPRobolectric() == 1 ? -1 : 1;
                    int i4 = rect.left;
                    int i5 = rect2.left;
                    if ((i4 < i5 || rect.right <= i5) && rect.right < rect2.right) {
                        i2 = 1;
                    } else {
                        int i6 = rect.right;
                        int i7 = rect2.right;
                        i2 = ((i6 > i7 || i4 >= i7) && i4 > i5) ? -1 : 0;
                    }
                    int i8 = rect.top;
                    int i9 = rect2.top;
                    if ((i8 < i9 || rect.bottom <= i9) && rect.bottom < rect2.bottom) {
                        c = 1;
                    } else {
                        int i10 = rect.bottom;
                        int i11 = rect2.bottom;
                        c = ((i10 > i11 || i8 >= i11) && i8 > i9) ? (char) 65535 : (char) 0;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 17) {
                                if (i != 33) {
                                    if (i != 66) {
                                        if (i != 130) {
                                            throw new IllegalArgumentException("Invalid direction: " + i + CatchingFishGsonAppCompat());
                                        }
                                    }
                                }
                            }
                        } else if (c <= 0) {
                            if (c == 0) {
                            }
                        }
                    } else if (c >= 0) {
                        if (c == 0) {
                        }
                    }
                }
                return z2 ? view2 : super.focusSearch(view, i);
            }
            z2 = false;
            if (z2) {
            }
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        CatchingFishKtorDataStore catchingFishKtorDataStore = this.CatchingFishAnimationMockk;
        if (catchingFishKtorDataStore != null) {
            return catchingFishKtorDataStore.CatchingFishNavigation();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + CatchingFishGsonAppCompat());
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        CatchingFishKtorDataStore catchingFishKtorDataStore = this.CatchingFishAnimationMockk;
        if (catchingFishKtorDataStore != null) {
            return catchingFishKtorDataStore.CatchingFish(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + CatchingFishGsonAppCompat());
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public CatchingFishToolbarBundle getAdapter() {
        return this.CatchingFishUnitTesting;
    }

    @Override // android.view.View
    public int getBaseline() {
        CatchingFishKtorDataStore catchingFishKtorDataStore = this.CatchingFishAnimationMockk;
        if (catchingFishKtorDataStore == null) {
            return super.getBaseline();
        }
        catchingFishKtorDataStore.getClass();
        return -1;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        return super.getChildDrawingOrder(i, i2);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.CatchingFishFragmentHandler;
    }

    public CatchingFishFluxEspresso getCompatAccessibilityDelegate() {
        return this.CatchingFishRetrofitMVI;
    }

    public CatchingFishKtorAndroidX getEdgeEffectFactory() {
        return this.CatchingFishJobScheduler;
    }

    public CatchingFishFluxAppCompat getItemAnimator() {
        return this.CatchingFishCameraXIntent;
    }

    public int getItemDecorationCount() {
        return this.CatchingFishRoomDatabase.size();
    }

    public CatchingFishKtorDataStore getLayoutManager() {
        return this.CatchingFishAnimationMockk;
    }

    public int getMaxFlingVelocity() {
        return this.CatchingFishJUnitRealm;
    }

    public int getMinFlingVelocity() {
        return this.CatchingFishStateFlow;
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    public CatchingFishDaggerLiveData getOnFlingListener() {
        return this.CatchingFishDataStoreIntent;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.CatchingFishStripeAPI;
    }

    public CatchingFishSpannableMVP getRecycledViewPool() {
        return this.CatchingFishDaggerWebsocket.CatchingFishCoroutine();
    }

    public int getScrollState() {
        return this.CatchingFishHandler;
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().CatchingFishDaggerWebsocket(0);
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.CatchingFishJetpackCompose;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.CatchingFishGsonAppCompat;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().CatchingFishReduxKtor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x005a, code lost:
    
        if (r1 >= 30.0f) goto L20;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onAttachedToWindow() {
        float f;
        super.onAttachedToWindow();
        this.CatchingFishFragmentFactory = 0;
        this.CatchingFishJetpackCompose = true;
        this.CatchingFishDaggerHiltFAB = this.CatchingFishDaggerHiltFAB && !isLayoutRequested();
        CatchingFishKtorDataStore catchingFishKtorDataStore = this.CatchingFishAnimationMockk;
        if (catchingFishKtorDataStore != null) {
            catchingFishKtorDataStore.CatchingFishViewModelScope = true;
            catchingFishKtorDataStore.CatchingFishParcelable(this);
        }
        this.CatchingFishFirebase = false;
        ThreadLocal threadLocal = CatchingFishJUnitRoomRoom.CatchingFishViewModelFAB;
        CatchingFishJUnitRoomRoom catchingFishJUnitRoomRoom = (CatchingFishJUnitRoomRoom) threadLocal.get();
        this.CatchingFishAndroidX = catchingFishJUnitRoomRoom;
        if (catchingFishJUnitRoomRoom == null) {
            CatchingFishJUnitRoomRoom catchingFishJUnitRoomRoom2 = new CatchingFishJUnitRoomRoom();
            catchingFishJUnitRoomRoom2.CatchingFishReduxKtor = new ArrayList();
            catchingFishJUnitRoomRoom2.CatchingFishViewModelScope = new ArrayList();
            this.CatchingFishAndroidX = catchingFishJUnitRoomRoom2;
            WeakHashMap weakHashMap = CatchingFishFABCameraX.CatchingFishParcelableFAB;
            Display display = getDisplay();
            if (!isInEditMode() && display != null) {
                f = display.getRefreshRate();
            }
            f = 60.0f;
            CatchingFishJUnitRoomRoom catchingFishJUnitRoomRoom3 = this.CatchingFishAndroidX;
            catchingFishJUnitRoomRoom3.CatchingFishWorkManager = (long) (1.0E9f / f);
            threadLocal.set(catchingFishJUnitRoomRoom3);
        }
        this.CatchingFishAndroidX.CatchingFishReduxKtor.add(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        CatchingFishFABRobolectric catchingFishFABRobolectric;
        super.onDetachedFromWindow();
        CatchingFishFluxAppCompat catchingFishFluxAppCompat = this.CatchingFishCameraXIntent;
        if (catchingFishFluxAppCompat != null) {
            catchingFishFluxAppCompat.CatchingFishDaggerWebsocket();
        }
        setScrollState(0);
        CatchingFishDataStoreGradle catchingFishDataStoreGradle = this.CatchingFishMoshiDaggerHilt;
        catchingFishDataStoreGradle.CatchingFishFragmentHandler.removeCallbacks(catchingFishDataStoreGradle);
        catchingFishDataStoreGradle.CatchingFishWorkManager.abortAnimation();
        CatchingFishKtorDataStore catchingFishKtorDataStore = this.CatchingFishAnimationMockk;
        if (catchingFishKtorDataStore != null && (catchingFishFABRobolectric = catchingFishKtorDataStore.CatchingFishDaggerWebsocket) != null) {
            catchingFishFABRobolectric.CatchingFishLayout();
        }
        this.CatchingFishJetpackCompose = false;
        CatchingFishKtorDataStore catchingFishKtorDataStore2 = this.CatchingFishAnimationMockk;
        if (catchingFishKtorDataStore2 != null) {
            catchingFishKtorDataStore2.CatchingFishViewModelScope = false;
            catchingFishKtorDataStore2.CatchingFishRecyclerView(this);
        }
        this.CatchingFishFABLayout.clear();
        removeCallbacks(this.CatchingFishGraphQLGlide);
        this.CatchingFishLayout.getClass();
        while (CatchingFishMoshiAndroidX.CatchingFishReduxKtor.CatchingFishParcelableFAB() != null) {
        }
        CatchingFishJUnitRoomRoom catchingFishJUnitRoomRoom = this.CatchingFishAndroidX;
        if (catchingFishJUnitRoomRoom != null) {
            catchingFishJUnitRoomRoom.CatchingFishReduxKtor.remove(this);
            this.CatchingFishAndroidX = null;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.CatchingFishRoomDatabase;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((CatchingFishViewHiltWidget) arrayList.get(i)).CatchingFishParcelableFAB(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0097  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f;
        float f2;
        int i;
        int i2;
        CatchingFishKtorDataStore catchingFishKtorDataStore;
        boolean CatchingFishReduxKtor;
        boolean CatchingFishDaggerWebsocket;
        CatchingFishJUnitRoomRoom catchingFishJUnitRoomRoom;
        if (this.CatchingFishAnimationMockk != null && !this.CatchingFishGsonAppCompat && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f = this.CatchingFishAnimationMockk.CatchingFishDaggerWebsocket() ? -motionEvent.getAxisValue(9) : 0.0f;
                if (this.CatchingFishAnimationMockk.CatchingFishReduxKtor()) {
                    f2 = motionEvent.getAxisValue(10);
                    if (f == 0.0f || f2 != 0.0f) {
                        i = (int) (f2 * this.CatchingFishAnimation);
                        i2 = (int) (f * this.CatchingFishMVVMAppCompat);
                        catchingFishKtorDataStore = this.CatchingFishAnimationMockk;
                        if (catchingFishKtorDataStore != null && !this.CatchingFishGsonAppCompat) {
                            int[] iArr = this.CatchingFishGlideWidgetKtor;
                            iArr[0] = 0;
                            iArr[1] = 0;
                            CatchingFishReduxKtor = catchingFishKtorDataStore.CatchingFishReduxKtor();
                            CatchingFishDaggerWebsocket = this.CatchingFishAnimationMockk.CatchingFishDaggerWebsocket();
                            getScrollingChildHelper().CatchingFishWorkManager(!CatchingFishDaggerWebsocket ? (CatchingFishReduxKtor ? 1 : 0) | 2 : CatchingFishReduxKtor ? 1 : 0, 1);
                            if (CatchingFishNavigation(!CatchingFishReduxKtor ? i : 0, !CatchingFishDaggerWebsocket ? i2 : 0, 1, this.CatchingFishGlideWidgetKtor, this.CatchingFishView)) {
                                i -= iArr[0];
                                i2 -= iArr[1];
                            }
                            CatchingFishJUnitRealm(!CatchingFishReduxKtor ? i : 0, !CatchingFishDaggerWebsocket ? i2 : 0, motionEvent, 1);
                            catchingFishJUnitRoomRoom = this.CatchingFishAndroidX;
                            if (catchingFishJUnitRoomRoom != null && (i != 0 || i2 != 0)) {
                                catchingFishJUnitRoomRoom.CatchingFishParcelableFAB(this, i, i2);
                            }
                            CatchingFishNavigationGson(1);
                        }
                    }
                }
                f2 = 0.0f;
                if (f == 0.0f) {
                }
                i = (int) (f2 * this.CatchingFishAnimation);
                i2 = (int) (f * this.CatchingFishMVVMAppCompat);
                catchingFishKtorDataStore = this.CatchingFishAnimationMockk;
                if (catchingFishKtorDataStore != null) {
                    int[] iArr2 = this.CatchingFishGlideWidgetKtor;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    CatchingFishReduxKtor = catchingFishKtorDataStore.CatchingFishReduxKtor();
                    CatchingFishDaggerWebsocket = this.CatchingFishAnimationMockk.CatchingFishDaggerWebsocket();
                    getScrollingChildHelper().CatchingFishWorkManager(!CatchingFishDaggerWebsocket ? (CatchingFishReduxKtor ? 1 : 0) | 2 : CatchingFishReduxKtor ? 1 : 0, 1);
                    if (CatchingFishNavigation(!CatchingFishReduxKtor ? i : 0, !CatchingFishDaggerWebsocket ? i2 : 0, 1, this.CatchingFishGlideWidgetKtor, this.CatchingFishView)) {
                    }
                    CatchingFishJUnitRealm(!CatchingFishReduxKtor ? i : 0, !CatchingFishDaggerWebsocket ? i2 : 0, motionEvent, 1);
                    catchingFishJUnitRoomRoom = this.CatchingFishAndroidX;
                    if (catchingFishJUnitRoomRoom != null) {
                        catchingFishJUnitRoomRoom.CatchingFishParcelableFAB(this, i, i2);
                    }
                    CatchingFishNavigationGson(1);
                }
            } else {
                if ((motionEvent.getSource() & 4194304) != 0) {
                    float axisValue = motionEvent.getAxisValue(26);
                    if (this.CatchingFishAnimationMockk.CatchingFishDaggerWebsocket()) {
                        f = -axisValue;
                        f2 = 0.0f;
                        if (f == 0.0f) {
                        }
                        i = (int) (f2 * this.CatchingFishAnimation);
                        i2 = (int) (f * this.CatchingFishMVVMAppCompat);
                        catchingFishKtorDataStore = this.CatchingFishAnimationMockk;
                        if (catchingFishKtorDataStore != null) {
                        }
                    } else if (this.CatchingFishAnimationMockk.CatchingFishReduxKtor()) {
                        f2 = axisValue;
                        f = 0.0f;
                        if (f == 0.0f) {
                        }
                        i = (int) (f2 * this.CatchingFishAnimation);
                        i2 = (int) (f * this.CatchingFishMVVMAppCompat);
                        catchingFishKtorDataStore = this.CatchingFishAnimationMockk;
                        if (catchingFishKtorDataStore != null) {
                        }
                    }
                }
                f = 0.0f;
                f2 = 0.0f;
                if (f == 0.0f) {
                }
                i = (int) (f2 * this.CatchingFishAnimation);
                i2 = (int) (f * this.CatchingFishMVVMAppCompat);
                catchingFishKtorDataStore = this.CatchingFishAnimationMockk;
                if (catchingFishKtorDataStore != null) {
                }
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (!this.CatchingFishGsonAppCompat) {
            this.CatchingFish = null;
            if (CatchingFishCardViewView(motionEvent)) {
                CatchingFishStateFlow();
                setScrollState(0);
                return true;
            }
            CatchingFishKtorDataStore catchingFishKtorDataStore = this.CatchingFishAnimationMockk;
            if (catchingFishKtorDataStore != null) {
                boolean CatchingFishReduxKtor = catchingFishKtorDataStore.CatchingFishReduxKtor();
                boolean CatchingFishDaggerWebsocket = this.CatchingFishAnimationMockk.CatchingFishDaggerWebsocket();
                if (this.CatchingFishGradleManifest == null) {
                    this.CatchingFishGradleManifest = VelocityTracker.obtain();
                }
                this.CatchingFishGradleManifest.addMovement(motionEvent);
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                if (actionMasked == 0) {
                    if (this.CatchingFishCardViewRealm) {
                        this.CatchingFishCardViewRealm = false;
                    }
                    this.CatchingFishPayPalLiveData = motionEvent.getPointerId(0);
                    int x = (int) (motionEvent.getX() + 0.5f);
                    this.CatchingFishParcelable = x;
                    this.CatchingFishMotionLayout = x;
                    int y = (int) (motionEvent.getY() + 0.5f);
                    this.CatchingFishRecyclerView = y;
                    this.CatchingFishLayoutInflater = y;
                    if (this.CatchingFishHandler == 2) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                        setScrollState(1);
                        CatchingFishNavigationGson(1);
                    }
                    int[] iArr = this.CatchingFishServiceMVIJUnit;
                    iArr[1] = 0;
                    iArr[0] = 0;
                    int i = CatchingFishReduxKtor;
                    if (CatchingFishDaggerWebsocket) {
                        i = (CatchingFishReduxKtor ? 1 : 0) | 2;
                    }
                    getScrollingChildHelper().CatchingFishWorkManager(i, 0);
                } else if (actionMasked == 1) {
                    this.CatchingFishGradleManifest.clear();
                    CatchingFishNavigationGson(0);
                } else if (actionMasked == 2) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.CatchingFishPayPalLiveData);
                    if (findPointerIndex >= 0) {
                        int x2 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                        int y2 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                        if (this.CatchingFishHandler != 1) {
                            int i2 = x2 - this.CatchingFishMotionLayout;
                            int i3 = y2 - this.CatchingFishLayoutInflater;
                            if (CatchingFishReduxKtor == 0 || Math.abs(i2) <= this.CatchingFishAppCompat) {
                                z = false;
                            } else {
                                this.CatchingFishParcelable = x2;
                                z = true;
                            }
                            if (CatchingFishDaggerWebsocket && Math.abs(i3) > this.CatchingFishAppCompat) {
                                this.CatchingFishRecyclerView = y2;
                                z = true;
                            }
                            if (z) {
                                setScrollState(1);
                            }
                        }
                    }
                } else if (actionMasked == 3) {
                    CatchingFishStateFlow();
                    setScrollState(0);
                } else if (actionMasked == 5) {
                    this.CatchingFishPayPalLiveData = motionEvent.getPointerId(actionIndex);
                    int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                    this.CatchingFishParcelable = x3;
                    this.CatchingFishMotionLayout = x3;
                    int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                    this.CatchingFishRecyclerView = y3;
                    this.CatchingFishLayoutInflater = y3;
                } else if (actionMasked == 6) {
                    CatchingFishParcelable(motionEvent);
                }
                if (this.CatchingFishHandler == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = CatchingFishCoroutineMVP.CatchingFishParcelableFAB;
        Trace.beginSection("RV OnLayout");
        CatchingFishAnimationMockk();
        Trace.endSection();
        this.CatchingFishDaggerHiltFAB = true;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        CatchingFishKtorDataStore catchingFishKtorDataStore = this.CatchingFishAnimationMockk;
        if (catchingFishKtorDataStore == null) {
            CatchingFishUnitTesting(i, i2);
            return;
        }
        boolean CatchingFishCameraXIntent = catchingFishKtorDataStore.CatchingFishCameraXIntent();
        boolean z = false;
        CatchingFishReduxGlide catchingFishReduxGlide = this.CatchingFishRedux;
        if (!CatchingFishCameraXIntent) {
            if (this.CatchingFishCoroutineFlow) {
                this.CatchingFishAnimationMockk.CatchingFishSnackbar.CatchingFishUnitTesting(i, i2);
                return;
            }
            if (catchingFishReduxGlide.CatchingFishCloudMessaging) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            CatchingFishToolbarBundle catchingFishToolbarBundle = this.CatchingFishUnitTesting;
            if (catchingFishToolbarBundle != null) {
                catchingFishReduxGlide.CatchingFishDaggerWebsocket = catchingFishToolbarBundle.CatchingFishParcelableFAB();
            } else {
                catchingFishReduxGlide.CatchingFishDaggerWebsocket = 0;
            }
            CatchingFishMoshiDaggerHilt();
            this.CatchingFishAnimationMockk.CatchingFishSnackbar.CatchingFishUnitTesting(i, i2);
            CatchingFishAndroidX(false);
            catchingFishReduxGlide.CatchingFishViewModelScope = false;
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        this.CatchingFishAnimationMockk.CatchingFishSnackbar.CatchingFishUnitTesting(i, i2);
        if (mode == 1073741824 && mode2 == 1073741824) {
            z = true;
        }
        this.CatchingFishStateFlowIntent = z;
        if (z || this.CatchingFishUnitTesting == null) {
            return;
        }
        if (catchingFishReduxGlide.CatchingFishReduxKtor == 1) {
            CatchingFishStateLiveData();
        }
        this.CatchingFishAnimationMockk.CatchingFishGraphQLGlide(i, i2);
        catchingFishReduxGlide.CatchingFishLayout = true;
        CatchingFishRoomDatabase();
        this.CatchingFishAnimationMockk.CatchingFishWidget(i, i2);
        if (this.CatchingFishAnimationMockk.CatchingFishMVPReduxContext()) {
            this.CatchingFishAnimationMockk.CatchingFishGraphQLGlide(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
            catchingFishReduxGlide.CatchingFishLayout = true;
            CatchingFishRoomDatabase();
            this.CatchingFishAnimationMockk.CatchingFishWidget(i, i2);
        }
        this.CatchingFishWidget = getMeasuredWidth();
        this.CatchingFishKtorService = getMeasuredHeight();
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (CatchingFishCameraXIntent()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof CatchingFishRoomDataStore)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        CatchingFishRoomDataStore catchingFishRoomDataStore = (CatchingFishRoomDataStore) parcelable;
        this.CatchingFishWorkManager = catchingFishRoomDataStore;
        super.onRestoreInstanceState(catchingFishRoomDataStore.CatchingFishReduxKtor);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        CatchingFishRoomDataStore catchingFishRoomDataStore = new CatchingFishRoomDataStore(super.onSaveInstanceState());
        CatchingFishRoomDataStore catchingFishRoomDataStore2 = this.CatchingFishWorkManager;
        if (catchingFishRoomDataStore2 != null) {
            catchingFishRoomDataStore.CatchingFishWorkManager = catchingFishRoomDataStore2.CatchingFishWorkManager;
            return catchingFishRoomDataStore;
        }
        CatchingFishKtorDataStore catchingFishKtorDataStore = this.CatchingFishAnimationMockk;
        if (catchingFishKtorDataStore != null) {
            catchingFishRoomDataStore.CatchingFishWorkManager = catchingFishKtorDataStore.CatchingFishDaggerMVVM();
            return catchingFishRoomDataStore;
        }
        catchingFishRoomDataStore.CatchingFishWorkManager = null;
        return catchingFishRoomDataStore;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i == i3 && i2 == i4) {
            return;
        }
        this.CatchingFishDagger = null;
        this.CatchingFishSensorManager = null;
        this.CatchingFishEspressoMockk = null;
        this.CatchingFishPayPalService = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:190:0x03e8, code lost:
    
        if (r2 < r5) goto L192;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:134:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01f8  */
    /* JADX WARN: Type inference failed for: r9v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v26 */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        int i;
        int i2;
        int minFlingVelocity;
        boolean z2;
        CatchingFishDaggerGlide catchingFishDaggerGlide;
        float f;
        int CatchingFishPayPalService;
        PointF CatchingFishParcelableFAB;
        int i3;
        boolean z3;
        if (!this.CatchingFishGsonAppCompat && !this.CatchingFishCardViewRealm) {
            CatchingFishGsonNavigation catchingFishGsonNavigation = this.CatchingFish;
            if (catchingFishGsonNavigation == null) {
                z = motionEvent.getAction() == 0 ? false : CatchingFishCardViewView(motionEvent);
            } else {
                int i4 = catchingFishGsonNavigation.CatchingFishSnackbar;
                if (catchingFishGsonNavigation.CatchingFishDaggerHiltFAB != 0) {
                    if (motionEvent.getAction() == 0) {
                        boolean CatchingFishReduxKtor = catchingFishGsonNavigation.CatchingFishReduxKtor(motionEvent.getX(), motionEvent.getY());
                        boolean CatchingFishCoroutine = catchingFishGsonNavigation.CatchingFishCoroutine(motionEvent.getX(), motionEvent.getY());
                        if (CatchingFishReduxKtor || CatchingFishCoroutine) {
                            if (CatchingFishCoroutine) {
                                catchingFishGsonNavigation.CatchingFishSpannableWidget = 1;
                                catchingFishGsonNavigation.CatchingFishStateLiveData = (int) motionEvent.getX();
                            } else if (CatchingFishReduxKtor) {
                                catchingFishGsonNavigation.CatchingFishSpannableWidget = 2;
                                catchingFishGsonNavigation.CatchingFishOkHttp = (int) motionEvent.getY();
                            }
                            catchingFishGsonNavigation.CatchingFishWorkManager(2);
                        }
                    } else if (motionEvent.getAction() == 1 && catchingFishGsonNavigation.CatchingFishDaggerHiltFAB == 2) {
                        catchingFishGsonNavigation.CatchingFishOkHttp = 0.0f;
                        catchingFishGsonNavigation.CatchingFishStateLiveData = 0.0f;
                        catchingFishGsonNavigation.CatchingFishWorkManager(1);
                        catchingFishGsonNavigation.CatchingFishSpannableWidget = 0;
                    } else if (motionEvent.getAction() == 2 && catchingFishGsonNavigation.CatchingFishDaggerHiltFAB == 2) {
                        catchingFishGsonNavigation.CatchingFishViewModelScope();
                        if (catchingFishGsonNavigation.CatchingFishSpannableWidget == 1) {
                            float x = motionEvent.getX();
                            int[] iArr = catchingFishGsonNavigation.CatchingFishGsonAppCompat;
                            iArr[0] = i4;
                            int i5 = catchingFishGsonNavigation.CatchingFishRoomDatabase - i4;
                            iArr[1] = i5;
                            float max = Math.max(i4, Math.min(i5, x));
                            if (Math.abs(catchingFishGsonNavigation.CatchingFishAnimationMockk - max) >= 2.0f) {
                                int CatchingFishDaggerWebsocket = CatchingFishGsonNavigation.CatchingFishDaggerWebsocket(catchingFishGsonNavigation.CatchingFishStateLiveData, max, iArr, catchingFishGsonNavigation.CatchingFish.computeHorizontalScrollRange(), catchingFishGsonNavigation.CatchingFish.computeHorizontalScrollOffset(), catchingFishGsonNavigation.CatchingFishRoomDatabase);
                                if (CatchingFishDaggerWebsocket != 0) {
                                    catchingFishGsonNavigation.CatchingFish.scrollBy(CatchingFishDaggerWebsocket, 0);
                                }
                                catchingFishGsonNavigation.CatchingFishStateLiveData = max;
                            }
                        }
                        if (catchingFishGsonNavigation.CatchingFishSpannableWidget == 2) {
                            float y = motionEvent.getY();
                            int[] iArr2 = catchingFishGsonNavigation.CatchingFishParcelableFlux;
                            iArr2[0] = i4;
                            int i6 = catchingFishGsonNavigation.CatchingFishNavigation - i4;
                            iArr2[1] = i6;
                            float max2 = Math.max(i4, Math.min(i6, y));
                            if (Math.abs(catchingFishGsonNavigation.CatchingFishEspressoTesting - max2) >= 2.0f) {
                                int CatchingFishDaggerWebsocket2 = CatchingFishGsonNavigation.CatchingFishDaggerWebsocket(catchingFishGsonNavigation.CatchingFishOkHttp, max2, iArr2, catchingFishGsonNavigation.CatchingFish.computeVerticalScrollRange(), catchingFishGsonNavigation.CatchingFish.computeVerticalScrollOffset(), catchingFishGsonNavigation.CatchingFishNavigation);
                                if (CatchingFishDaggerWebsocket2 != 0) {
                                    catchingFishGsonNavigation.CatchingFish.scrollBy(0, CatchingFishDaggerWebsocket2);
                                }
                                catchingFishGsonNavigation.CatchingFishOkHttp = max2;
                            }
                        }
                    }
                }
                int action = motionEvent.getAction();
                if (action == 3 || action == 1) {
                    this.CatchingFish = null;
                }
                z = true;
            }
            if (z) {
                CatchingFishStateFlow();
                setScrollState(0);
                return true;
            }
            CatchingFishKtorDataStore catchingFishKtorDataStore = this.CatchingFishAnimationMockk;
            if (catchingFishKtorDataStore != null) {
                boolean CatchingFishReduxKtor2 = catchingFishKtorDataStore.CatchingFishReduxKtor();
                boolean CatchingFishDaggerWebsocket3 = this.CatchingFishAnimationMockk.CatchingFishDaggerWebsocket();
                if (this.CatchingFishGradleManifest == null) {
                    this.CatchingFishGradleManifest = VelocityTracker.obtain();
                }
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                int[] iArr3 = this.CatchingFishServiceMVIJUnit;
                if (actionMasked == 0) {
                    iArr3[1] = 0;
                    iArr3[0] = 0;
                }
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                obtain.offsetLocation(iArr3[0], iArr3[1]);
                if (actionMasked == 0) {
                    this.CatchingFishPayPalLiveData = motionEvent.getPointerId(0);
                    int x2 = (int) (motionEvent.getX() + 0.5f);
                    this.CatchingFishParcelable = x2;
                    this.CatchingFishMotionLayout = x2;
                    int y2 = (int) (motionEvent.getY() + 0.5f);
                    this.CatchingFishRecyclerView = y2;
                    this.CatchingFishLayoutInflater = y2;
                    int i7 = CatchingFishReduxKtor2;
                    if (CatchingFishDaggerWebsocket3) {
                        i7 = (CatchingFishReduxKtor2 ? 1 : 0) | 2;
                    }
                    getScrollingChildHelper().CatchingFishWorkManager(i7, 0);
                } else {
                    if (actionMasked == 1) {
                        this.CatchingFishGradleManifest.addMovement(obtain);
                        VelocityTracker velocityTracker = this.CatchingFishGradleManifest;
                        int i8 = this.CatchingFishJUnitRealm;
                        velocityTracker.computeCurrentVelocity(1000, i8);
                        float f2 = CatchingFishReduxKtor2 != 0 ? -this.CatchingFishGradleManifest.getXVelocity(this.CatchingFishPayPalLiveData) : 0.0f;
                        float f3 = CatchingFishDaggerWebsocket3 ? -this.CatchingFishGradleManifest.getYVelocity(this.CatchingFishPayPalLiveData) : 0.0f;
                        if (f2 == 0.0f && f3 == 0.0f) {
                            i = 0;
                        } else {
                            int i9 = (int) f2;
                            int i10 = (int) f3;
                            CatchingFishKtorDataStore catchingFishKtorDataStore2 = this.CatchingFishAnimationMockk;
                            if (catchingFishKtorDataStore2 != null && !this.CatchingFishGsonAppCompat) {
                                int CatchingFishReduxKtor3 = catchingFishKtorDataStore2.CatchingFishReduxKtor();
                                boolean CatchingFishDaggerWebsocket4 = this.CatchingFishAnimationMockk.CatchingFishDaggerWebsocket();
                                int i11 = this.CatchingFishStateFlow;
                                if (CatchingFishReduxKtor3 == 0 || Math.abs(i9) < i11) {
                                    i9 = 0;
                                }
                                if (!CatchingFishDaggerWebsocket4 || Math.abs(i10) < i11) {
                                    i10 = 0;
                                }
                                if (i9 != 0 || i10 != 0) {
                                    float f4 = i9;
                                    float f5 = i10;
                                    if (!dispatchNestedPreFling(f4, f5)) {
                                        boolean z4 = CatchingFishReduxKtor3 != 0 || CatchingFishDaggerWebsocket4;
                                        dispatchNestedFling(f4, f5, z4);
                                        CatchingFishDaggerLiveData catchingFishDaggerLiveData = this.CatchingFishDataStoreIntent;
                                        if (catchingFishDaggerLiveData != null) {
                                            CatchingFishCardViewGraphQL catchingFishCardViewGraphQL = (CatchingFishCardViewGraphQL) catchingFishDaggerLiveData;
                                            CatchingFishKtorDataStore layoutManager = catchingFishCardViewGraphQL.CatchingFishParcelableFAB.getLayoutManager();
                                            if (layoutManager != 0 && catchingFishCardViewGraphQL.CatchingFishParcelableFAB.getAdapter() != null && ((Math.abs(i10) > (minFlingVelocity = catchingFishCardViewGraphQL.CatchingFishParcelableFAB.getMinFlingVelocity()) || Math.abs(i9) > minFlingVelocity) && ((z2 = layoutManager instanceof CatchingFishWidgetMVIGradle)))) {
                                                if (z2) {
                                                    f = 0.0f;
                                                    catchingFishDaggerGlide = new CatchingFishDaggerGlide(catchingFishCardViewGraphQL, catchingFishCardViewGraphQL.CatchingFishParcelableFAB.getContext());
                                                } else {
                                                    f = 0.0f;
                                                    catchingFishDaggerGlide = null;
                                                }
                                                if (catchingFishDaggerGlide != null) {
                                                    int CatchingFishCardViewView = layoutManager.CatchingFishCardViewView();
                                                    if (CatchingFishCardViewView != 0) {
                                                        CatchingFishIntentJUnit CatchingFishDaggerWebsocket5 = layoutManager.CatchingFishDaggerWebsocket() ? catchingFishCardViewGraphQL.CatchingFishDaggerWebsocket(layoutManager) : layoutManager.CatchingFishReduxKtor() ? catchingFishCardViewGraphQL.CatchingFishReduxKtor(layoutManager) : null;
                                                        if (CatchingFishDaggerWebsocket5 != null) {
                                                            int CatchingFishDaggerHiltFAB = layoutManager.CatchingFishDaggerHiltFAB();
                                                            int i12 = Integer.MIN_VALUE;
                                                            int i13 = Integer.MAX_VALUE;
                                                            View view = null;
                                                            View view2 = null;
                                                            i2 = 1;
                                                            int i14 = 0;
                                                            while (i14 < CatchingFishDaggerHiltFAB) {
                                                                int i15 = CatchingFishDaggerHiltFAB;
                                                                View CatchingFishCoroutineFlow = layoutManager.CatchingFishCoroutineFlow(i14);
                                                                if (CatchingFishCoroutineFlow == null) {
                                                                    i3 = i14;
                                                                } else {
                                                                    i3 = i14;
                                                                    int CatchingFishSnackbar = CatchingFishCardViewGraphQL.CatchingFishSnackbar(CatchingFishCoroutineFlow, CatchingFishDaggerWebsocket5);
                                                                    if (CatchingFishSnackbar <= 0 && CatchingFishSnackbar > i12) {
                                                                        view2 = CatchingFishCoroutineFlow;
                                                                        i12 = CatchingFishSnackbar;
                                                                    }
                                                                    if (CatchingFishSnackbar >= 0 && CatchingFishSnackbar < i13) {
                                                                        view = CatchingFishCoroutineFlow;
                                                                        i13 = CatchingFishSnackbar;
                                                                    }
                                                                }
                                                                i14 = i3 + 1;
                                                                CatchingFishDaggerHiltFAB = i15;
                                                            }
                                                            boolean z5 = !layoutManager.CatchingFishReduxKtor() ? i10 <= 0 : i9 <= 0;
                                                            if (z5 && view != null) {
                                                                CatchingFishPayPalService = CatchingFishKtorDataStore.CatchingFishPayPalService(view);
                                                            } else if (z5 || view2 == null) {
                                                                if (z5) {
                                                                    view = view2;
                                                                }
                                                                if (view != null) {
                                                                    CatchingFishPayPalService = ((z2 && (CatchingFishParcelableFAB = ((CatchingFishWidgetMVIGradle) layoutManager).CatchingFishParcelableFAB(layoutManager.CatchingFishCardViewView() + (-1))) != null && ((CatchingFishParcelableFAB.x > f ? 1 : (CatchingFishParcelableFAB.x == f ? 0 : -1)) < 0 || (CatchingFishParcelableFAB.y > f ? 1 : (CatchingFishParcelableFAB.y == f ? 0 : -1)) < 0)) == z5 ? -1 : 1) + CatchingFishKtorDataStore.CatchingFishPayPalService(view);
                                                                    if (CatchingFishPayPalService >= 0) {
                                                                    }
                                                                }
                                                                CatchingFishPayPalService = -1;
                                                            } else {
                                                                CatchingFishPayPalService = CatchingFishKtorDataStore.CatchingFishPayPalService(view2);
                                                            }
                                                            if (CatchingFishPayPalService != -1) {
                                                                catchingFishDaggerGlide.CatchingFishParcelableFAB = CatchingFishPayPalService;
                                                                layoutManager.CatchingFishPayPalHandler(catchingFishDaggerGlide);
                                                                CatchingFishStateFlow();
                                                                obtain.recycle();
                                                                return true;
                                                            }
                                                            if (z4) {
                                                                if (CatchingFishDaggerWebsocket4) {
                                                                    CatchingFishReduxKtor3 = (CatchingFishReduxKtor3 == true ? 1 : 0) | 2;
                                                                }
                                                                getScrollingChildHelper().CatchingFishWorkManager(CatchingFishReduxKtor3, i2);
                                                                int i16 = -i8;
                                                                int max3 = Math.max(i16, Math.min(i9, i8));
                                                                int max4 = Math.max(i16, Math.min(i10, i8));
                                                                CatchingFishDataStoreGradle catchingFishDataStoreGradle = this.CatchingFishMoshiDaggerHilt;
                                                                RecyclerView recyclerView = catchingFishDataStoreGradle.CatchingFishFragmentHandler;
                                                                recyclerView.setScrollState(2);
                                                                catchingFishDataStoreGradle.CatchingFishDaggerWebsocket = 0;
                                                                catchingFishDataStoreGradle.CatchingFishReduxKtor = 0;
                                                                Interpolator interpolator = catchingFishDataStoreGradle.CatchingFishViewModelScope;
                                                                CatchingFishMVIEspresso catchingFishMVIEspresso = CatchingFishDynamicFeature;
                                                                if (interpolator != catchingFishMVIEspresso) {
                                                                    catchingFishDataStoreGradle.CatchingFishViewModelScope = catchingFishMVIEspresso;
                                                                    catchingFishDataStoreGradle.CatchingFishWorkManager = new OverScroller(recyclerView.getContext(), catchingFishMVIEspresso);
                                                                }
                                                                catchingFishDataStoreGradle.CatchingFishWorkManager.fling(0, 0, max3, max4, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
                                                                catchingFishDataStoreGradle.CatchingFishParcelableFAB();
                                                                CatchingFishStateFlow();
                                                                obtain.recycle();
                                                                return true;
                                                            }
                                                        }
                                                    }
                                                    i2 = 1;
                                                    CatchingFishPayPalService = -1;
                                                    if (CatchingFishPayPalService != -1) {
                                                    }
                                                    if (z4) {
                                                    }
                                                }
                                            }
                                        }
                                        i2 = 1;
                                        if (z4) {
                                        }
                                    }
                                }
                            }
                            i = 0;
                        }
                        setScrollState(i);
                        CatchingFishStateFlow();
                        obtain.recycle();
                        return true;
                    }
                    if (actionMasked == 2) {
                        int findPointerIndex = motionEvent.findPointerIndex(this.CatchingFishPayPalLiveData);
                        if (findPointerIndex >= 0) {
                            int x3 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                            int y3 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                            int i17 = this.CatchingFishParcelable - x3;
                            int i18 = this.CatchingFishRecyclerView - y3;
                            if (this.CatchingFishHandler != 1) {
                                if (CatchingFishReduxKtor2 != 0) {
                                    i17 = i17 > 0 ? Math.max(0, i17 - this.CatchingFishAppCompat) : Math.min(0, i17 + this.CatchingFishAppCompat);
                                    if (i17 != 0) {
                                        z3 = true;
                                        if (CatchingFishDaggerWebsocket3) {
                                            i18 = i18 > 0 ? Math.max(0, i18 - this.CatchingFishAppCompat) : Math.min(0, i18 + this.CatchingFishAppCompat);
                                            if (i18 != 0) {
                                                z3 = true;
                                            }
                                        }
                                        if (z3) {
                                            setScrollState(1);
                                        }
                                    }
                                }
                                z3 = false;
                                if (CatchingFishDaggerWebsocket3) {
                                }
                                if (z3) {
                                }
                            }
                            int i19 = i17;
                            int i20 = i18;
                            if (this.CatchingFishHandler == 1) {
                                int[] iArr4 = this.CatchingFishGlideWidgetKtor;
                                iArr4[0] = 0;
                                iArr4[1] = 0;
                                boolean CatchingFishNavigation = CatchingFishNavigation(CatchingFishReduxKtor2 != 0 ? i19 : 0, CatchingFishDaggerWebsocket3 ? i20 : 0, 0, iArr4, this.CatchingFishView);
                                int[] iArr5 = this.CatchingFishView;
                                if (CatchingFishNavigation) {
                                    i19 -= iArr4[0];
                                    i20 -= iArr4[1];
                                    iArr3[0] = iArr3[0] + iArr5[0];
                                    iArr3[1] = iArr3[1] + iArr5[1];
                                    getParent().requestDisallowInterceptTouchEvent(true);
                                }
                                int i21 = i20;
                                this.CatchingFishParcelable = x3 - iArr5[0];
                                this.CatchingFishRecyclerView = y3 - iArr5[1];
                                if (CatchingFishJUnitRealm(CatchingFishReduxKtor2 != 0 ? i19 : 0, CatchingFishDaggerWebsocket3 ? i21 : 0, motionEvent, 0)) {
                                    getParent().requestDisallowInterceptTouchEvent(true);
                                }
                                CatchingFishJUnitRoomRoom catchingFishJUnitRoomRoom = this.CatchingFishAndroidX;
                                if (catchingFishJUnitRoomRoom != null && (i19 != 0 || i21 != 0)) {
                                    catchingFishJUnitRoomRoom.CatchingFishParcelableFAB(this, i19, i21);
                                }
                            }
                        }
                    } else if (actionMasked == 3) {
                        CatchingFishStateFlow();
                        setScrollState(0);
                    } else if (actionMasked == 5) {
                        this.CatchingFishPayPalLiveData = motionEvent.getPointerId(actionIndex);
                        int x4 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                        this.CatchingFishParcelable = x4;
                        this.CatchingFishMotionLayout = x4;
                        int y4 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                        this.CatchingFishRecyclerView = y4;
                        this.CatchingFishLayoutInflater = y4;
                    } else if (actionMasked == 6) {
                        CatchingFishParcelable(motionEvent);
                    }
                }
                this.CatchingFishGradleManifest.addMovement(obtain);
                obtain.recycle();
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z) {
        CatchingFishPayPalCardView CatchingFishSensorManager = CatchingFishSensorManager(view);
        if (CatchingFishSensorManager != null) {
            if (CatchingFishSensorManager.CatchingFishFragmentHandler()) {
                CatchingFishSensorManager.CatchingFishFragmentHandler &= -257;
            } else if (!CatchingFishSensorManager.CatchingFishAnimationMockk()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + CatchingFishSensorManager + CatchingFishGsonAppCompat());
            }
        }
        view.clearAnimation();
        CatchingFishSensorManager(view);
        super.removeDetachedView(view, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        CatchingFishFABRobolectric catchingFishFABRobolectric = this.CatchingFishAnimationMockk.CatchingFishDaggerWebsocket;
        if ((catchingFishFABRobolectric == null || !catchingFishFABRobolectric.CatchingFishDaggerWebsocket) && !CatchingFishCameraXIntent() && view2 != null) {
            CatchingFishDataStoreIntent(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.CatchingFishAnimationMockk.CatchingFishGradleLiveData(this, view, rect, z, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        ArrayList arrayList = this.CatchingFishNavigation;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((CatchingFishGsonNavigation) arrayList.get(i)).getClass();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.CatchingFishSpannableWidget != 0 || this.CatchingFishGsonAppCompat) {
            this.CatchingFishParcelableFlux = true;
        } else {
            super.requestLayout();
        }
    }

    @Override // android.view.View
    public final void scrollBy(int i, int i2) {
        CatchingFishKtorDataStore catchingFishKtorDataStore = this.CatchingFishAnimationMockk;
        if (catchingFishKtorDataStore == null || this.CatchingFishGsonAppCompat) {
            return;
        }
        boolean CatchingFishReduxKtor = catchingFishKtorDataStore.CatchingFishReduxKtor();
        boolean CatchingFishDaggerWebsocket = this.CatchingFishAnimationMockk.CatchingFishDaggerWebsocket();
        if (CatchingFishReduxKtor || CatchingFishDaggerWebsocket) {
            if (!CatchingFishReduxKtor) {
                i = 0;
            }
            if (!CatchingFishDaggerWebsocket) {
                i2 = 0;
            }
            CatchingFishJUnitRealm(i, i2, null, 0);
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!CatchingFishCameraXIntent()) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        } else {
            int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
            this.CatchingFishPayPal |= contentChangeTypes != 0 ? contentChangeTypes : 0;
        }
    }

    public void setAccessibilityDelegateCompat(CatchingFishFluxEspresso catchingFishFluxEspresso) {
        this.CatchingFishRetrofitMVI = catchingFishFluxEspresso;
        CatchingFishFABCameraX.CatchingFishOkHttp(this, catchingFishFluxEspresso);
    }

    public void setAdapter(CatchingFishToolbarBundle catchingFishToolbarBundle) {
        setLayoutFrozen(false);
        CatchingFishToolbarBundle catchingFishToolbarBundle2 = this.CatchingFishUnitTesting;
        CatchingFishMoshiFluxMoshi catchingFishMoshiFluxMoshi = this.CatchingFishReduxKtor;
        if (catchingFishToolbarBundle2 != null) {
            catchingFishToolbarBundle2.CatchingFishParcelableFAB.unregisterObserver(catchingFishMoshiFluxMoshi);
            this.CatchingFishUnitTesting.getClass();
        }
        CatchingFishFluxAppCompat catchingFishFluxAppCompat = this.CatchingFishCameraXIntent;
        if (catchingFishFluxAppCompat != null) {
            catchingFishFluxAppCompat.CatchingFishDaggerWebsocket();
        }
        CatchingFishKtorDataStore catchingFishKtorDataStore = this.CatchingFishAnimationMockk;
        CatchingFishSnackbarCameraX catchingFishSnackbarCameraX = this.CatchingFishDaggerWebsocket;
        if (catchingFishKtorDataStore != null) {
            catchingFishKtorDataStore.CatchingFishReduxMoshi(catchingFishSnackbarCameraX);
            this.CatchingFishAnimationMockk.CatchingFishPicasso(catchingFishSnackbarCameraX);
        }
        catchingFishSnackbarCameraX.CatchingFishParcelableFAB.clear();
        catchingFishSnackbarCameraX.CatchingFishDaggerWebsocket();
        CatchingFishSensorManager catchingFishSensorManager = this.CatchingFishViewModelScope;
        catchingFishSensorManager.CatchingFishCloudMessaging((ArrayList) catchingFishSensorManager.CatchingFishDaggerWebsocket);
        catchingFishSensorManager.CatchingFishCloudMessaging((ArrayList) catchingFishSensorManager.CatchingFishWorkManager);
        CatchingFishToolbarBundle catchingFishToolbarBundle3 = this.CatchingFishUnitTesting;
        this.CatchingFishUnitTesting = catchingFishToolbarBundle;
        if (catchingFishToolbarBundle != null) {
            catchingFishToolbarBundle.CatchingFishParcelableFAB.registerObserver(catchingFishMoshiFluxMoshi);
        }
        CatchingFishKtorDataStore catchingFishKtorDataStore2 = this.CatchingFishAnimationMockk;
        if (catchingFishKtorDataStore2 != null) {
            catchingFishKtorDataStore2.CatchingFishLayoutInflater();
        }
        CatchingFishToolbarBundle catchingFishToolbarBundle4 = this.CatchingFishUnitTesting;
        catchingFishSnackbarCameraX.CatchingFishParcelableFAB.clear();
        catchingFishSnackbarCameraX.CatchingFishDaggerWebsocket();
        CatchingFishSpannableMVP CatchingFishCoroutine = catchingFishSnackbarCameraX.CatchingFishCoroutine();
        if (catchingFishToolbarBundle3 != null) {
            CatchingFishCoroutine.CatchingFishSnackbar--;
        }
        if (CatchingFishCoroutine.CatchingFishSnackbar == 0) {
            SparseArray sparseArray = CatchingFishCoroutine.CatchingFishParcelableFAB;
            for (int i = 0; i < sparseArray.size(); i++) {
                ((CatchingFishContextHandler) sparseArray.valueAt(i)).CatchingFishParcelableFAB.clear();
            }
        }
        if (catchingFishToolbarBundle4 != null) {
            CatchingFishCoroutine.CatchingFishSnackbar++;
        }
        this.CatchingFishRedux.CatchingFishWorkManager = true;
        this.CatchingFishCustomView |= false;
        this.CatchingFishMVPRobolectric = true;
        int CatchingFishHandler = this.CatchingFishViewModelFAB.CatchingFishHandler();
        for (int i2 = 0; i2 < CatchingFishHandler; i2++) {
            CatchingFishPayPalCardView CatchingFishSensorManager = CatchingFishSensorManager(this.CatchingFishViewModelFAB.CatchingFishCameraXIntent(i2));
            if (CatchingFishSensorManager != null && !CatchingFishSensorManager.CatchingFishAnimationMockk()) {
                CatchingFishSensorManager.CatchingFishParcelableFAB(6);
            }
        }
        CatchingFishPayPalLiveData();
        CatchingFishSnackbarCameraX catchingFishSnackbarCameraX2 = this.CatchingFishDaggerWebsocket;
        ArrayList arrayList = catchingFishSnackbarCameraX2.CatchingFishCoroutine;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            CatchingFishPayPalCardView catchingFishPayPalCardView = (CatchingFishPayPalCardView) arrayList.get(i3);
            if (catchingFishPayPalCardView != null) {
                catchingFishPayPalCardView.CatchingFishParcelableFAB(6);
                catchingFishPayPalCardView.CatchingFishParcelableFAB(1024);
            }
        }
        CatchingFishToolbarBundle catchingFishToolbarBundle5 = catchingFishSnackbarCameraX2.CatchingFishViewModelFAB.CatchingFishUnitTesting;
        if (catchingFishToolbarBundle5 == null || !catchingFishToolbarBundle5.CatchingFishSnackbar) {
            catchingFishSnackbarCameraX2.CatchingFishDaggerWebsocket();
        }
        requestLayout();
    }

    public void setChildDrawingOrderCallback(CatchingFishDaggerHiltFAB catchingFishDaggerHiltFAB) {
        if (catchingFishDaggerHiltFAB == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z) {
        if (z != this.CatchingFishFragmentHandler) {
            this.CatchingFishDagger = null;
            this.CatchingFishSensorManager = null;
            this.CatchingFishEspressoMockk = null;
            this.CatchingFishPayPalService = null;
        }
        this.CatchingFishFragmentHandler = z;
        super.setClipToPadding(z);
        if (this.CatchingFishDaggerHiltFAB) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(CatchingFishKtorAndroidX catchingFishKtorAndroidX) {
        catchingFishKtorAndroidX.getClass();
        this.CatchingFishJobScheduler = catchingFishKtorAndroidX;
        this.CatchingFishDagger = null;
        this.CatchingFishSensorManager = null;
        this.CatchingFishEspressoMockk = null;
        this.CatchingFishPayPalService = null;
    }

    public void setHasFixedSize(boolean z) {
        this.CatchingFishCoroutineFlow = z;
    }

    public void setItemAnimator(CatchingFishFluxAppCompat catchingFishFluxAppCompat) {
        CatchingFishFluxAppCompat catchingFishFluxAppCompat2 = this.CatchingFishCameraXIntent;
        if (catchingFishFluxAppCompat2 != null) {
            catchingFishFluxAppCompat2.CatchingFishDaggerWebsocket();
            this.CatchingFishCameraXIntent.CatchingFishParcelableFAB = null;
        }
        this.CatchingFishCameraXIntent = catchingFishFluxAppCompat;
        if (catchingFishFluxAppCompat != null) {
            catchingFishFluxAppCompat.CatchingFishParcelableFAB = this.CatchingFishPicasso;
        }
    }

    public void setItemViewCacheSize(int i) {
        CatchingFishSnackbarCameraX catchingFishSnackbarCameraX = this.CatchingFishDaggerWebsocket;
        catchingFishSnackbarCameraX.CatchingFishDaggerWebsocket = i;
        catchingFishSnackbarCameraX.CatchingFishEspressoTesting();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z) {
        suppressLayout(z);
    }

    public void setLayoutManager(CatchingFishKtorDataStore catchingFishKtorDataStore) {
        CatchingFishFABRobolectric catchingFishFABRobolectric;
        if (catchingFishKtorDataStore == this.CatchingFishAnimationMockk) {
            return;
        }
        setScrollState(0);
        CatchingFishDataStoreGradle catchingFishDataStoreGradle = this.CatchingFishMoshiDaggerHilt;
        catchingFishDataStoreGradle.CatchingFishFragmentHandler.removeCallbacks(catchingFishDataStoreGradle);
        catchingFishDataStoreGradle.CatchingFishWorkManager.abortAnimation();
        CatchingFishKtorDataStore catchingFishKtorDataStore2 = this.CatchingFishAnimationMockk;
        if (catchingFishKtorDataStore2 != null && (catchingFishFABRobolectric = catchingFishKtorDataStore2.CatchingFishDaggerWebsocket) != null) {
            catchingFishFABRobolectric.CatchingFishLayout();
        }
        CatchingFishKtorDataStore catchingFishKtorDataStore3 = this.CatchingFishAnimationMockk;
        CatchingFishSnackbarCameraX catchingFishSnackbarCameraX = this.CatchingFishDaggerWebsocket;
        if (catchingFishKtorDataStore3 != null) {
            CatchingFishFluxAppCompat catchingFishFluxAppCompat = this.CatchingFishCameraXIntent;
            if (catchingFishFluxAppCompat != null) {
                catchingFishFluxAppCompat.CatchingFishDaggerWebsocket();
            }
            this.CatchingFishAnimationMockk.CatchingFishReduxMoshi(catchingFishSnackbarCameraX);
            this.CatchingFishAnimationMockk.CatchingFishPicasso(catchingFishSnackbarCameraX);
            catchingFishSnackbarCameraX.CatchingFishParcelableFAB.clear();
            catchingFishSnackbarCameraX.CatchingFishDaggerWebsocket();
            if (this.CatchingFishJetpackCompose) {
                CatchingFishKtorDataStore catchingFishKtorDataStore4 = this.CatchingFishAnimationMockk;
                catchingFishKtorDataStore4.CatchingFishViewModelScope = false;
                catchingFishKtorDataStore4.CatchingFishRecyclerView(this);
            }
            this.CatchingFishAnimationMockk.CatchingFishKtorService(null);
            this.CatchingFishAnimationMockk = null;
        } else {
            catchingFishSnackbarCameraX.CatchingFishParcelableFAB.clear();
            catchingFishSnackbarCameraX.CatchingFishDaggerWebsocket();
        }
        CatchingFishAsyncTaskDagger catchingFishAsyncTaskDagger = this.CatchingFishViewModelFAB;
        RecyclerView recyclerView = ((CatchingFishKtorPayPal) catchingFishAsyncTaskDagger.CatchingFishDaggerWebsocket).CatchingFishParcelableFAB;
        ((CatchingFishGradleMockk) catchingFishAsyncTaskDagger.CatchingFishWorkManager).CatchingFishViewModelScope();
        ArrayList arrayList = (ArrayList) catchingFishAsyncTaskDagger.CatchingFishViewModelScope;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            CatchingFishPayPalCardView CatchingFishSensorManager = CatchingFishSensorManager((View) arrayList.get(size));
            if (CatchingFishSensorManager != null) {
                int i = CatchingFishSensorManager.CatchingFishStateLiveData;
                if (recyclerView.CatchingFishCameraXIntent()) {
                    CatchingFishSensorManager.CatchingFishRoomDatabase = i;
                    recyclerView.CatchingFishFABLayout.add(CatchingFishSensorManager);
                } else {
                    View view = CatchingFishSensorManager.CatchingFishParcelableFAB;
                    WeakHashMap weakHashMap = CatchingFishFABCameraX.CatchingFishParcelableFAB;
                    view.setImportantForAccessibility(i);
                }
                CatchingFishSensorManager.CatchingFishStateLiveData = 0;
            }
            arrayList.remove(size);
        }
        int childCount = recyclerView.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = recyclerView.getChildAt(i2);
            CatchingFishSensorManager(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeAllViews();
        this.CatchingFishAnimationMockk = catchingFishKtorDataStore;
        if (catchingFishKtorDataStore != null) {
            if (catchingFishKtorDataStore.CatchingFishSnackbar != null) {
                throw new IllegalArgumentException("LayoutManager " + catchingFishKtorDataStore + " is already attached to a RecyclerView:" + catchingFishKtorDataStore.CatchingFishSnackbar.CatchingFishGsonAppCompat());
            }
            catchingFishKtorDataStore.CatchingFishKtorService(this);
            if (this.CatchingFishJetpackCompose) {
                CatchingFishKtorDataStore catchingFishKtorDataStore5 = this.CatchingFishAnimationMockk;
                catchingFishKtorDataStore5.CatchingFishViewModelScope = true;
                catchingFishKtorDataStore5.CatchingFishParcelable(this);
            }
        }
        catchingFishSnackbarCameraX.CatchingFishEspressoTesting();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        CatchingFishMockkWidget scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.CatchingFishReduxKtor) {
            ViewGroup viewGroup = scrollingChildHelper.CatchingFishCoroutine;
            WeakHashMap weakHashMap = CatchingFishFABCameraX.CatchingFishParcelableFAB;
            viewGroup.stopNestedScroll();
        }
        scrollingChildHelper.CatchingFishReduxKtor = z;
    }

    public void setOnFlingListener(CatchingFishDaggerLiveData catchingFishDaggerLiveData) {
        this.CatchingFishDataStoreIntent = catchingFishDaggerLiveData;
    }

    @Deprecated
    public void setOnScrollListener(CatchingFishFABGoogleMaps catchingFishFABGoogleMaps) {
        this.CatchingFishCustomViewJUnit = catchingFishFABGoogleMaps;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.CatchingFishStripeAPI = z;
    }

    public void setRecycledViewPool(CatchingFishSpannableMVP catchingFishSpannableMVP) {
        CatchingFishSnackbarCameraX catchingFishSnackbarCameraX = this.CatchingFishDaggerWebsocket;
        if (catchingFishSnackbarCameraX.CatchingFishViewModelScope != null) {
            r1.CatchingFishSnackbar--;
        }
        catchingFishSnackbarCameraX.CatchingFishViewModelScope = catchingFishSpannableMVP;
        if (catchingFishSpannableMVP == null || catchingFishSnackbarCameraX.CatchingFishViewModelFAB.getAdapter() == null) {
            return;
        }
        catchingFishSnackbarCameraX.CatchingFishViewModelScope.CatchingFishSnackbar++;
    }

    public void setScrollState(int i) {
        CatchingFishFABRobolectric catchingFishFABRobolectric;
        if (i == this.CatchingFishHandler) {
            return;
        }
        this.CatchingFishHandler = i;
        if (i != 2) {
            CatchingFishDataStoreGradle catchingFishDataStoreGradle = this.CatchingFishMoshiDaggerHilt;
            catchingFishDataStoreGradle.CatchingFishFragmentHandler.removeCallbacks(catchingFishDataStoreGradle);
            catchingFishDataStoreGradle.CatchingFishWorkManager.abortAnimation();
            CatchingFishKtorDataStore catchingFishKtorDataStore = this.CatchingFishAnimationMockk;
            if (catchingFishKtorDataStore != null && (catchingFishFABRobolectric = catchingFishKtorDataStore.CatchingFishDaggerWebsocket) != null) {
                catchingFishFABRobolectric.CatchingFishLayout();
            }
        }
        CatchingFishKtorDataStore catchingFishKtorDataStore2 = this.CatchingFishAnimationMockk;
        if (catchingFishKtorDataStore2 != null) {
            catchingFishKtorDataStore2.CatchingFishMockkOkHttp(i);
        }
        CatchingFishFABGoogleMaps catchingFishFABGoogleMaps = this.CatchingFishCustomViewJUnit;
        if (catchingFishFABGoogleMaps != null) {
            catchingFishFABGoogleMaps.CatchingFishParcelableFAB(i);
        }
        ArrayList arrayList = this.CatchingFishDaggerMVVM;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((CatchingFishFABGoogleMaps) this.CatchingFishDaggerMVVM.get(size)).CatchingFishParcelableFAB(i);
            }
        }
    }

    public void setScrollingTouchSlop(int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i != 1) {
            this.CatchingFishAppCompat = viewConfiguration.getScaledTouchSlop();
        } else {
            this.CatchingFishAppCompat = viewConfiguration.getScaledPagingTouchSlop();
        }
    }

    public void setViewCacheExtension(CatchingFishAdMobGraphQL catchingFishAdMobGraphQL) {
        this.CatchingFishDaggerWebsocket.getClass();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return getScrollingChildHelper().CatchingFishWorkManager(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        getScrollingChildHelper().CatchingFishViewModelScope(0);
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z) {
        CatchingFishFABRobolectric catchingFishFABRobolectric;
        if (z != this.CatchingFishGsonAppCompat) {
            CatchingFishLayout("Do not suppressLayout in layout or scroll");
            if (!z) {
                this.CatchingFishGsonAppCompat = false;
                if (this.CatchingFishParcelableFlux && this.CatchingFishAnimationMockk != null && this.CatchingFishUnitTesting != null) {
                    requestLayout();
                }
                this.CatchingFishParcelableFlux = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.CatchingFishGsonAppCompat = true;
            this.CatchingFishCardViewRealm = true;
            setScrollState(0);
            CatchingFishDataStoreGradle catchingFishDataStoreGradle = this.CatchingFishMoshiDaggerHilt;
            catchingFishDataStoreGradle.CatchingFishFragmentHandler.removeCallbacks(catchingFishDataStoreGradle);
            catchingFishDataStoreGradle.CatchingFishWorkManager.abortAnimation();
            CatchingFishKtorDataStore catchingFishKtorDataStore = this.CatchingFishAnimationMockk;
            if (catchingFishKtorDataStore == null || (catchingFishFABRobolectric = catchingFishKtorDataStore.CatchingFishDaggerWebsocket) == null) {
                return;
            }
            catchingFishFABRobolectric.CatchingFishLayout();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r19v0 */
    /* JADX WARN: Type inference failed for: r19v1 */
    /* JADX WARN: Type inference failed for: r19v2 */
    public RecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        float CatchingFishParcelableFAB;
        char c;
        int i2;
        boolean z;
        char c2;
        int i3;
        TypedArray typedArray;
        Constructor constructor;
        Object[] objArr;
        this.CatchingFishReduxKtor = new CatchingFishMoshiFluxMoshi(this);
        this.CatchingFishDaggerWebsocket = new CatchingFishSnackbarCameraX(this);
        this.CatchingFishLayout = new CatchingFishViewModelIntent(21);
        this.CatchingFishCloudMessaging = new Rect();
        this.CatchingFishEspressoTesting = new Rect();
        this.CatchingFishOkHttp = new RectF();
        this.CatchingFishStateLiveData = new ArrayList();
        this.CatchingFishRoomDatabase = new ArrayList();
        this.CatchingFishNavigation = new ArrayList();
        this.CatchingFishSpannableWidget = 0;
        this.CatchingFishMVPRobolectric = false;
        this.CatchingFishCustomView = false;
        this.CatchingFishFragmentFactory = 0;
        this.CatchingFishMutableLiveData = 0;
        this.CatchingFishJobScheduler = new CatchingFishKtorAndroidX();
        CatchingFishGsonUnitTesting catchingFishGsonUnitTesting = new CatchingFishGsonUnitTesting();
        catchingFishGsonUnitTesting.CatchingFishParcelableFAB = null;
        catchingFishGsonUnitTesting.CatchingFishSnackbar = new ArrayList();
        catchingFishGsonUnitTesting.CatchingFishCoroutine = 120L;
        catchingFishGsonUnitTesting.CatchingFishReduxKtor = 120L;
        catchingFishGsonUnitTesting.CatchingFishDaggerWebsocket = 250L;
        catchingFishGsonUnitTesting.CatchingFishWorkManager = 250L;
        catchingFishGsonUnitTesting.CatchingFishViewModelScope = true;
        catchingFishGsonUnitTesting.CatchingFishViewModelFAB = new ArrayList();
        catchingFishGsonUnitTesting.CatchingFishLayout = new ArrayList();
        catchingFishGsonUnitTesting.CatchingFishFragmentHandler = new ArrayList();
        catchingFishGsonUnitTesting.CatchingFishCloudMessaging = new ArrayList();
        catchingFishGsonUnitTesting.CatchingFishEspressoTesting = new ArrayList();
        catchingFishGsonUnitTesting.CatchingFishOkHttp = new ArrayList();
        catchingFishGsonUnitTesting.CatchingFishUnitTesting = new ArrayList();
        catchingFishGsonUnitTesting.CatchingFishAnimationMockk = new ArrayList();
        catchingFishGsonUnitTesting.CatchingFishStateLiveData = new ArrayList();
        catchingFishGsonUnitTesting.CatchingFishRoomDatabase = new ArrayList();
        catchingFishGsonUnitTesting.CatchingFishNavigation = new ArrayList();
        this.CatchingFishCameraXIntent = catchingFishGsonUnitTesting;
        this.CatchingFishHandler = 0;
        this.CatchingFishPayPalLiveData = -1;
        this.CatchingFishAnimation = Float.MIN_VALUE;
        this.CatchingFishMVVMAppCompat = Float.MIN_VALUE;
        this.CatchingFishStripeAPI = true;
        this.CatchingFishMoshiDaggerHilt = new CatchingFishDataStoreGradle(this);
        this.CatchingFishNavigationGson = new CatchingFishWidgetFAB();
        CatchingFishReduxGlide catchingFishReduxGlide = new CatchingFishReduxGlide();
        catchingFishReduxGlide.CatchingFishParcelableFAB = -1;
        catchingFishReduxGlide.CatchingFishSnackbar = 0;
        catchingFishReduxGlide.CatchingFishCoroutine = 0;
        catchingFishReduxGlide.CatchingFishReduxKtor = 1;
        catchingFishReduxGlide.CatchingFishDaggerWebsocket = 0;
        catchingFishReduxGlide.CatchingFishWorkManager = false;
        catchingFishReduxGlide.CatchingFishViewModelScope = false;
        catchingFishReduxGlide.CatchingFishViewModelFAB = false;
        catchingFishReduxGlide.CatchingFishLayout = false;
        catchingFishReduxGlide.CatchingFishFragmentHandler = false;
        catchingFishReduxGlide.CatchingFishCloudMessaging = false;
        this.CatchingFishRedux = catchingFishReduxGlide;
        this.CatchingFishMockkOkHttp = false;
        this.CatchingFishReduxMoshi = false;
        CatchingFishKtorPayPal catchingFishKtorPayPal = new CatchingFishKtorPayPal(this);
        this.CatchingFishPicasso = catchingFishKtorPayPal;
        this.CatchingFishFirebase = false;
        this.CatchingFishGradleLiveData = new int[2];
        this.CatchingFishView = new int[2];
        this.CatchingFishServiceMVIJUnit = new int[2];
        this.CatchingFishGlideWidgetKtor = new int[2];
        this.CatchingFishFABLayout = new ArrayList();
        this.CatchingFishGraphQLGlide = new CatchingFishGsonRealm(11, this);
        this.CatchingFishWidget = 0;
        this.CatchingFishKtorService = 0;
        this.CatchingFishWebSocketMockk = new CatchingFishKtorPayPal(this);
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.CatchingFishAppCompat = viewConfiguration.getScaledTouchSlop();
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 26) {
            Method method = CatchingFishAdMobRoomRoom.CatchingFishParcelableFAB;
            CatchingFishParcelableFAB = CatchingFishJUnitMVVM.CatchingFishDaggerWebsocket(viewConfiguration);
        } else {
            CatchingFishParcelableFAB = CatchingFishAdMobRoomRoom.CatchingFishParcelableFAB(viewConfiguration, context);
        }
        this.CatchingFishAnimation = CatchingFishParcelableFAB;
        this.CatchingFishMVVMAppCompat = i4 >= 26 ? CatchingFishJUnitMVVM.CatchingFishWorkManager(viewConfiguration) : CatchingFishAdMobRoomRoom.CatchingFishParcelableFAB(viewConfiguration, context);
        this.CatchingFishStateFlow = viewConfiguration.getScaledMinimumFlingVelocity();
        this.CatchingFishJUnitRealm = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.CatchingFishCameraXIntent.CatchingFishParcelableFAB = catchingFishKtorPayPal;
        this.CatchingFishViewModelScope = new CatchingFishSensorManager(new CatchingFishKtorPayPal(this));
        this.CatchingFishViewModelFAB = new CatchingFishAsyncTaskDagger(new CatchingFishKtorPayPal(this));
        WeakHashMap weakHashMap = CatchingFishFABCameraX.CatchingFishParcelableFAB;
        if ((i4 >= 26 ? CatchingFishStripeAPIMoshi.CatchingFishParcelableFAB(this) : 0) == 0 && i4 >= 26) {
            CatchingFishStripeAPIMoshi.CatchingFishSnackbar(this, 8);
        }
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.CatchingFishCardViewView = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new CatchingFishFluxEspresso(this));
        int[] iArr = CatchingFishMVIReduxAdMob.CatchingFishParcelableFAB;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        CatchingFishFABCameraX.CatchingFishEspressoTesting(this, context, iArr, attributeSet, obtainStyledAttributes, i);
        String string = obtainStyledAttributes.getString(8);
        if (obtainStyledAttributes.getInt(2, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.CatchingFishFragmentHandler = obtainStyledAttributes.getBoolean(1, true);
        if (obtainStyledAttributes.getBoolean(3, false)) {
            StateListDrawable stateListDrawable = (StateListDrawable) obtainStyledAttributes.getDrawable(6);
            Drawable drawable = obtainStyledAttributes.getDrawable(7);
            StateListDrawable stateListDrawable2 = (StateListDrawable) obtainStyledAttributes.getDrawable(4);
            Drawable drawable2 = obtainStyledAttributes.getDrawable(5);
            if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
                throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + CatchingFishGsonAppCompat());
            }
            Resources resources = getContext().getResources();
            c2 = 2;
            z = 1;
            typedArray = obtainStyledAttributes;
            i3 = i;
            c = 3;
            i2 = 4;
            new CatchingFishGsonNavigation(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(com.catchingfish.fishcatcherpro.R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(com.catchingfish.fishcatcherpro.R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(com.catchingfish.fishcatcherpro.R.dimen.fastscroll_margin));
        } else {
            c = 3;
            i2 = 4;
            z = 1;
            c2 = 2;
            i3 = i;
            typedArray = obtainStyledAttributes;
        }
        typedArray.recycle();
        if (string != null) {
            String trim = string.trim();
            if (!trim.isEmpty()) {
                if (trim.charAt(0) == '.') {
                    trim = context.getPackageName() + trim;
                } else if (!trim.contains(".")) {
                    trim = RecyclerView.class.getPackage().getName() + '.' + trim;
                }
                String str = trim;
                try {
                    Class asSubclass = Class.forName(str, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(CatchingFishKtorDataStore.class);
                    try {
                        constructor = asSubclass.getConstructor(CatchingFishRealmKtorRealm);
                        Object[] objArr2 = new Object[i2];
                        objArr2[0] = context;
                        objArr2[z] = attributeSet;
                        objArr2[c2] = Integer.valueOf(i3);
                        objArr2[c] = 0;
                        objArr = objArr2;
                    } catch (NoSuchMethodException e) {
                        try {
                            constructor = asSubclass.getConstructor(null);
                            objArr = null;
                        } catch (NoSuchMethodException e2) {
                            e2.initCause(e);
                            throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + str, e2);
                        }
                    }
                    constructor.setAccessible(z);
                    setLayoutManager((CatchingFishKtorDataStore) constructor.newInstance(objArr));
                } catch (ClassCastException e3) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + str, e3);
                } catch (ClassNotFoundException e4) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + str, e4);
                } catch (IllegalAccessException e5) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + str, e5);
                } catch (InstantiationException e6) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e6);
                } catch (InvocationTargetException e7) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e7);
                }
            }
        }
        int[] iArr2 = CatchingFishMVPReduxContext;
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i3, 0);
        CatchingFishFABCameraX.CatchingFishEspressoTesting(this, context, iArr2, attributeSet, obtainStyledAttributes2, i3);
        boolean z2 = obtainStyledAttributes2.getBoolean(0, true);
        obtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        CatchingFishKtorDataStore catchingFishKtorDataStore = this.CatchingFishAnimationMockk;
        if (catchingFishKtorDataStore != null) {
            return catchingFishKtorDataStore.CatchingFishJetpackCompose(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + CatchingFishGsonAppCompat());
    }

    @Deprecated
    public void setRecyclerListener(CatchingFishPayPalToolbar catchingFishPayPalToolbar) {
    }
}
