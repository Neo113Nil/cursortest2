package com.yandex.passport.internal.report.reporters;

import com.yandex.passport.api.v2;
import com.yandex.passport.internal.report.ff;
import com.yandex.passport.internal.report.la;
import com.yandex.passport.internal.report.ma;
import com.yandex.passport.internal.report.na;
import com.yandex.passport.internal.report.ue;
import com.yandex.passport.internal.report.ve;

/* loaded from: classes4.dex */
public final class w0 extends androidx.core.app.n0 {
    public final com.yandex.passport.internal.features.a b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(com.yandex.passport.internal.report.g gVar, com.yandex.passport.internal.features.a aVar) {
        super(gVar);
        gVar.getClass();
        aVar.getClass();
        this.b = aVar;
    }

    @Override // androidx.core.app.n0
    public final boolean k() {
        com.yandex.passport.internal.features.a aVar = this.b;
        return ((Boolean) aVar.i.getValue(aVar, com.yandex.passport.internal.features.a.J[5])).booleanValue();
    }

    public final void u(Exception exc) {
        n(la.d, new ve(v2.a), new ff(exc), new ue(exc));
    }

    public final void v(com.yandex.passport.common.core.f fVar, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        fVar.getClass();
        str5.getClass();
        n(ma.d, new ff(fVar), new ve(str, 13), new ve(str2, 14), new com.yandex.passport.internal.report.f(str3, 3), new com.yandex.passport.internal.report.a(str4, 22), new com.yandex.passport.internal.report.a(str5, 1), new ve(str6, 8), new ve(str7, 11), new ff(str8, 14), new ve(str9, 13));
    }

    public final void w(com.yandex.passport.common.core.f fVar, String str, String str2, String str3, String str4, String str5, String str6) {
        n(na.d, new ff(fVar), new com.yandex.passport.internal.report.a(str, 22), new com.yandex.passport.internal.report.a(str2, 1), new ve(str3, 8), new ve(str4, 11), new ff(str5, 14), new ve(str6, 13));
    }
}
