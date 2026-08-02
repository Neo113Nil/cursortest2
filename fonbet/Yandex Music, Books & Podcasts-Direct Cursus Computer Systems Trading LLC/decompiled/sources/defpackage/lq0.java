package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;
import androidx.annotation.NonNull;
import ru.yandex.music.R;

/* loaded from: classes.dex */
public class lq0 extends CheckBox implements ujs {
    public final nq0 a;
    public final jq0 b;
    public final ls0 c;
    public lr0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lq0(@NonNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        sjs.a(context);
        gfs.a(getContext(), this);
        nq0 nq0Var = new nq0(this);
        this.a = nq0Var;
        nq0Var.f(attributeSet, i);
        jq0 jq0Var = new jq0(this);
        this.b = jq0Var;
        jq0Var.d(attributeSet, i);
        ls0 ls0Var = new ls0(this);
        this.c = ls0Var;
        ls0Var.f(attributeSet, i);
        getEmojiTextViewHelper().b(attributeSet, i);
    }

    @NonNull
    private lr0 getEmojiTextViewHelper() {
        if (this.d == null) {
            this.d = new lr0(this);
        }
        return this.d;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        jq0 jq0Var = this.b;
        if (jq0Var != null) {
            jq0Var.a();
        }
        ls0 ls0Var = this.c;
        if (ls0Var != null) {
            ls0Var.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        jq0 jq0Var = this.b;
        if (jq0Var != null) {
            return jq0Var.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        jq0 jq0Var = this.b;
        if (jq0Var != null) {
            return jq0Var.c();
        }
        return null;
    }

    @Override // defpackage.ujs
    public ColorStateList getSupportButtonTintList() {
        nq0 nq0Var = this.a;
        if (nq0Var != null) {
            return (ColorStateList) nq0Var.a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        nq0 nq0Var = this.a;
        if (nq0Var != null) {
            return (PorterDuff.Mode) nq0Var.b;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.c.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.c.e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().c(z);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        jq0 jq0Var = this.b;
        if (jq0Var != null) {
            jq0Var.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        jq0 jq0Var = this.b;
        if (jq0Var != null) {
            jq0Var.f(i);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        nq0 nq0Var = this.a;
        if (nq0Var != null) {
            if (nq0Var.e) {
                nq0Var.e = false;
            } else {
                nq0Var.e = true;
                nq0Var.a();
            }
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        ls0 ls0Var = this.c;
        if (ls0Var != null) {
            ls0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        ls0 ls0Var = this.c;
        if (ls0Var != null) {
            ls0Var.b();
        }
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().d(z);
    }

    @Override // android.widget.TextView
    public void setFilters(@NonNull InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        jq0 jq0Var = this.b;
        if (jq0Var != null) {
            jq0Var.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        jq0 jq0Var = this.b;
        if (jq0Var != null) {
            jq0Var.i(mode);
        }
    }

    @Override // defpackage.ujs
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        nq0 nq0Var = this.a;
        if (nq0Var != null) {
            nq0Var.a = colorStateList;
            nq0Var.c = true;
            nq0Var.a();
        }
    }

    @Override // defpackage.ujs
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        nq0 nq0Var = this.a;
        if (nq0Var != null) {
            nq0Var.b = mode;
            nq0Var.d = true;
            nq0Var.a();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        ls0 ls0Var = this.c;
        ls0Var.k(colorStateList);
        ls0Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        ls0 ls0Var = this.c;
        ls0Var.l(mode);
        ls0Var.b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(y2x.w(getContext(), i));
    }

    public lq0(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.checkboxStyle);
    }

    public lq0(@NonNull Context context) {
        this(context, null);
    }
}
