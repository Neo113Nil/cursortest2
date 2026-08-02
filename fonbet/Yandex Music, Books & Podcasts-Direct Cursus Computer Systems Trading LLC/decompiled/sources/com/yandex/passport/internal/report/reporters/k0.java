package com.yandex.passport.internal.report.reporters;

import com.yandex.passport.internal.report.f9;
import com.yandex.passport.internal.report.ff;
import com.yandex.passport.internal.report.ve;
import com.yandex.passport.internal.report.y8;
import defpackage.tah;
import defpackage.u75;
import defpackage.v75;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes4.dex */
public final class k0 extends androidx.core.app.n0 {
    public final com.yandex.passport.internal.features.a b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(com.yandex.passport.internal.report.g gVar, com.yandex.passport.internal.features.a aVar) {
        super(gVar);
        gVar.getClass();
        aVar.getClass();
        this.b = aVar;
    }

    @Override // androidx.core.app.n0
    public final boolean k() {
        com.yandex.passport.internal.features.a aVar = this.b;
        return ((Boolean) aVar.z.getValue(aVar, com.yandex.passport.internal.features.a.J[23])).booleanValue();
    }

    public final void u(List list) {
        list.getClass();
        y8 y8Var = y8.d;
        List<com.yandex.passport.internal.rotation.g> list2 = list;
        int a = tah.a(v75.o(list2, 10));
        if (a < 16) {
            a = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(a);
        for (com.yandex.passport.internal.rotation.g gVar : list2) {
            linkedHashMap.put(String.valueOf(com.yandex.passport.internal.util.l.b(gVar.a)), Long.valueOf(gVar.b.b));
        }
        l(y8Var, linkedHashMap);
    }

    public final void v(long j, String str, String str2, boolean z, String str3) {
        ArrayList j2 = u75.j(new com.yandex.passport.internal.report.c(Long.valueOf(j)), new ve(str, 0), new ve(str2, 1), new ff(8, z));
        if (str3 != null) {
            j2.add(new com.yandex.passport.internal.report.a(str3, 28));
        }
        m(f9.d, j2);
    }
}
