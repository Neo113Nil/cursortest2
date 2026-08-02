package com.yandex.passport.internal.provider;

import com.yandex.passport.data.network.y0;
import com.yandex.passport.internal.analytics.o0;
import com.yandex.passport.internal.common.f;
import com.yandex.passport.internal.config.o;
import com.yandex.passport.internal.core.accounts.e;
import com.yandex.passport.internal.core.accounts.i;
import com.yandex.passport.internal.flags.experiments.k;
import com.yandex.passport.internal.helper.j;
import com.yandex.passport.internal.network.client.h;
import com.yandex.passport.internal.properties.x;
import com.yandex.passport.internal.properties.y;
import com.yandex.passport.internal.provider.communication.p;
import com.yandex.passport.internal.storage.m;
import com.yandex.passport.internal.usecase.s0;
import com.yandex.passport.internal.util.d;
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
    public final rzm l;
    public final rzm m;
    public final rzm n;

    public /* synthetic */ b(rzm rzmVar, rzm rzmVar2, rzm rzmVar3, rzm rzmVar4, rzm rzmVar5, rzm rzmVar6, rzm rzmVar7, rzm rzmVar8, rzm rzmVar9, rzm rzmVar10, rzm rzmVar11, rzm rzmVar12, rzm rzmVar13, int i) {
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
    }

    @Override // defpackage.szm
    public final Object get() {
        switch (this.a) {
            case 0:
                m mVar = (m) this.b.get();
                e eVar = (e) this.c.get();
                i iVar = (i) this.d.get();
                h hVar = (h) this.e.get();
                o0 o0Var = (o0) this.f.get();
                com.yandex.passport.internal.core.tokens.a aVar = (com.yandex.passport.internal.core.tokens.a) this.g.get();
                return new a(mVar, eVar, iVar, hVar, o0Var, aVar, (com.yandex.passport.internal.core.linkage.a) this.i.get(), (com.yandex.passport.internal.core.linkage.b) this.j.get(), (d) this.k.get(), (j) this.l.get(), (com.yandex.passport.internal.helper.b) this.m.get(), (k) this.n.get());
            default:
                return new com.yandex.passport.internal.usecase.vpn.i((com.yandex.passport.common.coroutine.a) this.b.get(), (com.yandex.passport.internal.autologin.k) this.c.get(), (com.yandex.passport.internal.account.a) this.d.get(), (e) this.e.get(), (x) this.f.get(), (y) this.g.get(), (s0) this.h.get(), (y0) this.i.get(), (com.yandex.passport.internal.network.mappers.b) this.j.get(), (f) this.k.get(), (com.yandex.passport.common.common.a) this.l.get(), (o) this.m.get(), (p) this.n.get());
        }
    }
}
