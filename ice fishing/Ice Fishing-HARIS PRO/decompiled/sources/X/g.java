package X;

import android.text.InputFilter;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class g extends R.j {

    /* renamed from: a, reason: collision with root package name */
    public final f f1388a;

    public g(TextView textView) {
        this.f1388a = new f(textView);
    }

    @Override // R.j
    public final void i0(boolean z2) {
        if (V.j.f1213k != null) {
            this.f1388a.i0(z2);
        }
    }

    @Override // R.j
    public final void j0(boolean z2) {
        boolean z3 = V.j.f1213k != null;
        f fVar = this.f1388a;
        if (z3) {
            fVar.j0(z2);
        } else {
            fVar.f1387c = z2;
        }
    }

    @Override // R.j
    public final InputFilter[] z(InputFilter[] inputFilterArr) {
        return !(V.j.f1213k != null) ? inputFilterArr : this.f1388a.z(inputFilterArr);
    }
}
