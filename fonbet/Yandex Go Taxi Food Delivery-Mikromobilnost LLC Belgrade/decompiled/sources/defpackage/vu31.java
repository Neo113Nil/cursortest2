package defpackage;

import android.util.SparseArray;
import android.view.View;
import java.lang.reflect.Array;

/* loaded from: classes10.dex */
public final class vu31 extends wu31 {
    public SparseArray f;
    public float[] g;

    @Override // defpackage.jst0
    public final void b(float f, int i) {
        throw new RuntimeException("call of custom attribute setPoint");
    }

    @Override // defpackage.jst0
    public final void c(int i) {
        SparseArray sparseArray = this.f;
        int size = sparseArray.size();
        int d = ((c7e) sparseArray.valueAt(0)).d();
        double[] dArr = new double[size];
        this.g = new float[d];
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, d);
        for (int i2 = 0; i2 < size; i2++) {
            int keyAt = sparseArray.keyAt(i2);
            c7e c7eVar = (c7e) sparseArray.valueAt(i2);
            dArr[i2] = keyAt * 0.01d;
            c7eVar.c(this.g);
            int i3 = 0;
            while (true) {
                if (i3 < this.g.length) {
                    dArr2[i2][i3] = r7[i3];
                    i3++;
                }
            }
        }
        this.a = mif.a(i, dArr, dArr2);
    }

    @Override // defpackage.wu31
    public final void d(float f, View view) {
        this.a.d(f, this.g);
        klf.b((c7e) this.f.valueAt(0), view, this.g);
    }
}
