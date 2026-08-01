package V0;

import a.AbstractC0078a;
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
import com.lumenpath.harispro.hrnavigator.R;
import java.util.List;
import java.util.Locale;
import m.C0272p;
import m.E0;
import u0.AbstractC0358a;

/* loaded from: classes.dex */
public final class w extends C0272p {
    public final E0 e;

    /* renamed from: f, reason: collision with root package name */
    public final AccessibilityManager f1357f;

    /* renamed from: g, reason: collision with root package name */
    public final Rect f1358g;

    /* renamed from: h, reason: collision with root package name */
    public final int f1359h;
    public final float i;
    public ColorStateList j;

    /* renamed from: k, reason: collision with root package name */
    public int f1360k;

    /* renamed from: l, reason: collision with root package name */
    public ColorStateList f1361l;

    public w(Context context, AttributeSet attributeSet) {
        super(X0.a.a(context, attributeSet, R.attr.autoCompleteTextViewStyle, 0), attributeSet);
        this.f1358g = new Rect();
        Context context2 = getContext();
        TypedArray g2 = L0.m.g(context2, attributeSet, AbstractC0358a.f4447l, R.attr.autoCompleteTextViewStyle, R.style.Widget_AppCompat_AutoCompleteTextView, new int[0]);
        if (g2.hasValue(0) && g2.getInt(0, 0) == 0) {
            setKeyListener(null);
        }
        this.f1359h = g2.getResourceId(3, R.layout.mtrl_auto_complete_simple_item);
        this.i = g2.getDimensionPixelOffset(1, R.dimen.mtrl_exposed_dropdown_menu_popup_elevation);
        if (g2.hasValue(2)) {
            this.j = ColorStateList.valueOf(g2.getColor(2, 0));
        }
        this.f1360k = g2.getColor(4, 0);
        this.f1361l = AbstractC0078a.B(context2, g2, 5);
        this.f1357f = (AccessibilityManager) context2.getSystemService("accessibility");
        E0 e02 = new E0(context2, null, R.attr.listPopupWindowStyle);
        this.e = e02;
        e02.f3827y = true;
        e02.f3828z.setFocusable(true);
        e02.f3817o = this;
        e02.f3828z.setInputMethodMode(2);
        e02.o(getAdapter());
        e02.f3818p = new u(0, this);
        if (g2.hasValue(6)) {
            setSimpleItems(g2.getResourceId(6, 0));
        }
        g2.recycle();
    }

    public static void a(w wVar, Object obj) {
        wVar.setText(wVar.convertSelectionToString(obj), false);
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
        AccessibilityManager accessibilityManager = this.f1357f;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            if (accessibilityManager != null && accessibilityManager.isEnabled() && (enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(16)) != null) {
                for (AccessibilityServiceInfo accessibilityServiceInfo : enabledAccessibilityServiceList) {
                    if (accessibilityServiceInfo.getSettingsActivityName() == null || !accessibilityServiceInfo.getSettingsActivityName().contains("SwitchAccess")) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.widget.AutoCompleteTextView
    public final void dismissDropDown() {
        if (c()) {
            this.e.dismiss();
        } else {
            super.dismissDropDown();
        }
    }

    public ColorStateList getDropDownBackgroundTintList() {
        return this.j;
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout b2 = b();
        return (b2 == null || !b2.f2597E) ? super.getHint() : b2.getHint();
    }

    public float getPopupElevation() {
        return this.i;
    }

    public int getSimpleItemSelectedColor() {
        return this.f1360k;
    }

    public ColorStateList getSimpleItemSelectedRippleColor() {
        return this.f1361l;
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout b2 = b();
        if (b2 != null && b2.f2597E && super.getHint() == null) {
            String str = Build.MANUFACTURER;
            if ((str != null ? str.toLowerCase(Locale.ENGLISH) : "").equals("meizu")) {
                setHint("");
            }
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.e.dismiss();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            int measuredWidth = getMeasuredWidth();
            ListAdapter adapter = getAdapter();
            TextInputLayout b2 = b();
            int i3 = 0;
            if (adapter != null && b2 != null) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
                E0 e02 = this.e;
                int min = Math.min(adapter.getCount(), Math.max(0, !e02.f3828z.isShowing() ? -1 : e02.f3808c.getSelectedItemPosition()) + 15);
                View view = null;
                int i4 = 0;
                for (int max = Math.max(0, min - 15); max < min; max++) {
                    int itemViewType = adapter.getItemViewType(max);
                    if (itemViewType != i3) {
                        view = null;
                        i3 = itemViewType;
                    }
                    view = adapter.getView(max, view, b2);
                    if (view.getLayoutParams() == null) {
                        view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    }
                    view.measure(makeMeasureSpec, makeMeasureSpec2);
                    i4 = Math.max(i4, view.getMeasuredWidth());
                }
                Drawable background = e02.f3828z.getBackground();
                if (background != null) {
                    Rect rect = this.f1358g;
                    background.getPadding(rect);
                    i4 += rect.left + rect.right;
                }
                i3 = b2.getEndIconView().getMeasuredWidth() + i4;
            }
            setMeasuredDimension(Math.min(Math.max(measuredWidth, i3), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z2) {
        if (c()) {
            return;
        }
        super.onWindowFocusChanged(z2);
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(T t2) {
        super.setAdapter(t2);
        this.e.o(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundDrawable(Drawable drawable) {
        super.setDropDownBackgroundDrawable(drawable);
        E0 e02 = this.e;
        if (e02 != null) {
            e02.l(drawable);
        }
    }

    public void setDropDownBackgroundTint(int i) {
        setDropDownBackgroundTintList(ColorStateList.valueOf(i));
    }

    public void setDropDownBackgroundTintList(ColorStateList colorStateList) {
        this.j = colorStateList;
        Drawable dropDownBackground = getDropDownBackground();
        if (dropDownBackground instanceof S0.g) {
            ((S0.g) dropDownBackground).m(this.j);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.e.f3819q = getOnItemSelectedListener();
    }

    @Override // android.widget.TextView
    public void setRawInputType(int i) {
        super.setRawInputType(i);
        TextInputLayout b2 = b();
        if (b2 != null) {
            b2.s();
        }
    }

    public void setSimpleItemSelectedColor(int i) {
        this.f1360k = i;
        if (getAdapter() instanceof v) {
            ((v) getAdapter()).a();
        }
    }

    public void setSimpleItemSelectedRippleColor(ColorStateList colorStateList) {
        this.f1361l = colorStateList;
        if (getAdapter() instanceof v) {
            ((v) getAdapter()).a();
        }
    }

    public void setSimpleItems(int i) {
        setSimpleItems(getResources().getStringArray(i));
    }

    @Override // android.widget.AutoCompleteTextView
    public final void showDropDown() {
        if (c()) {
            this.e.c();
        } else {
            super.showDropDown();
        }
    }

    public void setSimpleItems(String[] strArr) {
        setAdapter(new v(this, getContext(), this.f1359h, strArr));
    }
}
