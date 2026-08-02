package com.yandex.passport.internal.report.reporters;

import com.yandex.passport.internal.report.z7;
import com.yandex.passport.internal.report.ze;
import defpackage.u75;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

/* loaded from: classes4.dex */
public final class d0 extends androidx.core.app.n0 {
    public final com.yandex.passport.internal.features.a b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(com.yandex.passport.internal.report.g gVar, com.yandex.passport.internal.features.a aVar) {
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
        return ((Boolean) aVar.o.getValue(aVar, com.yandex.passport.internal.features.a.J[11])).booleanValue();
    }

    public final void v(String str, String str2, Map map) {
        str2.getClass();
        map.getClass();
        ArrayList j = u75.j(new com.yandex.passport.internal.report.c(str2, 3), new com.yandex.passport.internal.report.a(str, 28));
        u(j, map);
        z7 z7Var = z7.d;
        ze[] zeVarArr = (ze[]) j.toArray(new ze[0]);
        n(z7Var, (ze[]) Arrays.copyOf(zeVarArr, zeVarArr.length));
    }
}
