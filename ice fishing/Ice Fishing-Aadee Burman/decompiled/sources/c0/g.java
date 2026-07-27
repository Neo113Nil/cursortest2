package c0;

import a.AbstractC0422a;
import android.text.InputFilter;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class g extends AbstractC0422a {

    /* renamed from: c, reason: collision with root package name */
    public final f f5488c;

    public g(TextView textView) {
        this.f5488c = new f(textView);
    }

    @Override // a.AbstractC0422a
    public final InputFilter[] m(InputFilter[] inputFilterArr) {
        return !(androidx.emoji2.text.j.f4772k != null) ? inputFilterArr : this.f5488c.m(inputFilterArr);
    }

    @Override // a.AbstractC0422a
    public final void u(boolean z3) {
        if (androidx.emoji2.text.j.f4772k != null) {
            this.f5488c.u(z3);
        }
    }

    @Override // a.AbstractC0422a
    public final void v(boolean z3) {
        boolean z6 = androidx.emoji2.text.j.f4772k != null;
        f fVar = this.f5488c;
        if (z6) {
            fVar.v(z3);
        } else {
            fVar.f5487e = z3;
        }
    }
}
