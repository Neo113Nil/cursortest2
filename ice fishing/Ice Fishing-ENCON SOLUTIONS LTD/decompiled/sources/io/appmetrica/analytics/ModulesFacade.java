package io.appmetrica.analytics;

import android.content.Context;
import io.appmetrica.analytics.impl.AbstractC0618ni;
import io.appmetrica.analytics.impl.C0406fd;
import io.appmetrica.analytics.impl.C0458hd;
import io.appmetrica.analytics.impl.C0484id;
import io.appmetrica.analytics.impl.C0509jd;
import io.appmetrica.analytics.impl.C0535kd;
import io.appmetrica.analytics.impl.C0561ld;
import io.appmetrica.analytics.impl.C0587md;
import io.appmetrica.analytics.impl.C0613nd;
import io.appmetrica.analytics.impl.C0911z0;

/* loaded from: classes.dex */
public final class ModulesFacade {
    public static final int EXTERNAL_ATTRIBUTION_ADJUST = 2;
    public static final int EXTERNAL_ATTRIBUTION_AIRBRIDGE = 5;
    public static final int EXTERNAL_ATTRIBUTION_APPSFLYER = 1;
    public static final int EXTERNAL_ATTRIBUTION_KOCHAVA = 3;
    public static final int EXTERNAL_ATTRIBUTION_SINGULAR = 6;
    public static final int EXTERNAL_ATTRIBUTION_TENJIN = 4;

    /* renamed from: a, reason: collision with root package name */
    private static C0613nd f3483a = new C0613nd();

    public static IModuleReporter getModuleReporter(Context context, String str) {
        C0613nd c0613nd = f3483a;
        C0406fd c0406fd = c0613nd.f6609b;
        c0406fd.f5978b.a(context);
        c0406fd.f5980d.a(str);
        c0613nd.f6610c.f6996a.a(context.getApplicationContext().getApplicationContext());
        return AbstractC0618ni.f6628a.a(context.getApplicationContext(), str);
    }

    public static boolean isActivatedForApp() {
        C0613nd c0613nd = f3483a;
        c0613nd.f6609b.getClass();
        c0613nd.f6610c.getClass();
        c0613nd.f6608a.getClass();
        return C0911z0.a();
    }

    public static void reportAdRevenue(AdRevenue adRevenue) {
        reportAdRevenue(adRevenue, Boolean.TRUE);
    }

    public static void reportEvent(ModuleEvent moduleEvent) {
        C0613nd c0613nd = f3483a;
        c0613nd.f6609b.f5977a.a(null);
        c0613nd.f6610c.getClass();
        c0613nd.f6611d.execute(new C0484id(c0613nd, moduleEvent));
    }

    public static void reportExternalAttribution(int i2, String str) {
        C0613nd c0613nd = f3483a;
        c0613nd.f6609b.getClass();
        c0613nd.f6610c.getClass();
        c0613nd.f6611d.execute(new C0509jd(c0613nd, i2, str));
    }

    public static void sendEventsBuffer() {
        C0613nd c0613nd = f3483a;
        c0613nd.f6609b.getClass();
        c0613nd.f6610c.getClass();
        AppMetrica.sendEventsBuffer();
    }

    public static void setAdvIdentifiersTracking(boolean z2) {
        C0613nd c0613nd = f3483a;
        c0613nd.f6609b.getClass();
        c0613nd.f6610c.getClass();
        c0613nd.f6611d.execute(new C0535kd(c0613nd, z2));
    }

    public static void setProxy(C0613nd c0613nd) {
        f3483a = c0613nd;
    }

    public static void setSessionExtra(String str, byte[] bArr) {
        C0613nd c0613nd = f3483a;
        c0613nd.f6609b.f5979c.a(str);
        c0613nd.f6610c.getClass();
        c0613nd.f6611d.execute(new C0561ld(c0613nd, str, bArr));
    }

    public static void subscribeForAutoCollectedData(Context context, String str) {
        C0613nd c0613nd = f3483a;
        C0406fd c0406fd = c0613nd.f6609b;
        c0406fd.f5978b.a(context);
        c0406fd.f5980d.a(str);
        c0613nd.f6610c.f6996a.a(context.getApplicationContext());
        c0613nd.f6611d.execute(new C0587md(str));
    }

    public static void reportAdRevenue(AdRevenue adRevenue, Boolean bool) {
        C0613nd c0613nd = f3483a;
        boolean booleanValue = bool.booleanValue();
        c0613nd.f6609b.getClass();
        c0613nd.f6610c.getClass();
        c0613nd.f6611d.execute(new C0458hd(c0613nd, adRevenue, booleanValue));
    }
}
