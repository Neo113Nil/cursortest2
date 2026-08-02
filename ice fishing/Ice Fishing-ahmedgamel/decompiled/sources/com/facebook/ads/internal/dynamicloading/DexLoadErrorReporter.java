package com.facebook.ads.internal.dynamicloading;

import android.content.Context;
import android.os.Build;
import com.facebook.ads.internal.api.BuildConfigApi;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class DexLoadErrorReporter {
    public static final double SAMPLING = 0.1d;

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicBoolean f24289a = new AtomicBoolean();

    public static void a(Context context, String str, JSONObject jSONObject) {
        String packageName = context.getPackageName();
        jSONObject.put("APPBUILD", context.getPackageManager().getPackageInfo(packageName, 0).versionCode);
        jSONObject.put("APPNAME", context.getPackageManager().getApplicationLabel(context.getPackageManager().getApplicationInfo(packageName, 0)));
        jSONObject.put("APPVERS", context.getPackageManager().getPackageInfo(packageName, 0).versionName);
        jSONObject.put("OSVERS", Build.VERSION.RELEASE);
        jSONObject.put("SDK", com.onesignal.core.internal.backend.impl.a.TURBINE_FEATURES_PLATFORM_ANDROID);
        jSONObject.put("SESSION_ID", str);
        jSONObject.put("MODEL", Build.MODEL);
        jSONObject.put("BUNDLE", packageName);
        jSONObject.put("SDK_VERSION", BuildConfigApi.getVersionName(context));
        jSONObject.put("OS", "Android");
    }

    public static void reportDexLoadingIssue(Context context, String str, double d9) {
        AtomicBoolean atomicBoolean = f24289a;
        if (atomicBoolean.get() || Math.random() >= d9) {
            return;
        }
        atomicBoolean.set(true);
        new a(context, str).start();
    }
}
