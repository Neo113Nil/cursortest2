package io.appmetrica.analytics.accessibility.impl;

import android.content.Context;
import defpackage.ljo;
import io.appmetrica.analytics.accessibility.internal.config.AccessibilityConfig;
import io.appmetrica.analytics.accessibilitysystemwrapper.internal.AccessibilityConfiguration;
import io.appmetrica.analytics.accessibilitysystemwrapper.internal.AccessibilityConfigurationProvider;
import io.appmetrica.analytics.coreapi.internal.event.CounterReportApi;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.coreutils.internal.time.TimePassedChecker;
import io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceContext;
import io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerContext;
import io.appmetrica.analytics.modulesapi.internal.service.event.ModuleServiceEventHandler;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class f implements ModuleServiceEventHandler {
    public final Context b;
    public volatile AccessibilityConfig g;
    public final String a = "[AccessibilityController]";
    public final e c = new e();
    public final SystemTimeProvider d = new SystemTimeProvider();
    public final TimePassedChecker e = new TimePassedChecker();
    public final h f = new h();

    public f(ServiceContext serviceContext, AccessibilityConfig accessibilityConfig) {
        this.b = serviceContext.getContext();
        this.g = accessibilityConfig;
    }

    public final void a(AccessibilityConfig accessibilityConfig) {
        this.g = accessibilityConfig;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.event.ModuleServiceEventHandler
    public final boolean handle(ModuleEventServiceHandlerContext moduleEventServiceHandlerContext, CounterReportApi counterReportApi) {
        String b;
        AccessibilityConfig accessibilityConfig = this.g;
        long j = moduleEventServiceHandlerContext.getModulePreferences().getLong("last_prev_timestamp", 0L);
        if (!moduleEventServiceHandlerContext.getEventReporter().isMain() || accessibilityConfig == null || !accessibilityConfig.getCom.yandex.messaging.core.net.entities.BackendConfig.Restrictions.ENABLED java.lang.String() || !this.e.didTimePassMillis(j, accessibilityConfig.getCollectInterval(), this.a)) {
            return false;
        }
        AccessibilityConfiguration configuration = new AccessibilityConfigurationProvider(this.b).getConfiguration();
        String string$default = ModulePreferences.DefaultImpls.getString$default(moduleEventServiceHandlerContext.getModulePreferences(), "last_prev_value", null, 2, null);
        AccessibilityConfiguration model = string$default != null ? this.c.toModel(string$default) : null;
        this.f.a.getClass();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("params_changed_list", new JSONArray());
            i.a(jSONObject, configuration.getProperties(), model != null ? model.getProperties() : null);
            i.a(jSONObject, configuration.getServices(), model != null ? model.getServices() : null);
            b = jSONObject.toString();
        } catch (Throwable th) {
            b = ljo.b(th);
        }
        moduleEventServiceHandlerContext.getEventReporter().report(new g(b));
        moduleEventServiceHandlerContext.getModulePreferences().putString("last_prev_value", this.c.fromModel(configuration));
        moduleEventServiceHandlerContext.getModulePreferences().putLong("last_prev_timestamp", this.d.currentTimeMillis());
        return false;
    }
}
