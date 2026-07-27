package c0;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;

/* loaded from: classes.dex */
public final class i implements TextWatcher {

    /* renamed from: n, reason: collision with root package name */
    public final EditText f5650n;

    /* renamed from: u, reason: collision with root package name */
    public h f5651u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f5652v = true;

    public i(EditText editText) {
        this.f5650n = editText;
    }

    public static void a(EditText editText, int i) {
        int length;
        if (i == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            androidx.emoji2.text.j a9 = androidx.emoji2.text.j.a();
            if (editableText == null) {
                length = 0;
            } else {
                a9.getClass();
                length = editableText.length();
            }
            a9.e(editableText, 0, length);
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
    public final void onTextChanged(CharSequence charSequence, int i, int i4, int i9) {
        EditText editText = this.f5650n;
        if (editText.isInEditMode() || !this.f5652v || androidx.emoji2.text.j.f4887k == null || i4 > i9 || !(charSequence instanceof Spannable)) {
            return;
        }
        int b9 = androidx.emoji2.text.j.a().b();
        if (b9 != 0) {
            if (b9 == 1) {
                androidx.emoji2.text.j.a().e((Spannable) charSequence, i, i9 + i);
                return;
            } else if (b9 != 3) {
                return;
            }
        }
        androidx.emoji2.text.j a9 = androidx.emoji2.text.j.a();
        if (this.f5651u == null) {
            this.f5651u = new h(editText);
        }
        a9.f(this.f5651u);
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i4, int i9) {
    }
}
