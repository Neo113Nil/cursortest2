package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.UserInfo;
import io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerContext;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class Dr {
    public static UserInfo a(ModuleEventServiceHandlerContext moduleEventServiceHandlerContext) {
        String string = moduleEventServiceHandlerContext.getLegacyModulePreferences().getString("USER_INFO", null);
        UserInfo userInfo = new UserInfo();
        if (!TextUtils.isEmpty(string)) {
            try {
                JSONObject jSONObject = new JSONObject(string);
                userInfo.setUserId(jSONObject.optString("UserInfo.UserId", null));
                userInfo.setType(jSONObject.optString("UserInfo.Type", null));
                userInfo.setOptions(Vc.a(jSONObject.optJSONObject("UserInfo.Options")));
            } catch (Throwable unused) {
            }
        }
        return userInfo;
    }
}
