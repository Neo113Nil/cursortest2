package com.yandex.passport.internal.helper;

import android.net.Uri;
import com.yandex.passport.common.analytics.k;
import com.yandex.passport.common.network.n;
import com.yandex.passport.common.network.p;
import com.yandex.passport.internal.common.l;
import com.yandex.passport.internal.entities.r;
import com.yandex.passport.internal.report.reporters.j1;
import com.yandex.passport.internal.storage.m;
import com.yandex.passport.internal.usecase.e0;
import defpackage.ocu;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.z7o;
import defpackage.zzq;
import java.util.Locale;
import java.util.Map;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class j {
    public static final long i = com.yandex.passport.common.time.a.c(24, 0, 0, 14);
    public final com.yandex.passport.internal.core.accounts.e a;
    public final com.yandex.passport.internal.network.client.h b;
    public final com.yandex.passport.internal.core.accounts.a c;
    public final m d;
    public final com.yandex.passport.common.a e;
    public final com.yandex.passport.internal.f f;
    public final j1 g;
    public final e0 h;

    public j(com.yandex.passport.internal.core.accounts.e eVar, com.yandex.passport.internal.network.client.h hVar, com.yandex.passport.internal.core.accounts.a aVar, m mVar, com.yandex.passport.common.a aVar2, com.yandex.passport.internal.f fVar, j1 j1Var, e0 e0Var) {
        eVar.getClass();
        hVar.getClass();
        aVar.getClass();
        mVar.getClass();
        aVar2.getClass();
        fVar.getClass();
        j1Var.getClass();
        e0Var.getClass();
        this.a = eVar;
        this.b = hVar;
        this.c = aVar;
        this.d = mVar;
        this.e = aVar2;
        this.f = fVar;
        this.g = j1Var;
        this.h = e0Var;
    }

    public final Uri a(com.yandex.passport.common.core.f fVar) {
        com.yandex.passport.internal.network.client.j b = this.b.b(fVar.a);
        com.yandex.passport.internal.f fVar2 = this.f;
        fVar2.getClass();
        Object C = com.yandex.passport.internal.ui.a.C(new ocu(this, b, fVar, l.a(new Locale(fVar2.a())), (Continuation) null, 18));
        r7o r7oVar = z7o.b;
        if (!(C instanceof t7o)) {
            C = Uri.parse(((com.yandex.passport.common.url.b) C).a);
        }
        qgg.h0(C);
        return (Uri) C;
    }

    public final void b(com.yandex.passport.common.core.f fVar, r rVar) {
        rVar.getClass();
        com.yandex.passport.internal.l e = this.a.a().e(fVar);
        if (e == null) {
            throw new com.yandex.passport.api.exception.b(fVar);
        }
        com.yandex.passport.common.account.a aVar = e.d;
        com.yandex.passport.internal.network.client.g a = this.b.a(e.b.a);
        n nVar = a.b;
        aVar.getClass();
        String d = aVar.d();
        k kVar = a.f;
        com.yandex.passport.internal.common.d dVar = (com.yandex.passport.internal.common.d) a.h;
        Map c = kVar.c(dVar.a(), dVar.b());
        d.getClass();
        c.getClass();
        p k = com.appsflyer.internal.k.k((String) nVar.Q().b, "/1/bundle/track/init/");
        k.F("Ya-Consumer-Authorization", "OAuth ".concat(d));
        k.T(c);
        Object c2 = a.c(k.z(), com.yandex.passport.internal.network.client.a.a);
        c2.getClass();
        String d2 = aVar.d();
        d2.getClass();
        a.c(nVar.N(new zzq(26, d2, rVar, (String) c2)), com.yandex.passport.internal.network.client.f.a);
        this.c.a(e.g, true);
    }
}
