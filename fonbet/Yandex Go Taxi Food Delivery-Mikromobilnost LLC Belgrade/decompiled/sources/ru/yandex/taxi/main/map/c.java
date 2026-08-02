package ru.yandex.taxi.main.map;

import defpackage.axt;
import defpackage.c9l0;
import defpackage.er3;
import defpackage.ir3;
import defpackage.oyb0;
import defpackage.q9j0;
import defpackage.rwt;
import defpackage.tje;
import defpackage.tse;
import defpackage.tt2;
import defpackage.vwt;
import defpackage.xwt;
import defpackage.zuj0;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes5.dex */
public final class c {
    public final axt a;
    public final ru.yandex.taxi.persuggest.source.g b;
    public final ru.yandex.taxi.search.suggest.i c;
    public final q9j0 d;
    public final tt2 e;
    public final rwt f;
    public final xwt g;
    public final oyb0 h;
    public final er3 i;
    public final ir3 j;
    public final c9l0 k;
    public final zuj0 l;

    public c(axt axtVar, ru.yandex.taxi.persuggest.source.g gVar, ru.yandex.taxi.search.suggest.i iVar, q9j0 q9j0Var, tt2 tt2Var, rwt rwtVar, xwt xwtVar, oyb0 oyb0Var, er3 er3Var, ir3 ir3Var, c9l0 c9l0Var, zuj0 zuj0Var) {
        this.a = axtVar;
        this.b = gVar;
        this.c = iVar;
        this.d = q9j0Var;
        this.e = tt2Var;
        this.f = rwtVar;
        this.g = xwtVar;
        this.h = oyb0Var;
        this.i = er3Var;
        this.j = ir3Var;
        this.k = c9l0Var;
        this.l = zuj0Var;
    }

    public final void a() {
        this.g.a = false;
        rwt rwtVar = this.f;
        vwt vwtVar = vwt.a;
        r0 r0Var = rwtVar.a;
        r0Var.getClass();
        r0Var.m(null, vwtVar);
    }

    public final void b(tse tseVar) {
        tje.N(tseVar, null, null, new GpsDiscoBubbleInteractor$start$1(this, tseVar, null), 3);
    }
}
