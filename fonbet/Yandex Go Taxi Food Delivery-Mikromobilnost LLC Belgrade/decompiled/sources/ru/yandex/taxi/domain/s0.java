package ru.yandex.taxi.domain;

import com.yandex.go.safety.center.experiment.SafetyCenterExperiment;
import defpackage.cda0;
import defpackage.d200;
import defpackage.dc61;
import defpackage.fxi0;
import defpackage.gku;
import defpackage.hor0;
import defpackage.l1s;
import defpackage.ln10;
import defpackage.lr6;
import defpackage.mdh;
import defpackage.nc4;
import defpackage.ny51;
import defpackage.qmp;
import defpackage.rq11;
import defpackage.si0;
import defpackage.sjh;
import defpackage.tpr;
import defpackage.tv11;
import defpackage.uap;
import defpackage.ul51;
import defpackage.uyj;
import defpackage.v500;
import defpackage.x5d0;

/* loaded from: classes9.dex */
public final class s0 {
    public final qmp A;
    public final ny51 B;
    public final com.yandex.go.yb.main_menu.data.i C;
    public final com.yandex.go.repositories.e a;
    public final x5d0 b;
    public final ru.yandex.taxi.am.m c;
    public final ru.yandex.taxi.launch.c d;
    public final dc61 e;
    public final cda0 f;
    public final hor0 g;
    public final uap h;
    public final v500 i;
    public final gku j;
    public final fxi0 k;
    public final rq11 l;
    public final nc4 m;
    public final ru.yandex.taxi.settings.domain.a n;
    public final d200 o;
    public final lr6 p;
    public final com.yandex.go.payments.shared.family.viewmodels.c q;
    public final com.yandex.go.special_needs_menu.ui.a r;
    public final com.yandex.go.payments.domain.u s;
    public final si0 t;
    public final com.yandex.go.user_profile.main_menu.log_out.domain.c u;
    public final ru.yandex.taxi.settings.account.c v;
    public final l1s w;
    public final com.yandex.go.business.impl.domain.g x;
    public final ln10 y;
    public final com.yandex.go.lottery.domain.c z;

    public s0(com.yandex.go.repositories.e eVar, x5d0 x5d0Var, ru.yandex.taxi.am.m mVar, ru.yandex.taxi.launch.c cVar, dc61 dc61Var, cda0 cda0Var, hor0 hor0Var, uap uapVar, v500 v500Var, gku gkuVar, fxi0 fxi0Var, rq11 rq11Var, nc4 nc4Var, ru.yandex.taxi.settings.domain.a aVar, d200 d200Var, lr6 lr6Var, com.yandex.go.payments.shared.family.viewmodels.c cVar2, com.yandex.go.special_needs_menu.ui.a aVar2, com.yandex.go.payments.domain.u uVar, si0 si0Var, com.yandex.go.user_profile.main_menu.log_out.domain.c cVar3, ru.yandex.taxi.settings.account.c cVar4, l1s l1sVar, com.yandex.go.business.impl.domain.g gVar, ln10 ln10Var, com.yandex.go.lottery.domain.c cVar5, qmp qmpVar, ny51 ny51Var, com.yandex.go.yb.main_menu.data.i iVar) {
        this.a = eVar;
        this.b = x5d0Var;
        this.c = mVar;
        this.d = cVar;
        this.e = dc61Var;
        this.f = cda0Var;
        this.g = hor0Var;
        this.h = uapVar;
        this.i = v500Var;
        this.j = gkuVar;
        this.k = fxi0Var;
        this.l = rq11Var;
        this.m = nc4Var;
        this.n = aVar;
        this.o = d200Var;
        this.p = lr6Var;
        this.q = cVar2;
        this.r = aVar2;
        this.s = uVar;
        this.t = si0Var;
        this.u = cVar3;
        this.v = cVar4;
        this.w = l1sVar;
        this.x = gVar;
        this.y = ln10Var;
        this.z = cVar5;
        this.A = qmpVar;
        this.B = ny51Var;
        this.C = iVar;
    }

    public final kotlinx.coroutines.flow.m0 a() {
        gku gkuVar = this.j;
        return new kotlinx.coroutines.flow.m0(new ru.yandex.taxi.hiredriver.b(gkuVar.a.a.a(), gkuVar), ((tv11) this.k).e, new MainMenuItemsInteractorImpl$hireDriverFlow$1(3, null));
    }

    public final tpr b() {
        ((ul51) this.A).getClass();
        return new com.yandex.go.safety.center.experiment.o(((com.yandex.go.safety.center.experiment.p) this.i).b.e(SafetyCenterExperiment.u).a());
    }

    public final kotlinx.coroutines.flow.m0 c() {
        return new kotlinx.coroutines.flow.m0(new com.yandex.go.payments.shared.domain.b(this.g.a.l.c()), new f0(((com.yandex.go.payments.paymentlist.data.c) this.f).u), new MainMenuItemsInteractorImpl$sharedAccountsFlow$2(null, this));
    }

    public final tpr d() {
        com.yandex.go.business.impl.domain.g gVar = this.x;
        tpr t = kotlinx.coroutines.flow.e.t(new com.yandex.go.business.impl.domain.d(((ru.yandex.taxi.experiments.q) gVar.c.getValue()).a(), gVar));
        gVar.b.getClass();
        sjh sjhVar = uyj.a;
        return kotlinx.coroutines.flow.e.F(t, mdh.b);
    }

    public final tpr e() {
        boolean z = false;
        d0 d0Var = new d0(kotlinx.coroutines.flow.e.K(this.c.f, this.d.b()), this);
        dc61 dc61Var = this.e;
        dc61Var.b.getClass();
        ru.yandex.taxi.am.g gVar = dc61Var.a;
        if (gVar.f() && gVar.a.Mg()) {
            z = true;
        }
        return kotlinx.coroutines.flow.e.t(com.yandex.go.coroutines.b.d(d0Var, new MainMenuItemsInteractorImpl$special$$inlined$start$1(Boolean.valueOf(z), null)));
    }
}
