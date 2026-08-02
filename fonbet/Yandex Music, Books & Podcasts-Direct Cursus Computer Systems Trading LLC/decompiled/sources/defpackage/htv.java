package defpackage;

import androidx.compose.foundation.layout.d;
import androidx.compose.ui.layout.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final /* synthetic */ class htv implements pyc {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ gtv c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ yci e;

    public /* synthetic */ htv(Function0 function0, gtv gtvVar, Function0 function02, yci yciVar, int i) {
        this.a = i;
        this.b = function0;
        this.c = gtvVar;
        this.d = function02;
        this.e = yciVar;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.a) {
            case 0:
                zkn zknVar = (zkn) obj;
                hq5 hq5Var = (hq5) obj2;
                int intValue = ((Integer) obj3).intValue();
                zknVar.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((oq5) hq5Var).f(zknVar) ? 4 : 2;
                }
                if ((intValue & 19) == 18) {
                    oq5 oq5Var = (oq5) hq5Var;
                    if (oq5Var.z()) {
                        oq5Var.S();
                        return Unit.a;
                    }
                }
                bs1 k = zknVar.b.k();
                act S = weo.S(200, 0, lya.c, 2);
                oq5 oq5Var2 = (oq5) hq5Var;
                Object K = oq5Var2.K();
                if (K == gq5.a) {
                    K = new ulv(15);
                    oq5Var2.k0(K);
                }
                ot0.l(k, (Function1) K, null, S, null, false, ild.C(-1968667850, new htv(this.b, this.c, this.d, this.e, 1), oq5Var2), oq5Var2, 1572912, 52);
                return Unit.a;
            default:
                bs1 bs1Var = (bs1) obj;
                hq5 hq5Var2 = (hq5) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                bs1Var.getClass();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= (intValue2 & 8) == 0 ? ((oq5) hq5Var2).f(bs1Var) : ((oq5) hq5Var2).h(bs1Var) ? 4 : 2;
                }
                if ((intValue2 & 19) == 18) {
                    oq5 oq5Var3 = (oq5) hq5Var2;
                    if (oq5Var3.z()) {
                        oq5Var3.S();
                        return Unit.a;
                    }
                }
                boolean z = bs1Var instanceof as1;
                vci vciVar = vci.a;
                Function0 function0 = this.b;
                kjn kjnVar = gq5.a;
                if (z) {
                    oq5 oq5Var4 = (oq5) hq5Var2;
                    oq5Var4.Z(-805345001);
                    yci c = d.c(vciVar, 1.0f);
                    boolean f = oq5Var4.f(function0);
                    Object K2 = oq5Var4.K();
                    if (f || K2 == kjnVar) {
                        K2 = new ex(27, function0);
                        oq5Var4.k0(K2);
                    }
                    yci e = a.e(c, (Function1) K2);
                    boolean z2 = (intValue2 & 14) == 4 || ((intValue2 & 8) != 0 && oq5Var4.h(bs1Var));
                    gtv gtvVar = this.c;
                    boolean f2 = z2 | oq5Var4.f(gtvVar);
                    Object K3 = oq5Var4.K();
                    if (f2 || K3 == kjnVar) {
                        K3 = new itv(0, bs1Var, gtvVar);
                        oq5Var4.k0(K3);
                    }
                    ksw.j(0, oq5Var4, e, (Function1) K3);
                    oq5Var4.p(false);
                } else if (bs1Var.equals(xr1.a) || (bs1Var instanceof zr1)) {
                    oq5 oq5Var5 = (oq5) hq5Var2;
                    oq5Var5.Z(-803922287);
                    yci c2 = d.c(vciVar, 1.0f);
                    Function0 function02 = this.d;
                    boolean f3 = oq5Var5.f(function02);
                    Object K4 = oq5Var5.K();
                    if (f3 || K4 == kjnVar) {
                        K4 = new ex(28, function02);
                        oq5Var5.k0(K4);
                    }
                    swf.e(0, 0, oq5Var5, a.e(c2, (Function1) K4));
                    oq5Var5.p(false);
                } else {
                    if (!(bs1Var instanceof yr1)) {
                        throw vz1.i((oq5) hq5Var2, -2104190216, false);
                    }
                    oq5 oq5Var6 = (oq5) hq5Var2;
                    oq5Var6.Z(-803580047);
                    qo6 qo6Var = qo6.d;
                    gce gceVar = gce.d;
                    yci c3 = d.c(vciVar, 1.0f);
                    boolean f4 = oq5Var6.f(function0);
                    Object K5 = oq5Var6.K();
                    if (f4 || K5 == kjnVar) {
                        K5 = new ex(29, function0);
                        oq5Var6.k0(K5);
                    }
                    swf.d(qo6Var, gceVar, a.e(c3, (Function1) K5), this.e, 0L, ((dq0) oq5Var6.j(eq0.a)).c.b, false, oq5Var6, 54, 80);
                    oq5Var6.p(false);
                }
                return Unit.a;
        }
    }
}
