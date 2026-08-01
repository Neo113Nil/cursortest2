package X;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class c extends V.h {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f1379a;

    /* renamed from: b, reason: collision with root package name */
    public final WeakReference f1380b;

    public c(TextView textView, d dVar) {
        this.f1379a = new WeakReference(textView);
        this.f1380b = new WeakReference(dVar);
    }

    @Override // V.h
    public final void a() {
        InputFilter[] filters;
        int length;
        TextView textView = (TextView) this.f1379a.get();
        InputFilter inputFilter = (InputFilter) this.f1380b.get();
        if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
            return;
        }
        for (InputFilter inputFilter2 : filters) {
            if (inputFilter2 == inputFilter) {
                if (textView.isAttachedToWindow()) {
                    CharSequence text = textView.getText();
                    V.j a2 = V.j.a();
                    if (text == null) {
                        length = 0;
                    } else {
                        a2.getClass();
                        length = text.length();
                    }
                    CharSequence e = a2.e(text, 0, length);
                    if (text == e) {
                        return;
                    }
                    int selectionStart = Selection.getSelectionStart(e);
                    int selectionEnd = Selection.getSelectionEnd(e);
                    textView.setText(e);
                    if (e instanceof Spannable) {
                        Spannable spannable = (Spannable) e;
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
