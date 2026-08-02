package ru.yandex.taxi.communications;

import defpackage.h3y;
import defpackage.tje;
import defpackage.tse;
import defpackage.tt2;
import java.util.Collection;

/* loaded from: classes9.dex */
public final class q {
    public final tse a;
    public final tt2 b;
    public final h3y c;

    public q(tt2 tt2Var, tse tseVar, h3y h3yVar) {
        this.a = tseVar;
        this.b = tt2Var;
        this.c = h3yVar;
    }

    public final void a(Collection collection) {
        tje.N(this.a, null, null, new TaxiTrackingLinkInteractor$trackLinks$1(collection, this, null), 3);
    }
}
