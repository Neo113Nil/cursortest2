package com.yandex.passport.internal.sso;

import android.os.Bundle;
import com.yandex.passport.internal.report.reporters.f1;
import com.yandex.passport.internal.report.reporters.t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes4.dex */
public final class k {
    public final g a;
    public final com.yandex.passport.internal.sso.announcing.c b;
    public final f1 c;
    public final com.yandex.passport.internal.network.mappers.d d;

    public k(g gVar, com.yandex.passport.internal.sso.announcing.c cVar, f1 f1Var, com.yandex.passport.internal.network.mappers.d dVar) {
        gVar.getClass();
        cVar.getClass();
        f1Var.getClass();
        dVar.getClass();
        this.a = gVar;
        this.b = cVar;
        this.c = f1Var;
        this.d = dVar;
    }

    public final Bundle a(String str) {
        com.yandex.passport.internal.l b;
        com.yandex.passport.common.account.a aVar;
        ArrayList a = this.b.a();
        Iterator it = a.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            com.yandex.passport.internal.b bVar = cVar.b;
            if (bVar == null || (b = this.d.b(bVar)) == null || (aVar = b.d) == null || aVar.f()) {
                this.c.u(t.c, cVar.a.a, str);
            }
        }
        Set set = c.c;
        return com.yandex.plus.core.network.api.utils.a.w(a);
    }

    public final Bundle b(String str, ArrayList arrayList) {
        com.yandex.passport.internal.l b;
        com.yandex.passport.common.account.a aVar;
        if (this.a.b(str)) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                c cVar = (c) it.next();
                com.yandex.passport.internal.b bVar = cVar.b;
                if (bVar == null || (b = this.d.b(bVar)) == null || (aVar = b.d) == null || aVar.f()) {
                    this.c.u(t.d, cVar.a.a, str);
                }
            }
            this.b.c(arrayList, str, com.yandex.passport.internal.sso.announcing.b.c);
        }
        return new Bundle();
    }
}
