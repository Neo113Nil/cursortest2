package ru.yandex.taxi.scooters.data;

import defpackage.bvf0;
import defpackage.ibn0;
import defpackage.sqm0;
import kotlin.Pair;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes9.dex */
public final class g {
    public final r0 a = bvf0.c(ibn0.a);

    public final sqm0 a() {
        Pair pair = (Pair) this.a.getValue();
        Pair pair2 = ibn0.a;
        return (sqm0) pair.f();
    }

    public final kotlinx.coroutines.flow.n b(boolean z) {
        return new kotlinx.coroutines.flow.n(new f(new d(this.a)), new ScootersCurrentActiveOrdersStateRepository$listenActiveOrders$3(this, z, null));
    }
}
