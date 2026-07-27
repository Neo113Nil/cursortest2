package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import com.catchingfish.fishcatcherpro.R;
import java.util.WeakHashMap;
import kotlin.text.CatchingFishAdMobMVPGlide;
import kotlin.text.CatchingFishDaggerAdMob;
import kotlin.text.CatchingFishEspressoToolbar;
import kotlin.text.CatchingFishFABCameraX;
import kotlin.text.CatchingFishFragmentHilt;
import kotlin.text.CatchingFishGlideFlux;
import kotlin.text.CatchingFishGraphQLFragment;
import kotlin.text.CatchingFishGsonMVIRetrofit;
import kotlin.text.CatchingFishIntentMVI;
import kotlin.text.CatchingFishJUnitView;
import kotlin.text.CatchingFishKtorPicassoMVVM;
import kotlin.text.CatchingFishKtorUnitTesting;
import kotlin.text.CatchingFishLayoutRoomFAB;
import kotlin.text.CatchingFishMVPLayoutRealm;
import kotlin.text.CatchingFishMVVMAsyncTask;
import kotlin.text.CatchingFishManifestFABMVI;
import kotlin.text.CatchingFishMoshiToolbar;
import kotlin.text.CatchingFishOkHttpAnimation;
import kotlin.text.CatchingFishOkHttpManifest;
import kotlin.text.CatchingFishPicasso;
import kotlin.text.CatchingFishRealmHiltGradle;
import kotlin.text.CatchingFishRealmView;
import kotlin.text.CatchingFishRedux;
import kotlin.text.CatchingFishReduxPayPal;
import kotlin.text.CatchingFishRoomAdMobMVP;
import kotlin.text.CatchingFishSharedFlowAdMob;
import kotlin.text.CatchingFishStateFlowBundle;
import kotlin.text.CatchingFishStateLiveData;
import kotlin.text.CatchingFishToast;
import kotlin.text.CatchingFishToastCoroutine;
import kotlin.text.CatchingFishViewGson;

