package io.appmetrica.analytics;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.ApiKeyUtils;
import io.appmetrica.analytics.impl.Bb;
import io.appmetrica.analytics.impl.C0264a0;
import io.appmetrica.analytics.impl.C0290b0;
import io.appmetrica.analytics.impl.C0294b4;
import io.appmetrica.analytics.impl.Cb;
import io.appmetrica.analytics.impl.F0;
import io.appmetrica.analytics.logger.appmetrica.internal.ImportantLogger;

/* loaded from: classes.dex */
public class AppMetricaLibraryAdapter {

    /* renamed from: a, reason: collision with root package name */
    private static F0 f3460a = new F0();

    public static void activate(Context context) {
        F0 f0 = f3460a;
        if (!f0.f4369a.f4197a.a(context).f6792a) {
            ImportantLogger.INSTANCE.info("[AppMetricaLibraryAdapterProxy]", "Activation failed due to context is null", new Object[0]);
            return;
        }
        Cb cb = f0.f4370b;
        Context applicationContext = context.getApplicationContext();
        cb.getClass();
        C0294b4.l().f5588g.a(applicationContext);
        C0294b4.l().b().a(applicationContext, AppMetricaLibraryAdapterConfig.newConfigBuilder().build());
    }

    public static void reportEvent(String str, String str2, String str3) {
        f3460a.a(str, str2, str3);
    }

    public static void setAdvIdentifiersTracking(boolean z2) {
        F0 f0 = f3460a;
        if (f0.f4369a.f4199c.a((Void) null).f6792a) {
            f0.f4370b.getClass();
            ModulesFacade.setAdvIdentifiersTracking(z2);
        }
    }

    public static void setProxy(F0 f0) {
        f3460a = f0;
    }

    public static void subscribeForAutoCollectedData(Context context, String str) {
        F0 f0 = f3460a;
        f0.getClass();
        ImportantLogger.INSTANCE.info("[AppMetricaLibraryAdapterProxy]", "Subscribe for auto-collected data with api key: " + ApiKeyUtils.createPartialApiKey(str), new Object[0]);
        Bb bb = f0.f4369a;
        if (bb.f4203g.a(str).f6792a && bb.f4197a.a(context).f6792a) {
            f0.f4370b.getClass();
            C0294b4.l().f5588g.a(context);
            C0290b0 b2 = C0294b4.l().b();
            b2.f5576c.a().executeDelayed(new C0264a0(b2, context), b2.f5577d);
            ModulesFacade.subscribeForAutoCollectedData(context, str);
        }
    }

    public static void activate(Context context, AppMetricaLibraryAdapterConfig appMetricaLibraryAdapterConfig) {
        F0 f0 = f3460a;
        Bb bb = f0.f4369a;
        if (bb.f4197a.a(context).f6792a && bb.f4198b.a(appMetricaLibraryAdapterConfig).f6792a) {
            Cb cb = f0.f4370b;
            Context applicationContext = context.getApplicationContext();
            cb.getClass();
            C0294b4.l().f5588g.a(applicationContext);
            C0294b4.l().b().a(applicationContext, appMetricaLibraryAdapterConfig);
            return;
        }
        ImportantLogger.INSTANCE.info("[AppMetricaLibraryAdapterProxy]", "Activation failed due to context is null or invalid config", new Object[0]);
    }
}
