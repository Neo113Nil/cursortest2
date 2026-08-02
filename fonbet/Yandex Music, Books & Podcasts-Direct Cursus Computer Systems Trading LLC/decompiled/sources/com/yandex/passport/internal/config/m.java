package com.yandex.passport.internal.config;

import com.yandex.passport.data.network.i6;
import com.yandex.passport.internal.properties.x;
import com.yandex.passport.internal.provider.communication.q;
import com.yandex.passport.internal.push.d0;
import com.yandex.passport.internal.push.s0;
import com.yandex.passport.internal.report.reporters.w0;
import defpackage.rzm;

/* loaded from: classes4.dex */
public final class m implements rzm {
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

    public /* synthetic */ m(rzm rzmVar, rzm rzmVar2, rzm rzmVar3, rzm rzmVar4, rzm rzmVar5, rzm rzmVar6, rzm rzmVar7, rzm rzmVar8, rzm rzmVar9, rzm rzmVar10, rzm rzmVar11, rzm rzmVar12, int i) {
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
    }

    @Override // defpackage.szm
    public final Object get() {
        switch (this.a) {
            case 0:
                return new l((com.yandex.passport.common.coroutine.a) this.b.get(), (g) this.c.get(), (i6) this.d.get(), (com.yandex.passport.internal.report.reporters.o) this.e.get(), (e) this.f.get(), (com.yandex.passport.internal.network.mappers.b) this.g.get(), new com.yandex.passport.data.network.token.i(16), (com.yandex.passport.internal.filter.l) this.h.get(), (com.yandex.passport.internal.config.template.g) this.i.get(), (p) this.j.get(), (h) this.k.get(), (n) this.l.get(), (b) this.m.get());
            default:
                return new com.yandex.passport.internal.push.g((x) this.b.get(), (s0) this.c.get(), (com.yandex.passport.internal.core.accounts.e) this.d.get(), (com.yandex.passport.internal.database.e) this.e.get(), (com.yandex.passport.internal.util.k) this.f.get(), (d0) this.g.get(), (w0) this.h.get(), (com.yandex.passport.internal.database.d) this.i.get(), (com.yandex.passport.internal.flags.i) this.j.get(), (com.yandex.passport.internal.provider.communication.p) this.k.get(), (com.yandex.passport.internal.push.h) this.l.get(), (q) this.m.get());
        }
    }
}
