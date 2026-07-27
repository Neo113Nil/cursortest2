package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.RadioButton;
import com.google.android.gms.internal.ads.C2728Pl;
import com.icefishing.icefishingliveapp.C5284R;

/* renamed from: m.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4715B extends RadioButton implements U.s {

    /* renamed from: n, reason: collision with root package name */
    public final b8.j f39229n;

    /* renamed from: u, reason: collision with root package name */
    public final C2728Pl f39230u;

    /* renamed from: v, reason: collision with root package name */
    public final V f39231v;

    /* renamed from: w, reason: collision with root package name */
    public C4764v f39232w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4715B(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, C5284R.attr.radioButtonStyle);
        O0.a(context);
        N0.a(getContext(), this);
        b8.j jVar = new b8.j(this, 2);
        this.f39229n = jVar;
        jVar.c(attributeSet, C5284R.attr.radioButtonStyle);
        C2728Pl c2728Pl = new C2728Pl(this);
        this.f39230u = c2728Pl;
        c2728Pl.d(attributeSet, C5284R.attr.radioButtonStyle);
        V v6 = new V(this);
        this.f39231v = v6;
        v6.f(attributeSet, C5284R.attr.radioButtonStyle);
        getEmojiTextViewHelper().a(attributeSet, C5284R.attr.radioButtonStyle);
    }

    private C4764v getEmojiTextViewHelper() {
        if (this.f39232w == null) {
            this.f39232w = new C4764v(this);
        }
        return this.f39232w;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C2728Pl c2728Pl = this.f39230u;
        if (c2728Pl != null) {
            c2728Pl.a();
        }
        V v6 = this.f39231v;
        if (v6 != null) {
            v6.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C2728Pl c2728Pl = this.f39230u;
        if (c2728Pl != null) {
            return c2728Pl.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C2728Pl c2728Pl = this.f39230u;
        if (c2728Pl != null) {
            return c2728Pl.c();
        }
        return null;
    }

    @Override // U.s
    public ColorStateList getSupportButtonTintList() {
        b8.j jVar = this.f39229n;
        if (jVar != null) {
            return (ColorStateList) jVar.f5604f;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        b8.j jVar = this.f39229n;
        if (jVar != null) {
            return (PorterDuff.Mode) jVar.f5605g;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f39231v.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f39231v.e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z8) {
        super.setAllCaps(z8);
        getEmojiTextViewHelper().b(z8);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C2728Pl c2728Pl = this.f39230u;
        if (c2728Pl != null) {
            c2728Pl.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C2728Pl c2728Pl = this.f39230u;
        if (c2728Pl != null) {
            c2728Pl.f(i);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        b8.j jVar = this.f39229n;
        if (jVar != null) {
            if (jVar.f5602d) {
                jVar.f5602d = false;
            } else {
                jVar.f5602d = true;
                jVar.a();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        V v6 = this.f39231v;
        if (v6 != null) {
            v6.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        V v6 = this.f39231v;
        if (v6 != null) {
            v6.b();
        }
    }

    public void setEmojiCompatEnabled(boolean z8) {
        getEmojiTextViewHelper().c(z8);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((w8.a) getEmojiTextViewHelper().f39527b.f1233u).e(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C2728Pl c2728Pl = this.f39230u;
        if (c2728Pl != null) {
            c2728Pl.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C2728Pl c2728Pl = this.f39230u;
        if (c2728Pl != null) {
            c2728Pl.i(mode);
        }
    }

    @Override // U.s
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        b8.j jVar = this.f39229n;
        if (jVar != null) {
            jVar.f5604f = colorStateList;
            jVar.f5600b = true;
            jVar.a();
        }
    }

    @Override // U.s
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        b8.j jVar = this.f39229n;
        if (jVar != null) {
            jVar.f5605g = mode;
            jVar.f5601c = true;
            jVar.a();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        V v6 = this.f39231v;
        v6.l(colorStateList);
        v6.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        V v6 = this.f39231v;
        v6.m(mode);
        v6.b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(com.bumptech.glide.f.h(getContext(), i));
    }
}
