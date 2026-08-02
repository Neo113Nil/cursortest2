package com.yandex.passport.data.network.utils;

import defpackage.eg7;
import defpackage.ekr;
import defpackage.ff7;
import defpackage.l6b;
import defpackage.mhp;
import defpackage.q5f;
import defpackage.s4f;
import defpackage.t9f;
import defpackage.tkr;
import defpackage.w4f;
import defpackage.wsd;
import defpackage.x4f;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public final class b implements t9f {
    public static final b a = new b();
    public static final wsd b;
    public static final mhp c;

    static {
        ff7.N(ekr.a);
        wsd o = ff7.o(tkr.a, a.a);
        b = o;
        c = o.e;
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        boolean z;
        eg7Var.getClass();
        s4f s4fVar = eg7Var instanceof s4f ? (s4f) eg7Var : null;
        if (s4fVar == null) {
            return new LinkedHashMap();
        }
        q5f f = x4f.f(s4fVar.f());
        LinkedHashMap linkedHashMap = new LinkedHashMap(f.a.size());
        for (Map.Entry<String, w4f> entry : f.entrySet()) {
            String key = entry.getKey();
            Integer e = x4f.e(x4f.g(entry.getValue()));
            if (e != null) {
                z = true;
                if (e.intValue() == 1) {
                    linkedHashMap.put(key, Boolean.valueOf(z));
                }
            }
            z = false;
            linkedHashMap.put(key, Boolean.valueOf(z));
        }
        return linkedHashMap;
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return c;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
        l6bVar.getClass();
        linkedHashMap.getClass();
        b.serialize(l6bVar, linkedHashMap);
    }
}
