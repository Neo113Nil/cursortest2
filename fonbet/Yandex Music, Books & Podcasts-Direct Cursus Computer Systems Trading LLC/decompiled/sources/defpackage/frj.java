package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class frj implements Function1 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ long e;
    public final /* synthetic */ Object f;

    public /* synthetic */ frj(float f, float f2, float f3, o3k o3kVar, long j) {
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.f = o3kVar;
        this.e = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        float f;
        float f2;
        switch (this.a) {
            case 0:
                o3k o3kVar = (o3k) this.f;
                jpa jpaVar = (jpa) obj;
                jpaVar.getClass();
                float n0 = jpaVar.n0(this.b);
                float n02 = jpaVar.n0(this.c);
                float n03 = jpaVar.n0(this.d);
                float intBitsToFloat = Float.intBitsToFloat((int) (jpaVar.y0() & 4294967295L));
                int n = o3kVar.n();
                float f3 = 0.0f;
                int i = 0;
                while (i < n) {
                    float k = o3kVar.k() + o3kVar.j();
                    int i2 = (int) k;
                    float f4 = (n02 - n0) * (k % 1);
                    if (i == i2) {
                        f = n02 - f4;
                    } else if (i - 1 == i2 || (i == 0 && k > o3kVar.n() - 1)) {
                        f = n0 + f4;
                    } else {
                        f2 = n0;
                        float f5 = n0 / 2;
                        jgo m = cb0.m(f3, intBitsToFloat - f5, f3 + f2, intBitsToFloat + f5, (Float.floatToRawIntBits(f5) << 32) | (Float.floatToRawIntBits(f5) & 4294967295L));
                        int i3 = i;
                        nh0 a = ph0.a();
                        eak.a(a, m);
                        jpa.x0(jpaVar, a, this.e, 0.0f, null, 60);
                        f3 = f2 + n03 + f3;
                        i = i3 + 1;
                    }
                    f2 = f;
                    float f52 = n0 / 2;
                    jgo m2 = cb0.m(f3, intBitsToFloat - f52, f3 + f2, intBitsToFloat + f52, (Float.floatToRawIntBits(f52) << 32) | (Float.floatToRawIntBits(f52) & 4294967295L));
                    int i32 = i;
                    nh0 a2 = ph0.a();
                    eak.a(a2, m2);
                    jpa.x0(jpaVar, a2, this.e, 0.0f, null, 60);
                    f3 = f2 + n03 + f3;
                    i = i32 + 1;
                }
                break;
            default:
                Function0 function0 = (Function0) this.f;
                jpa jpaVar2 = (jpa) obj;
                jpaVar2.getClass();
                for (int i4 = 0; i4 < 4; i4++) {
                    double doubleValue = ((1.0d / 4) * i4) + ((Number) function0.invoke()).doubleValue();
                    if (doubleValue > 2.0d) {
                        doubleValue -= 2;
                    } else if (doubleValue > 1.0d) {
                        doubleValue = 2 - doubleValue;
                    }
                    float f6 = this.b;
                    float f7 = (float) doubleValue;
                    float I = fxf.I(f6, 1.25f * f6, f7);
                    float J = fxf.J(f7, 0.0f, 1.0f, 0.3f, 0.1f);
                    float n04 = jpaVar2.n0(I);
                    float n05 = jpaVar2.n0((((2 * f6) + this.c) * i4) + f6);
                    float n06 = (float) (((1 - doubleValue) * jpaVar2.n0(this.d)) + jpaVar2.n0(f6));
                    jpa.D0(jpaVar2, this.e, n04, (Float.floatToRawIntBits(n05) << 32) | (Float.floatToRawIntBits(n06) & 4294967295L), J, null, 0, 112);
                }
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ frj(Function0 function0, float f, float f2, float f3, long j) {
        this.f = function0;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = j;
    }
}
