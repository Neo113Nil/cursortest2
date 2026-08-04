package com.gamericefishpro.space.i3;

import com.gamericefishpro.space.fa.m;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends b {
    public f[] f;
    public f[] g;
    public int h;
    public com.gamericefishpro.space.u6.e i;

    @Override // com.gamericefishpro.space.i3.b
    public final f d(boolean[] zArr) {
        int i = -1;
        for (int i2 = 0; i2 < this.h; i2++) {
            f[] fVarArr = this.f;
            f fVar = fVarArr[i2];
            if (!zArr[fVar.e]) {
                com.gamericefishpro.space.u6.e eVar = this.i;
                eVar.b = fVar;
                int i3 = 8;
                if (i != -1) {
                    f fVar2 = fVarArr[i];
                    while (i3 >= 0) {
                        float f = fVar2.A[i3];
                        float f2 = ((f) eVar.b).A[i3];
                        if (f2 != f) {
                            if (f2 >= f) {
                                break;
                            }
                            i = i2;
                            break;
                            break;
                        }
                        i3--;
                    }
                } else {
                    while (i3 >= 0) {
                        float f3 = ((f) eVar.b).A[i3];
                        if (f3 > 0.0f) {
                            break;
                        }
                        if (f3 < 0.0f) {
                            i = i2;
                            break;
                        }
                        i3--;
                    }
                }
            }
        }
        if (i == -1) {
            return null;
        }
        return this.f[i];
    }

    @Override // com.gamericefishpro.space.i3.b
    public final boolean e() {
        return this.h == 0;
    }

    @Override // com.gamericefishpro.space.i3.b
    public final void i(c cVar, b bVar, boolean z) {
        f fVar = bVar.a;
        if (fVar == null) {
            return;
        }
        float[] fArr = fVar.A;
        a aVar = bVar.d;
        int iD = aVar.d();
        for (int i = 0; i < iD; i++) {
            f fVarE = aVar.e(i);
            float f = aVar.f(i);
            com.gamericefishpro.space.u6.e eVar = this.i;
            eVar.b = fVarE;
            if (fVarE.d) {
                boolean z2 = true;
                for (int i2 = 0; i2 < 9; i2++) {
                    float[] fArr2 = ((f) eVar.b).A;
                    float f2 = (fArr[i2] * f) + fArr2[i2];
                    fArr2[i2] = f2;
                    if (Math.abs(f2) < 1.0E-4f) {
                        ((f) eVar.b).A[i2] = 0.0f;
                    } else {
                        z2 = false;
                    }
                }
                if (z2) {
                    ((d) eVar.c).k((f) eVar.b);
                }
            } else {
                for (int i3 = 0; i3 < 9; i3++) {
                    float f3 = fArr[i3];
                    if (f3 != 0.0f) {
                        float f4 = f3 * f;
                        if (Math.abs(f4) < 1.0E-4f) {
                            f4 = 0.0f;
                        }
                        ((f) eVar.b).A[i3] = f4;
                    } else {
                        ((f) eVar.b).A[i3] = 0.0f;
                    }
                }
                j(fVarE);
            }
            this.b = (bVar.b * f) + this.b;
        }
        k(fVar);
    }

    public final void j(f fVar) {
        int i;
        int i2 = this.h + 1;
        f[] fVarArr = this.f;
        if (i2 > fVarArr.length) {
            f[] fVarArr2 = (f[]) Arrays.copyOf(fVarArr, fVarArr.length * 2);
            this.f = fVarArr2;
            this.g = (f[]) Arrays.copyOf(fVarArr2, fVarArr2.length * 2);
        }
        f[] fVarArr3 = this.f;
        int i3 = this.h;
        fVarArr3[i3] = fVar;
        int i4 = i3 + 1;
        this.h = i4;
        if (i4 > 1 && fVarArr3[i3].e > fVar.e) {
            int i5 = 0;
            while (true) {
                i = this.h;
                if (i5 >= i) {
                    break;
                }
                this.g[i5] = this.f[i5];
                i5++;
            }
            Arrays.sort(this.g, 0, i, new m(1));
            for (int i6 = 0; i6 < this.h; i6++) {
                this.f[i6] = this.g[i6];
            }
        }
        fVar.d = true;
        fVar.a(this);
    }

    public final void k(f fVar) {
        int i = 0;
        while (i < this.h) {
            if (this.f[i] == fVar) {
                while (true) {
                    int i2 = this.h;
                    if (i >= i2 - 1) {
                        this.h = i2 - 1;
                        fVar.d = false;
                        return;
                    } else {
                        f[] fVarArr = this.f;
                        int i3 = i + 1;
                        fVarArr[i] = fVarArr[i3];
                        i = i3;
                    }
                }
            } else {
                i++;
            }
        }
    }

    @Override // com.gamericefishpro.space.i3.b
    public final String toString() {
        com.gamericefishpro.space.u6.e eVar = this.i;
        String str = " goal -> (" + this.b + ") : ";
        for (int i = 0; i < this.h; i++) {
            eVar.b = this.f[i];
            str = str + eVar + " ";
        }
        return str;
    }
}
