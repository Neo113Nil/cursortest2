package com.yandex.passport.internal.report.reporters;

import com.yandex.passport.internal.report.ff;
import com.yandex.passport.internal.report.ve;
import defpackage.u75;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class f extends androidx.core.app.n0 {
    public final com.yandex.passport.internal.features.a b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.yandex.passport.internal.report.g gVar, com.yandex.passport.internal.features.a aVar) {
        super(gVar);
        gVar.getClass();
        aVar.getClass();
        this.b = aVar;
    }

    @Override // androidx.core.app.n0
    public final boolean k() {
        com.yandex.passport.internal.features.a aVar = this.b;
        return ((Boolean) aVar.v.getValue(aVar, com.yandex.passport.internal.features.a.J[18])).booleanValue();
    }

    public final void u(com.yandex.passport.internal.core.announcing.d dVar) {
        ArrayList j = u75.j(new com.yandex.passport.internal.report.a(dVar.a, 0, false));
        String str = dVar.c;
        if (str != null) {
            j.add(new ve(str, 23));
        }
        String str2 = dVar.d;
        if (str2 != null) {
            j.add(new com.yandex.passport.internal.report.a(str2, 22));
        }
        String str3 = dVar.b;
        if (str3 != null) {
            j.add(new ve(str3, 17));
        }
        j.add(new ff(dVar.g, 3));
        m(com.yandex.passport.internal.report.m0.d, j);
    }
}
