package com.yandex.passport.data.network;

import android.app.Activity;
import android.content.Context;
import com.yandex.passport.internal.report.af;
import com.yandex.passport.internal.ui.bouncer.BouncerActivity;
import defpackage.rzm;
import defpackage.t8a;

/* loaded from: classes4.dex */
public final class s7 implements rzm {
    public final /* synthetic */ int a;
    public final rzm b;
    public final rzm c;
    public final rzm d;

    public /* synthetic */ s7(rzm rzmVar, rzm rzmVar2, rzm rzmVar3, int i) {
        this.a = i;
        this.b = rzmVar;
        this.c = rzmVar2;
        this.d = rzmVar3;
    }

    @Override // defpackage.szm
    public final Object get() {
        switch (this.a) {
            case 0:
                return new n7((com.yandex.passport.data.network.core.t) this.b.get(), (com.yandex.passport.data.network.core.l) this.c.get(), (com.yandex.passport.data.network.core.p) this.d.get(), 0);
            case 1:
                return new n7((com.yandex.passport.data.network.core.t) this.b.get(), (com.yandex.passport.data.network.core.l) this.c.get(), (com.yandex.passport.data.network.core.p) this.d.get(), 1);
            case 2:
                return new com.yandex.passport.internal.config.e((com.yandex.passport.internal.config.d) this.b.get(), (com.yandex.passport.common.a) this.c.get(), (com.yandex.passport.common.common.a) this.d.get());
            case 3:
                return new com.yandex.passport.internal.config.n((com.yandex.passport.internal.config.d) this.b.get(), (com.yandex.passport.common.common.a) this.c.get(), (com.yandex.passport.internal.report.reporters.k1) this.d.get());
            case 4:
                return new com.yandex.passport.internal.core.accounts.l((com.yandex.passport.internal.core.accounts.i) this.b.get(), (com.yandex.passport.internal.network.client.h) this.c.get(), (com.yandex.passport.internal.analytics.o0) this.d.get());
            case 5:
                return new com.yandex.passport.internal.core.tokens.b((com.yandex.passport.internal.database.d) this.b.get(), (com.yandex.passport.internal.core.accounts.e) this.c.get(), (com.yandex.passport.internal.core.tokens.a) this.d.get());
            case 6:
                return new com.yandex.passport.internal.flags.experiments.p((Context) this.b.get(), (com.yandex.passport.common.coroutine.e) this.c.get(), (com.yandex.passport.common.coroutine.a) this.d.get());
            case 7:
                return new com.yandex.passport.internal.helper.a((com.yandex.passport.internal.database.d) this.b.get(), (com.yandex.passport.common.a) this.c.get(), (com.yandex.passport.internal.network.mappers.d) this.d.get());
            case 8:
                return new com.yandex.passport.internal.helper.b((Context) this.b.get(), (com.yandex.passport.internal.network.client.h) this.c.get(), (com.yandex.passport.internal.core.accounts.e) this.d.get());
            case 9:
                return new com.yandex.passport.internal.methods.performer.l1((Context) this.b.get(), (com.yandex.passport.internal.usecase.vpn.e) this.c.get(), (com.yandex.passport.internal.config.n) this.d.get());
            case 10:
                return new com.yandex.passport.internal.network.l((com.yandex.passport.internal.storage.datastore.a) this.b.get(), (com.yandex.passport.common.common.a) this.c.get(), (com.yandex.passport.internal.report.reporters.g1) this.d.get());
            case 11:
                return new com.yandex.passport.internal.push.z((com.yandex.passport.common.coroutine.a) this.b.get(), (com.yandex.passport.internal.storage.m) this.c.get(), t8a.a(this.d));
            case 12:
                return new com.yandex.passport.internal.report.g((af) this.b.get(), (com.yandex.passport.internal.report.d) this.c.get(), (com.yandex.passport.internal.features.a) this.d.get());
            case 13:
                return new com.yandex.passport.internal.report.diary.e0((com.yandex.passport.common.coroutine.a) this.b.get(), (com.yandex.passport.internal.database.diary.c) this.c.get(), (com.yandex.passport.internal.report.diary.n0) this.d.get());
            case 14:
                return new com.yandex.passport.internal.report.reporters.m((com.yandex.passport.internal.report.g) this.b.get(), (com.yandex.passport.internal.features.a) this.c.get(), (com.yandex.passport.internal.core.accounts.e) this.d.get());
            case 15:
                return new com.yandex.passport.internal.report.reporters.s((Context) this.b.get(), (com.yandex.passport.internal.report.g) this.c.get(), (com.yandex.passport.internal.flags.i) this.d.get());
            case 16:
                return new com.yandex.passport.internal.sloth.performers.q((com.yandex.passport.internal.sloth.webauthn.e) this.b.get(), (com.yandex.passport.internal.properties.x) this.c.get(), (com.yandex.passport.internal.report.reporters.p1) this.d.get());
            case 17:
                return new com.yandex.passport.internal.sso.g((Context) this.b.get(), (com.yandex.passport.internal.config.a) this.c.get(), (com.yandex.passport.internal.analytics.o0) this.d.get());
            case 18:
                return new com.yandex.passport.internal.sso.h((com.yandex.passport.internal.sso.g) this.b.get(), (com.yandex.passport.internal.sso.announcing.e) this.c.get(), (com.yandex.passport.internal.sso.announcing.c) this.d.get());
            case 19:
                return new com.yandex.passport.internal.sso.j((Context) this.b.get(), (com.yandex.passport.internal.analytics.o0) this.c.get(), (com.yandex.passport.internal.sso.g) this.d.get());
            case 20:
                return new com.yandex.passport.internal.ui.bouncer.fallback.b((BouncerActivity) this.b.get(), (com.yandex.passport.internal.ui.bouncer.s) this.c.get(), (com.yandex.passport.internal.report.reporters.m) this.d.get());
            case 21:
                return new com.yandex.passport.internal.ui.bouncer.loading.e((Activity) this.b.get(), (com.yandex.passport.internal.properties.v) this.c.get(), (com.yandex.passport.internal.properties.x) this.d.get());
            case 22:
                return new com.yandex.passport.internal.ui.bouncer.loading.g((Activity) this.b.get(), (com.yandex.passport.internal.properties.v) this.c.get(), (com.yandex.passport.internal.properties.x) this.d.get());
            case 23:
                return new com.yandex.passport.internal.ui.bouncer.loading.l((Activity) this.b.get(), (com.yandex.passport.internal.properties.v) this.c.get(), (com.yandex.passport.internal.properties.x) this.d.get());
            case 24:
                return new com.yandex.passport.internal.ui.bouncer.model.middleware.t0((com.yandex.passport.internal.properties.x) this.b.get(), (com.yandex.passport.internal.core.accounts.e) this.c.get(), (com.yandex.passport.internal.flags.i) this.d.get());
            case 25:
                return new com.yandex.passport.internal.ui.bouncer.roundabout.items.e((Activity) this.b.get(), (com.yandex.passport.internal.ui.bouncer.s) this.c.get(), (com.yandex.passport.internal.ui.bouncer.roundabout.c) this.d.get());
            case 26:
                return new com.yandex.passport.internal.ui.bouncer.roundabout.items.x((Activity) this.b.get(), (com.yandex.passport.internal.ui.bouncer.s) this.c.get(), (com.yandex.passport.internal.report.reporters.q) this.d.get());
            case 27:
                return new com.yandex.passport.internal.ui.bouncer.roundabout.items.a0((Activity) this.b.get(), (com.yandex.passport.internal.ui.bouncer.s) this.c.get(), (com.yandex.passport.internal.ui.bouncer.roundabout.c) this.d.get());
            case com.yandex.pulse.metrics.o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return new com.yandex.passport.internal.ui.bouncer.sloth.f((Activity) this.b.get(), ((Boolean) this.c.get()).booleanValue(), (com.yandex.passport.internal.ui.bouncer.sloth.b) this.d.get());
            default:
                return new com.yandex.passport.internal.flags.experiments.p((com.yandex.passport.internal.usecase.vpn.e) this.b.get(), (com.yandex.passport.internal.config.o) this.c.get(), (com.yandex.passport.internal.report.reporters.k1) this.d.get());
        }
    }
}
