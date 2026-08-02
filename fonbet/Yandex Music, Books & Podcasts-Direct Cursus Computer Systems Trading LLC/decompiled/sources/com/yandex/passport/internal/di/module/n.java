package com.yandex.passport.internal.di.module;

import com.yandex.passport.internal.report.reporters.h1;
import com.yandex.passport.internal.ui.challenge.logout.f0;
import com.yandex.passport.internal.usecase.m1;
import defpackage.rzm;
import defpackage.toe;

/* loaded from: classes4.dex */
public final class n implements rzm {
    public final /* synthetic */ int a = 0;
    public final rzm b;
    public final rzm c;
    public final rzm d;
    public final rzm e;
    public final rzm f;
    public final Object g;
    public final rzm h;

    public n(rzm rzmVar, rzm rzmVar2, rzm rzmVar3, rzm rzmVar4, toe toeVar, rzm rzmVar5, rzm rzmVar6) {
        this.b = rzmVar;
        this.c = rzmVar2;
        this.d = rzmVar3;
        this.e = rzmVar4;
        this.g = toeVar;
        this.f = rzmVar5;
        this.h = rzmVar6;
    }

    @Override // defpackage.szm
    public final Object get() {
        switch (this.a) {
            case 0:
                h hVar = (h) this.g;
                com.yandex.passport.common.ui.lang.b bVar = (com.yandex.passport.common.ui.lang.b) this.b.get();
                com.yandex.passport.common.analytics.k kVar = (com.yandex.passport.common.analytics.k) this.c.get();
                com.yandex.passport.internal.common.l lVar = (com.yandex.passport.internal.common.l) this.d.get();
                com.yandex.passport.internal.network.d dVar = (com.yandex.passport.internal.network.d) this.e.get();
                com.yandex.passport.common.common.a aVar = (com.yandex.passport.common.common.a) this.f.get();
                com.yandex.passport.internal.credentials.g gVar = (com.yandex.passport.internal.credentials.g) this.h.get();
                hVar.getClass();
                bVar.getClass();
                kVar.getClass();
                lVar.getClass();
                dVar.getClass();
                aVar.getClass();
                gVar.getClass();
                com.yandex.passport.common.core.b bVar2 = com.yandex.passport.common.core.b.c;
                return new com.yandex.passport.internal.network.client.j(com.yandex.plus.pay.ui.core.b.w(gVar.a, bVar2), bVar2, dVar, bVar, kVar, lVar, aVar);
            case 1:
                return new com.yandex.passport.internal.sloth.performers.webcard.i((com.yandex.passport.common.network.n) ((h1) this.g).get(), (com.yandex.passport.common.network.n) ((h1) this.h).get(), (com.yandex.passport.internal.sloth.performers.e) this.b.get(), (com.yandex.passport.internal.sloth.performers.l) this.c.get(), (com.yandex.passport.internal.sloth.performers.b) this.d.get(), (com.yandex.passport.internal.sloth.performers.j) this.e.get(), (com.yandex.passport.internal.sloth.performers.q) this.f.get());
            default:
                return new com.yandex.passport.internal.ui.challenge.logout.s((com.yandex.passport.internal.ui.challenge.o) this.b.get(), (f0) this.c.get(), (com.yandex.passport.internal.ui.challenge.s) this.d.get(), (m1) this.e.get(), (com.yandex.passport.internal.ui.challenge.logout.d) ((toe) this.g).a, (com.yandex.passport.internal.usecase.v) this.f.get(), (com.yandex.passport.internal.usecase.ui.t) this.h.get());
        }
    }

    public n(h1 h1Var, h1 h1Var2, rzm rzmVar, rzm rzmVar2, rzm rzmVar3, rzm rzmVar4, rzm rzmVar5) {
        this.g = h1Var;
        this.h = h1Var2;
        this.b = rzmVar;
        this.c = rzmVar2;
        this.d = rzmVar3;
        this.e = rzmVar4;
        this.f = rzmVar5;
    }

    public n(h hVar, rzm rzmVar, rzm rzmVar2, rzm rzmVar3, rzm rzmVar4, rzm rzmVar5, rzm rzmVar6) {
        this.g = hVar;
        this.b = rzmVar;
        this.c = rzmVar2;
        this.d = rzmVar3;
        this.e = rzmVar4;
        this.f = rzmVar5;
        this.h = rzmVar6;
    }
}
