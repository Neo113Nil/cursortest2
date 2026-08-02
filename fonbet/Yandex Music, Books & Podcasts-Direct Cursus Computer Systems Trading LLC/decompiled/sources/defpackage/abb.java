package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class abb implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ Function2 e;
    public final /* synthetic */ wn5 f;
    public final /* synthetic */ wn5 g;
    public final /* synthetic */ float h;
    public final /* synthetic */ sdr i;

    public /* synthetic */ abb(Function0 function0, Function0 function02, Function0 function03, Function2 function2, wn5 wn5Var, wn5 wn5Var2, float f, sdr sdrVar, int i) {
        this.a = i;
        this.b = function0;
        this.c = function02;
        this.d = function03;
        this.e = function2;
        this.f = wn5Var;
        this.g = wn5Var2;
        this.h = f;
        this.i = sdrVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        wn5 C;
        switch (this.a) {
            case 0:
                hq5 hq5Var = (hq5) obj;
                int intValue = ((Integer) obj2).intValue();
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 3) != 2)) {
                    zwf.i(((dq0) oq5Var.j(eq0.a)).b.a, ild.C(195108249, new abb(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, 1), oq5Var), oq5Var, 48);
                } else {
                    oq5Var.S();
                }
                break;
            default:
                hq5 hq5Var2 = (hq5) obj;
                int intValue2 = ((Integer) obj2).intValue();
                oq5 oq5Var2 = (oq5) hq5Var2;
                if (oq5Var2.P(intValue2 & 1, (intValue2 & 3) != 2)) {
                    t7g.h(gut.p1(vci.a), this.b, this.c, this.d, oq5Var2, 0, 0);
                    Function2 function2 = this.e;
                    sdr sdrVar = this.i;
                    if (function2 == null) {
                        oq5Var2.Z(1379429365);
                        oq5Var2.p(false);
                        C = null;
                    } else {
                        oq5Var2.Z(1379429366);
                        C = ild.C(-115759177, new t1b(5, sdrVar, function2), oq5Var2);
                        oq5Var2.p(false);
                    }
                    oq5Var2.Z(1379722192);
                    wn5 C2 = ild.C(1150968881, new t1b(6, sdrVar, this.f), oq5Var2);
                    oq5Var2.p(false);
                    wdp.S(this.g, null, null, null, C, null, C2, null, ild.C(-226055827, new wd1(sdrVar, 2), oq5Var2), null, false, this.h, 0.0f, 0.0f, oq5Var2, 100663296, 0, 28334);
                } else {
                    oq5Var2.S();
                }
                break;
        }
        return Unit.a;
    }
}
