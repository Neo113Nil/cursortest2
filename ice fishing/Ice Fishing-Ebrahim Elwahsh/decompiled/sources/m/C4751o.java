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
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import com.google.android.gms.internal.ads.C2728Pl;
import com.icefishing.icefishingliveapp.C5284R;

/* renamed from: m.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4751o extends AutoCompleteTextView {

    /* renamed from: w, reason: collision with root package name */
    public static final int[] f39462w = {R.attr.popupBackground};

    /* renamed from: n, reason: collision with root package name */
    public final C2728Pl f39463n;

    /* renamed from: u, reason: collision with root package name */
    public final V f39464u;

    /* renamed from: v, reason: collision with root package name */
    public final C4714A f39465v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4751o(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, C5284R.attr.autoCompleteTextViewStyle);
        O0.a(context);
        N0.a(getContext(), this);
        Q0 p6 = Q0.p(getContext(), attributeSet, f39462w, C5284R.attr.autoCompleteTextViewStyle);
        if (((TypedArray) p6.f39326c).hasValue(0)) {
            setDropDownBackgroundDrawable(p6.g(0));
        }
        p6.q();
        C2728Pl c2728Pl = new C2728Pl(this);
        this.f39463n = c2728Pl;
        c2728Pl.d(attributeSet, C5284R.attr.autoCompleteTextViewStyle);
        V v6 = new V(this);
        this.f39464u = v6;
        v6.f(attributeSet, C5284R.attr.autoCompleteTextViewStyle);
        v6.b();
        C4714A c4714a = new C4714A(this);
        this.f39465v = c4714a;
        c4714a.b(attributeSet, C5284R.attr.autoCompleteTextViewStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean isFocusable = super.isFocusable();
        boolean isClickable = super.isClickable();
        boolean isLongClickable = super.isLongClickable();
        int inputType = super.getInputType();
        KeyListener a9 = c4714a.a(keyListener);
        if (a9 == keyListener) {
            return;
        }
        super.setKeyListener(a9);
        super.setRawInputType(inputType);
        super.setFocusable(isFocusable);
        super.setClickable(isClickable);
        super.setLongClickable(isLongClickable);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C2728Pl c2728Pl = this.f39463n;
        if (c2728Pl != null) {
            c2728Pl.a();
        }
        V v6 = this.f39464u;
        if (v6 != null) {
            v6.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return com.bumptech.glide.d.z(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C2728Pl c2728Pl = this.f39463n;
        if (c2728Pl != null) {
            return c2728Pl.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C2728Pl c2728Pl = this.f39463n;
        if (c2728Pl != null) {
            return c2728Pl.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f39464u.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f39464u.e();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        w8.a.g(editorInfo, onCreateInputConnection, this);
        return this.f39465v.c(onCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C2728Pl c2728Pl = this.f39463n;
        if (c2728Pl != null) {
            c2728Pl.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C2728Pl c2728Pl = this.f39463n;
        if (c2728Pl != null) {
            c2728Pl.f(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        V v6 = this.f39464u;
        if (v6 != null) {
            v6.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        V v6 = this.f39464u;
        if (v6 != null) {
            v6.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(com.bumptech.glide.d.A(callback, this));
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(com.bumptech.glide.f.h(getContext(), i));
    }

    public void setEmojiCompatEnabled(boolean z8) {
        this.f39465v.d(z8);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f39465v.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C2728Pl c2728Pl = this.f39463n;
        if (c2728Pl != null) {
            c2728Pl.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C2728Pl c2728Pl = this.f39463n;
        if (c2728Pl != null) {
            c2728Pl.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        V v6 = this.f39464u;
        v6.l(colorStateList);
        v6.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        V v6 = this.f39464u;
        v6.m(mode);
        v6.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        V v6 = this.f39464u;
        if (v6 != null) {
            v6.g(context, i);
        }
    }
}
