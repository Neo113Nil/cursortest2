package J3;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.Filterable;
import android.widget.ListAdapter;
import com.IceFishing.LiveIceFishing.C5248R;
import com.google.android.material.textfield.TextInputLayout;
import java.util.List;
import java.util.Locale;
import m.B0;
import m.C4716o;
import m3.AbstractC4742a;

/* loaded from: classes2.dex */
public final class y extends C4716o {

    /* renamed from: A, reason: collision with root package name */
    public final int f1569A;

    /* renamed from: B, reason: collision with root package name */
    public final float f1570B;

    /* renamed from: C, reason: collision with root package name */
    public ColorStateList f1571C;

    /* renamed from: D, reason: collision with root package name */
    public int f1572D;

    /* renamed from: E, reason: collision with root package name */
    public ColorStateList f1573E;

    /* renamed from: x, reason: collision with root package name */
    public final B0 f1574x;

    /* renamed from: y, reason: collision with root package name */
    public final AccessibilityManager f1575y;

    /* renamed from: z, reason: collision with root package name */
    public final Rect f1576z;

    public y(Context context, AttributeSet attributeSet) {
        super(L3.a.a(context, attributeSet, C5248R.attr.autoCompleteTextViewStyle, 0), attributeSet);
        this.f1576z = new Rect();
        Context context2 = getContext();
        TypedArray f2 = A3.n.f(context2, attributeSet, AbstractC4742a.i, C5248R.attr.autoCompleteTextViewStyle, C5248R.style.Widget_AppCompat_AutoCompleteTextView, new int[0]);
        if (f2.hasValue(0) && f2.getInt(0, 0) == 0) {
            setKeyListener(null);
        }
        this.f1569A = f2.getResourceId(3, C5248R.layout.mtrl_auto_complete_simple_item);
        this.f1570B = f2.getDimensionPixelOffset(1, C5248R.dimen.mtrl_exposed_dropdown_menu_popup_elevation);
        if (f2.hasValue(2)) {
            this.f1571C = ColorStateList.valueOf(f2.getColor(2, 0));
        }
        this.f1572D = f2.getColor(4, 0);
        this.f1573E = com.bumptech.glide.f.j(context2, f2, 5);
        this.f1575y = (AccessibilityManager) context2.getSystemService("accessibility");
        B0 b02 = new B0(context2, null, C5248R.attr.listPopupWindowStyle);
        this.f1574x = b02;
        b02.f39052R = true;
        b02.f39053S.setFocusable(true);
        b02.f39043H = this;
        b02.f39053S.setInputMethodMode(2);
        b02.l(getAdapter());
        b02.f39044I = new w(0, this);
        if (f2.hasValue(6)) {
            setSimpleItems(f2.getResourceId(6, 0));
        }
        f2.recycle();
    }

    public static void a(y yVar, Object obj) {
        yVar.setText(yVar.convertSelectionToString(obj), false);
    }

    public final TextInputLayout b() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    public final boolean c() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        AccessibilityManager accessibilityManager = this.f1575y;
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
    public final void dismissDropDown() {
        if (c()) {
            this.f1574x.dismiss();
        } else {
            super.dismissDropDown();
        }
    }

    public ColorStateList getDropDownBackgroundTintList() {
        return this.f1571C;
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout b9 = b();
        return (b9 == null || !b9.f36884i0) ? super.getHint() : b9.getHint();
    }

    public float getPopupElevation() {
        return this.f1570B;
    }

    public int getSimpleItemSelectedColor() {
        return this.f1572D;
    }

    public ColorStateList getSimpleItemSelectedRippleColor() {
        return this.f1573E;
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout b9 = b();
        if (b9 != null && b9.f36884i0 && super.getHint() == null) {
            String str = Build.MANUFACTURER;
            if ((str != null ? str.toLowerCase(Locale.ENGLISH) : "").equals("meizu")) {
                setHint("");
            }
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f1574x.dismiss();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i4) {
        super.onMeasure(i, i4);
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            int measuredWidth = getMeasuredWidth();
            ListAdapter adapter = getAdapter();
            TextInputLayout b9 = b();
            int i6 = 0;
            if (adapter != null && b9 != null) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
                B0 b02 = this.f1574x;
                int min = Math.min(adapter.getCount(), Math.max(0, !b02.f39053S.isShowing() ? -1 : b02.f39056v.getSelectedItemPosition()) + 15);
                View view = null;
                int i9 = 0;
                for (int max = Math.max(0, min - 15); max < min; max++) {
                    int itemViewType = adapter.getItemViewType(max);
                    if (itemViewType != i6) {
                        view = null;
                        i6 = itemViewType;
                    }
                    view = adapter.getView(max, view, b9);
                    if (view.getLayoutParams() == null) {
                        view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    }
                    view.measure(makeMeasureSpec, makeMeasureSpec2);
                    i9 = Math.max(i9, view.getMeasuredWidth());
                }
                Drawable background = b02.f39053S.getBackground();
                if (background != null) {
                    Rect rect = this.f1576z;
                    background.getPadding(rect);
                    i9 += rect.left + rect.right;
                }
                i6 = b9.getEndIconView().getMeasuredWidth() + i9;
            }
            setMeasuredDimension(Math.min(Math.max(measuredWidth, i6), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z6) {
        if (c()) {
            return;
        }
        super.onWindowFocusChanged(z6);
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(T t6) {
        super.setAdapter(t6);
        this.f1574x.l(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundDrawable(Drawable drawable) {
        super.setDropDownBackgroundDrawable(drawable);
        B0 b02 = this.f1574x;
        if (b02 != null) {
            b02.setBackgroundDrawable(drawable);
        }
    }

    public void setDropDownBackgroundTint(int i) {
        setDropDownBackgroundTintList(ColorStateList.valueOf(i));
    }

    public void setDropDownBackgroundTintList(ColorStateList colorStateList) {
        this.f1571C = colorStateList;
        Drawable dropDownBackground = getDropDownBackground();
        if (dropDownBackground instanceof G3.g) {
            ((G3.g) dropDownBackground).j(this.f1571C);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.f1574x.J = getOnItemSelectedListener();
    }

    @Override // android.widget.TextView
    public void setRawInputType(int i) {
        super.setRawInputType(i);
        TextInputLayout b9 = b();
        if (b9 != null) {
            b9.s();
        }
    }

    public void setSimpleItemSelectedColor(int i) {
        this.f1572D = i;
        if (getAdapter() instanceof x) {
            ((x) getAdapter()).a();
        }
    }

    public void setSimpleItemSelectedRippleColor(ColorStateList colorStateList) {
        this.f1573E = colorStateList;
        if (getAdapter() instanceof x) {
            ((x) getAdapter()).a();
        }
    }

    public void setSimpleItems(int i) {
        setSimpleItems(getResources().getStringArray(i));
    }

    @Override // android.widget.AutoCompleteTextView
    public final void showDropDown() {
        if (c()) {
            this.f1574x.show();
        } else {
            super.showDropDown();
        }
    }

    public void setSimpleItems(String[] strArr) {
        setAdapter(new x(this, getContext(), this.f1569A, strArr));
    }
}
