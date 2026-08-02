package com.google.android.material.textfield;

import android.R;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Filterable;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatPopupWindow;
import androidx.appcompat.widget.ListPopupWindow;
import androidx.appcompat.widget.SearchView;
import androidx.core.graphics.ColorUtils;
import com.google.android.material.R$styleable;
import com.google.android.material.focus.FocusRingDrawable;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import com.withpersona.sdk2.inquiry.shared.ContextUtilsKt;
import java.util.List;
import java.util.Locale;

/* loaded from: classes4.dex */
public class MaterialAutoCompleteTextView extends AppCompatAutoCompleteTextView {
    public final AccessibilityManager accessibilityManager;
    public ColorStateList dropDownBackgroundTint;
    public final ListPopupWindow modalListPopup;
    public final float popupElevation;
    public final int[] selectedStateSet;
    public final int simpleItemLayout;
    public int simpleItemSelectedColor;
    public ColorStateList simpleItemSelectedRippleColor;
    public final Rect tempRect;

    public final class MaterialArrayAdapter extends ArrayAdapter {
        public ColorStateList pressedRippleColor;
        public ColorStateList selectedItemRippleOverlaidColor;

        public MaterialArrayAdapter(Context context, int i, String[] strArr) {
            super(context, i, strArr);
            updateSelectedItemColorStateList();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v3, types: [android.graphics.drawable.LayerDrawable, android.graphics.drawable.RippleDrawable] */
        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public final View getView(int i, View view, ViewGroup viewGroup) {
            View view2 = super.getView(i, view, viewGroup);
            if (view2 instanceof TextView) {
                TextView textView = (TextView) view2;
                MaterialAutoCompleteTextView materialAutoCompleteTextView = MaterialAutoCompleteTextView.this;
                ColorDrawable colorDrawable = null;
                if (materialAutoCompleteTextView.getText().toString().contentEquals(textView.getText()) && materialAutoCompleteTextView.simpleItemSelectedColor != 0) {
                    ColorDrawable colorDrawable2 = new ColorDrawable(materialAutoCompleteTextView.simpleItemSelectedColor);
                    if (this.pressedRippleColor != null) {
                        colorDrawable2.setTintList(this.selectedItemRippleOverlaidColor);
                        ?? rippleDrawable = new RippleDrawable(this.pressedRippleColor, colorDrawable2, null);
                        FocusRingDrawable layer = FocusRingDrawable.layer(getContext(), rippleDrawable, null);
                        if (layer != null) {
                            layer.state.ringStateSet = materialAutoCompleteTextView.selectedStateSet;
                        }
                        colorDrawable = rippleDrawable;
                    } else {
                        colorDrawable = colorDrawable2;
                    }
                }
                textView.setBackground(colorDrawable);
            }
            return view2;
        }

        public final void updateSelectedItemColorStateList() {
            ColorStateList colorStateList;
            MaterialAutoCompleteTextView materialAutoCompleteTextView = MaterialAutoCompleteTextView.this;
            ColorStateList colorStateList2 = materialAutoCompleteTextView.simpleItemSelectedRippleColor;
            ColorStateList colorStateList3 = null;
            if (colorStateList2 != null) {
                int[] iArr = {R.attr.state_pressed};
                colorStateList = new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{colorStateList2.getColorForState(iArr, 0), 0});
            } else {
                colorStateList = null;
            }
            this.pressedRippleColor = colorStateList;
            if (materialAutoCompleteTextView.simpleItemSelectedColor != 0 && materialAutoCompleteTextView.simpleItemSelectedRippleColor != null) {
                int[] iArr2 = {R.attr.state_hovered, -16842919};
                int[] iArr3 = {R.attr.state_selected, -16842919};
                colorStateList3 = new ColorStateList(new int[][]{iArr3, iArr2, new int[0]}, new int[]{ColorUtils.compositeColors(materialAutoCompleteTextView.simpleItemSelectedRippleColor.getColorForState(iArr3, 0), materialAutoCompleteTextView.simpleItemSelectedColor), ColorUtils.compositeColors(materialAutoCompleteTextView.simpleItemSelectedRippleColor.getColorForState(iArr2, 0), materialAutoCompleteTextView.simpleItemSelectedColor), materialAutoCompleteTextView.simpleItemSelectedColor});
            }
            this.selectedItemRippleOverlaidColor = colorStateList3;
        }
    }

