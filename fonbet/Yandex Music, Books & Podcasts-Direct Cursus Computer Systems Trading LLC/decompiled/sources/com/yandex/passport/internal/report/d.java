package com.yandex.passport.internal.report;

import defpackage.btf;
import defpackage.jyr;
import defpackage.u75;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;

/* loaded from: classes4.dex */
public final class d {
    public final com.yandex.passport.internal.f a;
    public final com.yandex.passport.internal.properties.x b;
    public final jyr c;
    public c d;
    public c e;

    public d(com.yandex.passport.internal.f fVar, com.yandex.passport.internal.properties.x xVar) {
        fVar.getClass();
        xVar.getClass();
        this.a = fVar;
        this.b = xVar;
        this.c = btf.b(new com.yandex.passport.internal.common.e(7, this));
    }

    public final ArrayList a() {
        ArrayList j = u75.j(b.a, new a((String) this.c.getValue(), 2));
        c cVar = this.d;
        if (cVar != null) {
            j.add(cVar);
        }
        c cVar2 = this.e;
        if (cVar2 != null) {
            j.add(cVar2);
        }
        for (Map.Entry entry : CollectionsKt.q0(this.b.y.entrySet(), 10)) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            value.getClass();
            j.add(new c(str, (String) value));
        }
        return j;
    }

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList();
        c cVar = this.d;
        if (cVar != null) {
            arrayList.add(new Pair(cVar.b, cVar.c));
        }
        c cVar2 = this.e;
        if (cVar2 != null) {
            arrayList.add(new Pair(cVar2.b, cVar2.c));
        }
        return arrayList;
    }
}
