package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class hw5 implements pyc {
    public final /* synthetic */ int a;
    public final /* synthetic */ aqi b;
    public final /* synthetic */ String c;

    public /* synthetic */ hw5(int i, aqi aqiVar, String str) {
        this.a = i;
        this.b = aqiVar;
        this.c = str;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.a) {
            case 0:
                hq5 hq5Var = (hq5) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((dh3) obj).getClass();
                if ((intValue & 17) == 16) {
                    oq5 oq5Var = (oq5) hq5Var;
                    if (oq5Var.z()) {
                        oq5Var.S();
                        break;
                    }
                }
                final aqi aqiVar = this.b;
                String str = (String) aqiVar.getValue();
                oq5 oq5Var2 = (oq5) hq5Var;
                boolean f = oq5Var2.f(aqiVar);
                final String str2 = this.c;
                boolean f2 = f | oq5Var2.f(str2);
                Object K = oq5Var2.K();
                if (f2 || K == gq5.a) {
                    final int i = 0;
                    K = new Function1() { // from class: jw5
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj4) {
                            cds cdsVar = (cds) obj4;
                            switch (i) {
                                case 0:
                                    cdsVar.getClass();
                                    if (cdsVar.c()) {
                                        aqiVar.setValue(str2);
                                    }
                                    break;
                                default:
                                    cdsVar.getClass();
                                    if (cdsVar.c()) {
                                        aqiVar.setValue(str2);
                                    }
                                    break;
                            }
                            return Unit.a;
                        }
                    };
                    oq5Var2.k0(K);
                }
                xcs.b(str, null, 0L, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, (Function1) K, null, oq5Var2, 0, 3120, 88062);
                break;
            default:
                hq5 hq5Var2 = (hq5) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((dh3) obj).getClass();
                if ((intValue2 & 17) == 16) {
                    oq5 oq5Var3 = (oq5) hq5Var2;
                    if (oq5Var3.z()) {
                        oq5Var3.S();
                        break;
                    }
                }
                final aqi aqiVar2 = this.b;
                String str3 = (String) aqiVar2.getValue();
                oq5 oq5Var4 = (oq5) hq5Var2;
                boolean f3 = oq5Var4.f(aqiVar2);
                final String str4 = this.c;
                boolean f4 = f3 | oq5Var4.f(str4);
                Object K2 = oq5Var4.K();
                if (f4 || K2 == gq5.a) {
                    final int i2 = 1;
                    K2 = new Function1() { // from class: jw5
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj4) {
                            cds cdsVar = (cds) obj4;
                            switch (i2) {
                                case 0:
                                    cdsVar.getClass();
                                    if (cdsVar.c()) {
                                        aqiVar2.setValue(str4);
                                    }
                                    break;
                                default:
                                    cdsVar.getClass();
                                    if (cdsVar.c()) {
                                        aqiVar2.setValue(str4);
                                    }
                                    break;
                            }
                            return Unit.a;
                        }
                    };
                    oq5Var4.k0(K2);
                }
                xcs.b(str3, null, 0L, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, (Function1) K2, null, oq5Var4, 0, 3120, 88062);
                break;
        }
        return Unit.a;
    }
}
