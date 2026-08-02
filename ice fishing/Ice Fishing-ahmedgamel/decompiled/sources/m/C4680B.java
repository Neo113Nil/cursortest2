package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.RadioButton;
import com.IceFishing.LiveIceFishing.C5248R;
import com.google.android.gms.internal.ads.C2749Pl;

/* renamed from: m.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4680B extends RadioButton implements U.s {

    /* renamed from: n, reason: collision with root package name */
    public final f8.j f39030n;

    /* renamed from: u, reason: collision with root package name */
    public final C2749Pl f39031u;

    /* renamed from: v, reason: collision with root package name */
    public final V f39032v;

    /* renamed from: w, reason: collision with root package name */
    public C4729v f39033w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4680B(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, C5248R.attr.radioButtonStyle);
        O0.a(context);
        N0.a(getContext(), this);
        f8.j jVar = new f8.j(this, 2);
        this.f39030n = jVar;
        jVar.c(attributeSet, C5248R.attr.radioButtonStyle);
        C2749Pl c2749Pl = new C2749Pl(this);
        this.f39031u = c2749Pl;
        c2749Pl.d(attributeSet, C5248R.attr.radioButtonStyle);
        V v9 = new V(this);
        this.f39032v = v9;
        v9.f(attributeSet, C5248R.attr.radioButtonStyle);
        getEmojiTextViewHelper().a(attributeSet, C5248R.attr.radioButtonStyle);
    }

    private C4729v getEmojiTextViewHelper() {
        if (this.f39033w == null) {
            this.f39033w = new C4729v(this);
        }
        return this.f39033w;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C2749Pl c2749Pl = this.f39031u;
        if (c2749Pl != null) {
            c2749Pl.a();
        }
        V v9 = this.f39032v;
        if (v9 != null) {
            v9.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C2749Pl c2749Pl = this.f39031u;
        if (c2749Pl != null) {
            return c2749Pl.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C2749Pl c2749Pl = this.f39031u;
        if (c2749Pl != null) {
            return c2749Pl.c();
        }
        return null;
    }

    @Override // U.s
    public ColorStateList getSupportButtonTintList() {
        f8.j jVar = this.f39030n;
        if (jVar != null) {
            return (ColorStateList) jVar.f37522f;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        f8.j jVar = this.f39030n;
        if (jVar != null) {
            return (PorterDuff.Mode) jVar.f37523g;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f39032v.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f39032v.e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z6) {
        super.setAllCaps(z6);
        getEmojiTextViewHelper().b(z6);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C2749Pl c2749Pl = this.f39031u;
        if (c2749Pl != null) {
            c2749Pl.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C2749Pl c2749Pl = this.f39031u;
        if (c2749Pl != null) {
            c2749Pl.f(i);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        f8.j jVar = this.f39030n;
        if (jVar != null) {
            if (jVar.f37520d) {
                jVar.f37520d = false;
            } else {
                jVar.f37520d = true;
                jVar.a();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        V v9 = this.f39032v;
        if (v9 != null) {
            v9.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        V v9 = this.f39032v;
        if (v9 != null) {
            v9.b();
        }
    }

    public void setEmojiCompatEnabled(boolean z6) {
        getEmojiTextViewHelper().c(z6);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((com.bumptech.glide.d) getEmojiTextViewHelper().f39325b.f1291u).s(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C2749Pl c2749Pl = this.f39031u;
        if (c2749Pl != null) {
            c2749Pl.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C2749Pl c2749Pl = this.f39031u;
        if (c2749Pl != null) {
            c2749Pl.i(mode);
        }
    }

    @Override // U.s
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        f8.j jVar = this.f39030n;
        if (jVar != null) {
            jVar.f37522f = colorStateList;
            jVar.f37518b = true;
            jVar.a();
        }
    }

    @Override // U.s
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        f8.j jVar = this.f39030n;
        if (jVar != null) {
            jVar.f37523g = mode;
            jVar.f37519c = true;
            jVar.a();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        V v9 = this.f39032v;
        v9.l(colorStateList);
        v9.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        V v9 = this.f39032v;
        v9.m(mode);
        v9.b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(com.bumptech.glide.g.h(getContext(), i));
    }
}
