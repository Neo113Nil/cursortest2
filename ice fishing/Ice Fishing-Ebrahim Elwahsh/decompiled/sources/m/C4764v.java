package m;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;
import g.AbstractC4518a;

/* renamed from: m.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4764v {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f39526a;

    /* renamed from: b, reason: collision with root package name */
    public final I0.j f39527b;

    public C4764v(TextView textView) {
        this.f39526a = textView;
        this.f39527b = new I0.j(textView);
    }

    public final void a(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = this.f39526a.getContext().obtainStyledAttributes(attributeSet, AbstractC4518a.i, i, 0);
        try {
            boolean z8 = obtainStyledAttributes.hasValue(14) ? obtainStyledAttributes.getBoolean(14, true) : true;
            obtainStyledAttributes.recycle();
            c(z8);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void b(boolean z8) {
        ((w8.a) this.f39527b.f1233u).i(z8);
    }

    public final void c(boolean z8) {
        ((w8.a) this.f39527b.f1233u).j(z8);
    }
}
