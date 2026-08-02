package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class nvb implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ q0k d;
    public final /* synthetic */ q0k e;
    public final /* synthetic */ pj2 f;
    public final /* synthetic */ fvf g;
    public final /* synthetic */ sdr h;
    public final /* synthetic */ aqi i;
    public final /* synthetic */ ab0 j;
    public final /* synthetic */ c6h k;
    public final /* synthetic */ hvb l;
    public final /* synthetic */ pcu m;
    public final /* synthetic */ sdr n;
    public final /* synthetic */ jub o;
    public final /* synthetic */ List p;
    public final /* synthetic */ Function1 q;
    public final /* synthetic */ wn5 r;

    public /* synthetic */ nvb(float f, float f2, q0k q0kVar, q0k q0kVar2, pj2 pj2Var, fvf fvfVar, sdr sdrVar, aqi aqiVar, ab0 ab0Var, c6h c6hVar, hvb hvbVar, pcu pcuVar, aqi aqiVar2, jub jubVar, List list, Function1 function1, wn5 wn5Var, int i) {
        this.a = i;
        this.b = f;
        this.c = f2;
        this.d = q0kVar;
        this.e = q0kVar2;
        this.f = pj2Var;
        this.g = fvfVar;
        this.h = sdrVar;
        this.i = aqiVar;
        this.j = ab0Var;
        this.k = c6hVar;
        this.l = hvbVar;
        this.m = pcuVar;
        this.n = aqiVar2;
        this.o = jubVar;
        this.p = list;
        this.q = function1;
        this.r = wn5Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        hq5 hq5Var = (hq5) obj;
        switch (this.a) {
            case 0:
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var = (oq5) hq5Var;
                    if (oq5Var.z()) {
                        oq5Var.S();
                        break;
                    }
                }
                irv.a(0.0f, ff7.Q(this.b, hq5Var), this.c, ild.C(1383512693, new tvb(this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, 0), hq5Var), hq5Var, 3072, 1);
            default:
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var2 = (oq5) hq5Var;
                    if (oq5Var2.z()) {
                        oq5Var2.S();
                        break;
                    }
                }
                irv.a(0.0f, ff7.Q(this.b, hq5Var), this.c, ild.C(1955022327, new tvb(this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, 1), hq5Var), hq5Var, 3072, 1);
        }
        return Unit.a;
    }
}
