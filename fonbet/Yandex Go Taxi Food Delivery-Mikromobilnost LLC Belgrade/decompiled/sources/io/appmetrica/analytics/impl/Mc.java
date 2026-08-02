package io.appmetrica.analytics.impl;

import defpackage.tls;
import io.appmetrica.analytics.coreapi.internal.event.CounterReportApi;
import io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerContext;
import io.appmetrica.analytics.modulesapi.internal.service.event.ModuleServiceEventHandler;
import java.util.Map;
import kotlin.Pair;

/* loaded from: classes9.dex */
public final class Mc implements ModuleServiceEventHandler {
    public final Map a = kotlin.collections.b.i(new Pair(new Jg(), Jc.a), new Pair(new C0805vo(), Kc.a), new Pair(new C0763ub(), Lc.a));

    @Override // io.appmetrica.analytics.modulesapi.internal.service.event.ModuleServiceEventHandler
    public final boolean handle(ModuleEventServiceHandlerContext moduleEventServiceHandlerContext, CounterReportApi counterReportApi) {
        Map map = this.a;
        if (map.isEmpty()) {
            return false;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (((Boolean) ((tls) entry.getValue()).invoke(counterReportApi)).booleanValue() && ((ModuleServiceEventHandler) entry.getKey()).handle(moduleEventServiceHandlerContext, counterReportApi)) {
                return true;
            }
        }
        return false;
    }
}
