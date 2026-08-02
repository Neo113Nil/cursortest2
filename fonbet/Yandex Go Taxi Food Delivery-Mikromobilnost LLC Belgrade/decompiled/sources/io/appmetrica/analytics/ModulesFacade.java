package io.appmetrica.analytics;

import android.content.Context;
import io.appmetrica.analytics.impl.AbstractC0196al;
import io.appmetrica.analytics.impl.C0190af;
import io.appmetrica.analytics.impl.C0248cf;
import io.appmetrica.analytics.impl.C0277df;
import io.appmetrica.analytics.impl.C0305ef;
import io.appmetrica.analytics.impl.C0334ff;
import io.appmetrica.analytics.impl.C0363gf;
import io.appmetrica.analytics.impl.C0392hf;
import io.appmetrica.analytics.impl.Cif;
import io.appmetrica.analytics.impl.F0;

/* loaded from: classes9.dex */
public final class ModulesFacade {
    public static final int EXTERNAL_ATTRIBUTION_ADJUST = 2;
    public static final int EXTERNAL_ATTRIBUTION_AIRBRIDGE = 5;
    public static final int EXTERNAL_ATTRIBUTION_APPSFLYER = 1;
    public static final int EXTERNAL_ATTRIBUTION_KOCHAVA = 3;
    public static final int EXTERNAL_ATTRIBUTION_SINGULAR = 6;
    public static final int EXTERNAL_ATTRIBUTION_TENJIN = 4;
    private static Cif a = new Cif();

    public static IModuleReporter getModuleReporter(Context context, String str) {
        Cif cif = a;
        C0190af c0190af = cif.b;
        c0190af.b.a(context);
        c0190af.d.a(str);
        cif.c.a.a(context.getApplicationContext().getApplicationContext());
        return AbstractC0196al.a.a(context.getApplicationContext(), str);
    }

    public static boolean isActivatedForApp() {
        Cif cif = a;
        cif.b.getClass();
        cif.c.getClass();
        cif.a.getClass();
        return F0.a();
    }

    public static void reportAdRevenue(AdRevenue adRevenue, Boolean bool) {
        Cif cif = a;
        boolean booleanValue = bool.booleanValue();
        cif.b.getClass();
        cif.c.getClass();
        cif.d.execute(new C0248cf(cif, adRevenue, booleanValue));
    }

    public static void reportEvent(ModuleEvent moduleEvent) {
        Cif cif = a;
        cif.b.a.a(null);
        cif.c.getClass();
        cif.d.execute(new C0277df(cif, moduleEvent));
    }

    public static void reportExternalAttribution(int i, String str) {
        Cif cif = a;
        cif.b.getClass();
        cif.c.getClass();
        cif.d.execute(new C0305ef(cif, i, str));
    }

    public static void sendEventsBuffer() {
        Cif cif = a;
        cif.b.getClass();
        cif.c.getClass();
        AppMetrica.sendEventsBuffer();
    }

    public static void setAdvIdentifiersTracking(boolean z) {
        Cif cif = a;
        cif.b.getClass();
        cif.c.getClass();
        cif.d.execute(new C0334ff(cif, z));
    }

    public static void setProxy(Cif cif) {
        a = cif;
    }

    public static void setSessionExtra(String str, byte[] bArr) {
        Cif cif = a;
        cif.b.c.a(str);
        cif.c.getClass();
        cif.d.execute(new C0363gf(cif, str, bArr));
    }

    public static void subscribeForAutoCollectedData(Context context, String str) {
        Cif cif = a;
        C0190af c0190af = cif.b;
        c0190af.b.a(context);
        c0190af.d.a(str);
        cif.c.a.a(context.getApplicationContext());
        cif.d.execute(new C0392hf(str));
    }

    public static void reportAdRevenue(AdRevenue adRevenue) {
        reportAdRevenue(adRevenue, Boolean.TRUE);
    }
}
