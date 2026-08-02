package com.yandex.passport.internal.core.accounts;

import android.content.Context;
import com.yandex.passport.data.network.pa;
import com.yandex.passport.data.network.y6;
import com.yandex.passport.internal.analytics.o0;
import com.yandex.passport.internal.analytics.r0;
import com.yandex.passport.internal.report.reporters.j1;
import com.yandex.passport.internal.report.reporters.y0;
import com.yandex.passport.internal.ui.bouncer.BouncerActivity;
import com.yandex.passport.internal.ui.bouncer.roundabout.a0;
import com.yandex.passport.internal.usecase.e0;
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

    public /* synthetic */ b(rzm rzmVar, rzm rzmVar2, rzm rzmVar3, rzm rzmVar4, rzm rzmVar5, rzm rzmVar6, rzm rzmVar7, rzm rzmVar8, int i) {
        this.a = i;
        this.b = rzmVar;
        this.c = rzmVar2;
        this.d = rzmVar3;
        this.e = rzmVar4;
        this.f = rzmVar5;
        this.g = rzmVar6;
        this.h = rzmVar7;
        this.i = rzmVar8;
    }

    @Override // defpackage.szm
    public final Object get() {
        switch (this.a) {
            case 0:
                return new a((Context) this.b.get(), (k) this.c.get(), (t) this.d.get(), (l) this.e.get(), (com.yandex.passport.internal.core.linkage.c) this.f.get(), (e) this.g.get(), (r0) this.h.get(), (com.yandex.passport.internal.network.mappers.d) this.i.get());
            case 1:
                return new com.yandex.passport.internal.helper.f((com.yandex.passport.internal.network.client.h) this.b.get(), (e) this.c.get(), (pa) this.d.get(), (y6) this.e.get(), (y0) this.f.get(), (com.yandex.passport.internal.network.mappers.b) this.g.get(), (com.yandex.passport.internal.analytics.w) this.h.get(), (com.yandex.passport.internal.credentials.g) this.i.get());
            case 2:
                return new com.yandex.passport.internal.helper.j((e) this.b.get(), (com.yandex.passport.internal.network.client.h) this.c.get(), (a) this.d.get(), (com.yandex.passport.internal.storage.m) this.e.get(), (com.yandex.passport.common.a) this.f.get(), (com.yandex.passport.internal.f) this.g.get(), (j1) this.h.get(), (e0) this.i.get());
            case 3:
                return new com.yandex.passport.internal.sso.announcing.c((f) this.b.get(), (y) this.c.get(), (p) this.d.get(), (com.yandex.passport.internal.helper.a) this.e.get(), (com.yandex.passport.internal.sso.j) this.f.get(), (com.yandex.passport.internal.sso.l) this.g.get(), (o0) this.h.get(), (com.yandex.passport.internal.network.mappers.d) this.i.get());
            default:
                return new a0((BouncerActivity) this.b.get(), (com.yandex.passport.internal.ui.bouncer.roundabout.t) this.c.get(), (com.yandex.passport.internal.ui.bouncer.roundabout.s) this.d.get(), (com.yandex.passport.internal.ui.bouncer.roundabout.o) this.e.get(), (com.yandex.passport.internal.ui.bouncer.roundabout.i) this.f.get(), (com.yandex.passport.internal.ui.bouncer.s) this.g.get(), (com.yandex.passport.internal.report.reporters.m) this.h.get(), (com.yandex.passport.internal.report.reporters.k) this.i.get());
        }
    }
}
