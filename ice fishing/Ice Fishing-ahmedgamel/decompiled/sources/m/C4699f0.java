package m;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.ToggleButton;
import com.google.android.gms.internal.ads.C2749Pl;

/* renamed from: m.f0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4699f0 extends ToggleButton {

    /* renamed from: n, reason: collision with root package name */
    public final C2749Pl f39212n;

    /* renamed from: u, reason: collision with root package name */
    public final V f39213u;

    /* renamed from: v, reason: collision with root package name */
    public C4729v f39214v;

    public C4699f0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.buttonStyleToggle);
        N0.a(getContext(), this);
        C2749Pl c2749Pl = new C2749Pl(this);
        this.f39212n = c2749Pl;
        c2749Pl.d(attributeSet, R.attr.buttonStyleToggle);
        V v9 = new V(this);
        this.f39213u = v9;
        v9.f(attributeSet, R.attr.buttonStyleToggle);
        getEmojiTextViewHelper().a(attributeSet, R.attr.buttonStyleToggle);
    }

    private C4729v getEmojiTextViewHelper() {
        if (this.f39214v == null) {
            this.f39214v = new C4729v(this);
        }
        return this.f39214v;
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C2749Pl c2749Pl = this.f39212n;
        if (c2749Pl != null) {
            c2749Pl.a();
        }
        V v9 = this.f39213u;
        if (v9 != null) {
            v9.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C2749Pl c2749Pl = this.f39212n;
        if (c2749Pl != null) {
            return c2749Pl.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C2749Pl c2749Pl = this.f39212n;
        if (c2749Pl != null) {
            return c2749Pl.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f39213u.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f39213u.e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z6) {
        super.setAllCaps(z6);
        getEmojiTextViewHelper().b(z6);
    }

    @Override // android.widget.ToggleButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C2749Pl c2749Pl = this.f39212n;
        if (c2749Pl != null) {
            c2749Pl.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C2749Pl c2749Pl = this.f39212n;
        if (c2749Pl != null) {
            c2749Pl.f(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        V v9 = this.f39213u;
        if (v9 != null) {
            v9.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        V v9 = this.f39213u;
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
        C2749Pl c2749Pl = this.f39212n;
        if (c2749Pl != null) {
            c2749Pl.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C2749Pl c2749Pl = this.f39212n;
        if (c2749Pl != null) {
            c2749Pl.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        V v9 = this.f39213u;
        v9.l(colorStateList);
        v9.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        V v9 = this.f39213u;
        v9.m(mode);
        v9.b();
    }
}
