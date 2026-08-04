package com.gamericefishpro.space.p1;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public class g {
    public final c a;
    public final c b;
    public final c c;
    public final float[] d;

    public g(c cVar, c cVar2, c cVar3, float[] fArr) {
        this.a = cVar;
        this.b = cVar2;
        this.c = cVar3;
        this.d = fArr;
    }

    public long a(long j) {
        float fI = com.gamericefishpro.space.o1.s.i(j);
        float fH = com.gamericefishpro.space.o1.s.h(j);
        float f = com.gamericefishpro.space.o1.s.f(j);
        float fE = com.gamericefishpro.space.o1.s.e(j);
        c cVar = this.b;
        long jD = cVar.d(fI, fH, f);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jD >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jD & 4294967295L));
        float fE2 = cVar.e(fI, fH, f);
        float[] fArr = this.d;
        if (fArr != null) {
            fIntBitsToFloat *= fArr[0];
            fIntBitsToFloat2 *= fArr[1];
            fE2 *= fArr[2];
        }
        float f2 = fIntBitsToFloat;
        float f3 = fIntBitsToFloat2;
        return this.c.f(f2, f3, fE2, fE, this.a);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0069  */
    /* JADX WARN: Illegal instructions before constructor call */
    public g(c cVar, c cVar2, int i) {
        float[] fArr;
        long j = cVar.b;
        long j2 = b.a;
        c cVarA = b.a(j, j2) ? j.a(cVar) : cVar;
        c cVarA2 = b.a(cVar2.b, j2) ? j.a(cVar2) : cVar2;
        if (i == 3) {
            boolean zA = b.a(cVar.b, j2);
            boolean zA2 = b.a(cVar2.b, j2);
            if (!(zA && zA2) && (zA || zA2)) {
                s sVar = ((q) (zA ? cVar : cVar2)).d;
                float[] fArrA = j.e;
                float[] fArrA2 = zA ? sVar.a() : fArrA;
                fArrA = zA2 ? sVar.a() : fArrA;
                fArr = new float[]{fArrA2[0] / fArrA[0], fArrA2[1] / fArrA[1], fArrA2[2] / fArrA[2]};
            } else {
                fArr = null;
            }
        } else {
            fArr = null;
        }
        this(cVar2, cVarA, cVarA2, fArr);
    }
}
