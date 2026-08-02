package ru.yandex.taxi.orderbutton.summary.base.interactors;

import com.yandex.go.taxi.tariffs.internal.repository.k;
import defpackage.a201;
import defpackage.aj70;
import defpackage.avj0;
import defpackage.db5;
import defpackage.fjx0;
import defpackage.g0z;
import defpackage.g92;
import defpackage.h3y;
import defpackage.hay;
import defpackage.iu6;
import defpackage.kyh0;
import defpackage.mi31;
import defpackage.mo40;
import defpackage.pwy0;
import defpackage.ro0;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.uze0;
import defpackage.vi70;
import defpackage.w511;
import defpackage.wi70;
import defpackage.ydv0;
import defpackage.zuj0;
import java.util.Arrays;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.n;
import kotlinx.coroutines.flow.n0;
import ru.yandex.taxi.tariffs.model.TariffSource;

/* loaded from: classes6.dex */
public final class i extends db5 {
    public final aj70 a;
    public final uze0 b;
    public final tt2 c;
    public final a201 d;
    public final fjx0 e;
    public final g0z f;
    public final h3y g;
    public final h3y h;
    public final ro0 i;
    public final iu6 j;
    public final pwy0 k;
    public final ru.yandex.taxi.summary.promotions.repository.e l;
    public final mo40 m;
    public final ru.yandex.taxi.preorder.tollroad.data.e n;
    public final ru.yandex.taxi.preorder.tollroad.a o;

    public i(aj70 aj70Var, uze0 uze0Var, tt2 tt2Var, a201 a201Var, fjx0 fjx0Var, g0z g0zVar, h3y h3yVar, h3y h3yVar2, ro0 ro0Var, iu6 iu6Var, pwy0 pwy0Var, ru.yandex.taxi.summary.promotions.repository.e eVar, mo40 mo40Var, ru.yandex.taxi.preorder.tollroad.data.e eVar2, ru.yandex.taxi.preorder.tollroad.a aVar) {
        this.a = aj70Var;
        this.b = uze0Var;
        this.c = tt2Var;
        this.d = a201Var;
        this.e = fjx0Var;
        this.f = g0zVar;
        this.g = h3yVar;
        this.h = h3yVar2;
        this.i = ro0Var;
        this.j = iu6Var;
        this.k = pwy0Var;
        this.l = eVar;
        this.m = mo40Var;
        this.n = eVar2;
        this.o = aVar;
    }

    @Override // defpackage.db5
    public final Object a(vi70 vi70Var, Continuation continuation) {
        wi70 g;
        db5 db5Var;
        mi31 mi31Var = vi70Var.a;
        a201 a201Var = this.d;
        if (((ru.yandex.taxi.am.g) a201Var.b).g()) {
            g = null;
        } else {
            g = hay.g(((avj0) ((zuj0) a201Var.c)).h(kyh0.summary_confirm_unauthorized), null, vi70Var.b, mi31Var.a.a == TariffSource.ZONE_INFO_AND_FULL_ROUTE_STATS, 10);
        }
        if (g != null) {
            return g;
        }
        switch (ydv0.a[mi31Var.a.u0.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                db5Var = (db5) this.g.get();
                break;
            case 6:
                db5Var = (db5) this.h.get();
                break;
            default:
                w511.b();
                return null;
        }
        return db5Var.a(vi70Var, continuation);
    }

    public final tpr b(tpr tprVar, tpr tprVar2, boolean z) {
        kotlinx.coroutines.flow.internal.h d = this.a.a.d();
        n0 n0Var = this.j.b;
        kotlinx.coroutines.flow.internal.h d2 = this.l.d();
        n0 n0Var2 = this.m.b;
        ru.yandex.taxi.preorder.tollroad.data.e eVar = this.n;
        n nVar = new n(kotlinx.coroutines.flow.e.K((tpr[]) Arrays.copyOf(new tpr[]{d, n0Var, d2, n0Var2, kotlinx.coroutines.flow.e.K((tpr[]) Arrays.copyOf(new tpr[]{new ru.yandex.taxi.preorder.tollroad.data.d(eVar.e), new ru.yandex.taxi.preorder.tollroad.data.b(eVar.h), new h(this.o.a())}, 3)), this.k.a()}, 6)), new SummaryButtonModelInteractor$modelFlow$remapTrigger$1(2, null));
        kotlinx.coroutines.flow.internal.g X = kotlinx.coroutines.flow.e.X(new m0(kotlinx.coroutines.flow.e.t(new d(tprVar)), kotlinx.coroutines.flow.e.t(new f(((k) this.b).j.a())), new SummaryButtonModelInteractor$priceLoadingFlow$3(3, null)), new SummaryButtonModelInteractor$priceLoadingFlow$$inlined$flatMapLatest$1(null, this));
        if (tprVar2 == null) {
            tprVar2 = new g92(2, Boolean.FALSE);
        }
        tpr t = kotlinx.coroutines.flow.e.t(kotlinx.coroutines.flow.e.m(tprVar, X, tprVar2, nVar, new SummaryButtonModelInteractor$modelFlow$1(this, z, null)));
        this.c.getClass();
        return kotlinx.coroutines.flow.e.F(t, uyj.a);
    }
}
