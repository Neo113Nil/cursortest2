package ru.yandex.taxi.logistics.sdk.management.deliveries;

import defpackage.euh;
import defpackage.ffx;
import defpackage.jqr;
import defpackage.v2e0;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.n0;
import kotlinx.coroutines.flow.t0;

/* loaded from: classes9.dex */
public final class DeliveriesPollingTimer implements v2e0 {
    public final n0 a;
    public final euh b;

    public DeliveriesPollingTimer() {
        n0 c = ffx.c(0, 1, BufferOverflow.DROP_OLDEST, 1);
        this.a = c;
        this.b = new euh(new jqr(new t0(c, new DeliveriesPollingTimer$tickFlow$1(2, null)), new DeliveriesPollingTimer$tickFlow$2(2, null), 3), 0);
    }
}
