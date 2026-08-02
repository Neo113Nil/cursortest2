package defpackage;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class f4b extends weo {
    public final TextView i;
    public final z3b j;
    public boolean k = true;

    public f4b(TextView textView) {
        this.i = textView;
        this.j = new z3b(textView);
    }

    @Override // defpackage.weo
    public final boolean F() {
        return this.k;
    }

    @Override // defpackage.weo
    public final void O(boolean z) {
        if (z) {
            TextView textView = this.i;
            textView.setTransformationMethod(V(textView.getTransformationMethod()));
        }
    }

    @Override // defpackage.weo
    public final void P(boolean z) {
        this.k = z;
        TextView textView = this.i;
        textView.setTransformationMethod(V(textView.getTransformationMethod()));
        textView.setFilters(v(textView.getFilters()));
    }

    @Override // defpackage.weo
    public final TransformationMethod V(TransformationMethod transformationMethod) {
        return this.k ? transformationMethod instanceof k4b ? transformationMethod : transformationMethod instanceof PasswordTransformationMethod ? transformationMethod : new k4b(transformationMethod) : transformationMethod instanceof k4b ? ((k4b) transformationMethod).a : transformationMethod;
    }

    @Override // defpackage.weo
    public final InputFilter[] v(InputFilter[] inputFilterArr) {
        if (!this.k) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i = 0; i < inputFilterArr.length; i++) {
                InputFilter inputFilter = inputFilterArr[i];
                if (inputFilter instanceof z3b) {
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
            z3b z3bVar = this.j;
            if (i4 >= length2) {
                InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = z3bVar;
                return inputFilterArr3;
            }
            if (inputFilterArr[i4] == z3bVar) {
                return inputFilterArr;
            }
            i4++;
        }
    }
}
