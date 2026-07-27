package kotlin.text;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class CatchingFishKtorGradle extends CatchingFishFirebaseDagger {
    public final TextView CatchingFishCoroutineFlow;
    public final CatchingFishViewRealm CatchingFishDaggerHiltFAB;
    public boolean CatchingFishSpannableWidget = true;

    public CatchingFishKtorGradle(TextView textView) {
        this.CatchingFishCoroutineFlow = textView;
        this.CatchingFishDaggerHiltFAB = new CatchingFishViewRealm(textView);
    }

    @Override // kotlin.text.CatchingFishFirebaseDagger
    public final void CatchingFishAppCompat(boolean z) {
        this.CatchingFishSpannableWidget = z;
        CatchingFishMoshiDaggerHilt();
        TextView textView = this.CatchingFishCoroutineFlow;
        textView.setFilters(CatchingFishMVPRobolectric(textView.getFilters()));
    }

    @Override // kotlin.text.CatchingFishFirebaseDagger
    public final InputFilter[] CatchingFishMVPRobolectric(InputFilter[] inputFilterArr) {
        if (!this.CatchingFishSpannableWidget) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i = 0; i < inputFilterArr.length; i++) {
                InputFilter inputFilter = inputFilterArr[i];
                if (inputFilter instanceof CatchingFishViewRealm) {
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
            CatchingFishViewRealm catchingFishViewRealm = this.CatchingFishDaggerHiltFAB;
            if (i4 >= length2) {
                InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = catchingFishViewRealm;
                return inputFilterArr3;
            }
            if (inputFilterArr[i4] == catchingFishViewRealm) {
                return inputFilterArr;
            }
            i4++;
        }
    }

    public final void CatchingFishMoshiDaggerHilt() {
        TextView textView = this.CatchingFishCoroutineFlow;
        TransformationMethod transformationMethod = textView.getTransformationMethod();
        if (this.CatchingFishSpannableWidget) {
            if (!(transformationMethod instanceof CatchingFishGlideIntent) && !(transformationMethod instanceof PasswordTransformationMethod)) {
                transformationMethod = new CatchingFishGlideIntent(transformationMethod);
            }
        } else if (transformationMethod instanceof CatchingFishGlideIntent) {
            transformationMethod = ((CatchingFishGlideIntent) transformationMethod).CatchingFishReduxKtor;
        }
        textView.setTransformationMethod(transformationMethod);
    }

    @Override // kotlin.text.CatchingFishFirebaseDagger
    public final void CatchingFishRecyclerView(boolean z) {
        if (z) {
            CatchingFishMoshiDaggerHilt();
        }
    }
}
