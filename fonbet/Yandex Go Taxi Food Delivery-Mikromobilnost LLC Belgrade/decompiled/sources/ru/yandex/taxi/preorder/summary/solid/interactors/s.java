package ru.yandex.taxi.preorder.summary.solid.interactors;

import defpackage.noe;
import defpackage.ooe;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.wiq0;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* loaded from: classes6.dex */
public final class s {
    public final tt2 a;
    public final noe b;
    public final wiq0 c;
    public final com.yandex.go.route.interactor.c d;
    public final com.yandex.go.route.interactor.b e;

    public s(tt2 tt2Var, noe noeVar, wiq0 wiq0Var, com.yandex.go.route.interactor.c cVar, com.yandex.go.route.interactor.b bVar) {
        this.a = tt2Var;
        this.b = noeVar;
        this.c = wiq0Var;
        this.d = cVar;
        this.e = bVar;
    }

    public final Object a(SuspendLambda suspendLambda) {
        n nVar = new n(kotlinx.coroutines.flow.e.t(new com.yandex.go.copter.b(((ooe) this.b).a.a.a())));
        this.a.getClass();
        return kotlinx.coroutines.flow.e.k(new p(kotlinx.coroutines.flow.e.X(kotlinx.coroutines.flow.e.F(nVar, uyj.a), new CopterCityTourDestinationInteractor$handleCityTourSelection$$inlined$flatMapLatest$1(null, this)), this), new CopterCityTourDestinationInteractor$handleCityTourSelection$5(null, this), suspendLambda);
    }
}
