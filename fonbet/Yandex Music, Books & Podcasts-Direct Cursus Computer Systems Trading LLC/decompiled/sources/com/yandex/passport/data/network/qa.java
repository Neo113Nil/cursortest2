package com.yandex.passport.data.network;

import android.content.Context;
import defpackage.dmm;
import defpackage.q0v;
import defpackage.rzm;
import defpackage.vw1;
import defpackage.xyn;

/* loaded from: classes4.dex */
public final class qa implements rzm {
    public final /* synthetic */ int a;
    public final rzm b;
    public final rzm c;

    public /* synthetic */ qa(rzm rzmVar, rzm rzmVar2, int i) {
        this.a = i;
        this.b = rzmVar;
        this.c = rzmVar2;
    }

    @Override // defpackage.szm
    public final Object get() {
        switch (this.a) {
            case 0:
                return new ka((com.yandex.passport.data.network.core.t) this.b.get(), (com.yandex.passport.data.network.core.l) this.c.get());
            case 1:
                return new g((com.yandex.passport.data.network.core.t) this.b.get(), (com.yandex.passport.data.network.core.l) this.c.get(), 26);
            case 2:
                return new g((com.yandex.passport.data.network.core.t) this.b.get(), (com.yandex.passport.data.network.core.l) this.c.get(), 27);
            case 3:
                return new g((com.yandex.passport.data.network.core.t) this.b.get(), (com.yandex.passport.data.network.core.l) this.c.get(), 28);
            case 4:
                return new g((com.yandex.passport.data.network.core.t) this.b.get(), (com.yandex.passport.data.network.core.l) this.c.get(), 29);
            case 5:
                return new tb((com.yandex.passport.data.network.core.t) this.b.get(), (com.yandex.passport.data.network.core.l) this.c.get());
            case 6:
                return new ac((com.yandex.passport.data.network.core.t) this.b.get(), (com.yandex.passport.data.network.core.l) this.c.get(), 0);
            case 7:
                return new ac((com.yandex.passport.data.network.core.t) this.b.get(), (com.yandex.passport.data.network.core.l) this.c.get(), 1);
            case 8:
                return new com.yandex.passport.data.network.core.x((com.yandex.passport.common.coroutine.a) this.b.get(), (com.yandex.passport.data.network.core.s) this.c.get());
            case 9:
                return new ac((com.yandex.passport.data.network.core.t) this.b.get(), (com.yandex.passport.data.network.core.l) this.c.get(), 2);
            case 10:
                return new ac((com.yandex.passport.data.network.core.t) this.b.get(), (com.yandex.passport.data.network.core.l) this.c.get(), 3);
            case 11:
                return new ac((com.yandex.passport.data.network.core.t) this.b.get(), (com.yandex.passport.data.network.core.l) this.c.get(), 4);
            case 12:
                return new ac((com.yandex.passport.data.network.core.t) this.b.get(), (com.yandex.passport.data.network.core.l) this.c.get(), 5);
            case 13:
                return new ac((com.yandex.passport.data.network.core.t) this.b.get(), (com.yandex.passport.data.network.core.l) this.c.get(), 6);
            case 14:
                return new ac((com.yandex.passport.data.network.core.t) this.b.get(), (com.yandex.passport.data.network.core.l) this.c.get(), 7);
            case 15:
                return new com.yandex.passport.internal.f((Context) this.b.get(), (com.yandex.passport.internal.helper.h) this.c.get());
            case 16:
                return new com.yandex.passport.internal.account.a((com.yandex.passport.internal.core.accounts.e) this.b.get(), (com.yandex.passport.internal.account.b) this.c.get());
            case 17:
                return new com.yandex.passport.internal.authsdk.a((com.yandex.passport.internal.core.accounts.e) this.b.get(), (com.yandex.passport.internal.filter.l) this.c.get());
            case 18:
                return new com.yandex.passport.internal.common.d((Context) this.b.get(), (com.yandex.passport.internal.properties.x) this.c.get());
            case 19:
                return new com.yandex.passport.internal.config.g((com.yandex.passport.internal.config.d) this.b.get(), (com.yandex.passport.common.common.a) this.c.get());
            case 20:
                return new com.yandex.passport.internal.core.accounts.m((com.yandex.passport.internal.database.d) this.b.get(), (com.yandex.passport.internal.network.mappers.d) this.c.get());
            case 21:
                return new com.yandex.passport.internal.core.accounts.q((Context) this.b.get(), (com.yandex.passport.internal.storage.m) this.c.get());
            case 22:
                return new com.yandex.passport.internal.core.linkage.a((com.yandex.passport.internal.core.accounts.e) this.b.get(), (com.yandex.passport.common.a) this.c.get());
            case 23:
                return new com.yandex.passport.internal.core.sync.a((Context) this.b.get(), (com.yandex.passport.internal.core.accounts.a) this.c.get());
            case 24:
                return new com.yandex.passport.internal.core.tokens.a((com.yandex.passport.internal.database.d) this.b.get(), (com.yandex.passport.internal.analytics.o0) this.c.get());
            case 25:
                Context context = (Context) this.b.get();
                com.yandex.passport.internal.report.reporters.d1 d1Var = (com.yandex.passport.internal.report.reporters.d1) this.c.get();
                context.getClass();
                d1Var.getClass();
                return dmm.b(new xyn(new q0v(22, d1Var)), new vw1(context, 28), 6);
            case 26:
                return new com.yandex.passport.internal.filter.r((Context) this.b.get(), (com.yandex.passport.internal.report.reporters.d1) this.c.get());
            case 27:
                return new com.yandex.passport.common.network.n((com.yandex.passport.internal.flags.experiments.k) this.b.get(), (com.yandex.passport.internal.flags.i) this.c.get());
            case com.yandex.pulse.metrics.o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return new com.yandex.passport.internal.network.c((com.yandex.passport.internal.network.d) this.b.get(), (com.yandex.passport.internal.network.mappers.b) this.c.get());
            default:
                return new com.yandex.passport.internal.provider.communication.p((com.yandex.passport.internal.provider.communication.v) this.b.get(), (com.yandex.passport.internal.provider.communication.q) this.c.get());
        }
    }
}
