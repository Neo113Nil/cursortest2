package ru.yandex.taxi.delivery.experiments;

import com.yandex.go.taxi.tariffs.internal.repository.k;
import defpackage.die0;
import defpackage.e4a0;
import defpackage.j73;
import defpackage.lv90;
import defpackage.pex0;
import defpackage.tpr;
import defpackage.ut90;
import defpackage.wfi;
import defpackage.wiq0;
import java.util.List;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.n;
import ru.yandex.taxi.preorder.repositories.g;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

/* loaded from: classes5.dex */
public final class e {
    public final wfi a;
    public final ut90 b;
    public final g c;
    public final wiq0 d;
    public final d e;

    public e(wfi wfiVar, ut90 ut90Var, g gVar, wiq0 wiq0Var) {
        this.a = wfiVar;
        this.b = ut90Var;
        this.c = gVar;
        this.d = wiq0Var;
        this.e = new d(new n(gVar.c, new PayOnDeliveryExperimentInteractor$paymentMethodsFlow$1(2, null)), this);
    }

    public final tpr a() {
        return kotlinx.coroutines.flow.e.t(new m0(this.e, ((k) this.d).j.b(), new PayOnDeliveryExperimentInteractor$enabledFlow$1(this, null)));
    }

    public final boolean b() {
        k kVar = (k) this.d;
        pex0 m = kVar.m();
        String str = m != null ? m.b : null;
        pex0 m2 = kVar.m();
        TariffOrderFlow tariffOrderFlow = m2 != null ? m2.u0 : null;
        g gVar = this.c;
        e4a0 b = gVar.b();
        lv90 a = gVar.a();
        return c(tariffOrderFlow, str, j73.A(new e4a0[]{b, a != null ? a.a : null}));
    }

    public final boolean c(TariffOrderFlow tariffOrderFlow, String str, List list) {
        if (tariffOrderFlow != TariffOrderFlow.DELIVERY_FLOW) {
            return false;
        }
        ut90 ut90Var = this.b;
        if (ut90Var.b().b && kotlin.collections.a.G(ut90Var.b().j, str)) {
            return !this.a.d(new die0(list, str));
        }
        return false;
    }
}
