package m;

import a.AbstractC0422a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;
import com.google.android.gms.internal.ads.C2712Ol;

/* renamed from: m.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4707q extends CheckBox implements U.s {

    /* renamed from: n, reason: collision with root package name */
    public final f8.j f39211n;

    /* renamed from: u, reason: collision with root package name */
    public final C2712Ol f39212u;

    /* renamed from: v, reason: collision with root package name */
    public final V f39213v;

    /* renamed from: w, reason: collision with root package name */
    public C4716v f39214w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4707q(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        O0.a(context);
        N0.a(getContext(), this);
        f8.j jVar = new f8.j(this, 2);
        this.f39211n = jVar;
        jVar.c(attributeSet, i);
        C2712Ol c2712Ol = new C2712Ol(this);
        this.f39212u = c2712Ol;
        c2712Ol.d(attributeSet, i);
        V v9 = new V(this);
        this.f39213v = v9;
        v9.f(attributeSet, i);
        getEmojiTextViewHelper().a(attributeSet, i);
    }

    private C4716v getEmojiTextViewHelper() {
        if (this.f39214w == null) {
            this.f39214w = new C4716v(this);
        }
        return this.f39214w;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C2712Ol c2712Ol = this.f39212u;
        if (c2712Ol != null) {
            c2712Ol.a();
        }
        V v9 = this.f39213v;
        if (v9 != null) {
            v9.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C2712Ol c2712Ol = this.f39212u;
        if (c2712Ol != null) {
            return c2712Ol.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C2712Ol c2712Ol = this.f39212u;
        if (c2712Ol != null) {
            return c2712Ol.c();
        }
        return null;
    }

    @Override // U.s
    public ColorStateList getSupportButtonTintList() {
        f8.j jVar = this.f39211n;
        if (jVar != null) {
            return (ColorStateList) jVar.f37560f;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        f8.j jVar = this.f39211n;
        if (jVar != null) {
            return (PorterDuff.Mode) jVar.f37561g;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f39213v.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f39213v.e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z3) {
        super.setAllCaps(z3);
        getEmojiTextViewHelper().b(z3);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C2712Ol c2712Ol = this.f39212u;
        if (c2712Ol != null) {
            c2712Ol.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C2712Ol c2712Ol = this.f39212u;
        if (c2712Ol != null) {
            c2712Ol.f(i);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        f8.j jVar = this.f39211n;
        if (jVar != null) {
            if (jVar.f37558d) {
                jVar.f37558d = false;
            } else {
                jVar.f37558d = true;
                jVar.a();
            }
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        V v9 = this.f39213v;
        if (v9 != null) {
            v9.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        V v9 = this.f39213v;
        if (v9 != null) {
            v9.b();
        }
    }

    public void setEmojiCompatEnabled(boolean z3) {
        getEmojiTextViewHelper().c(z3);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((AbstractC0422a) getEmojiTextViewHelper().f39256b.f37625u).m(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C2712Ol c2712Ol = this.f39212u;
        if (c2712Ol != null) {
            c2712Ol.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C2712Ol c2712Ol = this.f39212u;
        if (c2712Ol != null) {
            c2712Ol.i(mode);
        }
    }

    @Override // U.s
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        f8.j jVar = this.f39211n;
        if (jVar != null) {
            jVar.f37560f = colorStateList;
            jVar.f37556b = true;
            jVar.a();
        }
    }

    @Override // U.s
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        f8.j jVar = this.f39211n;
        if (jVar != null) {
            jVar.f37561g = mode;
            jVar.f37557c = true;
            jVar.a();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        V v9 = this.f39213v;
        v9.l(colorStateList);
        v9.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        V v9 = this.f39213v;
        v9.m(mode);
        v9.b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(com.bumptech.glide.g.e(getContext(), i));
    }
}
