package defpackage;

import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final /* synthetic */ class tud implements pyc {
    public final /* synthetic */ int a;
    public final /* synthetic */ q6k b;
    public final /* synthetic */ d85 c;
    public final /* synthetic */ Function1 d;
    public final /* synthetic */ Function0 e;

    public /* synthetic */ tud(q6k q6kVar, d85 d85Var, Function1 function1, Function0 function0, int i) {
        this.a = i;
        this.b = q6kVar;
        this.c = d85Var;
        this.d = function1;
        this.e = function0;
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
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 19) != 18)) {
                    bs1 k = zknVar.b.k();
                    boolean z = k instanceof as1;
                    q6k q6kVar = this.b;
                    if (z) {
                        oq5Var.Z(-959063126);
                        Object K = oq5Var.K();
                        Object obj4 = gq5.a;
                        if (K == obj4) {
                            K = vz1.h(oq5Var);
                        }
                        uoi uoiVar = (uoi) K;
                        w4k w4kVar = ((as1) k).a;
                        String M = rvf.M(R.string.app_name_new, oq5Var);
                        oq5Var.Z(246172960);
                        yci yciVar = vci.a;
                        yci e = d.e(yciVar, 44);
                        yud yudVar = (yud) q6kVar;
                        if (yudVar.m != null || yudVar.n) {
                            boolean f = oq5Var.f(q6kVar);
                            Function1 function1 = this.d;
                            boolean f2 = f | oq5Var.f(function1);
                            Function0 function0 = this.e;
                            boolean f3 = f2 | oq5Var.f(function0);
                            Object K2 = oq5Var.K();
                            if (f3 || K2 == obj4) {
                                K2 = new sud(q6kVar, function0, function1, 1);
                                oq5Var.k0(K2);
                            }
                            yciVar = a.d(yciVar, uoiVar, null, false, null, null, (Function0) K2, 28);
                        }
                        yci f4 = e.f(yciVar);
                        oq5Var.p(false);
                        irf.r(w4kVar, M, f4, null, hd6.c, 0.0f, null, oq5Var, 24576, 104);
                        oq5Var.p(false);
                    } else if (Intrinsics.d(k, xr1.a) || (k instanceof yr1)) {
                        oq5Var.Z(246206091);
                        quj.x(new avd(((yud) q6kVar).k), this.c, null, oq5Var, 0, 4);
                        oq5Var.p(false);
                    } else {
                        if (!(k instanceof zr1)) {
                            throw vz1.i(oq5Var, 246154070, false);
                        }
                        oq5Var.Z(246209259);
                        oq5Var.p(false);
                    }
                } else {
                    oq5Var.S();
                }
                return Unit.a;
            default:
                hq5 hq5Var2 = (hq5) obj2;
                ((Integer) obj3).getClass();
                ((am0) obj).getClass();
                boolean N = pd.N(hq5Var2);
                q6k q6kVar2 = this.b;
                w1g.j(N ? ((yud) q6kVar2).l.a : ((yud) q6kVar2).l.b, null, null, null, null, null, null, 0.0f, null, 0, ild.C(1251651399, new tud(q6kVar2, this.c, this.d, this.e, 0), hq5Var2), hq5Var2, 48, 1020);
                return Unit.a;
        }
    }
}
