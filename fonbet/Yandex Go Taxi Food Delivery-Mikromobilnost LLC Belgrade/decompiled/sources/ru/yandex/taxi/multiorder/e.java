package ru.yandex.taxi.multiorder;

import defpackage.mdh;
import defpackage.sjh;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.uyj;

/* loaded from: classes6.dex */
public final class e {
    public final com.yandex.go.superapp.order.multi.old.provider.g a;
    public final tt2 b;

    public e(com.yandex.go.superapp.order.multi.old.provider.g gVar, tt2 tt2Var) {
        this.a = gVar;
        this.b = tt2Var;
    }

    public final tpr a() {
        kotlinx.coroutines.flow.n nVar = new kotlinx.coroutines.flow.n(kotlinx.coroutines.flow.e.t(new b(this.a.h())), new MultiOrderCountInteractorImpl$countFlow$2(2, null));
        this.b.getClass();
        sjh sjhVar = uyj.a;
        return kotlinx.coroutines.flow.e.F(nVar, mdh.b);
    }

    public final d b() {
        return new d(a());
    }
}
