package com.onesignal.debug.internal.crash;

import B5.k;
import S0.s;
import android.content.Context;
import g1.C4523c;
import g1.C4524d;
import kotlin.jvm.internal.h;

/* loaded from: classes2.dex */
public final class a {
    public static final a INSTANCE = new a();

    private a() {
    }

    public final B5.a createCrashHandler(Context context, B5.c logger, E7.a featureManagerProvider) {
        h.e(context, "context");
        h.e(logger, "logger");
        h.e(featureManagerProvider, "featureManagerProvider");
        if (!f.INSTANCE.isSupported()) {
            throw new IllegalArgumentException("createCrashHandler called on unsupported SDK (< 26)");
        }
        com.onesignal.debug.internal.logging.b.info$default("OneSignal: Creating Otel crash handler (SDK >= 26)", null, 2, null);
        com.onesignal.debug.internal.logging.otel.android.c platformProvider = com.onesignal.debug.internal.logging.otel.android.e.createAndroidOtelPlatformProvider(context, featureManagerProvider);
        h.e(platformProvider, "platformProvider");
        return new E5.c(new s(1, new k(platformProvider, new C4524d(4, platformProvider), new C4523c(3, platformProvider)), logger), logger);
    }
}
