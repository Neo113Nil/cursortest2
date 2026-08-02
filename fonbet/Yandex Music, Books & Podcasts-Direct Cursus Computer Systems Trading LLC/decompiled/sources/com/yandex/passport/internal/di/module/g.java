package com.yandex.passport.internal.di.module;

import android.content.Context;
import com.yandex.passport.data.network.s2;
import com.yandex.passport.data.network.w;
import com.yandex.passport.internal.report.gf;
import com.yandex.passport.internal.report.reporters.c0;
import com.yandex.passport.internal.report.reporters.h1;
import com.yandex.passport.internal.report.reporters.k0;
import com.yandex.passport.internal.ui.bouncer.BouncerActivity;
import com.yandex.passport.internal.ui.bouncer.model.middleware.l0;
import com.yandex.passport.internal.usecase.a1;
import com.yandex.passport.internal.usecase.a2;
import com.yandex.passport.internal.usecase.b1;
import com.yandex.passport.internal.usecase.e0;
import com.yandex.passport.internal.usecase.ui.d0;
import com.yandex.passport.internal.usecase.ui.h0;
import com.yandex.passport.internal.usecase.v2;
import defpackage.rzm;

/* loaded from: classes4.dex */
public final class g implements rzm {
    public final /* synthetic */ int a;
    public final Object b;
    public final rzm c;
    public final rzm d;
    public final rzm e;
    public final rzm f;
    public final rzm g;

    public g(rzm rzmVar, rzm rzmVar2, rzm rzmVar3, rzm rzmVar4, h1 h1Var, rzm rzmVar5) {
        this.a = 3;
        this.c = rzmVar;
        this.d = rzmVar2;
        this.e = rzmVar3;
        this.f = rzmVar4;
        this.b = h1Var;
        this.g = rzmVar5;
    }

    @Override // defpackage.szm
    public final Object get() {
        switch (this.a) {
            case 0:
                e eVar = (e) this.b;
                com.yandex.passport.internal.database.auth_cookie.d dVar = (com.yandex.passport.internal.database.auth_cookie.d) this.c.get();
                com.yandex.passport.common.coroutine.a aVar = (com.yandex.passport.common.coroutine.a) this.d.get();
                com.yandex.passport.internal.usecase.m mVar = (com.yandex.passport.internal.usecase.m) this.e.get();
                com.yandex.passport.internal.usecase.n nVar = (com.yandex.passport.internal.usecase.n) this.f.get();
                com.yandex.passport.internal.flags.i iVar = (com.yandex.passport.internal.flags.i) this.g.get();
                eVar.getClass();
                dVar.getClass();
                aVar.getClass();
                mVar.getClass();
                nVar.getClass();
                iVar.getClass();
                return new com.yandex.passport.internal.database.auth_cookie.b(dVar, aVar, mVar, nVar, iVar);
            case 1:
                e eVar2 = (e) this.b;
                Context context = (Context) this.c.get();
                com.yandex.passport.internal.usecase.n nVar2 = (com.yandex.passport.internal.usecase.n) this.d.get();
                com.yandex.passport.internal.usecase.m mVar2 = (com.yandex.passport.internal.usecase.m) this.e.get();
                com.yandex.passport.internal.network.mappers.d dVar2 = (com.yandex.passport.internal.network.mappers.d) ((com.yandex.passport.internal.flags.experiments.h) this.g).get();
                com.yandex.passport.internal.flags.i iVar2 = (com.yandex.passport.internal.flags.i) this.f.get();
                eVar2.getClass();
                context.getClass();
                nVar2.getClass();
                mVar2.getClass();
                iVar2.getClass();
                return new com.yandex.passport.internal.database.d(context, nVar2, mVar2, dVar2, iVar2);
            case 2:
                return new com.yandex.passport.internal.flags.experiments.f((s2) this.c.get(), (com.yandex.passport.internal.flags.experiments.i) this.d.get(), (com.yandex.passport.data.network.l) ((d) this.b).get(), (c0) this.e.get(), (com.yandex.passport.common.analytics.f) this.f.get(), (com.yandex.passport.internal.network.mappers.b) this.g.get());
            case 3:
                return new com.yandex.passport.internal.rotation.d((com.yandex.passport.common.coroutine.a) this.c.get(), (a1) this.d.get(), (a2) this.e.get(), (k0) this.f.get(), (com.yandex.passport.internal.rotation.h) ((h1) this.b).get(), (com.yandex.passport.internal.credentials.g) this.g.get());
            case 4:
                return new com.yandex.passport.internal.ui.bouncer.l((com.yandex.passport.internal.ui.bouncer.t) this.c.get(), (BouncerActivity) this.d.get(), ((Boolean) this.e.get()).booleanValue(), (com.yandex.passport.common.ui.a) ((com.yandex.passport.internal.ui.bouncer.f) this.b).get(), (gf) this.f.get(), (com.yandex.passport.internal.report.reporters.m) this.g.get());
            case 5:
                return new l0((h0) this.c.get(), (d0) ((com.yandex.passport.internal.ui.bouncer.roundabout.d) this.b).get(), (com.yandex.passport.internal.badges.e) this.d.get(), (com.yandex.passport.internal.badges.h) this.e.get(), (b1) this.f.get(), (com.yandex.passport.internal.flags.i) this.g.get());
            case 6:
                return new e0((com.yandex.passport.common.coroutine.a) this.c.get(), (com.yandex.passport.internal.core.accounts.e) this.d.get(), (com.yandex.passport.internal.network.d) this.e.get(), (com.yandex.passport.data.network.v) ((w) this.b).get(), (com.yandex.passport.internal.report.reporters.h) this.f.get(), (com.yandex.passport.internal.network.mappers.b) this.g.get());
            default:
                return new v2((Context) this.c.get(), (com.yandex.passport.common.coroutine.a) this.d.get(), (com.yandex.passport.data.network.v) ((com.yandex.passport.data.network.n) this.b).get(), (com.yandex.passport.internal.core.accounts.e) this.e.get(), (com.yandex.passport.internal.core.accounts.a) this.f.get(), (com.yandex.passport.internal.network.mappers.b) this.g.get());
        }
    }

