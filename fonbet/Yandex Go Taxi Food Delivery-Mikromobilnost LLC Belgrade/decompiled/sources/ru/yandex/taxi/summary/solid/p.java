package ru.yandex.taxi.summary.solid;

import defpackage.ajj0;
import defpackage.an8;
import defpackage.ff9;
import defpackage.hbp0;
import defpackage.kb5;
import defpackage.kdr;
import defpackage.mrj;
import defpackage.oep0;
import defpackage.oo6;
import defpackage.pzt0;
import defpackage.s0g;
import defpackage.tse;
import defpackage.tt2;
import defpackage.vqv0;
import defpackage.wiq0;
import defpackage.yvf0;
import defpackage.z880;
import ru.yandex.taxi.summary.solid.interactor.s;

/* loaded from: classes6.dex */
public final class p {
    public final tse a;
    public final ru.yandex.taxi.summary.promotions.interactor.a b;
    public final ru.yandex.taxi.summary.solid.interactor.p c;
    public final oo6 d;
    public final s e;
    public final ff9 f;
    public final mrj g;
    public final com.yandex.go.taxi.auction.domain.a h;
    public final an8 i;
    public final wiq0 j;
    public final tt2 k;
    public final s0g l;
    public final oep0 m;
    public final ajj0 n;
    public final kdr o;
    public final yvf0 p;
    public final z880 q;
    public final vqv0 r;
    public final hbp0 s;
    public pzt0 t;

    /* JADX WARN: Multi-variable type inference failed */
    public p(tse tseVar, ru.yandex.taxi.summary.promotions.interactor.a aVar, ru.yandex.taxi.summary.solid.interactor.p pVar, oo6 oo6Var, s sVar, ff9 ff9Var, mrj mrjVar, com.yandex.go.taxi.auction.domain.a aVar2, an8 an8Var, wiq0 wiq0Var, tt2 tt2Var, s0g s0gVar, oep0 oep0Var, ajj0 ajj0Var, kdr kdrVar, yvf0 yvf0Var, z880 z880Var, vqv0 vqv0Var) {
        this.a = tseVar;
        this.b = aVar;
        this.c = pVar;
        this.d = oo6Var;
        this.e = sVar;
        this.f = ff9Var;
        this.g = mrjVar;
        this.h = aVar2;
        this.i = an8Var;
        this.j = wiq0Var;
        this.k = tt2Var;
        this.l = s0gVar;
        this.m = oep0Var;
        this.n = ajj0Var;
        this.o = kdrVar;
        this.p = yvf0Var;
        this.q = z880Var;
        this.r = vqv0Var;
        this.s = new hbp0(new SolidSummaryCommunicationsDelegatePresenter$delegate$1(0, tt2Var, tt2.class, "computation", "computation()Lkotlinx/coroutines/CoroutineDispatcher;", 0), null, 0 == true ? 1 : 0, 6);
    }

    public final o a(kb5 kb5Var) {
        return new o(((com.yandex.go.taxi.tariffs.internal.repository.k) this.j).j.b(), kb5Var);
    }
}
