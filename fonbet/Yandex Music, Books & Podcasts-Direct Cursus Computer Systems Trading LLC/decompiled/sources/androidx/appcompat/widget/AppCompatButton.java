package androidx.appcompat.widget;

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
import androidx.annotation.NonNull;
import defpackage.asq;
import defpackage.gfs;
import defpackage.jq0;
import defpackage.lr0;
import defpackage.ls0;
import defpackage.oa2;
import defpackage.sjs;
import defpackage.ts0;
import defpackage.zhu;
import ru.yandex.music.R;

/* loaded from: classes.dex */
public class AppCompatButton extends Button implements oa2 {
    public final jq0 a;
    public final ls0 b;
    public lr0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatButton(@NonNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        sjs.a(context);
        gfs.a(getContext(), this);
        jq0 jq0Var = new jq0(this);
        this.a = jq0Var;
        jq0Var.d(attributeSet, i);
        ls0 ls0Var = new ls0(this);
        this.b = ls0Var;
        ls0Var.f(attributeSet, i);
        ls0Var.b();
        getEmojiTextViewHelper().b(attributeSet, i);
    }

    @NonNull
    private lr0 getEmojiTextViewHelper() {
        if (this.c == null) {
            this.c = new lr0(this);
        }
        return this.c;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        jq0 jq0Var = this.a;
        if (jq0Var != null) {
            jq0Var.a();
        }
        ls0 ls0Var = this.b;
        if (ls0Var != null) {
            ls0Var.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (zhu.c) {
            return super.getAutoSizeMaxTextSize();
        }
        ls0 ls0Var = this.b;
        if (ls0Var != null) {
            return Math.round(ls0Var.i.e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (zhu.c) {
            return super.getAutoSizeMinTextSize();
        }
        ls0 ls0Var = this.b;
        if (ls0Var != null) {
            return Math.round(ls0Var.i.d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (zhu.c) {
            return super.getAutoSizeStepGranularity();
        }
        ls0 ls0Var = this.b;
        if (ls0Var != null) {
            return Math.round(ls0Var.i.c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (zhu.c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        ls0 ls0Var = this.b;
        return ls0Var != null ? ls0Var.i.f : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (zhu.c) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        ls0 ls0Var = this.b;
        if (ls0Var != null) {
            return ls0Var.i.a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return asq.W(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        jq0 jq0Var = this.a;
        if (jq0Var != null) {
            return jq0Var.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        jq0 jq0Var = this.a;
        if (jq0Var != null) {
            return jq0Var.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.b.e();
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
        ls0 ls0Var = this.b;
        if (ls0Var == null || zhu.c) {
            return;
        }
        ls0Var.i.a();
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        ls0 ls0Var = this.b;
        if (ls0Var != null) {
            ts0 ts0Var = ls0Var.i;
            if (zhu.c || !ts0Var.f()) {
                return;
            }
            ts0Var.a();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().c(z);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (zhu.c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        ls0 ls0Var = this.b;
        if (ls0Var != null) {
            ls0Var.h(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (zhu.c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        ls0 ls0Var = this.b;
        if (ls0Var != null) {
            ls0Var.i(iArr, i);
        }
    }

    @Override // android.widget.TextView, defpackage.oa2
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (zhu.c) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        ls0 ls0Var = this.b;
        if (ls0Var != null) {
            ls0Var.j(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        jq0 jq0Var = this.a;
        if (jq0Var != null) {
            jq0Var.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        jq0 jq0Var = this.a;
        if (jq0Var != null) {
            jq0Var.f(i);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(asq.Z(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().d(z);
    }

    @Override // android.widget.TextView
    public void setFilters(@NonNull InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z) {
        ls0 ls0Var = this.b;
        if (ls0Var != null) {
            ls0Var.a.setAllCaps(z);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        jq0 jq0Var = this.a;
        if (jq0Var != null) {
            jq0Var.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        jq0 jq0Var = this.a;
        if (jq0Var != null) {
            jq0Var.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        ls0 ls0Var = this.b;
        ls0Var.k(colorStateList);
        ls0Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        ls0 ls0Var = this.b;
        ls0Var.l(mode);
        ls0Var.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        ls0 ls0Var = this.b;
        if (ls0Var != null) {
            ls0Var.g(context, i);
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) {
        boolean z = zhu.c;
        if (z) {
            super.setTextSize(i, f);
            return;
        }
        ls0 ls0Var = this.b;
        if (ls0Var != null) {
            ts0 ts0Var = ls0Var.i;
            if (z || ts0Var.f()) {
                return;
            }
            ts0Var.g(i, f);
        }
    }

    public AppCompatButton(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.buttonStyle);
    }

    public AppCompatButton(@NonNull Context context) {
        this(context, null);
    }
}
