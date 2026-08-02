package ru.yandex.taxi.multiorder;

import defpackage.h3y;
import defpackage.ls70;
import defpackage.pzt0;
import defpackage.ra00;
import defpackage.tje;
import defpackage.tse;
import defpackage.tt2;
import defpackage.yvf0;
import kotlin.coroutines.Continuation;

/* loaded from: classes9.dex */
public final class f {
    public final tse a;
    public final tt2 b;
    public final ra00 c;
    public final yvf0 d;
    public final yvf0 e;
    public final yvf0 f;
    public final h3y g;
    public final h3y h;
    public pzt0 i;

    public f(tse tseVar, tt2 tt2Var, ra00 ra00Var, yvf0 yvf0Var, yvf0 yvf0Var2, yvf0 yvf0Var3, h3y h3yVar, h3y h3yVar2) {
        this.a = tseVar;
        this.b = tt2Var;
        this.c = ra00Var;
        this.d = yvf0Var;
        this.e = yvf0Var2;
        this.f = yvf0Var3;
        this.g = h3yVar;
        this.h = h3yVar2;
    }

    public final Object a(ls70 ls70Var, Continuation continuation) {
        pzt0 pzt0Var = this.i;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        pzt0 N = tje.N(this.a, null, null, new OrderDetailsNavigatorImpl$openOrderDetailsOnLoaded$2(ls70Var, this, null), 3);
        this.i = N;
        return N.u0(continuation);
    }
}
