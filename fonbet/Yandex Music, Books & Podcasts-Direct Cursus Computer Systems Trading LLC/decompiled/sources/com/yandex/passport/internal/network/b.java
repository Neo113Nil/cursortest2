package com.yandex.passport.internal.network;

import com.yandex.passport.internal.report.a2;
import com.yandex.passport.internal.report.b2;
import com.yandex.passport.internal.report.c2;
import com.yandex.passport.internal.report.d2;
import com.yandex.passport.internal.report.ff;
import com.yandex.passport.internal.report.ve;
import com.yandex.passport.internal.report.z1;
import defpackage.b6;
import defpackage.b6e;
import defpackage.d0o;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.u7e;
import defpackage.z7o;

/* loaded from: classes4.dex */
public final class b {
    public final com.yandex.passport.internal.report.reporters.j a;

    public b(com.yandex.passport.internal.report.reporters.j jVar) {
        jVar.getClass();
        this.a = jVar;
    }

    public final void a(com.yandex.passport.common.network.i iVar, d0o d0oVar) {
        iVar.getClass();
        d0oVar.getClass();
        com.yandex.passport.internal.report.reporters.j jVar = this.a;
        jVar.getClass();
        u7e u7eVar = d0oVar.a;
        try {
            r7o r7oVar = z7o.b;
            if (iVar instanceof com.yandex.passport.common.network.f) {
                com.yandex.passport.common.network.c a = ((com.yandex.passport.common.network.f) iVar).a.a();
                b2 b2Var = b2.d;
                String str = a.c;
                String str2 = "";
                if (str == null) {
                    str = "";
                }
                boolean z = false;
                ve veVar = new ve(str, 20, z);
                com.yandex.passport.internal.report.a aVar = new com.yandex.passport.internal.report.a(a.a, 28);
                String str3 = a.b;
                if (str3 != null) {
                    str2 = str3;
                }
                jVar.n(b2Var, veVar, aVar, new ve(str2, 17), new com.yandex.passport.internal.report.a(u7eVar.d, 7), new ff(u7eVar.b(), 24, z));
            }
        } catch (Throwable unused) {
            r7o r7oVar2 = z7o.b;
        }
    }

    public final void b(Object obj, com.yandex.passport.data.network.core.m mVar) {
        b6 b6Var;
        int ordinal = mVar.ordinal();
        if (ordinal == 0) {
            b6Var = z1.d;
        } else if (ordinal == 1) {
            b6Var = a2.d;
        } else if (ordinal == 2) {
            b6Var = d2.d;
        } else {
            if (ordinal != 3) {
                b6e.s();
                return;
            }
            b6Var = c2.d;
        }
        com.yandex.passport.internal.report.reporters.j jVar = this.a;
        jVar.getClass();
        b6Var.getClass();
        r7o r7oVar = z7o.b;
        if (!(obj instanceof t7o)) {
            jVar.p(b6Var);
        }
        Throwable a = z7o.a(obj);
        if (a != null) {
            jVar.n(b6Var, new ff(a));
        }
    }
}
