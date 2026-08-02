package com.yandex.passport.internal.ui.sloth.ebs;

import defpackage.aqd;
import defpackage.bfu;
import defpackage.gfu;
import defpackage.is6;
import defpackage.noo;
import defpackage.pcg;
import defpackage.q6k;

/* loaded from: classes4.dex */
public final class r0 implements gfu {
    public final j0 a;
    public final com.yandex.passport.common.ebs.k b;

    public r0(j0 j0Var, com.yandex.passport.common.ebs.k kVar) {
        j0Var.getClass();
        kVar.getClass();
        this.a = j0Var;
        this.b = kVar;
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
        s0 s0Var = (s0) l.a("KEY_EBS_STATE");
        if (s0Var == null) {
            s0Var = new s0(null, 0, null, null, null, false);
        }
        boolean z = l.a("KEY_EBS_STATE") == null;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, "[EBS]", "BiometricVerificationViewModel::Factory, isInitial = " + z, 8);
        }
        j0 j0Var = this.a;
        j0Var.getClass();
        return new g1(pcg.u(j0Var.b, s0Var, new aqd(new s[]{z ? q.a : m.a}), new com.yandex.passport.internal.ui.sloth.authsdk.h0(2, j0Var), i0.a), this.b, l);
    }
}
