package com.yandex.passport.internal.push;

import android.app.Activity;
import android.content.Context;
import com.yandex.passport.data.network.k7;
import com.yandex.passport.data.network.s7;
import com.yandex.passport.internal.report.gf;
import defpackage.rzm;
import defpackage.t8a;

/* loaded from: classes4.dex */
public final class n implements rzm {
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
    public final rzm l;
    public final rzm m;
    public final rzm n;
    public final rzm o;
    public final rzm p;
    public final rzm q;
    public final rzm r;
    public final rzm s;

    public /* synthetic */ n(rzm rzmVar, rzm rzmVar2, rzm rzmVar3, rzm rzmVar4, rzm rzmVar5, rzm rzmVar6, rzm rzmVar7, rzm rzmVar8, rzm rzmVar9, rzm rzmVar10, rzm rzmVar11, rzm rzmVar12, rzm rzmVar13, rzm rzmVar14, rzm rzmVar15, rzm rzmVar16, rzm rzmVar17, rzm rzmVar18, int i) {
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
        this.l = rzmVar11;
        this.m = rzmVar12;
        this.n = rzmVar13;
        this.o = rzmVar14;
        this.p = rzmVar15;
        this.q = rzmVar16;
        this.r = rzmVar17;
        this.s = rzmVar18;
    }

    @Override // defpackage.szm
    public final Object get() {
        switch (this.a) {
            case 0:
                return new m((Context) this.b.get(), (com.yandex.passport.internal.core.accounts.e) this.c.get(), (com.yandex.passport.internal.report.reporters.w0) this.d.get(), (com.yandex.passport.internal.report.reporters.z0) this.e.get(), (com.yandex.passport.common.analytics.f) this.f.get(), (com.yandex.passport.common.common.a) this.g.get(), (s0) this.h.get(), (k7) this.i.get(), (d0) this.j.get(), (com.yandex.passport.common.coroutine.a) this.k.get(), (com.yandex.passport.internal.flags.i) this.l.get(), (com.yandex.passport.internal.network.mappers.b) this.m.get(), (i0) this.n.get(), (l0) this.o.get(), (f0) this.p.get(), (p) this.q.get(), (com.yandex.passport.internal.usecase.e0) this.r.get(), (com.yandex.passport.internal.report.reporters.v0) this.s.get());
            default:
                return new com.yandex.passport.internal.ui.bouncer.g((Activity) this.b.get(), (com.yandex.passport.internal.ui.bouncer.sloth.g) this.c.get(), (com.yandex.passport.internal.ui.bouncer.j) this.d.get(), (com.yandex.passport.internal.ui.bouncer.s) this.e.get(), (com.yandex.passport.internal.ui.bouncer.roundabout.a0) this.f.get(), (com.yandex.passport.internal.ui.bouncer.loading.c) this.g.get(), (com.yandex.passport.internal.ui.bouncer.loading.f) this.h.get(), (com.yandex.passport.internal.ui.bouncer.error.b) this.i.get(), (com.yandex.passport.internal.ui.bouncer.fallback.b) this.j.get(), t8a.a(this.k), (com.yandex.passport.internal.ui.bouncer.error.t) this.l.get(), (com.yandex.passport.internal.ui.bouncer.loading.i) this.m.get(), (com.yandex.passport.internal.report.reporters.m) this.n.get(), (gf) this.o.get(), (com.yandex.passport.internal.flags.i) this.p.get(), (com.yandex.passport.internal.properties.v) this.q.get(), (com.yandex.passport.internal.ui.bouncer.chooser.h) this.r.get(), (com.yandex.passport.internal.ui.bouncer.sloth.f) ((s7) this.s).get());
        }
    }
}
