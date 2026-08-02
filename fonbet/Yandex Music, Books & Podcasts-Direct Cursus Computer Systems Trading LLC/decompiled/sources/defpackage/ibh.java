package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class ibh implements pyc {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ aqi d;
    public final /* synthetic */ sdr e;

    public /* synthetic */ ibh(float f, float f2, aqi aqiVar, wje wjeVar, int i) {
        this.a = i;
        this.b = f;
        this.c = f2;
        this.d = aqiVar;
        this.e = wjeVar;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        mfh mfhVar = (mfh) obj;
        ffh ffhVar = (ffh) obj2;
        ga6 ga6Var = (ga6) obj3;
        switch (this.a) {
            case 0:
                mfhVar.getClass();
                ffhVar.getClass();
                final ksk M = ffhVar.M(ia6.b(0, 0, 15));
                int g = ia6.g(M.a, ga6Var.a);
                int f = ia6.f(M.b, ga6Var.a);
                float f2 = M.a;
                hbh hbhVar = new hbh(f2, mfhVar.n0(this.b) + f2, g, ((int) (mfhVar.d0(f2) / this.c)) * 1000);
                final aqi aqiVar = this.d;
                aqiVar.setValue(hbhVar);
                final int i = 1;
                final sdr sdrVar = this.e;
                return mfh.m0(mfhVar, g, f, new Function1() { // from class: kbh
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj4) {
                        jsk jskVar = (jsk) obj4;
                        switch (i) {
                            case 0:
                                jskVar.getClass();
                                aqi aqiVar2 = aqiVar;
                                float f3 = ((gbh) aqiVar2.getValue()).a;
                                float f4 = ((gbh) aqiVar2.getValue()).c;
                                ksk kskVar = M;
                                if (f3 <= f4) {
                                    jsk.f(jskVar, kskVar, 0L);
                                } else {
                                    sdr sdrVar2 = sdrVar;
                                    jskVar.d(kskVar, sdrVar2 != null ? eeh.b(((Number) sdrVar2.getValue()).floatValue()) : 0, 0, 0.0f);
                                }
                                break;
                            default:
                                jskVar.getClass();
                                aqi aqiVar3 = aqiVar;
                                float f5 = ((hbh) aqiVar3.getValue()).a;
                                float f6 = ((hbh) aqiVar3.getValue()).c;
                                ksk kskVar2 = M;
                                if (f5 <= f6) {
                                    jsk.f(jskVar, kskVar2, 0L);
                                } else {
                                    sdr sdrVar3 = sdrVar;
                                    jskVar.d(kskVar2, sdrVar3 != null ? eeh.b(((Number) sdrVar3.getValue()).floatValue()) : 0, 0, 0.0f);
                                }
                                break;
                        }
                        return Unit.a;
                    }
                });
            default:
                mfhVar.getClass();
                ffhVar.getClass();
                final ksk M2 = ffhVar.M(ia6.b(0, 0, 15));
                int g2 = ia6.g(M2.a, ga6Var.a);
                int f3 = ia6.f(M2.b, ga6Var.a);
                float f4 = M2.a;
                gbh gbhVar = new gbh(f4, mfhVar.n0(this.b) + f4, g2, ((int) (mfhVar.d0(f4) / this.c)) * 1000);
                final aqi aqiVar2 = this.d;
                aqiVar2.setValue(gbhVar);
                final int i2 = 0;
                final sdr sdrVar2 = this.e;
                return mfh.m0(mfhVar, g2, f3, new Function1() { // from class: kbh
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj4) {
                        jsk jskVar = (jsk) obj4;
                        switch (i2) {
                            case 0:
                                jskVar.getClass();
                                aqi aqiVar22 = aqiVar2;
                                float f32 = ((gbh) aqiVar22.getValue()).a;
                                float f42 = ((gbh) aqiVar22.getValue()).c;
                                ksk kskVar = M2;
                                if (f32 <= f42) {
                                    jsk.f(jskVar, kskVar, 0L);
                                } else {
                                    sdr sdrVar22 = sdrVar2;
                                    jskVar.d(kskVar, sdrVar22 != null ? eeh.b(((Number) sdrVar22.getValue()).floatValue()) : 0, 0, 0.0f);
                                }
                                break;
                            default:
                                jskVar.getClass();
                                aqi aqiVar3 = aqiVar2;
                                float f5 = ((hbh) aqiVar3.getValue()).a;
                                float f6 = ((hbh) aqiVar3.getValue()).c;
                                ksk kskVar2 = M2;
                                if (f5 <= f6) {
                                    jsk.f(jskVar, kskVar2, 0L);
                                } else {
                                    sdr sdrVar3 = sdrVar2;
                                    jskVar.d(kskVar2, sdrVar3 != null ? eeh.b(((Number) sdrVar3.getValue()).floatValue()) : 0, 0, 0.0f);
                                }
                                break;
                        }
                        return Unit.a;
                    }
                });
        }
    }
}
