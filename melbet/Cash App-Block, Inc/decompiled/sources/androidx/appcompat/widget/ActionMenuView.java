package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.appcompat.view.menu.MenuView;
import androidx.appcompat.widget.ActionMenuPresenter;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.camera.view.PreviewView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.GlideBuilder$1;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public class ActionMenuView extends LinearLayoutCompat implements MenuBuilder.ItemInvoker, MenuView {
    public MenuPresenter.Callback mActionMenuPresenterCallback;
    public boolean mFormatItems;
    public int mFormatItemsWidth;
    public final int mGeneratedItemPadding;
    public MenuBuilder mMenu;
    public MenuBuilder.Callback mMenuBuilderCallback;
    public final int mMinCellSize;
    public OnMenuItemClickListener mOnMenuItemClickListener;
    public Context mPopupContext;
    public int mPopupTheme;
    public ActionMenuPresenter mPresenter;
    public boolean mReserveOverflow;

    public interface ActionMenuChildView {
        boolean needsDividerAfter();

        boolean needsDividerBefore();
    }

    public static class LayoutParams extends LinearLayoutCompat.LayoutParams {
        public int cellsUsed;
        public boolean expandable;
        public boolean expanded;
        public int extraPixels;
        public boolean isOverflowButton;
        public boolean preventEdgeOffset;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public interface OnMenuItemClickListener {
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.mMinCellSize = (int) (56.0f * f);
        this.mGeneratedItemPadding = (int) (f * 4.0f);
        this.mPopupContext = context;
        this.mPopupTheme = 0;
    }

    public static LayoutParams generateDefaultLayoutParams() {
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        layoutParams.isOverflowButton = false;
        ((LinearLayout.LayoutParams) layoutParams).gravity = 16;
        return layoutParams;
    }

    public static LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        LayoutParams layoutParams2;
        if (layoutParams == null) {
            return generateDefaultLayoutParams();
        }
        if (layoutParams instanceof LayoutParams) {
            LayoutParams layoutParams3 = (LayoutParams) layoutParams;
            layoutParams2 = new LayoutParams(layoutParams3);
            layoutParams2.isOverflowButton = layoutParams3.isOverflowButton;
        } else {
            layoutParams2 = new LayoutParams(layoutParams);
        }
        if (((LinearLayout.LayoutParams) layoutParams2).gravity <= 0) {
            ((LinearLayout.LayoutParams) layoutParams2).gravity = 16;
        }
        return layoutParams2;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public final MenuBuilder getMenu() {
        if (this.mMenu == null) {
            Context context = getContext();
            MenuBuilder menuBuilder = new MenuBuilder(context);
            this.mMenu = menuBuilder;
            menuBuilder.mCallback = new PreviewView.AnonymousClass1(this, false);
            ActionMenuPresenter actionMenuPresenter = new ActionMenuPresenter(context);
            this.mPresenter = actionMenuPresenter;
            actionMenuPresenter.mReserveOverflow = true;
            actionMenuPresenter.mReserveOverflowSet = true;
            MenuPresenter.Callback callback = this.mActionMenuPresenterCallback;
            if (callback == null) {
                callback = new GlideBuilder$1();
            }
            actionMenuPresenter.mCallback = callback;
            this.mMenu.addMenuPresenter(actionMenuPresenter, this.mPopupContext);
            ActionMenuPresenter actionMenuPresenter2 = this.mPresenter;
            actionMenuPresenter2.mMenuView = this;
            this.mMenu = actionMenuPresenter2.mMenu;
        }
        return this.mMenu;
    }

    public final boolean hasSupportDividerBeforeChildAt(int i) {
        boolean z = false;
        if (i == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i - 1);
        KeyEvent.Callback childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof ActionMenuChildView)) {
            z = ((ActionMenuChildView) childAt).needsDividerAfter();
        }
        return (i <= 0 || !(childAt2 instanceof ActionMenuChildView)) ? z : ((ActionMenuChildView) childAt2).needsDividerBefore() | z;
    }

    @Override // androidx.appcompat.view.menu.MenuView
    public final void initialize(MenuBuilder menuBuilder) {
        this.mMenu = menuBuilder;
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder.ItemInvoker
    public final boolean invokeItem(MenuItemImpl menuItemImpl) {
        return this.mMenu.performItemAction(menuItemImpl, null, 0);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ActionMenuPresenter actionMenuPresenter = this.mPresenter;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.updateMenuView();
            if (this.mPresenter.isOverflowMenuShowing()) {
                this.mPresenter.hideOverflowMenu();
                this.mPresenter.showOverflowMenu();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ActionMenuPresenter actionMenuPresenter = this.mPresenter;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.hideOverflowMenu();
            ActionMenuPresenter.OverflowPopup overflowPopup = actionMenuPresenter.mActionButtonPopup;
            if (overflowPopup == null || !overflowPopup.isShowing()) {
                return;
            }
            overflowPopup.mPopup.dismiss();
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int width;
        int i5;
        if (!this.mFormatItems) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i6 = (i4 - i2) / 2;
        int i7 = this.mDividerWidth;
        int i8 = i3 - i;
        int paddingRight = (i8 - getPaddingRight()) - getPaddingLeft();
        boolean z2 = getLayoutDirection() == 1;
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.isOverflowButton) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (hasSupportDividerBeforeChildAt(i11)) {
                        measuredWidth += i7;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (z2) {
                        i5 = getPaddingLeft() + ((LinearLayout.LayoutParams) layoutParams).leftMargin;
                        width = i5 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) layoutParams).rightMargin;
                        i5 = width - measuredWidth;
                    }
                    int i12 = i6 - (measuredHeight / 2);
                    childAt.layout(i5, i12, width, measuredHeight + i12);
                    paddingRight -= measuredWidth;
                    i9 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) layoutParams).leftMargin) + ((LinearLayout.LayoutParams) layoutParams).rightMargin;
                    hasSupportDividerBeforeChildAt(i11);
                    i10++;
                }
            }
        }
        if (childCount == 1 && i9 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i13 = (i8 / 2) - (measuredWidth2 / 2);
            int i14 = i6 - (measuredHeight2 / 2);
            childAt2.layout(i13, i14, measuredWidth2 + i13, measuredHeight2 + i14);
            return;
        }
        int i15 = i10 - (i9 ^ 1);
        int max = Math.max(0, i15 > 0 ? paddingRight / i15 : 0);
        if (z2) {
            int width2 = getWidth() - getPaddingRight();
            for (int i16 = 0; i16 < childCount; i16++) {
                View childAt3 = getChildAt(i16);
                LayoutParams layoutParams2 = (LayoutParams) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !layoutParams2.isOverflowButton) {
                    int i17 = width2 - ((LinearLayout.LayoutParams) layoutParams2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i18 = i6 - (measuredHeight3 / 2);
                    childAt3.layout(i17 - measuredWidth3, i18, i17, measuredHeight3 + i18);
                    width2 = i17 - ((measuredWidth3 + ((LinearLayout.LayoutParams) layoutParams2).leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i19 = 0; i19 < childCount; i19++) {
            View childAt4 = getChildAt(i19);
            LayoutParams layoutParams3 = (LayoutParams) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !layoutParams3.isOverflowButton) {
                int i20 = paddingLeft + ((LinearLayout.LayoutParams) layoutParams3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i21 = i6 - (measuredHeight4 / 2);
                childAt4.layout(i20, i21, i20 + measuredWidth4, measuredHeight4 + i21);
                paddingLeft = JsonLogicResult$Success$$ExternalSyntheticOutline0.m$1(measuredWidth4, ((LinearLayout.LayoutParams) layoutParams3).rightMargin, max, i20);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v41 */
    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        ?? r11;
        int i5;
        int i6;
        MenuBuilder menuBuilder;
        boolean z = this.mFormatItems;
        boolean z2 = View.MeasureSpec.getMode(i) == 1073741824;
        this.mFormatItems = z2;
        if (z != z2) {
            this.mFormatItemsWidth = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (this.mFormatItems && (menuBuilder = this.mMenu) != null && size != this.mFormatItemsWidth) {
            this.mFormatItemsWidth = size;
            menuBuilder.onItemsChanged(true);
        }
        int childCount = getChildCount();
        if (!this.mFormatItems || childCount <= 0) {
            for (int i7 = 0; i7 < childCount; i7++) {
                LayoutParams layoutParams = (LayoutParams) getChildAt(i7).getLayoutParams();
                ((LinearLayout.LayoutParams) layoutParams).rightMargin = 0;
                ((LinearLayout.LayoutParams) layoutParams).leftMargin = 0;
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
        int i9 = this.mMinCellSize;
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
            i3 = this.mGeneratedItemPadding;
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
                LayoutParams layoutParams2 = (LayoutParams) childAt.getLayoutParams();
                layoutParams2.expanded = false;
                layoutParams2.extraPixels = 0;
                layoutParams2.cellsUsed = 0;
                layoutParams2.expandable = false;
                ((LinearLayout.LayoutParams) layoutParams2).leftMargin = 0;
                ((LinearLayout.LayoutParams) layoutParams2).rightMargin = 0;
                layoutParams2.preventEdgeOffset = z4 && !TextUtils.isEmpty(((ActionMenuItemView) childAt).getText());
                int i20 = layoutParams2.isOverflowButton ? 1 : i10;
                LayoutParams layoutParams3 = (LayoutParams) childAt.getLayoutParams();
                int i21 = i10;
                i5 = i12;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - i19, View.MeasureSpec.getMode(childMeasureSpec));
                ActionMenuItemView actionMenuItemView = z4 ? (ActionMenuItemView) childAt : null;
                boolean z5 = (actionMenuItemView == null || TextUtils.isEmpty(actionMenuItemView.getText())) ? false : true;
                boolean z6 = z5;
                if (i20 <= 0 || (z5 && i20 < 2)) {
                    i6 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i5 * i20, PKIFailureInfo.systemUnavail), makeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i6 = measuredWidth / i5;
                    if (measuredWidth % i5 != 0) {
                        i6++;
                    }
                    if (z6 && i6 < 2) {
                        i6 = 2;
                    }
                }
                layoutParams3.expandable = !layoutParams3.isOverflowButton && z6;
                layoutParams3.cellsUsed = i6;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i6 * i5, 1073741824), makeMeasureSpec);
                i15 = Math.max(i15, i6);
                if (layoutParams2.expandable) {
                    i17++;
                }
                if (layoutParams2.isOverflowButton) {
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
                LayoutParams layoutParams4 = (LayoutParams) getChildAt(i28).getLayoutParams();
                boolean z9 = z7;
                if (layoutParams4.expandable) {
                    int i30 = layoutParams4.cellsUsed;
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
                LayoutParams layoutParams5 = (LayoutParams) childAt2.getLayoutParams();
                boolean z11 = z3;
                long j3 = 1 << i32;
                if ((j2 & j3) != 0) {
                    if (z10 && layoutParams5.preventEdgeOffset) {
                        r11 = 1;
                        r11 = 1;
                        if (i25 == 1) {
                            childAt2.setPadding(i3 + i24, 0, i3, 0);
                        }
                    } else {
                        r11 = 1;
                    }
                    layoutParams5.cellsUsed += r11;
                    layoutParams5.expanded = r11;
                    i25--;
                } else if (layoutParams5.cellsUsed == i31) {
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
                if ((j & 1) != 0 && !((LayoutParams) getChildAt(0).getLayoutParams()).preventEdgeOffset) {
                    bitCount -= 0.5f;
                }
                int i33 = childCount2 - 1;
                if ((j & (1 << i33)) != 0 && !((LayoutParams) getChildAt(i33).getLayoutParams()).preventEdgeOffset) {
                    bitCount -= 0.5f;
                }
            }
            int i34 = bitCount > RecyclerView.DECELERATION_RATE ? (int) ((i25 * i24) / bitCount) : 0;
            boolean z13 = z8;
            for (int i35 = 0; i35 < childCount2; i35++) {
                if ((j & (1 << i35)) != 0) {
                    View childAt3 = getChildAt(i35);
                    LayoutParams layoutParams6 = (LayoutParams) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        layoutParams6.extraPixels = i34;
                        layoutParams6.expanded = true;
                        if (i35 == 0 && !layoutParams6.preventEdgeOffset) {
                            ((LinearLayout.LayoutParams) layoutParams6).leftMargin = (-i34) / 2;
                        }
                        z13 = true;
                    } else if (layoutParams6.isOverflowButton) {
                        layoutParams6.extraPixels = i34;
                        layoutParams6.expanded = true;
                        ((LinearLayout.LayoutParams) layoutParams6).rightMargin = (-i34) / 2;
                        z13 = true;
                    } else {
                        if (i35 != 0) {
                            ((LinearLayout.LayoutParams) layoutParams6).leftMargin = i34 / 2;
                        }
                        if (i35 != childCount2 - 1) {
                            ((LinearLayout.LayoutParams) layoutParams6).rightMargin = i34 / 2;
                        }
                    }
                }
            }
            z8 = z13;
        }
        if (z8) {
            for (int i36 = 0; i36 < childCount2; i36++) {
                View childAt4 = getChildAt(i36);
                LayoutParams layoutParams7 = (LayoutParams) childAt4.getLayoutParams();
                if (layoutParams7.expanded) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((layoutParams7.cellsUsed * i24) + layoutParams7.extraPixels, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i8, mode != 1073741824 ? i4 : i22);
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.mPresenter.mExpandedActionViewsExclusive = z;
    }

    public void setMenuCallbacks(MenuPresenter.Callback callback, MenuBuilder.Callback callback2) {
        this.mActionMenuPresenterCallback = callback;
        this.mMenuBuilderCallback = callback2;
    }

    public void setOnMenuItemClickListener(OnMenuItemClickListener onMenuItemClickListener) {
        this.mOnMenuItemClickListener = onMenuItemClickListener;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        ActionMenuPresenter actionMenuPresenter = this.mPresenter;
        ActionMenuPresenter.OverflowMenuButton overflowMenuButton = actionMenuPresenter.mOverflowButton;
        if (overflowMenuButton != null) {
            overflowMenuButton.setImageDrawable(drawable);
        } else {
            actionMenuPresenter.mPendingOverflowIconSet = true;
            actionMenuPresenter.mPendingOverflowIcon = drawable;
        }
    }

    public void setOverflowReserved(boolean z) {
        this.mReserveOverflow = z;
    }

    public void setPopupTheme(int i) {
        if (this.mPopupTheme != i) {
            this.mPopupTheme = i;
            if (i == 0) {
                this.mPopupContext = getContext();
            } else {
                this.mPopupContext = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(ActionMenuPresenter actionMenuPresenter) {
        this.mPresenter = actionMenuPresenter;
        actionMenuPresenter.mMenuView = this;
        this.mMenu = actionMenuPresenter.mMenu;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ LinearLayoutCompat.LayoutParams generateDefaultLayoutParams() {
        return generateDefaultLayoutParams();
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return generateDefaultLayoutParams();
    }

    public ActionMenuView(Context context) {
        this(context, null);
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ LinearLayoutCompat.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateLayoutParams(layoutParams);
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final LinearLayoutCompat.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateLayoutParams(layoutParams);
    }
}
