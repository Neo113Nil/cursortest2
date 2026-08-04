package com.gamericefishpro.space.p1;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends g {
    public final q e;
    public final q f;
    public final float[] g;

    public f(q qVar, q qVar2) {
        float[] fArrG;
        super(qVar2, qVar, qVar2, null);
        this.e = qVar;
        this.f = qVar2;
        float[] fArr = a.b.a;
        s sVar = qVar.d;
        float[] fArr2 = qVar.i;
        s sVar2 = qVar2.d;
        float[] fArr3 = qVar2.j;
        if (j.d(sVar, sVar2)) {
            fArrG = j.g(fArr3, fArr2);
        } else {
            float[] fArrA = sVar.a();
            float[] fArrA2 = sVar2.a();
            s sVar3 = j.b;
            fArrG = j.g(j.d(sVar2, sVar3) ? fArr3 : j.f(j.g(j.c(fArr, fArrA2, new float[]{0.964212f, 1.0f, 0.825188f}), qVar2.i)), j.d(sVar, sVar3) ? fArr2 : j.g(j.c(fArr, fArrA, new float[]{0.964212f, 1.0f, 0.825188f}), fArr2));
        }
        this.g = fArrG;
    }

    @Override // com.gamericefishpro.space.p1.g
    public final long a(long j) {
        float fI = com.gamericefishpro.space.o1.s.i(j);
        float fH = com.gamericefishpro.space.o1.s.h(j);
        float f = com.gamericefishpro.space.o1.s.f(j);
        float fE = com.gamericefishpro.space.o1.s.e(j);
        m mVar = this.e.p;
        float fD = (float) mVar.d(fI);
        float fD2 = (float) mVar.d(fH);
        float fD3 = (float) mVar.d(f);
        float[] fArr = this.g;
        float f2 = (fArr[6] * fD3) + (fArr[3] * fD2) + (fArr[0] * fD);
        float f3 = (fArr[7] * fD3) + (fArr[4] * fD2) + (fArr[1] * fD);
        float f4 = (fArr[8] * fD3) + (fArr[5] * fD2) + (fArr[2] * fD);
        q qVar = this.f;
        float fD4 = (float) qVar.m.d(f2);
        m mVar2 = qVar.m;
        return com.gamericefishpro.space.o1.o.a(fD4, (float) mVar2.d(f3), (float) mVar2.d(f4), fE, qVar);
    }
}
