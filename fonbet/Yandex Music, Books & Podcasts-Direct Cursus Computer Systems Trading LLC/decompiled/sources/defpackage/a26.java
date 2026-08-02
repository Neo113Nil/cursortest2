package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class a26 implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ y06 b;
    public final /* synthetic */ c26 c;
    public final /* synthetic */ fvf d;
    public final /* synthetic */ List e;
    public final /* synthetic */ mm6 f;
    public final /* synthetic */ yci g;
    public final /* synthetic */ xqc h;
    public final /* synthetic */ eoe i;
    public final /* synthetic */ om7 j;
    public final /* synthetic */ vm k;
    public final /* synthetic */ o16 l;
    public final /* synthetic */ tvd m;

    public /* synthetic */ a26(y06 y06Var, c26 c26Var, fvf fvfVar, List list, mm6 mm6Var, yci yciVar, xqc xqcVar, eoe eoeVar, om7 om7Var, vm vmVar, o16 o16Var, tvd tvdVar) {
        this.b = y06Var;
        this.c = c26Var;
        this.d = fvfVar;
        this.e = list;
        this.f = mm6Var;
        this.g = yciVar;
        this.h = xqcVar;
        this.i = eoeVar;
        this.j = om7Var;
        this.k = vmVar;
        this.l = o16Var;
        this.m = tvdVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        lvf lvfVar;
        List list;
        fvf fvfVar;
        switch (this.a) {
            case 0:
                hq5 hq5Var = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var = (oq5) hq5Var;
                    if (oq5Var.z()) {
                        oq5Var.S();
                        return Unit.a;
                    }
                }
                c26 c26Var = this.c;
                boolean booleanValue = ((Boolean) gld.M(c26Var.k(), hq5Var).getValue()).booleanValue();
                oq5 oq5Var2 = (oq5) hq5Var;
                boolean h = oq5Var2.h(c26Var);
                Object K = oq5Var2.K();
                if (h || K == gq5.a) {
                    K = new e65(0, c26Var, c26.class, "onRefresh", "onRefresh()V", 0, 22);
                    oq5Var2.k0(K);
                }
                bcx.j(booleanValue, (Function0) ((h9f) K), ild.C(-641957262, new a26(this.b, c26Var, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m), oq5Var2), oq5Var2, 384);
                return Unit.a;
            default:
                hq5 hq5Var2 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var3 = (oq5) hq5Var2;
                    if (oq5Var3.z()) {
                        oq5Var3.S();
                        return Unit.a;
                    }
                }
                y06 y06Var = this.b;
                Continuation continuation = null;
                if (y06Var instanceof w06) {
                    oq5 oq5Var4 = (oq5) hq5Var2;
                    oq5Var4.Z(940682775);
                    lvf a = ovf.a(((w06) y06Var).a, oq5Var4);
                    oq5Var4.p(false);
                    lvfVar = a;
                } else {
                    if (!y06Var.equals(v06.a) && !y06Var.equals(x06.a)) {
                        throw vz1.i((oq5) hq5Var2, 1554363051, false);
                    }
                    oq5 oq5Var5 = (oq5) hq5Var2;
                    oq5Var5.Z(940866635);
                    oq5Var5.p(false);
                    lvfVar = null;
                }
                Unit unit = Unit.a;
                oq5 oq5Var6 = (oq5) hq5Var2;
                c26 c26Var2 = this.c;
                boolean h2 = oq5Var6.h(c26Var2);
                fvf fvfVar2 = this.d;
                boolean f = h2 | oq5Var6.f(fvfVar2);
                Object K2 = oq5Var6.K();
                kjn kjnVar = gq5.a;
                if (f || K2 == kjnVar) {
                    K2 = new vv4(c26Var2, fvfVar2, continuation, 19);
                    oq5Var6.k0(K2);
                }
                gld.w(oq5Var6, unit, (Function2) K2);
                mm6 mm6Var = this.f;
                boolean f2 = oq5Var6.f(mm6Var);
                Object K3 = oq5Var6.K();
                if (f2 || K3 == kjnVar) {
                    K3 = c26Var2.w(mm6Var);
                    oq5Var6.k0(K3);
                }
                krf krfVar = (krf) K3;
                wn5 C = ild.C(1568530089, new sh1(26, this.l, c26Var2, this.m), oq5Var6);
                boolean h3 = oq5Var6.h(lvfVar) | oq5Var6.h(c26Var2);
                xqc xqcVar = this.h;
                boolean f3 = h3 | oq5Var6.f(xqcVar);
                List list2 = this.e;
                boolean f4 = f3 | oq5Var6.f(list2) | oq5Var6.f(fvfVar2);
                eoe eoeVar = this.i;
                boolean f5 = f4 | oq5Var6.f(eoeVar);
                Object K4 = oq5Var6.K();
                if (f5 || K4 == kjnVar) {
                    list = list2;
                    fvfVar = fvfVar2;
                    m10 m10Var = new m10(lvfVar, fvfVar, eoeVar, c26Var2, xqcVar, list, 1);
                    oq5Var6.k0(m10Var);
                    K4 = m10Var;
                } else {
                    list = list2;
                    fvfVar = fvfVar2;
                }
                fvf fvfVar3 = fvfVar;
                irf.u(list, krfVar, this.g, C, (Function1) K4, fvfVar3, this.j, 0, null, this.k, 0.0f, 0, oq5Var6, 3072, 0, 3456);
                return Unit.a;
        }
    }

    public /* synthetic */ a26(c26 c26Var, y06 y06Var, fvf fvfVar, List list, mm6 mm6Var, yci yciVar, xqc xqcVar, eoe eoeVar, om7 om7Var, vm vmVar, o16 o16Var, tvd tvdVar) {
        this.c = c26Var;
        this.b = y06Var;
        this.d = fvfVar;
        this.e = list;
        this.f = mm6Var;
        this.g = yciVar;
        this.h = xqcVar;
        this.i = eoeVar;
        this.j = om7Var;
        this.k = vmVar;
        this.l = o16Var;
        this.m = tvdVar;
    }
}
