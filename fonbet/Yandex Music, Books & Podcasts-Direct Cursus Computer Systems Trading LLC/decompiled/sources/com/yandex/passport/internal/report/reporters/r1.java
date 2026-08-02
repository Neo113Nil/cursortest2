package com.yandex.passport.internal.report.reporters;

import com.yandex.passport.internal.report.ae;
import com.yandex.passport.internal.report.ff;

/* loaded from: classes4.dex */
public final class r1 extends androidx.core.app.n0 {
    public final com.yandex.passport.internal.features.a b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(com.yandex.passport.internal.report.g gVar, com.yandex.passport.internal.features.a aVar) {
        super(gVar);
        gVar.getClass();
        aVar.getClass();
        this.b = aVar;
    }

    @Override // androidx.core.app.n0
    public final boolean k() {
        com.yandex.passport.internal.features.a aVar = this.b;
        return ((Boolean) aVar.B.getValue(aVar, com.yandex.passport.internal.features.a.J[25])).booleanValue();
    }

    public final void u(q1 q1Var) {
        n(ae.d, new ff(q1Var));
    }
}
