package defpackage;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class nf extends w30 {
    public final hf OxcuoDLp;
    public boolean amk52bBQ = true;
    public final TextView sjUBp5pO;

    public nf(TextView textView) {
        this.sjUBp5pO = textView;
        this.OxcuoDLp = new hf(textView);
    }

    @Override // defpackage.w30
    public final void N8VPGzVC(boolean z) {
        this.amk52bBQ = z;
        g2aRJUAd();
        TextView textView = this.sjUBp5pO;
        textView.setFilters(lwWCatUu(textView.getFilters()));
    }

    public final void g2aRJUAd() {
        TextView textView = this.sjUBp5pO;
        TransformationMethod transformationMethod = textView.getTransformationMethod();
        if (this.amk52bBQ) {
            if (!(transformationMethod instanceof rf) && !(transformationMethod instanceof PasswordTransformationMethod)) {
                transformationMethod = new rf(transformationMethod);
            }
        } else if (transformationMethod instanceof rf) {
            transformationMethod = ((rf) transformationMethod).NCTxEWno;
        }
        textView.setTransformationMethod(transformationMethod);
    }

    @Override // defpackage.w30
    public final InputFilter[] lwWCatUu(InputFilter[] inputFilterArr) {
        if (!this.amk52bBQ) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i = 0; i < inputFilterArr.length; i++) {
                InputFilter inputFilter = inputFilterArr[i];
                if (inputFilter instanceof hf) {
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
            hf hfVar = this.OxcuoDLp;
            if (i4 >= length2) {
                InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = hfVar;
                return inputFilterArr3;
            }
            if (inputFilterArr[i4] == hfVar) {
                return inputFilterArr;
            }
            i4++;
        }
    }

    @Override // defpackage.w30
    public final void nSmgoSB5(boolean z) {
        if (z) {
            g2aRJUAd();
        }
    }
}
