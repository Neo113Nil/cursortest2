package ru.yandex.taxi.orderbutton.toll_roads.interactors;

import com.yandex.go.taxi.tariffs.internal.repository.k;
import defpackage.bj70;
import defpackage.evu0;
import defpackage.fjx0;
import defpackage.grz0;
import defpackage.hay;
import defpackage.ipj0;
import defpackage.jl40;
import defpackage.mi31;
import defpackage.ny61;
import defpackage.opz0;
import defpackage.ow11;
import defpackage.pex0;
import defpackage.soz0;
import defpackage.tnm0;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.vi70;
import defpackage.wi70;
import defpackage.wiq0;
import defpackage.wtk0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.text.Regex;
import ru.yandex.taxi.preorder.tollroad.data.e;
import ru.yandex.taxi.tariffs.model.TariffSource;

/* loaded from: classes6.dex */
public final class b {
    public final tt2 a;
    public final wiq0 b;
    public final e c;
    public final opz0 d;
    public final ow11 e;
    public final tnm0 f;
    public final ipj0 g;
    public final fjx0 h;

    public b(tt2 tt2Var, wiq0 wiq0Var, e eVar, opz0 opz0Var, ow11 ow11Var, tnm0 tnm0Var, ipj0 ipj0Var, fjx0 fjx0Var) {
        this.a = tt2Var;
        this.b = wiq0Var;
        this.c = eVar;
        this.d = opz0Var;
        this.e = ow11Var;
        this.f = tnm0Var;
        this.g = ipj0Var;
        this.h = fjx0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(b bVar, mi31 mi31Var, boolean z, wtk0 wtk0Var, ContinuationImpl continuationImpl) {
        TollRoadsButtonModelInteractor$createModel$1 tollRoadsButtonModelInteractor$createModel$1;
        int i;
        bj70 a;
        boolean z2;
        wtk0 wtk0Var2;
        wi70 wi70Var;
        mi31 mi31Var2 = mi31Var;
        bVar.getClass();
        if (continuationImpl instanceof TollRoadsButtonModelInteractor$createModel$1) {
            tollRoadsButtonModelInteractor$createModel$1 = (TollRoadsButtonModelInteractor$createModel$1) continuationImpl;
            int i2 = tollRoadsButtonModelInteractor$createModel$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tollRoadsButtonModelInteractor$createModel$1.label = i2 - Integer.MIN_VALUE;
                TollRoadsButtonModelInteractor$createModel$1 tollRoadsButtonModelInteractor$createModel$12 = tollRoadsButtonModelInteractor$createModel$1;
                Object obj = tollRoadsButtonModelInteractor$createModel$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = tollRoadsButtonModelInteractor$createModel$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    wi70 c = bVar.e.c(mi31Var2.a);
                    if (c != null) {
                        return c;
                    }
                    a = bVar.h.a(mi31Var2);
                    vi70 vi70Var = new vi70(mi31Var2, a, false, false, false);
                    ipj0 ipj0Var = bVar.g;
                    tollRoadsButtonModelInteractor$createModel$12.L$0 = mi31Var2;
                    tollRoadsButtonModelInteractor$createModel$12.L$1 = wtk0Var;
                    tollRoadsButtonModelInteractor$createModel$12.L$2 = a;
                    tollRoadsButtonModelInteractor$createModel$12.L$3 = null;
                    z2 = z;
                    tollRoadsButtonModelInteractor$createModel$12.Z$0 = z2;
                    tollRoadsButtonModelInteractor$createModel$12.label = 1;
                    obj = ipj0Var.a(vi70Var, tollRoadsButtonModelInteractor$createModel$12);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    wtk0Var2 = wtk0Var;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    boolean z3 = tollRoadsButtonModelInteractor$createModel$12.Z$0;
                    a = (bj70) tollRoadsButtonModelInteractor$createModel$12.L$2;
                    wtk0Var2 = (wtk0) tollRoadsButtonModelInteractor$createModel$12.L$1;
                    mi31 mi31Var3 = (mi31) tollRoadsButtonModelInteractor$createModel$12.L$0;
                    kotlin.b.b(obj);
                    z2 = z3;
                    mi31Var2 = mi31Var3;
                }
                wi70Var = (wi70) obj;
                if (wi70Var == null || (wi70Var = bVar.f.c(mi31Var2.a, a)) != null) {
                    return wi70Var;
                }
                pex0 pex0Var = mi31Var2.a;
                e eVar = bVar.c;
                opz0 opz0Var = bVar.d;
                String e = pex0Var.e();
                String str = "";
                if (e == null) {
                    e = "";
                }
                String b = (jl40.l(((grz0) eVar.f.getValue()).a, Boolean.TRUE) && evu0.J("")) ? opz0Var.b(opz0Var.d().e.c.a.b) : "";
                boolean z4 = b.length() > 0 && z2;
                soz0.j jVar = opz0Var.d().e.c.a;
                String b2 = opz0Var.b(z4 ? jVar.c : jVar.a);
                if (b2.length() <= 0 || evu0.y(b2, "\\", false) || evu0.y(b2, "$", false)) {
                    b2 = opz0Var.b(opz0Var.d().e.c.a.a);
                } else {
                    String[] strArr = {e, b};
                    for (int i3 = 0; i3 < 2; i3++) {
                        b2 = new Regex("%@").k(b2, strArr[i3]);
                    }
                }
                boolean z5 = pex0Var.a == TariffSource.ZONE_INFO_AND_FULL_ROUTE_STATS;
                if (wtk0Var2.a || wtk0Var2.b) {
                    return hay.m(b2, null, a, z5, 2);
                }
                if ((eVar.c() || z2) && opz0Var.e()) {
                    str = opz0Var.b(opz0Var.d().e.c.b);
                }
                return hay.g(b2, str, a, z5, 8);
            }
        }
        tollRoadsButtonModelInteractor$createModel$1 = new TollRoadsButtonModelInteractor$createModel$1(bVar, continuationImpl);
        TollRoadsButtonModelInteractor$createModel$1 tollRoadsButtonModelInteractor$createModel$122 = tollRoadsButtonModelInteractor$createModel$1;
        Object obj2 = tollRoadsButtonModelInteractor$createModel$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = tollRoadsButtonModelInteractor$createModel$122.label;
        if (i != 0) {
        }
        wi70Var = (wi70) obj2;
        if (wi70Var == null) {
        }
        return wi70Var;
    }

    public final tpr b(tpr tprVar) {
        tpr p = kotlinx.coroutines.flow.e.p(kotlinx.coroutines.flow.e.t(kotlinx.coroutines.flow.e.n(((k) this.b).j.b(), this.c.g, tprVar, new TollRoadsButtonModelInteractor$modelFlow$1(this, null))), 200L);
        this.a.getClass();
        return kotlinx.coroutines.flow.e.F(p, uyj.a);
    }
}
