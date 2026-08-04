package com.gamericefishpro.space.mf;

import android.content.Intent;
import android.os.Bundle;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class c {
    public static final c INSTANCE = new c();
    public static final String PAYLOAD_OS_NOTIFICATION_ID = "i";
    public static final String PAYLOAD_OS_ROOT_CUSTOM = "custom";

    private c() {
    }

    private final String getOSNotificationIdFromBundle(Bundle bundle) {
        if (bundle != null && !bundle.isEmpty()) {
            String string = bundle.getString(PAYLOAD_OS_ROOT_CUSTOM, null);
            if (string != null) {
                return getOSNotificationIdFromJsonString(string);
            }
            com.gamericefishpro.space.od.b.debug$default("Not a OneSignal formatted Bundle. No 'custom' field in the bundle.", null, 2, null);
        }
        return null;
    }

    private final String getOSNotificationIdFromJsonString(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("i")) {
                return jSONObject.optString("i", null);
            }
            com.gamericefishpro.space.od.b.debug$default("Not a OneSignal formatted JSON string. No 'i' field in custom.", null, 2, null);
            return null;
        } catch (JSONException unused) {
            com.gamericefishpro.space.od.b.debug$default("Not a OneSignal formatted JSON String, error parsing string as JSON.", null, 2, null);
        }
    }

    public final String getOSNotificationIdFromJson(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        return getOSNotificationIdFromJsonString(jSONObject.optString(PAYLOAD_OS_ROOT_CUSTOM, null));
    }

    public final boolean isOneSignalBundle(Bundle bundle) {
        return getOSNotificationIdFromBundle(bundle) != null;
    }

    public final boolean isOneSignalIntent(Intent intent) {
        if (intent == null) {
            return false;
        }
        return isOneSignalBundle(intent.getExtras());
    }
}
