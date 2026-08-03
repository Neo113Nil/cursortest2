package g1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public final c f2457a;

    /* renamed from: b, reason: collision with root package name */
    public final c f2458b;

    /* renamed from: c, reason: collision with root package name */
    public final c f2459c;

    /* renamed from: d, reason: collision with root package name */
    public final float[] f2460d;

    public g(c cVar, c cVar2, c cVar3, float[] fArr) {
        this.f2457a = cVar;
        this.f2458b = cVar2;
        this.f2459c = cVar3;
        this.f2460d = fArr;
    }

    public long a(long j3) {
        float h10 = f1.q.h(j3);
        float g8 = f1.q.g(j3);
        float e10 = f1.q.e(j3);
        float d10 = f1.q.d(j3);
        c cVar = this.f2458b;
        long d11 = cVar.d(h10, g8, e10);
        float intBitsToFloat = Float.intBitsToFloat((int) (d11 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (d11 & 4294967295L));
        float e11 = cVar.e(h10, g8, e10);
        float[] fArr = this.f2460d;
        if (fArr != null) {
            intBitsToFloat *= fArr[0];
            intBitsToFloat2 *= fArr[1];
            e11 *= fArr[2];
        }
        float f10 = intBitsToFloat;
        float f11 = intBitsToFloat2;
        return this.f2459c.f(f10, f11, e11, d10, this.f2457a);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public g(c cVar, c cVar2, int i10) {
        this(cVar2, r0, r1, r3);
        float[] fArr;
        long j3 = cVar.f2427b;
        long j6 = b.f2421a;
        c a6 = b.a(j3, j6) ? j.a(cVar) : cVar;
        c a8 = b.a(cVar2.f2427b, j6) ? j.a(cVar2) : cVar2;
        if (i10 == 3) {
            boolean a10 = b.a(cVar.f2427b, j6);
            boolean a11 = b.a(cVar2.f2427b, j6);
            if ((!a10 || !a11) && (a10 || a11)) {
                s sVar = ((q) (a10 ? cVar : cVar2)).f2481d;
                float[] fArr2 = j.f2466e;
                float[] a12 = a10 ? sVar.a() : fArr2;
                fArr2 = a11 ? sVar.a() : fArr2;
                fArr = new float[]{a12[0] / fArr2[0], a12[1] / fArr2[1], a12[2] / fArr2[2]};
            }
        }
        fArr = null;
    }
}
