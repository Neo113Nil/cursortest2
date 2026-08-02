package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class hqq implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ hqq(String str, k2s k2sVar, boolean z, fvf fvfVar, Function0 function0, Function0 function02, Function1 function1, yci yciVar, int i) {
        this.c = str;
        this.d = k2sVar;
        this.b = z;
        this.e = fvfVar;
        this.f = function0;
        this.g = function02;
        this.h = function1;
        this.i = yciVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                int R = rvf.R(1);
                v7g.i((String) this.c, (k2s) this.d, this.b, (fvf) this.e, (Function0) this.f, (Function0) this.g, (Function1) this.h, (yci) this.i, (hq5) obj, R);
                break;
            default:
                ltu ltuVar = (ltu) this.c;
                s2v s2vVar = (s2v) this.d;
                sdr sdrVar = (sdr) this.e;
                sdr sdrVar2 = (sdr) this.f;
                sdr sdrVar3 = (sdr) this.g;
                ab0 ab0Var = (ab0) this.h;
                sdr sdrVar4 = (sdr) this.i;
                hq5 hq5Var = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var = (oq5) hq5Var;
                    if (oq5Var.z()) {
                        oq5Var.S();
                        break;
                    }
                }
                ivf.r(ild.C(1943637123, new ojt(ltuVar, s2vVar, sdrVar, sdrVar2, sdrVar3, ab0Var, 1), hq5Var), ild.C(-847554198, new aqp(13, ltuVar, sdrVar4, sdrVar2), hq5Var), ild.C(-302486474, new mtu(ltuVar, 3), hq5Var), this.b, null, null, null, hq5Var, 438, 112);
        }
        return Unit.a;
    }

    public /* synthetic */ hqq(boolean z, ltu ltuVar, s2v s2vVar, sdr sdrVar, sdr sdrVar2, aqi aqiVar, ab0 ab0Var, aqi aqiVar2) {
        this.b = z;
        this.c = ltuVar;
        this.d = s2vVar;
        this.e = sdrVar;
        this.f = sdrVar2;
        this.g = aqiVar;
        this.h = ab0Var;
        this.i = aqiVar2;
    }
}
