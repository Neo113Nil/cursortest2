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
import com.google.android.gms.internal.ads.C2728Pl;

/* renamed from: m.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4753p extends Button {

    /* renamed from: n, reason: collision with root package name */
    public final C2728Pl f39467n;

    /* renamed from: u, reason: collision with root package name */
    public final V f39468u;

    /* renamed from: v, reason: collision with root package name */
    public C4764v f39469v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4753p(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        O0.a(context);
        N0.a(getContext(), this);
        C2728Pl c2728Pl = new C2728Pl(this);
        this.f39467n = c2728Pl;
        c2728Pl.d(attributeSet, i);
        V v6 = new V(this);
        this.f39468u = v6;
        v6.f(attributeSet, i);
        v6.b();
        getEmojiTextViewHelper().a(attributeSet, i);
    }

    private C4764v getEmojiTextViewHelper() {
        if (this.f39469v == null) {
            this.f39469v = new C4764v(this);
        }
        return this.f39469v;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C2728Pl c2728Pl = this.f39467n;
        if (c2728Pl != null) {
            c2728Pl.a();
        }
        V v6 = this.f39468u;
        if (v6 != null) {
            v6.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (g1.f39421c) {
            return super.getAutoSizeMaxTextSize();
        }
        V v6 = this.f39468u;
        if (v6 != null) {
            return Math.round(v6.i.f39408e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (g1.f39421c) {
            return super.getAutoSizeMinTextSize();
        }
        V v6 = this.f39468u;
        if (v6 != null) {
            return Math.round(v6.i.f39407d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (g1.f39421c) {
            return super.getAutoSizeStepGranularity();
        }
        V v6 = this.f39468u;
        if (v6 != null) {
            return Math.round(v6.i.f39406c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (g1.f39421c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        V v6 = this.f39468u;
        return v6 != null ? v6.i.f39409f : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (g1.f39421c) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        V v6 = this.f39468u;
        if (v6 != null) {
            return v6.i.f39404a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return com.bumptech.glide.d.z(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C2728Pl c2728Pl = this.f39467n;
        if (c2728Pl != null) {
            return c2728Pl.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C2728Pl c2728Pl = this.f39467n;
        if (c2728Pl != null) {
            return c2728Pl.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f39468u.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f39468u.e();
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
    public void onLayout(boolean z8, int i, int i4, int i9, int i10) {
        super.onLayout(z8, i, i4, i9, i10);
        V v6 = this.f39468u;
        if (v6 == null || g1.f39421c) {
            return;
        }
        v6.i.a();
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i4, int i9) {
        super.onTextChanged(charSequence, i, i4, i9);
        V v6 = this.f39468u;
        if (v6 == null || g1.f39421c) {
            return;
        }
        C4732e0 c4732e0 = v6.i;
        if (c4732e0.f()) {
            c4732e0.a();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z8) {
        super.setAllCaps(z8);
        getEmojiTextViewHelper().b(z8);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i4, int i9, int i10) {
        if (g1.f39421c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i4, i9, i10);
            return;
        }
        V v6 = this.f39468u;
        if (v6 != null) {
            v6.i(i, i4, i9, i10);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (g1.f39421c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        V v6 = this.f39468u;
        if (v6 != null) {
            v6.j(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (g1.f39421c) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        V v6 = this.f39468u;
        if (v6 != null) {
            v6.k(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C2728Pl c2728Pl = this.f39467n;
        if (c2728Pl != null) {
            c2728Pl.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C2728Pl c2728Pl = this.f39467n;
        if (c2728Pl != null) {
            c2728Pl.f(i);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(com.bumptech.glide.d.A(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z8) {
        getEmojiTextViewHelper().c(z8);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((w8.a) getEmojiTextViewHelper().f39527b.f1233u).e(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z8) {
        V v6 = this.f39468u;
        if (v6 != null) {
            v6.f39335a.setAllCaps(z8);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C2728Pl c2728Pl = this.f39467n;
        if (c2728Pl != null) {
            c2728Pl.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C2728Pl c2728Pl = this.f39467n;
        if (c2728Pl != null) {
            c2728Pl.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        V v6 = this.f39468u;
        v6.l(colorStateList);
        v6.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        V v6 = this.f39468u;
        v6.m(mode);
        v6.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        V v6 = this.f39468u;
        if (v6 != null) {
            v6.g(context, i);
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f6) {
        boolean z8 = g1.f39421c;
        if (z8) {
            super.setTextSize(i, f6);
            return;
        }
        V v6 = this.f39468u;
        if (v6 == null || z8) {
            return;
        }
        C4732e0 c4732e0 = v6.i;
        if (c4732e0.f()) {
            return;
        }
        c4732e0.g(f6, i);
    }
}
