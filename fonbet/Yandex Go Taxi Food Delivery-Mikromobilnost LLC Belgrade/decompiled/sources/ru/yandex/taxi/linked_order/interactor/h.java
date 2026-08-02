package ru.yandex.taxi.linked_order.interactor;

import defpackage.ike;
import defpackage.jqr;
import defpackage.mf1;
import defpackage.mth;
import defpackage.o22;
import defpackage.o400;
import defpackage.qoy;
import defpackage.rol0;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tls;
import defpackage.tt2;
import defpackage.ul00;
import defpackage.uyj;

/* loaded from: classes5.dex */
public final class h {
    public final mf1 a;
    public final qoy b;
    public final tt2 c;
    public final ru.yandex.taxi.linked_order.mapper.a d;
    public final o22 e;
    public final ul00 f;

    public h(mf1 mf1Var, qoy qoyVar, tt2 tt2Var, ru.yandex.taxi.linked_order.mapper.a aVar, o22 o22Var, ul00 ul00Var) {
        this.a = mf1Var;
        this.b = qoyVar;
        this.c = tt2Var;
        this.d = aVar;
        this.e = o22Var;
        this.f = ul00Var;
    }

    public final void a(ike ikeVar, tls tlsVar, tls tlsVar2) {
        mth mthVar = new mth(new g(new jqr(this.b.a(this.a.b), new LinkedOrderInfoDataInteractor$collectCurrentLinkedOrderInfo$1(tlsVar, null), 3), this.d), 6);
        this.c.getClass();
        sjh sjhVar = uyj.a;
        tje.N(ikeVar, null, null, new LinkedOrderInfoDataInteractor$collectCurrentLinkedOrderInfo$$inlined$safeCollectIn$1(kotlinx.coroutines.flow.e.F(mthVar, o400.a), tlsVar2, null), 3);
    }

    public final rol0 b() {
        return new rol0(new LinkedOrderInfoDataInteractor$expandViewEvent$1(this, null));
    }
}
