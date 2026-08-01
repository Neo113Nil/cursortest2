package m;

import a.AbstractC0422a;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;
import g.AbstractC4518a;
import g1.C4522b;

/* renamed from: m.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4716v {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f39255a;

    /* renamed from: b, reason: collision with root package name */
    public final C4522b f39256b;

    public C4716v(TextView textView) {
        this.f39255a = textView;
        this.f39256b = new C4522b(textView);
    }

    public final void a(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = this.f39255a.getContext().obtainStyledAttributes(attributeSet, AbstractC4518a.i, i, 0);
        try {
            boolean z3 = obtainStyledAttributes.hasValue(14) ? obtainStyledAttributes.getBoolean(14, true) : true;
            obtainStyledAttributes.recycle();
            c(z3);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void b(boolean z3) {
        ((AbstractC0422a) this.f39256b.f37625u).u(z3);
    }

    public final void c(boolean z3) {
        ((AbstractC0422a) this.f39256b.f37625u).v(z3);
    }
}
