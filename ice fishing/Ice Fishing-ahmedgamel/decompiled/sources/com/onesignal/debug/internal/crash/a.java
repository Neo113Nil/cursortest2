package com.onesignal.debug.internal.crash;

import F5.k;
import I0.j;
import S0.l;
import android.content.Context;
import kotlin.jvm.internal.h;

/* loaded from: classes2.dex */
public final class a {
    public static final a INSTANCE = new a();

    private a() {
    }

    public final F5.a createCrashHandler(Context context, F5.c logger, I7.a featureManagerProvider) {
        h.e(context, "context");
        h.e(logger, "logger");
        h.e(featureManagerProvider, "featureManagerProvider");
        if (!f.INSTANCE.isSupported()) {
            throw new IllegalArgumentException("createCrashHandler called on unsupported SDK (< 26)");
        }
        com.onesignal.debug.internal.logging.b.info$default("OneSignal: Creating Otel crash handler (SDK >= 26)", null, 2, null);
        com.onesignal.debug.internal.logging.otel.android.c platformProvider = com.onesignal.debug.internal.logging.otel.android.e.createAndroidOtelPlatformProvider(context, featureManagerProvider);
        h.e(platformProvider, "platformProvider");
        return new I5.c(new l(2, new k(platformProvider, new j(6, platformProvider), new n4.c(7, platformProvider)), logger), logger);
    }
}