    public /* synthetic */ g(rzm rzmVar, rzm rzmVar2, rzm rzmVar3, rzm rzmVar4, rzm rzmVar5, rzm rzmVar6, int i, boolean z) {
        this.a = i;
        this.c = rzmVar;
        this.d = rzmVar2;
        this.e = rzmVar3;
        this.b = rzmVar4;
        this.f = rzmVar5;
        this.g = rzmVar6;
    }

    public /* synthetic */ g(rzm rzmVar, rzm rzmVar2, rzm rzmVar3, rzm rzmVar4, rzm rzmVar5, rzm rzmVar6, int i) {
        this.a = i;
        this.c = rzmVar;
        this.d = rzmVar2;
        this.b = rzmVar3;
        this.e = rzmVar4;
        this.f = rzmVar5;
        this.g = rzmVar6;
    }

    public g(rzm rzmVar, com.yandex.passport.internal.ui.bouncer.roundabout.d dVar, rzm rzmVar2, rzm rzmVar3, rzm rzmVar4, rzm rzmVar5) {
        this.a = 5;
        this.c = rzmVar;
        this.b = dVar;
        this.d = rzmVar2;
        this.e = rzmVar3;
        this.f = rzmVar4;
        this.g = rzmVar5;
    }

    public g(e eVar, rzm rzmVar, rzm rzmVar2, rzm rzmVar3, rzm rzmVar4, rzm rzmVar5) {
        this.a = 0;
        this.b = eVar;
        this.c = rzmVar;
        this.d = rzmVar2;
        this.e = rzmVar3;
        this.f = rzmVar4;
        this.g = rzmVar5;
    }

    public g(e eVar, rzm rzmVar, rzm rzmVar2, rzm rzmVar3, com.yandex.passport.internal.flags.experiments.h hVar, rzm rzmVar4) {
        this.a = 1;
        this.b = eVar;
        this.c = rzmVar;
        this.d = rzmVar2;
        this.e = rzmVar3;
        this.g = hVar;
        this.f = rzmVar4;
    }
}
