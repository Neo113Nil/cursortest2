package com.gamericefishpro.space.n;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import com.gamericefishpro.space.i9.y3;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m extends AutoCompleteTextView {
    public static final int[] v = {R.attr.popupBackground};
    public final com.gamericefishpro.space.h2.w1 d;
    public final e0 e;
    public final com.gamericefishpro.space.u6.l i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.gamericefishpro.space.R.attr.autoCompleteTextViewStyle);
        v1.a(context);
        u1.a(this, getContext());
        com.gamericefishpro.space.a8.c cVarT = com.gamericefishpro.space.a8.c.t(getContext(), attributeSet, v, com.gamericefishpro.space.R.attr.autoCompleteTextViewStyle);
        if (((TypedArray) cVarT.i).hasValue(0)) {
            setDropDownBackgroundDrawable(cVarT.l(0));
        }
        cVarT.u();
        com.gamericefishpro.space.h2.w1 w1Var = new com.gamericefishpro.space.h2.w1(this);
        this.d = w1Var;
        w1Var.d(attributeSet, com.gamericefishpro.space.R.attr.autoCompleteTextViewStyle);
        e0 e0Var = new e0(this);
        this.e = e0Var;
        e0Var.d(attributeSet, com.gamericefishpro.space.R.attr.autoCompleteTextViewStyle);
        e0Var.b();
        com.gamericefishpro.space.u6.l lVar = new com.gamericefishpro.space.u6.l(this, 6);
        this.i = lVar;
        lVar.i(attributeSet, com.gamericefishpro.space.R.attr.autoCompleteTextViewStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean zIsFocusable = super.isFocusable();
        boolean zIsClickable = super.isClickable();
        boolean zIsLongClickable = super.isLongClickable();
        int inputType = super.getInputType();
        KeyListener keyListenerH = lVar.h(keyListener);
        if (keyListenerH == keyListener) {
            return;
        }
        super.setKeyListener(keyListenerH);
        super.setRawInputType(inputType);
        super.setFocusable(zIsFocusable);
        super.setClickable(zIsClickable);
        super.setLongClickable(zIsLongClickable);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        com.gamericefishpro.space.h2.w1 w1Var = this.d;
        if (w1Var != null) {
            w1Var.a();
        }
        e0 e0Var = this.e;
        if (e0Var != null) {
            e0Var.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        return customSelectionActionModeCallback instanceof com.gamericefishpro.space.h4.i ? ((com.gamericefishpro.space.h4.i) customSelectionActionModeCallback).a : customSelectionActionModeCallback;
    }

    public ColorStateList getSupportBackgroundTintList() {
        com.gamericefishpro.space.h2.w1 w1Var = this.d;
        if (w1Var != null) {
            return w1Var.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        com.gamericefishpro.space.h2.w1 w1Var = this.d;
        if (w1Var != null) {
            return w1Var.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        w1 w1Var = this.e.h;
        if (w1Var != null) {
            return w1Var.a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        w1 w1Var = this.e.h;
        if (w1Var != null) {
            return w1Var.b;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        y3.z(inputConnectionOnCreateInputConnection, editorInfo, this);
        return this.i.k(inputConnectionOnCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        com.gamericefishpro.space.h2.w1 w1Var = this.d;
        if (w1Var != null) {
            w1Var.f();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        com.gamericefishpro.space.h2.w1 w1Var = this.d;
        if (w1Var != null) {
            w1Var.g(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        e0 e0Var = this.e;
        if (e0Var != null) {
            e0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        e0 e0Var = this.e;
        if (e0Var != null) {
            e0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(com.gamericefishpro.space.i.a.T(callback, this));
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(com.gamericefishpro.space.u6.f.x(getContext(), i));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.i.p(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.i.h(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        com.gamericefishpro.space.h2.w1 w1Var = this.d;
        if (w1Var != null) {
            w1Var.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        com.gamericefishpro.space.h2.w1 w1Var = this.d;
        if (w1Var != null) {
            w1Var.j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        e0 e0Var = this.e;
        e0Var.i(colorStateList);
        e0Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        e0 e0Var = this.e;
        e0Var.j(mode);
        e0Var.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        e0 e0Var = this.e;
        if (e0Var != null) {
            e0Var.e(context, i);
        }
    }
}
