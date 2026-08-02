package com.yandex.passport.internal.report.reporters;

import android.app.Activity;
import android.content.Context;
import com.yandex.passport.internal.report.af;
import com.yandex.passport.internal.report.gf;
import com.yandex.passport.internal.ui.bouncer.model.middleware.t1;
import defpackage.rzm;

/* loaded from: classes4.dex */
public final class h1 implements rzm {
    public final /* synthetic */ int a;
    public final rzm b;
    public final rzm c;

    public /* synthetic */ h1(rzm rzmVar, rzm rzmVar2, int i) {
        this.a = i;
        this.b = rzmVar;
        this.c = rzmVar2;
    }

    @Override // defpackage.szm
    public final Object get() {
        switch (this.a) {
            case 0:
                return new g1((com.yandex.passport.internal.report.g) this.b.get(), (com.yandex.passport.internal.features.a) this.c.get());
            case 1:
                return new j1((com.yandex.passport.internal.report.g) this.b.get(), (com.yandex.passport.internal.features.a) this.c.get());
            case 2:
                return new m1((com.yandex.passport.internal.report.g) this.b.get(), (com.yandex.passport.internal.features.a) this.c.get());
            case 3:
                return new o1((com.yandex.passport.internal.report.g) this.b.get(), (com.yandex.passport.internal.features.a) this.c.get());
            case 4:
                return new r1((com.yandex.passport.internal.report.g) this.b.get(), (com.yandex.passport.internal.features.a) this.c.get());
            case 5:
                return new com.yandex.passport.internal.rotation.h((Context) this.b.get(), (k0) this.c.get());
            case 6:
                return new com.yandex.passport.internal.sloth.m((Context) this.b.get(), (com.yandex.passport.internal.properties.x) this.c.get());
            case 7:
                return new com.yandex.passport.internal.sloth.n((Activity) this.b.get(), (com.yandex.passport.common.coroutine.e) this.c.get());
            case 8:
                return new com.yandex.passport.internal.sloth.o((af) this.b.get(), (com.yandex.passport.internal.features.a) this.c.get());
            case 9:
                return new com.yandex.passport.internal.sloth.performers.j((com.yandex.passport.internal.sloth.credentialmanager.d) this.b.get(), (Context) this.c.get());
            case 10:
                return new com.yandex.passport.internal.sloth.performers.k((com.yandex.passport.internal.properties.x) this.b.get(), (com.yandex.passport.common.analytics.k) this.c.get());
            case 11:
                return new com.yandex.passport.internal.sloth.performers.n((com.yandex.passport.internal.sloth.credentialmanager.d) this.b.get(), (Context) this.c.get());
            case 12:
                return new com.yandex.passport.internal.sloth.performers.p((com.yandex.passport.internal.sloth.webauthn.e) this.b.get(), (p1) this.c.get(), 0);
            case 13:
                return new com.yandex.passport.internal.sloth.performers.p((com.yandex.passport.internal.sloth.webauthn.e) this.b.get(), (p1) this.c.get(), 1);
            case 14:
                return new com.yandex.passport.common.network.n((com.yandex.passport.internal.sloth.performers.webcard.g) this.b.get(), (com.yandex.passport.internal.usecase.ui.o) this.c.get());
            case 15:
                return new com.yandex.passport.common.network.n((com.yandex.passport.internal.sloth.performers.webcard.g) this.b.get(), (com.yandex.passport.internal.flags.i) this.c.get());
            case 16:
                return new com.yandex.passport.internal.smsretriever.b((Context) this.b.get(), (com.yandex.passport.internal.storage.m) this.c.get());
            case 17:
                return new com.yandex.passport.internal.sso.l((com.yandex.passport.internal.properties.x) this.b.get(), (com.yandex.passport.internal.flags.i) this.c.get());
            case 18:
                return new com.yandex.passport.internal.ui.bouncer.error.p((Activity) this.b.get(), (com.yandex.passport.internal.properties.v) this.c.get());
            case 19:
                return new com.yandex.passport.internal.ui.bouncer.error.t((com.yandex.passport.internal.ui.bouncer.error.q) this.b.get(), (com.yandex.passport.internal.ui.bouncer.s) this.c.get());
            case 20:
                return new com.yandex.passport.internal.ui.bouncer.loading.c((com.yandex.passport.internal.ui.bouncer.loading.e) this.b.get(), (com.yandex.passport.internal.ui.bouncer.s) this.c.get());
            case 21:
                return new com.yandex.passport.internal.ui.bouncer.loading.f((com.yandex.passport.internal.ui.bouncer.loading.g) this.b.get(), (com.yandex.passport.internal.ui.bouncer.s) this.c.get());
            case 22:
                return new com.yandex.passport.internal.ui.bouncer.model.x0((com.yandex.passport.internal.ui.bouncer.model.a) this.b.get(), (gf) this.c.get());
            case 23:
                return new com.yandex.passport.internal.ui.bouncer.model.middleware.y((com.yandex.passport.internal.core.accounts.e) this.b.get(), (com.yandex.passport.internal.usecase.ui.t) this.c.get());
            case 24:
                return new com.yandex.passport.internal.ui.bouncer.model.middleware.a0((com.yandex.passport.internal.upgrader.m) this.b.get(), (e) this.c.get());
            case 25:
                return new com.yandex.passport.internal.ui.bouncer.model.middleware.n0((l) this.b.get(), (com.yandex.passport.internal.usecase.ui.h0) this.c.get());
            case 26:
                return new com.yandex.passport.internal.ui.bouncer.model.middleware.r0((com.yandex.passport.internal.ui.bouncer.model.x0) this.b.get(), (m) this.c.get());
            case 27:
                return new com.yandex.passport.internal.ui.bouncer.model.middleware.z0((com.yandex.passport.internal.core.accounts.e) this.b.get(), (com.yandex.passport.internal.core.accounts.s) this.c.get());
            case com.yandex.pulse.metrics.o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return new t1((com.yandex.passport.internal.ui.bouncer.model.sloth.b) this.b.get(), (com.yandex.passport.internal.ui.bouncer.model.x0) this.c.get());
            default:
                return new com.yandex.passport.internal.ui.bouncer.model.sloth.b((com.yandex.passport.internal.sloth.k) this.b.get(), (com.yandex.passport.internal.ui.bouncer.model.sloth.a) this.c.get());
        }
    }
}
