package defpackage;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class qf implements TextWatcher {
    public pf MdtA4re8;
    public final EditText NCTxEWno;
    public boolean wxUZMvaN = true;

    public qf(EditText editText) {
        this.NCTxEWno = editText;
    }

    public static void qoPGr6Ce(EditText editText, int i) {
        int length;
        if (i == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            ze qoPGr6Ce = ze.qoPGr6Ce();
            if (editableText == null) {
                length = 0;
            } else {
                qoPGr6Ce.getClass();
                length = editableText.length();
            }
            qoPGr6Ce.VgvYg0wo(editableText, 0, length);
            if (selectionStart >= 0 && selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionStart, selectionEnd);
            } else if (selectionStart >= 0) {
                Selection.setSelection(editableText, selectionStart);
            } else if (selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionEnd);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        EditText editText = this.NCTxEWno;
        if (editText.isInEditMode() || !this.wxUZMvaN || ze.k3x7lurq == null || i2 > i3 || !(charSequence instanceof Spannable)) {
            return;
        }
        int NCTxEWno = ze.qoPGr6Ce().NCTxEWno();
        if (NCTxEWno != 0) {
            if (NCTxEWno == 1) {
                ze.qoPGr6Ce().VgvYg0wo((Spannable) charSequence, i, i3 + i);
                return;
            } else if (NCTxEWno != 3) {
                return;
            }
        }
        ze qoPGr6Ce = ze.qoPGr6Ce();
        pf pfVar = this.MdtA4re8;
        if (pfVar == null) {
            pfVar = new pf(editText);
            this.MdtA4re8 = pfVar;
        }
        qoPGr6Ce.P7K7Inc8(pfVar);
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
