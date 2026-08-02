package ru.yandex.taxi.logistics.sdk.discovery_map.ui;

import defpackage.bvf0;
import defpackage.ds31;
import defpackage.gci0;
import defpackage.nu8;
import defpackage.tje;
import defpackage.utj;
import defpackage.yr31;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes5.dex */
public final class a extends yr31 {
    public final nu8 b;
    public final r0 c;
    public final gci0 w;

    public a(nu8 nu8Var, utj utjVar, ru.yandex.taxi.logistics.sdk.discovery_map.data.a aVar) {
        this.b = nu8Var;
        r0 c = bvf0.c(null);
        this.c = c;
        this.w = e.d(c);
        tje.N(ds31.a(this), null, null, new DiscoveryMapViewModel$1(aVar, utjVar, this, null), 3);
    }
}
