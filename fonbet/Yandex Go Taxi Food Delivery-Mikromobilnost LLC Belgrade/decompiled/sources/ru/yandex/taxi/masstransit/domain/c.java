package ru.yandex.taxi.masstransit.domain;

import defpackage.e3n;
import defpackage.g92;
import defpackage.kp50;
import defpackage.mdh;
import defpackage.o430;
import defpackage.pwy0;
import defpackage.sjh;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.uyj;
import kotlin.time.DurationUnit;

/* loaded from: classes6.dex */
public final class c {
    public static final /* synthetic */ int h = 0;
    public final tt2 a;
    public final f b;
    public final pwy0 c;
    public final q d;
    public final ru.yandex.taxi.masstransit.experiment.d0 e;
    public final ru.yandex.taxi.masstransit.trains.config.a f;
    public final long g;

    static {
        int i = ru.yandex.taxi.masstransit.experiment.d0.d;
    }

    public c(tt2 tt2Var, f fVar, pwy0 pwy0Var, q qVar, ru.yandex.taxi.masstransit.experiment.d0 d0Var, ru.yandex.taxi.masstransit.trains.config.a aVar) {
        this.a = tt2Var;
        this.b = fVar;
        this.c = pwy0Var;
        this.d = qVar;
        this.e = d0Var;
        this.f = aVar;
        o430 o430Var = e3n.b;
        this.g = e3n.e(kp50.U(1, DurationUnit.MINUTES));
    }

    public final tpr a(tpr tprVar, tpr tprVar2) {
        tpr t = kotlinx.coroutines.flow.e.t(kotlinx.coroutines.flow.e.X(kotlinx.coroutines.flow.e.m(tprVar, this.e.b(), new g92(2, this.f.b()), tprVar2, new DetailRouteStateInteractor$stateFlow$1(5, null)), new DetailRouteStateInteractor$stateFlow$$inlined$flatMapLatest$1(null, this)));
        this.a.getClass();
        sjh sjhVar = uyj.a;
        return kotlinx.coroutines.flow.e.F(t, mdh.b);
    }
}
