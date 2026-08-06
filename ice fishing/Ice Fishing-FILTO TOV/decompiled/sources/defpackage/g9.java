package defpackage;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class g9 implements f9 {
    public final Matrix OOA6hdeuvCS = new Matrix();
    public final int[] EljAMC1QTz = new int[2];

    @Override // defpackage.f9
    public void Yi7zF1RB1(View view, float[] fArr) {
        Matrix matrix = this.OOA6hdeuvCS;
        matrix.reset();
        view.transformMatrixToGlobal(matrix);
        ViewParent parent = view.getParent();
        while (parent instanceof View) {
            view = parent;
            parent = view.getParent();
        }
        int[] iArr = this.EljAMC1QTz;
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        view.getLocationInWindow(iArr);
        matrix.postTranslate(iArr[0] - i, iArr[1] - i2);
        p.lv06NcmrQ(fArr, matrix);
    }
}
