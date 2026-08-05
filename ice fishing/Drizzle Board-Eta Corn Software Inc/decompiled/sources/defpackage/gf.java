package defpackage;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class gf extends xe {
    public final WeakReference NCTxEWno;
    public final WeakReference qoPGr6Ce;

    public gf(TextView textView, hf hfVar) {
        this.qoPGr6Ce = new WeakReference(textView);
        this.NCTxEWno = new WeakReference(hfVar);
    }

    @Override // defpackage.xe
    public final void qoPGr6Ce() {
        InputFilter[] filters;
        int length;
        TextView textView = (TextView) this.qoPGr6Ce.get();
        InputFilter inputFilter = (InputFilter) this.NCTxEWno.get();
        if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
            return;
        }
        for (InputFilter inputFilter2 : filters) {
            if (inputFilter2 == inputFilter) {
                if (textView.isAttachedToWindow()) {
                    CharSequence text = textView.getText();
                    ze qoPGr6Ce = ze.qoPGr6Ce();
                    if (text == null) {
                        length = 0;
                    } else {
                        qoPGr6Ce.getClass();
                        length = text.length();
                    }
                    CharSequence VgvYg0wo = qoPGr6Ce.VgvYg0wo(text, 0, length);
                    if (text == VgvYg0wo) {
                        return;
                    }
                    int selectionStart = Selection.getSelectionStart(VgvYg0wo);
                    int selectionEnd = Selection.getSelectionEnd(VgvYg0wo);
                    textView.setText(VgvYg0wo);
                    if (VgvYg0wo instanceof Spannable) {
                        Spannable spannable = (Spannable) VgvYg0wo;
                        if (selectionStart >= 0 && selectionEnd >= 0) {
                            Selection.setSelection(spannable, selectionStart, selectionEnd);
                            return;
                        } else if (selectionStart >= 0) {
                            Selection.setSelection(spannable, selectionStart);
                            return;
                        } else {
                            if (selectionEnd >= 0) {
                                Selection.setSelection(spannable, selectionEnd);
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
                return;
            }
        }
    }
}
