package com.yandex.plus.core.network.context;

import defpackage.e5b;
import defpackage.lm4;
import java.util.LinkedHashMap;

/* loaded from: classes4.dex */
public final class a {
    public final LinkedHashMap a;

    public a() {
        e5b e5bVar = e5b.a;
        e5bVar.getClass();
        this.a = new LinkedHashMap(e5bVar);
    }

    public final void a(lm4 lm4Var, Object obj) {
        LinkedHashMap linkedHashMap = this.a;
        if (obj != null) {
            linkedHashMap.put(lm4Var, obj);
        } else {
            linkedHashMap.remove(lm4Var);
        }
    }
}
