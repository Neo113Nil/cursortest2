package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences;
import io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerContext;
import io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerReporter;

/* loaded from: classes.dex */
public final class Wc implements ModuleEventServiceHandlerContext {

    /* renamed from: a, reason: collision with root package name */
    public final ModulePreferences f5289a;

    /* renamed from: b, reason: collision with root package name */
    public final ModulePreferences f5290b;

    /* renamed from: c, reason: collision with root package name */
    public final ModuleEventServiceHandlerReporter f5291c;

    public Wc(ModulePreferences modulePreferences, ModulePreferences modulePreferences2, ModuleEventServiceHandlerReporter moduleEventServiceHandlerReporter) {
        this.f5289a = modulePreferences;
        this.f5290b = modulePreferences2;
        this.f5291c = moduleEventServiceHandlerReporter;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerContext
    public final ModuleEventServiceHandlerReporter getEventReporter() {
        return this.f5291c;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerContext
    public final ModulePreferences getLegacyModulePreferences() {
        return this.f5290b;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerContext
    public final ModulePreferences getModulePreferences() {
        return this.f5289a;
    }
}
