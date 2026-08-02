package ru.yandex.taxi.preorder.summary.solid.interactors;

import defpackage.jqr;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.wiq0;
import defpackage.yiq0;
import defpackage.zbd;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.requirements.repository.RequirementsChangedNotifier;

/* loaded from: classes6.dex */
public final class g {
    public final wiq0 a;
    public final com.yandex.go.route.interactor.b b;
    public final ru.yandex.taxi.preorder.source.domain.a c;
    public final tt2 d;
    public final RequirementsChangedNotifier e;
    public final yiq0 f;

    public g(wiq0 wiq0Var, com.yandex.go.route.interactor.b bVar, ru.yandex.taxi.preorder.source.domain.a aVar, tt2 tt2Var, RequirementsChangedNotifier requirementsChangedNotifier, yiq0 yiq0Var) {
        this.a = wiq0Var;
        this.b = bVar;
        this.c = aVar;
        this.d = tt2Var;
        this.e = requirementsChangedNotifier;
        this.f = yiq0Var;
    }

    public final Object a(SuspendLambda suspendLambda) {
        jqr jqrVar = new jqr(kotlinx.coroutines.flow.e.t(kotlinx.coroutines.flow.e.I(kotlinx.coroutines.flow.e.p(new kotlinx.coroutines.flow.m0(com.yandex.go.coroutines.b.d(this.e.a, new AddressActionsOnSummaryInteractor$handleSelectedTariffRequirementsChange$$inlined$start$1(2, null)), ((com.yandex.go.taxi.tariffs.internal.repository.k) this.a).j.b(), new AddressActionsOnSummaryInteractor$handleSelectedTariffRequirementsChange$3(3, null)), 1000L), new AddressActionsOnSummaryInteractor$handleSelectedTariffRequirementsChange$4(this, null))), new AddressActionsOnSummaryInteractor$handleSelectedTariffRequirementsChange$5(this, null), 3);
        this.d.getClass();
        return kotlinx.coroutines.flow.e.j(kotlinx.coroutines.flow.e.F(jqrVar, uyj.a), suspendLambda);
    }

    public final Object b(SuspendLambda suspendLambda) {
        jqr jqrVar = new jqr(new kotlinx.coroutines.flow.m0(new b(kotlinx.coroutines.flow.e.s(this.b.k(), new zbd(8))), kotlinx.coroutines.flow.e.t(new d(new f(((com.yandex.go.taxi.tariffs.internal.repository.k) this.a).j.b(), this), this)), new AddressActionsOnSummaryInteractor$handleSelectionChange$6(3, null)), new AddressActionsOnSummaryInteractor$handleSelectionChange$7(this, null), 3);
        this.d.getClass();
        return kotlinx.coroutines.flow.e.j(kotlinx.coroutines.flow.e.F(jqrVar, uyj.a), suspendLambda);
    }
}
