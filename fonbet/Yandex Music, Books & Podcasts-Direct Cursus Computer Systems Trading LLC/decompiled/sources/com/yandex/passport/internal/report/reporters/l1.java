package com.yandex.passport.internal.report.reporters;

import android.app.Activity;
import android.content.Context;
import com.yandex.passport.internal.ui.bouncer.BouncerActivity;
import com.yandex.passport.internal.ui.bouncer.model.h2;
import com.yandex.passport.internal.usecase.f2;
import defpackage.hn5;
import defpackage.l1j;
import defpackage.rzm;
import defpackage.wb7;

/* loaded from: classes4.dex */
public final class l1 implements rzm {
    public final /* synthetic */ int a;
    public final rzm b;

    public /* synthetic */ l1(rzm rzmVar, int i) {
        this.a = i;
        this.b = rzmVar;
    }

    @Override // defpackage.szm
    public final Object get() {
        switch (this.a) {
            case 0:
                com.yandex.passport.internal.report.g gVar = (com.yandex.passport.internal.report.g) this.b.get();
                gVar.getClass();
                return new k1(gVar);
            case 1:
                com.yandex.passport.internal.report.g gVar2 = (com.yandex.passport.internal.report.g) this.b.get();
                gVar2.getClass();
                return new p1(gVar2);
            case 2:
                return new com.yandex.passport.internal.sloth.e((Context) this.b.get());
            case 3:
                return new com.yandex.passport.internal.sloth.i((com.yandex.passport.internal.usecase.authorize.c) this.b.get());
            case 4:
                return new com.yandex.passport.internal.sloth.j((com.yandex.passport.internal.network.d) this.b.get());
            case 5:
                return new com.yandex.passport.internal.sloth.performers.a((Context) this.b.get());
            case 6:
                return new com.yandex.passport.internal.sloth.performers.b((com.yandex.passport.internal.sloth.m) this.b.get());
            case 7:
                if (this.b.get() == null) {
                    return new com.yandex.passport.internal.sloth.performers.d();
                }
                l1j.f();
                return null;
            case 8:
                return new com.yandex.passport.internal.sloth.performers.e((Context) this.b.get());
            case 9:
                return new com.yandex.passport.internal.sloth.performers.g((com.yandex.passport.internal.properties.x) this.b.get());
            case 10:
                return new com.yandex.passport.internal.sloth.performers.usermenu.b((com.yandex.passport.internal.sloth.performers.usermenu.h) this.b.get(), 0);
            case 11:
                return new com.yandex.passport.internal.sloth.performers.usermenu.b((com.yandex.passport.internal.sloth.performers.usermenu.h) this.b.get(), 1);
            case 12:
                return new com.yandex.passport.internal.storage.c((wb7) this.b.get());
            case 13:
                return new com.yandex.passport.internal.storage.m((Context) this.b.get());
            case 14:
                return new com.yandex.passport.internal.storage.datastore.e((wb7) this.b.get());
            case 15:
                return new com.yandex.passport.internal.ui.bouncer.j((BouncerActivity) this.b.get());
            case 16:
                return new com.yandex.passport.internal.ui.bouncer.s((hn5) this.b.get());
            case 17:
                return new com.yandex.passport.internal.ui.bouncer.error.k((Activity) this.b.get());
            case 18:
                return new h2((l) this.b.get());
            case 19:
                return new com.yandex.passport.internal.ui.bouncer.model.middleware.l((com.yandex.passport.internal.ui.challenge.s) this.b.get());
            case 20:
                return new com.yandex.passport.internal.ui.bouncer.model.middleware.s((com.yandex.passport.internal.usecase.ui.b0) this.b.get());
            case 21:
                return new com.yandex.passport.internal.ui.bouncer.model.middleware.u((com.yandex.passport.internal.usecase.ui.t) this.b.get());
            case 22:
                return new com.yandex.passport.internal.ui.bouncer.model.middleware.x0((com.yandex.passport.internal.account.a) this.b.get());
            case 23:
                return new com.yandex.passport.internal.ui.bouncer.model.middleware.c1((k) this.b.get());
            case 24:
                return new com.yandex.passport.internal.ui.bouncer.model.middleware.g1((f2) this.b.get());
            case 25:
                return new com.yandex.passport.internal.ui.bouncer.model.sloth.a((com.yandex.passport.internal.sloth.performers.h) this.b.get());
            case 26:
                return new com.yandex.passport.internal.ui.bouncer.roundabout.f((Activity) this.b.get());
            case 27:
                return new com.yandex.passport.internal.ui.bouncer.roundabout.o((Activity) this.b.get());
            case com.yandex.pulse.metrics.o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return new com.yandex.passport.internal.ui.bouncer.roundabout.s((Activity) this.b.get());
            default:
                return new com.yandex.passport.internal.ui.bouncer.roundabout.d0((Activity) this.b.get());
        }
    }
}
