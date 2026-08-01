package m;

import O.C0028d;
import O.C0030f;
import O.InterfaceC0027c;
import O.InterfaceC0040p;
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
import com.lumenpath.harispro.hrnavigator.R;
import k0.C0188b;

/* renamed from: m.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0285w extends EditText implements InterfaceC0040p {

    /* renamed from: a, reason: collision with root package name */
    public final C0188b f4037a;

    /* renamed from: b, reason: collision with root package name */
    public final X f4038b;

    /* renamed from: c, reason: collision with root package name */
    public final C0237C f4039c;

    /* renamed from: d, reason: collision with root package name */
    public final R.k f4040d;
    public final C0237C e;

    /* renamed from: f, reason: collision with root package name */
    public C0283v f4041f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0285w(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.editTextStyle);
        R0.a(context);
        Q0.a(this, getContext());
        C0188b c0188b = new C0188b(this);
        this.f4037a = c0188b;
        c0188b.k(attributeSet, R.attr.editTextStyle);
        X x2 = new X(this);
        this.f4038b = x2;
        x2.f(attributeSet, R.attr.editTextStyle);
        x2.b();
        C0237C c0237c = new C0237C();
        c0237c.f3795b = this;
        this.f4039c = c0237c;
        this.f4040d = new R.k();
        C0237C c0237c2 = new C0237C(this);
        this.e = c0237c2;
        c0237c2.b(attributeSet, R.attr.editTextStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean isFocusable = super.isFocusable();
        boolean isClickable = super.isClickable();
        boolean isLongClickable = super.isLongClickable();
        int inputType = super.getInputType();
        KeyListener a2 = c0237c2.a(keyListener);
        if (a2 == keyListener) {
            return;
        }
        super.setKeyListener(a2);
        super.setRawInputType(inputType);
        super.setFocusable(isFocusable);
        super.setClickable(isClickable);
        super.setLongClickable(isLongClickable);
    }

    private C0283v getSuperCaller() {
        if (this.f4041f == null) {
            this.f4041f = new C0283v(this);
        }
        return this.f4041f;
    }

    @Override // O.InterfaceC0040p
    public final C0030f a(C0030f c0030f) {
        this.f4040d.getClass();
        return R.k.a(this, c0030f);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0188b c0188b = this.f4037a;
        if (c0188b != null) {
            c0188b.a();
        }
        X x2 = this.f4038b;
        if (x2 != null) {
            x2.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        return customSelectionActionModeCallback instanceof R.i ? ((R.i) customSelectionActionModeCallback).f1005a : customSelectionActionModeCallback;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0188b c0188b = this.f4037a;
        if (c0188b != null) {
            return c0188b.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0188b c0188b = this.f4037a;
        if (c0188b != null) {
            return c0188b.i();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f4038b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f4038b.e();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C0237C c0237c;
        if (Build.VERSION.SDK_INT >= 28 || (c0237c = this.f4039c) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) c0237c.f3796c;
        return textClassifier == null ? S.a((TextView) c0237c.f3795b) : textClassifier;
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] f2;
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f4038b.getClass();
        X.h(editorInfo, onCreateInputConnection, this);
        h0.f.u(editorInfo, onCreateInputConnection, this);
        if (onCreateInputConnection != null && Build.VERSION.SDK_INT <= 30 && (f2 = O.K.f(this)) != null) {
            editorInfo.contentMimeTypes = f2;
            onCreateInputConnection = new Q.b(onCreateInputConnection, new Q.a(this));
        }
        return this.e.c(onCreateInputConnection, editorInfo);
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
        boolean z2 = false;
        if (Build.VERSION.SDK_INT < 31 && dragEvent.getLocalState() == null && O.K.f(this) != null) {
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
                z2 = AbstractC0240F.a(dragEvent, this, activity);
            }
        }
        if (z2) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i) {
        InterfaceC0027c interfaceC0027c;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31 || O.K.f(this) == null || !(i == 16908322 || i == 16908337)) {
            return super.onTextContextMenuItem(i);
        }
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            if (i2 >= 31) {
                interfaceC0027c = new B.b(primaryClip, 1);
            } else {
                C0028d c0028d = new C0028d();
                c0028d.f797b = primaryClip;
                c0028d.f798c = 1;
                interfaceC0027c = c0028d;
            }
            interfaceC0027c.y(i == 16908322 ? 0 : 1);
            O.K.h(this, interfaceC0027c.k());
        }
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0188b c0188b = this.f4037a;
        if (c0188b != null) {
            c0188b.m();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0188b c0188b = this.f4037a;
        if (c0188b != null) {
            c0188b.n(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        X x2 = this.f4038b;
        if (x2 != null) {
            x2.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        X x2 = this.f4038b;
        if (x2 != null) {
            x2.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(R.j.u0(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z2) {
        this.e.d(z2);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.e.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0188b c0188b = this.f4037a;
        if (c0188b != null) {
            c0188b.s(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0188b c0188b = this.f4037a;
        if (c0188b != null) {
            c0188b.t(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        X x2 = this.f4038b;
        x2.l(colorStateList);
        x2.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        X x2 = this.f4038b;
        x2.m(mode);
        x2.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        X x2 = this.f4038b;
        if (x2 != null) {
            x2.g(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C0237C c0237c;
        if (Build.VERSION.SDK_INT >= 28 || (c0237c = this.f4039c) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c0237c.f3796c = textClassifier;
        }
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }
}
