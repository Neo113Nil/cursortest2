package ru.yandex.taxi.summary.solid.preview_card.interactor;

import defpackage.hbp0;
import defpackage.pft0;
import defpackage.tje;
import defpackage.tt2;
import defpackage.wiq0;

/* loaded from: classes6.dex */
public final class d implements pft0 {
    public final ru.yandex.taxi.summary.solid.preview_card.data.a a;
    public final wiq0 b;
    public final hbp0 c;

    /* JADX WARN: Multi-variable type inference failed */
    public d(ru.yandex.taxi.summary.solid.preview_card.data.a aVar, wiq0 wiq0Var, tt2 tt2Var) {
        this.a = aVar;
        this.b = wiq0Var;
        this.c = new hbp0(new SummaryCardPromoStateAppearanceInteractor$scopeDelegate$1(0, tt2Var, tt2.class, "computation", "computation()Lkotlinx/coroutines/CoroutineDispatcher;", 0), null, 0 == true ? 1 : 0, 6);
    }

    @Override // defpackage.pft0
    public final void c() {
        hbp0 hbp0Var = this.c;
        hbp0Var.a();
        tje.N(hbp0Var.c(), null, null, new SummaryCardPromoStateAppearanceInteractor$onViewCreated$1(this, null), 3);
    }

    @Override // defpackage.pft0
    public final void onDestroyView() {
        this.c.b();
    }
}
