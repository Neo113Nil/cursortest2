package com.gamericefishpro.space.u4;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements TextWatcher {
    public final EditText d;
    public j e;
    public boolean i = true;

    public k(EditText editText) {
        this.d = editText;
    }

    public static void a(EditText editText, int i) {
        int length;
        if (i == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            com.gamericefishpro.space.s4.k kVarA = com.gamericefishpro.space.s4.k.a();
            if (editableText == null) {
                length = 0;
            } else {
                kVarA.getClass();
                length = editableText.length();
            }
            kVarA.f(0, length, 0, editableText);
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
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) throws Throwable {
        EditText editText = this.d;
        if (!editText.isInEditMode() && this.i && com.gamericefishpro.space.s4.k.c() && i2 <= i3 && (charSequence instanceof Spannable)) {
            int iB = com.gamericefishpro.space.s4.k.a().b();
            if (iB != 0) {
                if (iB == 1) {
                    com.gamericefishpro.space.s4.k.a().f(i, i3 + i, 0, (Spannable) charSequence);
                    return;
                } else if (iB != 3) {
                    return;
                }
            }
            com.gamericefishpro.space.s4.k kVarA = com.gamericefishpro.space.s4.k.a();
            if (this.e == null) {
                this.e = new j(editText);
            }
            kVarA.g(this.e);
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
