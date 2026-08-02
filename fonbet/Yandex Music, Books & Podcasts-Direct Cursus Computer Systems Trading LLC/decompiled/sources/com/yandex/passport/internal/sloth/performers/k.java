package com.yandex.passport.internal.sloth.performers;

import com.yandex.passport.internal.properties.x;
import com.yandex.passport.sloth.command.s;
import com.yandex.passport.sloth.command.t;
import com.yandex.passport.sloth.command.u;
import defpackage.l2b;
import defpackage.m2b;
import defpackage.uah;
import kotlin.Pair;

/* loaded from: classes4.dex */
public final class k implements t {
    public final x a;
    public final com.yandex.passport.common.analytics.k b;

    public k(x xVar, com.yandex.passport.common.analytics.k kVar) {
        xVar.getClass();
        kVar.getClass();
        this.a = xVar;
        this.b = kVar;
    }

    @Override // com.yandex.passport.sloth.command.t
    public final Object q(com.yandex.passport.sloth.data.m mVar, Object obj, com.yandex.passport.sloth.command.f fVar) {
        com.yandex.passport.internal.credentials.f b = this.a.b(mVar.b);
        if (b == null) {
            com.yandex.passport.sloth.command.d dVar = com.yandex.passport.sloth.command.d.d;
            return dVar instanceof s ? new l2b(dVar) : new m2b(dVar);
        }
        Pair pair = new Pair("clientId", b.c);
        Pair pair2 = new Pair("clientSecret", b.d);
        String d = this.b.d();
        return new l2b(new u(uah.p(new Pair[]{pair, pair2, new Pair("deviceId", d != null ? new com.yandex.passport.common.value.a(d) : null)})));
    }
}
