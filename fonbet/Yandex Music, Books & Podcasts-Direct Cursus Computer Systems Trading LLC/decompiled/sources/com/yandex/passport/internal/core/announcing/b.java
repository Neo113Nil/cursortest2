package com.yandex.passport.internal.core.announcing;

import com.yandex.passport.common.core.f;
import com.yandex.passport.internal.analytics.j;
import com.yandex.passport.internal.analytics.n;
import com.yandex.passport.internal.l;
import com.yandex.passport.internal.push.b1;
import com.yandex.passport.internal.push.u0;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class b {
    public final e a;
    public final com.yandex.passport.internal.core.accounts.c b;
    public final u0 c;
    public final c d;
    public final com.yandex.passport.internal.sso.announcing.e e;
    public final com.yandex.passport.internal.helper.a f;
    public final Object g;

    public b(e eVar, com.yandex.passport.internal.core.accounts.c cVar, u0 u0Var, c cVar2, com.yandex.passport.internal.sso.announcing.e eVar2, com.yandex.passport.internal.helper.a aVar) {
        eVar.getClass();
        cVar.getClass();
        u0Var.getClass();
        cVar2.getClass();
        eVar2.getClass();
        aVar.getClass();
        this.a = eVar;
        this.b = cVar;
        this.c = u0Var;
        this.d = cVar2;
        this.e = eVar2;
        this.f = aVar;
        this.g = new Object();
    }

    public static void d(b bVar, n nVar) {
        bVar.getClass();
        nVar.getClass();
        bVar.c.b(null);
        bVar.a(true);
        bVar.a.b(nVar);
    }

    public final void a(boolean z) {
        synchronized (this.g) {
            com.yandex.passport.internal.c a = this.b.a();
            ArrayList c = a.c(a);
            c cVar = this.d;
            cVar.getClass();
            Iterator it = c.iterator();
            while (it.hasNext()) {
                cVar.a((a) it.next());
            }
            if (a.a() && z) {
                this.f.c(a);
                this.e.b(com.yandex.passport.internal.sso.announcing.d.b);
            }
        }
    }

    public final void b(f fVar, n nVar, boolean z) {
        fVar.getClass();
        nVar.getClass();
        this.c.b(fVar);
        a(z);
        this.a.b(nVar);
    }

    public final void c(l lVar, boolean z) {
        lVar.getClass();
        f fVar = lVar.b;
        u0 u0Var = this.c;
        u0Var.getClass();
        fVar.getClass();
        u0Var.e.a(u0Var.a(), new b1(u0Var.a, fVar, 1));
        this.d.a(a.b(fVar, "com.yandex.passport.client.ACCOUNT_REMOVED"));
        this.a.b(j.j);
        a(z);
    }
}
