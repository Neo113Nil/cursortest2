package defpackage;

import android.util.SparseArray;
import android.view.View;
import java.lang.reflect.Array;

/* loaded from: classes10.dex */
public final class tv31 extends uv31 {
    public String k;
    public SparseArray l;
    public SparseArray m;
    public float[] n;

    @Override // defpackage.a6z0
    public final void b(float f, float f2, float f3, int i, int i2) {
        throw new RuntimeException("Wrong call for custom attribute");
    }

    @Override // defpackage.a6z0
    public final void c(int i) {
        SparseArray sparseArray = this.l;
        int size = sparseArray.size();
        int d = ((c7e) sparseArray.valueAt(0)).d();
        double[] dArr = new double[size];
        int i2 = d + 2;
        this.n = new float[i2];
        this.g = new float[d];
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, i2);
        for (int i3 = 0; i3 < size; i3++) {
            int keyAt = sparseArray.keyAt(i3);
            c7e c7eVar = (c7e) sparseArray.valueAt(i3);
            float[] fArr = (float[]) this.m.valueAt(i3);
            dArr[i3] = keyAt * 0.01d;
            c7eVar.c(this.n);
            int i4 = 0;
            while (true) {
                if (i4 < this.n.length) {
                    dArr2[i3][i4] = r10[i4];
                    i4++;
                }
            }
            double[] dArr3 = dArr2[i3];
            dArr3[d] = fArr[0];
            dArr3[d + 1] = fArr[1];
        }
        this.a = mif.a(i, dArr, dArr2);
    }

    @Override // defpackage.uv31
    public final boolean e(float f, long j, thx thxVar, View view) {
        this.a.d(f, this.n);
        float[] fArr = this.n;
        float f2 = fArr[fArr.length - 2];
        float f3 = fArr[fArr.length - 1];
        long j2 = j - this.i;
        if (Float.isNaN(this.j)) {
            float a = thxVar.a(view, this.k);
            this.j = a;
            if (Float.isNaN(a)) {
                this.j = 0.0f;
            }
        }
        float f4 = (float) ((((j2 * 1.0E-9d) * f2) + this.j) % 1.0d);
        this.j = f4;
        this.i = j;
        float a2 = a(f4);
        this.h = false;
        int i = 0;
        while (true) {
            float[] fArr2 = this.g;
            if (i >= fArr2.length) {
                break;
            }
            boolean z = this.h;
            float f5 = this.n[i];
            this.h = z | (((double) f5) != 0.0d);
            fArr2[i] = (f5 * a2) + f3;
            i++;
        }
        klf.b((c7e) this.l.valueAt(0), view, this.g);
        if (f2 != 0.0f) {
            this.h = true;
        }
        return this.h;
    }
}
