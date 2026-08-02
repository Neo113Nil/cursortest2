package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class ud1 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ wn5 e;
    public final /* synthetic */ float f;
    public final /* synthetic */ sdr g;

    public /* synthetic */ ud1(Function0 function0, Function0 function02, Function0 function03, wn5 wn5Var, float f, sdr sdrVar, int i) {
        this.a = i;
        this.b = function0;
        this.c = function02;
        this.d = function03;
        this.e = wn5Var;
        this.f = f;
        this.g = sdrVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                hq5 hq5Var = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var = (oq5) hq5Var;
                    if (oq5Var.z()) {
                        oq5Var.S();
                        break;
                    }
                }
                zwf.i(((dq0) ((oq5) hq5Var).j(eq0.a)).b.a, ild.C(-1942670512, new ud1(this.b, this.c, this.d, this.e, this.f, this.g, 1), hq5Var), hq5Var, 48);
            default:
                hq5 hq5Var2 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var2 = (oq5) hq5Var2;
                    if (oq5Var2.z()) {
                        oq5Var2.S();
                        break;
                    }
                }
                t7g.h(gut.p1(vci.a), this.b, this.c, this.d, hq5Var2, 0, 0);
                oq5 oq5Var3 = (oq5) hq5Var2;
                oq5Var3.Z(587472313);
                sdr sdrVar = this.g;
                wn5 C = ild.C(2003707365, new wd1(sdrVar, 0), oq5Var3);
                oq5Var3.p(false);
                wdp.S(this.e, null, null, null, null, null, C, null, ild.C(-805270020, new wd1(sdrVar, 1), hq5Var2), null, false, this.f, 0.0f, 0.0f, hq5Var2, 100663296, 0, 28350);
        }
        return Unit.a;
    }
}
