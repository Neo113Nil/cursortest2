package ru.yandex.taxi.logistics.sdk.deliverydashboard.ui;

import defpackage.bhh;
import defpackage.bvf0;
import defpackage.ds31;
import defpackage.gci0;
import defpackage.h4i;
import defpackage.pzt0;
import defpackage.tje;
import defpackage.yr31;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes5.dex */
public final class d extends yr31 {
    public pzt0 A;
    public final h4i b;
    public final ru.yandex.taxi.logistics.sdk.deliverydashboard.interactors.c c;
    public final c w;
    public final b x;
    public final r0 y;
    public final gci0 z;

    public d(h4i h4iVar, ru.yandex.taxi.logistics.sdk.deliverydashboard.interactors.c cVar, c cVar2, b bVar) {
        this.b = h4iVar;
        this.c = cVar;
        this.w = cVar2;
        this.x = bVar;
        r0 c = bvf0.c(cVar2.e);
        this.y = c;
        this.z = e.d(c);
        pzt0 N = tje.N(ds31.a(this), null, null, new DeliveryDashboardViewModel$launchOnStartJob$1(this, null), 3);
        this.A = N;
        N.w(new bhh(13, this));
        cVar.b();
        bVar.start();
        tje.N(ds31.a(this), null, null, new DeliveryDashboardViewModel$1(this, null), 3);
    }

    @Override // defpackage.yr31
    public final void V() {
        pzt0 pzt0Var = this.A;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        bvf0.j(this.c.j, null);
        this.x.stop();
    }
}
