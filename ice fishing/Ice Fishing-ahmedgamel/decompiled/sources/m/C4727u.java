package m;

import O.C0332d;
import O.C0336f;
import O.InterfaceC0330c;
import O.InterfaceC0352w;
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
import com.IceFishing.LiveIceFishing.C5248R;
import com.google.android.gms.internal.ads.C2749Pl;
import i1.C4586c;

/* renamed from: m.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4727u extends EditText implements InterfaceC0352w {

    /* renamed from: n, reason: collision with root package name */
    public final C2749Pl f39303n;

    /* renamed from: u, reason: collision with root package name */
    public final V f39304u;

    /* renamed from: v, reason: collision with root package name */
    public final C4679A f39305v;

    /* renamed from: w, reason: collision with root package name */
    public final U.r f39306w;

    /* renamed from: x, reason: collision with root package name */
    public final C4679A f39307x;

    /* renamed from: y, reason: collision with root package name */
    public C4725t f39308y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4727u(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, C5248R.attr.editTextStyle);
        O0.a(context);
        N0.a(getContext(), this);
        C2749Pl c2749Pl = new C2749Pl(this);
        this.f39303n = c2749Pl;
        c2749Pl.d(attributeSet, C5248R.attr.editTextStyle);
        V v9 = new V(this);
        this.f39304u = v9;
        v9.f(attributeSet, C5248R.attr.editTextStyle);
        v9.b();
        C4679A c4679a = new C4679A();
        c4679a.f39027b = this;
        this.f39305v = c4679a;
        this.f39306w = new U.r();
        C4679A c4679a2 = new C4679A(this);
        this.f39307x = c4679a2;
        c4679a2.b(attributeSet, C5248R.attr.editTextStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean isFocusable = super.isFocusable();
        boolean isClickable = super.isClickable();
        boolean isLongClickable = super.isLongClickable();
        int inputType = super.getInputType();
        KeyListener a9 = c4679a2.a(keyListener);
        if (a9 == keyListener) {
            return;
        }
        super.setKeyListener(a9);
        super.setRawInputType(inputType);
        super.setFocusable(isFocusable);
        super.setClickable(isClickable);
        super.setLongClickable(isLongClickable);
    }

    private C4725t getSuperCaller() {
        if (this.f39308y == null) {
            this.f39308y = new C4725t(this);
        }
        return this.f39308y;
    }

    @Override // O.InterfaceC0352w
    public final C0336f a(C0336f c0336f) {
        return this.f39306w.a(this, c0336f);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C2749Pl c2749Pl = this.f39303n;
        if (c2749Pl != null) {
            c2749Pl.a();
        }
        V v9 = this.f39304u;
        if (v9 != null) {
            v9.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return d6.c.n(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C2749Pl c2749Pl = this.f39303n;
        if (c2749Pl != null) {
            return c2749Pl.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C2749Pl c2749Pl = this.f39303n;
        if (c2749Pl != null) {
            return c2749Pl.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f39304u.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f39304u.e();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C4679A c4679a;
        if (Build.VERSION.SDK_INT >= 28 || (c4679a = this.f39305v) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) c4679a.f39028c;
        return textClassifier == null ? P.a((TextView) c4679a.f39027b) : textClassifier;
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
        this.f39304u.getClass();
        V.h(editorInfo, onCreateInputConnection, this);
        t8.g.m(editorInfo, onCreateInputConnection, this);
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
            J3.l lVar = new J3.l(1, this);
            if (i >= 25) {
                eVar = new T.d(onCreateInputConnection, lVar);
            } else {
                String[] strArr = T.c.f3103a;
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
        return this.f39307x.c(onCreateInputConnection, editorInfo);
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
        boolean z6 = false;
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
                z6 = AbstractC4682D.a(dragEvent, this, activity);
            }
        }
        if (z6) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i) {
        InterfaceC0330c interfaceC0330c;
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 31 || O.X.g(this) == null || !(i == 16908322 || i == 16908337)) {
            return super.onTextContextMenuItem(i);
        }
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            if (i4 >= 31) {
                interfaceC0330c = new C4586c(primaryClip, 1);
            } else {
                C0332d c0332d = new C0332d();
                c0332d.f2154u = primaryClip;
                c0332d.f2155v = 1;
                interfaceC0330c = c0332d;
            }
            interfaceC0330c.i(i == 16908322 ? 0 : 1);
            O.X.k(this, interfaceC0330c.build());
        }
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C2749Pl c2749Pl = this.f39303n;
        if (c2749Pl != null) {
            c2749Pl.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C2749Pl c2749Pl = this.f39303n;
        if (c2749Pl != null) {
            c2749Pl.f(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        V v9 = this.f39304u;
        if (v9 != null) {
            v9.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        V v9 = this.f39304u;
        if (v9 != null) {
            v9.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(d6.c.o(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z6) {
        this.f39307x.d(z6);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f39307x.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C2749Pl c2749Pl = this.f39303n;
        if (c2749Pl != null) {
            c2749Pl.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C2749Pl c2749Pl = this.f39303n;
        if (c2749Pl != null) {
            c2749Pl.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        V v9 = this.f39304u;
        v9.l(colorStateList);
        v9.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        V v9 = this.f39304u;
        v9.m(mode);
        v9.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        V v9 = this.f39304u;
        if (v9 != null) {
            v9.g(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C4679A c4679a;
        if (Build.VERSION.SDK_INT >= 28 || (c4679a = this.f39305v) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c4679a.f39028c = textClassifier;
        }
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }
}
