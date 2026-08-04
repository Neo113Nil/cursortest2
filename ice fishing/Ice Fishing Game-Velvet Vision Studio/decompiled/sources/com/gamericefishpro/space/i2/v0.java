package com.gamericefishpro.space.i2;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class v0 implements u0 {
    public final Matrix d = new Matrix();
    public final int[] e = new int[2];

    @Override // com.gamericefishpro.space.i2.u0
    public void a(View view, float[] fArr) {
        Matrix matrix = this.d;
        matrix.reset();
        view.transformMatrixToGlobal(matrix);
        ViewParent parent = view.getParent();
        while (parent instanceof View) {
            view = parent;
            parent = view.getParent();
        }
        int[] iArr = this.e;
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        view.getLocationInWindow(iArr);
        matrix.postTranslate(iArr[0] - i, iArr[1] - i2);
        com.gamericefishpro.space.o1.o.t(fArr, matrix);
    }
}
