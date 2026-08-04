package com.gamericefishpro.space.r2;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class q {
    public static final long a;
    public static final /* synthetic */ int b = 0;

    static {
        com.gamericefishpro.space.c3.o[] oVarArr = com.gamericefishpro.space.c3.n.b;
        a = com.gamericefishpro.space.c3.n.c;
    }

    public static final p a(p pVar, int i, int i2, long j, com.gamericefishpro.space.b3.q qVar, r rVar, com.gamericefishpro.space.b3.i iVar, int i3, int i4, com.gamericefishpro.space.b3.s sVar) {
        long j2;
        int i5 = i;
        int i6 = i2;
        long j3 = j;
        com.gamericefishpro.space.b3.q qVar2 = qVar;
        r rVar2 = rVar;
        com.gamericefishpro.space.b3.i iVar2 = iVar;
        int i7 = i3;
        int i8 = i4;
        com.gamericefishpro.space.b3.s sVar2 = sVar;
        if (i5 == 0 || i5 == pVar.a) {
            com.gamericefishpro.space.c3.o[] oVarArr = com.gamericefishpro.space.c3.n.b;
            if ((j3 & 1095216660480L) == 0) {
                j2 = 0;
            } else {
                j2 = 0;
                if (com.gamericefishpro.space.c3.n.a(j3, pVar.c)) {
                }
            }
            if ((qVar2 == null || qVar2.equals(pVar.d)) && ((i6 == 0 || i6 == pVar.b) && ((rVar2 == null || rVar2.equals(pVar.e)) && ((iVar2 == null || iVar2.equals(pVar.f)) && ((i7 == 0 || i7 == pVar.g) && ((i8 == 0 || i8 == pVar.h) && (sVar2 == null || sVar2.equals(pVar.i)))))))) {
                return pVar;
            }
        } else {
            j2 = 0;
        }
        com.gamericefishpro.space.c3.o[] oVarArr2 = com.gamericefishpro.space.c3.n.b;
        if ((j3 & 1095216660480L) == j2) {
            j3 = pVar.c;
        }
        if (qVar2 == null) {
            qVar2 = pVar.d;
        }
        if (i5 == 0) {
            i5 = pVar.a;
        }
        if (i6 == 0) {
            i6 = pVar.b;
        }
        r rVar3 = pVar.e;
        if (rVar3 != null && rVar2 == null) {
            rVar2 = rVar3;
        }
        if (iVar2 == null) {
            iVar2 = pVar.f;
        }
        if (i7 == 0) {
            i7 = pVar.g;
        }
        if (i8 == 0) {
            i8 = pVar.h;
        }
        if (sVar2 == null) {
            sVar2 = pVar.i;
        }
        return new p(i5, i6, j3, qVar2, rVar2, iVar2, i7, i8, sVar2);
    }
}
