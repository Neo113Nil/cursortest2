package io.appmetrica.analytics.push.impl;

import android.app.NotificationManager;
import android.content.Context;
import android.os.Bundle;
import io.appmetrica.analytics.push.coreutils.internal.commands.SystemInfoCommandInfo;
import io.appmetrica.analytics.push.coreutils.internal.utils.TrackersHub;
import io.appmetrica.analytics.push.logger.internal.PublicLogger;

/* loaded from: classes9.dex */
public final class E2 implements D {
    public final C1090y0 a;
    public final C1087x0 b;

    public E2(C1090y0 c1090y0, C1087x0 c1087x0) {
        this.a = c1090y0;
        this.b = c1087x0;
    }

    @Override // io.appmetrica.analytics.push.impl.D
    public final void a(Context context, Bundle bundle) {
        Long statusChangeTime;
        PublicLogger publicLogger = PublicLogger.INSTANCE;
        publicLogger.info("Update system info", new Object[0]);
        if (!r.a(context).g()) {
            publicLogger.warning("Failed to update system info. AppMetricaPush is not activated", new Object[0]);
            TrackersHub.getInstance().reportEvent("Failed to update system info. AppMetricaPush is not activated");
            return;
        }
        this.a.getClass();
        C1080v c1080v = r.a(context).f;
        if (c1080v.j == null) {
            synchronized (c1080v.a) {
                try {
                    if (c1080v.j == null) {
                        Context context2 = c1080v.p;
                        c1080v.j = new A1((NotificationManager) context2.getSystemService("notification"), new androidx.core.app.s0(context2), new M1(context2, ".NOTIFICATION_STATUS"));
                    }
                } finally {
                }
            }
        }
        C1076t1 a = c1080v.j.c.a();
        Bundle bundle2 = bundle.getBundle("io.appmetrica.analytics.push.extra.EXTRA_INFO");
        SystemInfoCommandInfo fromBundle = bundle2 != null ? SystemInfoCommandInfo.INSTANCE.fromBundle(bundle2) : null;
        if (fromBundle != null && (statusChangeTime = fromBundle.getStatusChangeTime()) != null) {
            a.e = Long.valueOf(statusChangeTime.longValue());
        }
        r2 r2Var = new r2(a);
        publicLogger.info("System info event: " + r2Var.a(), new Object[0]);
        this.b.getClass();
        Y1.b.a(r2Var.a().toString());
    }
}
