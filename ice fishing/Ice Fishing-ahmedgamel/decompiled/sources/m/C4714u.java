package m;

import O.C0327d;
import O.C0331f;
import O.InterfaceC0325c;
import O.InterfaceC0347w;
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
import com.google.android.gms.internal.ads.C2712Ol;
import com.icefishing.icefishingbigwin.C5275R;
import g1.C4522b;

/* renamed from: m.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4714u extends EditText implements InterfaceC0347w {

    /* renamed from: n, reason: collision with root package name */
    public final C2712Ol f39234n;

    /* renamed from: u, reason: collision with root package name */
    public final V f39235u;

    /* renamed from: v, reason: collision with root package name */
    public final C4667A f39236v;

    /* renamed from: w, reason: collision with root package name */
    public final U.r f39237w;

    /* renamed from: x, reason: collision with root package name */
    public final C4667A f39238x;

    /* renamed from: y, reason: collision with root package name */
    public C4712t f39239y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4714u(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, C5275R.attr.editTextStyle);
        O0.a(context);
        N0.a(getContext(), this);
        C2712Ol c2712Ol = new C2712Ol(this);
        this.f39234n = c2712Ol;
        c2712Ol.d(attributeSet, C5275R.attr.editTextStyle);
        V v9 = new V(this);
        this.f39235u = v9;
        v9.f(attributeSet, C5275R.attr.editTextStyle);
        v9.b();
        C4667A c4667a = new C4667A();
        c4667a.f38959b = this;
        this.f39236v = c4667a;
        this.f39237w = new U.r();
        C4667A c4667a2 = new C4667A(this);
        this.f39238x = c4667a2;
        c4667a2.b(attributeSet, C5275R.attr.editTextStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean isFocusable = super.isFocusable();
        boolean isClickable = super.isClickable();
        boolean isLongClickable = super.isLongClickable();
        int inputType = super.getInputType();
        KeyListener a9 = c4667a2.a(keyListener);
        if (a9 == keyListener) {
            return;
        }
        super.setKeyListener(a9);
        super.setRawInputType(inputType);
        super.setFocusable(isFocusable);
        super.setClickable(isClickable);
        super.setLongClickable(isLongClickable);
    }

    private C4712t getSuperCaller() {
        if (this.f39239y == null) {
            this.f39239y = new C4712t(this);
        }
        return this.f39239y;
    }

    @Override // O.InterfaceC0347w
    public final C0331f a(C0331f c0331f) {
        return this.f39237w.a(this, c0331f);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C2712Ol c2712Ol = this.f39234n;
        if (c2712Ol != null) {
            c2712Ol.a();
        }
        V v9 = this.f39235u;
        if (v9 != null) {
            v9.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return d6.c.q(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C2712Ol c2712Ol = this.f39234n;
        if (c2712Ol != null) {
            return c2712Ol.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C2712Ol c2712Ol = this.f39234n;
        if (c2712Ol != null) {
            return c2712Ol.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f39235u.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f39235u.e();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C4667A c4667a;
        if (Build.VERSION.SDK_INT >= 28 || (c4667a = this.f39236v) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) c4667a.f38960c;
        return textClassifier == null ? P.a((TextView) c4667a.f38959b) : textClassifier;
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
        String[] g4;
        String[] stringArray;
        InputConnection eVar;
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f39235u.getClass();
        V.h(editorInfo, onCreateInputConnection, this);
        t8.g.r(editorInfo, onCreateInputConnection, this);
        if (onCreateInputConnection != null && (i = Build.VERSION.SDK_INT) <= 30 && (g4 = O.X.g(this)) != null) {
            if (i >= 25) {
                editorInfo.contentMimeTypes = g4;
            } else {
                if (editorInfo.extras == null) {
                    editorInfo.extras = new Bundle();
                }
                editorInfo.extras.putStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", g4);
                editorInfo.extras.putStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", g4);
            }
            H3.l lVar = new H3.l(2, this);
            if (i >= 25) {
                eVar = new T.d(onCreateInputConnection, lVar);
            } else {
                String[] strArr = T.c.f3020a;
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
        return this.f39238x.c(onCreateInputConnection, editorInfo);
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
        boolean z3 = false;
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
                z3 = AbstractC4670D.a(dragEvent, this, activity);
            }
        }
        if (z3) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i) {
        InterfaceC0325c interfaceC0325c;
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 31 || O.X.g(this) == null || !(i == 16908322 || i == 16908337)) {
            return super.onTextContextMenuItem(i);
        }
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            if (i6 >= 31) {
                interfaceC0325c = new C4522b(primaryClip, 1);
            } else {
                C0327d c0327d = new C0327d();
                c0327d.f2066u = primaryClip;
                c0327d.f2067v = 1;
                interfaceC0325c = c0327d;
            }
            interfaceC0325c.n(i == 16908322 ? 0 : 1);
            O.X.k(this, interfaceC0325c.build());
        }
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C2712Ol c2712Ol = this.f39234n;
        if (c2712Ol != null) {
            c2712Ol.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C2712Ol c2712Ol = this.f39234n;
        if (c2712Ol != null) {
            c2712Ol.f(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        V v9 = this.f39235u;
        if (v9 != null) {
            v9.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        V v9 = this.f39235u;
        if (v9 != null) {
            v9.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(d6.c.r(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z3) {
        this.f39238x.d(z3);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f39238x.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C2712Ol c2712Ol = this.f39234n;
        if (c2712Ol != null) {
            c2712Ol.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C2712Ol c2712Ol = this.f39234n;
        if (c2712Ol != null) {
            c2712Ol.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        V v9 = this.f39235u;
        v9.l(colorStateList);
        v9.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        V v9 = this.f39235u;
        v9.m(mode);
        v9.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        V v9 = this.f39235u;
        if (v9 != null) {
            v9.g(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C4667A c4667a;
        if (Build.VERSION.SDK_INT >= 28 || (c4667a = this.f39236v) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c4667a.f38960c = textClassifier;
        }
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }
}
