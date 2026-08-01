package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import k0.C0188b;

/* renamed from: m.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0274q extends Button {

    /* renamed from: a, reason: collision with root package name */
    public final C0188b f3998a;

    /* renamed from: b, reason: collision with root package name */
    public final X f3999b;

    /* renamed from: c, reason: collision with root package name */
    public C0287x f4000c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0274q(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        R0.a(context);
        Q0.a(this, getContext());
        C0188b c0188b = new C0188b(this);
        this.f3998a = c0188b;
        c0188b.k(attributeSet, i);
        X x2 = new X(this);
        this.f3999b = x2;
        x2.f(attributeSet, i);
        x2.b();
        getEmojiTextViewHelper().a(attributeSet, i);
    }

    private C0287x getEmojiTextViewHelper() {
        if (this.f4000c == null) {
            this.f4000c = new C0287x(this);
        }
        return this.f4000c;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0188b c0188b = this.f3998a;
        if (c0188b != null) {
            c0188b.a();
        }
        X x2 = this.f3999b;
        if (x2 != null) {
            x2.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (h1.f3954c) {
            return super.getAutoSizeMaxTextSize();
        }
        X x2 = this.f3999b;
        if (x2 != null) {
            return Math.round(x2.i.e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (h1.f3954c) {
            return super.getAutoSizeMinTextSize();
        }
        X x2 = this.f3999b;
        if (x2 != null) {
            return Math.round(x2.i.f3943d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (h1.f3954c) {
            return super.getAutoSizeStepGranularity();
        }
        X x2 = this.f3999b;
        if (x2 != null) {
            return Math.round(x2.i.f3942c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (h1.f3954c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        X x2 = this.f3999b;
        return x2 != null ? x2.i.f3944f : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (h1.f3954c) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        X x2 = this.f3999b;
        if (x2 != null) {
            return x2.i.f3940a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        return customSelectionActionModeCallback instanceof R.i ? ((R.i) customSelectionActionModeCallback).f1005a : customSelectionActionModeCallback;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0188b c0188b = this.f3998a;
        if (c0188b != null) {
            return c0188b.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0188b c0188b = this.f3998a;
        if (c0188b != null) {
            return c0188b.i();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f3999b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f3999b.e();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        super.onLayout(z2, i, i2, i3, i4);
        X x2 = this.f3999b;
        if (x2 == null || h1.f3954c) {
            return;
        }
        x2.i.a();
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        X x2 = this.f3999b;
        if (x2 == null || h1.f3954c) {
            return;
        }
        C0255g0 c0255g0 = x2.i;
        if (c0255g0.f()) {
            c0255g0.a();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z2) {
        super.setAllCaps(z2);
        getEmojiTextViewHelper().b(z2);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (h1.f3954c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        X x2 = this.f3999b;
        if (x2 != null) {
            x2.i(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (h1.f3954c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        X x2 = this.f3999b;
        if (x2 != null) {
            x2.j(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (h1.f3954c) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        X x2 = this.f3999b;
        if (x2 != null) {
            x2.k(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0188b c0188b = this.f3998a;
        if (c0188b != null) {
            c0188b.m();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0188b c0188b = this.f3998a;
        if (c0188b != null) {
            c0188b.n(i);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(R.j.u0(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z2) {
        getEmojiTextViewHelper().c(z2);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((R.j) getEmojiTextViewHelper().f4055b.f10b).z(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z2) {
        X x2 = this.f3999b;
        if (x2 != null) {
            x2.f3891a.setAllCaps(z2);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0188b c0188b = this.f3998a;
        if (c0188b != null) {
            c0188b.s(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0188b c0188b = this.f3998a;
        if (c0188b != null) {
            c0188b.t(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        X x2 = this.f3999b;
        x2.l(colorStateList);
        x2.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        X x2 = this.f3999b;
        x2.m(mode);
        x2.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        X x2 = this.f3999b;
        if (x2 != null) {
            x2.g(context, i);
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f2) {
        boolean z2 = h1.f3954c;
        if (z2) {
            super.setTextSize(i, f2);
            return;
        }
        X x2 = this.f3999b;
        if (x2 == null || z2) {
            return;
        }
        C0255g0 c0255g0 = x2.i;
        if (c0255g0.f()) {
            return;
        }
        c0255g0.g(i, f2);
    }
}
