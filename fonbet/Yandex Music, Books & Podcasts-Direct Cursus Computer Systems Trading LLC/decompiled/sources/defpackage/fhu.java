package defpackage;

import android.util.SparseArray;
import android.view.View;
import java.lang.reflect.Array;

/* loaded from: classes.dex */
public final class fhu extends ihu {
    public SparseArray f;
    public float[] g;

    @Override // defpackage.ihu
    public final void b(int i, float f) {
        throw new RuntimeException("call of custom attribute setPoint");
    }

    @Override // defpackage.ihu
    public final void c(View view, float f) {
        this.a.j0(f, this.g);
        xp3.c0((p86) this.f.valueAt(0), view, this.g);
    }

    @Override // defpackage.ihu
    public final void d(int i) {
        SparseArray sparseArray = this.f;
        int size = sparseArray.size();
        int c = ((p86) sparseArray.valueAt(0)).c();
        double[] dArr = new double[size];
        this.g = new float[c];
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, c);
        for (int i2 = 0; i2 < size; i2++) {
            int keyAt = sparseArray.keyAt(i2);
            p86 p86Var = (p86) sparseArray.valueAt(i2);
            dArr[i2] = keyAt * 0.01d;
            p86Var.b(this.g);
            int i3 = 0;
            while (true) {
                if (i3 < this.g.length) {
                    dArr2[i2][i3] = r7[i3];
                    i3++;
                }
            }
        }
        this.a = lg3.f0(i, dArr, dArr2);
    }
}
