package ru.yandex.taxi.summary.personalaction.popup;

import defpackage.dx;
import defpackage.jqr;
import defpackage.n3b0;
import defpackage.o400;
import defpackage.oep0;
import defpackage.q150;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.uyj;
import kotlinx.coroutines.channels.BufferOverflow;

/* loaded from: classes6.dex */
public final class e {
    public final tt2 a;
    public final dx b;
    public final q150 c;
    public final n3b0 d;
    public final oep0 e;

    public e(tt2 tt2Var, dx dxVar, q150 q150Var, n3b0 n3b0Var, oep0 oep0Var) {
        this.a = tt2Var;
        this.b = dxVar;
        this.c = q150Var;
        this.d = n3b0Var;
        this.e = oep0Var;
    }

    public final tpr a() {
        b bVar = new b(new d(kotlinx.coroutines.flow.e.f(new ru.yandex.taxi.personalstate.domain.interactor.b(this.b.a.x), 0, BufferOverflow.DROP_OLDEST, 1), this));
        this.a.getClass();
        return kotlinx.coroutines.flow.e.F(new jqr(kotlinx.coroutines.flow.e.F(bVar, uyj.a), new PersonalActionPopupInteractor$viewModelFlow$3(this, null), 3), o400.a);
    }
}
