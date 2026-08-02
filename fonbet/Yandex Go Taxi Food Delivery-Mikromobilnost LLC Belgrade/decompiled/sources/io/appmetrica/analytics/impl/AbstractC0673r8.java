package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.r8, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC0673r8 {
    public static final String a(Xj xj) {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject().put("dId", xj.getDeviceId()).put("uId", xj.getUuid()).put("appVer", xj.getAppVersion()).put("appBuild", xj.getAppBuildNumber()).put("kitBuildType", xj.getAnalyticsSdkBuildType()).put("osVer", xj.getOsVersion()).put("osApiLev", xj.getOsApiLevel()).put("lang", xj.getLocale()).put("root", xj.getDeviceRootStatus()).put("app_debuggable", ((I6) xj).a).put(CommonUrlParts.APP_FRAMEWORK, xj.getAppFramework()).put("attribution_id", xj.r).put("analyticsSdkVersionName", xj.getAnalyticsSdkVersionName()).put("kitBuildNumber", xj.getAnalyticsSdkBuildNumber());
        } catch (Throwable unused) {
            jSONObject = new JSONObject();
        }
        return jSONObject.toString();
    }
}
