package com.yandex.passport.data.network;

import android.app.Activity;
import android.content.Context;
import defpackage.rzm;
import defpackage.toe;
import defpackage.tv7;

/* loaded from: classes4.dex */
public final class n implements rzm {
    public final /* synthetic */ int a;
    public final rzm b;
    public final rzm c;
    public final rzm d;
    public final rzm e;
    public final rzm f;

    public /* synthetic */ n(rzm rzmVar, rzm rzmVar2, rzm rzmVar3, rzm rzmVar4, rzm rzmVar5, int i) {
        this.a = i;
        this.b = rzmVar;
        this.c = rzmVar2;
        this.d = rzmVar3;
        this.e = rzmVar4;
        this.f = rzmVar5;
    }

    @Override // defpackage.szm
    public final Object get() {
        switch (this.a) {
            case 0:
                return new m((com.yandex.passport.common.coroutine.a) this.b.get(), (com.yandex.passport.common.network.j0) this.c.get(), (com.yandex.passport.internal.network.b) this.d.get(), (l) ((com.yandex.passport.common.coroutine.g) this.e).get(), (g) ((o) this.f).get());
            case 1:
                return new t1((com.yandex.passport.common.coroutine.a) this.b.get(), (com.yandex.passport.common.network.j0) this.c.get(), (com.yandex.passport.internal.network.b) this.d.get(), (g) ((o) this.e).get(), (com.yandex.passport.data.network.core.s) this.f.get());
            case 2:
                return new a2((com.yandex.passport.common.coroutine.a) this.b.get(), (com.yandex.passport.common.network.j0) this.c.get(), (com.yandex.passport.internal.network.b) this.d.get(), (g) ((o) this.e).get(), (com.yandex.passport.data.network.core.s) this.f.get());
            case 3:
                return new g2((com.yandex.passport.common.coroutine.a) this.b.get(), (com.yandex.passport.common.network.j0) this.c.get(), (com.yandex.passport.internal.network.b) this.d.get(), (g) ((o) this.e).get(), (com.yandex.passport.data.network.core.s) this.f.get());
            case 4:
                return new i4((com.yandex.passport.common.coroutine.a) this.b.get(), (com.yandex.passport.common.network.j0) this.c.get(), (com.yandex.passport.internal.network.b) this.d.get(), new com.yandex.passport.common.core.a(6), new com.yandex.passport.common.core.a(7), (g) ((o) this.e).get(), (com.yandex.passport.data.network.core.s) this.f.get());
            case 5:
                return new u4((com.yandex.passport.common.coroutine.a) this.b.get(), (com.yandex.passport.common.network.j0) this.c.get(), (com.yandex.passport.internal.network.b) this.d.get(), (g) ((o) this.e).get(), (com.yandex.passport.data.network.core.s) this.f.get());
            case 6:
                return new o6((com.yandex.passport.common.coroutine.a) this.b.get(), (com.yandex.passport.common.network.j0) this.c.get(), (com.yandex.passport.internal.network.b) this.d.get(), (g) ((o) this.e).get(), (com.yandex.passport.data.network.core.s) this.f.get());
            case 7:
                return new k7((com.yandex.passport.common.coroutine.a) this.b.get(), (com.yandex.passport.common.network.j0) this.c.get(), (com.yandex.passport.internal.network.b) this.d.get(), (g) ((o) this.e).get(), (com.yandex.passport.data.network.core.s) this.f.get());
            case 8:
                return new t8((com.yandex.passport.common.coroutine.a) this.b.get(), (com.yandex.passport.common.network.j0) this.c.get(), (com.yandex.passport.internal.network.b) this.d.get(), new com.yandex.passport.common.core.a(15), new com.yandex.passport.common.core.a(16), (g) ((o) this.e).get(), (com.yandex.passport.data.network.core.s) this.f.get());
            case 9:
                return new u9((com.yandex.passport.common.coroutine.a) this.b.get(), (com.yandex.passport.common.network.j0) this.c.get(), (com.yandex.passport.internal.network.b) this.d.get(), (g) ((o) this.e).get(), (com.yandex.passport.data.network.core.s) this.f.get());
            case 10:
                return new ea((com.yandex.passport.common.coroutine.a) this.b.get(), (com.yandex.passport.common.network.j0) this.c.get(), (com.yandex.passport.internal.network.b) this.d.get(), (l) ((com.yandex.passport.common.coroutine.g) this.e).get(), (g) ((o) this.f).get());
            case 11:
                return new ha((com.yandex.passport.common.coroutine.a) this.b.get(), (com.yandex.passport.common.network.j0) this.c.get(), (com.yandex.passport.internal.network.b) this.d.get(), new com.yandex.passport.common.core.a(19), new com.yandex.passport.common.core.a(20), (g) ((o) this.e).get(), (com.yandex.passport.data.network.core.s) this.f.get());
            case 12:
                return new v((com.yandex.passport.common.coroutine.a) this.b.get(), (com.yandex.passport.common.network.j0) this.c.get(), (com.yandex.passport.internal.network.b) this.d.get(), (ac) ((qa) this.e).get(), (com.yandex.passport.data.network.core.s) this.f.get());
            case 13:
                return new com.yandex.passport.data.network.token.f((com.yandex.passport.common.coroutine.a) this.b.get(), (com.yandex.passport.common.network.j0) this.c.get(), (com.yandex.passport.internal.network.b) this.d.get(), new com.yandex.passport.common.core.a(28), new com.yandex.passport.common.core.a(29), (ac) ((qa) this.e).get(), (com.yandex.passport.data.network.core.s) this.f.get());
            case 14:
                return new com.yandex.passport.data.network.token.m((com.yandex.passport.common.coroutine.a) this.b.get(), (com.yandex.passport.common.network.j0) this.c.get(), (com.yandex.passport.internal.network.b) this.d.get(), new com.yandex.passport.data.network.token.i(0), new com.yandex.passport.data.network.token.i(1), (ac) ((qa) this.e).get(), (com.yandex.passport.data.network.core.s) this.f.get());
            case 15:
                return new com.yandex.passport.data.network.token.s((com.yandex.passport.common.coroutine.a) this.b.get(), (com.yandex.passport.common.network.j0) this.c.get(), (com.yandex.passport.internal.network.b) this.d.get(), new com.yandex.passport.data.network.token.i(2), new com.yandex.passport.data.network.token.i(3), (ac) ((qa) this.e).get(), (com.yandex.passport.data.network.core.s) this.f.get());
            case 16:
                return new com.yandex.passport.data.network.token.y((com.yandex.passport.common.coroutine.a) this.b.get(), (com.yandex.passport.common.network.j0) this.c.get(), (com.yandex.passport.internal.network.b) this.d.get(), new com.yandex.passport.data.network.token.i(4), new com.yandex.passport.data.network.token.i(5), (ac) ((qa) this.e).get(), (com.yandex.passport.data.network.core.s) this.f.get());
            case 17:
                return new com.yandex.passport.data.network.token.h0((com.yandex.passport.common.coroutine.a) this.b.get(), (com.yandex.passport.common.network.j0) this.c.get(), (com.yandex.passport.internal.network.b) this.d.get(), new com.yandex.passport.data.network.token.i(6), (ac) ((qa) this.e).get(), (com.yandex.passport.data.network.core.s) this.f.get());
            case 18:
                return new com.yandex.passport.data.network.token.n0((com.yandex.passport.common.coroutine.a) this.b.get(), (com.yandex.passport.common.network.j0) this.c.get(), (com.yandex.passport.internal.network.b) this.d.get(), new com.yandex.passport.data.network.token.i(7), (ac) ((qa) this.e).get(), (com.yandex.passport.data.network.core.s) this.f.get());
            case 19:
                return new com.yandex.passport.internal.core.accounts.f((com.yandex.passport.internal.core.accounts.i) this.b.get(), (com.yandex.passport.internal.core.accounts.p) ((tv7) this.e).get(), (com.yandex.passport.internal.analytics.o0) this.c.get(), (com.yandex.passport.internal.flags.i) this.d.get(), (com.yandex.passport.internal.network.mappers.d) this.f.get());
            case 20:
                return new com.yandex.passport.internal.core.announcing.e((Context) this.b.get(), (com.yandex.passport.common.a) this.c.get(), (com.yandex.passport.internal.report.reporters.f) this.d.get(), (com.yandex.passport.common.analytics.f) this.e.get(), (com.yandex.passport.internal.config.a) ((com.yandex.passport.common.coroutine.g) this.f).get());
            case 21:
                return new com.yandex.passport.internal.network.h((com.yandex.passport.internal.properties.y) this.b.get(), (com.yandex.passport.internal.config.g) this.c.get(), (com.yandex.passport.internal.flags.i) this.d.get(), (com.yandex.passport.common.resources.b) this.e.get(), (com.yandex.passport.internal.config.template.g) ((com.yandex.passport.common.coroutine.g) this.f).get());
            case 22:
                return new com.yandex.passport.internal.ui.bouncer.roundabout.m(this.b, this.c, (s7) this.d, (s7) this.e, (com.yandex.passport.internal.ui.bouncer.roundabout.d) this.f);
            case 23:
                return new com.yandex.passport.internal.ui.challenge.changecurrent.h((com.yandex.passport.internal.ui.challenge.n) this.b.get(), (com.yandex.passport.internal.ui.challenge.changecurrent.j) ((toe) this.e).a, (com.yandex.passport.internal.ui.challenge.s) this.c.get(), (com.yandex.passport.internal.usecase.f2) this.d.get(), (com.yandex.passport.internal.account.a) this.f.get());
            case 24:
                return new com.yandex.passport.internal.ui.common.web.g((com.yandex.passport.internal.ui.common.web.j) this.b.get(), (Activity) this.c.get(), (com.yandex.passport.internal.ui.common.web.f) this.d.get(), (com.yandex.passport.internal.analytics.o0) this.e.get(), (com.yandex.passport.internal.ui.common.web.d) ((com.yandex.passport.internal.ui.bouncer.sloth.i) this.f).get());
            case 25:
                return new com.yandex.passport.internal.ui.domik.v((com.yandex.passport.internal.ui.domik.f) this.b.get(), (com.yandex.passport.internal.flags.i) this.c.get(), (com.yandex.passport.internal.properties.l) this.d.get(), (com.yandex.passport.internal.analytics.n0) this.e.get(), (com.yandex.passport.internal.report.reporters.u0) ((com.yandex.passport.internal.provider.communication.w) this.f).get());
            default:
                return new com.yandex.passport.internal.usecase.ui.i((com.yandex.passport.common.coroutine.a) this.b.get(), (com.yandex.passport.internal.network.r) ((z0) this.e).get(), (com.yandex.passport.internal.core.tokens.b) this.c.get(), (com.yandex.passport.internal.usecase.e0) this.d.get(), (com.yandex.passport.common.ui.lang.b) this.f.get());
        }
    }

    public /* synthetic */ n(rzm rzmVar, rzm rzmVar2, rzm rzmVar3, rzm rzmVar4, rzm rzmVar5, int i, boolean z) {
        this.a = i;
        this.b = rzmVar;
        this.e = rzmVar2;
        this.c = rzmVar3;
        this.d = rzmVar4;
        this.f = rzmVar5;
    }
}
