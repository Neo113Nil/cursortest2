package io.appmetrica.analytics.impl;

import com.yandex.messaging.core.net.entities.BackendConfig;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.mb, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0532mb {
    public static boolean a(JSONObject jSONObject, String str, boolean z) {
        return ((Boolean) WrapUtils.getOrDefault(jSONObject.has(str) ? Boolean.valueOf(jSONObject.getJSONObject(str).getBoolean(BackendConfig.Restrictions.ENABLED)) : null, Boolean.valueOf(z))).booleanValue();
    }
}
