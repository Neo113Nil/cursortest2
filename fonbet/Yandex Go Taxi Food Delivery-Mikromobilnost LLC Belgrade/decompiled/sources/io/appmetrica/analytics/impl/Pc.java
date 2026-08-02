package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerFactory;
import io.appmetrica.analytics.modulesapi.internal.service.event.ModuleServiceEventHandler;

/* loaded from: classes9.dex */
public final class Pc extends ModuleEventServiceHandlerFactory {
    @Override // io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerFactory
    public final ModuleServiceEventHandler createEventHandler(String str) {
        return new Mc();
    }
}
