package ru.yandex.taxi.sdc.router;

import defpackage.dd;
import defpackage.ec;
import defpackage.fn21;
import defpackage.i130;
import defpackage.jbh;
import defpackage.lc;
import defpackage.ml50;
import defpackage.nd;
import defpackage.rco;
import defpackage.rqo;
import defpackage.t1b0;
import defpackage.tb;
import defpackage.tje;
import defpackage.tse;
import defpackage.vf41;

/* loaded from: classes6.dex */
public final class a {
    public final i130 a;
    public final ec b;
    public final lc c;
    public final rco d;
    public final ru.yandex.taxi.am.token.a e;
    public final fn21 f;
    public final vf41 g;
    public final tse h;
    public final t1b0 i;

    public a(rqo rqoVar, i130 i130Var, ec ecVar, lc lcVar, rco rcoVar, ru.yandex.taxi.am.token.a aVar, fn21 fn21Var, vf41 vf41Var, tse tseVar) {
        this.a = i130Var;
        this.b = ecVar;
        this.c = lcVar;
        this.d = rcoVar;
        this.e = aVar;
        this.f = fn21Var;
        this.g = vf41Var;
        this.h = tseVar;
        this.i = ((jbh) rqoVar).e(ml50.f);
    }

    public final void a(dd ddVar, tb tbVar, nd ndVar) {
        tje.N(this.h, null, null, new AcceptEulaDialogRouter$showAcceptEulaDialog$1(this, ddVar, tbVar, ndVar, null), 3);
    }
}
