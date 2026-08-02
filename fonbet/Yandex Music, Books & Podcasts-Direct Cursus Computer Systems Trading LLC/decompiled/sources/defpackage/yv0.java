package defpackage;

import android.content.Context;
import android.os.Bundle;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class yv0 extends uif implements Function2 {
    public final /* synthetic */ int r = 1;
    public final /* synthetic */ Context s;
    public final /* synthetic */ aw0 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yv0(aw0 aw0Var, Context context) {
        super(2);
        this.t = aw0Var;
        this.s = context;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        aw0 aw0Var;
        switch (this.r) {
            case 0:
                hq5 hq5Var = (hq5) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var = (oq5) hq5Var;
                    if (oq5Var.z()) {
                        oq5Var.S();
                        break;
                    }
                }
                oq5 oq5Var2 = (oq5) hq5Var;
                oq5Var2.a0(1881995740);
                Object K = oq5Var2.K();
                Object obj3 = gq5.a;
                if (K == obj3) {
                    K = szf.g0(new fma(0L));
                    oq5Var2.k0(K);
                }
                aqi aqiVar = (aqi) K;
                oq5Var2.p(false);
                Boolean bool = Boolean.FALSE;
                oq5Var2.a0(1881999935);
                aw0 aw0Var2 = this.t;
                boolean f = oq5Var2.f(aw0Var2);
                Object obj4 = this.s;
                boolean f2 = f | oq5Var2.f(obj4) | oq5Var2.f(aqiVar);
                Object K2 = oq5Var2.K();
                Unit unit = null;
                if (f2 || K2 == obj3) {
                    Object v3Var = new v3(aw0Var2, obj4, aqiVar, null, 7);
                    aw0Var = aw0Var2;
                    oq5Var2.k0(v3Var);
                    K2 = v3Var;
                } else {
                    aw0Var = aw0Var2;
                }
                oq5Var2.p(false);
                if (((Boolean) szf.i0(oq5Var2, bool, (Function2) K2).getValue()).booleanValue()) {
                    oq5Var2.a0(-1786326291);
                    oq5Var2.a0(1882039614);
                    Object K3 = oq5Var2.K();
                    if (K3 == obj3) {
                        K3 = zsd.K(new v3(aw0Var.d, obj4, aw0Var.e, null, 8));
                        oq5Var2.k0(K3);
                    }
                    oq5Var2.p(false);
                    Function2 function2 = (Function2) szf.P((pjc) K3, null, null, oq5Var2, 48, 2).getValue();
                    oq5Var2.a0(1882043230);
                    if (function2 != null) {
                        y1g.c(0, ((fma) aqiVar.getValue()).a, oq5Var2, aw0Var.g, function2);
                        unit = Unit.a;
                    }
                    oq5Var2.p(false);
                    if (unit == null) {
                        qld.p(0, oq5Var2);
                    }
                    oq5Var2.p(false);
                } else {
                    oq5Var2.a0(-1786102688);
                    qld.p(0, oq5Var2);
                    oq5Var2.p(false);
                }
                oq5Var2.a0(1882053955);
                boolean f3 = oq5Var2.f(aw0Var);
                Object K4 = oq5Var2.K();
                if (f3 || K4 == obj3) {
                    K4 = new k5(7, aw0Var);
                    oq5Var2.k0(K4);
                }
                oq5Var2.p(false);
                gld.D((Function0) K4, oq5Var2);
            default:
                hq5 hq5Var2 = (hq5) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var3 = (oq5) hq5Var2;
                    if (oq5Var3.z()) {
                        oq5Var3.S();
                        break;
                    }
                }
                agr agrVar = cs5.b;
                Context context = this.s;
                qzm a = agrVar.a(context);
                agr agrVar2 = cs5.d;
                aw0 aw0Var3 = this.t;
                qzm a2 = agrVar2.a(aw0Var3.e);
                qs5 qs5Var = ds5.a;
                Bundle bundle = (Bundle) aw0Var3.j.getValue();
                if (bundle == null) {
                    bundle = Bundle.EMPTY;
                }
                etn.m(new qzm[]{a, a2, qs5Var.a(bundle), cs5.c.a(aw0Var3.i.getValue())}, ild.s(hq5Var2, 1688971311, new yv0(aw0Var3, context)), hq5Var2, 48);
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yv0(Context context, aw0 aw0Var) {
        super(2);
        this.s = context;
        this.t = aw0Var;
    }
}
