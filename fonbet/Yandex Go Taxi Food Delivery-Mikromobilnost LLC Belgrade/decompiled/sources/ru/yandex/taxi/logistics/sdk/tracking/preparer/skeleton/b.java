package ru.yandex.taxi.logistics.sdk.tracking.preparer.skeleton;

import defpackage.ds31;
import defpackage.g2q0;
import defpackage.i701;
import defpackage.jqr;
import defpackage.m701;
import defpackage.qkg;
import defpackage.uls0;
import defpackage.x201;
import defpackage.yr31;
import java.util.Collections;
import ru.yandex.taxi.logistics.sdk.management.localstate.e;

/* loaded from: classes5.dex */
public final class b extends yr31 {
    public final m701 b;
    public final x201 c;
    public final qkg w = new qkg(Collections.singletonList(new g2q0(Collections.singletonList(new uls0()), null, null, null, false, null, null, null, null, 1022)), null, null, null, 30);

    public b(m701 m701Var, i701 i701Var, x201 x201Var, e eVar) {
        this.b = m701Var;
        this.c = x201Var;
        kotlinx.coroutines.flow.e.H(ds31.a(this), new jqr(x201Var.getActions(), new TrackingSkeletonViewModel$launchActionHandling$1(2, i701Var, i701.class, "handleAction", "handleAction(Lru/yandex/taxi/logistics/sdk/tracking/domain/api/models/Action;)V", 4), 3));
        kotlinx.coroutines.flow.e.H(ds31.a(this), new jqr(eVar.j, new TrackingSkeletonViewModel$subscribeOnLocalDeliveriesFailed$1(this, null), 3));
    }
}
