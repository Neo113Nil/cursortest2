package kotlin.text;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;

/* loaded from: classes.dex */
public final class CatchingFishFABRecyclerView implements TextWatcher {
    public CatchingFishCardViewJUnit CatchingFishDaggerWebsocket;
    public final EditText CatchingFishReduxKtor;
    public boolean CatchingFishWorkManager = true;

    public CatchingFishFABRecyclerView(EditText editText) {
        this.CatchingFishReduxKtor = editText;
    }

    public static void CatchingFishParcelableFAB(EditText editText, int i) {
        int length;
        if (i == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            CatchingFishMVPOkHttpMVP CatchingFishParcelableFAB = CatchingFishMVPOkHttpMVP.CatchingFishParcelableFAB();
            if (editableText == null) {
                length = 0;
            } else {
                CatchingFishParcelableFAB.getClass();
                length = editableText.length();
            }
            CatchingFishParcelableFAB.CatchingFishDaggerWebsocket(editableText, 0, length);
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
        EditText editText = this.CatchingFishReduxKtor;
        if (editText.isInEditMode() || !this.CatchingFishWorkManager || CatchingFishMVPOkHttpMVP.CatchingFishCloudMessaging == null || i2 > i3 || !(charSequence instanceof Spannable)) {
            return;
        }
        int CatchingFishSnackbar = CatchingFishMVPOkHttpMVP.CatchingFishParcelableFAB().CatchingFishSnackbar();
        if (CatchingFishSnackbar != 0) {
            if (CatchingFishSnackbar == 1) {
                CatchingFishMVPOkHttpMVP.CatchingFishParcelableFAB().CatchingFishDaggerWebsocket((Spannable) charSequence, i, i3 + i);
                return;
            } else if (CatchingFishSnackbar != 3) {
                return;
            }
        }
        CatchingFishMVPOkHttpMVP CatchingFishParcelableFAB = CatchingFishMVPOkHttpMVP.CatchingFishParcelableFAB();
        if (this.CatchingFishDaggerWebsocket == null) {
            this.CatchingFishDaggerWebsocket = new CatchingFishCardViewJUnit(editText);
        }
        CatchingFishParcelableFAB.CatchingFishWorkManager(this.CatchingFishDaggerWebsocket);
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
