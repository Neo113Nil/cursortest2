package ru.yandex.taxi.logistics.delivery_form.repository;

import com.yandex.go.taxi.tariffs.internal.repository.k;
import defpackage.ck31;
import defpackage.ghx0;
import defpackage.gwh;
import defpackage.prx0;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.w1i;
import defpackage.wiq0;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.n;

/* loaded from: classes5.dex */
public final class a {
    public final ck31 a;
    public final wiq0 b;
    public final ghx0 c;
    public final tt2 d;
    public final gwh e;
    public final w1i f;

    public a(ck31 ck31Var, wiq0 wiq0Var, ghx0 ghx0Var, tt2 tt2Var, gwh gwhVar, w1i w1iVar) {
        this.a = ck31Var;
        this.b = wiq0Var;
        this.c = ghx0Var;
        this.d = tt2Var;
        this.e = gwhVar;
        this.f = w1iVar;
    }

    public final tpr a() {
        this.c.getClass();
        m0 m0Var = new m0(new n(prx0.a.b, new DeliveryRouteStatsProviderImpl$deliveryRouteStatsInfoFlow$1(2, null)), ((k) this.a).e(), new DeliveryRouteStatsProviderImpl$deliveryRouteStatsInfoFlow$2(this, null));
        this.d.getClass();
        return e.F(m0Var, uyj.a);
    }
}
