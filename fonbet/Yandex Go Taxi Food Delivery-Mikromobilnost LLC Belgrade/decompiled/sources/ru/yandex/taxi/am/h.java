package ru.yandex.taxi.am;

import defpackage.eci0;
import defpackage.ffx;
import defpackage.h3y;
import defpackage.hbp0;
import defpackage.hit;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import kotlinx.coroutines.channels.BufferOverflow;

/* loaded from: classes9.dex */
public final class h {
    public final h3y a;
    public final hit b;
    public final tt2 c;
    public final kotlinx.coroutines.flow.n0 d;
    public final eci0 e;

    public h(tt2 tt2Var, hit hitVar, h3y h3yVar) {
        this.a = h3yVar;
        this.b = hitVar;
        this.c = tt2Var;
        kotlinx.coroutines.flow.n0 b = ffx.b(1, 1, BufferOverflow.DROP_OLDEST);
        this.d = b;
        this.e = kotlinx.coroutines.flow.e.c(b);
    }

    public final void a() {
        this.d.g(Boolean.TRUE);
        hbp0 hbp0Var = this.b.a;
        this.c.getClass();
        tje.N(hbp0Var, uyj.a, null, new AccountResetEventRepository$onAccountReset$1(this, null), 2);
    }
}