/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements CatchingFishOkHttpManifest, CatchingFishViewGson, CatchingFishOkHttpAnimation {
    public static final CatchingFishKtorPicassoMVVM CatchingFishJobScheduler;
    public static final int[] CatchingFishMutableLiveData = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};
    public static final Rect CatchingFishPayPalService;
    public final Rect CatchingFish;
    public int CatchingFishAnimationMockk;
    public ViewPropertyAnimator CatchingFishCardViewRealm;
    public final CatchingFishMoshiToolbar CatchingFishCardViewView;
    public boolean CatchingFishCloudMessaging;
    public CatchingFishKtorPicassoMVVM CatchingFishCoroutineFlow;
    public final CatchingFishToastCoroutine CatchingFishCustomView;
    public CatchingFishKtorPicassoMVVM CatchingFishDaggerHiltFAB;
    public int CatchingFishDaggerWebsocket;
    public boolean CatchingFishEspressoTesting;
    public final CatchingFishPicasso CatchingFishFragmentFactory;
    public boolean CatchingFishFragmentHandler;
    public OverScroller CatchingFishGsonAppCompat;
    public CatchingFishKtorPicassoMVVM CatchingFishJetpackCompose;
    public Drawable CatchingFishLayout;
    public final CatchingFishMoshiToolbar CatchingFishMVPRobolectric;
    public final Rect CatchingFishNavigation;
    public boolean CatchingFishOkHttp;
    public CatchingFishEspressoToolbar CatchingFishParcelableFlux;
    public final CatchingFishStateLiveData CatchingFishPayPal;
    public int CatchingFishReduxKtor;
    public final Rect CatchingFishRoomDatabase;
    public CatchingFishKtorPicassoMVVM CatchingFishSpannableWidget;
    public final Rect CatchingFishStateLiveData;
    public int CatchingFishUnitTesting;
    public CatchingFishIntentMVI CatchingFishViewModelFAB;
    public ActionBarContainer CatchingFishViewModelScope;
    public ContentFrameLayout CatchingFishWorkManager;

    static {
        int i = Build.VERSION.SDK_INT;
        CatchingFishManifestFABMVI catchingFishRealmView = i >= 36 ? new CatchingFishRealmView() : i >= 35 ? new CatchingFishRealmHiltGradle() : i >= 34 ? new CatchingFishRoomAdMobMVP() : i >= 31 ? new CatchingFishJUnitView() : i >= 30 ? new CatchingFishMVPLayoutRealm() : i >= 29 ? new CatchingFishStateFlowBundle() : new CatchingFishAdMobMVPGlide();
        catchingFishRealmView.CatchingFishViewModelFAB(CatchingFishReduxPayPal.CatchingFishSnackbar(0, 1, 0, 1));
        CatchingFishJobScheduler = catchingFishRealmView.CatchingFishSnackbar();
        CatchingFishPayPalService = new Rect();
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.CatchingFishDaggerWebsocket = 0;
        this.CatchingFishStateLiveData = new Rect();
        this.CatchingFishRoomDatabase = new Rect();
        this.CatchingFishNavigation = new Rect();
        this.CatchingFish = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        CatchingFishKtorPicassoMVVM catchingFishKtorPicassoMVVM = CatchingFishKtorPicassoMVVM.CatchingFishSnackbar;
        this.CatchingFishJetpackCompose = catchingFishKtorPicassoMVVM;
        this.CatchingFishCoroutineFlow = catchingFishKtorPicassoMVVM;
        this.CatchingFishDaggerHiltFAB = catchingFishKtorPicassoMVVM;
        this.CatchingFishSpannableWidget = catchingFishKtorPicassoMVVM;
        this.CatchingFishPayPal = new CatchingFishStateLiveData(0, this);
        this.CatchingFishCardViewView = new CatchingFishMoshiToolbar(this, 0);
        this.CatchingFishMVPRobolectric = new CatchingFishMoshiToolbar(this, 1);
        CatchingFishLayout(context);
        this.CatchingFishCustomView = new CatchingFishToastCoroutine();
        CatchingFishPicasso catchingFishPicasso = new CatchingFishPicasso(context);
        catchingFishPicasso.setWillNotDraw(true);
        this.CatchingFishFragmentFactory = catchingFishPicasso;
        addView(catchingFishPicasso);
    }

    public static boolean CatchingFishReduxKtor(View view, Rect rect, boolean z) {
        boolean z2;
        CatchingFishRedux catchingFishRedux = (CatchingFishRedux) view.getLayoutParams();
        int i = ((ViewGroup.MarginLayoutParams) catchingFishRedux).leftMargin;
        int i2 = rect.left;
        if (i != i2) {
            ((ViewGroup.MarginLayoutParams) catchingFishRedux).leftMargin = i2;
            z2 = true;
        } else {
            z2 = false;
        }
        int i3 = ((ViewGroup.MarginLayoutParams) catchingFishRedux).topMargin;
        int i4 = rect.top;
        if (i3 != i4) {
            ((ViewGroup.MarginLayoutParams) catchingFishRedux).topMargin = i4;
            z2 = true;
        }
        int i5 = ((ViewGroup.MarginLayoutParams) catchingFishRedux).rightMargin;
        int i6 = rect.right;
        if (i5 != i6) {
            ((ViewGroup.MarginLayoutParams) catchingFishRedux).rightMargin = i6;
            z2 = true;
        }
        if (z) {
            int i7 = ((ViewGroup.MarginLayoutParams) catchingFishRedux).bottomMargin;
            int i8 = rect.bottom;
            if (i7 != i8) {
                ((ViewGroup.MarginLayoutParams) catchingFishRedux).bottomMargin = i8;
                return true;
            }
        }
        return z2;
    }

    public final void CatchingFishCloudMessaging() {
        CatchingFishIntentMVI wrapper;
        if (this.CatchingFishWorkManager == null) {
            this.CatchingFishWorkManager = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.CatchingFishViewModelScope = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback findViewById = findViewById(R.id.action_bar);
            if (findViewById instanceof CatchingFishIntentMVI) {
                wrapper = (CatchingFishIntentMVI) findViewById;
            } else {
                if (!(findViewById instanceof Toolbar)) {
                    throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById.getClass().getSimpleName()));
                }
                wrapper = ((Toolbar) findViewById).getWrapper();
            }
            this.CatchingFishViewModelFAB = wrapper;
        }
    }

    @Override // kotlin.text.CatchingFishViewGson
    public final void CatchingFishCoroutine(View view, int i, int i2, int[] iArr, int i3) {
    }

    public final void CatchingFishDaggerWebsocket() {
        removeCallbacks(this.CatchingFishCardViewView);
        removeCallbacks(this.CatchingFishMVPRobolectric);
        ViewPropertyAnimator viewPropertyAnimator = this.CatchingFishCardViewRealm;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void CatchingFishEspressoTesting(Menu menu, CatchingFishDaggerAdMob catchingFishDaggerAdMob) {
        CatchingFishCloudMessaging();
        CatchingFishMVVMAsyncTask catchingFishMVVMAsyncTask = (CatchingFishMVVMAsyncTask) this.CatchingFishViewModelFAB;
        Toolbar toolbar = catchingFishMVVMAsyncTask.CatchingFishParcelableFAB;
        if (catchingFishMVVMAsyncTask.CatchingFishOkHttp == null) {
            catchingFishMVVMAsyncTask.CatchingFishOkHttp = new CatchingFishToast(toolbar.getContext());
        }
        CatchingFishToast catchingFishToast = catchingFishMVVMAsyncTask.CatchingFishOkHttp;
        catchingFishToast.CatchingFishViewModelFAB = catchingFishDaggerAdMob;
        CatchingFishSharedFlowAdMob catchingFishSharedFlowAdMob = (CatchingFishSharedFlowAdMob) menu;
        if (catchingFishSharedFlowAdMob == null && toolbar.CatchingFishReduxKtor == null) {
            return;
        }
        toolbar.CatchingFishWorkManager();
        CatchingFishSharedFlowAdMob catchingFishSharedFlowAdMob2 = toolbar.CatchingFishReduxKtor.CatchingFish;
        if (catchingFishSharedFlowAdMob2 == catchingFishSharedFlowAdMob) {
            return;
        }
        if (catchingFishSharedFlowAdMob2 != null) {
            catchingFishSharedFlowAdMob2.CatchingFishNavigation(toolbar.CatchingFishPayPalLiveData);
            catchingFishSharedFlowAdMob2.CatchingFishNavigation(toolbar.CatchingFishGradleManifest);
        }
        if (toolbar.CatchingFishGradleManifest == null) {
            toolbar.CatchingFishGradleManifest = new CatchingFishKtorUnitTesting(toolbar);
        }
        catchingFishToast.CatchingFishJetpackCompose = true;
        if (catchingFishSharedFlowAdMob != null) {
            catchingFishSharedFlowAdMob.CatchingFishSnackbar(catchingFishToast, toolbar.CatchingFishOkHttp);
            catchingFishSharedFlowAdMob.CatchingFishSnackbar(toolbar.CatchingFishGradleManifest, toolbar.CatchingFishOkHttp);
        } else {
            catchingFishToast.CatchingFishDaggerWebsocket(toolbar.CatchingFishOkHttp, null);
            toolbar.CatchingFishGradleManifest.CatchingFishDaggerWebsocket(toolbar.CatchingFishOkHttp, null);
            catchingFishToast.CatchingFishWorkManager();
            toolbar.CatchingFishGradleManifest.CatchingFishWorkManager();
        }
        toolbar.CatchingFishReduxKtor.setPopupTheme(toolbar.CatchingFishUnitTesting);
        toolbar.CatchingFishReduxKtor.setPresenter(catchingFishToast);
        toolbar.CatchingFishPayPalLiveData = catchingFishToast;
        toolbar.CatchingFishJetpackCompose();
    }

    public final void CatchingFishFragmentHandler(int i) {
        CatchingFishCloudMessaging();
        if (i == 2) {
            this.CatchingFishViewModelFAB.getClass();
        } else if (i == 5) {
            this.CatchingFishViewModelFAB.getClass();
        } else {
            if (i != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    public final void CatchingFishLayout(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(CatchingFishMutableLiveData);
        this.CatchingFishReduxKtor = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.CatchingFishLayout = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        this.CatchingFishGsonAppCompat = new OverScroller(context);
    }

    @Override // kotlin.text.CatchingFishViewGson
    public final void CatchingFishParcelableFAB(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // kotlin.text.CatchingFishViewGson
    public final void CatchingFishSnackbar(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // kotlin.text.CatchingFishViewGson
    public final boolean CatchingFishViewModelFAB(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    @Override // kotlin.text.CatchingFishViewGson
    public final void CatchingFishViewModelScope(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    @Override // kotlin.text.CatchingFishOkHttpAnimation
    public final void CatchingFishWorkManager(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        CatchingFishViewModelScope(view, i, i2, i3, i4, i5);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof CatchingFishRedux;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        if (this.CatchingFishLayout != null) {
            if (this.CatchingFishViewModelScope.getVisibility() == 0) {
                i = (int) (this.CatchingFishViewModelScope.getTranslationY() + this.CatchingFishViewModelScope.getBottom() + 0.5f);
            } else {
                i = 0;
            }
            this.CatchingFishLayout.setBounds(0, i, getWidth(), this.CatchingFishLayout.getIntrinsicHeight() + i);
            this.CatchingFishLayout.draw(canvas);
        }
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new CatchingFishRedux(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new CatchingFishRedux(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.CatchingFishViewModelScope;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        CatchingFishToastCoroutine catchingFishToastCoroutine = this.CatchingFishCustomView;
        return catchingFishToastCoroutine.CatchingFishSnackbar | catchingFishToastCoroutine.CatchingFishParcelableFAB;
    }

    public CharSequence getTitle() {
        CatchingFishCloudMessaging();
        return ((CatchingFishMVVMAsyncTask) this.CatchingFishViewModelFAB).CatchingFishParcelableFAB.getTitle();
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        CatchingFishCloudMessaging();
        CatchingFishKtorPicassoMVVM CatchingFishViewModelScope = CatchingFishKtorPicassoMVVM.CatchingFishViewModelScope(this, windowInsets);
        boolean CatchingFishReduxKtor = CatchingFishReduxKtor(this.CatchingFishViewModelScope, new Rect(CatchingFishViewModelScope.CatchingFishSnackbar(), CatchingFishViewModelScope.CatchingFishReduxKtor(), CatchingFishViewModelScope.CatchingFishCoroutine(), CatchingFishViewModelScope.CatchingFishParcelableFAB()), false);
        WeakHashMap weakHashMap = CatchingFishFABCameraX.CatchingFishParcelableFAB;
        Rect rect = this.CatchingFishStateLiveData;
        CatchingFishGlideFlux.CatchingFishSnackbar(this, CatchingFishViewModelScope, rect);
        int i = rect.left;
        int i2 = rect.top;
        int i3 = rect.right;
        int i4 = rect.bottom;
        CatchingFishFragmentHilt catchingFishFragmentHilt = CatchingFishViewModelScope.CatchingFishParcelableFAB;
        CatchingFishKtorPicassoMVVM CatchingFishNavigation = catchingFishFragmentHilt.CatchingFishNavigation(i, i2, i3, i4);
        this.CatchingFishJetpackCompose = CatchingFishNavigation;
        boolean z = true;
        if (!this.CatchingFishCoroutineFlow.equals(CatchingFishNavigation)) {
            this.CatchingFishCoroutineFlow = this.CatchingFishJetpackCompose;
            CatchingFishReduxKtor = true;
        }
        Rect rect2 = this.CatchingFishRoomDatabase;
        if (rect2.equals(rect)) {
            z = CatchingFishReduxKtor;
        } else {
            rect2.set(rect);
        }
        if (z) {
            requestLayout();
        }
        return catchingFishFragmentHilt.CatchingFishParcelableFAB().CatchingFishParcelableFAB.CatchingFishCoroutine().CatchingFishParcelableFAB.CatchingFishSnackbar().CatchingFishWorkManager();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        CatchingFishLayout(getContext());
        WeakHashMap weakHashMap = CatchingFishFABCameraX.CatchingFishParcelableFAB;
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        CatchingFishDaggerWebsocket();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                CatchingFishRedux catchingFishRedux = (CatchingFishRedux) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = ((ViewGroup.MarginLayoutParams) catchingFishRedux).leftMargin + paddingLeft;
                int i7 = ((ViewGroup.MarginLayoutParams) catchingFishRedux).topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0125  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i, int i2) {
        int measuredHeight;
        CatchingFishCloudMessaging();
        measureChildWithMargins(this.CatchingFishViewModelScope, i, 0, i2, 0);
        CatchingFishRedux catchingFishRedux = (CatchingFishRedux) this.CatchingFishViewModelScope.getLayoutParams();
        int max = Math.max(0, this.CatchingFishViewModelScope.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) catchingFishRedux).leftMargin + ((ViewGroup.MarginLayoutParams) catchingFishRedux).rightMargin);
        int max2 = Math.max(0, this.CatchingFishViewModelScope.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) catchingFishRedux).topMargin + ((ViewGroup.MarginLayoutParams) catchingFishRedux).bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.CatchingFishViewModelScope.getMeasuredState());
        WeakHashMap weakHashMap = CatchingFishFABCameraX.CatchingFishParcelableFAB;
        boolean z = (getWindowSystemUiVisibility() & 256) != 0;
        if (z) {
            measuredHeight = this.CatchingFishReduxKtor;
            if (this.CatchingFishCloudMessaging && this.CatchingFishViewModelScope.getTabContainer() != null) {
                measuredHeight += this.CatchingFishReduxKtor;
            }
        } else {
            measuredHeight = this.CatchingFishViewModelScope.getVisibility() != 8 ? this.CatchingFishViewModelScope.getMeasuredHeight() : 0;
        }
        Rect rect = this.CatchingFishStateLiveData;
        Rect rect2 = this.CatchingFishNavigation;
        rect2.set(rect);
        this.CatchingFishDaggerHiltFAB = this.CatchingFishJetpackCompose;
        if (!this.CatchingFishFragmentHandler && !z) {
            CatchingFishPicasso catchingFishPicasso = this.CatchingFishFragmentFactory;
            CatchingFishKtorPicassoMVVM catchingFishKtorPicassoMVVM = CatchingFishJobScheduler;
            Rect rect3 = this.CatchingFish;
            CatchingFishGlideFlux.CatchingFishSnackbar(catchingFishPicasso, catchingFishKtorPicassoMVVM, rect3);
            if (!rect3.equals(CatchingFishPayPalService)) {
                rect2.top += measuredHeight;
                rect2.bottom = rect2.bottom;
                this.CatchingFishDaggerHiltFAB = this.CatchingFishDaggerHiltFAB.CatchingFishParcelableFAB.CatchingFishNavigation(0, measuredHeight, 0, 0);
                CatchingFishReduxKtor(this.CatchingFishWorkManager, rect2, true);
                if (!this.CatchingFishSpannableWidget.equals(this.CatchingFishDaggerHiltFAB)) {
                    CatchingFishKtorPicassoMVVM catchingFishKtorPicassoMVVM2 = this.CatchingFishDaggerHiltFAB;
                    this.CatchingFishSpannableWidget = catchingFishKtorPicassoMVVM2;
                    CatchingFishFABCameraX.CatchingFishSnackbar(this.CatchingFishWorkManager, catchingFishKtorPicassoMVVM2);
                }
                measureChildWithMargins(this.CatchingFishWorkManager, i, 0, i2, 0);
                CatchingFishRedux catchingFishRedux2 = (CatchingFishRedux) this.CatchingFishWorkManager.getLayoutParams();
                int max3 = Math.max(max, this.CatchingFishWorkManager.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) catchingFishRedux2).leftMargin + ((ViewGroup.MarginLayoutParams) catchingFishRedux2).rightMargin);
                int max4 = Math.max(max2, this.CatchingFishWorkManager.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) catchingFishRedux2).topMargin + ((ViewGroup.MarginLayoutParams) catchingFishRedux2).bottomMargin);
                int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.CatchingFishWorkManager.getMeasuredState());
                setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max3, getSuggestedMinimumWidth()), i, combineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max4, getSuggestedMinimumHeight()), i2, combineMeasuredStates2 << 16));
            }
        }
        CatchingFishReduxPayPal CatchingFishSnackbar = CatchingFishReduxPayPal.CatchingFishSnackbar(this.CatchingFishDaggerHiltFAB.CatchingFishSnackbar(), this.CatchingFishDaggerHiltFAB.CatchingFishReduxKtor() + measuredHeight, this.CatchingFishDaggerHiltFAB.CatchingFishCoroutine(), this.CatchingFishDaggerHiltFAB.CatchingFishParcelableFAB());
        CatchingFishKtorPicassoMVVM catchingFishKtorPicassoMVVM3 = this.CatchingFishDaggerHiltFAB;
        int i3 = Build.VERSION.SDK_INT;
        CatchingFishManifestFABMVI catchingFishRealmView = i3 >= 36 ? new CatchingFishRealmView(catchingFishKtorPicassoMVVM3) : i3 >= 35 ? new CatchingFishRealmHiltGradle(catchingFishKtorPicassoMVVM3) : i3 >= 34 ? new CatchingFishRoomAdMobMVP(catchingFishKtorPicassoMVVM3) : i3 >= 31 ? new CatchingFishJUnitView(catchingFishKtorPicassoMVVM3) : i3 >= 30 ? new CatchingFishMVPLayoutRealm(catchingFishKtorPicassoMVVM3) : i3 >= 29 ? new CatchingFishStateFlowBundle(catchingFishKtorPicassoMVVM3) : new CatchingFishAdMobMVPGlide(catchingFishKtorPicassoMVVM3);
        catchingFishRealmView.CatchingFishViewModelFAB(CatchingFishSnackbar);
        this.CatchingFishDaggerHiltFAB = catchingFishRealmView.CatchingFishSnackbar();
        CatchingFishReduxKtor(this.CatchingFishWorkManager, rect2, true);
        if (!this.CatchingFishSpannableWidget.equals(this.CatchingFishDaggerHiltFAB)) {
        }
        measureChildWithMargins(this.CatchingFishWorkManager, i, 0, i2, 0);
        CatchingFishRedux catchingFishRedux22 = (CatchingFishRedux) this.CatchingFishWorkManager.getLayoutParams();
        int max32 = Math.max(max, this.CatchingFishWorkManager.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) catchingFishRedux22).leftMargin + ((ViewGroup.MarginLayoutParams) catchingFishRedux22).rightMargin);
        int max42 = Math.max(max2, this.CatchingFishWorkManager.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) catchingFishRedux22).topMargin + ((ViewGroup.MarginLayoutParams) catchingFishRedux22).bottomMargin);
        int combineMeasuredStates22 = View.combineMeasuredStates(combineMeasuredStates, this.CatchingFishWorkManager.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max32, getSuggestedMinimumWidth()), i, combineMeasuredStates22), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max42, getSuggestedMinimumHeight()), i2, combineMeasuredStates22 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.CatchingFishEspressoTesting || !z) {
            return false;
        }
        this.CatchingFishGsonAppCompat.fling(0, 0, 0, (int) f2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.CatchingFishGsonAppCompat.getFinalY() > this.CatchingFishViewModelScope.getHeight()) {
            CatchingFishDaggerWebsocket();
            this.CatchingFishMVPRobolectric.run();
        } else {
            CatchingFishDaggerWebsocket();
            this.CatchingFishCardViewView.run();
        }
        this.CatchingFishOkHttp = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.CatchingFishUnitTesting + i2;
        this.CatchingFishUnitTesting = i5;
        setActionBarHideOffset(i5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        CatchingFishGraphQLFragment catchingFishGraphQLFragment;
        CatchingFishGsonMVIRetrofit catchingFishGsonMVIRetrofit;
        this.CatchingFishCustomView.CatchingFishParcelableFAB = i;
        this.CatchingFishUnitTesting = getActionBarHideOffset();
        CatchingFishDaggerWebsocket();
        CatchingFishEspressoToolbar catchingFishEspressoToolbar = this.CatchingFishParcelableFlux;
        if (catchingFishEspressoToolbar == null || (catchingFishGsonMVIRetrofit = (catchingFishGraphQLFragment = (CatchingFishGraphQLFragment) catchingFishEspressoToolbar).CatchingFishPayPalLiveData) == null) {
            return;
        }
        catchingFishGsonMVIRetrofit.CatchingFishParcelableFAB();
        catchingFishGraphQLFragment.CatchingFishPayPalLiveData = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.CatchingFishViewModelScope.getVisibility() != 0) {
            return false;
        }
        return this.CatchingFishEspressoTesting;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.CatchingFishEspressoTesting || this.CatchingFishOkHttp) {
            return;
        }
        if (this.CatchingFishUnitTesting <= this.CatchingFishViewModelScope.getHeight()) {
            CatchingFishDaggerWebsocket();
            postDelayed(this.CatchingFishCardViewView, 600L);
        } else {
            CatchingFishDaggerWebsocket();
            postDelayed(this.CatchingFishMVPRobolectric, 600L);
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        CatchingFishCloudMessaging();
        int i2 = this.CatchingFishAnimationMockk ^ i;
        this.CatchingFishAnimationMockk = i;
        boolean z = (i & 4) == 0;
        boolean z2 = (i & 256) != 0;
        CatchingFishEspressoToolbar catchingFishEspressoToolbar = this.CatchingFishParcelableFlux;
        if (catchingFishEspressoToolbar != null) {
            CatchingFishGraphQLFragment catchingFishGraphQLFragment = (CatchingFishGraphQLFragment) catchingFishEspressoToolbar;
            catchingFishGraphQLFragment.CatchingFishEspressoMockk = !z2;
            if (z || !z2) {
                if (catchingFishGraphQLFragment.CatchingFishDagger) {
                    catchingFishGraphQLFragment.CatchingFishDagger = false;
                    catchingFishGraphQLFragment.CatchingFishAnimation(true);
                }
            } else if (!catchingFishGraphQLFragment.CatchingFishDagger) {
                catchingFishGraphQLFragment.CatchingFishDagger = true;
                catchingFishGraphQLFragment.CatchingFishAnimation(true);
            }
        }
        if ((i2 & 256) == 0 || this.CatchingFishParcelableFlux == null) {
            return;
        }
        WeakHashMap weakHashMap = CatchingFishFABCameraX.CatchingFishParcelableFAB;
        requestApplyInsets();
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.CatchingFishDaggerWebsocket = i;
        CatchingFishEspressoToolbar catchingFishEspressoToolbar = this.CatchingFishParcelableFlux;
        if (catchingFishEspressoToolbar != null) {
            ((CatchingFishGraphQLFragment) catchingFishEspressoToolbar).CatchingFishSensorManager = i;
        }
    }

    public void setActionBarHideOffset(int i) {
        CatchingFishDaggerWebsocket();
        this.CatchingFishViewModelScope.setTranslationY(-Math.max(0, Math.min(i, this.CatchingFishViewModelScope.getHeight())));
    }

    public void setActionBarVisibilityCallback(CatchingFishEspressoToolbar catchingFishEspressoToolbar) {
        this.CatchingFishParcelableFlux = catchingFishEspressoToolbar;
        if (getWindowToken() != null) {
            ((CatchingFishGraphQLFragment) this.CatchingFishParcelableFlux).CatchingFishSensorManager = this.CatchingFishDaggerWebsocket;
            int i = this.CatchingFishAnimationMockk;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                WeakHashMap weakHashMap = CatchingFishFABCameraX.CatchingFishParcelableFAB;
                requestApplyInsets();
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.CatchingFishCloudMessaging = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.CatchingFishEspressoTesting) {
            this.CatchingFishEspressoTesting = z;
            if (z) {
                return;
            }
            CatchingFishDaggerWebsocket();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i) {
        CatchingFishCloudMessaging();
        CatchingFishMVVMAsyncTask catchingFishMVVMAsyncTask = (CatchingFishMVVMAsyncTask) this.CatchingFishViewModelFAB;
        catchingFishMVVMAsyncTask.CatchingFishReduxKtor = i != 0 ? CatchingFishLayoutRoomFAB.CatchingFishCustomView(catchingFishMVVMAsyncTask.CatchingFishParcelableFAB.getContext(), i) : null;
        catchingFishMVVMAsyncTask.CatchingFishCoroutine();
    }

    public void setLogo(int i) {
        CatchingFishCloudMessaging();
        CatchingFishMVVMAsyncTask catchingFishMVVMAsyncTask = (CatchingFishMVVMAsyncTask) this.CatchingFishViewModelFAB;
        catchingFishMVVMAsyncTask.CatchingFishDaggerWebsocket = i != 0 ? CatchingFishLayoutRoomFAB.CatchingFishCustomView(catchingFishMVVMAsyncTask.CatchingFishParcelableFAB.getContext(), i) : null;
        catchingFishMVVMAsyncTask.CatchingFishCoroutine();
    }

    public void setOverlayMode(boolean z) {
        this.CatchingFishFragmentHandler = z;
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    @Override // kotlin.text.CatchingFishOkHttpManifest
    public void setWindowCallback(Window.Callback callback) {
        CatchingFishCloudMessaging();
        ((CatchingFishMVVMAsyncTask) this.CatchingFishViewModelFAB).CatchingFishCloudMessaging = callback;
    }

    @Override // kotlin.text.CatchingFishOkHttpManifest
    public void setWindowTitle(CharSequence charSequence) {
        CatchingFishCloudMessaging();
        CatchingFishMVVMAsyncTask catchingFishMVVMAsyncTask = (CatchingFishMVVMAsyncTask) this.CatchingFishViewModelFAB;
        if (catchingFishMVVMAsyncTask.CatchingFishViewModelScope) {
            return;
        }
        Toolbar toolbar = catchingFishMVVMAsyncTask.CatchingFishParcelableFAB;
        catchingFishMVVMAsyncTask.CatchingFishViewModelFAB = charSequence;
        if ((catchingFishMVVMAsyncTask.CatchingFishSnackbar & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (catchingFishMVVMAsyncTask.CatchingFishViewModelScope) {
                CatchingFishFABCameraX.CatchingFishUnitTesting(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new CatchingFishRedux(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        CatchingFishCloudMessaging();
        CatchingFishMVVMAsyncTask catchingFishMVVMAsyncTask = (CatchingFishMVVMAsyncTask) this.CatchingFishViewModelFAB;
        catchingFishMVVMAsyncTask.CatchingFishReduxKtor = drawable;
        catchingFishMVVMAsyncTask.CatchingFishCoroutine();
    }
}
