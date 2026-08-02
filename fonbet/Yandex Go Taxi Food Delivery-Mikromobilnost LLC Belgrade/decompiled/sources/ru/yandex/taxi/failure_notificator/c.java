package ru.yandex.taxi.failure_notificator;

import defpackage.bvf0;
import defpackage.ffx;
import defpackage.ike;
import defpackage.mdh;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.us50;
import defpackage.uyj;
import defpackage.vs50;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes9.dex */
public final class c implements vs50 {
    public final ike a;
    public final n0 b;

    public c(tt2 tt2Var) {
        tt2Var.getClass();
        sjh sjhVar = uyj.a;
        this.a = bvf0.a(mdh.b);
        this.b = ffx.c(0, 0, null, 7);
    }

    @Override // defpackage.vs50
    public final void a(us50 us50Var) {
        tje.N(this.a, null, null, new NetworkEventDataSource$apply$1(this, us50Var, null), 3);
    }
}
