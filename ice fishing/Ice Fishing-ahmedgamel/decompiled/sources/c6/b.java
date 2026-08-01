package c6;

import g1.C4523c;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class b extends i {

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f5575t = 0;

    /* renamed from: u, reason: collision with root package name */
    public final i f5576u;

    public b(c cVar) {
        super(d.f5580w, s.a(double[].class), cVar.f5605c, new double[0], 32);
        this.f5576u = cVar;
    }

    @Override // c6.i
    public final Object b(C0544a c0544a) {
        switch (this.f5575t) {
            case 0:
                return new double[]{Double.longBitsToDouble(c0544a.i())};
            default:
                return new float[]{Float.intBitsToFloat(c0544a.h())};
        }
    }

    @Override // c6.i
    public final Object c(C4523c c4523c) {
        switch (this.f5575t) {
            case 0:
                return new double[]{Double.longBitsToDouble(((C0544a) c4523c.f37627u).i())};
            default:
                return new float[]{Float.intBitsToFloat(((C0544a) c4523c.f37627u).h())};
        }
    }

    @Override // c6.i
    public final void d(F1.a writer, Object obj) {
        switch (this.f5575t) {
            case 0:
                double[] value = (double[]) obj;
                kotlin.jvm.internal.h.e(writer, "writer");
                kotlin.jvm.internal.h.e(value, "value");
                for (double d2 : value) {
                    ((c) this.f5576u).d(writer, Double.valueOf(d2));
                }
                break;
            default:
                float[] value2 = (float[]) obj;
                kotlin.jvm.internal.h.e(writer, "writer");
                kotlin.jvm.internal.h.e(value2, "value");
                for (float f3 : value2) {
                    ((c) this.f5576u).d(writer, Float.valueOf(f3));
                }
                break;
        }
    }

    @Override // c6.i
    public final void e(F1.a writer, int i, Object obj) {
        switch (this.f5575t) {
            case 0:
                double[] dArr = (double[]) obj;
                kotlin.jvm.internal.h.e(writer, "writer");
                if (dArr != null && dArr.length != 0) {
                    super.e(writer, i, dArr);
                    break;
                }
                break;
            default:
                float[] fArr = (float[]) obj;
                kotlin.jvm.internal.h.e(writer, "writer");
                if (fArr != null && fArr.length != 0) {
                    super.e(writer, i, fArr);
                    break;
                }
                break;
        }
    }

    @Override // c6.i
    public final int f(Object obj) {
        switch (this.f5575t) {
            case 0:
                double[] value = (double[]) obj;
                kotlin.jvm.internal.h.e(value, "value");
                int i = 0;
                for (double d2 : value) {
                    ((c) this.f5576u).f(Double.valueOf(d2));
                    i += 8;
                }
                return i;
            default:
                float[] value2 = (float[]) obj;
                kotlin.jvm.internal.h.e(value2, "value");
                int i6 = 0;
                for (float f3 : value2) {
                    ((c) this.f5576u).getClass();
                    i6 += 4;
                }
                return i6;
        }
    }

    @Override // c6.i
    public final int g(int i, Object obj) {
        switch (this.f5575t) {
            case 0:
                double[] dArr = (double[]) obj;
                if (dArr == null || dArr.length == 0) {
                    return 0;
                }
                return super.g(i, dArr);
            default:
                float[] fArr = (float[]) obj;
                if (fArr == null || fArr.length == 0) {
                    return 0;
                }
                return super.g(i, fArr);
        }
    }

    public b(c cVar, byte b9) {
        super(d.f5580w, s.a(float[].class), cVar.f5605c, new float[0], 32);
        this.f5576u = cVar;
    }
}
