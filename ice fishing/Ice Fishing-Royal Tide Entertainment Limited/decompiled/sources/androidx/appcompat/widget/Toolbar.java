package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import com.catchingfish.fishcatcherpro.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.text.CatchingFishAsyncTaskDagger;
import kotlin.text.CatchingFishAsyncTaskView;
import kotlin.text.CatchingFishCustomViewFlux;
import kotlin.text.CatchingFishDataStoreBundle;
import kotlin.text.CatchingFishFABCameraX;
import kotlin.text.CatchingFishFABPicasso;
import kotlin.text.CatchingFishGsonRealm;
import kotlin.text.CatchingFishIntentMVI;
import kotlin.text.CatchingFishKtorAdMob;
import kotlin.text.CatchingFishKtorAdMobJUnit;
import kotlin.text.CatchingFishKtorUnitTesting;
import kotlin.text.CatchingFishLayoutRoomFAB;
import kotlin.text.CatchingFishLiveDataToast;
import kotlin.text.CatchingFishMVISnackbarMVVM;
import kotlin.text.CatchingFishMVPMockkLayout;
import kotlin.text.CatchingFishMVVMAsyncTask;
import kotlin.text.CatchingFishMVVMGraphQL;
import kotlin.text.CatchingFishNavigationView;
import kotlin.text.CatchingFishPicassoCardView;
import kotlin.text.CatchingFishRoomParcelable;
import kotlin.text.CatchingFishSharedFlowAdMob;
import kotlin.text.CatchingFishToast;
import kotlin.text.CatchingFishToolbarCameraX;
import kotlin.text.CatchingFishViewMVIMVVM;
import kotlin.text.CatchingFishViewRealmKtor;
import kotlin.text.CatchingFishViewService;
import kotlin.text.CatchingFishWidgetGlide;

/* loaded from: classes.dex */
public class Toolbar extends ViewGroup {
    public int CatchingFish;
    public int CatchingFishAnimationMockk;
    public final CatchingFishGsonRealm CatchingFishAppCompat;
    public final CatchingFishFABPicasso CatchingFishCameraXIntent;
    public final int CatchingFishCardViewRealm;
    public CharSequence CatchingFishCardViewView;
    public CatchingFishAsyncTaskView CatchingFishCloudMessaging;
    public int CatchingFishCoroutineFlow;
    public ColorStateList CatchingFishCustomView;
    public ArrayList CatchingFishDagger;
    public int CatchingFishDaggerHiltFAB;
    public CatchingFishDataStoreBundle CatchingFishDaggerWebsocket;
    public final CatchingFishAsyncTaskDagger CatchingFishEspressoMockk;
    public View CatchingFishEspressoTesting;
    public boolean CatchingFishFragmentFactory;
    public final CharSequence CatchingFishFragmentHandler;
    public CatchingFishKtorUnitTesting CatchingFishGradleManifest;
    public int CatchingFishGsonAppCompat;
    public CatchingFishMVVMAsyncTask CatchingFishHandler;
    public int CatchingFishJetpackCompose;
    public final ArrayList CatchingFishJobScheduler;
    public final Drawable CatchingFishLayout;
    public OnBackInvokedCallback CatchingFishLayoutInflater;
    public ColorStateList CatchingFishMVPRobolectric;
    public boolean CatchingFishMotionLayout;
    public boolean CatchingFishMutableLiveData;
    public final int CatchingFishNavigation;
    public Context CatchingFishOkHttp;
    public OnBackInvokedDispatcher CatchingFishParcelable;
    public int CatchingFishParcelableFlux;
    public CharSequence CatchingFishPayPal;
    public CatchingFishToast CatchingFishPayPalLiveData;
    public final ArrayList CatchingFishPayPalService;
    public boolean CatchingFishRecyclerView;
    public ActionMenuView CatchingFishReduxKtor;
    public final int CatchingFishRoomDatabase;
    public final int[] CatchingFishSensorManager;
    public CatchingFishNavigationView CatchingFishSpannableWidget;
    public int CatchingFishStateLiveData;
    public int CatchingFishUnitTesting;
    public CatchingFishCustomViewFlux CatchingFishViewModelFAB;
    public CatchingFishAsyncTaskView CatchingFishViewModelScope;
    public CatchingFishDataStoreBundle CatchingFishWorkManager;

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static int CatchingFishCloudMessaging(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    public static int CatchingFishEspressoTesting(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public static CatchingFishMVISnackbarMVVM CatchingFishLayout(ViewGroup.LayoutParams layoutParams) {
        boolean z = layoutParams instanceof CatchingFishMVISnackbarMVVM;
        if (z) {
            CatchingFishMVISnackbarMVVM catchingFishMVISnackbarMVVM = (CatchingFishMVISnackbarMVVM) layoutParams;
            CatchingFishMVISnackbarMVVM catchingFishMVISnackbarMVVM2 = new CatchingFishMVISnackbarMVVM(catchingFishMVISnackbarMVVM);
            catchingFishMVISnackbarMVVM2.CatchingFishSnackbar = 0;
            catchingFishMVISnackbarMVVM2.CatchingFishSnackbar = catchingFishMVISnackbarMVVM.CatchingFishSnackbar;
            return catchingFishMVISnackbarMVVM2;
        }
        if (z) {
            CatchingFishMVISnackbarMVVM catchingFishMVISnackbarMVVM3 = new CatchingFishMVISnackbarMVVM((CatchingFishMVISnackbarMVVM) layoutParams);
            catchingFishMVISnackbarMVVM3.CatchingFishSnackbar = 0;
            return catchingFishMVISnackbarMVVM3;
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            CatchingFishMVISnackbarMVVM catchingFishMVISnackbarMVVM4 = new CatchingFishMVISnackbarMVVM(layoutParams);
            catchingFishMVISnackbarMVVM4.CatchingFishSnackbar = 0;
            return catchingFishMVISnackbarMVVM4;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        CatchingFishMVISnackbarMVVM catchingFishMVISnackbarMVVM5 = new CatchingFishMVISnackbarMVVM(marginLayoutParams);
        catchingFishMVISnackbarMVVM5.CatchingFishSnackbar = 0;
        ((ViewGroup.MarginLayoutParams) catchingFishMVISnackbarMVVM5).leftMargin = marginLayoutParams.leftMargin;
        ((ViewGroup.MarginLayoutParams) catchingFishMVISnackbarMVVM5).topMargin = marginLayoutParams.topMargin;
        ((ViewGroup.MarginLayoutParams) catchingFishMVISnackbarMVVM5).rightMargin = marginLayoutParams.rightMargin;
        ((ViewGroup.MarginLayoutParams) catchingFishMVISnackbarMVVM5).bottomMargin = marginLayoutParams.bottomMargin;
        return catchingFishMVISnackbarMVVM5;
    }

    public static CatchingFishMVISnackbarMVVM CatchingFishViewModelFAB() {
        CatchingFishMVISnackbarMVVM catchingFishMVISnackbarMVVM = new CatchingFishMVISnackbarMVVM(-2, -2);
        catchingFishMVISnackbarMVVM.CatchingFishSnackbar = 0;
        catchingFishMVISnackbarMVVM.CatchingFishParcelableFAB = 8388627;
        return catchingFishMVISnackbarMVVM;
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i = 0; i < menu.size(); i++) {
            arrayList.add(menu.getItem(i));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new CatchingFishPicassoCardView(getContext());
    }

    public final boolean CatchingFish(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public final int CatchingFishAnimationMockk(View view, int i, int i2, int[] iArr) {
        CatchingFishMVISnackbarMVVM catchingFishMVISnackbarMVVM = (CatchingFishMVISnackbarMVVM) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) catchingFishMVISnackbarMVVM).leftMargin - iArr[0];
        int max = Math.max(0, i3) + i;
        iArr[0] = Math.max(0, -i3);
        int CatchingFishFragmentHandler = CatchingFishFragmentHandler(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, CatchingFishFragmentHandler, max + measuredWidth, view.getMeasuredHeight() + CatchingFishFragmentHandler);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) catchingFishMVISnackbarMVVM).rightMargin + max;
    }

