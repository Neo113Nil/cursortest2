package io.appmetrica.analytics.idsync.impl;

import defpackage.tah;
import defpackage.uah;
import defpackage.v75;
import io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public final class G {
    public final ModulePreferences a;
    public final F b = new F();
    public final String c = "request_state";
    public final Map d = uah.q(a());

    public G(ModulePreferences modulePreferences) {
        this.a = modulePreferences;
    }

    public final LinkedHashMap a() {
        List<E> model = this.b.toModel(this.a.getString(this.c, null));
        int a = tah.a(v75.o(model, 10));
        if (a < 16) {
            a = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(a);
        for (Object obj : model) {
            linkedHashMap.put(((E) obj).a, obj);
        }
        return linkedHashMap;
    }
}
