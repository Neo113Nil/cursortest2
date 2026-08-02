package com.yandex.passport.data.network;

import android.content.Context;
import defpackage.rzm;
import defpackage.t8a;

/* loaded from: classes4.dex */
public final class h9 implements rzm {
    public final /* synthetic */ int a;
    public final rzm b;
    public final rzm c;
    public final rzm d;
    public final rzm e;
    public final rzm f;
    public final rzm g;

    public /* synthetic */ h9(rzm rzmVar, rzm rzmVar2, rzm rzmVar3, rzm rzmVar4, rzm rzmVar5, rzm rzmVar6, int i) {
        this.a = i;
        this.b = rzmVar;
        this.c = rzmVar2;
        this.d = rzmVar3;
        this.e = rzmVar4;
        this.f = rzmVar5;
        this.g = rzmVar6;
    }

    @Override // defpackage.szm
    public final Object get() {
        switch (this.a) {
            case 0:
                return new g9((com.yandex.passport.common.coroutine.a) this.b.get(), (com.yandex.passport.common.network.j0) this.c.get(), (com.yandex.passport.internal.network.b) this.d.get(), (d9) this.e.get(), new com.yandex.passport.common.core.a(17), (z8) this.f.get(), (com.yandex.passport.data.network.core.x) this.g.get());
            case 1:
                return new com.yandex.passport.internal.config.j((com.yandex.passport.common.coroutine.a) this.b.get(), (c8) this.c.get(), (com.yandex.passport.internal.report.reporters.o) this.d.get(), (com.yandex.passport.internal.config.e) this.e.get(), (com.yandex.passport.internal.network.mappers.b) this.f.get(), (com.yandex.passport.internal.config.a) this.g.get());
            case 2:
                return new com.yandex.passport.internal.core.announcing.b((com.yandex.passport.internal.core.announcing.e) this.b.get(), (com.yandex.passport.internal.core.accounts.c) this.c.get(), (com.yandex.passport.internal.push.u0) this.d.get(), (com.yandex.passport.internal.core.announcing.c) this.e.get(), (com.yandex.passport.internal.sso.announcing.e) this.f.get(), (com.yandex.passport.internal.helper.a) this.g.get());
            case 3:
                return new com.yandex.passport.internal.sso.announcing.e((Context) this.b.get(), (com.yandex.passport.internal.sso.g) this.c.get(), (com.yandex.passport.internal.sso.l) this.d.get(), (com.yandex.passport.internal.analytics.o0) this.e.get(), (com.yandex.passport.internal.sso.j) this.f.get(), t8a.a(this.g));
            case 4:
                return new com.yandex.passport.internal.ui.bouncer.error.b((com.yandex.passport.internal.ui.bouncer.error.q) this.b.get(), (com.yandex.passport.internal.ui.bouncer.s) this.c.get(), (com.yandex.passport.common.common.a) this.d.get(), (com.yandex.passport.common.analytics.f) this.e.get(), (com.yandex.passport.internal.clipboard.a) this.f.get(), (com.yandex.passport.internal.properties.x) this.g.get());
            case 5:
                return new com.yandex.passport.internal.ui.bouncer.roundabout.t((com.yandex.passport.internal.ui.bouncer.roundabout.x) this.b.get(), (com.yandex.passport.internal.ui.bouncer.s) this.c.get(), (com.yandex.passport.internal.ui.bouncer.roundabout.d0) this.d.get(), (com.yandex.passport.internal.ui.bouncer.roundabout.f0) this.e.get(), (com.yandex.passport.internal.ui.bouncer.roundabout.f) this.f.get(), (com.yandex.passport.internal.properties.x) this.g.get());
            case 6:
                return new com.yandex.passport.internal.ui.challenge.s((com.yandex.passport.internal.network.d) this.b.get(), (com.yandex.passport.internal.usecase.k0) this.c.get(), (com.yandex.passport.internal.usecase.e0) this.d.get(), (com.yandex.passport.common.ui.lang.b) this.e.get(), (com.yandex.passport.internal.flags.i) this.f.get(), (com.yandex.passport.internal.report.reporters.n) this.g.get());
            case 7:
                return new com.yandex.passport.internal.usecase.i2((com.yandex.passport.common.coroutine.a) this.b.get(), (com.yandex.passport.internal.core.accounts.e) this.c.get(), (jb) this.d.get(), (com.yandex.passport.internal.network.mappers.b) this.e.get(), (com.yandex.passport.internal.config.h) this.f.get(), (com.yandex.passport.internal.report.reporters.v) this.g.get());
            case 8:
                return new com.yandex.passport.internal.usecase.authorize.f((com.yandex.passport.common.coroutine.a) this.b.get(), (com.yandex.passport.internal.usecase.k) this.c.get(), (com.yandex.passport.internal.usecase.r) this.d.get(), (com.yandex.passport.data.network.token.f) this.e.get(), (com.yandex.passport.internal.credentials.g) this.f.get(), (com.yandex.passport.internal.network.mappers.b) this.g.get());
            case 9:
                return new com.yandex.passport.internal.usecase.ui.o((com.yandex.passport.common.coroutine.a) this.b.get(), (com.yandex.passport.internal.core.accounts.e) this.c.get(), (com.yandex.passport.internal.network.client.h) this.d.get(), (com.yandex.passport.common.ui.lang.b) this.e.get(), (com.yandex.passport.internal.common.l) this.f.get(), (com.yandex.passport.internal.usecase.e0) this.g.get());
            default:
                return new com.yandex.passport.internal.usecase.ui.n1((com.yandex.passport.internal.account.d) this.b.get(), new com.yandex.passport.internal.ui.e(), (com.yandex.passport.internal.usecase.ui.d1) this.c.get(), (com.yandex.passport.common.coroutine.a) this.d.get(), (com.yandex.passport.internal.usecase.l2) this.e.get(), (mc) this.f.get(), (com.yandex.passport.internal.network.mappers.b) this.g.get());
        }
    }
}
