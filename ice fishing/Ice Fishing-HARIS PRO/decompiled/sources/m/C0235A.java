package m;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;
import k0.C0188b;

/* renamed from: m.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0235A extends MultiAutoCompleteTextView {

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f3786d = {R.attr.popupBackground};

    /* renamed from: a, reason: collision with root package name */
    public final C0188b f3787a;

    /* renamed from: b, reason: collision with root package name */
    public final X f3788b;

    /* renamed from: c, reason: collision with root package name */
    public final C0237C f3789c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0235A(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.lumenpath.harispro.hrnavigator.R.attr.autoCompleteTextViewStyle);
        R0.a(context);
        Q0.a(this, getContext());
        M0.h i = M0.h.i(getContext(), attributeSet, f3786d, com.lumenpath.harispro.hrnavigator.R.attr.autoCompleteTextViewStyle);
        if (((TypedArray) i.f617c).hasValue(0)) {
            setDropDownBackgroundDrawable(i.c(0));
        }
        i.l();
        C0188b c0188b = new C0188b(this);
        this.f3787a = c0188b;
        c0188b.k(attributeSet, com.lumenpath.harispro.hrnavigator.R.attr.autoCompleteTextViewStyle);
        X x2 = new X(this);
        this.f3788b = x2;
        x2.f(attributeSet, com.lumenpath.harispro.hrnavigator.R.attr.autoCompleteTextViewStyle);
        x2.b();
        C0237C c0237c = new C0237C(this);
        this.f3789c = c0237c;
        c0237c.b(attributeSet, com.lumenpath.harispro.hrnavigator.R.attr.autoCompleteTextViewStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean isFocusable = isFocusable();
        boolean isClickable = isClickable();
        boolean isLongClickable = isLongClickable();
        int inputType = getInputType();
        KeyListener a2 = c0237c.a(keyListener);
        if (a2 == keyListener) {
            return;
        }
        super.setKeyListener(a2);
        setRawInputType(inputType);
        setFocusable(isFocusable);
        setClickable(isClickable);
        setLongClickable(isLongClickable);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0188b c0188b = this.f3787a;
        if (c0188b != null) {
            c0188b.a();
        }
        X x2 = this.f3788b;
        if (x2 != null) {
            x2.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0188b c0188b = this.f3787a;
        if (c0188b != null) {
            return c0188b.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0188b c0188b = this.f3787a;
        if (c0188b != null) {
            return c0188b.i();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f3788b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f3788b.e();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        h0.f.u(editorInfo, onCreateInputConnection, this);
        return this.f3789c.c(onCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0188b c0188b = this.f3787a;
        if (c0188b != null) {
            c0188b.m();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0188b c0188b = this.f3787a;
        if (c0188b != null) {
            c0188b.n(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        X x2 = this.f3788b;
        if (x2 != null) {
            x2.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        X x2 = this.f3788b;
        if (x2 != null) {
            x2.b();
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(h0.f.n(getContext(), i));
    }

    public void setEmojiCompatEnabled(boolean z2) {
        this.f3789c.d(z2);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f3789c.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0188b c0188b = this.f3787a;
        if (c0188b != null) {
            c0188b.s(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0188b c0188b = this.f3787a;
        if (c0188b != null) {
            c0188b.t(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        X x2 = this.f3788b;
        x2.l(colorStateList);
        x2.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        X x2 = this.f3788b;
        x2.m(mode);
        x2.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        X x2 = this.f3788b;
        if (x2 != null) {
            x2.g(context, i);
        }
    }
}
