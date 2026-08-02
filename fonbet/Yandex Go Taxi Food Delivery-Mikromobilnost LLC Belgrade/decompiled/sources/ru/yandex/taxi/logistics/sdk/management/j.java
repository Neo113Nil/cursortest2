package ru.yandex.taxi.logistics.sdk.management;

import defpackage.bvf0;
import defpackage.ike;
import defpackage.st2;
import defpackage.tje;

/* loaded from: classes5.dex */
public final class j {
    public final ru.yandex.taxi.logistics.sdk.management.deliveries.d a;
    public final ru.yandex.taxi.logistics.sdk.management.storage.e b;
    public final ike c;

    public j(st2 st2Var, ru.yandex.taxi.logistics.sdk.management.deliveries.d dVar, ru.yandex.taxi.logistics.sdk.management.storage.e eVar) {
        this.a = dVar;
        this.b = eVar;
        this.c = bvf0.a(st2Var.c);
    }

    public final void a(String str) {
        tje.N(this.c, null, null, new ShownDetailsCardManagerImpl$putOfferIdInfo$1(this, str, null), 3);
    }
}
