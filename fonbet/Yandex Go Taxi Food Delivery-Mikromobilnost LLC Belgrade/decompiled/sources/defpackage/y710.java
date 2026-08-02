package defpackage;

import com.google.android.material.shape.MaterialShapeDrawable;

/* loaded from: classes.dex */
public final class y710 extends mor {
    public final int a;

    public y710(int i) {
        this.a = i;
    }

    @Override // defpackage.mor
    public final float a(Object obj) {
        float[] fArr;
        float[] fArr2;
        MaterialShapeDrawable materialShapeDrawable = (MaterialShapeDrawable) obj;
        fArr = materialShapeDrawable.springAnimatedCornerSizes;
        if (fArr == null) {
            return 0.0f;
        }
        fArr2 = materialShapeDrawable.springAnimatedCornerSizes;
        return fArr2[this.a];
    }

    @Override // defpackage.mor
    public final void b(Object obj, float f) {
        float[] fArr;
        float[] fArr2;
        float[] fArr3;
        x710 x710Var;
        x710 x710Var2;
        MaterialShapeDrawable materialShapeDrawable = (MaterialShapeDrawable) obj;
        fArr = materialShapeDrawable.springAnimatedCornerSizes;
        if (fArr != null) {
            fArr2 = materialShapeDrawable.springAnimatedCornerSizes;
            int i = this.a;
            if (fArr2[i] != f) {
                fArr3 = materialShapeDrawable.springAnimatedCornerSizes;
                fArr3[i] = f;
                x710Var = materialShapeDrawable.onCornerSizeChangeListener;
                if (x710Var != null) {
                    x710Var2 = materialShapeDrawable.onCornerSizeChangeListener;
                    ((uhx) x710Var2).c(materialShapeDrawable.getCornerSizeDiffX());
                }
                materialShapeDrawable.invalidateSelf();
            }
        }
    }
}