    public final void CatchingFishCoroutine() {
        if (this.CatchingFishCloudMessaging == null) {
            CatchingFishAsyncTaskView catchingFishAsyncTaskView = new CatchingFishAsyncTaskView(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.CatchingFishCloudMessaging = catchingFishAsyncTaskView;
            catchingFishAsyncTaskView.setImageDrawable(this.CatchingFishLayout);
            this.CatchingFishCloudMessaging.setContentDescription(this.CatchingFishFragmentHandler);
            CatchingFishMVISnackbarMVVM CatchingFishViewModelFAB = CatchingFishViewModelFAB();
            CatchingFishViewModelFAB.CatchingFishParcelableFAB = (this.CatchingFishRoomDatabase & 112) | 8388611;
            CatchingFishViewModelFAB.CatchingFishSnackbar = 2;
            this.CatchingFishCloudMessaging.setLayoutParams(CatchingFishViewModelFAB);
            this.CatchingFishCloudMessaging.setOnClickListener(new CatchingFishToolbarCameraX(3, this));
        }
    }

    public final void CatchingFishDaggerWebsocket() {
        CatchingFishWorkManager();
        ActionMenuView actionMenuView = this.CatchingFishReduxKtor;
        if (actionMenuView.CatchingFish == null) {
            CatchingFishSharedFlowAdMob catchingFishSharedFlowAdMob = (CatchingFishSharedFlowAdMob) actionMenuView.getMenu();
            if (this.CatchingFishGradleManifest == null) {
                this.CatchingFishGradleManifest = new CatchingFishKtorUnitTesting(this);
            }
            this.CatchingFishReduxKtor.setExpandedActionViewsExclusive(true);
            catchingFishSharedFlowAdMob.CatchingFishSnackbar(this.CatchingFishGradleManifest, this.CatchingFishOkHttp);
            CatchingFishJetpackCompose();
        }
    }

    public final int CatchingFishFragmentHandler(View view, int i) {
        CatchingFishMVISnackbarMVVM catchingFishMVISnackbarMVVM = (CatchingFishMVISnackbarMVVM) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int i3 = catchingFishMVISnackbarMVVM.CatchingFishParcelableFAB & 112;
        if (i3 != 16 && i3 != 48 && i3 != 80) {
            i3 = this.CatchingFishCardViewRealm & 112;
        }
        if (i3 == 48) {
            return getPaddingTop() - i2;
        }
        if (i3 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) catchingFishMVISnackbarMVVM).bottomMargin) - i2;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i4 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i5 = ((ViewGroup.MarginLayoutParams) catchingFishMVISnackbarMVVM).topMargin;
        if (i4 < i5) {
            i4 = i5;
        } else {
            int i6 = (((height - paddingBottom) - measuredHeight) - i4) - paddingTop;
            int i7 = ((ViewGroup.MarginLayoutParams) catchingFishMVISnackbarMVVM).bottomMargin;
            if (i6 < i7) {
                i4 = Math.max(0, i4 - (i7 - i6));
            }
        }
        return paddingTop + i4;
    }

    public final void CatchingFishJetpackCompose() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher CatchingFishParcelableFAB = CatchingFishViewRealmKtor.CatchingFishParcelableFAB(this);
            CatchingFishKtorUnitTesting catchingFishKtorUnitTesting = this.CatchingFishGradleManifest;
            boolean z = (catchingFishKtorUnitTesting == null || catchingFishKtorUnitTesting.CatchingFishDaggerWebsocket == null || CatchingFishParcelableFAB == null || !isAttachedToWindow() || !this.CatchingFishRecyclerView) ? false : true;
            if (z && this.CatchingFishParcelable == null) {
                if (this.CatchingFishLayoutInflater == null) {
                    this.CatchingFishLayoutInflater = CatchingFishViewRealmKtor.CatchingFishSnackbar(new CatchingFishKtorAdMobJUnit(this, 0));
                }
                CatchingFishViewRealmKtor.CatchingFishCoroutine(CatchingFishParcelableFAB, this.CatchingFishLayoutInflater);
                this.CatchingFishParcelable = CatchingFishParcelableFAB;
                return;
            }
            if (z || (onBackInvokedDispatcher = this.CatchingFishParcelable) == null) {
                return;
            }
            CatchingFishViewRealmKtor.CatchingFishReduxKtor(onBackInvokedDispatcher, this.CatchingFishLayoutInflater);
            this.CatchingFishParcelable = null;
        }
    }

    public final void CatchingFishNavigation(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i4 >= 0) {
            if (mode != 0) {
                i4 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i4);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public final void CatchingFishOkHttp() {
        ArrayList arrayList = this.CatchingFishDagger;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            getMenu().removeItem(((MenuItem) obj).getItemId());
        }
        getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        getMenuInflater();
        Iterator it = ((CopyOnWriteArrayList) this.CatchingFishEspressoMockk.CatchingFishViewModelScope).iterator();
        while (it.hasNext()) {
            ((CatchingFishLiveDataToast) it.next()).CatchingFishParcelableFAB.CatchingFishFragmentHandler();
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.CatchingFishDagger = currentMenuItems2;
    }

    public final void CatchingFishParcelableFAB(int i, ArrayList arrayList) {
        boolean z = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i, getLayoutDirection());
        arrayList.clear();
        if (!z) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                CatchingFishMVISnackbarMVVM catchingFishMVISnackbarMVVM = (CatchingFishMVISnackbarMVVM) childAt.getLayoutParams();
                if (catchingFishMVISnackbarMVVM.CatchingFishSnackbar == 0 && CatchingFish(childAt)) {
                    int i3 = catchingFishMVISnackbarMVVM.CatchingFishParcelableFAB;
                    int layoutDirection = getLayoutDirection();
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(i3, layoutDirection) & 7;
                    if (absoluteGravity2 != 1 && absoluteGravity2 != 3 && absoluteGravity2 != 5) {
                        absoluteGravity2 = layoutDirection == 1 ? 5 : 3;
                    }
                    if (absoluteGravity2 == absoluteGravity) {
                        arrayList.add(childAt);
                    }
                }
            }
            return;
        }
        for (int i4 = childCount - 1; i4 >= 0; i4--) {
            View childAt2 = getChildAt(i4);
            CatchingFishMVISnackbarMVVM catchingFishMVISnackbarMVVM2 = (CatchingFishMVISnackbarMVVM) childAt2.getLayoutParams();
            if (catchingFishMVISnackbarMVVM2.CatchingFishSnackbar == 0 && CatchingFish(childAt2)) {
                int i5 = catchingFishMVISnackbarMVVM2.CatchingFishParcelableFAB;
                int layoutDirection2 = getLayoutDirection();
                int absoluteGravity3 = Gravity.getAbsoluteGravity(i5, layoutDirection2) & 7;
                if (absoluteGravity3 != 1 && absoluteGravity3 != 3 && absoluteGravity3 != 5) {
                    absoluteGravity3 = layoutDirection2 == 1 ? 5 : 3;
                }
                if (absoluteGravity3 == absoluteGravity) {
                    arrayList.add(childAt2);
                }
            }
        }
    }

    public final void CatchingFishReduxKtor() {
        if (this.CatchingFishSpannableWidget == null) {
            CatchingFishNavigationView catchingFishNavigationView = new CatchingFishNavigationView();
            catchingFishNavigationView.CatchingFishParcelableFAB = 0;
            catchingFishNavigationView.CatchingFishSnackbar = 0;
            catchingFishNavigationView.CatchingFishCoroutine = Integer.MIN_VALUE;
            catchingFishNavigationView.CatchingFishReduxKtor = Integer.MIN_VALUE;
            catchingFishNavigationView.CatchingFishDaggerWebsocket = 0;
            catchingFishNavigationView.CatchingFishWorkManager = 0;
            catchingFishNavigationView.CatchingFishViewModelScope = false;
            catchingFishNavigationView.CatchingFishViewModelFAB = false;
            this.CatchingFishSpannableWidget = catchingFishNavigationView;
        }
    }

    public final int CatchingFishRoomDatabase(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i6) + Math.max(0, i5);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + max + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    public final void CatchingFishSnackbar(View view, boolean z) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        CatchingFishMVISnackbarMVVM CatchingFishViewModelFAB = layoutParams == null ? CatchingFishViewModelFAB() : !checkLayoutParams(layoutParams) ? CatchingFishLayout(layoutParams) : (CatchingFishMVISnackbarMVVM) layoutParams;
        CatchingFishViewModelFAB.CatchingFishSnackbar = 1;
        if (!z || this.CatchingFishEspressoTesting == null) {
            addView(view, CatchingFishViewModelFAB);
        } else {
            view.setLayoutParams(CatchingFishViewModelFAB);
            this.CatchingFishPayPalService.add(view);
        }
    }

    public final int CatchingFishStateLiveData(View view, int i, int i2, int[] iArr) {
        CatchingFishMVISnackbarMVVM catchingFishMVISnackbarMVVM = (CatchingFishMVISnackbarMVVM) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) catchingFishMVISnackbarMVVM).rightMargin - iArr[1];
        int max = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int CatchingFishFragmentHandler = CatchingFishFragmentHandler(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, CatchingFishFragmentHandler, max, view.getMeasuredHeight() + CatchingFishFragmentHandler);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) catchingFishMVISnackbarMVVM).leftMargin);
    }

    public final boolean CatchingFishUnitTesting(View view) {
        return view.getParent() == this || this.CatchingFishPayPalService.contains(view);
    }

    public final void CatchingFishViewModelScope() {
        if (this.CatchingFishViewModelScope == null) {
            this.CatchingFishViewModelScope = new CatchingFishAsyncTaskView(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            CatchingFishMVISnackbarMVVM CatchingFishViewModelFAB = CatchingFishViewModelFAB();
            CatchingFishViewModelFAB.CatchingFishParcelableFAB = (this.CatchingFishRoomDatabase & 112) | 8388611;
            this.CatchingFishViewModelScope.setLayoutParams(CatchingFishViewModelFAB);
        }
    }

    public final void CatchingFishWorkManager() {
        if (this.CatchingFishReduxKtor == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.CatchingFishReduxKtor = actionMenuView;
            actionMenuView.setPopupTheme(this.CatchingFishUnitTesting);
            this.CatchingFishReduxKtor.setOnMenuItemClickListener(this.CatchingFishCameraXIntent);
            ActionMenuView actionMenuView2 = this.CatchingFishReduxKtor;
            CatchingFishFABPicasso catchingFishFABPicasso = new CatchingFishFABPicasso(this);
            actionMenuView2.getClass();
            actionMenuView2.CatchingFishParcelableFlux = catchingFishFABPicasso;
            CatchingFishMVISnackbarMVVM CatchingFishViewModelFAB = CatchingFishViewModelFAB();
            CatchingFishViewModelFAB.CatchingFishParcelableFAB = (this.CatchingFishRoomDatabase & 112) | 8388613;
            this.CatchingFishReduxKtor.setLayoutParams(CatchingFishViewModelFAB);
            CatchingFishSnackbar(this.CatchingFishReduxKtor, false);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof CatchingFishMVISnackbarMVVM);
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return CatchingFishViewModelFAB();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return CatchingFishLayout(layoutParams);
    }

    public CharSequence getCollapseContentDescription() {
        CatchingFishAsyncTaskView catchingFishAsyncTaskView = this.CatchingFishCloudMessaging;
        if (catchingFishAsyncTaskView != null) {
            return catchingFishAsyncTaskView.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        CatchingFishAsyncTaskView catchingFishAsyncTaskView = this.CatchingFishCloudMessaging;
        if (catchingFishAsyncTaskView != null) {
            return catchingFishAsyncTaskView.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        CatchingFishNavigationView catchingFishNavigationView = this.CatchingFishSpannableWidget;
        if (catchingFishNavigationView != null) {
            return catchingFishNavigationView.CatchingFishViewModelScope ? catchingFishNavigationView.CatchingFishParcelableFAB : catchingFishNavigationView.CatchingFishSnackbar;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.CatchingFishGsonAppCompat;
        return i != Integer.MIN_VALUE ? i : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        CatchingFishNavigationView catchingFishNavigationView = this.CatchingFishSpannableWidget;
        if (catchingFishNavigationView != null) {
            return catchingFishNavigationView.CatchingFishParcelableFAB;
        }
        return 0;
    }

    public int getContentInsetRight() {
        CatchingFishNavigationView catchingFishNavigationView = this.CatchingFishSpannableWidget;
        if (catchingFishNavigationView != null) {
            return catchingFishNavigationView.CatchingFishSnackbar;
        }
        return 0;
    }

    public int getContentInsetStart() {
        CatchingFishNavigationView catchingFishNavigationView = this.CatchingFishSpannableWidget;
        if (catchingFishNavigationView != null) {
            return catchingFishNavigationView.CatchingFishViewModelScope ? catchingFishNavigationView.CatchingFishSnackbar : catchingFishNavigationView.CatchingFishParcelableFAB;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.CatchingFishParcelableFlux;
        return i != Integer.MIN_VALUE ? i : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        CatchingFishSharedFlowAdMob catchingFishSharedFlowAdMob;
        ActionMenuView actionMenuView = this.CatchingFishReduxKtor;
        return (actionMenuView == null || (catchingFishSharedFlowAdMob = actionMenuView.CatchingFish) == null || !catchingFishSharedFlowAdMob.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.CatchingFishGsonAppCompat, 0));
    }

    public int getCurrentContentInsetLeft() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.CatchingFishParcelableFlux, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        CatchingFishCustomViewFlux catchingFishCustomViewFlux = this.CatchingFishViewModelFAB;
        if (catchingFishCustomViewFlux != null) {
            return catchingFishCustomViewFlux.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        CatchingFishCustomViewFlux catchingFishCustomViewFlux = this.CatchingFishViewModelFAB;
        if (catchingFishCustomViewFlux != null) {
            return catchingFishCustomViewFlux.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        CatchingFishDaggerWebsocket();
        return this.CatchingFishReduxKtor.getMenu();
    }

    public View getNavButtonView() {
        return this.CatchingFishViewModelScope;
    }

    public CharSequence getNavigationContentDescription() {
        CatchingFishAsyncTaskView catchingFishAsyncTaskView = this.CatchingFishViewModelScope;
        if (catchingFishAsyncTaskView != null) {
            return catchingFishAsyncTaskView.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        CatchingFishAsyncTaskView catchingFishAsyncTaskView = this.CatchingFishViewModelScope;
        if (catchingFishAsyncTaskView != null) {
            return catchingFishAsyncTaskView.getDrawable();
        }
        return null;
    }

    public CatchingFishToast getOuterActionMenuPresenter() {
        return this.CatchingFishPayPalLiveData;
    }

    public Drawable getOverflowIcon() {
        CatchingFishDaggerWebsocket();
        return this.CatchingFishReduxKtor.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.CatchingFishOkHttp;
    }

    public int getPopupTheme() {
        return this.CatchingFishUnitTesting;
    }

    public CharSequence getSubtitle() {
        return this.CatchingFishCardViewView;
    }

    public final TextView getSubtitleTextView() {
        return this.CatchingFishWorkManager;
    }

    public CharSequence getTitle() {
        return this.CatchingFishPayPal;
    }

    public int getTitleMarginBottom() {
        return this.CatchingFishDaggerHiltFAB;
    }

    public int getTitleMarginEnd() {
        return this.CatchingFishJetpackCompose;
    }

    public int getTitleMarginStart() {
        return this.CatchingFish;
    }

    public int getTitleMarginTop() {
        return this.CatchingFishCoroutineFlow;
    }

    public final TextView getTitleTextView() {
        return this.CatchingFishDaggerWebsocket;
    }

    public CatchingFishIntentMVI getWrapper() {
        Drawable drawable;
        if (this.CatchingFishHandler == null) {
            CatchingFishMVVMAsyncTask catchingFishMVVMAsyncTask = new CatchingFishMVVMAsyncTask();
            catchingFishMVVMAsyncTask.CatchingFishUnitTesting = 0;
            catchingFishMVVMAsyncTask.CatchingFishParcelableFAB = this;
            catchingFishMVVMAsyncTask.CatchingFishViewModelFAB = getTitle();
            catchingFishMVVMAsyncTask.CatchingFishLayout = getSubtitle();
            catchingFishMVVMAsyncTask.CatchingFishViewModelScope = catchingFishMVVMAsyncTask.CatchingFishViewModelFAB != null;
            catchingFishMVVMAsyncTask.CatchingFishWorkManager = getNavigationIcon();
            CatchingFishAsyncTaskDagger CatchingFishRecyclerView = CatchingFishAsyncTaskDagger.CatchingFishRecyclerView(getContext(), null, CatchingFishWidgetGlide.CatchingFishParcelableFAB, R.attr.actionBarStyle);
            TypedArray typedArray = (TypedArray) CatchingFishRecyclerView.CatchingFishDaggerWebsocket;
            catchingFishMVVMAsyncTask.CatchingFishAnimationMockk = CatchingFishRecyclerView.CatchingFishMutableLiveData(15);
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                catchingFishMVVMAsyncTask.CatchingFishViewModelScope = true;
                Toolbar toolbar = catchingFishMVVMAsyncTask.CatchingFishParcelableFAB;
                catchingFishMVVMAsyncTask.CatchingFishViewModelFAB = text;
                if ((catchingFishMVVMAsyncTask.CatchingFishSnackbar & 8) != 0) {
                    toolbar.setTitle(text);
                    if (catchingFishMVVMAsyncTask.CatchingFishViewModelScope) {
                        CatchingFishFABCameraX.CatchingFishUnitTesting(toolbar.getRootView(), text);
                    }
                }
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                catchingFishMVVMAsyncTask.CatchingFishLayout = text2;
                if ((catchingFishMVVMAsyncTask.CatchingFishSnackbar & 8) != 0) {
                    setSubtitle(text2);
                }
            }
            Drawable CatchingFishMutableLiveData = CatchingFishRecyclerView.CatchingFishMutableLiveData(20);
            if (CatchingFishMutableLiveData != null) {
                catchingFishMVVMAsyncTask.CatchingFishDaggerWebsocket = CatchingFishMutableLiveData;
                catchingFishMVVMAsyncTask.CatchingFishCoroutine();
            }
            Drawable CatchingFishMutableLiveData2 = CatchingFishRecyclerView.CatchingFishMutableLiveData(17);
            if (CatchingFishMutableLiveData2 != null) {
                catchingFishMVVMAsyncTask.CatchingFishReduxKtor = CatchingFishMutableLiveData2;
                catchingFishMVVMAsyncTask.CatchingFishCoroutine();
            }
            if (catchingFishMVVMAsyncTask.CatchingFishWorkManager == null && (drawable = catchingFishMVVMAsyncTask.CatchingFishAnimationMockk) != null) {
                catchingFishMVVMAsyncTask.CatchingFishWorkManager = drawable;
                Toolbar toolbar2 = catchingFishMVVMAsyncTask.CatchingFishParcelableFAB;
                if ((catchingFishMVVMAsyncTask.CatchingFishSnackbar & 4) != 0) {
                    toolbar2.setNavigationIcon(drawable);
                } else {
                    toolbar2.setNavigationIcon((Drawable) null);
                }
            }
            catchingFishMVVMAsyncTask.CatchingFishParcelableFAB(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                View inflate = LayoutInflater.from(getContext()).inflate(resourceId, (ViewGroup) this, false);
                View view = catchingFishMVVMAsyncTask.CatchingFishCoroutine;
                if (view != null && (catchingFishMVVMAsyncTask.CatchingFishSnackbar & 16) != 0) {
                    removeView(view);
                }
                catchingFishMVVMAsyncTask.CatchingFishCoroutine = inflate;
                if (inflate != null && (catchingFishMVVMAsyncTask.CatchingFishSnackbar & 16) != 0) {
                    addView(inflate);
                }
                catchingFishMVVMAsyncTask.CatchingFishParcelableFAB(catchingFishMVVMAsyncTask.CatchingFishSnackbar | 16);
            }
            int layoutDimension = typedArray.getLayoutDimension(13, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                layoutParams.height = layoutDimension;
                setLayoutParams(layoutParams);
            }
            int dimensionPixelOffset = typedArray.getDimensionPixelOffset(7, -1);
            int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(3, -1);
            if (dimensionPixelOffset >= 0 || dimensionPixelOffset2 >= 0) {
                int max = Math.max(dimensionPixelOffset, 0);
                int max2 = Math.max(dimensionPixelOffset2, 0);
                CatchingFishReduxKtor();
                this.CatchingFishSpannableWidget.CatchingFishParcelableFAB(max, max2);
            }
            int resourceId2 = typedArray.getResourceId(28, 0);
            if (resourceId2 != 0) {
                Context context = getContext();
                this.CatchingFishAnimationMockk = resourceId2;
                CatchingFishDataStoreBundle catchingFishDataStoreBundle = this.CatchingFishDaggerWebsocket;
                if (catchingFishDataStoreBundle != null) {
                    catchingFishDataStoreBundle.setTextAppearance(context, resourceId2);
                }
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                Context context2 = getContext();
                this.CatchingFishStateLiveData = resourceId3;
                CatchingFishDataStoreBundle catchingFishDataStoreBundle2 = this.CatchingFishWorkManager;
                if (catchingFishDataStoreBundle2 != null) {
                    catchingFishDataStoreBundle2.setTextAppearance(context2, resourceId3);
                }
            }
            int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0) {
                setPopupTheme(resourceId4);
            }
            CatchingFishRecyclerView.CatchingFishAnimation();
            if (R.string.abc_action_bar_up_description != catchingFishMVVMAsyncTask.CatchingFishUnitTesting) {
                catchingFishMVVMAsyncTask.CatchingFishUnitTesting = R.string.abc_action_bar_up_description;
                if (TextUtils.isEmpty(getNavigationContentDescription())) {
                    int i = catchingFishMVVMAsyncTask.CatchingFishUnitTesting;
                    catchingFishMVVMAsyncTask.CatchingFishFragmentHandler = i != 0 ? getContext().getString(i) : null;
                    catchingFishMVVMAsyncTask.CatchingFishSnackbar();
                }
            }
            catchingFishMVVMAsyncTask.CatchingFishFragmentHandler = getNavigationContentDescription();
            setNavigationOnClickListener(new CatchingFishViewService(catchingFishMVVMAsyncTask));
            this.CatchingFishHandler = catchingFishMVVMAsyncTask;
        }
        return this.CatchingFishHandler;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        CatchingFishJetpackCompose();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.CatchingFishAppCompat);
        CatchingFishJetpackCompose();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.CatchingFishMutableLiveData = false;
        }
        if (!this.CatchingFishMutableLiveData) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.CatchingFishMutableLiveData = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.CatchingFishMutableLiveData = false;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x028f A[LOOP:0: B:39:0x028d->B:40:0x028f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x02a7 A[LOOP:1: B:43:0x02a5->B:44:0x02a7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x02c7 A[LOOP:2: B:47:0x02c5->B:48:0x02c7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x031a A[LOOP:3: B:56:0x0318->B:57:0x031a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0218  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int max;
        boolean CatchingFish;
        boolean CatchingFish2;
        boolean z2;
        int i7;
        int i8;
        int paddingTop;
        int i9;
        int i10;
        int i11;
        int i12;
        int size;
        int i13;
        int i14;
        int size2;
        int i15;
        int size3;
        int i16;
        int i17;
        int i18;
        int size4;
        boolean z3 = getLayoutDirection() == 1;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop2 = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i19 = width - paddingRight;
        int[] iArr = this.CatchingFishSensorManager;
        iArr[1] = 0;
        iArr[0] = 0;
        WeakHashMap weakHashMap = CatchingFishFABCameraX.CatchingFishParcelableFAB;
        int minimumHeight = getMinimumHeight();
        int min = minimumHeight >= 0 ? Math.min(minimumHeight, i4 - i2) : 0;
        if (!CatchingFish(this.CatchingFishViewModelScope)) {
            i5 = paddingLeft;
        } else {
            if (z3) {
                i6 = CatchingFishStateLiveData(this.CatchingFishViewModelScope, i19, min, iArr);
                i5 = paddingLeft;
                if (CatchingFish(this.CatchingFishCloudMessaging)) {
                    if (z3) {
                        i6 = CatchingFishStateLiveData(this.CatchingFishCloudMessaging, i6, min, iArr);
                    } else {
                        i5 = CatchingFishAnimationMockk(this.CatchingFishCloudMessaging, i5, min, iArr);
                    }
                }
                if (CatchingFish(this.CatchingFishReduxKtor)) {
                    if (z3) {
                        i5 = CatchingFishAnimationMockk(this.CatchingFishReduxKtor, i5, min, iArr);
                    } else {
                        i6 = CatchingFishStateLiveData(this.CatchingFishReduxKtor, i6, min, iArr);
                    }
                }
                int currentContentInsetLeft = getCurrentContentInsetLeft();
                int currentContentInsetRight = getCurrentContentInsetRight();
                iArr[0] = Math.max(0, currentContentInsetLeft - i5);
                iArr[1] = Math.max(0, currentContentInsetRight - (i19 - i6));
                max = Math.max(i5, currentContentInsetLeft);
                int min2 = Math.min(i6, i19 - currentContentInsetRight);
                if (CatchingFish(this.CatchingFishEspressoTesting)) {
                    if (z3) {
                        min2 = CatchingFishStateLiveData(this.CatchingFishEspressoTesting, min2, min, iArr);
                    } else {
                        max = CatchingFishAnimationMockk(this.CatchingFishEspressoTesting, max, min, iArr);
                    }
                }
                if (CatchingFish(this.CatchingFishViewModelFAB)) {
                    if (z3) {
                        min2 = CatchingFishStateLiveData(this.CatchingFishViewModelFAB, min2, min, iArr);
                    } else {
                        max = CatchingFishAnimationMockk(this.CatchingFishViewModelFAB, max, min, iArr);
                    }
                }
                CatchingFish = CatchingFish(this.CatchingFishDaggerWebsocket);
                CatchingFish2 = CatchingFish(this.CatchingFishWorkManager);
                if (CatchingFish) {
                    z2 = z3;
                    i7 = 0;
                } else {
                    CatchingFishMVISnackbarMVVM catchingFishMVISnackbarMVVM = (CatchingFishMVISnackbarMVVM) this.CatchingFishDaggerWebsocket.getLayoutParams();
                    z2 = z3;
                    i7 = this.CatchingFishDaggerWebsocket.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) catchingFishMVISnackbarMVVM).topMargin + ((ViewGroup.MarginLayoutParams) catchingFishMVISnackbarMVVM).bottomMargin;
                }
                if (!CatchingFish2) {
                    CatchingFishMVISnackbarMVVM catchingFishMVISnackbarMVVM2 = (CatchingFishMVISnackbarMVVM) this.CatchingFishWorkManager.getLayoutParams();
                    i7 = this.CatchingFishWorkManager.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) catchingFishMVISnackbarMVVM2).topMargin + ((ViewGroup.MarginLayoutParams) catchingFishMVISnackbarMVVM2).bottomMargin + i7;
                }
                if (!CatchingFish || CatchingFish2) {
                    CatchingFishDataStoreBundle catchingFishDataStoreBundle = !CatchingFish ? this.CatchingFishDaggerWebsocket : this.CatchingFishWorkManager;
                    CatchingFishDataStoreBundle catchingFishDataStoreBundle2 = !CatchingFish2 ? this.CatchingFishWorkManager : this.CatchingFishDaggerWebsocket;
                    CatchingFishMVISnackbarMVVM catchingFishMVISnackbarMVVM3 = (CatchingFishMVISnackbarMVVM) catchingFishDataStoreBundle.getLayoutParams();
                    CatchingFishMVISnackbarMVVM catchingFishMVISnackbarMVVM4 = (CatchingFishMVISnackbarMVVM) catchingFishDataStoreBundle2.getLayoutParams();
                    int i20 = i7;
                    boolean z4 = (!CatchingFish && this.CatchingFishDaggerWebsocket.getMeasuredWidth() > 0) || (CatchingFish2 && this.CatchingFishWorkManager.getMeasuredWidth() > 0);
                    i8 = this.CatchingFishCardViewRealm & 112;
                    int i21 = max;
                    if (i8 != 48) {
                        paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) catchingFishMVISnackbarMVVM3).topMargin + this.CatchingFishCoroutineFlow;
                    } else if (i8 != 80) {
                        int i22 = (((height - paddingTop2) - paddingBottom) - i20) / 2;
                        int i23 = ((ViewGroup.MarginLayoutParams) catchingFishMVISnackbarMVVM3).topMargin + this.CatchingFishCoroutineFlow;
                        if (i22 < i23) {
                            i22 = i23;
                        } else {
                            int i24 = (((height - paddingBottom) - i20) - i22) - paddingTop2;
                            int i25 = ((ViewGroup.MarginLayoutParams) catchingFishMVISnackbarMVVM3).bottomMargin;
                            int i26 = this.CatchingFishDaggerHiltFAB;
                            if (i24 < i25 + i26) {
                                i22 = Math.max(0, i22 - ((((ViewGroup.MarginLayoutParams) catchingFishMVISnackbarMVVM4).bottomMargin + i26) - i24));
                            }
                        }
                        paddingTop = paddingTop2 + i22;
                    } else {
                        paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) catchingFishMVISnackbarMVVM4).bottomMargin) - this.CatchingFishDaggerHiltFAB) - i20;
                    }
                    if (z2) {
                        int i27 = (z4 ? this.CatchingFish : 0) - iArr[0];
                        max = Math.max(0, i27) + i21;
                        iArr[0] = Math.max(0, -i27);
                        if (CatchingFish) {
                            CatchingFishMVISnackbarMVVM catchingFishMVISnackbarMVVM5 = (CatchingFishMVISnackbarMVVM) this.CatchingFishDaggerWebsocket.getLayoutParams();
                            int measuredWidth = this.CatchingFishDaggerWebsocket.getMeasuredWidth() + max;
                            int measuredHeight = this.CatchingFishDaggerWebsocket.getMeasuredHeight() + paddingTop;
                            this.CatchingFishDaggerWebsocket.layout(max, paddingTop, measuredWidth, measuredHeight);
                            i9 = measuredWidth + this.CatchingFishJetpackCompose;
                            paddingTop = measuredHeight + ((ViewGroup.MarginLayoutParams) catchingFishMVISnackbarMVVM5).bottomMargin;
                        } else {
                            i9 = max;
                        }
                        if (CatchingFish2) {
                            int i28 = paddingTop + ((ViewGroup.MarginLayoutParams) ((CatchingFishMVISnackbarMVVM) this.CatchingFishWorkManager.getLayoutParams())).topMargin;
                            int measuredWidth2 = this.CatchingFishWorkManager.getMeasuredWidth() + max;
                            this.CatchingFishWorkManager.layout(max, i28, measuredWidth2, this.CatchingFishWorkManager.getMeasuredHeight() + i28);
                            i10 = measuredWidth2 + this.CatchingFishJetpackCompose;
                        } else {
                            i10 = max;
                        }
                        if (z4) {
                            max = Math.max(i9, i10);
                        }
                    } else {
                        int i29 = (z4 ? this.CatchingFish : 0) - iArr[1];
                        min2 -= Math.max(0, i29);
                        iArr[1] = Math.max(0, -i29);
                        if (CatchingFish) {
                            CatchingFishMVISnackbarMVVM catchingFishMVISnackbarMVVM6 = (CatchingFishMVISnackbarMVVM) this.CatchingFishDaggerWebsocket.getLayoutParams();
                            int measuredWidth3 = min2 - this.CatchingFishDaggerWebsocket.getMeasuredWidth();
                            int measuredHeight2 = this.CatchingFishDaggerWebsocket.getMeasuredHeight() + paddingTop;
                            this.CatchingFishDaggerWebsocket.layout(measuredWidth3, paddingTop, min2, measuredHeight2);
                            i11 = measuredWidth3 - this.CatchingFishJetpackCompose;
                            paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) catchingFishMVISnackbarMVVM6).bottomMargin;
                        } else {
                            i11 = min2;
                        }
                        if (CatchingFish2) {
                            int i30 = paddingTop + ((ViewGroup.MarginLayoutParams) ((CatchingFishMVISnackbarMVVM) this.CatchingFishWorkManager.getLayoutParams())).topMargin;
                            this.CatchingFishWorkManager.layout(min2 - this.CatchingFishWorkManager.getMeasuredWidth(), i30, min2, this.CatchingFishWorkManager.getMeasuredHeight() + i30);
                            i12 = min2 - this.CatchingFishJetpackCompose;
                        } else {
                            i12 = min2;
                        }
                        if (z4) {
                            min2 = Math.min(i11, i12);
                        }
                        max = i21;
                    }
                }
                ArrayList arrayList = this.CatchingFishJobScheduler;
                CatchingFishParcelableFAB(3, arrayList);
                size = arrayList.size();
                i13 = max;
                for (i14 = 0; i14 < size; i14++) {
                    i13 = CatchingFishAnimationMockk((View) arrayList.get(i14), i13, min, iArr);
                }
                CatchingFishParcelableFAB(5, arrayList);
                size2 = arrayList.size();
                for (i15 = 0; i15 < size2; i15++) {
                    min2 = CatchingFishStateLiveData((View) arrayList.get(i15), min2, min, iArr);
                }
                CatchingFishParcelableFAB(1, arrayList);
                int i31 = iArr[0];
                int i32 = iArr[1];
                size3 = arrayList.size();
                int i33 = i31;
                i16 = 0;
                int i34 = 0;
                while (i16 < size3) {
                    View view = (View) arrayList.get(i16);
                    CatchingFishMVISnackbarMVVM catchingFishMVISnackbarMVVM7 = (CatchingFishMVISnackbarMVVM) view.getLayoutParams();
                    int i35 = i32;
                    int i36 = ((ViewGroup.MarginLayoutParams) catchingFishMVISnackbarMVVM7).leftMargin - i33;
                    int i37 = ((ViewGroup.MarginLayoutParams) catchingFishMVISnackbarMVVM7).rightMargin - i35;
                    int max2 = Math.max(0, i36);
                    int max3 = Math.max(0, i37);
                    int max4 = Math.max(0, -i36);
                    int max5 = Math.max(0, -i37);
                    i34 += view.getMeasuredWidth() + max2 + max3;
                    i16++;
                    i33 = max4;
                    i32 = max5;
                }
                i18 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (i34 / 2);
                int i38 = i34 + i18;
                if (i18 >= i13) {
                    i13 = i38 > min2 ? i18 - (i38 - min2) : i18;
                }
                size4 = arrayList.size();
                for (i17 = 0; i17 < size4; i17++) {
                    i13 = CatchingFishAnimationMockk((View) arrayList.get(i17), i13, min, iArr);
                }
                arrayList.clear();
            }
            i5 = CatchingFishAnimationMockk(this.CatchingFishViewModelScope, paddingLeft, min, iArr);
        }
        i6 = i19;
        if (CatchingFish(this.CatchingFishCloudMessaging)) {
        }
        if (CatchingFish(this.CatchingFishReduxKtor)) {
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - i5);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i19 - i6));
        max = Math.max(i5, currentContentInsetLeft2);
        int min22 = Math.min(i6, i19 - currentContentInsetRight2);
        if (CatchingFish(this.CatchingFishEspressoTesting)) {
        }
        if (CatchingFish(this.CatchingFishViewModelFAB)) {
        }
        CatchingFish = CatchingFish(this.CatchingFishDaggerWebsocket);
        CatchingFish2 = CatchingFish(this.CatchingFishWorkManager);
        if (CatchingFish) {
        }
        if (!CatchingFish2) {
        }
        if (!CatchingFish) {
        }
        if (!CatchingFish) {
        }
        if (!CatchingFish2) {
        }
        CatchingFishMVISnackbarMVVM catchingFishMVISnackbarMVVM32 = (CatchingFishMVISnackbarMVVM) catchingFishDataStoreBundle.getLayoutParams();
        CatchingFishMVISnackbarMVVM catchingFishMVISnackbarMVVM42 = (CatchingFishMVISnackbarMVVM) catchingFishDataStoreBundle2.getLayoutParams();
        int i202 = i7;
        if (CatchingFish) {
        }
        i8 = this.CatchingFishCardViewRealm & 112;
        int i212 = max;
        if (i8 != 48) {
        }
        if (z2) {
        }
        ArrayList arrayList2 = this.CatchingFishJobScheduler;
        CatchingFishParcelableFAB(3, arrayList2);
        size = arrayList2.size();
        i13 = max;
        while (i14 < size) {
        }
        CatchingFishParcelableFAB(5, arrayList2);
        size2 = arrayList2.size();
        while (i15 < size2) {
        }
        CatchingFishParcelableFAB(1, arrayList2);
        int i312 = iArr[0];
        int i322 = iArr[1];
        size3 = arrayList2.size();
        int i332 = i312;
        i16 = 0;
        int i342 = 0;
        while (i16 < size3) {
        }
        i18 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (i342 / 2);
        int i382 = i342 + i18;
        if (i18 >= i13) {
        }
        size4 = arrayList2.size();
        while (i17 < size4) {
        }
        arrayList2.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        char c;
        Object[] objArr;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z = CatchingFishMVVMGraphQL.CatchingFishParcelableFAB;
        int i10 = 0;
        if (getLayoutDirection() == 1) {
            objArr = true;
            c = 0;
        } else {
            c = 1;
            objArr = false;
        }
        if (CatchingFish(this.CatchingFishViewModelScope)) {
            CatchingFishNavigation(this.CatchingFishViewModelScope, i, 0, i2, this.CatchingFishNavigation);
            i3 = CatchingFishCloudMessaging(this.CatchingFishViewModelScope) + this.CatchingFishViewModelScope.getMeasuredWidth();
            i4 = Math.max(0, CatchingFishEspressoTesting(this.CatchingFishViewModelScope) + this.CatchingFishViewModelScope.getMeasuredHeight());
            i5 = View.combineMeasuredStates(0, this.CatchingFishViewModelScope.getMeasuredState());
        } else {
            i3 = 0;
            i4 = 0;
            i5 = 0;
        }
        if (CatchingFish(this.CatchingFishCloudMessaging)) {
            CatchingFishNavigation(this.CatchingFishCloudMessaging, i, 0, i2, this.CatchingFishNavigation);
            i3 = CatchingFishCloudMessaging(this.CatchingFishCloudMessaging) + this.CatchingFishCloudMessaging.getMeasuredWidth();
            i4 = Math.max(i4, CatchingFishEspressoTesting(this.CatchingFishCloudMessaging) + this.CatchingFishCloudMessaging.getMeasuredHeight());
            i5 = View.combineMeasuredStates(i5, this.CatchingFishCloudMessaging.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = Math.max(currentContentInsetStart, i3);
        int max2 = Math.max(0, currentContentInsetStart - i3);
        Object[] objArr2 = objArr;
        int[] iArr = this.CatchingFishSensorManager;
        iArr[objArr2 == true ? 1 : 0] = max2;
        if (CatchingFish(this.CatchingFishReduxKtor)) {
            CatchingFishNavigation(this.CatchingFishReduxKtor, i, max, i2, this.CatchingFishNavigation);
            i6 = CatchingFishCloudMessaging(this.CatchingFishReduxKtor) + this.CatchingFishReduxKtor.getMeasuredWidth();
            i4 = Math.max(i4, CatchingFishEspressoTesting(this.CatchingFishReduxKtor) + this.CatchingFishReduxKtor.getMeasuredHeight());
            i5 = View.combineMeasuredStates(i5, this.CatchingFishReduxKtor.getMeasuredState());
        } else {
            i6 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max3 = max + Math.max(currentContentInsetEnd, i6);
        iArr[c] = Math.max(0, currentContentInsetEnd - i6);
        if (CatchingFish(this.CatchingFishEspressoTesting)) {
            max3 += CatchingFishRoomDatabase(this.CatchingFishEspressoTesting, i, max3, i2, 0, iArr);
            i4 = Math.max(i4, CatchingFishEspressoTesting(this.CatchingFishEspressoTesting) + this.CatchingFishEspressoTesting.getMeasuredHeight());
            i5 = View.combineMeasuredStates(i5, this.CatchingFishEspressoTesting.getMeasuredState());
        }
        if (CatchingFish(this.CatchingFishViewModelFAB)) {
            max3 += CatchingFishRoomDatabase(this.CatchingFishViewModelFAB, i, max3, i2, 0, iArr);
            i4 = Math.max(i4, CatchingFishEspressoTesting(this.CatchingFishViewModelFAB) + this.CatchingFishViewModelFAB.getMeasuredHeight());
            i5 = View.combineMeasuredStates(i5, this.CatchingFishViewModelFAB.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (((CatchingFishMVISnackbarMVVM) childAt.getLayoutParams()).CatchingFishSnackbar == 0 && CatchingFish(childAt)) {
                max3 += CatchingFishRoomDatabase(childAt, i, max3, i2, 0, iArr);
                int max4 = Math.max(i4, CatchingFishEspressoTesting(childAt) + childAt.getMeasuredHeight());
                i5 = View.combineMeasuredStates(i5, childAt.getMeasuredState());
                i4 = max4;
            } else {
                max3 = max3;
            }
        }
        int i12 = max3;
        int i13 = this.CatchingFishCoroutineFlow + this.CatchingFishDaggerHiltFAB;
        int i14 = this.CatchingFish + this.CatchingFishJetpackCompose;
        if (CatchingFish(this.CatchingFishDaggerWebsocket)) {
            CatchingFishRoomDatabase(this.CatchingFishDaggerWebsocket, i, i12 + i14, i2, i13, iArr);
            int CatchingFishCloudMessaging = CatchingFishCloudMessaging(this.CatchingFishDaggerWebsocket) + this.CatchingFishDaggerWebsocket.getMeasuredWidth();
            i7 = CatchingFishEspressoTesting(this.CatchingFishDaggerWebsocket) + this.CatchingFishDaggerWebsocket.getMeasuredHeight();
            i8 = View.combineMeasuredStates(i5, this.CatchingFishDaggerWebsocket.getMeasuredState());
            i9 = CatchingFishCloudMessaging;
        } else {
            i7 = 0;
            i8 = i5;
            i9 = 0;
        }
        if (CatchingFish(this.CatchingFishWorkManager)) {
            i9 = Math.max(i9, CatchingFishRoomDatabase(this.CatchingFishWorkManager, i, i12 + i14, i2, i13 + i7, iArr));
            i7 += CatchingFishEspressoTesting(this.CatchingFishWorkManager) + this.CatchingFishWorkManager.getMeasuredHeight();
            i8 = View.combineMeasuredStates(i8, this.CatchingFishWorkManager.getMeasuredState());
        }
        int max5 = Math.max(i4, i7);
        int paddingRight = getPaddingRight() + getPaddingLeft() + i12 + i9;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + max5;
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i, (-16777216) & i8);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i2, i8 << 16);
        if (this.CatchingFishMotionLayout) {
            int childCount2 = getChildCount();
            for (int i15 = 0; i15 < childCount2; i15++) {
                View childAt2 = getChildAt(i15);
                if (!CatchingFish(childAt2) || childAt2.getMeasuredWidth() <= 0 || childAt2.getMeasuredHeight() <= 0) {
                }
            }
            setMeasuredDimension(resolveSizeAndState, i10);
        }
        i10 = resolveSizeAndState2;
        setMeasuredDimension(resolveSizeAndState, i10);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof CatchingFishMVPMockkLayout)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        CatchingFishMVPMockkLayout catchingFishMVPMockkLayout = (CatchingFishMVPMockkLayout) parcelable;
        super.onRestoreInstanceState(catchingFishMVPMockkLayout.CatchingFishReduxKtor);
        ActionMenuView actionMenuView = this.CatchingFishReduxKtor;
        CatchingFishSharedFlowAdMob catchingFishSharedFlowAdMob = actionMenuView != null ? actionMenuView.CatchingFish : null;
        int i = catchingFishMVPMockkLayout.CatchingFishWorkManager;
        if (i != 0 && this.CatchingFishGradleManifest != null && catchingFishSharedFlowAdMob != null && (findItem = catchingFishSharedFlowAdMob.findItem(i)) != null) {
            findItem.expandActionView();
        }
        if (catchingFishMVPMockkLayout.CatchingFishViewModelScope) {
            CatchingFishGsonRealm catchingFishGsonRealm = this.CatchingFishAppCompat;
            removeCallbacks(catchingFishGsonRealm);
            post(catchingFishGsonRealm);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        CatchingFishReduxKtor();
        CatchingFishNavigationView catchingFishNavigationView = this.CatchingFishSpannableWidget;
        boolean z = i == 1;
        if (z == catchingFishNavigationView.CatchingFishViewModelScope) {
            return;
        }
        catchingFishNavigationView.CatchingFishViewModelScope = z;
        if (!catchingFishNavigationView.CatchingFishViewModelFAB) {
            catchingFishNavigationView.CatchingFishParcelableFAB = catchingFishNavigationView.CatchingFishDaggerWebsocket;
            catchingFishNavigationView.CatchingFishSnackbar = catchingFishNavigationView.CatchingFishWorkManager;
            return;
        }
        if (z) {
            int i2 = catchingFishNavigationView.CatchingFishReduxKtor;
            if (i2 == Integer.MIN_VALUE) {
                i2 = catchingFishNavigationView.CatchingFishDaggerWebsocket;
            }
            catchingFishNavigationView.CatchingFishParcelableFAB = i2;
            int i3 = catchingFishNavigationView.CatchingFishCoroutine;
            if (i3 == Integer.MIN_VALUE) {
                i3 = catchingFishNavigationView.CatchingFishWorkManager;
            }
            catchingFishNavigationView.CatchingFishSnackbar = i3;
            return;
        }
        int i4 = catchingFishNavigationView.CatchingFishCoroutine;
        if (i4 == Integer.MIN_VALUE) {
            i4 = catchingFishNavigationView.CatchingFishDaggerWebsocket;
        }
        catchingFishNavigationView.CatchingFishParcelableFAB = i4;
        int i5 = catchingFishNavigationView.CatchingFishReduxKtor;
        if (i5 == Integer.MIN_VALUE) {
            i5 = catchingFishNavigationView.CatchingFishWorkManager;
        }
        catchingFishNavigationView.CatchingFishSnackbar = i5;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        CatchingFishToast catchingFishToast;
        CatchingFishKtorAdMob catchingFishKtorAdMob;
        CatchingFishMVPMockkLayout catchingFishMVPMockkLayout = new CatchingFishMVPMockkLayout(super.onSaveInstanceState());
        CatchingFishKtorUnitTesting catchingFishKtorUnitTesting = this.CatchingFishGradleManifest;
        if (catchingFishKtorUnitTesting != null && (catchingFishKtorAdMob = catchingFishKtorUnitTesting.CatchingFishDaggerWebsocket) != null) {
            catchingFishMVPMockkLayout.CatchingFishWorkManager = catchingFishKtorAdMob.CatchingFishParcelableFAB;
        }
        ActionMenuView actionMenuView = this.CatchingFishReduxKtor;
        catchingFishMVPMockkLayout.CatchingFishViewModelScope = (actionMenuView == null || (catchingFishToast = actionMenuView.CatchingFishSpannableWidget) == null || !catchingFishToast.CatchingFishViewModelScope()) ? false : true;
        return catchingFishMVPMockkLayout;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.CatchingFishFragmentFactory = false;
        }
        if (!this.CatchingFishFragmentFactory) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.CatchingFishFragmentFactory = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.CatchingFishFragmentFactory = false;
        return true;
    }

    public void setBackInvokedCallbackEnabled(boolean z) {
        if (this.CatchingFishRecyclerView != z) {
            this.CatchingFishRecyclerView = z;
            CatchingFishJetpackCompose();
        }
    }

    public void setCollapseContentDescription(int i) {
        setCollapseContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setCollapseIcon(int i) {
        setCollapseIcon(CatchingFishLayoutRoomFAB.CatchingFishCustomView(getContext(), i));
    }

    public void setCollapsible(boolean z) {
        this.CatchingFishMotionLayout = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.CatchingFishGsonAppCompat) {
            this.CatchingFishGsonAppCompat = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.CatchingFishParcelableFlux) {
            this.CatchingFishParcelableFlux = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i) {
        setLogo(CatchingFishLayoutRoomFAB.CatchingFishCustomView(getContext(), i));
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(CatchingFishLayoutRoomFAB.CatchingFishCustomView(getContext(), i));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        CatchingFishViewModelScope();
        this.CatchingFishViewModelScope.setOnClickListener(onClickListener);
    }

    public void setOverflowIcon(Drawable drawable) {
        CatchingFishDaggerWebsocket();
        this.CatchingFishReduxKtor.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i) {
        if (this.CatchingFishUnitTesting != i) {
            this.CatchingFishUnitTesting = i;
            if (i == 0) {
                this.CatchingFishOkHttp = getContext();
            } else {
                this.CatchingFishOkHttp = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setSubtitleTextColor(int i) {
        setSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public void setTitleMarginBottom(int i) {
        this.CatchingFishDaggerHiltFAB = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.CatchingFishJetpackCompose = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.CatchingFish = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.CatchingFishCoroutineFlow = i;
        requestLayout();
    }

    public void setTitleTextColor(int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, R.attr.toolbarStyle);
        this.CatchingFishCardViewRealm = 8388627;
        this.CatchingFishJobScheduler = new ArrayList();
        this.CatchingFishPayPalService = new ArrayList();
        this.CatchingFishSensorManager = new int[2];
        this.CatchingFishEspressoMockk = new CatchingFishAsyncTaskDagger(new CatchingFishKtorAdMobJUnit(this, 1));
        this.CatchingFishDagger = new ArrayList();
        this.CatchingFishCameraXIntent = new CatchingFishFABPicasso(this);
        this.CatchingFishAppCompat = new CatchingFishGsonRealm(18, this);
        Context context2 = getContext();
        int[] iArr = CatchingFishWidgetGlide.CatchingFishSpannableWidget;
        CatchingFishAsyncTaskDagger CatchingFishRecyclerView = CatchingFishAsyncTaskDagger.CatchingFishRecyclerView(context2, attributeSet, iArr, R.attr.toolbarStyle);
        CatchingFishFABCameraX.CatchingFishEspressoTesting(this, context, iArr, attributeSet, (TypedArray) CatchingFishRecyclerView.CatchingFishDaggerWebsocket, R.attr.toolbarStyle);
        TypedArray typedArray = (TypedArray) CatchingFishRecyclerView.CatchingFishDaggerWebsocket;
        this.CatchingFishAnimationMockk = typedArray.getResourceId(28, 0);
        this.CatchingFishStateLiveData = typedArray.getResourceId(19, 0);
        this.CatchingFishCardViewRealm = typedArray.getInteger(0, 8388627);
        this.CatchingFishRoomDatabase = typedArray.getInteger(2, 48);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(22, 0);
        dimensionPixelOffset = typedArray.hasValue(27) ? typedArray.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
        this.CatchingFishDaggerHiltFAB = dimensionPixelOffset;
        this.CatchingFishCoroutineFlow = dimensionPixelOffset;
        this.CatchingFishJetpackCompose = dimensionPixelOffset;
        this.CatchingFish = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.CatchingFish = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.CatchingFishJetpackCompose = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.CatchingFishCoroutineFlow = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.CatchingFishDaggerHiltFAB = dimensionPixelOffset5;
        }
        this.CatchingFishNavigation = typedArray.getDimensionPixelSize(13, -1);
        int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(9, Integer.MIN_VALUE);
        int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(5, Integer.MIN_VALUE);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, 0);
        CatchingFishReduxKtor();
        CatchingFishNavigationView catchingFishNavigationView = this.CatchingFishSpannableWidget;
        catchingFishNavigationView.CatchingFishViewModelFAB = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            catchingFishNavigationView.CatchingFishDaggerWebsocket = dimensionPixelSize;
            catchingFishNavigationView.CatchingFishParcelableFAB = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            catchingFishNavigationView.CatchingFishWorkManager = dimensionPixelSize2;
            catchingFishNavigationView.CatchingFishSnackbar = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            catchingFishNavigationView.CatchingFishParcelableFAB(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.CatchingFishParcelableFlux = typedArray.getDimensionPixelOffset(10, Integer.MIN_VALUE);
        this.CatchingFishGsonAppCompat = typedArray.getDimensionPixelOffset(6, Integer.MIN_VALUE);
        this.CatchingFishLayout = CatchingFishRecyclerView.CatchingFishMutableLiveData(4);
        this.CatchingFishFragmentHandler = typedArray.getText(3);
        CharSequence text = typedArray.getText(21);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray.getText(18);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.CatchingFishOkHttp = getContext();
        setPopupTheme(typedArray.getResourceId(17, 0));
        Drawable CatchingFishMutableLiveData = CatchingFishRecyclerView.CatchingFishMutableLiveData(16);
        if (CatchingFishMutableLiveData != null) {
            setNavigationIcon(CatchingFishMutableLiveData);
        }
        CharSequence text3 = typedArray.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable CatchingFishMutableLiveData2 = CatchingFishRecyclerView.CatchingFishMutableLiveData(11);
        if (CatchingFishMutableLiveData2 != null) {
            setLogo(CatchingFishMutableLiveData2);
        }
        CharSequence text4 = typedArray.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray.hasValue(29)) {
            setTitleTextColor(CatchingFishRecyclerView.CatchingFishFragmentFactory(29));
        }
        if (typedArray.hasValue(20)) {
            setSubtitleTextColor(CatchingFishRecyclerView.CatchingFishFragmentFactory(20));
        }
        if (typedArray.hasValue(14)) {
            getMenuInflater().inflate(typedArray.getResourceId(14, 0), getMenu());
        }
        CatchingFishRecyclerView.CatchingFishAnimation();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        CatchingFishMVISnackbarMVVM catchingFishMVISnackbarMVVM = new CatchingFishMVISnackbarMVVM(context, attributeSet);
        catchingFishMVISnackbarMVVM.CatchingFishParcelableFAB = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, CatchingFishWidgetGlide.CatchingFishSnackbar);
        catchingFishMVISnackbarMVVM.CatchingFishParcelableFAB = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
        catchingFishMVISnackbarMVVM.CatchingFishSnackbar = 0;
        return catchingFishMVISnackbarMVVM;
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            CatchingFishCoroutine();
        }
        CatchingFishAsyncTaskView catchingFishAsyncTaskView = this.CatchingFishCloudMessaging;
        if (catchingFishAsyncTaskView != null) {
            catchingFishAsyncTaskView.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            CatchingFishCoroutine();
            this.CatchingFishCloudMessaging.setImageDrawable(drawable);
        } else {
            CatchingFishAsyncTaskView catchingFishAsyncTaskView = this.CatchingFishCloudMessaging;
            if (catchingFishAsyncTaskView != null) {
                catchingFishAsyncTaskView.setImageDrawable(this.CatchingFishLayout);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.CatchingFishViewModelFAB == null) {
                this.CatchingFishViewModelFAB = new CatchingFishCustomViewFlux(getContext(), null, 0);
            }
            if (!CatchingFishUnitTesting(this.CatchingFishViewModelFAB)) {
                CatchingFishSnackbar(this.CatchingFishViewModelFAB, true);
            }
        } else {
            CatchingFishCustomViewFlux catchingFishCustomViewFlux = this.CatchingFishViewModelFAB;
            if (catchingFishCustomViewFlux != null && CatchingFishUnitTesting(catchingFishCustomViewFlux)) {
                removeView(this.CatchingFishViewModelFAB);
                this.CatchingFishPayPalService.remove(this.CatchingFishViewModelFAB);
            }
        }
        CatchingFishCustomViewFlux catchingFishCustomViewFlux2 = this.CatchingFishViewModelFAB;
        if (catchingFishCustomViewFlux2 != null) {
            catchingFishCustomViewFlux2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.CatchingFishViewModelFAB == null) {
            this.CatchingFishViewModelFAB = new CatchingFishCustomViewFlux(getContext(), null, 0);
        }
        CatchingFishCustomViewFlux catchingFishCustomViewFlux = this.CatchingFishViewModelFAB;
        if (catchingFishCustomViewFlux != null) {
            catchingFishCustomViewFlux.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            CatchingFishViewModelScope();
        }
        CatchingFishAsyncTaskView catchingFishAsyncTaskView = this.CatchingFishViewModelScope;
        if (catchingFishAsyncTaskView != null) {
            catchingFishAsyncTaskView.setContentDescription(charSequence);
            CatchingFishViewMVIMVVM.CatchingFishCoroutineFlow(this.CatchingFishViewModelScope, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            CatchingFishViewModelScope();
            if (!CatchingFishUnitTesting(this.CatchingFishViewModelScope)) {
                CatchingFishSnackbar(this.CatchingFishViewModelScope, true);
            }
        } else {
            CatchingFishAsyncTaskView catchingFishAsyncTaskView = this.CatchingFishViewModelScope;
            if (catchingFishAsyncTaskView != null && CatchingFishUnitTesting(catchingFishAsyncTaskView)) {
                removeView(this.CatchingFishViewModelScope);
                this.CatchingFishPayPalService.remove(this.CatchingFishViewModelScope);
            }
        }
        CatchingFishAsyncTaskView catchingFishAsyncTaskView2 = this.CatchingFishViewModelScope;
        if (catchingFishAsyncTaskView2 != null) {
            catchingFishAsyncTaskView2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            CatchingFishDataStoreBundle catchingFishDataStoreBundle = this.CatchingFishWorkManager;
            if (catchingFishDataStoreBundle != null && CatchingFishUnitTesting(catchingFishDataStoreBundle)) {
                removeView(this.CatchingFishWorkManager);
                this.CatchingFishPayPalService.remove(this.CatchingFishWorkManager);
            }
        } else {
            if (this.CatchingFishWorkManager == null) {
                Context context = getContext();
                CatchingFishDataStoreBundle catchingFishDataStoreBundle2 = new CatchingFishDataStoreBundle(context, null);
                this.CatchingFishWorkManager = catchingFishDataStoreBundle2;
                catchingFishDataStoreBundle2.setSingleLine();
                this.CatchingFishWorkManager.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.CatchingFishStateLiveData;
                if (i != 0) {
                    this.CatchingFishWorkManager.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.CatchingFishCustomView;
                if (colorStateList != null) {
                    this.CatchingFishWorkManager.setTextColor(colorStateList);
                }
            }
            if (!CatchingFishUnitTesting(this.CatchingFishWorkManager)) {
                CatchingFishSnackbar(this.CatchingFishWorkManager, true);
            }
        }
        CatchingFishDataStoreBundle catchingFishDataStoreBundle3 = this.CatchingFishWorkManager;
        if (catchingFishDataStoreBundle3 != null) {
            catchingFishDataStoreBundle3.setText(charSequence);
        }
        this.CatchingFishCardViewView = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.CatchingFishCustomView = colorStateList;
        CatchingFishDataStoreBundle catchingFishDataStoreBundle = this.CatchingFishWorkManager;
        if (catchingFishDataStoreBundle != null) {
            catchingFishDataStoreBundle.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            CatchingFishDataStoreBundle catchingFishDataStoreBundle = this.CatchingFishDaggerWebsocket;
            if (catchingFishDataStoreBundle != null && CatchingFishUnitTesting(catchingFishDataStoreBundle)) {
                removeView(this.CatchingFishDaggerWebsocket);
                this.CatchingFishPayPalService.remove(this.CatchingFishDaggerWebsocket);
            }
        } else {
            if (this.CatchingFishDaggerWebsocket == null) {
                Context context = getContext();
                CatchingFishDataStoreBundle catchingFishDataStoreBundle2 = new CatchingFishDataStoreBundle(context, null);
                this.CatchingFishDaggerWebsocket = catchingFishDataStoreBundle2;
                catchingFishDataStoreBundle2.setSingleLine();
                this.CatchingFishDaggerWebsocket.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.CatchingFishAnimationMockk;
                if (i != 0) {
                    this.CatchingFishDaggerWebsocket.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.CatchingFishMVPRobolectric;
                if (colorStateList != null) {
                    this.CatchingFishDaggerWebsocket.setTextColor(colorStateList);
                }
            }
            if (!CatchingFishUnitTesting(this.CatchingFishDaggerWebsocket)) {
                CatchingFishSnackbar(this.CatchingFishDaggerWebsocket, true);
            }
        }
        CatchingFishDataStoreBundle catchingFishDataStoreBundle3 = this.CatchingFishDaggerWebsocket;
        if (catchingFishDataStoreBundle3 != null) {
            catchingFishDataStoreBundle3.setText(charSequence);
        }
        this.CatchingFishPayPal = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.CatchingFishMVPRobolectric = colorStateList;
        CatchingFishDataStoreBundle catchingFishDataStoreBundle = this.CatchingFishDaggerWebsocket;
        if (catchingFishDataStoreBundle != null) {
            catchingFishDataStoreBundle.setTextColor(colorStateList);
        }
    }

    public void setOnMenuItemClickListener(CatchingFishRoomParcelable catchingFishRoomParcelable) {
    }
}
