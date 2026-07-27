package c0;

import android.text.InputFilter;
import android.text.Spanned;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class d implements InputFilter {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f5481a;

    /* renamed from: b, reason: collision with root package name */
    public c f5482b;

    public d(TextView textView) {
        this.f5481a = textView;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i6, Spanned spanned, int i9, int i10) {
        TextView textView = this.f5481a;
        if (textView.isInEditMode()) {
            return charSequence;
        }
        int b9 = androidx.emoji2.text.j.a().b();
        if (b9 != 0) {
            if (b9 == 1) {
                if ((i10 == 0 && i9 == 0 && spanned.length() == 0 && charSequence == textView.getText()) || charSequence == null) {
                    return charSequence;
                }
                if (i != 0 || i6 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i, i6);
                }
                return androidx.emoji2.text.j.a().e(charSequence, 0, charSequence.length());
            }
            if (b9 != 3) {
                return charSequence;
            }
        }
        androidx.emoji2.text.j a9 = androidx.emoji2.text.j.a();
        if (this.f5482b == null) {
            this.f5482b = new c(textView, this);
        }
        a9.f(this.f5482b);
        return charSequence;
    }
}
