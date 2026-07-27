package c0;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class f extends w8.a {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f5645a;

    /* renamed from: b, reason: collision with root package name */
    public final d f5646b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f5647c = true;

    public f(TextView textView) {
        this.f5645a = textView;
        this.f5646b = new d(textView);
    }

    @Override // w8.a
    public final InputFilter[] e(InputFilter[] inputFilterArr) {
        if (!this.f5647c) {
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
            int i4 = 0;
            for (int i9 = 0; i9 < length; i9++) {
                if (sparseArray.indexOfKey(i9) < 0) {
                    inputFilterArr2[i4] = inputFilterArr[i9];
                    i4++;
                }
            }
            return inputFilterArr2;
        }
        int length2 = inputFilterArr.length;
        int i10 = 0;
        while (true) {
            d dVar = this.f5646b;
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

    @Override // w8.a
    public final void i(boolean z8) {
        if (z8) {
            y();
        }
    }

    @Override // w8.a
    public final void j(boolean z8) {
        this.f5647c = z8;
        y();
        TextView textView = this.f5645a;
        textView.setFilters(e(textView.getFilters()));
    }

    public final void y() {
        TextView textView = this.f5645a;
        TransformationMethod transformationMethod = textView.getTransformationMethod();
        if (this.f5647c) {
            if (!(transformationMethod instanceof j) && !(transformationMethod instanceof PasswordTransformationMethod)) {
                transformationMethod = new j(transformationMethod);
            }
        } else if (transformationMethod instanceof j) {
            transformationMethod = ((j) transformationMethod).f5653a;
        }
        textView.setTransformationMethod(transformationMethod);
    }
}
