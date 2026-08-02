package com.yandex.passport.internal.ui.bouncer.model.middleware;

import com.yandex.passport.data.network.i4;
import defpackage.rzm;

/* loaded from: classes4.dex */
public final class b implements rzm {
    public final /* synthetic */ int a;
    public final rzm b;
    public final rzm c;
    public final rzm d;
    public final rzm e;
    public final rzm f;
    public final rzm g;
    public final rzm h;
    public final rzm i;
    public final rzm j;
    public final rzm k;

    public /* synthetic */ b(rzm rzmVar, rzm rzmVar2, rzm rzmVar3, rzm rzmVar4, rzm rzmVar5, rzm rzmVar6, rzm rzmVar7, rzm rzmVar8, rzm rzmVar9, rzm rzmVar10, int i) {
        this.a = i;
        this.b = rzmVar;
        this.c = rzmVar2;
        this.d = rzmVar3;
        this.e = rzmVar4;
        this.f = rzmVar5;
        this.g = rzmVar6;
        this.h = rzmVar7;
        this.i = rzmVar8;
        this.j = rzmVar9;
        this.k = rzmVar10;
    }

    @Override // defpackage.szm
    public final Object get() {
        switch (this.a) {
            case 0:
                return new a((u) this.b.get(), (h0) this.c.get(), (v1) this.d.get(), (a0) this.e.get(), (n0) this.f.get(), (x0) this.g.get(), (v0) this.h.get(), (t0) this.i.get(), (z0) this.j.get(), (s) this.k.get());
            case 1:
                return new com.yandex.passport.internal.usecase.s0((com.yandex.passport.common.coroutine.a) this.b.get(), (com.yandex.passport.internal.properties.x) this.c.get(), (com.yandex.passport.internal.database.h) this.d.get(), (com.yandex.passport.internal.core.accounts.i) this.e.get(), (i4) this.f.get(), (com.yandex.passport.internal.database.d) this.g.get(), (com.yandex.passport.internal.push.u0) this.h.get(), (com.yandex.passport.internal.report.reporters.f1) this.i.get(), (com.yandex.passport.internal.push.s0) this.j.get(), (com.yandex.passport.internal.network.mappers.b) this.k.get());
            case 2:
                return new com.yandex.passport.internal.usecase.m1((com.yandex.passport.common.coroutine.a) this.b.get(), (com.yandex.passport.internal.core.accounts.e) this.c.get(), (com.yandex.passport.internal.core.tokens.a) this.d.get(), (com.yandex.passport.internal.account.b) this.e.get(), (com.yandex.passport.internal.analytics.o0) this.f.get(), (com.yandex.passport.internal.usecase.p) this.g.get(), (com.yandex.passport.internal.core.accounts.s) this.h.get(), (com.yandex.passport.internal.flags.i) this.i.get(), (com.yandex.passport.internal.push.s0) this.j.get(), (com.yandex.passport.internal.push.u0) this.k.get());
            default:
                return new com.yandex.passport.internal.usecase.vpn.e((com.yandex.passport.common.coroutine.a) this.b.get(), (com.yandex.passport.common.coroutine.e) this.c.get(), (com.yandex.passport.internal.usecase.vpn.i) this.d.get(), (com.yandex.passport.internal.common.k) this.e.get(), (com.yandex.passport.internal.config.n) this.f.get(), (com.yandex.passport.internal.flags.i) this.g.get(), (com.yandex.passport.internal.account.b) this.h.get(), (com.yandex.passport.internal.sloth.e) this.i.get(), (com.yandex.passport.internal.properties.y) this.j.get(), (com.yandex.passport.internal.report.reporters.k1) this.k.get());
        }
    }
}
