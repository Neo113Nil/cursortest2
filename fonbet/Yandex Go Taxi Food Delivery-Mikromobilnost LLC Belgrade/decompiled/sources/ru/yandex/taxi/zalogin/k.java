package ru.yandex.taxi.zalogin;

import android.app.Activity;
import defpackage.bvf0;
import defpackage.cne0;
import defpackage.dc61;
import defpackage.eky;
import defpackage.fhz;
import defpackage.grt0;
import defpackage.jy60;
import defpackage.mdh;
import defpackage.pzt0;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tpr;
import defpackage.tse;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.yvf0;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes10.dex */
public final class k implements jy60 {
    public final tse a;
    public final eky b;
    public final j c;
    public final dc61 d;
    public final fhz e;
    public final Activity f;
    public final tt2 g;
    public final yvf0 h;
    public final grt0 i;
    public final r0 j = bvf0.c(Boolean.FALSE);
    public pzt0 k;
    public boolean l;

    public k(tse tseVar, eky ekyVar, j jVar, dc61 dc61Var, fhz fhzVar, Activity activity, tt2 tt2Var, yvf0 yvf0Var, grt0 grt0Var) {
        this.a = tseVar;
        this.b = ekyVar;
        this.c = jVar;
        this.d = dc61Var;
        this.e = fhzVar;
        this.f = activity;
        this.g = tt2Var;
        this.h = yvf0Var;
        this.i = grt0Var;
    }

    public final void d() {
        if (i()) {
            return;
        }
        tpr e = this.c.e();
        this.g.getClass();
        sjh sjhVar = uyj.a;
        this.k = kotlinx.coroutines.flow.e.H(this.a, new kotlinx.coroutines.flow.o(kotlinx.coroutines.flow.e.F(e, mdh.b), new LinkAccountsFullscreenHolderImpl$loadLinkAccountsData$1()));
    }

    @Override // defpackage.s150
    public final String getName() {
        return "LinkAccountsFullscreenHolderImpl";
    }

    @Override // defpackage.jy60
    public final void h() {
        tje.N(this.a, null, null, new LinkAccountsFullscreenHolderImpl$onFirstContentfulPaint$1(this, null), 3);
    }

    public final boolean i() {
        eky ekyVar = this.b;
        if (((cne0) ekyVar.b).f(ekyVar.c)) {
            return true;
        }
        dc61 dc61Var = this.d;
        dc61Var.b.getClass();
        ru.yandex.taxi.am.g gVar = dc61Var.a;
        return (gVar.f() && gVar.a.Mg() && !this.l) ? false : true;
    }
}
