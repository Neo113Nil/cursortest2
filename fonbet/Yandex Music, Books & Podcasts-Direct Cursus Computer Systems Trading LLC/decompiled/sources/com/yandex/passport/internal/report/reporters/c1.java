package com.yandex.passport.internal.report.reporters;

import com.yandex.passport.internal.report.oc;
import com.yandex.passport.internal.report.ve;

/* loaded from: classes4.dex */
public final class c1 extends androidx.core.app.n0 {
    public final com.yandex.passport.internal.features.a b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(com.yandex.passport.internal.report.g gVar, com.yandex.passport.internal.features.a aVar) {
        super(gVar);
        gVar.getClass();
        aVar.getClass();
        this.b = aVar;
    }

    @Override // androidx.core.app.n0
    public final boolean k() {
        com.yandex.passport.internal.features.a aVar = this.b;
        return ((Boolean) aVar.u.getValue(aVar, com.yandex.passport.internal.features.a.J[17])).booleanValue();
    }

    public final void u(Integer num, String str) {
        oc ocVar = oc.d;
        if (str == null) {
            str = "";
        }
        n(ocVar, new com.yandex.passport.internal.report.c(str, 3), new ve(num != null ? num.intValue() : 0, 28));
    }
}
