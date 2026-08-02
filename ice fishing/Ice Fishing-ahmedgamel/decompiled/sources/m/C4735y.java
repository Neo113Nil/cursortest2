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
import com.IceFishing.LiveIceFishing.C5248R;
import com.google.android.gms.internal.ads.C2749Pl;

/* renamed from: m.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4735y extends MultiAutoCompleteTextView {

    /* renamed from: w, reason: collision with root package name */
    public static final int[] f39333w = {R.attr.popupBackground};

    /* renamed from: n, reason: collision with root package name */
    public final C2749Pl f39334n;

    /* renamed from: u, reason: collision with root package name */
    public final V f39335u;

    /* renamed from: v, reason: collision with root package name */
    public final C4679A f39336v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4735y(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, C5248R.attr.autoCompleteTextViewStyle);
        O0.a(context);
        N0.a(getContext(), this);
        l4.g s9 = l4.g.s(getContext(), attributeSet, f39333w, C5248R.attr.autoCompleteTextViewStyle);
        if (((TypedArray) s9.f38917v).hasValue(0)) {
            setDropDownBackgroundDrawable(s9.i(0));
        }
        s9.t();
        C2749Pl c2749Pl = new C2749Pl(this);
        this.f39334n = c2749Pl;
        c2749Pl.d(attributeSet, C5248R.attr.autoCompleteTextViewStyle);
        V v9 = new V(this);
        this.f39335u = v9;
        v9.f(attributeSet, C5248R.attr.autoCompleteTextViewStyle);
        v9.b();
        C4679A c4679a = new C4679A(this);
        this.f39336v = c4679a;
        c4679a.b(attributeSet, C5248R.attr.autoCompleteTextViewStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean isFocusable = isFocusable();
        boolean isClickable = isClickable();
        boolean isLongClickable = isLongClickable();
        int inputType = getInputType();
        KeyListener a9 = c4679a.a(keyListener);
        if (a9 == keyListener) {
            return;
        }
        super.setKeyListener(a9);
        setRawInputType(inputType);
        setFocusable(isFocusable);
        setClickable(isClickable);
        setLongClickable(isLongClickable);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C2749Pl c2749Pl = this.f39334n;
        if (c2749Pl != null) {
            c2749Pl.a();
        }
        V v9 = this.f39335u;
        if (v9 != null) {
            v9.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C2749Pl c2749Pl = this.f39334n;
        if (c2749Pl != null) {
            return c2749Pl.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C2749Pl c2749Pl = this.f39334n;
        if (c2749Pl != null) {
            return c2749Pl.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f39335u.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f39335u.e();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        t8.g.m(editorInfo, onCreateInputConnection, this);
        return this.f39336v.c(onCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C2749Pl c2749Pl = this.f39334n;
        if (c2749Pl != null) {
            c2749Pl.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C2749Pl c2749Pl = this.f39334n;
        if (c2749Pl != null) {
            c2749Pl.f(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        V v9 = this.f39335u;
        if (v9 != null) {
            v9.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        V v9 = this.f39335u;
        if (v9 != null) {
            v9.b();
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(com.bumptech.glide.g.h(getContext(), i));
    }

    public void setEmojiCompatEnabled(boolean z6) {
        this.f39336v.d(z6);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f39336v.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C2749Pl c2749Pl = this.f39334n;
        if (c2749Pl != null) {
            c2749Pl.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C2749Pl c2749Pl = this.f39334n;
        if (c2749Pl != null) {
            c2749Pl.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        V v9 = this.f39335u;
        v9.l(colorStateList);
        v9.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        V v9 = this.f39335u;
        v9.m(mode);
        v9.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        V v9 = this.f39335u;
        if (v9 != null) {
            v9.g(context, i);
        }
    }
}
