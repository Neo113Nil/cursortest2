package c6;

import i1.C4586c;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class b extends i {

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f5751t = 0;

    /* renamed from: u, reason: collision with root package name */
    public final i f5752u;

    public b(c cVar) {
        super(d.f5756w, s.a(double[].class), cVar.f5781c, new double[0], 32);
        this.f5752u = cVar;
    }

    @Override // c6.i
    public final Object b(C0555a c0555a) {
        switch (this.f5751t) {
            case 0:
                return new double[]{Double.longBitsToDouble(c0555a.i())};
            default:
                return new float[]{Float.intBitsToFloat(c0555a.h())};
        }
    }

    @Override // c6.i
    public final Object c(C4586c c4586c) {
        switch (this.f5751t) {
            case 0:
                return new double[]{Double.longBitsToDouble(((C0555a) c4586c.f38154u).i())};
            default:
                return new float[]{Float.intBitsToFloat(((C0555a) c4586c.f38154u).h())};
        }
    }

    @Override // c6.i
    public final void d(n4.c writer, Object obj) {
        switch (this.f5751t) {
            case 0:
                double[] value = (double[]) obj;
                kotlin.jvm.internal.h.e(writer, "writer");
                kotlin.jvm.internal.h.e(value, "value");
                for (double d9 : value) {
                    ((c) this.f5752u).d(writer, Double.valueOf(d9));
                }
                break;
            default:
                float[] value2 = (float[]) obj;
                kotlin.jvm.internal.h.e(writer, "writer");
                kotlin.jvm.internal.h.e(value2, "value");
                for (float f2 : value2) {
                    ((c) this.f5752u).d(writer, Float.valueOf(f2));
                }
                break;
        }
    }

    @Override // c6.i
    public final void e(n4.c writer, int i, Object obj) {
        switch (this.f5751t) {
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
        switch (this.f5751t) {
            case 0:
                double[] value = (double[]) obj;
                kotlin.jvm.internal.h.e(value, "value");
                int i = 0;
                for (double d9 : value) {
                    ((c) this.f5752u).f(Double.valueOf(d9));
                    i += 8;
                }
                return i;
            default:
                float[] value2 = (float[]) obj;
                kotlin.jvm.internal.h.e(value2, "value");
                int i4 = 0;
                for (float f2 : value2) {
                    ((c) this.f5752u).getClass();
                    i4 += 4;
                }
                return i4;
        }
    }

    @Override // c6.i
    public final int g(int i, Object obj) {
        switch (this.f5751t) {
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
        super(d.f5756w, s.a(float[].class), cVar.f5781c, new float[0], 32);
        this.f5752u = cVar;
    }
}
