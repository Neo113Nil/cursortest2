package com.yandex.passport.internal.report.reporters;

import com.yandex.passport.internal.report.ff;
import com.yandex.passport.internal.report.m8;
import com.yandex.passport.internal.report.n8;
import com.yandex.passport.internal.report.o8;
import com.yandex.passport.internal.report.q8;
import com.yandex.passport.internal.report.r8;
import com.yandex.passport.internal.report.ve;
import defpackage.u75;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class j0 extends androidx.core.app.n0 {
    public final com.yandex.passport.internal.features.a b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(com.yandex.passport.internal.report.g gVar, com.yandex.passport.internal.features.a aVar) {
        super(gVar);
        gVar.getClass();
        aVar.getClass();
        this.b = aVar;
    }

    @Override // androidx.core.app.n0
    public final boolean k() {
        com.yandex.passport.internal.features.a aVar = this.b;
        return ((Boolean) aVar.H.getValue(aVar, com.yandex.passport.internal.features.a.J[31])).booleanValue();
    }

    public final void u(com.yandex.passport.common.core.f fVar, String str, String str2, String str3) {
        ArrayList j = u75.j(new com.yandex.passport.internal.report.c(fVar != null ? Long.valueOf(fVar.b) : null), new ve(str, 24), new com.yandex.passport.internal.report.a(str2, 13));
        if (str3 != null) {
            j.add(new com.yandex.passport.internal.report.a(str3, 28));
        }
        m(q8.d, j);
    }

    public final void v(String str, String str2, com.yandex.passport.common.core.f fVar, Throwable th, String str3) {
        str.getClass();
        str2.getClass();
        n(m8.d, new com.yandex.passport.internal.report.c(Long.valueOf(fVar.b)), new ve(str, 24), new com.yandex.passport.internal.report.a(str2, 13), new com.yandex.passport.internal.report.f(str3, 11), new ff(th));
    }

    public final void w(String str, String str2, com.yandex.passport.common.core.f fVar, boolean z, String str3, String str4) {
        str.getClass();
        str2.getClass();
        n(n8.d, new com.yandex.passport.internal.report.c(Long.valueOf(fVar.b)), new ve(str, 24), new com.yandex.passport.internal.report.a(str2, 13), new ff(8, z), new com.yandex.passport.internal.report.f(str3, 11), new ve(str4, 20, false));
    }

    public final void x(com.yandex.passport.common.core.f fVar, String str, String str2, String str3) {
        str3.getClass();
        n(r8.d, new com.yandex.passport.internal.report.c(fVar != null ? Long.valueOf(fVar.b) : null), new com.yandex.passport.internal.report.a(str3, 22), new ve(str, 24), new com.yandex.passport.internal.report.a(str2, 13));
    }

    public final void y(com.yandex.passport.common.core.f fVar, String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        n(o8.d, new com.yandex.passport.internal.report.c(Long.valueOf(fVar.b)), new ve(str, 24), new com.yandex.passport.internal.report.a(str2, 13), new com.yandex.passport.internal.report.f(str3, 11));
    }
}
