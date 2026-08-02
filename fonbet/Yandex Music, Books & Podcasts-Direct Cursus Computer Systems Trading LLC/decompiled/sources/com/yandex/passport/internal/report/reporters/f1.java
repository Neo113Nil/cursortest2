package com.yandex.passport.internal.report.reporters;

import com.connectsdk.service.airplay.PListParser;
import com.yandex.passport.internal.report.c9;
import com.yandex.passport.internal.report.ff;
import com.yandex.passport.internal.report.i9;
import com.yandex.passport.internal.report.ue;
import com.yandex.passport.internal.report.v8;
import com.yandex.passport.internal.report.ve;
import com.yandex.passport.internal.report.w8;
import com.yandex.passport.internal.report.ze;
import defpackage.u75;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class f1 extends androidx.core.app.n0 {
    public final com.yandex.passport.internal.features.a b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(com.yandex.passport.internal.report.g gVar, com.yandex.passport.internal.features.a aVar) {
        super(gVar);
        gVar.getClass();
        aVar.getClass();
        this.b = aVar;
    }

    @Override // androidx.core.app.n0
    public final boolean k() {
        com.yandex.passport.internal.features.a aVar = this.b;
        return ((Boolean) aVar.j.getValue(aVar, com.yandex.passport.internal.features.a.J[6])).booleanValue();
    }

    public final void u(t tVar, com.yandex.passport.common.core.f fVar, String str) {
        tVar.getClass();
        ArrayList j = u75.j(new ve(tVar.a(str), 17));
        if (fVar != null) {
            j.add(new ff(fVar));
        }
        v8 v8Var = v8.d;
        ze[] zeVarArr = (ze[]) j.toArray(new ze[0]);
        n(v8Var, (ze[]) Arrays.copyOf(zeVarArr, zeVarArr.length));
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, tVar.a(null), 8);
        }
    }

    public final void v(String str, long j, String str2, String str3) {
        n(w8.d, new com.yandex.passport.internal.report.a(str3, 28), new ff(str, 14), new com.yandex.passport.internal.report.f(str2, 11), new com.yandex.passport.internal.report.f(PListParser.TAG_FALSE, 10), new ue(Long.valueOf(j), 0));
    }

    public final void w(long j, Long l, boolean z, com.yandex.passport.internal.analytics.a aVar, Long l2) {
        aVar.getClass();
        n(c9.d, new com.yandex.passport.internal.report.c(Long.valueOf(j)), new ve(l), new com.yandex.passport.internal.report.f(23, z), new com.yandex.passport.internal.report.f(aVar.a, 11), new com.yandex.passport.internal.report.f(String.valueOf(aVar.c), 10), new ue(l2, 0));
    }

    public final void x(long j, String str, String str2) {
        n(c9.d, new ff(str, 14), new com.yandex.passport.internal.report.f(str2, 11), new com.yandex.passport.internal.report.f(PListParser.TAG_FALSE, 10), new ue(Long.valueOf(j), 0));
    }

    public final void y(Long l, String str, String str2) {
        n(i9.d, new ff(str, 14), new com.yandex.passport.internal.report.f(str2, 11), new com.yandex.passport.internal.report.f(PListParser.TAG_FALSE, 10), new ue(l, 0));
    }
}
