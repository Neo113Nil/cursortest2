package ru.yandex.taxi.layers.domain;

import com.yandex.go.layers.api.model.LayersCondition$Endpoint;
import defpackage.a3e0;
import defpackage.azx;
import defpackage.byx;
import defpackage.bzx;
import defpackage.cyx;
import defpackage.d1c;
import defpackage.d4e0;
import defpackage.dp7;
import defpackage.e2t;
import defpackage.g4e0;
import defpackage.g92;
import defpackage.gw00;
import defpackage.jl40;
import defpackage.jvy0;
import defpackage.nm40;
import defpackage.o35;
import defpackage.oo2;
import defpackage.pvn;
import defpackage.qxd;
import defpackage.r0c;
import defpackage.rol0;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.uo70;
import defpackage.uyj;
import defpackage.w511;
import defpackage.we11;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes9.dex */
public final class r extends o35 {
    public final tt2 j;
    public final ru.yandex.taxi.layers.source.factory.d k;
    public final ru.yandex.taxi.layers.source.m l;
    public final a3e0 m;

    public r(com.yandex.go.lifecycle.a aVar, e2t e2tVar, oo2 oo2Var, cyx cyxVar, ru.yandex.taxi.layers.source.requesttrigger.g gVar, com.yandex.go.navigation.screen.c cVar, tt2 tt2Var, ru.yandex.taxi.layers.source.factory.d dVar, ru.yandex.taxi.layers.source.m mVar, a3e0 a3e0Var) {
        super(tt2Var, aVar, e2tVar, LayersCondition$Endpoint.POLYGONS, oo2Var, cyxVar, mVar, gVar, cVar);
        this.j = tt2Var;
        this.k = dVar;
        this.l = mVar;
        this.m = a3e0Var;
    }

    @Override // defpackage.o35
    public final azx a(byx byxVar) {
        return e(byxVar);
    }

    @Override // defpackage.o35
    public final tpr c(bzx bzxVar) {
        rol0 rol0Var = new rol0(new PolygonsInteractor$onResponse$1(this, (g4e0) bzxVar, null));
        this.j.getClass();
        return kotlinx.coroutines.flow.e.F(rol0Var, uyj.a);
    }

    @Override // defpackage.o35
    public final tpr d(byx byxVar, we11 we11Var) {
        a3e0 a3e0Var = this.m;
        int i = 2;
        if ((we11Var instanceof qxd) || (we11Var instanceof jvy0)) {
            synchronized (a3e0Var) {
                a3e0Var.a = kotlin.collections.b.f();
            }
            return new kotlinx.coroutines.flow.n(byxVar.c.contains(this.d) ? f(byxVar) : pvn.a, new PolygonsInteractor$reactOnTriggerEvent$2(2, null));
        }
        if (we11Var instanceof uo70) {
            return pvn.a;
        }
        if (we11Var instanceof dp7) {
            return byxVar.c.contains(this.d) ? f(byxVar) : pvn.a;
        }
        if (!jl40.l(we11Var, d1c.a)) {
            w511.b();
            return null;
        }
        synchronized (a3e0Var) {
            a3e0Var.a = kotlin.collections.b.f();
        }
        return new g92(i, r0c.a);
    }

    public final d4e0 e(byx byxVar) {
        Map map;
        a3e0 a3e0Var = this.m;
        synchronized (a3e0Var) {
            map = a3e0Var.a;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(gw00.d(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), ((nm40) entry.getValue()).d());
        }
        return new d4e0(byxVar, linkedHashMap);
    }

    public final tpr f(byx byxVar) {
        return kotlinx.coroutines.flow.e.C(this.l.b(e(byxVar)), new PolygonsInteractor$prepareShowOrUpdateState$$inlined$flatMapMerge$1(null, this));
    }
}
