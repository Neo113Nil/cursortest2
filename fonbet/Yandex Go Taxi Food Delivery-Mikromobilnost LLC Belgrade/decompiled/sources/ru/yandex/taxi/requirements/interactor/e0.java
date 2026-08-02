package ru.yandex.taxi.requirements.interactor;

import defpackage.axm;
import defpackage.dqe0;
import defpackage.g92;
import defpackage.ha2;
import defpackage.mi31;
import defpackage.mth;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.wiq0;
import defpackage.zy11;
import ru.yandex.taxi.requirements.repository.RequirementsChangedNotifier;

/* loaded from: classes6.dex */
public final class e0 {
    public final com.yandex.go.taxi.tariffs.repository.g a;
    public final RequirementsChangedNotifier b;
    public final wiq0 c;
    public final dqe0 d;
    public final axm e;
    public final ru.yandex.taxi.orderforanother.repository.a f;
    public final tt2 g;

    public e0(com.yandex.go.taxi.tariffs.repository.g gVar, RequirementsChangedNotifier requirementsChangedNotifier, wiq0 wiq0Var, dqe0 dqe0Var, axm axmVar, ru.yandex.taxi.orderforanother.repository.a aVar, tt2 tt2Var) {
        this.a = gVar;
        this.b = requirementsChangedNotifier;
        this.c = wiq0Var;
        this.d = dqe0Var;
        this.e = axmVar;
        this.f = aVar;
        this.g = tt2Var;
    }

    public static tpr b(e0 e0Var, mi31 mi31Var) {
        return e0Var.a(mi31Var, new kotlinx.coroutines.flow.h(new zy11[0]));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [ru.yandex.taxi.requirements.interactor.d0] */
    public final tpr a(mi31 mi31Var, tpr tprVar) {
        ha2 n = kotlinx.coroutines.flow.e.n((mi31Var == null || !mi31Var.a.K0) ? new g92(2, mi31Var) : new z(new kotlinx.coroutines.flow.n(this.a.d(), new RequirementsInteractor$requirementsFlow$tariffFlow$1(2, null)), mi31Var), kotlinx.coroutines.flow.e.t(new b0(new kotlinx.coroutines.flow.n(this.b.a, new RequirementsInteractor$requirementsFlow$requirementsFlow$1(2, null)), this)), new kotlinx.coroutines.flow.n(kotlinx.coroutines.flow.e.K(this.e.c, new mth(this.f.f, 4), tprVar), new RequirementsInteractor$requirementsFlow$refreshTriggersFlow$1(2, null)), new RequirementsInteractor$requirementsFlow$1(4, null));
        if (mi31Var != null) {
            n = new d0(n, this, mi31Var);
        }
        this.g.getClass();
        return kotlinx.coroutines.flow.e.F(n, uyj.a);
    }
}
