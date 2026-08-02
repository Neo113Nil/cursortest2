package defpackage;

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
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import ru.yandex.music.R;

/* loaded from: classes.dex */
public class kr0 extends EditText implements pqj {
    public final jq0 a;
    public final ls0 b;
    public final pt0 c;
    public final pes d;
    public final yfx e;
    public jr0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kr0(@NonNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        sjs.a(context);
        gfs.a(getContext(), this);
        jq0 jq0Var = new jq0(this);
        this.a = jq0Var;
        jq0Var.d(attributeSet, i);
        ls0 ls0Var = new ls0(this);
        this.b = ls0Var;
        ls0Var.f(attributeSet, i);
        ls0Var.b();
        pt0 pt0Var = new pt0();
        pt0Var.a = this;
        this.c = pt0Var;
        this.d = new pes();
        yfx yfxVar = new yfx((EditText) this);
        this.e = yfxVar;
        yfxVar.q(attributeSet, i);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean isFocusable = super.isFocusable();
        boolean isClickable = super.isClickable();
        boolean isLongClickable = super.isLongClickable();
        int inputType = super.getInputType();
        KeyListener n = yfxVar.n(keyListener);
        if (n == keyListener) {
            return;
        }
        super.setKeyListener(n);
        super.setRawInputType(inputType);
        super.setFocusable(isFocusable);
        super.setClickable(isClickable);
        super.setLongClickable(isLongClickable);
    }

    @NonNull
    private jr0 getSuperCaller() {
        if (this.f == null) {
            this.f = new jr0(this);
        }
        return this.f;
    }

    @Override // defpackage.pqj
    public final jc6 b(jc6 jc6Var) {
        this.d.getClass();
        return pes.a(this, jc6Var);
    }

    @Override // android.widget.TextView, android.view.View
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

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return asq.W(super.getCustomSelectionActionModeCallback());
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

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }

    @Override // android.widget.TextView
    @NonNull
    public TextClassifier getTextClassifier() {
        pt0 pt0Var;
        if (Build.VERSION.SDK_INT >= 28 || (pt0Var = this.c) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) pt0Var.b;
        return textClassifier == null ? fs0.a((TextView) pt0Var.a) : textClassifier;
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] i;
        InputConnection i79Var;
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.b.getClass();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 30 && onCreateInputConnection != null) {
            l1b.l(editorInfo, getText());
        }
        u2x.N(editorInfo, onCreateInputConnection, this);
        if (onCreateInputConnection != null && i2 <= 30 && (i = wdu.i(this)) != null) {
            l1b.k(editorInfo, i);
            g3a g3aVar = new g3a(26, this);
            if (i2 >= 25) {
                i79Var = new bne(onCreateInputConnection, g3aVar);
            } else if (l1b.e(editorInfo).length != 0) {
                i79Var = new i79(onCreateInputConnection, g3aVar);
            }
            onCreateInputConnection = i79Var;
        }
        return this.e.v(onCreateInputConnection, editorInfo);
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
        boolean z = false;
        if (Build.VERSION.SDK_INT < 31 && dragEvent.getLocalState() == null && wdu.i(this) != null) {
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
                Log.i("ReceiveContent", "Can't handle drop: no activity: view=" + this);
            } else if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3) {
                z = rr0.a(dragEvent, this, activity);
            }
        }
        if (z) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i) {
        gc6 gc6Var;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31 || wdu.i(this) == null || !(i == 16908322 || i == 16908337)) {
            return super.onTextContextMenuItem(i);
        }
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            if (i2 >= 31) {
                gc6Var = new fc6(primaryClip, 1);
            } else {
                hc6 hc6Var = new hc6();
                hc6Var.b = primaryClip;
                hc6Var.c = 1;
                gc6Var = hc6Var;
            }
            gc6Var.b(i == 16908322 ? 0 : 1);
            wdu.m(this, gc6Var.build());
        }
        return true;
    }

    @Override // android.view.View
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

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(asq.Z(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.e.x(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.e.n(keyListener));
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

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        ls0 ls0Var = this.b;
        if (ls0Var != null) {
            ls0Var.g(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        pt0 pt0Var;
        if (Build.VERSION.SDK_INT >= 28 || (pt0Var = this.c) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            pt0Var.b = textClassifier;
        }
    }

    public kr0(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.editTextStyle);
    }

    public kr0(@NonNull Context context) {
        this(context, null);
    }
}
