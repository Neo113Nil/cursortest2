package kotlin.text;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;

/* loaded from: classes.dex */
public final class CatchingFishMVVMMVVMIntent implements CatchingFishKtorWidget {
    public final Matrix CatchingFishParcelableFAB = new Matrix();
    public final int[] CatchingFishSnackbar = new int[2];

    @Override // kotlin.text.CatchingFishKtorWidget
    public void CatchingFishParcelableFAB(View view, float[] fArr) {
        Matrix matrix = this.CatchingFishParcelableFAB;
        matrix.reset();
        view.transformMatrixToGlobal(matrix);
        ViewParent parent = view.getParent();
        while (parent instanceof View) {
            view = parent;
            parent = view.getParent();
        }
        int[] iArr = this.CatchingFishSnackbar;
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        view.getLocationInWindow(iArr);
        matrix.postTranslate(iArr[0] - i, iArr[1] - i2);
        CatchingFishXMLLayoutGlide.CatchingFishEspressoMockk(fArr, matrix);
    }
}
