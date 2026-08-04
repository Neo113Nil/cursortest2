package com.gamericefishpro.space.n;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;
import com.gamericefishpro.space.R;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class o extends CheckBox {
    public final p d;
    public final com.gamericefishpro.space.h2.w1 e;
    public final e0 i;
    public t v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(Context context, AttributeSet attributeSet) {
        int resourceId;
        int resourceId2;
        super(context, attributeSet, R.attr.chipStyle);
        v1.a(context);
        u1.a(this, getContext());
        this.d = new p(this);
        Context context2 = getContext();
        int[] iArr = com.gamericefishpro.space.j.a.j;
        com.gamericefishpro.space.a8.c cVarT = com.gamericefishpro.space.a8.c.t(context2, attributeSet, iArr, R.attr.chipStyle);
        TypedArray typedArray = (TypedArray) cVarT.i;
        com.gamericefishpro.space.d4.l0.k(this, getContext(), iArr, attributeSet, (TypedArray) cVarT.i, R.attr.chipStyle);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    setButtonDrawable(com.gamericefishpro.space.u6.f.x(getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                    if (typedArray.hasValue(0)) {
                        setButtonDrawable(com.gamericefishpro.space.u6.f.x(getContext(), resourceId));
                    }
                }
            } else if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                setButtonDrawable(com.gamericefishpro.space.u6.f.x(getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
                setButtonTintList(cVarT.k(2));
            }
            if (typedArray.hasValue(3)) {
                setButtonTintMode(q0.b(typedArray.getInt(3, -1), null));
            }
            cVarT.u();
            com.gamericefishpro.space.h2.w1 w1Var = new com.gamericefishpro.space.h2.w1(this);
            this.e = w1Var;
            w1Var.d(attributeSet, R.attr.chipStyle);
            e0 e0Var = new e0(this);
            this.i = e0Var;
            e0Var.d(attributeSet, R.attr.chipStyle);
            getEmojiTextViewHelper().a(attributeSet, R.attr.chipStyle);
        } catch (Throwable th) {
            cVarT.u();
            throw th;
        }
    }

    private t getEmojiTextViewHelper() {
        if (this.v == null) {
            this.v = new t(this);
        }
        return this.v;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        com.gamericefishpro.space.h2.w1 w1Var = this.e;
        if (w1Var != null) {
            w1Var.a();
        }
        e0 e0Var = this.i;
        if (e0Var != null) {
            e0Var.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        com.gamericefishpro.space.h2.w1 w1Var = this.e;
        if (w1Var != null) {
            return w1Var.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        com.gamericefishpro.space.h2.w1 w1Var = this.e;
        if (w1Var != null) {
            return w1Var.c();
        }
        return null;
    }

    public ColorStateList getSupportButtonTintList() {
        p pVar = this.d;
        if (pVar != null) {
            return (ColorStateList) pVar.e;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        p pVar = this.d;
        if (pVar != null) {
            return (PorterDuff.Mode) pVar.f;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        w1 w1Var = this.i.h;
        if (w1Var != null) {
            return w1Var.a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        w1 w1Var = this.i.h;
        if (w1Var != null) {
            return w1Var.b;
        }
        return null;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        ((com.gamericefishpro.space.d9.h) getEmojiTextViewHelper().b.e).L(z);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        com.gamericefishpro.space.h2.w1 w1Var = this.e;
        if (w1Var != null) {
            w1Var.f();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        com.gamericefishpro.space.h2.w1 w1Var = this.e;
        if (w1Var != null) {
            w1Var.g(i);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        p pVar = this.d;
        if (pVar != null) {
            if (pVar.c) {
                pVar.c = false;
            } else {
                pVar.c = true;
                pVar.a();
            }
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        e0 e0Var = this.i;
        if (e0Var != null) {
            e0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        e0 e0Var = this.i;
        if (e0Var != null) {
            e0Var.b();
        }
    }

    public void setEmojiCompatEnabled(boolean z) {
        ((com.gamericefishpro.space.d9.h) getEmojiTextViewHelper().b.e).M(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((com.gamericefishpro.space.d9.h) getEmojiTextViewHelper().b.e).z(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        com.gamericefishpro.space.h2.w1 w1Var = this.e;
        if (w1Var != null) {
            w1Var.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        com.gamericefishpro.space.h2.w1 w1Var = this.e;
        if (w1Var != null) {
            w1Var.j(mode);
        }
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        p pVar = this.d;
        if (pVar != null) {
            pVar.e = colorStateList;
            pVar.a = true;
            pVar.a();
        }
    }

    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        p pVar = this.d;
        if (pVar != null) {
            pVar.f = mode;
            pVar.b = true;
            pVar.a();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        e0 e0Var = this.i;
        e0Var.i(colorStateList);
        e0Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        e0 e0Var = this.i;
        e0Var.j(mode);
        e0Var.b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(com.gamericefishpro.space.u6.f.x(getContext(), i));
    }
}
