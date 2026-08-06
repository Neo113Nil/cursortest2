package defpackage;

/* loaded from: classes.dex */
public final class va implements defpackage.ua {
    public final android.graphics.Matrix adDC3e2L = new android.graphics.Matrix();
    public final int[] xiZrDbcSW0 = new int[2];

    @Override // defpackage.ua
    public void oh6vYeIP(android.view.View view, float[] fArr) {
        android.graphics.Matrix matrix = this.adDC3e2L;
        matrix.reset();
        view.transformMatrixToGlobal(matrix);
        android.view.ViewParent parent = view.getParent();
        while (parent instanceof android.view.View) {
            view = parent;
            parent = view.getParent();
        }
        int[] iArr = this.xiZrDbcSW0;
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        view.getLocationInWindow(iArr);
        matrix.postTranslate(iArr[0] - i, iArr[1] - i2);
        defpackage.ci0.QPwENk36pDC(fArr, matrix);
    }
}
