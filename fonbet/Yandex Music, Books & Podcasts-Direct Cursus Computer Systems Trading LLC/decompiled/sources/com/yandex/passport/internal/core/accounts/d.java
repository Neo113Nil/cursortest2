package com.yandex.passport.internal.core.accounts;

import android.content.Context;
import com.yandex.passport.data.network.ha;
import com.yandex.passport.data.network.u9;
import com.yandex.passport.data.network.x9;
import com.yandex.passport.internal.analytics.o0;
import com.yandex.passport.internal.push.d0;
import com.yandex.passport.internal.push.s0;
import com.yandex.passport.internal.push.u0;
import com.yandex.passport.internal.push.v0;
import com.yandex.passport.internal.report.reporters.f1;
import com.yandex.passport.internal.report.reporters.t0;
import com.yandex.passport.internal.report.reporters.w0;
import com.yandex.passport.internal.usecase.a2;
import com.yandex.passport.internal.usecase.q2;
import defpackage.rzm;
import defpackage.t8a;

/* loaded from: classes4.dex */
public final class d implements rzm {
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

    public /* synthetic */ d(rzm rzmVar, rzm rzmVar2, rzm rzmVar3, rzm rzmVar4, rzm rzmVar5, rzm rzmVar6, rzm rzmVar7, rzm rzmVar8, rzm rzmVar9, int i) {
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
    }

    @Override // defpackage.szm
    public final Object get() {
        switch (this.a) {
            case 0:
                return new c((k) this.b.get(), (m) this.c.get(), (com.yandex.passport.internal.database.d) this.d.get(), (com.yandex.passport.internal.core.sync.b) this.e.get(), t8a.a(this.f), (com.yandex.passport.internal.storage.m) this.g.get(), (o0) this.h.get(), (com.yandex.passport.internal.properties.x) this.i.get(), (com.yandex.passport.internal.flags.i) this.j.get());
            case 1:
                return new p((k) this.b.get(), (m) this.c.get(), (com.yandex.passport.internal.database.d) this.d.get(), (c) this.e.get(), (l) this.f.get(), (o0) this.g.get(), (com.yandex.passport.common.a) this.h.get(), (com.yandex.passport.internal.network.mappers.d) this.i.get(), (com.yandex.passport.internal.storage.m) this.j.get());
            case 2:
                return new s0((u9) this.b.get(), (x9) this.c.get(), (com.yandex.passport.internal.database.e) this.d.get(), (v0) this.e.get(), (com.yandex.passport.internal.util.k) this.f.get(), (com.yandex.passport.internal.storage.m) this.g.get(), (com.yandex.passport.internal.flags.i) this.h.get(), (w0) this.i.get(), (com.yandex.passport.internal.network.mappers.b) this.j.get());
            case 3:
                return new t0((Context) this.b.get(), (k) this.c.get(), (e) this.d.get(), (d0) this.e.get(), (com.yandex.passport.data.network.core.s) this.f.get(), (com.yandex.passport.internal.network.h) this.g.get(), (com.yandex.passport.internal.report.g) this.h.get(), (com.yandex.passport.internal.features.a) this.i.get(), (com.yandex.passport.internal.network.mappers.d) this.j.get());
            default:
                return new a2((com.yandex.passport.common.coroutine.a) this.b.get(), (ha) this.c.get(), (q2) this.d.get(), (com.yandex.passport.internal.credentials.g) this.e.get(), (f1) this.f.get(), (com.yandex.passport.internal.network.mappers.b) this.g.get(), (com.yandex.passport.internal.core.tokens.a) this.h.get(), (s0) this.i.get(), (u0) this.j.get());
        }
    }
}
