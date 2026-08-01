package com.onesignal.debug.internal.logging.otel.android;

import android.content.Context;
import com.anythink.core.common.v.m;
import com.onesignal.common.AndroidUtils;
import java.io.File;
import kotlin.jvm.internal.h;

/* loaded from: classes2.dex */
public abstract class e {
    public static final boolean OTEL_EXPORTER_LOGGING_ENABLED = false;

    public static final c createAndroidOtelPlatformProvider(Context context, I7.a featureManagerProvider) {
        h.e(context, "context");
        h.e(featureManagerProvider, "featureManagerProvider");
        StringBuilder sb = new StringBuilder();
        sb.append(context.getCacheDir().getPath());
        String str = File.separator;
        u1.h.i(sb, str, "onesignal", str, "otel");
        String g4 = u1.h.g(sb, str, "crashes");
        String packageName = context.getPackageName();
        h.d(packageName, "getPackageName(...)");
        String appVersion = AndroidUtils.INSTANCE.getAppVersion(context);
        if (appVersion == null) {
            appVersion = m.f16809e;
        }
        return new c(new d(g4, packageName, appVersion, context, null, 16, null), featureManagerProvider);
    }
}
