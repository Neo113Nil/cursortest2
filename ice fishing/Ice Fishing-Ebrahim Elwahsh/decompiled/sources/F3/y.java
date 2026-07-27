package F3;

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
import com.google.android.material.textfield.TextInputLayout;
import com.icefishing.icefishingliveapp.C5284R;
import i3.AbstractC4576a;
import java.util.List;
import java.util.Locale;
import m.B0;
import m.C4751o;

/* loaded from: classes2.dex */
public final class y extends C4751o {

    /* renamed from: A, reason: collision with root package name */
    public final int f1126A;

    /* renamed from: B, reason: collision with root package name */
    public final float f1127B;

    /* renamed from: C, reason: collision with root package name */
    public ColorStateList f1128C;

    /* renamed from: D, reason: collision with root package name */
    public int f1129D;

    /* renamed from: E, reason: collision with root package name */
    public ColorStateList f1130E;

    /* renamed from: x, reason: collision with root package name */
    public final B0 f1131x;

    /* renamed from: y, reason: collision with root package name */
    public final AccessibilityManager f1132y;

    /* renamed from: z, reason: collision with root package name */
    public final Rect f1133z;

    public y(Context context, AttributeSet attributeSet) {
        super(H3.a.a(context, attributeSet, C5284R.attr.autoCompleteTextViewStyle, 0), attributeSet);
        this.f1133z = new Rect();
        Context context2 = getContext();
        TypedArray f6 = w3.k.f(context2, attributeSet, AbstractC4576a.i, C5284R.attr.autoCompleteTextViewStyle, C5284R.style.Widget_AppCompat_AutoCompleteTextView, new int[0]);
        if (f6.hasValue(0) && f6.getInt(0, 0) == 0) {
            setKeyListener(null);
        }
        this.f1126A = f6.getResourceId(3, C5284R.layout.mtrl_auto_complete_simple_item);
        this.f1127B = f6.getDimensionPixelOffset(1, C5284R.dimen.mtrl_exposed_dropdown_menu_popup_elevation);
        if (f6.hasValue(2)) {
            this.f1128C = ColorStateList.valueOf(f6.getColor(2, 0));
        }
        this.f1129D = f6.getColor(4, 0);
        this.f1130E = com.bumptech.glide.d.o(context2, f6, 5);
        this.f1132y = (AccessibilityManager) context2.getSystemService("accessibility");
        B0 b02 = new B0(context2, null, C5284R.attr.listPopupWindowStyle);
        this.f1131x = b02;
        b02.f39251R = true;
        b02.f39252S.setFocusable(true);
        b02.f39242H = this;
        b02.f39252S.setInputMethodMode(2);
        b02.l(getAdapter());
        b02.f39243I = new w(0, this);
        if (f6.hasValue(6)) {
            setSimpleItems(f6.getResourceId(6, 0));
        }
        f6.recycle();
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
        AccessibilityManager accessibilityManager = this.f1132y;
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
            this.f1131x.dismiss();
        } else {
            super.dismissDropDown();
        }
    }

    public ColorStateList getDropDownBackgroundTintList() {
        return this.f1128C;
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout b9 = b();
        return (b9 == null || !b9.f36287n0) ? super.getHint() : b9.getHint();
    }

    public float getPopupElevation() {
        return this.f1127B;
    }

    public int getSimpleItemSelectedColor() {
        return this.f1129D;
    }

    public ColorStateList getSimpleItemSelectedRippleColor() {
        return this.f1130E;
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout b9 = b();
        if (b9 != null && b9.f36287n0 && super.getHint() == null) {
            String str = Build.MANUFACTURER;
            if ((str != null ? str.toLowerCase(Locale.ENGLISH) : "").equals("meizu")) {
                setHint("");
            }
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f1131x.dismiss();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i4) {
        super.onMeasure(i, i4);
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            int measuredWidth = getMeasuredWidth();
            ListAdapter adapter = getAdapter();
            TextInputLayout b9 = b();
            int i9 = 0;
            if (adapter != null && b9 != null) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
                B0 b02 = this.f1131x;
                int min = Math.min(adapter.getCount(), Math.max(0, !b02.f39252S.isShowing() ? -1 : b02.f39255v.getSelectedItemPosition()) + 15);
                View view = null;
                int i10 = 0;
                for (int max = Math.max(0, min - 15); max < min; max++) {
                    int itemViewType = adapter.getItemViewType(max);
                    if (itemViewType != i9) {
                        view = null;
                        i9 = itemViewType;
                    }
                    view = adapter.getView(max, view, b9);
                    if (view.getLayoutParams() == null) {
                        view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    }
                    view.measure(makeMeasureSpec, makeMeasureSpec2);
                    i10 = Math.max(i10, view.getMeasuredWidth());
                }
                Drawable background = b02.f39252S.getBackground();
                if (background != null) {
                    Rect rect = this.f1133z;
                    background.getPadding(rect);
                    i10 += rect.left + rect.right;
                }
                i9 = b9.getEndIconView().getMeasuredWidth() + i10;
            }
            setMeasuredDimension(Math.min(Math.max(measuredWidth, i9), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z8) {
        if (c()) {
            return;
        }
        super.onWindowFocusChanged(z8);
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(T t9) {
        super.setAdapter(t9);
        this.f1131x.l(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundDrawable(Drawable drawable) {
        super.setDropDownBackgroundDrawable(drawable);
        B0 b02 = this.f1131x;
        if (b02 != null) {
            b02.setBackgroundDrawable(drawable);
        }
    }

    public void setDropDownBackgroundTint(int i) {
        setDropDownBackgroundTintList(ColorStateList.valueOf(i));
    }

    public void setDropDownBackgroundTintList(ColorStateList colorStateList) {
        this.f1128C = colorStateList;
        Drawable dropDownBackground = getDropDownBackground();
        if (dropDownBackground instanceof C3.g) {
            ((C3.g) dropDownBackground).j(this.f1128C);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.f1131x.J = getOnItemSelectedListener();
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
        this.f1129D = i;
        if (getAdapter() instanceof x) {
            ((x) getAdapter()).a();
        }
    }

    public void setSimpleItemSelectedRippleColor(ColorStateList colorStateList) {
        this.f1130E = colorStateList;
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
            this.f1131x.show();
        } else {
            super.showDropDown();
        }
    }

    public void setSimpleItems(String[] strArr) {
        setAdapter(new x(this, getContext(), this.f1126A, strArr));
    }
}
