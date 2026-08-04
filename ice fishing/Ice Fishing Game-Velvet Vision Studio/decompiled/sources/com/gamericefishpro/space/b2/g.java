package com.gamericefishpro.space.b2;

import com.gamericefishpro.space.i9.g4;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public class g {
    public final com.gamericefishpro.space.v0.e a = new com.gamericefishpro.space.v0.e(new f[16]);
    public final com.gamericefishpro.space.t.d0 b = new com.gamericefishpro.space.t.d0(10);

    public boolean a(com.gamericefishpro.space.t.q qVar, com.gamericefishpro.space.f2.u uVar, g4 g4Var, boolean z) {
        com.gamericefishpro.space.v0.e eVar = this.a;
        Object[] objArr = eVar.d;
        int i = eVar.i;
        boolean z2 = false;
        for (int i2 = 0; i2 < i; i2++) {
            z2 = ((f) objArr[i2]).a(qVar, uVar, g4Var, z) || z2;
        }
        return z2;
    }

    public void b(g4 g4Var) {
        com.gamericefishpro.space.v0.e eVar = this.a;
        int i = eVar.i;
        while (true) {
            i--;
            if (-1 >= i) {
                return;
            }
            if (((f) eVar.d[i]).d.d == 0) {
                eVar.l(i);
            }
        }
    }
}