    public MaterialAutoCompleteTextView(Context context, AttributeSet attributeSet, int i) {
        super(MaterialThemeOverlay.wrap(context, attributeSet, i, 0), attributeSet, i);
        this.selectedStateSet = new int[]{R.attr.state_selected};
        this.tempRect = new Rect();
        Context context2 = getContext();
        TypedArray obtainStyledAttributes = ViewUtils.obtainStyledAttributes(context2, attributeSet, R$styleable.MaterialAutoCompleteTextView, i, com.squareup.cash.R.style.Widget_AppCompat_AutoCompleteTextView, new int[0]);
        if (obtainStyledAttributes.hasValue(0) && obtainStyledAttributes.getInt(0, 0) == 0) {
            setKeyListener(null);
        }
        this.simpleItemLayout = obtainStyledAttributes.getResourceId(3, com.squareup.cash.R.layout.mtrl_auto_complete_simple_item);
        this.popupElevation = obtainStyledAttributes.getDimensionPixelOffset(1, com.squareup.cash.R.dimen.mtrl_exposed_dropdown_menu_popup_elevation);
        if (obtainStyledAttributes.hasValue(2)) {
            this.dropDownBackgroundTint = ColorStateList.valueOf(obtainStyledAttributes.getColor(2, 0));
        }
        this.simpleItemSelectedColor = obtainStyledAttributes.getColor(4, 0);
        this.simpleItemSelectedRippleColor = ContextUtilsKt.getColorStateList(context2, obtainStyledAttributes, 5);
        this.accessibilityManager = (AccessibilityManager) context2.getSystemService("accessibility");
        ListPopupWindow listPopupWindow = new ListPopupWindow(context2, null, com.squareup.cash.R.attr.listPopupWindowStyle);
        this.modalListPopup = listPopupWindow;
        listPopupWindow.mModal = true;
        AppCompatPopupWindow appCompatPopupWindow = listPopupWindow.mPopup;
        appCompatPopupWindow.setFocusable(true);
        listPopupWindow.mDropDownAnchorView = this;
        appCompatPopupWindow.setInputMethodMode(2);
        listPopupWindow.setAdapter(getAdapter());
        listPopupWindow.mItemClickListener = new SearchView.AnonymousClass8(this, 4);
        if (obtainStyledAttributes.hasValue(6)) {
            setSimpleItems(obtainStyledAttributes.getResourceId(6, 0));
        }
        obtainStyledAttributes.recycle();
    }

    @Override // android.widget.AutoCompleteTextView
    public final void dismissDropDown() {
        if (isPopupRequired()) {
            this.modalListPopup.dismiss();
        } else {
            super.dismissDropDown();
        }
    }

    public final TextInputLayout findTextInputLayoutAncestor() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    @Override // android.widget.TextView
    public final CharSequence getHint() {
        TextInputLayout findTextInputLayoutAncestor = findTextInputLayoutAncestor();
        if (findTextInputLayoutAncestor == null || !findTextInputLayoutAncestor.isProvidingHint) {
            return super.getHint();
        }
        if (findTextInputLayoutAncestor.hintEnabled) {
            return findTextInputLayoutAncestor.hint;
        }
        return null;
    }

