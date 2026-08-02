package com.yandex.passport.internal.methods.performer;

import com.yandex.passport.data.network.n4;
import com.yandex.passport.data.network.o4;
import com.yandex.passport.internal.methods.v5;
import com.yandex.passport.internal.methods.w3;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.z7o;

/* loaded from: classes4.dex */
public final class z implements z0 {
    public final o4 a;
    public final com.yandex.passport.data.network.token.i b;
    public final com.yandex.passport.internal.credentials.g c;
    public final com.yandex.passport.internal.network.mappers.b d;

    public z(o4 o4Var, com.yandex.passport.data.network.token.i iVar, com.yandex.passport.internal.credentials.g gVar, com.yandex.passport.internal.network.mappers.b bVar) {
        o4Var.getClass();
        gVar.getClass();
        bVar.getClass();
        this.a = o4Var;
        this.b = iVar;
        this.c = gVar;
        this.d = bVar;
    }

    @Override // com.yandex.passport.internal.methods.performer.z0
    public final Object u(v5 v5Var) {
        w3 w3Var = (w3) v5Var;
        Object A = com.yandex.passport.internal.ui.a.A(new b(this, w3Var, null, 11));
        r7o r7oVar = z7o.b;
        if (!(A instanceof t7o)) {
            try {
                n4 n4Var = (n4) A;
                A = new com.yandex.passport.internal.entities.f(n4Var.c, ((com.yandex.passport.internal.entities.h) w3Var.c.c).a, n4Var.b);
            } catch (Throwable th) {
                r7o r7oVar2 = z7o.b;
                A = new t7o(th);
            }
        }
        Throwable a = z7o.a(A);
        if (a == null) {
            return A;
        }
        try {
            throw com.yandex.passport.data.network.token.i.j(this.b, a, null, null, null, null, null, 62);
        } catch (Throwable th2) {
            r7o r7oVar3 = z7o.b;
            return new t7o(th2);
        }
    }
}
