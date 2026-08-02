package com.yandex.passport.data.network;

import defpackage.e7f;
import defpackage.q5f;
import defpackage.tah;
import defpackage.u75;
import defpackage.v75;
import defpackage.w4f;
import defpackage.x4f;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public final class k extends e7f {
    @Override // defpackage.e7f
    public final w4f a(w4f w4fVar) {
        w4fVar.getClass();
        q5f f = x4f.f(w4fVar);
        List h = u75.h("status", "x_token", "access_token");
        int a = tah.a(v75.o(h, 10));
        if (a < 16) {
            a = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(a);
        for (Object obj : h) {
            linkedHashMap.put(obj, (w4f) f.get((String) obj));
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(com.yandex.passport.internal.ui.a.p(linkedHashMap));
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (Map.Entry entry : f.a.entrySet()) {
            if (!linkedHashMap2.values().contains((w4f) entry.getValue())) {
                linkedHashMap3.put(entry.getKey(), entry.getValue());
            }
        }
        linkedHashMap2.put("userInfo", new q5f(linkedHashMap3));
        return new q5f(linkedHashMap2);
    }
}
