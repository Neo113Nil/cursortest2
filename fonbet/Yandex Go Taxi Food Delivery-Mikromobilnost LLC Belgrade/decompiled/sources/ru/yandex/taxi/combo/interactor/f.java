package ru.yandex.taxi.combo.interactor;

import com.yandex.go.taxi.order.view.i;
import com.yandex.go.taxi.order.view.l;
import defpackage.bd11;
import defpackage.mth;
import defpackage.n20;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.uyj;
import kotlinx.coroutines.flow.m0;

/* loaded from: classes5.dex */
public final class f {
    public final n20 a;
    public final tt2 b;
    public final bd11 c;
    public final l d;

    public f(n20 n20Var, tt2 tt2Var, bd11 bd11Var, l lVar) {
        this.a = n20Var;
        this.b = tt2Var;
        this.c = bd11Var;
        this.d = lVar;
    }

    public final tpr a() {
        tpr t = kotlinx.coroutines.flow.e.t(new c(new m0(kotlinx.coroutines.flow.e.t(new e(kotlinx.coroutines.flow.e.X(new mth(((com.yandex.go.taxi.order.provider.a) this.a).v(), 6), new TravelCompanionDetailInteractor$listenTravelCompanions$$inlined$flatMapLatest$1(3, null)))), new i(this.d.j), TravelCompanionDetailInteractor$listenTravelCompanionDetail$1.a), this));
        this.b.getClass();
        return kotlinx.coroutines.flow.e.F(t, uyj.a);
    }
}
