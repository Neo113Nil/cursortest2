package defpackage;

/* loaded from: classes.dex */
public class z76 {
    public final l95 a;
    public final l95 b;
    public final l95 c;
    public final float[] d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public z76(l95 l95Var, l95 l95Var2, int i) {
        this(l95Var2, r0, r1, r4);
        float[] fArr;
        long j = l95Var.b;
        long j2 = v85.a;
        l95 A = v85.a(j, j2) ? zsd.A(l95Var) : l95Var;
        l95 A2 = v85.a(l95Var2.b, j2) ? zsd.A(l95Var2) : l95Var2;
        float[] fArr2 = i4w.s;
        if (i == 3) {
            boolean a = v85.a(l95Var.b, j2);
            boolean a2 = v85.a(l95Var2.b, j2);
            if ((!a || !a2) && (a || a2)) {
                jkv jkvVar = ((rdo) (a ? l95Var : l95Var2)).d;
                float[] a3 = a ? jkvVar.a() : fArr2;
                fArr2 = a2 ? jkvVar.a() : fArr2;
                fArr = new float[]{a3[0] / fArr2[0], a3[1] / fArr2[1], a3[2] / fArr2[2]};
            }
        }
        fArr = null;
    }

    public long a(long j) {
        float h = d85.h(j);
        float g = d85.g(j);
        float e = d85.e(j);
        float d = d85.d(j);
        l95 l95Var = this.b;
        long d2 = l95Var.d(h, g, e);
        float intBitsToFloat = Float.intBitsToFloat((int) (d2 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (d2 & 4294967295L));
        float e2 = l95Var.e(h, g, e);
        float[] fArr = this.d;
        if (fArr != null) {
            intBitsToFloat *= fArr[0];
            intBitsToFloat2 *= fArr[1];
            e2 *= fArr[2];
        }
        float f = intBitsToFloat;
        float f2 = intBitsToFloat2;
        return this.c.f(f, f2, e2, d, this.a);
    }

    public z76(l95 l95Var, l95 l95Var2, l95 l95Var3, float[] fArr) {
        this.a = l95Var;
        this.b = l95Var2;
        this.c = l95Var3;
        this.d = fArr;
    }
}
