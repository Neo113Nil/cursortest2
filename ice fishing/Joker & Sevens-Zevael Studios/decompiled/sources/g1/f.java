package g1;

import f1.d0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class f extends g {

    /* renamed from: e, reason: collision with root package name */
    public final q f2454e;

    /* renamed from: f, reason: collision with root package name */
    public final q f2455f;

    /* renamed from: g, reason: collision with root package name */
    public final float[] f2456g;

    public f(q qVar, q qVar2) {
        super(qVar2, qVar, qVar2, null);
        float[] g8;
        this.f2454e = qVar;
        this.f2455f = qVar2;
        float[] fArr = a.f2419b.f2420a;
        s sVar = qVar.f2481d;
        float[] fArr2 = qVar.f2486i;
        s sVar2 = qVar2.f2481d;
        float[] fArr3 = qVar2.f2487j;
        if (j.d(sVar, sVar2)) {
            g8 = j.g(fArr3, fArr2);
        } else {
            float[] a6 = sVar.a();
            float[] a8 = sVar2.a();
            s sVar3 = j.f2463b;
            g8 = j.g(j.d(sVar2, sVar3) ? fArr3 : j.f(j.g(j.c(fArr, a8, new float[]{0.964212f, 1.0f, 0.825188f}), qVar2.f2486i)), j.d(sVar, sVar3) ? fArr2 : j.g(j.c(fArr, a6, new float[]{0.964212f, 1.0f, 0.825188f}), fArr2));
        }
        this.f2456g = g8;
    }

    @Override // g1.g
    public final long a(long j3) {
        float h10 = f1.q.h(j3);
        float g8 = f1.q.g(j3);
        float e10 = f1.q.e(j3);
        float d10 = f1.q.d(j3);
        m mVar = this.f2454e.f2493p;
        float c3 = (float) mVar.c(h10);
        float c7 = (float) mVar.c(g8);
        float c10 = (float) mVar.c(e10);
        float[] fArr = this.f2456g;
        float f10 = (fArr[6] * c10) + (fArr[3] * c7) + (fArr[0] * c3);
        float f11 = (fArr[7] * c10) + (fArr[4] * c7) + (fArr[1] * c3);
        float f12 = (fArr[8] * c10) + (fArr[5] * c7) + (fArr[2] * c3);
        q qVar = this.f2455f;
        float c11 = (float) qVar.f2490m.c(f10);
        m mVar2 = qVar.f2490m;
        return d0.a(c11, (float) mVar2.c(f11), (float) mVar2.c(f12), d10, qVar);
    }
}
