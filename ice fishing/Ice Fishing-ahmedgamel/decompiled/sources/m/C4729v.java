package m;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;
import g.AbstractC4528a;

/* renamed from: m.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4729v {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f39324a;

    /* renamed from: b, reason: collision with root package name */
    public final I0.j f39325b;

    public C4729v(TextView textView) {
        this.f39324a = textView;
        this.f39325b = new I0.j(textView);
    }

    public final void a(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = this.f39324a.getContext().obtainStyledAttributes(attributeSet, AbstractC4528a.i, i, 0);
        try {
            boolean z6 = obtainStyledAttributes.hasValue(14) ? obtainStyledAttributes.getBoolean(14, true) : true;
            obtainStyledAttributes.recycle();
            c(z6);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void b(boolean z6) {
        ((com.bumptech.glide.d) this.f39325b.f1291u).E(z6);
    }

    public final void c(boolean z6) {
        ((com.bumptech.glide.d) this.f39325b.f1291u).F(z6);
    }
}
