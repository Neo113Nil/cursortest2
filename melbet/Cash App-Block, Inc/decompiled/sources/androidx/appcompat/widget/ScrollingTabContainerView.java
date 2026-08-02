package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.SpinnerAdapter;
import androidx.appcompat.view.ActionBarPolicy;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.widget.ActionMenuPresenter;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.FastScroller;
import com.squareup.cash.R;
import com.squareup.wire.GrpcMethod;

/* loaded from: classes3.dex */
public class ScrollingTabContainerView extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {
    public boolean mAllowCollapse;
    public int mContentHeight;
    public int mMaxTabWidth;
    public int mSelectedTabIndex;
    public int mStackedTabMaxWidth;
    public final LinearLayoutCompat mTabLayout;
    public AnonymousClass1 mTabSelector;
    public AppCompatSpinner mTabSpinner;

    /* renamed from: androidx.appcompat.widget.ScrollingTabContainerView$1, reason: invalid class name */
    public final class AnonymousClass1 implements Runnable {
        public final /* synthetic */ int $r8$classId;
        public final /* synthetic */ Object this$0;
        public final Object val$tabView;

        public /* synthetic */ AnonymousClass1(int i, Object obj, Object obj2) {
            this.$r8$classId = i;
            this.this$0 = obj;
            this.val$tabView = obj2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            MenuBuilder.Callback callback;
            int i = this.$r8$classId;
            Object obj = this.this$0;
            Object obj2 = this.val$tabView;
            switch (i) {
                case 0:
                    View view = (View) obj2;
                    ScrollingTabContainerView scrollingTabContainerView = (ScrollingTabContainerView) obj;
                    scrollingTabContainerView.smoothScrollTo(view.getLeft() - ((scrollingTabContainerView.getWidth() - view.getWidth()) / 2), 0);
                    scrollingTabContainerView.mTabSelector = null;
                    break;
                default:
                    ActionMenuPresenter.OverflowPopup overflowPopup = (ActionMenuPresenter.OverflowPopup) obj2;
                    ActionMenuPresenter actionMenuPresenter = (ActionMenuPresenter) obj;
                    MenuBuilder menuBuilder = actionMenuPresenter.mMenu;
                    if (menuBuilder != null && (callback = menuBuilder.mCallback) != null) {
                        callback.onMenuModeChange(menuBuilder);
                    }
                    View view2 = (View) actionMenuPresenter.mMenuView;
                    if (view2 != null && view2.getWindowToken() != null) {
                        if (!overflowPopup.isShowing()) {
                            if (overflowPopup.mAnchorView != null) {
                                overflowPopup.showPopup(0, 0, false, false);
                            }
                        }
                        actionMenuPresenter.mOverflowPopup = overflowPopup;
                    }
                    actionMenuPresenter.mPostedOpenRunnable = null;
                    break;
            }
        }
    }

    public final class TabAdapter extends BaseAdapter {
        public TabAdapter() {
        }

        @Override // android.widget.Adapter
        public final int getCount() {
            return ScrollingTabContainerView.this.mTabLayout.getChildCount();
        }

        @Override // android.widget.Adapter
        public final Object getItem(int i) {
            ((TabView) ScrollingTabContainerView.this.mTabLayout.getChildAt(i)).getClass();
            return null;
        }

        @Override // android.widget.Adapter
        public final long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public final View getView(int i, View view, ViewGroup viewGroup) {
            if (view != null) {
                getItem(i);
                throw null;
            }
            getItem(i);
            ScrollingTabContainerView scrollingTabContainerView = ScrollingTabContainerView.this;
            scrollingTabContainerView.new TabView(scrollingTabContainerView.getContext());
            throw null;
        }
    }

    public final class TabView extends LinearLayout {
        public TabView(Context context) {
            super(context, null, R.attr.actionBarTabStyle);
            GrpcMethod obtainStyledAttributes = GrpcMethod.obtainStyledAttributes(R.attr.actionBarTabStyle, 0, context, null, new int[]{android.R.attr.background});
            if (((TypedArray) obtainStyledAttributes.requestAdapter).hasValue(0)) {
                setBackgroundDrawable(obtainStyledAttributes.getDrawable(0));
            }
            obtainStyledAttributes.recycle();
            setGravity(8388627);
            throw null;
        }

