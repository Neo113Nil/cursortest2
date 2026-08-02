package ru.yandex.taxi.masstransit.domain;

import defpackage.bt00;
import defpackage.bvf0;
import defpackage.cyx;
import defpackage.fif;
import defpackage.g18;
import defpackage.g211;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class g0 {
    public final g211 a;
    public final bt00 b;
    public final ru.yandex.taxi.masstransit.datasource.routing.f c;
    public final ru.yandex.taxi.masstransit.sourceaddress.c d;
    public final cyx e;
    public final fif f;
    public g18 g = g18.u1;

    public g0(g211 g211Var, bt00 bt00Var, ru.yandex.taxi.masstransit.datasource.routing.f fVar, ru.yandex.taxi.masstransit.sourceaddress.c cVar, cyx cyxVar, fif fifVar) {
        this.a = g211Var;
        this.b = bt00Var;
        this.c = fVar;
        this.d = cVar;
        this.e = cyxVar;
        this.f = fifVar;
    }

    public final Object a(Continuation continuation) {
        Object n = bvf0.n(new MtRoutesInitInteractor$startRoutes$2(this, null), continuation);
        return n == CoroutineSingletons.COROUTINE_SUSPENDED ? n : zy11.a;
    }
}
