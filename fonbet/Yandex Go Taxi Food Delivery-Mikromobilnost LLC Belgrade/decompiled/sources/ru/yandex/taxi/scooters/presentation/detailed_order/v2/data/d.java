package ru.yandex.taxi.scooters.presentation.detailed_order.v2.data;

import defpackage.ffx;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.zuo0;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.n;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes6.dex */
public final class d {
    public final tt2 a;
    public final n0 b = ffx.b(0, 1, BufferOverflow.DROP_OLDEST);

    public d(tt2 tt2Var) {
        this.a = tt2Var;
    }

    public final tpr a(zuo0 zuo0Var) {
        tpr t = e.t(new n(e.c(this.b), new ScootersVoluntarySlowdownToggleStateRepository$listen$1(zuo0Var, null)));
        this.a.getClass();
        return e.F(t, uyj.a);
    }
}
