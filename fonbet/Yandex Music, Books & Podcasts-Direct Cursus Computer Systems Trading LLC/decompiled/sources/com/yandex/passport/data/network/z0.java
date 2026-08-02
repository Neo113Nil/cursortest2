package com.yandex.passport.data.network;

import android.content.Context;
import com.yandex.passport.internal.report.xe;
import com.yandex.passport.internal.ui.bouncer.BouncerActivity;
import defpackage.rzm;
import io.appmetrica.analytics.IReporterYandex;

/* loaded from: classes4.dex */
public final class z0 implements rzm {
    public final /* synthetic */ int a;
    public final rzm b;
    public final rzm c;
    public final rzm d;
    public final rzm e;

    public /* synthetic */ z0(rzm rzmVar, rzm rzmVar2, rzm rzmVar3, rzm rzmVar4, int i) {
        this.a = i;
        this.b = rzmVar;
        this.c = rzmVar2;
        this.d = rzmVar3;
        this.e = rzmVar4;
    }

    @Override // defpackage.szm
    public final Object get() {
        switch (this.a) {
            case 0:
                return new y0((com.yandex.passport.common.coroutine.a) this.b.get(), (com.yandex.passport.common.network.l) this.c.get(), (com.yandex.passport.data.network.core.t) this.d.get(), (com.yandex.passport.data.network.core.l) this.e.get());
            case 1:
                return new c8((com.yandex.passport.common.coroutine.a) this.b.get(), (com.yandex.passport.common.network.j0) this.c.get(), (com.yandex.passport.internal.network.b) this.d.get(), new com.yandex.passport.common.core.a(13), (v7) this.e.get());
            case 2:
                return new com.yandex.passport.data.network.core.l((com.yandex.passport.common.analytics.f) this.b.get(), (com.yandex.passport.common.common.a) this.c.get(), (com.yandex.passport.common.a) this.d.get(), (com.yandex.passport.internal.report.d) this.e.get());
            case 3:
                return new com.yandex.passport.internal.badges.c((Context) this.b.get(), (com.yandex.passport.common.coroutine.a) this.c.get(), (com.yandex.passport.common.a) this.d.get(), (com.yandex.passport.internal.report.reporters.k) this.e.get());
            case 4:
                return new com.yandex.passport.internal.core.accounts.y((com.yandex.passport.internal.core.accounts.i) this.b.get(), (com.yandex.passport.internal.core.accounts.s) this.c.get(), (com.yandex.passport.internal.core.accounts.p) this.d.get(), (com.yandex.passport.internal.flags.i) this.e.get());
            case 5:
                return new com.yandex.passport.internal.core.linkage.b((com.yandex.passport.internal.core.accounts.e) this.b.get(), (com.yandex.passport.internal.core.accounts.i) this.c.get(), (com.yandex.passport.internal.network.client.h) this.d.get(), (com.yandex.passport.internal.network.mappers.d) this.e.get());
            case 6:
                return new com.yandex.passport.internal.core.linkage.c((com.yandex.passport.internal.core.linkage.d) this.b.get(), (p0) this.c.get(), (com.yandex.passport.internal.credentials.g) this.d.get(), (com.yandex.passport.internal.network.mappers.b) this.e.get());
            case 7:
                return new com.yandex.passport.internal.flags.i((com.yandex.passport.internal.flags.d) this.b.get(), (com.yandex.passport.internal.flags.experiments.i) this.c.get(), (com.yandex.passport.internal.flags.experiments.k) this.d.get(), (com.yandex.passport.internal.flags.experiments.b) this.e.get());
            case 8:
                return new com.yandex.passport.internal.helper.c((Context) this.b.get(), (com.yandex.passport.internal.storage.m) this.c.get(), (com.yandex.passport.internal.sso.h) this.d.get(), (com.yandex.passport.internal.sso.l) this.e.get());
            case 9:
                return new com.yandex.passport.internal.helper.g((com.yandex.passport.internal.network.client.h) this.b.get(), (com.yandex.passport.internal.properties.x) this.c.get(), (com.yandex.passport.internal.account.d) this.d.get(), (com.yandex.passport.internal.usecase.ui.m0) this.e.get());
            case 10:
                return new com.yandex.passport.internal.network.r((Context) this.b.get(), (com.yandex.passport.common.analytics.k) this.c.get(), (com.yandex.passport.internal.helper.h) this.d.get(), (com.yandex.passport.common.common.a) this.e.get());
            case 11:
                return new xe((Context) this.b.get(), (com.yandex.passport.internal.report.d) this.c.get(), (IReporterYandex) this.d.get(), (com.yandex.passport.common.analytics.k) this.e.get());
            case 12:
                return new com.yandex.passport.internal.sloth.z((com.yandex.passport.common.analytics.k) this.b.get(), (com.yandex.passport.common.common.a) this.c.get(), (com.yandex.passport.internal.report.d) this.d.get(), (com.yandex.passport.internal.properties.x) this.e.get());
            case 13:
                return new com.yandex.passport.internal.sloth.performers.f((Context) this.b.get(), (com.yandex.passport.internal.smsretriever.b) this.c.get(), (com.yandex.passport.internal.analytics.n0) this.d.get(), (com.yandex.passport.common.coroutine.e) this.e.get());
            case 14:
                return new com.yandex.passport.internal.sso.k((com.yandex.passport.internal.sso.g) this.b.get(), (com.yandex.passport.internal.sso.announcing.c) this.c.get(), (com.yandex.passport.internal.report.reporters.f1) this.d.get(), (com.yandex.passport.internal.network.mappers.d) this.e.get());
            case 15:
                return new com.yandex.passport.internal.ui.bouncer.chooser.h((BouncerActivity) this.b.get(), (com.yandex.passport.internal.ui.bouncer.s) this.c.get(), (com.yandex.passport.internal.ui.bouncer.chooser.a) this.d.get(), (com.yandex.passport.internal.report.reporters.q) this.e.get());
            case 16:
                return new com.yandex.passport.internal.ui.bouncer.model.middleware.h0((com.yandex.passport.internal.usecase.s0) this.b.get(), (com.yandex.passport.internal.usecase.ui.b0) this.c.get(), (com.yandex.passport.internal.usecase.ui.e) this.d.get(), (com.yandex.passport.internal.flags.i) this.e.get());
            case 17:
                return new com.yandex.passport.internal.ui.bouncer.model.middleware.j1((com.yandex.passport.internal.properties.x) this.b.get(), (com.yandex.passport.internal.flags.i) this.c.get(), (com.yandex.passport.internal.report.reporters.l) this.d.get(), (com.yandex.passport.internal.core.accounts.p) this.e.get());
            case 18:
                return new com.yandex.passport.internal.ui.bouncer.model.middleware.v1((com.yandex.passport.internal.flags.i) this.b.get(), (com.yandex.passport.internal.network.d) this.c.get(), (com.yandex.passport.internal.account.a) this.d.get(), (com.yandex.passport.internal.filter.l) this.e.get());
            case 19:
                return new com.yandex.passport.internal.ui.bouncer.roundabout.i((com.yandex.passport.common.coroutine.a) this.b.get(), (com.yandex.passport.internal.ui.bouncer.roundabout.m) this.c.get(), (com.yandex.passport.internal.report.reporters.m) this.d.get(), (com.yandex.passport.internal.flags.i) this.e.get());
            case 20:
                return new com.yandex.passport.internal.ui.challenge.delete.j1((com.yandex.passport.internal.ui.sloth.h) this.b.get(), (com.yandex.passport.internal.ui.bouncer.sloth.a) this.c.get(), (com.yandex.passport.internal.ui.sloth.k0) this.d.get(), (com.yandex.passport.sloth.ui.dependencies.p) this.e.get());
            case 21:
                return new com.yandex.passport.internal.upgrader.d((com.yandex.passport.common.coroutine.a) this.b.get(), (com.yandex.passport.internal.upgrader.m) this.c.get(), (com.yandex.passport.internal.core.accounts.e) this.d.get(), (com.yandex.passport.internal.report.reporters.e) this.e.get());
            case 22:
                return new com.yandex.passport.internal.upgrader.m((com.yandex.passport.internal.core.accounts.e) this.b.get(), (g1) this.c.get(), (com.yandex.passport.internal.network.mappers.b) this.d.get(), (com.yandex.passport.internal.f) this.e.get());
            case 23:
                return new com.yandex.passport.internal.usecase.a1((com.yandex.passport.common.coroutine.a) this.b.get(), (com.yandex.passport.internal.properties.x) this.c.get(), (i4) this.d.get(), (com.yandex.passport.internal.network.mappers.b) this.e.get());
            case 24:
                return new com.yandex.passport.internal.usecase.i1((Context) this.b.get(), (com.yandex.passport.common.coroutine.a) this.c.get(), (com.yandex.passport.common.a) this.d.get(), (com.yandex.passport.internal.report.reporters.t0) this.e.get());
            case 25:
                return new com.yandex.passport.internal.usecase.k1((Context) this.b.get(), (com.yandex.passport.common.coroutine.a) this.c.get(), (com.yandex.passport.common.a) this.d.get(), (com.yandex.passport.internal.report.reporters.t0) this.e.get());
            case 26:
                return new com.yandex.passport.internal.usecase.s1((com.yandex.passport.common.coroutine.a) this.b.get(), (com.yandex.passport.internal.config.a) this.c.get(), (com.yandex.passport.internal.core.accounts.k) this.d.get(), (com.yandex.passport.internal.report.reporters.b) this.e.get());
            case 27:
                return new com.yandex.passport.internal.usecase.u1((com.yandex.passport.common.coroutine.a) this.b.get(), (com.yandex.passport.internal.core.accounts.f) this.c.get(), (com.yandex.passport.internal.database.d) this.d.get(), (com.yandex.passport.internal.report.reporters.f1) this.e.get());
            case com.yandex.pulse.metrics.o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return new com.yandex.passport.internal.usecase.f2((com.yandex.passport.common.coroutine.a) this.b.get(), (com.yandex.passport.internal.core.accounts.e) this.c.get(), (com.yandex.passport.internal.account.b) this.d.get(), (com.yandex.passport.internal.analytics.o0) this.e.get());
            default:
                return new com.yandex.passport.internal.usecase.ui.t((com.yandex.passport.common.coroutine.a) this.b.get(), (com.yandex.passport.internal.core.accounts.y) this.c.get(), (com.yandex.passport.internal.analytics.o0) this.d.get(), (com.yandex.passport.internal.database.d) this.e.get());
        }
    }
}
