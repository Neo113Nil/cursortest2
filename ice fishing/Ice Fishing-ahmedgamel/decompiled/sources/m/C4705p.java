package m;

import a.AbstractC0422a;
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
import com.google.android.gms.internal.ads.C2712Ol;

/* renamed from: m.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4705p extends Button {

    /* renamed from: n, reason: collision with root package name */
    public final C2712Ol f39196n;

    /* renamed from: u, reason: collision with root package name */
    public final V f39197u;

    /* renamed from: v, reason: collision with root package name */
    public C4716v f39198v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4705p(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        O0.a(context);
        N0.a(getContext(), this);
        C2712Ol c2712Ol = new C2712Ol(this);
        this.f39196n = c2712Ol;
        c2712Ol.d(attributeSet, i);
        V v9 = new V(this);
        this.f39197u = v9;
        v9.f(attributeSet, i);
        v9.b();
        getEmojiTextViewHelper().a(attributeSet, i);
    }

    private C4716v getEmojiTextViewHelper() {
        if (this.f39198v == null) {
            this.f39198v = new C4716v(this);
        }
        return this.f39198v;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C2712Ol c2712Ol = this.f39196n;
        if (c2712Ol != null) {
            c2712Ol.a();
        }
        V v9 = this.f39197u;
        if (v9 != null) {
            v9.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (f1.f39148c) {
            return super.getAutoSizeMaxTextSize();
        }
        V v9 = this.f39197u;
        if (v9 != null) {
            return Math.round(v9.i.f39137e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (f1.f39148c) {
            return super.getAutoSizeMinTextSize();
        }
        V v9 = this.f39197u;
        if (v9 != null) {
            return Math.round(v9.i.f39136d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (f1.f39148c) {
            return super.getAutoSizeStepGranularity();
        }
        V v9 = this.f39197u;
        if (v9 != null) {
            return Math.round(v9.i.f39135c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (f1.f39148c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        V v9 = this.f39197u;
        return v9 != null ? v9.i.f39138f : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (f1.f39148c) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        V v9 = this.f39197u;
        if (v9 != null) {
            return v9.i.f39133a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return d6.c.q(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C2712Ol c2712Ol = this.f39196n;
        if (c2712Ol != null) {
            return c2712Ol.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C2712Ol c2712Ol = this.f39196n;
        if (c2712Ol != null) {
            return c2712Ol.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f39197u.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f39197u.e();
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
    public void onLayout(boolean z3, int i, int i6, int i9, int i10) {
        super.onLayout(z3, i, i6, i9, i10);
        V v9 = this.f39197u;
        if (v9 == null || f1.f39148c) {
            return;
        }
        v9.i.a();
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i6, int i9) {
        super.onTextChanged(charSequence, i, i6, i9);
        V v9 = this.f39197u;
        if (v9 == null || f1.f39148c) {
            return;
        }
        C4684e0 c4684e0 = v9.i;
        if (c4684e0.f()) {
            c4684e0.a();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z3) {
        super.setAllCaps(z3);
        getEmojiTextViewHelper().b(z3);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i6, int i9, int i10) {
        if (f1.f39148c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i6, i9, i10);
            return;
        }
        V v9 = this.f39197u;
        if (v9 != null) {
            v9.i(i, i6, i9, i10);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (f1.f39148c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        V v9 = this.f39197u;
        if (v9 != null) {
            v9.j(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (f1.f39148c) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        V v9 = this.f39197u;
        if (v9 != null) {
            v9.k(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C2712Ol c2712Ol = this.f39196n;
        if (c2712Ol != null) {
            c2712Ol.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C2712Ol c2712Ol = this.f39196n;
        if (c2712Ol != null) {
            c2712Ol.f(i);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(d6.c.r(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z3) {
        getEmojiTextViewHelper().c(z3);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((AbstractC0422a) getEmojiTextViewHelper().f39256b.f37625u).m(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z3) {
        V v9 = this.f39197u;
        if (v9 != null) {
            v9.f39064a.setAllCaps(z3);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C2712Ol c2712Ol = this.f39196n;
        if (c2712Ol != null) {
            c2712Ol.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C2712Ol c2712Ol = this.f39196n;
        if (c2712Ol != null) {
            c2712Ol.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        V v9 = this.f39197u;
        v9.l(colorStateList);
        v9.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        V v9 = this.f39197u;
        v9.m(mode);
        v9.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        V v9 = this.f39197u;
        if (v9 != null) {
            v9.g(context, i);
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f3) {
        boolean z3 = f1.f39148c;
        if (z3) {
            super.setTextSize(i, f3);
            return;
        }
        V v9 = this.f39197u;
        if (v9 == null || z3) {
            return;
        }
        C4684e0 c4684e0 = v9.i;
        if (c4684e0.f()) {
            return;
        }
        c4684e0.g(f3, i);
    }
}
