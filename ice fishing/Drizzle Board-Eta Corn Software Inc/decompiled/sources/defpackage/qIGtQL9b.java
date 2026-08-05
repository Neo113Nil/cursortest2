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
import com.kolosta.rejin.jilosa.R;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class qIGtQL9b extends EditText implements dx {
    public final s MdtA4re8;
    public final VM67d7Sv NCTxEWno;
    public final mcXgUFR8 P7K7Inc8;
    public final hc0 VgvYg0wo;
    public bXxSF0LN b2ZJblxo;
    public final mcXgUFR8 wxUZMvaN;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qIGtQL9b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.editTextStyle);
        qc0.qoPGr6Ce(context);
        ic0.qoPGr6Ce(this, getContext());
        VM67d7Sv vM67d7Sv = new VM67d7Sv(this);
        this.NCTxEWno = vM67d7Sv;
        vM67d7Sv.eVhOlqcC(attributeSet, R.attr.editTextStyle);
        s sVar = new s(this);
        this.MdtA4re8 = sVar;
        sVar.P7K7Inc8(attributeSet, R.attr.editTextStyle);
        sVar.NCTxEWno();
        mcXgUFR8 mcxgufr8 = new mcXgUFR8(6, false);
        mcxgufr8.MdtA4re8 = this;
        this.wxUZMvaN = mcxgufr8;
        this.VgvYg0wo = new hc0();
        mcXgUFR8 mcxgufr82 = new mcXgUFR8(this, 5);
        this.P7K7Inc8 = mcxgufr82;
        mcxgufr82.lwWCatUu(attributeSet, R.attr.editTextStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean isFocusable = isFocusable();
        boolean isClickable = isClickable();
        boolean isLongClickable = isLongClickable();
        int inputType = getInputType();
        KeyListener FySoLYna = mcxgufr82.FySoLYna(keyListener);
        if (FySoLYna == keyListener) {
            return;
        }
        super.setKeyListener(FySoLYna);
        setRawInputType(inputType);
        setFocusable(isFocusable);
        setClickable(isClickable);
        setLongClickable(isLongClickable);
    }

    private bXxSF0LN getSuperCaller() {
        bXxSF0LN bxxsf0ln = this.b2ZJblxo;
        if (bxxsf0ln != null) {
            return bxxsf0ln;
        }
        bXxSF0LN bxxsf0ln2 = new bXxSF0LN(this);
        this.b2ZJblxo = bxxsf0ln2;
        return bxxsf0ln2;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        VM67d7Sv vM67d7Sv = this.NCTxEWno;
        if (vM67d7Sv != null) {
            vM67d7Sv.qoPGr6Ce();
        }
        s sVar = this.MdtA4re8;
        if (sVar != null) {
            sVar.NCTxEWno();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return f50.KlHjfFWx(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        VM67d7Sv vM67d7Sv = this.NCTxEWno;
        if (vM67d7Sv != null) {
            return vM67d7Sv.Qr9iLBAD();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        VM67d7Sv vM67d7Sv = this.NCTxEWno;
        if (vM67d7Sv != null) {
            return vM67d7Sv.jb9XjC4I();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.MdtA4re8.wxUZMvaN();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.MdtA4re8.VgvYg0wo();
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : getEditableText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        mcXgUFR8 mcxgufr8;
        if (Build.VERSION.SDK_INT >= 28 || (mcxgufr8 = this.wxUZMvaN) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) mcxgufr8.wxUZMvaN;
        return textClassifier == null ? m.qoPGr6Ce((TextView) mcxgufr8.MdtA4re8) : textClassifier;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
    
        if (r1 != null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0054, code lost:
    
        r6 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0067, code lost:
    
        if (r1 != null) goto L23;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        int i;
        String[] P7K7Inc8;
        String[] stringArray;
        InputConnection ymVar;
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.MdtA4re8.getClass();
        s.Qr9iLBAD(editorInfo, onCreateInputConnection, this);
        ej0.SgZGMMPL(editorInfo, onCreateInputConnection, this);
        if (onCreateInputConnection != null && (i = Build.VERSION.SDK_INT) <= 30 && (P7K7Inc8 = hg0.P7K7Inc8(this)) != null) {
            if (i >= 25) {
                editorInfo.contentMimeTypes = P7K7Inc8;
            } else {
                Bundle bundle = editorInfo.extras;
                if (bundle == null) {
                    bundle = new Bundle();
                    editorInfo.extras = bundle;
                }
                bundle.putStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", P7K7Inc8);
                editorInfo.extras.putStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", P7K7Inc8);
            }
            wm wmVar = new wm(this);
            if (i >= 25) {
                ymVar = new xm(onCreateInputConnection, wmVar);
            } else {
                String[] strArr = le0.VgvYg0wo;
                if (i >= 25) {
                    stringArray = editorInfo.contentMimeTypes;
                } else {
                    Bundle bundle2 = editorInfo.extras;
                    if (bundle2 != null) {
                        stringArray = bundle2.getStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
                        if (stringArray == null) {
                            stringArray = editorInfo.extras.getStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
                        }
                    }
                    if (strArr.length != 0) {
                        ymVar = new ym(onCreateInputConnection, wmVar);
                    }
                }
            }
            onCreateInputConnection = ymVar;
        }
        return this.P7K7Inc8.i7xS8jrb(onCreateInputConnection, editorInfo);
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
        if (Build.VERSION.SDK_INT < 31 && dragEvent.getLocalState() == null && hg0.P7K7Inc8(this) != null) {
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
                z = TxqcCSSg.qoPGr6Ce(dragEvent, this, activity);
            }
        }
        if (z) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i) {
        z8 z8Var;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31 || hg0.P7K7Inc8(this) == null || !(i == 16908322 || i == 16908337)) {
            return super.onTextContextMenuItem(i);
        }
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            if (i2 >= 31) {
                z8Var = new tg0(primaryClip, 1);
            } else {
                a9 a9Var = new a9();
                a9Var.MdtA4re8 = primaryClip;
                a9Var.wxUZMvaN = 1;
                z8Var = a9Var;
            }
            z8Var.I5GHvsYW(i == 16908322 ? 0 : 1);
            hg0.Qr9iLBAD(this, z8Var.build());
        }
        return true;
    }

    @Override // defpackage.dx
    public final c9 qoPGr6Ce(c9 c9Var) {
        this.VgvYg0wo.getClass();
        return hc0.qoPGr6Ce(this, c9Var);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        VM67d7Sv vM67d7Sv = this.NCTxEWno;
        if (vM67d7Sv != null) {
            vM67d7Sv.ow5vqvCr();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        VM67d7Sv vM67d7Sv = this.NCTxEWno;
        if (vM67d7Sv != null) {
            vM67d7Sv.OnDfzHZD(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        s sVar = this.MdtA4re8;
        if (sVar != null) {
            sVar.NCTxEWno();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        s sVar = this.MdtA4re8;
        if (sVar != null) {
            sVar.NCTxEWno();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(f50.Ey6iv0m0(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.P7K7Inc8.VhgXwMj9(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.P7K7Inc8.FySoLYna(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        VM67d7Sv vM67d7Sv = this.NCTxEWno;
        if (vM67d7Sv != null) {
            vM67d7Sv.amk52bBQ(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        VM67d7Sv vM67d7Sv = this.NCTxEWno;
        if (vM67d7Sv != null) {
            vM67d7Sv.KlHjfFWx(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        s sVar = this.MdtA4re8;
        sVar.ow5vqvCr(colorStateList);
        sVar.NCTxEWno();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        s sVar = this.MdtA4re8;
        sVar.OnDfzHZD(mode);
        sVar.NCTxEWno();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        s sVar = this.MdtA4re8;
        if (sVar != null) {
            sVar.b2ZJblxo(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        mcXgUFR8 mcxgufr8;
        if (Build.VERSION.SDK_INT >= 28 || (mcxgufr8 = this.wxUZMvaN) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            mcxgufr8.wxUZMvaN = textClassifier;
        }
    }
}
