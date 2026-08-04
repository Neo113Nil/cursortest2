package com.gamericefishpro.space.n;

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
import com.gamericefishpro.space.R;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class n extends Button {
    public final com.gamericefishpro.space.h2.w1 d;
    public final e0 e;
    public t i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialButtonStyle);
        v1.a(context);
        u1.a(this, getContext());
        com.gamericefishpro.space.h2.w1 w1Var = new com.gamericefishpro.space.h2.w1(this);
        this.d = w1Var;
        w1Var.d(attributeSet, R.attr.materialButtonStyle);
        e0 e0Var = new e0(this);
        this.e = e0Var;
        e0Var.d(attributeSet, R.attr.materialButtonStyle);
        e0Var.b();
        getEmojiTextViewHelper().a(attributeSet, R.attr.materialButtonStyle);
    }

    private t getEmojiTextViewHelper() {
        if (this.i == null) {
            this.i = new t(this);
        }
        return this.i;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        com.gamericefishpro.space.h2.w1 w1Var = this.d;
        if (w1Var != null) {
            w1Var.a();
        }
        e0 e0Var = this.e;
        if (e0Var != null) {
            e0Var.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (k2.a) {
            return super.getAutoSizeMaxTextSize();
        }
        e0 e0Var = this.e;
        if (e0Var != null) {
            return Math.round(e0Var.i.e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (k2.a) {
            return super.getAutoSizeMinTextSize();
        }
        e0 e0Var = this.e;
        if (e0Var != null) {
            return Math.round(e0Var.i.d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (k2.a) {
            return super.getAutoSizeStepGranularity();
        }
        e0 e0Var = this.e;
        if (e0Var != null) {
            return Math.round(e0Var.i.c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (k2.a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        e0 e0Var = this.e;
        return e0Var != null ? e0Var.i.f : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (k2.a) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        e0 e0Var = this.e;
        if (e0Var != null) {
            return e0Var.i.a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        return customSelectionActionModeCallback instanceof com.gamericefishpro.space.h4.i ? ((com.gamericefishpro.space.h4.i) customSelectionActionModeCallback).a : customSelectionActionModeCallback;
    }

    public ColorStateList getSupportBackgroundTintList() {
        com.gamericefishpro.space.h2.w1 w1Var = this.d;
        if (w1Var != null) {
            return w1Var.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        com.gamericefishpro.space.h2.w1 w1Var = this.d;
        if (w1Var != null) {
            return w1Var.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        w1 w1Var = this.e.h;
        if (w1Var != null) {
            return w1Var.a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        w1 w1Var = this.e.h;
        if (w1Var != null) {
            return w1Var.b;
        }
        return null;
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
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        e0 e0Var = this.e;
        if (e0Var == null || k2.a) {
            return;
        }
        e0Var.i.a();
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        e0 e0Var = this.e;
        if (e0Var != null) {
            n0 n0Var = e0Var.i;
            if (k2.a || !n0Var.f()) {
                return;
            }
            n0Var.a();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        ((com.gamericefishpro.space.d9.h) getEmojiTextViewHelper().b.e).L(z);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (k2.a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        e0 e0Var = this.e;
        if (e0Var != null) {
            e0Var.f(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (k2.a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        e0 e0Var = this.e;
        if (e0Var != null) {
            e0Var.g(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (k2.a) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        e0 e0Var = this.e;
        if (e0Var != null) {
            e0Var.h(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        com.gamericefishpro.space.h2.w1 w1Var = this.d;
        if (w1Var != null) {
            w1Var.f();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        com.gamericefishpro.space.h2.w1 w1Var = this.d;
        if (w1Var != null) {
            w1Var.g(i);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(com.gamericefishpro.space.i.a.T(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        ((com.gamericefishpro.space.d9.h) getEmojiTextViewHelper().b.e).M(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((com.gamericefishpro.space.d9.h) getEmojiTextViewHelper().b.e).z(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z) {
        e0 e0Var = this.e;
        if (e0Var != null) {
            e0Var.a.setAllCaps(z);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        com.gamericefishpro.space.h2.w1 w1Var = this.d;
        if (w1Var != null) {
            w1Var.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        com.gamericefishpro.space.h2.w1 w1Var = this.d;
        if (w1Var != null) {
            w1Var.j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        e0 e0Var = this.e;
        e0Var.i(colorStateList);
        e0Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        e0 e0Var = this.e;
        e0Var.j(mode);
        e0Var.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        e0 e0Var = this.e;
        if (e0Var != null) {
            e0Var.e(context, i);
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) {
        boolean z = k2.a;
        if (z) {
            super.setTextSize(i, f);
            return;
        }
        e0 e0Var = this.e;
        if (e0Var != null) {
            n0 n0Var = e0Var.i;
            if (z || n0Var.f()) {
                return;
            }
            n0Var.g(i, f);
        }
    }
}
