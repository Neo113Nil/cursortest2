package com.yandex.passport.internal.helper;

import com.yandex.passport.api.w0;
import com.yandex.passport.common.network.p;
import com.yandex.passport.internal.l;
import com.yandex.passport.internal.m;
import com.yandex.passport.internal.properties.x;
import com.yandex.passport.internal.report.reporters.f1;
import com.yandex.passport.internal.ui.domik.u;
import com.yandex.passport.internal.ui.domik.w;
import com.yandex.passport.internal.usecase.ui.k0;
import com.yandex.passport.internal.usecase.ui.m0;
import defpackage.cb;
import defpackage.x97;
import java.util.EnumSet;

/* loaded from: classes4.dex */
public final class g {
    public final com.yandex.passport.internal.network.client.h a;
    public final x b;
    public final com.yandex.passport.internal.account.d c;
    public final m0 d;

    public g(com.yandex.passport.internal.network.client.h hVar, x xVar, com.yandex.passport.internal.account.d dVar, m0 m0Var) {
        hVar.getClass();
        xVar.getClass();
        dVar.getClass();
        m0Var.getClass();
        this.a = hVar;
        this.b = xVar;
        this.c = dVar;
        this.d = m0Var;
    }

    public final u a(com.yandex.passport.common.core.b bVar, String str) {
        com.yandex.passport.internal.credentials.f b = this.b.b(bVar);
        if (b == null) {
            throw new com.yandex.passport.api.exception.h(com.yandex.plus.core.network.api.utils.a.P(bVar));
        }
        com.yandex.passport.internal.network.client.g a = this.a.a(bVar);
        String str2 = b.c;
        str2.getClass();
        p pVar = new p((String) a.b.Q().b);
        pVar.J("/1/bundle/mobile/auth/sms_code/");
        pVar.S("track_id", str);
        Object c = a.c(pVar.z(), new cb(a, str, str2));
        c.getClass();
        return b(bVar, (com.yandex.passport.internal.network.response.c) c, null, com.yandex.passport.internal.analytics.a.u);
    }

    public final u b(com.yandex.passport.common.core.b bVar, com.yandex.passport.internal.network.response.c cVar, String str, com.yandex.passport.internal.analytics.a aVar) {
        com.yandex.passport.internal.account.d dVar = this.c;
        dVar.getClass();
        cVar.getClass();
        aVar.getClass();
        com.yandex.passport.internal.core.accounts.f fVar = dVar.b;
        com.yandex.passport.common.account.a aVar2 = cVar.a;
        com.yandex.passport.common.core.g gVar = cVar.b;
        l b = fVar.b(m.e(bVar, aVar2, gVar, str), aVar.d(), true);
        f1 f1Var = dVar.e;
        com.yandex.passport.common.core.f fVar2 = b.b;
        long j = fVar2.b;
        com.yandex.passport.common.core.f fVar3 = b.c;
        f1Var.w(j, fVar3 != null ? Long.valueOf(fVar3.b) : null, b.e.Z, aVar, gVar.K);
        com.yandex.passport.internal.entities.e eVar = cVar.c;
        if (eVar != null) {
            dVar.d.z(fVar2, eVar);
        }
        com.yandex.passport.internal.entities.e eVar2 = cVar.c;
        w0 w0Var = aVar.b;
        w0Var.getClass();
        EnumSet noneOf = EnumSet.noneOf(w.class);
        noneOf.getClass();
        return new u(b, eVar2, w0Var, null, noneOf);
    }

    public final u c(com.yandex.passport.common.core.b bVar, String str, String str2) {
        com.yandex.passport.internal.credentials.f b = this.b.b(bVar);
        if (b == null) {
            throw new com.yandex.passport.api.exception.h(com.yandex.plus.core.network.api.utils.a.P(bVar));
        }
        k0 k0Var = new k0(bVar, str, b.c);
        m0 m0Var = this.d;
        m0Var.getClass();
        return b(bVar, (com.yandex.passport.internal.network.response.c) x97.D(kotlin.coroutines.g.a, new com.yandex.passport.internal.methods.performer.b(m0Var, k0Var, null, 28)), str2, com.yandex.passport.internal.analytics.a.e);
    }
}
