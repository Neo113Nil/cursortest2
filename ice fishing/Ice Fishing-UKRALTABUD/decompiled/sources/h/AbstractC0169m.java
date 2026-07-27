package h;

import L.C0051b;
import a.AbstractC0069a;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import d.AbstractC0110a;

/* renamed from: h.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0169m extends AutoCompleteTextView {

    /* renamed from: h, reason: collision with root package name */
    public static final int[] f2221h = {R.attr.popupBackground};

    /* renamed from: f, reason: collision with root package name */
    public final C0170n f2222f;

    /* renamed from: g, reason: collision with root package name */
    public final C0175t f2223g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC0169m(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.icedrifter.arcticquest.R.attr.autoCompleteTextViewStyle);
        i0.a(context);
        C0051b E2 = C0051b.E(getContext(), attributeSet, f2221h, com.icedrifter.arcticquest.R.attr.autoCompleteTextViewStyle);
        if (((TypedArray) E2.f602g).hasValue(0)) {
            setDropDownBackgroundDrawable(E2.x(0));
        }
        E2.H();
        C0170n c0170n = new C0170n(this);
        this.f2222f = c0170n;
        c0170n.b(attributeSet, com.icedrifter.arcticquest.R.attr.autoCompleteTextViewStyle);
        C0175t c0175t = new C0175t(this);
        this.f2223g = c0175t;
        c0175t.d(attributeSet, com.icedrifter.arcticquest.R.attr.autoCompleteTextViewStyle);
        c0175t.b();
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0170n c0170n = this.f2222f;
        if (c0170n != null) {
            c0170n.a();
        }
        C0175t c0175t = this.f2223g;
        if (c0175t != null) {
            c0175t.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        j0 j0Var;
        C0170n c0170n = this.f2222f;
        if (c0170n == null || (j0Var = c0170n.f2231e) == null) {
            return null;
        }
        return j0Var.f2209a;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        j0 j0Var;
        C0170n c0170n = this.f2222f;
        if (c0170n == null || (j0Var = c0170n.f2231e) == null) {
            return null;
        }
        return j0Var.f2210b;
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection != null && editorInfo.hintText == null) {
            for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
            }
        }
        return onCreateInputConnection;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0170n c0170n = this.f2222f;
        if (c0170n != null) {
            c0170n.f2229c = -1;
            c0170n.d(null);
            c0170n.a();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        C0170n c0170n = this.f2222f;
        if (c0170n != null) {
            c0170n.c(i2);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC0069a.N(callback, this));
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i2) {
        setDropDownBackgroundDrawable(AbstractC0110a.a(getContext(), i2));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0170n c0170n = this.f2222f;
        if (c0170n != null) {
            c0170n.e(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0170n c0170n = this.f2222f;
        if (c0170n != null) {
            c0170n.f(mode);
        }
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        C0175t c0175t = this.f2223g;
        if (c0175t != null) {
            c0175t.e(context, i2);
        }
    }
}
