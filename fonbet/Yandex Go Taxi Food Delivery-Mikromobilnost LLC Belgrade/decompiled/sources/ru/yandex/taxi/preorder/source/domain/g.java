package ru.yandex.taxi.preorder.source.domain;

import defpackage.jqr;
import defpackage.ket0;
import defpackage.mth;
import defpackage.pfb;
import defpackage.pft0;
import defpackage.srj0;
import defpackage.tje;
import defpackage.tse;
import defpackage.yit0;
import ru.yandex.taxi.address.repository.AddressResolveRepository;

/* loaded from: classes6.dex */
public final class g implements pft0 {
    public final yit0 a;
    public final srj0 b;
    public final AddressResolveRepository c;
    public final ket0 d;
    public final pfb e;

    public g(yit0 yit0Var, srj0 srj0Var, AddressResolveRepository addressResolveRepository, ket0 ket0Var, pfb pfbVar) {
        this.a = yit0Var;
        this.b = srj0Var;
        this.c = addressResolveRepository;
        this.d = ket0Var;
        this.e = pfbVar;
    }

    @Override // defpackage.pft0
    public final void d(tse tseVar) {
        pfb pfbVar = this.e;
        tje.N(tseVar, null, null, new CloseSummaryOnEmptyTariffsInteractor$onResume$$inlined$safeCollectIn$1(new jqr(kotlinx.coroutines.flow.e.t(new f(new mth(((com.yandex.go.taxi.tariffs.internal.repository.k) pfbVar.a).i(), 4))), new CheckForEmptyTariffsInteractor$validateTariffsFlow$2(pfbVar, null), 3), null, this), 3);
    }
}
