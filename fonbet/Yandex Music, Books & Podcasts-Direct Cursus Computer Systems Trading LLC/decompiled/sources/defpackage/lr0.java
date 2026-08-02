package defpackage;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class lr0 {
    public final TextView a;
    public final h4b b;

    public lr0(TextView textView) {
        this.a = textView;
        h4b h4bVar = new h4b();
        h4bVar.a = new g4b(textView);
        this.b = h4bVar;
    }

    public final InputFilter[] a(InputFilter[] inputFilterArr) {
        return ((weo) this.b.a).v(inputFilterArr);
    }

    public final void b(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = this.a.getContext().obtainStyledAttributes(attributeSet, ken.i, i, 0);
        try {
            boolean z = obtainStyledAttributes.hasValue(14) ? obtainStyledAttributes.getBoolean(14, true) : true;
            obtainStyledAttributes.recycle();
            d(z);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void c(boolean z) {
        ((weo) this.b.a).O(z);
    }

    public final void d(boolean z) {
        ((weo) this.b.a).P(z);
    }
}
