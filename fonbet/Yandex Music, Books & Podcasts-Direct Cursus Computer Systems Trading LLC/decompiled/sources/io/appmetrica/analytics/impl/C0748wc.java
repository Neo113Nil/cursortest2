package io.appmetrica.analytics.impl;

import defpackage.uah;
import io.appmetrica.analytics.coreapi.internal.event.CounterReportApi;
import io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerContext;
import io.appmetrica.analytics.modulesapi.internal.service.event.ModuleServiceEventHandler;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.wc, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0748wc implements ModuleServiceEventHandler {
    public final Map a = uah.e(new Pair(new C0665tg(), C0661tc.a), new Pair(new C0125ao(), C0690uc.a), new Pair(new C0400kb(), C0719vc.a));

    @Override // io.appmetrica.analytics.modulesapi.internal.service.event.ModuleServiceEventHandler
    public final boolean handle(@NotNull ModuleEventServiceHandlerContext moduleEventServiceHandlerContext, @NotNull CounterReportApi counterReportApi) {
        Map map = this.a;
        if (map.isEmpty()) {
            return false;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (((Boolean) ((Function1) entry.getValue()).invoke(counterReportApi)).booleanValue() && ((ModuleServiceEventHandler) entry.getKey()).handle(moduleEventServiceHandlerContext, counterReportApi)) {
                return true;
            }
        }
        return false;
    }
}
