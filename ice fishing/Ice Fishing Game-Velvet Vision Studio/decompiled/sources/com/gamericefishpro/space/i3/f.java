package com.gamericefishpro.space.i3;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements Comparable {
    public int E;
    public boolean d;
    public float w;
    public int e = -1;
    public int i = -1;
    public int v = 0;
    public boolean y = false;
    public final float[] z = new float[9];
    public final float[] A = new float[9];
    public b[] B = new b[16];
    public int C = 0;
    public int D = 0;

    public f(int i) {
        this.E = i;
    }

    public final void a(b bVar) {
        int i = 0;
        while (true) {
            int i2 = this.C;
            if (i >= i2) {
                b[] bVarArr = this.B;
                if (i2 >= bVarArr.length) {
                    this.B = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                b[] bVarArr2 = this.B;
                int i3 = this.C;
                bVarArr2[i3] = bVar;
                this.C = i3 + 1;
                return;
            }
            if (this.B[i] == bVar) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void b(b bVar) {
        int i = this.C;
        int i2 = 0;
        while (i2 < i) {
            if (this.B[i2] == bVar) {
                while (i2 < i - 1) {
                    b[] bVarArr = this.B;
                    int i3 = i2 + 1;
                    bVarArr[i2] = bVarArr[i3];
                    i2 = i3;
                }
                this.C--;
                return;
            }
            i2++;
        }
    }

    public final void c() {
        this.E = 5;
        this.v = 0;
        this.e = -1;
        this.i = -1;
        this.w = 0.0f;
        this.y = false;
        int i = this.C;
        for (int i2 = 0; i2 < i; i2++) {
            this.B[i2] = null;
        }
        this.C = 0;
        this.D = 0;
        this.d = false;
        Arrays.fill(this.A, 0.0f);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.e - ((f) obj).e;
    }

    public final void d(c cVar, float f) {
        this.w = f;
        this.y = true;
        int i = this.C;
        this.i = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.B[i2].h(cVar, this, false);
        }
        this.C = 0;
    }

    public final void e(c cVar, b bVar) {
        int i = this.C;
        for (int i2 = 0; i2 < i; i2++) {
            this.B[i2].i(cVar, bVar, false);
        }
        this.C = 0;
    }

    public final String toString() {
        return "" + this.e;
    }
}
