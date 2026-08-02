package ru.yandex.taxi.zalogin;

import android.app.Activity;
import defpackage.dc61;
import defpackage.eky;
import defpackage.fhz;
import defpackage.jqr;
import defpackage.mdh;
import defpackage.sjh;
import defpackage.tpr;
import defpackage.tse;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.yvf0;
import ru.yandex.taxi.analytics.Events$Zalogin$LinkageContext;

/* loaded from: classes10.dex */
public final class l {
    public final tse a;
    public final eky b;
    public final j c;
    public final dc61 d;
    public final fhz e;
    public final Activity f;
    public final tt2 g;
    public final yvf0 h;

    public l(tse tseVar, eky ekyVar, j jVar, dc61 dc61Var, fhz fhzVar, Activity activity, tt2 tt2Var, yvf0 yvf0Var) {
        this.a = tseVar;
        this.b = ekyVar;
        this.c = jVar;
        this.d = dc61Var;
        this.e = fhzVar;
        this.f = activity;
        this.g = tt2Var;
        this.h = yvf0Var;
    }

    public final void a(Events$Zalogin$LinkageContext events$Zalogin$LinkageContext, Runnable runnable) {
        tpr e = this.c.e();
        this.g.getClass();
        sjh sjhVar = uyj.a;
        kotlinx.coroutines.flow.e.H(this.a, new kotlinx.coroutines.flow.o(new jqr(kotlinx.coroutines.flow.e.F(e, mdh.b), new LinkAccountsInstantLinkHolderImpl$loadLinkDataAndShow$1(this, events$Zalogin$LinkageContext, runnable, null), 3), new LinkAccountsInstantLinkHolderImpl$loadLinkDataAndShow$2(runnable, null)));
    }
}
