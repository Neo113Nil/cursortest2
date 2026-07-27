package kotlin.text;

import android.graphics.Matrix;
import android.view.View;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class CatchingFishKtor implements CatchingFishKtorWidget {
    public final int[] CatchingFishParcelableFAB;
    public final float[] CatchingFishSnackbar;

    public CatchingFishKtor(ArrayList arrayList, ArrayList arrayList2) {
        int size = arrayList.size();
        this.CatchingFishParcelableFAB = new int[size];
        this.CatchingFishSnackbar = new float[size];
        for (int i = 0; i < size; i++) {
            this.CatchingFishParcelableFAB[i] = ((Integer) arrayList.get(i)).intValue();
            this.CatchingFishSnackbar[i] = ((Float) arrayList2.get(i)).floatValue();
        }
    }

    @Override // kotlin.text.CatchingFishKtorWidget
    public void CatchingFishParcelableFAB(View view, float[] fArr) {
        CatchingFishOkHttpFAB.CatchingFishPayPalLiveData(fArr);
        CatchingFishSnackbar(view, fArr);
    }

    public void CatchingFishSnackbar(View view, float[] fArr) {
        Object parent = view.getParent();
        boolean z = parent instanceof View;
        float[] fArr2 = this.CatchingFishSnackbar;
        if (z) {
            CatchingFishSnackbar((View) parent, fArr);
            CatchingFishOkHttpFAB.CatchingFishPayPalLiveData(fArr2);
            CatchingFishOkHttpFAB.CatchingFishMVVMAppCompat(fArr2, -view.getScrollX(), -view.getScrollY());
            CatchingFishRobolectricHilt.CatchingFishHandler(fArr, fArr2);
            float left = view.getLeft();
            float top = view.getTop();
            CatchingFishOkHttpFAB.CatchingFishPayPalLiveData(fArr2);
            CatchingFishOkHttpFAB.CatchingFishMVVMAppCompat(fArr2, left, top);
            CatchingFishRobolectricHilt.CatchingFishHandler(fArr, fArr2);
        } else {
            int[] iArr = this.CatchingFishParcelableFAB;
            view.getLocationInWindow(iArr);
            CatchingFishOkHttpFAB.CatchingFishPayPalLiveData(fArr2);
            CatchingFishOkHttpFAB.CatchingFishMVVMAppCompat(fArr2, -view.getScrollX(), -view.getScrollY());
            CatchingFishRobolectricHilt.CatchingFishHandler(fArr, fArr2);
            float f = iArr[0];
            float f2 = iArr[1];
            CatchingFishOkHttpFAB.CatchingFishPayPalLiveData(fArr2);
            CatchingFishOkHttpFAB.CatchingFishMVVMAppCompat(fArr2, f, f2);
            CatchingFishRobolectricHilt.CatchingFishHandler(fArr, fArr2);
        }
        Matrix matrix = view.getMatrix();
        if (matrix.isIdentity()) {
            return;
        }
        CatchingFishXMLLayoutGlide.CatchingFishEspressoMockk(fArr2, matrix);
        CatchingFishRobolectricHilt.CatchingFishHandler(fArr, fArr2);
    }

    public CatchingFishKtor(int i, int i2) {
        this.CatchingFishParcelableFAB = new int[]{i, i2};
        this.CatchingFishSnackbar = new float[]{0.0f, 1.0f};
    }

    public CatchingFishKtor(int i, int i2, int i3) {
        this.CatchingFishParcelableFAB = new int[]{i, i2, i3};
        this.CatchingFishSnackbar = new float[]{0.0f, 0.5f, 1.0f};
    }

    public CatchingFishKtor(float[] fArr) {
        this.CatchingFishSnackbar = fArr;
        this.CatchingFishParcelableFAB = new int[2];
    }
}