    public final boolean isPopupRequired() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        AccessibilityManager accessibilityManager = this.accessibilityManager;
        if (accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled()) {
            return true;
        }
        if (accessibilityManager == null || !accessibilityManager.isEnabled() || (enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(16)) == null) {
            return false;
        }
        for (AccessibilityServiceInfo accessibilityServiceInfo : enabledAccessibilityServiceList) {
            if (accessibilityServiceInfo.getSettingsActivityName() != null && accessibilityServiceInfo.getSettingsActivityName().contains("SwitchAccess")) {
                return true;
            }
        }
        return false;
    }

    @Override // android.widget.AutoCompleteTextView
    public final boolean isPopupShowing() {
        ListPopupWindow listPopupWindow = this.modalListPopup;
        if (listPopupWindow == null || !listPopupWindow.mPopup.isShowing()) {
            return super.isPopupShowing();
        }
        return true;
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout findTextInputLayoutAncestor = findTextInputLayoutAncestor();
        if (findTextInputLayoutAncestor != null && findTextInputLayoutAncestor.isProvidingHint && super.getHint() == null) {
            String str = Build.MANUFACTURER;
            if ((str != null ? str.toLowerCase(Locale.ENGLISH) : "").equals("meizu")) {
                setHint("");
            }
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.modalListPopup.dismiss();
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (isPopupShowing()) {
            return super.onKeyDown(i, keyEvent);
        }
        boolean z = i == 66 || i == 23;
        boolean z2 = i == 62;
        if (getKeyListener() == null ? !(z || z2) : !(z && getMaxLines() == 1)) {
            return super.onKeyDown(i, keyEvent);
        }
        TextInputLayout findTextInputLayoutAncestor = findTextInputLayoutAncestor();
        if (findTextInputLayoutAncestor != null) {
            findTextInputLayoutAncestor.endLayout.endIconView.performClick();
        }
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            int measuredWidth = getMeasuredWidth();
            ListAdapter adapter = getAdapter();
            TextInputLayout findTextInputLayoutAncestor = findTextInputLayoutAncestor();
            int i3 = 0;
            if (adapter != null && findTextInputLayoutAncestor != null) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
                ListPopupWindow listPopupWindow = this.modalListPopup;
                int min = Math.min(adapter.getCount(), Math.max(0, !listPopupWindow.mPopup.isShowing() ? -1 : listPopupWindow.mDropDownList.getSelectedItemPosition()) + 15);
                View view = null;
                int i4 = 0;
                for (int max = Math.max(0, min - 15); max < min; max++) {
                    int itemViewType = adapter.getItemViewType(max);
                    if (itemViewType != i3) {
                        view = null;
                        i3 = itemViewType;
                    }
                    view = adapter.getView(max, view, findTextInputLayoutAncestor);
                    if (view.getLayoutParams() == null) {
                        view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    }
                    view.measure(makeMeasureSpec, makeMeasureSpec2);
                    i4 = Math.max(i4, view.getMeasuredWidth());
                }
                Drawable background = listPopupWindow.mPopup.getBackground();
                if (background != null) {
                    Rect rect = this.tempRect;
                    background.getPadding(rect);
                    i4 += rect.left + rect.right;
                }
                i3 = findTextInputLayoutAncestor.endLayout.endIconView.getMeasuredWidth() + i4;
            }
            setMeasuredDimension(Math.min(Math.max(measuredWidth, i3), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z) {
        if (isPopupRequired()) {
            return;
        }
        super.onWindowFocusChanged(z);
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(T t) {
        super.setAdapter(t);
        this.modalListPopup.setAdapter(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundDrawable(Drawable drawable) {
        super.setDropDownBackgroundDrawable(drawable);
        ListPopupWindow listPopupWindow = this.modalListPopup;
        if (listPopupWindow != null) {
            listPopupWindow.setBackgroundDrawable(drawable);
        }
    }

    public void setDropDownBackgroundTint(int i) {
        setDropDownBackgroundTintList(ColorStateList.valueOf(i));
    }

    public void setDropDownBackgroundTintList(ColorStateList colorStateList) {
        this.dropDownBackgroundTint = colorStateList;
        Drawable dropDownBackground = getDropDownBackground();
        if (dropDownBackground instanceof MaterialShapeDrawable) {
            ((MaterialShapeDrawable) dropDownBackground).setFillColor(this.dropDownBackgroundTint);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.modalListPopup.mItemSelectedListener = getOnItemSelectedListener();
    }

    @Override // android.widget.TextView
    public void setRawInputType(int i) {
        super.setRawInputType(i);
        TextInputLayout findTextInputLayoutAncestor = findTextInputLayoutAncestor();
        if (findTextInputLayoutAncestor != null) {
            findTextInputLayoutAncestor.updateEditTextBoxBackgroundIfNeeded();
        }
    }

    public void setSimpleItemSelectedColor(int i) {
        this.simpleItemSelectedColor = i;
        if (getAdapter() instanceof MaterialArrayAdapter) {
            ((MaterialArrayAdapter) getAdapter()).updateSelectedItemColorStateList();
        }
    }

    public void setSimpleItemSelectedRippleColor(ColorStateList colorStateList) {
        this.simpleItemSelectedRippleColor = colorStateList;
        if (getAdapter() instanceof MaterialArrayAdapter) {
            ((MaterialArrayAdapter) getAdapter()).updateSelectedItemColorStateList();
        }
    }

    public void setSimpleItems(String[] strArr) {
        setAdapter(new MaterialArrayAdapter(getContext(), this.simpleItemLayout, strArr));
    }

    @Override // android.widget.AutoCompleteTextView
    public final void showDropDown() {
        if (isPopupRequired()) {
            this.modalListPopup.show();
        } else {
            super.showDropDown();
        }
    }

    public void setSimpleItems(int i) {
        setSimpleItems(getResources().getStringArray(i));
    }

    public MaterialAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.squareup.cash.R.attr.autoCompleteTextViewStyle);
    }

    public MaterialAutoCompleteTextView(Context context) {
        this(context, null);
    }
}
