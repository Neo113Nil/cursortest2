package ru.yandex.taxi.logistics.sdk.tracking.domain.impl;

import defpackage.bo5;
import defpackage.bvf0;
import defpackage.byd0;
import defpackage.oqi;
import defpackage.pqi;
import defpackage.st2;
import defpackage.tje;
import defpackage.w511;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.collections.EmptySet;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes5.dex */
public final class b {
    public final st2 a;
    public final bo5 b;
    public final r0 c = bvf0.c(null);
    public String d = "";

    public b(st2 st2Var, bo5 bo5Var) {
        this.a = st2Var;
        this.b = bo5Var;
    }

    public final void a(String str, String str2) {
        r0 r0Var = this.c;
        pqi pqiVar = (pqi) r0Var.getValue();
        if (pqiVar == null) {
            return;
        }
        Map map = pqiVar.d;
        oqi oqiVar = (oqi) pqiVar.b.get(str);
        if (oqiVar == null) {
            return;
        }
        Set set = (Set) map.get(str);
        if (set == null) {
            set = EmptySet.a;
        }
        Set M0 = kotlin.collections.a.M0(set);
        int i = byd0.a[oqiVar.c.ordinal()];
        if (i != 1) {
            if (i != 2) {
                w511.b();
                return;
            } else if (set.contains(str2)) {
                M0.remove(str2);
            } else {
                M0.add(str2);
            }
        } else {
            if (set.contains(str2)) {
                return;
            }
            M0.clear();
            M0.add(str2);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put(str, M0);
        pqi a = pqi.a(pqiVar, linkedHashMap);
        r0Var.getClass();
        r0Var.m(null, a);
        tje.N(bvf0.a(this.a.b), null, null, new PollRepositoryImpl$onAnswerSelected$1(this, a, null), 3);
    }
}
