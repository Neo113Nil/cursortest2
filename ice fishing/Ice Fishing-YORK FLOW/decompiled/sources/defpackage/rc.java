package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class rc implements defpackage.qc {
    public final int[] ZpBGe2uQfcn8;
    public final float[] giKS3J6vZuNy;

    public rc(java.util.ArrayList arrayList, java.util.ArrayList arrayList2) {
        int size = arrayList.size();
        this.ZpBGe2uQfcn8 = new int[size];
        this.giKS3J6vZuNy = new float[size];
        for (int i = 0; i < size; i++) {
            this.ZpBGe2uQfcn8[i] = ((java.lang.Integer) arrayList.get(i)).intValue();
            this.giKS3J6vZuNy[i] = ((java.lang.Float) arrayList2.get(i)).floatValue();
        }
    }

    @Override // defpackage.qc
    public void ZpBGe2uQfcn8(android.view.View view, float[] fArr) {
        defpackage.pk0.JhCgjQRTAOCT(fArr);
        giKS3J6vZuNy(view, fArr);
    }

    public void giKS3J6vZuNy(android.view.View view, float[] fArr) {
        java.lang.Object parent = view.getParent();
        boolean z = parent instanceof android.view.View;
        float[] fArr2 = this.giKS3J6vZuNy;
        if (z) {
            giKS3J6vZuNy((android.view.View) parent, fArr);
            defpackage.pk0.JhCgjQRTAOCT(fArr2);
            defpackage.pk0.oh71FJcDz6S2(fArr2, -view.getScrollX(), -view.getScrollY());
            defpackage.h0.Wc0TdmRSwbbi(fArr, fArr2);
            float left = view.getLeft();
            float top = view.getTop();
            defpackage.pk0.JhCgjQRTAOCT(fArr2);
            defpackage.pk0.oh71FJcDz6S2(fArr2, left, top);
            defpackage.h0.Wc0TdmRSwbbi(fArr, fArr2);
        } else {
            int[] iArr = this.ZpBGe2uQfcn8;
            view.getLocationInWindow(iArr);
            defpackage.pk0.JhCgjQRTAOCT(fArr2);
            defpackage.pk0.oh71FJcDz6S2(fArr2, -view.getScrollX(), -view.getScrollY());
            defpackage.h0.Wc0TdmRSwbbi(fArr, fArr2);
            float f = iArr[0];
            float f2 = iArr[1];
            defpackage.pk0.JhCgjQRTAOCT(fArr2);
            defpackage.pk0.oh71FJcDz6S2(fArr2, f, f2);
            defpackage.h0.Wc0TdmRSwbbi(fArr, fArr2);
        }
        android.graphics.Matrix matrix = view.getMatrix();
        if (matrix.isIdentity()) {
            return;
        }
        defpackage.ma0.KrtOTfE6jiS2(matrix, fArr2);
        defpackage.h0.Wc0TdmRSwbbi(fArr, fArr2);
    }

    public rc(int i, int i2) {
        this.ZpBGe2uQfcn8 = new int[]{i, i2};
        this.giKS3J6vZuNy = new float[]{0.0f, 1.0f};
    }

    public rc(int i, int i2, int i3) {
        this.ZpBGe2uQfcn8 = new int[]{i, i2, i3};
        this.giKS3J6vZuNy = new float[]{0.0f, 0.5f, 1.0f};
    }

    public rc(float[] fArr) {
        this.giKS3J6vZuNy = fArr;
        this.ZpBGe2uQfcn8 = new int[2];
    }
}
