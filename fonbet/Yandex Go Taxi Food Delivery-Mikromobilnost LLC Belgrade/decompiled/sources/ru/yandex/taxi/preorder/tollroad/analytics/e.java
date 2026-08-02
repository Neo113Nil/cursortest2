package ru.yandex.taxi.preorder.tollroad.analytics;

import defpackage.pft0;
import defpackage.ptx;
import defpackage.tje;
import defpackage.tse;
import defpackage.wiq0;

/* loaded from: classes6.dex */
public final class e implements pft0 {
    public final ru.yandex.taxi.preorder.tollroad.data.e a;
    public final wiq0 b;
    public final ptx c;

    public e(ru.yandex.taxi.preorder.tollroad.data.e eVar, wiq0 wiq0Var, ptx ptxVar) {
        this.a = eVar;
        this.b = wiq0Var;
        this.c = ptxVar;
    }

    @Override // defpackage.pft0
    public final void a(tse tseVar) {
        tje.N(tseVar, null, null, new LastSelectedTariffOffersLifecycleListener$onAttach$1(this, null), 3);
    }
}
