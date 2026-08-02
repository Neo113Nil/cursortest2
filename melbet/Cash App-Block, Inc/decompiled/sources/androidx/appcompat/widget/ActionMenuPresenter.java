package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.ActionBarPolicy;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.BaseMenuPresenter;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.MenuItemWrapperICS;
import androidx.appcompat.view.menu.MenuPopup;
import androidx.appcompat.view.menu.MenuPopupHelper;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.appcompat.view.menu.MenuView;
import androidx.appcompat.view.menu.ShowableListMenu;
import androidx.appcompat.view.menu.SubMenuBuilder;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.ScrollingTabContainerView;
import androidx.biometric.BiometricPrompt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.R;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class ActionMenuPresenter extends BaseMenuPresenter {
    public final SparseBooleanArray mActionButtonGroups;
    public OverflowPopup mActionButtonPopup;
    public int mActionItemWidthLimit;
    public boolean mExpandedActionViewsExclusive;
    public int mMaxItems;
    public OverflowMenuButton mOverflowButton;
    public OverflowPopup mOverflowPopup;
    public Drawable mPendingOverflowIcon;
    public boolean mPendingOverflowIconSet;
    public ActionMenuPopupCallback mPopupCallback;
    public final BiometricPrompt mPopupPresenterCallback;
    public ScrollingTabContainerView.AnonymousClass1 mPostedOpenRunnable;
    public boolean mReserveOverflow;
    public boolean mReserveOverflowSet;
    public int mWidthLimit;

    public final class ActionMenuPopupCallback extends ActionMenuItemView.PopupCallback {
        public ActionMenuPopupCallback() {
        }
    }

    public ActionMenuPresenter(Context context) {
        this.mSystemContext = context;
        this.mSystemInflater = LayoutInflater.from(context);
        this.mMenuLayoutRes = R.layout.abc_action_menu_layout;
        this.mItemLayoutRes = R.layout.abc_action_menu_item_layout;
        this.mActionButtonGroups = new SparseBooleanArray();
        this.mPopupPresenterCallback = new BiometricPrompt(this, 4);
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final boolean flagActionItems() {
        int i;
        ArrayList arrayList;
        int i2;
        boolean z;
        ActionMenuPresenter actionMenuPresenter = this;
        MenuBuilder menuBuilder = actionMenuPresenter.mMenu;
        if (menuBuilder != null) {
            arrayList = menuBuilder.getVisibleItems();
            i = arrayList.size();
        } else {
            i = 0;
            arrayList = null;
        }
        int i3 = actionMenuPresenter.mMaxItems;
        int i4 = actionMenuPresenter.mActionItemWidthLimit;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) actionMenuPresenter.mMenuView;
        int i5 = 0;
        boolean z2 = false;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            i2 = 2;
            z = true;
            if (i5 >= i) {
                break;
            }
            MenuItemImpl menuItemImpl = (MenuItemImpl) arrayList.get(i5);
            int i8 = menuItemImpl.mShowAsAction;
            if ((i8 & 2) == 2) {
                i6++;
            } else if ((i8 & 1) == 1) {
                i7++;
            } else {
                z2 = true;
            }
            if (actionMenuPresenter.mExpandedActionViewsExclusive && menuItemImpl.mIsActionViewExpanded) {
                i3 = 0;
            }
            i5++;
        }
        if (actionMenuPresenter.mReserveOverflow && (z2 || i7 + i6 > i3)) {
            i3--;
        }
        int i9 = i3 - i6;
        SparseBooleanArray sparseBooleanArray = actionMenuPresenter.mActionButtonGroups;
        sparseBooleanArray.clear();
        int i10 = 0;
        int i11 = 0;
        while (i10 < i) {
            MenuItemImpl menuItemImpl2 = (MenuItemImpl) arrayList.get(i10);
            int i12 = menuItemImpl2.mShowAsAction;
            boolean z3 = (i12 & 2) == i2 ? z : false;
            int i13 = menuItemImpl2.mGroup;
            if (z3) {
                View itemView = actionMenuPresenter.getItemView(menuItemImpl2, null, viewGroup);
                itemView.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = itemView.getMeasuredWidth();
                i4 -= measuredWidth;
                if (i11 == 0) {
                    i11 = measuredWidth;
                }
                if (i13 != 0) {
                    sparseBooleanArray.put(i13, z);
                }
                menuItemImpl2.setIsActionButton(z);
            } else if ((i12 & 1) == z) {
                boolean z4 = sparseBooleanArray.get(i13);
                boolean z5 = ((i9 > 0 || z4) && i4 > 0) ? z : false;
                if (z5) {
                    View itemView2 = actionMenuPresenter.getItemView(menuItemImpl2, null, viewGroup);
                    itemView2.measure(makeMeasureSpec, makeMeasureSpec);
                    int measuredWidth2 = itemView2.getMeasuredWidth();
                    i4 -= measuredWidth2;
                    if (i11 == 0) {
                        i11 = measuredWidth2;
                    }
                    z5 &= i4 + i11 > 0;
                }
                if (z5 && i13 != 0) {
                    sparseBooleanArray.put(i13, true);
                } else if (z4) {
                    sparseBooleanArray.put(i13, false);
                    for (int i14 = 0; i14 < i10; i14++) {
                        MenuItemImpl menuItemImpl3 = (MenuItemImpl) arrayList.get(i14);
                        if (menuItemImpl3.mGroup == i13) {
                            if ((menuItemImpl3.mFlags & 32) == 32) {
                                i9++;
                            }
                            menuItemImpl3.setIsActionButton(false);
                        }
                    }
                }
                if (z5) {
                    i9--;
                }
                menuItemImpl2.setIsActionButton(z5);
            } else {
                menuItemImpl2.setIsActionButton(false);
                i10++;
                i2 = 2;
                actionMenuPresenter = this;
                z = true;
            }
            i10++;
            i2 = 2;
            actionMenuPresenter = this;
            z = true;
        }
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v4, types: [androidx.appcompat.view.menu.MenuView$ItemView] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    public final View getItemView(MenuItemImpl menuItemImpl, View view, ViewGroup viewGroup) {
        View actionView = menuItemImpl.getActionView();
        if (actionView == null || menuItemImpl.hasCollapsibleActionView()) {
            ActionMenuItemView actionMenuItemView = view instanceof MenuView.ItemView ? (MenuView.ItemView) view : (MenuView.ItemView) this.mSystemInflater.inflate(this.mItemLayoutRes, viewGroup, false);
            actionMenuItemView.initialize(menuItemImpl);
            ActionMenuItemView actionMenuItemView2 = actionMenuItemView;
            actionMenuItemView2.setItemInvoker((ActionMenuView) this.mMenuView);
            if (this.mPopupCallback == null) {
                this.mPopupCallback = new ActionMenuPopupCallback();
            }
            actionMenuItemView2.setPopupCallback(this.mPopupCallback);
            actionView = actionMenuItemView;
        }
        actionView.setVisibility(menuItemImpl.mIsActionViewExpanded ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof ActionMenuView.LayoutParams)) {
            actionView.setLayoutParams(ActionMenuView.generateLayoutParams(layoutParams));
        }
        return actionView;
    }

    public final boolean hideOverflowMenu() {
        Object obj;
        ScrollingTabContainerView.AnonymousClass1 anonymousClass1 = this.mPostedOpenRunnable;
        if (anonymousClass1 != null && (obj = this.mMenuView) != null) {
            ((View) obj).removeCallbacks(anonymousClass1);
            this.mPostedOpenRunnable = null;
            return true;
        }
        OverflowPopup overflowPopup = this.mOverflowPopup;
        if (overflowPopup == null) {
            return false;
        }
        if (overflowPopup.isShowing()) {
            overflowPopup.mPopup.dismiss();
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final void initForMenu(Context context, MenuBuilder menuBuilder) {
        this.mContext = context;
        LayoutInflater.from(context);
        this.mMenu = menuBuilder;
        Resources resources = context.getResources();
        ActionBarPolicy actionBarPolicy = ActionBarPolicy.get(context);
        if (!this.mReserveOverflowSet) {
            this.mReserveOverflow = true;
        }
        this.mWidthLimit = actionBarPolicy.mContext.getResources().getDisplayMetrics().widthPixels / 2;
        this.mMaxItems = actionBarPolicy.getMaxActionButtons();
        int i = this.mWidthLimit;
        if (this.mReserveOverflow) {
            if (this.mOverflowButton == null) {
                OverflowMenuButton overflowMenuButton = new OverflowMenuButton(this.mSystemContext);
                this.mOverflowButton = overflowMenuButton;
                if (this.mPendingOverflowIconSet) {
                    overflowMenuButton.setImageDrawable(this.mPendingOverflowIcon);
                    this.mPendingOverflowIcon = null;
                    this.mPendingOverflowIconSet = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.mOverflowButton.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i -= this.mOverflowButton.getMeasuredWidth();
        } else {
            this.mOverflowButton = null;
        }
        this.mActionItemWidthLimit = i;
        float f = resources.getDisplayMetrics().density;
    }

    public final boolean isOverflowMenuShowing() {
        OverflowPopup overflowPopup = this.mOverflowPopup;
        return overflowPopup != null && overflowPopup.isShowing();
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final void onCloseMenu(MenuBuilder menuBuilder, boolean z) {
        hideOverflowMenu();
        OverflowPopup overflowPopup = this.mActionButtonPopup;
        if (overflowPopup != null && overflowPopup.isShowing()) {
            overflowPopup.mPopup.dismiss();
        }
        MenuPresenter.Callback callback = this.mCallback;
        if (callback != null) {
            callback.onCloseMenu(menuBuilder, z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final boolean onSubMenuSelected(SubMenuBuilder subMenuBuilder) {
        boolean z;
        if (subMenuBuilder.hasVisibleItems()) {
            SubMenuBuilder subMenuBuilder2 = subMenuBuilder;
            while (true) {
                MenuBuilder menuBuilder = subMenuBuilder2.mParentMenu;
                if (menuBuilder == this.mMenu) {
                    break;
                }
                subMenuBuilder2 = (SubMenuBuilder) menuBuilder;
            }
            MenuItemImpl menuItemImpl = subMenuBuilder2.mItem;
            ViewGroup viewGroup = (ViewGroup) this.mMenuView;
            View view = null;
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                int i = 0;
                while (true) {
                    if (i >= childCount) {
                        break;
                    }
                    View childAt = viewGroup.getChildAt(i);
                    if ((childAt instanceof MenuView.ItemView) && ((MenuView.ItemView) childAt).getItemData() == menuItemImpl) {
                        view = childAt;
                        break;
                    }
                    i++;
                }
            }
            if (view != null) {
                subMenuBuilder.mItem.getClass();
                int size = subMenuBuilder.mItems.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        z = false;
                        break;
                    }
                    MenuItem item = subMenuBuilder.getItem(i2);
                    if (item.isVisible() && item.getIcon() != null) {
                        z = true;
                        break;
                    }
                    i2++;
                }
                OverflowPopup overflowPopup = new OverflowPopup(this.mContext, subMenuBuilder, view);
                this.mActionButtonPopup = overflowPopup;
                overflowPopup.mForceShowIcon = z;
                MenuPopup menuPopup = overflowPopup.mPopup;
                if (menuPopup != null) {
                    menuPopup.setForceShowIcon(z);
                }
                OverflowPopup overflowPopup2 = this.mActionButtonPopup;
                if (!overflowPopup2.isShowing()) {
                    if (overflowPopup2.mAnchorView == null) {
                        a$$ExternalSyntheticBUOutline0.m$1("MenuPopupHelper cannot be used without an anchor");
                        return false;
                    }
                    overflowPopup2.showPopup(0, 0, false, false);
                }
                MenuPresenter.Callback callback = this.mCallback;
                if (callback != null) {
                    callback.onOpenSubMenu(subMenuBuilder);
                }
                return true;
            }
        }
        return false;
    }

    public final boolean showOverflowMenu() {
        MenuBuilder menuBuilder;
        if (!this.mReserveOverflow || isOverflowMenuShowing() || (menuBuilder = this.mMenu) == null || this.mMenuView == null || this.mPostedOpenRunnable != null) {
            return false;
        }
        menuBuilder.flagActionItems();
        if (menuBuilder.mNonActionItems.isEmpty()) {
            return false;
        }
        ScrollingTabContainerView.AnonymousClass1 anonymousClass1 = new ScrollingTabContainerView.AnonymousClass1(1, this, new OverflowPopup(this.mContext, this.mMenu, this.mOverflowButton));
        this.mPostedOpenRunnable = anonymousClass1;
        ((View) this.mMenuView).post(anonymousClass1);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final void updateMenuView() {
        int i;
        ViewGroup viewGroup = (ViewGroup) this.mMenuView;
        ArrayList arrayList = null;
        boolean z = false;
        if (viewGroup != null) {
            MenuBuilder menuBuilder = this.mMenu;
            if (menuBuilder != null) {
                menuBuilder.flagActionItems();
                ArrayList visibleItems = this.mMenu.getVisibleItems();
                int size = visibleItems.size();
                i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    MenuItemImpl menuItemImpl = (MenuItemImpl) visibleItems.get(i2);
                    if ((menuItemImpl.mFlags & 32) == 32) {
                        View childAt = viewGroup.getChildAt(i);
                        MenuItemImpl itemData = childAt instanceof MenuView.ItemView ? ((MenuView.ItemView) childAt).getItemData() : null;
                        View itemView = getItemView(menuItemImpl, childAt, viewGroup);
                        if (menuItemImpl != itemData) {
                            itemView.setPressed(false);
                            itemView.jumpDrawablesToCurrentState();
                        }
                        if (itemView != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) itemView.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(itemView);
                            }
                            ((ViewGroup) this.mMenuView).addView(itemView, i);
                        }
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            while (i < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i) == this.mOverflowButton) {
                    i++;
                } else {
                    viewGroup.removeViewAt(i);
                }
            }
        }
        ((View) this.mMenuView).requestLayout();
        MenuBuilder menuBuilder2 = this.mMenu;
        if (menuBuilder2 != null) {
            menuBuilder2.flagActionItems();
            ArrayList arrayList2 = menuBuilder2.mActionItems;
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                MenuItemWrapperICS.ActionProviderWrapper actionProviderWrapper = ((MenuItemImpl) arrayList2.get(i3)).mActionProvider;
            }
        }
        MenuBuilder menuBuilder3 = this.mMenu;
        if (menuBuilder3 != null) {
            menuBuilder3.flagActionItems();
            arrayList = menuBuilder3.mNonActionItems;
        }
        if (this.mReserveOverflow && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z = !((MenuItemImpl) arrayList.get(0)).mIsActionViewExpanded;
            } else if (size3 > 0) {
                z = true;
            }
        }
        OverflowMenuButton overflowMenuButton = this.mOverflowButton;
        if (z) {
            if (overflowMenuButton == null) {
                this.mOverflowButton = new OverflowMenuButton(this.mSystemContext);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.mOverflowButton.getParent();
            if (viewGroup3 != this.mMenuView) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.mOverflowButton);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.mMenuView;
                OverflowMenuButton overflowMenuButton2 = this.mOverflowButton;
                actionMenuView.getClass();
                ActionMenuView.LayoutParams generateDefaultLayoutParams = ActionMenuView.generateDefaultLayoutParams();
                generateDefaultLayoutParams.isOverflowButton = true;
                actionMenuView.addView(overflowMenuButton2, generateDefaultLayoutParams);
            }
        } else if (overflowMenuButton != null) {
            Object parent = overflowMenuButton.getParent();
            Object obj = this.mMenuView;
            if (parent == obj) {
                ((ViewGroup) obj).removeView(this.mOverflowButton);
            }
        }
        ((ActionMenuView) this.mMenuView).setOverflowReserved(this.mReserveOverflow);
    }

    public final class OverflowMenuButton extends AppCompatImageView implements ActionMenuView.ActionMenuChildView {
        public OverflowMenuButton(Context context) {
            super(context, null, R.attr.actionOverflowButtonStyle);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            TooltipCompat$Api26Impl.setTooltipText(this, getContentDescription());
            setOnTouchListener(new AnonymousClass1(this, this));
        }

        @Override // androidx.appcompat.widget.ActionMenuView.ActionMenuChildView
        public final boolean needsDividerAfter() {
            return false;
        }

        @Override // androidx.appcompat.widget.ActionMenuView.ActionMenuChildView
        public final boolean needsDividerBefore() {
            return false;
        }

        @Override // android.view.View
        public final boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            ActionMenuPresenter.this.showOverflowMenu();
            return true;
        }

        @Override // android.widget.ImageView
        public final boolean setFrame(int i, int i2, int i3, int i4) {
            boolean frame = super.setFrame(i, i2, i3, i4);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (drawable != null && background != null) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                background.setHotspotBounds(paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
            }
            return frame;
        }

        /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$OverflowMenuButton$1, reason: invalid class name */
        public final class AnonymousClass1 extends ForwardingListener {
            public final /* synthetic */ int $r8$classId = 1;
            public final /* synthetic */ View this$1;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(ActionMenuItemView actionMenuItemView) {
                super(actionMenuItemView);
                this.this$1 = actionMenuItemView;
            }

            @Override // androidx.appcompat.widget.ForwardingListener
            public final ShowableListMenu getPopup() {
                OverflowPopup overflowPopup;
                int i = this.$r8$classId;
                View view = this.this$1;
                switch (i) {
                    case 0:
                        OverflowPopup overflowPopup2 = ActionMenuPresenter.this.mOverflowPopup;
                        if (overflowPopup2 == null) {
                            return null;
                        }
                        return overflowPopup2.getPopup();
                    default:
                        ActionMenuItemView.PopupCallback popupCallback = ((ActionMenuItemView) view).mPopupCallback;
                        if (popupCallback == null || (overflowPopup = ActionMenuPresenter.this.mActionButtonPopup) == null) {
                            return null;
                        }
                        return overflowPopup.getPopup();
                }
            }

            @Override // androidx.appcompat.widget.ForwardingListener
            public final boolean onForwardingStarted() {
                ShowableListMenu popup;
                int i = this.$r8$classId;
                View view = this.this$1;
                switch (i) {
                    case 0:
                        ActionMenuPresenter.this.showOverflowMenu();
                        break;
                    default:
                        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) view;
                        MenuBuilder.ItemInvoker itemInvoker = actionMenuItemView.mItemInvoker;
                        if (itemInvoker == null || !itemInvoker.invokeItem(actionMenuItemView.mItemData) || (popup = getPopup()) == null || !popup.isShowing()) {
                        }
                        break;
                }
                return true;
            }

            @Override // androidx.appcompat.widget.ForwardingListener
            public boolean onForwardingStopped() {
                switch (this.$r8$classId) {
                    case 0:
                        ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
                        if (actionMenuPresenter.mPostedOpenRunnable != null) {
                            return false;
                        }
                        actionMenuPresenter.hideOverflowMenu();
                        return true;
                    default:
                        return super.onForwardingStopped();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(OverflowMenuButton overflowMenuButton, OverflowMenuButton overflowMenuButton2) {
                super(overflowMenuButton2);
                this.this$1 = overflowMenuButton;
            }
        }
    }

    public final class OverflowPopup extends MenuPopupHelper {
        public final /* synthetic */ int $r8$classId = 0;

        public OverflowPopup(Context context, SubMenuBuilder subMenuBuilder, View view) {
            super(R.attr.actionOverflowMenuStyle, 0, context, view, subMenuBuilder, false);
            if ((subMenuBuilder.mItem.mFlags & 32) != 32) {
                View view2 = ActionMenuPresenter.this.mOverflowButton;
                this.mAnchorView = view2 == null ? (View) ActionMenuPresenter.this.mMenuView : view2;
            }
            BiometricPrompt biometricPrompt = ActionMenuPresenter.this.mPopupPresenterCallback;
            this.mPresenterCallback = biometricPrompt;
            MenuPopup menuPopup = this.mPopup;
            if (menuPopup != null) {
                menuPopup.setCallback(biometricPrompt);
            }
        }

        @Override // androidx.appcompat.view.menu.MenuPopupHelper
        public final void onDismiss() {
            int i = this.$r8$classId;
            ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
            switch (i) {
                case 0:
                    MenuBuilder menuBuilder = actionMenuPresenter.mMenu;
                    if (menuBuilder != null) {
                        menuBuilder.close(true);
                    }
                    actionMenuPresenter.mOverflowPopup = null;
                    super.onDismiss();
                    break;
                default:
                    actionMenuPresenter.mActionButtonPopup = null;
                    super.onDismiss();
                    break;
            }
        }

        public OverflowPopup(Context context, MenuBuilder menuBuilder, View view) {
            super(R.attr.actionOverflowMenuStyle, 0, context, view, menuBuilder, true);
            this.mDropDownGravity = 8388613;
            BiometricPrompt biometricPrompt = ActionMenuPresenter.this.mPopupPresenterCallback;
            this.mPresenterCallback = biometricPrompt;
            MenuPopup menuPopup = this.mPopup;
            if (menuPopup != null) {
                menuPopup.setCallback(biometricPrompt);
            }
        }
    }
}
