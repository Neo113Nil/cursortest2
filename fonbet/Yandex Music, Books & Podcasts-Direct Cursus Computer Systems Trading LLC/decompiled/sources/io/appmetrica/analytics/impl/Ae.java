package io.appmetrica.analytics.impl;

import defpackage.tah;
import io.appmetrica.analytics.BuildConfig;
import io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerFactory;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public final class Ae {
    public final LinkedHashMap a = new LinkedHashMap();

    public final LinkedHashMap a(String str) {
        LinkedHashMap linkedHashMap = this.a;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(tah.a(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry.getKey(), ((ModuleEventServiceHandlerFactory) entry.getValue()).createEventHandler(str));
        }
        return linkedHashMap2;
    }

    public final synchronized void a(C0833zc c0833zc) {
        this.a.put(BuildConfig.SDK_BUILD_FLAVOR, c0833zc);
    }
}
