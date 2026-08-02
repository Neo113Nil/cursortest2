package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.ToggleButton;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public class us0 extends ToggleButton {
    public final jq0 a;
    public final ls0 b;
    public lr0 c;

    public us0(@NonNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        gfs.a(getContext(), this);
        jq0 jq0Var = new jq0(this);
        this.a = jq0Var;
        jq0Var.d(attributeSet, i);
        ls0 ls0Var = new ls0(this);
        this.b = ls0Var;
        ls0Var.f(attributeSet, i);
        getEmojiTextViewHelper().b(attributeSet, i);
    }

    @NonNull
    private lr0 getEmojiTextViewHelper() {
        if (this.c == null) {
            this.c = new lr0(this);
        }
        return this.c;
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        jq0 jq0Var = this.a;
        if (jq0Var != null) {
            jq0Var.a();
        }
        ls0 ls0Var = this.b;
        if (ls0Var != null) {
            ls0Var.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        jq0 jq0Var = this.a;
        if (jq0Var != null) {
            return jq0Var.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        jq0 jq0Var = this.a;
        if (jq0Var != null) {
            return jq0Var.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.b.e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().c(z);
    }

    @Override // android.widget.ToggleButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        jq0 jq0Var = this.a;
        if (jq0Var != null) {
            jq0Var.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        jq0 jq0Var = this.a;
        if (jq0Var != null) {
            jq0Var.f(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        ls0 ls0Var = this.b;
        if (ls0Var != null) {
            ls0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        ls0 ls0Var = this.b;
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
        jq0 jq0Var = this.a;
        if (jq0Var != null) {
            jq0Var.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        jq0 jq0Var = this.a;
        if (jq0Var != null) {
            jq0Var.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        ls0 ls0Var = this.b;
        ls0Var.k(colorStateList);
        ls0Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        ls0 ls0Var = this.b;
        ls0Var.l(mode);
        ls0Var.b();
    }

    public us0(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.buttonStyleToggle);
    }

    public us0(@NonNull Context context) {
        this(context, null);
    }
}
