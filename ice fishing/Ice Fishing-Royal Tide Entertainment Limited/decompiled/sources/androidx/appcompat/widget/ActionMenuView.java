package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import kotlin.text.CatchingFishAdMobXMLLayout;
import kotlin.text.CatchingFishFABPicasso;
import kotlin.text.CatchingFishFragment;
import kotlin.text.CatchingFishKtorAdMob;
import kotlin.text.CatchingFishLiveDataPayPal;
import kotlin.text.CatchingFishMVVMGraphQL;
import kotlin.text.CatchingFishMoshiFluxMoshi;
import kotlin.text.CatchingFishOkHttpPicasso;
import kotlin.text.CatchingFishPayPalFlux;
import kotlin.text.CatchingFishRecyclerView;
import kotlin.text.CatchingFishServiceHilt;
import kotlin.text.CatchingFishSharedFlowAdMob;
import kotlin.text.CatchingFishToast;
import kotlin.text.CatchingFishWidgetDataStore;
import kotlin.text.CatchingFishWidgetManifest;
import kotlin.text.CatchingFishXMLLayoutGradle;

/* loaded from: classes.dex */
public class ActionMenuView extends CatchingFishAdMobXMLLayout implements CatchingFishLiveDataPayPal, CatchingFishOkHttpPicasso {
    public CatchingFishSharedFlowAdMob CatchingFish;
    public int CatchingFishCardViewRealm;
    public final int CatchingFishCardViewView;
    public int CatchingFishCoroutineFlow;
    public boolean CatchingFishDaggerHiltFAB;
    public boolean CatchingFishGsonAppCompat;
    public Context CatchingFishJetpackCompose;
    public CatchingFishXMLLayoutGradle CatchingFishMVPRobolectric;
    public CatchingFishFABPicasso CatchingFishParcelableFlux;
    public final int CatchingFishPayPal;
    public CatchingFishToast CatchingFishSpannableWidget;

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.CatchingFishPayPal = (int) (56.0f * f);
        this.CatchingFishCardViewView = (int) (f * 4.0f);
        this.CatchingFishJetpackCompose = context;
        this.CatchingFishCoroutineFlow = 0;
    }

    public static CatchingFishPayPalFlux CatchingFishCloudMessaging(ViewGroup.LayoutParams layoutParams) {
        CatchingFishPayPalFlux catchingFishPayPalFlux;
        if (layoutParams == null) {
            return CatchingFishFragmentHandler();
        }
        if (layoutParams instanceof CatchingFishPayPalFlux) {
            CatchingFishPayPalFlux catchingFishPayPalFlux2 = (CatchingFishPayPalFlux) layoutParams;
            catchingFishPayPalFlux = new CatchingFishPayPalFlux(catchingFishPayPalFlux2);
            catchingFishPayPalFlux.CatchingFishParcelableFAB = catchingFishPayPalFlux2.CatchingFishParcelableFAB;
        } else {
            catchingFishPayPalFlux = new CatchingFishPayPalFlux(layoutParams);
        }
        if (((LinearLayout.LayoutParams) catchingFishPayPalFlux).gravity <= 0) {
            ((LinearLayout.LayoutParams) catchingFishPayPalFlux).gravity = 16;
        }
        return catchingFishPayPalFlux;
    }

    public static CatchingFishPayPalFlux CatchingFishFragmentHandler() {
        CatchingFishPayPalFlux catchingFishPayPalFlux = new CatchingFishPayPalFlux(-2, -2);
        catchingFishPayPalFlux.CatchingFishParcelableFAB = false;
        ((LinearLayout.LayoutParams) catchingFishPayPalFlux).gravity = 16;
        return catchingFishPayPalFlux;
    }

    @Override // kotlin.text.CatchingFishLiveDataPayPal
    public final boolean CatchingFishCoroutine(CatchingFishKtorAdMob catchingFishKtorAdMob) {
        return this.CatchingFish.CatchingFishRoomDatabase(catchingFishKtorAdMob, null, 0);
    }

    public final boolean CatchingFishEspressoTesting(int i) {
        boolean z = false;
        if (i == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i - 1);
        KeyEvent.Callback childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof CatchingFishWidgetManifest)) {
            z = ((CatchingFishWidgetManifest) childAt).CatchingFishSnackbar();
        }
        return (i <= 0 || !(childAt2 instanceof CatchingFishWidgetManifest)) ? z : ((CatchingFishWidgetManifest) childAt2).CatchingFishCoroutine() | z;
    }

    @Override // kotlin.text.CatchingFishOkHttpPicasso
    public final void CatchingFishSnackbar(CatchingFishSharedFlowAdMob catchingFishSharedFlowAdMob) {
        this.CatchingFish = catchingFishSharedFlowAdMob;
    }

    @Override // kotlin.text.CatchingFishAdMobXMLLayout
    /* renamed from: CatchingFishViewModelFAB */
    public final /* bridge */ /* synthetic */ CatchingFishWidgetDataStore generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return CatchingFishCloudMessaging(layoutParams);
    }

    @Override // kotlin.text.CatchingFishAdMobXMLLayout
    /* renamed from: CatchingFishViewModelScope */
    public final CatchingFishWidgetDataStore generateLayoutParams(AttributeSet attributeSet) {
        return new CatchingFishPayPalFlux(getContext(), attributeSet);
    }

    @Override // kotlin.text.CatchingFishAdMobXMLLayout
    /* renamed from: CatchingFishWorkManager */
    public final /* bridge */ /* synthetic */ CatchingFishWidgetDataStore generateDefaultLayoutParams() {
        return CatchingFishFragmentHandler();
    }

    @Override // kotlin.text.CatchingFishAdMobXMLLayout, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof CatchingFishPayPalFlux;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // kotlin.text.CatchingFishAdMobXMLLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return CatchingFishFragmentHandler();
    }

    @Override // kotlin.text.CatchingFishAdMobXMLLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return CatchingFishCloudMessaging(layoutParams);
    }

    public Menu getMenu() {
        if (this.CatchingFish == null) {
            Context context = getContext();
            CatchingFishSharedFlowAdMob catchingFishSharedFlowAdMob = new CatchingFishSharedFlowAdMob(context);
            this.CatchingFish = catchingFishSharedFlowAdMob;
            catchingFishSharedFlowAdMob.CatchingFishDaggerWebsocket = new CatchingFishServiceHilt(6, this);
            CatchingFishToast catchingFishToast = new CatchingFishToast(context);
            this.CatchingFishSpannableWidget = catchingFishToast;
            catchingFishToast.CatchingFishAnimationMockk = true;
            catchingFishToast.CatchingFishStateLiveData = true;
            catchingFishToast.CatchingFishViewModelFAB = new CatchingFishMoshiFluxMoshi(10);
            this.CatchingFish.CatchingFishSnackbar(catchingFishToast, this.CatchingFishJetpackCompose);
            CatchingFishToast catchingFishToast2 = this.CatchingFishSpannableWidget;
            catchingFishToast2.CatchingFishCloudMessaging = this;
            this.CatchingFish = catchingFishToast2.CatchingFishWorkManager;
        }
        return this.CatchingFish;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        CatchingFishToast catchingFishToast = this.CatchingFishSpannableWidget;
        CatchingFishFragment catchingFishFragment = catchingFishToast.CatchingFishEspressoTesting;
        if (catchingFishFragment != null) {
            return catchingFishFragment.getDrawable();
        }
        if (catchingFishToast.CatchingFishUnitTesting) {
            return catchingFishToast.CatchingFishOkHttp;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.CatchingFishCoroutineFlow;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        CatchingFishToast catchingFishToast = this.CatchingFishSpannableWidget;
        if (catchingFishToast != null) {
            catchingFishToast.CatchingFishWorkManager();
            if (this.CatchingFishSpannableWidget.CatchingFishViewModelScope()) {
                this.CatchingFishSpannableWidget.CatchingFishReduxKtor();
                this.CatchingFishSpannableWidget.CatchingFishEspressoTesting();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        CatchingFishToast catchingFishToast = this.CatchingFishSpannableWidget;
        if (catchingFishToast != null) {
            catchingFishToast.CatchingFishReduxKtor();
            CatchingFishRecyclerView catchingFishRecyclerView = catchingFishToast.CatchingFishSpannableWidget;
            if (catchingFishRecyclerView == null || !catchingFishRecyclerView.CatchingFishSnackbar()) {
                return;
            }
            catchingFishRecyclerView.CatchingFishLayout.dismiss();
        }
    }

    @Override // kotlin.text.CatchingFishAdMobXMLLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int width;
        int i5;
        if (!this.CatchingFishGsonAppCompat) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i6 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i7 = i3 - i;
        int paddingRight = (i7 - getPaddingRight()) - getPaddingLeft();
        boolean z2 = CatchingFishMVVMGraphQL.CatchingFishParcelableFAB;
        boolean z3 = getLayoutDirection() == 1;
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                CatchingFishPayPalFlux catchingFishPayPalFlux = (CatchingFishPayPalFlux) childAt.getLayoutParams();
                if (catchingFishPayPalFlux.CatchingFishParcelableFAB) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (CatchingFishEspressoTesting(i10)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (z3) {
                        i5 = getPaddingLeft() + ((LinearLayout.LayoutParams) catchingFishPayPalFlux).leftMargin;
                        width = i5 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) catchingFishPayPalFlux).rightMargin;
                        i5 = width - measuredWidth;
                    }
                    int i11 = i6 - (measuredHeight / 2);
                    childAt.layout(i5, i11, width, measuredHeight + i11);
                    paddingRight -= measuredWidth;
                    i8 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) catchingFishPayPalFlux).leftMargin) + ((LinearLayout.LayoutParams) catchingFishPayPalFlux).rightMargin;
                    CatchingFishEspressoTesting(i10);
                    i9++;
                }
            }
        }
        if (childCount == 1 && i8 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i12 = (i7 / 2) - (measuredWidth2 / 2);
            int i13 = i6 - (measuredHeight2 / 2);
            childAt2.layout(i12, i13, measuredWidth2 + i12, measuredHeight2 + i13);
            return;
        }
        int i14 = i9 - (i8 ^ 1);
        int max = Math.max(0, i14 > 0 ? paddingRight / i14 : 0);
        if (z3) {
            int width2 = getWidth() - getPaddingRight();
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt3 = getChildAt(i15);
                CatchingFishPayPalFlux catchingFishPayPalFlux2 = (CatchingFishPayPalFlux) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !catchingFishPayPalFlux2.CatchingFishParcelableFAB) {
                    int i16 = width2 - ((LinearLayout.LayoutParams) catchingFishPayPalFlux2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i17 = i6 - (measuredHeight3 / 2);
                    childAt3.layout(i16 - measuredWidth3, i17, i16, measuredHeight3 + i17);
                    width2 = i16 - ((measuredWidth3 + ((LinearLayout.LayoutParams) catchingFishPayPalFlux2).leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt4 = getChildAt(i18);
            CatchingFishPayPalFlux catchingFishPayPalFlux3 = (CatchingFishPayPalFlux) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !catchingFishPayPalFlux3.CatchingFishParcelableFAB) {
                int i19 = paddingLeft + ((LinearLayout.LayoutParams) catchingFishPayPalFlux3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i20 = i6 - (measuredHeight4 / 2);
                childAt4.layout(i19, i20, i19 + measuredWidth4, measuredHeight4 + i20);
                paddingLeft = measuredWidth4 + ((LinearLayout.LayoutParams) catchingFishPayPalFlux3).rightMargin + max + i19;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v41 */
    @Override // kotlin.text.CatchingFishAdMobXMLLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        ?? r11;
        int i5;
        int i6;
        CatchingFishSharedFlowAdMob catchingFishSharedFlowAdMob;
        boolean z = this.CatchingFishGsonAppCompat;
        boolean z2 = View.MeasureSpec.getMode(i) == 1073741824;
        this.CatchingFishGsonAppCompat = z2;
        if (z != z2) {
            this.CatchingFishCardViewRealm = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (this.CatchingFishGsonAppCompat && (catchingFishSharedFlowAdMob = this.CatchingFish) != null && size != this.CatchingFishCardViewRealm) {
            this.CatchingFishCardViewRealm = size;
            catchingFishSharedFlowAdMob.CatchingFishStateLiveData(true);
        }
        int childCount = getChildCount();
        if (!this.CatchingFishGsonAppCompat || childCount <= 0) {
            for (int i7 = 0; i7 < childCount; i7++) {
                CatchingFishPayPalFlux catchingFishPayPalFlux = (CatchingFishPayPalFlux) getChildAt(i7).getLayoutParams();
                ((LinearLayout.LayoutParams) catchingFishPayPalFlux).rightMargin = 0;
                ((LinearLayout.LayoutParams) catchingFishPayPalFlux).leftMargin = 0;
            }
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i);
        int size3 = View.MeasureSpec.getSize(i2);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingBottom, -2);
        int i8 = size2 - paddingRight;
        int i9 = this.CatchingFishPayPal;
        int i10 = i8 / i9;
        int i11 = i8 % i9;
        if (i10 == 0) {
            setMeasuredDimension(i8, 0);
            return;
        }
        int i12 = (i11 / i10) + i9;
        int childCount2 = getChildCount();
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        boolean z3 = false;
        int i17 = 0;
        long j = 0;
        while (true) {
            i3 = this.CatchingFishCardViewView;
            if (i16 >= childCount2) {
                break;
            }
            View childAt = getChildAt(i16);
            int i18 = size3;
            int i19 = paddingBottom;
            if (childAt.getVisibility() == 8) {
                i5 = i12;
            } else {
                boolean z4 = childAt instanceof ActionMenuItemView;
                i14++;
                if (z4) {
                    childAt.setPadding(i3, 0, i3, 0);
                }
                CatchingFishPayPalFlux catchingFishPayPalFlux2 = (CatchingFishPayPalFlux) childAt.getLayoutParams();
                catchingFishPayPalFlux2.CatchingFishWorkManager = false;
                catchingFishPayPalFlux2.CatchingFishCoroutine = 0;
                catchingFishPayPalFlux2.CatchingFishSnackbar = 0;
                catchingFishPayPalFlux2.CatchingFishReduxKtor = false;
                ((LinearLayout.LayoutParams) catchingFishPayPalFlux2).leftMargin = 0;
                ((LinearLayout.LayoutParams) catchingFishPayPalFlux2).rightMargin = 0;
                catchingFishPayPalFlux2.CatchingFishDaggerWebsocket = z4 && !TextUtils.isEmpty(((ActionMenuItemView) childAt).getText());
                int i20 = catchingFishPayPalFlux2.CatchingFishParcelableFAB ? 1 : i10;
                CatchingFishPayPalFlux catchingFishPayPalFlux3 = (CatchingFishPayPalFlux) childAt.getLayoutParams();
                int i21 = i10;
                i5 = i12;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - i19, View.MeasureSpec.getMode(childMeasureSpec));
                ActionMenuItemView actionMenuItemView = z4 ? (ActionMenuItemView) childAt : null;
                boolean z5 = (actionMenuItemView == null || TextUtils.isEmpty(actionMenuItemView.getText())) ? false : true;
                boolean z6 = z5;
                if (i20 <= 0 || (z5 && i20 < 2)) {
                    i6 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i5 * i20, Integer.MIN_VALUE), makeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i6 = measuredWidth / i5;
                    if (measuredWidth % i5 != 0) {
                        i6++;
                    }
                    if (z6 && i6 < 2) {
                        i6 = 2;
                    }
                }
                catchingFishPayPalFlux3.CatchingFishReduxKtor = !catchingFishPayPalFlux3.CatchingFishParcelableFAB && z6;
                catchingFishPayPalFlux3.CatchingFishSnackbar = i6;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i6 * i5, 1073741824), makeMeasureSpec);
                i15 = Math.max(i15, i6);
                if (catchingFishPayPalFlux2.CatchingFishReduxKtor) {
                    i17++;
                }
                if (catchingFishPayPalFlux2.CatchingFishParcelableFAB) {
                    z3 = true;
                }
                i10 = i21 - i6;
                i13 = Math.max(i13, childAt.getMeasuredHeight());
                if (i6 == 1) {
                    j |= 1 << i16;
                }
            }
            i16++;
            size3 = i18;
            paddingBottom = i19;
            i12 = i5;
        }
        int i22 = size3;
        int i23 = i10;
        int i24 = i12;
        boolean z7 = z3 && i14 == 2;
        int i25 = i23;
        boolean z8 = false;
        while (i17 > 0 && i25 > 0) {
            int i26 = Integer.MAX_VALUE;
            long j2 = 0;
            int i27 = 0;
            int i28 = 0;
            while (i28 < childCount2) {
                int i29 = i13;
                CatchingFishPayPalFlux catchingFishPayPalFlux4 = (CatchingFishPayPalFlux) getChildAt(i28).getLayoutParams();
                boolean z9 = z7;
                if (catchingFishPayPalFlux4.CatchingFishReduxKtor) {
                    int i30 = catchingFishPayPalFlux4.CatchingFishSnackbar;
                    if (i30 < i26) {
                        j2 = 1 << i28;
                        i26 = i30;
                        i27 = 1;
                    } else if (i30 == i26) {
                        j2 |= 1 << i28;
                        i27++;
                    }
                }
                i28++;
                z7 = z9;
                i13 = i29;
            }
            i4 = i13;
            boolean z10 = z7;
            j |= j2;
            if (i27 > i25) {
                break;
            }
            int i31 = i26 + 1;
            int i32 = 0;
            while (i32 < childCount2) {
                View childAt2 = getChildAt(i32);
                CatchingFishPayPalFlux catchingFishPayPalFlux5 = (CatchingFishPayPalFlux) childAt2.getLayoutParams();
                boolean z11 = z3;
                long j3 = 1 << i32;
                if ((j2 & j3) != 0) {
                    if (z10 && catchingFishPayPalFlux5.CatchingFishDaggerWebsocket) {
                        r11 = 1;
                        r11 = 1;
                        if (i25 == 1) {
                            childAt2.setPadding(i3 + i24, 0, i3, 0);
                        }
                    } else {
                        r11 = 1;
                    }
                    catchingFishPayPalFlux5.CatchingFishSnackbar += r11;
                    catchingFishPayPalFlux5.CatchingFishWorkManager = r11;
                    i25--;
                } else if (catchingFishPayPalFlux5.CatchingFishSnackbar == i31) {
                    j |= j3;
                }
                i32++;
                z3 = z11;
            }
            z7 = z10;
            i13 = i4;
            z8 = true;
        }
        i4 = i13;
        boolean z12 = !z3 && i14 == 1;
        if (i25 > 0 && j != 0 && (i25 < i14 - 1 || z12 || i15 > 1)) {
            float bitCount = Long.bitCount(j);
            if (!z12) {
                if ((j & 1) != 0 && !((CatchingFishPayPalFlux) getChildAt(0).getLayoutParams()).CatchingFishDaggerWebsocket) {
                    bitCount -= 0.5f;
                }
                int i33 = childCount2 - 1;
                if ((j & (1 << i33)) != 0 && !((CatchingFishPayPalFlux) getChildAt(i33).getLayoutParams()).CatchingFishDaggerWebsocket) {
                    bitCount -= 0.5f;
                }
            }
            int i34 = bitCount > 0.0f ? (int) ((i25 * i24) / bitCount) : 0;
            boolean z13 = z8;
            for (int i35 = 0; i35 < childCount2; i35++) {
                if ((j & (1 << i35)) != 0) {
                    View childAt3 = getChildAt(i35);
                    CatchingFishPayPalFlux catchingFishPayPalFlux6 = (CatchingFishPayPalFlux) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        catchingFishPayPalFlux6.CatchingFishCoroutine = i34;
                        catchingFishPayPalFlux6.CatchingFishWorkManager = true;
                        if (i35 == 0 && !catchingFishPayPalFlux6.CatchingFishDaggerWebsocket) {
                            ((LinearLayout.LayoutParams) catchingFishPayPalFlux6).leftMargin = (-i34) / 2;
                        }
                        z13 = true;
                    } else if (catchingFishPayPalFlux6.CatchingFishParcelableFAB) {
                        catchingFishPayPalFlux6.CatchingFishCoroutine = i34;
                        catchingFishPayPalFlux6.CatchingFishWorkManager = true;
                        ((LinearLayout.LayoutParams) catchingFishPayPalFlux6).rightMargin = (-i34) / 2;
                        z13 = true;
                    } else {
                        if (i35 != 0) {
                            ((LinearLayout.LayoutParams) catchingFishPayPalFlux6).leftMargin = i34 / 2;
                        }
                        if (i35 != childCount2 - 1) {
                            ((LinearLayout.LayoutParams) catchingFishPayPalFlux6).rightMargin = i34 / 2;
                        }
                    }
                }
            }
            z8 = z13;
        }
        if (z8) {
            for (int i36 = 0; i36 < childCount2; i36++) {
                View childAt4 = getChildAt(i36);
                CatchingFishPayPalFlux catchingFishPayPalFlux7 = (CatchingFishPayPalFlux) childAt4.getLayoutParams();
                if (catchingFishPayPalFlux7.CatchingFishWorkManager) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((catchingFishPayPalFlux7.CatchingFishSnackbar * i24) + catchingFishPayPalFlux7.CatchingFishCoroutine, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i8, mode != 1073741824 ? i4 : i22);
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.CatchingFishSpannableWidget.CatchingFishJetpackCompose = z;
    }

    public void setOnMenuItemClickListener(CatchingFishXMLLayoutGradle catchingFishXMLLayoutGradle) {
        this.CatchingFishMVPRobolectric = catchingFishXMLLayoutGradle;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        CatchingFishToast catchingFishToast = this.CatchingFishSpannableWidget;
        CatchingFishFragment catchingFishFragment = catchingFishToast.CatchingFishEspressoTesting;
        if (catchingFishFragment != null) {
            catchingFishFragment.setImageDrawable(drawable);
        } else {
            catchingFishToast.CatchingFishUnitTesting = true;
            catchingFishToast.CatchingFishOkHttp = drawable;
        }
    }

    public void setOverflowReserved(boolean z) {
        this.CatchingFishDaggerHiltFAB = z;
    }

    public void setPopupTheme(int i) {
        if (this.CatchingFishCoroutineFlow != i) {
            this.CatchingFishCoroutineFlow = i;
            if (i == 0) {
                this.CatchingFishJetpackCompose = getContext();
            } else {
                this.CatchingFishJetpackCompose = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(CatchingFishToast catchingFishToast) {
        this.CatchingFishSpannableWidget = catchingFishToast;
        catchingFishToast.CatchingFishCloudMessaging = this;
        this.CatchingFish = catchingFishToast.CatchingFishWorkManager;
    }

    @Override // kotlin.text.CatchingFishAdMobXMLLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new CatchingFishPayPalFlux(getContext(), attributeSet);
    }
}
