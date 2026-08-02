package io.appmetrica.analytics;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.ApiKeyUtils;
import io.appmetrica.analytics.impl.C0348g0;
import io.appmetrica.analytics.impl.C0377h0;
import io.appmetrica.analytics.impl.C0678rd;
import io.appmetrica.analytics.impl.C0707sd;
import io.appmetrica.analytics.impl.V0;
import io.appmetrica.analytics.impl.V4;
import io.appmetrica.analytics.logger.appmetrica.internal.ImportantLogger;

/* loaded from: classes4.dex */
public class AppMetricaLibraryAdapter {
    private static V0 a = new V0();

    public static void activate(Context context, AppMetricaLibraryAdapterConfig appMetricaLibraryAdapterConfig) {
        V0 v0 = a;
        C0678rd c0678rd = v0.a;
        if (!c0678rd.a.a(context).a || !c0678rd.b.a(appMetricaLibraryAdapterConfig).a) {
            ImportantLogger.INSTANCE.info("[AppMetricaLibraryAdapterProxy]", "Activation failed due to context is null or invalid config", new Object[0]);
            return;
        }
        C0707sd c0707sd = v0.b;
        Context applicationContext = context.getApplicationContext();
        c0707sd.getClass();
        V4.l().g.a(applicationContext);
        V4.l().b().a(applicationContext, appMetricaLibraryAdapterConfig);
    }

    public static void reportEvent(String str, String str2, String str3) {
        a.a(str, str2, str3);
    }

    public static void setAdvIdentifiersTracking(boolean z) {
        V0 v0 = a;
        if (v0.a.c.a((Void) null).a) {
            v0.b.getClass();
            ModulesFacade.setAdvIdentifiersTracking(z);
        }
    }

    public static void setProxy(V0 v0) {
        a = v0;
    }

    public static void subscribeForAutoCollectedData(Context context, String str) {
        V0 v0 = a;
        v0.getClass();
        ImportantLogger.INSTANCE.info("[AppMetricaLibraryAdapterProxy]", "Subscribe for auto-collected data with api key: " + ApiKeyUtils.createPartialApiKey(str), new Object[0]);
        C0678rd c0678rd = v0.a;
        if (c0678rd.g.a(str).a && c0678rd.a.a(context).a) {
            v0.b.getClass();
            V4.l().g.a(context);
            C0377h0 b = V4.l().b();
            b.c.a().executeDelayed(new C0348g0(b, context), b.d);
            ModulesFacade.subscribeForAutoCollectedData(context, str);
        }
    }

    public static void activate(Context context) {
        V0 v0 = a;
        if (v0.a.a.a(context).a) {
            C0707sd c0707sd = v0.b;
            Context applicationContext = context.getApplicationContext();
            c0707sd.getClass();
            V4.l().g.a(applicationContext);
            V4.l().b().a(applicationContext, AppMetricaLibraryAdapterConfig.newConfigBuilder().build());
            return;
        }
        ImportantLogger.INSTANCE.info("[AppMetricaLibraryAdapterProxy]", "Activation failed due to context is null", new Object[0]);
    }
}
