package io.appmetrica.analytics.idsync.impl;

import defpackage.gw00;
import defpackage.tcc;
import io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes9.dex */
public final class G {
    public final ModulePreferences a;
    public final F b = new F();
    public final String c = "request_state";
    public final Map d = new LinkedHashMap(a());

    public G(ModulePreferences modulePreferences) {
        this.a = modulePreferences;
    }

    public final LinkedHashMap a() {
        List<E> model = this.b.toModel(this.a.getString(this.c, null));
        int d = gw00.d(tcc.n(model, 10));
        if (d < 16) {
            d = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(d);
        for (Object obj : model) {
            linkedHashMap.put(((E) obj).a, obj);
        }
        return linkedHashMap;
    }
}
