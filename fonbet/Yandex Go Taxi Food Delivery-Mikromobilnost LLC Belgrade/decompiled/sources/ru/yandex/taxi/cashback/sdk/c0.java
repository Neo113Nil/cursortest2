package ru.yandex.taxi.cashback.sdk;

import defpackage.alc0;
import defpackage.bxx0;
import defpackage.cda0;
import defpackage.j49;
import defpackage.n20;
import defpackage.tpr;
import kotlinx.coroutines.flow.m0;

/* loaded from: classes9.dex */
public final class c0 {
    public final alc0 a;
    public final n20 b;
    public final k c;
    public final j49 d;
    public final bxx0 e;
    public final cda0 f;
    public final com.yandex.go.chargers.payments.domain.c g;
    public final com.yandex.go.scooters.domain.i h;

    public c0(alc0 alc0Var, n20 n20Var, k kVar, j49 j49Var, bxx0 bxx0Var, cda0 cda0Var, com.yandex.go.chargers.payments.domain.c cVar, com.yandex.go.scooters.domain.i iVar) {
        this.a = alc0Var;
        this.b = n20Var;
        this.c = kVar;
        this.d = j49Var;
        this.e = bxx0Var;
        this.f = cda0Var;
        this.g = cVar;
        this.h = iVar;
    }

    public final kotlinx.coroutines.flow.internal.g a() {
        return kotlinx.coroutines.flow.e.X(kotlinx.coroutines.flow.e.t(this.a.a), new TaxiClientContextRepository$special$$inlined$flatMapLatest$1(null, this));
    }

    public final tpr b() {
        k kVar = this.c;
        com.yandex.go.taxi.order.domain.repositories.e0 e0Var = (com.yandex.go.taxi.order.domain.repositories.e0) kVar.a;
        return kotlinx.coroutines.flow.e.t(new kotlinx.coroutines.flow.n(new m0(kotlinx.coroutines.flow.e.t(new h(kotlinx.coroutines.flow.e.X(e0Var.n(), new OrderPlusInfoRepository$getStatusInfoFlow$$inlined$flatMapLatest$1(3, null)), kVar)), kotlinx.coroutines.flow.e.t(new j(e0Var.n())), new OrderPlusInfoRepository$currentTemplatesFlow$3(3, kVar, k.class, "takeTemplatesIfNeed", "takeTemplatesIfNeed(Ljava/util/Map;I)Ljava/util/Map;", 4)), new OrderPlusInfoRepository$currentTemplatesFlow$4(kVar, null)));
    }
}
