package t2;

import s.r0;
import s2.h;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final float[] f6513a = {8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f};

    /* renamed from: b, reason: collision with root package name */
    public static volatile r0 f6514b = new r0(0);

    /* renamed from: c, reason: collision with root package name */
    public static final Object[] f6515c;

    static {
        Object[] objArr = new Object[0];
        f6515c = objArr;
        synchronized (objArr) {
            f6514b.e((int) 115.0f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{9.2f, 11.5f, 13.8f, 16.4f, 19.8f, 21.8f, 25.2f, 30.0f, 100.0f}));
            f6514b.e((int) 130.0f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{10.4f, 13.0f, 15.6f, 18.8f, 21.6f, 23.6f, 26.4f, 30.0f, 100.0f}));
            f6514b.e((int) 150.0f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{12.0f, 15.0f, 18.0f, 22.0f, 24.0f, 26.0f, 28.0f, 30.0f, 100.0f}));
            f6514b.e((int) 180.0f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{14.4f, 18.0f, 21.6f, 24.4f, 27.6f, 30.8f, 32.8f, 34.8f, 100.0f}));
            f6514b.e((int) 200.0f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{16.0f, 20.0f, 24.0f, 26.0f, 30.0f, 34.0f, 36.0f, 38.0f, 100.0f}));
        }
        if ((f6514b.f6330g[0] / 100.0f) - 0.01f > 1.03f) {
            return;
        }
        h.b("You should only apply non-linear scaling to font scales > 1");
    }

    public static a a(float f10) {
        float f11;
        a aVar;
        float[] fArr = f6513a;
        if (f10 < 1.03f) {
            return null;
        }
        int i10 = (int) (f10 * 100.0f);
        a aVar2 = (a) f6514b.d(i10);
        if (aVar2 != null) {
            return aVar2;
        }
        r0 r0Var = f6514b;
        int a6 = t.a.a(r0Var.f6332i, i10, r0Var.f6330g);
        if (a6 >= 0) {
            return (a) f6514b.f(a6);
        }
        int i11 = -(a6 + 1);
        int i12 = i11 - 1;
        if (i11 >= f6514b.f6332i) {
            c cVar = new c(new float[]{1.0f}, new float[]{f10});
            b(f10, cVar);
            return cVar;
        }
        if (i12 < 0) {
            aVar = new c(fArr, fArr);
            f11 = 1.0f;
        } else {
            f11 = f6514b.f6330g[i12] / 100.0f;
            aVar = (a) f6514b.f(i12);
        }
        float f12 = f6514b.f6330g[i11] / 100.0f;
        float max = (Math.max(0.0f, Math.min(1.0f, f11 == f12 ? 0.0f : (f10 - f11) / (f12 - f11))) * 1.0f) + 0.0f;
        a aVar3 = (a) f6514b.f(i11);
        float[] fArr2 = new float[9];
        for (int i13 = 0; i13 < 9; i13++) {
            float f13 = fArr[i13];
            float b2 = aVar.b(f13);
            fArr2[i13] = ((aVar3.b(f13) - b2) * max) + b2;
        }
        c cVar2 = new c(fArr, fArr2);
        b(f10, cVar2);
        return cVar2;
    }

    public static void b(float f10, c cVar) {
        synchronized (f6515c) {
            r0 clone = f6514b.clone();
            clone.e((int) (f10 * 100.0f), cVar);
            f6514b = clone;
        }
    }
}
