package defpackage;

import com.yandex.music.core.ui.compose.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class n2g implements pyc {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ n2g(int i, xsq xsqVar, hvq hvqVar, ml4 ml4Var) {
        this.a = 1;
        this.b = i;
        this.c = xsqVar;
        this.d = hvqVar;
        this.e = ml4Var;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.a) {
            case 0:
                ynn ynnVar = (ynn) this.c;
                Function2 function2 = (Function2) this.d;
                Function0 function0 = (Function0) this.e;
                a3g a3gVar = (a3g) obj;
                hq5 hq5Var = (hq5) obj2;
                int intValue = ((Integer) obj3).intValue();
                a3gVar.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((oq5) hq5Var).f(a3gVar) ? 4 : 2;
                }
                oq5 oq5Var = (oq5) hq5Var;
                if (!oq5Var.P(intValue & 1, (intValue & 19) != 18)) {
                    oq5Var.S();
                } else if (a3gVar instanceof z2g) {
                    oq5Var.Z(1970460261);
                    zgs zgsVar = ((z2g) a3gVar).a;
                    yci b = a.b(androidx.compose.ui.platform.a.a(vci.a, "block_tile"), ynnVar, 0L, 0.0f, null, function2, 14);
                    boolean f = oq5Var.f(function0);
                    Object K = oq5Var.K();
                    if (f || K == gq5.a) {
                        K = new ex(12, function0);
                        oq5Var.k0(K);
                    }
                    avf.j(zgsVar, b, this.b, null, null, null, null, (Function1) K, null, oq5Var, 100663296, 120);
                    oq5Var.p(false);
                } else if (a3gVar.equals(x2g.a)) {
                    oq5Var.Z(1971000529);
                    rvf.n(false, null, null, oq5Var, 6, 6);
                    oq5Var.p(false);
                } else {
                    if (!a3gVar.equals(y2g.a)) {
                        throw vz1.i(oq5Var, -1183365350, false);
                    }
                    oq5Var.Z(1971117554);
                    rvf.n(true, null, null, oq5Var, 6, 6);
                    oq5Var.p(false);
                }
                return Unit.a;
            case 1:
                xsq xsqVar = (xsq) this.c;
                hvq hvqVar = (hvq) this.d;
                ml4 ml4Var = (ml4) this.e;
                zsq zsqVar = (zsq) obj;
                hq5 hq5Var2 = (hq5) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                zsqVar.getClass();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= (intValue2 & 8) == 0 ? ((oq5) hq5Var2).f(zsqVar) : ((oq5) hq5Var2).h(zsqVar) ? 4 : 2;
                }
                if ((intValue2 & 19) == 18) {
                    oq5 oq5Var2 = (oq5) hq5Var2;
                    if (oq5Var2.z()) {
                        oq5Var2.S();
                        return Unit.a;
                    }
                }
                ild.l(this.b, xsqVar, hvqVar, zsqVar, ml4Var, null, hq5Var2, (intValue2 << 9) & 7168, 32);
                return Unit.a;
            case 2:
                nb6 nb6Var = (nb6) this.c;
                xsq xsqVar2 = (xsq) this.d;
                hvq hvqVar2 = (hvq) this.e;
                zsq zsqVar2 = (zsq) obj;
                hq5 hq5Var3 = (hq5) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                zsqVar2.getClass();
                if ((intValue3 & 6) == 0) {
                    intValue3 |= (intValue3 & 8) == 0 ? ((oq5) hq5Var3).f(zsqVar2) : ((oq5) hq5Var3).h(zsqVar2) ? 4 : 2;
                }
                if ((intValue3 & 19) == 18) {
                    oq5 oq5Var3 = (oq5) hq5Var3;
                    if (oq5Var3.z()) {
                        oq5Var3.S();
                        return Unit.a;
                    }
                }
                pcg.c(nb6Var, xsqVar2, this.b, hvqVar2, zsqVar2, hq5Var3, (intValue3 << 12) & 57344);
                return Unit.a;
            default:
                ynn ynnVar2 = (ynn) this.c;
                njt njtVar = (njt) this.d;
                yit yitVar = (yit) this.e;
                hq5 hq5Var4 = (hq5) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                ((androidx.compose.foundation.lazy.a) obj).getClass();
                oq5 oq5Var4 = (oq5) hq5Var4;
                if (oq5Var4.P(intValue4 & 1, (intValue4 & 17) != 16)) {
                    boolean h = oq5Var4.h(njtVar);
                    int i = this.b;
                    boolean d = h | oq5Var4.d(i) | oq5Var4.h(yitVar);
                    Object K2 = oq5Var4.K();
                    kjn kjnVar = gq5.a;
                    if (d || K2 == kjnVar) {
                        K2 = new hjt(i, 1, yitVar, njtVar);
                        oq5Var4.k0(K2);
                    }
                    yci b2 = a.b(vci.a, ynnVar2, 0L, 0.0f, null, (Function2) K2, 14);
                    boolean h2 = oq5Var4.h(njtVar) | oq5Var4.h(yitVar) | oq5Var4.d(i);
                    Object K3 = oq5Var4.K();
                    if (h2 || K3 == kjnVar) {
                        K3 = new ijt(i, 1, yitVar, njtVar);
                        oq5Var4.k0(K3);
                    }
                    Function0 function02 = (Function0) K3;
                    boolean h3 = oq5Var4.h(njtVar) | oq5Var4.h(yitVar);
                    Object K4 = oq5Var4.K();
                    if (h3 || K4 == kjnVar) {
                        K4 = new jjt(njtVar, yitVar, 1);
                        oq5Var4.k0(K4);
                    }
                    wyf.p(yitVar, function02, (Function0) K4, b2, oq5Var4, 0);
                } else {
                    oq5Var4.S();
                }
                return Unit.a;
        }
    }

    public /* synthetic */ n2g(Object obj, Object obj2, int i, Object obj3, int i2) {
        this.a = i2;
        this.c = obj;
        this.d = obj2;
        this.b = i;
        this.e = obj3;
    }
}
