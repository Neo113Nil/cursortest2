package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class sc implements defpackage.qc {
    public final android.graphics.Matrix ZpBGe2uQfcn8 = new android.graphics.Matrix();
    public final int[] giKS3J6vZuNy = new int[2];

    @Override // defpackage.qc
    public void ZpBGe2uQfcn8(android.view.View view, float[] fArr) {
        android.graphics.Matrix matrix = this.ZpBGe2uQfcn8;
        matrix.reset();
        view.transformMatrixToGlobal(matrix);
        android.view.ViewParent parent = view.getParent();
        while (parent instanceof android.view.View) {
            view = parent;
            parent = view.getParent();
        }
        int[] iArr = this.giKS3J6vZuNy;
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        view.getLocationInWindow(iArr);
        matrix.postTranslate(iArr[0] - i, iArr[1] - i2);
        defpackage.ma0.KrtOTfE6jiS2(matrix, fArr);
    }
}
