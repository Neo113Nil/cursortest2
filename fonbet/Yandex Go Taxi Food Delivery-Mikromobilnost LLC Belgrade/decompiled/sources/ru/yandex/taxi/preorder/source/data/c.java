package ru.yandex.taxi.preorder.source.data;

import defpackage.cqe0;
import defpackage.dft0;
import defpackage.jqr;
import defpackage.o400;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.zlm;
import kotlinx.coroutines.flow.o;
import ru.yandex.taxi.preorder.source.mode.interactor.e;

/* loaded from: classes6.dex */
public final class c {
    public final dft0 a;
    public final tt2 b;
    public final e c;
    public final com.yandex.go.route.interactor.c d;
    public zlm e;
    public boolean f;

    public c(dft0 dft0Var, tt2 tt2Var, e eVar, com.yandex.go.route.interactor.c cVar) {
        this.a = dft0Var;
        this.b = tt2Var;
        this.c = eVar;
        this.d = cVar;
    }

    public final tpr a() {
        tpr tprVar = (tpr) ((cqe0) this.a).u.getValue();
        this.b.getClass();
        return kotlinx.coroutines.flow.e.F(new jqr(new b(new o(new jqr(kotlinx.coroutines.flow.e.F(tprVar, uyj.a), new SourcePointDrivingRouteRepository$routeFlow$1(this, null), 3), new SourcePointDrivingRouteRepository$routeFlow$2(this, null)), this), new SourcePointDrivingRouteRepository$routeFlow$4(this, null), 3), o400.a);
    }
}
