package defpackage;

import androidx.compose.runtime.internal.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class gsl implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ gsl(qzl qzlVar, nab nabVar, thj thjVar, Function0 function0, boolean z, boolean z2, boolean z3, tvd tvdVar) {
        this.a = 1;
        this.b = qzlVar;
        this.c = nabVar;
        this.d = thjVar;
        this.i = function0;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = tvdVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [boolean, int] */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        thj thjVar;
        tvd tvdVar;
        int i;
        kjn kjnVar;
        ?? r4;
        oq5 oq5Var;
        thj thjVar2;
        kjn kjnVar2;
        boolean z;
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                wdg.e((qzl) this.b, this.e, this.f, this.g, (tvd) this.h, (nab) this.c, (thj) this.d, (yci) this.i, (hq5) obj, rvf.R(1));
                break;
            case 1:
                qzl qzlVar = (qzl) this.b;
                nab nabVar = (nab) this.c;
                thj thjVar3 = (thj) this.d;
                Function0 function0 = (Function0) this.i;
                tvd tvdVar2 = (tvd) this.h;
                hq5 hq5Var = (hq5) obj;
                int intValue = ((Integer) obj2).intValue();
                oq5 oq5Var2 = (oq5) hq5Var;
                if (oq5Var2.P(intValue & 1, (intValue & 3) != 2)) {
                    laa laaVar = (laa) gld.O(qzlVar.q, oq5Var2).getValue();
                    boolean h = oq5Var2.h(qzlVar) | oq5Var2.h(nabVar) | oq5Var2.h(thjVar3);
                    Object K = oq5Var2.K();
                    kjn kjnVar3 = gq5.a;
                    if (h || K == kjnVar3) {
                        K = new esl(qzlVar, nabVar, thjVar3, 0);
                        oq5Var2.k0(K);
                    }
                    Function0 function02 = (Function0) K;
                    Function0 function03 = function0;
                    boolean z2 = this.e;
                    oq5 oq5Var3 = oq5Var2;
                    etn.r(laaVar, function02, function03, z2, null, 0, oq5Var3, 0, 48);
                    if (this.f) {
                        oq5Var3.Z(1479373474);
                        boolean booleanValue = ((Boolean) gld.O(qzlVar.m, oq5Var3).getValue()).booleanValue();
                        int intValue2 = ((Number) gld.O(qzlVar.n, oq5Var3).getValue()).intValue();
                        boolean h2 = oq5Var3.h(qzlVar) | oq5Var3.h(nabVar) | oq5Var3.h(thjVar3);
                        Object K2 = oq5Var3.K();
                        if (h2 || K2 == kjnVar3) {
                            K2 = new esl(qzlVar, nabVar, thjVar3, 1);
                            oq5Var3.k0(K2);
                        }
                        thjVar = thjVar3;
                        i = 1476652728;
                        tvdVar = tvdVar2;
                        r4 = 0;
                        kjnVar = kjnVar3;
                        cb0.a(booleanValue, intValue2, function03, (Function0) K2, false, false, false, null, null, 0, oq5Var3, 0, 1008);
                        oq5Var = oq5Var3;
                    } else {
                        thjVar = thjVar3;
                        tvdVar = tvdVar2;
                        i = 1476652728;
                        kjnVar = kjnVar3;
                        r4 = 0;
                        oq5Var3.Z(1476652728);
                        oq5Var = oq5Var3;
                    }
                    oq5Var.p(r4);
                    if (this.g) {
                        oq5Var.Z(1479775823);
                        d85 a = ((q9b) oq5Var.j(s9b.a)).a();
                        ta5 a2 = sa5.a(qx0.c, b2c.n, oq5Var, r4);
                        int i2 = oq5Var.P;
                        a l = oq5Var.l();
                        yci H = vnj.H(oq5Var, vci.a);
                        xp5.T.getClass();
                        grb grbVar = wp5.b;
                        oq5Var.d0();
                        if (oq5Var.O) {
                            oq5Var.k(grbVar);
                        } else {
                            oq5Var.n0();
                        }
                        g0g.U(oq5Var, a2, wp5.f);
                        g0g.U(oq5Var, l, wp5.e);
                        kb5 kb5Var = wp5.g;
                        if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i2))) {
                            ouj.x(i2, oq5Var, i2, kb5Var);
                        }
                        g0g.U(oq5Var, H, wp5.d);
                        thjVar2 = thjVar;
                        boolean h3 = oq5Var.h(qzlVar) | oq5Var.h(nabVar) | oq5Var.h(thjVar2);
                        Object K3 = oq5Var.K();
                        kjnVar2 = kjnVar;
                        if (h3 || K3 == kjnVar2) {
                            K3 = new esl(qzlVar, nabVar, thjVar2, 2);
                            oq5Var.k0(K3);
                        }
                        y1g.q((Function0) K3, function03, a, oq5Var, 0, 0);
                        function03 = function03;
                        oq5Var.p(true);
                    } else {
                        thjVar2 = thjVar;
                        kjnVar2 = kjnVar;
                        oq5Var.Z(i);
                    }
                    oq5Var.p(r4);
                    if (z2) {
                        oq5Var.Z(1480280441);
                        boolean booleanValue2 = ((Boolean) gld.O(qzlVar.l, oq5Var).getValue()).booleanValue();
                        oq5Var.p(r4);
                        z = booleanValue2;
                    } else {
                        oq5Var.Z(1480379083);
                        oq5Var.p(r4);
                        z = r4;
                    }
                    Object K4 = oq5Var.K();
                    if (K4 == kjnVar2) {
                        K4 = szf.U(new nr(tvdVar, 22));
                        oq5Var.k0(K4);
                    }
                    boolean booleanValue3 = ((Boolean) ((sdr) K4).getValue()).booleanValue();
                    boolean h4 = oq5Var.h(qzlVar) | oq5Var.h(nabVar) | oq5Var.h(thjVar2);
                    Object K5 = oq5Var.K();
                    if (h4 || K5 == kjnVar2) {
                        K5 = new esl(qzlVar, nabVar, thjVar2, 3);
                        oq5Var.k0(K5);
                    }
                    y5g.h(z, function03, (Function0) K5, booleanValue3, z2, oq5Var, 0, 0);
                } else {
                    oq5Var2.S();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                rzf.h((az2) this.b, this.e, this.f, this.g, (Function0) this.h, (Function0) this.c, (Function0) this.d, (yci) this.i, (hq5) obj, rvf.R(1));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ gsl(Object obj, boolean z, boolean z2, boolean z3, Object obj2, Object obj3, Object obj4, yci yciVar, int i, int i2) {
        this.a = i2;
        this.b = obj;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = obj2;
        this.c = obj3;
        this.d = obj4;
        this.i = yciVar;
    }
}
