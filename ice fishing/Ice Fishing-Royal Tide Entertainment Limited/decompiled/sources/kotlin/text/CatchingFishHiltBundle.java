package kotlin.text;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.Region;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.ui.semantics.AppendedSemanticsElement;
import com.catchingfish.fishcatcherpro.R;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public abstract class CatchingFishHiltBundle extends ViewGroup implements CatchingFishOkHttpAnimation, CatchingFishRealmWebSocket, CatchingFishHiltDatabinding, CatchingFishLiveDataDagger {
    public CatchingFishKtorPicassoMVVM CatchingFish;
    public CatchingFishToastFlux CatchingFishAnimationMockk;
    public final CatchingFishToastCoroutine CatchingFishCardViewRealm;
    public final CatchingFishBiometricRoom CatchingFishCardViewView;
    public CatchingFishBundleAnimation CatchingFishCloudMessaging;
    public final CatchingFishAdMobService CatchingFishCoroutineFlow;
    public CatchingFishServiceHandler CatchingFishDaggerHiltFAB;
    public final View CatchingFishDaggerWebsocket;
    public CatchingFishServiceHandler CatchingFishEspressoTesting;
    public CatchingFishJUnitGlide CatchingFishFragmentHandler;
    public int CatchingFishGsonAppCompat;
    public final CatchingFishAdMobService CatchingFishJetpackCompose;
    public CatchingFishJUnitGlide CatchingFishLayout;
    public long CatchingFishNavigation;
    public CatchingFishOkHttpFlux CatchingFishOkHttp;
    public int CatchingFishParcelableFlux;
    public boolean CatchingFishPayPal;
    public final CatchingFishFABBundleView CatchingFishReduxKtor;
    public final int[] CatchingFishRoomDatabase;
    public final int[] CatchingFishSpannableWidget;
    public CatchingFishJUnitLiveData CatchingFishStateLiveData;
    public CatchingFishServiceHandler CatchingFishUnitTesting;
    public boolean CatchingFishViewModelFAB;
    public CatchingFishJUnitGlide CatchingFishViewModelScope;
    public final CatchingFishAdMobJUnit CatchingFishWorkManager;

    public CatchingFishHiltBundle(Context context, CatchingFishBundlePicasso catchingFishBundlePicasso, int i, CatchingFishFABBundleView catchingFishFABBundleView, View view, CatchingFishAdMobJUnit catchingFishAdMobJUnit) {
        super(context);
        this.CatchingFishReduxKtor = catchingFishFABBundleView;
        this.CatchingFishDaggerWebsocket = view;
        this.CatchingFishWorkManager = catchingFishAdMobJUnit;
        LinkedHashMap linkedHashMap = CatchingFishSnackbarDagger.CatchingFishParcelableFAB;
        setTag(R.id.androidx_compose_ui_view_composition_context, catchingFishBundlePicasso);
        int i2 = 0;
        setSaveFromParentEnabled(false);
        addView(view);
        CatchingFishReduxRetrofit catchingFishReduxRetrofit = (CatchingFishReduxRetrofit) this;
        CatchingFishFABCameraX.CatchingFishAnimationMockk(this, new CatchingFishViewPager(catchingFishReduxRetrofit));
        CatchingFishGlideFlux.CatchingFishCoroutine(this, this);
        this.CatchingFishViewModelScope = CatchingFishDataStoreJUnit.CatchingFishUnitTesting;
        this.CatchingFishLayout = CatchingFishDataStoreJUnit.CatchingFishOkHttp;
        this.CatchingFishFragmentHandler = CatchingFishDataStoreJUnit.CatchingFishEspressoTesting;
        this.CatchingFishCloudMessaging = CatchingFishMoshiDagger.CatchingFishParcelableFAB;
        this.CatchingFishOkHttp = CatchingFishGsonCardView.CatchingFishSnackbar();
        int i3 = 2;
        this.CatchingFishRoomDatabase = new int[2];
        this.CatchingFishNavigation = 0L;
        int i4 = 1;
        this.CatchingFishJetpackCompose = new CatchingFishAdMobService(catchingFishReduxRetrofit, i4);
        this.CatchingFishCoroutineFlow = new CatchingFishAdMobService(catchingFishReduxRetrofit, i2);
        this.CatchingFishSpannableWidget = new int[2];
        this.CatchingFishParcelableFlux = Integer.MIN_VALUE;
        this.CatchingFishGsonAppCompat = Integer.MIN_VALUE;
        this.CatchingFishCardViewRealm = new CatchingFishToastCoroutine();
        CatchingFishBiometricRoom catchingFishBiometricRoom = new CatchingFishBiometricRoom(3);
        catchingFishBiometricRoom.CatchingFishRoomDatabase = catchingFishReduxRetrofit;
        CatchingFishBundleAnimation CatchingFishCoroutine = androidx.compose.ui.input.nestedscroll.CatchingFishPagingLibrary.CatchingFishParcelableFAB(catchingFishFABBundleView).CatchingFishCoroutine(new AppendedSemanticsElement(CatchingFishMVI.CatchingFishEspressoTesting, true));
        CatchingFishRealmStateFlow catchingFishRealmStateFlow = new CatchingFishRealmStateFlow();
        catchingFishRealmStateFlow.CatchingFishParcelableFAB = new CatchingFishOkHttpExoPlayer(catchingFishReduxRetrofit, i4);
        CatchingFishAdMob catchingFishAdMob = new CatchingFishAdMob();
        CatchingFishAdMob catchingFishAdMob2 = catchingFishRealmStateFlow.CatchingFishSnackbar;
        if (catchingFishAdMob2 != null) {
            catchingFishAdMob2.CatchingFishDaggerWebsocket = null;
        }
        catchingFishRealmStateFlow.CatchingFishSnackbar = catchingFishAdMob;
        catchingFishAdMob.CatchingFishDaggerWebsocket = catchingFishRealmStateFlow;
        setOnRequestDisallowInterceptTouchEvent$ui_release(catchingFishAdMob);
        CatchingFishBundleAnimation CatchingFishSnackbar = androidx.compose.ui.layout.CatchingFishPagingLibrary.CatchingFishSnackbar(androidx.compose.ui.draw.CatchingFishPagingLibrary.CatchingFishParcelableFAB(CatchingFishCoroutine.CatchingFishCoroutine(catchingFishRealmStateFlow), new CatchingFishMVPBiometric(catchingFishReduxRetrofit, catchingFishBiometricRoom, catchingFishReduxRetrofit)), new CatchingFishDaggerCameraX(catchingFishReduxRetrofit, catchingFishBiometricRoom, i3));
        catchingFishBiometricRoom.CatchingFishStateFlow(this.CatchingFishCloudMessaging.CatchingFishCoroutine(CatchingFishSnackbar));
        this.CatchingFishEspressoTesting = new CatchingFishOkHttpRedux(4, catchingFishBiometricRoom, CatchingFishSnackbar);
        catchingFishBiometricRoom.CatchingFishRecyclerView(this.CatchingFishOkHttp);
        this.CatchingFishUnitTesting = new CatchingFishMVVM(6, catchingFishBiometricRoom);
        catchingFishBiometricRoom.CatchingFishHandler = new CatchingFishDaggerCameraX(catchingFishReduxRetrofit, catchingFishBiometricRoom, i2);
        catchingFishBiometricRoom.CatchingFishPayPalLiveData = new CatchingFishOkHttpExoPlayer(catchingFishReduxRetrofit, i2);
        CatchingFishMVVMDaggerHilt catchingFishMVVMDaggerHilt = new CatchingFishMVVMDaggerHilt(catchingFishReduxRetrofit, catchingFishBiometricRoom);
        if (!CatchingFishFirebaseDagger.CatchingFishOkHttp(catchingFishBiometricRoom.CatchingFishGsonAppCompat, catchingFishMVVMDaggerHilt)) {
            catchingFishBiometricRoom.CatchingFishGsonAppCompat = catchingFishMVVMDaggerHilt;
            catchingFishBiometricRoom.CatchingFishCardViewRealm();
        }
        this.CatchingFishCardViewView = catchingFishBiometricRoom;
    }

    public static CatchingFishReduxPayPal CatchingFishCloudMessaging(CatchingFishReduxPayPal catchingFishReduxPayPal, int i, int i2, int i3, int i4) {
        int i5 = catchingFishReduxPayPal.CatchingFishParcelableFAB - i;
        if (i5 < 0) {
            i5 = 0;
        }
        int i6 = catchingFishReduxPayPal.CatchingFishSnackbar - i2;
        if (i6 < 0) {
            i6 = 0;
        }
        int i7 = catchingFishReduxPayPal.CatchingFishCoroutine - i3;
        if (i7 < 0) {
            i7 = 0;
        }
        int i8 = catchingFishReduxPayPal.CatchingFishReduxKtor - i4;
        return CatchingFishReduxPayPal.CatchingFishSnackbar(i5, i6, i7, i8 >= 0 ? i8 : 0);
    }

    public static final int CatchingFishFragmentHandler(CatchingFishReduxRetrofit catchingFishReduxRetrofit, int i, int i2, int i3) {
        return (i3 >= 0 || i == i2) ? View.MeasureSpec.makeMeasureSpec(CatchingFishOkHttpFAB.CatchingFishLayout(i3, i, i2), 1073741824) : (i3 != -2 || i2 == Integer.MAX_VALUE) ? (i3 != -1 || i2 == Integer.MAX_VALUE) ? View.MeasureSpec.makeMeasureSpec(0, 0) : View.MeasureSpec.makeMeasureSpec(i2, 1073741824) : View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CatchingFishGlideBiometric getSnapshotObserver() {
        if (!isAttachedToWindow()) {
            CatchingFishFluxGradle.CatchingFishSnackbar("Expected AndroidViewHolder to be attached when observing reads.");
        }
        return ((CatchingFishGradleCameraX) this.CatchingFishWorkManager).getSnapshotObserver();
    }

    @Override // kotlin.text.CatchingFishViewGson
    public final void CatchingFishCoroutine(View view, int i, int i2, int[] iArr, int i3) {
        if (this.CatchingFishDaggerWebsocket.isNestedScrollingEnabled()) {
            float f = i;
            float f2 = -1;
            long floatToRawIntBits = (Float.floatToRawIntBits(f * f2) << 32) | (Float.floatToRawIntBits(i2 * f2) & 4294967295L);
            int i4 = i3 == 0 ? 1 : 2;
            CatchingFishMoshiDataStore catchingFishMoshiDataStore = this.CatchingFishReduxKtor.CatchingFishParcelableFAB;
            CatchingFishMoshiDataStore CatchingFishCardViewView = catchingFishMoshiDataStore != null ? catchingFishMoshiDataStore.CatchingFishCardViewView() : null;
            long CatchingFishMutableLiveData = CatchingFishCardViewView != null ? CatchingFishCardViewView.CatchingFishMutableLiveData(i4, floatToRawIntBits) : 0L;
            iArr[0] = CatchingFishKtorViewModel.CatchingFishReduxKtor(Float.intBitsToFloat((int) (CatchingFishMutableLiveData >> 32)));
            iArr[1] = CatchingFishKtorViewModel.CatchingFishReduxKtor(Float.intBitsToFloat((int) (CatchingFishMutableLiveData & 4294967295L)));
        }
    }

    @Override // kotlin.text.CatchingFishRealmWebSocket
    public final void CatchingFishDaggerWebsocket() {
        this.CatchingFishLayout.CatchingFishParcelableFAB();
        removeAllViewsInLayout();
    }

    public final CatchingFishKtorPicassoMVVM CatchingFishEspressoTesting(CatchingFishKtorPicassoMVVM catchingFishKtorPicassoMVVM) {
        CatchingFishFragmentHilt catchingFishFragmentHilt = catchingFishKtorPicassoMVVM.CatchingFishParcelableFAB;
        CatchingFishReduxPayPal CatchingFishLayout = catchingFishFragmentHilt.CatchingFishLayout(-1);
        CatchingFishReduxPayPal catchingFishReduxPayPal = CatchingFishReduxPayPal.CatchingFishDaggerWebsocket;
        if (!CatchingFishLayout.equals(catchingFishReduxPayPal) || !catchingFishFragmentHilt.CatchingFishFragmentHandler(-9).equals(catchingFishReduxPayPal) || catchingFishFragmentHilt.CatchingFishViewModelFAB() != null) {
            CatchingFishGlideHandler catchingFishGlideHandler = (CatchingFishGlideHandler) this.CatchingFishCardViewView.CatchingFishJobScheduler.CatchingFishViewModelScope;
            if (catchingFishGlideHandler.CatchingFishMotionLayout.CatchingFishRoomDatabase) {
                long CatchingFishStripeAPI = CatchingFishLayoutRoomFAB.CatchingFishStripeAPI(catchingFishGlideHandler.CatchingFishEspressoMockk(0L));
                int i = (int) (CatchingFishStripeAPI >> 32);
                if (i < 0) {
                    i = 0;
                }
                int i2 = (int) (CatchingFishStripeAPI & 4294967295L);
                if (i2 < 0) {
                    i2 = 0;
                }
                long CatchingFishSensorManager = CatchingFishLayoutRoomFAB.CatchingFishParcelableFlux(catchingFishGlideHandler).CatchingFishSensorManager();
                int i3 = (int) (CatchingFishSensorManager >> 32);
                int i4 = (int) (CatchingFishSensorManager & 4294967295L);
                long j = catchingFishGlideHandler.CatchingFishWorkManager;
                long CatchingFishStripeAPI2 = CatchingFishLayoutRoomFAB.CatchingFishStripeAPI(catchingFishGlideHandler.CatchingFishEspressoMockk((Float.floatToRawIntBits((int) (j >> 32)) << 32) | (Float.floatToRawIntBits((int) (j & 4294967295L)) & 4294967295L)));
                int i5 = i3 - ((int) (CatchingFishStripeAPI2 >> 32));
                if (i5 < 0) {
                    i5 = 0;
                }
                int i6 = i4 - ((int) (4294967295L & CatchingFishStripeAPI2));
                int i7 = i6 >= 0 ? i6 : 0;
                if (i != 0 || i2 != 0 || i5 != 0 || i7 != 0) {
                    return catchingFishKtorPicassoMVVM.CatchingFishParcelableFAB.CatchingFishNavigation(i, i2, i5, i7);
                }
            }
        }
        return catchingFishKtorPicassoMVVM;
    }

    @Override // kotlin.text.CatchingFishViewGson
    public final void CatchingFishParcelableFAB(View view, View view2, int i, int i2) {
        CatchingFishToastCoroutine catchingFishToastCoroutine = this.CatchingFishCardViewRealm;
        if (i2 == 1) {
            catchingFishToastCoroutine.CatchingFishSnackbar = i;
        } else {
            catchingFishToastCoroutine.CatchingFishParcelableFAB = i;
        }
    }

    @Override // kotlin.text.CatchingFishRealmWebSocket
    public final void CatchingFishReduxKtor() {
        this.CatchingFishFragmentHandler.CatchingFishParcelableFAB();
    }

    @Override // kotlin.text.CatchingFishViewGson
    public final void CatchingFishSnackbar(View view, int i) {
        CatchingFishToastCoroutine catchingFishToastCoroutine = this.CatchingFishCardViewRealm;
        if (i == 1) {
            catchingFishToastCoroutine.CatchingFishSnackbar = 0;
        } else {
            catchingFishToastCoroutine.CatchingFishParcelableFAB = 0;
        }
    }

    @Override // kotlin.text.CatchingFishLiveDataDagger
    public final CatchingFishKtorPicassoMVVM CatchingFishStateLiveData(View view, CatchingFishKtorPicassoMVVM catchingFishKtorPicassoMVVM) {
        this.CatchingFish = new CatchingFishKtorPicassoMVVM(catchingFishKtorPicassoMVVM);
        return CatchingFishEspressoTesting(catchingFishKtorPicassoMVVM);
    }

    @Override // kotlin.text.CatchingFishHiltDatabinding
    public final boolean CatchingFishUnitTesting() {
        return isAttachedToWindow();
    }

    @Override // kotlin.text.CatchingFishViewGson
    public final boolean CatchingFishViewModelFAB(View view, View view2, int i, int i2) {
        return ((i & 2) == 0 && (i & 1) == 0) ? false : true;
    }

    @Override // kotlin.text.CatchingFishViewGson
    public final void CatchingFishViewModelScope(View view, int i, int i2, int i3, int i4, int i5) {
        if (this.CatchingFishDaggerWebsocket.isNestedScrollingEnabled()) {
            float f = -1;
            long floatToRawIntBits = (Float.floatToRawIntBits(i * f) << 32) | (Float.floatToRawIntBits(i2 * f) & 4294967295L);
            long floatToRawIntBits2 = (Float.floatToRawIntBits(i3 * f) << 32) | (Float.floatToRawIntBits(i4 * f) & 4294967295L);
            int i6 = i5 == 0 ? 1 : 2;
            CatchingFishMoshiDataStore catchingFishMoshiDataStore = this.CatchingFishReduxKtor.CatchingFishParcelableFAB;
            CatchingFishMoshiDataStore CatchingFishCardViewView = catchingFishMoshiDataStore != null ? catchingFishMoshiDataStore.CatchingFishCardViewView() : null;
            if (CatchingFishCardViewView != null) {
                CatchingFishCardViewView.CatchingFishCustomView(floatToRawIntBits, floatToRawIntBits2, i6);
            }
        }
    }

    @Override // kotlin.text.CatchingFishOkHttpAnimation
    public final void CatchingFishWorkManager(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (this.CatchingFishDaggerWebsocket.isNestedScrollingEnabled()) {
            float f = -1;
            long floatToRawIntBits = (Float.floatToRawIntBits(i * f) << 32) | (Float.floatToRawIntBits(i2 * f) & 4294967295L);
            long floatToRawIntBits2 = (Float.floatToRawIntBits(i4 * f) & 4294967295L) | (Float.floatToRawIntBits(i3 * f) << 32);
            int i6 = i5 == 0 ? 1 : 2;
            CatchingFishMoshiDataStore catchingFishMoshiDataStore = this.CatchingFishReduxKtor.CatchingFishParcelableFAB;
            CatchingFishMoshiDataStore CatchingFishCardViewView = catchingFishMoshiDataStore != null ? catchingFishMoshiDataStore.CatchingFishCardViewView() : null;
            long CatchingFishCustomView = CatchingFishCardViewView != null ? CatchingFishCardViewView.CatchingFishCustomView(floatToRawIntBits, floatToRawIntBits2, i6) : 0L;
            iArr[0] = CatchingFishKtorViewModel.CatchingFishReduxKtor(Float.intBitsToFloat((int) (CatchingFishCustomView >> 32)));
            iArr[1] = CatchingFishKtorViewModel.CatchingFishReduxKtor(Float.intBitsToFloat((int) (CatchingFishCustomView & 4294967295L)));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean gatherTransparentRegion(Region region) {
        if (region == null) {
            return true;
        }
        int[] iArr = this.CatchingFishSpannableWidget;
        getLocationInWindow(iArr);
        int i = iArr[0];
        region.op(i, iArr[1], getWidth() + i, getHeight() + iArr[1], Region.Op.DIFFERENCE);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return getClass().getName();
    }

    public final CatchingFishOkHttpFlux getDensity() {
        return this.CatchingFishOkHttp;
    }

    public final View getInteropView() {
        return this.CatchingFishDaggerWebsocket;
    }

    public final CatchingFishBiometricRoom getLayoutNode() {
        return this.CatchingFishCardViewView;
    }

    @Override // android.view.View
    public ViewGroup.LayoutParams getLayoutParams() {
        ViewGroup.LayoutParams layoutParams = this.CatchingFishDaggerWebsocket.getLayoutParams();
        return layoutParams == null ? new ViewGroup.LayoutParams(-1, -1) : layoutParams;
    }

    public final CatchingFishToastFlux getLifecycleOwner() {
        return this.CatchingFishAnimationMockk;
    }

    public final CatchingFishBundleAnimation getModifier() {
        return this.CatchingFishCloudMessaging;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        CatchingFishToastCoroutine catchingFishToastCoroutine = this.CatchingFishCardViewRealm;
        return catchingFishToastCoroutine.CatchingFishSnackbar | catchingFishToastCoroutine.CatchingFishParcelableFAB;
    }

    public final CatchingFishServiceHandler getOnDensityChanged$ui_release() {
        return this.CatchingFishUnitTesting;
    }

    public final CatchingFishServiceHandler getOnModifierChanged$ui_release() {
        return this.CatchingFishEspressoTesting;
    }

    public final CatchingFishServiceHandler getOnRequestDisallowInterceptTouchEvent$ui_release() {
        return this.CatchingFishDaggerHiltFAB;
    }

    public final CatchingFishJUnitGlide getRelease() {
        return this.CatchingFishFragmentHandler;
    }

    public final CatchingFishJUnitGlide getReset() {
        return this.CatchingFishLayout;
    }

    public final CatchingFishJUnitLiveData getSavedStateRegistryOwner() {
        return this.CatchingFishStateLiveData;
    }

    public final CatchingFishJUnitGlide getUpdate() {
        return this.CatchingFishViewModelScope;
    }

    public final View getView() {
        return this.CatchingFishDaggerWebsocket;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        super.invalidateChildInParent(iArr, rect);
        if (!this.CatchingFishPayPal) {
            this.CatchingFishCardViewView.CatchingFishParcelableFlux();
            return null;
        }
        this.CatchingFishDaggerWebsocket.postOnAnimation(new CatchingFishOkHttpSpannable(this.CatchingFishCoroutineFlow, 2));
        return null;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.CatchingFishDaggerWebsocket.isNestedScrollingEnabled();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.CatchingFishJetpackCompose.CatchingFishParcelableFAB();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) {
        super.onDescendantInvalidated(view, view2);
        if (!this.CatchingFishPayPal) {
            this.CatchingFishCardViewView.CatchingFishParcelableFlux();
        } else {
            this.CatchingFishDaggerWebsocket.postOnAnimation(new CatchingFishOkHttpSpannable(this.CatchingFishCoroutineFlow, 2));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0088 A[Catch: all -> 0x0096, TryCatch #0 {all -> 0x0096, blocks: (B:4:0x000e, B:6:0x0016, B:9:0x0080, B:11:0x0088, B:13:0x0098, B:15:0x008d, B:18:0x0029, B:21:0x0035, B:23:0x004a, B:25:0x0056, B:27:0x0060, B:29:0x0070, B:36:0x007b, B:39:0x009c), top: B:3:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x008b  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDetachedFromWindow() {
        int i;
        int i2;
        super.onDetachedFromWindow();
        CatchingFishViewMVPAndroidX catchingFishViewMVPAndroidX = getSnapshotObserver().CatchingFishParcelableFAB;
        synchronized (catchingFishViewMVPAndroidX.CatchingFishViewModelScope) {
            try {
                CatchingFishFABToast catchingFishFABToast = catchingFishViewMVPAndroidX.CatchingFishWorkManager;
                int i3 = catchingFishFABToast.CatchingFishWorkManager;
                int i4 = 0;
                int i5 = 0;
                while (i4 < i3) {
                    CatchingFishHandlerRedux catchingFishHandlerRedux = (CatchingFishHandlerRedux) catchingFishFABToast.CatchingFishReduxKtor[i4];
                    CatchingFishJUnitService catchingFishJUnitService = (CatchingFishJUnitService) catchingFishHandlerRedux.CatchingFishWorkManager.CatchingFishCloudMessaging(this);
                    if (catchingFishJUnitService != null) {
                        Object[] objArr = catchingFishJUnitService.CatchingFishSnackbar;
                        int[] iArr = catchingFishJUnitService.CatchingFishCoroutine;
                        long[] jArr = catchingFishJUnitService.CatchingFishParcelableFAB;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i6 = 0;
                            while (true) {
                                long j = jArr[i6];
                                i = i4;
                                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i7 = 8;
                                    int i8 = 8 - ((~(i6 - length)) >>> 31);
                                    int i9 = 0;
                                    while (i9 < i8) {
                                        if ((j & 255) < 128) {
                                            int i10 = (i6 << 3) + i9;
                                            i2 = i7;
                                            Object obj = objArr[i10];
                                            int i11 = iArr[i10];
                                            catchingFishHandlerRedux.CatchingFishReduxKtor(this, obj);
                                        } else {
                                            i2 = i7;
                                        }
                                        j >>= i2;
                                        i9++;
                                        i7 = i2;
                                    }
                                    if (i8 != i7) {
                                        break;
                                    }
                                }
                                if (i6 == length) {
                                    break;
                                }
                                i6++;
                                i4 = i;
                            }
                            if (catchingFishHandlerRedux.CatchingFishWorkManager.CatchingFishFragmentHandler()) {
                                i5++;
                            } else if (i5 > 0) {
                                Object[] objArr2 = catchingFishFABToast.CatchingFishReduxKtor;
                                objArr2[i - i5] = objArr2[i];
                            }
                            i4 = i + 1;
                        }
                    }
                    i = i4;
                    if (catchingFishHandlerRedux.CatchingFishWorkManager.CatchingFishFragmentHandler()) {
                    }
                    i4 = i + 1;
                }
                int i12 = i3 - i5;
                CatchingFishMVVMHilt.CatchingFishAnimation(catchingFishFABToast.CatchingFishReduxKtor, i12, i3);
                catchingFishFABToast.CatchingFishWorkManager = i12;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.CatchingFishDaggerWebsocket.layout(0, 0, i3 - i, i4 - i2);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        View view = this.CatchingFishDaggerWebsocket;
        if (view.getParent() != this) {
            setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
            return;
        }
        if (view.getVisibility() == 8) {
            setMeasuredDimension(0, 0);
            return;
        }
        view.measure(i, i2);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
        this.CatchingFishParcelableFlux = i;
        this.CatchingFishGsonAppCompat = i2;
    }

    /* JADX WARN: Type inference failed for: r10v8, types: [kotlin.text.CatchingFishJUnitGlide, kotlin.text.CatchingFishViewWebsocket] */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.CatchingFishDaggerWebsocket.isNestedScrollingEnabled()) {
            return false;
        }
        long floatToRawIntBits = (Float.floatToRawIntBits(f * (-1.0f)) << 32) | (Float.floatToRawIntBits(f2 * (-1.0f)) & 4294967295L);
        CatchingFishToastLayout catchingFishToastLayout = (CatchingFishToastLayout) this.CatchingFishReduxKtor.CatchingFishCoroutine.CatchingFishParcelableFAB();
        if (catchingFishToastLayout == null) {
            throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        }
        CatchingFishXMLLayoutGlide.CatchingFishGsonAppCompat(catchingFishToastLayout, null, new CatchingFishAdMobParcelable(z, this, floatToRawIntBits, null), 3);
        return false;
    }

    /* JADX WARN: Type inference failed for: r8v5, types: [kotlin.text.CatchingFishJUnitGlide, kotlin.text.CatchingFishViewWebsocket] */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        if (!this.CatchingFishDaggerWebsocket.isNestedScrollingEnabled()) {
            return false;
        }
        long floatToRawIntBits = (Float.floatToRawIntBits(f * (-1.0f)) << 32) | (Float.floatToRawIntBits(f2 * (-1.0f)) & 4294967295L);
        CatchingFishToastLayout catchingFishToastLayout = (CatchingFishToastLayout) this.CatchingFishReduxKtor.CatchingFishCoroutine.CatchingFishParcelableFAB();
        if (catchingFishToastLayout == null) {
            throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        }
        CatchingFishXMLLayoutGlide.CatchingFishGsonAppCompat(catchingFishToastLayout, null, new CatchingFishAdMobGoogleMaps(this, floatToRawIntBits, null), 3);
        return false;
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        CatchingFishServiceHandler catchingFishServiceHandler = this.CatchingFishDaggerHiltFAB;
        if (catchingFishServiceHandler != null) {
            catchingFishServiceHandler.CatchingFishFragmentHandler(Boolean.valueOf(z));
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public final void setDensity(CatchingFishOkHttpFlux catchingFishOkHttpFlux) {
        if (catchingFishOkHttpFlux != this.CatchingFishOkHttp) {
            this.CatchingFishOkHttp = catchingFishOkHttpFlux;
            CatchingFishServiceHandler catchingFishServiceHandler = this.CatchingFishUnitTesting;
            if (catchingFishServiceHandler != null) {
                catchingFishServiceHandler.CatchingFishFragmentHandler(catchingFishOkHttpFlux);
            }
        }
    }

    public final void setLifecycleOwner(CatchingFishToastFlux catchingFishToastFlux) {
        if (catchingFishToastFlux != this.CatchingFishAnimationMockk) {
            this.CatchingFishAnimationMockk = catchingFishToastFlux;
            CatchingFishHiltMVPToast.CatchingFishFragmentFactory(this, catchingFishToastFlux);
        }
    }

    public final void setModifier(CatchingFishBundleAnimation catchingFishBundleAnimation) {
        if (catchingFishBundleAnimation != this.CatchingFishCloudMessaging) {
            this.CatchingFishCloudMessaging = catchingFishBundleAnimation;
            CatchingFishServiceHandler catchingFishServiceHandler = this.CatchingFishEspressoTesting;
            if (catchingFishServiceHandler != null) {
                catchingFishServiceHandler.CatchingFishFragmentHandler(catchingFishBundleAnimation);
            }
        }
    }

    public final void setOnDensityChanged$ui_release(CatchingFishServiceHandler catchingFishServiceHandler) {
        this.CatchingFishUnitTesting = catchingFishServiceHandler;
    }

    public final void setOnModifierChanged$ui_release(CatchingFishServiceHandler catchingFishServiceHandler) {
        this.CatchingFishEspressoTesting = catchingFishServiceHandler;
    }

    public final void setOnRequestDisallowInterceptTouchEvent$ui_release(CatchingFishServiceHandler catchingFishServiceHandler) {
        this.CatchingFishDaggerHiltFAB = catchingFishServiceHandler;
    }

    public final void setRelease(CatchingFishJUnitGlide catchingFishJUnitGlide) {
        this.CatchingFishFragmentHandler = catchingFishJUnitGlide;
    }

    public final void setReset(CatchingFishJUnitGlide catchingFishJUnitGlide) {
        this.CatchingFishLayout = catchingFishJUnitGlide;
    }

    public final void setSavedStateRegistryOwner(CatchingFishJUnitLiveData catchingFishJUnitLiveData) {
        if (catchingFishJUnitLiveData != this.CatchingFishStateLiveData) {
            this.CatchingFishStateLiveData = catchingFishJUnitLiveData;
            CatchingFishOkHttpFAB.CatchingFishRecyclerView(this, catchingFishJUnitLiveData);
        }
    }

    public final void setUpdate(CatchingFishJUnitGlide catchingFishJUnitGlide) {
        this.CatchingFishViewModelScope = catchingFishJUnitGlide;
        this.CatchingFishViewModelFAB = true;
        this.CatchingFishJetpackCompose.CatchingFishParcelableFAB();
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }
}
