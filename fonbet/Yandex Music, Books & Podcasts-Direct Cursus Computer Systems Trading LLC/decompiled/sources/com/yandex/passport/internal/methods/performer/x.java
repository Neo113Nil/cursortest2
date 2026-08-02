package com.yandex.passport.internal.methods.performer;

import com.yandex.passport.internal.methods.u3;
import com.yandex.passport.internal.methods.v5;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.x7j;
import defpackage.z7o;

/* loaded from: classes4.dex */
public final class x implements z0 {
    public final com.yandex.passport.internal.flags.i a;

    public x(com.yandex.passport.internal.flags.i iVar) {
        iVar.getClass();
        this.a = iVar;
    }

    @Override // com.yandex.passport.internal.methods.performer.z0
    public final Object u(v5 v5Var) {
        u3 u3Var = (u3) v5Var;
        try {
            r7o r7oVar = z7o.b;
            if (w.a[((com.yandex.passport.internal.methods.s) u3Var.c.c).ordinal()] != 1) {
                throw new x7j();
            }
            Boolean bool = (Boolean) this.a.b(com.yandex.passport.internal.flags.o.Z);
            bool.getClass();
            return bool;
        } catch (Throwable th) {
            r7o r7oVar2 = z7o.b;
            return new t7o(th);
        }
    }
}
