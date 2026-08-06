package io.appmetrica.analytics.idsync.impl;

import io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class G {

    /* renamed from: a, reason: collision with root package name */
    public final ModulePreferences f3989a;

    /* renamed from: b, reason: collision with root package name */
    public final F f3990b = new F();

    /* renamed from: c, reason: collision with root package name */
    public final String f3991c = "request_state";

    /* renamed from: d, reason: collision with root package name */
    public final Map f3992d = i1.u.N(a());

    public G(ModulePreferences modulePreferences) {
        this.f3989a = modulePreferences;
    }

    public final LinkedHashMap a() {
        List<E> model = this.f3990b.toModel(this.f3989a.getString(this.f3991c, null));
        int G = i1.v.G(i1.k.E(model));
        if (G < 16) {
            G = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(G);
        for (Object obj : model) {
            linkedHashMap.put(((E) obj).f3982a, obj);
        }
        return linkedHashMap;
    }
}
