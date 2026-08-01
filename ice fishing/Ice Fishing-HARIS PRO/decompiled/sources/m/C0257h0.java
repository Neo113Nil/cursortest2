package m;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.ToggleButton;
import k0.C0188b;

/* renamed from: m.h0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0257h0 extends ToggleButton {

    /* renamed from: a, reason: collision with root package name */
    public final C0188b f3949a;

    /* renamed from: b, reason: collision with root package name */
    public final X f3950b;

    /* renamed from: c, reason: collision with root package name */
    public C0287x f3951c;

    public C0257h0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.buttonStyleToggle);
        Q0.a(this, getContext());
        C0188b c0188b = new C0188b(this);
        this.f3949a = c0188b;
        c0188b.k(attributeSet, R.attr.buttonStyleToggle);
        X x2 = new X(this);
        this.f3950b = x2;
        x2.f(attributeSet, R.attr.buttonStyleToggle);
        getEmojiTextViewHelper().a(attributeSet, R.attr.buttonStyleToggle);
    }

    private C0287x getEmojiTextViewHelper() {
        if (this.f3951c == null) {
            this.f3951c = new C0287x(this);
        }
        return this.f3951c;
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0188b c0188b = this.f3949a;
        if (c0188b != null) {
            c0188b.a();
        }
        X x2 = this.f3950b;
        if (x2 != null) {
            x2.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0188b c0188b = this.f3949a;
        if (c0188b != null) {
            return c0188b.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0188b c0188b = this.f3949a;
        if (c0188b != null) {
            return c0188b.i();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f3950b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f3950b.e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z2) {
        super.setAllCaps(z2);
        getEmojiTextViewHelper().b(z2);
    }

    @Override // android.widget.ToggleButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0188b c0188b = this.f3949a;
        if (c0188b != null) {
            c0188b.m();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0188b c0188b = this.f3949a;
        if (c0188b != null) {
            c0188b.n(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        X x2 = this.f3950b;
        if (x2 != null) {
            x2.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        X x2 = this.f3950b;
        if (x2 != null) {
            x2.b();
        }
    }

    public void setEmojiCompatEnabled(boolean z2) {
        getEmojiTextViewHelper().c(z2);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((R.j) getEmojiTextViewHelper().f4055b.f10b).z(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0188b c0188b = this.f3949a;
        if (c0188b != null) {
            c0188b.s(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0188b c0188b = this.f3949a;
        if (c0188b != null) {
            c0188b.t(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        X x2 = this.f3950b;
        x2.l(colorStateList);
        x2.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        X x2 = this.f3950b;
        x2.m(mode);
        x2.b();
    }
}
