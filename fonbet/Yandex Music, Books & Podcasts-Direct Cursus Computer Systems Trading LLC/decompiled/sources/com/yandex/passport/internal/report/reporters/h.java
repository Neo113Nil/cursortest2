package com.yandex.passport.internal.report.reporters;

import com.yandex.passport.internal.report.ff;
import com.yandex.passport.internal.report.ue;
import com.yandex.passport.internal.report.ze;
import defpackage.u75;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

/* loaded from: classes4.dex */
public final class h extends androidx.core.app.n0 {
    public final com.yandex.passport.internal.features.a b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.yandex.passport.internal.report.g gVar, com.yandex.passport.internal.features.a aVar) {
        super(gVar);
        gVar.getClass();
        aVar.getClass();
        this.b = aVar;
    }

    public static void u(ArrayList arrayList, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(new com.yandex.passport.internal.report.c((String) entry.getKey(), String.valueOf((String) entry.getValue())));
        }
    }

    @Override // androidx.core.app.n0
    public final boolean k() {
        com.yandex.passport.internal.features.a aVar = this.b;
        return ((Boolean) aVar.r.getValue(aVar, com.yandex.passport.internal.features.a.J[14])).booleanValue();
    }

    public final void v(long j, com.yandex.passport.common.core.f fVar, String str, Map map) {
        fVar.getClass();
        map.getClass();
        ArrayList j2 = u75.j(new com.yandex.passport.internal.report.a(str, 28), new ff(fVar), new ue(Long.valueOf(j), 0));
        u(j2, map);
        com.yandex.passport.internal.report.c1 c1Var = com.yandex.passport.internal.report.c1.d;
        ze[] zeVarArr = (ze[]) j2.toArray(new ze[0]);
        n(c1Var, (ze[]) Arrays.copyOf(zeVarArr, zeVarArr.length));
    }

    public final void w(long j, com.yandex.passport.common.core.f fVar, String str, Map map) {
        fVar.getClass();
        str.getClass();
        map.getClass();
        ArrayList j2 = u75.j(new ff(fVar), new ff(str, 14), new ue(Long.valueOf(j), 0));
        u(j2, map);
        com.yandex.passport.internal.report.e1 e1Var = com.yandex.passport.internal.report.e1.d;
        ze[] zeVarArr = (ze[]) j2.toArray(new ze[0]);
        n(e1Var, (ze[]) Arrays.copyOf(zeVarArr, zeVarArr.length));
    }

    public final void x(com.yandex.passport.common.core.f fVar, long j, Map map) {
        fVar.getClass();
        map.getClass();
        ArrayList j2 = u75.j(new ff(fVar), new ue(Long.valueOf(j), 0));
        u(j2, map);
        com.yandex.passport.internal.report.d1 d1Var = com.yandex.passport.internal.report.d1.d;
        ze[] zeVarArr = (ze[]) j2.toArray(new ze[0]);
        n(d1Var, (ze[]) Arrays.copyOf(zeVarArr, zeVarArr.length));
    }
}
