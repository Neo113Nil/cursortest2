package defpackage;

import android.graphics.Matrix;
import android.view.View;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class xr3 implements wr3 {
    public final int[] a;
    public final float[] b;

    public xr3(ArrayList arrayList, ArrayList arrayList2) {
        int size = arrayList.size();
        this.a = new int[size];
        this.b = new float[size];
        for (int i = 0; i < size; i++) {
            this.a[i] = ((Integer) arrayList.get(i)).intValue();
            this.b[i] = ((Float) arrayList2.get(i)).floatValue();
        }
    }

    @Override // defpackage.wr3
    public void a(View view, float[] fArr) {
        feh.d(fArr);
        b(view, fArr);
    }

    public void b(View view, float[] fArr) {
        Object parent = view.getParent();
        boolean z = parent instanceof View;
        float[] fArr2 = this.b;
        if (z) {
            b((View) parent, fArr);
            feh.d(fArr2);
            feh.f(fArr2, -view.getScrollX(), -view.getScrollY());
            jf0.T(fArr, fArr2);
            float left = view.getLeft();
            float top = view.getTop();
            feh.d(fArr2);
            feh.f(fArr2, left, top);
            jf0.T(fArr, fArr2);
        } else {
            int[] iArr = this.a;
            view.getLocationInWindow(iArr);
            feh.d(fArr2);
            feh.f(fArr2, -view.getScrollX(), -view.getScrollY());
            jf0.T(fArr, fArr2);
            float f = iArr[0];
            float f2 = iArr[1];
            feh.d(fArr2);
            feh.f(fArr2, f, f2);
            jf0.T(fArr, fArr2);
        }
        Matrix matrix = view.getMatrix();
        if (matrix.isIdentity()) {
            return;
        }
        cxb.j0(matrix, fArr2);
        jf0.T(fArr, fArr2);
    }

    public xr3(int i, int i2) {
        this.a = new int[]{i, i2};
        this.b = new float[]{0.0f, 1.0f};
    }

    public xr3(int i, int i2, int i3) {
        this.a = new int[]{i, i2, i3};
        this.b = new float[]{0.0f, 0.5f, 1.0f};
    }

    public xr3(float[] fArr) {
        this.b = fArr;
        this.a = new int[2];
    }
}
