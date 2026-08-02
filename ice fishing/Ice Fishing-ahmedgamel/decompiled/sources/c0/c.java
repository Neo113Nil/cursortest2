package c0;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class c extends androidx.emoji2.text.h {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f5627a;

    /* renamed from: b, reason: collision with root package name */
    public final WeakReference f5628b;

    public c(TextView textView, d dVar) {
        this.f5627a = new WeakReference(textView);
        this.f5628b = new WeakReference(dVar);
    }

    @Override // androidx.emoji2.text.h
    public final void a() {
        InputFilter[] filters;
        int length;
        TextView textView = (TextView) this.f5627a.get();
        InputFilter inputFilter = (InputFilter) this.f5628b.get();
        if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
            return;
        }
        for (InputFilter inputFilter2 : filters) {
            if (inputFilter2 == inputFilter) {
                if (textView.isAttachedToWindow()) {
                    CharSequence text = textView.getText();
                    androidx.emoji2.text.j a9 = androidx.emoji2.text.j.a();
                    if (text == null) {
                        length = 0;
                    } else {
                        a9.getClass();
                        length = text.length();
                    }
                    CharSequence e9 = a9.e(text, 0, length);
                    if (text == e9) {
                        return;
                    }
                    int selectionStart = Selection.getSelectionStart(e9);
                    int selectionEnd = Selection.getSelectionEnd(e9);
                    textView.setText(e9);
                    if (e9 instanceof Spannable) {
                        Spannable spannable = (Spannable) e9;
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
