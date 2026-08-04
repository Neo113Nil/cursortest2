package com.gamericefishpro.space.b2;

import com.gamericefishpro.space.i9.d5;
import com.gamericefishpro.space.i9.g4;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class p {
    public boolean a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;

    /* JADX WARN: Multi-variable type inference failed */
    public int a(com.gamericefishpro.space.u6.c cVar, com.gamericefishpro.space.i2.t tVar, boolean z) {
        int i;
        Object[] objArr;
        int i2;
        int i3;
        c cVar2 = (c) this.c;
        com.gamericefishpro.space.h2.o oVar = (com.gamericefishpro.space.h2.o) this.e;
        if (this.a) {
            return 0;
        }
        try {
            this.a = true;
            g4 g4VarP = ((com.gamericefishpro.space.vb.c) this.d).p(cVar, tVar);
            com.gamericefishpro.space.t.q qVar = (com.gamericefishpro.space.t.q) g4VarP.b;
            int iG = qVar.g();
            while (true) {
                if (i >= iG) {
                    objArr = true;
                    break;
                }
                m mVar = (m) qVar.h(i);
                i = (mVar.d || mVar.h) ? 0 : i + 1;
                objArr = false;
                break;
            }
            int iG2 = qVar.g();
            for (int i4 = 0; i4 < iG2; i4++) {
                m mVar2 = (m) qVar.h(i4);
                if (objArr != false || d5.o(mVar2)) {
                    ((com.gamericefishpro.space.h2.f0) this.b).A(mVar2.c, (com.gamericefishpro.space.h2.o) this.e, mVar2.i, true);
                    if (!oVar.d.h()) {
                        cVar2.a(mVar2.a, oVar, d5.o(mVar2));
                        oVar.clear();
                    }
                }
            }
            boolean zB = cVar2.b(g4VarP, z);
            if (g4VarP.a) {
                i2 = 0;
                break;
            }
            int iG3 = qVar.g();
            int i5 = 0;
            while (true) {
                if (i5 >= iG3) {
                    i2 = 0;
                    break;
                }
                m mVar3 = (m) qVar.h(i5);
                if (!com.gamericefishpro.space.n1.b.b(d5.Q(mVar3, true), 0L) && mVar3.b()) {
                    i2 = 1;
                    break;
                }
                i5++;
            }
            int iG4 = qVar.g();
            for (int i6 = 0; i6 < iG4; i6++) {
                if (((m) qVar.h(i6)).b()) {
                    i3 = 1;
                    return (zB ? 1 : 0) | (i2 << 1) | (i3 << 2);
                }
            }
            i3 = 0;
            return (zB ? 1 : 0) | (i2 << 1) | (i3 << 2);
        } finally {
            this.a = false;
        }
    }
}
