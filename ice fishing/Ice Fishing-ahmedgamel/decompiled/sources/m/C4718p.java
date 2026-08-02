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
import com.google.android.gms.internal.ads.C2749Pl;

/* renamed from: m.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4718p extends Button {

    /* renamed from: n, reason: collision with root package name */
    public final C2749Pl f39265n;

    /* renamed from: u, reason: collision with root package name */
    public final V f39266u;

    /* renamed from: v, reason: collision with root package name */
    public C4729v f39267v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4718p(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        O0.a(context);
        N0.a(getContext(), this);
        C2749Pl c2749Pl = new C2749Pl(this);
        this.f39265n = c2749Pl;
        c2749Pl.d(attributeSet, i);
        V v9 = new V(this);
        this.f39266u = v9;
        v9.f(attributeSet, i);
        v9.b();
        getEmojiTextViewHelper().a(attributeSet, i);
    }

    private C4729v getEmojiTextViewHelper() {
        if (this.f39267v == null) {
            this.f39267v = new C4729v(this);
        }
        return this.f39267v;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C2749Pl c2749Pl = this.f39265n;
        if (c2749Pl != null) {
            c2749Pl.a();
        }
        V v9 = this.f39266u;
        if (v9 != null) {
            v9.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (g1.f39219c) {
            return super.getAutoSizeMaxTextSize();
        }
        V v9 = this.f39266u;
        if (v9 != null) {
            return Math.round(v9.i.f39206e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (g1.f39219c) {
            return super.getAutoSizeMinTextSize();
        }
        V v9 = this.f39266u;
        if (v9 != null) {
            return Math.round(v9.i.f39205d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (g1.f39219c) {
            return super.getAutoSizeStepGranularity();
        }
        V v9 = this.f39266u;
        if (v9 != null) {
            return Math.round(v9.i.f39204c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (g1.f39219c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        V v9 = this.f39266u;
        return v9 != null ? v9.i.f39207f : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (g1.f39219c) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        V v9 = this.f39266u;
        if (v9 != null) {
            return v9.i.f39202a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return d6.c.n(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C2749Pl c2749Pl = this.f39265n;
        if (c2749Pl != null) {
            return c2749Pl.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C2749Pl c2749Pl = this.f39265n;
        if (c2749Pl != null) {
            return c2749Pl.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f39266u.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f39266u.e();
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
    public void onLayout(boolean z6, int i, int i4, int i6, int i9) {
        super.onLayout(z6, i, i4, i6, i9);
        V v9 = this.f39266u;
        if (v9 == null || g1.f39219c) {
            return;
        }
        v9.i.a();
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i4, int i6) {
        super.onTextChanged(charSequence, i, i4, i6);
        V v9 = this.f39266u;
        if (v9 == null || g1.f39219c) {
            return;
        }
        C4697e0 c4697e0 = v9.i;
        if (c4697e0.f()) {
            c4697e0.a();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z6) {
        super.setAllCaps(z6);
        getEmojiTextViewHelper().b(z6);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i4, int i6, int i9) {
        if (g1.f39219c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i4, i6, i9);
            return;
        }
        V v9 = this.f39266u;
        if (v9 != null) {
            v9.i(i, i4, i6, i9);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (g1.f39219c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        V v9 = this.f39266u;
        if (v9 != null) {
            v9.j(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (g1.f39219c) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        V v9 = this.f39266u;
        if (v9 != null) {
            v9.k(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C2749Pl c2749Pl = this.f39265n;
        if (c2749Pl != null) {
            c2749Pl.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C2749Pl c2749Pl = this.f39265n;
        if (c2749Pl != null) {
            c2749Pl.f(i);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(d6.c.o(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z6) {
        getEmojiTextViewHelper().c(z6);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((com.bumptech.glide.d) getEmojiTextViewHelper().f39325b.f1291u).s(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z6) {
        V v9 = this.f39266u;
        if (v9 != null) {
            v9.f39133a.setAllCaps(z6);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C2749Pl c2749Pl = this.f39265n;
        if (c2749Pl != null) {
            c2749Pl.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C2749Pl c2749Pl = this.f39265n;
        if (c2749Pl != null) {
            c2749Pl.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        V v9 = this.f39266u;
        v9.l(colorStateList);
        v9.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        V v9 = this.f39266u;
        v9.m(mode);
        v9.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        V v9 = this.f39266u;
        if (v9 != null) {
            v9.g(context, i);
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f2) {
        boolean z6 = g1.f39219c;
        if (z6) {
            super.setTextSize(i, f2);
            return;
        }
        V v9 = this.f39266u;
        if (v9 == null || z6) {
            return;
        }
        C4697e0 c4697e0 = v9.i;
        if (c4697e0.f()) {
            return;
        }
        c4697e0.g(f2, i);
    }
}
