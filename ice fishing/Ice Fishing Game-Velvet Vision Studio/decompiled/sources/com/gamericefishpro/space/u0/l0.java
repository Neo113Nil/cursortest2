package com.gamericefishpro.space.u0;

import com.gamericefishpro.space.i9.d5;
import com.gamericefishpro.space.t0.h2;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class l0 extends d5 {
    public int d;
    public int f;
    public int h;
    public j0[] c = new j0[16];
    public int[] e = new int[16];
    public Object[] g = new Object[16];

    public final void s0() {
        this.d = 0;
        this.f = 0;
        com.gamericefishpro.space.ph.u.i(0, this.h, null, this.g);
        this.h = 0;
    }

    public final void t0(com.gamericefishpro.space.t0.c cVar, h2 h2Var, com.gamericefishpro.space.u6.q qVar, k0 k0Var) {
        if (v0()) {
            com.gamericefishpro.space.d4.z zVar = new com.gamericefishpro.space.d4.z();
            zVar.d = this;
            l0 l0Var = (l0) zVar.d;
            while (true) {
                j0 j0Var = l0Var.c[zVar.a];
                com.gamericefishpro.space.t0.a aVarB = j0Var.b(zVar);
                com.gamericefishpro.space.t0.c cVar2 = cVar;
                h2 h2Var2 = h2Var;
                com.gamericefishpro.space.u6.q qVar2 = qVar;
                k0 k0Var2 = k0Var;
                try {
                    j0Var.a(zVar, cVar2, h2Var2, qVar2, k0Var2);
                    int i = zVar.a;
                    int i2 = l0Var.d;
                    if (i < i2) {
                        j0 j0Var2 = l0Var.c[i];
                        zVar.b += j0Var2.a;
                        zVar.c += j0Var2.b;
                        int i3 = i + 1;
                        zVar.a = i3;
                        if (i3 >= i2) {
                            break;
                        }
                        cVar = cVar2;
                        h2Var = h2Var2;
                        qVar = qVar2;
                        k0Var = k0Var2;
                    } else {
                        break;
                    }
                } catch (Throwable th) {
                    if (k0Var2 == null) {
                        throw th;
                    }
                    com.gamericefishpro.space.wa.b.R(th, new com.gamericefishpro.space.b1.b(aVarB, h2Var2, k0Var2, 5));
                    throw th;
                }
            }
        }
        s0();
    }

    public final boolean u0() {
        return this.d == 0;
    }

    public final boolean v0() {
        return this.d != 0;
    }

    public final void w0(j0 j0Var) {
        int i = this.d;
        j0[] j0VarArr = this.c;
        if (i == j0VarArr.length) {
            j0[] j0VarArr2 = new j0[(i > 1024 ? 1024 : i) + i];
            System.arraycopy(j0VarArr, 0, j0VarArr2, 0, i);
            this.c = j0VarArr2;
        }
        int i2 = this.f;
        int i3 = j0Var.a;
        int i4 = j0Var.b;
        int i5 = i2 + i3;
        int[] iArr = this.e;
        int length = iArr.length;
        if (i5 > length) {
            int i6 = (length > 1024 ? 1024 : length) + length;
            if (i6 >= i5) {
                i5 = i6;
            }
            int[] iArr2 = new int[i5];
            com.gamericefishpro.space.ph.u.c(0, 0, length, iArr, iArr2);
            this.e = iArr2;
        }
        int i7 = this.h + i4;
        Object[] objArr = this.g;
        int length2 = objArr.length;
        if (i7 > length2) {
            int i8 = (length2 <= 1024 ? length2 : 1024) + length2;
            if (i8 >= i7) {
                i7 = i8;
            }
            Object[] objArr2 = new Object[i7];
            System.arraycopy(objArr, 0, objArr2, 0, length2);
            this.g = objArr2;
        }
        j0[] j0VarArr3 = this.c;
        int i9 = this.d;
        this.d = i9 + 1;
        j0VarArr3[i9] = j0Var;
        this.f += j0Var.a;
        this.h += i4;
    }
}
