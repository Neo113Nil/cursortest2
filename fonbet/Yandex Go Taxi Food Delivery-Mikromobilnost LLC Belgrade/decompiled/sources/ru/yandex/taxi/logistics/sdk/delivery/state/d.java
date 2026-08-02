package ru.yandex.taxi.logistics.sdk.delivery.state;

import defpackage.bvf0;
import defpackage.hwh;
import defpackage.pu2;
import defpackage.pzt0;
import defpackage.st2;
import defpackage.tje;

/* loaded from: classes9.dex */
public final class d implements pu2 {
    public final ru.yandex.taxi.logistics.sdk.delivery.edit.b a;
    public final hwh b;
    public final st2 c;
    public pzt0 d;

    public d(ru.yandex.taxi.logistics.sdk.delivery.edit.b bVar, hwh hwhVar, st2 st2Var) {
        this.a = bVar;
        this.b = hwhVar;
        this.c = st2Var;
    }

    @Override // defpackage.pu2
    public final void a(boolean z) {
        pzt0 pzt0Var = this.d;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.d = tje.N(bvf0.a(this.c.b), null, null, new DeliveryAlertsInteractor$onAppResumed$1(this, null), 3);
    }

    @Override // defpackage.pu2
    public final void b() {
        pzt0 pzt0Var = this.d;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
    }
}
