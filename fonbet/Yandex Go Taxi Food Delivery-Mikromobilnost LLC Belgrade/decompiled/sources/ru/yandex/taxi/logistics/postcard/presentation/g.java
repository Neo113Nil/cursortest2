package ru.yandex.taxi.logistics.postcard.presentation;

import defpackage.bvf0;
import defpackage.gwb0;
import defpackage.i3y;
import defpackage.oep0;
import defpackage.ofe0;
import defpackage.t9a0;
import defpackage.tje;
import defpackage.tse;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes9.dex */
public final class g {
    public final tse a;
    public final oep0 b;
    public final gwb0 c;
    public final i3y d = kotlin.a.a(new t9a0(26, this));
    public final r0 e;
    public final f f;

    public g(tse tseVar, oep0 oep0Var, gwb0 gwb0Var) {
        this.a = tseVar;
        this.b = oep0Var;
        this.c = gwb0Var;
        r0 c = bvf0.c(0);
        this.e = c;
        this.f = new f(c);
    }

    public final void a(ofe0 ofe0Var) {
        tje.N(this.a, null, null, new PostcardNavigator$launchPostcard$1(this, ofe0Var, null), 3);
    }
}
