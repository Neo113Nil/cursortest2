package defpackage;

/* loaded from: classes.dex */
public abstract class mqc {
    public static final float[] a = {8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f};
    public static volatile q4r b = new q4r(0);
    public static final Object[] c;

    static {
        Object[] objArr = new Object[0];
        c = objArr;
        synchronized (objArr) {
            b.e((int) 115.0f, new nqc(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{9.2f, 11.5f, 13.8f, 16.4f, 19.8f, 21.8f, 25.2f, 30.0f, 100.0f}));
            b.e((int) 130.0f, new nqc(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{10.4f, 13.0f, 15.6f, 18.8f, 21.6f, 23.6f, 26.4f, 30.0f, 100.0f}));
            b.e((int) 150.0f, new nqc(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{12.0f, 15.0f, 18.0f, 22.0f, 24.0f, 26.0f, 28.0f, 30.0f, 100.0f}));
            b.e((int) 180.0f, new nqc(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{14.4f, 18.0f, 21.6f, 24.4f, 27.6f, 30.8f, 32.8f, 34.8f, 100.0f}));
            b.e((int) 200.0f, new nqc(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{16.0f, 20.0f, 24.0f, 26.0f, 30.0f, 34.0f, 36.0f, 38.0f, 100.0f}));
        }
        if ((b.d(0) / 100.0f) - 0.01f > 1.03f) {
            return;
        }
        ume.b("You should only apply non-linear scaling to font scales > 1");
    }

    public static lqc a(float f) {
        float d;
        lqc lqcVar;
        float[] fArr = a;
        if (f < 1.03f) {
            return null;
        }
        int i = (int) (f * 100.0f);
        lqc lqcVar2 = (lqc) b.c(i);
        if (lqcVar2 != null) {
            return lqcVar2;
        }
        q4r q4rVar = b;
        int x = u2x.x(q4rVar.c, i, q4rVar.a);
        if (x >= 0) {
            return (lqc) b.f(x);
        }
        int i2 = -(x + 1);
        int i3 = i2 - 1;
        if (i2 >= b.c) {
            nqc nqcVar = new nqc(new float[]{1.0f}, new float[]{f});
            b(f, nqcVar);
            return nqcVar;
        }
        if (i3 < 0) {
            lqcVar = new nqc(fArr, fArr);
            d = 1.0f;
        } else {
            d = b.d(i3) / 100.0f;
            lqcVar = (lqc) b.f(i3);
        }
        float d2 = b.d(i2) / 100.0f;
        float max = (Math.max(0.0f, Math.min(1.0f, d == d2 ? 0.0f : (f - d) / (d2 - d))) * 1.0f) + 0.0f;
        lqc lqcVar3 = (lqc) b.f(i2);
        float[] fArr2 = new float[9];
        for (int i4 = 0; i4 < 9; i4++) {
            float f2 = fArr[i4];
            float b2 = lqcVar.b(f2);
            fArr2[i4] = ((lqcVar3.b(f2) - b2) * max) + b2;
        }
        nqc nqcVar2 = new nqc(fArr, fArr2);
        b(f, nqcVar2);
        return nqcVar2;
    }

    public static void b(float f, nqc nqcVar) {
        synchronized (c) {
            q4r clone = b.clone();
            clone.e((int) (f * 100.0f), nqcVar);
            b = clone;
        }
    }
}
