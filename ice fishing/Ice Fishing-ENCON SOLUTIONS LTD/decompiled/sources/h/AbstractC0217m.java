package h;

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
import d.AbstractC0142a;

/* renamed from: h.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0217m extends AutoCompleteTextView {

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f3286c = {R.attr.popupBackground};

    /* renamed from: a, reason: collision with root package name */
    public final C0218n f3287a;

    /* renamed from: b, reason: collision with root package name */
    public final C0222s f3288b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC0217m(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.watchfacestudio.spraktum.R.attr.autoCompleteTextViewStyle);
        g0.a(context);
        I0.b H2 = I0.b.H(getContext(), attributeSet, f3286c, com.watchfacestudio.spraktum.R.attr.autoCompleteTextViewStyle);
        if (((TypedArray) H2.f722c).hasValue(0)) {
            setDropDownBackgroundDrawable(H2.A(0));
        }
        H2.K();
        C0218n c0218n = new C0218n(this);
        this.f3287a = c0218n;
        c0218n.b(attributeSet, com.watchfacestudio.spraktum.R.attr.autoCompleteTextViewStyle);
        C0222s c0222s = new C0222s(this);
        this.f3288b = c0222s;
        c0222s.d(attributeSet, com.watchfacestudio.spraktum.R.attr.autoCompleteTextViewStyle);
        c0222s.b();
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0218n c0218n = this.f3287a;
        if (c0218n != null) {
            c0218n.a();
        }
        C0222s c0222s = this.f3288b;
        if (c0222s != null) {
            c0222s.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        J1.h hVar;
        C0218n c0218n = this.f3287a;
        if (c0218n == null || (hVar = c0218n.f3295e) == null) {
            return null;
        }
        return (ColorStateList) hVar.f868c;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        J1.h hVar;
        C0218n c0218n = this.f3287a;
        if (c0218n == null || (hVar = c0218n.f3295e) == null) {
            return null;
        }
        return (PorterDuff.Mode) hVar.f869d;
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
        C0218n c0218n = this.f3287a;
        if (c0218n != null) {
            c0218n.f3293c = -1;
            c0218n.d(null);
            c0218n.a();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        C0218n c0218n = this.f3287a;
        if (c0218n != null) {
            c0218n.c(i2);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(R1.l.I(callback, this));
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i2) {
        setDropDownBackgroundDrawable(AbstractC0142a.a(getContext(), i2));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0218n c0218n = this.f3287a;
        if (c0218n != null) {
            c0218n.e(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0218n c0218n = this.f3287a;
        if (c0218n != null) {
            c0218n.f(mode);
        }
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        C0222s c0222s = this.f3288b;
        if (c0222s != null) {
            c0222s.e(context, i2);
        }
    }
}
