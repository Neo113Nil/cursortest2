package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.appcompat.app.WindowDecorActionBar;
import androidx.appcompat.view.ViewPropertyAnimatorCompatSet;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.appcompat.widget.ActionMenuPresenter;
import androidx.core.graphics.Insets;
import androidx.core.view.NestedScrollingParent;
import androidx.core.view.NestedScrollingParent2;
import androidx.core.view.NestedScrollingParent3;
import androidx.core.view.NestedScrollingParentHelper;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.transition.Transition;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.size.DimensionKt;
import com.squareup.cash.R;
import java.util.WeakHashMap;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public class ActionBarOverlayLayout extends ViewGroup implements DecorContentParent, NestedScrollingParent, NestedScrollingParent2, NestedScrollingParent3 {
    public static final int[] ATTRS = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};
    public static final WindowInsetsCompat NON_EMPTY_SYSTEM_WINDOW_INSETS;
    public static final Rect ZERO_INSETS;
    public int mActionBarHeight;
    public ActionBarContainer mActionBarTop;
    public ActionBarVisibilityCallback mActionBarVisibilityCallback;
    public final AnonymousClass2 mAddActionBarHideOffset;
    public boolean mAnimatingForFling;
    public final Rect mBaseContentInsets;
    public WindowInsetsCompat mBaseInnerInsets;
    public ContentFrameLayout mContent;
    public final Rect mContentInsets;
    public ViewPropertyAnimator mCurrentActionBarTopAnimator;
    public DecorToolbar mDecorToolbar;
    public OverScroller mFlingEstimator;
    public boolean mHasNonEmbeddedTabs;
    public boolean mHideOnContentScroll;
    public int mHideOnContentScrollReference;
    public WindowInsetsCompat mInnerInsets;
    public final Rect mLastBaseContentInsets;
    public WindowInsetsCompat mLastBaseInnerInsets;
    public WindowInsetsCompat mLastInnerInsets;
    public int mLastSystemUiVisibility;
    public final NoSystemUiLayoutFlagView mNoSystemUiLayoutFlagView;
    public boolean mOverlayMode;
    public final NestedScrollingParentHelper mParentHelper;
    public final AnonymousClass2 mRemoveActionBarHideOffset;
    public final Rect mTmpRect;
    public final Transition.AnonymousClass3 mTopAnimatorListener;
    public Drawable mWindowContentOverlay;
    public int mWindowVisibility;

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$2, reason: invalid class name */
    public final class AnonymousClass2 implements Runnable {
        public final /* synthetic */ int $r8$classId;
        public final /* synthetic */ ActionBarOverlayLayout this$0;

        public /* synthetic */ AnonymousClass2(ActionBarOverlayLayout actionBarOverlayLayout, int i) {
            this.$r8$classId = i;
            this.this$0 = actionBarOverlayLayout;
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i = this.$r8$classId;
            ActionBarOverlayLayout actionBarOverlayLayout = this.this$0;
            switch (i) {
                case 0:
                    actionBarOverlayLayout.haltActionBarHideOffsetAnimations();
                    actionBarOverlayLayout.mCurrentActionBarTopAnimator = actionBarOverlayLayout.mActionBarTop.animate().translationY(RecyclerView.DECELERATION_RATE).setListener(actionBarOverlayLayout.mTopAnimatorListener);
                    break;
                default:
                    actionBarOverlayLayout.haltActionBarHideOffsetAnimations();
                    actionBarOverlayLayout.mCurrentActionBarTopAnimator = actionBarOverlayLayout.mActionBarTop.animate().translationY(-actionBarOverlayLayout.mActionBarTop.getHeight()).setListener(actionBarOverlayLayout.mTopAnimatorListener);
                    break;
            }
        }
    }

    public interface ActionBarVisibilityCallback {
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public final class NoSystemUiLayoutFlagView extends View {
        @Override // android.view.View
        public final int getWindowSystemUiVisibility() {
            return 0;
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        WindowInsetsCompat.BuilderImpl builderImpl36 = i >= 36 ? new WindowInsetsCompat.BuilderImpl36() : i >= 35 ? new WindowInsetsCompat.BuilderImpl35() : i >= 34 ? new WindowInsetsCompat.BuilderImpl34() : i >= 31 ? new WindowInsetsCompat.BuilderImpl31() : i >= 30 ? new WindowInsetsCompat.BuilderImpl30() : new WindowInsetsCompat.BuilderImpl29();
        builderImpl36.setSystemWindowInsets(Insets.of(0, 1, 0, 1));
        NON_EMPTY_SYSTEM_WINDOW_INSETS = builderImpl36.build();
        ZERO_INSETS = new Rect();
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mWindowVisibility = 0;
        this.mBaseContentInsets = new Rect();
        this.mLastBaseContentInsets = new Rect();
        this.mContentInsets = new Rect();
        this.mTmpRect = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        WindowInsetsCompat windowInsetsCompat = WindowInsetsCompat.CONSUMED;
        this.mBaseInnerInsets = windowInsetsCompat;
        this.mLastBaseInnerInsets = windowInsetsCompat;
        this.mInnerInsets = windowInsetsCompat;
        this.mLastInnerInsets = windowInsetsCompat;
        this.mTopAnimatorListener = new Transition.AnonymousClass3(this, 1);
        this.mRemoveActionBarHideOffset = new AnonymousClass2(this, 0);
        this.mAddActionBarHideOffset = new AnonymousClass2(this, 1);
        init(context);
        this.mParentHelper = new NestedScrollingParentHelper();
        NoSystemUiLayoutFlagView noSystemUiLayoutFlagView = new NoSystemUiLayoutFlagView(context);
        noSystemUiLayoutFlagView.setWillNotDraw(true);
        this.mNoSystemUiLayoutFlagView = noSystemUiLayoutFlagView;
        addView(noSystemUiLayoutFlagView);
    }

    public static boolean applyInsets(View view, Rect rect, boolean z) {
        boolean z2;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int i = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
        int i2 = rect.left;
        if (i != i2) {
            ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = i2;
            z2 = true;
        } else {
            z2 = false;
        }
        int i3 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
        int i4 = rect.top;
        if (i3 != i4) {
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = i4;
            z2 = true;
        }
        int i5 = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
        int i6 = rect.right;
        if (i5 != i6) {
            ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = i6;
            z2 = true;
        }
        if (z) {
            int i7 = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
            int i8 = rect.bottom;
            if (i7 != i8) {
                ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = i8;
                return true;
            }
        }
        return z2;
    }

    public final boolean canShowOverflowMenu() {
        ActionMenuView actionMenuView;
        pullChildren();
        Toolbar toolbar = ((ToolbarWidgetWrapper) this.mDecorToolbar).mToolbar;
        return toolbar.getVisibility() == 0 && (actionMenuView = toolbar.mMenuView) != null && actionMenuView.mReserveOverflow;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public final void dismissPopups() {
        ActionMenuPresenter actionMenuPresenter;
        pullChildren();
        ActionMenuView actionMenuView = ((ToolbarWidgetWrapper) this.mDecorToolbar).mToolbar.mMenuView;
        if (actionMenuView == null || (actionMenuPresenter = actionMenuView.mPresenter) == null) {
            return;
        }
        actionMenuPresenter.hideOverflowMenu();
        ActionMenuPresenter.OverflowPopup overflowPopup = actionMenuPresenter.mActionButtonPopup;
        if (overflowPopup == null || !overflowPopup.isShowing()) {
            return;
        }
        overflowPopup.mPopup.dismiss();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        if (this.mWindowContentOverlay != null) {
            if (this.mActionBarTop.getVisibility() == 0) {
                i = (int) (this.mActionBarTop.getTranslationY() + this.mActionBarTop.getBottom() + 0.5f);
            } else {
                i = 0;
            }
            this.mWindowContentOverlay.setBounds(0, i, getWidth(), this.mWindowContentOverlay.getIntrinsicHeight() + i);
            this.mWindowContentOverlay.draw(canvas);
        }
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public final int getNestedScrollAxes() {
        return this.mParentHelper.getNestedScrollAxes();
    }

    public final void haltActionBarHideOffsetAnimations() {
        removeCallbacks(this.mRemoveActionBarHideOffset);
        removeCallbacks(this.mAddActionBarHideOffset);
        ViewPropertyAnimator viewPropertyAnimator = this.mCurrentActionBarTopAnimator;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final boolean hideOverflowMenu() {
        ActionMenuPresenter actionMenuPresenter;
        pullChildren();
        ActionMenuView actionMenuView = ((ToolbarWidgetWrapper) this.mDecorToolbar).mToolbar.mMenuView;
        return (actionMenuView == null || (actionMenuPresenter = actionMenuView.mPresenter) == null || !actionMenuPresenter.hideOverflowMenu()) ? false : true;
    }

    public final void init(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(ATTRS);
        this.mActionBarHeight = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.mWindowContentOverlay = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        this.mFlingEstimator = new OverScroller(context);
    }

    public final void initFeature(int i) {
        pullChildren();
        if (i == 2) {
            ((ToolbarWidgetWrapper) this.mDecorToolbar).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else if (i == 5) {
            ((ToolbarWidgetWrapper) this.mDecorToolbar).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else {
            if (i != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    public final boolean isOverflowMenuShowPending() {
        ActionMenuPresenter actionMenuPresenter;
        pullChildren();
        ActionMenuView actionMenuView = ((ToolbarWidgetWrapper) this.mDecorToolbar).mToolbar.mMenuView;
        if (actionMenuView == null || (actionMenuPresenter = actionMenuView.mPresenter) == null) {
            return false;
        }
        return actionMenuPresenter.mPostedOpenRunnable != null || actionMenuPresenter.isOverflowMenuShowing();
    }

    public final boolean isOverflowMenuShowing() {
        pullChildren();
        return ((ToolbarWidgetWrapper) this.mDecorToolbar).mToolbar.isOverflowMenuShowing();
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        pullChildren();
        WindowInsetsCompat windowInsetsCompat = WindowInsetsCompat.toWindowInsetsCompat(windowInsets, this);
        boolean applyInsets = applyInsets(this.mActionBarTop, new Rect(windowInsetsCompat.getSystemWindowInsetLeft(), windowInsetsCompat.getSystemWindowInsetTop(), windowInsetsCompat.getSystemWindowInsetRight(), windowInsetsCompat.getSystemWindowInsetBottom()), false);
        WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
        Rect rect = this.mBaseContentInsets;
        ViewCompat.Api21Impl.computeSystemWindowInsets(this, windowInsetsCompat, rect);
        int i = rect.left;
        int i2 = rect.top;
        int i3 = rect.right;
        int i4 = rect.bottom;
        WindowInsetsCompat.Impl impl = windowInsetsCompat.mImpl;
        WindowInsetsCompat inset = impl.inset(i, i2, i3, i4);
        this.mBaseInnerInsets = inset;
        boolean z = true;
        if (!this.mLastBaseInnerInsets.equals(inset)) {
            this.mLastBaseInnerInsets = this.mBaseInnerInsets;
            applyInsets = true;
        }
        Rect rect2 = this.mLastBaseContentInsets;
        if (rect2.equals(rect)) {
            z = applyInsets;
        } else {
            rect2.set(rect);
        }
        if (z) {
            requestLayout();
        }
        return impl.consumeDisplayCutout().mImpl.consumeSystemWindowInsets().mImpl.consumeStableInsets().toWindowInsets();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        init(getContext());
        WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        haltActionBarHideOffsetAnimations();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + paddingLeft;
                int i7 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0116  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i, int i2) {
        int measuredHeight;
        pullChildren();
        measureChildWithMargins(this.mActionBarTop, i, 0, i2, 0);
        LayoutParams layoutParams = (LayoutParams) this.mActionBarTop.getLayoutParams();
        int max = Math.max(0, this.mActionBarTop.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin);
        int max2 = Math.max(0, this.mActionBarTop.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.mActionBarTop.getMeasuredState());
        WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
        boolean z = (getWindowSystemUiVisibility() & 256) != 0;
        if (z) {
            measuredHeight = this.mActionBarHeight;
            if (this.mHasNonEmbeddedTabs && this.mActionBarTop.mTabContainer != null) {
                measuredHeight += measuredHeight;
            }
        } else {
            measuredHeight = this.mActionBarTop.getVisibility() != 8 ? this.mActionBarTop.getMeasuredHeight() : 0;
        }
        Rect rect = this.mBaseContentInsets;
        Rect rect2 = this.mContentInsets;
        rect2.set(rect);
        this.mInnerInsets = this.mBaseInnerInsets;
        if (!this.mOverlayMode && !z) {
            NoSystemUiLayoutFlagView noSystemUiLayoutFlagView = this.mNoSystemUiLayoutFlagView;
            WindowInsetsCompat windowInsetsCompat = NON_EMPTY_SYSTEM_WINDOW_INSETS;
            Rect rect3 = this.mTmpRect;
            ViewCompat.Api21Impl.computeSystemWindowInsets(noSystemUiLayoutFlagView, windowInsetsCompat, rect3);
            if (!rect3.equals(ZERO_INSETS)) {
                rect2.top += measuredHeight;
                rect2.bottom = rect2.bottom;
                this.mInnerInsets = this.mInnerInsets.mImpl.inset(0, measuredHeight, 0, 0);
                applyInsets(this.mContent, rect2, true);
                if (!this.mLastInnerInsets.equals(this.mInnerInsets)) {
                    WindowInsetsCompat windowInsetsCompat2 = this.mInnerInsets;
                    this.mLastInnerInsets = windowInsetsCompat2;
                    ViewCompat.dispatchApplyWindowInsets(this.mContent, windowInsetsCompat2);
                }
                measureChildWithMargins(this.mContent, i, 0, i2, 0);
                LayoutParams layoutParams2 = (LayoutParams) this.mContent.getLayoutParams();
                int max3 = Math.max(max, this.mContent.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin);
                int max4 = Math.max(max2, this.mContent.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin);
                int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.mContent.getMeasuredState());
                setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max3, getSuggestedMinimumWidth()), i, combineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max4, getSuggestedMinimumHeight()), i2, combineMeasuredStates2 << 16));
            }
        }
        Insets of = Insets.of(this.mInnerInsets.getSystemWindowInsetLeft(), this.mInnerInsets.getSystemWindowInsetTop() + measuredHeight, this.mInnerInsets.getSystemWindowInsetRight(), this.mInnerInsets.getSystemWindowInsetBottom());
        WindowInsetsCompat windowInsetsCompat3 = this.mInnerInsets;
        int i3 = Build.VERSION.SDK_INT;
        WindowInsetsCompat.BuilderImpl builderImpl36 = i3 >= 36 ? new WindowInsetsCompat.BuilderImpl36(windowInsetsCompat3) : i3 >= 35 ? new WindowInsetsCompat.BuilderImpl35(windowInsetsCompat3) : i3 >= 34 ? new WindowInsetsCompat.BuilderImpl34(windowInsetsCompat3) : i3 >= 31 ? new WindowInsetsCompat.BuilderImpl31(windowInsetsCompat3) : i3 >= 30 ? new WindowInsetsCompat.BuilderImpl30(windowInsetsCompat3) : new WindowInsetsCompat.BuilderImpl29(windowInsetsCompat3);
        builderImpl36.setSystemWindowInsets(of);
        this.mInnerInsets = builderImpl36.build();
        applyInsets(this.mContent, rect2, true);
        if (!this.mLastInnerInsets.equals(this.mInnerInsets)) {
        }
        measureChildWithMargins(this.mContent, i, 0, i2, 0);
        LayoutParams layoutParams22 = (LayoutParams) this.mContent.getLayoutParams();
        int max32 = Math.max(max, this.mContent.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) layoutParams22).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams22).rightMargin);
        int max42 = Math.max(max2, this.mContent.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams22).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams22).bottomMargin);
        int combineMeasuredStates22 = View.combineMeasuredStates(combineMeasuredStates, this.mContent.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max32, getSuggestedMinimumWidth()), i, combineMeasuredStates22), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max42, getSuggestedMinimumHeight()), i2, combineMeasuredStates22 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.mHideOnContentScroll || !z) {
            return false;
        }
        this.mFlingEstimator.fling(0, 0, 0, (int) f2, 0, 0, PKIFailureInfo.systemUnavail, Integer.MAX_VALUE);
        if (this.mFlingEstimator.getFinalY() > this.mActionBarTop.getHeight()) {
            haltActionBarHideOffsetAnimations();
            this.mAddActionBarHideOffset.run();
        } else {
            haltActionBarHideOffsetAnimations();
            this.mRemoveActionBarHideOffset.run();
        }
        this.mAnimatingForFling = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.mHideOnContentScrollReference + i2;
        this.mHideOnContentScrollReference = i5;
        setActionBarHideOffset(i5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        WindowDecorActionBar windowDecorActionBar;
        ViewPropertyAnimatorCompatSet viewPropertyAnimatorCompatSet;
        this.mParentHelper.mNestedScrollAxesTouch = i;
        ActionBarContainer actionBarContainer = this.mActionBarTop;
        this.mHideOnContentScrollReference = actionBarContainer != null ? -((int) actionBarContainer.getTranslationY()) : 0;
        haltActionBarHideOffsetAnimations();
        ActionBarVisibilityCallback actionBarVisibilityCallback = this.mActionBarVisibilityCallback;
        if (actionBarVisibilityCallback == null || (viewPropertyAnimatorCompatSet = (windowDecorActionBar = (WindowDecorActionBar) actionBarVisibilityCallback).mCurrentShowAnim) == null) {
            return;
        }
        viewPropertyAnimatorCompatSet.cancel();
        windowDecorActionBar.mCurrentShowAnim = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.mActionBarTop.getVisibility() != 0) {
            return false;
        }
        return this.mHideOnContentScroll;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.mHideOnContentScroll || this.mAnimatingForFling) {
            return;
        }
        if (this.mHideOnContentScrollReference <= this.mActionBarTop.getHeight()) {
            haltActionBarHideOffsetAnimations();
            postDelayed(this.mRemoveActionBarHideOffset, 600L);
        } else {
            haltActionBarHideOffsetAnimations();
            postDelayed(this.mAddActionBarHideOffset, 600L);
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        pullChildren();
        int i2 = this.mLastSystemUiVisibility ^ i;
        this.mLastSystemUiVisibility = i;
        boolean z = (i & 4) == 0;
        boolean z2 = (i & 256) != 0;
        ActionBarVisibilityCallback actionBarVisibilityCallback = this.mActionBarVisibilityCallback;
        if (actionBarVisibilityCallback != null) {
            WindowDecorActionBar windowDecorActionBar = (WindowDecorActionBar) actionBarVisibilityCallback;
            windowDecorActionBar.mContentAnimations = !z2;
            if (z || !z2) {
                if (windowDecorActionBar.mHiddenBySystem) {
                    windowDecorActionBar.mHiddenBySystem = false;
                    windowDecorActionBar.updateVisibility(true);
                }
            } else if (!windowDecorActionBar.mHiddenBySystem) {
                windowDecorActionBar.mHiddenBySystem = true;
                windowDecorActionBar.updateVisibility(true);
            }
        }
        if ((i2 & 256) == 0 || this.mActionBarVisibilityCallback == null) {
            return;
        }
        WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
        requestApplyInsets();
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.mWindowVisibility = i;
        ActionBarVisibilityCallback actionBarVisibilityCallback = this.mActionBarVisibilityCallback;
        if (actionBarVisibilityCallback != null) {
            ((WindowDecorActionBar) actionBarVisibilityCallback).mCurWindowVisibility = i;
        }
    }

    public final void pullChildren() {
        DecorToolbar decorToolbar;
        if (this.mContent == null) {
            this.mContent = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.mActionBarTop = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback findViewById = findViewById(R.id.action_bar);
            if (findViewById instanceof DecorToolbar) {
                decorToolbar = (DecorToolbar) findViewById;
            } else {
                if (!(findViewById instanceof Toolbar)) {
                    a$$ExternalSyntheticBUOutline0.m$1("Can't make a decor toolbar out of ".concat(findViewById.getClass().getSimpleName()));
                    return;
                }
                Toolbar toolbar = (Toolbar) findViewById;
                if (toolbar.mWrapper == null) {
                    toolbar.mWrapper = new ToolbarWidgetWrapper(toolbar, true);
                }
                decorToolbar = toolbar.mWrapper;
            }
            this.mDecorToolbar = decorToolbar;
        }
    }

    public void setActionBarHideOffset(int i) {
        haltActionBarHideOffsetAnimations();
        this.mActionBarTop.setTranslationY(-Math.max(0, Math.min(i, this.mActionBarTop.getHeight())));
    }

    public void setActionBarVisibilityCallback(ActionBarVisibilityCallback actionBarVisibilityCallback) {
        this.mActionBarVisibilityCallback = actionBarVisibilityCallback;
        if (getWindowToken() != null) {
            ((WindowDecorActionBar) this.mActionBarVisibilityCallback).mCurWindowVisibility = this.mWindowVisibility;
            int i = this.mLastSystemUiVisibility;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
                requestApplyInsets();
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.mHasNonEmbeddedTabs = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.mHideOnContentScroll) {
            this.mHideOnContentScroll = z;
            if (z) {
                return;
            }
            haltActionBarHideOffsetAnimations();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i) {
        pullChildren();
        ToolbarWidgetWrapper toolbarWidgetWrapper = (ToolbarWidgetWrapper) this.mDecorToolbar;
        toolbarWidgetWrapper.mIcon = i != 0 ? DimensionKt.getDrawable(toolbarWidgetWrapper.mToolbar.getContext(), i) : null;
        toolbarWidgetWrapper.updateToolbarLogo();
    }

    public void setLogo(int i) {
        pullChildren();
        ToolbarWidgetWrapper toolbarWidgetWrapper = (ToolbarWidgetWrapper) this.mDecorToolbar;
        toolbarWidgetWrapper.mLogo = i != 0 ? DimensionKt.getDrawable(toolbarWidgetWrapper.mToolbar.getContext(), i) : null;
        toolbarWidgetWrapper.updateToolbarLogo();
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public void setMenu(Menu menu, MenuPresenter.Callback callback) {
        pullChildren();
        ToolbarWidgetWrapper toolbarWidgetWrapper = (ToolbarWidgetWrapper) this.mDecorToolbar;
        Toolbar toolbar = toolbarWidgetWrapper.mToolbar;
        if (toolbarWidgetWrapper.mActionMenuPresenter == null) {
            toolbarWidgetWrapper.mActionMenuPresenter = new ActionMenuPresenter(toolbar.getContext());
        }
        ActionMenuPresenter actionMenuPresenter = toolbarWidgetWrapper.mActionMenuPresenter;
        actionMenuPresenter.mCallback = callback;
        toolbar.setMenu((MenuBuilder) menu, actionMenuPresenter);
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public void setMenuPrepared() {
        pullChildren();
        ((ToolbarWidgetWrapper) this.mDecorToolbar).mMenuPrepared = true;
    }

    public void setOverlayMode(boolean z) {
        this.mOverlayMode = z;
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public void setWindowCallback(Window.Callback callback) {
        pullChildren();
        ((ToolbarWidgetWrapper) this.mDecorToolbar).mWindowCallback = callback;
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public void setWindowTitle(CharSequence charSequence) {
        pullChildren();
        ToolbarWidgetWrapper toolbarWidgetWrapper = (ToolbarWidgetWrapper) this.mDecorToolbar;
        if (toolbarWidgetWrapper.mTitleSet) {
            return;
        }
        Toolbar toolbar = toolbarWidgetWrapper.mToolbar;
        toolbarWidgetWrapper.mTitle = charSequence;
        if ((toolbarWidgetWrapper.mDisplayOpts & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (toolbarWidgetWrapper.mTitleSet) {
                ViewCompat.setAccessibilityPaneTitle(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public final boolean showOverflowMenu() {
        pullChildren();
        return ((ToolbarWidgetWrapper) this.mDecorToolbar).mToolbar.showOverflowMenu();
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    @Override // androidx.core.view.NestedScrollingParent3
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        onNestedScroll(view, i, i2, i3, i4, i5);
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public final boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    public void setIcon(Drawable drawable) {
        pullChildren();
        ToolbarWidgetWrapper toolbarWidgetWrapper = (ToolbarWidgetWrapper) this.mDecorToolbar;
        toolbarWidgetWrapper.mIcon = drawable;
        toolbarWidgetWrapper.updateToolbarLogo();
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public final void onNestedScrollAccepted(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public final void onStopNestedScroll(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    public ActionBarOverlayLayout(Context context) {
        this(context, null);
    }
}
