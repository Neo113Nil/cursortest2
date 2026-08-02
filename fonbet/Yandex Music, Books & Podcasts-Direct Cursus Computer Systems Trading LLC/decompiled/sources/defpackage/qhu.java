package defpackage;

import android.util.SparseArray;
import android.view.View;
import java.lang.reflect.Array;

/* loaded from: classes.dex */
public final class qhu extends thu {
    public String k;
    public SparseArray l;
    public SparseArray m;
    public float[] n;

    @Override // defpackage.thu
    public final void c(float f, float f2, float f3, int i, int i2) {
        throw new RuntimeException("Wrong call for custom attribute");
    }

    @Override // defpackage.thu
    public final boolean d(float f, long j, n7b n7bVar, View view) {
        this.a.j0(f, this.n);
        float[] fArr = this.n;
        float f2 = fArr[fArr.length - 2];
        float f3 = fArr[fArr.length - 1];
        long j2 = j - this.i;
        if (Float.isNaN(this.j)) {
            float j3 = n7bVar.j(view, this.k);
            this.j = j3;
            if (Float.isNaN(j3)) {
                this.j = 0.0f;
            }
        }
        float f4 = (float) ((((j2 * 1.0E-9d) * f2) + this.j) % 1.0d);
        this.j = f4;
        this.i = j;
        float a = a(f4);
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
            fArr2[i] = (f5 * a) + f3;
            i++;
        }
        xp3.c0((p86) this.l.valueAt(0), view, this.g);
        if (f2 != 0.0f) {
            this.h = true;
        }
        return this.h;
    }

    @Override // defpackage.thu
    public final void e(int i) {
        SparseArray sparseArray = this.l;
        int size = sparseArray.size();
        int c = ((p86) sparseArray.valueAt(0)).c();
        double[] dArr = new double[size];
        int i2 = c + 2;
        this.n = new float[i2];
        this.g = new float[c];
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, i2);
        for (int i3 = 0; i3 < size; i3++) {
            int keyAt = sparseArray.keyAt(i3);
            p86 p86Var = (p86) sparseArray.valueAt(i3);
            float[] fArr = (float[]) this.m.valueAt(i3);
            dArr[i3] = keyAt * 0.01d;
            p86Var.b(this.n);
            int i4 = 0;
            while (true) {
                if (i4 < this.n.length) {
                    dArr2[i3][i4] = r10[i4];
                    i4++;
                }
            }
            double[] dArr3 = dArr2[i3];
            dArr3[c] = fArr[0];
            dArr3[c + 1] = fArr[1];
        }
        this.a = lg3.f0(i, dArr, dArr2);
    }
}
