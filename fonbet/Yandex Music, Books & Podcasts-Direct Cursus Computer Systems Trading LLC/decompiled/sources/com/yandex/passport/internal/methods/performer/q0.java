package com.yandex.passport.internal.methods.performer;

import com.yandex.passport.api.z1;
import com.yandex.passport.data.network.s8;
import com.yandex.passport.data.network.t8;
import com.yandex.passport.internal.methods.o4;
import com.yandex.passport.internal.methods.v5;
import defpackage.hkc;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.z7o;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class q0 implements z0 {
    public final com.yandex.passport.internal.core.accounts.e a;
    public final t8 b;
    public final com.yandex.passport.data.network.token.i c;
    public final com.yandex.passport.internal.network.mappers.b d;

    public q0(com.yandex.passport.internal.core.accounts.e eVar, t8 t8Var, com.yandex.passport.data.network.token.i iVar, com.yandex.passport.internal.network.mappers.b bVar) {
        eVar.getClass();
        t8Var.getClass();
        bVar.getClass();
        this.a = eVar;
        this.b = t8Var;
        this.c = iVar;
        this.d = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00cd  */
    @Override // com.yandex.passport.internal.methods.performer.z0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object u(v5 v5Var) {
        Object t7oVar;
        com.yandex.passport.common.core.f L;
        com.yandex.passport.common.core.b bVar;
        String str;
        com.yandex.passport.internal.l e;
        com.yandex.passport.common.account.a aVar;
        o4 o4Var = (o4) v5Var;
        try {
            r7o r7oVar = z7o.b;
            L = com.yandex.plus.pay.ui.core.b.L((z1) o4Var.c.c);
            bVar = L.a;
            str = (String) o4Var.d.c;
            e = this.a.a().e(L);
        } catch (Throwable th) {
            th = th;
        }
        try {
        } catch (Throwable th2) {
            th = th2;
            Throwable th3 = th;
            r7o r7oVar2 = z7o.b;
            t7oVar = new t7o(th3);
            Throwable a = z7o.a(t7oVar);
            if (a != null) {
            }
        }
        if (e == null || (aVar = e.d) == null) {
            throw new com.yandex.passport.api.exception.b(L);
        }
        Object A = com.yandex.passport.internal.ui.a.A(new hkc(this, bVar, e.h(), str, aVar, (Continuation) null));
        if (!(A instanceof t7o)) {
            A = new com.yandex.passport.internal.entities.u(((s8) A).a);
        }
        Throwable a2 = z7o.a(A);
        if (a2 != null) {
            try {
                if (!(a2 instanceof com.yandex.passport.data.exceptions.j)) {
                    boolean z = a2 instanceof com.yandex.passport.data.exceptions.a;
                    com.yandex.passport.data.network.token.i iVar = this.c;
                    if (!z) {
                        throw com.yandex.passport.data.network.token.i.j(iVar, a2, null, null, null, null, null, 62);
                    }
                    int i = p0.a[((com.yandex.passport.data.exceptions.a) a2).a.ordinal()];
                    if (i == 1) {
                        throw new com.yandex.passport.api.exception.k("Too many tracks for account with uid " + com.yandex.plus.pay.ui.core.b.J(L));
                    }
                    if (i != 2) {
                        throw com.yandex.passport.data.network.token.i.j(iVar, a2, null, null, null, null, null, 62);
                    }
                }
                A = null;
            } catch (Throwable th4) {
                r7o r7oVar3 = z7o.b;
                A = new t7o(th4);
            }
        }
        t7oVar = new z7o(A);
        Throwable a3 = z7o.a(t7oVar);
        return a3 != null ? ((z7o) t7oVar).a : new t7o(a3);
    }
}
