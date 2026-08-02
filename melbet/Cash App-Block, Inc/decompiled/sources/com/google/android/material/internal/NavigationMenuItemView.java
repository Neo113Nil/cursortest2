package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.MenuView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.TooltipCompat$Api26Impl;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.view.ViewCompat;
import com.google.android.material.timepicker.ClockFaceView;

/* loaded from: classes4.dex */
public class NavigationMenuItemView extends ForegroundLinearLayout implements MenuView.ItemView {
    public static final int[] CHECKED_STATE_SET = {R.attr.state_checked};
    public final ClockFaceView.AnonymousClass2 accessibilityDelegate;
    public FrameLayout actionArea;
    public boolean checkable;
    public Drawable emptyDrawable;
    public int iconSize;
    public final boolean isBold;
    public MenuItemImpl itemData;
    public boolean needsEmptyIcon;
    public final CheckedTextView textView;

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.isBold = true;
        ClockFaceView.AnonymousClass2 anonymousClass2 = new ClockFaceView.AnonymousClass2(this, 5);
        this.accessibilityDelegate = anonymousClass2;
        setOrientation(0);
        LayoutInflater.from(context).inflate(com.squareup.cash.R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(com.squareup.cash.R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(com.squareup.cash.R.id.design_menu_item_text);
        this.textView = checkedTextView;
        ViewCompat.setAccessibilityDelegate(checkedTextView, anonymousClass2);
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public final MenuItemImpl getItemData() {
        return this.itemData;
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public final void initialize(MenuItemImpl menuItemImpl) {
        StateListDrawable stateListDrawable;
        this.itemData = menuItemImpl;
        int i = menuItemImpl.mId;
        if (i > 0) {
            setId(i);
        }
        setVisibility(menuItemImpl.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(com.squareup.cash.R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(CHECKED_STATE_SET, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            setBackground(stateListDrawable);
        }
        setCheckable(menuItemImpl.isCheckable());
        setChecked(menuItemImpl.isChecked());
        setEnabled(menuItemImpl.isEnabled());
        setTitle(menuItemImpl.mTitle);
        setIcon(menuItemImpl.getIcon());
        View actionView = menuItemImpl.getActionView();
        if (actionView != null) {
            if (this.actionArea == null) {
                this.actionArea = (FrameLayout) ((ViewStub) findViewById(com.squareup.cash.R.id.design_menu_item_action_area_stub)).inflate();
            }
            if (actionView.getParent() != null) {
                ((ViewGroup) actionView.getParent()).removeView(actionView);
            }
            this.actionArea.removeAllViews();
            this.actionArea.addView(actionView);
        }
        setContentDescription(menuItemImpl.mContentDescription);
        TooltipCompat$Api26Impl.setTooltipText(this, menuItemImpl.mTooltipText);
        MenuItemImpl menuItemImpl2 = this.itemData;
        CharSequence charSequence = menuItemImpl2.mTitle;
        CheckedTextView checkedTextView = this.textView;
        if (charSequence == null && menuItemImpl2.getIcon() == null && this.itemData.getActionView() != null) {
            checkedTextView.setVisibility(8);
            FrameLayout frameLayout = this.actionArea;
            if (frameLayout != null) {
                LinearLayoutCompat.LayoutParams layoutParams = (LinearLayoutCompat.LayoutParams) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) layoutParams).width = -1;
                this.actionArea.setLayoutParams(layoutParams);
                return;
            }
            return;
        }
        checkedTextView.setVisibility(0);
        FrameLayout frameLayout2 = this.actionArea;
        if (frameLayout2 != null) {
            LinearLayoutCompat.LayoutParams layoutParams2 = (LinearLayoutCompat.LayoutParams) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) layoutParams2).width = -2;
            this.actionArea.setLayoutParams(layoutParams2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        MenuItemImpl menuItemImpl = this.itemData;
        if (menuItemImpl != null && menuItemImpl.isCheckable() && this.itemData.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, CHECKED_STATE_SET);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
        if (this.checkable != z) {
            this.checkable = z;
            this.accessibilityDelegate.sendAccessibilityEvent(this.textView, 2048);
        }
    }

    public void setChecked(boolean z) {
        refreshDrawableState();
        CheckedTextView checkedTextView = this.textView;
        checkedTextView.setChecked(z);
        checkedTextView.setTypeface(checkedTextView.getTypeface(), (z && this.isBold) ? 1 : 0);
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, getPaddingTop(), i, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            int i = this.iconSize;
            drawable.setBounds(0, 0, i, i);
        } else if (this.needsEmptyIcon) {
            if (this.emptyDrawable == null) {
                Drawable drawable2 = ResourcesCompat.getDrawable(getResources(), com.squareup.cash.R.drawable.navigation_empty_icon, getContext().getTheme());
                this.emptyDrawable = drawable2;
                if (drawable2 != null) {
                    int i2 = this.iconSize;
                    drawable2.setBounds(0, 0, i2, i2);
                }
            }
            drawable = this.emptyDrawable;
        }
        this.textView.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    public void setIconPadding(int i) {
        this.textView.setCompoundDrawablePadding(i);
    }

    public void setIconSize(int i) {
        this.iconSize = i;
    }

    public void setMaxLines(int i) {
        this.textView.setMaxLines(i);
    }

    public void setNeedsEmptyIcon(boolean z) {
        this.needsEmptyIcon = z;
    }

    public void setShortcut(boolean z, char c) {
    }

    public void setTextAppearance(int i) {
        this.textView.setTextAppearance(i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.textView.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.textView.setText(charSequence);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuItemView(Context context) {
        this(context, null);
    }
}
