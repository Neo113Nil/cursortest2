package defpackage;

import androidx.compose.ui.layout.a;
import kotlin.Unit;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class zk0 extends uif implements pyc {
    public final /* synthetic */ int r;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Object t;
    public final /* synthetic */ Object u;
    public final /* synthetic */ Object v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zk0(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        super(3);
        this.r = i;
        this.s = obj;
        this.t = obj2;
        this.u = obj3;
        this.v = obj4;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Object obj4;
        switch (this.r) {
            case 0:
                am0 am0Var = (am0) obj;
                hq5 hq5Var = (hq5) obj2;
                int intValue = ((Number) obj3).intValue();
                s2r s2rVar = (s2r) this.s;
                hl0 hl0Var = (hl0) this.u;
                if ((intValue & 6) == 0) {
                    intValue |= (intValue & 8) == 0 ? ((oq5) hq5Var).f(am0Var) : ((oq5) hq5Var).h(am0Var) ? 4 : 2;
                }
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 19) != 18)) {
                    boolean f = oq5Var.f(s2rVar);
                    Object obj5 = this.t;
                    boolean h = f | oq5Var.h(obj5) | oq5Var.h(hl0Var);
                    Object K = oq5Var.K();
                    kjn kjnVar = gq5.a;
                    if (h || K == kjnVar) {
                        K = new lj0(1, s2rVar, obj5, hl0Var);
                        oq5Var.k0(K);
                    }
                    gld.k(am0Var, (Function1) K, oq5Var);
                    tpi tpiVar = hl0Var.d;
                    am0Var.getClass();
                    tpiVar.m(obj5, ((bm0) am0Var).b);
                    Object K2 = oq5Var.K();
                    if (K2 == kjnVar) {
                        K2 = new cl0(am0Var);
                        oq5Var.k0(K2);
                    }
                    ((wn5) this.v).invoke((cl0) K2, obj5, oq5Var, 0);
                } else {
                    oq5Var.S();
                }
                return Unit.a;
            case 1:
                yci yciVar = (yci) obj;
                ((Number) obj3).intValue();
                Object obj6 = (Function0) this.v;
                oxn oxnVar = (oxn) this.s;
                yciVar.getClass();
                oq5 oq5Var2 = (oq5) ((hq5) obj2);
                oq5Var2.Z(231415144);
                oq5Var2.Z(-1020090083);
                Object K3 = oq5Var2.K();
                Object obj7 = gq5.a;
                if (K3 == obj7) {
                    K3 = szf.g0(new enj(0L));
                    oq5Var2.k0(K3);
                }
                aqi aqiVar = (aqi) K3;
                oq5Var2.p(false);
                oq5Var2.Z(-1020087938);
                Object K4 = oq5Var2.K();
                if (K4 == obj7) {
                    K4 = szf.g0(new hqe(0L));
                    oq5Var2.k0(K4);
                }
                aqi aqiVar2 = (aqi) K4;
                oq5Var2.p(false);
                Object K5 = oq5Var2.K();
                if (K5 == obj7) {
                    K5 = tlm.f(gld.R(g.a, oq5Var2), oq5Var2);
                }
                mm6 mm6Var = ((fs5) K5).a;
                oq5Var2.Z(-1020083824);
                Object K6 = oq5Var2.K();
                if (K6 == obj7) {
                    K6 = new cd(aqiVar, aqiVar2, 2);
                    oq5Var2.k0(K6);
                }
                oq5Var2.p(false);
                yci d = a.d(yciVar, (Function1) K6);
                ayn aynVar = oxnVar.a;
                Object obj8 = oxnVar.b;
                aynVar.getClass();
                boolean z = ((Boolean) szf.U(new j5n(3, obj8, aynVar)).getValue()).booleanValue() || !oxnVar.a.g();
                dna dnaVar = (dna) this.t;
                oq5Var2.Z(-1020069521);
                boolean h2 = oq5Var2.h(mm6Var) | oq5Var2.f(oxnVar) | oq5Var2.f((Function1) this.u);
                Function1 function1 = (Function1) this.u;
                Object K7 = oq5Var2.K();
                if (h2 || K7 == obj7) {
                    Object iiVar = new ii(mm6Var, function1, oxnVar, aqiVar, aqiVar2);
                    oq5Var2.k0(iiVar);
                    K7 = iiVar;
                }
                Function1 function12 = (Function1) K7;
                oq5Var2.p(false);
                oq5Var2.Z(-1020052768);
                boolean f2 = oq5Var2.f(oxnVar) | oq5Var2.f(obj6);
                Object K8 = oq5Var2.K();
                if (f2 || K8 == obj7) {
                    K8 = new j5n(2, oxnVar, obj6);
                    oq5Var2.k0(K8);
                }
                Function0 function0 = (Function0) K8;
                oq5Var2.p(false);
                oq5Var2.Z(-1020048579);
                boolean f3 = oq5Var2.f(oxnVar);
                Object K9 = oq5Var2.K();
                if (f3 || K9 == obj7) {
                    K9 = new y5(27, oxnVar);
                    oq5Var2.k0(K9);
                }
                Function2 function2 = (Function2) K9;
                oq5Var2.p(false);
                d.getClass();
                function12.getClass();
                function0.getClass();
                function2.getClass();
                yci q = vnj.q(d, new yoa(aynVar, function0, z, dnaVar, function12, function2));
                oq5Var2.p(false);
                return q;
            default:
                yci yciVar2 = (yci) obj;
                ((Number) obj3).intValue();
                axf axfVar = (axf) this.t;
                f3r f3rVar = (f3r) this.s;
                ybs ybsVar = (ybs) this.u;
                oq5 oq5Var3 = (oq5) ((hq5) obj2);
                oq5Var3.Z(-84507373);
                boolean booleanValue = ((Boolean) oq5Var3.j(es5.w)).booleanValue();
                boolean g = oq5Var3.g(booleanValue);
                Object K10 = oq5Var3.K();
                kjn kjnVar2 = gq5.a;
                if (g || K10 == kjnVar2) {
                    K10 = new kw6(booleanValue);
                    oq5Var3.k0(K10);
                }
                kw6 kw6Var = (kw6) K10;
                boolean z2 = f3rVar.a != 16;
                if (((Boolean) ((dwf) ((kpv) oq5Var3.j(es5.t))).c.getValue()).booleanValue() && axfVar.b() && rds.b(ybsVar.b) && z2) {
                    oq5Var3.Z(808460990);
                    mn0 mn0Var = ybsVar.a;
                    rds rdsVar = new rds(ybsVar.b);
                    boolean h3 = oq5Var3.h(kw6Var);
                    Object K11 = oq5Var3.K();
                    if (h3 || K11 == kjnVar2) {
                        K11 = new glp(kw6Var, null, 24);
                        oq5Var3.k0(K11);
                    }
                    gld.y(mn0Var, rdsVar, (Function2) K11, oq5Var3);
                    boolean f4 = oq5Var3.f(ybsVar) | oq5Var3.h(kw6Var) | oq5Var3.h((mnj) this.v) | oq5Var3.h(axfVar) | oq5Var3.f(f3rVar);
                    mnj mnjVar = (mnj) this.v;
                    ybs ybsVar2 = (ybs) this.u;
                    Object K12 = oq5Var3.K();
                    if (f4 || K12 == kjnVar2) {
                        qas qasVar = new qas(kw6Var, mnjVar, ybsVar2, axfVar, f3rVar, 0);
                        oq5Var3.k0(qasVar);
                        K12 = qasVar;
                    }
                    obj4 = androidx.compose.ui.draw.a.c(yciVar2, (Function1) K12);
                    oq5Var3.p(false);
                } else {
                    oq5Var3.Z(810474750);
                    oq5Var3.p(false);
                    obj4 = vci.a;
                }
                oq5Var3.p(false);
                return obj4;
        }
    }
}
