package ru.yandex.taxi.superapp.knownOrder;

import defpackage.e3n;
import defpackage.eci0;
import defpackage.jx81;
import defpackage.kmx;
import defpackage.n20;
import defpackage.o430;
import defpackage.rol0;
import defpackage.sjh;
import defpackage.tpr;
import defpackage.tse;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.wsr0;
import defpackage.x2p;
import defpackage.xsr0;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

/* loaded from: classes10.dex */
public final class u {
    public final n20 a;
    public final com.yandex.go.drive.sdkintegration.domain.session.e b;
    public final x2p c;
    public final ru.yandex.taxi.linked_order.provider.d d;
    public final com.yandex.go.scooters.domain.p e;
    public final com.yandex.go.chargers.data.q f;
    public final ru.yandex.taxi.logistics.deliveries.multiorder.d g;
    public final kmx h;
    public final tt2 i;
    public final com.yandex.go.navigator.order.c j;
    public final eci0 k;

    public u(tse tseVar, n20 n20Var, com.yandex.go.drive.sdkintegration.domain.session.e eVar, x2p x2pVar, ru.yandex.taxi.linked_order.provider.d dVar, com.yandex.go.scooters.domain.p pVar, com.yandex.go.chargers.data.q qVar, ru.yandex.taxi.logistics.deliveries.multiorder.d dVar2, kmx kmxVar, tt2 tt2Var, com.yandex.go.navigator.order.c cVar) {
        this.a = n20Var;
        this.b = eVar;
        this.c = x2pVar;
        this.d = dVar;
        this.e = pVar;
        this.f = qVar;
        this.g = dVar2;
        this.h = kmxVar;
        this.i = tt2Var;
        this.j = cVar;
        rol0 rol0Var = new rol0(new KnownOrdersRepositoryImpl$sharedKnownOrdersInfoIncludePending$1(this, null));
        wsr0 wsr0Var = xsr0.a;
        o430 o430Var = e3n.b;
        this.k = kotlinx.coroutines.flow.e.O(rol0Var, tseVar, jx81.a(1, 0L), 1);
    }

    public static kotlinx.coroutines.flow.o b(tpr tprVar, String str) {
        return new kotlinx.coroutines.flow.o(tprVar, new KnownOrdersRepositoryImpl$safeWrap$1(str, null));
    }

    public final tpr a(boolean z) {
        kotlinx.coroutines.flow.o b = b(kotlinx.coroutines.flow.e.t(new t(kotlinx.coroutines.flow.e.X(((com.yandex.go.taxi.order.provider.a) this.a).a(), new KnownOrdersRepositoryImpl$taxiOrders$$inlined$flatMapLatest$1(null, this, z)), this)), TariffOrderFlow.ORDER_FLOW_TAXI_KEY);
        x2p x2pVar = this.c;
        com.yandex.go.order.external.d dVar = new com.yandex.go.order.external.d(x2pVar.b);
        x2pVar.a.getClass();
        sjh sjhVar = uyj.a;
        tpr t = kotlinx.coroutines.flow.e.t(new c(new tpr[]{b, b(kotlinx.coroutines.flow.e.t(new r(kotlinx.coroutines.flow.e.F(dVar, sjhVar), this)), "eatsKit"), b(kotlinx.coroutines.flow.e.t(new e(kotlinx.coroutines.flow.e.t(new com.yandex.go.drive.sdkintegration.domain.session.b(this.b.b())))), TariffOrderFlow.ORDER_FLOW_DRIVE_KEY), b(kotlinx.coroutines.flow.e.t(new g(this.d.b(), this)), "linked"), b(kotlinx.coroutines.flow.e.t(new p(this.e.c, this)), "scooters"), b(kotlinx.coroutines.flow.e.t(new b(this.f.a)), "chargers"), b(kotlinx.coroutines.flow.e.t(new i(this.g.a(), z)), "logistic"), b(kotlinx.coroutines.flow.e.t(new k(this.j.a())), "navigator")}));
        this.i.getClass();
        return kotlinx.coroutines.flow.e.F(t, sjhVar);
    }
}
