package ru.yandex.taxi.masstransit.detailedroute.interactor;

import defpackage.dz00;
import defpackage.fay0;
import defpackage.gci0;
import defpackage.l5r;
import defpackage.mth;
import defpackage.pwy0;
import defpackage.su30;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.uyj;
import kotlinx.coroutines.flow.e;
import ru.yandex.taxi.masstransit.domain.f;
import ru.yandex.taxi.masstransit.experiment.d0;

/* loaded from: classes6.dex */
public final class a {
    public static final /* synthetic */ int h = 0;
    public final tt2 a;
    public final pwy0 b;
    public final f c;
    public final ru.yandex.taxi.masstransit.detailedroute.mapper.a d;
    public final l5r e;
    public final d0 f;
    public final dz00 g;

    static {
        int i = d0.d;
    }

    public a(tt2 tt2Var, pwy0 pwy0Var, f fVar, ru.yandex.taxi.masstransit.detailedroute.mapper.a aVar, l5r l5rVar, d0 d0Var, dz00 dz00Var) {
        this.a = tt2Var;
        this.b = pwy0Var;
        this.c = fVar;
        this.d = aVar;
        this.e = l5rVar;
        this.f = d0Var;
        this.g = dz00Var;
    }

    public final tpr a(su30 su30Var, gci0 gci0Var, mth mthVar, fay0 fay0Var, tpr tprVar) {
        tpr t = e.t(e.I(e.m(this.b.a(), this.c.c(su30Var), e.X(gci0Var, new MtDetailedRouteOverlayUiStateInteractor$vehiclesFlow$$inlined$flatMapLatest$1(null, this, su30Var, mthVar)), tprVar, new MtDetailedRouteOverlayUiStateInteractor$stateFlow$1(5, null)), new MtDetailedRouteOverlayUiStateInteractor$stateFlow$2(this, su30Var, fay0Var, null)));
        this.a.getClass();
        return e.F(t, uyj.a);
    }
}
