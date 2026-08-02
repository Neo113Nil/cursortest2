package defpackage;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class rr2 {
    public final TextView a;
    public final oun b;

    public rr2(TextView textView) {
        this.a = textView;
        this.b = new oun(textView, false);
    }

    public final InputFilter[] a(InputFilter[] inputFilterArr) {
        return this.b.a.q(inputFilterArr);
    }

    public final boolean b() {
        return this.b.a.x();
    }

    public final void c(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = this.a.getContext().obtainStyledAttributes(attributeSet, n4i0.AppCompatTextView, i, 0);
        try {
            boolean z = obtainStyledAttributes.hasValue(n4i0.AppCompatTextView_emojiCompatEnabled) ? obtainStyledAttributes.getBoolean(n4i0.AppCompatTextView_emojiCompatEnabled, true) : true;
            obtainStyledAttributes.recycle();
            e(z);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void d(boolean z) {
        this.b.a.G(z);
    }

    public final void e(boolean z) {
        this.b.a.H(z);
    }
}
