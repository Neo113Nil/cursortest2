package com.onesignal.debug.internal.logging.otel.android;

import android.content.Context;
import com.anythink.core.common.v.m;
import com.google.android.gms.internal.ads.Wv;
import com.onesignal.common.AndroidUtils;
import java.io.File;
import kotlin.jvm.internal.h;
import w.AbstractC5128c;

/* loaded from: classes2.dex */
public abstract class e {
    public static final boolean OTEL_EXPORTER_LOGGING_ENABLED = false;

    public static final c createAndroidOtelPlatformProvider(Context context, I7.a featureManagerProvider) {
        h.e(context, "context");
        h.e(featureManagerProvider, "featureManagerProvider");
        StringBuilder sb = new StringBuilder();
        sb.append(context.getCacheDir().getPath());
        String str = File.separator;
        AbstractC5128c.h(sb, str, "onesignal", str, "otel");
        String i = Wv.i(sb, str, "crashes");
        String packageName = context.getPackageName();
        h.d(packageName, "getPackageName(...)");
        String appVersion = AndroidUtils.INSTANCE.getAppVersion(context);
        if (appVersion == null) {
            appVersion = m.f17596e;
        }
        return new c(new d(i, packageName, appVersion, context, null, 16, null), featureManagerProvider);
    }
}
