package ru.yandex.taxi.map_common.map;

import defpackage.el00;
import defpackage.j24;
import defpackage.t35;

/* loaded from: classes6.dex */
public final class q extends t35 {
    public final el00 d;

    public q(el00 el00Var) {
        this.d = el00Var;
    }

    @Override // defpackage.t35
    public final void c(j24 j24Var) {
        this.d.f(true, new TrafficLightsControllerHolder$requestCreation$1(j24Var, null));
    }
}
