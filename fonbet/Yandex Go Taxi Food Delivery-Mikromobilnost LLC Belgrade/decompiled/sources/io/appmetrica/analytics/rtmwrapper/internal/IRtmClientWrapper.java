package io.appmetrica.analytics.rtmwrapper.internal;

import org.json.JSONObject;

/* loaded from: classes9.dex */
public interface IRtmClientWrapper {
    void reportError(JSONObject jSONObject);

    void reportEvent(JSONObject jSONObject);

    void reportException(String str, String str2);

    void reportException(String str, Throwable th);

    void updateRtmConfig(String str);
}
