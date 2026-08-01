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
import com.google.android.gms.internal.ads.C2712Ol;
import com.icefishing.icefishingbigwin.C5275R;

/* renamed from: m.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4703o extends AutoCompleteTextView {

    /* renamed from: w, reason: collision with root package name */
    public static final int[] f39191w = {R.attr.popupBackground};

    /* renamed from: n, reason: collision with root package name */
    public final C2712Ol f39192n;

    /* renamed from: u, reason: collision with root package name */
    public final V f39193u;

    /* renamed from: v, reason: collision with root package name */
    public final C4667A f39194v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4703o(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, C5275R.attr.autoCompleteTextViewStyle);
        O0.a(context);
        N0.a(getContext(), this);
        j4.g s9 = j4.g.s(getContext(), attributeSet, f39191w, C5275R.attr.autoCompleteTextViewStyle);
        if (((TypedArray) s9.f38405v).hasValue(0)) {
            setDropDownBackgroundDrawable(s9.i(0));
        }
        s9.t();
        C2712Ol c2712Ol = new C2712Ol(this);
        this.f39192n = c2712Ol;
        c2712Ol.d(attributeSet, C5275R.attr.autoCompleteTextViewStyle);
        V v9 = new V(this);
        this.f39193u = v9;
        v9.f(attributeSet, C5275R.attr.autoCompleteTextViewStyle);
        v9.b();
        C4667A c4667a = new C4667A(this);
        this.f39194v = c4667a;
        c4667a.b(attributeSet, C5275R.attr.autoCompleteTextViewStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean isFocusable = super.isFocusable();
        boolean isClickable = super.isClickable();
        boolean isLongClickable = super.isLongClickable();
        int inputType = super.getInputType();
        KeyListener a9 = c4667a.a(keyListener);
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
        C2712Ol c2712Ol = this.f39192n;
        if (c2712Ol != null) {
            c2712Ol.a();
        }
        V v9 = this.f39193u;
        if (v9 != null) {
            v9.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return d6.c.q(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C2712Ol c2712Ol = this.f39192n;
        if (c2712Ol != null) {
            return c2712Ol.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C2712Ol c2712Ol = this.f39192n;
        if (c2712Ol != null) {
            return c2712Ol.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f39193u.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f39193u.e();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        t8.g.r(editorInfo, onCreateInputConnection, this);
        return this.f39194v.c(onCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C2712Ol c2712Ol = this.f39192n;
        if (c2712Ol != null) {
            c2712Ol.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C2712Ol c2712Ol = this.f39192n;
        if (c2712Ol != null) {
            c2712Ol.f(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        V v9 = this.f39193u;
        if (v9 != null) {
            v9.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        V v9 = this.f39193u;
        if (v9 != null) {
            v9.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(d6.c.r(callback, this));
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(com.bumptech.glide.g.e(getContext(), i));
    }

    public void setEmojiCompatEnabled(boolean z3) {
        this.f39194v.d(z3);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f39194v.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C2712Ol c2712Ol = this.f39192n;
        if (c2712Ol != null) {
            c2712Ol.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C2712Ol c2712Ol = this.f39192n;
        if (c2712Ol != null) {
            c2712Ol.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        V v9 = this.f39193u;
        v9.l(colorStateList);
        v9.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        V v9 = this.f39193u;
        v9.m(mode);
        v9.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        V v9 = this.f39193u;
        if (v9 != null) {
            v9.g(context, i);
        }
    }
}
