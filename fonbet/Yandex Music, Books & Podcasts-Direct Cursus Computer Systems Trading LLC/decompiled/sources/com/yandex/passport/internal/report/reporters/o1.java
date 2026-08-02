package com.yandex.passport.internal.report.reporters;

import com.yandex.passport.internal.report.ve;
import com.yandex.passport.internal.report.wd;

/* loaded from: classes4.dex */
public final class o1 extends androidx.core.app.n0 {
    public final com.yandex.passport.internal.features.a b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(com.yandex.passport.internal.report.g gVar, com.yandex.passport.internal.features.a aVar) {
        super(gVar);
        gVar.getClass();
        aVar.getClass();
        this.b = aVar;
    }

    @Override // androidx.core.app.n0
    public final boolean k() {
        com.yandex.passport.internal.features.a aVar = this.b;
        return ((Boolean) aVar.F.getValue(aVar, com.yandex.passport.internal.features.a.J[29])).booleanValue();
    }

    public final void u(String str, n1 n1Var) {
        str.getClass();
        n(wd.d, new com.yandex.passport.internal.report.f(str, 3), new ve(n1Var.a, 10));
    }
}
