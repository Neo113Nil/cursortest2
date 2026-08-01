package H3;

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
import com.icefishing.icefishingbigwin.C5275R;
import java.util.List;
import java.util.Locale;
import k3.AbstractC4632a;
import m.B0;
import m.C4703o;

/* loaded from: classes2.dex */
public final class y extends C4703o {

    /* renamed from: A, reason: collision with root package name */
    public final int f1213A;

    /* renamed from: B, reason: collision with root package name */
    public final float f1214B;

    /* renamed from: C, reason: collision with root package name */
    public ColorStateList f1215C;

    /* renamed from: D, reason: collision with root package name */
    public int f1216D;

    /* renamed from: E, reason: collision with root package name */
    public ColorStateList f1217E;

    /* renamed from: x, reason: collision with root package name */
    public final B0 f1218x;

    /* renamed from: y, reason: collision with root package name */
    public final AccessibilityManager f1219y;

    /* renamed from: z, reason: collision with root package name */
    public final Rect f1220z;

    public y(Context context, AttributeSet attributeSet) {
        super(J3.a.a(context, attributeSet, C5275R.attr.autoCompleteTextViewStyle, 0), attributeSet);
        this.f1220z = new Rect();
        Context context2 = getContext();
        TypedArray f3 = y3.k.f(context2, attributeSet, AbstractC4632a.i, C5275R.attr.autoCompleteTextViewStyle, C5275R.style.Widget_AppCompat_AutoCompleteTextView, new int[0]);
        if (f3.hasValue(0) && f3.getInt(0, 0) == 0) {
            setKeyListener(null);
        }
        this.f1213A = f3.getResourceId(3, C5275R.layout.mtrl_auto_complete_simple_item);
        this.f1214B = f3.getDimensionPixelOffset(1, C5275R.dimen.mtrl_exposed_dropdown_menu_popup_elevation);
        if (f3.hasValue(2)) {
            this.f1215C = ColorStateList.valueOf(f3.getColor(2, 0));
        }
        this.f1216D = f3.getColor(4, 0);
        this.f1217E = O3.b.m(context2, f3, 5);
        this.f1219y = (AccessibilityManager) context2.getSystemService("accessibility");
        B0 b02 = new B0(context2, null, C5275R.attr.listPopupWindowStyle);
        this.f1218x = b02;
        b02.f38984R = true;
        b02.f38985S.setFocusable(true);
        b02.f38975H = this;
        b02.f38985S.setInputMethodMode(2);
        b02.m(getAdapter());
        b02.f38976I = new w(0, this);
        if (f3.hasValue(6)) {
            setSimpleItems(f3.getResourceId(6, 0));
        }
        f3.recycle();
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
        AccessibilityManager accessibilityManager = this.f1219y;
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
            this.f1218x.dismiss();
        } else {
            super.dismissDropDown();
        }
    }

    public ColorStateList getDropDownBackgroundTintList() {
        return this.f1215C;
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout b9 = b();
        return (b9 == null || !b9.f36122n0) ? super.getHint() : b9.getHint();
    }

    public float getPopupElevation() {
        return this.f1214B;
    }

    public int getSimpleItemSelectedColor() {
        return this.f1216D;
    }

    public ColorStateList getSimpleItemSelectedRippleColor() {
        return this.f1217E;
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout b9 = b();
        if (b9 != null && b9.f36122n0 && super.getHint() == null) {
            String str = Build.MANUFACTURER;
            if ((str != null ? str.toLowerCase(Locale.ENGLISH) : "").equals("meizu")) {
                setHint("");
            }
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f1218x.dismiss();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i6) {
        super.onMeasure(i, i6);
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            int measuredWidth = getMeasuredWidth();
            ListAdapter adapter = getAdapter();
            TextInputLayout b9 = b();
            int i9 = 0;
            if (adapter != null && b9 != null) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
                B0 b02 = this.f1218x;
                int min = Math.min(adapter.getCount(), Math.max(0, !b02.f38985S.isShowing() ? -1 : b02.f38988v.getSelectedItemPosition()) + 15);
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
                Drawable background = b02.f38985S.getBackground();
                if (background != null) {
                    Rect rect = this.f1220z;
                    background.getPadding(rect);
                    i10 += rect.left + rect.right;
                }
                i9 = b9.getEndIconView().getMeasuredWidth() + i10;
            }
            setMeasuredDimension(Math.min(Math.max(measuredWidth, i9), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z3) {
        if (c()) {
            return;
        }
        super.onWindowFocusChanged(z3);
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(T t6) {
        super.setAdapter(t6);
        this.f1218x.m(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundDrawable(Drawable drawable) {
        super.setDropDownBackgroundDrawable(drawable);
        B0 b02 = this.f1218x;
        if (b02 != null) {
            b02.setBackgroundDrawable(drawable);
        }
    }

    public void setDropDownBackgroundTint(int i) {
        setDropDownBackgroundTintList(ColorStateList.valueOf(i));
    }

    public void setDropDownBackgroundTintList(ColorStateList colorStateList) {
        this.f1215C = colorStateList;
        Drawable dropDownBackground = getDropDownBackground();
        if (dropDownBackground instanceof E3.g) {
            ((E3.g) dropDownBackground).j(this.f1215C);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.f1218x.J = getOnItemSelectedListener();
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
        this.f1216D = i;
        if (getAdapter() instanceof x) {
            ((x) getAdapter()).a();
        }
    }

    public void setSimpleItemSelectedRippleColor(ColorStateList colorStateList) {
        this.f1217E = colorStateList;
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
            this.f1218x.show();
        } else {
            super.showDropDown();
        }
    }

    public void setSimpleItems(String[] strArr) {
        setAdapter(new x(this, getContext(), this.f1213A, strArr));
    }
}