        @Override // android.view.View
        public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        @Override // android.view.View
        public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        @Override // android.widget.LinearLayout, android.view.View
        public final void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            ScrollingTabContainerView scrollingTabContainerView = ScrollingTabContainerView.this;
            if (scrollingTabContainerView.mMaxTabWidth > 0) {
                int measuredWidth = getMeasuredWidth();
                int i3 = scrollingTabContainerView.mMaxTabWidth;
                if (measuredWidth > i3) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
                }
            }
        }

        @Override // android.view.View
        public void setSelected(boolean z) {
            boolean z2 = isSelected() != z;
            super.setSelected(z);
            if (z2 && z) {
                sendAccessibilityEvent(4);
            }
        }
    }

    static {
        new DecelerateInterpolator();
    }

    public ScrollingTabContainerView(Context context) {
        super(context);
        new FastScroller.AnimatorListener(this, 1);
        setHorizontalScrollBarEnabled(false);
        ActionBarPolicy actionBarPolicy = ActionBarPolicy.get(context);
        setContentHeight(actionBarPolicy.getTabContainerHeight());
        this.mStackedTabMaxWidth = actionBarPolicy.mContext.getResources().getDimensionPixelSize(R.dimen.abc_action_bar_stacked_tab_max_width);
        LinearLayoutCompat linearLayoutCompat = new LinearLayoutCompat(getContext(), null, R.attr.actionBarTabBarStyle);
        linearLayoutCompat.setMeasureWithLargestChildEnabled(true);
        linearLayoutCompat.setGravity(17);
        linearLayoutCompat.setLayoutParams(new LinearLayoutCompat.LayoutParams(-2, -1));
        this.mTabLayout = linearLayoutCompat;
        addView(linearLayoutCompat, new ViewGroup.LayoutParams(-2, -1));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        AnonymousClass1 anonymousClass1 = this.mTabSelector;
        if (anonymousClass1 != null) {
            post(anonymousClass1);
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ActionBarPolicy actionBarPolicy = ActionBarPolicy.get(getContext());
        setContentHeight(actionBarPolicy.getTabContainerHeight());
        this.mStackedTabMaxWidth = actionBarPolicy.mContext.getResources().getDimensionPixelSize(R.dimen.abc_action_bar_stacked_tab_max_width);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AnonymousClass1 anonymousClass1 = this.mTabSelector;
        if (anonymousClass1 != null) {
            removeCallbacks(anonymousClass1);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        ((TabView) view).getClass();
        throw null;
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        boolean z = mode == 1073741824;
        setFillViewport(z);
        LinearLayoutCompat linearLayoutCompat = this.mTabLayout;
        int childCount = linearLayoutCompat.getChildCount();
        if (childCount <= 1 || !(mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            this.mMaxTabWidth = -1;
        } else {
            if (childCount > 2) {
                this.mMaxTabWidth = (int) (View.MeasureSpec.getSize(i) * 0.4f);
            } else {
                this.mMaxTabWidth = View.MeasureSpec.getSize(i) / 2;
            }
            this.mMaxTabWidth = Math.min(this.mMaxTabWidth, this.mStackedTabMaxWidth);
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.mContentHeight, 1073741824);
        if (z || !this.mAllowCollapse) {
            performExpand();
        } else {
            linearLayoutCompat.measure(0, makeMeasureSpec);
            if (linearLayoutCompat.getMeasuredWidth() > View.MeasureSpec.getSize(i)) {
                AppCompatSpinner appCompatSpinner = this.mTabSpinner;
                if (appCompatSpinner == null || appCompatSpinner.getParent() != this) {
                    if (this.mTabSpinner == null) {
                        AppCompatSpinner appCompatSpinner2 = new AppCompatSpinner(getContext(), null, R.attr.actionDropDownStyle);
                        appCompatSpinner2.setLayoutParams(new LinearLayoutCompat.LayoutParams(-2, -1));
                        appCompatSpinner2.setOnItemSelectedListener(this);
                        this.mTabSpinner = appCompatSpinner2;
                    }
                    removeView(linearLayoutCompat);
                    addView(this.mTabSpinner, new ViewGroup.LayoutParams(-2, -1));
                    if (this.mTabSpinner.getAdapter() == null) {
                        this.mTabSpinner.setAdapter((SpinnerAdapter) new TabAdapter());
                    }
                    Runnable runnable = this.mTabSelector;
                    if (runnable != null) {
                        removeCallbacks(runnable);
                        this.mTabSelector = null;
                    }
                    this.mTabSpinner.setSelection(this.mSelectedTabIndex);
                }
            } else {
                performExpand();
            }
        }
        int measuredWidth = getMeasuredWidth();
        super.onMeasure(i, makeMeasureSpec);
        int measuredWidth2 = getMeasuredWidth();
        if (!z || measuredWidth == measuredWidth2) {
            return;
        }
        setTabSelected(this.mSelectedTabIndex);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }

    public final void performExpand() {
        AppCompatSpinner appCompatSpinner = this.mTabSpinner;
        if (appCompatSpinner == null || appCompatSpinner.getParent() != this) {
            return;
        }
        removeView(this.mTabSpinner);
        addView(this.mTabLayout, new ViewGroup.LayoutParams(-2, -1));
        setTabSelected(this.mTabSpinner.getSelectedItemPosition());
    }

    public void setAllowCollapse(boolean z) {
        this.mAllowCollapse = z;
    }

    public void setContentHeight(int i) {
        this.mContentHeight = i;
        requestLayout();
    }

    public void setTabSelected(int i) {
        this.mSelectedTabIndex = i;
        LinearLayoutCompat linearLayoutCompat = this.mTabLayout;
        int childCount = linearLayoutCompat.getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (i3 < childCount) {
            View childAt = linearLayoutCompat.getChildAt(i3);
            boolean z = i3 == i;
            childAt.setSelected(z);
            if (z) {
                View childAt2 = linearLayoutCompat.getChildAt(i);
                Runnable runnable = this.mTabSelector;
                if (runnable != null) {
                    removeCallbacks(runnable);
                }
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(i2, this, childAt2);
                this.mTabSelector = anonymousClass1;
                post(anonymousClass1);
            }
            i3++;
        }
        AppCompatSpinner appCompatSpinner = this.mTabSpinner;
        if (appCompatSpinner == null || i < 0) {
            return;
        }
        appCompatSpinner.setSelection(i);
    }
}
