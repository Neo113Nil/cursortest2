package com.gamericefishpro.space.u4;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends com.gamericefishpro.space.d9.h {
    public final TextView i;
    public final e j;
    public boolean k = true;

    public h(TextView textView) {
        this.i = textView;
        this.j = new e(textView);
    }

    @Override // com.gamericefishpro.space.d9.h
    public final void L(boolean z) {
        if (z) {
            T();
        }
    }

    @Override // com.gamericefishpro.space.d9.h
    public final void M(boolean z) {
        this.k = z;
        T();
        TextView textView = this.i;
        textView.setFilters(z(textView.getFilters()));
    }

    public final void T() {
        TextView textView = this.i;
        TransformationMethod transformationMethod = textView.getTransformationMethod();
        if (this.k) {
            if (!(transformationMethod instanceof l) && !(transformationMethod instanceof PasswordTransformationMethod)) {
                transformationMethod = new l(transformationMethod);
            }
        } else if (transformationMethod instanceof l) {
            transformationMethod = ((l) transformationMethod).d;
        }
        textView.setTransformationMethod(transformationMethod);
    }

    @Override // com.gamericefishpro.space.d9.h
    public final InputFilter[] z(InputFilter[] inputFilterArr) {
        if (!this.k) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i = 0; i < inputFilterArr.length; i++) {
                InputFilter inputFilter = inputFilterArr[i];
                if (inputFilter instanceof e) {
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
            e eVar = this.j;
            if (i4 >= length2) {
                InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = eVar;
                return inputFilterArr3;
            }
            if (inputFilterArr[i4] == eVar) {
                return inputFilterArr;
            }
            i4++;
        }
    }
}
