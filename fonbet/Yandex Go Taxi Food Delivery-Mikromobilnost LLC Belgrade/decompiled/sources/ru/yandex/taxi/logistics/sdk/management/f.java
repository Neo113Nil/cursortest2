package ru.yandex.taxi.logistics.sdk.management;

import defpackage.aci;
import defpackage.duh;
import defpackage.f6i;
import defpackage.i3y;
import defpackage.ike;
import defpackage.j2s;
import defpackage.jqr;
import defpackage.jxh;
import defpackage.n4u0;
import defpackage.qoh;
import defpackage.qv10;
import defpackage.rth;
import defpackage.sls;
import defpackage.st2;
import defpackage.tje;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.flow.e;
import ru.yandex.taxi.logistics.sdk.management.DeliveriesManagerImpl$getPerformerRoutesStateFlow$$inlined$flatMapLatest$1;
import ru.yandex.taxi.logistics.sdk.management.f;

/* loaded from: classes9.dex */
public final class f {
    public final ru.yandex.taxi.logistics.sdk.management.deliveries.d a;
    public final duh b;
    public final ru.yandex.taxi.logistics.sdk.management.delivery_tasks.cancel.a c;
    public final ru.yandex.taxi.logistics.sdk.management.delivery_tasks.create.d d;
    public final j2s e;
    public final ru.yandex.taxi.logistics.sdk.performer_position.impl.a f;
    public final a g;
    public final aci h;
    public final ike i;
    public final i3y j;
    public final i3y k;

    public f(st2 st2Var, ru.yandex.taxi.logistics.sdk.management.deliveries.d dVar, duh duhVar, ru.yandex.taxi.logistics.sdk.management.delivery_tasks.cancel.a aVar, ru.yandex.taxi.logistics.sdk.management.delivery_tasks.create.d dVar2, j2s j2sVar, ru.yandex.taxi.logistics.sdk.performer_position.impl.a aVar2, a aVar3, aci aciVar) {
        this.a = dVar;
        this.b = duhVar;
        this.c = aVar;
        this.d = dVar2;
        this.e = j2sVar;
        this.f = aVar2;
        this.g = aVar3;
        this.h = aciVar;
        ike e = qv10.e(st2Var.c);
        this.i = e;
        final int i = 0;
        this.j = kotlin.a.a(new sls(this) { // from class: qth
            public final /* synthetic */ f b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i2 = i;
                f fVar = this.b;
                switch (i2) {
                    case 0:
                        return fVar.a.z;
                    default:
                        return e.R(e.X(new n1f(4, new syc(fVar.a.z, 7), fVar), new DeliveriesManagerImpl$getPerformerRoutesStateFlow$$inlined$flatMapLatest$1()), fVar.i, wsr0.a(xsr0.a, 3), EmptyList.a);
                }
            }
        });
        final int i2 = 1;
        this.k = kotlin.a.a(new sls(this) { // from class: qth
            public final /* synthetic */ f b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i2;
                f fVar = this.b;
                switch (i22) {
                    case 0:
                        return fVar.a.z;
                    default:
                        return e.R(e.X(new n1f(4, new syc(fVar.a.z, 7), fVar), new DeliveriesManagerImpl$getPerformerRoutesStateFlow$$inlined$flatMapLatest$1()), fVar.i, wsr0.a(xsr0.a, 3), EmptyList.a);
                }
            }
        });
        kotlinx.coroutines.flow.e.H(e, new jqr(kotlinx.coroutines.flow.e.X(kotlinx.coroutines.flow.e.t(new rth(dVar.z.j(), i)), new DeliveriesManagerImpl$initDeliveriesUpdates$$inlined$flatMapLatest$1(null, this)), new DeliveriesManagerImpl$initDeliveriesUpdates$2(null, this), 3));
    }

    public final qoh a(String str, jxh jxhVar) {
        return tje.h(this.i, null, null, new DeliveriesManagerImpl$cancelDeliveryAsync$1(this, str, jxhVar, null), 3);
    }

    public final void b(String str) {
        tje.N(this.i, null, null, new DeliveriesManagerImpl$commitDelivery$1(this, str, null), 3);
    }

    public final void c(f6i f6iVar, List list, boolean z) {
        tje.N(this.i, null, null, new DeliveriesManagerImpl$createDelivery$1(this, f6iVar, list, z, null), 3);
    }

    public final void d() {
        tje.N(this.i, null, null, new DeliveriesManagerImpl$forceUpdateDeliveries$1(TimeUnit.SECONDS, 5L, this, null), 3);
    }

    public final n4u0 e() {
        return (n4u0) this.j.getValue();
    }
}
