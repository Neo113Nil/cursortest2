package com.yandex.passport.internal.analytics;

import android.content.Context;
import com.yandex.passport.data.network.e7;
import com.yandex.passport.data.network.g1;
import com.yandex.passport.data.network.g9;
import com.yandex.passport.data.network.t3;
import com.yandex.passport.internal.report.reporters.f1;
import com.yandex.passport.internal.usecase.s0;
import com.yandex.passport.internal.usecase.u1;
import com.yandex.passport.internal.usecase.ui.t0;
import com.yandex.passport.internal.usecase.ui.w0;
import com.yandex.passport.internal.usecase.ui.y0;
import defpackage.rzm;

/* loaded from: classes4.dex */
public final class d0 implements rzm {
    public final /* synthetic */ int a;
    public final rzm b;
    public final rzm c;
    public final rzm d;
    public final rzm e;
    public final rzm f;
    public final rzm g;
    public final rzm h;

    public /* synthetic */ d0(rzm rzmVar, rzm rzmVar2, rzm rzmVar3, rzm rzmVar4, rzm rzmVar5, rzm rzmVar6, rzm rzmVar7, int i) {
        this.a = i;
        this.b = rzmVar;
        this.c = rzmVar2;
        this.d = rzmVar3;
        this.e = rzmVar4;
        this.f = rzmVar5;
        this.g = rzmVar6;
        this.h = rzmVar7;
    }

    @Override // defpackage.szm
    public final Object get() {
        switch (this.a) {
            case 0:
                return new c0((Context) this.b.get(), (com.yandex.passport.internal.storage.m) this.c.get(), (com.yandex.passport.internal.account.a) this.d.get(), (com.yandex.passport.internal.database.d) this.e.get(), (o0) this.f.get(), (com.yandex.passport.internal.properties.x) this.g.get(), (com.yandex.passport.common.a) this.h.get());
            case 1:
                return new com.yandex.passport.internal.sloth.w((com.yandex.passport.internal.usecase.e0) this.b.get(), (com.yandex.passport.internal.usecase.ui.g) this.c.get(), (y0) this.d.get(), (t0) this.e.get(), (w0) this.f.get(), (com.yandex.passport.internal.usecase.ui.j0) this.g.get(), (com.yandex.passport.internal.network.r) this.h.get());
            case 2:
                return new com.yandex.passport.internal.upgrader.k((com.yandex.passport.common.coroutine.a) this.b.get(), (com.yandex.passport.internal.core.accounts.e) this.c.get(), (g1) this.d.get(), (com.yandex.passport.internal.f) this.e.get(), (com.yandex.passport.internal.upgrader.q) this.f.get(), (com.yandex.passport.internal.report.reporters.e) this.g.get(), (com.yandex.passport.internal.network.mappers.b) this.h.get());
            case 3:
                return new com.yandex.passport.internal.usecase.z((com.yandex.passport.common.coroutine.a) this.b.get(), (g9) this.c.get(), (com.yandex.passport.internal.core.accounts.e) this.d.get(), (com.yandex.passport.internal.flags.i) this.e.get(), (com.yandex.passport.internal.rotation.d) this.f.get(), (com.yandex.passport.internal.network.mappers.b) this.g.get(), (com.yandex.passport.data.mapper.a) this.h.get());
            case 4:
                return new com.yandex.passport.internal.usecase.k0((com.yandex.passport.common.coroutine.a) this.b.get(), (t3) this.c.get(), (com.yandex.passport.internal.network.d) this.d.get(), (com.yandex.passport.internal.usecase.v) this.e.get(), (s0) this.f.get(), (com.yandex.passport.common.common.a) this.g.get(), (com.yandex.passport.internal.network.mappers.b) this.h.get());
            case 5:
                return new com.yandex.passport.internal.usecase.authorize.c((com.yandex.passport.common.coroutine.a) this.b.get(), (com.yandex.passport.internal.usecase.k) this.c.get(), (com.yandex.passport.internal.usecase.r) this.d.get(), (com.yandex.passport.data.network.token.m) this.e.get(), (f1) this.f.get(), (com.yandex.passport.internal.credentials.g) this.g.get(), (com.yandex.passport.internal.network.mappers.b) this.h.get());
            case 6:
                return new com.yandex.passport.internal.usecase.authorize.o((com.yandex.passport.common.coroutine.a) this.b.get(), (u1) this.c.get(), (com.yandex.passport.data.network.m) this.d.get(), (com.yandex.passport.internal.report.reporters.h) this.e.get(), (com.yandex.passport.internal.properties.x) this.f.get(), (com.yandex.passport.internal.network.mappers.b) this.g.get(), (com.yandex.passport.internal.network.mappers.a) this.h.get());
            default:
                return new com.yandex.passport.internal.usecase.ui.e((com.yandex.passport.common.coroutine.a) this.b.get(), (com.yandex.passport.internal.usecase.k) this.c.get(), (com.yandex.passport.internal.usecase.r) this.d.get(), (e7) this.e.get(), (com.yandex.passport.internal.network.mappers.b) this.f.get(), (com.yandex.passport.internal.credentials.g) this.g.get(), (f1) this.h.get());
        }
    }
}
