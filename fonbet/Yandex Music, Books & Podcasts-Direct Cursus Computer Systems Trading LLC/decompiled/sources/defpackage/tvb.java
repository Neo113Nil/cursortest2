package defpackage;

import androidx.compose.ui.input.nestedscroll.a;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class tvb implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ sdr f;
    public final /* synthetic */ aqi g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ sdr l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;

    public /* synthetic */ tvb(q0k q0kVar, q0k q0kVar2, pj2 pj2Var, fvf fvfVar, sdr sdrVar, aqi aqiVar, ab0 ab0Var, c6h c6hVar, hvb hvbVar, pcu pcuVar, sdr sdrVar2, jub jubVar, List list, Function1 function1, wn5 wn5Var, int i) {
        this.a = i;
        this.b = q0kVar;
        this.c = q0kVar2;
        this.d = pj2Var;
        this.e = fvfVar;
        this.f = sdrVar;
        this.g = aqiVar;
        this.h = ab0Var;
        this.i = c6hVar;
        this.j = hvbVar;
        this.k = pcuVar;
        this.l = sdrVar2;
        this.m = jubVar;
        this.n = list;
        this.o = function1;
        this.p = wn5Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                q0k q0kVar = (q0k) this.b;
                q0k q0kVar2 = (q0k) this.c;
                pj2 pj2Var = (pj2) this.d;
                fvf fvfVar = (fvf) this.e;
                ab0 ab0Var = (ab0) this.h;
                c6h c6hVar = (c6h) this.i;
                hvb hvbVar = (hvb) this.j;
                pcu pcuVar = (pcu) this.k;
                jub jubVar = (jub) this.m;
                List list = (List) this.n;
                Function1 function1 = (Function1) this.o;
                wn5 wn5Var = (wn5) this.p;
                hq5 hq5Var = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var = (oq5) hq5Var;
                    if (oq5Var.z()) {
                        oq5Var.S();
                        break;
                    }
                }
                vwb.p(fvfVar, new xit(q0kVar, q0kVar2), this.f, this.g, ab0Var, c6hVar, pj2Var.a, hvbVar, pcuVar, this.l, jubVar, list, function1, wn5Var, null, hq5Var, 0);
            case 1:
                q0k q0kVar3 = (q0k) this.b;
                q0k q0kVar4 = (q0k) this.c;
                pj2 pj2Var2 = (pj2) this.d;
                fvf fvfVar2 = (fvf) this.e;
                ab0 ab0Var2 = (ab0) this.h;
                c6h c6hVar2 = (c6h) this.i;
                hvb hvbVar2 = (hvb) this.j;
                pcu pcuVar2 = (pcu) this.k;
                jub jubVar2 = (jub) this.m;
                List list2 = (List) this.n;
                Function1 function12 = (Function1) this.o;
                wn5 wn5Var2 = (wn5) this.p;
                hq5 hq5Var2 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var2 = (oq5) hq5Var2;
                    if (oq5Var2.z()) {
                        oq5Var2.S();
                        break;
                    }
                }
                cxb.k(fvfVar2, new xit(q0kVar3, q0kVar4), this.f, this.g, ab0Var2, c6hVar2, pj2Var2.a, hvbVar2, pcuVar2, this.l, jubVar2, list2, function12, wn5Var2, null, hq5Var2, 0);
            default:
                yci yciVar = (yci) this.b;
                wxi wxiVar = (wxi) this.c;
                rnl rnlVar = (rnl) this.d;
                fk0 fk0Var = (fk0) this.e;
                xxk xxkVar = (xxk) this.h;
                kub kubVar = (kub) this.i;
                aqi aqiVar = (aqi) this.j;
                Function0 function0 = (Function0) this.k;
                xan xanVar = (xan) this.m;
                sdr sdrVar = (sdr) this.n;
                xo6 xo6Var = (xo6) this.o;
                ek1 ek1Var = (ek1) this.p;
                hq5 hq5Var3 = (hq5) obj;
                int intValue = ((Integer) obj2).intValue();
                oq5 oq5Var3 = (oq5) hq5Var3;
                if (oq5Var3.P(intValue & 1, (intValue & 3) != 2)) {
                    yci a = a.a(yciVar, wxiVar, null);
                    mj2 mj2Var = rnlVar.d;
                    boolean h = oq5Var3.h(fk0Var);
                    Object K = oq5Var3.K();
                    if (h || K == gq5.a) {
                        K = new kw4(fk0Var, 1);
                        oq5Var3.k0(K);
                    }
                    vq1.m(a, mj2Var, (Function0) K, ild.C(1425153353, new fab(xxkVar, rnlVar, kubVar, this.f, this.g, this.l, aqiVar, function0, fk0Var, xanVar, sdrVar, xo6Var, ek1Var), oq5Var3), oq5Var3, 3072);
                } else {
                    oq5Var3.S();
                }
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ tvb(yci yciVar, dyi dyiVar, rnl rnlVar, fk0 fk0Var, xxk xxkVar, kub kubVar, aqi aqiVar, aqi aqiVar2, aqi aqiVar3, aqi aqiVar4, Function0 function0, xan xanVar, aqi aqiVar5, xo6 xo6Var, ek1 ek1Var) {
        this.a = 2;
        this.b = yciVar;
        this.c = dyiVar;
        this.d = rnlVar;
        this.e = fk0Var;
        this.h = xxkVar;
        this.i = kubVar;
        this.f = aqiVar;
        this.g = aqiVar2;
        this.l = aqiVar3;
        this.j = aqiVar4;
        this.k = function0;
        this.m = xanVar;
        this.n = aqiVar5;
        this.o = xo6Var;
        this.p = ek1Var;
    }
}
