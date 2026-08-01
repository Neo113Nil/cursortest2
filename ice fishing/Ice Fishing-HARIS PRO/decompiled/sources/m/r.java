package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;
import k0.C0188b;
import l0.C0233d;

/* loaded from: classes.dex */
public class r extends CheckBox implements R.l {

    /* renamed from: a, reason: collision with root package name */
    public final C0233d f4002a;

    /* renamed from: b, reason: collision with root package name */
    public final C0188b f4003b;

    /* renamed from: c, reason: collision with root package name */
    public final X f4004c;

    /* renamed from: d, reason: collision with root package name */
    public C0287x f4005d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        R0.a(context);
        Q0.a(this, getContext());
        C0233d c0233d = new C0233d(this);
        this.f4002a = c0233d;
        c0233d.e(attributeSet, i);
        C0188b c0188b = new C0188b(this);
        this.f4003b = c0188b;
        c0188b.k(attributeSet, i);
        X x2 = new X(this);
        this.f4004c = x2;
        x2.f(attributeSet, i);
        getEmojiTextViewHelper().a(attributeSet, i);
    }

    private C0287x getEmojiTextViewHelper() {
        if (this.f4005d == null) {
            this.f4005d = new C0287x(this);
        }
        return this.f4005d;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0188b c0188b = this.f4003b;
        if (c0188b != null) {
            c0188b.a();
        }
        X x2 = this.f4004c;
        if (x2 != null) {
            x2.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0188b c0188b = this.f4003b;
        if (c0188b != null) {
            return c0188b.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0188b c0188b = this.f4003b;
        if (c0188b != null) {
            return c0188b.i();
        }
        return null;
    }

    @Override // R.l
    public ColorStateList getSupportButtonTintList() {
        C0233d c0233d = this.f4002a;
        if (c0233d != null) {
            return (ColorStateList) c0233d.e;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        C0233d c0233d = this.f4002a;
        if (c0233d != null) {
            return (PorterDuff.Mode) c0233d.f3785f;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f4004c.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f4004c.e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z2) {
        super.setAllCaps(z2);
        getEmojiTextViewHelper().b(z2);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0188b c0188b = this.f4003b;
        if (c0188b != null) {
            c0188b.m();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0188b c0188b = this.f4003b;
        if (c0188b != null) {
            c0188b.n(i);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C0233d c0233d = this.f4002a;
        if (c0233d != null) {
            if (c0233d.f3783c) {
                c0233d.f3783c = false;
            } else {
                c0233d.f3783c = true;
                c0233d.a();
            }
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        X x2 = this.f4004c;
        if (x2 != null) {
            x2.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        X x2 = this.f4004c;
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
        C0188b c0188b = this.f4003b;
        if (c0188b != null) {
            c0188b.s(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0188b c0188b = this.f4003b;
        if (c0188b != null) {
            c0188b.t(mode);
        }
    }

    @Override // R.l
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        C0233d c0233d = this.f4002a;
        if (c0233d != null) {
            c0233d.e = colorStateList;
            c0233d.f3781a = true;
            c0233d.a();
        }
    }

    @Override // R.l
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        C0233d c0233d = this.f4002a;
        if (c0233d != null) {
            c0233d.f3785f = mode;
            c0233d.f3782b = true;
            c0233d.a();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        X x2 = this.f4004c;
        x2.l(colorStateList);
        x2.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        X x2 = this.f4004c;
        x2.m(mode);
        x2.b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(h0.f.n(getContext(), i));
    }
}
