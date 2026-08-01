package X;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class f extends R.j {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f1385a;

    /* renamed from: b, reason: collision with root package name */
    public final d f1386b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1387c = true;

    public f(TextView textView) {
        this.f1385a = textView;
        this.f1386b = new d(textView);
    }

    @Override // R.j
    public final void i0(boolean z2) {
        if (z2) {
            v0();
        }
    }

    @Override // R.j
    public final void j0(boolean z2) {
        this.f1387c = z2;
        v0();
        TextView textView = this.f1385a;
        textView.setFilters(z(textView.getFilters()));
    }

    public final void v0() {
        TextView textView = this.f1385a;
        TransformationMethod transformationMethod = textView.getTransformationMethod();
        if (this.f1387c) {
            if (!(transformationMethod instanceof j) && !(transformationMethod instanceof PasswordTransformationMethod)) {
                transformationMethod = new j(transformationMethod);
            }
        } else if (transformationMethod instanceof j) {
            transformationMethod = ((j) transformationMethod).f1393a;
        }
        textView.setTransformationMethod(transformationMethod);
    }

    @Override // R.j
    public final InputFilter[] z(InputFilter[] inputFilterArr) {
        if (!this.f1387c) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i = 0; i < inputFilterArr.length; i++) {
                InputFilter inputFilter = inputFilterArr[i];
                if (inputFilter instanceof d) {
                    sparseArray.put(i, inputFilter);
                }
            }
            if (sparseArray.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArray.size()];
            int i2 = 0;
            for (int i3 = 0; i3 < length; i3++) {
                if (sparseArray.indexOfKey(i3) < 0) {
                    inputFilterArr2[i2] = inputFilterArr[i3];
                    i2++;
                }
            }
            return inputFilterArr2;
        }
        int length2 = inputFilterArr.length;
        int i4 = 0;
        while (true) {
            d dVar = this.f1386b;
            if (i4 >= length2) {
                InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = dVar;
                return inputFilterArr3;
            }
            if (inputFilterArr[i4] == dVar) {
                return inputFilterArr;
            }
            i4++;
        }
    }
}
