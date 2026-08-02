package ru.yandex.taxi.maas.impl.ride;

import defpackage.a7t0;
import defpackage.arv0;
import defpackage.ffx;
import defpackage.tpr;
import defpackage.zy11;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes9.dex */
public final class c {
    public final arv0 a;
    public final n0 b = ffx.b(0, 1, BufferOverflow.DROP_OLDEST);
    public String c = "";
    public String d = "";

    public c(arv0 arv0Var) {
        this.a = arv0Var;
    }

    public final tpr a() {
        return e.t(new m0(com.yandex.go.coroutines.b.d(this.b, new MaasRouteStatsParametersProvider$special$$inlined$start$1(zy11.a, null)), ((a7t0) this.a).a, new MaasRouteStatsParametersProvider$couponFlow$1(this, null)));
    }
}
