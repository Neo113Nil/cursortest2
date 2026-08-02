package ru.yandex.taxi.logistics.sdk.delivery.state;

import defpackage.bvf0;
import defpackage.hwh;
import defpackage.pzt0;
import defpackage.st2;
import defpackage.tje;

/* loaded from: classes5.dex */
public final class h {
    public final ru.yandex.taxi.logistics.sdk.delivery.edit.b a;
    public final hwh b;
    public final st2 c;
    public final com.yandex.delivery.utils.dialogmanager.impl.b d;
    public pzt0 e;

    public h(ru.yandex.taxi.logistics.sdk.delivery.edit.b bVar, hwh hwhVar, st2 st2Var, com.yandex.delivery.utils.dialogmanager.impl.b bVar2) {
        this.a = bVar;
        this.b = hwhVar;
        this.c = st2Var;
        this.d = bVar2;
    }

    public final void a(String str) {
        pzt0 pzt0Var = this.e;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.e = tje.N(bvf0.a(this.c.b), null, null, new DeliveryStateAlertsInteractor$startSubscription$1(this, str, null), 3);
    }
}
