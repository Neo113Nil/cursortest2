package com.yandex.passport.data.network;

import android.app.Activity;
import android.content.Context;
import defpackage.rzm;

/* loaded from: classes4.dex */
public final class w implements rzm {
    public final /* synthetic */ int a;
    public final rzm b;
    public final rzm c;
    public final rzm d;
    public final rzm e;
    public final rzm f;

    public /* synthetic */ w(rzm rzmVar, rzm rzmVar2, rzm rzmVar3, rzm rzmVar4, rzm rzmVar5, int i) {
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
                return new v((com.yandex.passport.common.coroutine.a) this.b.get(), (com.yandex.passport.common.network.j0) this.c.get(), (com.yandex.passport.internal.network.b) this.d.get(), (r) this.e.get(), (com.yandex.passport.data.network.core.s) this.f.get());
            case 1:
                return new g1((com.yandex.passport.common.coroutine.a) this.b.get(), (com.yandex.passport.common.network.j0) this.c.get(), (com.yandex.passport.internal.network.b) this.d.get(), (c1) this.e.get(), (com.yandex.passport.data.network.core.x) this.f.get());
            case 2:
                return new pa((com.yandex.passport.common.coroutine.a) this.b.get(), (com.yandex.passport.common.network.j0) this.c.get(), (com.yandex.passport.internal.network.b) this.d.get(), (ka) this.e.get(), (com.yandex.passport.data.network.core.x) this.f.get());
            case 3:
                return new xb((com.yandex.passport.common.coroutine.a) this.b.get(), (com.yandex.passport.common.network.j0) this.c.get(), (com.yandex.passport.internal.network.b) this.d.get(), (tb) this.e.get(), new com.yandex.passport.common.core.a(24), new com.yandex.passport.common.core.a(25), (com.yandex.passport.data.network.core.x) this.f.get());
            case 4:
                return new com.yandex.passport.internal.badges.j((com.yandex.passport.common.coroutine.a) this.b.get(), (com.yandex.passport.internal.badges.c) this.c.get(), (h3) this.d.get(), (com.yandex.passport.internal.report.reporters.k) this.e.get(), (com.yandex.passport.internal.network.mappers.b) this.f.get());
            case 5:
                return new com.yandex.passport.internal.core.auth.a((Context) this.b.get(), (com.yandex.passport.internal.usecase.b2) this.c.get(), (com.yandex.passport.internal.database.d) this.d.get(), (com.yandex.passport.internal.core.announcing.b) this.e.get(), (com.yandex.passport.internal.account.b) this.f.get());
            case 6:
                return new com.yandex.passport.internal.push.u0((Context) this.b.get(), (com.yandex.passport.internal.properties.x) this.c.get(), (com.yandex.passport.common.permission.b) this.d.get(), (com.yandex.passport.internal.flags.i) this.e.get(), (com.yandex.passport.internal.push.d1) this.f.get());
            case 7:
                return new com.yandex.passport.internal.report.diary.m0((com.yandex.passport.internal.flags.i) this.b.get(), (com.yandex.passport.common.a) this.c.get(), (com.yandex.passport.internal.report.diary.e0) this.d.get(), (com.yandex.passport.internal.report.diary.b0) this.e.get(), (com.yandex.passport.common.coroutine.a) this.f.get());
            case 8:
                return new com.yandex.passport.internal.report.diary.w0((com.yandex.passport.common.coroutine.a) this.b.get(), (com.yandex.passport.internal.flags.i) this.c.get(), (com.yandex.passport.internal.report.diary.q0) this.d.get(), (com.yandex.passport.common.a) this.e.get(), (com.yandex.passport.internal.report.diary.n0) this.f.get());
            case 9:
                return new com.yandex.passport.internal.ui.authsdk.n((Activity) this.b.get(), (com.yandex.passport.internal.ui.bouncer.error.q) this.c.get(), (com.yandex.passport.common.common.a) this.d.get(), (com.yandex.passport.common.analytics.f) this.e.get(), (com.yandex.passport.internal.clipboard.a) this.f.get());
            case 10:
                com.yandex.passport.internal.ui.bouncer.model.c1 c1Var = (com.yandex.passport.internal.ui.bouncer.model.c1) this.b.get();
                com.yandex.passport.internal.ui.bouncer.model.middleware.a aVar = (com.yandex.passport.internal.ui.bouncer.model.middleware.a) this.c.get();
                com.yandex.passport.internal.ui.bouncer.model.middleware.c cVar = (com.yandex.passport.internal.ui.bouncer.model.middleware.c) this.d.get();
                com.yandex.passport.internal.ui.bouncer.model.h2 h2Var = (com.yandex.passport.internal.ui.bouncer.model.h2) this.e.get();
                com.yandex.passport.internal.ui.bouncer.model.x0 x0Var = (com.yandex.passport.internal.ui.bouncer.model.x0) this.f.get();
                c1Var.getClass();
                aVar.getClass();
                cVar.getClass();
                h2Var.getClass();
                x0Var.getClass();
                return new com.yandex.passport.internal.ui.bouncer.model.z0(new com.yandex.passport.internal.ui.bouncer.model.l1(new com.yandex.passport.internal.ui.bouncer.model.q1(false, false), com.yandex.passport.internal.ui.bouncer.model.i1.a, null, null, com.yandex.passport.internal.ui.bouncer.model.i2.a, null), c1Var, aVar, cVar, h2Var, x0Var.c, x0Var);
            case 11:
                return new com.yandex.passport.internal.ui.bouncer.sloth.g((com.yandex.passport.internal.ui.sloth.h) this.b.get(), (com.yandex.passport.internal.ui.bouncer.sloth.a) this.c.get(), (com.yandex.passport.internal.ui.bouncer.sloth.h) this.d.get(), (com.yandex.passport.sloth.ui.dependencies.p) this.e.get(), (com.yandex.passport.internal.properties.x) this.f.get());
            case 12:
                return new com.yandex.passport.internal.usecase.e((com.yandex.passport.common.coroutine.a) this.b.get(), (com.yandex.passport.internal.core.accounts.e) this.c.get(), (c0) this.d.get(), (com.yandex.passport.internal.network.mappers.b) this.e.get(), (com.yandex.passport.internal.report.reporters.v) this.f.get());
            case 13:
                return new com.yandex.passport.internal.usecase.h((com.yandex.passport.common.coroutine.a) this.b.get(), (com.yandex.passport.internal.core.accounts.e) this.c.get(), (j0) this.d.get(), (com.yandex.passport.internal.network.mappers.b) this.e.get(), (com.yandex.passport.internal.report.reporters.v) this.f.get());
            case 14:
                return new com.yandex.passport.internal.usecase.u((com.yandex.passport.common.coroutine.a) this.b.get(), (com.yandex.passport.internal.usecase.z) this.c.get(), (com.yandex.passport.internal.report.reporters.f1) this.d.get(), (com.yandex.passport.internal.database.d) this.e.get(), (com.yandex.passport.common.ui.lang.b) this.f.get());
            case 15:
                return new com.yandex.passport.internal.usecase.w0((com.yandex.passport.common.coroutine.a) this.b.get(), (com.yandex.passport.internal.core.accounts.e) this.c.get(), (o6) this.d.get(), (com.yandex.passport.internal.network.mappers.b) this.e.get(), (com.yandex.passport.internal.report.reporters.p) this.f.get());
            case 16:
                return new com.yandex.passport.internal.usecase.r1((com.yandex.passport.common.coroutine.a) this.b.get(), (com.yandex.passport.internal.core.accounts.e) this.c.get(), (n9) this.d.get(), (com.yandex.passport.internal.network.mappers.b) this.e.get(), (com.yandex.passport.internal.report.reporters.v) this.f.get());
            case 17:
                return new com.yandex.passport.internal.usecase.l2((com.yandex.passport.common.coroutine.a) this.b.get(), (com.yandex.passport.common.ui.lang.b) this.c.get(), (pb) this.d.get(), (com.yandex.passport.internal.report.reporters.e1) this.e.get(), (com.yandex.passport.internal.network.mappers.b) this.f.get());
            case 18:
                return new com.yandex.passport.internal.usecase.o2((com.yandex.passport.common.coroutine.a) this.b.get(), (xb) this.c.get(), (com.yandex.passport.internal.core.accounts.e) this.d.get(), (com.yandex.passport.internal.network.mappers.b) this.e.get(), (com.yandex.passport.internal.report.reporters.j0) this.f.get());
            case 19:
                return new com.yandex.passport.internal.usecase.ui.l((com.yandex.passport.common.coroutine.a) this.b.get(), (com.yandex.passport.internal.usecase.r) this.c.get(), (com.yandex.passport.data.network.token.y) this.d.get(), (com.yandex.passport.internal.credentials.g) this.e.get(), (com.yandex.passport.internal.network.mappers.b) this.f.get());
            case 20:
                return new com.yandex.passport.internal.usecase.ui.r0((com.yandex.passport.internal.usecase.ui.d1) this.b.get(), (com.yandex.passport.internal.f) this.c.get(), new com.yandex.passport.internal.ui.e(), (com.yandex.passport.internal.usecase.l2) this.d.get(), (com.yandex.passport.internal.usecase.ui.r) this.e.get(), (com.yandex.passport.common.coroutine.a) this.f.get());
            default:
                return new com.yandex.passport.internal.usecase.ui.t0((com.yandex.passport.common.coroutine.a) this.b.get(), (com.yandex.passport.internal.usecase.e0) this.c.get(), (com.yandex.passport.common.ui.lang.b) this.d.get(), (com.yandex.passport.internal.core.tokens.b) this.e.get(), (com.yandex.passport.internal.usecase.ui.w0) this.f.get());
        }
    }
}
