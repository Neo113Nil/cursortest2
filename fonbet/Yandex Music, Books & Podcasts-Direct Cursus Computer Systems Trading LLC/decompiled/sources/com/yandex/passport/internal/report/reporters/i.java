package com.yandex.passport.internal.report.reporters;

import com.yandex.passport.internal.report.w1;

/* loaded from: classes4.dex */
public final class i extends androidx.core.app.n0 {
    public final com.yandex.passport.internal.features.a b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.yandex.passport.internal.report.g gVar, com.yandex.passport.internal.features.a aVar) {
        super(gVar);
        gVar.getClass();
        aVar.getClass();
        this.b = aVar;
    }

    @Override // androidx.core.app.n0
    public final boolean k() {
        com.yandex.passport.internal.features.a aVar = this.b;
        return ((Boolean) aVar.l.getValue(aVar, com.yandex.passport.internal.features.a.J[8])).booleanValue();
    }

    public final void u(com.yandex.passport.api.x xVar, Long l) {
        xVar.getClass();
        n(com.yandex.passport.internal.report.o1.d, new com.yandex.passport.internal.report.a(xVar), new com.yandex.passport.internal.report.c(String.valueOf(l), 3));
    }

    public final void v(com.yandex.passport.api.x xVar) {
        xVar.getClass();
        n(w1.d, new com.yandex.passport.internal.report.a(xVar));
    }
}
