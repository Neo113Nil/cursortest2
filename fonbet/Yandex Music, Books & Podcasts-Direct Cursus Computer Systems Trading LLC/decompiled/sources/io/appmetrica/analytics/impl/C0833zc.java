package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerFactory;
import io.appmetrica.analytics.modulesapi.internal.service.event.ModuleServiceEventHandler;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.zc, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0833zc extends ModuleEventServiceHandlerFactory {
    @Override // io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerFactory
    @NotNull
    public final ModuleServiceEventHandler createEventHandler(@NotNull String str) {
        return new C0748wc();
    }
}
