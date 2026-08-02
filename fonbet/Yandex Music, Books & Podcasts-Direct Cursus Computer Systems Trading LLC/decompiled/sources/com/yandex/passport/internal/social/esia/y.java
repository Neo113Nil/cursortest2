package com.yandex.passport.internal.social.esia;

import defpackage.aqd;
import defpackage.bfu;
import defpackage.gfu;
import defpackage.is6;
import defpackage.noo;
import defpackage.pcg;
import defpackage.q6k;

/* loaded from: classes4.dex */
public final class y implements gfu {
    public final x a;
    public final q0 b;
    public final com.yandex.passport.internal.flags.i c;

    public y(x xVar, q0 q0Var, com.yandex.passport.internal.flags.i iVar) {
        xVar.getClass();
        iVar.getClass();
        this.a = xVar;
        this.b = q0Var;
        this.c = iVar;
    }

    @Override // defpackage.gfu
    public final bfu b(Class cls) {
        super.b(cls);
        throw null;
    }

    @Override // defpackage.gfu
    public final bfu c(Class cls, is6 is6Var) {
        is6Var.getClass();
        noo l = q6k.l(is6Var);
        a0 a0Var = (a0) l.a("KEY_STATE");
        if (a0Var == null) {
            a0Var = new a0(this.b, new e0(null, null, null, ((Boolean) this.c.b(com.yandex.passport.internal.flags.o.e)).booleanValue(), false));
        }
        boolean z = l.a("KEY_STATE") == null;
        x xVar = this.a;
        xVar.getClass();
        return new n0(pcg.u(xVar.a, a0Var, new aqd(new l[]{z ? j.a : k.a}), new com.yandex.passport.internal.common.e(9, xVar), w.a), l);
    }
}
