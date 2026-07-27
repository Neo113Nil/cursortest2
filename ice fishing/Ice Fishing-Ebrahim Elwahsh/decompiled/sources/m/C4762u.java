package m;

import O.C0340d;
import O.C0344f;
import O.InterfaceC0338c;
import O.InterfaceC0360w;
import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
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
import com.google.android.gms.internal.ads.C2728Pl;
import com.icefishing.icefishingliveapp.C5284R;
import g1.C4523c;

/* renamed from: m.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4762u extends EditText implements InterfaceC0360w {

    /* renamed from: n, reason: collision with root package name */
    public final C2728Pl f39505n;

    /* renamed from: u, reason: collision with root package name */
    public final V f39506u;

    /* renamed from: v, reason: collision with root package name */
    public final C4714A f39507v;

    /* renamed from: w, reason: collision with root package name */
    public final U.r f39508w;

    /* renamed from: x, reason: collision with root package name */
    public final C4714A f39509x;

    /* renamed from: y, reason: collision with root package name */
    public C4760t f39510y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4762u(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, C5284R.attr.editTextStyle);
        O0.a(context);
        N0.a(getContext(), this);
        C2728Pl c2728Pl = new C2728Pl(this);
        this.f39505n = c2728Pl;
        c2728Pl.d(attributeSet, C5284R.attr.editTextStyle);
        V v6 = new V(this);
        this.f39506u = v6;
        v6.f(attributeSet, C5284R.attr.editTextStyle);
        v6.b();
        C4714A c4714a = new C4714A();
        c4714a.f39226b = this;
        this.f39507v = c4714a;
        this.f39508w = new U.r();
        C4714A c4714a2 = new C4714A(this);
        this.f39509x = c4714a2;
        c4714a2.b(attributeSet, C5284R.attr.editTextStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean isFocusable = super.isFocusable();
        boolean isClickable = super.isClickable();
        boolean isLongClickable = super.isLongClickable();
        int inputType = super.getInputType();
        KeyListener a9 = c4714a2.a(keyListener);
        if (a9 == keyListener) {
            return;
        }
        super.setKeyListener(a9);
        super.setRawInputType(inputType);
        super.setFocusable(isFocusable);
        super.setClickable(isClickable);
        super.setLongClickable(isLongClickable);
    }

    private C4760t getSuperCaller() {
        if (this.f39510y == null) {
            this.f39510y = new C4760t(this);
        }
        return this.f39510y;
    }

    @Override // O.InterfaceC0360w
    public final C0344f a(C0344f c0344f) {
        return this.f39508w.a(this, c0344f);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C2728Pl c2728Pl = this.f39505n;
        if (c2728Pl != null) {
            c2728Pl.a();
        }
        V v6 = this.f39506u;
        if (v6 != null) {
            v6.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return com.bumptech.glide.d.z(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C2728Pl c2728Pl = this.f39505n;
        if (c2728Pl != null) {
            return c2728Pl.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C2728Pl c2728Pl = this.f39505n;
        if (c2728Pl != null) {
            return c2728Pl.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f39506u.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f39506u.e();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C4714A c4714a;
        if (Build.VERSION.SDK_INT >= 28 || (c4714a = this.f39507v) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) c4714a.f39227c;
        return textClassifier == null ? P.a((TextView) c4714a.f39226b) : textClassifier;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0055, code lost:
    
        if (r1 != null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0057, code lost:
    
        r6 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006a, code lost:
    
        if (r1 != null) goto L23;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        int i;
        String[] g9;
        String[] stringArray;
        InputConnection eVar;
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f39506u.getClass();
        V.h(editorInfo, onCreateInputConnection, this);
        w8.a.g(editorInfo, onCreateInputConnection, this);
        if (onCreateInputConnection != null && (i = Build.VERSION.SDK_INT) <= 30 && (g9 = O.X.g(this)) != null) {
            if (i >= 25) {
                editorInfo.contentMimeTypes = g9;
            } else {
                if (editorInfo.extras == null) {
                    editorInfo.extras = new Bundle();
                }
                editorInfo.extras.putStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", g9);
                editorInfo.extras.putStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", g9);
            }
            F3.l lVar = new F3.l(2, this);
            if (i >= 25) {
                eVar = new T.d(onCreateInputConnection, lVar);
            } else {
                String[] strArr = T.c.f3030a;
                if (i >= 25) {
                    stringArray = editorInfo.contentMimeTypes;
                } else {
                    Bundle bundle = editorInfo.extras;
                    if (bundle != null) {
                        stringArray = bundle.getStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
                        if (stringArray == null) {
                            stringArray = editorInfo.extras.getStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
                        }
                    }
                    if (strArr.length != 0) {
                        eVar = new T.e(onCreateInputConnection, lVar);
                    }
                }
            }
            onCreateInputConnection = eVar;
        }
        return this.f39509x.c(onCreateInputConnection, editorInfo);
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
        boolean z8 = false;
        if (Build.VERSION.SDK_INT < 31 && dragEvent.getLocalState() == null && O.X.g(this) != null) {
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
                z8 = AbstractC4717D.a(dragEvent, this, activity);
            }
        }
        if (z8) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i) {
        InterfaceC0338c interfaceC0338c;
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 31 || O.X.g(this) == null || !(i == 16908322 || i == 16908337)) {
            return super.onTextContextMenuItem(i);
        }
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            if (i4 >= 31) {
                interfaceC0338c = new C4523c(primaryClip, 1);
            } else {
                C0340d c0340d = new C0340d();
                c0340d.f2252u = primaryClip;
                c0340d.f2253v = 1;
                interfaceC0338c = c0340d;
            }
            interfaceC0338c.i(i == 16908322 ? 0 : 1);
            O.X.k(this, interfaceC0338c.build());
        }
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C2728Pl c2728Pl = this.f39505n;
        if (c2728Pl != null) {
            c2728Pl.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C2728Pl c2728Pl = this.f39505n;
        if (c2728Pl != null) {
            c2728Pl.f(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        V v6 = this.f39506u;
        if (v6 != null) {
            v6.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        V v6 = this.f39506u;
        if (v6 != null) {
            v6.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(com.bumptech.glide.d.A(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z8) {
        this.f39509x.d(z8);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f39509x.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C2728Pl c2728Pl = this.f39505n;
        if (c2728Pl != null) {
            c2728Pl.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C2728Pl c2728Pl = this.f39505n;
        if (c2728Pl != null) {
            c2728Pl.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        V v6 = this.f39506u;
        v6.l(colorStateList);
        v6.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        V v6 = this.f39506u;
        v6.m(mode);
        v6.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        V v6 = this.f39506u;
        if (v6 != null) {
            v6.g(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C4714A c4714a;
        if (Build.VERSION.SDK_INT >= 28 || (c4714a = this.f39507v) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c4714a.f39227c = textClassifier;
        }
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }
}
