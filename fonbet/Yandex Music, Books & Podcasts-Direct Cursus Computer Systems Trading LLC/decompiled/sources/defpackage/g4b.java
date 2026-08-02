package defpackage;

import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class g4b extends weo {
    public final f4b i;

    public g4b(TextView textView) {
        this.i = new f4b(textView);
    }

    @Override // defpackage.weo
    public final boolean F() {
        return this.i.k;
    }

    @Override // defpackage.weo
    public final void O(boolean z) {
        if (r3b.d()) {
            this.i.O(z);
        }
    }

    @Override // defpackage.weo
    public final void P(boolean z) {
        boolean d = r3b.d();
        f4b f4bVar = this.i;
        if (d) {
            f4bVar.P(z);
        } else {
            f4bVar.k = z;
        }
    }

    @Override // defpackage.weo
    public final TransformationMethod V(TransformationMethod transformationMethod) {
        return !r3b.d() ? transformationMethod : this.i.V(transformationMethod);
    }

    @Override // defpackage.weo
    public final InputFilter[] v(InputFilter[] inputFilterArr) {
        return !r3b.d() ? inputFilterArr : this.i.v(inputFilterArr);
    }
}
