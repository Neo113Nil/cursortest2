package com.yandex.passport.internal.report.reporters;

import defpackage.b6;

/* loaded from: classes4.dex */
public final class g extends androidx.core.app.n0 {
    public final com.yandex.passport.internal.features.a b;
    public String c;
    public String d;
    public String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.yandex.passport.internal.report.g gVar, com.yandex.passport.internal.features.a aVar) {
        super(gVar);
        gVar.getClass();
        aVar.getClass();
        this.b = aVar;
        this.e = "";
    }

    @Override // androidx.core.app.n0
    public final boolean k() {
        com.yandex.passport.internal.features.a aVar = this.b;
        return ((Boolean) aVar.A.getValue(aVar, com.yandex.passport.internal.features.a.J[24])).booleanValue();
    }

    public final void u(b6 b6Var, String str) {
        n(b6Var, new com.yandex.passport.internal.report.f(this.e, 14), new com.yandex.passport.internal.report.c("caller_app_id", String.valueOf(this.c)), new com.yandex.passport.internal.report.c("caller_fingerprint", String.valueOf(this.d)), new com.yandex.passport.internal.report.c("state", str));
    }
}
