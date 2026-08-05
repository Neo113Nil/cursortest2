package defpackage;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.Filterable;
import android.widget.ListAdapter;
import com.kolosta.rejin.jilosa.R;
import java.util.List;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class dr extends uezcOCXw {
    public ColorStateList OnDfzHZD;
    public final xp P7K7Inc8;
    public final int[] Qr9iLBAD;
    public final AccessibilityManager b2ZJblxo;
    public final float eVhOlqcC;
    public final int jb9XjC4I;
    public ColorStateList k3x7lurq;
    public int ow5vqvCr;

    public dr(Context context, AttributeSet attributeSet) {
        super(le0.nSmgoSB5(context, attributeSet, R.attr.autoCompleteTextViewStyle, 0), attributeSet);
        this.Qr9iLBAD = new int[]{android.R.attr.state_selected};
        new Rect();
        Context context2 = getContext();
        TypedArray FySoLYna = fn.FySoLYna(context2, attributeSet, y00.k3x7lurq, R.attr.autoCompleteTextViewStyle, R.style.Widget_AppCompat_AutoCompleteTextView, new int[0]);
        if (FySoLYna.hasValue(0) && FySoLYna.getInt(0, 0) == 0) {
            setKeyListener(null);
        }
        this.jb9XjC4I = FySoLYna.getResourceId(3, R.layout.mtrl_auto_complete_simple_item);
        int i = 1;
        this.eVhOlqcC = FySoLYna.getDimensionPixelOffset(1, R.dimen.mtrl_exposed_dropdown_menu_popup_elevation);
        if (FySoLYna.hasValue(2)) {
            this.k3x7lurq = ColorStateList.valueOf(FySoLYna.getColor(2, 0));
        }
        this.ow5vqvCr = FySoLYna.getColor(4, 0);
        this.OnDfzHZD = w30.gjV1z5T1(context2, FySoLYna, 5);
        this.b2ZJblxo = (AccessibilityManager) context2.getSystemService("accessibility");
        xp xpVar = new xp(context2, null, R.attr.listPopupWindowStyle, 0);
        this.P7K7Inc8 = xpVar;
        xpVar.DK9slbsy = true;
        E3Msy4Bi e3Msy4Bi = xpVar.lwWCatUu;
        e3Msy4Bi.setFocusable(true);
        xpVar.sjUBp5pO = this;
        e3Msy4Bi.setInputMethodMode(2);
        xpVar.OxcuoDLp(getAdapter());
        xpVar.OxcuoDLp = new g(i, this);
        if (FySoLYna.hasValue(6)) {
            setSimpleItems(FySoLYna.getResourceId(6, 0));
        }
        FySoLYna.recycle();
    }

    public final boolean MdtA4re8() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        AccessibilityManager accessibilityManager = this.b2ZJblxo;
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

    public final void NCTxEWno() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public final void dismissDropDown() {
        if (MdtA4re8()) {
            this.P7K7Inc8.dismiss();
        } else {
            super.dismissDropDown();
        }
    }

    public ColorStateList getDropDownBackgroundTintList() {
        return this.k3x7lurq;
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        NCTxEWno();
        return super.getHint();
    }

    public float getPopupElevation() {
        return this.eVhOlqcC;
    }

    public int getSimpleItemSelectedColor() {
        return this.ow5vqvCr;
    }

    public ColorStateList getSimpleItemSelectedRippleColor() {
        return this.OnDfzHZD;
    }

    @Override // android.widget.AutoCompleteTextView
    public final boolean isPopupShowing() {
        xp xpVar = this.P7K7Inc8;
        if (xpVar == null || !xpVar.lwWCatUu.isShowing()) {
            return super.isPopupShowing();
        }
        return true;
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NCTxEWno();
    }

    @Override // android.widget.AutoCompleteTextView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.P7K7Inc8.dismiss();
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
        NCTxEWno();
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            int measuredWidth = getMeasuredWidth();
            getAdapter();
            NCTxEWno();
            setMeasuredDimension(Math.min(Math.max(measuredWidth, 0), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z) {
        if (MdtA4re8()) {
            return;
        }
        super.onWindowFocusChanged(z);
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(T t) {
        super.setAdapter(t);
        this.P7K7Inc8.OxcuoDLp(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundDrawable(Drawable drawable) {
        super.setDropDownBackgroundDrawable(drawable);
        xp xpVar = this.P7K7Inc8;
        if (xpVar != null) {
            xpVar.b2ZJblxo(drawable);
        }
    }

    public void setDropDownBackgroundTint(int i) {
        setDropDownBackgroundTintList(ColorStateList.valueOf(i));
    }

    public void setDropDownBackgroundTintList(ColorStateList colorStateList) {
        this.k3x7lurq = colorStateList;
        Drawable dropDownBackground = getDropDownBackground();
        if (dropDownBackground instanceof tr) {
            ((tr) dropDownBackground).OxcuoDLp(this.k3x7lurq);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.P7K7Inc8.amk52bBQ = getOnItemSelectedListener();
    }

    @Override // android.widget.TextView
    public void setRawInputType(int i) {
        super.setRawInputType(i);
        NCTxEWno();
    }

    public void setSimpleItemSelectedColor(int i) {
        this.ow5vqvCr = i;
        if (getAdapter() instanceof cr) {
            ((cr) getAdapter()).qoPGr6Ce();
        }
    }

    public void setSimpleItemSelectedRippleColor(ColorStateList colorStateList) {
        this.OnDfzHZD = colorStateList;
        if (getAdapter() instanceof cr) {
            ((cr) getAdapter()).qoPGr6Ce();
        }
    }

    public void setSimpleItems(String[] strArr) {
        setAdapter(new cr(this, getContext(), this.jb9XjC4I, strArr));
    }

    @Override // android.widget.AutoCompleteTextView
    public final void showDropDown() {
        if (MdtA4re8()) {
            this.P7K7Inc8.wxUZMvaN();
        } else {
            super.showDropDown();
        }
    }

    public void setSimpleItems(int i) {
        setSimpleItems(getResources().getStringArray(i));
    }
}
