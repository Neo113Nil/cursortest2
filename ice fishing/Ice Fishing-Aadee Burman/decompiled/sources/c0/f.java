package c0;

import a.AbstractC0422a;
import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class f extends AbstractC0422a {

    /* renamed from: c, reason: collision with root package name */
    public final TextView f5485c;

    /* renamed from: d, reason: collision with root package name */
    public final d f5486d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f5487e = true;

    public f(TextView textView) {
        this.f5485c = textView;
        this.f5486d = new d(textView);
    }

    @Override // a.AbstractC0422a
    public final InputFilter[] m(InputFilter[] inputFilterArr) {
        if (!this.f5487e) {
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
            int i6 = 0;
            for (int i9 = 0; i9 < length; i9++) {
                if (sparseArray.indexOfKey(i9) < 0) {
                    inputFilterArr2[i6] = inputFilterArr[i9];
                    i6++;
                }
            }
            return inputFilterArr2;
        }
        int length2 = inputFilterArr.length;
        int i10 = 0;
        while (true) {
            d dVar = this.f5486d;
            if (i10 >= length2) {
                InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = dVar;
                return inputFilterArr3;
            }
            if (inputFilterArr[i10] == dVar) {
                return inputFilterArr;
            }
            i10++;
        }
    }

    @Override // a.AbstractC0422a
    public final void u(boolean z3) {
        if (z3) {
            x();
        }
    }

    @Override // a.AbstractC0422a
    public final void v(boolean z3) {
        this.f5487e = z3;
        x();
        TextView textView = this.f5485c;
        textView.setFilters(m(textView.getFilters()));
    }

    public final void x() {
        TextView textView = this.f5485c;
        TransformationMethod transformationMethod = textView.getTransformationMethod();
        if (this.f5487e) {
            if (!(transformationMethod instanceof j) && !(transformationMethod instanceof PasswordTransformationMethod)) {
                transformationMethod = new j(transformationMethod);
            }
        } else if (transformationMethod instanceof j) {
            transformationMethod = ((j) transformationMethod).f5493a;
        }
        textView.setTransformationMethod(transformationMethod);
    }
}
