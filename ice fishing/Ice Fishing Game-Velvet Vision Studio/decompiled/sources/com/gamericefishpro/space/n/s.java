package com.gamericefishpro.space.n;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.TextUtils;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import android.widget.TextView;
import com.gamericefishpro.space.R;
import com.gamericefishpro.space.i9.y3;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class s extends EditText implements com.gamericefishpro.space.d4.q {
    public final com.gamericefishpro.space.h2.w1 d;
    public final e0 e;
    public final com.gamericefishpro.space.u6.s i;
    public final com.gamericefishpro.space.h4.j v;
    public final com.gamericefishpro.space.u6.l w;
    public r y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.editTextStyle);
        v1.a(context);
        u1.a(this, getContext());
        com.gamericefishpro.space.h2.w1 w1Var = new com.gamericefishpro.space.h2.w1(this);
        this.d = w1Var;
        w1Var.d(attributeSet, R.attr.editTextStyle);
        e0 e0Var = new e0(this);
        this.e = e0Var;
        e0Var.d(attributeSet, R.attr.editTextStyle);
        e0Var.b();
        com.gamericefishpro.space.u6.s sVar = new com.gamericefishpro.space.u6.s(6, false);
        sVar.e = this;
        this.i = sVar;
        this.v = new com.gamericefishpro.space.h4.j();
        com.gamericefishpro.space.u6.l lVar = new com.gamericefishpro.space.u6.l(this, 6);
        this.w = lVar;
        lVar.i(attributeSet, R.attr.editTextStyle);
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

    private r getSuperCaller() {
        if (this.y == null) {
            this.y = new r(this);
        }
        return this.y;
    }

    @Override // com.gamericefishpro.space.d4.q
    public final com.gamericefishpro.space.d4.f a(com.gamericefishpro.space.d4.f fVar) {
        this.v.getClass();
        return com.gamericefishpro.space.h4.j.a(this, fVar);
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

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        com.gamericefishpro.space.u6.s sVar;
        if (Build.VERSION.SDK_INT >= 28 || (sVar = this.i) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) sVar.i;
        return textClassifier == null ? y.a((TextView) sVar.e) : textClassifier;
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] strArrF;
        int i;
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.e.getClass();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 30 && inputConnectionOnCreateInputConnection != null) {
            CharSequence text = getText();
            if (i2 >= 30) {
                com.gamericefishpro.space.d4.i.g(editorInfo, text);
            } else {
                text.getClass();
                if (i2 >= 30) {
                    com.gamericefishpro.space.d4.i.g(editorInfo, text);
                } else {
                    int i3 = editorInfo.initialSelStart;
                    int i4 = editorInfo.initialSelEnd;
                    int i5 = i3 > i4 ? i4 : i3;
                    if (i3 <= i4) {
                        i3 = i4;
                    }
                    int length = text.length();
                    if (i5 < 0 || i3 > length || (i = editorInfo.inputType & 4095) == 129 || i == 225 || i == 18) {
                        y3.M(editorInfo, null, 0, 0);
                    } else if (length <= 2048) {
                        y3.M(editorInfo, text, i5, i3);
                    } else {
                        int i6 = i3 - i5;
                        int i7 = i6 > 1024 ? 0 : i6;
                        int i8 = 2048 - i7;
                        int iMin = Math.min(text.length() - i3, i8 - Math.min(i5, (int) (((double) i8) * 0.8d)));
                        int iMin2 = Math.min(i5, i8 - iMin);
                        int i9 = i5 - iMin2;
                        if (Character.isLowSurrogate(text.charAt(i9))) {
                            i9++;
                            iMin2--;
                        }
                        if (Character.isHighSurrogate(text.charAt((i3 + iMin) - 1))) {
                            iMin--;
                        }
                        int i10 = iMin2 + i7;
                        y3.M(editorInfo, i7 != i6 ? TextUtils.concat(text.subSequence(i9, i9 + iMin2), text.subSequence(i3, iMin + i3)) : text.subSequence(i9, i10 + iMin + i9), iMin2, i10);
                    }
                }
            }
        }
        y3.z(inputConnectionOnCreateInputConnection, editorInfo, this);
        if (inputConnectionOnCreateInputConnection != null && i2 <= 30 && (strArrF = com.gamericefishpro.space.d4.l0.f(this)) != null) {
            editorInfo.contentMimeTypes = strArrF;
            inputConnectionOnCreateInputConnection = new com.gamericefishpro.space.f4.a(inputConnectionOnCreateInputConnection, new com.gamericefishpro.space.a8.b(5, this));
        }
        return this.w.k(inputConnectionOnCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = Build.VERSION.SDK_INT;
        if (i < 30 || i >= 33) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        boolean zA = false;
        if (Build.VERSION.SDK_INT < 31 && dragEvent.getLocalState() == null && com.gamericefishpro.space.d4.l0.f(this) != null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                }
                if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (activity == null) {
                toString();
            } else if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3) {
                zA = x.a(dragEvent, this, activity);
            }
        }
        if (zA) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i) {
        com.gamericefishpro.space.d4.d dVar;
        com.gamericefishpro.space.d4.c cVar;
        int i2;
        com.gamericefishpro.space.vb.c cVar2;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 31 || com.gamericefishpro.space.d4.l0.f(this) == null || !(i == 16908322 || i == 16908337)) {
            return super.onTextContextMenuItem(i);
        }
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            if (i3 >= 31) {
                cVar2 = new com.gamericefishpro.space.vb.c(primaryClip, 1);
            } else {
                dVar = new com.gamericefishpro.space.d4.d();
                dVar.e = primaryClip;
                dVar.i = 1;
            }
            if (i == 16908322) {
                cVar = dVar;
                cVar = cVar2;
                i2 = 0;
            } else {
                cVar = dVar;
                cVar = cVar2;
                i2 = 1;
            }
            cVar.f(i2);
            com.gamericefishpro.space.d4.l0.h(this, cVar.build());
        }
        return true;
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

    public void setEmojiCompatEnabled(boolean z) {
        this.w.p(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.w.h(keyListener));
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

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        com.gamericefishpro.space.u6.s sVar;
        if (Build.VERSION.SDK_INT >= 28 || (sVar = this.i) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            sVar.i = textClassifier;
        }
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }
}
