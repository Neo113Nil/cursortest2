package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.R$styleable;
import androidx.appcompat.view.menu.MenuView;
import com.squareup.wire.GrpcMethod;

/* loaded from: classes3.dex */
public class ListMenuItemView extends LinearLayout implements MenuView.ItemView, AbsListView.SelectionBoundsAdjuster {
    public final Drawable mBackground;
    public CheckBox mCheckBox;
    public LinearLayout mContent;
    public boolean mForceShowIcon;
    public ImageView mGroupDivider;
    public final boolean mHasListDivider;
    public ImageView mIconView;
    public LayoutInflater mInflater;
    public MenuItemImpl mItemData;
    public boolean mPreserveIconSpacing;
    public RadioButton mRadioButton;
    public TextView mShortcutView;
    public final Drawable mSubMenuArrow;
    public ImageView mSubMenuArrowView;
    public final int mTextAppearance;
    public final Context mTextAppearanceContext;
    public TextView mTitleView;

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        GrpcMethod obtainStyledAttributes = GrpcMethod.obtainStyledAttributes(i, 0, getContext(), attributeSet, R$styleable.MenuView);
        this.mBackground = obtainStyledAttributes.getDrawable(5);
        TypedArray typedArray = (TypedArray) obtainStyledAttributes.requestAdapter;
        this.mTextAppearance = typedArray.getResourceId(1, -1);
        this.mPreserveIconSpacing = typedArray.getBoolean(7, false);
        this.mTextAppearanceContext = context;
        this.mSubMenuArrow = obtainStyledAttributes.getDrawable(8);
        TypedArray obtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(null, new int[]{R.attr.divider}, com.squareup.cash.R.attr.dropDownListViewStyle, 0);
        this.mHasListDivider = obtainStyledAttributes2.hasValue(0);
        obtainStyledAttributes.recycle();
        obtainStyledAttributes2.recycle();
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.mGroupDivider;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.mGroupDivider.getLayoutParams();
        rect.top = this.mGroupDivider.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public final MenuItemImpl getItemData() {
        return this.mItemData;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003e  */
    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void initialize(MenuItemImpl menuItemImpl) {
        boolean z;
        ImageView imageView;
        this.mItemData = menuItemImpl;
        boolean isVisible = menuItemImpl.isVisible();
        MenuBuilder menuBuilder = menuItemImpl.mMenu;
        setVisibility(isVisible ? 0 : 8);
        setTitle(menuItemImpl.mTitle);
        setCheckable(menuItemImpl.isCheckable());
        if (menuBuilder.isShortcutsVisible()) {
            if ((menuBuilder.isQwertyMode() ? menuItemImpl.mShortcutAlphabeticChar : menuItemImpl.mShortcutNumericChar) != 0) {
                z = true;
                setShortcut(z, !menuBuilder.isQwertyMode() ? menuItemImpl.mShortcutAlphabeticChar : menuItemImpl.mShortcutNumericChar);
                setIcon(menuItemImpl.getIcon());
                setEnabled(menuItemImpl.isEnabled());
                boolean hasSubMenu = menuItemImpl.hasSubMenu();
                imageView = this.mSubMenuArrowView;
                if (imageView != null) {
                    imageView.setVisibility(hasSubMenu ? 0 : 8);
                }
                setContentDescription(menuItemImpl.mContentDescription);
            }
        }
        z = false;
        setShortcut(z, !menuBuilder.isQwertyMode() ? menuItemImpl.mShortcutAlphabeticChar : menuItemImpl.mShortcutNumericChar);
        setIcon(menuItemImpl.getIcon());
        setEnabled(menuItemImpl.isEnabled());
        boolean hasSubMenu2 = menuItemImpl.hasSubMenu();
        imageView = this.mSubMenuArrowView;
        if (imageView != null) {
        }
        setContentDescription(menuItemImpl.mContentDescription);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.mBackground);
        TextView textView = (TextView) findViewById(com.squareup.cash.R.id.title);
        this.mTitleView = textView;
        int i = this.mTextAppearance;
        if (i != -1) {
            textView.setTextAppearance(this.mTextAppearanceContext, i);
        }
        this.mShortcutView = (TextView) findViewById(com.squareup.cash.R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(com.squareup.cash.R.id.submenuarrow);
        this.mSubMenuArrowView = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.mSubMenuArrow);
        }
        this.mGroupDivider = (ImageView) findViewById(com.squareup.cash.R.id.group_divider);
        this.mContent = (LinearLayout) findViewById(com.squareup.cash.R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.mIconView != null && this.mPreserveIconSpacing) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.mIconView.getLayoutParams();
            int i3 = layoutParams.height;
            if (i3 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i3;
            }
        }
        super.onMeasure(i, i2);
    }

    public void setCheckable(boolean z) {
        CompoundButton compoundButton;
        View view;
        if (!z && this.mRadioButton == null && this.mCheckBox == null) {
            return;
        }
        if ((this.mItemData.mFlags & 4) != 0) {
            if (this.mRadioButton == null) {
                if (this.mInflater == null) {
                    this.mInflater = LayoutInflater.from(getContext());
                }
                RadioButton radioButton = (RadioButton) this.mInflater.inflate(com.squareup.cash.R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.mRadioButton = radioButton;
                LinearLayout linearLayout = this.mContent;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.mRadioButton;
            view = this.mCheckBox;
        } else {
            if (this.mCheckBox == null) {
                if (this.mInflater == null) {
                    this.mInflater = LayoutInflater.from(getContext());
                }
                CheckBox checkBox = (CheckBox) this.mInflater.inflate(com.squareup.cash.R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.mCheckBox = checkBox;
                LinearLayout linearLayout2 = this.mContent;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.mCheckBox;
            view = this.mRadioButton;
        }
        if (z) {
            compoundButton.setChecked(this.mItemData.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox2 = this.mCheckBox;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        RadioButton radioButton2 = this.mRadioButton;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if ((this.mItemData.mFlags & 4) != 0) {
            if (this.mRadioButton == null) {
                if (this.mInflater == null) {
                    this.mInflater = LayoutInflater.from(getContext());
                }
                RadioButton radioButton = (RadioButton) this.mInflater.inflate(com.squareup.cash.R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.mRadioButton = radioButton;
                LinearLayout linearLayout = this.mContent;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.mRadioButton;
        } else {
            if (this.mCheckBox == null) {
                if (this.mInflater == null) {
                    this.mInflater = LayoutInflater.from(getContext());
                }
                CheckBox checkBox = (CheckBox) this.mInflater.inflate(com.squareup.cash.R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.mCheckBox = checkBox;
                LinearLayout linearLayout2 = this.mContent;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.mCheckBox;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.mForceShowIcon = z;
        this.mPreserveIconSpacing = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        ImageView imageView = this.mGroupDivider;
        if (imageView != null) {
            imageView.setVisibility((this.mHasListDivider || !z) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        MenuBuilder menuBuilder = this.mItemData.mMenu;
        boolean z = this.mForceShowIcon;
        if (z || this.mPreserveIconSpacing) {
            ImageView imageView = this.mIconView;
            if (imageView == null && drawable == null && !this.mPreserveIconSpacing) {
                return;
            }
            if (imageView == null) {
                if (this.mInflater == null) {
                    this.mInflater = LayoutInflater.from(getContext());
                }
                ImageView imageView2 = (ImageView) this.mInflater.inflate(com.squareup.cash.R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.mIconView = imageView2;
                LinearLayout linearLayout = this.mContent;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.mPreserveIconSpacing) {
                this.mIconView.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.mIconView;
            if (!z) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.mIconView.getVisibility() != 0) {
                this.mIconView.setVisibility(0);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setShortcut(boolean z, char c) {
        int i;
        String sb;
        if (z) {
            MenuItemImpl menuItemImpl = this.mItemData;
            MenuBuilder menuBuilder = menuItemImpl.mMenu;
            if (menuBuilder.isShortcutsVisible()) {
                if ((menuBuilder.isQwertyMode() ? menuItemImpl.mShortcutAlphabeticChar : menuItemImpl.mShortcutNumericChar) != 0) {
                    i = 0;
                    if (i == 0) {
                        TextView textView = this.mShortcutView;
                        MenuItemImpl menuItemImpl2 = this.mItemData;
                        MenuBuilder menuBuilder2 = menuItemImpl2.mMenu;
                        Context context = menuBuilder2.mContext;
                        char c2 = menuBuilder2.isQwertyMode() ? menuItemImpl2.mShortcutAlphabeticChar : menuItemImpl2.mShortcutNumericChar;
                        if (c2 == 0) {
                            sb = "";
                        } else {
                            Resources resources = context.getResources();
                            StringBuilder sb2 = new StringBuilder();
                            if (ViewConfiguration.get(context).hasPermanentMenuKey()) {
                                sb2.append(resources.getString(com.squareup.cash.R.string.abc_prepend_shortcut_label));
                            }
                            int i2 = menuBuilder2.isQwertyMode() ? menuItemImpl2.mShortcutAlphabeticModifiers : menuItemImpl2.mShortcutNumericModifiers;
                            MenuItemImpl.appendModifier(i2, 65536, resources.getString(com.squareup.cash.R.string.abc_menu_meta_shortcut_label), sb2);
                            MenuItemImpl.appendModifier(i2, 4096, resources.getString(com.squareup.cash.R.string.abc_menu_ctrl_shortcut_label), sb2);
                            MenuItemImpl.appendModifier(i2, 2, resources.getString(com.squareup.cash.R.string.abc_menu_alt_shortcut_label), sb2);
                            MenuItemImpl.appendModifier(i2, 1, resources.getString(com.squareup.cash.R.string.abc_menu_shift_shortcut_label), sb2);
                            MenuItemImpl.appendModifier(i2, 4, resources.getString(com.squareup.cash.R.string.abc_menu_sym_shortcut_label), sb2);
                            MenuItemImpl.appendModifier(i2, 8, resources.getString(com.squareup.cash.R.string.abc_menu_function_shortcut_label), sb2);
                            if (c2 == '\b') {
                                sb2.append(resources.getString(com.squareup.cash.R.string.abc_menu_delete_shortcut_label));
                            } else if (c2 == '\n') {
                                sb2.append(resources.getString(com.squareup.cash.R.string.abc_menu_enter_shortcut_label));
                            } else if (c2 != ' ') {
                                sb2.append(c2);
                            } else {
                                sb2.append(resources.getString(com.squareup.cash.R.string.abc_menu_space_shortcut_label));
                            }
                            sb = sb2.toString();
                        }
                        textView.setText(sb);
                    }
                    if (this.mShortcutView.getVisibility() == i) {
                        this.mShortcutView.setVisibility(i);
                        return;
                    }
                    return;
                }
            }
        }
        i = 8;
        if (i == 0) {
        }
        if (this.mShortcutView.getVisibility() == i) {
        }
    }

    public void setTitle(CharSequence charSequence) {
        TextView textView = this.mTitleView;
        if (charSequence == null) {
            if (textView.getVisibility() != 8) {
                this.mTitleView.setVisibility(8);
            }
        } else {
            textView.setText(charSequence);
            if (this.mTitleView.getVisibility() != 0) {
                this.mTitleView.setVisibility(0);
            }
        }
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.squareup.cash.R.attr.listMenuViewStyle);
    }
}
