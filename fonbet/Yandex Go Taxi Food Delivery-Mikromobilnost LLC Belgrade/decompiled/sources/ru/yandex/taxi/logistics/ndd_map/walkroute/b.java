package ru.yandex.taxi.logistics.ndd_map.walkroute;

import defpackage.czo0;
import defpackage.ffx;
import defpackage.g641;
import defpackage.hbp0;
import defpackage.hj50;
import defpackage.i5m;
import defpackage.nm00;
import defpackage.scs0;
import defpackage.xvf0;
import defpackage.z0s;
import defpackage.z541;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes5.dex */
public final class b {
    public final z541 a;
    public final a b;
    public final hj50 c;
    public final hbp0 d = new hbp0(new czo0(14), "", null);
    public final n0 e = ffx.b(0, 1, BufferOverflow.DROP_OLDEST);

    public b(z541 z541Var, a aVar, hj50 hj50Var) {
        this.a = z541Var;
        this.b = aVar;
        this.c = hj50Var;
    }

    public final void a(nm00 nm00Var) {
        hbp0 hbp0Var = this.d;
        hbp0Var.f();
        g641 g641Var = (g641) i5m.a((xvf0) z0s.f(this.a, this.b).y).get();
        hbp0.e(hbp0Var, null, null, new SimpleWalkToDeliveryPointActionRouter$launch$1(this, nm00Var, g641Var, null), 3).w(new scs0(1, this, g641Var));
    }
}
