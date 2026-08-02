package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final /* synthetic */ class jbh implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ sdr b;
    public final /* synthetic */ aqi c;

    public /* synthetic */ jbh(wje wjeVar, aqi aqiVar, int i) {
        this.a = i;
        this.b = wjeVar;
        this.c = aqiVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                np3 np3Var = (np3) obj;
                np3Var.getClass();
                long j = d85.m;
                d85 d85Var = new d85(j);
                long j2 = d85.b;
                final o6g F = y9w.F(u75.h(d85Var, new d85(j2)), 0.0f, nmq.d(np3Var.a.e()) * 0.05f, 10);
                final o6g F2 = y9w.F(u75.h(new d85(j2), new d85(j)), nmq.d(np3Var.a.e()) * 0.95f, 0.0f, 12);
                final int i = 0;
                final sdr sdrVar = this.b;
                final aqi aqiVar = this.c;
                return np3Var.b(new Function1() { // from class: lbh
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        switch (i) {
                            case 0:
                                opf opfVar = (opf) obj2;
                                opfVar.getClass();
                                aqi aqiVar2 = aqiVar;
                                float f = ((gbh) aqiVar2.getValue()).a;
                                float f2 = ((gbh) aqiVar2.getValue()).c;
                                sdr sdrVar2 = sdrVar;
                                if (f <= f2) {
                                    opfVar.a();
                                } else {
                                    int ceil = (int) Math.ceil((((gbh) aqiVar2.getValue()).c - (sdrVar2 != null ? ((Number) sdrVar2.getValue()).floatValue() : 0.0f)) / ((gbh) aqiVar2.getValue()).b);
                                    for (int i2 = 0; i2 < ceil; i2++) {
                                        float f3 = i2 * ((gbh) aqiVar2.getValue()).b;
                                        ou3 ou3Var = opfVar.a;
                                        ((xzi) ou3Var.b.b).m0(f3, 0.0f);
                                        try {
                                            opfVar.a();
                                            ((xzi) ou3Var.b.b).m0(-f3, -0.0f);
                                        } catch (Throwable th) {
                                            ((xzi) ou3Var.b.b).m0(-f3, -0.0f);
                                            throw th;
                                        }
                                    }
                                }
                                if ((sdrVar2 != null ? ((Number) sdrVar2.getValue()).floatValue() : 0.0f) != 0.0f) {
                                    jpa.A0(opfVar, F, 0L, 0L, 0.0f, null, null, 6, 62);
                                }
                                if (((gbh) aqiVar2.getValue()).a > ((gbh) aqiVar2.getValue()).c) {
                                    jpa.A0(opfVar, F2, 0L, 0L, 0.0f, null, null, 6, 62);
                                }
                                return Unit.a;
                            default:
                                opf opfVar2 = (opf) obj2;
                                opfVar2.getClass();
                                aqi aqiVar3 = aqiVar;
                                float f4 = ((hbh) aqiVar3.getValue()).a;
                                float f5 = ((hbh) aqiVar3.getValue()).c;
                                sdr sdrVar3 = sdrVar;
                                if (f4 <= f5) {
                                    opfVar2.a();
                                } else {
                                    int ceil2 = (int) Math.ceil((((hbh) aqiVar3.getValue()).c - (sdrVar3 != null ? ((Number) sdrVar3.getValue()).floatValue() : 0.0f)) / ((hbh) aqiVar3.getValue()).b);
                                    for (int i3 = 0; i3 < ceil2; i3++) {
                                        float f6 = i3 * ((hbh) aqiVar3.getValue()).b;
                                        ou3 ou3Var2 = opfVar2.a;
                                        ((xzi) ou3Var2.b.b).m0(f6, 0.0f);
                                        try {
                                            opfVar2.a();
                                            ((xzi) ou3Var2.b.b).m0(-f6, -0.0f);
                                        } catch (Throwable th2) {
                                            ((xzi) ou3Var2.b.b).m0(-f6, -0.0f);
                                            throw th2;
                                        }
                                    }
                                }
                                if ((sdrVar3 != null ? ((Number) sdrVar3.getValue()).floatValue() : 0.0f) != 0.0f) {
                                    jpa.A0(opfVar2, F, 0L, 0L, 0.0f, null, null, 6, 62);
                                }
                                if (((hbh) aqiVar3.getValue()).a > ((hbh) aqiVar3.getValue()).c) {
                                    jpa.A0(opfVar2, F2, 0L, 0L, 0.0f, null, null, 6, 62);
                                }
                                return Unit.a;
                        }
                    }
                });
            default:
                np3 np3Var2 = (np3) obj;
                np3Var2.getClass();
                long j3 = d85.m;
                d85 d85Var2 = new d85(j3);
                long j4 = d85.b;
                final o6g F3 = y9w.F(u75.h(d85Var2, new d85(j4)), 0.0f, Float.intBitsToFloat((int) (np3Var2.a.e() >> 32)) * 0.05f, 10);
                final o6g F4 = y9w.F(u75.h(new d85(j4), new d85(j3)), Float.intBitsToFloat((int) (np3Var2.a.e() >> 32)) * 0.95f, 0.0f, 12);
                final int i2 = 1;
                final sdr sdrVar2 = this.b;
                final aqi aqiVar2 = this.c;
                return np3Var2.b(new Function1() { // from class: lbh
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        switch (i2) {
                            case 0:
                                opf opfVar = (opf) obj2;
                                opfVar.getClass();
                                aqi aqiVar22 = aqiVar2;
                                float f = ((gbh) aqiVar22.getValue()).a;
                                float f2 = ((gbh) aqiVar22.getValue()).c;
                                sdr sdrVar22 = sdrVar2;
                                if (f <= f2) {
                                    opfVar.a();
                                } else {
                                    int ceil = (int) Math.ceil((((gbh) aqiVar22.getValue()).c - (sdrVar22 != null ? ((Number) sdrVar22.getValue()).floatValue() : 0.0f)) / ((gbh) aqiVar22.getValue()).b);
                                    for (int i22 = 0; i22 < ceil; i22++) {
                                        float f3 = i22 * ((gbh) aqiVar22.getValue()).b;
                                        ou3 ou3Var = opfVar.a;
                                        ((xzi) ou3Var.b.b).m0(f3, 0.0f);
                                        try {
                                            opfVar.a();
                                            ((xzi) ou3Var.b.b).m0(-f3, -0.0f);
                                        } catch (Throwable th) {
                                            ((xzi) ou3Var.b.b).m0(-f3, -0.0f);
                                            throw th;
                                        }
                                    }
                                }
                                if ((sdrVar22 != null ? ((Number) sdrVar22.getValue()).floatValue() : 0.0f) != 0.0f) {
                                    jpa.A0(opfVar, F3, 0L, 0L, 0.0f, null, null, 6, 62);
                                }
                                if (((gbh) aqiVar22.getValue()).a > ((gbh) aqiVar22.getValue()).c) {
                                    jpa.A0(opfVar, F4, 0L, 0L, 0.0f, null, null, 6, 62);
                                }
                                return Unit.a;
                            default:
                                opf opfVar2 = (opf) obj2;
                                opfVar2.getClass();
                                aqi aqiVar3 = aqiVar2;
                                float f4 = ((hbh) aqiVar3.getValue()).a;
                                float f5 = ((hbh) aqiVar3.getValue()).c;
                                sdr sdrVar3 = sdrVar2;
                                if (f4 <= f5) {
                                    opfVar2.a();
                                } else {
                                    int ceil2 = (int) Math.ceil((((hbh) aqiVar3.getValue()).c - (sdrVar3 != null ? ((Number) sdrVar3.getValue()).floatValue() : 0.0f)) / ((hbh) aqiVar3.getValue()).b);
                                    for (int i3 = 0; i3 < ceil2; i3++) {
                                        float f6 = i3 * ((hbh) aqiVar3.getValue()).b;
                                        ou3 ou3Var2 = opfVar2.a;
                                        ((xzi) ou3Var2.b.b).m0(f6, 0.0f);
                                        try {
                                            opfVar2.a();
                                            ((xzi) ou3Var2.b.b).m0(-f6, -0.0f);
                                        } catch (Throwable th2) {
                                            ((xzi) ou3Var2.b.b).m0(-f6, -0.0f);
                                            throw th2;
                                        }
                                    }
                                }
                                if ((sdrVar3 != null ? ((Number) sdrVar3.getValue()).floatValue() : 0.0f) != 0.0f) {
                                    jpa.A0(opfVar2, F3, 0L, 0L, 0.0f, null, null, 6, 62);
                                }
                                if (((hbh) aqiVar3.getValue()).a > ((hbh) aqiVar3.getValue()).c) {
                                    jpa.A0(opfVar2, F4, 0L, 0L, 0.0f, null, null, 6, 62);
                                }
                                return Unit.a;
                        }
                    }
                });
        }
    }
}
