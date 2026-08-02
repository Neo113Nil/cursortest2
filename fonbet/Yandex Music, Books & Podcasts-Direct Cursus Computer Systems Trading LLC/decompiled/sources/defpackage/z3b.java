package defpackage;

import android.text.InputFilter;
import android.text.Spanned;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class z3b implements InputFilter {
    public final TextView a;
    public y3b b;

    public z3b(TextView textView) {
        this.a = textView;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        TextView textView = this.a;
        if (textView.isInEditMode()) {
            return charSequence;
        }
        int c = r3b.a().c();
        if (c != 0) {
            if (c == 1) {
                if ((i4 == 0 && i3 == 0 && spanned.length() == 0 && charSequence == textView.getText()) || charSequence == null) {
                    return charSequence;
                }
                if (i != 0 || i2 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i, i2);
                }
                return r3b.a().g(0, charSequence.length(), 0, charSequence);
            }
            if (c != 3) {
                return charSequence;
            }
        }
        r3b a = r3b.a();
        if (this.b == null) {
            this.b = new y3b(textView, this);
        }
        a.h(this.b);
        return charSequence;
    }
}
