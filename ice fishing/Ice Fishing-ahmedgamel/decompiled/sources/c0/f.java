package c0;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class f extends com.bumptech.glide.d {

    /* renamed from: d, reason: collision with root package name */
    public final TextView f5633d;

    /* renamed from: e, reason: collision with root package name */
    public final d f5634e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f5635f = true;

    public f(TextView textView) {
        this.f5633d = textView;
        this.f5634e = new d(textView);
    }

    @Override // com.bumptech.glide.d
    public final void E(boolean z6) {
        if (z6) {
            Q();
        }
    }

    @Override // com.bumptech.glide.d
    public final void F(boolean z6) {
        this.f5635f = z6;
        Q();
        TextView textView = this.f5633d;
        textView.setFilters(s(textView.getFilters()));
    }

    public final void Q() {
        TextView textView = this.f5633d;
        TransformationMethod transformationMethod = textView.getTransformationMethod();
        if (this.f5635f) {
            if (!(transformationMethod instanceof j) && !(transformationMethod instanceof PasswordTransformationMethod)) {
                transformationMethod = new j(transformationMethod);
            }
        } else if (transformationMethod instanceof j) {
            transformationMethod = ((j) transformationMethod).f5641a;
        }
        textView.setTransformationMethod(transformationMethod);
    }

    @Override // com.bumptech.glide.d
    public final InputFilter[] s(InputFilter[] inputFilterArr) {
        if (!this.f5635f) {
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
            for (int i6 = 0; i6 < length; i6++) {
                if (sparseArray.indexOfKey(i6) < 0) {
                    inputFilterArr2[i4] = inputFilterArr[i6];
                    i4++;
                }
            }
            return inputFilterArr2;
        }
        int length2 = inputFilterArr.length;
        int i9 = 0;
        while (true) {
            d dVar = this.f5634e;
            if (i9 >= length2) {
                InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = dVar;
                return inputFilterArr3;
            }
            if (inputFilterArr[i9] == dVar) {
                return inputFilterArr;
            }
            i9++;
        }
    }
}
