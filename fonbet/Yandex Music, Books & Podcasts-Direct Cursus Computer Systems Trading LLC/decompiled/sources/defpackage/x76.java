package defpackage;

/* loaded from: classes.dex */
public final class x76 extends z76 {
    public final rdo e;
    public final rdo f;
    public final float[] g;

    public x76(rdo rdoVar, rdo rdoVar2) {
        super(rdoVar2, rdoVar, rdoVar2, null);
        float[] v0;
        this.e = rdoVar;
        this.f = rdoVar2;
        float[] fArr = (float[]) efo.e.b;
        jkv jkvVar = rdoVar.d;
        float[] fArr2 = rdoVar.i;
        jkv jkvVar2 = rdoVar2.d;
        float[] fArr3 = rdoVar2.j;
        if (zsd.S(jkvVar, jkvVar2)) {
            v0 = zsd.v0(fArr3, fArr2);
        } else {
            float[] a = jkvVar.a();
            float[] a2 = jkvVar2.a();
            jkv jkvVar3 = i4w.p;
            v0 = zsd.v0(zsd.S(jkvVar2, jkvVar3) ? fArr3 : zsd.p0(zsd.v0(zsd.L(fArr, a2, new float[]{0.964212f, 1.0f, 0.825188f}), rdoVar2.i)), zsd.S(jkvVar, jkvVar3) ? fArr2 : zsd.v0(zsd.L(fArr, a, new float[]{0.964212f, 1.0f, 0.825188f}), fArr2));
        }
        this.g = v0;
    }

    @Override // defpackage.z76
    public final long a(long j) {
        float h = d85.h(j);
        float g = d85.g(j);
        float e = d85.e(j);
        float d = d85.d(j);
        ndo ndoVar = this.e.p;
        float c = (float) ndoVar.c(h);
        float c2 = (float) ndoVar.c(g);
        float c3 = (float) ndoVar.c(e);
        float[] fArr = this.g;
        float f = (fArr[6] * c3) + (fArr[3] * c2) + (fArr[0] * c);
        float f2 = (fArr[7] * c3) + (fArr[4] * c2) + (fArr[1] * c);
        float f3 = (fArr[8] * c3) + (fArr[5] * c2) + (fArr[2] * c);
        rdo rdoVar = this.f;
        float c4 = (float) rdoVar.m.c(f);
        ndo ndoVar2 = rdoVar.m;
        return c3x.e(c4, (float) ndoVar2.c(f2), (float) ndoVar2.c(f3), d, rdoVar);
    }
}
