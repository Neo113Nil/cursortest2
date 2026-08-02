package ru.yandex.taxi.masstransit.stoproute.interactor;

import defpackage.dz00;
import defpackage.e4l0;
import defpackage.en30;
import defpackage.pi30;
import defpackage.s240;
import defpackage.tt2;
import defpackage.vng;

/* loaded from: classes6.dex */
public final class a {
    public final tt2 a;
    public final ru.yandex.taxi.masstransit.datasource.thread.a b;
    public final ru.yandex.taxi.masstransit.datasource.vehicle.a c;
    public final ru.yandex.taxi.masstransit.datasource.schedule.b d;
    public final s240 e;
    public final en30 f;
    public final dz00 g;

    public a(tt2 tt2Var, ru.yandex.taxi.masstransit.datasource.thread.a aVar, ru.yandex.taxi.masstransit.datasource.vehicle.a aVar2, ru.yandex.taxi.masstransit.datasource.schedule.b bVar, s240 s240Var, en30 en30Var, dz00 dz00Var) {
        this.a = tt2Var;
        this.b = aVar;
        this.c = aVar2;
        this.d = bVar;
        this.e = s240Var;
        this.f = en30Var;
        this.g = dz00Var;
    }

    public final kotlinx.coroutines.flow.internal.g a(e4l0 e4l0Var) {
        return kotlinx.coroutines.flow.e.I(kotlinx.coroutines.flow.e.X(vng.l(ru.yandex.taxi.experiments.d.b(this.g.a), new pi30(26), vng.c), new MtStopRouteInfoInteractor$requestPollingRouteInfoFlow$$inlined$flatMapLatest$1(3, null)), new MtStopRouteInfoInteractor$requestPollingRouteInfoFlow$3(e4l0Var, this, null));
    }
}
