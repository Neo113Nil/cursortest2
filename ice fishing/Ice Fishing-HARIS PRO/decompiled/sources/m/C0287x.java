package m;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;
import g.AbstractC0155a;

/* renamed from: m.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0287x {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f4054a;

    /* renamed from: b, reason: collision with root package name */
    public final B.b f4055b;

    public C0287x(TextView textView) {
        this.f4054a = textView;
        this.f4055b = new B.b(textView);
    }

    public final void a(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = this.f4054a.getContext().obtainStyledAttributes(attributeSet, AbstractC0155a.i, i, 0);
        try {
            boolean z2 = obtainStyledAttributes.hasValue(14) ? obtainStyledAttributes.getBoolean(14, true) : true;
            obtainStyledAttributes.recycle();
            c(z2);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void b(boolean z2) {
        ((R.j) this.f4055b.f10b).i0(z2);
    }

    public final void c(boolean z2) {
        ((R.j) this.f4055b.f10b).j0(z2);
    }
}
